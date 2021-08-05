package com.example.SpringBootRestful.controller;


import com.example.SpringBootRestful.entity.User;
import com.example.SpringBootRestful.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RequestMapping("/api")
@RestController
public class UserController {

//todo: 在下面Controller 实现一个接口满足以下要求
// 1. 实现一个Get请求,查出所有的用户信息
// 2. 接口访问地址：（/api/users）
// 3. 使用注解：@CrossOrigin实现跨域请求。
    @Autowired
    UserService userService;
    @RequestMapping(method = RequestMethod.GET ,value = "/users")
    public List<User> getAllUsers(){
        return userService.getAllUser();
    }
}

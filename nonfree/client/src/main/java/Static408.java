import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!pk", name = "f", descriptor = "[I")
	public static final int[] anIntArray550 = new int[1000];

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILclient!pl;)V")
	public static void method5902(@OriginalArg(1) Class9_Sub1_Sub1_Sub2 arg0) {
		@Pc(11) Class17 local11;
		if (arg0.anInt6461 != -1) {
			local11 = Static330.aClass279_2.method6216(arg0.anInt6461);
			if (local11 == null || local11.anIntArray55 == null) {
				arg0.anInt6461 = -1;
				arg0.aBoolean528 = false;
			} else {
				label390: {
					arg0.anInt6403++;
					if (arg0.anInt6437 < local11.anIntArray55.length && arg0.anInt6403 > local11.anIntArray54[arg0.anInt6437]) {
						arg0.anInt6393++;
						arg0.anInt6437++;
						arg0.anInt6403 = 1;
						Static351.method5300(arg0.anInt6437, local11, arg0.anInt8980, arg0.anInt8975, arg0.aByte126, arg0 == Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2);
					}
					if (local11.anIntArray55.length <= arg0.anInt6437) {
						arg0.anInt6403 = 0;
						arg0.anInt6437 = 0;
						if (arg0.aBoolean528) {
							arg0.anInt6461 = arg0.method5573().method6001();
							if (arg0.anInt6461 == -1) {
								arg0.aBoolean528 = false;
								break label390;
							}
							local11 = Static330.aClass279_2.method6216(arg0.anInt6461);
						}
						Static351.method5300(arg0.anInt6437, local11, arg0.anInt8980, arg0.anInt8975, arg0.aByte126, arg0 == Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2);
					}
					arg0.anInt6393 = arg0.anInt6437 + 1;
					if (arg0.anInt6393 >= local11.anIntArray55.length) {
						arg0.anInt6393 = 0;
					}
				}
			}
		}
		@Pc(174) int local174;
		@Pc(187) Class17 local187;
		@Pc(171) Class175 local171;
		if (arg0.anInt6424 != -1 && Static305.anInt5560 >= arg0.anInt6464) {
			local171 = Static547.aClass248_2.method5708(arg0.anInt6424);
			local174 = local171.anInt4956;
			if (local174 == -1) {
				arg0.anInt6424 = -1;
			} else {
				label392: {
					local187 = Static330.aClass279_2.method6216(local174);
					if (local171.aBoolean386) {
						if (local187.anInt565 == 3) {
							if (arg0.anInt6469 > 0 && Static305.anInt5560 >= arg0.anInt6430 && arg0.anInt6421 < Static305.anInt5560) {
								arg0.anInt6424 = -1;
								break label392;
							}
						} else if (local187.anInt565 == 1 && arg0.anInt6469 > 0 && arg0.anInt6430 <= Static305.anInt5560 && Static305.anInt5560 > arg0.anInt6421) {
							arg0.anInt6464 = Static305.anInt5560 + 1;
							break label392;
						}
					}
					if (local187 == null || local187.anIntArray55 == null) {
						arg0.anInt6424 = -1;
					} else {
						if (arg0.lb < 0) {
							arg0.lb = 0;
							Static351.method5300(0, local187, arg0.anInt8980, arg0.anInt8975, arg0.aByte126, Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2 == arg0);
						}
						arg0.anInt6386++;
						if (arg0.lb < local187.anIntArray55.length && local187.anIntArray54[arg0.lb] < arg0.anInt6386) {
							arg0.anInt6386 = 1;
							arg0.lb++;
							Static351.method5300(arg0.lb, local187, arg0.anInt8980, arg0.anInt8975, arg0.aByte126, arg0 == Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2);
						}
						if (local187.anIntArray55.length <= arg0.lb) {
							if (local171.aBoolean386) {
								arg0.lb -= local187.anInt551;
								arg0.anInt6392++;
								if (arg0.anInt6392 >= local187.anInt564) {
									arg0.anInt6424 = -1;
								} else if (arg0.lb >= 0 && local187.anIntArray55.length > arg0.lb) {
									Static351.method5300(arg0.lb, local187, arg0.anInt8980, arg0.anInt8975, arg0.aByte126, Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2 == arg0);
								} else {
									arg0.anInt6424 = -1;
								}
							} else {
								arg0.anInt6424 = -1;
							}
						}
						arg0.anInt6412 = arg0.lb + 1;
						if (arg0.anInt6412 >= local187.anIntArray55.length) {
							if (local171.aBoolean386) {
								arg0.anInt6412 -= local187.anInt551;
								if (arg0.anInt6392 + 1 >= local187.anInt564) {
									arg0.anInt6412 = -1;
								} else if (arg0.anInt6412 < 0 || arg0.anInt6412 >= local187.anIntArray55.length) {
									arg0.anInt6412 = -1;
								}
							} else {
								arg0.anInt6412 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6384 != -1 && Static305.anInt5560 >= arg0.anInt6432) {
			local171 = Static547.aClass248_2.method5708(arg0.anInt6384);
			local174 = local171.anInt4956;
			if (local174 == -1) {
				arg0.anInt6384 = -1;
			} else {
				label395: {
					local187 = Static330.aClass279_2.method6216(local174);
					if (local171.aBoolean386) {
						if (local187.anInt565 == 3) {
							if (arg0.anInt6469 > 0 && arg0.anInt6430 <= Static305.anInt5560 && Static305.anInt5560 > arg0.anInt6421) {
								arg0.anInt6384 = -1;
								break label395;
							}
						} else if (local187.anInt565 == 1 && arg0.anInt6469 > 0 && arg0.anInt6430 <= Static305.anInt5560 && Static305.anInt5560 > arg0.anInt6421) {
							arg0.anInt6432 = Static305.anInt5560 + 1;
							break label395;
						}
					}
					if (local187 == null || local187.anIntArray55 == null) {
						arg0.anInt6384 = -1;
					} else {
						if (arg0.anInt6444 < 0) {
							arg0.anInt6444 = 0;
							Static351.method5300(0, local187, arg0.anInt8980, arg0.anInt8975, arg0.aByte126, Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2 == arg0);
						}
						arg0.anInt6400++;
						if (local187.anIntArray55.length > arg0.anInt6444 && local187.anIntArray54[arg0.anInt6444] < arg0.anInt6400) {
							arg0.anInt6444++;
							arg0.anInt6400 = 1;
							Static351.method5300(arg0.anInt6444, local187, arg0.anInt8980, arg0.anInt8975, arg0.aByte126, arg0 == Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2);
						}
						if (arg0.anInt6444 >= local187.anIntArray55.length) {
							if (local171.aBoolean386) {
								arg0.anInt6387++;
								arg0.anInt6444 -= local187.anInt551;
								if (arg0.anInt6387 >= local187.anInt564) {
									arg0.anInt6384 = -1;
								} else if (arg0.anInt6444 >= 0 && arg0.anInt6444 < local187.anIntArray55.length) {
									Static351.method5300(arg0.anInt6444, local187, arg0.anInt8980, arg0.anInt8975, arg0.aByte126, Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2 == arg0);
								} else {
									arg0.anInt6384 = -1;
								}
							} else {
								arg0.anInt6384 = -1;
							}
						}
						arg0.anInt6420 = arg0.anInt6444 + 1;
						if (arg0.anInt6420 >= local187.anIntArray55.length) {
							if (local171.aBoolean386) {
								arg0.anInt6420 -= local187.anInt551;
								if (arg0.anInt6387 + 1 >= local187.anInt564) {
									arg0.anInt6420 = -1;
								} else if (arg0.anInt6420 < 0 || local187.anIntArray55.length <= arg0.anInt6420) {
									arg0.anInt6420 = -1;
								}
							} else {
								arg0.anInt6420 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6453 != -1 && arg0.anInt6438 <= 1) {
			local11 = Static330.aClass279_2.method6216(arg0.anInt6453);
			if (local11.anInt565 == 3) {
				if (arg0.anInt6469 > 0 && Static305.anInt5560 >= arg0.anInt6430 && arg0.anInt6421 < Static305.anInt5560) {
					arg0.anInt6453 = -1;
					arg0.anIntArray515 = null;
				}
			} else if (local11.anInt565 == 1 && arg0.anInt6469 > 0 && arg0.anInt6430 <= Static305.anInt5560 && arg0.anInt6421 < Static305.anInt5560) {
				arg0.anInt6438 = 2;
			}
		}
		if (arg0.anInt6453 != -1 && arg0.anInt6438 == 0) {
			local11 = Static330.aClass279_2.method6216(arg0.anInt6453);
			if (local11 == null || local11.anIntArray55 == null) {
				arg0.anInt6453 = -1;
				arg0.anIntArray515 = null;
			} else {
				arg0.anInt6441++;
				if (local11.anIntArray55.length > arg0.anInt6385 && arg0.anInt6441 > local11.anIntArray54[arg0.anInt6385]) {
					arg0.anInt6385++;
					arg0.anInt6441 = 1;
					Static351.method5300(arg0.anInt6385, local11, arg0.anInt8980, arg0.anInt8975, arg0.aByte126, arg0 == Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2);
				}
				if (local11.anIntArray55.length <= arg0.anInt6385) {
					arg0.anInt6423++;
					arg0.anInt6385 -= local11.anInt551;
					if (arg0.anInt6423 >= local11.anInt564) {
						arg0.anIntArray515 = null;
						arg0.anInt6453 = -1;
					} else if (arg0.anInt6385 >= 0 && local11.anIntArray55.length > arg0.anInt6385) {
						Static351.method5300(arg0.anInt6385, local11, arg0.anInt8980, arg0.anInt8975, arg0.aByte126, Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2 == arg0);
					} else {
						arg0.anIntArray515 = null;
						arg0.anInt6453 = -1;
					}
				}
				arg0.anInt6440 = arg0.anInt6385 + 1;
				if (local11.anIntArray55.length <= arg0.anInt6440) {
					arg0.anInt6440 -= local11.anInt551;
					if (arg0.anInt6423 + 1 >= local11.anInt564) {
						arg0.anInt6440 = -1;
					} else if (arg0.anInt6440 < 0 || local11.anIntArray55.length <= arg0.anInt6440) {
						arg0.anInt6440 = -1;
					}
				}
			}
		}
		if (arg0.anInt6438 > 0) {
			arg0.anInt6438--;
		}
		for (@Pc(1047) int local1047 = 0; local1047 < arg0.aClass52Array3.length; local1047++) {
			@Pc(1056) Class52 local1056 = arg0.aClass52Array3[local1047];
			if (local1056 != null) {
				if (local1056.anInt1943 > 0) {
					local1056.anInt1943--;
				} else {
					local187 = Static330.aClass279_2.method6216(local1056.anInt1940);
					if (local187 == null || local187.anIntArray55 == null) {
						arg0.aClass52Array3[local1047] = null;
					} else {
						local1056.anInt1944++;
						if (local1056.anInt1945 < local187.anIntArray55.length && local1056.anInt1944 > local187.anIntArray54[local1056.anInt1945]) {
							local1056.anInt1945++;
							local1056.anInt1944 = 1;
							Static351.method5300(local1056.anInt1945, local187, arg0.anInt8980, arg0.anInt8975, arg0.aByte126, Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2 == arg0);
						}
						if (local1056.anInt1945 >= local187.anIntArray55.length) {
							local1056.anInt1945 -= local187.anInt551;
							local1056.anInt1941++;
							if (local187.anInt564 <= local1056.anInt1941) {
								arg0.aClass52Array3[local1047] = null;
							} else if (local1056.anInt1945 >= 0 && local187.anIntArray55.length > local1056.anInt1945) {
								Static351.method5300(local1056.anInt1945, local187, arg0.anInt8980, arg0.anInt8975, arg0.aByte126, arg0 == Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2);
							} else {
								arg0.aClass52Array3[local1047] = null;
							}
						}
						local1056.anInt1942 = local1056.anInt1945 + 1;
						if (local1056.anInt1942 >= local187.anIntArray55.length) {
							local1056.anInt1942 -= local187.anInt551;
							if (local187.anInt564 <= local1056.anInt1941 + 1) {
								local1056.anInt1942 = -1;
							} else if (local1056.anInt1942 < 0 || local187.anIntArray55.length <= local1056.anInt1942) {
								local1056.anInt1942 = -1;
							}
						}
					}
				}
			}
		}
	}
}

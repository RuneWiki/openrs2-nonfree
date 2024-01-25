import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!hq", name = "O", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_92 = new Class158("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIIIII)V")
	public static void method2657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static105.anInt2417 <= arg1 - arg0 && arg0 + arg1 <= Static70.anInt1843 && Static362.anInt6654 <= arg4 - arg0 && arg0 + arg4 <= Static164.anInt6595) {
			Static206.method3290(arg0, arg1, arg3, arg5, arg2, arg4);
		} else {
			Static291.method5725(arg0, arg2, arg3, arg1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BLclient!l;Lclient!za;)V")
	public static void method2658(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) Class106 arg1) {
		if (Static377.aClass1_Sub1_Sub17_2 == null) {
			return;
		}
		if (Static2.anInt48 < 10) {
			if (!Static377.aClass211_68.method4747(Static377.aClass1_Sub1_Sub17_2.aString65)) {
				Static2.anInt48 = Static263.aClass211_69.method4775(Static377.aClass1_Sub1_Sub17_2.aString65) / 10;
				return;
			}
			Static416.method5648();
			Static2.anInt48 = 10;
		}
		if (Static2.anInt48 == 10) {
			Static377.anInt5040 = Static377.aClass1_Sub1_Sub17_2.anInt7417 >> 6 << 6;
			Static377.anInt5030 = Static377.aClass1_Sub1_Sub17_2.anInt7420 >> 6 << 6;
			Static377.anInt5031 = (Static377.aClass1_Sub1_Sub17_2.anInt7424 >> 6 << 6) - (Static377.anInt5030 - 64);
			Static377.anInt5032 = (Static377.aClass1_Sub1_Sub17_2.anInt7418 >> 6 << 6) - (Static377.anInt5040 - 64);
			@Pc(74) int[] local74 = new int[3];
			@Pc(76) int local76 = -1;
			@Pc(78) int local78 = -1;
			if (Static377.aClass1_Sub1_Sub17_2.method5649(Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102, local74, (Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7490 >> 7) + Static278.anInt5374, Static380.anInt6896 + (Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7488 >> 7))) {
				local76 = local74[1] - Static377.anInt5040;
				local78 = local74[2] - Static377.anInt5030;
			}
			if (!Static200.aBoolean252 && local76 >= 0 && local76 < Static377.anInt5032 && local78 >= 0 && Static377.anInt5031 > local78) {
				local78 += (int) (Math.random() * 10.0D) - 5;
				local76 += (int) (Math.random() * 10.0D) - 5;
				Static125.anInt2774 = local78;
				Static226.anInt4474 = local76;
			} else if (Static429.anInt7614 == -1 || Static62.anInt1641 == -1) {
				Static377.aClass1_Sub1_Sub17_2.method5652(Static377.aClass1_Sub1_Sub17_2.anInt7426 & 0x3FFF, Static377.aClass1_Sub1_Sub17_2.anInt7426 >> 14 & 0x3FFF, local74);
				Static125.anInt2774 = local74[2] - Static377.anInt5030;
				Static226.anInt4474 = local74[1] - Static377.anInt5040;
			} else {
				Static377.aClass1_Sub1_Sub17_2.method5652(Static62.anInt1641, Static429.anInt7614, local74);
				Static62.anInt1641 = -1;
				Static429.anInt7614 = -1;
				Static200.aBoolean252 = false;
				if (local74 != null) {
					Static125.anInt2774 = local74[2] - Static377.anInt5030;
					Static226.anInt4474 = local74[1] - Static377.anInt5040;
				}
			}
			if (Static377.aClass1_Sub1_Sub17_2.anInt7422 == 37) {
				Static377.aFloat69 = 3.0F;
				Static377.aFloat70 = 3.0F;
			} else if (Static377.aClass1_Sub1_Sub17_2.anInt7422 == 50) {
				Static377.aFloat69 = 4.0F;
				Static377.aFloat70 = 4.0F;
			} else if (Static377.aClass1_Sub1_Sub17_2.anInt7422 == 75) {
				Static377.aFloat69 = 6.0F;
				Static377.aFloat70 = 6.0F;
			} else if (Static377.aClass1_Sub1_Sub17_2.anInt7422 == 100) {
				Static377.aFloat69 = 8.0F;
				Static377.aFloat70 = 8.0F;
			} else if (Static377.aClass1_Sub1_Sub17_2.anInt7422 == 200) {
				Static377.aFloat69 = 16.0F;
				Static377.aFloat70 = 16.0F;
			} else {
				Static377.aFloat69 = 8.0F;
				Static377.aFloat70 = 8.0F;
			}
			Static377.anInt5028 = (int) Static377.aFloat69 >> 1;
			Static377.aByteArrayArrayArray18 = Static144.method2314(Static377.anInt5028);
			Static376.method5225();
			Static377.method3864();
			Static140.aClass203_19 = new Class203();
			Static377.anInt5029 += (int) (Math.random() * 5.0D) - 2;
			if (Static377.anInt5029 < -8) {
				Static377.anInt5029 = -8;
			}
			if (Static377.anInt5029 > 8) {
				Static377.anInt5029 = 8;
			}
			Static377.anInt5027 += (int) (Math.random() * 5.0D) - 2;
			if (Static377.anInt5027 < -16) {
				Static377.anInt5027 = -16;
			}
			if (Static377.anInt5027 > 16) {
				Static377.anInt5027 = 16;
			}
			Static377.method3872(arg0, Static377.anInt5029 >> 2 << 10, Static377.anInt5027 >> 1);
			Static377.aClass170_4.method3743(1024, 256);
			Static377.aClass84_4.method1803(256, 256);
			Static377.aClass161_2.method3623(4096);
			Static303.aClass152_1.method3459(256);
			Static2.anInt48 = 20;
		} else if (Static2.anInt48 == 20) {
			Static155.method2610(true);
			Static377.method3870(arg1, Static377.anInt5029, Static377.anInt5027);
			Static2.anInt48 = 60;
			Static155.method2610(true);
			Static435.method5864();
		} else if (Static2.anInt48 == 60) {
			if (Static377.aClass211_68.method4776(Static377.aClass1_Sub1_Sub17_2.aString65 + "_staticelements")) {
				if (!Static377.aClass211_68.method4747(Static377.aClass1_Sub1_Sub17_2.aString65 + "_staticelements")) {
					return;
				}
				Static377.aClass121_3 = Static367.method5117(Static377.aClass1_Sub1_Sub17_2.aString65 + "_staticelements", Static377.aClass211_68, Static94.aBoolean149);
			} else {
				Static377.aClass121_3 = new Class121(0);
			}
			Static377.method3853();
			Static2.anInt48 = 70;
			Static155.method2610(true);
			Static435.method5864();
		} else if (Static2.anInt48 == 70) {
			Static414.aClass122_16 = new Class122(arg1, 11, true, Static443.aCanvas33);
			Static2.anInt48 = 73;
			Static155.method2610(true);
			Static435.method5864();
		} else if (Static2.anInt48 == 73) {
			Static11.aClass122_1 = new Class122(arg1, 12, true, Static443.aCanvas33);
			Static2.anInt48 = 76;
			Static155.method2610(true);
			Static435.method5864();
		} else if (Static2.anInt48 == 76) {
			Static51.aClass122_4 = new Class122(arg1, 14, true, Static443.aCanvas33);
			Static2.anInt48 = 79;
			Static155.method2610(true);
			Static435.method5864();
		} else if (Static2.anInt48 == 79) {
			Static448.aClass122_17 = new Class122(arg1, 17, true, Static443.aCanvas33);
			Static2.anInt48 = 82;
			Static155.method2610(true);
			Static435.method5864();
		} else if (Static2.anInt48 == 82) {
			Static168.aClass122_5 = new Class122(arg1, 19, true, Static443.aCanvas33);
			Static2.anInt48 = 85;
			Static155.method2610(true);
			Static435.method5864();
		} else if (Static2.anInt48 == 85) {
			Static141.aClass122_7 = new Class122(arg1, 22, true, Static443.aCanvas33);
			Static2.anInt48 = 88;
			Static155.method2610(true);
			Static435.method5864();
		} else if (Static2.anInt48 == 88) {
			Static105.aClass122_6 = new Class122(arg1, 26, true, Static443.aCanvas33);
			Static2.anInt48 = 91;
			Static155.method2610(true);
			Static435.method5864();
		} else {
			Static433.aClass122_19 = new Class122(arg1, 30, true, Static443.aCanvas33);
			Static2.anInt48 = 100;
			Static155.method2610(true);
			Static435.method5864();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZZ)V")
	public static void method2661(@OriginalArg(1) boolean arg0) {
		while (true) {
			if (Static5.aClass1_Sub3_Sub1_1.method318(Static350.anInt6510) >= 15) {
				@Pc(14) int local14 = Static5.aClass1_Sub3_Sub1_1.method321(15);
				if (local14 != 32767) {
					@Pc(21) boolean local21 = false;
					@Pc(28) Class1_Sub27 local28 = (Class1_Sub27) Static24.aClass38_3.method765((long) local14);
					@Pc(34) Class30_Sub1_Sub1_Sub1 local34;
					if (local28 == null) {
						local34 = new Class30_Sub1_Sub1_Sub1();
						local34.anInt1299 = local14;
						local28 = new Class1_Sub27(local34);
						Static24.aClass38_3.method766(local28, (long) local14);
						Static324.aClass1_Sub27Array2[Static127.anInt2832++] = local28;
						local21 = true;
					}
					local34 = local28.aClass30_Sub1_Sub1_Sub1_2;
					Static415.anIntArray701[Static197.anInt4078++] = local14;
					local34.anInt1239 = Static187.anInt3975;
					if (local34.aClass11_1 != null && local34.aClass11_1.method134()) {
						Static32.method668(local34);
					}
					local34.method666(Static300.aClass44_2.method999(Static5.aClass1_Sub3_Sub1_1.method321(14)));
					@Pc(100) int local100;
					if (arg0) {
						local100 = Static5.aClass1_Sub3_Sub1_1.method321(8);
						if (local100 > 127) {
							local100 -= 256;
						}
					} else {
						local100 = Static5.aClass1_Sub3_Sub1_1.method321(5);
						if (local100 > 15) {
							local100 -= 32;
						}
					}
					@Pc(124) int local124 = Static5.aClass1_Sub3_Sub1_1.method321(1);
					@Pc(129) int local129 = Static5.aClass1_Sub3_Sub1_1.method321(2);
					@Pc(134) int local134 = Static5.aClass1_Sub3_Sub1_1.method321(1);
					if (local134 == 1) {
						Static96.anIntArray253[Static424.anInt7540++] = local14;
					}
					@Pc(156) int local156 = Static5.aClass1_Sub3_Sub1_1.method321(3) + 4 << 11 & 0x3A1B;
					@Pc(163) int local163;
					if (arg0) {
						local163 = Static5.aClass1_Sub3_Sub1_1.method321(8);
						if (local163 > 127) {
							local163 -= 256;
						}
					} else {
						local163 = Static5.aClass1_Sub3_Sub1_1.method321(5);
						if (local163 > 15) {
							local163 -= 32;
						}
					}
					local34.method949(local34.aClass11_1.anInt162);
					local34.anInt1302 = local34.aClass11_1.anInt159 << 3;
					if (local21) {
						local34.method943(true, local156);
					}
					local34.method669(local100 + Static429.aClass30_Sub1_Sub1_Sub2_2.anIntArray130[0], local124 == 1, local163 + Static429.aClass30_Sub1_Sub1_Sub2_2.anIntArray129[0], local34.method944(), local129);
					if (local34.aClass11_1.method134()) {
						Static418.method5683(local34.aByte102, null, 0, null, local34.anIntArray130[0], local34, local34.anIntArray129[0]);
					}
					continue;
				}
			}
			Static5.aClass1_Sub3_Sub1_1.method315();
			return;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!ou;B)V")
	public static void method2662(@OriginalArg(0) Class30_Sub1_Sub1 arg0) {
		arg0.anInt1298 = 0;
		@Pc(19) Class235 local19;
		if (arg0.anInt1255 != -1) {
			local19 = Static107.aClass239_1.method5420(arg0.anInt1255);
			if (local19 == null || local19.anIntArray633 == null) {
				arg0.aBoolean81 = false;
				arg0.anInt1255 = -1;
			} else {
				label394: {
					arg0.anInt1278++;
					if (local19.anIntArray633.length > arg0.anInt1297 && arg0.anInt1278 > local19.anIntArray632[arg0.anInt1297]) {
						arg0.anInt1297++;
						arg0.anInt1242++;
						arg0.anInt1278 = 1;
						Static290.method4258(arg0.anInt7488, arg0.anInt1297, arg0.aByte102, arg0.anInt7490, Static429.aClass30_Sub1_Sub1_Sub2_2 == arg0, local19);
					}
					if (arg0.anInt1297 >= local19.anIntArray633.length) {
						arg0.anInt1297 = 0;
						arg0.anInt1278 = 0;
						if (arg0.aBoolean81) {
							arg0.anInt1255 = arg0.method948().method4811();
							if (arg0.anInt1255 == -1) {
								arg0.aBoolean81 = false;
								break label394;
							}
							local19 = Static107.aClass239_1.method5420(arg0.anInt1255);
						}
						Static290.method4258(arg0.anInt7488, arg0.anInt1297, arg0.aByte102, arg0.anInt7490, Static429.aClass30_Sub1_Sub1_Sub2_2 == arg0, local19);
					}
					arg0.anInt1242 = arg0.anInt1297 + 1;
					if (arg0.anInt1242 >= local19.anIntArray633.length) {
						arg0.anInt1242 = 0;
					}
				}
			}
		}
		@Pc(175) int local175;
		@Pc(183) Class235 local183;
		@Pc(172) Class223 local172;
		if (arg0.anInt1279 != -1 && Static187.anInt3975 >= arg0.anInt1256) {
			local172 = Static145.aClass63_1.method1524(arg0.anInt1279);
			local175 = local172.anInt6642;
			if (local175 == -1) {
				arg0.anInt1279 = -1;
			} else {
				label396: {
					local183 = Static107.aClass239_1.method5420(local175);
					if (local172.aBoolean420) {
						if (local183.anInt6851 == 3) {
							if (arg0.anInt1315 > 0 && Static187.anInt3975 >= arg0.anInt1305 && arg0.anInt1300 < Static187.anInt3975) {
								arg0.anInt1279 = -1;
								break label396;
							}
						} else if (local183.anInt6851 == 1 && arg0.anInt1315 > 0 && arg0.anInt1305 <= Static187.anInt3975 && Static187.anInt3975 > arg0.anInt1300) {
							arg0.anInt1256 = Static187.anInt3975 + 1;
							break label396;
						}
					}
					if (local183 == null || local183.anIntArray633 == null) {
						arg0.anInt1279 = -1;
					} else {
						if (arg0.anInt1261 < 0) {
							arg0.anInt1261 = 0;
							Static290.method4258(arg0.anInt7488, 0, arg0.aByte102, arg0.anInt7490, arg0 == Static429.aClass30_Sub1_Sub1_Sub2_2, local183);
						}
						arg0.anInt1264++;
						if (arg0.anInt1261 < local183.anIntArray633.length && local183.anIntArray632[arg0.anInt1261] < arg0.anInt1264) {
							arg0.anInt1264 = 1;
							arg0.anInt1261++;
							Static290.method4258(arg0.anInt7488, arg0.anInt1261, arg0.aByte102, arg0.anInt7490, Static429.aClass30_Sub1_Sub1_Sub2_2 == arg0, local183);
						}
						if (local183.anIntArray633.length <= arg0.anInt1261) {
							if (local172.aBoolean420) {
								arg0.anInt1261 -= local183.anInt6857;
								arg0.anInt1265++;
								if (local183.anInt6859 <= arg0.anInt1265) {
									arg0.anInt1279 = -1;
								} else if (arg0.anInt1261 >= 0 && arg0.anInt1261 < local183.anIntArray633.length) {
									Static290.method4258(arg0.anInt7488, arg0.anInt1261, arg0.aByte102, arg0.anInt7490, Static429.aClass30_Sub1_Sub1_Sub2_2 == arg0, local183);
								} else {
									arg0.anInt1279 = -1;
								}
							} else {
								arg0.anInt1279 = -1;
							}
						}
						arg0.anInt1284 = arg0.anInt1261 + 1;
						if (arg0.anInt1284 >= local183.anIntArray633.length) {
							if (local172.aBoolean420) {
								arg0.anInt1284 -= local183.anInt6857;
								if (local183.anInt6859 <= arg0.anInt1265 + 1) {
									arg0.anInt1284 = -1;
								} else if (arg0.anInt1284 < 0 || arg0.anInt1284 >= local183.anIntArray633.length) {
									arg0.anInt1284 = -1;
								}
							} else {
								arg0.anInt1284 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt1249 != -1 && Static187.anInt3975 >= arg0.anInt1295) {
			local172 = Static145.aClass63_1.method1524(arg0.anInt1249);
			local175 = local172.anInt6642;
			if (local175 == -1) {
				arg0.anInt1249 = -1;
			} else {
				label399: {
					local183 = Static107.aClass239_1.method5420(local175);
					if (local172.aBoolean420) {
						if (local183.anInt6851 == 3) {
							if (arg0.anInt1315 > 0 && arg0.anInt1305 <= Static187.anInt3975 && arg0.anInt1300 < Static187.anInt3975) {
								arg0.anInt1249 = -1;
								break label399;
							}
						} else if (local183.anInt6851 == 1 && arg0.anInt1315 > 0 && Static187.anInt3975 >= arg0.anInt1305 && Static187.anInt3975 > arg0.anInt1300) {
							arg0.anInt1295 = Static187.anInt3975 + 1;
							break label399;
						}
					}
					if (local183 == null || local183.anIntArray633 == null) {
						arg0.anInt1249 = -1;
					} else {
						if (arg0.anInt1252 < 0) {
							arg0.anInt1252 = 0;
							Static290.method4258(arg0.anInt7488, 0, arg0.aByte102, arg0.anInt7490, Static429.aClass30_Sub1_Sub1_Sub2_2 == arg0, local183);
						}
						arg0.anInt1289++;
						if (local183.anIntArray633.length > arg0.anInt1252 && local183.anIntArray632[arg0.anInt1252] < arg0.anInt1289) {
							arg0.anInt1289 = 1;
							arg0.anInt1252++;
							Static290.method4258(arg0.anInt7488, arg0.anInt1252, arg0.aByte102, arg0.anInt7490, arg0 == Static429.aClass30_Sub1_Sub1_Sub2_2, local183);
						}
						if (local183.anIntArray633.length <= arg0.anInt1252) {
							if (local172.aBoolean420) {
								arg0.anInt1283++;
								arg0.anInt1252 -= local183.anInt6857;
								if (local183.anInt6859 <= arg0.anInt1283) {
									arg0.anInt1249 = -1;
								} else if (arg0.anInt1252 >= 0 && arg0.anInt1252 < local183.anIntArray633.length) {
									Static290.method4258(arg0.anInt7488, arg0.anInt1252, arg0.aByte102, arg0.anInt7490, Static429.aClass30_Sub1_Sub1_Sub2_2 == arg0, local183);
								} else {
									arg0.anInt1249 = -1;
								}
							} else {
								arg0.anInt1249 = -1;
							}
						}
						arg0.anInt1270 = arg0.anInt1252 + 1;
						if (arg0.anInt1270 >= local183.anIntArray633.length) {
							if (local172.aBoolean420) {
								arg0.anInt1270 -= local183.anInt6857;
								if (local183.anInt6859 <= arg0.anInt1283 + 1) {
									arg0.anInt1270 = -1;
								} else if (arg0.anInt1270 < 0 || arg0.anInt1270 >= local183.anIntArray633.length) {
									arg0.anInt1270 = -1;
								}
							} else {
								arg0.anInt1270 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt1303 != -1 && arg0.anInt1271 <= 1) {
			local19 = Static107.aClass239_1.method5420(arg0.anInt1303);
			if (local19.anInt6851 == 3) {
				if (arg0.anInt1315 > 0 && arg0.anInt1305 <= Static187.anInt3975 && Static187.anInt3975 > arg0.anInt1300) {
					arg0.anInt1303 = -1;
				}
			} else if (local19.anInt6851 == 1 && arg0.anInt1315 > 0 && Static187.anInt3975 >= arg0.anInt1305 && Static187.anInt3975 > arg0.anInt1300) {
				arg0.anInt1271 = 2;
			}
		}
		if (arg0.anInt1303 != -1 && arg0.anInt1271 == 0) {
			local19 = Static107.aClass239_1.method5420(arg0.anInt1303);
			if (local19 == null || local19.anIntArray633 == null) {
				arg0.anInt1303 = -1;
			} else {
				arg0.anInt1260++;
				if (local19.anIntArray633.length > arg0.anInt1294 && arg0.anInt1260 > local19.anIntArray632[arg0.anInt1294]) {
					arg0.anInt1294++;
					arg0.anInt1260 = 1;
					Static290.method4258(arg0.anInt7488, arg0.anInt1294, arg0.aByte102, arg0.anInt7490, arg0 == Static429.aClass30_Sub1_Sub1_Sub2_2, local19);
				}
				if (local19.anIntArray633.length <= arg0.anInt1294) {
					arg0.anInt1245++;
					arg0.anInt1294 -= local19.anInt6857;
					if (arg0.anInt1245 >= local19.anInt6859) {
						arg0.anInt1303 = -1;
					} else if (arg0.anInt1294 >= 0 && local19.anIntArray633.length > arg0.anInt1294) {
						Static290.method4258(arg0.anInt7488, arg0.anInt1294, arg0.aByte102, arg0.anInt7490, Static429.aClass30_Sub1_Sub1_Sub2_2 == arg0, local19);
					} else {
						arg0.anInt1303 = -1;
					}
				}
				arg0.anInt1267 = arg0.anInt1294 + 1;
				if (arg0.anInt1267 >= local19.anIntArray633.length) {
					arg0.anInt1267 -= local19.anInt6857;
					if (local19.anInt6859 <= arg0.anInt1245 + 1) {
						arg0.anInt1267 = -1;
					} else if (arg0.anInt1267 < 0 || local19.anIntArray633.length <= arg0.anInt1267) {
						arg0.anInt1267 = -1;
					}
				}
				arg0.anInt1298 = local19.anInt6849;
			}
		}
		if (arg0.anInt1271 > 0) {
			arg0.anInt1271--;
		}
		for (@Pc(1043) int local1043 = 0; local1043 < arg0.aClass232Array3.length; local1043++) {
			@Pc(1050) Class232 local1050 = arg0.aClass232Array3[local1043];
			if (local1050 != null) {
				if (local1050.anInt6768 > 0) {
					local1050.anInt6768--;
				} else {
					local183 = Static107.aClass239_1.method5420(local1050.anInt6764);
					if (local183 == null || local183.anIntArray633 == null) {
						arg0.aClass232Array3[local1043] = null;
					} else {
						local1050.anInt6765++;
						if (local1050.anInt6767 < local183.anIntArray633.length && local1050.anInt6765 > local183.anIntArray632[local1050.anInt6767]) {
							local1050.anInt6767++;
							local1050.anInt6765 = 1;
							Static290.method4258(arg0.anInt7488, local1050.anInt6767, arg0.aByte102, arg0.anInt7490, Static429.aClass30_Sub1_Sub1_Sub2_2 == arg0, local183);
						}
						if (local1050.anInt6767 >= local183.anIntArray633.length) {
							local1050.anInt6772++;
							local1050.anInt6767 -= local183.anInt6857;
							if (local183.anInt6859 <= local1050.anInt6772) {
								arg0.aClass232Array3[local1043] = null;
							} else if (local1050.anInt6767 >= 0 && local183.anIntArray633.length > local1050.anInt6767) {
								Static290.method4258(arg0.anInt7488, local1050.anInt6767, arg0.aByte102, arg0.anInt7490, Static429.aClass30_Sub1_Sub1_Sub2_2 == arg0, local183);
							} else {
								arg0.aClass232Array3[local1043] = null;
							}
						}
						local1050.anInt6770 = local1050.anInt6767 + 1;
						if (local1050.anInt6770 >= local183.anIntArray633.length) {
							local1050.anInt6770 -= local183.anInt6857;
							if (local1050.anInt6772 + 1 >= local183.anInt6859) {
								local1050.anInt6770 = -1;
							} else if (local1050.anInt6770 < 0 || local183.anIntArray633.length <= local1050.anInt6770) {
								local1050.anInt6770 = -1;
							}
						}
					}
				}
			}
		}
	}
}

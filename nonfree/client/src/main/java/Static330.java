import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
	public static int anInt6353 = 0;

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "Lclient!bj;")
	public static Class26 aClass26_57 = new Class26(64);

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
	public static void method5435() {
		if (Static4.anInt23 > 1) {
			Static46.anInt908 = Static301.anInt5969;
			Static4.anInt23--;
		}
		if (Static186.anInt3761 > 0) {
			Static186.anInt3761--;
		}
		if (Static314.aBoolean140) {
			Static314.aBoolean140 = false;
			Static118.method1787();
			return;
		}
		if (!Static38.aBoolean40) {
			Static265.method4599();
		}
		for (@Pc(39) int local39 = 0; local39 < 100 && Static88.method1284(); local39++) {
		}
		if (Static245.anInt6561 != 30) {
			return;
		}
		Static25.method5364(Static313.aClass11_Sub25_Sub1_5);
		@Pc(80) int local80;
		@Pc(100) int local100;
		@Pc(117) int local117;
		@Pc(130) boolean local130;
		@Pc(182) int local182;
		@Pc(189) int local189;
		@Pc(200) int local200;
		if (Static182.aClass11_Sub39_1 != null || Static185.aLong109 < Static268.method4627() - 2000L) {
			@Pc(77) boolean local77 = false;
			local80 = Static313.aClass11_Sub25_Sub1_5.anInt6076;
			for (@Pc(85) Class11_Sub39 local85 = (Class11_Sub39) Static251.aClass16_41.method193(); local85 != null && Static313.aClass11_Sub25_Sub1_5.anInt6076 - local80 < 240; local85 = (Class11_Sub39) Static251.aClass16_41.method188()) {
				local85.method5701();
				local100 = local85.method5598();
				if (local100 < 0) {
					local100 = 0;
				} else if (local100 > 65534) {
					local100 = 65534;
				}
				local117 = local85.method5601();
				if (local117 < 0) {
					local117 = 0;
				} else if (local117 > 65534) {
					local117 = 65534;
				}
				local130 = false;
				if (local85.method5598() == -1 && local85.method5601() == -1) {
					local130 = true;
					local100 = -1;
					local117 = -1;
				}
				if (local117 != Static217.anInt4440 || local100 != Static209.anInt4259) {
					if (!local77) {
						Static313.aClass11_Sub25_Sub1_5.method2454(224);
						Static313.aClass11_Sub25_Sub1_5.method5186(0);
						local80 = Static313.aClass11_Sub25_Sub1_5.anInt6076;
						local77 = true;
					}
					local182 = local117 - Static217.anInt4440;
					Static217.anInt4440 = local117;
					local189 = local100 - Static209.anInt4259;
					Static209.anInt4259 = local100;
					local200 = (int) ((local85.method5602() - Static185.aLong109) / 20L);
					if (local200 < 8 && local182 >= -32 && local182 <= 31 && local189 >= -32 && local189 <= 31) {
						local189 += 32;
						local182 += 32;
						Static313.aClass11_Sub25_Sub1_5.method5204(local189 + (local200 << 12) + (local182 << 6));
					} else if (local200 < 32 && local182 >= -128 && local182 <= 127 && local189 >= -128 && local189 <= 127) {
						local182 += 128;
						Static313.aClass11_Sub25_Sub1_5.method5186(local200 + 128);
						local189 += 128;
						Static313.aClass11_Sub25_Sub1_5.method5204(local189 + (local182 << 8));
					} else if (local200 >= 32) {
						Static313.aClass11_Sub25_Sub1_5.method5204(local200 + 57344);
						if (local130) {
							Static313.aClass11_Sub25_Sub1_5.method5168(Integer.MIN_VALUE);
						} else {
							Static313.aClass11_Sub25_Sub1_5.method5168(local100 << 16 | local117);
						}
					} else {
						Static313.aClass11_Sub25_Sub1_5.method5186(local200 + 192);
						if (local130) {
							Static313.aClass11_Sub25_Sub1_5.method5168(Integer.MIN_VALUE);
						} else {
							Static313.aClass11_Sub25_Sub1_5.method5168(local100 << 16 | local117);
						}
					}
					Static185.aLong109 = local85.method5602();
				}
			}
			if (local77) {
				Static313.aClass11_Sub25_Sub1_5.method5183(Static313.aClass11_Sub25_Sub1_5.anInt6076 - local80);
			}
		}
		@Pc(374) int local374;
		@Pc(427) int local427;
		if (Static182.aClass11_Sub39_1 != null) {
			@Pc(358) long local358 = (Static182.aClass11_Sub39_1.method5602() - Static11.aLong5) / 50L;
			Static11.aLong5 = Static182.aClass11_Sub39_1.method5602();
			if (local358 > 32767L) {
				local358 = 32767L;
			}
			local374 = Static182.aClass11_Sub39_1.method5598();
			if (local374 < 0) {
				local374 = 0;
			} else if (local374 > 65535) {
				local374 = 65535;
			}
			local100 = Static182.aClass11_Sub39_1.method5601();
			if (local100 < 0) {
				local100 = 0;
			} else if (local100 > 65535) {
				local100 = 65535;
			}
			@Pc(407) byte local407 = 0;
			if (Static182.aClass11_Sub39_1.method5600() == 2) {
				local407 = 1;
			}
			Static313.aClass11_Sub25_Sub1_5.method2454(124);
			local427 = (int) local358;
			Static313.aClass11_Sub25_Sub1_5.method5211(local100 | local374 << 16);
			Static313.aClass11_Sub25_Sub1_5.method5170(local427 | local407 << 15);
		}
		@Pc(450) int local450;
		if (Static191.anInt6244 > 0) {
			local450 = 0;
			for (local80 = 0; local80 < Static191.anInt6244; local80++) {
				if (Static10.aClass75Array1[local80].method1486()) {
					local450++;
				}
			}
			if (local450 > 0) {
				if (local450 > 75) {
					local450 = 75;
				}
				Static313.aClass11_Sub25_Sub1_5.method2454(120);
				Static313.aClass11_Sub25_Sub1_5.method5186(local450 * 3);
				for (local374 = 0; local374 < Static191.anInt6244; local374++) {
					@Pc(494) Class75 local494 = Static10.aClass75Array1[local374];
					if (local494.method1486()) {
						@Pc(506) long local506 = (local494.method1489() - Static309.aLong183) / 50L;
						Static309.aLong183 = local494.method1489();
						if (local506 > 65535L) {
							local506 = 65535L;
						}
						Static313.aClass11_Sub25_Sub1_5.method5186(local494.method1492());
						Static313.aClass11_Sub25_Sub1_5.method5204((int) local506);
					}
				}
			}
		}
		if (Static248.anInt4972 > 0) {
			Static248.anInt4972--;
		}
		if (Static81.aBoolean92 && Static248.anInt4972 <= 0) {
			Static248.anInt4972 = 20;
			Static81.aBoolean92 = false;
			Static313.aClass11_Sub25_Sub1_5.method2454(148);
			Static313.aClass11_Sub25_Sub1_5.method5191((int) Static246.aFloat51 >> 3);
			Static313.aClass11_Sub25_Sub1_5.method5191((int) Static21.aFloat10 >> 3);
		}
		if (Static224.aBoolean407 && !Static185.aBoolean238) {
			Static185.aBoolean238 = true;
			Static313.aClass11_Sub25_Sub1_5.method2454(10);
			Static313.aClass11_Sub25_Sub1_5.method5186(1);
		}
		if (!Static224.aBoolean407 && Static185.aBoolean238) {
			Static185.aBoolean238 = false;
			Static313.aClass11_Sub25_Sub1_5.method2454(10);
			Static313.aClass11_Sub25_Sub1_5.method5186(0);
		}
		if (!Static212.aBoolean292) {
			Static313.aClass11_Sub25_Sub1_5.method2454(44);
			Static313.aClass11_Sub25_Sub1_5.method5182(Static24.method351());
			Static212.aBoolean292 = true;
		}
		if (Static212.aClass106ArrayArrayArray2 != null) {
			if (Static81.anInt1498 == 2) {
				Static332.method5450();
			} else if (Static81.anInt1498 == 3) {
				Static193.method3528();
			}
		}
		if (Static75.aBoolean86) {
			Static75.aBoolean86 = false;
		} else {
			Static209.aFloat44 /= 2.0F;
		}
		if (Static260.aBoolean346) {
			Static260.aBoolean346 = false;
		} else {
			Static283.aFloat53 /= 2.0F;
		}
		Static297.method4918();
		if (Static245.anInt6561 != 30) {
			return;
		}
		Static221.method3948();
		Static152.method4678();
		Static66.method1707();
		Static172.anInt3428++;
		if (Static172.anInt3428 > 750) {
			Static118.method1787();
			return;
		}
		Static59.method893();
		Static119.method1792();
		Static24.method349();
		for (local450 = Static285.method4750(true); local450 != -1; local450 = Static285.method4750(false)) {
			Static259.method4516(local450);
			Static210.anIntArray331[Static291.anInt5765++ & 0x1F] = local450;
		}
		@Pc(777) Class137 local777;
		for (@Pc(729) Class11_Sub4_Sub12 local729 = Static88.method1286(); local729 != null; local729 = Static88.method1286()) {
			local374 = local729.method3865();
			local100 = local729.method3862();
			if (local374 == 1) {
				Static25.anIntArray516[local100] = local729.anInt4390;
				Static240.aBoolean321 |= Static315.aBooleanArray25[local100];
				Static122.anIntArray160[Static73.anInt1390++ & 0x1F] = local100;
			} else if (local374 == 2) {
				Static218.aStringArray23[local100] = local729.aString41;
				Static239.anIntArray379[Static71.anInt1344++ & 0x1F] = local100;
			} else if (local374 == 3) {
				local777 = Static166.method2688(local100);
				if (!local729.aString41.equals(local777.aString37)) {
					local777.aString37 = local729.aString41;
					Static69.method1039(local777);
				}
			} else if (local374 == 4) {
				local777 = Static166.method2688(local100);
				local427 = local729.anInt4390;
				local182 = local729.anInt4388;
				local189 = local729.anInt4398;
				if (local427 != local777.anInt4108 || local182 != local777.anInt4050 || local189 != local777.anInt4054) {
					local777.anInt4054 = local189;
					local777.anInt4050 = local182;
					local777.anInt4108 = local427;
					Static69.method1039(local777);
				}
			} else if (local374 == 5) {
				local777 = Static166.method2688(local100);
				if (local777.anInt4076 != local729.anInt4390 || local729.anInt4390 == -1) {
					local777.anInt4076 = local729.anInt4390;
					local777.anInt4104 = 1;
					local777.anInt4099 = 0;
					local777.anInt4091 = 0;
					Static69.method1039(local777);
				}
			} else if (local374 == 6) {
				local117 = local729.anInt4390;
				local427 = local117 >> 10 & 0x1F;
				local182 = local117 >> 5 & 0x1F;
				local189 = local117 & 0x1F;
				local200 = (local189 << 3) + (local427 << 19) + (local182 << 11);
				@Pc(1120) Class137 local1120 = Static166.method2688(local100);
				if (local200 != local1120.anInt4048) {
					local1120.anInt4048 = local200;
					Static69.method1039(local1120);
				}
			} else if (local374 == 7) {
				local777 = Static166.method2688(local100);
				local130 = local729.anInt4390 == 1;
				if (local130 != local777.aBoolean268) {
					local777.aBoolean268 = local130;
					Static69.method1039(local777);
				}
			} else if (local374 == 8) {
				local777 = Static166.method2688(local100);
				if (local777.anInt4120 != local729.anInt4390 || local777.anInt4114 != local729.anInt4388 || local729.anInt4398 != local777.anInt4078) {
					local777.anInt4120 = local729.anInt4390;
					local777.anInt4078 = local729.anInt4398;
					local777.anInt4114 = local729.anInt4388;
					if (local777.anInt4112 != -1) {
						if (local777.anInt4094 > 0) {
							local777.anInt4078 = local777.anInt4078 * 32 / local777.anInt4094;
						} else if (local777.anInt4065 > 0) {
							local777.anInt4078 = local777.anInt4078 * 32 / local777.anInt4065;
						}
					}
					Static69.method1039(local777);
				}
			} else if (local374 == 9) {
				local777 = Static166.method2688(local100);
				if (local777.anInt4112 != local729.anInt4390 || local729.anInt4388 != local777.anInt4089) {
					local777.anInt4089 = local729.anInt4388;
					local777.anInt4112 = local729.anInt4390;
					Static69.method1039(local777);
				}
			} else if (local374 == 10) {
				local777 = Static166.method2688(local100);
				if (local777.anInt4080 != local729.anInt4390 || local777.anInt4123 != local729.anInt4388 || local777.anInt4066 != local729.anInt4398) {
					local777.anInt4080 = local729.anInt4390;
					local777.anInt4123 = local729.anInt4388;
					local777.anInt4066 = local729.anInt4398;
					Static69.method1039(local777);
				}
			} else if (local374 == 11) {
				local777 = Static166.method2688(local100);
				local777.anInt4098 = local777.anInt4115 = local729.anInt4388;
				local777.aByte52 = 0;
				local777.anInt4071 = local777.anInt4087 = local729.anInt4390;
				local777.aByte50 = 0;
				Static69.method1039(local777);
			} else if (local374 == 12) {
				local777 = Static166.method2688(local100);
				local427 = local729.anInt4390;
				if (local777 != null && local777.anInt4067 == 0) {
					if (local427 > local777.anInt4079 - local777.anInt4110) {
						local427 = local777.anInt4079 - local777.anInt4110;
					}
					if (local427 < 0) {
						local427 = 0;
					}
					if (local427 != local777.anInt4062) {
						local777.anInt4062 = local427;
						Static69.method1039(local777);
					}
				}
			} else if (local374 == 14) {
				local777 = Static166.method2688(local100);
				local777.anInt4064 = local729.anInt4390;
			} else if (local374 == 15) {
				Static276.anInt5528 = local729.anInt4388;
				Static310.aBoolean406 = true;
				Static132.anInt2474 = local729.anInt4390;
			} else if (local374 == 16) {
				local777 = Static166.method2688(local100);
				local777.anInt4118 = local729.anInt4390;
			}
		}
		if (Static129.anInt2387 != 0) {
			Static89.anInt1600 += 20;
			if (Static89.anInt1600 >= 400) {
				Static129.anInt2387 = 0;
			}
		}
		Static244.anInt4932++;
		if (Static239.aClass137_15 != null) {
			Static39.anInt725++;
			if (Static39.anInt725 >= 15) {
				Static69.method1039(Static239.aClass137_15);
				Static239.aClass137_15 = null;
			}
		}
		Static259.aBoolean342 = false;
		Static238.aClass137_14 = null;
		Static137.aBoolean171 = false;
		Static275.aClass137_16 = null;
		Static19.method1624(-1, null, -1);
		Static88.method1285(-1, -1, null);
		Static336.method5483();
		Static301.anInt5969++;
		if (Static100.aBoolean106) {
			Static313.aClass11_Sub25_Sub1_5.method2454(227);
			Static313.aClass11_Sub25_Sub1_5.method5208(Static21.anInt1288 | Static52.anInt4721 << 14 | Static82.anInt1506 << 28);
			Static100.aBoolean106 = false;
		}
		while (true) {
			@Pc(1356) Class11_Sub13 local1356;
			@Pc(1361) Class137 local1361;
			do {
				local1356 = (Class11_Sub13) Static356.aClass16_54.method180();
				if (local1356 == null) {
					while (true) {
						do {
							local1356 = (Class11_Sub13) Static151.aClass16_25.method180();
							if (local1356 == null) {
								while (true) {
									do {
										local1356 = (Class11_Sub13) Static284.aClass16_43.method180();
										if (local1356 == null) {
											if (Static238.aClass137_14 == null) {
												Static235.anInt4730 = 0;
											}
											if (Static45.aClass137_4 != null) {
												Static135.method2126();
											}
											if (Static248.anInt4969 > 0 && Static278.aClass143_20.method4857(82) && Static278.aClass143_20.method4857(81) && Static180.anInt4653 != 0) {
												local374 = Static322.anInt6250 - Static180.anInt4653;
												if (local374 < 0) {
													local374 = 0;
												} else if (local374 > 3) {
													local374 = 3;
												}
												Static117.method1781(Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray391[0] + Static182.anInt3662, local374, Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray392[0] + Static169.anInt6312);
											}
											Static126.method3660();
											for (local374 = 0; local374 < 5; local374++) {
												@Pc(1547) int local1547 = Static87.anIntArray105[local374]++;
											}
											if (Static240.aBoolean321 && Static320.aLong189 < Static268.method4627() - 60000L) {
												Static62.method919();
											}
											Static117.anInt2189++;
											if (Static117.anInt2189 > 500) {
												Static117.anInt2189 = 0;
												local100 = (int) (Math.random() * 8.0D);
												if ((local100 & 0x2) == 2) {
													Static338.anInt6504 += Static132.anInt2476;
												}
												if ((local100 & 0x1) == 1) {
													Static84.anInt1523 += Static105.anInt1971;
												}
												if ((local100 & 0x4) == 4) {
													Static84.anInt1522 += Static310.anInt6150;
												}
											}
											if (Static84.anInt1523 < -50) {
												Static105.anInt1971 = 2;
											}
											if (Static84.anInt1523 > 50) {
												Static105.anInt1971 = -2;
											}
											if (Static338.anInt6504 < -55) {
												Static132.anInt2476 = 2;
											}
											if (Static338.anInt6504 > 55) {
												Static132.anInt2476 = -2;
											}
											if (Static84.anInt1522 < -40) {
												Static310.anInt6150 = 1;
											}
											if (Static84.anInt1522 > 40) {
												Static310.anInt6150 = -1;
											}
											Static245.anInt6558++;
											if (Static245.anInt6558 > 500) {
												Static245.anInt6558 = 0;
												local100 = (int) (Math.random() * 8.0D);
												if ((local100 & 0x2) == 2) {
													Static231.anInt5050 += Static22.anInt411;
												}
												if ((local100 & 0x1) == 1) {
													Static303.anInt4931 += Static77.anInt6706;
												}
											}
											if (Static303.anInt4931 < -60) {
												Static77.anInt6706 = 2;
											}
											if (Static303.anInt4931 > 60) {
												Static77.anInt6706 = -2;
											}
											if (Static231.anInt5050 < -20) {
												Static22.anInt411 = 1;
											}
											if (Static231.anInt5050 > 10) {
												Static22.anInt411 = -1;
											}
											Static172.anInt3418++;
											if (Static172.anInt3418 > 50) {
												Static313.aClass11_Sub25_Sub1_5.method2454(61);
											}
											if (Static134.aBoolean160) {
												Static168.method2726();
												Static134.aBoolean160 = false;
											}
											try {
												if (Static291.aClass156_103 != null && Static313.aClass11_Sub25_Sub1_5.anInt6076 > 0) {
													Static291.aClass156_103.method4183(Static313.aClass11_Sub25_Sub1_5.aByteArray93, Static313.aClass11_Sub25_Sub1_5.anInt6076);
													Static172.anInt3418 = 0;
													Static313.aClass11_Sub25_Sub1_5.anInt6076 = 0;
													return;
												}
												return;
											} catch (@Pc(1747) IOException local1747) {
												Static118.method1787();
												return;
											}
										}
										local1361 = local1356.aClass137_5;
										if (local1361.anInt4095 < 0) {
											break;
										}
										local777 = Static166.method2688(local1361.anInt4124);
									} while (local777 == null || local777.aClass137Array2 == null || local1361.anInt4095 >= local777.aClass137Array2.length || local777.aClass137Array2[local1361.anInt4095] != local1361);
									Static93.method1353(local1356);
								}
							}
							local1361 = local1356.aClass137_5;
							if (local1361.anInt4095 < 0) {
								break;
							}
							local777 = Static166.method2688(local1361.anInt4124);
						} while (local777 == null || local777.aClass137Array2 == null || local1361.anInt4095 >= local777.aClass137Array2.length || local777.aClass137Array2[local1361.anInt4095] != local1361);
						Static93.method1353(local1356);
					}
				}
				local1361 = local1356.aClass137_5;
				if (local1361.anInt4095 < 0) {
					break;
				}
				local777 = Static166.method2688(local1361.anInt4124);
			} while (local777 == null || local777.aClass137Array2 == null || local1361.anInt4095 >= local777.aClass137Array2.length || local1361 != local777.aClass137Array2[local1361.anInt4095]);
			Static93.method1353(local1356);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILclient!oo;III)V")
	public static void method5436(@OriginalArg(0) int arg0, @OriginalArg(1) Class67_Sub3_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) Class55 local13 = arg1.method4374();
		@Pc(23) int local23 = arg1.anInt5044 - arg1.aClass17_7.anInt269 & 0x3FFF;
		if (arg2 == -1) {
			if (local23 != 0 || arg1.anInt5041 > 25) {
				if (arg3 < 0 && local13.anInt1213 != -1) {
					arg1.anInt5040 = local13.anInt1213;
				} else if (arg3 <= 0 || local13.anInt1197 == -1) {
					arg1.anInt5040 = local13.anInt1212;
				} else {
					arg1.anInt5040 = local13.anInt1197;
				}
				arg1.aBoolean328 = false;
			} else if (!arg1.aBoolean328 || !local13.method944(arg1.anInt5040)) {
				arg1.anInt5040 = local13.method935();
				arg1.aBoolean328 = arg1.anInt5040 != -1;
			}
		} else if (arg1.anInt5023 != -1 && (local23 >= 10240 || local23 <= 2048)) {
			@Pc(220) int local220 = Static301.anIntArray487[arg0] - arg1.aClass17_7.anInt269 & 0x3FFF;
			arg1.aBoolean328 = false;
			if (arg2 == 2 && local13.anInt1208 != -1) {
				if (local220 > 2048 && local220 <= 6144 && local13.anInt1182 != -1) {
					arg1.anInt5040 = local13.anInt1182;
				} else if (local220 >= 10240 && local220 < 14336 && local13.anInt1195 != -1) {
					arg1.anInt5040 = local13.anInt1195;
				} else if (local220 <= 6144 || local220 >= 10240 || local13.anInt1194 == -1) {
					arg1.anInt5040 = local13.anInt1208;
				} else {
					arg1.anInt5040 = local13.anInt1194;
				}
			} else if (arg2 == 0 && local13.anInt1211 != -1) {
				if (local220 > 2048 && local220 <= 6144 && local13.anInt1216 != -1) {
					arg1.anInt5040 = local13.anInt1216;
				} else if (local220 >= 10240 && local220 < 14336 && local13.anInt1190 != -1) {
					arg1.anInt5040 = local13.anInt1190;
				} else if (local220 <= 6144 || local220 >= 10240 || local13.anInt1177 == -1) {
					arg1.anInt5040 = local13.anInt1211;
				} else {
					arg1.anInt5040 = local13.anInt1177;
				}
			} else if (local220 > 2048 && local220 <= 6144 && local13.anInt1201 != -1) {
				arg1.anInt5040 = local13.anInt1201;
			} else if (local220 >= 10240 && local220 < 14336 && local13.anInt1176 != -1) {
				arg1.anInt5040 = local13.anInt1176;
			} else if (local220 <= 6144 || local220 >= 10240 || local13.anInt1210 == -1) {
				arg1.anInt5040 = local13.anInt1212;
			} else {
				arg1.anInt5040 = local13.anInt1210;
			}
		} else if (local23 == 0 && arg1.anInt5041 <= 25) {
			if (arg2 == 2 && local13.anInt1208 != -1) {
				arg1.anInt5040 = local13.anInt1208;
			} else if (arg2 == 0 && local13.anInt1211 != -1) {
				arg1.anInt5040 = local13.anInt1211;
			} else {
				arg1.anInt5040 = local13.anInt1212;
			}
			arg1.aBoolean328 = false;
		} else {
			if (arg2 == 2 && local13.anInt1208 != -1) {
				if (arg3 < 0 && local13.anInt1178 != -1) {
					arg1.anInt5040 = local13.anInt1178;
				} else if (arg3 <= 0 || local13.anInt1184 == -1) {
					arg1.anInt5040 = local13.anInt1208;
				} else {
					arg1.anInt5040 = local13.anInt1184;
				}
			} else if (arg2 == 0 && local13.anInt1211 != -1) {
				if (arg3 < 0 && local13.anInt1200 != -1) {
					arg1.anInt5040 = local13.anInt1200;
				} else if (arg3 <= 0 || local13.anInt1189 == -1) {
					arg1.anInt5040 = local13.anInt1211;
				} else {
					arg1.anInt5040 = local13.anInt1189;
				}
			} else if (arg3 < 0 && local13.anInt1174 != -1) {
				arg1.anInt5040 = local13.anInt1174;
			} else if (arg3 <= 0 || local13.anInt1171 == -1) {
				arg1.anInt5040 = local13.anInt1212;
			} else {
				arg1.anInt5040 = local13.anInt1171;
			}
			arg1.aBoolean328 = false;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!aj;B)V")
	public static void method5437(@OriginalArg(0) Class10_Sub1 arg0) {
		arg0.aClass67_1 = null;
		@Pc(21) int local21 = arg0.aClass10_Sub8Array1.length;
		for (@Pc(23) int local23 = 0; local23 < local21; local23++) {
			arg0.aClass10_Sub8Array1[local23].aBoolean415 = false;
		}
		@Pc(41) Class210[] local41 = Class27_Sub2.aClass210Array1;
		synchronized (Class27_Sub2.aClass210Array1) {
			if (local21 < Class27_Sub2.aClass210Array1.length && Static257.anIntArray399[local21] < 200) {
				Class27_Sub2.aClass210Array1[local21].method5612(arg0);
				@Pc(66) int local66 = Static257.anIntArray399[local21]++;
			}
		}
	}
}

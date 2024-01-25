import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!ha", name = "W", descriptor = "Lclient!mr;")
	public static Class139 aClass139_1;

	@OriginalMember(owner = "client!ha", name = "Y", descriptor = "Lclient!dp;")
	public static Class53 aClass53_59;

	@OriginalMember(owner = "client!ha", name = "T", descriptor = "Lclient!ce;")
	public static final Class31 aClass31_6 = new Class31(64);

	@OriginalMember(owner = "client!ha", name = "X", descriptor = "Lclient!jh;")
	public static final Class6_Sub10_Sub1 aClass6_Sub10_Sub1_1 = new Class6_Sub10_Sub1(5000);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZIBI)Lclient!oq;")
	public static Class6_Sub30 method2245(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class6_Sub30 local7 = new Class6_Sub30();
		local7.anInt4313 = arg2;
		local7.anInt4314 = arg0;
		Static197.aClass108_30.method2898((long) arg3, local7);
		Static259.method4412(arg2);
		@Pc(26) Class132 local26 = Static249.method4316(arg3);
		if (local26 != null) {
			Static298.method5108(local26);
		}
		if (Static109.aClass132_7 != null) {
			Static298.method5108(Static109.aClass132_7);
			Static109.aClass132_7 = null;
		}
		Static30.method482();
		if (local26 != null) {
			Static189.method3558(local26, !arg1);
		}
		if (!arg1) {
			Static140.method2656(arg2);
		}
		if (!arg1 && Static62.anInt1131 != -1) {
			Static296.method5396(Static62.anInt1131, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
	public static void method2247() {
		if (Static340.anInt654 > 1) {
			Static340.anInt654--;
			Static107.anInt1992 = Static234.anInt36;
		}
		if (Static124.anInt2286 > 0) {
			Static124.anInt2286--;
		}
		if (Static227.aBoolean299) {
			Static227.aBoolean299 = false;
			Static21.method304();
			return;
		}
		if (!Static201.aBoolean284) {
			Static49.method844();
		}
		for (@Pc(38) int local38 = 0; local38 < 100 && Static238.method4711(); local38++) {
		}
		if (Static129.anInt2374 != 30) {
			return;
		}
		Static3.method48(Static131.aClass6_Sub10_Sub1_2);
		@Pc(62) Object local62 = aClass139_1.anObject3;
		@Pc(92) int local92;
		@Pc(94) int local94;
		@Pc(96) int local96;
		@Pc(111) int local111;
		@Pc(130) int local130;
		@Pc(191) int local191;
		synchronized (aClass139_1.anObject3) {
			if (!Static109.aBoolean173) {
				aClass139_1.anInt3718 = 0;
			} else if (Static118.anInt2240 != 0 || aClass139_1.anInt3718 >= 40) {
				Static131.aClass6_Sub10_Sub1_2.method2886(211);
				Static131.aClass6_Sub10_Sub1_2.method3968(0);
				local92 = Static131.aClass6_Sub10_Sub1_2.anInt4188;
				local94 = 0;
				for (local96 = 0; aClass139_1.anInt3718 > local96 && Static131.aClass6_Sub10_Sub1_2.anInt4188 - local92 < 240; local96++) {
					local94++;
					local111 = aClass139_1.anIntArray436[local96];
					if (local111 < 0) {
						local111 = 0;
					} else if (local111 > 65534) {
						local111 = 65534;
					}
					local130 = aClass139_1.anIntArray437[local96];
					if (local130 < 0) {
						local130 = 0;
					} else if (local130 > 65534) {
						local130 = 65534;
					}
					@Pc(148) boolean local148 = false;
					if (aClass139_1.anIntArray436[local96] == -1 && aClass139_1.anIntArray437[local96] == -1) {
						local148 = true;
						local111 = -1;
						local130 = -1;
					}
					if (Static85.anInt1558 != local130 || local111 != Static344.anInt6236) {
						local191 = local130 - Static85.anInt1558;
						Static85.anInt1558 = local130;
						@Pc(198) int local198 = local111 - Static344.anInt6236;
						Static344.anInt6236 = local111;
						if (Static354.anInt6370 < 8 && local191 >= -32 && local191 <= 31 && local198 >= -32 && local198 <= 31) {
							local198 += 32;
							local191 += 32;
							Static131.aClass6_Sub10_Sub1_2.method4025(local198 + (local191 << 6) + (Static354.anInt6370 << 12));
							Static354.anInt6370 = 0;
						} else if (Static354.anInt6370 < 32 && local191 >= -128 && local191 <= 127 && local198 >= -128 && local198 <= 127) {
							local198 += 128;
							local191 += 128;
							Static131.aClass6_Sub10_Sub1_2.method3968(Static354.anInt6370 + 128);
							Static131.aClass6_Sub10_Sub1_2.method4025((local191 << 8) + local198);
							Static354.anInt6370 = 0;
						} else if (Static354.anInt6370 < 32) {
							Static131.aClass6_Sub10_Sub1_2.method3968(Static354.anInt6370 + 192);
							if (local148) {
								Static131.aClass6_Sub10_Sub1_2.method3976(Integer.MIN_VALUE);
							} else {
								Static131.aClass6_Sub10_Sub1_2.method3976(local130 | local111 << 16);
							}
							Static354.anInt6370 = 0;
						} else {
							Static131.aClass6_Sub10_Sub1_2.method4025(Static354.anInt6370 + 57344);
							if (local148) {
								Static131.aClass6_Sub10_Sub1_2.method3976(Integer.MIN_VALUE);
							} else {
								Static131.aClass6_Sub10_Sub1_2.method3976(local111 << 16 | local130);
							}
							Static354.anInt6370 = 0;
						}
					} else if (Static354.anInt6370 < 2047) {
						Static354.anInt6370++;
					}
				}
				Static131.aClass6_Sub10_Sub1_2.method3988(Static131.aClass6_Sub10_Sub1_2.anInt4188 - local92);
				if (local94 >= aClass139_1.anInt3718) {
					aClass139_1.anInt3718 = 0;
				} else {
					aClass139_1.anInt3718 -= local94;
					for (local111 = 0; local111 < aClass139_1.anInt3718; local111++) {
						aClass139_1.anIntArray437[local111] = aClass139_1.anIntArray437[local111 + local94];
						aClass139_1.anIntArray436[local111] = aClass139_1.anIntArray436[local94 + local111];
					}
				}
			}
		}
		if (Static118.anInt2240 != 0) {
			@Pc(413) long local413 = (Static104.aLong66 - Static156.aLong213) / 50L;
			Static156.aLong213 = Static104.aLong66;
			if (local413 > 32767L) {
				local413 = 32767L;
			}
			local92 = Static198.anInt3691;
			if (local92 < 0) {
				local92 = 0;
			} else if (local92 > 65535) {
				local92 = 65535;
			}
			local94 = Static182.anInt3425;
			if (local94 < 0) {
				local94 = 0;
			} else if (local94 > 65535) {
				local94 = 65535;
			}
			@Pc(456) byte local456 = 0;
			if (Static118.anInt2240 == 2) {
				local456 = 1;
			}
			Static131.aClass6_Sub10_Sub1_2.method2886(218);
			local111 = (int) local413;
			Static131.aClass6_Sub10_Sub1_2.method4025(local456 << 15 | local111);
			Static131.aClass6_Sub10_Sub1_2.method3976(local92 << 16 | local94);
		}
		if (Static334.anInt6117 > 0) {
			Static334.anInt6117--;
		}
		if (Static211.aBoolean291 && Static334.anInt6117 <= 0) {
			Static334.anInt6117 = 20;
			Static211.aBoolean291 = false;
			Static131.aClass6_Sub10_Sub1_2.method2886(223);
			Static131.aClass6_Sub10_Sub1_2.method3984((int) Static163.aFloat69 >> 3);
			Static131.aClass6_Sub10_Sub1_2.method4020((int) Static117.aFloat58 >> 3);
		}
		if (Static68.aBoolean298 && !Static77.aBoolean93) {
			Static77.aBoolean93 = true;
			Static131.aClass6_Sub10_Sub1_2.method2886(221);
			Static131.aClass6_Sub10_Sub1_2.method3968(1);
		}
		if (!Static68.aBoolean298 && Static77.aBoolean93) {
			Static77.aBoolean93 = false;
			Static131.aClass6_Sub10_Sub1_2.method2886(221);
			Static131.aClass6_Sub10_Sub1_2.method3968(0);
		}
		if (!Static263.aBoolean339) {
			Static131.aClass6_Sub10_Sub1_2.method2886(149);
			Static131.aClass6_Sub10_Sub1_2.method4001(Static164.method3246());
			Static263.aBoolean339 = true;
		}
		if (Static30.aBoolean40) {
			Static30.aBoolean40 = false;
		} else {
			Static265.aFloat76 /= 2.0F;
		}
		if (Static122.aBoolean191) {
			Static122.aBoolean191 = false;
		} else {
			Static128.aFloat62 /= 2.0F;
		}
		Static95.method1724();
		if (Static129.anInt2374 != 30) {
			return;
		}
		Static239.method5791();
		Static6.method128();
		Static126.method2490();
		Static303.anInt5738++;
		if (Static303.anInt5738 > 750) {
			Static21.method304();
			return;
		}
		Static6.method127();
		Static119.method2413();
		Static200.method3638();
		for (@Pc(645) int local645 = Static80.method5172(true); local645 != -1; local645 = Static80.method5172(false)) {
			Static145.method2740(local645);
			Static308.anIntArray654[Static318.anInt5889++ & 0x1F] = local645;
		}
		@Pc(702) Class132 local702;
		@Pc(711) int local711;
		for (@Pc(670) Class6_Sub2_Sub8 local670 = Static204.method3692(); local670 != null; local670 = Static204.method3692()) {
			local92 = local670.method2650();
			local94 = local670.method2647();
			if (local92 == 1) {
				Static295.anIntArray624[local94] = local670.anInt2511;
				Static90.aBoolean119 |= Static6.aBooleanArray1[local94];
				Static210.anIntArray450[Static215.anInt3938++ & 0x1F] = local94;
			} else if (local92 == 2) {
				Static144.aStringArray17[local94] = local670.aString105;
				Static346.anIntArray713[Static316.anInt5862++ & 0x1F] = local94;
			} else if (local92 == 3) {
				local702 = Static249.method4316(local94);
				if (!local670.aString105.equals(local702.aString144)) {
					local702.aString144 = local670.aString105;
					Static298.method5108(local702);
				}
			} else if (local92 == 4) {
				local702 = Static249.method4316(local94);
				local111 = local670.anInt2511;
				local130 = local670.anInt2507;
				local711 = local670.anInt2510;
				if (local111 != local702.anInt3553 || local130 != local702.anInt3558 || local702.anInt3560 != local711) {
					local702.anInt3560 = local711;
					local702.anInt3553 = local111;
					local702.anInt3558 = local130;
					Static298.method5108(local702);
				}
			} else if (local92 == 5) {
				local702 = Static249.method4316(local94);
				if (local670.anInt2511 != local702.anInt3541 || local670.anInt2511 == -1) {
					local702.anInt3573 = 0;
					local702.anInt3534 = 0;
					local702.anInt3487 = 1;
					local702.anInt3541 = local670.anInt2511;
					Static298.method5108(local702);
				}
			} else if (local92 == 6) {
				local96 = local670.anInt2511;
				local111 = local96 >> 10 & 0x1F;
				local130 = local96 >> 5 & 0x1F;
				local711 = local96 & 0x1F;
				local191 = (local130 << 11) + (local111 << 19) + (local711 << 3);
				@Pc(1105) Class132 local1105 = Static249.method4316(local94);
				if (local191 != local1105.anInt3513) {
					local1105.anInt3513 = local191;
					Static298.method5108(local1105);
				}
			} else if (local92 == 7) {
				local702 = Static249.method4316(local94);
				@Pc(1054) boolean local1054 = local670.anInt2511 == 1;
				if (local1054 != local702.aBoolean265) {
					local702.aBoolean265 = local1054;
					Static298.method5108(local702);
				}
			} else if (local92 == 8) {
				local702 = Static249.method4316(local94);
				if (local670.anInt2511 != local702.anInt3512 || local702.anInt3570 != local670.anInt2507 || local702.anInt3569 != local670.anInt2510) {
					local702.anInt3570 = local670.anInt2507;
					local702.anInt3512 = local670.anInt2511;
					local702.anInt3569 = local670.anInt2510;
					if (local702.anInt3508 != -1) {
						if (local702.anInt3538 > 0) {
							local702.anInt3569 = local702.anInt3569 * 32 / local702.anInt3538;
						} else if (local702.anInt3580 > 0) {
							local702.anInt3569 = local702.anInt3569 * 32 / local702.anInt3580;
						}
					}
					Static298.method5108(local702);
				}
			} else if (local92 == 9) {
				local702 = Static249.method4316(local94);
				if (local670.anInt2511 != local702.anInt3508 || local670.anInt2507 != local702.anInt3494) {
					local702.anInt3494 = local670.anInt2507;
					local702.anInt3508 = local670.anInt2511;
					Static298.method5108(local702);
				}
			} else if (local92 == 10) {
				local702 = Static249.method4316(local94);
				if (local670.anInt2511 != local702.anInt3518 || local702.anInt3499 != local670.anInt2507 || local670.anInt2510 != local702.anInt3515) {
					local702.anInt3515 = local670.anInt2510;
					local702.anInt3499 = local670.anInt2507;
					local702.anInt3518 = local670.anInt2511;
					Static298.method5108(local702);
				}
			} else if (local92 == 11) {
				local702 = Static249.method4316(local94);
				local702.anInt3581 = local702.anInt3559 = local670.anInt2507;
				local702.aByte54 = 0;
				local702.aByte55 = 0;
				local702.anInt3498 = local702.anInt3550 = local670.anInt2511;
				Static298.method5108(local702);
			} else if (local92 == 12) {
				local702 = Static249.method4316(local94);
				local111 = local670.anInt2511;
				if (local702 != null && local702.anInt3524 == 0) {
					if (local111 > local702.anInt3566 - local702.anInt3503) {
						local111 = local702.anInt3566 - local702.anInt3503;
					}
					if (local111 < 0) {
						local111 = 0;
					}
					if (local111 != local702.anInt3578) {
						local702.anInt3578 = local111;
						Static298.method5108(local702);
					}
				}
			} else if (local92 == 13) {
				local702 = Static249.method4316(local94);
				local702.anInt3529 = local670.anInt2511;
			} else if (local92 == 14) {
				local702 = Static249.method4316(local94);
				local702.anInt3533 = local670.anInt2511;
			} else if (local92 == 15) {
				Static24.anInt385 = local670.anInt2507;
				Static125.aBoolean198 = true;
				Static299.anInt5652 = local670.anInt2511;
			}
		}
		if (Static336.anInt6136 != 0) {
			Static249.anInt4661 += 20;
			if (Static249.anInt4661 >= 400) {
				Static336.anInt6136 = 0;
			}
		}
		Static133.anInt2448++;
		if (Static200.aClass132_13 != null) {
			Static210.anInt3844++;
			if (Static210.anInt3844 >= 15) {
				Static298.method5108(Static200.aClass132_13);
				Static200.aClass132_13 = null;
			}
		}
		@Pc(1248) Class132 local1248 = Static153.aClass132_11;
		@Pc(1250) Class132 local1250 = Static32.aClass132_15;
		Static153.aClass132_11 = null;
		Static346.aBoolean419 = false;
		Static210.anInt3833 = 0;
		Static32.aClass132_15 = null;
		Static296.aClass132_19 = null;
		Static95.aBoolean127 = false;
		while (Static237.method4200() && Static210.anInt3833 < 128) {
			if (!Static46.method773() || Static156.aChar10 != '`' && Static156.aChar10 != '§') {
				Static60.anIntArray125[Static210.anInt3833] = Static67.anInt1255;
				Static323.anIntArray680[Static210.anInt3833] = Static156.aChar10;
				Static210.anInt3833++;
			} else if (Static155.method4929()) {
				Static292.method4996();
			} else {
				Static273.method5575();
			}
		}
		if (Static155.method4929()) {
			Static38.method655();
		}
		Static285.aClass132_16 = null;
		Static44.method765(null, -1, -1);
		Static187.method3524(-1, null, -1);
		if (Static62.anInt1131 != -1) {
			Static98.method2028(0, 0, 0, Static209.anInt3815, Static94.anInt1731, 0, Static62.anInt1131);
		}
		Static234.anInt36++;
		if (Static285.aClass132_16 != null) {
			Static229.method5760();
		}
		if (Static259.aBoolean338) {
			Static131.aClass6_Sub10_Sub1_2.method2886(193);
			Static131.aClass6_Sub10_Sub1_2.method3963(Static284.anInt5373 | Static226.anInt4221 << 14 | Static135.anInt5752 << 28);
			Static259.aBoolean338 = false;
		}
		while (true) {
			@Pc(1389) Class132 local1389;
			@Pc(1373) Class6_Sub15 local1373;
			@Pc(1378) Class132 local1378;
			do {
				local1373 = (Class6_Sub15) Static252.aClass211_28.method5587();
				if (local1373 == null) {
					while (true) {
						do {
							local1373 = (Class6_Sub15) Static84.aClass211_8.method5587();
							if (local1373 == null) {
								while (true) {
									do {
										local1373 = (Class6_Sub15) Static116.aClass211_18.method5587();
										if (local1373 == null) {
											if (Static285.aClass132_16 == null) {
												Static301.anInt5701 = 0;
											}
											if (Static350.aClass132_20 != null) {
												Static280.method4828();
											}
											if (Static115.anInt2157 > 0 && Static354.aBooleanArray30[82] && Static354.aBooleanArray30[81] && Static346.anInt6269 != 0) {
												local96 = Static343.anInt6225 - Static346.anInt6269;
												if (local96 < 0) {
													local96 = 0;
												} else if (local96 > 3) {
													local96 = 3;
												}
												Static294.method5028(Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray560[0] + Static44.anInt881, local96, Static300.anInt5672 + Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray561[0]);
											}
											Static29.method480();
											if (Static313.aClass132_18 != null) {
												Static298.method5108(Static313.aClass132_18);
												Static102.anInt5257++;
												if (Static283.anInt5344 + 5 < Static7.anInt149 || Static283.anInt5344 - 5 > Static7.anInt149 || Static79.anInt1449 > Static234.anInt32 + 5 || Static234.anInt32 - 5 > Static79.anInt1449) {
													Static147.aBoolean216 = true;
												}
												if (Static193.anInt3653 == 0) {
													if (Static147.aBoolean216 && Static102.anInt5257 >= 5) {
														if (Static313.aClass132_18 == Static10.aClass132_2 && Static22.anInt363 != Static65.anInt1207) {
															local702 = Static313.aClass132_18;
															@Pc(1639) byte local1639 = 0;
															if (Static219.anInt4049 == 1 && local702.anInt3539 == 206) {
																local1639 = 1;
															}
															if (local702.anIntArray414[Static22.anInt363] <= 0) {
																local1639 = 0;
															}
															if (local1639 == 1) {
																local130 = Static65.anInt1207;
																local711 = Static22.anInt363;
																while (local711 != local130) {
																	if (local130 > local711) {
																		local702.method3535(local130, local130 - 1);
																		local130--;
																	} else if (local130 < local711) {
																		local702.method3535(local130, local130 + 1);
																		local130++;
																	}
																}
															} else {
																local702.method3535(Static65.anInt1207, Static22.anInt363);
															}
															Static131.aClass6_Sub10_Sub1_2.method2886(219);
															Static131.aClass6_Sub10_Sub1_2.method3976(Static313.aClass132_18.anInt3551);
															Static131.aClass6_Sub10_Sub1_2.method3978(local1639);
															Static131.aClass6_Sub10_Sub1_2.method3961(Static65.anInt1207);
															Static131.aClass6_Sub10_Sub1_2.method3961(Static22.anInt363);
														}
													} else if ((Static118.anInt2251 == 1 || Static313.method5292()) && Static256.anInt4749 > 2) {
														Static328.method5459();
													} else if (Static165.method5485()) {
														Static167.method3292();
													}
													Static210.anInt3844 = 10;
													Static118.anInt2240 = 0;
													Static313.aClass132_18 = null;
												}
											}
											if (Static153.aClass132_11 != local1248) {
												if (local1248 != null) {
													Static298.method5108(local1248);
												}
												if (Static153.aClass132_11 != null) {
													Static298.method5108(Static153.aClass132_11);
												}
											}
											if (local1250 != Static32.aClass132_15 && Static41.anInt6382 == Static238.anInt5145) {
												if (local1250 != null) {
													Static298.method5108(local1250);
												}
												if (Static32.aClass132_15 != null) {
													Static298.method5108(Static32.aClass132_15);
												}
											}
											if (Static32.aClass132_15 == null) {
												if (Static41.anInt6382 > 0) {
													Static41.anInt6382--;
												}
											} else if (Static238.anInt5145 > Static41.anInt6382) {
												Static41.anInt6382++;
												if (Static238.anInt5145 == Static41.anInt6382) {
													Static298.method5108(Static32.aClass132_15);
												}
											}
											for (local96 = 0; local96 < 5; local96++) {
												@Pc(1799) int local1799 = Static311.anIntArray664[local96]++;
											}
											local111 = Static207.method3710();
											local130 = Static154.method3112();
											if (local111 > 15000 && local130 > 15000) {
												Static124.anInt2286 = 250;
												Static223.method3940(14500);
												Static131.aClass6_Sub10_Sub1_2.method2886(92);
											}
											if (Static90.aBoolean119 && Static245.method4300() - 60000L > Static152.aLong101) {
												Static95.method1718();
											}
											Static77.anInt1422++;
											if (Static77.anInt1422 > 500) {
												Static77.anInt1422 = 0;
												local711 = (int) (Math.random() * 8.0D);
												if ((local711 & 0x4) == 4) {
													Static256.anInt4734 += Static133.anInt2447;
												}
												if ((local711 & 0x1) == 1) {
													Static176.anInt3301 += Static82.anInt1507;
												}
												if ((local711 & 0x2) == 2) {
													Static80.anInt5690 += Static143.anInt2810;
												}
											}
											if (Static176.anInt3301 < -50) {
												Static82.anInt1507 = 2;
											}
											if (Static80.anInt5690 < -55) {
												Static143.anInt2810 = 2;
											}
											if (Static176.anInt3301 > 50) {
												Static82.anInt1507 = -2;
											}
											if (Static80.anInt5690 > 55) {
												Static143.anInt2810 = -2;
											}
											if (Static256.anInt4734 < -40) {
												Static133.anInt2447 = 1;
											}
											if (Static256.anInt4734 > 40) {
												Static133.anInt2447 = -1;
											}
											Static20.anInt329++;
											if (Static20.anInt329 > 500) {
												Static20.anInt329 = 0;
												local711 = (int) (Math.random() * 8.0D);
												if ((local711 & 0x1) == 1) {
													Static345.anInt6260 += Static143.anInt2807;
												}
												if ((local711 & 0x2) == 2) {
													Static279.anInt5302 += Static66.anInt1218;
												}
											}
											if (Static345.anInt6260 < -60) {
												Static143.anInt2807 = 2;
											}
											if (Static279.anInt5302 < -20) {
												Static66.anInt1218 = 1;
											}
											if (Static345.anInt6260 > 60) {
												Static143.anInt2807 = -2;
											}
											if (Static279.anInt5302 > 10) {
												Static66.anInt1218 = -1;
											}
											Static217.anInt4022++;
											if (Static217.anInt4022 > 50) {
												Static131.aClass6_Sub10_Sub1_2.method2886(104);
											}
											if (Static124.aBoolean193) {
												Static233.method4139();
												Static124.aBoolean193 = false;
											}
											try {
												if (Static216.aClass11_5 != null && Static131.aClass6_Sub10_Sub1_2.anInt4188 > 0) {
													Static216.aClass11_5.method158(Static131.aClass6_Sub10_Sub1_2.aByteArray67, Static131.aClass6_Sub10_Sub1_2.anInt4188);
													Static131.aClass6_Sub10_Sub1_2.anInt4188 = 0;
													Static217.anInt4022 = 0;
													return;
												}
												return;
											} catch (@Pc(2033) IOException local2033) {
												Static21.method304();
												return;
											}
										}
										local1378 = local1373.aClass132_5;
										if (local1378.anInt3555 < 0) {
											break;
										}
										local1389 = Static249.method4316(local1378.anInt3500);
									} while (local1389 == null || local1389.aClass132Array2 == null || local1389.aClass132Array2.length <= local1378.anInt3555 || local1389.aClass132Array2[local1378.anInt3555] != local1378);
									Static140.method2654(local1373);
								}
							}
							local1378 = local1373.aClass132_5;
							if (local1378.anInt3555 < 0) {
								break;
							}
							local1389 = Static249.method4316(local1378.anInt3500);
						} while (local1389 == null || local1389.aClass132Array2 == null || local1378.anInt3555 >= local1389.aClass132Array2.length || local1378 != local1389.aClass132Array2[local1378.anInt3555]);
						Static140.method2654(local1373);
					}
				}
				local1378 = local1373.aClass132_5;
				if (local1378.anInt3555 < 0) {
					break;
				}
				local1389 = Static249.method4316(local1378.anInt3500);
			} while (local1389 == null || local1389.aClass132Array2 == null || local1389.aClass132Array2.length <= local1378.anInt3555 || local1389.aClass132Array2[local1378.anInt3555] != local1378);
			Static140.method2654(local1373);
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2248(@OriginalArg(1) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}
}

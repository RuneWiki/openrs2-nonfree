import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!gh", name = "V", descriptor = "[Lclient!o;")
	public static Class73_Sub1[] aClass73_Sub1Array1;

	@OriginalMember(owner = "client!gh", name = "X", descriptor = "Lclient!kh;")
	public static Class60 aClass60_526 = Static200.method3116("Freie Welt");

	@OriginalMember(owner = "client!gh", name = "Y", descriptor = "I")
	public static int anInt1655 = 0;

	@OriginalMember(owner = "client!gh", name = "ab", descriptor = "I")
	public static int anInt1657 = 127;

	@OriginalMember(owner = "client!gh", name = "bb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_527 = Static200.method3116("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!pf;Z)V")
	public static void method1206(@OriginalArg(0) Class1_Sub22 arg0, @OriginalArg(1) boolean arg1) {
		Static205.aClass19_17.method620(arg0);
		while (true) {
			@Pc(8) Class1_Sub22 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(30) Class1_Sub22[][] local30;
			@Pc(47) Class1_Sub22 local47;
			@Pc(270) int local270;
			@Pc(629) int local629;
			@Pc(634) int local634;
			@Pc(639) int local639;
			@Pc(956) Class47 local956;
			@Pc(1129) int local1129;
			@Pc(1014) int local1014;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(276) Class29 var11;
										@Pc(642) int var16;
										@Pc(651) int var17;
										@Pc(663) int var18;
										@Pc(385) int var20;
										@Pc(308) boolean var21;
										@Pc(837) Class1_Sub22 var32;
										while (true) {
											do {
												local8 = (Class1_Sub22) Static205.aClass19_17.method621();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean187);
											local17 = local8.anInt3359;
											local20 = local8.anInt3363;
											local23 = local8.anInt3360;
											local26 = local8.anInt3356;
											local30 = Static100.aClass1_Sub22ArrayArrayArray3[local23];
											if (!local8.aBoolean186) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local47 = Static100.aClass1_Sub22ArrayArrayArray3[local23 - 1][local17][local20];
													if (local47 != null && local47.aBoolean187) {
														continue;
													}
												}
												if (local17 <= Static36.anInt3886 && local17 > Static68.anInt1688) {
													local47 = local30[local17 - 1][local20];
													if (local47 != null && local47.aBoolean187 && (local47.aBoolean186 || (local8.anInt3354 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static36.anInt3886 && local17 < Static186.anInt3977 - 1) {
													local47 = local30[local17 + 1][local20];
													if (local47 != null && local47.aBoolean187 && (local47.aBoolean186 || (local8.anInt3354 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static201.anInt4281 && local20 > Static140.anInt3131) {
													local47 = local30[local17][local20 - 1];
													if (local47 != null && local47.aBoolean187 && (local47.aBoolean186 || (local8.anInt3354 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static201.anInt4281 && local20 < Static12.anInt346 - 1) {
													local47 = local30[local17][local20 + 1];
													if (local47 != null && local47.aBoolean187 && (local47.aBoolean186 || (local8.anInt3354 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean186 = false;
											if (local8.aClass1_Sub22_1 != null) {
												local47 = local8.aClass1_Sub22_1;
												if (local47.aClass8_1 == null) {
													if (local47.aClass105_1 != null) {
														if (Static139.method2382(0, local17, local20)) {
															Static204.method3164(local47.aClass105_1, Static143.anInt3207, Static39.anInt883, Static171.anInt3703, Static131.anInt2854, local17, local20, true);
														} else {
															Static204.method3164(local47.aClass105_1, Static143.anInt3207, Static39.anInt883, Static171.anInt3703, Static131.anInt2854, local17, local20, false);
														}
													}
												} else if (Static139.method2382(0, local17, local20)) {
													Static56.method1060(local47.aClass8_1, 0, Static143.anInt3207, Static39.anInt883, Static171.anInt3703, Static131.anInt2854, local17, local20, true);
												} else {
													Static56.method1060(local47.aClass8_1, 0, Static143.anInt3207, Static39.anInt883, Static171.anInt3703, Static131.anInt2854, local17, local20, false);
												}
												@Pc(244) Class47 local244 = local47.aClass47_1;
												if (local244 != null) {
													local244.aClass9_4.method2903(0, Static143.anInt3207, Static39.anInt883, Static171.anInt3703, Static131.anInt2854, local244.anInt1946 - Static201.anInt4280, local244.anInt1948 - Static105.anInt2387, local244.anInt1952 - Static155.anInt3455, local244.aLong58);
												}
												for (local270 = 0; local270 < local47.anInt3358; local270++) {
													var11 = local47.aClass29Array3[local270];
													if (var11 != null) {
														var11.aClass9_3.method2903(var11.anInt1428, Static143.anInt3207, Static39.anInt883, Static171.anInt3703, Static131.anInt2854, var11.anInt1440 - Static201.anInt4280, var11.anInt1429 - Static105.anInt2387, var11.anInt1435 - Static155.anInt3455, var11.aLong43);
													}
												}
											}
											var21 = false;
											if (local8.aClass8_1 == null) {
												if (local8.aClass105_1 != null) {
													if (Static139.method2382(local26, local17, local20)) {
														Static204.method3164(local8.aClass105_1, Static143.anInt3207, Static39.anInt883, Static171.anInt3703, Static131.anInt2854, local17, local20, true);
													} else {
														var21 = true;
														Static204.method3164(local8.aClass105_1, Static143.anInt3207, Static39.anInt883, Static171.anInt3703, Static131.anInt2854, local17, local20, false);
													}
												}
											} else if (Static139.method2382(local26, local17, local20)) {
												Static56.method1060(local8.aClass8_1, local26, Static143.anInt3207, Static39.anInt883, Static171.anInt3703, Static131.anInt2854, local17, local20, true);
											} else {
												var21 = true;
												if (local8.aClass8_1.anInt347 != 12345678 || Static71.aBoolean92 && local23 <= Static162.anInt4653) {
													Static56.method1060(local8.aClass8_1, local26, Static143.anInt3207, Static39.anInt883, Static171.anInt3703, Static131.anInt2854, local17, local20, false);
												}
											}
											var20 = 0;
											local270 = 0;
											@Pc(390) Class47 local390 = local8.aClass47_1;
											@Pc(393) Class106 local393 = local8.aClass106_1;
											if (local390 != null || local393 != null) {
												if (Static36.anInt3886 == local17) {
													var20++;
												} else if (Static36.anInt3886 < local17) {
													var20 += 2;
												}
												if (Static201.anInt4281 == local20) {
													var20 += 3;
												} else if (Static201.anInt4281 > local20) {
													var20 += 6;
												}
												local270 = Static143.anIntArray418[var20];
												local8.anInt3361 = Static11.anIntArray654[var20];
											}
											if (local390 != null) {
												if ((local390.anInt1947 & Static32.anIntArray113[var20]) == 0) {
													local8.anInt3364 = 0;
												} else if (local390.anInt1947 == 16) {
													local8.anInt3364 = 3;
													local8.anInt3357 = Static161.anIntArray461[var20];
													local8.anInt3355 = 3 - local8.anInt3357;
												} else if (local390.anInt1947 == 32) {
													local8.anInt3364 = 6;
													local8.anInt3357 = Static72.anIntArray208[var20];
													local8.anInt3355 = 6 - local8.anInt3357;
												} else if (local390.anInt1947 == 64) {
													local8.anInt3364 = 12;
													local8.anInt3357 = Static6.anIntArray21[var20];
													local8.anInt3355 = 12 - local8.anInt3357;
												} else {
													local8.anInt3364 = 9;
													local8.anInt3357 = Static198.anIntArray550[var20];
													local8.anInt3355 = 9 - local8.anInt3357;
												}
												if ((local390.anInt1947 & local270) != 0 && !Static136.method2292(local26, local17, local20, local390.anInt1947)) {
													local390.aClass9_4.method2903(0, Static143.anInt3207, Static39.anInt883, Static171.anInt3703, Static131.anInt2854, local390.anInt1946 - Static201.anInt4280, local390.anInt1948 - Static105.anInt2387, local390.anInt1952 - Static155.anInt3455, local390.aLong58);
												}
												if ((local390.anInt1951 & local270) != 0 && !Static136.method2292(local26, local17, local20, local390.anInt1951)) {
													local390.aClass9_5.method2903(0, Static143.anInt3207, Static39.anInt883, Static171.anInt3703, Static131.anInt2854, local390.anInt1946 - Static201.anInt4280, local390.anInt1948 - Static105.anInt2387, local390.anInt1952 - Static155.anInt3455, local390.aLong58);
												}
											}
											if (local393 != null && !Static195.method3028(local26, local17, local20, local393.aClass9_10.method2902())) {
												if ((local393.anInt4529 & local270) != 0) {
													local393.aClass9_10.method2903(0, Static143.anInt3207, Static39.anInt883, Static171.anInt3703, Static131.anInt2854, local393.anInt4532 + local393.anInt4528 - Static201.anInt4280, local393.anInt4530 - Static105.anInt2387, local393.anInt4525 + local393.anInt4526 - Static155.anInt3455, local393.aLong141);
												} else if (local393.anInt4529 == 256) {
													local629 = local393.anInt4532 - Static201.anInt4280;
													local634 = local393.anInt4530 - Static105.anInt2387;
													local639 = local393.anInt4525 - Static155.anInt3455;
													var16 = local393.anInt4531;
													if (var16 == 1 || var16 == 2) {
														var17 = -local629;
													} else {
														var17 = local629;
													}
													if (var16 == 2 || var16 == 3) {
														var18 = -local639;
													} else {
														var18 = local639;
													}
													if (var18 < var17) {
														local393.aClass9_10.method2903(0, Static143.anInt3207, Static39.anInt883, Static171.anInt3703, Static131.anInt2854, local629 + local393.anInt4528, local634, local639 + local393.anInt4526, local393.aLong141);
													} else if (local393.aClass9_11 != null) {
														local393.aClass9_11.method2903(0, Static143.anInt3207, Static39.anInt883, Static171.anInt3703, Static131.anInt2854, local629, local634, local639, local393.aLong141);
													}
												}
											}
											if (var21) {
												@Pc(710) Class16 local710 = local8.aClass16_1;
												if (local710 != null) {
													local710.aClass9_2.method2903(0, Static143.anInt3207, Static39.anInt883, Static171.anInt3703, Static131.anInt2854, local710.anInt592 - Static201.anInt4280, local710.anInt593 - Static105.anInt2387, local710.anInt588 - Static155.anInt3455, local710.aLong22);
												}
												@Pc(737) Class78 local737 = local8.aClass78_1;
												if (local737 != null && local737.anInt3549 == 0) {
													if (local737.aClass9_7 != null) {
														local737.aClass9_7.method2903(0, Static143.anInt3207, Static39.anInt883, Static171.anInt3703, Static131.anInt2854, local737.anInt3552 - Static201.anInt4280, local737.anInt3545 - Static105.anInt2387, local737.anInt3550 - Static155.anInt3455, local737.aLong118);
													}
													if (local737.aClass9_9 != null) {
														local737.aClass9_9.method2903(0, Static143.anInt3207, Static39.anInt883, Static171.anInt3703, Static131.anInt2854, local737.anInt3552 - Static201.anInt4280, local737.anInt3545 - Static105.anInt2387, local737.anInt3550 - Static155.anInt3455, local737.aLong118);
													}
													if (local737.aClass9_8 != null) {
														local737.aClass9_8.method2903(0, Static143.anInt3207, Static39.anInt883, Static171.anInt3703, Static131.anInt2854, local737.anInt3552 - Static201.anInt4280, local737.anInt3545 - Static105.anInt2387, local737.anInt3550 - Static155.anInt3455, local737.aLong118);
													}
												}
											}
											local629 = local8.anInt3354;
											if (local629 != 0) {
												if (local17 < Static36.anInt3886 && (local629 & 0x4) != 0) {
													var32 = local30[local17 + 1][local20];
													if (var32 != null && var32.aBoolean187) {
														Static205.aClass19_17.method620(var32);
													}
												}
												if (local20 < Static201.anInt4281 && (local629 & 0x2) != 0) {
													var32 = local30[local17][local20 + 1];
													if (var32 != null && var32.aBoolean187) {
														Static205.aClass19_17.method620(var32);
													}
												}
												if (local17 > Static36.anInt3886 && (local629 & 0x1) != 0) {
													var32 = local30[local17 - 1][local20];
													if (var32 != null && var32.aBoolean187) {
														Static205.aClass19_17.method620(var32);
													}
												}
												if (local20 > Static201.anInt4281 && (local629 & 0x8) != 0) {
													var32 = local30[local17][local20 - 1];
													if (var32 != null && var32.aBoolean187) {
														Static205.aClass19_17.method620(var32);
													}
												}
											}
											break;
										}
										if (local8.anInt3364 != 0) {
											var21 = true;
											for (var20 = 0; var20 < local8.anInt3358; var20++) {
												if (local8.aClass29Array3[var20].anInt1432 != Static7.anInt189 && (local8.anIntArray435[var20] & local8.anInt3364) == local8.anInt3357) {
													var21 = false;
													break;
												}
											}
											if (var21) {
												local956 = local8.aClass47_1;
												if (!Static136.method2292(local26, local17, local20, local956.anInt1947)) {
													local956.aClass9_4.method2903(0, Static143.anInt3207, Static39.anInt883, Static171.anInt3703, Static131.anInt2854, local956.anInt1946 - Static201.anInt4280, local956.anInt1948 - Static105.anInt2387, local956.anInt1952 - Static155.anInt3455, local956.aLong58);
												}
												local8.anInt3364 = 0;
											}
										}
										if (!local8.aBoolean188) {
											break;
										}
										try {
											@Pc(994) int local994 = local8.anInt3358;
											local8.aBoolean188 = false;
											var20 = 0;
											label562: for (local270 = 0; local270 < local994; local270++) {
												var11 = local8.aClass29Array3[local270];
												if (var11.anInt1432 != Static7.anInt189) {
													for (local1014 = var11.anInt1437; local1014 <= var11.anInt1430; local1014++) {
														for (local629 = var11.anInt1423; local629 <= var11.anInt1431; local629++) {
															var32 = local30[local1014][local629];
															if (var32.aBoolean186) {
																local8.aBoolean188 = true;
																continue label562;
															}
															if (var32.anInt3364 != 0) {
																local639 = 0;
																if (local1014 > var11.anInt1437) {
																	local639++;
																}
																if (local1014 < var11.anInt1430) {
																	local639 += 4;
																}
																if (local629 > var11.anInt1423) {
																	local639 += 8;
																}
																if (local629 < var11.anInt1431) {
																	local639 += 2;
																}
																if ((local639 & var32.anInt3364) == local8.anInt3355) {
																	local8.aBoolean188 = true;
																	continue label562;
																}
															}
														}
													}
													Static16.aClass29Array1[var20++] = var11;
													local629 = Static36.anInt3886 - var11.anInt1437;
													local634 = var11.anInt1430 - Static36.anInt3886;
													if (local634 > local629) {
														local629 = local634;
													}
													local639 = Static201.anInt4281 - var11.anInt1423;
													var16 = var11.anInt1431 - Static201.anInt4281;
													if (var16 > local639) {
														var11.anInt1426 = local629 + var16;
													} else {
														var11.anInt1426 = local629 + local639;
													}
												}
											}
											while (var20 > 0) {
												local1129 = -50;
												local1014 = -1;
												@Pc(1138) Class29 local1138;
												for (local629 = 0; local629 < var20; local629++) {
													local1138 = Static16.aClass29Array1[local629];
													if (local1138.anInt1432 != Static7.anInt189) {
														if (local1138.anInt1426 > local1129) {
															local1129 = local1138.anInt1426;
															local1014 = local629;
														} else if (local1138.anInt1426 == local1129) {
															local639 = local1138.anInt1440 - Static201.anInt4280;
															var16 = local1138.anInt1435 - Static155.anInt3455;
															var17 = Static16.aClass29Array1[local1014].anInt1440 - Static201.anInt4280;
															var18 = Static16.aClass29Array1[local1014].anInt1435 - Static155.anInt3455;
															if (local639 * local639 + var16 * var16 > var17 * var17 + var18 * var18) {
																local1014 = local629;
															}
														}
													}
												}
												if (local1014 == -1) {
													break;
												}
												local1138 = Static16.aClass29Array1[local1014];
												local1138.anInt1432 = Static7.anInt189;
												if (!Static144.method2483(local26, local1138.anInt1437, local1138.anInt1430, local1138.anInt1423, local1138.anInt1431, local1138.aClass9_3.method2902())) {
													local1138.aClass9_3.method2903(local1138.anInt1428, Static143.anInt3207, Static39.anInt883, Static171.anInt3703, Static131.anInt2854, local1138.anInt1440 - Static201.anInt4280, local1138.anInt1429 - Static105.anInt2387, local1138.anInt1435 - Static155.anInt3455, local1138.aLong43);
												}
												for (local639 = local1138.anInt1437; local639 <= local1138.anInt1430; local639++) {
													for (var16 = local1138.anInt1423; var16 <= local1138.anInt1431; var16++) {
														@Pc(1262) Class1_Sub22 local1262 = local30[local639][var16];
														if (local1262.anInt3364 != 0) {
															Static205.aClass19_17.method620(local1262);
														} else if ((local639 != local17 || var16 != local20) && local1262.aBoolean187) {
															Static205.aClass19_17.method620(local1262);
														}
													}
												}
											}
											if (!local8.aBoolean188) {
												break;
											}
										} catch (@Pc(1300) Exception local1300) {
											local8.aBoolean188 = false;
											break;
										}
									}
								} while (!local8.aBoolean187);
							} while (local8.anInt3364 != 0);
							if (local17 > Static36.anInt3886 || local17 <= Static68.anInt1688) {
								break;
							}
							local47 = local30[local17 - 1][local20];
						} while (local47 != null && local47.aBoolean187);
						if (local17 < Static36.anInt3886 || local17 >= Static186.anInt3977 - 1) {
							break;
						}
						local47 = local30[local17 + 1][local20];
					} while (local47 != null && local47.aBoolean187);
					if (local20 > Static201.anInt4281 || local20 <= Static140.anInt3131) {
						break;
					}
					local47 = local30[local17][local20 - 1];
				} while (local47 != null && local47.aBoolean187);
				if (local20 < Static201.anInt4281 || local20 >= Static12.anInt346 - 1) {
					break;
				}
				local47 = local30[local17][local20 + 1];
			} while (local47 != null && local47.aBoolean187);
			local8.aBoolean187 = false;
			Static5.anInt113--;
			@Pc(1404) Class78 local1404 = local8.aClass78_1;
			if (local1404 != null && local1404.anInt3549 != 0) {
				if (local1404.aClass9_7 != null) {
					local1404.aClass9_7.method2903(0, Static143.anInt3207, Static39.anInt883, Static171.anInt3703, Static131.anInt2854, local1404.anInt3552 - Static201.anInt4280, local1404.anInt3545 - Static105.anInt2387 - local1404.anInt3549, local1404.anInt3550 - Static155.anInt3455, local1404.aLong118);
				}
				if (local1404.aClass9_9 != null) {
					local1404.aClass9_9.method2903(0, Static143.anInt3207, Static39.anInt883, Static171.anInt3703, Static131.anInt2854, local1404.anInt3552 - Static201.anInt4280, local1404.anInt3545 - Static105.anInt2387 - local1404.anInt3549, local1404.anInt3550 - Static155.anInt3455, local1404.aLong118);
				}
				if (local1404.aClass9_8 != null) {
					local1404.aClass9_8.method2903(0, Static143.anInt3207, Static39.anInt883, Static171.anInt3703, Static131.anInt2854, local1404.anInt3552 - Static201.anInt4280, local1404.anInt3545 - Static105.anInt2387 - local1404.anInt3549, local1404.anInt3550 - Static155.anInt3455, local1404.aLong118);
				}
			}
			if (local8.anInt3361 != 0) {
				@Pc(1499) Class106 local1499 = local8.aClass106_1;
				if (local1499 != null && !Static195.method3028(local26, local17, local20, local1499.aClass9_10.method2902())) {
					if ((local1499.anInt4529 & local8.anInt3361) != 0) {
						local1499.aClass9_10.method2903(0, Static143.anInt3207, Static39.anInt883, Static171.anInt3703, Static131.anInt2854, local1499.anInt4532 + local1499.anInt4528 - Static201.anInt4280, local1499.anInt4530 - Static105.anInt2387, local1499.anInt4525 + local1499.anInt4526 - Static155.anInt3455, local1499.aLong141);
					} else if (local1499.anInt4529 == 256) {
						local270 = local1499.anInt4532 - Static201.anInt4280;
						local1129 = local1499.anInt4530 - Static105.anInt2387;
						local1014 = local1499.anInt4525 - Static155.anInt3455;
						local629 = local1499.anInt4531;
						if (local629 == 1 || local629 == 2) {
							local634 = -local270;
						} else {
							local634 = local270;
						}
						if (local629 == 2 || local629 == 3) {
							local639 = -local1014;
						} else {
							local639 = local1014;
						}
						if (local639 >= local634) {
							local1499.aClass9_10.method2903(0, Static143.anInt3207, Static39.anInt883, Static171.anInt3703, Static131.anInt2854, local270 + local1499.anInt4528, local1129, local1014 + local1499.anInt4526, local1499.aLong141);
						} else if (local1499.aClass9_11 != null) {
							local1499.aClass9_11.method2903(0, Static143.anInt3207, Static39.anInt883, Static171.anInt3703, Static131.anInt2854, local270, local1129, local1014, local1499.aLong141);
						}
					}
				}
				local956 = local8.aClass47_1;
				if (local956 != null) {
					if ((local956.anInt1951 & local8.anInt3361) != 0 && !Static136.method2292(local26, local17, local20, local956.anInt1951)) {
						local956.aClass9_5.method2903(0, Static143.anInt3207, Static39.anInt883, Static171.anInt3703, Static131.anInt2854, local956.anInt1946 - Static201.anInt4280, local956.anInt1948 - Static105.anInt2387, local956.anInt1952 - Static155.anInt3455, local956.aLong58);
					}
					if ((local956.anInt1947 & local8.anInt3361) != 0 && !Static136.method2292(local26, local17, local20, local956.anInt1947)) {
						local956.aClass9_4.method2903(0, Static143.anInt3207, Static39.anInt883, Static171.anInt3703, Static131.anInt2854, local956.anInt1946 - Static201.anInt4280, local956.anInt1948 - Static105.anInt2387, local956.anInt1952 - Static155.anInt3455, local956.aLong58);
					}
				}
			}
			@Pc(1719) Class1_Sub22 local1719;
			if (local23 < Static55.anInt1475 - 1) {
				local1719 = Static100.aClass1_Sub22ArrayArrayArray3[local23 + 1][local17][local20];
				if (local1719 != null && local1719.aBoolean187) {
					Static205.aClass19_17.method620(local1719);
				}
			}
			if (local17 < Static36.anInt3886) {
				local1719 = local30[local17 + 1][local20];
				if (local1719 != null && local1719.aBoolean187) {
					Static205.aClass19_17.method620(local1719);
				}
			}
			if (local20 < Static201.anInt4281) {
				local1719 = local30[local17][local20 + 1];
				if (local1719 != null && local1719.aBoolean187) {
					Static205.aClass19_17.method620(local1719);
				}
			}
			if (local17 > Static36.anInt3886) {
				local1719 = local30[local17 - 1][local20];
				if (local1719 != null && local1719.aBoolean187) {
					Static205.aClass19_17.method620(local1719);
				}
			}
			if (local20 > Static201.anInt4281) {
				local1719 = local30[local17][local20 - 1];
				if (local1719 != null && local1719.aBoolean187) {
					Static205.aClass19_17.method620(local1719);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!dd;III)V")
	public static void method1208(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class1_Sub22 local12;
		if (arg2 < Static83.anInt1959) {
			local12 = Static100.aClass1_Sub22ArrayArrayArray3[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass16_1 != null && local12.aClass16_1.aClass9_2.method2896()) {
				arg0.method2900(local12.aClass16_1.aClass9_2, 128, 0, 0, true);
			}
		}
		if (arg3 < Static83.anInt1959) {
			local12 = Static100.aClass1_Sub22ArrayArrayArray3[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass16_1 != null && local12.aClass16_1.aClass9_2.method2896()) {
				arg0.method2900(local12.aClass16_1.aClass9_2, 0, 0, 128, true);
			}
		}
		if (arg2 < Static83.anInt1959 && arg3 < Static150.anInt3350) {
			local12 = Static100.aClass1_Sub22ArrayArrayArray3[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass16_1 != null && local12.aClass16_1.aClass9_2.method2896()) {
				arg0.method2900(local12.aClass16_1.aClass9_2, 128, 0, 128, true);
			}
		}
		if (arg2 < Static83.anInt1959 && arg3 > 0) {
			local12 = Static100.aClass1_Sub22ArrayArrayArray3[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass16_1 != null && local12.aClass16_1.aClass9_2.method2896()) {
				arg0.method2900(local12.aClass16_1.aClass9_2, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIILclient!ah;)V")
	public static void method1209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class6 arg3) {
		Static84.method1044();
		Static76.method1363(arg0, arg1, arg3.anInt251 + arg0, arg3.anInt221 + arg1);
		if (Static178.anInt3828 == 2 || Static178.anInt3828 == 5) {
			Static76.method1375(arg0, arg1, arg3.anIntArray35, arg3.anIntArray33);
		} else {
			@Pc(40) int local40 = Static12.anInt352 + Static31.anInt799 & 0x7FF;
			@Pc(47) int local47 = Static84.aClass9_Sub4_Sub1_2.anInt3925 / 32 + 48;
			@Pc(55) int local55 = 464 - Static84.aClass9_Sub4_Sub1_2.anInt3903 / 32;
			((Class1_Sub1_Sub6_Sub1) Static71.aClass1_Sub1_Sub6_1).method2179(arg0, arg1, arg3.anInt251, arg3.anInt221, local47, local55, local40, Static154.anInt3449 + 256, arg3.anIntArray35, arg3.anIntArray33);
			@Pc(91) int local91;
			@Pc(105) int local105;
			for (@Pc(76) int local76 = 0; local76 < Static29.anInt708; local76++) {
				local91 = Static189.anIntArray530[local76] * 4 + 2 - Static84.aClass9_Sub4_Sub1_2.anInt3925 / 32;
				local105 = Static17.anIntArray69[local76] * 4 + 2 - Static84.aClass9_Sub4_Sub1_2.anInt3903 / 32;
				@Pc(111) Class1_Sub1_Sub23 local111 = Static44.method760(Static83.anIntArray230[local76]);
				if (local111.anIntArray526 != null) {
					local111 = local111.method2938();
					if (local111 == null || local111.anInt4035 == -1) {
						continue;
					}
				}
				Static220.method3531(arg3, arg1, local105, Static111.aClass1_Sub1_Sub6Array6[local111.anInt4035], local91, arg0);
			}
			@Pc(183) int local183;
			for (local91 = 0; local91 < 104; local91++) {
				for (local105 = 0; local105 < 104; local105++) {
					@Pc(158) Class19 local158 = Static128.aClass19ArrayArrayArray1[Static180.anInt3841][local91][local105];
					if (local158 != null) {
						@Pc(171) int local171 = local91 * 4 + 2 - Static84.aClass9_Sub4_Sub1_2.anInt3925 / 32;
						local183 = local105 * 4 + 2 - Static84.aClass9_Sub4_Sub1_2.anInt3903 / 32;
						Static220.method3531(arg3, arg1, local183, Static43.aClass1_Sub1_Sub6Array1[0], local171, arg0);
					}
				}
			}
			@Pc(258) int local258;
			for (local105 = 0; local105 < Static56.anInt1482; local105++) {
				@Pc(211) Class9_Sub4_Sub2 local211 = Static1.aClass9_Sub4_Sub2Array1[Static19.anIntArray73[local105]];
				if (local211 != null && local211.method2907()) {
					@Pc(220) Class1_Sub1_Sub9 local220 = local211.aClass1_Sub1_Sub9_1;
					if (local220 != null && local220.anIntArray295 != null) {
						local220 = local220.method1739();
					}
					if (local220 != null && local220.aBoolean128 && local220.aBoolean127) {
						local183 = local211.anInt3925 / 32 - Static84.aClass9_Sub4_Sub1_2.anInt3925 / 32;
						local258 = local211.anInt3903 / 32 - Static84.aClass9_Sub4_Sub1_2.anInt3903 / 32;
						Static220.method3531(arg3, arg1, local258, Static43.aClass1_Sub1_Sub6Array1[1], local183, arg0);
					}
				}
			}
			for (@Pc(274) int local274 = 0; local274 < Static205.anInt4356; local274++) {
				@Pc(282) Class9_Sub4_Sub1 local282 = Static41.aClass9_Sub4_Sub1Array2[Static124.anIntArray353[local274]];
				if (local282 != null && local282.method2907()) {
					local183 = local282.anInt3925 / 32 - Static84.aClass9_Sub4_Sub1_2.anInt3925 / 32;
					local258 = local282.anInt3903 / 32 - Static84.aClass9_Sub4_Sub1_2.anInt3903 / 32;
					@Pc(310) boolean local310 = false;
					@Pc(315) long local315 = local282.aClass60_414.method1829();
					for (@Pc(317) int local317 = 0; local317 < Static135.anInt2930; local317++) {
						if (Static29.aLongArray1[local317] == local315 && Static90.anIntArray247[local317] != 0) {
							local310 = true;
							break;
						}
					}
					@Pc(350) boolean local350 = false;
					if (Static84.aClass9_Sub4_Sub1_2.anInt1398 != 0 && local282.anInt1398 != 0 && Static84.aClass9_Sub4_Sub1_2.anInt1398 == local282.anInt1398) {
						local350 = true;
					}
					if (local310) {
						Static220.method3531(arg3, arg1, local258, Static43.aClass1_Sub1_Sub6Array1[3], local183, arg0);
					} else if (local350) {
						Static220.method3531(arg3, arg1, local258, Static43.aClass1_Sub1_Sub6Array1[4], local183, arg0);
					} else {
						Static220.method3531(arg3, arg1, local258, Static43.aClass1_Sub1_Sub6Array1[2], local183, arg0);
					}
				}
			}
			local183 = 0;
			@Pc(416) Class94[] local416 = Static77.aClass94Array1;
			@Pc(507) int local507;
			while (local183 < local416.length) {
				@Pc(422) Class94 local422 = local416[local183];
				if (local422 != null && local422.anInt3978 != 0 && Static42.anInt910 % 20 < 10) {
					@Pc(469) int local469;
					@Pc(479) int local479;
					if (local422.anInt3978 == 1 && local422.anInt3970 >= 0 && local422.anInt3970 < Static1.aClass9_Sub4_Sub2Array1.length) {
						@Pc(456) Class9_Sub4_Sub2 local456 = Static1.aClass9_Sub4_Sub2Array1[local422.anInt3970];
						if (local456 != null) {
							local469 = local456.anInt3903 / 32 - Static84.aClass9_Sub4_Sub1_2.anInt3903 / 32;
							local479 = local456.anInt3925 / 32 - Static84.aClass9_Sub4_Sub1_2.anInt3925 / 32;
							Static15.method296(local422.anInt3972, local479, arg1, arg3, arg0, local469);
						}
					}
					if (local422.anInt3978 == 2) {
						local507 = (local422.anInt3966 - Static128.anInt2813) * 4 + 2 - Static84.aClass9_Sub4_Sub1_2.anInt3925 / 32;
						local479 = (local422.anInt3969 - Static163.anInt3587) * 4 + 2 - Static84.aClass9_Sub4_Sub1_2.anInt3903 / 32;
						Static15.method296(local422.anInt3972, local507, arg1, arg3, arg0, local479);
					}
					if (local422.anInt3978 == 10 && local422.anInt3970 >= 0 && Static41.aClass9_Sub4_Sub1Array2.length > local422.anInt3970) {
						@Pc(555) Class9_Sub4_Sub1 local555 = Static41.aClass9_Sub4_Sub1Array2[local422.anInt3970];
						if (local555 != null) {
							local479 = local555.anInt3925 / 32 - Static84.aClass9_Sub4_Sub1_2.anInt3925 / 32;
							local469 = local555.anInt3903 / 32 - Static84.aClass9_Sub4_Sub1_2.anInt3903 / 32;
							Static15.method296(local422.anInt3972, local479, arg1, arg3, arg0, local469);
						}
					}
				}
				local183++;
			}
			if (Static56.anInt1484 != 0) {
				local258 = Static56.anInt1484 * 4 + 2 - Static84.aClass9_Sub4_Sub1_2.anInt3925 / 32;
				local507 = Static170.anInt3695 * 4 + 2 - Static84.aClass9_Sub4_Sub1_2.anInt3903 / 32;
				Static220.method3531(arg3, arg1, local507, Static94.aClass1_Sub1_Sub6_2, local258, arg0);
			}
			Static76.method1367(arg3.anInt251 / 2 + arg0 - 1, arg3.anInt221 / 2 + arg1 + -1, 3, 3, 16777215);
		}
		Static47.aBooleanArray4[arg2] = true;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "([BB)[B")
	public static byte[] method1210(@OriginalArg(0) byte[] arg0) {
		@Pc(16) Class1_Sub9 local16 = new Class1_Sub9(arg0);
		@Pc(20) int local20 = local16.method895();
		@Pc(24) int local24 = local16.method915();
		if (local24 < 0 || Static155.anInt3453 != 0 && local24 > Static155.anInt3453) {
			throw new RuntimeException();
		} else if (local20 == 0) {
			@Pc(46) byte[] local46 = new byte[local24];
			local16.method919(local24, local46);
			return local46;
		} else {
			@Pc(58) int local58 = local16.method915();
			if (local58 < 0 || Static155.anInt3453 != 0 && Static155.anInt3453 < local58) {
				throw new RuntimeException();
			}
			@Pc(78) byte[] local78 = new byte[local58];
			if (local20 == 1) {
				Static58.method1083(local78, local58, arg0, local24);
			} else {
				Static37.aClass32_1.method1062(local16, local78);
			}
			return local78;
		}
	}
}

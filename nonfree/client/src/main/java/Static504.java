import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!tga", name = "c", descriptor = "I")
	public static int anInt8725;

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIIIIII[Lclient!gba;II)V")
	public static void method7175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class115[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static185.aClass66_14.ca(arg2, arg7, arg5, arg3);
		for (@Pc(17) int local17 = 0; local17 < arg6.length; local17++) {
			@Pc(23) Class115 local23 = arg6[local17];
			if (local23 != null && (arg0 == local23.anInt3441 || arg0 == -1412584499 && local23 == Static287.aClass115_12)) {
				@Pc(43) int local43;
				if (arg4 == -1) {
					Class63_Sub1.aRectangleArray4[Static433.anInt7419].setBounds(local23.anInt3456 + arg1, arg8 + local23.anInt3458, local23.anInt3474, local23.anInt3481);
					local43 = Static433.anInt7419++;
				} else {
					local43 = arg4;
				}
				local23.anInt3439 = Static237.anInt7561;
				local23.anInt3436 = local43;
				if (!Static69.method1229(local23)) {
					if (local23.anInt3509 != 0) {
						Static426.method6086(local23);
					}
					@Pc(90) int local90 = local23.anInt3456 + arg1;
					@Pc(95) int local95 = local23.anInt3458 + arg8;
					@Pc(98) int local98 = local23.anInt3511;
					if (Static126.aBoolean235 && (Static69.method1233(local23).anInt5878 != 0 || local23.anInt3519 == 0) && local98 > 127) {
						local98 = 127;
					}
					@Pc(150) int local150;
					@Pc(154) int local154;
					if (Static287.aClass115_12 == local23) {
						if (arg0 != -1412584499 && (Static457.anInt7770 == local23.anInt3437 || local23.anInt3437 == Static160.anInt3549)) {
							Static338.aClass115Array2 = arg6;
							Static468.anInt2402 = arg1;
							Static28.anInt550 = arg8;
							continue;
						}
						if (Static320.aBoolean429 && Static347.aBoolean454) {
							local150 = Static86.aClass50_1.method7100();
							local154 = Static86.aClass50_1.method7102();
							local154 -= Static563.anInt9432;
							local150 -= Static399.anInt6953;
							if (Static129.anInt2966 > local150) {
								local150 = Static129.anInt2966;
							}
							if (local23.anInt3474 + local150 > Static107.aClass115_13.anInt3474 + Static129.anInt2966) {
								local150 = Static129.anInt2966 + Static107.aClass115_13.anInt3474 - local23.anInt3474;
							}
							if (local154 < Static200.anInt4233) {
								local154 = Static200.anInt4233;
							}
							if (Static200.anInt4233 + Static107.aClass115_13.anInt3481 < local23.anInt3481 + local154) {
								local154 = Static200.anInt4233 + Static107.aClass115_13.anInt3481 - local23.anInt3481;
							}
							local90 = local150;
							local95 = local154;
						}
						if (local23.anInt3437 == Static160.anInt3549) {
							local98 = 128;
						}
					}
					@Pc(298) int local298;
					@Pc(287) int local287;
					@Pc(244) int local244;
					@Pc(250) int local250;
					if (local23.anInt3519 == 2) {
						local150 = arg2;
						local154 = arg7;
						local298 = arg5;
						local287 = arg3;
					} else {
						local244 = local90 + local23.anInt3474;
						local250 = local95 + local23.anInt3481;
						local150 = arg2 >= local90 ? arg2 : local90;
						local154 = local95 <= arg7 ? arg7 : local95;
						if (local23.anInt3519 == 9) {
							local250++;
							local244++;
						}
						local287 = local250 >= arg3 ? arg3 : local250;
						local298 = local244 >= arg5 ? arg5 : local244;
					}
					if (local298 > local150 && local287 > local154) {
						@Pc(544) int local544;
						@Pc(553) int local553;
						@Pc(654) int local654;
						@Pc(510) int local510;
						@Pc(542) int local542;
						if (local23.anInt3509 != 0) {
							if (Static413.anInt7159 == local23.anInt3509 || local23.anInt3509 == Static314.anInt9414) {
								Static557.method99(local23.anInt3474, local90, Static314.anInt9414 == local23.anInt3509, local95, local23.anInt3481);
								Static271.aBooleanArray21[local43] = true;
								Static185.aClass66_14.ca(arg2, arg7, arg5, arg3);
								continue;
							}
							if (local23.anInt3509 == Static441.anInt7529) {
								if (local23.method3150(Static185.aClass66_14) != null) {
									Static464.method6712();
									Static262.method4305(Static185.aClass66_14, local23, local90, local95);
									Static424.aBooleanArray30[local43] = true;
									Static185.aClass66_14.ca(arg2, arg7, arg5, arg3);
								}
								continue;
							}
							if (local23.anInt3509 == Static427.anInt7345) {
								if (local23.method3150(Static185.aClass66_14) != null) {
									Static576.method7841(local95, local90, local23);
									Static424.aBooleanArray30[local43] = true;
									Static185.aClass66_14.ca(arg2, arg7, arg5, arg3);
								}
								continue;
							}
							if (local23.anInt3509 == Static339.anInt5939) {
								Static203.method3603(local23.anInt3474, Static185.aClass66_14, local90, local95, Static263.anInterface3_14, local23.anInt3481);
								Static271.aBooleanArray21[local43] = true;
								Static185.aClass66_14.ca(arg2, arg7, arg5, arg3);
								continue;
							}
							if (Static390.anInt6850 == local23.anInt3509) {
								Static574.method5779(local23.anInt3481, Static185.aClass66_14, local23.anInt3474, local95, local90);
								Static271.aBooleanArray21[local43] = true;
								Static185.aClass66_14.ca(arg2, arg7, arg5, arg3);
								continue;
							}
							if (Static317.anInt5706 == local23.anInt3509) {
								if (!Static596.aBoolean689 && !Static85.aBoolean184) {
									continue;
								}
								local244 = local23.anInt3474 + local90;
								local250 = local95 + 15;
								if (Static596.aBoolean689) {
									local510 = -256;
									if (Static317.anInt5705 < 20) {
										local510 = -65536;
									}
									Static375.aClass91_7.method7456(local244, "Fps:" + Static317.anInt5705, local250, local510);
									local250 += 15;
									@Pc(532) Runtime local532 = Runtime.getRuntime();
									local542 = (int) ((local532.totalMemory() - local532.freeMemory()) / 1024L);
									local544 = -256;
									if (local542 > 65536) {
										if (Static58.aBoolean84) {
											Static330.method4949();
											for (local553 = 0; local553 < 10; local553++) {
												System.gc();
											}
											local542 = (int) ((local532.totalMemory() - local532.freeMemory()) / 1024L);
											if (local542 > 65536) {
												Static160.method3167("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
										local544 = -65536;
									}
									Static375.aClass91_7.method7456(local244, "Mem:" + local542 + "k", local250, local544);
									local250 += 15;
									Static375.aClass91_7.method7456(local244, "In:" + Static126.anInt2942 + "B/s Out:" + Static597.anInt9819 + "B/s", local250, -256);
									local250 += 15;
									local553 = Static185.aClass66_14.v() / 1024;
									Static375.aClass91_7.method7456(local244, "Offheap:" + local553 + "k", local250, local553 > 65536 ? -65536 : -256);
									local250 += 15;
									local654 = 0;
									@Pc(656) int local656 = 0;
									@Pc(658) int local658 = 0;
									for (@Pc(660) int local660 = 0; local660 < 35; local660++) {
										if (Static7.aClass235_Sub1Array1[local660] != null) {
											local654 += Static7.aClass235_Sub1Array1[local660].method5089();
											local656 += Static7.aClass235_Sub1Array1[local660].method5086();
											local658 += Static7.aClass235_Sub1Array1[local660].method5082();
										}
									}
									@Pc(702) int local702 = local658 * 100 / local654;
									@Pc(708) int local708 = local656 * 10000 / local654;
									@Pc(728) String local728 = "Cache:" + Static561.method7023(2, 0, (long) local708, true) + "% (" + local702 + "%)";
									Static334.aClass91_5.method7456(local244, local728, local250, -256);
									local250 += 12;
								}
								if (Static259.anInt5063 > 0) {
									Static334.aClass91_5.method7456(local244, "Particles: " + Static29.anInt566 + " / " + Static259.anInt5063, local250, -256);
								}
								local250 += 12;
								if (Static85.aBoolean184) {
									Static334.aClass91_5.method7456(local244, "Polys: " + Static185.aClass66_14.SA() + " Models: " + Static185.aClass66_14.aa(), local250, -256);
									local250 += 12;
									Static334.aClass91_5.method7456(local244, "Ls: " + Static146.anInt3278 + " La: " + Static584.anInt9652 + " NPC: " + Static189.anInt3964 + " Pl: " + Static223.anInt4570, local250, -256);
									local250 += 12;
									Static389.method5713();
								}
								Static271.aBooleanArray21[local43] = true;
								continue;
							}
						}
						if (local23.anInt3519 == 0) {
							if (local23.anInt3509 == Static471.anInt7940 && Static185.aClass66_14.method6852()) {
								Static185.aClass66_14.method6825(local90, local95, local23.anInt3474, local23.anInt3481);
							}
							method7175(local23.anInt3464, local90 - local23.anInt3485, local150, local287, local43, local298, arg6, local154, local95 - local23.anInt3526);
							if (local23.aClass115Array1 != null) {
								method7175(local23.anInt3464, local90 - local23.anInt3485, local150, local287, local43, local298, local23.aClass115Array1, local154, local95 - local23.anInt3526);
							}
							@Pc(887) Class4_Sub49 local887 = (Class4_Sub49) Static543.aClass183_39.method4289((long) local23.anInt3464);
							if (local887 != null) {
								Static402.method5814(local43, local887.anInt9337, local95, local298, local90, local150, local154, local287);
							}
							if (local23.anInt3509 == Static471.anInt7940 && Static185.aClass66_14.method6852()) {
								Static185.aClass66_14.method6808();
								Static309.aBoolean424 = true;
							}
							Static185.aClass66_14.ca(arg2, arg7, arg5, arg3);
						}
						if (Static231.aBooleanArray19[local43] || Static435.anInt7463 > 1) {
							if (local23.anInt3519 == 3) {
								if (local98 == 0) {
									if (local23.aBoolean275) {
										Static185.aClass66_14.C(local90, local95, local23.anInt3474, local23.anInt3481, local23.anInt3502, 0);
									} else {
										Static185.aClass66_14.method6786(local90, local95, local23.anInt3474, local23.anInt3481, local23.anInt3502, 0);
									}
								} else if (local23.aBoolean275) {
									Static185.aClass66_14.C(local90, local95, local23.anInt3474, local23.anInt3481, 255 - (local98 & 0xFF) << 24 | local23.anInt3502 & 0xFFFFFF, 1);
								} else {
									Static185.aClass66_14.method6786(local90, local95, local23.anInt3474, local23.anInt3481, local23.anInt3502 & 0xFFFFFF | 255 - (local98 & 0xFF) << 24, 1);
								}
							} else if (local23.anInt3519 == 4) {
								@Pc(1027) Class91 local1027 = local23.method3134(Static185.aClass66_14);
								if (local1027 != null) {
									local250 = local23.anInt3502;
									@Pc(1042) String local1042 = local23.aString32;
									if (local23.anInt3510 != -1) {
										@Pc(1052) Class222 local1052 = Static195.aClass99_1.method2798(local23.anInt3510);
										local1042 = local1052.aString72;
										if (local1042 == null) {
											local1042 = "null";
										}
										if ((local1052.anInt5791 == 1 || local23.anInt3487 != 1) && local23.anInt3487 != -1) {
											local1042 = "<col=ff9040>" + local1042 + "</col> x" + Static34.method7577(local23.anInt3487);
										}
									}
									if (Static74.aClass115_2 == local23) {
										local1042 = Static275.aClass198_30.method4407(Static56.anInt953);
										local250 = local23.anInt3502;
									}
									if (Static342.aBoolean447) {
										Static185.aClass66_14.Q(local90, local95, local23.anInt3474 + local90, local23.anInt3481 + local95);
									}
									local1027.method7462(local23.anInt3523, local23.anInt3474, 255 - (local98 & 0xFF) << 24 | local250, local1042, local23.anInt3505, 0, null, local23.aBoolean273 ? 255 - (local98 & 0xFF) << 24 : -1, local23.anInt3529, Static223.aClass13Array15, local95, local23.anInt3481, 0, null, local90, local23.anInt3495);
									if (Static342.aBoolean447) {
										Static185.aClass66_14.ca(arg2, arg7, arg5, arg3);
									}
								} else if (Static538.aBoolean631) {
									Static330.method4950(local23);
								}
							} else {
								@Pc(1257) int local1257;
								if (local23.anInt3519 == 5) {
									if (local23.anInt3452 < 0) {
										@Pc(1195) Class13 local1195;
										if (local23.anInt3510 == -1) {
											local1195 = local23.method3141(Static185.aClass66_14);
										} else {
											@Pc(1205) Class355 local1205 = local23.aBoolean278 ? Static129.aClass10_Sub1_Sub2_Sub2_1.aClass355_1 : null;
											local1195 = Static195.aClass99_1.method2794(local23.anInt3482, local1205, local23.anInt3525 | 0xFF000000, Static185.aClass66_14, local23.anInt3487, local23.anInt3512, local23.anInt3510);
										}
										if (local1195 != null) {
											local250 = local1195.AA();
											local510 = local1195.a();
											local1257 = (local23.anInt3502 == 0 ? 16777215 : local23.anInt3502 & 0xFFFFFF) | 255 - (local98 & 0xFF) << 24;
											if (local23.aBoolean279) {
												Static185.aClass66_14.Q(local90, local95, local23.anInt3474 + local90, local23.anInt3481 + local95);
												if (local23.anInt3449 != 0) {
													local542 = (local250 + local23.anInt3474 - 1) / local250;
													local544 = (local23.anInt3481 + local510 - 1) / local510;
													for (local553 = 0; local553 < local542; local553++) {
														for (local654 = 0; local654 < local544; local654++) {
															if (local23.anInt3502 == 0) {
																local1195.method8018((float) local250 / 2.0F + (float) (local553 * local250 + local90), (float) local510 / 2.0F + (float) (local654 * local510 + local95), 4096, local23.anInt3449);
															} else {
																local1195.method8020((float) (local553 * local250 + local90) + (float) local250 / 2.0F, (float) local510 / 2.0F + (float) (local654 * local510 + local95), 4096, local23.anInt3449, local1257);
															}
														}
													}
												} else if (local23.anInt3502 == 0 && local98 == 0) {
													local1195.method8027(local90, local95, local23.anInt3474, local23.anInt3481);
												} else {
													local1195.ba(local90, local95, local23.anInt3474, local23.anInt3481, 0, local1257, 1);
												}
												Static185.aClass66_14.ca(arg2, arg7, arg5, arg3);
											} else if (local23.anInt3502 == 0 && local98 == 0) {
												if (local23.anInt3449 != 0) {
													local1195.method8018((float) local23.anInt3474 / 2.0F + (float) local90, (float) local95 + (float) local23.anInt3481 / 2.0F, local23.anInt3474 * 4096 / local250, local23.anInt3449);
												} else if (local250 == local23.anInt3474 && local23.anInt3481 == local510) {
													local1195.method8019(local90, local95);
												} else {
													local1195.method8024(local90, local95, local23.anInt3474, local23.anInt3481);
												}
											} else if (local23.anInt3449 != 0) {
												local1195.method8020((float) local90 + (float) local23.anInt3474 / 2.0F, (float) local95 + (float) local23.anInt3481 / 2.0F, local23.anInt3474 * 4096 / local250, local23.anInt3449, local1257);
											} else if (local23.anInt3474 == local250 && local23.anInt3481 == local510) {
												local1195.I(local90, local95, 0, local1257, 1);
											} else {
												local1195.KA(local90, local95, local23.anInt3474, local23.anInt3481, 0, local1257, 1);
											}
										} else if (Static538.aBoolean631) {
											Static330.method4950(local23);
										}
									} else {
										local23.method3143(Static5.aClass60_1, Static276.aClass110_1).method5706(local90, Static185.aClass66_14, 0, local23.anInt3481, local95, local23.anInt3497 << 3, 0, local23.anInt3455 << 3, local23.anInt3474);
									}
								} else if (local23.anInt3519 == 6) {
									Static116.method2398();
									@Pc(1580) Class9 local1580 = null;
									local250 = 0;
									@Pc(1614) Class77 local1614;
									@Pc(1622) Class355 local1622;
									if (local23.anInt3510 != -1) {
										@Pc(1592) Class222 local1592 = Static195.aClass99_1.method2798(local23.anInt3510);
										if (local1592 != null) {
											local1592 = local1592.method4910(local23.anInt3487);
											local1614 = local23.anInt3494 == -1 ? null : Static168.aClass327_2.method7326(local23.anInt3494);
											local1622 = local23.aBoolean278 ? Static129.aClass10_Sub1_Sub2_Sub2_1.aClass355_1 : null;
											local1580 = local1592.method4921(local1622, Static185.aClass66_14, local23.anInt3460, 2048, local1614, 1, local23.anInt3491, local23.anInt3524);
											if (local1580 == null) {
												Static330.method4950(local23);
											} else {
												local250 = -local1580.DA() >> 1;
											}
										}
									} else if (local23.anInt3445 == 5) {
										local510 = local23.anInt3508;
										if (local510 >= 0 && local510 < 2048) {
											@Pc(1669) Class10_Sub1_Sub2_Sub2 local1669 = Static246.aClass10_Sub1_Sub2_Sub2Array1[local510];
											@Pc(1681) Class77 local1681 = local23.anInt3494 == -1 ? null : Static168.aClass327_2.method7326(local23.anInt3494);
											if (local1669 != null && (local510 == Static416.anInt7186 || Static593.method7991(local1669.aString93) == local23.anInt3454)) {
												local1580 = local1669.aClass355_1.method7924(0, Static511.aClass335_2, -1, 2048, null, Static185.aClass66_14, Static438.aClass237_2, local1681, null, Static168.aClass327_2, Static401.aClass345_2, local23.anInt3524, 0, Static195.aClass99_1, local23.anInt3491, Static251.aClass127_1, local23.anInt3460);
											}
										}
									} else if (local23.anInt3445 == 8 || local23.anInt3445 == 9) {
										@Pc(1736) Class4_Sub20 local1736 = Static17.method367(local23.anInt3508, false);
										local1614 = local23.anInt3494 == -1 ? null : Static168.aClass327_2.method7326(local23.anInt3494);
										if (local1736 != null) {
											local1622 = local23.aBoolean278 ? Static129.aClass10_Sub1_Sub2_Sub2_1.aClass355_1 : null;
											local1580 = local1736.method3073(Static185.aClass66_14, local1622, local23.anInt3454, local23.anInt3524, local23.anInt3491, local23.anInt3445 == 9, local23.anInt3460, local1614);
										}
									} else if (local23.anInt3494 == -1) {
										local1580 = local23.method3139(Static401.aClass345_2, null, Static438.aClass237_2, Static168.aClass327_2, -1, 0, Static251.aClass127_1, 2048, -1, Static511.aClass335_2, Static129.aClass10_Sub1_Sub2_Sub2_1.aClass355_1, Static185.aClass66_14, Static195.aClass99_1);
										if (local1580 == null && Static538.aBoolean631) {
											Static330.method4950(local23);
										}
									} else {
										@Pc(1821) Class77 local1821 = Static168.aClass327_2.method7326(local23.anInt3494);
										local1580 = local23.method3139(Static401.aClass345_2, local1821, Static438.aClass237_2, Static168.aClass327_2, local23.anInt3460, local23.anInt3524, Static251.aClass127_1, 2048, local23.anInt3491, Static511.aClass335_2, Static129.aClass10_Sub1_Sub2_Sub2_1.aClass355_1, Static185.aClass66_14, Static195.aClass99_1);
										if (local1580 == null && Static538.aBoolean631) {
											Static330.method4950(local23);
										}
									}
									if (local1580 != null) {
										if (local23.anInt3514 <= 0) {
											local510 = 512;
										} else {
											local510 = (local23.anInt3474 << 9) / local23.anInt3514;
										}
										if (local23.anInt3515 > 0) {
											local1257 = (local23.anInt3481 << 9) / local23.anInt3515;
										} else {
											local1257 = 512;
										}
										local542 = (local23.anInt3459 * local510 >> 9) + local23.anInt3474 / 2 + local90;
										local544 = local95 + local23.anInt3481 / 2 + (local1257 * local23.anInt3496 >> 9);
										Static488.aClass134_6.Y();
										Static185.aClass66_14.method6823(Static488.aClass134_6);
										Static185.aClass66_14.m(local542, local544, local510, local1257);
										Static185.aClass66_14.ka((float) (local23.anInt3483 << 2), local23.aBoolean280 ? (float) (local23.anInt3521 << 2) : (float) (local23.anInt3521 << 2) * 1.5F);
										if (arg0 == -1412584499 || Static309.aBoolean424) {
											Static185.aClass66_14.F();
											Static185.aClass66_14.method6795();
											Static185.aClass66_14.ca(arg2, arg7, arg5, arg3);
											Static309.aBoolean424 = false;
										}
										if (local23.aBoolean269) {
											Static185.aClass66_14.method6857(false);
										}
										local553 = Class4_Sub11.anIntArray148[local23.anInt3444 << 3] * (local23.anInt3467 << 2) >> 14;
										local654 = Class4_Sub11.anIntArray147[local23.anInt3444 << 3] * (local23.anInt3467 << 2) >> 14;
										Static186.aClass134_4.ra(-local23.anInt3472 << 3);
										Static186.aClass134_4.P(local23.anInt3492 << 3);
										Static186.aClass134_4.G(local23.anInt3476 << 2, local553 + (local23.anInt3477 << 2) + local250, (local23.anInt3477 << 2) + local654);
										Static186.aClass134_4.S(local23.anInt3444 << 3);
										local23.method3142(Static237.anInt7561, Static186.aClass134_4, Static185.aClass66_14, local1580);
										if (Static342.aBoolean447) {
											Static185.aClass66_14.Q(local90, local95, local90 + local23.anInt3474, local95 + local23.anInt3481);
										}
										if (local23.aBoolean280) {
											local1580.method4004(Static186.aClass134_4, null, local23.anInt3467 << 2);
										} else if (local23.aClass26_Sub3_1 == null) {
											local1580.method4023(Static186.aClass134_4, null, 1);
										} else {
											Static185.aClass66_14.method6807(local1580, local23.aClass26_Sub3_1.method3652(), Static186.aClass134_4, null, 1);
										}
										if (Static342.aBoolean447) {
											Static185.aClass66_14.ca(arg2, arg7, arg5, arg3);
										}
										if (local23.aBoolean269) {
											Static185.aClass66_14.method6857(true);
										}
										Static185.aClass66_14.ka(0.0F, 0.0F);
									}
								} else if (local23.anInt3519 == 9) {
									if (local23.aBoolean281) {
										local1257 = local95;
										local250 = local23.anInt3481 + local95;
										local510 = local23.anInt3474 + local90;
									} else {
										local510 = local23.anInt3474 + local90;
										local1257 = local23.anInt3481 + local95;
										local250 = local95;
									}
									if (local23.anInt3440 == 1) {
										Static185.aClass66_14.method6826(local90, local250, local510, local1257, local23.anInt3502, 0);
									} else {
										Static185.aClass66_14.method6801(local90, local250, local510, local1257, local23.anInt3502, local23.anInt3440);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IB)Lclient!ew;")
	public static Class97 method7176(@OriginalArg(0) int arg0) {
		@Pc(10) Class97 local10 = (Class97) Static373.aClass223_46.method4943((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static153.aClass31_33.method667(0, arg0);
		local10 = new Class97();
		if (local20 != null) {
			local10.method2781(arg0, new Class4_Sub9(local20));
		}
		Static373.aClass223_46.method4938((long) arg0, local10);
		return local10;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!vf", name = "v", descriptor = "I")
	public static int anInt828;

	@OriginalMember(owner = "client!vf", name = "I", descriptor = "I")
	public static int anInt841;

	@OriginalMember(owner = "client!vf", name = "J", descriptor = "I")
	public static int anInt842 = 0;

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)V")
	public static void method716() {
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			Static311.aBooleanArray24[local12] = false;
		}
		Static29.anInt555 = 0;
		Static228.anInt4270 = 1;
		Static146.anInt3024 = 0;
		Static103.anInt2203 = -1;
		Static236.anInt4437 = -1;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIB[Lclient!si;II)V")
	public static void method717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class157[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static71.aBoolean165) {
			Static93.method1772(arg2, arg5, arg7, arg1);
		} else {
			Static77.method1587(arg2, arg5, arg7, arg1);
			Static119.method2151();
		}
		for (@Pc(18) int local18 = 0; local18 < arg6.length; local18++) {
			@Pc(26) Class157 local26 = arg6[local18];
			if (local26 != null && (local26.anInt4671 == arg3 || arg3 == -1412584499 && local26 == Static64.aClass157_5)) {
				@Pc(50) int local50;
				if (arg8 == -1) {
					Static23.anIntArray54[Static37.anInt686] = local26.anInt4729 + arg4;
					Static282.anIntArray563[Static37.anInt686] = local26.anInt4715 + arg0;
					Static35.anIntArray69[Static37.anInt686] = local26.anInt4680;
					Static313.anIntArray613[Static37.anInt686] = local26.anInt4689;
					local50 = Static37.anInt686++;
				} else {
					local50 = arg8;
				}
				local26.anInt4752 = local50;
				local26.anInt4723 = Static167.anInt637;
				if (!local26.aBoolean445 || !Static42.method770(local26)) {
					if (local26.anInt4686 > 0) {
						Static3.method68(local26);
					}
					@Pc(112) int local112 = local26.anInt4729 + arg4;
					@Pc(117) int local117 = local26.anInt4715 + arg0;
					@Pc(120) int local120 = local26.anInt4713;
					if (Static26.aBoolean54 && (Static42.method777(local26).anInt1322 != 0 || local26.anInt4748 == 0) && local120 > 127) {
						local120 = 127;
					}
					@Pc(164) int local164;
					@Pc(166) int local166;
					if (Static64.aClass157_5 == local26) {
						if (arg3 != -1412584499 && !local26.aBoolean449) {
							Static205.anInt3961 = arg4;
							Static201.aClass157Array1 = arg6;
							Static178.anInt3541 = arg0;
							continue;
						}
						if (!local26.aBoolean449) {
							local120 = 128;
						}
						if (Static6.aBoolean471 && Static143.aBoolean244) {
							local164 = Static89.anInt1899;
							local166 = Static14.anInt309;
							local166 -= Static136.anInt2664;
							if (Static311.anInt5589 > local166) {
								local166 = Static311.anInt5589;
							}
							local164 -= Static203.anInt3368;
							if (local26.anInt4689 + local166 > Static311.anInt5589 - -Static252.aClass157_15.anInt4689) {
								local166 = Static252.aClass157_15.anInt4689 + Static311.anInt5589 - local26.anInt4689;
							}
							if (Static46.anInt1050 > local164) {
								local164 = Static46.anInt1050;
							}
							local117 = local166;
							if (Static252.aClass157_15.anInt4680 + Static46.anInt1050 < local164 + local26.anInt4680) {
								local164 = Static46.anInt1050 + Static252.aClass157_15.anInt4680 - local26.anInt4680;
							}
							local112 = local164;
						}
					}
					@Pc(243) int local243;
					@Pc(249) int local249;
					@Pc(284) int local284;
					@Pc(279) int local279;
					if (local26.anInt4748 == 2) {
						local243 = arg7;
						local166 = arg5;
						local164 = arg2;
						local249 = arg1;
					} else {
						local166 = local117 > arg5 ? local117 : arg5;
						local164 = local112 > arg2 ? local112 : arg2;
						local279 = local117 + local26.anInt4689;
						local284 = local26.anInt4680 + local112;
						if (local26.anInt4748 == 9) {
							local279++;
							local284++;
						}
						local243 = arg7 <= local284 ? arg7 : local284;
						local249 = arg1 > local279 ? local279 : arg1;
					}
					if (!local26.aBoolean445 || local243 > local164 && local166 < local249) {
						@Pc(451) int local451;
						@Pc(479) int local479;
						@Pc(497) int local497;
						@Pc(509) int local509;
						@Pc(539) int local539;
						@Pc(528) int local528;
						@Pc(555) int local555;
						@Pc(572) int local572;
						if (local26.anInt4686 != 0) {
							if (local26.anInt4686 == 1337 || local26.anInt4686 == 1403) {
								Static179.anInt3467 = local112;
								Static129.anInt2559 = local117;
								Static273.aClass157_18 = local26;
								Static96.method1891(local117, local26.anInt4686 == 1403, local26.anInt4680, local112, local26.anInt4689);
								Static166.aBooleanArray11[local50] = true;
								if (Static71.aBoolean165) {
									Static93.method1772(arg2, arg5, arg7, arg1);
								} else {
									Static77.method1587(arg2, arg5, arg7, arg1);
								}
								continue;
							}
							if (local26.anInt4686 == 1338) {
								if (!local26.method3974()) {
									continue;
								}
								Static21.method441(local50, local117, local112, local26);
								if (Static71.aBoolean165) {
									Static93.method1772(arg2, arg5, arg7, arg1);
								} else {
									Static77.method1587(arg2, arg5, arg7, arg1);
								}
								if (Static124.anInt597 != 0 && Static124.anInt597 != 3 || Static91.aBoolean183 || Static35.anInt659 < local164 || Static146.anInt3019 < local166 || local243 <= Static35.anInt659 || local249 <= Static146.anInt3019) {
									continue;
								}
								local279 = Static146.anInt3019 - local117;
								local284 = Static35.anInt659 - local112;
								local451 = local26.anIntArray533[local279];
								if (local284 < local451 || local284 > local26.anIntArray539[local279] + local451) {
									continue;
								}
								local479 = Static69.anInt1492 + (int) Static148.aFloat64 & 0x7FF;
								local279 -= local26.anInt4689 / 2;
								local284 -= local26.anInt4680 / 2;
								local497 = Class87.anIntArray173[local479];
								local497 = (Static289.anInt5250 + 256) * local497 >> 8;
								local509 = Class87.anIntArray177[local479];
								local509 = (Static289.anInt5250 + 256) * local509 >> 8;
								local528 = local279 * local509 - local284 * local497 >> 11;
								local539 = local279 * local497 + local509 * local284 >> 11;
								local555 = Static138.aClass11_Sub4_Sub1_3.anInt3865 + local539 - (Static138.aClass11_Sub4_Sub1_3.method3347() - 1) * 64 >> 7;
								local572 = Static138.aClass11_Sub4_Sub1_3.anInt3856 - local528 - (Static138.aClass11_Sub4_Sub1_3.method3347() + -1) * 64 >> 7;
								if (Static187.aBoolean318 && (Static96.anInt2071 & 0x40) != 0) {
									@Pc(586) Class157 local586 = Static209.method3469(Static315.anInt5631, Static75.anInt1991);
									if (local586 == null) {
										Static230.method3684();
									} else {
										Static69.method1328(" ->", local555, (short) 40, Static144.anInt2797, Static132.aString88, local572, 1L);
									}
									continue;
								}
								if (Static272.anInt5005 == 1) {
									Static69.method1328("", local555, (short) 14, -1, Static274.aString194, local572, 1L);
								}
								Static69.method1328("", local555, (short) 38, -1, Static84.aString65, local572, 1L);
								continue;
							}
							if (local26.anInt4686 == 1339) {
								if (local26.method3974()) {
									Static154.method2659(local26, local50, local117, local112);
									if (Static71.aBoolean165) {
										Static93.method1772(arg2, arg5, arg7, arg1);
									} else {
										Static77.method1587(arg2, arg5, arg7, arg1);
									}
								}
								continue;
							}
							if (local26.anInt4686 == 1400) {
								Static159.method2716(local112, local26.anInt4689, local26.anInt4680, local117);
								Static166.aBooleanArray11[local50] = true;
								Static88.aBooleanArray5[local50] = true;
								if (Static71.aBoolean165) {
									Static93.method1772(arg2, arg5, arg7, arg1);
								} else {
									Static77.method1587(arg2, arg5, arg7, arg1);
								}
								continue;
							}
							if (local26.anInt4686 == 1401) {
								Static58.method1033(local117, local26.anInt4689, local26.anInt4680, local112);
								Static166.aBooleanArray11[local50] = true;
								Static88.aBooleanArray5[local50] = true;
								if (Static71.aBoolean165) {
									Static93.method1772(arg2, arg5, arg7, arg1);
								} else {
									Static77.method1587(arg2, arg5, arg7, arg1);
								}
								continue;
							}
							if (local26.anInt4686 == 1402) {
								if (!Static71.aBoolean165) {
									Static260.method4036(local112, local117);
									Static166.aBooleanArray11[local50] = true;
									Static88.aBooleanArray5[local50] = true;
								}
								continue;
							}
							if (local26.anInt4686 == 1405) {
								if (!Static248.aBoolean415) {
									continue;
								}
								local284 = local26.anInt4680 + local112;
								local497 = 16776960;
								local279 = local117 + 15;
								Static238.aClass1_Sub5_Sub9_5.method2855("Fps:" + Static230.anInt4307, local284, local279, 16776960, -1);
								@Pc(794) Runtime local794 = Runtime.getRuntime();
								local479 = (int) ((local794.totalMemory() - local794.freeMemory()) / 1024L);
								local279 += 15;
								if (local479 > 65536) {
									local497 = 16711680;
								}
								Static238.aClass1_Sub5_Sub9_5.method2855("Mem:" + local479 + "k", local284, local279, local497, -1);
								local279 += 15;
								if (Static71.aBoolean165) {
									local509 = (Static162.anInt3244 + Static162.anInt3247 + Static162.anInt3246) / 1024;
									local497 = 16776960;
									if (local509 > 65536) {
										local497 = 16711680;
									}
									Static238.aClass1_Sub5_Sub9_5.method2855("Card:" + local509 + "k", local284, local279, local497, -1);
									local279 += 15;
								}
								local509 = 0;
								local539 = 0;
								local528 = 0;
								for (local555 = 0; local555 < 29; local555++) {
									local509 += Static129.aClass53_Sub1Array1[local555].method4001();
									local539 += Static129.aClass53_Sub1Array1[local555].method3998();
									local528 += Static129.aClass53_Sub1Array1[local555].method3997();
								}
								local555 = local528 * 100 / local509;
								local572 = local539 * 10000 / local509;
								@Pc(939) String local939 = "Cache:" + Static170.method2949((long) local572, 2, true, 0) + "% (" + local555 + "%)";
								Static170.aClass1_Sub5_Sub9_4.method2855(local939, local284, local279, 16776960, -1);
								local279 += 12;
								if (Static52.anInt1130 > 0) {
									Static170.aClass1_Sub5_Sub9_4.method2855("Particles: " + Static52.anInt1131 + " / " + Static52.anInt1130, local284, local279, 16776960, -1);
								}
								local279 += 12;
								Static166.aBooleanArray11[local50] = true;
								Static88.aBooleanArray5[local50] = true;
								continue;
							}
							if (local26.anInt4686 == 1406) {
								Static148.anInt3033 = local112;
								Static16.anInt335 = local117;
								Static87.aClass157_9 = local26;
								continue;
							}
						}
						if (!Static91.aBoolean183) {
							if (local26.anInt4748 == 0 && local26.aBoolean450 && Static35.anInt659 >= local164 && Static146.anInt3019 >= local166 && local243 > Static35.anInt659 && Static146.anInt3019 < local249 && !Static26.aBoolean54) {
								Static241.anInt4470 = 1;
								Static146.aStringArray19[0] = Static226.aString146;
								Static246.aStringArray28[0] = "";
								Static4.anIntArray16[0] = Static293.anInt5296;
								Static94.aShortArray46[0] = 1011;
							}
							if (Static35.anInt659 >= local164 && Static146.anInt3019 >= local166 && Static35.anInt659 < local243 && local249 > Static146.anInt3019) {
								Static85.method1714(Static35.anInt659 - local112, -local117 + Static146.anInt3019, local26);
							}
						}
						if (local26.anInt4748 == 0) {
							if (!local26.aBoolean445 && Static42.method770(local26) && Static271.aClass157_17 != local26) {
								continue;
							}
							if (!local26.aBoolean445) {
								if (local26.anInt4693 > local26.anInt4683 - local26.anInt4689) {
									local26.anInt4693 = local26.anInt4683 - local26.anInt4689;
								}
								if (local26.anInt4693 < 0) {
									local26.anInt4693 = 0;
								}
							}
							if (Static71.aBoolean165 && local26.anInt4686 == 1407) {
								Static152.method2656(local112, local117, local26.anInt4680, local26.anInt4689);
							}
							method717(local117 - local26.anInt4693, local249, local164, local26.anInt4672, local112 - local26.anInt4679, local166, arg6, local243, local50);
							if (local26.aClass157Array2 != null) {
								method717(local117 - local26.anInt4693, local249, local164, local26.anInt4672, local112 - local26.anInt4679, local166, local26.aClass157Array2, local243, local50);
							}
							@Pc(1197) Class1_Sub20 local1197 = (Class1_Sub20) Static224.aClass86_27.method2136((long) local26.anInt4672);
							if (local1197 != null) {
								if (local1197.anInt3421 == 0 && !Static91.aBoolean183 && local164 <= Static35.anInt659 && local166 <= Static146.anInt3019 && Static35.anInt659 < local243 && Static146.anInt3019 < local249 && !Static26.aBoolean54) {
									Static94.aShortArray46[0] = 1011;
									Static4.anIntArray16[0] = Static293.anInt5296;
									Static146.aStringArray19[0] = Static226.aString146;
									Static241.anInt4470 = 1;
									Static246.aStringArray28[0] = "";
								}
								Static129.method2270(local249, local50, local166, local243, local117, local1197.anInt3422, local112, local164);
							}
							if (Static71.aBoolean165 && local26.anInt4686 == 1407) {
								Static152.method2653();
								Static172.aBoolean293 = true;
							}
							if (Static71.aBoolean165) {
								Static93.method1772(arg2, arg5, arg7, arg1);
							} else {
								Static77.method1587(arg2, arg5, arg7, arg1);
								Static119.method2151();
							}
						}
						if (Static276.aBooleanArray22[local50] || Static18.anInt394 > 1) {
							if (local26.anInt4748 == 0 && !local26.aBoolean445 && local26.anInt4689 < local26.anInt4683) {
								Static288.method4340(local26.anInt4680 + local112, local26.anInt4693, local26.anInt4689, local26.anInt4683, local117);
							}
							if (local26.anInt4748 != 1) {
								if (local26.anInt4748 == 2) {
									local284 = 0;
									for (local279 = 0; local279 < local26.anInt4704; local279++) {
										for (local451 = 0; local451 < local26.anInt4665; local451++) {
											local479 = local451 * (local26.anInt4734 + 32) + local112;
											local497 = local279 * (local26.anInt4741 + 32) + local117;
											if (local284 < 20) {
												local497 += local26.anIntArray528[local284];
												local479 += local26.anIntArray526[local284];
											}
											if (local26.anIntArray538[local284] > 0) {
												local528 = local26.anIntArray538[local284] - 1;
												if (arg2 < local479 + 32 && arg7 > local479 && local497 + 32 > arg5 && arg1 > local497 || local26 == Static126.aClass157_7 && local284 == Static207.anInt5395) {
													@Pc(1491) Class1_Sub5_Sub6 local1491;
													if (Static101.anInt2152 == 1 && Static254.anInt4750 == local284 && Static154.anInt3091 == local26.anInt4672) {
														local1491 = Static48.method899(2, null, local26.aBoolean451, local26.anIntArray537[local284], local528, 0);
													} else {
														local1491 = Static48.method899(1, null, local26.aBoolean451, local26.anIntArray537[local284], local528, 3153952);
													}
													if (Static119.aBoolean207) {
														Static166.aBooleanArray11[local50] = true;
													}
													if (local1491 == null) {
														Static224.method3621(local26);
													} else if (local26 == Static126.aClass157_7 && Static207.anInt5395 == local284) {
														local539 = Static14.anInt309 - Static58.anInt1235;
														if (local539 < 5 && local539 > -5) {
															local539 = 0;
														}
														local509 = Static89.anInt1899 - Static89.anInt1902;
														if (local509 < 5 && local509 > -5) {
															local509 = 0;
														}
														if (Static225.anInt4216 < 5) {
															local509 = 0;
															local539 = 0;
														}
														local1491.method3201(local479 + local509, local539 + local497, 128);
														if (arg3 != -1) {
															@Pc(1609) Class157 local1609 = arg6[arg3 & 0xFFFF];
															@Pc(1613) int local1613;
															@Pc(1615) int local1615;
															if (Static71.aBoolean165) {
																local1615 = Static93.anInt1943;
																local1613 = Static93.anInt1942;
															} else {
																local1613 = Static77.anInt1709;
																local1615 = Static77.anInt1707;
															}
															@Pc(1645) int local1645;
															if (local1613 > local497 + local539 && local1609.anInt4693 > 0) {
																local1645 = (local1613 - local539 - local497) * Static38.anInt722 / 3;
																if (local1645 > Static38.anInt722 * 10) {
																	local1645 = Static38.anInt722 * 10;
																}
																if (local1609.anInt4693 < local1645) {
																	local1645 = local1609.anInt4693;
																}
																Static58.anInt1235 += local1645;
																local1609.anInt4693 -= local1645;
																Static224.method3621(local1609);
															}
															if (local1615 < local539 + local497 + 32 && local1609.anInt4693 < local1609.anInt4683 - local1609.anInt4689) {
																local1645 = (local539 + local497 + 32 - local1615) * Static38.anInt722 / 3;
																if (local1645 > Static38.anInt722 * 10) {
																	local1645 = Static38.anInt722 * 10;
																}
																if (local1609.anInt4683 - local1609.anInt4693 - local1609.anInt4689 < local1645) {
																	local1645 = local1609.anInt4683 - local1609.anInt4693 - local1609.anInt4689;
																}
																local1609.anInt4693 += local1645;
																Static58.anInt1235 -= local1645;
																Static224.method3621(local1609);
															}
														}
													} else if (Static160.aClass157_12 == local26 && local284 == Static148.anInt3028) {
														local1491.method3201(local479, local497, 128);
													} else {
														local1491.method3195(local479, local497);
													}
												}
											} else if (local26.anIntArray527 != null && local284 < 20) {
												@Pc(1410) Class1_Sub5_Sub6 local1410 = local26.method3971(local284);
												if (local1410 != null) {
													local1410.method3195(local479, local497);
												} else if (Static82.aBoolean179) {
													Static224.method3621(local26);
												}
											}
											local284++;
										}
									}
								} else if (local26.anInt4748 == 3) {
									if (Static207.method4491(local26)) {
										local284 = local26.anInt4662;
										if (local26 == Static271.aClass157_17 && local26.anInt4697 != 0) {
											local284 = local26.anInt4697;
										}
									} else {
										local284 = local26.anInt4703;
										if (Static271.aClass157_17 == local26 && local26.anInt4746 != 0) {
											local284 = local26.anInt4746;
										}
									}
									if (local120 == 0) {
										if (local26.aBoolean443) {
											if (Static71.aBoolean165) {
												Static93.method1777(local112, local117, local26.anInt4680, local26.anInt4689, local284);
											} else {
												Static77.method1596(local112, local117, local26.anInt4680, local26.anInt4689, local284);
											}
										} else if (Static71.aBoolean165) {
											Static93.method1773(local112, local117, local26.anInt4680, local26.anInt4689, local284);
										} else {
											Static77.method1580(local112, local117, local26.anInt4680, local26.anInt4689, local284);
										}
									} else if (local26.aBoolean443) {
										if (Static71.aBoolean165) {
											Static93.method1762(local112, local117, local26.anInt4680, local26.anInt4689, local284, 256 - (local120 & 0xFF));
										} else {
											Static77.method1584(local112, local117, local26.anInt4680, local26.anInt4689, local284, 256 - (local120 & 0xFF));
										}
									} else if (Static71.aBoolean165) {
										Static93.method1775(local112, local117, local26.anInt4680, local26.anInt4689, local284, 256 - (local120 & 0xFF));
									} else {
										Static77.method1600(local112, local117, local26.anInt4680, local26.anInt4689, local284, 256 - (local120 & 0xFF));
									}
								} else {
									@Pc(1932) Class1_Sub5_Sub9 local1932;
									if (local26.anInt4748 == 4) {
										local1932 = local26.method3969(Static277.aClass57Array5);
										if (local1932 != null) {
											@Pc(1947) String local1947 = local26.aString169;
											if (Static207.method4491(local26)) {
												local279 = local26.anInt4662;
												if (local26 == Static271.aClass157_17 && local26.anInt4697 != 0) {
													local279 = local26.anInt4697;
												}
												if (local26.aString174.length() > 0) {
													local1947 = local26.aString174;
												}
											} else {
												local279 = local26.anInt4703;
												if (local26 == Static271.aClass157_17 && local26.anInt4746 != 0) {
													local279 = local26.anInt4746;
												}
											}
											if (local26.aBoolean445 && local26.anInt4720 != -1) {
												@Pc(2002) Class3 local2002 = Static69.method1330(local26.anInt4720);
												local1947 = local2002.aString3;
												if (local1947 == null) {
													local1947 = "null";
												}
												if ((local2002.anInt135 == 1 || local26.anInt4735 != 1) && local26.anInt4735 != -1) {
													local1947 = "<col=ff9040>" + local1947 + "</col> x" + Static91.method1737(local26.anInt4735);
												}
											}
											if (local26 == Static26.aClass157_2) {
												local1947 = Static37.aString30;
												local279 = local26.anInt4703;
											}
											if (!local26.aBoolean445) {
												local1947 = Static121.method2201(local1947, local26);
											}
											local1932.method2852(local1947, local112, local117, local26.anInt4680, local26.anInt4689, local279, local26.aBoolean441 ? 0 : -1, local26.anInt4687, local26.anInt4677, local26.anInt4728);
										} else if (Static82.aBoolean179) {
											Static224.method3621(local26);
										}
									} else if (local26.anInt4748 == 5) {
										@Pc(2160) Class1_Sub5_Sub6 local2160;
										if (!local26.aBoolean445) {
											local2160 = local26.method3973(Static207.method4491(local26));
											if (local2160 != null) {
												local2160.method3195(local112, local117);
											} else if (Static82.aBoolean179) {
												Static224.method3621(local26);
											}
										} else if (local26.anInt4716 >= 0) {
											@Pc(2102) Class126 local2102 = local26.method3978();
											if (Static71.aBoolean165) {
												local2102.method3419(0, local112, local117, local26.anInt4680, local26.anInt4689, local26.anInt4676, local26.anInt4684, 0);
											} else {
												local2102.method3415(0, local112, local117, local26.anInt4680, local26.anInt4689, local26.anInt4676, local26.anInt4684);
											}
										} else {
											if (local26.anInt4720 == -1) {
												local2160 = local26.method3973(false);
											} else if (local26.aBoolean444 && Static138.aClass11_Sub4_Sub1_3.aClass61_2 != null) {
												local2160 = Static48.method899(local26.anInt4701, Static138.aClass11_Sub4_Sub1_3.aClass61_2, local26.aBoolean451, local26.anInt4735, local26.anInt4720, local26.anInt4675);
											} else {
												local2160 = Static48.method899(local26.anInt4701, null, local26.aBoolean451, local26.anInt4735, local26.anInt4720, local26.anInt4675);
											}
											if (local2160 != null) {
												local279 = local2160.anInt3620;
												local451 = local2160.anInt3626;
												if (local26.aBoolean440) {
													local479 = (local279 + local26.anInt4680 - 1) / local279;
													local497 = (local26.anInt4689 + local451 - 1) / local451;
													if (Static71.aBoolean165) {
														Static93.method1767(local112, local117, local26.anInt4680 + local112, local26.anInt4689 + local117);
														@Pc(2322) boolean local2322 = Static57.method1025(local2160.anInt3617);
														@Pc(2327) boolean local2327 = Static57.method1025(local2160.anInt3625);
														@Pc(2330) Class1_Sub5_Sub6_Sub2 local2330 = (Class1_Sub5_Sub6_Sub2) local2160;
														if (local2322 && local2327) {
															if (local120 == 0) {
																local2330.method3213(local112, local117, local479, local497);
															} else {
																local2330.method3212(local112, local117, 256 - (local120 & 0xFF), local479, local497);
															}
														} else if (local2322) {
															for (local555 = 0; local555 < local497; local555++) {
																if (local120 == 0) {
																	local2330.method3213(local112, local117 + local451 * local555, local479, 1);
																} else {
																	local2330.method3212(local112, local555 * local451 + local117, 256 - (local120 & 0xFF), local479, 1);
																}
															}
														} else if (local2327) {
															for (local555 = 0; local555 < local479; local555++) {
																if (local120 == 0) {
																	local2330.method3213(local112 + local279 * local555, local117, 1, local497);
																} else {
																	local2330.method3212(local279 * local555 + local112, local117, 256 - (local120 & 0xFF), 1, local497);
																}
															}
														} else {
															for (local555 = 0; local555 < local479; local555++) {
																for (local572 = 0; local572 < local497; local572++) {
																	if (local120 == 0) {
																		local2160.method3195(local279 * local555 + local112, local117 - -(local572 * local451));
																	} else {
																		local2160.method3201(local279 * local555 + local112, local117 - -(local572 * local451), 256 - (local120 & 0xFF));
																	}
																}
															}
														}
														Static93.method1772(arg2, arg5, arg7, arg1);
													} else {
														Static77.method1591(local112, local117, local112 + local26.anInt4680, local26.anInt4689 + local117);
														for (local509 = 0; local509 < local479; local509++) {
															for (local539 = 0; local539 < local497; local539++) {
																if (local26.anInt4663 != 0) {
																	local2160.method3196(local539 * local451 + local117 + local451 / 2, local26.anInt4663, local279 / 2 + local112 + local509 * local279, 4096);
																} else if (local120 == 0) {
																	local2160.method3195(local112 + local509 * local279, local451 * local539 + local117);
																} else {
																	local2160.method3201(local509 * local279 + local112, local117 + local539 * local451, 256 - (local120 & 0xFF));
																}
															}
														}
														Static77.method1587(arg2, arg5, arg7, arg1);
													}
												} else {
													local479 = local26.anInt4680 * 4096 / local279;
													if (local26.anInt4663 != 0) {
														local2160.method3196(local117 + local26.anInt4689 / 2, local26.anInt4663, local26.anInt4680 / 2 + local112, local479);
													} else if (local120 != 0) {
														local2160.method3205(local112, local117, local26.anInt4680, local26.anInt4689, 256 - (local120 & 0xFF));
													} else if (local26.anInt4680 == local279 && local451 == local26.anInt4689) {
														local2160.method3195(local112, local117);
													} else {
														local2160.method3200(local112, local117, local26.anInt4680, local26.anInt4689);
													}
												}
											} else if (Static82.aBoolean179) {
												Static224.method3621(local26);
											}
										}
									} else {
										@Pc(2822) Class3 local2822;
										if (local26.anInt4748 == 6) {
											@Pc(2655) boolean local2655 = Static207.method4491(local26);
											if (local2655) {
												local279 = local26.anInt4709;
											} else {
												local279 = local26.anInt4721;
											}
											@Pc(2667) Class11_Sub1 local2667 = null;
											local479 = 0;
											if (local26.anInt4720 != -1) {
												local2822 = Static69.method1330(local26.anInt4720);
												if (local2822 != null) {
													local2822 = local2822.method87(local26.anInt4735);
													@Pc(2841) Class152 local2841 = local279 == -1 ? null : Static107.method2016(local279);
													if (local26.aBoolean444 && Static138.aClass11_Sub4_Sub1_3.aClass61_2 != null) {
														local2667 = local2822.method82(1, local26.anInt4724, Static138.aClass11_Sub4_Sub1_3.aClass61_2, local26.anInt4732, local26.anInt4714, local2841);
													} else {
														local2667 = local2822.method82(1, local26.anInt4724, null, local26.anInt4732, local26.anInt4714, local2841);
													}
													if (local2667 == null) {
														Static224.method3621(local26);
													} else {
														local479 = -local2667.method4297() / 2;
													}
												}
											} else if (local26.anInt4669 == 5) {
												if (local26.anInt4668 == -1) {
													local2667 = Static135.aClass61_1.method1707(null, -1, -1, false, null, 0, true, 0, -1, null, -1);
												} else {
													local497 = local26.anInt4668 & 0x7FF;
													if (Static68.anInt1471 == local497) {
														local497 = 2047;
													}
													@Pc(2703) Class11_Sub4_Sub1 local2703 = Static14.aClass11_Sub4_Sub1Array1[local497];
													@Pc(2713) Class152 local2713 = local279 == -1 ? null : Static107.method2016(local279);
													if (local2703 != null && (int) Static282.method4276(local2703.aString99) << 11 == (local26.anInt4668 & 0xFFFFF800)) {
														local2667 = local2703.aClass61_2.method1707(local2713, 0, local26.anInt4714, false, null, 0, true, 0, -1, null, -1);
													}
												}
											} else if (local279 == -1) {
												local2667 = local26.method3982(0, local2655, -1, null, -1, Static138.aClass11_Sub4_Sub1_3.aClass61_2);
												if (local2667 == null && Static82.aBoolean179) {
													Static224.method3621(local26);
												}
											} else {
												@Pc(2773) Class152 local2773 = Static107.method2016(local279);
												local2667 = local26.method3982(local26.anInt4732, local2655, local26.anInt4724, local2773, local26.anInt4714, Static138.aClass11_Sub4_Sub1_3.aClass61_2);
												if (local2667 == null && Static82.aBoolean179) {
													Static224.method3621(local26);
												}
											}
											if (local2667 != null) {
												if (local26.anInt4718 <= 0) {
													local497 = 256;
												} else {
													local497 = (local26.anInt4680 << 8) / local26.anInt4718;
												}
												if (local26.anInt4747 > 0) {
													local509 = (local26.anInt4689 << 8) / local26.anInt4747;
												} else {
													local509 = 256;
												}
												local539 = local26.anInt4680 / 2 + local112 + (local497 * local26.anInt4659 >> 8);
												local528 = (local26.anInt4740 * local509 >> 8) + local117 + local26.anInt4689 / 2;
												if (Static71.aBoolean165) {
													if (local26.aBoolean446) {
														Static71.method1376(local539, local528, local26.anInt4706, local26.aShort46, local497, local509);
													} else {
														Static71.method1404(local539, local528, local497, local509);
														Static71.method1398((float) local26.aShort47, (float) local26.aShort46 * 1.5F);
													}
													Static71.method1394();
													Static71.method1413(true);
													Static71.method1414(false);
													Static9.method165(Static153.anInt2340);
													if (Static172.aBoolean293) {
														Static93.method1776();
														Static71.method1407();
														Static93.method1772(arg2, arg5, arg7, arg1);
														Static172.aBoolean293 = false;
													}
													if (local26.aBoolean436) {
														Static71.method1384();
													}
													local555 = local26.anInt4706 * Class87.anIntArray173[local26.anInt4666] >> 16;
													local572 = Class87.anIntArray177[local26.anInt4666] * local26.anInt4706 >> 16;
													if (local26.aBoolean445) {
														local2667.method2900(local26.anInt4745, local26.anInt4722, local26.anInt4666, local26.anInt4696, local26.anInt4736 + local479 + local555, local26.anInt4736 + local572, -1L);
													} else {
														local2667.method2900(local26.anInt4745, 0, local26.anInt4666, 0, local555, local572, -1L);
													}
													if (local26.aBoolean436) {
														Static71.method1395();
													}
												} else {
													Static119.method2160(local539, local528);
													local555 = Class87.anIntArray173[local26.anInt4666] * local26.anInt4706 >> 16;
													local572 = Class87.anIntArray177[local26.anInt4666] * local26.anInt4706 >> 16;
													if (!local26.aBoolean445) {
														local2667.method2900(local26.anInt4745, 0, local26.anInt4666, 0, local555, local572, -1L);
													} else if (local26.aBoolean446) {
														((Class11_Sub1_Sub2) local2667).method2928(local26.anInt4745, local26.anInt4722, local26.anInt4666, local26.anInt4696, local26.anInt4736 + local479 + local555, local572 - -local26.anInt4736, local26.anInt4706);
													} else {
														local2667.method2900(local26.anInt4745, local26.anInt4722, local26.anInt4666, local26.anInt4696, local555 + local479 + local26.anInt4736, local26.anInt4736 + local572, -1L);
													}
													Static119.method2169();
												}
											}
										} else {
											if (local26.anInt4748 == 7) {
												local1932 = local26.method3969(Static277.aClass57Array5);
												if (local1932 == null) {
													if (Static82.aBoolean179) {
														Static224.method3621(local26);
													}
													continue;
												}
												local279 = 0;
												for (local451 = 0; local451 < local26.anInt4704; local451++) {
													for (local479 = 0; local479 < local26.anInt4665; local479++) {
														if (local26.anIntArray538[local279] > 0) {
															local2822 = Static69.method1330(local26.anIntArray538[local279] - 1);
															@Pc(3259) String local3259;
															if (local2822.anInt135 != 1 && local26.anIntArray537[local279] == 1) {
																local3259 = "<col=ff9040>" + local2822.aString3 + "</col>";
															} else {
																local3259 = "<col=ff9040>" + local2822.aString3 + "</col> x" + Static91.method1737(local26.anIntArray537[local279]);
															}
															local539 = local112 + (local26.anInt4734 + 115) * local479;
															local528 = (local26.anInt4741 + 12) * local451 + local117;
															if (local26.anInt4687 == 0) {
																local1932.method2878(local3259, local539, local528, local26.anInt4703, local26.aBoolean441 ? 0 : -1);
															} else if (local26.anInt4687 == 1) {
																local1932.method2866(local3259, local539 + 57, local528, local26.anInt4703, local26.aBoolean441 ? 0 : -1);
															} else {
																local1932.method2855(local3259, local539 + 115 - 1, local528, local26.anInt4703, local26.aBoolean441 ? 0 : -1);
															}
														}
														local279++;
													}
												}
											}
											if (local26.anInt4748 == 8 && local26 == Static115.aClass157_10 && Static253.anInt4654 == Static6.anInt4958) {
												local284 = 0;
												local279 = 0;
												@Pc(3377) String local3377 = local26.aString169;
												@Pc(3379) Class1_Sub5_Sub9 local3379 = Static238.aClass1_Sub5_Sub9_5;
												local3377 = Static121.method2201(local3377, local26);
												@Pc(3400) String local3400;
												while (local3377.length() > 0) {
													local509 = local3377.indexOf("<br>");
													if (local509 == -1) {
														local3400 = local3377;
														local3377 = "";
													} else {
														local3400 = local3377.substring(0, local509);
														local3377 = local3377.substring(local509 + 4);
													}
													local539 = local3379.method2860(local3400);
													if (local284 < local539) {
														local284 = local539;
													}
													local279 += local3379.anInt3302 + 1;
												}
												local279 += 7;
												local539 = local26.anInt4689 + local117 + 5;
												if (local279 + local539 > arg1) {
													local539 = arg1 - local279;
												}
												local284 += 6;
												local509 = local112 + local26.anInt4680 - local284 - 5;
												if (local112 + 5 > local509) {
													local509 = local112 + 5;
												}
												if (arg7 < local509 + local284) {
													local509 = arg7 - local284;
												}
												if (Static71.aBoolean165) {
													Static93.method1777(local509, local539, local284, local279, 16777120);
													Static93.method1773(local509, local539, local284, local279, 0);
												} else {
													Static77.method1596(local509, local539, local284, local279, 16777120);
													Static77.method1580(local509, local539, local284, local279, 0);
												}
												local528 = local539 + local3379.anInt3302 + 2;
												local3377 = local26.aString169;
												local3377 = Static121.method2201(local3377, local26);
												while (local3377.length() > 0) {
													local555 = local3377.indexOf("<br>");
													if (local555 == -1) {
														local3400 = local3377;
														local3377 = "";
													} else {
														local3400 = local3377.substring(0, local555);
														local3377 = local3377.substring(local555 + 4);
													}
													local3379.method2878(local3400, local509 + 3, local528, 0, -1);
													local528 += local3379.anInt3302 + 1;
												}
											}
											if (local26.anInt4748 == 9) {
												if (local26.aBoolean437) {
													local451 = local26.anInt4680 + local112;
													local479 = local117;
													local279 = local26.anInt4689 + local117;
												} else {
													local279 = local117;
													local451 = local26.anInt4680 + local112;
													local479 = local26.anInt4689 + local117;
												}
												if (local26.anInt4711 == 1) {
													if (Static71.aBoolean165) {
														Static93.method1768(local112, local279, local451, local479, local26.anInt4703);
													} else {
														Static77.method1601(local112, local279, local451, local479, local26.anInt4703);
													}
												} else if (Static71.aBoolean165) {
													Static93.method1778(local112, local279, local451, local479, local26.anInt4703, local26.anInt4711);
												} else {
													Static77.method1588(local112, local279, local451, local479, local26.anInt4703, local26.anInt4711);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)V")
	public static void method719() {
		for (@Pc(18) int local18 = 0; local18 < Static1.anInt48; local18++) {
			@Pc(29) int local29 = Static288.anIntArray572[local18];
			@Pc(33) Class11_Sub4_Sub2 local33 = Static138.aClass11_Sub4_Sub2Array2[local29];
			if (local33 != null) {
				Static17.method275(local33.aClass183_1.anInt5436, local33);
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZLclient!mn;I)V")
	public static void method720(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		@Pc(9) int local9 = (int) arg1.aLong210;
		@Pc(12) int local12 = arg1.anInt3422;
		arg1.method4573();
		if (arg0) {
			Static43.method784(local12);
		}
		Static245.method3861(local12);
		@Pc(27) Class157 local27 = Static206.method3444(local9);
		if (local27 != null) {
			Static224.method3621(local27);
		}
		@Pc(39) int local39 = Static241.anInt4470;
		@Pc(41) int local41;
		for (local41 = 0; local41 < local39; local41++) {
			if (Static160.method2738(Static94.aShortArray46[local41])) {
				Static146.method2580(local41);
			}
		}
		if (Static241.anInt4470 == 1) {
			Static91.aBoolean183 = false;
			Static111.method2031(Static48.anInt1073, Static282.anInt5139, Static92.anInt1933, Static229.anInt4962);
		} else {
			Static111.method2031(Static48.anInt1073, Static282.anInt5139, Static92.anInt1933, Static229.anInt4962);
			local41 = Static19.aClass1_Sub5_Sub9_1.method2860(Static252.aString165);
			for (@Pc(84) int local84 = 0; local84 < Static241.anInt4470; local84++) {
				@Pc(97) int local97 = Static19.aClass1_Sub5_Sub9_1.method2860(Static42.method774(local84));
				if (local97 > local41) {
					local41 = local97;
				}
			}
			Static229.anInt4962 = local41 + 8;
			Static282.anInt5139 = (Static284.aBoolean486 ? 26 : 22) + Static241.anInt4470 * 15;
		}
		if (Static315.anInt5636 != -1) {
			Static262.method4043(1, Static315.anInt5636);
		}
	}
}

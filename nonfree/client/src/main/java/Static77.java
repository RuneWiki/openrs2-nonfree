import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!ep", name = "Z", descriptor = "[Lclient!ne;")
	public static Class142[] aClass142Array1;

	@OriginalMember(owner = "client!ep", name = "W", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray18 = new String[100];

	@OriginalMember(owner = "client!ep", name = "bb", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_18 = new Class103(8);

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "(I)V")
	public static void method1573() {
		Static34.aClass89_1.method5479(Static316.anInt6073, Static296.aBoolean432 ? Static68.anInt1706 + 256 : -1);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIII[Lclient!bi;IIII)V")
	public static void method1575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class26[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static128.aClass89_3.method5431(arg3, arg6, arg7, arg5);
		for (@Pc(16) int local16 = 0; local16 < arg4.length; local16++) {
			@Pc(21) Class26 local21 = arg4[local16];
			if (local21 != null && (local21.anInt530 == arg8 || arg8 == -1412584499 && Static60.aClass26_13 == local21)) {
				@Pc(61) int local61;
				if (arg2 == -1) {
					Class167.aRectangleArray2[Static43.anInt1148].setBounds(arg1 + local21.anInt540, arg0 + local21.anInt519, local21.anInt523, local21.anInt515);
					local61 = Static43.anInt1148++;
				} else {
					local61 = arg2;
				}
				local21.anInt549 = Static212.anInt4234;
				local21.anInt571 = local61;
				if (!local21.aBoolean36 || !Static45.method1031(local21)) {
					if (local21.anInt557 > 0) {
						Static212.method3772(local21);
					}
					@Pc(87) int local87 = arg1 + local21.anInt540;
					@Pc(93) int local93 = local21.anInt519 + arg0;
					@Pc(96) int local96 = local21.anInt559;
					if (Static105.aBoolean439 && (Static45.method1034(local21).anInt4221 != 0 || local21.anInt520 == 0) && local96 > 127) {
						local96 = 127;
					}
					@Pc(134) int local134;
					@Pc(136) int local136;
					if (Static60.aClass26_13 == local21) {
						if (arg8 != -1412584499 && !local21.aBoolean41) {
							Static133.anInt2886 = arg1;
							Static330.aClass26Array2 = arg4;
							Static104.anInt2480 = arg0;
							continue;
						}
						if (Static326.aBoolean455 && Static250.aBoolean359) {
							local134 = Static240.anInt6396;
							local136 = Static100.anInt2436;
							local134 -= Static168.anInt3512;
							local136 -= Static46.anInt1319;
							if (Static314.anInt6024 > local134) {
								local134 = Static314.anInt6024;
							}
							if (local21.anInt523 + local134 > Static314.anInt6024 + Static298.aClass26_28.anInt523) {
								local134 = Static314.anInt6024 + Static298.aClass26_28.anInt523 - local21.anInt523;
							}
							if (local136 < Static122.anInt2754) {
								local136 = Static122.anInt2754;
							}
							if (local136 + local21.anInt515 > Static298.aClass26_28.anInt515 + Static122.anInt2754) {
								local136 = Static122.anInt2754 + Static298.aClass26_28.anInt515 - local21.anInt515;
							}
							local87 = local134;
							local93 = local136;
						}
						if (!local21.aBoolean41) {
							local96 = 128;
						}
					}
					@Pc(265) int local265;
					@Pc(272) int local272;
					@Pc(223) int local223;
					@Pc(228) int local228;
					if (local21.anInt520 == 2) {
						local265 = arg7;
						local136 = arg6;
						local272 = arg5;
						local134 = arg3;
					} else {
						local223 = local87 + local21.anInt523;
						local228 = local93 + local21.anInt515;
						local134 = arg3 < local87 ? local87 : arg3;
						local136 = arg6 < local93 ? local93 : arg6;
						if (local21.anInt520 == 9) {
							local223++;
							local228++;
						}
						local265 = local223 < arg7 ? local223 : arg7;
						local272 = arg5 > local228 ? local228 : arg5;
					}
					if (!local21.aBoolean36 || local265 > local134 && local136 < local272) {
						@Pc(498) int local498;
						@Pc(553) int local553;
						@Pc(555) int local555;
						@Pc(557) int local557;
						@Pc(559) int local559;
						@Pc(602) int local602;
						@Pc(529) int local529;
						@Pc(500) int local500;
						if (local21.anInt557 != 0) {
							if (local21.anInt557 == 1337 || local21.anInt557 == 1403) {
								Static44.method979(local87, local21.anInt515, local93, local21.anInt523, local21.anInt557 == 1403);
								Static276.aBooleanArray27[local61] = true;
								Static128.aClass89_3.method5431(arg3, arg6, arg7, arg5);
								continue;
							}
							if (local21.anInt557 == 1338) {
								if (local21.method428(Static128.aClass89_3) != null) {
									Static263.method4429();
									Static213.method3776(local93, local21, local87, Static128.aClass89_3);
									Static339.aBooleanArray30[local61] = true;
									Static128.aClass89_3.method5431(arg3, arg6, arg7, arg5);
								}
								continue;
							}
							if (local21.anInt557 == 1339) {
								if (local21.method428(Static128.aClass89_3) != null) {
									Static231.method4056(local87, local21, local93);
									Static339.aBooleanArray30[local61] = true;
									Static128.aClass89_3.method5431(arg3, arg6, arg7, arg5);
								}
								continue;
							}
							if (local21.anInt557 == 1400) {
								Static16.method2795(local21.anInt523, local93, local21.anInt515, Static128.aClass89_3, Static203.anInterface6_4, local87);
								Static276.aBooleanArray27[local61] = true;
								Static128.aClass89_3.method5431(arg3, arg6, arg7, arg5);
								continue;
							}
							if (local21.anInt557 == 1401) {
								Static294.method5314(Static128.aClass89_3, local93, local21.anInt515, local21.anInt523, local87);
								Static276.aBooleanArray27[local61] = true;
								Static128.aClass89_3.method5431(arg3, arg6, arg7, arg5);
								continue;
							}
							if (local21.anInt557 == 1405) {
								if (!Static198.aBoolean307 && !Static227.aBoolean460) {
									continue;
								}
								local223 = local21.anInt523 + local87;
								local228 = local93 + 15;
								if (Static198.aBoolean307) {
									Static341.aClass94_32.method5678(-256, local228, local223, "Fps:" + Static5.anInt82);
									local228 += 15;
									@Pc(489) Runtime local489 = Runtime.getRuntime();
									local498 = (int) ((local489.totalMemory() - local489.freeMemory()) / 1024L);
									local500 = -256;
									if (local498 > 65536) {
										local500 = -65536;
									}
									Static341.aClass94_32.method5678(local500, local228, local223, "Mem:" + local498 + "k");
									local228 += 15;
									local529 = Static128.aClass89_3.method5423() / 1024;
									Static341.aClass94_32.method5678(local529 > 65536 ? -65536 : -256, local228, local223, "Offheap:" + local529 + "k");
									local228 += 15;
									local553 = 0;
									local555 = 0;
									local557 = 0;
									for (local559 = 0; local559 < 29; local559++) {
										local553 += Static269.aClass119_Sub1Array2[local559].method3153();
										local555 += Static269.aClass119_Sub1Array2[local559].method3147();
										local557 += Static269.aClass119_Sub1Array2[local559].method3148();
									}
									@Pc(596) int local596 = local557 * 100 / local553;
									local602 = local555 * 10000 / local553;
									@Pc(622) String local622 = "Cache:" + Static251.method5273(2, true, (long) local602, 0) + "% (" + local596 + "%)";
									Static36.aClass94_9.method5678(-256, local228, local223, local622);
									local228 += 12;
								}
								if (Static52.anInt1391 > 0) {
									Static36.aClass94_9.method5678(-256, local228, local223, "Particles: " + Static257.anInt4958 + " / " + Static52.anInt1391);
								}
								local228 += 12;
								if (Static227.aBoolean460) {
									Static36.aClass94_9.method5678(-256, local228, local223, "Polys: " + Static128.aClass89_3.method5388() + " Models: " + Static128.aClass89_3.method5466());
									local228 += 12;
									Static36.aClass94_9.method5678(-256, local228, local223, "Ls: " + Static231.anInt4608 + " La: " + Static203.anInt4016 + " NPC: " + Static210.anInt4204 + " Pl: " + Static8.anInt155);
									local228 += 12;
									Static315.method5105();
								}
								Static276.aBooleanArray27[local61] = true;
								continue;
							}
						}
						if (local21.anInt520 == 0) {
							if (!local21.aBoolean36 && Static45.method1031(local21) && Static337.aClass26_30 != local21) {
								continue;
							}
							if (!local21.aBoolean36) {
								if (local21.anInt548 - local21.anInt515 < local21.anInt499) {
									local21.anInt499 = local21.anInt548 - local21.anInt515;
								}
								if (local21.anInt499 < 0) {
									local21.anInt499 = 0;
								}
							}
							if (local21.anInt557 == 1407 && Static128.aClass89_3.method5441()) {
								Static128.aClass89_3.method5459(local87, local93, local21.anInt523, local21.anInt515);
							}
							method1575(local93 - local21.anInt499, -local21.anInt533 + local87, local61, local134, arg4, local272, local136, local265, local21.anInt492);
							if (local21.aClass26Array1 != null) {
								method1575(local93 - local21.anInt499, local87 - local21.anInt533, local61, local134, local21.aClass26Array1, local272, local136, local265, local21.anInt492);
							}
							@Pc(822) Class7_Sub17 local822 = (Class7_Sub17) Static247.aClass10_40.method163((long) local21.anInt492);
							if (local822 != null) {
								Static258.method4347(local822.anInt3252, local134, local93, local136, local61, local265, local272, local87);
							}
							if (local21.anInt557 == 1407 && Static128.aClass89_3.method5441()) {
								Static128.aClass89_3.method5432();
								Static164.aBoolean249 = true;
							}
							Static128.aClass89_3.method5431(arg3, arg6, arg7, arg5);
						}
						if (Static280.aBooleanArray21[local61] || Static144.anInt3133 > 1) {
							if (local21.anInt520 == 0 && !local21.aBoolean36 && local21.anInt515 < local21.anInt548) {
								Static74.method1481(local93, local21.anInt499, local21.anInt515, local21.anInt548, local87 + local21.anInt523);
							}
							if (local21.anInt520 != 1) {
								@Pc(906) int local906;
								if (local21.anInt520 == 2) {
									local223 = 0;
									for (local228 = 0; local228 < local21.anInt518; local228++) {
										for (local906 = 0; local906 < local21.anInt483; local906++) {
											local498 = local87 + (local21.anInt534 + 32) * local906;
											local500 = local228 * (local21.anInt491 + 32) + local93;
											if (local223 < 20) {
												local500 += local21.anIntArray60[local223];
												local498 += local21.anIntArray62[local223];
											}
											if (local21.anIntArray72[local223] > 0) {
												local555 = local21.anIntArray72[local223] - 1;
												if (arg3 < local498 + 32 && arg7 > local498 && local500 + 32 > arg6 && local500 < arg5 || local21 == Static169.aClass26_20 && local223 == Static69.anInt1714) {
													@Pc(1018) Class52 local1018;
													if (Static127.anInt2799 == 1 && local223 == Static341.anInt6489 && Static150.anInt1962 == local21.anInt492) {
														local1018 = Static51.method1098(Static128.aClass89_3, null, local21.anIntArray69[local223], 2, 0, local555, local21.anInt487);
													} else {
														local1018 = Static51.method1098(Static128.aClass89_3, null, local21.anIntArray69[local223], 1, -13623264, local555, local21.anInt487);
													}
													if (local1018 == null) {
														Static245.method4226(local21);
													} else if (Static169.aClass26_20 == local21 && local223 == Static69.anInt1714) {
														local529 = Static240.anInt6396 - Static226.anInt4551;
														local553 = Static100.anInt2436 - Static354.anInt6688;
														if (local553 < 5 && local553 > -5) {
															local553 = 0;
														}
														if (local529 < 5 && local529 > -5) {
															local529 = 0;
														}
														if (Static197.anInt3885 < 5) {
															local529 = 0;
															local553 = 0;
														}
														local1018.method4131(local498 + local529, local553 + local500, 0, -2013265920);
														if (arg8 != -1) {
															@Pc(1112) Class26 local1112 = arg4[arg8 & 0xFFFF];
															@Pc(1115) int[] local1115 = new int[4];
															Static128.aClass89_3.method5421(local1115);
															local602 = local1115[1];
															@Pc(1126) int local1126 = local1115[3];
															@Pc(1151) int local1151;
															if (local500 + local553 < local602 && local1112.anInt499 > 0) {
																local1151 = Static105.anInt6011 * (local602 - local500 - local553) / 3;
																if (Static105.anInt6011 * 10 < local1151) {
																	local1151 = Static105.anInt6011 * 10;
																}
																if (local1151 > local1112.anInt499) {
																	local1151 = local1112.anInt499;
																}
																local1112.anInt499 -= local1151;
																Static354.anInt6688 += local1151;
																Static245.method4226(local1112);
															}
															if (local500 + local553 + 32 > local1126 && local1112.anInt499 < local1112.anInt548 - local1112.anInt515) {
																local1151 = (local553 + local500 + 32 - local1126) * Static105.anInt6011 / 3;
																if (local1151 > Static105.anInt6011 * 10) {
																	local1151 = Static105.anInt6011 * 10;
																}
																if (local1112.anInt548 - local1112.anInt499 - local1112.anInt515 < local1151) {
																	local1151 = local1112.anInt548 - local1112.anInt515 - local1112.anInt499;
																}
																Static354.anInt6688 -= local1151;
																local1112.anInt499 += local1151;
																Static245.method4226(local1112);
															}
														}
													} else if (local21 == Static41.aClass26_10 && Static213.anInt4247 == local223) {
														local1018.method4131(local498, local500, 0, -2013265920);
													} else {
														local1018.method4123(local498, local500);
													}
												}
											} else if (local21.anIntArray68 != null && local223 < 20) {
												@Pc(1297) Class52 local1297 = local21.method427(Static128.aClass89_3, local223);
												if (local1297 != null) {
													local1297.method4123(local498, local500);
												} else if (Static145.aBoolean239) {
													Static245.method4226(local21);
												}
											}
											local223++;
										}
									}
								} else if (local21.anInt520 == 3) {
									if (Static75.method1496(local21)) {
										local223 = local21.anInt512;
										if (local21 == Static337.aClass26_30 && local21.anInt553 != 0) {
											local223 = local21.anInt553;
										}
									} else {
										local223 = local21.anInt527;
										if (local21 == Static337.aClass26_30 && local21.anInt500 != 0) {
											local223 = local21.anInt500;
										}
									}
									if (local96 == 0) {
										if (local21.aBoolean30) {
											Static128.aClass89_3.method5439(local87, local93, local21.anInt523, local21.anInt515, local223, 0);
										} else {
											Static128.aClass89_3.method5481(local87, local93, local21.anInt523, local21.anInt515, local223, 0);
										}
									} else if (local21.aBoolean30) {
										Static128.aClass89_3.method5439(local87, local93, local21.anInt523, local21.anInt515, local223 & 0xFFFFFF | 255 - (local96 & 0xFF) << 24, 1);
									} else {
										Static128.aClass89_3.method5481(local87, local93, local21.anInt523, local21.anInt515, 255 - (local96 & 0xFF) << 24 | local223 & 0xFFFFFF, 1);
									}
								} else {
									@Pc(1440) Class94 local1440;
									if (local21.anInt520 == 4) {
										local1440 = local21.method437(Static128.aClass89_3);
										if (local1440 != null) {
											@Pc(1451) String local1451 = local21.aString42;
											if (Static75.method1496(local21)) {
												local228 = local21.anInt512;
												if (Static337.aClass26_30 == local21 && local21.anInt553 != 0) {
													local228 = local21.anInt553;
												}
												if (local21.aString46.length() > 0) {
													local1451 = local21.aString46;
												}
											} else {
												local228 = local21.anInt527;
												if (Static337.aClass26_30 == local21 && local21.anInt500 != 0) {
													local228 = local21.anInt500;
												}
											}
											if (local21.aBoolean36 && local21.anInt526 != -1) {
												@Pc(1503) Class138 local1503 = Static17.method4472(local21.anInt526);
												local1451 = local1503.aString261;
												if (local1451 == null) {
													local1451 = "null";
												}
												if ((local1503.anInt4004 == 1 || local21.anInt510 != 1) && local21.anInt510 != -1) {
													local1451 = "<col=ff9040>" + local1451 + "</col> x" + Static42.method902(local21.anInt510);
												}
											}
											if (Static165.aClass26_19 == local21) {
												local228 = local21.anInt527;
												local1451 = Static146.aString210;
											}
											if (!local21.aBoolean36) {
												local1451 = Static17.method4456(local21, local1451);
											}
											if (Static123.aBoolean493) {
												Static128.aClass89_3.method5453(local87, local93, local87 + local21.anInt523, local93 + local21.anInt515);
											}
											local1440.method5693(0, local21.aBoolean40 ? -16777216 : -1, local87, local21.anInt547, null, local21.anInt515, local21.anInt493, 0, null, local228 | 0xFF000000, local21.anInt523, local93, Static160.aClass52Array10, local1451, local21.anInt561);
											if (Static123.aBoolean493) {
												Static128.aClass89_3.method5431(arg3, arg6, arg7, arg5);
											}
										} else if (Static145.aBoolean239) {
											Static245.method4226(local21);
										}
									} else if (local21.anInt520 == 5) {
										@Pc(1625) Class52 local1625;
										if (!local21.aBoolean36) {
											local1625 = local21.method429(Static75.method1496(local21), Static128.aClass89_3);
											if (local1625 != null) {
												local1625.method4123(local87, local93);
											} else if (Static145.aBoolean239) {
												Static245.method4226(local21);
											}
										} else if (local21.anInt496 < 0) {
											if (local21.anInt526 == -1) {
												local1625 = local21.method429(false, Static128.aClass89_3);
											} else {
												@Pc(1656) Class214 local1656 = local21.aBoolean33 ? Static252.aClass22_Sub2_Sub1_Sub1_4.aClass214_1 : null;
												local1625 = Static51.method1098(Static128.aClass89_3, local1656, local21.anInt510, local21.anInt508, local21.anInt545 | 0xFF000000, local21.anInt526, local21.anInt487);
											}
											if (local1625 != null) {
												local228 = local1625.method4141();
												local906 = local1625.method4140();
												if (local21.aBoolean29) {
													Static128.aClass89_3.method5453(local87, local93, local21.anInt523 + local87, local21.anInt515 + local93);
													if (local21.anInt574 != 0) {
														local498 = (local228 + local21.anInt523 - 1) / local228;
														local500 = (local21.anInt515 + local906 - 1) / local906;
														for (local529 = 0; local529 < local498; local529++) {
															for (local553 = 0; local553 < local500; local553++) {
																local1625.method4129((float) local228 / 2.0F + (float) (local529 * local228 + local87), (float) local906 / 2.0F + (float) (local93 - -(local553 * local906)), 4096, local21.anInt574);
															}
														}
													} else if (local96 == 0) {
														local1625.method4138(local87, local93, local21.anInt523, local21.anInt515, 0, 0);
													} else {
														local1625.method4138(local87, local93, local21.anInt523, local21.anInt515, 1, 255 - (local96 & 0xFF) << 24 | 0xFFFFFF);
													}
													Static128.aClass89_3.method5431(arg3, arg6, arg7, arg5);
												} else if (local96 != 0) {
													local498 = 255 - (local96 & 0xFF) << 24 | 0xFFFFFF;
													if (local21.anInt574 != 0) {
														local1625.method4125((float) local21.anInt523 / 2.0F + (float) local87, (float) local21.anInt515 / 2.0F + (float) local93, local21.anInt523 * 4096 / local228, local21.anInt574, local498);
													} else if (local21.anInt523 == local228 && local906 == local21.anInt515) {
														local1625.method4131(local87, local93, 1, local498);
													} else {
														local1625.method4127(local87, local93, local21.anInt523, local21.anInt515, 1, local498, 1);
													}
												} else if (local21.anInt574 != 0) {
													local1625.method4129((float) local87 + (float) local21.anInt523 / 2.0F, (float) local21.anInt515 / 2.0F + (float) local93, local21.anInt523 * 4096 / local228, local21.anInt574);
												} else if (local21.anInt523 == local228 && local906 == local21.anInt515) {
													local1625.method4123(local87, local93);
												} else {
													local1625.method4130(local87, local93, local21.anInt523, local21.anInt515);
												}
											} else if (Static145.aBoolean239) {
												Static245.method4226(local21);
											}
										} else {
											local21.method436().method1117(local21.anInt532 << 3, local93, local21.anInt515, 0, 0, local21.anInt523, local87, local21.anInt544 << 3, Static128.aClass89_3);
										}
									} else {
										@Pc(2214) Class138 local2214;
										if (local21.anInt520 == 6) {
											@Pc(1989) boolean local1989 = Static75.method1496(local21);
											if (local1989) {
												local228 = local21.anInt542;
											} else {
												local228 = local21.anInt488;
											}
											Static74.method1488();
											@Pc(2002) Class31 local2002 = null;
											local498 = 0;
											@Pc(2048) Class214 local2048;
											@Pc(2038) Class170 local2038;
											if (local21.anInt526 != -1) {
												local2214 = Static17.method4472(local21.anInt526);
												if (local2214 != null) {
													local2214 = local2214.method3593(local21.anInt510);
													local2038 = local228 == -1 ? null : Static261.method4379(local228);
													local2048 = local21.aBoolean33 ? Static252.aClass22_Sub2_Sub1_Sub1_4.aClass214_1 : null;
													local2002 = local2214.method3588(local2048, local2038, 1024, 1, local21.anInt567, Static128.aClass89_3, local21.anInt541, local21.anInt554);
													if (local2002 == null) {
														Static245.method4226(local21);
													} else {
														local498 = -local2002.method1920() / 2;
													}
												}
											} else if (local21.anInt564 == 5) {
												if (local21.anInt516 == -1) {
													local2002 = Static144.aClass214_2.method5587(null, Static128.aClass89_3, 0, -1, null, 1024, -1, 0, null, -1, -1);
												} else {
													local500 = local21.anInt516;
													@Pc(2146) Class22_Sub2_Sub1_Sub1 local2146;
													if (Static4.anInt77 == local500) {
														local2146 = Static252.aClass22_Sub2_Sub1_Sub1_4;
													} else {
														local2146 = Static157.aClass22_Sub2_Sub1_Sub1Array1[local500];
													}
													@Pc(2159) Class170 local2159 = local228 == -1 ? null : Static261.method4379(local228);
													if (local2146 != null && (local500 == 2047 || Static277.method4668(local2146.aString78) == local21.anInt511)) {
														local2002 = local2146.aClass214_1.method5587(local2159, Static128.aClass89_3, local21.anInt567, -1, null, 1024, local21.anInt554, 0, null, local21.anInt541, 0);
													}
												}
											} else if (local21.anInt564 == 8 || local21.anInt564 == 9) {
												@Pc(2029) Class7_Sub9 local2029 = Static63.method4608(local21.anInt516);
												local2038 = local228 == -1 ? null : Static261.method4379(local228);
												if (local2029 != null) {
													local2048 = local21.aBoolean33 ? Static252.aClass22_Sub2_Sub1_Sub1_4.aClass214_1 : null;
													local2002 = local2029.method1499(local21.anInt564 == 9, Static128.aClass89_3, local21.anInt554, local21.anInt567, local21.anInt511, local2048, local2038, local21.anInt541);
												}
											} else if (local228 == -1) {
												local2002 = local21.method426(1024, local1989, 0, -1, null, Static128.aClass89_3, -1, Static252.aClass22_Sub2_Sub1_Sub1_4.aClass214_1);
												if (local2002 == null && Static145.aBoolean239) {
													Static245.method4226(local21);
												}
											} else {
												@Pc(2103) Class170 local2103 = Static261.method4379(local228);
												local2002 = local21.method426(1024, local1989, local21.anInt567, local21.anInt541, local2103, Static128.aClass89_3, local21.anInt554, Static252.aClass22_Sub2_Sub1_Sub1_4.aClass214_1);
												if (local2002 == null && Static145.aBoolean239) {
													Static245.method4226(local21);
												}
											}
											if (local2002 != null) {
												if (local21.anInt563 <= 0) {
													local500 = 512;
												} else {
													local500 = (local21.anInt523 << 9) / local21.anInt563;
												}
												if (local21.anInt517 > 0) {
													local529 = (local21.anInt515 << 9) / local21.anInt517;
												} else {
													local529 = 512;
												}
												local553 = (local21.anInt502 * local500 >> 9) + local21.anInt523 / 2 + local87;
												local555 = local93 + local21.anInt515 / 2 + (local529 * local21.anInt566 >> 9);
												Static91.aClass70_12.method3705();
												Static128.aClass89_3.method5467(Static91.aClass70_12);
												local557 = local21.anInt531 * Class147.anIntArray604[local21.anInt525 << 3] >> 15;
												local559 = local21.anInt531 * Class147.anIntArray603[local21.anInt525 << 3] >> 15;
												Static128.aClass89_3.method5416(local553, local555, local500, local529);
												Static128.aClass89_3.method5463((float) local21.aShort8, local21.aBoolean31 ? (float) local21.aShort9 : (float) local21.aShort9 * 1.5F);
												if (Static164.aBoolean249) {
													Static128.aClass89_3.method5425();
													Static128.aClass89_3.method5480();
													Static128.aClass89_3.method5431(arg3, arg6, arg7, arg5);
													Static164.aBoolean249 = false;
												}
												if (local21.aBoolean43) {
													Static128.aClass89_3.method5446(false);
												}
												if (local21.aBoolean36) {
													Static65.aClass70_5.method3709(-local21.anInt482 << 3);
													Static65.aClass70_5.method3712(local21.anInt565 << 3);
													Static65.aClass70_5.method3706(local21.anInt528, local498 + local557 + local21.anInt505, local21.anInt505 + local559);
												} else {
													Static65.aClass70_5.method3711(local21.anInt565 << 3);
													Static65.aClass70_5.method3706(0, local557, local559);
												}
												Static65.aClass70_5.method3721(local21.anInt525 << 3);
												if (Static123.aBoolean493) {
													Static128.aClass89_3.method5453(local87, local93, local21.anInt523 + local87, local21.anInt515 + local93);
												}
												if (local21.aBoolean31) {
													local2002.method1939(Static65.aClass70_5, null, local21.anInt531);
												} else {
													local2002.method1928(Static65.aClass70_5, null, 1);
												}
												if (Static123.aBoolean493) {
													Static128.aClass89_3.method5431(arg3, arg6, arg7, arg5);
												}
												if (local21.aBoolean43) {
													Static128.aClass89_3.method5446(true);
												}
											}
										} else {
											if (local21.anInt520 == 7) {
												local1440 = local21.method437(Static128.aClass89_3);
												if (local1440 == null) {
													if (Static145.aBoolean239) {
														Static245.method4226(local21);
													}
													continue;
												}
												local228 = 0;
												for (local906 = 0; local906 < local21.anInt518; local906++) {
													for (local498 = 0; local498 < local21.anInt483; local498++) {
														if (local21.anIntArray72[local228] > 0) {
															local2214 = Static17.method4472(local21.anIntArray72[local228] - 1);
															@Pc(2574) String local2574;
															if (local2214.anInt4004 != 1 && local21.anIntArray69[local228] == 1) {
																local2574 = "<col=ff9040>" + local2214.aString261 + "</col>";
															} else {
																local2574 = "<col=ff9040>" + local2214.aString261 + "</col> x" + Static42.method902(local21.anIntArray69[local228]);
															}
															local553 = local498 * (local21.anInt534 + 115) + local87;
															local555 = local93 + local906 * (local21.anInt491 + 12);
															if (local21.anInt547 == 0) {
																local1440.method5689(Static160.aClass52Array10, local2574, local21.anInt527 | 0xFF000000, local555, local553, null, local21.aBoolean40 ? -16777216 : -1);
															} else if (local21.anInt547 == 1) {
																local1440.method5679(local553 + 57, local21.anInt527 | 0xFF000000, local21.aBoolean40 ? -16777216 : -1, null, Static160.aClass52Array10, local2574, local555);
															} else {
																local1440.method5694(local553 + 115 - 1, local21.aBoolean40 ? -16777216 : -1, Static160.aClass52Array10, local2574, local21.anInt527 | 0xFF000000, local555, null);
															}
														}
														local228++;
													}
												}
											}
											if (local21.anInt520 == 8 && Static58.aClass26_11 == local21 && Static299.anInt5777 == Static97.anInt2397) {
												local223 = 0;
												local228 = 0;
												@Pc(2708) Class94 local2708 = Static341.aClass94_32;
												@Pc(2711) String local2711 = local21.aString42;
												local2711 = Static17.method4456(local21, local2711);
												@Pc(2727) String local2727;
												while (local2711.length() > 0) {
													local529 = local2711.indexOf("<br>");
													if (local529 == -1) {
														local2727 = local2711;
														local2711 = "";
													} else {
														local2727 = local2711.substring(0, local529);
														local2711 = local2711.substring(local529 + 4);
													}
													local553 = Static326.aClass208_7.method5385(local2727);
													local228 += Static326.aClass208_7.anInt6377 + 1;
													if (local553 > local223) {
														local223 = local553;
													}
												}
												local223 += 6;
												local228 += 7;
												local529 = local87 + local21.anInt523 - local223 - 5;
												if (local87 + 5 > local529) {
													local529 = local87 + 5;
												}
												local553 = local93 + local21.anInt515 + 5;
												if (local223 + local529 > arg7) {
													local529 = arg7 - local223;
												}
												if (local228 + local553 > arg5) {
													local553 = arg5 - local228;
												}
												Static128.aClass89_3.method5439(local529, local553, local223, local228, -96, 0);
												Static128.aClass89_3.method5481(local529, local553, local223, local228, -16777216, 0);
												local2711 = local21.aString42;
												local555 = local553 + Static326.aClass208_7.anInt6377 + 2;
												local2711 = Static17.method4456(local21, local2711);
												while (local2711.length() > 0) {
													local557 = local2711.indexOf("<br>");
													if (local557 == -1) {
														local2727 = local2711;
														local2711 = "";
													} else {
														local2727 = local2711.substring(0, local557);
														local2711 = local2711.substring(local557 + 4);
													}
													local2708.method5692(local529 + 3, -16777216, local2727, local555, -1);
													local555 += Static326.aClass208_7.anInt6377 + 1;
												}
											}
											if (local21.anInt520 == 9) {
												if (local21.aBoolean34) {
													local498 = local93;
													local906 = local21.anInt523 + local87;
													local228 = local21.anInt515 + local93;
												} else {
													local906 = local21.anInt523 + local87;
													local498 = local21.anInt515 + local93;
													local228 = local93;
												}
												if (local21.anInt486 == 1) {
													Static128.aClass89_3.method5469(local87, local228, local906, local498, local21.anInt527, 0);
												} else {
													Static128.aClass89_3.method5414(local87, local228, local906, local498, local21.anInt527, local21.anInt486);
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

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IZI)I")
	public static int method1576(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >>> 24;
		@Pc(25) int local25 = (local7 * (arg1 & 0xFF00FF) & 0xFF00FF00 | local7 * (arg1 & 0xFF00) & 0xFF0000) >>> 8;
		@Pc(44) int local44 = 255 - local7;
		return local25 + ((local44 * (arg0 & 0xFF00) & 0xFF0000 | local44 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8);
	}
}

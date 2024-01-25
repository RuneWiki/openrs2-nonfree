import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(IZIIIIIIII[Lclient!or;)V")
	public static void method3545(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class260[] arg9) {
		Static674.aClass13_22.KA(arg3, arg2, arg4, arg0);
		for (@Pc(13) int local13 = 0; local13 < arg9.length; local13++) {
			@Pc(19) Class260 local19 = arg9[local13];
			if (local19 != null && (local19.anInt6993 == arg5 || arg5 == -1412584499 && local19 == Static678.aClass260_21)) {
				@Pc(44) int local44 = arg7 + local19.anInt6942;
				@Pc(49) int local49 = arg6 + local19.anInt6950;
				@Pc(56) int local56 = local19.anInt6963 + local44 + 1;
				@Pc(63) int local63 = local19.anInt6971 + local49 + 1;
				@Pc(69) int local69;
				if (arg8 == -1) {
					Class21.aRectangleArray9[Static329.anInt5472].setBounds(arg7 + local19.anInt6942, local19.anInt6950 + arg6, local19.anInt6963, local19.anInt6971);
					local69 = Static329.anInt5472++;
				} else {
					local69 = arg8;
				}
				local19.anInt6995 = Static588.anInt9467;
				local19.anInt7001 = local69;
				if (!Static79.method1512(local19)) {
					if (local19.anInt6958 != 0) {
						Static569.method8047(local19);
					}
					@Pc(113) int local113 = arg7 + local19.anInt6942;
					@Pc(118) int local118 = local19.anInt6950 + arg6;
					@Pc(120) int local120 = 0;
					@Pc(122) int local122 = 0;
					if (Static82.aBoolean134) {
						local120 = Static31.method748();
						local122 = Static147.method2738();
					}
					@Pc(133) int local133 = local19.anInt7022;
					if (Static561.aBoolean714 && (Static79.method1526(local19).anInt8078 != 0 || local19.anInt7003 == 0) && local133 > 127) {
						local133 = 127;
					}
					@Pc(194) int local194;
					@Pc(200) int local200;
					if (local19 == Static678.aClass260_21) {
						if (arg5 != -1412584499 && (Static177.anInt3510 == local19.anInt6937 || local19.anInt6937 == Static473.anInt7805)) {
							Static330.anInt5485 = arg7;
							Static74.aClass260Array1 = arg9;
							Static75.anInt1402 = arg6;
							continue;
						}
						if (Static285.aBoolean751 && Static196.aBoolean288) {
							local194 = local120 + Static22.aClass16_2.method5885();
							local200 = Static22.aClass16_2.method5887() + local122;
							local194 -= Static583.anInt9381;
							local200 -= Static196.anInt3897;
							if (Static468.anInt7689 > local194) {
								local194 = Static468.anInt7689;
							}
							if (Static416.aClass260_13.anInt6963 + Static468.anInt7689 < local19.anInt6963 + local194) {
								local194 = Static416.aClass260_13.anInt6963 + Static468.anInt7689 - local19.anInt6963;
							}
							if (Static35.anInt811 > local200) {
								local200 = Static35.anInt811;
							}
							local113 = local194;
							if (local19.anInt6971 + local200 > Static416.aClass260_13.anInt6971 + Static35.anInt811) {
								local200 = Static35.anInt811 + Static416.aClass260_13.anInt6971 - local19.anInt6971;
							}
							local118 = local200;
						}
						if (local19.anInt6937 == Static473.anInt7805) {
							local133 = 128;
						}
					}
					@Pc(336) int local336;
					@Pc(325) int local325;
					@Pc(283) int local283;
					@Pc(288) int local288;
					if (local19.anInt7003 == 2) {
						local200 = arg2;
						local336 = arg4;
						local325 = arg0;
						local194 = arg3;
					} else {
						local283 = local19.anInt6963 + local113;
						local288 = local19.anInt6971 + local118;
						local200 = local118 <= arg2 ? arg2 : local118;
						if (local19.anInt7003 == 9) {
							local288++;
							local283++;
						}
						local194 = local113 > arg3 ? local113 : arg3;
						local325 = local288 >= arg0 ? arg0 : local288;
						local336 = arg4 <= local283 ? arg4 : local283;
					}
					if (local336 > local194 && local200 < local325) {
						@Pc(637) int local637;
						@Pc(681) int local681;
						@Pc(778) int local778;
						@Pc(780) int local780;
						@Pc(668) int local668;
						@Pc(670) int local670;
						if (local19.anInt6958 != 0) {
							if (local19.anInt6958 == Static502.anInt4118 || Static521.anInt7906 == local19.anInt6958) {
								Static655.method9119(local113, local118, local19);
								if (!Static82.aBoolean134) {
									Static43.method1108(local113, local19.anInt6958 == Static521.anInt7906, local118, local19.anInt6963, local19.anInt6971);
									Static674.aClass13_22.KA(arg3, arg2, arg4, arg0);
								}
								Static200.aBooleanArray21[local69] = true;
								continue;
							}
							if (local19.anInt6958 == Static616.anInt9887) {
								if (local19.method6245(Static674.aClass13_22) != null) {
									Static72.method1380();
									Static519.method7299(Static674.aClass13_22, local113, local19, local118);
									Static454.aBooleanArray31[local69] = true;
									Static674.aClass13_22.KA(arg3, arg2, arg4, arg0);
									if (Static82.aBoolean134) {
										if (arg1) {
											Static642.method8919(local56, local63, local49, local44);
										} else {
											Static166.method3024(local44, local56, local63, local49);
										}
									}
								}
								continue;
							}
							if (Static82.anInt1629 == local19.anInt6958) {
								Static1.method5538(local19, Static674.aClass13_22, local118, local113);
								continue;
							}
							if (Static285.anInt9769 == local19.anInt6958) {
								Static191.method3507(local113, Static674.aClass13_22, local19.anInt6967 % 64, local19, local118);
								continue;
							}
							if (Static423.anInt6754 == local19.anInt6958) {
								if (local19.method6245(Static674.aClass13_22) != null) {
									Static147.method2737(local113, local19, local118);
									Static454.aBooleanArray31[local69] = true;
									Static674.aClass13_22.KA(arg3, arg2, arg4, arg0);
									if (Static82.aBoolean134) {
										if (arg1) {
											Static642.method8919(local56, local63, local49, local44);
										} else {
											Static166.method3024(local44, local56, local63, local49);
										}
									}
								}
								continue;
							}
							if (Static51.anInt1087 == local19.anInt6958) {
								Static124.method2348(Static35.anInterface4_3, local113, local19.anInt6971, Static674.aClass13_22, local19.anInt6963, local118);
								Static200.aBooleanArray21[local69] = true;
								Static674.aClass13_22.KA(arg3, arg2, arg4, arg0);
								continue;
							}
							if (Static204.anInt3995 == local19.anInt6958) {
								Static43.method1105(local118, Static674.aClass13_22, local113, local19.anInt6963, local19.anInt6971);
								Static200.aBooleanArray21[local69] = true;
								Static674.aClass13_22.KA(arg3, arg2, arg4, arg0);
								continue;
							}
							if (Static542.anInt8923 == local19.anInt6958) {
								if (!Static261.aBoolean343 && !Static99.aBoolean771) {
									continue;
								}
								local283 = local113 + local19.anInt6963;
								if (Static82.aBoolean134) {
									if (arg1) {
										Static642.method8919(local56, local63, local49, local44);
									} else {
										Static166.method3024(local44, local56, local63, local49);
									}
								}
								local288 = local118 + 15;
								if (Static261.aBoolean343) {
									local637 = -256;
									if (Static403.anInt6411 < 20) {
										local637 = -65536;
									}
									Static504.aClass69_11.method8847(local637, "Fps:" + Static403.anInt6411, -1, local283, local288);
									local288 += 15;
									@Pc(659) Runtime local659 = Runtime.getRuntime();
									local668 = (int) ((local659.totalMemory() - local659.freeMemory()) / 1024L);
									local670 = -256;
									if (local668 > 98304) {
										if (Static651.aBoolean779) {
											Static181.method3234();
											for (local681 = 0; local681 < 10; local681++) {
												System.gc();
											}
											local668 = (int) ((local659.totalMemory() - local659.freeMemory()) / 1024L);
											if (local668 > 65536) {
												Static381.method5445("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
										local670 = -65536;
									}
									Static504.aClass69_11.method8847(local670, "Mem:" + local668 + "k", -1, local283, local288);
									local288 += 15;
									Static504.aClass69_11.method8847(-256, "In:" + Static285.anInt9771 + "B/s Out:" + Static616.anInt9884 + "B/s", -1, local283, local288);
									local288 += 15;
									local681 = Static674.aClass13_22.E() / 1024;
									Static504.aClass69_11.method8847(local681 > 65536 ? -65536 : -256, "Offheap:" + local681 + "k", -1, local283, local288);
									local288 += 15;
									local778 = 0;
									local780 = 0;
									@Pc(782) int local782 = 0;
									for (@Pc(784) int local784 = 0; local784 < 37; local784++) {
										if (Static445.aClass227_Sub1Array2[local784] != null) {
											local778 += Static445.aClass227_Sub1Array2[local784].method8079();
											local780 += Static445.aClass227_Sub1Array2[local784].method8075();
											local782 += Static445.aClass227_Sub1Array2[local784].method8076();
										}
									}
									@Pc(830) int local830 = local782 * 100 / local778;
									@Pc(836) int local836 = local780 * 10000 / local778;
									@Pc(856) String local856 = "Cache:" + Static530.method7668(true, (long) local836, 0, 2) + "% (" + local830 + "%)";
									Static400.aClass69_9.method8847(-256, local856, -1, local283, local288);
									local288 += 12;
								}
								if (Static71.anInt1337 > 0) {
									Static400.aClass69_9.method8847(-256, "Particles: " + Static646.anInt10250 + " / " + Static71.anInt1337, -1, local283, local288);
								}
								local288 += 12;
								if (Static99.aBoolean771) {
									Static400.aClass69_9.method8847(-256, "Polys: " + Static674.aClass13_22.I() + " Models: " + Static674.aClass13_22.M(), -1, local283, local288);
									local288 += 12;
									Static400.aClass69_9.method8847(-256, "Ls: " + Static234.anInt4329 + " La: " + Static549.anInt8993 + " NPC: " + Static414.anInt6611 + " Pl: " + Static184.anInt3730, -1, local283, local288);
									Static420.method7788();
									local288 += 12;
								}
								Static200.aBooleanArray21[local69] = true;
								continue;
							}
						}
						@Pc(1023) Class3_Sub46 local1023;
						if (local19.anInt7003 == 0) {
							if (local19.anInt6958 == Static149.anInt2986 && Static674.aClass13_22.method8451()) {
								Static674.aClass13_22.method8494(local113, local118, local19.anInt6963, local19.anInt6971);
							}
							method3545(local325, arg1, local200, local194, local336, local19.anInt6930, local118 - local19.anInt6946, local113 + -local19.anInt7013, local69, arg9);
							if (local19.aClass260Array2 != null) {
								method3545(local325, arg1, local200, local194, local336, local19.anInt6930, local118 - local19.anInt6946, local113 - local19.anInt7013, local69, local19.aClass260Array2);
							}
							local1023 = (Class3_Sub46) Static455.aClass83_31.method2368((long) local19.anInt6930);
							if (local1023 != null) {
								Static153.method2800(local325, local194, local336, local69, local1023.anInt7855, local113, local200, local118);
							}
							if (Static149.anInt2986 == local19.anInt6958 && Static674.aClass13_22.method8451()) {
								Static674.aClass13_22.method8530();
							}
							Static674.aClass13_22.KA(arg3, arg2, arg4, arg0);
						}
						if (Static157.aBooleanArray15[local69] || Static649.anInt10340 > 1) {
							if (local19.anInt7003 == 3) {
								if (local133 == 0) {
									if (local19.aBoolean503) {
										Static674.aClass13_22.aa(local113, local118, local19.anInt6963, local19.anInt6971, local19.anInt6967, 0);
									} else {
										Static674.aClass13_22.method8511(local113, local118, local19.anInt6963, local19.anInt6971, local19.anInt6967, 0);
									}
								} else if (local19.aBoolean503) {
									Static674.aClass13_22.aa(local113, local118, local19.anInt6963, local19.anInt6971, local19.anInt6967 & 0xFFFFFF | 255 - (local133 & 0xFF) << 24, 1);
								} else {
									Static674.aClass13_22.method8511(local113, local118, local19.anInt6963, local19.anInt6971, 255 - (local133 & 0xFF) << 24 | local19.anInt6967 & 0xFFFFFF, 1);
								}
								if (Static82.aBoolean134) {
									if (arg1) {
										Static642.method8919(local56, local63, local49, local44);
									} else {
										Static166.method3024(local44, local56, local63, local49);
									}
								}
							} else {
								@Pc(1202) Class374 local1202;
								if (local19.anInt7003 == 4) {
									@Pc(1177) Class69 local1177 = local19.method6253(Static674.aClass13_22);
									if (local1177 != null) {
										local288 = local19.anInt6967;
										@Pc(1192) String local1192 = local19.aString74;
										if (local19.anInt6964 != -1) {
											local1202 = Static170.aClass370_1.method8900(local19.anInt6964);
											local1192 = local1202.aString121;
											if (local1192 == null) {
												local1192 = "null";
											}
											if ((local1202.anInt10300 == 1 || local19.anInt6996 != 1) && local19.anInt6996 != -1) {
												local1192 = "<col=ff9040>" + local1192 + "</col> x" + Static14.method196(local19.anInt6996);
											}
										}
										if (local19.anInt6941 != -1) {
											local1192 = Static261.method4270(local19.anInt6941);
											if (local1192 == null) {
												local1192 = "";
											}
										}
										if (local19 == Static95.aClass260_7) {
											local1192 = Static601.aClass346_33.method8440(Static609.anInt9834);
											local288 = local19.anInt6967;
										}
										if (Static469.aBoolean574) {
											Static674.aClass13_22.T(local113, local118, local19.anInt6963 + local113, local19.anInt6971 + local118);
										}
										local1177.method8861(local118, local19.anInt7002, local19.anInt6966, local19.anInt6987, local19.anInt6963, local113, local19.aBoolean496 ? 255 - (local133 & 0xFF) << 24 : -1, local19.anInt6953, local1192, (Class1) null, local288 | 255 - (local133 & 0xFF) << 24, Static52.aClass33Array6, 0, 0, (int[]) null, local19.anInt6971);
										if (Static469.aBoolean574) {
											Static674.aClass13_22.KA(arg3, arg2, arg4, arg0);
										}
										if (local1192.trim().length() > 0) {
											if (!Static469.aBoolean574) {
												@Pc(1366) Class88 local1366 = Static521.method6955(local19.anInt6976, Static674.aClass13_22);
												local668 = local1366.method2507(local1192, local19.anInt6963, Static52.aClass33Array6);
												local670 = local1366.method2510(local19.anInt6963, local1192, Static52.aClass33Array6, local19.anInt6987);
												if (Static82.aBoolean134) {
													if (arg1) {
														Static642.method8919(local113 + local668, local670 + local118, local118, local113);
													} else {
														Static166.method3024(local113, local113 + local668, local118 - -local670, local118);
													}
												}
											} else if (Static82.aBoolean134) {
												if (arg1) {
													Static642.method8919(local56, local63, local49, local44);
												} else {
													Static166.method3024(local44, local56, local63, local49);
												}
											}
										}
									} else if (Static424.aBoolean484) {
										Static456.method8151(local19);
									}
								} else {
									@Pc(1505) int local1505;
									if (local19.anInt7003 == 5) {
										if (local19.anInt6990 < 0) {
											@Pc(1435) Class33 local1435;
											if (local19.anInt6964 != -1) {
												@Pc(1453) Class30 local1453 = local19.aBoolean498 ? Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aClass30_1 : null;
												local1435 = Static170.aClass370_1.method8907(local19.anInt6955, local19.anInt6938, local1453, local19.anInt6936 | 0xFF000000, local19.anInt6996, Static674.aClass13_22, local19.anInt6964);
											} else if (local19.anInt6941 == -1) {
												local1435 = local19.method6258(Static674.aClass13_22);
											} else {
												local1435 = method3546(local19.anInt6941, Static674.aClass13_22);
											}
											if (local1435 != null) {
												local288 = local1435.method7645();
												local637 = local1435.method7658();
												local1505 = (local19.anInt6967 == 0 ? 16777215 : local19.anInt6967 & 0xFFFFFF) | 255 - (local133 & 0xFF) << 24;
												if (local19.aBoolean499) {
													Static674.aClass13_22.T(local113, local118, local19.anInt6963 + local113, local19.anInt6971 + local118);
													if (local19.anInt6952 != 0) {
														local668 = (local19.anInt6963 + local288 - 1) / local288;
														local670 = (local637 + local19.anInt6971 - 1) / local637;
														for (local681 = 0; local681 < local668; local681++) {
															for (local778 = 0; local778 < local670; local778++) {
																if (local19.anInt6967 == 0) {
																	local1435.method7661((float) (local288 * local681 + local113) + (float) local288 / 2.0F, (float) (local778 * local637 + local118) + (float) local637 / 2.0F, 4096, local19.anInt6952);
																} else {
																	local1435.method7646((float) local288 / 2.0F + (float) (local681 * local288 + local113), (float) local637 / 2.0F + (float) (local637 * local778 + local118), 4096, local19.anInt6952, local1505);
																}
															}
														}
													} else if (local19.anInt6967 == 0 && local133 == 0) {
														local1435.method7663(local113, local118, local19.anInt6963, local19.anInt6971);
													} else {
														local1435.method7642(local113, local118, local19.anInt6963, local19.anInt6971, 0, local1505, 1);
													}
													Static674.aClass13_22.KA(arg3, arg2, arg4, arg0);
												} else if (local19.anInt6967 == 0 && local133 == 0) {
													if (local19.anInt6952 != 0) {
														local1435.method7661((float) local113 + (float) local19.anInt6963 / 2.0F, (float) local118 + (float) local19.anInt6971 / 2.0F, local19.anInt6963 * 4096 / local288, local19.anInt6952);
													} else if (local19.anInt6963 == local288 && local19.anInt6971 == local637) {
														local1435.method7654(local113, local118);
													} else {
														local1435.method7651(local113, local118, local19.anInt6963, local19.anInt6971);
													}
												} else if (local19.anInt6952 != 0) {
													local1435.method7646((float) local19.anInt6963 / 2.0F + (float) local113, (float) local118 + (float) local19.anInt6971 / 2.0F, local19.anInt6963 * 4096 / local288, local19.anInt6952, local1505);
												} else if (local288 == local19.anInt6963 && local19.anInt6971 == local637) {
													local1435.method7644(local113, local118, 0, local1505, 1);
												} else {
													local1435.method7656(local113, local118, local19.anInt6963, local19.anInt6971, 0, local1505, 1);
												}
											} else if (Static424.aBoolean484) {
												Static456.method8151(local19);
											}
										} else {
											local19.method6261(Static559.aClass340_1, Static38.aClass75_1).method5248(local19.anInt6962 << 3, Static674.aClass13_22, 0, local113, local19.anInt6948 << 3, local19.anInt6963, local118, local19.anInt6971, 0);
										}
										if (Static82.aBoolean134) {
											if (arg1) {
												Static642.method8919(local56, local63, local49, local44);
											} else {
												Static166.method3024(local44, local56, local63, local49);
											}
										}
									} else if (local19.anInt7003 == 6) {
										Static368.method5382();
										local1023 = null;
										@Pc(1850) Class95 local1850 = null;
										local637 = 0;
										@Pc(1884) Class372 local1884;
										@Pc(1892) Class30 local1892;
										if (local19.anInt6964 != -1) {
											local1202 = Static170.aClass370_1.method8900(local19.anInt6964);
											if (local1202 != null) {
												local1202 = local1202.method8999(local19.anInt6996);
												local1884 = local19.anInt6927 == -1 ? null : Static243.aClass343_3.method8356(local19.anInt6927);
												local1892 = local19.aBoolean498 ? Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aClass30_1 : null;
												local1850 = local1202.method9001(2048, local19.anInt6982, local1884, local19.anInt6988, local19.anInt6954, Static674.aClass13_22, local1892, 1);
												if (local1850 == null) {
													Static456.method8151(local19);
												} else {
													local637 = -local1850.fa() >> 1;
												}
											}
										} else if (local19.anInt6935 == 5) {
											local1505 = local19.anInt7000;
											if (local1505 >= 0 && local1505 < 2048) {
												@Pc(2076) Class28_Sub1_Sub1_Sub1_Sub1 local2076 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local1505];
												@Pc(2091) Class372 local2091 = local19.anInt6927 == -1 ? null : Static243.aClass343_3.method8356(local19.anInt6927);
												if (local2076 != null && (Static106.anInt2205 == local1505 || Static624.method7815(local2076.aString123) == local19.anInt6959)) {
													local1850 = local2076.aClass30_1.method913(Static243.aClass343_3, Static282.aClass52_1, Static131.aClass66_1, local19.anInt6954, Static635.aClass386_2, Static580.aClass36_2, Static170.aClass370_1, local19.anInt6982, -1, 0, (Class107[]) null, 2048, local2091, 0, (Class372) null, Static674.aClass13_22, 0, local19.anInt6988, (int[]) null);
												}
											}
										} else if (local19.anInt6935 == 8 || local19.anInt6935 == 9) {
											@Pc(2011) Class3_Sub24 local2011 = Static640.method8894(local19.anInt7000, false);
											local1884 = local19.anInt6927 == -1 ? null : Static243.aClass343_3.method8356(local19.anInt6927);
											if (local2011 != null) {
												local1892 = local19.aBoolean498 ? Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aClass30_1 : null;
												local1850 = local2011.method3232(local19.anInt6988, local19.anInt6959, local19.anInt6982, local1884, local19.anInt6935 == 9, local1892, Static674.aClass13_22, local19.anInt6954);
											}
										} else if (local19.anInt6927 == -1) {
											local1850 = local19.method6263(Static243.aClass343_3, Static674.aClass13_22, Static580.aClass36_2, 0, (Class372) null, Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aClass30_1, Static282.aClass52_1, local1023, Static170.aClass370_1, -1, 2048, Static131.aClass66_1, Static635.aClass386_2, -1);
											if (local1850 == null && Static424.aBoolean484) {
												Static456.method8151(local19);
											}
										} else {
											@Pc(1975) Class372 local1975 = Static243.aClass343_3.method8356(local19.anInt6927);
											local1850 = local19.method6263(Static243.aClass343_3, Static674.aClass13_22, Static580.aClass36_2, local19.anInt6988, local1975, Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aClass30_1, Static282.aClass52_1, local1023, Static170.aClass370_1, local19.anInt6954, 2048, Static131.aClass66_1, Static635.aClass386_2, local19.anInt6982);
											if (local1850 == null && Static424.aBoolean484) {
												Static456.method8151(local19);
											}
										}
										if (local1850 != null) {
											if (local19.anInt6975 <= 0) {
												local1505 = 512;
											} else {
												local1505 = (local19.anInt6963 << 9) / local19.anInt6975;
											}
											if (local19.anInt7006 > 0) {
												local668 = (local19.anInt6971 << 9) / local19.anInt7006;
											} else {
												local668 = 512;
											}
											local670 = local113 + local19.anInt6963 / 2;
											local681 = local118 + local19.anInt6971 / 2;
											if (!local19.aBoolean509) {
												local670 += local19.anInt6951 * local1505 >> 9;
												local681 += local19.anInt6977 * local668 >> 9;
											}
											Static63.aClass239_1.method9249();
											Static674.aClass13_22.method8501(Static63.aClass239_1);
											Static674.aClass13_22.DA(local670, local681, local1505, local668);
											Static674.aClass13_22.ya();
											if (local19.aBoolean504) {
												Static674.aClass13_22.C(false);
											}
											if (local19.aBoolean509) {
												Static101.aClass239_2.method9250(local19.anInt6974);
												Static101.aClass239_2.method9243(local19.anInt6973);
												Static101.aClass239_2.method9246(local19.anInt6945);
												Static101.aClass239_2.method9244(local19.anInt6951, local19.anInt6977, local19.anInt7016);
											} else {
												local778 = (local19.anInt6989 << 2) * Class3_Sub20.anIntArray206[local19.anInt6974 << 3] >> 14;
												local780 = (local19.anInt6989 << 2) * Class3_Sub20.anIntArray204[local19.anInt6974 << 3] >> 14;
												Static101.aClass239_2.method9248(-local19.anInt6945 << 3);
												Static101.aClass239_2.method9243(local19.anInt6973 << 3);
												Static101.aClass239_2.method9244(local19.anInt7004 << 2, local778 + (local19.anInt6926 << 2) + local637, local780 - -(local19.anInt6926 << 2));
												Static101.aClass239_2.method9242(local19.anInt6974 << 3);
											}
											local19.method6257(Static674.aClass13_22, local1850, Static101.aClass239_2, Static588.anInt9467);
											if (Static469.aBoolean574) {
												Static674.aClass13_22.T(local113, local118, local113 + local19.anInt6963, local118 - -local19.anInt6971);
											}
											if (local19.aBoolean509) {
												if (local19.aBoolean495) {
													local1850.method5659(Static101.aClass239_2, (Class28_Sub8) null, local19.anInt6989, 1);
												} else {
													local1850.method5653(Static101.aClass239_2, (Class28_Sub8) null, 1);
													if (local19.aClass28_Sub7_4 != null) {
														Static674.aClass13_22.method8499(local19.aClass28_Sub7_4.method7921());
													}
												}
											} else if (local19.aBoolean495) {
												local1850.method5659(Static101.aClass239_2, (Class28_Sub8) null, local19.anInt6989 << 2, 1);
											} else {
												local1850.method5653(Static101.aClass239_2, (Class28_Sub8) null, 1);
												if (local19.aClass28_Sub7_4 != null) {
													Static674.aClass13_22.method8499(local19.aClass28_Sub7_4.method7921());
												}
											}
											if (Static469.aBoolean574) {
												Static674.aClass13_22.KA(arg3, arg2, arg4, arg0);
											}
											if (local19.aBoolean504) {
												Static674.aClass13_22.C(true);
											}
										}
										if (Static82.aBoolean134) {
											if (arg1) {
												Static642.method8919(local56, local63, local49, local44);
											} else {
												Static166.method3024(local44, local56, local63, local49);
											}
										}
									} else if (local19.anInt7003 == 9) {
										if (local19.aBoolean500) {
											local288 = local19.anInt6971 + local118;
											local1505 = local118;
											local637 = local19.anInt6963 + local113;
										} else {
											local637 = local19.anInt6963 + local113;
											local288 = local118;
											local1505 = local118 + local19.anInt6971;
										}
										if (local19.anInt6999 == 1) {
											Static674.aClass13_22.method8523(local113, local288, local637, local1505, local19.anInt6967, 0);
										} else {
											Static674.aClass13_22.method8527(local113, local288, local637, local1505, local19.anInt6967, local19.anInt6999);
										}
										if (Static82.aBoolean134) {
											if (arg1) {
												Static642.method8919(local56, local63, local49, local44);
											} else {
												Static166.method3024(local44, local56, local63, local49);
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

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(IILclient!ha;)Lclient!vr;")
	private static Class33 method3546(@OriginalArg(0) int arg0, @OriginalArg(2) Class13 arg1) {
		@Pc(20) Class3_Sub40 local20 = (Class3_Sub40) Static244.aClass83_11.method2368((long) arg0);
		if (local20 != null) {
			@Pc(27) Class3_Sub19_Sub1 local27 = local20.aClass121_Sub1_1.method3604();
			local20.aBoolean414 = true;
			if (local27 != null) {
				return local27.method2257(arg1);
			}
		}
		return null;
	}
}

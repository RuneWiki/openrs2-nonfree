import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bda", name = "i", descriptor = "[I")
	public static int[] anIntArray266;

	@OriginalMember(owner = "client!bda", name = "e", descriptor = "I")
	private static final int anInt3368 = 1405;

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIIIIZII[Lclient!oh;II)V")
	public static void method2946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class273[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		Static396.aClass145_6.KA(arg0, arg1, arg8, arg5);
		for (@Pc(22) int local22 = 0; local22 < arg7.length; local22++) {
			@Pc(28) Class273 local28 = arg7[local22];
			if (local28 != null && (local28.anInt7392 == arg2 || arg2 == -1412584499 && local28 == Static650.aClass273_17)) {
				@Pc(59) int local59 = arg9 + local28.anInt7373;
				@Pc(64) int local64 = arg3 + local28.anInt7346;
				@Pc(71) int local71 = local28.anInt7402 + local59 + 1;
				@Pc(78) int local78 = local28.anInt7385 + local64 + 1;
				@Pc(84) int local84;
				if (arg6 == -1) {
					Class11_Sub12.aRectangleArray1[Static172.anInt2988].setBounds(arg9 + local28.anInt7373, arg3 + local28.anInt7346, local28.anInt7402, local28.anInt7385);
					local84 = Static172.anInt2988++;
				} else {
					local84 = arg6;
				}
				local28.anInt7332 = local84;
				local28.anInt7411 = Static528.anInt8386;
				if (!Static91.method1398(local28)) {
					if (local28.anInt7401 != 0) {
						Static454.method6624(local28);
					}
					@Pc(133) int local133 = local28.anInt7373 + arg9;
					@Pc(138) int local138 = arg3 + local28.anInt7346;
					@Pc(140) int local140 = 0;
					@Pc(142) int local142 = 0;
					if (Static392.aBoolean549) {
						local140 = Static637.method3733();
						local142 = Static400.method5900();
					}
					@Pc(153) int local153 = local28.anInt7355;
					if (Static311.aBoolean411 && (Static91.method1412(local28).anInt3441 != 0 || local28.anInt7371 == 0) && local153 > 127) {
						local153 = 127;
					}
					@Pc(219) int local219;
					@Pc(225) int local225;
					if (local28 == Static650.aClass273_17) {
						if (arg2 != -1412584499 && (Static707.anInt10829 == local28.anInt7362 || local28.anInt7362 == Static334.anInt5099)) {
							Static503.aClass273Array2 = arg7;
							Static58.anInt1022 = arg9;
							Static691.anInt10641 = arg3;
							continue;
						}
						if (Static642.aBoolean840 && Static168.aBoolean286) {
							local219 = local140 + Static402.aClass138_1.method4767();
							local225 = local142 + Static402.aClass138_1.method4771();
							local219 -= Static497.anInt7962;
							local225 -= Static358.anInt5727;
							if (Static460.anInt10191 > local219) {
								local219 = Static460.anInt10191;
							}
							if (Static184.anInt3049 > local225) {
								local225 = Static184.anInt3049;
							}
							if (local28.anInt7402 + local219 > Static175.aClass273_18.anInt7402 + Static460.anInt10191) {
								local219 = Static460.anInt10191 + Static175.aClass273_18.anInt7402 - local28.anInt7402;
							}
							local133 = local219;
							if (local225 + local28.anInt7385 > Static184.anInt3049 - -Static175.aClass273_18.anInt7385) {
								local225 = Static175.aClass273_18.anInt7385 + Static184.anInt3049 - local28.anInt7385;
							}
							local138 = local225;
						}
						if (Static334.anInt5099 == local28.anInt7362) {
							local153 = 128;
						}
					}
					@Pc(319) int local319;
					@Pc(323) int local323;
					@Pc(331) int local331;
					@Pc(336) int local336;
					if (local28.anInt7371 == 2) {
						local225 = arg1;
						local319 = arg8;
						local219 = arg0;
						local323 = arg5;
					} else {
						local331 = local133 + local28.anInt7402;
						local336 = local28.anInt7385 + local138;
						if (local28.anInt7371 == 9) {
							local331++;
							local336++;
						}
						local225 = arg1 < local138 ? local138 : arg1;
						local219 = arg0 < local133 ? local133 : arg0;
						local319 = local331 >= arg8 ? arg8 : local331;
						local323 = local336 >= arg5 ? arg5 : local336;
					}
					if (local319 > local219 && local323 > local225) {
						@Pc(763) int local763;
						@Pc(799) int local799;
						@Pc(812) int local812;
						@Pc(957) int local957;
						@Pc(959) int local959;
						@Pc(801) int local801;
						if (local28.anInt7401 != 0) {
							if (Static138.anInt2277 == local28.anInt7401 || Static262.anInt4076 == local28.anInt7401) {
								Static633.method8623(local28, local138, local133);
								if (!Static392.aBoolean549) {
									Static119.method1744(local28.anInt7385, local133, local28.anInt7402, Static262.anInt4076 == local28.anInt7401, local138);
									Static396.aClass145_6.KA(arg0, arg1, arg8, arg5);
								}
								Static537.aBooleanArray25[local84] = true;
								continue;
							}
							if (Static406.anInt6699 == local28.anInt7401 && Static166.anInt2884 == 0) {
								if (local28.method6608(Static396.aClass145_6) != null) {
									Static165.method2505();
									Static329.method4575(local133, Static396.aClass145_6, local138, local28);
									Static356.aBooleanArray26[local84] = true;
									Static396.aClass145_6.KA(arg0, arg1, arg8, arg5);
									if (Static392.aBoolean549) {
										if (arg4) {
											Static5.method72(local78, local64, local71, local59);
										} else {
											Static703.method9413(local71, local64, local59, local78);
										}
									}
								}
								continue;
							}
							if (local28.anInt7401 == Static505.anInt8019) {
								Static164.method2459(Static396.aClass145_6, local133, local28, local138);
								continue;
							}
							if (local28.anInt7401 == Static1.anInt9139) {
								Static283.method7820(local133, Static396.aClass145_6, local28, local28.anInt7396 % 64, local138);
								continue;
							}
							if (Static194.anInt3152 == local28.anInt7401) {
								if (local28.method6608(Static396.aClass145_6) != null) {
									Static263.method3713(local138, local28, local133);
									Static356.aBooleanArray26[local84] = true;
									Static396.aClass145_6.KA(arg0, arg1, arg8, arg5);
									if (Static392.aBoolean549) {
										if (arg4) {
											Static5.method72(local78, local64, local71, local59);
										} else {
											Static703.method9413(local71, local64, local59, local78);
										}
									}
								}
								continue;
							}
							if (Static547.anInt8632 == local28.anInt7401) {
								Static599.method8210(local28.anInt7385, local133, local138, Static179.anInterface3_1, Static396.aClass145_6, local28.anInt7402);
								Static537.aBooleanArray25[local84] = true;
								Static396.aClass145_6.KA(arg0, arg1, arg8, arg5);
								continue;
							}
							if (Static80.anInt1370 == local28.anInt7401) {
								Static358.method5148(local133, local138, local28.anInt7385, local28.anInt7402, Static396.aClass145_6);
								Static537.aBooleanArray25[local84] = true;
								Static396.aClass145_6.KA(arg0, arg1, arg8, arg5);
								continue;
							}
							if (local28.anInt7401 == anInt3368) {
								if (!Static66.aBoolean131 && !Static70.aBoolean138) {
									continue;
								}
								local331 = local133 + local28.anInt7402;
								local336 = local138 + 15;
								if (Static392.aBoolean549) {
									if (arg4) {
										Static5.method72(local78, local64, local71, local59);
									} else {
										Static703.method9413(local71, local64, local59, local78);
									}
								}
								if (Static66.aBoolean131) {
									local763 = -256;
									if (Static162.anInt2752 < 20) {
										local763 = -65536;
									}
									Static61.aClass68_1.method7884(local331, "Fps:" + Static162.anInt2752, local763, local336, -1);
									local336 += 15;
									@Pc(789) Runtime local789 = Runtime.getRuntime();
									local799 = (int) ((local789.totalMemory() - local789.freeMemory()) / 1024L);
									local801 = -256;
									if (local799 > 98304) {
										local801 = -65536;
										if (Static333.aBoolean434) {
											Static274.method3837();
											for (local812 = 0; local812 < 10; local812++) {
												System.gc();
											}
											local799 = (int) ((local789.totalMemory() - local789.freeMemory()) / 1024L);
											if (local799 > 65536) {
												Static79.method1194("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
									}
									Static61.aClass68_1.method7884(local331, "Mem:" + local799 + "k", local801, local336, -1);
									local336 += 15;
									Static61.aClass68_1.method7884(local331, "Game: In:" + Static487.aClass221_2.anInt5771 + "B/s Out:" + Static487.aClass221_2.anInt5774 + "B/s", -256, local336, -1);
									local336 += 15;
									Static61.aClass68_1.method7884(local331, "Lobby: In:" + Static487.aClass221_1.anInt5771 + "B/s Out:" + Static487.aClass221_1.anInt5774 + "B/s", -256, local336, -1);
									local336 += 15;
									local812 = Static396.aClass145_6.E() / 1024;
									Static61.aClass68_1.method7884(local331, "Offheap:" + local812 + "k", local812 <= 65536 ? -256 : -65536, local336, -1);
									local336 += 15;
									local957 = 0;
									local959 = 0;
									@Pc(961) int local961 = 0;
									for (@Pc(963) int local963 = 0; local963 < 37; local963++) {
										if (Static485.aClass147_Sub1Array1[local963] != null) {
											local957 += Static485.aClass147_Sub1Array1[local963].method3252();
											local959 += Static485.aClass147_Sub1Array1[local963].method3245();
											local961 += Static485.aClass147_Sub1Array1[local963].method3249();
										}
									}
									@Pc(1007) int local1007 = local961 * 100 / local957;
									@Pc(1013) int local1013 = local959 * 10000 / local957;
									@Pc(1039) String local1039 = "Cache:" + Static482.method6903(2, true, (long) local1013, 0) + "% (" + local1007 + "%)";
									Static435.aClass68_11.method7884(local331, local1039, -256, local336, -1);
									local336 += 12;
								}
								if (Static43.anInt584 > 0) {
									Static435.aClass68_11.method7884(local331, "Particles: " + Static384.anInt6089 + " / " + Static43.anInt584, -256, local336, -1);
								}
								local336 += 12;
								if (Static70.aBoolean138) {
									Static435.aClass68_11.method7884(local331, "Polys: " + Static396.aClass145_6.I() + " Models: " + Static396.aClass145_6.M(), -256, local336, -1);
									local336 += 12;
									Static435.aClass68_11.method7884(local331, "Ls: " + Static272.anInt4214 + " La: " + Static383.anInt88 + " NPC: " + Static73.anInt1302 + " Pl: " + Static279.anInt4359, -256, local336, -1);
									Static502.method7136();
									local336 += 12;
								}
								Static537.aBooleanArray25[local84] = true;
								continue;
							}
						}
						@Pc(1274) int local1274;
						@Pc(1233) Class2_Sub26 local1233;
						if (local28.anInt7371 == 0) {
							if (Static236.anInt3730 == local28.anInt7401 && Static396.aClass145_6.method9632()) {
								Static396.aClass145_6.method9702(local133, local138, local28.anInt7402, local28.anInt7385);
							}
							method2946(local219, local225, local28.anInt7350, local138 - local28.anInt7342, arg4, local323, local84, arg7, local319, local133 - local28.anInt7347);
							if (local28.aClass273Array3 != null) {
								method2946(local219, local225, local28.anInt7350, local138 - local28.anInt7342, arg4, local323, local84, local28.aClass273Array3, local319, local133 - local28.anInt7347);
							}
							local1233 = (Class2_Sub26) Static463.aClass218_36.method5095((long) local28.anInt7350, 0);
							if (local1233 != null) {
								Static619.method8403(local138, local319, local225, local219, local1233.anInt3020, local84, local323, local133);
							}
							if (local28.anInt7401 == Static236.anInt3730) {
								if (Static396.aClass145_6.method9632()) {
									Static396.aClass145_6.method9660();
								}
								if (Static166.anInt2884 == 3) {
									local336 = Static205.anInt3336;
									local763 = Static81.anInt1388;
									local1274 = Static308.anInt4721;
									local799 = Static571.anInt8999;
									if (Static122.anInt2068 > Static528.anInt8386) {
										@Pc(1295) float local1295 = (float) (Static528.anInt8386 - Static601.anInt9345) / (float) (Static122.anInt2068 - Static601.anInt9345);
										local799 = (int) ((1.0F - local1295) * (float) Static284.anInt4408 + local1295 * (float) Static571.anInt8999);
										local1274 = (int) ((float) Static46.anInt608 * (1.0F - local1295) + local1295 * (float) Static308.anInt4721);
										local336 = (int) ((float) Static268.anInt4159 * (1.0F - local1295) + local1295 * (float) Static205.anInt3336);
										local763 = (int) ((1.0F - local1295) * (float) Static525.anInt8330 + (float) Static81.anInt1388 * local1295);
									}
									if (local336 > 0) {
										Static396.aClass145_6.method9637(local319 - local219, -local225 + local323, local225, local763 << 16 | local336 << 24 | local1274 << 8 | local799, local219);
									}
								}
							}
							Static396.aClass145_6.KA(arg0, arg1, arg8, arg5);
						}
						if (Static279.aBooleanArray21[local84] || Static320.anInt9249 > 1) {
							if (local28.anInt7371 == 3) {
								if (local153 == 0) {
									if (local28.aBoolean640) {
										Static396.aClass145_6.aa(local133, local138, local28.anInt7402, local28.anInt7385, local28.anInt7396, 0);
									} else {
										Static396.aClass145_6.method9713(local133, local138, local28.anInt7402, local28.anInt7385, local28.anInt7396, 0);
									}
								} else if (local28.aBoolean640) {
									Static396.aClass145_6.aa(local133, local138, local28.anInt7402, local28.anInt7385, 255 - (local153 & 0xFF) << 24 | local28.anInt7396 & 0xFFFFFF, 1);
								} else {
									Static396.aClass145_6.method9713(local133, local138, local28.anInt7402, local28.anInt7385, local28.anInt7396 & 0xFFFFFF | 255 - (local153 & 0xFF) << 24, 1);
								}
								if (Static392.aBoolean549) {
									if (arg4) {
										Static5.method72(local78, local64, local71, local59);
									} else {
										Static703.method9413(local71, local64, local59, local78);
									}
								}
							} else {
								@Pc(1569) Class203 local1569;
								if (local28.anInt7371 == 4) {
									@Pc(1540) Class68 local1540 = local28.method6610(Static396.aClass145_6);
									if (local1540 != null) {
										local336 = local28.anInt7396;
										@Pc(1559) String local1559 = local28.aString86;
										if (local28.anInt7415 != -1) {
											local1569 = Static543.aClass37_2.method605(local28.anInt7415);
											local1559 = local1569.aString52;
											if (local1559 == null) {
												local1559 = "null";
											}
											if ((local1569.anInt4835 == 1 || local28.anInt7416 != 1) && local28.anInt7416 != -1) {
												local1559 = "<col=ff9040>" + local1559 + "</col> x" + Static553.method7727(local28.anInt7416);
											}
										}
										if (local28.anInt7367 != -1) {
											local1559 = Static254.method3594(local28.anInt7367);
											if (local1559 == null) {
												local1559 = "";
											}
										}
										if (Static13.aClass273_1 == local28) {
											local1559 = Static289.aClass191_30.method4067(Static414.anInt9485);
											local336 = local28.anInt7396;
										}
										if (Static574.aBoolean775) {
											Static396.aClass145_6.T(local133, local138, local133 + local28.anInt7402, local138 + local28.anInt7385);
										}
										local1540.method7898(local28.anInt7413, (int[]) null, local28.anInt7417, local133, 0, local1559, local28.anInt7385, local138, local28.anInt7402, (Class1) null, Static245.aClass43Array9, local28.aBoolean642 ? 255 - (local153 & 0xFF) << 24 : -1, local336 | 255 - (local153 & 0xFF) << 24, 0, local28.anInt7353, local28.anInt7369);
										if (Static574.aBoolean775) {
											Static396.aClass145_6.KA(arg0, arg1, arg8, arg5);
										}
										if (local1559.trim().length() > 0) {
											if (!Static574.aBoolean775) {
												@Pc(1759) Class289 local1759 = Static473.method6776(Static396.aClass145_6, local28.anInt7359);
												local799 = local1759.method6939(local28.anInt7402, local1559, Static245.aClass43Array9);
												local801 = local1759.method6934(local28.anInt7417, local1559, local28.anInt7402, Static245.aClass43Array9);
												if (Static392.aBoolean549) {
													if (arg4) {
														Static5.method72(local138 + local801, local138, local133 + local799, local133);
													} else {
														Static703.method9413(local133 + local799, local138, local133, local801 + local138);
													}
												}
											} else if (Static392.aBoolean549) {
												if (arg4) {
													Static5.method72(local78, local64, local71, local59);
												} else {
													Static703.method9413(local71, local64, local59, local78);
												}
											}
										}
									} else if (Static53.aBoolean107) {
										Static371.method5299(local28);
									}
								} else if (local28.anInt7371 == 5) {
									if (local28.anInt7424 >= 0) {
										local28.method6599(Static271.aClass25_1, Static120.aClass232_1).method8433(local28.anInt7385, Static396.aClass145_6, local138, local28.anInt7406 << 3, local133, local28.anInt7409 << 3, local28.anInt7402);
									} else {
										@Pc(1874) Class43 local1874;
										if (local28.anInt7415 != -1) {
											@Pc(1895) Class116 local1895 = local28.aBoolean634 ? Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aClass116_1 : null;
											local1874 = Static543.aClass37_2.method606(local28.anInt7334, local28.anInt7397 | 0xFF000000, local28.anInt7415, local1895, local28.anInt7405, Static396.aClass145_6, local28.anInt7416);
										} else if (local28.anInt7367 == -1) {
											local1874 = local28.method6619(Static396.aClass145_6);
										} else {
											local1874 = Static75.method1157(Static396.aClass145_6, local28.anInt7367);
										}
										if (local1874 != null) {
											local336 = local1874.method9587();
											local763 = local1874.method9600();
											local1274 = (local28.anInt7396 == 0 ? 16777215 : local28.anInt7396 & 0xFFFFFF) | 255 - (local153 & 0xFF) << 24;
											if (local28.aBoolean627) {
												Static396.aClass145_6.T(local133, local138, local133 + local28.anInt7402, local138 - -local28.anInt7385);
												if (local28.anInt7340 != 0) {
													local799 = (local336 + local28.anInt7402 - 1) / local336;
													local801 = (local763 + local28.anInt7385 - 1) / local763;
													for (local812 = 0; local812 < local799; local812++) {
														for (local957 = 0; local957 < local801; local957++) {
															if (local28.anInt7396 == 0) {
																local1874.method9604((float) (local812 * local336 + local133) + (float) local336 / 2.0F, (float) local763 / 2.0F + (float) (local138 - -(local957 * local763)), 4096, local28.anInt7340);
															} else {
																local1874.method9602((float) local336 / 2.0F + (float) (local336 * local812 + local133), (float) (local138 - -(local957 * local763)) + (float) local763 / 2.0F, 4096, local28.anInt7340, local1274);
															}
														}
													}
												} else if (local28.anInt7396 == 0 && local153 == 0) {
													local1874.method9605(local133, local138, local28.anInt7402, local28.anInt7385);
												} else {
													local1874.method9603(local133, local138, local28.anInt7402, local28.anInt7385, 0, local1274, 1);
												}
												Static396.aClass145_6.KA(arg0, arg1, arg8, arg5);
											} else if (local28.anInt7396 == 0 && local153 == 0) {
												if (local28.anInt7340 != 0) {
													local1874.method9604((float) local133 + (float) local28.anInt7402 / 2.0F, (float) local28.anInt7385 / 2.0F + (float) local138, local28.anInt7402 * 4096 / local336, local28.anInt7340);
												} else if (local336 == local28.anInt7402 && local28.anInt7385 == local763) {
													local1874.method9588(local133, local138);
												} else {
													local1874.method9589(local133, local138, local28.anInt7402, local28.anInt7385);
												}
											} else if (local28.anInt7340 != 0) {
												local1874.method9602((float) local133 + (float) local28.anInt7402 / 2.0F, (float) local28.anInt7385 / 2.0F + (float) local138, local28.anInt7402 * 4096 / local336, local28.anInt7340, local1274);
											} else if (local336 == local28.anInt7402 && local763 == local28.anInt7385) {
												local1874.method9583(local133, local138, 0, local1274, 1);
											} else {
												local1874.method9584(local133, local138, local28.anInt7402, local28.anInt7385, 0, local1274, 1);
											}
										} else if (Static53.aBoolean107) {
											Static371.method5299(local28);
										}
									}
									if (Static392.aBoolean549) {
										if (arg4) {
											Static5.method72(local78, local64, local71, local59);
										} else {
											Static703.method9413(local71, local64, local59, local78);
										}
									}
								} else if (local28.anInt7371 == 6) {
									Static64.method960();
									local1233 = null;
									@Pc(2337) Class45 local2337 = null;
									local763 = 0;
									if (local28.anInt7415 != -1) {
										local1569 = Static543.aClass37_2.method605(local28.anInt7415);
										if (local1569 != null) {
											local1569 = local1569.method4409(local28.anInt7416);
											local2337 = local1569.method4410(Static396.aClass145_6, local28.aBoolean634 ? Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aClass116_1 : null, local28.aClass53_8, 1, 2048);
											if (local2337 == null) {
												Static371.method5299(local28);
											} else {
												local763 = -local2337.fa() >> 1;
											}
										}
									} else if (local28.anInt7354 == 5) {
										local1274 = local28.anInt7420;
										if (local1274 >= 0 && local1274 < 2048) {
											@Pc(2368) Class4_Sub2_Sub1_Sub2_Sub1 local2368 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local1274];
											if (local2368 != null && (Class4_Sub2_Sub1_Sub2.lb == local1274 || Static673.method9170(local2368.aString4) == local28.anInt7391)) {
												local2337 = local2368.aClass116_1.method2531((Class53[]) null, local28.aClass53_8, Static378.aClass314_2, 0, Static192.aClass41_1, Static89.aClass274_1, Static91.aClass7_1, Static396.aClass107_1, (Class53) null, 2048, Static227.aClass210_1, (int[]) null, Static396.aClass145_6, Static543.aClass37_2);
											}
										}
									} else if (local28.anInt7354 == 8 || local28.anInt7354 == 9) {
										@Pc(2434) Class2_Sub3 local2434 = Static549.method7662(-119, false, local28.anInt7420);
										if (local2434 != null) {
											local2337 = local2434.method73(Static396.aClass145_6, local28.aBoolean634 ? Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aClass116_1 : null, local28.anInt7391, local28.aClass53_8, local28.anInt7354 == 9);
										}
									} else if (local28.aClass53_8 != null && local28.aClass53_8.method4094()) {
										local2337 = local28.method6613(2048, Static396.aClass145_6, Static91.aClass7_1, Static543.aClass37_2, Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aClass116_1, Static378.aClass314_2, local1233, local28.aClass53_8, Static192.aClass41_1, Static89.aClass274_1, Static396.aClass107_1);
										if (local2337 == null && Static53.aBoolean107) {
											Static371.method5299(local28);
										}
									} else {
										local2337 = local28.method6613(2048, Static396.aClass145_6, Static91.aClass7_1, Static543.aClass37_2, Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aClass116_1, Static378.aClass314_2, local1233, (Class53) null, Static192.aClass41_1, Static89.aClass274_1, Static396.aClass107_1);
										if (local2337 == null && Static53.aBoolean107) {
											Static371.method5299(local28);
										}
									}
									if (local2337 != null) {
										if (local28.anInt7422 <= 0) {
											local1274 = 512;
										} else {
											local1274 = (local28.anInt7402 << 9) / local28.anInt7422;
										}
										if (local28.anInt7383 <= 0) {
											local799 = 512;
										} else {
											local799 = (local28.anInt7385 << 9) / local28.anInt7383;
										}
										local801 = local28.anInt7402 / 2 + local133;
										local812 = local28.anInt7385 / 2 + local138;
										if (!local28.aBoolean639) {
											local812 += local799 * local28.anInt7349 >> 9;
											local801 += local1274 * local28.anInt7363 >> 9;
										}
										Static359.aClass86_2.method7024();
										Static396.aClass145_6.method9656(Static359.aClass86_2);
										Static396.aClass145_6.DA(local801, local812, local1274, local799);
										Static396.aClass145_6.ya();
										if (local28.aBoolean630) {
											Static396.aClass145_6.C(false);
										}
										if (local28.aBoolean639) {
											Static390.aClass86_3.method7025(local28.anInt7335);
											Static390.aClass86_3.method7034(local28.anInt7390);
											Static390.aClass86_3.method7022(local28.anInt7407);
											Static390.aClass86_3.method7020(local28.anInt7363, local28.anInt7349, local28.anInt7423);
										} else {
											local957 = Class145_Sub1.anIntArray761[local28.anInt7335 << 3] * (local28.anInt7360 << 2) >> 14;
											local959 = Class145_Sub1.anIntArray760[local28.anInt7335 << 3] * (local28.anInt7360 << 2) >> 14;
											Static390.aClass86_3.method7029(-local28.anInt7407 << 3);
											Static390.aClass86_3.method7034(local28.anInt7390 << 3);
											Static390.aClass86_3.method7020(local28.anInt7414 << 2, (local28.anInt7374 << 2) + local957 + local763, local959 - -(local28.anInt7374 << 2));
											Static390.aClass86_3.method7027(local28.anInt7335 << 3);
										}
										local28.method6617(Static528.anInt8386, Static390.aClass86_3, Static396.aClass145_6, local2337);
										if (Static574.aBoolean775) {
											Static396.aClass145_6.T(local133, local138, local133 + local28.anInt7402, local138 - -local28.anInt7385);
										}
										if (local28.aBoolean639) {
											if (local28.aBoolean643) {
												local2337.method5759(Static390.aClass86_3, (Class4_Sub6) null, local28.anInt7360, 1);
											} else {
												local2337.method5769(Static390.aClass86_3, (Class4_Sub6) null, 1);
												if (local28.aClass4_Sub7_5 != null) {
													Static396.aClass145_6.method9666(local28.aClass4_Sub7_5.method3631());
												}
											}
										} else if (local28.aBoolean643) {
											local2337.method5759(Static390.aClass86_3, (Class4_Sub6) null, local28.anInt7360 << 2, 1);
										} else {
											local2337.method5769(Static390.aClass86_3, (Class4_Sub6) null, 1);
											if (local28.aClass4_Sub7_5 != null) {
												Static396.aClass145_6.method9666(local28.aClass4_Sub7_5.method3631());
											}
										}
										if (Static574.aBoolean775) {
											Static396.aClass145_6.KA(arg0, arg1, arg8, arg5);
										}
										if (local28.aBoolean630) {
											Static396.aClass145_6.C(true);
										}
									}
									if (Static392.aBoolean549) {
										if (arg4) {
											Static5.method72(local78, local64, local71, local59);
										} else {
											Static703.method9413(local71, local64, local59, local78);
										}
									}
								} else if (local28.anInt7371 == 9) {
									if (local28.aBoolean625) {
										local336 = local138 + local28.anInt7385;
										local763 = local133 + local28.anInt7402;
										local1274 = local138;
									} else {
										local1274 = local28.anInt7385 + local138;
										local763 = local28.anInt7402 + local133;
										local336 = local138;
									}
									if (local28.anInt7378 == 1) {
										Static396.aClass145_6.method9714(local133, local336, local763, local1274, local28.anInt7396, 0);
									} else {
										Static396.aClass145_6.method9670(local133, local336, local763, local1274, local28.anInt7396, local28.anInt7378);
									}
									if (Static392.aBoolean549) {
										if (arg4) {
											Static5.method72(local78, local64, local71, local59);
										} else {
											Static703.method9413(local71, local64, local59, local78);
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

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(II)I")
	public static int method2947(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(II)[I")
	public static int[] method2948(@OriginalArg(1) int arg0) {
		Static97.method1514(Static73.method1140(arg0));
		return new int[] { Static246.aCalendar3.get(5), Static246.aCalendar3.get(2), Static246.aCalendar3.get(1) };
	}
}

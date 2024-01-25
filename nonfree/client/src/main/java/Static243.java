import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!ic", name = "jd", descriptor = "I")
	public static int anInt4193;

	@OriginalMember(owner = "client!ic", name = "wd", descriptor = "I")
	public static int anInt4196;

	@OriginalMember(owner = "client!ic", name = "md", descriptor = "Z")
	public static boolean aBoolean324 = false;

	@OriginalMember(owner = "client!ic", name = "kd", descriptor = "I")
	public static int anInt4191 = 7000;

	@OriginalMember(owner = "client!ic", name = "Xc", descriptor = "I")
	public static int anInt4189 = anInt4191;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([Lclient!cn;IIIIIIZIII)V")
	public static void method3598(@OriginalArg(0) Class73[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		Static457.aClass57_11.KA(arg8, arg9, arg2, arg1);
		for (@Pc(21) int local21 = 0; local21 < arg0.length; local21++) {
			@Pc(27) Class73 local27 = arg0[local21];
			if (local27 != null && (arg5 == local27.anInt1410 || arg5 == -1412584499 && local27 == Static370.aClass73_22)) {
				@Pc(54) int local54 = arg3 + local27.anInt1378;
				@Pc(59) int local59 = arg7 + local27.anInt1375;
				@Pc(66) int local66 = local27.anInt1384 + local54 + 1;
				@Pc(73) int local73 = local27.anInt1394 + local59 + 1;
				@Pc(98) int local98;
				if (arg4 == -1) {
					Class13_Sub11.aRectangleArray2[Static449.anInt7746].setBounds(arg3 + local27.anInt1378, arg7 + local27.anInt1375, local27.anInt1384, local27.anInt1394);
					local98 = Static449.anInt7746++;
				} else {
					local98 = arg4;
				}
				local27.anInt1359 = local98;
				local27.anInt1365 = Static44.anInt740;
				if (!Static81.method1261(local27)) {
					if (local27.anInt1367 != 0) {
						Static214.method3080(local27);
					}
					@Pc(129) int local129 = local27.anInt1378 + arg3;
					@Pc(135) int local135 = local27.anInt1375 + arg7;
					@Pc(137) int local137 = 0;
					@Pc(139) int local139 = 0;
					if (Static40.aBoolean61) {
						local137 = Static169.method2467();
						local139 = Static375.method5510();
					}
					@Pc(150) int local150 = local27.anInt1356;
					if (Static206.aBoolean269 && (Static81.method1252(local27).anInt8267 != 0 || local27.anInt1391 == 0) && local150 > 127) {
						local150 = 127;
					}
					@Pc(214) int local214;
					@Pc(220) int local220;
					if (local27 == Static370.aClass73_22) {
						if (arg5 != -1412584499 && (local27.anInt1416 == Static123.anInt1948 || local27.anInt1416 == Static54.anInt844)) {
							Static508.anInt8703 = arg3;
							Static206.anInt3361 = arg7;
							Static649.aClass73Array3 = arg0;
							continue;
						}
						if (Static161.aBoolean202 && Static433.aBoolean571) {
							local214 = local137 + Static205.aClass107_1.method4079();
							local220 = local139 + Static205.aClass107_1.method4072();
							local214 -= Static665.anInt10653;
							local220 -= Static59.anInt893;
							if (local214 < Static550.anInt9295) {
								local214 = Static550.anInt9295;
							}
							if (Static126.anInt1985 > local220) {
								local220 = Static126.anInt1985;
							}
							if (Static142.aClass73_6.anInt1384 + Static550.anInt9295 < local214 + local27.anInt1384) {
								local214 = Static142.aClass73_6.anInt1384 + Static550.anInt9295 - local27.anInt1384;
							}
							local129 = local214;
							if (local220 + local27.anInt1394 > Static142.aClass73_6.anInt1394 + Static126.anInt1985) {
								local220 = Static142.aClass73_6.anInt1394 + Static126.anInt1985 - local27.anInt1394;
							}
							local135 = local220;
						}
						if (Static54.anInt844 == local27.anInt1416) {
							local150 = 128;
						}
					}
					@Pc(348) int local348;
					@Pc(336) int local336;
					@Pc(297) int local297;
					@Pc(302) int local302;
					if (local27.anInt1391 == 2) {
						local336 = arg1;
						local220 = arg9;
						local348 = arg2;
						local214 = arg8;
					} else {
						local297 = local129 + local27.anInt1384;
						local302 = local27.anInt1394 + local135;
						local214 = arg8 < local129 ? local129 : arg8;
						local220 = arg9 >= local135 ? arg9 : local135;
						if (local27.anInt1391 == 9) {
							local302++;
							local297++;
						}
						local336 = arg1 <= local302 ? arg1 : local302;
						local348 = arg2 <= local297 ? arg2 : local297;
					}
					if (local214 < local348 && local336 > local220) {
						@Pc(711) int local711;
						@Pc(761) int local761;
						@Pc(875) int local875;
						@Pc(877) int local877;
						@Pc(746) int local746;
						@Pc(748) int local748;
						if (local27.anInt1367 != 0) {
							if (local27.anInt1367 == Static410.anInt7141 || Static268.anInt4665 == local27.anInt1367) {
								Static89.method1350(local135, local27, local129);
								if (!Static40.aBoolean61) {
									Static44.method713(local27.anInt1394, local135, Static268.anInt4665 == local27.anInt1367, local27.anInt1384, local129);
									Static457.aClass57_11.KA(arg8, arg9, arg2, arg1);
								}
								Static386.aBooleanArray13[local98] = true;
								continue;
							}
							if (local27.anInt1367 == Static229.anInt3717) {
								if (local27.method1287(Static457.aClass57_11) != null) {
									Static62.method873();
									Static384.method5622(local135, Static457.aClass57_11, local129, local27);
									Static587.aBooleanArray26[local98] = true;
									Static457.aClass57_11.KA(arg8, arg9, arg2, arg1);
									if (Static40.aBoolean61) {
										if (arg6) {
											Static82.method9318(local73, local59, local66, local54);
										} else {
											Static70.method1123(local59, local73, local66, local54);
										}
									}
								}
								continue;
							}
							if (local27.anInt1367 == Static247.anInt4264) {
								Static497.method9021(Static457.aClass57_11, local27, local135, local129);
								continue;
							}
							if (local27.anInt1367 == Static467.anInt7941) {
								Static209.method3033(local135, local27, local27.anInt1382 % 64, local129, Static457.aClass57_11);
								continue;
							}
							if (Static343.anInt6080 == local27.anInt1367) {
								if (local27.method1287(Static457.aClass57_11) != null) {
									Static381.method5580(local27, local135, local129);
									Static587.aBooleanArray26[local98] = true;
									Static457.aClass57_11.KA(arg8, arg9, arg2, arg1);
									if (Static40.aBoolean61) {
										if (arg6) {
											Static82.method9318(local73, local59, local66, local54);
										} else {
											Static70.method1123(local59, local73, local66, local54);
										}
									}
								}
								continue;
							}
							if (Static279.anInt4836 == local27.anInt1367) {
								Static346.method5220(local129, local27.anInt1384, Static509.anInterface1_10, local27.anInt1394, local135, Static457.aClass57_11);
								Static386.aBooleanArray13[local98] = true;
								Static457.aClass57_11.KA(arg8, arg9, arg2, arg1);
								continue;
							}
							if (local27.anInt1367 == Static100.anInt1605) {
								Static110.method1574(Static457.aClass57_11, local27.anInt1384, local135, local27.anInt1394, local129);
								Static386.aBooleanArray13[local98] = true;
								Static457.aClass57_11.KA(arg8, arg9, arg2, arg1);
								continue;
							}
							if (Static81.anInt1321 == local27.anInt1367) {
								if (!Static443.aBoolean588 && !Static619.aBoolean273) {
									continue;
								}
								local297 = local129 + local27.anInt1384;
								local302 = local135 + 15;
								if (Static40.aBoolean61) {
									if (arg6) {
										Static82.method9318(local73, local59, local66, local54);
									} else {
										Static70.method1123(local59, local73, local66, local54);
									}
								}
								if (Static443.aBoolean588) {
									local711 = -256;
									if (Static57.anInt866 < 20) {
										local711 = -65536;
									}
									Static582.aClass80_12.method8796(local297, "Fps:" + Static57.anInt866, local711, -1, local302);
									local302 += 15;
									@Pc(737) Runtime local737 = Runtime.getRuntime();
									local746 = (int) ((local737.totalMemory() - local737.freeMemory()) / 1024L);
									local748 = -256;
									if (local746 > 98304) {
										local748 = -65536;
										if (Static105.aBoolean165) {
											Static128.method5983();
											for (local761 = 0; local761 < 10; local761++) {
												System.gc();
											}
											local746 = (int) ((local737.totalMemory() - local737.freeMemory()) / 1024L);
											if (local746 > 65536) {
												Static111.method1603("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
									}
									Static582.aClass80_12.method8796(local297, "Mem:" + local746 + "k", local748, -1, local302);
									local302 += 15;
									Static582.aClass80_12.method8796(local297, "In:" + Static373.anInt6401 + "B/s Out:" + Static35.anInt9308 + "B/s", -256, -1, local302);
									local302 += 15;
									local761 = Static457.aClass57_11.E() / 1024;
									Static582.aClass80_12.method8796(local297, "Offheap:" + local761 + "k", local761 > 65536 ? -65536 : -256, -1, local302);
									local302 += 15;
									local875 = 0;
									local877 = 0;
									@Pc(879) int local879 = 0;
									for (@Pc(881) int local881 = 0; local881 < 37; local881++) {
										if (Static11.aClass260_Sub1Array1[local881] != null) {
											local875 += Static11.aClass260_Sub1Array1[local881].method6261();
											local877 += Static11.aClass260_Sub1Array1[local881].method6256();
											local879 += Static11.aClass260_Sub1Array1[local881].method6257();
										}
									}
									@Pc(925) int local925 = local879 * 100 / local875;
									@Pc(931) int local931 = local877 * 10000 / local875;
									@Pc(957) String local957 = "Cache:" + Static679.method9322(2, (long) local931, 0, true) + "% (" + local925 + "%)";
									Static41.aClass80_2.method8796(local297, local957, -256, -1, local302);
									local302 += 12;
								}
								if (Static35.anInt9303 > 0) {
									Static41.aClass80_2.method8796(local297, "Particles: " + Static546.anInt9786 + " / " + Static35.anInt9303, -256, -1, local302);
								}
								local302 += 12;
								if (Static619.aBoolean273) {
									Static41.aClass80_2.method8796(local297, "Polys: " + Static457.aClass57_11.I() + " Models: " + Static457.aClass57_11.M(), -256, -1, local302);
									local302 += 12;
									Static41.aClass80_2.method8796(local297, "Ls: " + Static68.anInt1102 + " La: " + Static128.anInt7014 + " NPC: " + Static300.anInt5167 + " Pl: " + Static15.anInt267, -256, -1, local302);
									local302 += 12;
									Static422.method6309();
								}
								Static386.aBooleanArray13[local98] = true;
								continue;
							}
						}
						@Pc(1156) Class5_Sub49 local1156;
						if (local27.anInt1391 == 0) {
							if (Static95.anInt1559 == local27.anInt1367 && Static457.aClass57_11.method7711()) {
								Static457.aClass57_11.method7698(local129, local135, local27.anInt1384, local27.anInt1394);
							}
							method3598(arg0, local336, local348, local129 - local27.anInt1376, local98, local27.anInt1388, arg6, local135 - local27.anInt1340, local214, local220);
							if (local27.aClass73Array1 != null) {
								method3598(local27.aClass73Array1, local336, local348, local129 - local27.anInt1376, local98, local27.anInt1388, arg6, local135 - local27.anInt1340, local214, local220);
							}
							local1156 = (Class5_Sub49) Static549.aClass291_37.method6993((long) local27.anInt1388, 1);
							if (local1156 != null) {
								Static481.method6999(local135, local214, local336, local348, local220, local1156.anInt9322, local98, local129);
							}
							if (Static95.anInt1559 == local27.anInt1367 && Static457.aClass57_11.method7711()) {
								Static457.aClass57_11.method7651();
							}
							Static457.aClass57_11.KA(arg8, arg9, arg2, arg1);
						}
						if (Static559.aBooleanArray25[local98] || Static455.anInt7798 > 1) {
							if (local27.anInt1391 == 3) {
								if (local150 == 0) {
									if (local27.aBoolean139) {
										Static457.aClass57_11.aa(local129, local135, local27.anInt1384, local27.anInt1394, local27.anInt1382, 0);
									} else {
										Static457.aClass57_11.method7681(local129, local135, local27.anInt1384, local27.anInt1394, local27.anInt1382, 0);
									}
								} else if (local27.aBoolean139) {
									Static457.aClass57_11.aa(local129, local135, local27.anInt1384, local27.anInt1394, local27.anInt1382 & 0xFFFFFF | 255 - (local150 & 0xFF) << 24, 1);
								} else {
									Static457.aClass57_11.method7681(local129, local135, local27.anInt1384, local27.anInt1394, local27.anInt1382 & 0xFFFFFF | 255 - (local150 & 0xFF) << 24, 1);
								}
								if (Static40.aBoolean61) {
									if (arg6) {
										Static82.method9318(local73, local59, local66, local54);
									} else {
										Static70.method1123(local59, local73, local66, local54);
									}
								}
							} else {
								@Pc(1369) Class204 local1369;
								if (local27.anInt1391 == 4) {
									@Pc(1339) Class80 local1339 = local27.method1275(Static457.aClass57_11);
									if (local1339 != null) {
										local302 = local27.anInt1382;
										@Pc(1358) String local1358 = local27.aString25;
										if (local27.anInt1419 != -1) {
											local1369 = Static201.aClass127_1.method2501(local27.anInt1419);
											local1358 = local1369.aString72;
											if (local1358 == null) {
												local1358 = "null";
											}
											if ((local1369.anInt5690 == 1 || local27.anInt1369 != 1) && local27.anInt1369 != -1) {
												local1358 = "<col=ff9040>" + local1358 + "</col> x" + Static591.method8543(local27.anInt1369);
											}
										}
										if (local27.anInt1345 != -1) {
											local1358 = Static361.method5371(local27.anInt1345);
											if (local1358 == null) {
												local1358 = "";
											}
										}
										if (local27 == Static24.aClass73_3) {
											local1358 = Static582.aClass335_32.method8349(Static323.anInt5795);
											local302 = local27.anInt1382;
										}
										if (Static315.aBoolean431) {
											Static457.aClass57_11.T(local129, local135, local27.anInt1384 + local129, local27.anInt1394 + local135);
										}
										local1339.method8799(Static575.aClass134Array15, local27.anInt1415, local27.aBoolean137 ? 255 - (local150 & 0xFF) << 24 : -1, local1358, local27.anInt1402, 0, local27.anInt1384, local135, local27.anInt1334, 0, local129, local302 | 255 - (local150 & 0xFF) << 24, local27.anInt1422, local27.anInt1394, (Class1) null, (int[]) null);
										if (Static315.aBoolean431) {
											Static457.aClass57_11.KA(arg8, arg9, arg2, arg1);
										}
										if (local1358.trim().length() > 0) {
											if (!Static315.aBoolean431) {
												@Pc(1555) Class224 local1555 = Static607.method8685(local27.anInt1358, Static457.aClass57_11);
												local746 = local1555.method5259(local27.anInt1384, Static575.aClass134Array15, local1358);
												local748 = local1555.method5251(Static575.aClass134Array15, local27.anInt1384, local27.anInt1334, local1358);
												if (Static40.aBoolean61) {
													if (arg6) {
														Static82.method9318(local748 + local135, local135, local746 + local129, local129);
													} else {
														Static70.method1123(local135, local135 + local748, local129 - -local746, local129);
													}
												}
											} else if (Static40.aBoolean61) {
												if (arg6) {
													Static82.method9318(local73, local59, local66, local54);
												} else {
													Static70.method1123(local59, local73, local66, local54);
												}
											}
										}
									} else if (Static45.aBoolean764) {
										Static298.method4399(local27);
									}
								} else {
									@Pc(1733) int local1733;
									if (local27.anInt1391 == 5) {
										if (local27.anInt1413 >= 0) {
											local27.method1272(Static112.aClass321_1, Static162.aClass181_1).method7507(local27.anInt1327 << 3, local129, Static457.aClass57_11, local135, 0, local27.anInt1399 << 3, 0, local27.anInt1384, local27.anInt1394);
										} else {
											@Pc(1682) Class134 local1682;
											if (local27.anInt1419 != -1) {
												@Pc(1664) Class100 local1664 = local27.aBoolean131 ? Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aClass100_1 : null;
												local1682 = Static201.aClass127_1.method2502(local1664, local27.anInt1333 | 0xFF000000, local27.anInt1369, local27.anInt1411, Static457.aClass57_11, local27.anInt1348, local27.anInt1419);
											} else if (local27.anInt1345 == -1) {
												local1682 = local27.method1293(Static457.aClass57_11);
											} else {
												local1682 = Static291.method4318(Static457.aClass57_11, local27.anInt1345);
											}
											if (local1682 != null) {
												local302 = local1682.method9231();
												local711 = local1682.method9232();
												local1733 = 255 - (local150 & 0xFF) << 24 | (local27.anInt1382 == 0 ? 16777215 : local27.anInt1382 & 0xFFFFFF);
												if (local27.aBoolean132) {
													Static457.aClass57_11.T(local129, local135, local27.anInt1384 + local129, local135 - -local27.anInt1394);
													if (local27.anInt1361 != 0) {
														local746 = (local27.anInt1384 + local302 - 1) / local302;
														local748 = (local27.anInt1394 + local711 - 1) / local711;
														for (local761 = 0; local761 < local746; local761++) {
															for (local875 = 0; local875 < local748; local875++) {
																if (local27.anInt1382 == 0) {
																	local1682.method9221((float) local302 / 2.0F + (float) (local761 * local302 + local129), (float) local711 / 2.0F + (float) (local135 - -(local711 * local875)), 4096, local27.anInt1361);
																} else {
																	local1682.method9217((float) local302 / 2.0F + (float) (local129 + local302 * local761), (float) local711 / 2.0F + (float) (local135 + local875 * local711), 4096, local27.anInt1361, local1733);
																}
															}
														}
													} else if (local27.anInt1382 == 0 && local150 == 0) {
														local1682.method9240(local129, local135, local27.anInt1384, local27.anInt1394);
													} else {
														local1682.method9222(local129, local135, local27.anInt1384, local27.anInt1394, 0, local1733, 1);
													}
													Static457.aClass57_11.KA(arg8, arg9, arg2, arg1);
												} else if (local27.anInt1382 == 0 && local150 == 0) {
													if (local27.anInt1361 != 0) {
														local1682.method9221((float) local129 + (float) local27.anInt1384 / 2.0F, (float) local27.anInt1394 / 2.0F + (float) local135, local27.anInt1384 * 4096 / local302, local27.anInt1361);
													} else if (local27.anInt1384 == local302 && local27.anInt1394 == local711) {
														local1682.method9235(local129, local135);
													} else {
														local1682.method9227(local129, local135, local27.anInt1384, local27.anInt1394);
													}
												} else if (local27.anInt1361 != 0) {
													local1682.method9217((float) local27.anInt1384 / 2.0F + (float) local129, (float) local135 + (float) local27.anInt1394 / 2.0F, local27.anInt1384 * 4096 / local302, local27.anInt1361, local1733);
												} else if (local27.anInt1384 == local302 && local711 == local27.anInt1394) {
													local1682.method9230(local129, local135, 0, local1733, 1);
												} else {
													local1682.method9226(local129, local135, local27.anInt1384, local27.anInt1394, 0, local1733, 1);
												}
											} else if (Static45.aBoolean764) {
												Static298.method4399(local27);
											}
										}
										if (Static40.aBoolean61) {
											if (arg6) {
												Static82.method9318(local73, local59, local66, local54);
											} else {
												Static70.method1123(local59, local73, local66, local54);
											}
										}
									} else if (local27.anInt1391 == 6) {
										Static303.method4657();
										local1156 = null;
										@Pc(2128) Class164 local2128 = null;
										local711 = 0;
										@Pc(2173) Class165 local2173;
										@Pc(2186) Class100 local2186;
										if (local27.anInt1419 != -1) {
											local1369 = Static201.aClass127_1.method2501(local27.anInt1419);
											if (local1369 != null) {
												local1369 = local1369.method4856(local27.anInt1369);
												local2173 = local27.anInt1401 == -1 ? null : Static158.aClass317_1.method7882(local27.anInt1401, 100);
												local2186 = local27.aBoolean131 ? Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aClass100_1 : null;
												local2128 = local1369.method4868(local2186, 119, local27.anInt1335, local27.anInt1338, local27.anInt1373, 1, local2173, Static457.aClass57_11, 2048);
												if (local2128 == null) {
													Static298.method4399(local27);
												} else {
													local711 = -local2128.fa() >> 1;
												}
											}
										} else if (local27.anInt1374 == 5) {
											local1733 = local27.anInt1352;
											if (local1733 >= 0 && local1733 < 2048) {
												@Pc(2303) Class8_Sub1_Sub3_Sub2_Sub1 local2303 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local1733];
												@Pc(2316) Class165 local2316 = local27.anInt1401 == -1 ? null : Static158.aClass317_1.method7882(local27.anInt1401, 100);
												if (local2303 != null && (Static279.anInt4838 == local1733 || Static364.method5392(local2303.aString62) == local27.anInt1353)) {
													local2128 = local2303.aClass100_1.method1902((Class10[]) null, Static325.aClass231_1, Static457.aClass57_11, (Class165) null, Static356.aClass325_2, 0, 115, Static413.aClass118_1, local2316, Static201.aClass127_1, 0, Static133.aClass324_1, (int[]) null, local27.anInt1335, 0, Static158.aClass317_1, local27.anInt1373, local27.anInt1338, -1, 2048);
												}
											}
										} else if (local27.anInt1374 == 8 || local27.anInt1374 == 9) {
											@Pc(2160) Class5_Sub48 local2160 = Static507.method7441(local27.anInt1352, false);
											local2173 = local27.anInt1401 == -1 ? null : Static158.aClass317_1.method7882(local27.anInt1401, 100);
											if (local2160 != null) {
												local2186 = local27.aBoolean131 ? Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aClass100_1 : null;
												local2128 = local2160.method7976(local2186, local2173, local27.anInt1335, local27.anInt1338, Static457.aClass57_11, local27.anInt1374 == 9, local27.anInt1353, local27.anInt1373);
											}
										} else if (local27.anInt1401 == -1) {
											local2128 = local27.method1280(2048, -1, 0, local1156, -1, (Class165) null, Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aClass100_1, Static158.aClass317_1, Static133.aClass324_1, Static413.aClass118_1, Static457.aClass57_11, Static201.aClass127_1, Static325.aClass231_1, Static356.aClass325_2);
											if (local2128 == null && Static45.aBoolean764) {
												Static298.method4399(local27);
											}
										} else {
											@Pc(2254) Class165 local2254 = Static158.aClass317_1.method7882(local27.anInt1401, 100);
											local2128 = local27.method1280(2048, local27.anInt1373, local27.anInt1338, local1156, local27.anInt1335, local2254, Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aClass100_1, Static158.aClass317_1, Static133.aClass324_1, Static413.aClass118_1, Static457.aClass57_11, Static201.aClass127_1, Static325.aClass231_1, Static356.aClass325_2);
											if (local2128 == null && Static45.aBoolean764) {
												Static298.method4399(local27);
											}
										}
										if (local2128 != null) {
											if (local27.anInt1389 > 0) {
												local1733 = (local27.anInt1384 << 9) / local27.anInt1389;
											} else {
												local1733 = 512;
											}
											if (local27.anInt1380 > 0) {
												local746 = (local27.anInt1394 << 9) / local27.anInt1380;
											} else {
												local746 = 512;
											}
											local748 = local129 + local27.anInt1384 / 2;
											local761 = local135 + local27.anInt1394 / 2;
											if (!local27.aBoolean126) {
												local761 += local746 * local27.anInt1370 >> 9;
												local748 += local27.anInt1363 * local1733 >> 9;
											}
											Static158.aClass203_4.method8337();
											Static457.aClass57_11.method7657(Static158.aClass203_4);
											Static457.aClass57_11.DA(local748, local761, local1733, local746);
											Static457.aClass57_11.ya();
											if (local27.aBoolean136) {
												Static457.aClass57_11.C(false);
											}
											if (local27.aBoolean126) {
												Static113.aClass203_3.method8322(local27.anInt1408);
												Static113.aClass203_3.method8324(local27.anInt1392);
												Static113.aClass203_3.method8329(local27.anInt1344);
												Static113.aClass203_3.method8335(local27.anInt1363, local27.anInt1370, local27.anInt1381);
											} else {
												local875 = Class5_Sub12.anIntArray544[local27.anInt1408 << 3] * (local27.anInt1371 << 2) >> 14;
												local877 = Class5_Sub12.anIntArray543[local27.anInt1408 << 3] * (local27.anInt1371 << 2) >> 14;
												Static113.aClass203_3.method8338(-local27.anInt1344 << 3);
												Static113.aClass203_3.method8324(local27.anInt1392 << 3);
												Static113.aClass203_3.method8335(local27.anInt1346 << 2, (local27.anInt1328 << 2) + local875 + local711, (local27.anInt1328 << 2) + local877);
												Static113.aClass203_3.method8326(local27.anInt1408 << 3);
											}
											local27.method1290(Static44.anInt740, local2128, Static457.aClass57_11, Static113.aClass203_3);
											if (Static315.aBoolean431) {
												Static457.aClass57_11.T(local129, local135, local129 + local27.anInt1384, local135 - -local27.anInt1394);
											}
											if (local27.aBoolean126) {
												if (local27.aBoolean133) {
													local2128.method9092(Static113.aClass203_3, (Class8_Sub7) null, local27.anInt1371, 1);
												} else {
													local2128.method9073(Static113.aClass203_3, (Class8_Sub7) null, 1);
													if (local27.aClass8_Sub5_2 != null) {
														Static457.aClass57_11.method7728(local27.aClass8_Sub5_2.method4908());
													}
												}
											} else if (local27.aBoolean133) {
												local2128.method9092(Static113.aClass203_3, (Class8_Sub7) null, local27.anInt1371 << 2, 1);
											} else {
												local2128.method9073(Static113.aClass203_3, (Class8_Sub7) null, 1);
												if (local27.aClass8_Sub5_2 != null) {
													Static457.aClass57_11.method7728(local27.aClass8_Sub5_2.method4908());
												}
											}
											if (Static315.aBoolean431) {
												Static457.aClass57_11.KA(arg8, arg9, arg2, arg1);
											}
											if (local27.aBoolean136) {
												Static457.aClass57_11.C(true);
											}
										}
										if (Static40.aBoolean61) {
											if (arg6) {
												Static82.method9318(local73, local59, local66, local54);
											} else {
												Static70.method1123(local59, local73, local66, local54);
											}
										}
									} else if (local27.anInt1391 == 9) {
										if (local27.aBoolean135) {
											local711 = local27.anInt1384 + local129;
											local302 = local27.anInt1394 + local135;
											local1733 = local135;
										} else {
											local711 = local27.anInt1384 + local129;
											local1733 = local27.anInt1394 + local135;
											local302 = local135;
										}
										if (local27.anInt1343 == 1) {
											Static457.aClass57_11.method7686(local129, local302, local711, local1733, local27.anInt1382, 0);
										} else {
											Static457.aClass57_11.method7685(local129, local302, local711, local1733, local27.anInt1382, local27.anInt1343);
										}
										if (Static40.aBoolean61) {
											if (arg6) {
												Static82.method9318(local73, local59, local66, local54);
											} else {
												Static70.method1123(local59, local73, local66, local54);
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

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method3607(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7) {
		@Pc(14) Class12 local14 = Static268.aClass12Array1[99];
		for (@Pc(16) int local16 = 99; local16 > 0; local16--) {
			Static268.aClass12Array1[local16] = Static268.aClass12Array1[local16 - 1];
		}
		if (local14 == null) {
			local14 = new Class12(arg7, arg1, arg4, arg5, arg0, arg2, arg3, arg6);
		} else {
			local14.method257(arg0, arg1, arg6, arg5, arg4, arg7, arg3, arg2);
		}
		Static415.anInt9653++;
		Static473.anInt8017 = Static261.anInt4525;
		Static268.aClass12Array1[0] = local14;
	}

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "(I)V")
	public static void method3610() {
		Static28.aClass5_Sub16_Sub4_6.method6389();
		Static622.aClass5_Sub16_Sub4_8 = null;
		Static659.aClass208_145 = null;
		Static496.anInt8290 = 1;
	}
}

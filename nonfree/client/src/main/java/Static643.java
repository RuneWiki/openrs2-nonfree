import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static643 {

	@OriginalMember(owner = "client!vp", name = "u", descriptor = "Z")
	public static boolean aBoolean797 = false;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIIZI[Lclient!uf;IIIIB)V")
	public static void method9508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class357[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		Static607.aClass101_15.KA(arg9, arg8, arg0, arg2);
		for (@Pc(17) int local17 = 0; local17 < arg5.length; local17++) {
			@Pc(23) Class357 local23 = arg5[local17];
			if (local23 != null && (local23.anInt10449 == arg7 || arg7 == -1412584499 && Static267.aClass357_180 == local23)) {
				@Pc(42) int local42 = local23.anInt10431 + arg4;
				@Pc(47) int local47 = arg1 + local23.anInt10407;
				@Pc(54) int local54 = local23.anInt10395 + local42 + 1;
				@Pc(61) int local61 = local23.anInt10465 + local47 + 1;
				@Pc(67) int local67;
				if (arg6 == -1) {
					Class33.aRectangleArray1[Static254.anInt4901].setBounds(arg4 + local23.anInt10431, local23.anInt10407 - -arg1, local23.anInt10395, local23.anInt10465);
					local67 = Static254.anInt4901++;
				} else {
					local67 = arg6;
				}
				local23.anInt10394 = Static62.anInt1184;
				local23.anInt10421 = local67;
				if (!Static85.method1479(local23)) {
					if (local23.anInt10454 != 0) {
						Static126.method2282(local23);
					}
					@Pc(113) int local113 = local23.anInt10431 + arg4;
					@Pc(118) int local118 = arg1 + local23.anInt10407;
					@Pc(120) int local120 = 0;
					@Pc(122) int local122 = 0;
					if (Static450.aBoolean606) {
						local120 = Static106.method1934();
						local122 = Static207.method3926();
					}
					@Pc(133) int local133 = local23.anInt10452;
					if (Static214.aBoolean351 && (Static85.method1469(local23).anInt1168 != 0 || local23.anInt10430 == 0) && local133 > 127) {
						local133 = 127;
					}
					@Pc(183) int local183;
					@Pc(191) int local191;
					if (Static267.aClass357_180 == local23) {
						if (arg7 != -1412584499 && (Static449.anInt8142 == local23.anInt10461 || Static77.anInt1433 == local23.anInt10461)) {
							Static504.anInt8988 = arg4;
							Static478.aClass357Array1 = arg5;
							Static73.anInt1410 = arg1;
							continue;
						}
						if (Static36.aBoolean34 && Static95.aBoolean119) {
							local183 = Static7.aClass6_1.method7048() + local120;
							local191 = local122 + Static7.aClass6_1.method7049();
							local183 -= Static598.anInt10390;
							local191 -= Static605.anInt10578;
							if (Static535.anInt9366 > local183) {
								local183 = Static535.anInt9366;
							}
							if (local183 + local23.anInt10395 > Static535.anInt9366 - -Static539.aClass357_140.anInt10395) {
								local183 = Static535.anInt9366 + Static539.aClass357_140.anInt10395 - local23.anInt10395;
							}
							if (Static541.anInt9462 > local191) {
								local191 = Static541.anInt9462;
							}
							if (Static541.anInt9462 + Static539.aClass357_140.anInt10465 < local23.anInt10465 + local191) {
								local191 = Static541.anInt9462 + Static539.aClass357_140.anInt10465 - local23.anInt10465;
							}
							local113 = local183;
							local118 = local191;
						}
						if (Static77.anInt1433 == local23.anInt10461) {
							local133 = 128;
						}
					}
					@Pc(282) int local282;
					@Pc(278) int local278;
					@Pc(291) int local291;
					@Pc(296) int local296;
					if (local23.anInt10430 == 2) {
						local278 = arg2;
						local183 = arg9;
						local282 = arg0;
						local191 = arg8;
					} else {
						local291 = local113 + local23.anInt10395;
						local296 = local23.anInt10465 + local118;
						if (local23.anInt10430 == 9) {
							local296++;
							local291++;
						}
						local191 = local118 > arg8 ? local118 : arg8;
						local183 = arg9 < local113 ? local113 : arg9;
						local278 = arg2 <= local296 ? arg2 : local296;
						local282 = local291 < arg0 ? local291 : arg0;
					}
					if (local183 < local282 && local278 > local191) {
						@Pc(626) int local626;
						@Pc(672) int local672;
						@Pc(768) int local768;
						@Pc(770) int local770;
						@Pc(659) int local659;
						@Pc(661) int local661;
						if (local23.anInt10454 != 0) {
							if (local23.anInt10454 == Static496.anInt8843 || Static666.anInt11367 == local23.anInt10454) {
								Static76.method1365(local113, local23, local118);
								if (!Static450.aBoolean606) {
									Static443.method7176(local118, local113, local23.anInt10465, Static666.anInt11367 == local23.anInt10454, local23.anInt10395);
									Static607.aClass101_15.KA(arg9, arg8, arg0, arg2);
								}
								Static561.aBooleanArray58[local67] = true;
								continue;
							}
							if (local23.anInt10454 == Static97.anInt1734) {
								if (local23.method8989(Static607.aClass101_15) != null) {
									Static25.method456();
									Static363.method6181(local23, Static607.aClass101_15, local113, local118);
									Static531.aBooleanArray54[local67] = true;
									Static607.aClass101_15.KA(arg9, arg8, arg0, arg2);
									if (Static450.aBoolean606) {
										if (arg3) {
											Static220.method4070(local61, local47, local42, local54);
										} else {
											Static336.method5644(local54, local47, local61, local42);
										}
									}
								}
								continue;
							}
							if (local23.anInt10454 == Static109.anInt1990) {
								Static17.method7632(Static607.aClass101_15, local23, local113, local118);
								continue;
							}
							if (Static522.anInt9194 == local23.anInt10454) {
								Static500.method7874(local23.anInt10411 % 64, local118, local23, Static607.aClass101_15, local113);
								continue;
							}
							if (local23.anInt10454 == Static254.anInt4900) {
								if (local23.method8989(Static607.aClass101_15) != null) {
									Static578.method6240(local113, local118, local23);
									Static531.aBooleanArray54[local67] = true;
									Static607.aClass101_15.KA(arg9, arg8, arg0, arg2);
									if (Static450.aBoolean606) {
										if (arg3) {
											Static220.method4070(local61, local47, local42, local54);
										} else {
											Static336.method5644(local54, local47, local61, local42);
										}
									}
								}
								continue;
							}
							if (local23.anInt10454 == Static372.anInt7094) {
								Static662.method8956(local113, local118, Static607.aClass101_15, local23.anInt10465, local23.anInt10395, Static117.anInterface3_2);
								Static561.aBooleanArray58[local67] = true;
								Static607.aClass101_15.KA(arg9, arg8, arg0, arg2);
								continue;
							}
							if (Static226.anInt4601 == local23.anInt10454) {
								Static384.method6478(local23.anInt10465, Static607.aClass101_15, local118, local113, local23.anInt10395);
								Static561.aBooleanArray58[local67] = true;
								Static607.aClass101_15.KA(arg9, arg8, arg0, arg2);
								continue;
							}
							if (Static650.anInt11186 == local23.anInt10454) {
								if (!Static586.aBoolean742 && !Static130.aBoolean189) {
									continue;
								}
								local291 = local113 + local23.anInt10395;
								if (Static450.aBoolean606) {
									if (arg3) {
										Static220.method4070(local61, local47, local42, local54);
									} else {
										Static336.method5644(local54, local47, local61, local42);
									}
								}
								local296 = local118 + 15;
								if (Static586.aBoolean742) {
									local626 = -256;
									if (Static645.anInt10074 < 20) {
										local626 = -65536;
									}
									Static230.aClass59_3.method9570(local626, "Fps:" + Static645.anInt10074, -1, local291, local296);
									local296 += 15;
									@Pc(650) Runtime local650 = Runtime.getRuntime();
									local659 = (int) ((local650.totalMemory() - local650.freeMemory()) / 1024L);
									local661 = -256;
									if (local659 > 98304) {
										local661 = -65536;
										if (Static464.aBoolean611) {
											Static312.method5100();
											for (local672 = 0; local672 < 10; local672++) {
												System.gc();
											}
											local659 = (int) ((local650.totalMemory() - local650.freeMemory()) / 1024L);
											if (local659 > 65536) {
												Static439.method7152("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
									}
									Static230.aClass59_3.method9570(local661, "Mem:" + local659 + "k", -1, local291, local296);
									local296 += 15;
									Static230.aClass59_3.method9570(-256, "In:" + Static146.anInt11237 + "B/s Out:" + Static425.anInt7809 + "B/s", -1, local291, local296);
									local296 += 15;
									local672 = Static607.aClass101_15.E() / 1024;
									Static230.aClass59_3.method9570(local672 <= 65536 ? -256 : -65536, "Offheap:" + local672 + "k", -1, local291, local296);
									local296 += 15;
									local768 = 0;
									local770 = 0;
									@Pc(772) int local772 = 0;
									for (@Pc(774) int local774 = 0; local774 < 37; local774++) {
										if (Static534.aClass51_Sub1Array12[local774] != null) {
											local768 += Static534.aClass51_Sub1Array12[local774].method8053();
											local770 += Static534.aClass51_Sub1Array12[local774].method8055();
											local772 += Static534.aClass51_Sub1Array12[local774].method8054();
										}
									}
									@Pc(814) int local814 = local772 * 100 / local768;
									@Pc(820) int local820 = local770 * 10000 / local768;
									@Pc(840) String local840 = "Cache:" + Static89.method1567((long) local820, 0, 2, true) + "% (" + local814 + "%)";
									Static514.aClass59_13.method9570(-256, local840, -1, local291, local296);
									local296 += 12;
								}
								if (Static211.anInt4371 > 0) {
									Static514.aClass59_13.method9570(-256, "Particles: " + Static3.anInt10076 + " / " + Static211.anInt4371, -1, local291, local296);
								}
								local296 += 12;
								if (Static130.aBoolean189) {
									Static514.aClass59_13.method9570(-256, "Polys: " + Static607.aClass101_15.I() + " Models: " + Static607.aClass101_15.M(), -1, local291, local296);
									local296 += 12;
									Static514.aClass59_13.method9570(-256, "Ls: " + Static107.anInt1977 + " La: " + Static404.anInt7481 + " NPC: " + Static60.anInt1163 + " Pl: " + Static573.anInt10004, -1, local291, local296);
									local296 += 12;
									Static34.method583();
								}
								Static561.aBooleanArray58[local67] = true;
								continue;
							}
						}
						@Pc(1013) Class2_Sub20 local1013;
						if (local23.anInt10430 == 0) {
							if (Static247.anInt4856 == local23.anInt10454 && Static607.aClass101_15.method8101()) {
								Static607.aClass101_15.method8076(local113, local118, local23.anInt10395, local23.anInt10465);
							}
							method9508(local282, local118 - local23.anInt10458, local278, arg3, local113 - local23.anInt10403, arg5, local67, local23.anInt10460, local191, local183);
							if (local23.aClass357Array2 != null) {
								method9508(local282, local118 - local23.anInt10458, local278, arg3, local113 - local23.anInt10403, local23.aClass357Array2, local67, local23.anInt10460, local191, local183);
							}
							local1013 = (Class2_Sub20) Static507.aClass335_33.method8357((long) local23.anInt10460);
							if (local1013 != null) {
								Static365.method6184(local183, local113, local67, local282, local278, local118, local191, local1013.anInt1667);
							}
							if (Static247.anInt4856 == local23.anInt10454 && Static607.aClass101_15.method8101()) {
								Static607.aClass101_15.method8116();
							}
							Static607.aClass101_15.KA(arg9, arg8, arg0, arg2);
						}
						if (Static520.aBooleanArray52[local67] || Static286.anInt5256 > 1) {
							if (local23.anInt10430 == 3) {
								if (local133 == 0) {
									if (local23.aBoolean758) {
										Static607.aClass101_15.aa(local113, local118, local23.anInt10395, local23.anInt10465, local23.anInt10411, 0);
									} else {
										Static607.aClass101_15.method8129(local113, local118, local23.anInt10395, local23.anInt10465, local23.anInt10411, 0);
									}
								} else if (local23.aBoolean758) {
									Static607.aClass101_15.aa(local113, local118, local23.anInt10395, local23.anInt10465, local23.anInt10411 & 0xFFFFFF | 255 - (local133 & 0xFF) << 24, 1);
								} else {
									Static607.aClass101_15.method8129(local113, local118, local23.anInt10395, local23.anInt10465, 255 - (local133 & 0xFF) << 24 | local23.anInt10411 & 0xFFFFFF, 1);
								}
								if (Static450.aBoolean606) {
									if (arg3) {
										Static220.method4070(local61, local47, local42, local54);
									} else {
										Static336.method5644(local54, local47, local61, local42);
									}
								}
							} else {
								@Pc(1192) Class351 local1192;
								if (local23.anInt10430 == 4) {
									@Pc(1167) Class59 local1167 = local23.method8978(Static607.aClass101_15);
									if (local1167 != null) {
										local296 = local23.anInt10411;
										@Pc(1182) String local1182 = local23.aString123;
										if (local23.anInt10396 != -1) {
											local1192 = Static372.aClass343_1.method8549(local23.anInt10396);
											local1182 = local1192.aString119;
											if (local1182 == null) {
												local1182 = "null";
											}
											if ((local1192.anInt10211 == 1 || local23.anInt10398 != 1) && local23.anInt10398 != -1) {
												local1182 = "<col=ff9040>" + local1182 + "</col> x" + Static191.method3701(local23.anInt10398);
											}
										}
										if (local23.anInt10439 != -1) {
											local1182 = Static330.method5447(local23.anInt10439);
											if (local1182 == null) {
												local1182 = "";
											}
										}
										if (local23 == Static122.aClass357_40) {
											local1182 = Static205.aClass134_31.method3906(Static204.anInt8130);
											local296 = local23.anInt10411;
										}
										if (Static372.aBoolean537) {
											Static607.aClass101_15.T(local113, local118, local23.anInt10395 + local113, local118 - -local23.anInt10465);
										}
										local1167.method9573(local23.anInt10479, local23.anInt10416, local1182, local23.anInt10443, 0, local23.anInt10465, local113, local23.anInt10395, (int[]) null, (Class1) null, local118, 0, Static622.aClass71Array42, local23.anInt10415, 255 - (local133 & 0xFF) << 24 | local296, local23.aBoolean766 ? 255 - (local133 & 0xFF) << 24 : -1);
										if (Static372.aBoolean537) {
											Static607.aClass101_15.KA(arg9, arg8, arg0, arg2);
										}
										if (local1182.trim().length() > 0) {
											if (!Static372.aBoolean537) {
												@Pc(1355) Class324 local1355 = Static138.method2435(Static607.aClass101_15, local23.anInt10397);
												local659 = local1355.method8177(local23.anInt10395, local1182, Static622.aClass71Array42);
												local661 = local1355.method8178(local23.anInt10395, local1182, Static622.aClass71Array42, local23.anInt10416);
												if (Static450.aBoolean606) {
													if (arg3) {
														Static220.method4070(local661 + local118, local118, local113, local113 + local659);
													} else {
														Static336.method5644(local659 + local113, local118, local118 + local661, local113);
													}
												}
											} else if (Static450.aBoolean606) {
												if (arg3) {
													Static220.method4070(local61, local47, local42, local54);
												} else {
													Static336.method5644(local54, local47, local61, local42);
												}
											}
										}
									} else if (Static424.aBoolean578) {
										Static473.method7526(local23);
									}
								} else {
									@Pc(1529) int local1529;
									if (local23.anInt10430 == 5) {
										if (local23.anInt10456 >= 0) {
											local23.method8990(Static6.aClass176_1, Static462.aClass299_1).method6717(local23.anInt10465, local118, Static607.aClass101_15, local23.anInt10448 << 3, local23.anInt10483 << 3, local23.anInt10395, local113, 0, 0);
										} else {
											@Pc(1456) Class71 local1456;
											if (local23.anInt10396 != -1) {
												@Pc(1474) Class9 local1474 = local23.aBoolean763 ? Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aClass9_1 : null;
												local1456 = Static372.aClass343_1.method8554(local23.anInt10433, local23.anInt10400, Static607.aClass101_15, local23.anInt10481 | 0xFF000000, local23.anInt10398, local1474, local23.anInt10396);
											} else if (local23.anInt10439 == -1) {
												local1456 = local23.method8992(Static607.aClass101_15);
											} else {
												local1456 = Static456.method7305(local23.anInt10439, Static607.aClass101_15);
											}
											if (local1456 != null) {
												local296 = local1456.method7709();
												local626 = local1456.method7711();
												local1529 = (local23.anInt10411 == 0 ? 16777215 : local23.anInt10411 & 0xFFFFFF) | 255 - (local133 & 0xFF) << 24;
												if (local23.aBoolean754) {
													Static607.aClass101_15.T(local113, local118, local113 + local23.anInt10395, local23.anInt10465 + local118);
													if (local23.anInt10464 != 0) {
														local659 = (local296 + local23.anInt10395 - 1) / local296;
														local661 = (local23.anInt10465 + local626 - 1) / local626;
														for (local672 = 0; local672 < local659; local672++) {
															for (local768 = 0; local768 < local661; local768++) {
																if (local23.anInt10411 == 0) {
																	local1456.method7688((float) local296 / 2.0F + (float) (local113 + local672 * local296), (float) (local118 - -(local626 * local768)) + (float) local626 / 2.0F, 4096, local23.anInt10464);
																} else {
																	local1456.method7710((float) local296 / 2.0F + (float) (local113 + local672 * local296), (float) local626 / 2.0F + (float) (local768 * local626 + local118), 4096, local23.anInt10464, local1529);
																}
															}
														}
													} else if (local23.anInt10411 == 0 && local133 == 0) {
														local1456.method7701(local113, local118, local23.anInt10395, local23.anInt10465);
													} else {
														local1456.method7698(local113, local118, local23.anInt10395, local23.anInt10465, 0, local1529, 1);
													}
													Static607.aClass101_15.KA(arg9, arg8, arg0, arg2);
												} else if (local23.anInt10411 == 0 && local133 == 0) {
													if (local23.anInt10464 != 0) {
														local1456.method7688((float) local23.anInt10395 / 2.0F + (float) local113, (float) local118 + (float) local23.anInt10465 / 2.0F, local23.anInt10395 * 4096 / local296, local23.anInt10464);
													} else if (local23.anInt10395 == local296 && local23.anInt10465 == local626) {
														local1456.method7703(local113, local118);
													} else {
														local1456.method7699(local113, local118, local23.anInt10395, local23.anInt10465);
													}
												} else if (local23.anInt10464 != 0) {
													local1456.method7710((float) local113 + (float) local23.anInt10395 / 2.0F, (float) local118 + (float) local23.anInt10465 / 2.0F, local23.anInt10395 * 4096 / local296, local23.anInt10464, local1529);
												} else if (local296 == local23.anInt10395 && local23.anInt10465 == local626) {
													local1456.method7697(local113, local118, 0, local1529, 1);
												} else {
													local1456.method7702(local113, local118, local23.anInt10395, local23.anInt10465, 0, local1529, 1);
												}
											} else if (Static424.aBoolean578) {
												Static473.method7526(local23);
											}
										}
										if (Static450.aBoolean606) {
											if (arg3) {
												Static220.method4070(local61, local47, local42, local54);
											} else {
												Static336.method5644(local54, local47, local61, local42);
											}
										}
									} else if (local23.anInt10430 == 6) {
										Static278.method4677();
										local1013 = null;
										@Pc(1867) Class14 local1867 = null;
										local626 = 0;
										@Pc(1900) Class178 local1900;
										@Pc(1908) Class9 local1908;
										if (local23.anInt10396 != -1) {
											local1192 = Static372.aClass343_1.method8549(local23.anInt10396);
											if (local1192 != null) {
												local1192 = local1192.method8827(local23.anInt10398);
												local1900 = local23.anInt10446 == -1 ? null : Static354.aClass40_2.method1123(local23.anInt10446);
												local1908 = local23.aBoolean763 ? Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aClass9_1 : null;
												local1867 = local1192.method8831(local1900, local23.anInt10467, 1, local23.anInt10408, 2048, local1908, local23.anInt10475, Static607.aClass101_15);
												if (local1867 == null) {
													Static473.method7526(local23);
												} else {
													local626 = -local1867.fa() >> 1;
												}
											}
										} else if (local23.anInt10404 == 5) {
											local1529 = local23.anInt10441;
											if (local1529 >= 0 && local1529 < 2048) {
												@Pc(1957) Class15_Sub3_Sub3_Sub1_Sub1 local1957 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local1529];
												@Pc(1970) Class178 local1970 = local23.anInt10446 == -1 ? null : Static354.aClass40_2.method1123(local23.anInt10446);
												if (local1957 != null && (local1529 == Static659.anInt11273 || Static5.method93(local1957.aString29) == local23.anInt10450)) {
													local1867 = local1957.aClass9_1.method145(2048, Static113.aClass282_1, local23.anInt10475, local1970, (int[]) null, local23.anInt10408, Static42.aClass96_2, Static354.aClass40_2, 0, 0, Static522.aClass272_2, (Class178) null, local23.anInt10467, Static607.aClass101_15, -1, Static372.aClass343_1, 0, Static665.aClass267_2, (Class171[]) null);
												}
											}
										} else if (local23.anInt10404 == 8 || local23.anInt10404 == 9) {
											@Pc(2031) Class2_Sub42 local2031 = Static47.method979(false, local23.anInt10441);
											local1900 = local23.anInt10446 == -1 ? null : Static354.aClass40_2.method1123(local23.anInt10446);
											if (local2031 != null) {
												local1908 = local23.aBoolean763 ? Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aClass9_1 : null;
												local1867 = local2031.method6585(local23.anInt10450, local23.anInt10404 == 9, Static607.aClass101_15, local23.anInt10475, local1908, local23.anInt10467, local23.anInt10408, local1900);
											}
										} else if (local23.anInt10446 == -1) {
											local1867 = local23.method8980(0, Static372.aClass343_1, Static113.aClass282_1, (Class178) null, Static354.aClass40_2, Static522.aClass272_2, -1, Static607.aClass101_15, -1, Static42.aClass96_2, Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aClass9_1, 2048, Static665.aClass267_2, local1013);
											if (local1867 == null && Static424.aBoolean578) {
												Static473.method7526(local23);
											}
										} else {
											@Pc(2090) Class178 local2090 = Static354.aClass40_2.method1123(local23.anInt10446);
											local1867 = local23.method8980(local23.anInt10467, Static372.aClass343_1, Static113.aClass282_1, local2090, Static354.aClass40_2, Static522.aClass272_2, local23.anInt10475, Static607.aClass101_15, local23.anInt10408, Static42.aClass96_2, Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aClass9_1, 2048, Static665.aClass267_2, local1013);
											if (local1867 == null && Static424.aBoolean578) {
												Static473.method7526(local23);
											}
										}
										if (local1867 != null) {
											if (local23.anInt10480 <= 0) {
												local1529 = 512;
											} else {
												local1529 = (local23.anInt10395 << 9) / local23.anInt10480;
											}
											if (local23.anInt10444 <= 0) {
												local659 = 512;
											} else {
												local659 = (local23.anInt10465 << 9) / local23.anInt10444;
											}
											local661 = local23.anInt10395 / 2 + local113;
											local672 = local23.anInt10465 / 2 + local118;
											if (!local23.aBoolean753) {
												local661 += local1529 * local23.anInt10484 >> 9;
												local672 += local23.anInt10425 * local659 >> 9;
											}
											Static435.aClass76_13.method9631();
											Static607.aClass101_15.method8067(Static435.aClass76_13);
											Static607.aClass101_15.DA(local661, local672, local1529, local659);
											Static607.aClass101_15.ya();
											if (local23.aBoolean765) {
												Static607.aClass101_15.C(false);
											}
											if (local23.aBoolean753) {
												Static92.aClass76_16.method9637(local23.anInt10414);
												Static92.aClass76_16.method9634(local23.anInt10399);
												Static92.aClass76_16.method9627(local23.anInt10469);
												Static92.aClass76_16.method9640(local23.anInt10484, local23.anInt10425, local23.anInt10471);
											} else {
												local768 = Class12_Sub2.anIntArray204[local23.anInt10414 << 3] * (local23.anInt10455 << 2) >> 14;
												local770 = Class12_Sub2.anIntArray203[local23.anInt10414 << 3] * (local23.anInt10455 << 2) >> 14;
												Static92.aClass76_16.method9632(-local23.anInt10469 << 3);
												Static92.aClass76_16.method9634(local23.anInt10399 << 3);
												Static92.aClass76_16.method9640(local23.anInt10445 << 2, local768 + (local23.anInt10422 << 2) + local626, (local23.anInt10422 << 2) + local770);
												Static92.aClass76_16.method9630(local23.anInt10414 << 3);
											}
											local23.method8991(local1867, Static92.aClass76_16, Static62.anInt1184, Static607.aClass101_15);
											if (Static372.aBoolean537) {
												Static607.aClass101_15.T(local113, local118, local23.anInt10395 + local113, local23.anInt10465 + local118);
											}
											if (local23.aBoolean753) {
												if (local23.aBoolean757) {
													local1867.method8623(Static92.aClass76_16, (Class15_Sub6) null, local23.anInt10455, 1);
												} else {
													local1867.method8641(Static92.aClass76_16, (Class15_Sub6) null, 1);
													if (local23.aClass15_Sub5_8 != null) {
														Static607.aClass101_15.method8065(local23.aClass15_Sub5_8.method2304());
													}
												}
											} else if (local23.aBoolean757) {
												local1867.method8623(Static92.aClass76_16, (Class15_Sub6) null, local23.anInt10455 << 2, 1);
											} else {
												local1867.method8641(Static92.aClass76_16, (Class15_Sub6) null, 1);
												if (local23.aClass15_Sub5_8 != null) {
													Static607.aClass101_15.method8065(local23.aClass15_Sub5_8.method2304());
												}
											}
											if (Static372.aBoolean537) {
												Static607.aClass101_15.KA(arg9, arg8, arg0, arg2);
											}
											if (local23.aBoolean765) {
												Static607.aClass101_15.C(true);
											}
										}
										if (Static450.aBoolean606) {
											if (arg3) {
												Static220.method4070(local61, local47, local42, local54);
											} else {
												Static336.method5644(local54, local47, local61, local42);
											}
										}
									} else if (local23.anInt10430 == 9) {
										if (local23.aBoolean760) {
											local1529 = local118;
											local296 = local118 + local23.anInt10465;
											local626 = local23.anInt10395 + local113;
										} else {
											local1529 = local118 + local23.anInt10465;
											local296 = local118;
											local626 = local23.anInt10395 + local113;
										}
										if (local23.anInt10412 == 1) {
											Static607.aClass101_15.method8091(local113, local296, local626, local1529, local23.anInt10411, 0);
										} else {
											Static607.aClass101_15.method8132(local113, local296, local626, local1529, local23.anInt10411, local23.anInt10412);
										}
										if (Static450.aBoolean606) {
											if (arg3) {
												Static220.method4070(local61, local47, local42, local54);
											} else {
												Static336.method5644(local54, local47, local61, local42);
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

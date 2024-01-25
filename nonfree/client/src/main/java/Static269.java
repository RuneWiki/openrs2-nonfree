import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!r", name = "K", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!r", name = "O", descriptor = "Lclient!am;")
	public static Class11 aClass11_115;

	@OriginalMember(owner = "client!r", name = "Q", descriptor = "Lclient!ib;")
	public static Class23 aClass23_5;

	@OriginalMember(owner = "client!r", name = "T", descriptor = "I")
	public static int anInt5510;

	@OriginalMember(owner = "client!r", name = "R", descriptor = "I")
	public static int anInt5508 = 0;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZII)V")
	public static void method4689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class4_Sub1_Sub8 local12 = Static155.method2994(arg3, 10);
		local12.method2031();
		local12.anInt2405 = arg0;
		local12.anInt2403 = arg1;
		local12.anInt2410 = arg2;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I[Lclient!fd;IIBIIIII)V")
	public static void method4690(@OriginalArg(0) int arg0, @OriginalArg(1) Class72[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static164.aClass92_7.method4459(arg3, arg8, arg6, arg4);
		for (@Pc(21) int local21 = 0; local21 < arg1.length; local21++) {
			@Pc(27) Class72 local27 = arg1[local21];
			if (local27 != null && (local27.anInt1813 == arg7 || arg7 == -1412584499 && local27 == Static301.aClass72_19)) {
				@Pc(51) int local51;
				if (arg2 == -1) {
					Class2.aRectangleArray21[Static2.anInt5069].setBounds(local27.anInt1861 + arg0, arg5 + local27.anInt1854, local27.anInt1829, local27.anInt1806);
					local51 = Static2.anInt5069++;
				} else {
					local51 = arg2;
				}
				local27.anInt1856 = local51;
				local27.anInt1831 = Static342.anInt6706;
				if (!local27.aBoolean159 || !Static46.method886(local27)) {
					if (local27.anInt1804 > 0) {
						Static322.method5318(local27);
					}
					@Pc(99) int local99 = arg0 + local27.anInt1861;
					@Pc(104) int local104 = arg5 + local27.anInt1854;
					@Pc(107) int local107 = local27.anInt1847;
					if (Static93.aBoolean179 && (Static46.method876(local27).anInt269 != 0 || local27.anInt1825 == 0) && local107 > 127) {
						local107 = 127;
					}
					@Pc(151) int local151;
					@Pc(153) int local153;
					if (local27 == Static301.aClass72_19) {
						if (arg7 != -1412584499 && !local27.aBoolean161) {
							Static143.aClass72Array2 = arg1;
							Static98.anInt6647 = arg5;
							Static217.anInt4544 = arg0;
							continue;
						}
						if (Static181.aBoolean329 && Static205.aBoolean368) {
							local151 = Static38.anInt830;
							local153 = Static184.anInt4055;
							local151 -= Static72.anInt1627;
							if (local151 < Static277.anInt5631) {
								local151 = Static277.anInt5631;
							}
							local153 -= Static345.anInt6765;
							if (Static277.anInt5631 + Static352.aClass72_20.anInt1829 < local27.anInt1829 + local151) {
								local151 = Static352.aClass72_20.anInt1829 + Static277.anInt5631 - local27.anInt1829;
							}
							if (Static310.anInt6218 > local153) {
								local153 = Static310.anInt6218;
							}
							if (Static352.aClass72_20.anInt1806 + Static310.anInt6218 < local27.anInt1806 + local153) {
								local153 = Static310.anInt6218 + Static352.aClass72_20.anInt1806 - local27.anInt1806;
							}
							local99 = local151;
							local104 = local153;
						}
						if (!local27.aBoolean161) {
							local107 = 128;
						}
					}
					@Pc(232) int local232;
					@Pc(234) int local234;
					@Pc(246) int local246;
					@Pc(252) int local252;
					if (local27.anInt1825 == 2) {
						local232 = arg6;
						local234 = arg4;
						local151 = arg3;
						local153 = arg8;
					} else {
						local246 = local99 + local27.anInt1829;
						local252 = local104 + local27.anInt1806;
						local151 = arg3 < local99 ? local99 : arg3;
						local153 = arg8 >= local104 ? arg8 : local104;
						if (local27.anInt1825 == 9) {
							local252++;
							local246++;
						}
						local234 = arg4 <= local252 ? arg4 : local252;
						local232 = arg6 <= local246 ? arg6 : local246;
					}
					if (!local27.aBoolean159 || local151 < local232 && local234 > local153) {
						@Pc(509) int local509;
						@Pc(564) int local564;
						@Pc(566) int local566;
						@Pc(568) int local568;
						@Pc(570) int local570;
						@Pc(614) int local614;
						@Pc(511) int local511;
						@Pc(540) int local540;
						if (local27.anInt1804 != 0) {
							if (local27.anInt1804 == 1337 || local27.anInt1804 == 1403) {
								Static119.method2124(local27.anInt1804 == 1403, local104, local27.anInt1829, local99, local27.anInt1806);
								Static60.aBooleanArray8[local51] = true;
								Static164.aClass92_7.method4459(arg3, arg8, arg6, arg4);
								continue;
							}
							if (local27.anInt1804 == 1338) {
								if (local27.method1506(Static164.aClass92_7) != null) {
									Static294.method3383();
									Static106.method2006(Static164.aClass92_7, local27, local104, local99);
									Static128.aBooleanArray19[local51] = true;
									Static164.aClass92_7.method4459(arg3, arg8, arg6, arg4);
								}
								continue;
							}
							if (local27.anInt1804 == 1339) {
								if (local27.method1506(Static164.aClass92_7) != null) {
									Static208.method3649(local104, local27, local99);
									Static128.aBooleanArray19[local51] = true;
									Static164.aClass92_7.method4459(arg3, arg8, arg6, arg4);
								}
								continue;
							}
							if (local27.anInt1804 == 1400) {
								Static65.method1097(local27.anInt1806, Static164.aClass92_7, Static156.anInterface1_3, local104, local27.anInt1829, local99);
								Static60.aBooleanArray8[local51] = true;
								Static164.aClass92_7.method4459(arg3, arg8, arg6, arg4);
								continue;
							}
							if (local27.anInt1804 == 1401) {
								Static136.method2720(local99, local27.anInt1806, local104, local27.anInt1829, Static164.aClass92_7);
								Static60.aBooleanArray8[local51] = true;
								Static164.aClass92_7.method4459(arg3, arg8, arg6, arg4);
								continue;
							}
							if (local27.anInt1804 == 1405) {
								if (!Static258.aBoolean450 && !Static339.aBoolean581) {
									continue;
								}
								local246 = local27.anInt1829 + local99;
								local252 = local104 + 15;
								if (Static258.aBoolean450) {
									Static118.aClass78_3.method4054(local246, -256, local252, "Fps:" + Static173.anInt3835);
									local252 += 15;
									@Pc(500) Runtime local500 = Runtime.getRuntime();
									local509 = (int) ((local500.totalMemory() - local500.freeMemory()) / 1024L);
									local511 = -256;
									if (local509 > 65536) {
										local511 = -65536;
									}
									Static118.aClass78_3.method4054(local246, local511, local252, "Mem:" + local509 + "k");
									local252 += 15;
									local540 = Static164.aClass92_7.method4475() / 1024;
									Static118.aClass78_3.method4054(local246, local540 <= 65536 ? -256 : -65536, local252, "Offheap:" + local540 + "k");
									local252 += 15;
									local564 = 0;
									local566 = 0;
									local568 = 0;
									for (local570 = 0; local570 < 29; local570++) {
										local564 += Static67.aClass18_Sub1Array1[local570].method5618();
										local566 += Static67.aClass18_Sub1Array1[local570].method5610();
										local568 += Static67.aClass18_Sub1Array1[local570].method5616();
									}
									@Pc(608) int local608 = local568 * 100 / local564;
									local614 = local566 * 10000 / local564;
									@Pc(634) String local634 = "Cache:" + Static93.method1642(true, (long) local614, 0, 2) + "% (" + local608 + "%)";
									Static14.aClass78_1.method4054(local246, -256, local252, local634);
									local252 += 12;
								}
								if (Static167.anInt3706 > 0) {
									Static14.aClass78_1.method4054(local246, -256, local252, "Particles: " + Static116.anInt1033 + " / " + Static167.anInt3706);
								}
								local252 += 12;
								if (Static339.aBoolean581) {
									Static14.aClass78_1.method4054(local246, -256, local252, "Polys: " + Static164.aClass92_7.method4444() + " Models: " + Static164.aClass92_7.method4519());
									local252 += 12;
									Static14.aClass78_1.method4054(local246, -256, local252, "Ls: " + Static170.anInt3773 + " La: " + Static256.anInt5271 + " NPC: " + Static13.anInt306 + " Pl: " + Static294.anInt3994);
									local252 += 12;
									Static37.method716();
								}
								Static60.aBooleanArray8[local51] = true;
								continue;
							}
						}
						if (local27.anInt1825 == 0) {
							if (!local27.aBoolean159 && Static46.method886(local27) && Static55.aClass72_4 != local27) {
								continue;
							}
							if (!local27.aBoolean159) {
								if (local27.anInt1864 > local27.anInt1795 - local27.anInt1806) {
									local27.anInt1864 = local27.anInt1795 - local27.anInt1806;
								}
								if (local27.anInt1864 < 0) {
									local27.anInt1864 = 0;
								}
							}
							if (local27.anInt1804 == 1407 && Static164.aClass92_7.method4461()) {
								Static164.aClass92_7.method4535(local99, local104, local27.anInt1829, local27.anInt1806);
							}
							method4690(local99 - local27.anInt1841, arg1, local51, local151, local234, local104 - local27.anInt1864, local232, local27.anInt1830, local153);
							if (local27.aClass72Array1 != null) {
								method4690(local99 - local27.anInt1841, local27.aClass72Array1, local51, local151, local234, local104 - local27.anInt1864, local232, local27.anInt1830, local153);
							}
							@Pc(837) Class4_Sub8 local837 = (Class4_Sub8) Static38.aClass198_5.method5261((long) local27.anInt1830);
							if (local837 != null) {
								Static123.method2465(local51, local837.anInt1670, local104, local151, local234, local99, local153, local232);
							}
							if (local27.anInt1804 == 1407 && Static164.aClass92_7.method4461()) {
								Static164.aClass92_7.method4456();
								Static347.aBoolean590 = true;
							}
							Static164.aClass92_7.method4459(arg3, arg8, arg6, arg4);
						}
						if (Static105.aBooleanArray30[local51] || Static264.anInt3389 > 1) {
							if (local27.anInt1825 == 0 && !local27.aBoolean159 && local27.anInt1795 > local27.anInt1806) {
								Static294.method3380(local104, local27.anInt1864, local27.anInt1795, local27.anInt1806, local99 + local27.anInt1829);
							}
							if (local27.anInt1825 != 1) {
								@Pc(919) int local919;
								if (local27.anInt1825 == 2) {
									local246 = 0;
									for (local252 = 0; local252 < local27.anInt1799; local252++) {
										for (local919 = 0; local919 < local27.anInt1827; local919++) {
											local509 = local99 + local919 * (local27.anInt1881 + 32);
											local511 = local252 * (local27.anInt1848 + 32) + local104;
											if (local246 < 20) {
												local509 += local27.anIntArray186[local246];
												local511 += local27.anIntArray193[local246];
											}
											if (local27.anIntArray179[local246] > 0) {
												local566 = local27.anIntArray179[local246] - 1;
												if (local509 + 32 > arg3 && arg6 > local509 && arg8 < local511 + 32 && local511 < arg4 || Static215.aClass72_15 == local27 && Static49.anInt1090 == local246) {
													@Pc(1051) Class60 local1051;
													if (Static315.anInt1642 == 1 && Static165.anInt3377 == local246 && Static309.anInt6211 == local27.anInt1830) {
														local1051 = Static320.method5292(Static164.aClass92_7, 0, null, local27.anIntArray181[local246], local27.anInt1811, 2, local566);
													} else {
														local1051 = Static320.method5292(Static164.aClass92_7, -13623264, null, local27.anIntArray181[local246], local27.anInt1811, 1, local566);
													}
													if (local1051 == null) {
														Static238.method4097(local27);
													} else if (local27 == Static215.aClass72_15 && local246 == Static49.anInt1090) {
														local564 = Static184.anInt4055 - Static121.anInt2745;
														local540 = Static38.anInt830 - Static100.anInt2288;
														if (local540 < 5 && local540 > -5) {
															local540 = 0;
														}
														if (local564 < 5 && local564 > -5) {
															local564 = 0;
														}
														if (Static83.anInt1766 < 5) {
															local540 = 0;
															local564 = 0;
														}
														local1051.method5682(local509 + local540, local564 + local511, 0, -2013265920);
														if (arg7 != -1) {
															@Pc(1155) Class72 local1155 = arg1[arg7 & 0xFFFF];
															@Pc(1158) int[] local1158 = new int[4];
															Static164.aClass92_7.method4525(local1158);
															local614 = local1158[1];
															@Pc(1169) int local1169 = local1158[3];
															@Pc(1188) int local1188;
															if (local564 + local511 < local614 && local1155.anInt1864 > 0) {
																local1188 = Static106.anInt2370 * (local614 - local511 - local564) / 3;
																if (local1188 > Static106.anInt2370 * 10) {
																	local1188 = Static106.anInt2370 * 10;
																}
																if (local1188 > local1155.anInt1864) {
																	local1188 = local1155.anInt1864;
																}
																Static121.anInt2745 += local1188;
																local1155.anInt1864 -= local1188;
																Static238.method4097(local1155);
															}
															if (local1169 < local564 + local511 + 32 && local1155.anInt1795 - local1155.anInt1806 > local1155.anInt1864) {
																local1188 = Static106.anInt2370 * (local511 + local564 + 32 - local1169) / 3;
																if (Static106.anInt2370 * 10 < local1188) {
																	local1188 = Static106.anInt2370 * 10;
																}
																if (local1155.anInt1795 - local1155.anInt1864 - local1155.anInt1806 < local1188) {
																	local1188 = local1155.anInt1795 - local1155.anInt1864 - local1155.anInt1806;
																}
																Static121.anInt2745 -= local1188;
																local1155.anInt1864 += local1188;
																Static238.method4097(local1155);
															}
														}
													} else if (Static20.aClass72_1 == local27 && Static3.anInt39 == local246) {
														local1051.method5682(local509, local511, 0, -2013265920);
													} else {
														local1051.method5675(local509, local511);
													}
												}
											} else if (local27.anIntArray188 != null && local246 < 20) {
												@Pc(1328) Class60 local1328 = local27.method1515(Static164.aClass92_7, local246);
												if (local1328 != null) {
													local1328.method5675(local509, local511);
												} else if (Static83.aBoolean136) {
													Static238.method4097(local27);
												}
											}
											local246++;
										}
									}
								} else if (local27.anInt1825 == 3) {
									if (Static218.method3765(local27)) {
										local246 = local27.anInt1885;
										if (Static55.aClass72_4 == local27 && local27.anInt1860 != 0) {
											local246 = local27.anInt1860;
										}
									} else {
										local246 = local27.anInt1862;
										if (local27 == Static55.aClass72_4 && local27.anInt1868 != 0) {
											local246 = local27.anInt1868;
										}
									}
									if (local107 == 0) {
										if (local27.aBoolean160) {
											Static164.aClass92_7.method4436(local99, local104, local27.anInt1829, local27.anInt1806, local246, 0);
										} else {
											Static164.aClass92_7.method4495(local99, local104, local27.anInt1829, local27.anInt1806, local246, 0);
										}
									} else if (local27.aBoolean160) {
										Static164.aClass92_7.method4436(local99, local104, local27.anInt1829, local27.anInt1806, local246 & 0xFFFFFF | 255 - (local107 & 0xFF) << 24, 1);
									} else {
										Static164.aClass92_7.method4495(local99, local104, local27.anInt1829, local27.anInt1806, local246 & 0xFFFFFF | 255 - (local107 & 0xFF) << 24, 1);
									}
								} else {
									@Pc(1485) Class78 local1485;
									if (local27.anInt1825 == 4) {
										local1485 = local27.method1511(Static164.aClass92_7);
										if (local1485 != null) {
											@Pc(1497) String local1497 = local27.aString61;
											if (Static218.method3765(local27)) {
												local252 = local27.anInt1885;
												if (local27 == Static55.aClass72_4 && local27.anInt1860 != 0) {
													local252 = local27.anInt1860;
												}
												if (local27.aString62.length() > 0) {
													local1497 = local27.aString62;
												}
											} else {
												local252 = local27.anInt1862;
												if (local27 == Static55.aClass72_4 && local27.anInt1868 != 0) {
													local252 = local27.anInt1868;
												}
											}
											if (local27.aBoolean159 && local27.lb != -1) {
												@Pc(1549) Class142 local1549 = Static247.method4270(local27.lb);
												local1497 = local1549.aString165;
												if (local1497 == null) {
													local1497 = "null";
												}
												if ((local1549.anInt4459 == 1 || local27.anInt1807 != 1) && local27.anInt1807 != -1) {
													local1497 = "<col=ff9040>" + local1497 + "</col> x" + Static115.method2092(local27.anInt1807);
												}
											}
											if (Static251.aClass72_16 == local27) {
												local252 = local27.anInt1862;
												local1497 = Static163.aString119;
											}
											if (!local27.aBoolean159) {
												local1497 = Static202.method3585(local27, local1497);
											}
											if (Static126.aBoolean236) {
												Static164.aClass92_7.method4472(local99, local104, local27.anInt1829 + local99, local104 - -local27.anInt1806);
											}
											local1485.method4068(local27.anInt1829, 0, local27.aBoolean154 ? -16777216 : -1, null, local99, local27.anInt1819, local1497, local104, local27.anInt1806, 0, Static164.aClass60Array7, null, local27.anInt1873, local27.anInt1859, local252 | 0xFF000000);
											if (Static126.aBoolean236) {
												Static164.aClass92_7.method4459(arg3, arg8, arg6, arg4);
											}
										} else if (Static83.aBoolean136) {
											Static238.method4097(local27);
										}
									} else if (local27.anInt1825 == 5) {
										@Pc(1673) Class60 local1673;
										if (!local27.aBoolean159) {
											local1673 = local27.method1509(Static218.method3765(local27), Static164.aClass92_7);
											if (local1673 != null) {
												local1673.method5675(local99, local104);
											} else if (Static83.aBoolean136) {
												Static238.method4097(local27);
											}
										} else if (local27.anInt1865 >= 0) {
											local27.method1514().method4228(local99, Static164.aClass92_7, local27.anInt1890 << 3, 0, local27.anInt1806, local27.anInt1829, local27.anInt1875 << 3, local104, 0);
										} else {
											if (local27.lb == -1) {
												local1673 = local27.method1509(false, Static164.aClass92_7);
											} else {
												@Pc(1736) Class148 local1736 = local27.aBoolean151 ? Static110.aClass2_Sub2_Sub1_Sub1_1.aClass148_4 : null;
												local1673 = Static320.method5292(Static164.aClass92_7, local27.anInt1872 | 0xFF000000, local1736, local27.anInt1807, local27.anInt1811, local27.anInt1842, local27.lb);
											}
											if (local1673 != null) {
												local252 = local1673.method5683();
												local919 = local1673.method5691();
												if (local27.aBoolean146) {
													Static164.aClass92_7.method4472(local99, local104, local99 + local27.anInt1829, local27.anInt1806 + local104);
													if (local27.anInt1837 != 0) {
														local509 = (local27.anInt1829 + local252 - 1) / local252;
														local511 = (local919 + local27.anInt1806 - 1) / local919;
														for (local540 = 0; local540 < local509; local540++) {
															for (local564 = 0; local564 < local511; local564++) {
																local1673.method5685((float) (local252 * local540 + local99) + (float) local252 / 2.0F, (float) (local919 * local564 + local104) + (float) local919 / 2.0F, 4096, local27.anInt1837);
															}
														}
													} else if (local107 == 0) {
														local1673.method5689(local99, local104, local27.anInt1829, local27.anInt1806, 0, 0);
													} else {
														local1673.method5689(local99, local104, local27.anInt1829, local27.anInt1806, 1, 255 - (local107 & 0xFF) << 24 | 0xFFFFFF);
													}
													Static164.aClass92_7.method4459(arg3, arg8, arg6, arg4);
												} else if (local107 != 0) {
													local509 = 255 - (local107 & 0xFF) << 24 | 0xFFFFFF;
													if (local27.anInt1837 != 0) {
														local1673.method5681((float) local27.anInt1829 / 2.0F + (float) local99, (float) local27.anInt1806 / 2.0F + (float) local104, local27.anInt1829 * 4096 / local252, local27.anInt1837, local509);
													} else if (local27.anInt1829 == local252 && local27.anInt1806 == local919) {
														local1673.method5682(local99, local104, 1, local509);
													} else {
														local1673.method5692(local99, local104, local27.anInt1829, local27.anInt1806, 1, local509, 1);
													}
												} else if (local27.anInt1837 != 0) {
													local1673.method5685((float) local99 + (float) local27.anInt1829 / 2.0F, (float) local27.anInt1806 / 2.0F + (float) local104, local27.anInt1829 * 4096 / local252, local27.anInt1837);
												} else if (local252 == local27.anInt1829 && local919 == local27.anInt1806) {
													local1673.method5675(local99, local104);
												} else {
													local1673.method5688(local99, local104, local27.anInt1829, local27.anInt1806);
												}
											} else if (Static83.aBoolean136) {
												Static238.method4097(local27);
											}
										}
									} else {
										@Pc(2270) Class142 local2270;
										if (local27.anInt1825 == 6) {
											@Pc(2048) boolean local2048 = Static218.method3765(local27);
											if (local2048) {
												local252 = local27.anInt1866;
											} else {
												local252 = local27.anInt1836;
											}
											Static66.method1242();
											@Pc(2062) Class5 local2062 = null;
											local509 = 0;
											@Pc(2239) Class148 local2239;
											@Pc(2229) Class116 local2229;
											if (local27.lb != -1) {
												local2270 = Static247.method4270(local27.lb);
												if (local2270 != null) {
													local2270 = local2270.method3721(local27.anInt1807);
													local2229 = local252 == -1 ? null : Static340.method5560(local252);
													local2239 = local27.aBoolean151 ? Static110.aClass2_Sub2_Sub1_Sub1_1.aClass148_4 : null;
													local2062 = local2270.method3723(local27.anInt1832, Static164.aClass92_7, local27.anInt1821, 1, local2239, 1024, local2229, local27.anInt1808);
													if (local2062 == null) {
														Static238.method4097(local27);
													} else {
														local509 = -local2062.method4020() / 2;
													}
												}
											} else if (local27.anInt1794 == 5) {
												if (local27.anInt1879 == -1) {
													local2062 = Static113.aClass148_9.method3919(-1, null, -1, -1, -1, Static164.aClass92_7, null, null, 0, 0, 1024);
												} else {
													local511 = local27.anInt1879;
													@Pc(2103) Class2_Sub2_Sub1_Sub1 local2103;
													if (local511 == Static321.anInt6343) {
														local2103 = Static110.aClass2_Sub2_Sub1_Sub1_1;
													} else {
														local2103 = Static253.aClass2_Sub2_Sub1_Sub1Array1[local511];
													}
													@Pc(2118) Class116 local2118 = local252 == -1 ? null : Static340.method5560(local252);
													if (local2103 != null && (local511 == 2047 || Static171.method3209(local2103.aString22) == local27.anInt1822)) {
														local2062 = local2103.aClass148_4.method3919(local27.anInt1808, local2118, -1, 0, local27.anInt1821, Static164.aClass92_7, null, null, 0, local27.anInt1832, 1024);
													}
												}
											} else if (local27.anInt1794 == 8 || local27.anInt1794 == 9) {
												@Pc(2219) Class4_Sub41 local2219 = Static116.method870(local27.anInt1879);
												local2229 = local252 == -1 ? null : Static340.method5560(local252);
												if (local2219 != null) {
													local2239 = local27.aBoolean151 ? Static110.aClass2_Sub2_Sub1_Sub1_1.aClass148_4 : null;
													local2062 = local2219.method5598(local27.anInt1808, local27.anInt1822, local2239, local27.anInt1832, local27.anInt1794 == 9, Static164.aClass92_7, local27.anInt1821, local2229);
												}
											} else if (local252 == -1) {
												local2062 = local27.method1505(local2048, Static110.aClass2_Sub2_Sub1_Sub1_1.aClass148_4, Static164.aClass92_7, 1024, 0, -1, null, -1);
												if (local2062 == null && Static83.aBoolean136) {
													Static238.method4097(local27);
												}
											} else {
												@Pc(2169) Class116 local2169 = Static340.method5560(local252);
												local2062 = local27.method1505(local2048, Static110.aClass2_Sub2_Sub1_Sub1_1.aClass148_4, Static164.aClass92_7, 1024, local27.anInt1832, local27.anInt1808, local2169, local27.anInt1821);
												if (local2062 == null && Static83.aBoolean136) {
													Static238.method4097(local27);
												}
											}
											if (local2062 != null) {
												if (local27.anInt1889 > 0) {
													local511 = (local27.anInt1829 << 9) / local27.anInt1889;
												} else {
													local511 = 512;
												}
												if (local27.anInt1870 <= 0) {
													local540 = 512;
												} else {
													local540 = (local27.anInt1806 << 9) / local27.anInt1870;
												}
												local564 = local99 + local27.anInt1829 / 2 + (local27.anInt1816 * local511 >> 9);
												local566 = (local27.anInt1850 * local540 >> 9) + local104 + local27.anInt1806 / 2;
												aClass23_5.method5090();
												Static164.aClass92_7.method4530(aClass23_5);
												local568 = local27.anInt1878 * Class4_Sub4_Sub25.anIntArray384[local27.anInt1817 << 3] >> 15;
												local570 = Class4_Sub4_Sub25.anIntArray383[local27.anInt1817 << 3] * local27.anInt1878 >> 15;
												Static164.aClass92_7.method4520(local564, local566, local511, local540);
												Static164.aClass92_7.method4539((float) local27.aShort37, local27.aBoolean162 ? (float) local27.aShort38 : (float) local27.aShort38 * 1.5F);
												if (Static347.aBoolean590) {
													Static164.aClass92_7.method4467();
													Static164.aClass92_7.method4486();
													Static164.aClass92_7.method4459(arg3, arg8, arg6, arg4);
													Static347.aBoolean590 = false;
												}
												if (local27.aBoolean157) {
													Static164.aClass92_7.method4439(false);
												}
												if (local27.aBoolean159) {
													Static211.aClass23_1.method5098(-local27.anInt1857 << 3);
													Static211.aClass23_1.method5095(local27.anInt1867 << 3);
													Static211.aClass23_1.method5089(local27.anInt1852, local27.anInt1797 + local509 + local568, local570 + local27.anInt1797);
												} else {
													Static211.aClass23_1.method5099(local27.anInt1867 << 3);
													Static211.aClass23_1.method5089(0, local568, local570);
												}
												Static211.aClass23_1.method5094(local27.anInt1817 << 3);
												if (Static126.aBoolean236) {
													Static164.aClass92_7.method4472(local99, local104, local99 + local27.anInt1829, local104 - -local27.anInt1806);
												}
												if (local27.aBoolean162) {
													local2062.method3985(Static211.aClass23_1, null, local27.anInt1878);
												} else {
													local2062.method4029(Static211.aClass23_1, null, 1);
												}
												if (Static126.aBoolean236) {
													Static164.aClass92_7.method4459(arg3, arg8, arg6, arg4);
												}
												if (local27.aBoolean157) {
													Static164.aClass92_7.method4439(true);
												}
											}
										} else {
											if (local27.anInt1825 == 7) {
												local1485 = local27.method1511(Static164.aClass92_7);
												if (local1485 == null) {
													if (Static83.aBoolean136) {
														Static238.method4097(local27);
													}
													continue;
												}
												local252 = 0;
												for (local919 = 0; local919 < local27.anInt1799; local919++) {
													for (local509 = 0; local509 < local27.anInt1827; local509++) {
														if (local27.anIntArray179[local252] > 0) {
															local2270 = Static247.method4270(local27.anIntArray179[local252] - 1);
															@Pc(2636) String local2636;
															if (local2270.anInt4459 != 1 && local27.anIntArray181[local252] == 1) {
																local2636 = "<col=ff9040>" + local2270.aString165 + "</col>";
															} else {
																local2636 = "<col=ff9040>" + local2270.aString165 + "</col> x" + Static115.method2092(local27.anIntArray181[local252]);
															}
															local564 = (local27.anInt1881 + 115) * local509 + local99;
															local566 = local104 + local919 * (local27.anInt1848 + 12);
															if (local27.anInt1859 == 0) {
																local1485.method4056(local27.anInt1862 | 0xFF000000, Static164.aClass60Array7, local27.aBoolean154 ? -16777216 : -1, local2636, local564, local566, null);
															} else if (local27.anInt1859 == 1) {
																local1485.method4064(local566, local27.aBoolean154 ? -16777216 : -1, local27.anInt1862 | 0xFF000000, null, local2636, Static164.aClass60Array7, local564 + 57);
															} else {
																local1485.method4060(local566, local2636, null, local564 + 115 - 1, Static164.aClass60Array7, local27.anInt1862 | 0xFF000000, local27.aBoolean154 ? -16777216 : -1);
															}
														}
														local252++;
													}
												}
											}
											if (local27.anInt1825 == 8 && local27 == Static346.aClass72_21 && Static196.anInt4219 == Static251.anInt5215) {
												local246 = 0;
												local252 = 0;
												@Pc(2775) Class78 local2775 = Static118.aClass78_3;
												@Pc(2778) String local2778 = local27.aString61;
												local2778 = Static202.method3585(local27, local2778);
												@Pc(2794) String local2794;
												while (local2778.length() > 0) {
													local540 = local2778.indexOf("<br>");
													if (local540 == -1) {
														local2794 = local2778;
														local2778 = "";
													} else {
														local2794 = local2778.substring(0, local540);
														local2778 = local2778.substring(local540 + 4);
													}
													local564 = Static232.aClass106_5.method2879(local2794);
													if (local564 > local246) {
														local246 = local564;
													}
													local252 += Static232.aClass106_5.anInt3304 + 1;
												}
												local252 += 7;
												local246 += 6;
												local540 = local27.anInt1829 + local99 - local246 - 5;
												if (local99 + 5 > local540) {
													local540 = local99 + 5;
												}
												local564 = local27.anInt1806 + local104 + 5;
												if (local252 + local564 > arg4) {
													local564 = arg4 - local252;
												}
												if (arg6 < local540 + local246) {
													local540 = arg6 - local246;
												}
												Static164.aClass92_7.method4436(local540, local564, local246, local252, -96, 0);
												Static164.aClass92_7.method4495(local540, local564, local246, local252, -16777216, 0);
												local2778 = local27.aString61;
												local566 = Static232.aClass106_5.anInt3304 + local564 + 2;
												local2778 = Static202.method3585(local27, local2778);
												while (local2778.length() > 0) {
													local568 = local2778.indexOf("<br>");
													if (local568 == -1) {
														local2794 = local2778;
														local2778 = "";
													} else {
														local2794 = local2778.substring(0, local568);
														local2778 = local2778.substring(local568 + 4);
													}
													local2775.method4050(-16777216, local2794, local540 + 3, -1, local566);
													local566 += Static232.aClass106_5.anInt3304 + 1;
												}
											}
											if (local27.anInt1825 == 9) {
												if (local27.aBoolean150) {
													local509 = local104;
													local252 = local104 + local27.anInt1806;
													local919 = local99 + local27.anInt1829;
												} else {
													local919 = local99 + local27.anInt1829;
													local252 = local104;
													local509 = local27.anInt1806 + local104;
												}
												if (local27.anInt1880 == 1) {
													Static164.aClass92_7.method4496(local99, local252, local919, local509, local27.anInt1862, 0);
												} else {
													Static164.aClass92_7.method4533(local99, local252, local919, local509, local27.anInt1862, local27.anInt1880);
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

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(CI)B")
	public static byte method4692(@OriginalArg(0) char arg0) {
		@Pc(39) byte local39;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local39 = (byte) arg0;
		} else if (arg0 == '€') {
			local39 = -128;
		} else if (arg0 == '‚') {
			local39 = -126;
		} else if (arg0 == 'ƒ') {
			local39 = -125;
		} else if (arg0 == '„') {
			local39 = -124;
		} else if (arg0 == '…') {
			local39 = -123;
		} else if (arg0 == '†') {
			local39 = -122;
		} else if (arg0 == '‡') {
			local39 = -121;
		} else if (arg0 == 'ˆ') {
			local39 = -120;
		} else if (arg0 == '‰') {
			local39 = -119;
		} else if (arg0 == 'Š') {
			local39 = -118;
		} else if (arg0 == '‹') {
			local39 = -117;
		} else if (arg0 == 'Œ') {
			local39 = -116;
		} else if (arg0 == 'Ž') {
			local39 = -114;
		} else if (arg0 == '‘') {
			local39 = -111;
		} else if (arg0 == '’') {
			local39 = -110;
		} else if (arg0 == '“') {
			local39 = -109;
		} else if (arg0 == '”') {
			local39 = -108;
		} else if (arg0 == '•') {
			local39 = -107;
		} else if (arg0 == '–') {
			local39 = -106;
		} else if (arg0 == '—') {
			local39 = -105;
		} else if (arg0 == '˜') {
			local39 = -104;
		} else if (arg0 == '™') {
			local39 = -103;
		} else if (arg0 == 'š') {
			local39 = -102;
		} else if (arg0 == '›') {
			local39 = -101;
		} else if (arg0 == 'œ') {
			local39 = -100;
		} else if (arg0 == 'ž') {
			local39 = -98;
		} else if (arg0 == 'Ÿ') {
			local39 = -97;
		} else {
			local39 = 63;
		}
		return local39;
	}
}

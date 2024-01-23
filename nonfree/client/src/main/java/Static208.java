import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!ek;I)V")
	public static void method3492(@OriginalArg(0) Class42 arg0) {
		Static278.aClass42_99 = arg0;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)Lclient!mi;")
	public static Class112 method3496(@OriginalArg(0) int arg0) {
		@Pc(17) Class112 local17 = (Class112) Static120.aClass157_24.method4031((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(33) byte[] local33 = Static67.aClass42_18.method1256(Static66.method1202(arg0), Static192.method3298(arg0));
		local17 = new Class112();
		local17.anInt3850 = arg0;
		if (local33 != null) {
			local17.method3164(new Class2_Sub16(local33));
		}
		local17.method3160();
		Static120.aClass157_24.method4026((long) arg0, local17);
		return local17;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIII[Lclient!g;IIIII)V")
	public static void method3498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class56[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (Static116.aBoolean184) {
			Static111.method1895(arg0, arg3, arg8, arg6);
		} else {
			Static77.method1444(arg0, arg3, arg8, arg6);
			Static1.method17();
		}
		for (@Pc(22) int local22 = 0; local22 < arg4.length; local22++) {
			@Pc(34) Class56 local34 = arg4[local22];
			if (local34 != null && (local34.anInt2030 == arg5 || arg5 == -1412584499 && Static199.aClass56_19 == local34)) {
				@Pc(91) int local91;
				if (arg7 == -1) {
					Static153.anIntArray344[Static148.anInt3247] = local34.anInt2105 + arg2;
					Static83.anIntArray171[Static148.anInt3247] = arg1 + local34.anInt2048;
					Static155.anIntArray352[Static148.anInt3247] = local34.anInt2057;
					Static291.anIntArray537[Static148.anInt3247] = local34.anInt2031;
					local91 = Static148.anInt3247++;
				} else {
					local91 = arg7;
				}
				local34.anInt2090 = local91;
				local34.anInt2081 = Static268.anInt5236;
				if (!local34.aBoolean132 || !Static42.method801(local34)) {
					if (local34.anInt2074 > 0) {
						Static303.method4606(local34);
					}
					@Pc(123) int local123 = local34.anInt2048 + arg1;
					@Pc(128) int local128 = arg2 + local34.anInt2105;
					@Pc(131) int local131 = local34.anInt2097;
					if (Static199.aBoolean295 && (Static42.method804(local34).anInt419 != 0 || local34.anInt2092 == 0) && local131 > 127) {
						local131 = 127;
					}
					@Pc(180) int local180;
					@Pc(182) int local182;
					if (local34 == Static199.aClass56_19) {
						if (arg5 != -1412584499 && !local34.aBoolean143) {
							Static222.aClass56Array2 = arg4;
							Static159.anInt3553 = arg1;
							Static242.anInt4827 = arg2;
							continue;
						}
						if (!local34.aBoolean143) {
							local131 = 128;
						}
						if (Static40.aBoolean63 && Static189.aBoolean274) {
							local180 = Static131.anInt3016;
							local182 = Static281.anInt5551;
							local182 -= Static215.anInt4386;
							local180 -= Static229.anInt4618;
							if (Static209.anInt4314 > local182) {
								local182 = Static209.anInt4314;
							}
							if (local180 < Static71.anInt1808) {
								local180 = Static71.anInt1808;
							}
							if (local34.anInt2031 + local182 > Static209.anInt4314 - -Static192.aClass56_18.anInt2031) {
								local182 = Static192.aClass56_18.anInt2031 + Static209.anInt4314 - local34.anInt2031;
							}
							if (local34.anInt2057 + local180 > Static71.anInt1808 + Static192.aClass56_18.anInt2057) {
								local180 = Static71.anInt1808 + Static192.aClass56_18.anInt2057 - local34.anInt2057;
							}
							local123 = local182;
							local128 = local180;
						}
					}
					@Pc(256) int local256;
					@Pc(252) int local252;
					@Pc(286) int local286;
					@Pc(291) int local291;
					if (local34.anInt2092 == 2) {
						local180 = arg0;
						local252 = arg6;
						local182 = arg3;
						local256 = arg8;
					} else {
						local182 = local123 <= arg3 ? arg3 : local123;
						local180 = arg0 < local128 ? local128 : arg0;
						local286 = local128 + local34.anInt2057;
						local291 = local34.anInt2031 + local123;
						if (local34.anInt2092 == 9) {
							local286++;
							local291++;
						}
						local252 = arg6 > local291 ? local291 : arg6;
						local256 = local286 < arg8 ? local286 : arg8;
					}
					if (!local34.aBoolean132 || local180 < local256 && local182 < local252) {
						@Pc(496) int local496;
						@Pc(509) int local509;
						@Pc(553) int local553;
						@Pc(564) int local564;
						@Pc(571) int local571;
						@Pc(454) int local454;
						@Pc(513) int local513;
						@Pc(542) int local542;
						if (local34.anInt2074 != 0) {
							if (local34.anInt2074 == 1337 || local34.anInt2074 == 1403) {
								Static29.aClass56_4 = local34;
								Static269.anInt5269 = local128;
								Static52.anInt1303 = local123;
								Static30.method574(local34.anInt2031, local123, local128, local34.anInt2074 == 1403, local34.anInt2057);
								Static293.aBooleanArray23[local91] = true;
								if (Static116.aBoolean184) {
									Static111.method1895(arg0, arg3, arg8, arg6);
								} else {
									Static77.method1444(arg0, arg3, arg8, arg6);
								}
								continue;
							}
							if (local34.anInt2074 == 1338) {
								if (!local34.method1566()) {
									continue;
								}
								Static254.method3990(local91, local123, local34, local128);
								if (Static116.aBoolean184) {
									Static111.method1895(arg0, arg3, arg8, arg6);
								} else {
									Static77.method1444(arg0, arg3, arg8, arg6);
								}
								if (Static180.anInt3906 != 0 && Static180.anInt3906 != 3 || Static196.aBoolean281 || local180 > Static169.anInt3744 || Static75.anInt1867 < local182 || Static169.anInt3744 >= local256 || Static75.anInt1867 >= local252) {
									continue;
								}
								local286 = Static169.anInt3744 - local128;
								local291 = Static75.anInt1867 - local123;
								local454 = local34.anIntArray181[local291];
								if (local454 > local286 || local286 > local454 + local34.anIntArray176[local291]) {
									continue;
								}
								local291 -= local34.anInt2031 / 2;
								local286 -= local34.anInt2057 / 2;
								if (Static16.anInt342 == 4) {
									local496 = (int) Static239.aFloat51 & 0x7FF;
								} else {
									local496 = (int) Static239.aFloat51 + Static301.anInt5810 & 0x7FF;
								}
								local509 = Class1.anIntArray4[local496];
								local513 = Class1.anIntArray3[local496];
								if (Static16.anInt342 != 4) {
									local509 = (Static141.anInt3097 + 256) * local509 >> 8;
									local513 = (Static141.anInt3097 + 256) * local513 >> 8;
								}
								local542 = local286 * local513 + local509 * local291 >> 11;
								local553 = local291 * local513 - local509 * local286 >> 11;
								if (Static16.anInt342 == 4) {
									local564 = Static75.anInt1869 + local542 >> 7;
									local571 = Static279.anInt5490 - local553 >> 7;
								} else {
									local564 = Static22.aClass15_Sub2_Sub2_1.anInt5358 + local542 + 64 - Static22.aClass15_Sub2_Sub2_1.method4286() * 64 >> 7;
									local571 = Static22.aClass15_Sub2_Sub2_1.anInt5371 + 64 - local553 - Static22.aClass15_Sub2_Sub2_1.method4286() * 64 >> 7;
								}
								if (Static287.aBoolean373 && (Static237.anInt4771 & 0x40) != 0) {
									@Pc(639) Class56 local639 = Static15.method273(Static220.anInt4519, Static239.anInt4787);
									if (local639 == null) {
										Static82.method1482();
									} else {
										Static206.method3478(" ->", 1L, local571, (short) 25, Static251.aString167, local564, Static312.anInt5126);
									}
									continue;
								}
								if (Static162.anInt3614 == 1) {
									Static206.method3478("", 1L, local571, (short) 35, Static29.aString26, local564, -1);
								}
								Static206.method3478("", 1L, local571, (short) 31, Static219.aString153, local564, -1);
								continue;
							}
							if (local34.anInt2074 == 1339) {
								if (local34.method1566()) {
									Static49.method915(local128, local34, local123, local91);
									if (Static116.aBoolean184) {
										Static111.method1895(arg0, arg3, arg8, arg6);
									} else {
										Static77.method1444(arg0, arg3, arg8, arg6);
									}
								}
								continue;
							}
							if (local34.anInt2074 == 1400) {
								Static20.method342(local128, local34.anInt2031, local34.anInt2057, local123);
								Static293.aBooleanArray23[local91] = true;
								Static214.aBooleanArray19[local91] = true;
								if (Static116.aBoolean184) {
									Static111.method1895(arg0, arg3, arg8, arg6);
								} else {
									Static77.method1444(arg0, arg3, arg8, arg6);
								}
								continue;
							}
							if (local34.anInt2074 == 1401) {
								Static118.method1990(local128, local34.anInt2057, local123, local34.anInt2031);
								Static293.aBooleanArray23[local91] = true;
								Static214.aBooleanArray19[local91] = true;
								if (Static116.aBoolean184) {
									Static111.method1895(arg0, arg3, arg8, arg6);
								} else {
									Static77.method1444(arg0, arg3, arg8, arg6);
								}
								continue;
							}
							if (local34.anInt2074 == 1402) {
								if (!Static116.aBoolean184) {
									Static126.method3257(local128, local123);
									Static293.aBooleanArray23[local91] = true;
									Static214.aBooleanArray19[local91] = true;
								}
								continue;
							}
							if (local34.anInt2074 == 1405) {
								if (!Static193.aBoolean277) {
									continue;
								}
								local291 = local123 + 15;
								local286 = local128 + local34.anInt2057;
								Static69.aClass2_Sub8_Sub5_4.method1227("Fps:" + Static107.anInt2458, local286, local291, 16776960, -1);
								@Pc(819) Runtime local819 = Runtime.getRuntime();
								local291 += 15;
								local496 = (int) ((local819.totalMemory() - local819.freeMemory()) / 1024L);
								local509 = 16776960;
								if (local496 > 65536) {
									local509 = 16711680;
								}
								Static69.aClass2_Sub8_Sub5_4.method1227("Mem:" + local496 + "k", local286, local291, local509, -1);
								local291 += 15;
								if (Static116.aBoolean184) {
									local509 = 16776960;
									local513 = (Static124.anInt2873 + Static124.anInt2874 + Static124.anInt2872) / 1024;
									if (local513 > 65536) {
										local509 = 16711680;
									}
									Static69.aClass2_Sub8_Sub5_4.method1227("Card:" + local513 + "k", local286, local291, local509, -1);
									local291 += 15;
								}
								local513 = 0;
								local542 = 0;
								local553 = 0;
								for (local564 = 0; local564 < 29; local564++) {
									local513 += Static90.aClass31_Sub1Array2[local564].method1420();
									local542 += Static90.aClass31_Sub1Array2[local564].method1419();
									local553 += Static90.aClass31_Sub1Array2[local564].method1413();
								}
								local564 = local553 * 100 / local513;
								local571 = local542 * 10000 / local513;
								@Pc(970) String local970 = "Cache:" + Static223.method3682(2, true, 0, (long) local571) + "% (" + local564 + "%)";
								Static92.aClass2_Sub8_Sub5_2.method1227(local970, local286, local291, 16776960, -1);
								local291 += 12;
								if (Static97.anInt2310 > 0) {
									Static92.aClass2_Sub8_Sub5_2.method1227("Particles: " + Static97.anInt2313 + " / " + Static97.anInt2310, local286, local291, 16776960, -1);
								}
								local291 += 12;
								Static293.aBooleanArray23[local91] = true;
								Static214.aBooleanArray19[local91] = true;
								continue;
							}
							if (local34.anInt2074 == 1406) {
								Static219.aClass56_20 = local34;
								Static56.anInt1436 = local123;
								Static165.anInt3651 = local128;
								continue;
							}
						}
						if (!Static196.aBoolean281) {
							if (local34.anInt2092 == 0 && local34.aBoolean125 && local180 <= Static169.anInt3744 && local182 <= Static75.anInt1867 && Static169.anInt3744 < local256 && local252 > Static75.anInt1867 && !Static199.aBoolean295) {
								Static290.aShortArray85[0] = 1004;
								Static131.anIntArray297[0] = Static203.anInt4260;
								Static56.aStringArray8[0] = Static68.aString65;
								Static68.anInt1741 = 1;
								Static175.aStringArray28[0] = "";
							}
							if (Static169.anInt3744 >= local180 && local182 <= Static75.anInt1867 && local256 > Static169.anInt3744 && Static75.anInt1867 < local252) {
								Static100.method1738(Static169.anInt3744 - local128, -local123 + Static75.anInt1867, local34);
							}
						}
						if (local34.anInt2092 == 0) {
							if (!local34.aBoolean132 && Static42.method801(local34) && Static141.aClass56_14 != local34) {
								continue;
							}
							if (!local34.aBoolean132) {
								if (local34.anInt2039 > local34.anInt2087 - local34.anInt2031) {
									local34.anInt2039 = local34.anInt2087 - local34.anInt2031;
								}
								if (local34.anInt2039 < 0) {
									local34.anInt2039 = 0;
								}
							}
							if (Static116.aBoolean184 && local34.anInt2074 == 1407) {
								Static288.method4477(local128, local123, local34.anInt2057, local34.anInt2031);
							}
							method3498(local180, local123 - local34.anInt2039, -local34.anInt2063 + local128, local182, arg4, local34.anInt2096, local252, local91, local256);
							if (local34.aClass56Array1 != null) {
								method3498(local180, local123 - local34.anInt2039, -local34.anInt2063 + local128, local182, local34.aClass56Array1, local34.anInt2096, local252, local91, local256);
							}
							@Pc(1222) Class2_Sub4 local1222 = (Class2_Sub4) Static132.aClass101_8.method2867((long) local34.anInt2096);
							if (local1222 != null) {
								if (local1222.anInt278 == 0 && !Static196.aBoolean281 && local180 <= Static169.anInt3744 && local182 <= Static75.anInt1867 && Static169.anInt3744 < local256 && local252 > Static75.anInt1867 && !Static199.aBoolean295) {
									Static56.aStringArray8[0] = Static68.aString65;
									Static175.aStringArray28[0] = "";
									Static131.anIntArray297[0] = Static203.anInt4260;
									Static290.aShortArray85[0] = 1004;
									Static68.anInt1741 = 1;
								}
								Static84.method1516(local1222.anInt274, local252, local180, local91, local128, local182, local256, local123);
							}
							if (Static116.aBoolean184 && local34.anInt2074 == 1407) {
								Static288.method4467();
								Static257.aBoolean334 = true;
							}
							if (Static116.aBoolean184) {
								Static111.method1895(arg0, arg3, arg8, arg6);
							} else {
								Static77.method1444(arg0, arg3, arg8, arg6);
								Static1.method17();
							}
						}
						if (Static55.aBooleanArray2[local91] || Static270.anInt4253 > 1) {
							if (local34.anInt2092 == 0 && !local34.aBoolean132 && local34.anInt2087 > local34.anInt2031) {
								Static115.method4707(local123, local128 + local34.anInt2057, local34.anInt2087, local34.anInt2031, local34.anInt2039);
							}
							if (local34.anInt2092 != 1) {
								if (local34.anInt2092 == 2) {
									local286 = 0;
									for (local291 = 0; local291 < local34.anInt2073; local291++) {
										for (local454 = 0; local454 < local34.anInt2034; local454++) {
											local496 = (local34.anInt2045 + 32) * local454 + local128;
											local509 = local123 + local291 * (local34.anInt2062 + 32);
											if (local286 < 20) {
												local496 += local34.anIntArray189[local286];
												local509 += local34.anIntArray192[local286];
											}
											if (local34.anIntArray178[local286] > 0) {
												local553 = local34.anIntArray178[local286] - 1;
												if (local496 + 32 > arg0 && arg8 > local496 && arg3 < local509 + 32 && arg6 > local509 || Static79.aClass56_8 == local34 && Static85.anInt2005 == local286) {
													@Pc(1496) Class2_Sub8_Sub1 local1496;
													if (Static73.anInt1823 == 1 && local286 == Static252.anInt4937 && Static255.anInt5033 == local34.anInt2096) {
														local1496 = Static161.method2970(2, local34.aBoolean129, local34.anIntArray180[local286], null, 0, local553);
													} else {
														local1496 = Static161.method2970(1, local34.aBoolean129, local34.anIntArray180[local286], null, 3153952, local553);
													}
													if (Static1.aBoolean2) {
														Static293.aBooleanArray23[local91] = true;
													}
													if (local1496 == null) {
														Static287.method4466(local34);
													} else if (local34 == Static79.aClass56_8 && Static85.anInt2005 == local286) {
														local513 = Static131.anInt3016 - Static85.anInt1997;
														local542 = Static281.anInt5551 - Static253.anInt4975;
														if (local513 < 5 && local513 > -5) {
															local513 = 0;
														}
														if (local542 < 5 && local542 > -5) {
															local542 = 0;
														}
														if (Static303.anInt5850 < 5) {
															local513 = 0;
															local542 = 0;
														}
														local1496.method4361(local513 + local496, local509 + local542, 128);
														if (arg5 != -1) {
															@Pc(1609) Class56 local1609 = arg4[arg5 & 0xFFFF];
															@Pc(1615) int local1615;
															@Pc(1613) int local1613;
															if (Static116.aBoolean184) {
																local1613 = Static111.anInt2523;
																local1615 = Static111.anInt2524;
															} else {
																local1615 = Static77.anInt1898;
																local1613 = Static77.anInt1893;
															}
															@Pc(1647) int local1647;
															if (local1615 > local509 + local542 && local1609.anInt2039 > 0) {
																local1647 = Static247.anInt1733 * (local1615 - local509 - local542) / 3;
																if (Static247.anInt1733 * 10 < local1647) {
																	local1647 = Static247.anInt1733 * 10;
																}
																if (local1609.anInt2039 < local1647) {
																	local1647 = local1609.anInt2039;
																}
																Static253.anInt4975 += local1647;
																local1609.anInt2039 -= local1647;
																Static287.method4466(local1609);
															}
															if (local509 + local542 + 32 > local1613 && local1609.anInt2039 < local1609.anInt2087 - local1609.anInt2031) {
																local1647 = (local542 + local509 + 32 - local1613) * Static247.anInt1733 / 3;
																if (local1647 > Static247.anInt1733 * 10) {
																	local1647 = Static247.anInt1733 * 10;
																}
																if (local1647 > local1609.anInt2087 - local1609.anInt2039 - local1609.anInt2031) {
																	local1647 = local1609.anInt2087 - local1609.anInt2039 - local1609.anInt2031;
																}
																Static253.anInt4975 -= local1647;
																local1609.anInt2039 += local1647;
																Static287.method4466(local1609);
															}
														}
													} else if (Static137.aClass56_13 == local34 && local286 == Static13.anInt261) {
														local1496.method4361(local496, local509, 128);
													} else {
														local1496.method4364(local496, local509);
													}
												}
											} else if (local34.anIntArray190 != null && local286 < 20) {
												@Pc(1780) Class2_Sub8_Sub1 local1780 = local34.method1560(local286);
												if (local1780 != null) {
													local1780.method4364(local496, local509);
												} else if (Static296.aBoolean383) {
													Static287.method4466(local34);
												}
											}
											local286++;
										}
									}
								} else if (local34.anInt2092 == 3) {
									if (Static312.method4083(local34)) {
										local286 = local34.anInt2029;
										if (local34 == Static141.aClass56_14 && local34.anInt2035 != 0) {
											local286 = local34.anInt2035;
										}
									} else {
										local286 = local34.anInt2078;
										if (local34 == Static141.aClass56_14 && local34.anInt2061 != 0) {
											local286 = local34.anInt2061;
										}
									}
									if (local131 == 0) {
										if (local34.aBoolean138) {
											if (Static116.aBoolean184) {
												Static111.method1888(local128, local123, local34.anInt2057, local34.anInt2031, local286);
											} else {
												Static77.method1447(local128, local123, local34.anInt2057, local34.anInt2031, local286);
											}
										} else if (Static116.aBoolean184) {
											Static111.method1897(local128, local123, local34.anInt2057, local34.anInt2031, local286);
										} else {
											Static77.method1457(local128, local123, local34.anInt2057, local34.anInt2031, local286);
										}
									} else if (local34.aBoolean138) {
										if (Static116.aBoolean184) {
											Static111.method1890(local128, local123, local34.anInt2057, local34.anInt2031, local286, 256 - (local131 & 0xFF));
										} else {
											Static77.method1443(local128, local123, local34.anInt2057, local34.anInt2031, local286, 256 - (local131 & 0xFF));
										}
									} else if (Static116.aBoolean184) {
										Static111.method1887(local128, local123, local34.anInt2057, local34.anInt2031, local286, 256 - (local131 & 0xFF));
									} else {
										Static77.method1454(local128, local123, local34.anInt2057, local34.anInt2031, local286, 256 - (local131 & 0xFF));
									}
								} else {
									@Pc(1980) Class2_Sub8_Sub5 local1980;
									if (local34.anInt2092 == 4) {
										local1980 = local34.method1558(Static9.aClass93Array5);
										if (local1980 != null) {
											@Pc(1995) String local1995 = local34.aString71;
											if (Static312.method4083(local34)) {
												local291 = local34.anInt2029;
												if (Static141.aClass56_14 == local34 && local34.anInt2035 != 0) {
													local291 = local34.anInt2035;
												}
												if (local34.aString73.length() > 0) {
													local1995 = local34.aString73;
												}
											} else {
												local291 = local34.anInt2078;
												if (local34 == Static141.aClass56_14 && local34.anInt2061 != 0) {
													local291 = local34.anInt2061;
												}
											}
											if (local34.aBoolean132 && local34.anInt2085 != -1) {
												@Pc(2057) Class60 local2057 = Static87.method1546(local34.anInt2085);
												local1995 = local2057.aString81;
												if (local1995 == null) {
													local1995 = "null";
												}
												if ((local2057.anInt2244 == 1 || local34.anInt2088 != 1) && local34.anInt2088 != -1) {
													local1995 = "<col=ff9040>" + local1995 + "</col> x" + Static217.method3608(local34.anInt2088);
												}
											}
											if (Static159.aClass56_17 == local34) {
												local1995 = Static287.aString200;
												local291 = local34.anInt2078;
											}
											if (!local34.aBoolean132) {
												local1995 = Static35.method824(local1995, local34);
											}
											local1980.method1235(local1995, local128, local123, local34.anInt2057, local34.anInt2031, local291, local34.aBoolean126 ? 0 : -1, local34.anInt2098, local34.anInt2072, local34.anInt2027);
										} else if (Static296.aBoolean383) {
											Static287.method4466(local34);
										}
									} else if (local34.anInt2092 == 5) {
										@Pc(2219) Class2_Sub8_Sub1 local2219;
										if (!local34.aBoolean132) {
											local2219 = local34.method1555(Static312.method4083(local34));
											if (local2219 != null) {
												local2219.method4364(local128, local123);
											} else if (Static296.aBoolean383) {
												Static287.method4466(local34);
											}
										} else if (local34.anInt2084 >= 0) {
											@Pc(2159) Class181 local2159 = local34.method1562();
											if (Static116.aBoolean184) {
												local2159.method4482(0, local128, local123, local34.anInt2057, local34.anInt2031, local34.anInt2067, local34.anInt2033, 0);
											} else {
												local2159.method4481(0, local128, local123, local34.anInt2057, local34.anInt2031, local34.anInt2067, local34.anInt2033);
											}
										} else {
											if (local34.anInt2085 == -1) {
												local2219 = local34.method1555(false);
											} else if (local34.aBoolean136 && Static22.aClass15_Sub2_Sub2_1.aClass97_2 != null) {
												local2219 = Static161.method2970(local34.anInt2086, local34.aBoolean129, local34.anInt2088, Static22.aClass15_Sub2_Sub2_1.aClass97_2, local34.anInt2111, local34.anInt2085);
											} else {
												local2219 = Static161.method2970(local34.anInt2086, local34.aBoolean129, local34.anInt2088, null, local34.anInt2111, local34.anInt2085);
											}
											if (local2219 != null) {
												local291 = local2219.anInt5520;
												local454 = local2219.anInt5516;
												if (local34.aBoolean130) {
													local509 = (local34.anInt2031 + local454 - 1) / local454;
													local496 = (local291 + local34.anInt2057 - 1) / local291;
													if (Static116.aBoolean184) {
														Static111.method1880(local128, local123, local34.anInt2057 + local128, local34.anInt2031 + local123);
														@Pc(2300) boolean local2300 = Static315.method4761(local2219.anInt5514);
														@Pc(2305) boolean local2305 = Static315.method4761(local2219.anInt5517);
														@Pc(2308) Class2_Sub8_Sub1_Sub2 local2308 = (Class2_Sub8_Sub1_Sub2) local2219;
														if (local2300 && local2305) {
															if (local131 == 0) {
																local2308.method4377(local128, local123, local496, local509);
															} else {
																local2308.method4381(local128, local123, 256 - (local131 & 0xFF), local496, local509);
															}
														} else if (local2300) {
															for (local564 = 0; local564 < local509; local564++) {
																if (local131 == 0) {
																	local2308.method4377(local128, local123 + local564 * local454, local496, 1);
																} else {
																	local2308.method4381(local128, local123 + local454 * local564, 256 - (local131 & 0xFF), local496, 1);
																}
															}
														} else if (local2305) {
															for (local564 = 0; local564 < local496; local564++) {
																if (local131 == 0) {
																	local2308.method4377(local564 * local291 + local128, local123, 1, local509);
																} else {
																	local2308.method4381(local128 + local291 * local564, local123, 256 - (local131 & 0xFF), 1, local509);
																}
															}
														} else {
															for (local564 = 0; local564 < local496; local564++) {
																for (local571 = 0; local571 < local509; local571++) {
																	if (local131 == 0) {
																		local2219.method4364(local128 + local564 * local291, local571 * local454 + local123);
																	} else {
																		local2219.method4361(local128 + local564 * local291, local123 - -(local571 * local454), 256 - (local131 & 0xFF));
																	}
																}
															}
														}
														Static111.method1895(arg0, arg3, arg8, arg6);
													} else {
														Static77.method1455(local128, local123, local128 + local34.anInt2057, local34.anInt2031 + local123);
														for (local513 = 0; local513 < local496; local513++) {
															for (local542 = 0; local542 < local509; local542++) {
																if (local34.anInt2028 != 0) {
																	local2219.method4375(4096, local128 + local513 * local291 + local291 / 2, local542 * local454 + local123 + local454 / 2, local34.anInt2028);
																} else if (local131 == 0) {
																	local2219.method4364(local128 + local513 * local291, local123 + local454 * local542);
																} else {
																	local2219.method4361(local128 + local513 * local291, local542 * local454 + local123, 256 - (local131 & 0xFF));
																}
															}
														}
														Static77.method1444(arg0, arg3, arg8, arg6);
													}
												} else {
													local496 = local34.anInt2057 * 4096 / local291;
													if (local34.anInt2028 != 0) {
														local2219.method4375(local496, local34.anInt2057 / 2 + local128, local123 + local34.anInt2031 / 2, local34.anInt2028);
													} else if (local131 != 0) {
														local2219.method4362(local128, local123, local34.anInt2057, local34.anInt2031, 256 - (local131 & 0xFF));
													} else if (local291 == local34.anInt2057 && local454 == local34.anInt2031) {
														local2219.method4364(local128, local123);
													} else {
														local2219.method4365(local128, local123, local34.anInt2057, local34.anInt2031);
													}
												}
											} else if (Static296.aBoolean383) {
												Static287.method4466(local34);
											}
										}
									} else {
										@Pc(2882) Class60 local2882;
										if (local34.anInt2092 == 6) {
											@Pc(2721) boolean local2721 = Static312.method4083(local34);
											if (local2721) {
												local291 = local34.anInt2069;
											} else {
												local291 = local34.anInt2089;
											}
											@Pc(2733) Class15_Sub5 local2733 = null;
											local496 = 0;
											if (local34.anInt2085 != -1) {
												local2882 = Static87.method1546(local34.anInt2085);
												if (local2882 != null) {
													local2882 = local2882.method1643(local34.anInt2088);
													@Pc(2902) Class112 local2902 = local291 == -1 ? null : method3496(local291);
													if (local34.aBoolean136 && Static22.aClass15_Sub2_Sub2_1.aClass97_2 != null) {
														local2733 = local2882.method1639(local34.anInt2095, local34.anInt2093, Static22.aClass15_Sub2_Sub2_1.aClass97_2, 1, local2902, local34.anInt2047);
													} else {
														local2733 = local2882.method1639(local34.anInt2095, local34.anInt2093, null, 1, local2902, local34.anInt2047);
													}
													if (local2733 == null) {
														Static287.method4466(local34);
													} else {
														local496 = -local2733.method4274() / 2;
													}
												}
											} else if (local34.anInt2103 == 5) {
												if (local34.anInt2043 == -1) {
													local2733 = Static108.aClass97_1.method2813(0, false, -1, null, null, null, true, -1, 0, -1, -1);
												} else {
													local509 = local34.anInt2043;
													@Pc(2775) Class15_Sub2_Sub2 local2775;
													if (Static22.anInt504 == local509) {
														local2775 = Static22.aClass15_Sub2_Sub2_1;
													} else {
														local2775 = Static188.aClass15_Sub2_Sub2Array41[local509];
													}
													@Pc(2790) Class112 local2790 = local291 == -1 ? null : method3496(local291);
													if (local2775 != null && (local509 == 2047 || Static274.method4321(local2775.aString184) == local34.anInt2040)) {
														local2733 = local2775.aClass97_2.method2813(0, false, -1, null, null, local2790, true, 0, 0, -1, local34.anInt2093);
													}
												}
											} else if (local291 == -1) {
												local2733 = local34.method1563(-1, null, Static22.aClass15_Sub2_Sub2_1.aClass97_2, local2721, -1, 0);
												if (local2733 == null && Static296.aBoolean383) {
													Static287.method4466(local34);
												}
											} else {
												@Pc(2852) Class112 local2852 = method3496(local291);
												local2733 = local34.method1563(local34.anInt2047, local2852, Static22.aClass15_Sub2_Sub2_1.aClass97_2, local2721, local34.anInt2093, local34.anInt2095);
												if (local2733 == null && Static296.aBoolean383) {
													Static287.method4466(local34);
												}
											}
											if (local2733 != null) {
												if (local34.anInt2100 > 0) {
													local509 = (local34.anInt2057 << 8) / local34.anInt2100;
												} else {
													local509 = 256;
												}
												if (local34.anInt2076 > 0) {
													local513 = (local34.anInt2031 << 8) / local34.anInt2076;
												} else {
													local513 = 256;
												}
												local553 = local123 + local34.anInt2031 / 2 + (local34.anInt2110 * local513 >> 8);
												local542 = local128 + local34.anInt2057 / 2 + (local509 * local34.anInt2051 >> 8);
												if (Static116.aBoolean184) {
													if (local34.aBoolean131) {
														Static116.method1972(local542, local553, local34.anInt2101, local34.aShort21, local509, local513);
													} else {
														Static116.method1975(local542, local553, local509, local513);
														Static116.method1956((float) local34.aShort20, (float) local34.aShort21 * 1.5F);
													}
													Static116.method1953();
													Static116.method1963(true);
													Static116.method1954(false);
													Static279.method4348(Static178.anInt5291);
													if (Static257.aBoolean334) {
														Static111.method1884();
														Static116.method1979();
														Static111.method1895(arg0, arg3, arg8, arg6);
														Static257.aBoolean334 = false;
													}
													if (local34.aBoolean133) {
														Static116.method1947();
													}
													local571 = local34.anInt2101 * Class1.anIntArray3[local34.anInt2042] >> 16;
													local564 = Class1.anIntArray4[local34.anInt2042] * local34.anInt2101 >> 16;
													if (local34.aBoolean132) {
														local2733.method2332(local34.anInt2109, local34.anInt2071, local34.anInt2042, local34.anInt2049, local564 + local496 + local34.anInt2116, local34.anInt2116 + local571, -1L);
													} else {
														local2733.method2332(local34.anInt2109, 0, local34.anInt2042, 0, local564, local571, -1L);
													}
													if (local34.aBoolean133) {
														Static116.method1958();
													}
												} else {
													Static1.method8(local542, local553);
													local564 = local34.anInt2101 * Class1.anIntArray4[local34.anInt2042] >> 16;
													local571 = local34.anInt2101 * Class1.anIntArray3[local34.anInt2042] >> 16;
													if (!local34.aBoolean132) {
														local2733.method2332(local34.anInt2109, 0, local34.anInt2042, 0, local564, local571, -1L);
													} else if (local34.aBoolean131) {
														((Class15_Sub5_Sub1) local2733).method2259(local34.anInt2109, local34.anInt2071, local34.anInt2042, local34.anInt2049, local564 + local496 + local34.anInt2116, local34.anInt2116 + local571, local34.anInt2101);
													} else {
														local2733.method2332(local34.anInt2109, local34.anInt2071, local34.anInt2042, local34.anInt2049, local496 + local564 + local34.anInt2116, local571 - -local34.anInt2116, -1L);
													}
													Static1.method19();
												}
											}
										} else {
											if (local34.anInt2092 == 7) {
												local1980 = local34.method1558(Static9.aClass93Array5);
												if (local1980 == null) {
													if (Static296.aBoolean383) {
														Static287.method4466(local34);
													}
													continue;
												}
												local291 = 0;
												for (local454 = 0; local454 < local34.anInt2073; local454++) {
													for (local496 = 0; local496 < local34.anInt2034; local496++) {
														if (local34.anIntArray178[local291] > 0) {
															local2882 = Static87.method1546(local34.anIntArray178[local291] - 1);
															@Pc(3315) String local3315;
															if (local2882.anInt2244 != 1 && local34.anIntArray180[local291] == 1) {
																local3315 = "<col=ff9040>" + local2882.aString81 + "</col>";
															} else {
																local3315 = "<col=ff9040>" + local2882.aString81 + "</col> x" + Static217.method3608(local34.anIntArray180[local291]);
															}
															local553 = (local34.anInt2062 + 12) * local454 + local123;
															local542 = local496 * (local34.anInt2045 + 115) + local128;
															if (local34.anInt2098 == 0) {
																local1980.method1220(local3315, local542, local553, local34.anInt2078, local34.aBoolean126 ? 0 : -1);
															} else if (local34.anInt2098 == 1) {
																local1980.method1230(local3315, local542 + 57, local553, local34.anInt2078, local34.aBoolean126 ? 0 : -1);
															} else {
																local1980.method1227(local3315, local542 + 115 - 1, local553, local34.anInt2078, local34.aBoolean126 ? 0 : -1);
															}
														}
														local291++;
													}
												}
											}
											if (local34.anInt2092 == 8 && Static128.aClass56_12 == local34 && Static74.anInt1837 == Static121.anInt2672) {
												local286 = 0;
												@Pc(3436) Class2_Sub8_Sub5 local3436 = Static69.aClass2_Sub8_Sub5_4;
												local291 = 0;
												@Pc(3441) String local3441 = local34.aString71;
												local3441 = Static35.method824(local3441, local34);
												@Pc(3461) String local3461;
												while (local3441.length() > 0) {
													local513 = local3441.indexOf("<br>");
													if (local513 == -1) {
														local3461 = local3441;
														local3441 = "";
													} else {
														local3461 = local3441.substring(0, local513);
														local3441 = local3441.substring(local513 + 4);
													}
													local542 = local3436.method1237(local3461);
													local291 += local3436.anInt1619 + 1;
													if (local286 < local542) {
														local286 = local542;
													}
												}
												local291 += 7;
												local286 += 6;
												local513 = local34.anInt2057 + local128 - local286 - 5;
												if (local513 < local128 + 5) {
													local513 = local128 + 5;
												}
												if (arg8 < local513 + local286) {
													local513 = arg8 - local286;
												}
												local542 = local123 + local34.anInt2031 + 5;
												if (local542 + local291 > arg6) {
													local542 = arg6 - local291;
												}
												if (Static116.aBoolean184) {
													Static111.method1888(local513, local542, local286, local291, 16777120);
													Static111.method1897(local513, local542, local286, local291, 0);
												} else {
													Static77.method1447(local513, local542, local286, local291, 16777120);
													Static77.method1457(local513, local542, local286, local291, 0);
												}
												local3441 = local34.aString71;
												local553 = local542 + local3436.anInt1619 + 2;
												local3441 = Static35.method824(local3441, local34);
												while (local3441.length() > 0) {
													local564 = local3441.indexOf("<br>");
													if (local564 == -1) {
														local3461 = local3441;
														local3441 = "";
													} else {
														local3461 = local3441.substring(0, local564);
														local3441 = local3441.substring(local564 + 4);
													}
													local3436.method1220(local3461, local513 + 3, local553, 0, -1);
													local553 += local3436.anInt1619 + 1;
												}
											}
											if (local34.anInt2092 == 9) {
												if (local34.aBoolean140) {
													local496 = local123;
													local291 = local34.anInt2031 + local123;
													local454 = local128 + local34.anInt2057;
												} else {
													local291 = local123;
													local496 = local34.anInt2031 + local123;
													local454 = local128 + local34.anInt2057;
												}
												if (local34.anInt2108 == 1) {
													if (Static116.aBoolean184) {
														Static111.method1886(local128, local291, local454, local496, local34.anInt2078);
													} else {
														Static77.method1462(local128, local291, local454, local496, local34.anInt2078);
													}
												} else if (Static116.aBoolean184) {
													Static111.method1878(local128, local291, local454, local496, local34.anInt2078, local34.anInt2108);
												} else {
													Static77.method1442(local128, local291, local454, local496, local34.anInt2078, local34.anInt2108);
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

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(BB)V")
	public static void method3501(@OriginalArg(0) byte arg0) {
		if (Static242.aByteArrayArrayArray19 == null) {
			Static242.aByteArrayArrayArray19 = new byte[4][104][104];
		}
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			for (@Pc(26) int local26 = 0; local26 < 104; local26++) {
				for (@Pc(31) int local31 = 0; local31 < 104; local31++) {
					Static242.aByteArrayArrayArray19[local15][local26][local31] = arg0;
				}
			}
		}
	}
}

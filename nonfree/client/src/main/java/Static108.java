import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!hj", name = "H", descriptor = "I")
	public static int anInt2246;

	@OriginalMember(owner = "client!hj", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString129 = "Unable to find ";

	@OriginalMember(owner = "client!hj", name = "P", descriptor = "I")
	public static int anInt2254 = -1;

	@OriginalMember(owner = "client!hj", name = "U", descriptor = "[I")
	public static int[] anIntArray200 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(III[Lclient!hi;IIIIII)V")
	public static void method1949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class66[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static156.aBoolean211) {
			Static119.method2138(arg7, arg1, arg2, arg8);
		} else {
			Static25.method401(arg7, arg1, arg2, arg8);
			Static215.method3375();
		}
		for (@Pc(26) int local26 = 0; local26 < arg3.length; local26++) {
			@Pc(38) Class66 local38 = arg3[local26];
			if (local38 != null && (arg4 == local38.anInt2221 || arg4 == -1412584499 && Static5.aClass66_1 == local38)) {
				@Pc(61) int local61;
				if (arg0 == -1) {
					Static294.anIntArray467[Static293.anInt5272] = local38.anInt2135 + arg6;
					Static217.anIntArray342[Static293.anInt5272] = arg5 + local38.anInt2174;
					Static233.anIntArray365[Static293.anInt5272] = local38.anInt2204;
					Static46.anIntArray57[Static293.anInt5272] = local38.anInt2207;
					local61 = Static293.anInt5272++;
				} else {
					local61 = arg0;
				}
				local38.anInt2217 = Static313.anInt2966;
				local38.anInt2160 = local61;
				if (!local38.aBoolean132 || !Static37.method681(local38)) {
					if (local38.anInt2210 > 0) {
						Static167.method2847(local38);
					}
					@Pc(120) int local120 = arg6 + local38.anInt2135;
					@Pc(126) int local126 = local38.anInt2174 + arg5;
					@Pc(129) int local129 = local38.anInt2211;
					if (Static95.aBoolean103 && (Static37.method679(local38).anInt3570 != 0 || local38.anInt2176 == 0) && local129 > 127) {
						local129 = 127;
					}
					@Pc(171) int local171;
					@Pc(177) int local177;
					if (Static5.aClass66_1 == local38) {
						if (arg4 != -1412584499 && !local38.aBoolean118) {
							Static105.aClass66Array2 = arg3;
							Static94.anInt3443 = arg5;
							Static35.anInt3968 = arg6;
							continue;
						}
						if (Static95.aBoolean104 && Static221.aBoolean283) {
							local171 = Static247.anInt4467;
							local171 -= Static240.anInt4354;
							local177 = Static222.anInt4105;
							local177 -= Static145.anInt2885;
							if (local171 < Static51.anInt1016) {
								local171 = Static51.anInt1016;
							}
							if (anInt2254 > local177) {
								local177 = anInt2254;
							}
							if (Static309.aClass66_50.anInt2207 + anInt2254 < local177 - -local38.anInt2207) {
								local177 = Static309.aClass66_50.anInt2207 + anInt2254 - local38.anInt2207;
							}
							local126 = local177;
							if (Static309.aClass66_50.anInt2204 + Static51.anInt1016 < local38.anInt2204 + local171) {
								local171 = Static51.anInt1016 + Static309.aClass66_50.anInt2204 - local38.anInt2204;
							}
							local120 = local171;
						}
						if (!local38.aBoolean118) {
							local129 = 128;
						}
					}
					@Pc(301) int local301;
					@Pc(308) int local308;
					@Pc(272) int local272;
					@Pc(284) int local284;
					if (local38.anInt2176 == 2) {
						local308 = arg8;
						local171 = arg7;
						local301 = arg2;
						local177 = arg1;
					} else {
						local177 = arg1 >= local126 ? arg1 : local126;
						local272 = local38.anInt2204 + local120;
						local171 = local120 > arg7 ? local120 : arg7;
						local284 = local38.anInt2207 + local126;
						if (local38.anInt2176 == 9) {
							local272++;
							local284++;
						}
						local301 = arg2 <= local272 ? arg2 : local272;
						local308 = local284 >= arg8 ? arg8 : local284;
					}
					if (!local38.aBoolean132 || local301 > local171 && local177 < local308) {
						@Pc(517) int local517;
						@Pc(563) int local563;
						@Pc(579) int local579;
						@Pc(594) int local594;
						@Pc(521) int local521;
						@Pc(477) int local477;
						@Pc(525) int local525;
						@Pc(552) int local552;
						if (local38.anInt2210 != 0) {
							if (local38.anInt2210 == 1337 || local38.anInt2210 == 1403) {
								Static7.aClass66_5 = local38;
								Static34.anInt4474 = local126;
								Static308.anInt5489 = local120;
								Static111.method1984(local38.anInt2207, local38.anInt2204, local126, local120, local38.anInt2210 == 1403);
								Static304.aBooleanArray23[local61] = true;
								if (Static156.aBoolean211) {
									Static119.method2138(arg7, arg1, arg2, arg8);
								} else {
									Static25.method401(arg7, arg1, arg2, arg8);
								}
								continue;
							}
							if (local38.anInt2210 == 1338) {
								if (!local38.method1918()) {
									continue;
								}
								Static54.method972(local120, local61, local126, local38);
								if (Static156.aBoolean211) {
									Static119.method2138(arg7, arg1, arg2, arg8);
								} else {
									Static25.method401(arg7, arg1, arg2, arg8);
								}
								if (Static12.anInt176 != 0 && Static12.anInt176 != 3 || Static249.aBoolean307 || local171 > Static11.anInt163 || Static49.anInt962 < local177 || Static11.anInt163 >= local301 || Static49.anInt962 >= local308) {
									continue;
								}
								local284 = Static49.anInt962 - local126;
								local272 = Static11.anInt163 - local120;
								local477 = local38.anIntArray198[local284];
								if (local272 < local477 || local477 + local38.anIntArray190[local284] < local272) {
									continue;
								}
								local272 -= local38.anInt2204 / 2;
								local284 -= local38.anInt2207 / 2;
								local517 = Static189.anInt3613 + (int) Static49.aFloat32 & 0x7FF;
								local521 = Class135.anIntArray335[local517];
								local525 = Class135.anIntArray338[local517];
								local525 = local525 * (Static309.anInt5618 + 256) >> 8;
								local521 = (Static309.anInt5618 + 256) * local521 >> 8;
								local552 = local284 * local521 + local525 * local272 >> 11;
								local563 = local525 * local284 - local521 * local272 >> 11;
								local579 = Static90.aClass15_Sub5_Sub2_2.anInt5559 + local552 + 64 - Static90.aClass15_Sub5_Sub2_2.method4702() * 64 >> 7;
								local594 = Static90.aClass15_Sub5_Sub2_2.anInt5557 + 64 - local563 - Static90.aClass15_Sub5_Sub2_2.method4702() * 64 >> 7;
								if (Static133.aBoolean168 && (Static102.anInt2065 & 0x40) != 0) {
									@Pc(633) Class66 local633 = Static296.method4522(Static104.anInt2090, Static312.anInt5732);
									if (local633 == null) {
										Static301.method4558();
									} else {
										Static309.method4707(local579, Static196.anInt3698, " ->", Static148.aString164, (short) 10, 1L, local594);
									}
									continue;
								}
								if (Static118.anInt2486 == 1) {
									Static309.method4707(local579, -1, "", Static280.aString300, (short) 6, 1L, local594);
								}
								Static309.method4707(local579, -1, "", Static33.aString36, (short) 28, 1L, local594);
								continue;
							}
							if (local38.anInt2210 == 1339) {
								if (local38.method1918()) {
									Static151.method2553(local120, local126, local38, local61);
									if (Static156.aBoolean211) {
										Static119.method2138(arg7, arg1, arg2, arg8);
									} else {
										Static25.method401(arg7, arg1, arg2, arg8);
									}
								}
								continue;
							}
							if (local38.anInt2210 == 1400) {
								Static50.method950(local38.anInt2204, local126, local38.anInt2207, local120);
								Static304.aBooleanArray23[local61] = true;
								Static116.aBooleanArray8[local61] = true;
								if (Static156.aBoolean211) {
									Static119.method2138(arg7, arg1, arg2, arg8);
								} else {
									Static25.method401(arg7, arg1, arg2, arg8);
								}
								continue;
							}
							if (local38.anInt2210 == 1401) {
								Static162.method2782(local126, local38.anInt2207, local38.anInt2204, local120);
								Static304.aBooleanArray23[local61] = true;
								Static116.aBooleanArray8[local61] = true;
								if (Static156.aBoolean211) {
									Static119.method2138(arg7, arg1, arg2, arg8);
								} else {
									Static25.method401(arg7, arg1, arg2, arg8);
								}
								continue;
							}
							if (local38.anInt2210 == 1402) {
								if (!Static156.aBoolean211) {
									Static76.method1485(local120, local126);
									Static304.aBooleanArray23[local61] = true;
									Static116.aBooleanArray8[local61] = true;
								}
								continue;
							}
							if (local38.anInt2210 == 1405) {
								if (!Static218.aBoolean73) {
									continue;
								}
								local284 = local126 + 15;
								local272 = local38.anInt2204 + local120;
								Static140.aClass1_Sub2_Sub6_3.method4003("Fps:" + Static69.anInt4976, local272, local284, 16776960, -1);
								@Pc(810) Runtime local810 = Runtime.getRuntime();
								local517 = (int) ((local810.totalMemory() - local810.freeMemory()) / 1024L);
								local284 += 15;
								local521 = 16776960;
								if (local517 > 65536) {
									local521 = 16711680;
								}
								Static140.aClass1_Sub2_Sub6_3.method4003("Mem:" + local517 + "k", local272, local284, local521, -1);
								local284 += 15;
								if (Static156.aBoolean211) {
									local521 = 16776960;
									local525 = (Static10.anInt144 + Static10.anInt143 + Static10.anInt141) / 1024;
									if (local525 > 65536) {
										local521 = 16711680;
									}
									Static140.aClass1_Sub2_Sub6_3.method4003("Card:" + local525 + "k", local272, local284, local521, -1);
									local284 += 15;
								}
								local525 = 0;
								local552 = 0;
								local563 = 0;
								for (local579 = 0; local579 < 29; local579++) {
									local525 += Static5.aClass21_Sub1Array1[local579].method2413();
									local552 += Static5.aClass21_Sub1Array1[local579].method2412();
									local563 += Static5.aClass21_Sub1Array1[local579].method2419();
								}
								local579 = local563 * 100 / local525;
								local594 = local552 * 10000 / local525;
								@Pc(956) String local956 = "Cache:" + Static307.method4662((long) local594, true, 2, 0) + "% (" + local579 + "%)";
								Static11.aClass1_Sub2_Sub6_1.method4003(local956, local272, local284, 16776960, -1);
								local284 += 12;
								if (Static158.anInt3109 > 0) {
									Static11.aClass1_Sub2_Sub6_1.method4003("Particles: " + Static158.anInt3106 + " / " + Static158.anInt3109, local272, local284, 16776960, -1);
								}
								local284 += 12;
								Static304.aBooleanArray23[local61] = true;
								Static116.aBooleanArray8[local61] = true;
								continue;
							}
							if (local38.anInt2210 == 1406) {
								Static296.anInt5310 = local120;
								Static257.anInt4698 = local126;
								Static73.aClass66_15 = local38;
								continue;
							}
						}
						if (!Static249.aBoolean307) {
							if (local38.anInt2176 == 0 && local38.aBoolean127 && local171 <= Static11.anInt163 && local177 <= Static49.anInt962 && Static11.anInt163 < local301 && Static49.anInt962 < local308 && !Static95.aBoolean103) {
								Static164.aStringArray25[0] = Static117.aString140;
								Static110.anInt2281 = 1;
								Static17.aShortArray2[0] = 1009;
								Static21.anIntArray19[0] = Static41.anInt850;
								Static73.aStringArray6[0] = "";
							}
							if (local171 <= Static11.anInt163 && Static49.anInt962 >= local177 && local301 > Static11.anInt163 && Static49.anInt962 < local308) {
								Static48.method904(local38, Static11.anInt163 - local120, Static49.anInt962 + -local126);
							}
						}
						if (local38.anInt2176 == 0) {
							if (!local38.aBoolean132 && Static37.method681(local38) && Static7.aClass66_6 != local38) {
								continue;
							}
							if (!local38.aBoolean132) {
								if (local38.anInt2216 > local38.anInt2215 - local38.anInt2207) {
									local38.anInt2216 = local38.anInt2215 - local38.anInt2207;
								}
								if (local38.anInt2216 < 0) {
									local38.anInt2216 = 0;
								}
							}
							if (Static156.aBoolean211 && local38.anInt2210 == 1407) {
								Static177.method2956(local120, local126, local38.anInt2204, local38.anInt2207);
							}
							method1949(local61, local177, local301, arg3, local38.anInt2157, local126 - local38.anInt2216, local120 - local38.anInt2191, local171, local308);
							if (local38.aClass66Array3 != null) {
								method1949(local61, local177, local301, local38.aClass66Array3, local38.anInt2157, local126 - local38.anInt2216, -local38.anInt2191 + local120, local171, local308);
							}
							@Pc(1211) Class1_Sub25 local1211 = (Class1_Sub25) Static302.aClass142_26.method3543((long) local38.anInt2157);
							if (local1211 != null) {
								if (local1211.anInt4294 == 0 && !Static249.aBoolean307 && Static11.anInt163 >= local171 && local177 <= Static49.anInt962 && local301 > Static11.anInt163 && Static49.anInt962 < local308 && !Static95.aBoolean103) {
									Static17.aShortArray2[0] = 1009;
									Static164.aStringArray25[0] = Static117.aString140;
									Static110.anInt2281 = 1;
									Static73.aStringArray6[0] = "";
									Static21.anIntArray19[0] = Static41.anInt850;
								}
								Static157.method1346(local177, local301, local1211.anInt4289, local120, local61, local126, local171, local308);
							}
							if (Static156.aBoolean211 && local38.anInt2210 == 1407) {
								Static177.method2954();
								Static282.aBoolean348 = true;
							}
							if (Static156.aBoolean211) {
								Static119.method2138(arg7, arg1, arg2, arg8);
							} else {
								Static25.method401(arg7, arg1, arg2, arg8);
								Static215.method3375();
							}
						}
						if (Static307.aBooleanArray25[local61] || Static301.anInt5354 > 1) {
							if (local38.anInt2176 == 0 && !local38.aBoolean132 && local38.anInt2215 > local38.anInt2207) {
								Static189.method3090(local38.anInt2215, local38.anInt2204 + local120, local126, local38.anInt2216, local38.anInt2207);
							}
							if (local38.anInt2176 != 1) {
								if (local38.anInt2176 == 2) {
									local272 = 0;
									for (local284 = 0; local284 < local38.anInt2185; local284++) {
										for (local477 = 0; local477 < local38.anInt2169; local477++) {
											local517 = local120 + local477 * (local38.anInt2155 + 32);
											local521 = local126 + (local38.anInt2146 + 32) * local284;
											if (local272 < 20) {
												local517 += local38.anIntArray183[local272];
												local521 += local38.anIntArray184[local272];
											}
											if (local38.anIntArray192[local272] > 0) {
												local563 = local38.anIntArray192[local272] - 1;
												if (local517 + 32 > arg7 && arg2 > local517 && local521 + 32 > arg1 && arg8 > local521 || Static168.aClass66_28 == local38 && Static33.anInt579 == local272) {
													@Pc(1499) Class1_Sub2_Sub1 local1499;
													if (Static306.anInt5423 == 1 && Static8.anInt134 == local272 && Static306.anInt5424 == local38.anInt2157) {
														local1499 = Static282.method4347(local38.anIntArray195[local272], local38.aBoolean126, local563, null, 0, 2);
													} else {
														local1499 = Static282.method4347(local38.anIntArray195[local272], local38.aBoolean126, local563, null, 3153952, 1);
													}
													if (Static215.aBoolean275) {
														Static304.aBooleanArray23[local61] = true;
													}
													if (local1499 == null) {
														Static103.method1865(local38);
													} else if (local38 == Static168.aClass66_28 && Static33.anInt579 == local272) {
														local525 = Static247.anInt4467 - Static244.anInt4432;
														if (local525 < 5 && local525 > -5) {
															local525 = 0;
														}
														local552 = Static222.anInt4105 - Static229.anInt4206;
														if (local552 < 5 && local552 > -5) {
															local552 = 0;
														}
														if (Static258.anInt4702 < 5) {
															local525 = 0;
															local552 = 0;
														}
														local1499.method3841(local517 + local525, local521 + local552, 128);
														if (arg4 != -1) {
															@Pc(1611) int local1611;
															@Pc(1609) int local1609;
															if (Static156.aBoolean211) {
																local1611 = Static119.anInt2497;
																local1609 = Static119.anInt2498;
															} else {
																local1609 = Static25.anInt419;
																local1611 = Static25.anInt417;
															}
															@Pc(1623) Class66 local1623 = arg3[arg4 & 0xFFFF];
															@Pc(1650) int local1650;
															if (local1611 > local552 + local521 && local1623.anInt2216 > 0) {
																local1650 = Static81.anInt1635 * (local1611 - local521 - local552) / 3;
																if (local1650 > Static81.anInt1635 * 10) {
																	local1650 = Static81.anInt1635 * 10;
																}
																if (local1623.anInt2216 < local1650) {
																	local1650 = local1623.anInt2216;
																}
																Static229.anInt4206 += local1650;
																local1623.anInt2216 -= local1650;
																Static103.method1865(local1623);
															}
															if (local1609 < local552 + local521 + 32 && local1623.anInt2216 < local1623.anInt2215 - local1623.anInt2207) {
																local1650 = Static81.anInt1635 * (local521 + local552 + 32 - local1609) / 3;
																if (Static81.anInt1635 * 10 < local1650) {
																	local1650 = Static81.anInt1635 * 10;
																}
																if (local1623.anInt2215 - local1623.anInt2216 - local1623.anInt2207 < local1650) {
																	local1650 = local1623.anInt2215 - local1623.anInt2216 - local1623.anInt2207;
																}
																Static229.anInt4206 -= local1650;
																local1623.anInt2216 += local1650;
																Static103.method1865(local1623);
															}
														}
													} else if (Static281.aClass66_45 == local38 && Static218.anInt1146 == local272) {
														local1499.method3841(local517, local521, 128);
													} else {
														local1499.method3839(local517, local521);
													}
												}
											} else if (local38.anIntArray194 != null && local272 < 20) {
												@Pc(1410) Class1_Sub2_Sub1 local1410 = local38.method1919(local272);
												if (local1410 != null) {
													local1410.method3839(local517, local521);
												} else if (Static24.aBoolean14) {
													Static103.method1865(local38);
												}
											}
											local272++;
										}
									}
								} else if (local38.anInt2176 == 3) {
									if (Static180.method2981(local38)) {
										local272 = local38.anInt2173;
										if (Static7.aClass66_6 == local38 && local38.anInt2153 != 0) {
											local272 = local38.anInt2153;
										}
									} else {
										local272 = local38.anInt2145;
										if (local38 == Static7.aClass66_6 && local38.anInt2158 != 0) {
											local272 = local38.anInt2158;
										}
									}
									if (local129 == 0) {
										if (local38.aBoolean124) {
											if (Static156.aBoolean211) {
												Static119.method2129(local120, local126, local38.anInt2204, local38.anInt2207, local272);
											} else {
												Static25.method385(local120, local126, local38.anInt2204, local38.anInt2207, local272);
											}
										} else if (Static156.aBoolean211) {
											Static119.method2135(local120, local126, local38.anInt2204, local38.anInt2207, local272);
										} else {
											Static25.method402(local120, local126, local38.anInt2204, local38.anInt2207, local272);
										}
									} else if (local38.aBoolean124) {
										if (Static156.aBoolean211) {
											Static119.method2122(local120, local126, local38.anInt2204, local38.anInt2207, local272, 256 - (local129 & 0xFF));
										} else {
											Static25.method397(local120, local126, local38.anInt2204, local38.anInt2207, local272, 256 - (local129 & 0xFF));
										}
									} else if (Static156.aBoolean211) {
										Static119.method2137(local120, local126, local38.anInt2204, local38.anInt2207, local272, 256 - (local129 & 0xFF));
									} else {
										Static25.method394(local120, local126, local38.anInt2204, local38.anInt2207, local272, 256 - (local129 & 0xFF));
									}
								} else {
									@Pc(1952) Class1_Sub2_Sub6 local1952;
									if (local38.anInt2176 == 4) {
										local1952 = local38.method1922(Static84.aClass23Array3);
										if (local1952 != null) {
											@Pc(1964) String local1964 = local38.aString122;
											if (Static180.method2981(local38)) {
												local284 = local38.anInt2173;
												if (local38 == Static7.aClass66_6 && local38.anInt2153 != 0) {
													local284 = local38.anInt2153;
												}
												if (local38.aString127.length() > 0) {
													local1964 = local38.aString127;
												}
											} else {
												local284 = local38.anInt2145;
												if (local38 == Static7.aClass66_6 && local38.anInt2158 != 0) {
													local284 = local38.anInt2158;
												}
											}
											if (local38.aBoolean132 && local38.anInt2220 != -1) {
												@Pc(2020) Class102 local2020 = Static49.method909(local38.anInt2220);
												local1964 = local2020.aString181;
												if (local1964 == null) {
													local1964 = "null";
												}
												if ((local2020.anInt3185 == 1 || local38.anInt2151 != 1) && local38.anInt2151 != -1) {
													local1964 = "<col=ff9040>" + local1964 + "</col> x" + Static243.method4748(local38.anInt2151);
												}
											}
											if (local38 == Static310.aClass66_51) {
												local284 = local38.anInt2145;
												local1964 = Static229.aString237;
											}
											if (!local38.aBoolean132) {
												local1964 = Static289.method4412(local38, local1964);
											}
											local1952.method4004(local1964, local120, local126, local38.anInt2204, local38.anInt2207, local284, local38.aBoolean121 ? 0 : -1, local38.anInt2129, local38.anInt2162, local38.anInt2186);
										} else if (Static24.aBoolean14) {
											Static103.method1865(local38);
										}
									} else if (local38.anInt2176 == 5) {
										@Pc(2130) Class1_Sub2_Sub1 local2130;
										if (!local38.aBoolean132) {
											local2130 = local38.method1920(Static180.method2981(local38));
											if (local2130 != null) {
												local2130.method3839(local120, local126);
											} else if (Static24.aBoolean14) {
												Static103.method1865(local38);
											}
										} else if (local38.anInt2212 >= 0) {
											@Pc(2601) Class136 local2601 = local38.method1926();
											if (Static156.aBoolean211) {
												local2601.method3388(0, local120, local126, local38.anInt2204, local38.anInt2207, local38.anInt2195, local38.anInt2202, 0);
											} else {
												local2601.method3385(0, local120, local126, local38.anInt2204, local38.anInt2207, local38.anInt2195, local38.anInt2202);
											}
										} else {
											if (local38.anInt2220 == -1) {
												local2130 = local38.method1920(false);
											} else if (local38.aBoolean119 && Static90.aClass15_Sub5_Sub2_2.aClass167_6 != null) {
												local2130 = Static282.method4347(local38.anInt2151, local38.aBoolean126, local38.anInt2220, Static90.aClass15_Sub5_Sub2_2.aClass167_6, local38.anInt2197, local38.anInt2142);
											} else {
												local2130 = Static282.method4347(local38.anInt2151, local38.aBoolean126, local38.anInt2220, null, local38.anInt2197, local38.anInt2142);
											}
											if (local2130 != null) {
												local284 = local2130.anInt4447;
												local477 = local2130.anInt4446;
												if (local38.aBoolean117) {
													local517 = (local284 + local38.anInt2204 - 1) / local284;
													local521 = (local38.anInt2207 + local477 - 1) / local477;
													if (Static156.aBoolean211) {
														Static119.method2131(local120, local126, local120 + local38.anInt2204, local126 + local38.anInt2207);
														@Pc(2404) boolean local2404 = Static86.method1604(local2130.anInt4444);
														@Pc(2409) boolean local2409 = Static86.method1604(local2130.anInt4454);
														@Pc(2412) Class1_Sub2_Sub1_Sub1 local2412 = (Class1_Sub2_Sub1_Sub1) local2130;
														if (local2404 && local2409) {
															if (local129 == 0) {
																local2412.method2601(local120, local126, local517, local521);
															} else {
																local2412.method2607(local120, local126, 256 - (local129 & 0xFF), local517, local521);
															}
														} else if (local2404) {
															for (local579 = 0; local579 < local521; local579++) {
																if (local129 == 0) {
																	local2412.method2601(local120, local126 + local579 * local477, local517, 1);
																} else {
																	local2412.method2607(local120, local477 * local579 + local126, -(local129 & 0xFF) + 256, local517, 1);
																}
															}
														} else if (local2409) {
															for (local579 = 0; local579 < local517; local579++) {
																if (local129 == 0) {
																	local2412.method2601(local120 + local579 * local284, local126, 1, local521);
																} else {
																	local2412.method2607(local284 * local579 + local120, local126, 256 - (local129 & 0xFF), 1, local521);
																}
															}
														} else {
															for (local579 = 0; local579 < local517; local579++) {
																for (local594 = 0; local594 < local521; local594++) {
																	if (local129 == 0) {
																		local2130.method3839(local120 + local579 * local284, local126 + local477 * local594);
																	} else {
																		local2130.method3841(local579 * local284 + local120, local126 - -(local477 * local594), 256 - (local129 & 0xFF));
																	}
																}
															}
														}
														Static119.method2138(arg7, arg1, arg2, arg8);
													} else {
														Static25.method392(local120, local126, local38.anInt2204 + local120, local38.anInt2207 + local126);
														for (local525 = 0; local525 < local517; local525++) {
															for (local552 = 0; local552 < local521; local552++) {
																if (local38.anInt2201 != 0) {
																	local2130.method3838(local477 / 2 + local477 * local552 + local126, 4096, local284 / 2 + local284 * local525 + local120, local38.anInt2201);
																} else if (local129 == 0) {
																	local2130.method3839(local525 * local284 + local120, local552 * local477 + local126);
																} else {
																	local2130.method3841(local120 + local525 * local284, local477 * local552 + local126, 256 - (local129 & 0xFF));
																}
															}
														}
														Static25.method401(arg7, arg1, arg2, arg8);
													}
												} else {
													local517 = local38.anInt2204 * 4096 / local284;
													if (local38.anInt2201 != 0) {
														local2130.method3838(local126 + local38.anInt2207 / 2, local517, local38.anInt2204 / 2 + local120, local38.anInt2201);
													} else if (local129 != 0) {
														local2130.method3848(local120, local126, local38.anInt2204, local38.anInt2207, 256 - (local129 & 0xFF));
													} else if (local284 == local38.anInt2204 && local477 == local38.anInt2207) {
														local2130.method3839(local120, local126);
													} else {
														local2130.method3847(local120, local126, local38.anInt2204, local38.anInt2207);
													}
												}
											} else if (Static24.aBoolean14) {
												Static103.method1865(local38);
											}
										}
									} else {
										@Pc(2824) Class102 local2824;
										if (local38.anInt2176 == 6) {
											@Pc(2667) boolean local2667 = Static180.method2981(local38);
											if (local2667) {
												local284 = local38.anInt2206;
											} else {
												local284 = local38.anInt2134;
											}
											local517 = 0;
											@Pc(2681) Class15_Sub2 local2681 = null;
											if (local38.anInt2220 != -1) {
												local2824 = Static49.method909(local38.anInt2220);
												if (local2824 != null) {
													local2824 = local2824.method2792(local38.anInt2151);
													@Pc(2844) Class157 local2844 = local284 == -1 ? null : Static80.method1561(local284);
													if (local38.aBoolean119 && Static90.aClass15_Sub5_Sub2_2.aClass167_6 != null) {
														local2681 = local2824.method2791(local38.anInt2182, Static90.aClass15_Sub5_Sub2_2.aClass167_6, local38.anInt2131, local38.anInt2149, local2844, 1);
													} else {
														local2681 = local2824.method2791(local38.anInt2182, null, local38.anInt2131, local38.anInt2149, local2844, 1);
													}
													if (local2681 == null) {
														Static103.method1865(local38);
													} else {
														local517 = -local2681.method4676() / 2;
													}
												}
											} else if (local38.anInt2198 == 5) {
												if (local38.anInt2130 == -1) {
													local2681 = Static213.aClass167_5.method4179(true, -1, 0, -1, false, 0, null, -1, null, -1, null);
												} else {
													local521 = local38.anInt2130 & 0x7FF;
													if (local521 == Static35.anInt3966) {
														local521 = 2047;
													}
													@Pc(2760) Class15_Sub5_Sub2 local2760 = Static17.aClass15_Sub5_Sub2Array1[local521];
													@Pc(2771) Class157 local2771 = local284 == -1 ? null : Static80.method1561(local284);
													if (local2760 != null && (int) Static124.method4681(local2760.aString336) << 11 == (local38.anInt2130 & 0xFFFFF800)) {
														local2681 = local2760.aClass167_6.method4179(true, 0, 0, -1, false, 0, null, local38.anInt2149, local2771, -1, null);
													}
												}
											} else if (local284 == -1) {
												local2681 = local38.method1915(local2667, Static90.aClass15_Sub5_Sub2_2.aClass167_6, -1, null, -1, 0);
												if (local2681 == null && Static24.aBoolean14) {
													Static103.method1865(local38);
												}
											} else {
												@Pc(2699) Class157 local2699 = Static80.method1561(local284);
												local2681 = local38.method1915(local2667, Static90.aClass15_Sub5_Sub2_2.aClass167_6, local38.anInt2182, local2699, local38.anInt2149, local38.anInt2131);
												if (local2681 == null && Static24.aBoolean14) {
													Static103.method1865(local38);
												}
											}
											if (local2681 != null) {
												if (local38.anInt2152 <= 0) {
													local525 = 256;
												} else {
													local525 = (local38.anInt2207 << 8) / local38.anInt2152;
												}
												if (local38.anInt2203 > 0) {
													local521 = (local38.anInt2204 << 8) / local38.anInt2203;
												} else {
													local521 = 256;
												}
												local552 = (local38.anInt2213 * local521 >> 8) + local38.anInt2204 / 2 + local120;
												local563 = local38.anInt2207 / 2 + local126 + (local525 * local38.anInt2150 >> 8);
												if (Static156.aBoolean211) {
													if (local38.aBoolean125) {
														Static156.method2682(local552, local563, local38.anInt2181, local38.aShort16, local521, local525);
													} else {
														Static156.method2691(local552, local563, local521, local525);
														Static156.method2670((float) local38.aShort15, (float) local38.aShort16 * 1.5F);
													}
													Static156.method2672();
													Static156.method2668(true);
													Static156.method2674(false);
													Static245.method3874(Static184.anInt3503);
													if (Static282.aBoolean348) {
														Static119.method2126();
														Static156.method2661();
														Static119.method2138(arg7, arg1, arg2, arg8);
														Static282.aBoolean348 = false;
													}
													if (local38.aBoolean128) {
														Static156.method2656();
													}
													local579 = local38.anInt2181 * Class135.anIntArray335[local38.anInt2136] >> 16;
													local594 = local38.anInt2181 * Class135.anIntArray338[local38.anInt2136] >> 16;
													if (local38.aBoolean132) {
														local2681.method1035(local38.anInt2156, local38.anInt2167, local38.anInt2136, local38.anInt2133, local517 + local579 + local38.anInt2163, local594 + local38.anInt2163, -1L);
													} else {
														local2681.method1035(local38.anInt2156, 0, local38.anInt2136, 0, local579, local594, -1L);
													}
													if (local38.aBoolean128) {
														Static156.method2676();
													}
												} else {
													Static215.method3374(local552, local563);
													local594 = local38.anInt2181 * Class135.anIntArray338[local38.anInt2136] >> 16;
													local579 = Class135.anIntArray335[local38.anInt2136] * local38.anInt2181 >> 16;
													if (!local38.aBoolean132) {
														local2681.method1035(local38.anInt2156, 0, local38.anInt2136, 0, local579, local594, -1L);
													} else if (local38.aBoolean125) {
														((Class15_Sub2_Sub2) local2681).method1047(local38.anInt2156, local38.anInt2167, local38.anInt2136, local38.anInt2133, local579 + local517 + local38.anInt2163, local594 - -local38.anInt2163, local38.anInt2181);
													} else {
														local2681.method1035(local38.anInt2156, local38.anInt2167, local38.anInt2136, local38.anInt2133, local38.anInt2163 + local579 + local517, local38.anInt2163 + local594, -1L);
													}
													Static215.method3378();
												}
											}
										} else {
											if (local38.anInt2176 == 7) {
												local1952 = local38.method1922(Static84.aClass23Array3);
												if (local1952 == null) {
													if (Static24.aBoolean14) {
														Static103.method1865(local38);
													}
													continue;
												}
												local284 = 0;
												for (local477 = 0; local477 < local38.anInt2185; local477++) {
													for (local517 = 0; local517 < local38.anInt2169; local517++) {
														if (local38.anIntArray192[local284] > 0) {
															local2824 = Static49.method909(local38.anIntArray192[local284] - 1);
															@Pc(3258) String local3258;
															if (local2824.anInt3185 != 1 && local38.anIntArray195[local284] == 1) {
																local3258 = "<col=ff9040>" + local2824.aString181 + "</col>";
															} else {
																local3258 = "<col=ff9040>" + local2824.aString181 + "</col> x" + Static243.method4748(local38.anIntArray195[local284]);
															}
															local563 = (local38.anInt2146 + 12) * local477 + local126;
															local552 = local517 * (local38.anInt2155 + 115) + local120;
															if (local38.anInt2129 == 0) {
																local1952.method4016(local3258, local552, local563, local38.anInt2145, local38.aBoolean121 ? 0 : -1);
															} else if (local38.anInt2129 == 1) {
																local1952.method4022(local3258, local552 + 57, local563, local38.anInt2145, local38.aBoolean121 ? 0 : -1);
															} else {
																local1952.method4003(local3258, local552 + 114, local563, local38.anInt2145, local38.aBoolean121 ? 0 : -1);
															}
														}
														local284++;
													}
												}
											}
											if (local38.anInt2176 == 8 && local38 == Static188.aClass66_31 && Static192.anInt3646 == Static206.anInt3932) {
												local284 = 0;
												local272 = 0;
												@Pc(3387) String local3387 = local38.aString122;
												@Pc(3389) Class1_Sub2_Sub6 local3389 = Static140.aClass1_Sub2_Sub6_3;
												local3387 = Static289.method4412(local38, local3387);
												@Pc(3406) String local3406;
												while (local3387.length() > 0) {
													local525 = local3387.indexOf("<br>");
													if (local525 == -1) {
														local3406 = local3387;
														local3387 = "";
													} else {
														local3406 = local3387.substring(0, local525);
														local3387 = local3387.substring(local525 + 4);
													}
													local552 = local3389.method4023(local3406);
													local284 += local3389.anInt4589 + 1;
													if (local272 < local552) {
														local272 = local552;
													}
												}
												local284 += 7;
												local272 += 6;
												local552 = local38.anInt2207 + local126 + 5;
												if (arg8 < local552 + local284) {
													local552 = arg8 - local284;
												}
												local525 = local120 + local38.anInt2204 - local272 - 5;
												if (local525 < local120 + 5) {
													local525 = local120 + 5;
												}
												if (local272 + local525 > arg2) {
													local525 = arg2 - local272;
												}
												if (Static156.aBoolean211) {
													Static119.method2129(local525, local552, local272, local284, 16777120);
													Static119.method2135(local525, local552, local272, local284, 0);
												} else {
													Static25.method385(local525, local552, local272, local284, 16777120);
													Static25.method402(local525, local552, local272, local284, 0);
												}
												local563 = local3389.anInt4589 + local552 + 2;
												local3387 = local38.aString122;
												local3387 = Static289.method4412(local38, local3387);
												while (local3387.length() > 0) {
													local579 = local3387.indexOf("<br>");
													if (local579 == -1) {
														local3406 = local3387;
														local3387 = "";
													} else {
														local3406 = local3387.substring(0, local579);
														local3387 = local3387.substring(local579 + 4);
													}
													local3389.method4016(local3406, local525 + 3, local563, 0, -1);
													local563 += local3389.anInt4589 + 1;
												}
											}
											if (local38.anInt2176 == 9) {
												if (local38.aBoolean133) {
													local517 = local126;
													local477 = local38.anInt2204 + local120;
													local284 = local38.anInt2207 + local126;
												} else {
													local284 = local126;
													local517 = local126 + local38.anInt2207;
													local477 = local120 + local38.anInt2204;
												}
												if (local38.anInt2177 == 1) {
													if (Static156.aBoolean211) {
														Static119.method2123(local120, local284, local477, local517, local38.anInt2145);
													} else {
														Static25.method393(local120, local284, local477, local517, local38.anInt2145);
													}
												} else if (Static156.aBoolean211) {
													Static119.method2132(local120, local284, local477, local517, local38.anInt2145, local38.anInt2177);
												} else {
													Static25.method411(local120, local284, local477, local517, local38.anInt2145, local38.anInt2177);
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

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "(B)V")
	public static void method1950() {
		if (Static90.aClass15_Sub5_Sub2_2 != null && Static90.aClass15_Sub5_Sub2_2.anInt5559 + 64 - Static90.aClass15_Sub5_Sub2_2.method4702() * 64 >> 7 == Static162.anInt3171 && Static90.aClass15_Sub5_Sub2_2.anInt5557 + 64 - Static90.aClass15_Sub5_Sub2_2.method4702() * 64 >> 7 == Static196.anInt3703) {
			Static162.anInt3171 = 0;
			Static52.aBoolean381 = false;
		}
		@Pc(46) int local46;
		for (local46 = 0; local46 < 104; local46++) {
			for (@Pc(51) int local51 = 0; local51 < 104; local51++) {
				Static281.anIntArrayArray41[local46][local51] = 0;
			}
		}
		for (local46 = 0; local46 < Static304.anInt5394; local46++) {
			@Pc(77) Class15_Sub5_Sub2 local77 = Static17.aClass15_Sub5_Sub2Array1[Static275.anIntArray440[local46]];
			if (local77 != null) {
				local77.aBoolean377 = false;
			}
		}
		for (local46 = 0; local46 < Static85.anInt1689; local46++) {
			@Pc(102) Class15_Sub5_Sub1 local102 = Static83.aClass15_Sub5_Sub1Array1[Static104.anIntArray178[local46]];
			if (local102 != null) {
				local102.aBoolean377 = false;
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(Z)V")
	public static void method1952() {
		if (Static35.anInt3965 == 0) {
			return;
		}
		try {
			if (++Static287.anInt5145 > 1500) {
				if (Static5.aClass97_1 != null) {
					Static5.aClass97_1.method2547();
					Static5.aClass97_1 = null;
				}
				if (Static234.anInt4282 >= 1) {
					Static35.anInt3965 = 0;
					Static201.anInt3864 = -5;
					return;
				}
				Static234.anInt4282++;
				Static35.anInt3965 = 1;
				if (Static160.anInt3164 == Static224.anInt4119) {
					Static224.anInt4119 = Static115.anInt2426;
				} else {
					Static224.anInt4119 = Static160.anInt3164;
				}
				Static287.anInt5145 = 0;
			}
			if (Static35.anInt3965 == 1) {
				Static111.aClass185_3 = Static26.aClass154_1.method3892(Static47.aString51, Static224.anInt4119);
				Static35.anInt3965 = 2;
			}
			@Pc(129) int local129;
			if (Static35.anInt3965 == 2) {
				if (Static111.aClass185_3.anInt5276 == 2) {
					throw new IOException();
				}
				if (Static111.aClass185_3.anInt5276 != 1) {
					return;
				}
				Static5.aClass97_1 = new Class97((Socket) Static111.aClass185_3.anObject6, Static26.aClass154_1);
				Static111.aClass185_3 = null;
				Static5.aClass97_1.method2552(Static127.aClass1_Sub14_Sub1_3.anInt1480, Static127.aClass1_Sub14_Sub1_3.aByteArray17);
				if (Static300.aClass28_2 != null) {
					Static300.aClass28_2.method4777();
				}
				if (Static248.aClass28_1 != null) {
					Static248.aClass28_1.method4777();
				}
				local129 = Static5.aClass97_1.method2548();
				if (Static300.aClass28_2 != null) {
					Static300.aClass28_2.method4777();
				}
				if (Static248.aClass28_1 != null) {
					Static248.aClass28_1.method4777();
				}
				if (local129 != 101) {
					Static35.anInt3965 = 0;
					Static201.anInt3864 = local129;
					Static5.aClass97_1.method2547();
					Static5.aClass97_1 = null;
					return;
				}
				Static35.anInt3965 = 3;
			}
			if (Static35.anInt3965 == 3) {
				if (Static5.aClass97_1.method2551() >= 2) {
					local129 = Static5.aClass97_1.method2548() << 8 | Static5.aClass97_1.method2548();
					Static189.method3087(local129);
					if (Static312.anInt5731 != -1) {
						Static35.anInt3965 = 0;
						Static5.aClass97_1.method2547();
						Static5.aClass97_1 = null;
						Static145.method2482();
						return;
					}
					Static201.anInt3864 = 6;
					Static35.anInt3965 = 0;
					Static5.aClass97_1.method2547();
					Static5.aClass97_1 = null;
					return;
				}
				return;
			}
		} catch (@Pc(213) IOException local213) {
			if (Static5.aClass97_1 != null) {
				Static5.aClass97_1.method2547();
				Static5.aClass97_1 = null;
			}
			if (Static234.anInt4282 < 1) {
				Static35.anInt3965 = 1;
				Static234.anInt4282++;
				if (Static160.anInt3164 == Static224.anInt4119) {
					Static224.anInt4119 = Static115.anInt2426;
				} else {
					Static224.anInt4119 = Static160.anInt3164;
				}
				Static287.anInt5145 = 0;
			} else {
				Static35.anInt3965 = 0;
				Static201.anInt3864 = -4;
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!c", name = "m", descriptor = "Lclient!ef;")
	public static Class16 aClass16_21;

	@OriginalMember(owner = "client!c", name = "w", descriptor = "Lclient!nc;")
	public static Class3_Sub14 aClass3_Sub14_2;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "Lclient!he;")
	public static Class26 aClass26_209 = Static6.method100("scape main");

	@OriginalMember(owner = "client!c", name = "j", descriptor = "[S")
	public static short[] aShortArray6 = new short[] { -1, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!c", name = "l", descriptor = "[[I")
	public static int[][] anIntArrayArray3 = new int[104][104];

	@OriginalMember(owner = "client!c", name = "o", descriptor = "Lclient!sf;")
	public static Class66 aClass66_3 = new Class66(100);

	@OriginalMember(owner = "client!c", name = "p", descriptor = "Lclient!he;")
	public static Class26 aClass26_210 = Static6.method100("<col=40ff00>");

	@OriginalMember(owner = "client!c", name = "r", descriptor = "B")
	public static byte aByte1 = 0;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "J")
	public static volatile long aLong13 = 0L;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "J")
	public static volatile long aLong14 = 0L;

	@OriginalMember(owner = "client!c", name = "v", descriptor = "[J")
	public static long[] aLongArray1 = new long[100];

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([Lclient!nc;IIIIIIIII)V")
	public static void method240(@OriginalArg(0) Class3_Sub14[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static77.method2218(arg8, arg6, arg3, arg1);
		Static127.method2238();
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(19) Class3_Sub14 local19 = arg0[local13];
			if (local19 != null && (local19.anInt2159 == arg7 || arg7 == -1412584499 && Static109.aClass3_Sub14_15 == local19)) {
				@Pc(39) int local39;
				if (arg5 == -1) {
					Static39.anIntArray134[Static15.anInt403] = arg4 + local19.anInt2158;
					Static66.anIntArray296[Static15.anInt403] = local19.anInt2178 + arg2;
					Static125.anIntArray386[Static15.anInt403] = local19.anInt2146;
					Static31.anIntArray328[Static15.anInt403] = local19.anInt2161;
					local39 = Static15.anInt403++;
				} else {
					local39 = arg5;
				}
				local19.anInt2166 = local39;
				local19.anInt2191 = Static4.anInt136;
				if (!local19.aBoolean113 || !Static88.method1628(local19)) {
					if (local19.anInt2186 > 0) {
						Static115.method2081(local19);
					}
					@Pc(100) int local100 = local19.anInt2158 + arg4;
					@Pc(105) int local105 = local19.anInt2178 + arg2;
					@Pc(108) int local108 = local19.anInt2207;
					@Pc(133) int local133;
					@Pc(135) int local135;
					if (local19 == Static109.aClass3_Sub14_15) {
						if (arg7 != -1412584499 && !local19.aBoolean111) {
							Static60.anInt1828 = arg2;
							Static38.aClass3_Sub14Array1 = arg0;
							Static1.anInt2 = arg4;
							continue;
						}
						if (Static32.aBoolean59 && Static54.aBoolean86) {
							local133 = Static59.anInt1807;
							local135 = Static7.anInt187;
							local133 -= Static122.anInt3177;
							local135 -= Static116.anInt3059;
							if (local135 < Static43.anInt2683) {
								local135 = Static43.anInt2683;
							}
							if (Static3.anInt92 > local133) {
								local133 = Static3.anInt92;
							}
							if (Static96.aClass3_Sub14_14.anInt2146 + Static3.anInt92 < local133 - -local19.anInt2146) {
								local133 = Static96.aClass3_Sub14_14.anInt2146 + Static3.anInt92 - local19.anInt2146;
							}
							if (local19.anInt2161 + local135 > Static96.aClass3_Sub14_14.anInt2161 + Static43.anInt2683) {
								local135 = Static43.anInt2683 + Static96.aClass3_Sub14_14.anInt2161 - local19.anInt2161;
							}
							local105 = local135;
							local100 = local133;
						}
						if (!local19.aBoolean111) {
							local108 = 128;
						}
					}
					@Pc(265) int local265;
					@Pc(301) int local301;
					@Pc(220) int local220;
					@Pc(254) int local254;
					@Pc(231) int local231;
					@Pc(226) int local226;
					if (local19.anInt2204 == 2) {
						local135 = arg6;
						local133 = arg8;
						local301 = arg1;
						local265 = arg3;
					} else if (local19.anInt2204 == 9) {
						local220 = local100;
						local226 = local105 + local19.anInt2161;
						local231 = local100 + local19.anInt2146;
						if (local100 > local231) {
							local220 = local231;
							local231 = local100;
						}
						local231++;
						local133 = arg8 >= local220 ? arg8 : local220;
						local254 = local105;
						local265 = arg3 > local231 ? local231 : arg3;
						if (local226 < local105) {
							local254 = local226;
							local226 = local105;
						}
						local226++;
						local135 = arg6 < local254 ? local254 : arg6;
						local301 = arg1 > local226 ? local226 : arg1;
					} else {
						local135 = local105 <= arg6 ? arg6 : local105;
						local133 = local100 <= arg8 ? arg8 : local100;
						local254 = local19.anInt2161 + local105;
						local301 = local254 < arg1 ? local254 : arg1;
						local220 = local100 + local19.anInt2146;
						local265 = arg3 > local220 ? local220 : arg3;
					}
					if (!local19.aBoolean113 || local265 > local133 && local135 < local301) {
						if (local19.anInt2186 != 0) {
							if (local19.anInt2186 == 1337) {
								Static73.anInt2074 = local100;
								Static64.anInt1935 = local105;
								Static101.method1895(local100, local19.anInt2146, local105, local19.anInt2161);
								Static77.method2218(arg8, arg6, arg3, arg1);
								continue;
							}
							if (local19.anInt2186 == 1338) {
								Static23.method873(local100, local39, local105);
								Static77.method2218(arg8, arg6, arg3, arg1);
								continue;
							}
						}
						local220 = Static59.anInt1807;
						local254 = Static7.anInt187;
						if (!Static109.aBoolean162 && local220 >= local133 && local135 <= local254 && local265 > local220 && local254 < local301) {
							Static115.method2082(local19, local254 - local105, -local100 + local220);
						}
						if (local19.anInt2204 == 0) {
							if (!local19.aBoolean113 && Static88.method1628(local19) && local19 != Static53.aClass3_Sub14_4) {
								continue;
							}
							if (!local19.aBoolean113) {
								if (local19.anInt2193 > local19.anInt2172 - local19.anInt2161) {
									local19.anInt2193 = local19.anInt2172 - local19.anInt2161;
								}
								if (local19.anInt2193 < 0) {
									local19.anInt2193 = 0;
								}
							}
							method240(arg0, local301, local105 - local19.anInt2193, local265, local100 - local19.anInt2189, local39, local135, local19.anInt2154, local133);
							if (local19.aClass3_Sub14Array2 != null) {
								method240(local19.aClass3_Sub14Array2, local301, local105 - local19.anInt2193, local265, local100 - local19.anInt2189, local39, local135, local19.anInt2154, local133);
							}
							@Pc(540) Class3_Sub17 local540 = (Class3_Sub17) Static52.aClass17_9.method599((long) local19.anInt2154);
							if (local540 != null) {
								if (local540.anInt2549 == 0 && local133 <= Static59.anInt1807 && Static7.anInt187 >= local135 && local265 > Static59.anInt1807 && Static7.anInt187 < local301 && !Static109.aBoolean162 && !Static27.aBoolean56) {
									Static56.anInt1695 = 1;
									Static132.anIntArray411[0] = 1007;
									Static56.aClass26Array13[0] = Static132.aClass26_1814;
									Static29.aClass26Array7[0] = Static22.aClass26_415;
								}
								Static4.method65(local301, local100, local265, local39, local105, local133, local135, local540.anInt2552);
							}
							Static77.method2218(arg8, arg6, arg3, arg1);
							Static127.method2238();
						}
						if (Static36.aBooleanArray12[local39] || Static87.anInt2437 > 1) {
							if (local19.anInt2204 == 0 && !local19.aBoolean113 && local19.anInt2161 < local19.anInt2172) {
								Static6.method103(local19.anInt2193, local19.anInt2172, local19.anInt2146 + local100, local105, local19.anInt2161);
							}
							if (local19.anInt2204 != 1) {
								@Pc(653) int local653;
								@Pc(665) int local665;
								@Pc(837) int local837;
								@Pc(711) int local711;
								@Pc(895) int local895;
								@Pc(675) int local675;
								@Pc(822) int local822;
								if (local19.anInt2204 == 2) {
									local231 = 0;
									for (local226 = 0; local226 < local19.anInt2161; local226++) {
										for (local653 = 0; local653 < local19.anInt2146; local653++) {
											local665 = (local19.anInt2163 + 32) * local653 + local100;
											local675 = (local19.anInt2190 + 32) * local226 + local105;
											if (local231 < 20) {
												local675 += local19.anIntArray219[local231];
												local665 += local19.anIntArray216[local231];
											}
											if (local19.anIntArray214[local231] > 0) {
												local711 = local19.anIntArray214[local231] - 1;
												if (local665 + 32 > arg8 && arg3 > local665 && arg6 < local675 + 32 && local675 < arg1 || Static6.aClass3_Sub14_1 == local19 && local231 == Static90.anInt2490) {
													@Pc(772) Class3_Sub1_Sub4_Sub3 local772;
													if (Static3.anInt89 == 1 && local231 == Static67.anInt2802 && Static93.anInt2530 == local19.anInt2154) {
														local772 = Static38.method767(false, local711, local19.anIntArray215[local231], 2, 0);
													} else {
														local772 = Static38.method767(false, local711, local19.anIntArray215[local231], 1, 3153952);
													}
													if (local772 == null) {
														Static110.method2004(local19);
													} else if (Static6.aClass3_Sub14_1 == local19 && Static90.anInt2490 == local231) {
														local822 = Static59.anInt1807 - Static113.anInt3014;
														if (local822 < 5 && local822 > -5) {
															local822 = 0;
														}
														local837 = Static7.anInt187 - Static96.anInt2604;
														if (local837 < 5 && local837 > -5) {
															local837 = 0;
														}
														if (Static5.anInt3225 < 5) {
															local837 = 0;
															local822 = 0;
														}
														local772.method1741(local822 + local665, local675 - -local837, 128);
														if (arg7 != -1) {
															@Pc(872) Class3_Sub14 local872 = arg0[arg7 & 0xFFFF];
															if (local675 + local837 < Static77.anInt3243 && local872.anInt2193 > 0) {
																local895 = Static42.anInt1304 * (Static77.anInt3243 - local837 - local675) / 3;
																if (local895 > Static42.anInt1304 * 10) {
																	local895 = Static42.anInt1304 * 10;
																}
																if (local872.anInt2193 < local895) {
																	local895 = local872.anInt2193;
																}
																local872.anInt2193 -= local895;
																Static96.anInt2604 += local895;
																Static110.method2004(local872);
															}
															if (local837 + local675 + 32 > Static77.anInt3240 && local872.anInt2172 - local872.anInt2161 > local872.anInt2193) {
																local895 = Static42.anInt1304 * (local675 + local837 + 32 - Static77.anInt3240) / 3;
																if (local895 > Static42.anInt1304 * 10) {
																	local895 = Static42.anInt1304 * 10;
																}
																if (local872.anInt2172 - local872.anInt2161 - local872.anInt2193 < local895) {
																	local895 = local872.anInt2172 - local872.anInt2161 - local872.anInt2193;
																}
																Static96.anInt2604 -= local895;
																local872.anInt2193 += local895;
																Static110.method2004(local872);
															}
														}
													} else if (Static74.aClass3_Sub14_7 == local19 && local231 == Static62.anInt1894) {
														local772.method1741(local665, local675, 128);
													} else {
														local772.method1758(local665, local675);
													}
												}
											} else if (local19.anIntArray213 != null && local231 < 20) {
												@Pc(1028) Class3_Sub1_Sub4_Sub3 local1028 = local19.method1389(local231);
												if (local1028 != null) {
													local1028.method1758(local665, local675);
												} else if (Static81.aBoolean125) {
													Static110.method2004(local19);
												}
											}
											local231++;
										}
									}
								} else if (local19.anInt2204 == 3) {
									if (Static57.method1143(local19)) {
										local231 = local19.anInt2203;
										if (local19 == Static53.aClass3_Sub14_4 && local19.anInt2138 != 0) {
											local231 = local19.anInt2138;
										}
									} else {
										local231 = local19.anInt2167;
										if (local19 == Static53.aClass3_Sub14_4 && local19.anInt2168 != 0) {
											local231 = local19.anInt2168;
										}
									}
									if (local108 == 0) {
										if (local19.aBoolean112) {
											Static77.method2214(local100, local105, local19.anInt2146, local19.anInt2161, local231);
										} else {
											Static77.method2228(local100, local105, local19.anInt2146, local19.anInt2161, local231);
										}
									} else if (local19.aBoolean112) {
										Static77.method2224(local100, local105, local19.anInt2146, local19.anInt2161, local231, 256 - (local108 & 0xFF));
									} else {
										Static77.method2223(local100, local105, local19.anInt2146, local19.anInt2161, local231, 256 - (local108 & 0xFF));
									}
								} else {
									@Pc(1171) Class3_Sub1_Sub4_Sub2_Sub1 local1171;
									if (local19.anInt2204 == 4) {
										local1171 = local19.method1386();
										if (local1171 != null) {
											@Pc(1183) Class26 local1183 = local19.aClass26_1112;
											if (Static57.method1143(local19)) {
												local226 = local19.anInt2203;
												if (local19 == Static53.aClass3_Sub14_4 && local19.anInt2138 != 0) {
													local226 = local19.anInt2138;
												}
												if (local19.aClass26_1111.method839() > 0) {
													local1183 = local19.aClass26_1111;
												}
											} else {
												local226 = local19.anInt2167;
												if (local19 == Static53.aClass3_Sub14_4 && local19.anInt2168 != 0) {
													local226 = local19.anInt2168;
												}
											}
											if (local19.aBoolean113 && local19.anInt2185 != -1) {
												@Pc(1239) Class3_Sub1_Sub9 local1239 = Static117.method2099(local19.anInt2185);
												local1183 = local1239.aClass26_857;
												if (local1183 == null) {
													local1183 = Static119.aClass26_1692;
												}
												if ((local1239.anInt1715 == 1 || local19.anInt2139 != 1) && local19.anInt2139 != -1) {
													local1183 = Static119.method2136(new Class26[] { Static102.aClass26_1501, local1183, Static29.aClass26_483, Static57.method1153(local19.anInt2139) });
												}
											}
											if (Static79.aClass3_Sub14_8 == local19) {
												local1183 = Static115.aClass26_1627;
												local226 = local19.anInt2167;
											}
											if (!local19.aBoolean113) {
												local1183 = Static106.method1963(local1183, local19);
											}
											local1171.method1606(local1183, local100, local105, local19.anInt2146, local19.anInt2161, local226, local19.aBoolean110 ? 0 : -1, local19.anInt2180, local19.anInt2206, local19.anInt2148);
										} else if (Static81.aBoolean125) {
											Static110.method2004(local19);
										}
									} else if (local19.anInt2204 == 5) {
										@Pc(1337) Class3_Sub1_Sub4_Sub3 local1337;
										if (local19.aBoolean113) {
											if (local19.anInt2185 == -1) {
												local1337 = local19.method1383(false);
											} else {
												local1337 = Static38.method767(false, local19.anInt2185, local19.anInt2139, local19.anInt2171, local19.anInt2149);
											}
											if (local1337 != null) {
												local226 = local1337.anInt2584;
												local653 = local1337.anInt2582;
												if (local19.aBoolean120) {
													Static77.method2229(local100, local105, local100 + local19.anInt2146, local105 - -local19.anInt2161);
													local665 = (local226 + local19.anInt2146 - 1) / local226;
													local675 = (local19.anInt2161 + local653 - 1) / local653;
													for (local822 = 0; local822 < local665; local822++) {
														for (local837 = 0; local837 < local675; local837++) {
															if (local19.anInt2182 != 0) {
																local1337.method1745(local226 / 2 + local100 + local226 * local822, local653 * local837 + local105 - -(local653 / 2), local19.anInt2182, 4096);
															} else if (local108 == 0) {
																local1337.method1758(local226 * local822 + local100, local653 * local837 + local105);
															} else {
																local1337.method1741(local100 + local822 * local226, local105 - -(local653 * local837), 256 - (local108 & 0xFF));
															}
														}
													}
													Static77.method2218(arg8, arg6, arg3, arg1);
												} else {
													local665 = local19.anInt2146 * 4096 / local226;
													if (local19.anInt2182 != 0) {
														local1337.method1745(local100 + local19.anInt2146 / 2, local19.anInt2161 / 2 + local105, local19.anInt2182, local665);
													} else if (local108 != 0) {
														local1337.method1737(local100, local105, local19.anInt2146, local19.anInt2161, 256 - (local108 & 0xFF));
													} else if (local19.anInt2146 == local226 && local19.anInt2161 == local653) {
														local1337.method1758(local100, local105);
													} else {
														local1337.method1747(local100, local105, local19.anInt2146, local19.anInt2161);
													}
												}
											} else if (Static81.aBoolean125) {
												Static110.method2004(local19);
											}
										} else {
											local1337 = local19.method1383(Static57.method1143(local19));
											if (local1337 != null) {
												local1337.method1758(local100, local105);
											} else if (Static81.aBoolean125) {
												Static110.method2004(local19);
											}
										}
									} else {
										@Pc(1637) Class3_Sub1_Sub9 local1637;
										if (local19.anInt2204 == 6) {
											@Pc(1614) boolean local1614 = Static57.method1143(local19);
											if (local1614) {
												local226 = local19.anInt2155;
											} else {
												local226 = local19.anInt2176;
											}
											local665 = 0;
											@Pc(1628) Class3_Sub1_Sub5_Sub7 local1628 = null;
											if (local19.anInt2185 != -1) {
												local1637 = Static117.method2099(local19.anInt2185);
												if (local1637 != null) {
													local1637 = local1637.method1133(local19.anInt2139);
													local1628 = local1637.method1125(1);
													if (local1628 == null) {
														Static110.method2004(local19);
													} else {
														local1628.method1475();
														local665 = local1628.anInt2680 / 2;
													}
												}
											} else if (local19.anInt2134 == 5) {
												if (local19.anInt2201 == 0) {
													local1628 = Static119.aClass35_2.method1145(-1, null, -1, null);
												} else {
													local1628 = Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.method1874();
												}
											} else if (local226 == -1) {
												local1628 = local19.method1379(null, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.aClass35_1, local1614, -1);
												if (local1628 == null && Static81.aBoolean125) {
													Static110.method2004(local19);
												}
											} else {
												@Pc(1693) Class3_Sub1_Sub17 local1693 = Static111.method2009(local226);
												local1628 = local19.method1379(local1693, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.aClass35_1, local1614, local19.anInt2144);
												if (local1628 == null && Static81.aBoolean125) {
													Static110.method2004(local19);
												}
											}
											Static127.method2241(local19.anInt2146 / 2 + local100, local105 - -(local19.anInt2161 / 2));
											local675 = local19.anInt2151 * Class3_Sub1_Sub4_Sub4.anIntArray391[local19.anInt2179] >> 16;
											local822 = Class3_Sub1_Sub4_Sub4.anIntArray392[local19.anInt2179] * local19.anInt2151 >> 16;
											if (local1628 != null) {
												if (local19.aBoolean113) {
													local1628.method1475();
													if (local19.aBoolean121) {
														local1628.method1479(local19.anInt2192, local19.anInt2143, local19.anInt2179, local19.anInt2184, local665 + local675 + local19.anInt2142, local822 - -local19.anInt2142, local19.anInt2151);
													} else {
														local1628.method1466(local19.anInt2192, local19.anInt2143, local19.anInt2179, local19.anInt2184, local19.anInt2142 + local675 + local665, local822 - -local19.anInt2142);
													}
												} else {
													local1628.method1466(local19.anInt2192, 0, local19.anInt2179, 0, local675, local822);
												}
											}
											Static127.method2249();
										} else {
											if (local19.anInt2204 == 7) {
												local1171 = local19.method1386();
												if (local1171 == null) {
													if (Static81.aBoolean125) {
														Static110.method2004(local19);
													}
													continue;
												}
												local226 = 0;
												for (local653 = 0; local653 < local19.anInt2161; local653++) {
													for (local665 = 0; local665 < local19.anInt2146; local665++) {
														if (local19.anIntArray214[local226] > 0) {
															local1637 = Static117.method2099(local19.anIntArray214[local226] - 1);
															@Pc(1921) Class26 local1921;
															if (local1637.anInt1715 != 1 && local19.anIntArray215[local226] == 1) {
																local1921 = Static119.method2136(new Class26[] { Static102.aClass26_1501, local1637.aClass26_857, Static12.aClass26_170 });
															} else {
																local1921 = Static119.method2136(new Class26[] { Static102.aClass26_1501, local1637.aClass26_857, Static29.aClass26_483, Static57.method1153(local19.anIntArray215[local226]) });
															}
															local837 = local665 * (local19.anInt2163 + 115) + local100;
															local711 = local105 + local653 * (local19.anInt2190 + 12);
															if (local19.anInt2180 == 0) {
																local1171.method1617(local1921, local837, local711, local19.anInt2167, local19.aBoolean110 ? 0 : -1);
															} else if (local19.anInt2180 == 1) {
																local1171.method1611(local1921, local19.anInt2146 / 2 + local837, local711, local19.anInt2167, local19.aBoolean110 ? 0 : -1);
															} else {
																local1171.method1597(local1921, local837 + local19.anInt2146 - 1, local711, local19.anInt2167, local19.aBoolean110 ? 0 : -1);
															}
														}
														local226++;
													}
												}
											}
											@Pc(2205) int local2205;
											if (local19.anInt2204 == 8 && Static71.aClass3_Sub14_6 == local19 && Static126.anInt3212 == Static8.anInt205) {
												local226 = 0;
												@Pc(2056) Class3_Sub1_Sub4_Sub2_Sub1 local2056 = Static91.aClass3_Sub1_Sub4_Sub2_Sub1_3;
												local231 = 0;
												@Pc(2061) Class26 local2061 = local19.aClass26_1112;
												local2061 = Static106.method1963(local2061, local19);
												@Pc(2082) Class26 local2082;
												while (local2061.method839() > 0) {
													local822 = local2061.method817(Static17.aClass26_255);
													if (local822 == -1) {
														local2082 = local2061;
														local2061 = Static22.aClass26_415;
													} else {
														local2082 = local2061.method843(0, local822);
														local2061 = local2061.method819(local822 + 4);
													}
													local837 = local2056.method1600(local2082);
													if (local231 < local837) {
														local231 = local837;
													}
													local226 += local2056.anInt2428 + 1;
												}
												local231 += 6;
												local226 += 7;
												local822 = local100 + local19.anInt2146 - local231 - 5;
												local837 = local19.anInt2161 + local105 + 5;
												if (local822 < local100 + 5) {
													local822 = local100 + 5;
												}
												if (arg3 < local822 + local231) {
													local822 = arg3 - local231;
												}
												if (arg1 < local837 + local226) {
													local837 = arg1 - local226;
												}
												Static77.method2214(local822, local837, local231, local226, 16777120);
												Static77.method2228(local822, local837, local231, local226, 0);
												local711 = local2056.anInt2428 + local837 + 2;
												local2061 = local19.aClass26_1112;
												local2061 = Static106.method1963(local2061, local19);
												while (local2061.method839() > 0) {
													local2205 = local2061.method817(Static17.aClass26_255);
													if (local2205 == -1) {
														local2082 = local2061;
														local2061 = Static22.aClass26_415;
													} else {
														local2082 = local2061.method843(0, local2205);
														local2061 = local2061.method819(local2205 + 4);
													}
													local2056.method1617(local2082, local822 + 3, local711, 0, -1);
													local711 += local2056.anInt2428 + 1;
												}
											}
											if (local19.anInt2204 == 9) {
												if (local19.anInt2170 == 1) {
													Static77.method2227(local100, local105, local100 + local19.anInt2146, local19.anInt2161 + local105, local19.anInt2167);
												} else {
													local231 = local19.anInt2146 >= 0 ? local19.anInt2146 : -local19.anInt2146;
													local226 = local19.anInt2161 >= 0 ? local19.anInt2161 : -local19.anInt2161;
													local653 = local231;
													if (local226 > local231) {
														local653 = local226;
													}
													if (local653 != 0) {
														local665 = (local19.anInt2146 << 16) / local653;
														local675 = (local19.anInt2161 << 16) / local653;
														if (local665 < local675) {
															local675 = -local675;
														} else {
															local665 = -local665;
														}
														local837 = local19.anInt2170 * local675 + 1 >> 17;
														local711 = local19.anInt2170 * local665 >> 17;
														local822 = local675 * local19.anInt2170 >> 17;
														local895 = local100 - local837;
														@Pc(2366) int local2366 = local100 + local822;
														@Pc(2373) int local2373 = local19.anInt2146 + local100 - local837;
														@Pc(2381) int local2381 = local100 + local19.anInt2146 + local822;
														@Pc(2386) int local2386 = local105 + local711;
														local2205 = local665 * local19.anInt2170 + 1 >> 17;
														@Pc(2400) int local2400 = local105 - local2205;
														@Pc(2408) int local2408 = local19.anInt2161 + local105 - local2205;
														@Pc(2417) int local2417 = local105 + local19.anInt2161 + local711;
														Static127.method2240(local2366, local895, local2373);
														Static127.method2242(local2386, local2400, local2408, local2366, local895, local2373, local19.anInt2167);
														Static127.method2240(local2366, local2373, local2381);
														Static127.method2242(local2386, local2408, local2417, local2366, local2373, local2381, local19.anInt2167);
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
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)V")
	public static void method241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static93.anInt2529 == 2) {
			Static103.method1903(Static17.anInt426 + (Static124.anInt3202 - Static10.anInt286 << 7), Static95.anInt2598 * 2, (Static124.anInt3189 - Static56.anInt1700 << 7) + Static17.anInt422);
			if (Static47.anInt1417 > -1 && Static4.anInt136 % 20 < 10) {
				Static25.aClass3_Sub1_Sub4_Sub3Array13[0].method1758(Static47.anInt1417 + arg0 - 12, arg1 - -Static15.anInt408 - 28);
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
	public static void method242() {
		Static46.aClass66_14.method1971();
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
	public static void method243() {
		anIntArrayArray3 = null;
		aClass16_21 = null;
		aClass26_209 = null;
		aShortArray6 = null;
		aClass66_3 = null;
		aClass26_210 = null;
		aClass3_Sub14_2 = null;
		aLongArray1 = null;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)V")
	public static void method244(@OriginalArg(1) int arg0) {
		if (arg0 == -3) {
			Static63.method1249(Static25.aClass26_1715, Static32.aClass26_520, Static131.aClass26_1785);
		} else if (arg0 == -2) {
			Static63.method1249(Static87.aClass26_1260, Static131.aClass26_1788, Static131.aClass26_1773);
		} else if (arg0 == -1) {
			Static63.method1249(Static25.aClass26_1712, Static2.aClass26_8, Static131.aClass26_1784);
		} else if (arg0 == 3) {
			Static63.method1249(Static109.aClass26_1593, Static131.aClass26_1803, Static131.aClass26_1806);
		} else if (arg0 == 4) {
			Static63.method1249(Static99.aClass26_1485, Static116.aClass26_1631, Static131.aClass26_1809);
		} else if (arg0 == 5) {
			Static63.method1249(Static29.aClass26_479, Static20.aClass26_320, Static131.aClass26_1802);
		} else if (arg0 == 6) {
			Static63.method1249(Static42.aClass26_703, Static15.aClass26_240, Static131.aClass26_1812);
		} else if (arg0 == 7) {
			Static63.method1249(Static58.aClass26_886, Static11.aClass26_169, Static131.aClass26_1786);
		} else if (arg0 == 8) {
			Static63.method1249(Static67.aClass26_1515, Static90.aClass26_1314, Static131.aClass26_1810);
		} else if (arg0 == 9) {
			Static63.method1249(Static110.aClass26_1599, Static5.aClass26_1750, Static131.aClass26_1799);
		} else if (arg0 == 10) {
			Static63.method1249(Static52.aClass26_822, Static90.aClass26_1311, Static131.aClass26_1777);
		} else if (arg0 == 11) {
			Static63.method1249(Static107.aClass26_1547, Static64.aClass26_958, Static131.aClass26_1774);
		} else if (arg0 == 12) {
			Static63.method1249(Static59.aClass26_892, Static87.aClass26_1262, Static131.aClass26_1795);
		} else if (arg0 == 13) {
			Static63.method1249(Static25.aClass26_1716, Static4.aClass26_64, Static131.aClass26_1782);
		} else if (arg0 == 14) {
			Static63.method1249(Static101.aClass26_1495, Static60.aClass26_911, Static131.aClass26_1792);
		} else if (arg0 == 16) {
			Static63.method1249(Static20.aClass26_319, Static88.aClass26_1269, Static131.aClass26_1781);
		} else if (arg0 == 17) {
			Static63.method1249(Static6.aClass26_91, Static57.aClass26_863, Static131.aClass26_1790);
		} else if (arg0 == 18) {
			Static63.method1249(Static116.aClass26_1630, Static94.aClass26_1361, Static131.aClass26_1807);
		} else if (arg0 == 19) {
			Static63.method1249(Static57.aClass26_867, Static3.aClass26_59, Static58.aClass26_888);
		} else if (arg0 == 20) {
			Static63.method1249(Static25.aClass26_1713, Static51.aClass26_803, Static131.aClass26_1789);
		} else if (arg0 == 22) {
			Static63.method1249(Static56.aClass26_858, Static18.aClass26_263, Static131.aClass26_1787);
		} else if (arg0 == 23) {
			Static63.method1249(Static101.aClass26_1498, Static44.aClass26_704, Static131.aClass26_1775);
		} else if (arg0 == 24) {
			Static63.method1249(Static76.aClass26_1076, Static23.aClass26_728, Static131.aClass26_1801);
		} else if (arg0 == 25) {
			Static63.method1249(Static25.aClass26_1722, Static72.aClass26_1034, Static131.aClass26_1778);
		} else if (arg0 == 26) {
			Static63.method1249(Static67.aClass26_1510, Static65.aClass26_961, Static131.aClass26_1797);
		} else if (arg0 == 27) {
			Static63.method1249(Static18.aClass26_265, Static131.aClass26_1794, Static131.aClass26_1779);
		} else {
			Static63.method1249(Static25.aClass26_1714, Static12.aClass26_174, Static131.aClass26_1800);
		}
		Static4.method62(10);
	}
}

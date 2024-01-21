import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!lf", name = "X", descriptor = "[I")
	public static int[] anIntArray280;

	@OriginalMember(owner = "client!lf", name = "bb", descriptor = "[[B")
	public static byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!lf", name = "db", descriptor = "Lclient!r;")
	public static Class41_Sub1 aClass41_Sub1_11;

	@OriginalMember(owner = "client!lf", name = "cc", descriptor = "Lclient!kb;")
	public static Class41 aClass41_12;

	@OriginalMember(owner = "client!lf", name = "eb", descriptor = "Lclient!qb;")
	public static Class62 aClass62_1 = new Class62();

	@OriginalMember(owner = "client!lf", name = "gb", descriptor = "Lclient!af;")
	public static Class5 aClass5_837 = Static45.method1937("me");

	@OriginalMember(owner = "client!lf", name = "Sb", descriptor = "Lclient!af;")
	private static Class5 aClass5_839 = Static45.method1937("wishes to duel with you)3");

	@OriginalMember(owner = "client!lf", name = "rb", descriptor = "Lclient!af;")
	public static Class5 aClass5_838 = aClass5_839;

	@OriginalMember(owner = "client!lf", name = "zb", descriptor = "I")
	public static int anInt1686 = -1;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III[Lclient!of;IIBIII)V")
	public static void method1251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub17[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static33.method1981(arg5, arg0, arg8, arg6);
		Static114.method1995();
		for (@Pc(18) int local18 = 0; local18 < arg3.length; local18++) {
			@Pc(24) Class1_Sub17 local24 = arg3[local18];
			if (local24 != null && (arg7 == local24.anInt2292 || arg7 == -1412584499 && Static72.aClass1_Sub17_45 == local24)) {
				@Pc(73) int local73;
				if (arg1 == -1) {
					Static76.anIntArray294[Static74.anInt1725] = arg4 + local24.anInt2279;
					Static84.anIntArray330[Static74.anInt1725] = local24.anInt2267 + arg2;
					Static92.anIntArray352[Static74.anInt1725] = local24.anInt2305;
					Static28.anIntArray100[Static74.anInt1725] = local24.anInt2293;
					local73 = Static74.anInt1725++;
				} else {
					local73 = arg1;
				}
				local24.anInt2306 = Static131.anInt3270;
				local24.anInt2283 = local73;
				if (!local24.aBoolean89 || !Static24.method540(local24)) {
					if (local24.anInt2291 > 0) {
						Static78.method1365(local24);
					}
					@Pc(105) int local105 = local24.anInt2267 + arg2;
					@Pc(110) int local110 = arg4 + local24.anInt2279;
					@Pc(113) int local113 = local24.anInt2250;
					@Pc(143) int local143;
					@Pc(158) int local158;
					if (Static72.aClass1_Sub17_45 == local24) {
						if (arg7 != -1412584499 && !local24.aBoolean87) {
							Static95.anInt2356 = arg4;
							Static60.anInt1447 = arg2;
							Static127.aClass1_Sub17Array2 = arg3;
							continue;
						}
						if (!local24.aBoolean87) {
							local113 = 128;
						}
						if (Static111.aBoolean105 && Static93.aBoolean90) {
							local143 = Static98.anInt2407;
							local143 -= Static40.anInt1046;
							if (Static38.anInt974 > local143) {
								local143 = Static38.anInt974;
							}
							local158 = Static97.anInt2395;
							if (local24.anInt2305 + local143 > Static64.aClass1_Sub17_42.anInt2305 + Static38.anInt974) {
								local143 = Static64.aClass1_Sub17_42.anInt2305 + Static38.anInt974 - local24.anInt2305;
							}
							local158 -= Static44.anInt1086;
							local110 = local143;
							if (local158 < Static109.anInt2694) {
								local158 = Static109.anInt2694;
							}
							if (Static109.anInt2694 + Static64.aClass1_Sub17_42.anInt2293 < local24.anInt2293 + local158) {
								local158 = Static109.anInt2694 + Static64.aClass1_Sub17_42.anInt2293 - local24.anInt2293;
							}
							local105 = local158;
						}
					}
					@Pc(284) int local284;
					@Pc(298) int local298;
					@Pc(233) int local233;
					@Pc(235) int local235;
					@Pc(241) int local241;
					@Pc(255) int local255;
					if (local24.anInt2271 == 2) {
						local158 = arg0;
						local143 = arg5;
						local298 = arg6;
						local284 = arg8;
					} else if (local24.anInt2271 == 9) {
						local233 = local110;
						local235 = local105;
						local241 = local110 + local24.anInt2305;
						if (local241 < local110) {
							local233 = local241;
							local241 = local110;
						}
						local255 = local24.anInt2293 + local105;
						local241++;
						if (local255 < local105) {
							local235 = local255;
							local255 = local105;
						}
						local255++;
						local143 = local233 > arg5 ? local233 : arg5;
						local284 = local241 >= arg8 ? arg8 : local241;
						local158 = local235 <= arg0 ? arg0 : local235;
						local298 = arg6 <= local255 ? arg6 : local255;
					} else {
						local158 = local105 > arg0 ? local105 : arg0;
						local143 = arg5 < local110 ? local110 : arg5;
						local233 = local110 + local24.anInt2305;
						local235 = local24.anInt2293 + local105;
						local298 = local235 < arg6 ? local235 : arg6;
						local284 = local233 >= arg8 ? arg8 : local233;
					}
					if (!local24.aBoolean89 || local284 > local143 && local158 < local298) {
						if (local24.anInt2291 != 0) {
							if (local24.anInt2291 == 1337) {
								Static18.anInt3093 = local105;
								Static78.anInt1874 = local110;
								Static66.method2195(local105, local24.anInt2293, local110, local24.anInt2305);
								Static33.method1981(arg5, arg0, arg8, arg6);
								continue;
							}
							if (local24.anInt2291 == 1338) {
								Static58.method1056(local73, local110, local105);
								Static33.method1981(arg5, arg0, arg8, arg6);
								continue;
							}
						}
						local235 = Static97.anInt2395;
						local233 = Static98.anInt2407;
						if (!Static69.aBoolean48 && local143 <= local233 && local158 <= local235 && local284 > local233 && local235 < local298) {
							Static25.method544(local233 - local110, local235 - local105, local24);
						}
						if (local24.anInt2271 == 0) {
							if (!local24.aBoolean89 && Static24.method540(local24) && local24 != Static68.aClass1_Sub17_43) {
								continue;
							}
							if (!local24.aBoolean89) {
								if (local24.anInt2270 - local24.anInt2293 < local24.anInt2273) {
									local24.anInt2273 = local24.anInt2270 - local24.anInt2293;
								}
								if (local24.anInt2273 < 0) {
									local24.anInt2273 = 0;
								}
							}
							method1251(local158, local73, local105 - local24.anInt2273, arg3, local110 - local24.anInt2245, local143, local298, local24.anInt2248, local284);
							if (local24.aClass1_Sub17Array1 != null) {
								method1251(local158, local73, local105 - local24.anInt2273, local24.aClass1_Sub17Array1, local110 - local24.anInt2245, local143, local298, local24.anInt2248, local284);
							}
							@Pc(557) Class1_Sub5 local557 = (Class1_Sub5) Static66.aClass7_14.method287((long) local24.anInt2248);
							if (local557 != null) {
								if (local557.anInt863 == 0 && local143 <= Static98.anInt2407 && Static97.anInt2395 >= local158 && local284 > Static98.anInt2407 && local298 > Static97.anInt2395 && !Static69.aBoolean48 && !Static93.aBoolean91) {
									Static124.anIntArray455[0] = 1003;
									Static18.anInt3043 = 1;
									Static124.aClass5Array24[0] = Static70.aClass5_819;
									Static75.aClass5Array12[0] = Static49.aClass5_612;
								}
								Static58.method1053(local105, local284, local298, local143, local557.anInt862, local158, local73, local110);
							}
							Static33.method1981(arg5, arg0, arg8, arg6);
							Static114.method1995();
						}
						if (Static64.aBooleanArray18[local73] || Static108.anInt2660 > 1) {
							if (local24.anInt2271 == 0 && !local24.aBoolean89 && local24.anInt2270 > local24.anInt2293) {
								Static21.method529(local110 + local24.anInt2305, local24.anInt2293, local24.anInt2270, local105, local24.anInt2273);
							}
							if (local24.anInt2271 != 1) {
								@Pc(672) int local672;
								@Pc(685) int local685;
								@Pc(843) int local843;
								@Pc(753) int local753;
								@Pc(911) int local911;
								@Pc(694) int local694;
								@Pc(839) int local839;
								if (local24.anInt2271 == 2) {
									local241 = 0;
									for (local255 = 0; local255 < local24.anInt2293; local255++) {
										for (local672 = 0; local672 < local24.anInt2305; local672++) {
											local685 = local110 + (local24.anInt2252 + 32) * local672;
											local694 = local255 * (local24.anInt2284 + 32) + local105;
											if (local241 < 20) {
												local685 += local24.anIntArray350[local241];
												local694 += local24.anIntArray346[local241];
											}
											if (local24.anIntArray341[local241] > 0) {
												local753 = local24.anIntArray341[local241] - 1;
												if (arg5 < local685 + 32 && local685 < arg8 && arg0 < local694 + 32 && arg6 > local694 || local24 == Static45.aClass1_Sub17_66 && Static41.anInt1057 == local241) {
													@Pc(804) Class1_Sub3_Sub1_Sub2 local804;
													if (Static120.anInt1840 == 1 && Static50.anInt1243 == local241 && local24.anInt2248 == Static9.anInt285) {
														local804 = Static128.method2250(local24.anIntArray340[local241], local753, 2, 0, false);
													} else {
														local804 = Static128.method2250(local24.anIntArray340[local241], local753, 1, 3153952, false);
													}
													if (local804 == null) {
														Static119.method2161(local24);
													} else if (Static45.aClass1_Sub17_66 == local24 && local241 == Static41.anInt1057) {
														local839 = Static98.anInt2407 - Static62.anInt2471;
														local843 = Static97.anInt2395 - Static119.anInt3097;
														if (local843 < 5 && local843 > -5) {
															local843 = 0;
														}
														if (local839 < 5 && local839 > -5) {
															local839 = 0;
														}
														if (Static25.anInt775 < 5) {
															local843 = 0;
															local839 = 0;
														}
														local804.method751(local685 + local839, local694 - -local843, 128);
														if (arg7 != -1) {
															@Pc(888) Class1_Sub17 local888 = arg3[arg7 & 0xFFFF];
															if (local694 + local843 < Static33.anInt2811 && local888.anInt2273 > 0) {
																local911 = (Static33.anInt2811 - local843 - local694) * Static95.anInt2359 / 3;
																if (local911 > Static95.anInt2359 * 10) {
																	local911 = Static95.anInt2359 * 10;
																}
																if (local888.anInt2273 < local911) {
																	local911 = local888.anInt2273;
																}
																local888.anInt2273 -= local911;
																Static119.anInt3097 += local911;
																Static119.method2161(local888);
															}
															if (Static33.anInt2806 < local694 + local843 + 32 && local888.anInt2273 < local888.anInt2270 - local888.anInt2293) {
																local911 = Static95.anInt2359 * (local843 + local694 + 32 - Static33.anInt2806) / 3;
																if (Static95.anInt2359 * 10 < local911) {
																	local911 = Static95.anInt2359 * 10;
																}
																if (local911 > local888.anInt2270 - local888.anInt2293 - local888.anInt2273) {
																	local911 = local888.anInt2270 - local888.anInt2293 - local888.anInt2273;
																}
																local888.anInt2273 += local911;
																Static119.anInt3097 -= local911;
																Static119.method2161(local888);
															}
														}
													} else if (local24 == Static5.aClass1_Sub17_9 && local241 == Static83.anInt2118) {
														local804.method751(local685, local694, 128);
													} else {
														local804.method735(local685, local694);
													}
												}
											} else if (local24.anIntArray348 != null && local241 < 20) {
												@Pc(727) Class1_Sub3_Sub1_Sub2 local727 = local24.method1573(local241);
												if (local727 != null) {
													local727.method735(local685, local694);
												} else if (Static127.aBoolean123) {
													Static119.method2161(local24);
												}
											}
											local241++;
										}
									}
								} else if (local24.anInt2271 == 3) {
									if (Static84.method1490(local24)) {
										local241 = local24.anInt2251;
										if (local24 == Static68.aClass1_Sub17_43 && local24.anInt2310 != 0) {
											local241 = local24.anInt2310;
										}
									} else {
										local241 = local24.anInt2247;
										if (Static68.aClass1_Sub17_43 == local24 && local24.anInt2272 != 0) {
											local241 = local24.anInt2272;
										}
									}
									if (local113 == 0) {
										if (local24.aBoolean82) {
											Static33.method1984(local110, local105, local24.anInt2305, local24.anInt2293, local241);
										} else {
											Static33.method1979(local110, local105, local24.anInt2305, local24.anInt2293, local241);
										}
									} else if (local24.aBoolean82) {
										Static33.method1983(local110, local105, local24.anInt2305, local24.anInt2293, local241, 256 - (local113 & 0xFF));
									} else {
										Static33.method1976(local110, local105, local24.anInt2305, local24.anInt2293, local241, 256 - (local113 & 0xFF));
									}
								} else {
									@Pc(1174) Class1_Sub3_Sub1_Sub1 local1174;
									if (local24.anInt2271 == 4) {
										local1174 = local24.method1581();
										if (local1174 != null) {
											@Pc(1186) Class5 local1186 = local24.aClass5_1098;
											if (Static84.method1490(local24)) {
												local255 = local24.anInt2251;
												if (Static68.aClass1_Sub17_43 == local24 && local24.anInt2310 != 0) {
													local255 = local24.anInt2310;
												}
												if (local24.aClass5_1100.method215() > 0) {
													local1186 = local24.aClass5_1100;
												}
											} else {
												local255 = local24.anInt2247;
												if (local24 == Static68.aClass1_Sub17_43 && local24.anInt2272 != 0) {
													local255 = local24.anInt2272;
												}
											}
											if (local24.aBoolean89 && local24.anInt2262 != -1) {
												@Pc(1242) Class1_Sub3_Sub16 local1242 = Static56.method1022(local24.anInt2262);
												local1186 = local1242.aClass5_1323;
												if (local1186 == null) {
													local1186 = Static129.aClass5_1479;
												}
												if ((local1242.anInt2857 == 1 || local24.anInt2259 != 1) && local24.anInt2259 != -1) {
													local1186 = Static100.method1696(new Class5[] { Static16.aClass5_252, local1186, Static90.aClass5_1081, Static104.method1754(local24.anInt2259) });
												}
											}
											if (Static11.aClass1_Sub17_14 == local24) {
												local255 = local24.anInt2247;
												local1186 = Static40.aClass5_489;
											}
											if (!local24.aBoolean89) {
												local1186 = Static86.method1524(local1186, local24);
											}
											local1174.method153(local1186, local110, local105, local24.anInt2305, local24.anInt2293, local255, local24.aBoolean85 ? 0 : -1, local24.anInt2287, local24.anInt2303, local24.anInt2269);
										} else if (Static127.aBoolean123) {
											Static119.method2161(local24);
										}
									} else if (local24.anInt2271 == 5) {
										@Pc(1345) Class1_Sub3_Sub1_Sub2 local1345;
										if (local24.aBoolean89) {
											if (local24.anInt2262 == -1) {
												local1345 = local24.method1576(false);
											} else {
												local1345 = Static128.method2250(local24.anInt2259, local24.anInt2262, local24.anInt2261, local24.anInt2281, false);
											}
											if (local1345 != null) {
												local255 = local1345.anInt1017;
												local672 = local1345.anInt1013;
												if (local24.aBoolean79) {
													Static33.method1985(local110, local105, local24.anInt2305 + local110, local24.anInt2293 + local105);
													local694 = (local672 + local24.anInt2293 - 1) / local672;
													local685 = (local255 + local24.anInt2305 - 1) / local255;
													for (local839 = 0; local839 < local685; local839++) {
														for (local843 = 0; local843 < local694; local843++) {
															if (local24.anInt2299 != 0) {
																local1345.method758(local255 / 2 + local110 + local839 * local255, local672 / 2 + local105 + local843 * local672, local24.anInt2299, 4096);
															} else if (local113 == 0) {
																local1345.method735(local255 * local839 + local110, local843 * local672 + local105);
															} else {
																local1345.method751(local110 + local839 * local255, local672 * local843 + local105, 256 - (local113 & 0xFF));
															}
														}
													}
													Static33.method1981(arg5, arg0, arg8, arg6);
												} else {
													local685 = local24.anInt2305 * 4096 / local255;
													if (local24.anInt2299 != 0) {
														local1345.method758(local110 + local24.anInt2305 / 2, local105 + local24.anInt2293 / 2, local24.anInt2299, local685);
													} else if (local113 != 0) {
														local1345.method741(local110, local105, local24.anInt2305, local24.anInt2293, 256 - (local113 & 0xFF));
													} else if (local24.anInt2305 == local255 && local672 == local24.anInt2293) {
														local1345.method735(local110, local105);
													} else {
														local1345.method754(local110, local105, local24.anInt2305, local24.anInt2293);
													}
												}
											} else if (Static127.aBoolean123) {
												Static119.method2161(local24);
											}
										} else {
											local1345 = local24.method1576(Static84.method1490(local24));
											if (local1345 != null) {
												local1345.method735(local110, local105);
											} else if (Static127.aBoolean123) {
												Static119.method2161(local24);
											}
										}
									} else {
										@Pc(1638) Class1_Sub3_Sub16 local1638;
										if (local24.anInt2271 == 6) {
											@Pc(1615) boolean local1615 = Static84.method1490(local24);
											if (local1615) {
												local255 = local24.anInt2275;
											} else {
												local255 = local24.anInt2314;
											}
											@Pc(1627) Class1_Sub3_Sub4_Sub4 local1627 = null;
											local685 = 0;
											if (local24.anInt2262 != -1) {
												local1638 = Static56.method1022(local24.anInt2262);
												if (local1638 != null) {
													local1638 = local1638.method2028(local24.anInt2259);
													local1627 = local1638.method2021(1);
													if (local1627 == null) {
														Static119.method2161(local24);
													} else {
														local1627.method634();
														local685 = local1627.anInt3024 / 2;
													}
												}
											} else if (local24.anInt2300 == 5) {
												if (local24.anInt2313 == 0) {
													local1627 = Static100.aClass74_2.method2042(-1, -1, null, null);
												} else {
													local1627 = Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.method2148();
												}
											} else if (local255 == -1) {
												local1627 = local24.method1575(null, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.aClass74_1, -1, local1615);
												if (local1627 == null && Static127.aBoolean123) {
													Static119.method2161(local24);
												}
											} else {
												@Pc(1697) Class1_Sub3_Sub11 local1697 = Static77.method1316(local255);
												local1627 = local24.method1575(local1697, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.aClass74_1, local24.anInt2258, local1615);
												if (local1627 == null && Static127.aBoolean123) {
													Static119.method2161(local24);
												}
											}
											Static114.method1990(local24.anInt2305 / 2 + local110, local105 + local24.anInt2293 / 2);
											local694 = Class1_Sub3_Sub1_Sub4.anIntArray425[local24.anInt2242] * local24.anInt2278 >> 16;
											local839 = local24.anInt2278 * Class1_Sub3_Sub1_Sub4.anIntArray424[local24.anInt2242] >> 16;
											if (local1627 != null) {
												if (local24.aBoolean89) {
													local1627.method634();
													if (local24.aBoolean80) {
														local1627.method638(local24.anInt2304, local24.anInt2280, local24.anInt2242, local24.anInt2297, local694 + local685 + local24.anInt2241, local24.anInt2241 + local839, local24.anInt2278);
													} else {
														local1627.method647(local24.anInt2304, local24.anInt2280, local24.anInt2242, local24.anInt2297, local24.anInt2241 + local685 + local694, local839 - -local24.anInt2241);
													}
												} else {
													local1627.method647(local24.anInt2304, 0, local24.anInt2242, 0, local694, local839);
												}
											}
											Static114.method1987();
										} else {
											if (local24.anInt2271 == 7) {
												local1174 = local24.method1581();
												if (local1174 == null) {
													if (Static127.aBoolean123) {
														Static119.method2161(local24);
													}
													continue;
												}
												local255 = 0;
												for (local672 = 0; local672 < local24.anInt2293; local672++) {
													for (local685 = 0; local685 < local24.anInt2305; local685++) {
														if (local24.anIntArray341[local255] > 0) {
															local1638 = Static56.method1022(local24.anIntArray341[local255] - 1);
															@Pc(1882) Class5 local1882 = local1638.aClass5_1323;
															if (local1882 == null) {
																local1882 = Static129.aClass5_1479;
															}
															if (local1638.anInt2857 == 1 || local24.anIntArray340[local255] != 1) {
																local1882 = Static100.method1696(new Class5[] { Static16.aClass5_252, local1882, Static90.aClass5_1081, Static104.method1754(local24.anIntArray340[local255]) });
															}
															local753 = local672 * (local24.anInt2284 + 12) + local105;
															local843 = (local24.anInt2252 + 115) * local685 + local110;
															if (local24.anInt2287 == 0) {
																local1174.method165(local1882, local843, local753, local24.anInt2247, local24.aBoolean85 ? 0 : -1);
															} else if (local24.anInt2287 == 1) {
																local1174.method170(local1882, local843 + local24.anInt2305 / 2, local753, local24.anInt2247, local24.aBoolean85 ? 0 : -1);
															} else {
																local1174.method173(local1882, local843 + local24.anInt2305 - 1, local753, local24.anInt2247, local24.aBoolean85 ? 0 : -1);
															}
														}
														local255++;
													}
												}
											}
											@Pc(2183) int local2183;
											if (local24.anInt2271 == 8 && local24 == Static117.aClass1_Sub17_74 && Static129.anInt3260 == Static8.anInt264) {
												local241 = 0;
												local255 = 0;
												@Pc(2033) Class5 local2033 = local24.aClass5_1098;
												@Pc(2035) Class1_Sub3_Sub1_Sub1 local2035 = Static124.aClass1_Sub3_Sub1_Sub1_4;
												local2033 = Static86.method1524(local2033, local24);
												@Pc(2052) Class5 local2052;
												while (local2033.method215() > 0) {
													local839 = local2033.method195(Static120.aClass5_937);
													if (local839 == -1) {
														local2052 = local2033;
														local2033 = Static49.aClass5_612;
													} else {
														local2052 = local2033.method200(0, local839);
														local2033 = local2033.method184(local839 + 4);
													}
													local843 = local2035.method154(local2052);
													local255 += local2035.anInt145 + 1;
													if (local843 > local241) {
														local241 = local843;
													}
												}
												local241 += 6;
												local839 = local24.anInt2305 + local110 - local241 - 5;
												if (local839 < local110 + 5) {
													local839 = local110 + 5;
												}
												if (local839 + local241 > arg8) {
													local839 = arg8 - local241;
												}
												local255 += 7;
												local843 = local24.anInt2293 + local105 + 5;
												if (arg6 < local843 + local255) {
													local843 = arg6 - local255;
												}
												Static33.method1984(local839, local843, local241, local255, 16777120);
												Static33.method1979(local839, local843, local241, local255, 0);
												local2033 = local24.aClass5_1098;
												local753 = local843 + local2035.anInt145 + 2;
												local2033 = Static86.method1524(local2033, local24);
												while (local2033.method215() > 0) {
													local2183 = local2033.method195(Static120.aClass5_937);
													if (local2183 == -1) {
														local2052 = local2033;
														local2033 = Static49.aClass5_612;
													} else {
														local2052 = local2033.method200(0, local2183);
														local2033 = local2033.method184(local2183 + 4);
													}
													local2035.method165(local2052, local839 + 3, local753, 0, -1);
													local753 += local2035.anInt145 + 1;
												}
											}
											if (local24.anInt2271 == 9) {
												if (local24.anInt2296 == 1) {
													Static33.method1967(local110, local105, local24.anInt2305 + local110, local105 - -local24.anInt2293, local24.anInt2247);
												} else {
													local241 = local24.anInt2305 < 0 ? -local24.anInt2305 : local24.anInt2305;
													local255 = local24.anInt2293 >= 0 ? local24.anInt2293 : -local24.anInt2293;
													local672 = local241;
													if (local255 > local241) {
														local672 = local255;
													}
													if (local672 != 0) {
														local685 = (local24.anInt2305 << 16) / local672;
														local694 = (local24.anInt2293 << 16) / local672;
														if (local685 >= local694) {
															local685 = -local685;
														} else {
															local694 = -local694;
														}
														local753 = local685 * local24.anInt2296 >> 17;
														local839 = local24.anInt2296 * local694 >> 17;
														local843 = local24.anInt2296 * local694 + 1 >> 17;
														@Pc(2331) int local2331 = local839 + local110;
														local2183 = local24.anInt2296 * local685 + 1 >> 17;
														local911 = local110 - local843;
														@Pc(2352) int local2352 = local839 + local24.anInt2305 + local110;
														@Pc(2360) int local2360 = local24.anInt2305 + local110 - local843;
														@Pc(2364) int local2364 = local105 - local2183;
														@Pc(2372) int local2372 = local105 + local24.anInt2293 + local753;
														@Pc(2376) int local2376 = local105 + local753;
														@Pc(2383) int local2383 = local24.anInt2293 + local105 - local2183;
														Static114.method1989(local2331, local911, local2360);
														Static114.method1993(local2376, local2364, local2383, local2331, local911, local2360, local24.anInt2247);
														Static114.method1989(local2331, local2360, local2352);
														Static114.method1993(local2376, local2383, local2372, local2331, local2360, local2352, local24.anInt2247);
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

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IBII)V")
	public static void method1253(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static69.anInt1605 == 0 || arg2 == 0 || Static39.anInt1036 >= 50) {
			return;
		}
		Static115.anIntArray431[Static39.anInt1036] = arg1;
		Static76.anIntArray297[Static39.anInt1036] = arg2;
		Static24.anIntArray87[Static39.anInt1036] = arg0;
		Static83.aClass37Array1[Static39.anInt1036] = null;
		Static37.anIntArray165[Static39.anInt1036] = 0;
		Static39.anInt1036++;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!d;I)V")
	public static void method1255(@OriginalArg(0) Applet_Sub1 arg0) {
		if (Static12.anInt3243 != 1) {
			return;
		}
		if (Static9.anInt280 >= 280 && Static9.anInt280 <= 294 && Static97.anInt2390 >= 4 && Static97.anInt2390 <= 18) {
			Static111.method1923(0, 0);
			return;
		}
		if (Static9.anInt280 >= 295 && Static9.anInt280 <= 360 && Static97.anInt2390 >= 4 && Static97.anInt2390 <= 18) {
			Static111.method1923(0, 1);
			return;
		}
		if (Static9.anInt280 >= 390 && Static9.anInt280 <= 404 && Static97.anInt2390 >= 4 && Static97.anInt2390 <= 18) {
			Static111.method1923(1, 0);
			return;
		}
		if (Static9.anInt280 >= 405 && Static9.anInt280 <= 470 && Static97.anInt2390 >= 4 && Static97.anInt2390 <= 18) {
			Static111.method1923(1, 1);
			return;
		}
		if (Static9.anInt280 >= 500 && Static9.anInt280 <= 514 && Static97.anInt2390 >= 4 && Static97.anInt2390 <= 18) {
			Static111.method1923(2, 0);
			return;
		}
		if (Static9.anInt280 >= 515 && Static9.anInt280 <= 580 && Static97.anInt2390 >= 4 && Static97.anInt2390 <= 18) {
			Static111.method1923(2, 1);
			return;
		}
		if (Static9.anInt280 >= 610 && Static9.anInt280 <= 624 && Static97.anInt2390 >= 4 && Static97.anInt2390 <= 18) {
			Static111.method1923(3, 0);
			return;
		}
		if (Static9.anInt280 >= 625 && Static9.anInt280 <= 690 && Static97.anInt2390 >= 4 && Static97.anInt2390 <= 18) {
			Static111.method1923(3, 1);
			return;
		}
		if (Static9.anInt280 >= 708 && Static97.anInt2390 >= 4 && Static9.anInt280 <= 758 && Static97.anInt2390 <= 20) {
			Static84.aBoolean75 = false;
			Static122.aClass1_Sub3_Sub1_Sub2_5.method760(0, 0);
			Static55.aClass1_Sub3_Sub1_Sub2_2.method760(382, 0);
			Static131.aClass1_Sub3_Sub1_Sub3_5.method1687(382 - Static131.aClass1_Sub3_Sub1_Sub3_5.anInt2443 / 2, 18);
			return;
		}
		if (Static78.anInt1876 == -1) {
			return;
		}
		@Pc(269) Class9 local269 = Static37.aClass9Array1[Static78.anInt1876];
		if (Static82.aBoolean70 == local269.aBoolean7) {
			@Pc(295) byte[] local295 = Static100.method1696(new Class5[] { local269.aClass5_177, Static95.aClass5_1128 }).method220();
			Static1.aString1 = new String(local295, 0, local295.length);
			Static113.anInt2771 = local269.anInt346;
			Static84.aBoolean75 = false;
			if (Static22.anInt728 != 0) {
				Static22.anInt728 = 0;
				Static57.anInt1368 = 443;
				Static49.anInt1195 = 43594;
				Static96.anInt2385 = 43594;
			}
			Static122.aClass1_Sub3_Sub1_Sub2_5.method760(0, 0);
			Static55.aClass1_Sub3_Sub1_Sub2_2.method760(382, 0);
			Static131.aClass1_Sub3_Sub1_Sub3_5.method1687(382 - Static131.aClass1_Sub3_Sub1_Sub3_5.anInt2443 / 2, 18);
			return;
		}
		@Pc(392) Class5 local392 = Static100.method1696(new Class5[] { Static2.aClass5_35, local269.aClass5_177, Static95.aClass5_1128, Static49.aClass5_618, Static120.aClass5_921, Static48.method838(Static79.aBoolean64 ? 1 : 0), Static8.aClass5_133, Static48.method838(Static108.anInt2670), Static39.aClass5_481, Static48.method838(Static96.anInt2386) });
		try {
			arg0.getAppletContext().showDocument(local392.method203(), "_self");
		} catch (@Pc(401) Exception local401) {
		}
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V")
	public static void method1262() {
		Static118.aClass28_78.method792();
		Static104.aClass28_68.method792();
		Static55.aClass28_36.method792();
	}

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "(B)V")
	public static void method1263() {
		aClass41_12 = null;
		aClass41_Sub1_11 = null;
		aClass5_838 = null;
		anIntArray280 = null;
		aClass62_1 = null;
		aClass5_839 = null;
		aByteArrayArray7 = null;
		aClass5_837 = null;
	}
}

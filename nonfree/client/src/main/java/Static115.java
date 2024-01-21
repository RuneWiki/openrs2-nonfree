import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "Lclient!ob;")
	public static Class16_Sub1 aClass16_Sub1_36;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "[Z")
	public static boolean[] aBooleanArray12 = new boolean[8];

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "Lclient!ea;")
	public static Class18 aClass18_834 = Static8.method128(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V")
	public static void method2311() {
		aBooleanArray12 = null;
		aClass16_Sub1_36 = null;
		aClass18_834 = null;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II[Lclient!ef;IIIIIII)V")
	public static void method2312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static63.method2001(arg5, arg3, arg7, arg4);
		Static79.method1767();
		for (@Pc(13) int local13 = 0; local13 < arg2.length; local13++) {
			@Pc(33) Class20 local33 = arg2[local13];
			if (local33 != null && (local33.anInt1233 == arg8 || arg8 == -1412584499 && local33 == Static41.aClass20_4)) {
				@Pc(81) int local81;
				if (arg1 == -1) {
					Static146.anIntArray376[Static180.anInt4780] = local33.anInt1199 + arg0;
					Static97.anIntArray265[Static180.anInt4780] = arg6 + local33.anInt1248;
					Static24.anIntArray49[Static180.anInt4780] = local33.anInt1260;
					Static154.anIntArray391[Static180.anInt4780] = local33.anInt1212;
					local81 = Static180.anInt4780++;
				} else {
					local81 = arg1;
				}
				local33.anInt1206 = Static41.anInt1322;
				local33.anInt1266 = local81;
				if (!local33.aBoolean44 || !Static137.method2606(local33)) {
					if (local33.anInt1221 > 0) {
						Static101.method2128(local33);
					}
					@Pc(111) int local111 = arg0 + local33.anInt1199;
					@Pc(114) int local114 = local33.anInt1193;
					@Pc(120) int local120 = local33.anInt1248 + arg6;
					@Pc(148) int local148;
					@Pc(163) int local163;
					if (local33 == Static41.aClass20_4) {
						if (arg8 != -1412584499 && !local33.aBoolean43) {
							Static73.anInt1887 = arg6;
							Static160.aClass20Array2 = arg2;
							Static11.anInt337 = arg0;
							continue;
						}
						if (!local33.aBoolean43) {
							local114 = 128;
						}
						if (Static180.aBoolean212 && Static73.aBoolean75) {
							local148 = Static154.anInt4252;
							local148 -= Static88.anInt2736;
							if (Static125.anInt3620 > local148) {
								local148 = Static125.anInt3620;
							}
							local163 = Static9.anInt293;
							if (local148 + local33.anInt1260 > Static125.anInt3620 + Static157.aClass20_12.anInt1260) {
								local148 = Static157.aClass20_12.anInt1260 + Static125.anInt3620 - local33.anInt1260;
							}
							local111 = local148;
							local163 -= Static85.anInt2578;
							if (Static126.anInt3636 > local163) {
								local163 = Static126.anInt3636;
							}
							if (local33.anInt1212 + local163 > Static126.anInt3636 + Static157.aClass20_12.anInt1212) {
								local163 = Static126.anInt3636 + Static157.aClass20_12.anInt1212 - local33.anInt1212;
							}
							local120 = local163;
						}
					}
					@Pc(269) int local269;
					@Pc(295) int local295;
					@Pc(230) int local230;
					@Pc(232) int local232;
					@Pc(237) int local237;
					@Pc(274) int local274;
					if (local33.anInt1213 == 2) {
						local269 = arg7;
						local148 = arg5;
						local163 = arg3;
						local295 = arg4;
					} else if (local33.anInt1213 == 9) {
						local230 = local111;
						local232 = local120;
						local237 = local111 + local33.anInt1260;
						if (local111 > local237) {
							local230 = local237;
							local237 = local111;
						}
						local148 = local230 <= arg5 ? arg5 : local230;
						local237++;
						local269 = local237 >= arg7 ? arg7 : local237;
						local274 = local120 + local33.anInt1212;
						if (local274 < local120) {
							local232 = local274;
							local274 = local120;
						}
						local274++;
						local295 = arg4 > local274 ? local274 : arg4;
						local163 = local232 > arg3 ? local232 : arg3;
					} else {
						local148 = local111 <= arg5 ? arg5 : local111;
						local163 = local120 > arg3 ? local120 : arg3;
						local230 = local111 + local33.anInt1260;
						local269 = arg7 > local230 ? local230 : arg7;
						local232 = local33.anInt1212 + local120;
						local295 = arg4 <= local232 ? arg4 : local232;
					}
					if (!local33.aBoolean44 || local269 > local148 && local163 < local295) {
						if (local33.anInt1221 != 0) {
							if (local33.anInt1221 == 1337) {
								Static171.anInt4624 = local111;
								Static127.anInt3641 = local120;
								Static103.method2147(local33.anInt1212, local33.anInt1260, local120, local111);
								Static63.method2001(arg5, arg3, arg7, arg4);
								continue;
							}
							if (local33.anInt1221 == 1338) {
								Static157.method2928(local81, local120, local111);
								Static63.method2001(arg5, arg3, arg7, arg4);
								continue;
							}
						}
						local230 = Static154.anInt4252;
						local232 = Static9.anInt293;
						if (!Static149.aBoolean185 && local148 <= local230 && local232 >= local163 && local230 < local269 && local295 > local232) {
							Static89.method1926(local33, local230 - local111, local232 - local120);
						}
						if (local33.anInt1213 == 0) {
							if (!local33.aBoolean44 && Static137.method2606(local33) && Static95.aClass20_8 != local33) {
								continue;
							}
							if (!local33.aBoolean44) {
								if (local33.anInt1256 > local33.anInt1209 - local33.anInt1212) {
									local33.anInt1256 = local33.anInt1209 - local33.anInt1212;
								}
								if (local33.anInt1256 < 0) {
									local33.anInt1256 = 0;
								}
							}
							method2312(local111 - local33.anInt1219, local81, arg2, local163, local295, local148, local120 - local33.anInt1256, local269, local33.anInt1240);
							if (local33.aClass20Array1 != null) {
								method2312(local111 - local33.anInt1219, local81, local33.aClass20Array1, local163, local295, local148, local120 - local33.anInt1256, local269, local33.anInt1240);
							}
							@Pc(550) Class1_Sub8 local550 = (Class1_Sub8) Static155.aClass14_14.method569((long) local33.anInt1240);
							if (local550 != null) {
								if (local550.anInt1186 == 0 && Static154.anInt4252 >= local148 && Static9.anInt293 >= local163 && Static154.anInt4252 < local269 && Static9.anInt293 < local295 && !Static149.aBoolean185 && !Static33.aBoolean37) {
									Static80.anInt2478 = 1;
									Static84.aClass18Array13[0] = Static129.aClass18_928;
									Static114.anIntArray288[0] = 1004;
									Static180.aClass18Array25[0] = Static62.aClass18_472;
								}
								Static170.method3125(local111, local550.anInt1188, local269, local163, local120, local81, local295, local148);
							}
							Static63.method2001(arg5, arg3, arg7, arg4);
							Static79.method1767();
						}
						if (Static169.aBooleanArray15[local81] || Static124.anInt3517 > 1) {
							if (local33.anInt1213 == 0 && !local33.aBoolean44 && local33.anInt1209 > local33.anInt1212) {
								Static30.method663(local33.anInt1256, local33.anInt1260 + local111, local33.anInt1209, local120, local33.anInt1212);
							}
							if (local33.anInt1213 != 1) {
								@Pc(664) int local664;
								@Pc(675) int local675;
								@Pc(866) int local866;
								@Pc(747) int local747;
								@Pc(907) int local907;
								@Pc(905) int local905;
								@Pc(934) int local934;
								@Pc(686) int local686;
								@Pc(851) int local851;
								if (local33.anInt1213 == 2) {
									local237 = 0;
									for (local274 = 0; local274 < local33.anInt1212; local274++) {
										for (local664 = 0; local664 < local33.anInt1260; local664++) {
											local675 = local664 * (local33.anInt1252 + 32) + local111;
											local686 = local120 + local274 * (local33.anInt1253 + 32);
											if (local237 < 20) {
												local686 += local33.anIntArray83[local237];
												local675 += local33.anIntArray85[local237];
											}
											if (local33.anIntArray79[local237] > 0) {
												local747 = local33.anIntArray79[local237] - 1;
												if (arg5 < local675 + 32 && arg7 > local675 && arg3 < local686 + 32 && arg4 > local686 || local33 == Static178.aClass20_14 && Static46.anInt4775 == local237) {
													@Pc(806) Class1_Sub1_Sub8_Sub3 local806;
													if (Static98.anInt3018 == 1 && Static20.anInt571 == local237 && Static118.anInt3371 == local33.anInt1240) {
														local806 = Static125.method2485(local747, 2, false, local33.anIntArray82[local237], 0);
													} else {
														local806 = Static125.method2485(local747, 1, false, local33.anIntArray82[local237], 3153952);
													}
													if (local806 == null) {
														Static152.method2858(local33);
													} else if (Static178.aClass20_14 == local33 && local237 == Static46.anInt4775) {
														local851 = Static154.anInt4252 - Static59.anInt800;
														if (local851 < 5 && local851 > -5) {
															local851 = 0;
														}
														local866 = Static9.anInt293 - Static122.anInt3467;
														if (local866 < 5 && local866 > -5) {
															local866 = 0;
														}
														if (Static161.anInt4407 < 5) {
															local866 = 0;
															local851 = 0;
														}
														local806.method1640(local851 + local675, local866 + local686, 128);
														if (arg8 != -1) {
															@Pc(903) Class20 local903 = arg2[arg8 & 0xFFFF];
															local905 = Static63.anInt2851;
															local907 = Static63.anInt2850;
															if (local866 + local686 < local907 && local903.anInt1256 > 0) {
																local934 = Static180.anInt4776 * (local907 - local686 - local866) / 3;
																if (Static180.anInt4776 * 10 < local934) {
																	local934 = Static180.anInt4776 * 10;
																}
																if (local903.anInt1256 < local934) {
																	local934 = local903.anInt1256;
																}
																Static122.anInt3467 += local934;
																local903.anInt1256 -= local934;
																Static152.method2858(local903);
															}
															if (local866 + local686 + 32 > local905 && local903.anInt1256 < local903.anInt1209 - local903.anInt1212) {
																local934 = (local686 + local866 + 32 - local905) * Static180.anInt4776 / 3;
																if (Static180.anInt4776 * 10 < local934) {
																	local934 = Static180.anInt4776 * 10;
																}
																if (local903.anInt1209 - local903.anInt1212 - local903.anInt1256 < local934) {
																	local934 = local903.anInt1209 - local903.anInt1212 - local903.anInt1256;
																}
																local903.anInt1256 += local934;
																Static122.anInt3467 -= local934;
																Static152.method2858(local903);
															}
														}
													} else if (local33 == Static124.aClass20_11 && Static5.anInt155 == local237) {
														local806.method1640(local675, local686, 128);
													} else {
														local806.method1659(local675, local686);
													}
												}
											} else if (local33.anIntArray78 != null && local237 < 20) {
												@Pc(723) Class1_Sub1_Sub8_Sub3 local723 = local33.method785(local237);
												if (local723 != null) {
													local723.method1659(local675, local686);
												} else if (Static61.aBoolean73) {
													Static152.method2858(local33);
												}
											}
											local237++;
										}
									}
								} else if (local33.anInt1213 == 3) {
									if (Static6.method116(local33)) {
										local237 = local33.anInt1241;
										if (Static95.aClass20_8 == local33 && local33.anInt1249 != 0) {
											local237 = local33.anInt1249;
										}
									} else {
										local237 = local33.anInt1261;
										if (Static95.aClass20_8 == local33 && local33.anInt1235 != 0) {
											local237 = local33.anInt1235;
										}
									}
									if (local114 == 0) {
										if (local33.aBoolean40) {
											Static63.method1990(local111, local120, local33.anInt1260, local33.anInt1212, local237);
										} else {
											Static63.method2007(local111, local120, local33.anInt1260, local33.anInt1212, local237);
										}
									} else if (local33.aBoolean40) {
										Static63.method1998(local111, local120, local33.anInt1260, local33.anInt1212, local237, 256 - (local114 & 0xFF));
									} else {
										Static63.method2000(local111, local120, local33.anInt1260, local33.anInt1212, local237, 256 - (local114 & 0xFF));
									}
								} else {
									@Pc(1171) Class1_Sub1_Sub8_Sub2_Sub1 local1171;
									if (local33.anInt1213 == 4) {
										local1171 = local33.method787();
										if (local1171 != null) {
											@Pc(1183) Class18 local1183 = local33.aClass18_296;
											if (Static6.method116(local33)) {
												local274 = local33.anInt1241;
												if (Static95.aClass20_8 == local33 && local33.anInt1249 != 0) {
													local274 = local33.anInt1249;
												}
												if (local33.aClass18_294.method747() > 0) {
													local1183 = local33.aClass18_294;
												}
											} else {
												local274 = local33.anInt1261;
												if (local33 == Static95.aClass20_8 && local33.anInt1235 != 0) {
													local274 = local33.anInt1235;
												}
											}
											if (local33.aBoolean44 && local33.anInt1216 != -1) {
												@Pc(1237) Class1_Sub1_Sub1 local1237 = Static101.method2134(local33.anInt1216);
												local1183 = local1237.aClass18_28;
												if (local1183 == null) {
													local1183 = Static94.aClass18_737;
												}
												if ((local1237.anInt86 == 1 || local33.anInt1217 != 1) && local33.anInt1217 != -1) {
													local1183 = Static144.method2735(new Class18[] { Static3.aClass18_64, local1183, Static129.aClass18_930, Static24.method560(local33.anInt1217) });
												}
											}
											if (Static161.aClass20_13 == local33) {
												local274 = local33.anInt1261;
												local1183 = Static26.aClass18_222;
											}
											if (!local33.aBoolean44) {
												local1183 = Static139.method2683(local33, local1183);
											}
											local1171.method2028(local1183, local111, local120, local33.anInt1260, local33.anInt1212, local274, local33.aBoolean47 ? 0 : -1, local33.anInt1243, local33.anInt1223, local33.anInt1251);
										} else if (Static61.aBoolean73) {
											Static152.method2858(local33);
										}
									} else if (local33.anInt1213 == 5) {
										@Pc(1338) Class1_Sub1_Sub8_Sub3 local1338;
										if (local33.aBoolean44) {
											if (local33.anInt1216 == -1) {
												local1338 = local33.method781(false);
											} else {
												local1338 = Static125.method2485(local33.anInt1216, local33.anInt1264, false, local33.anInt1217, local33.anInt1201);
											}
											if (local1338 != null) {
												local274 = local1338.anInt2316;
												local664 = local1338.anInt2315;
												if (local33.aBoolean41) {
													Static63.method2004(local111, local120, local111 + local33.anInt1260, local33.anInt1212 + local120);
													local686 = (local33.anInt1212 + local664 - 1) / local664;
													local675 = (local274 + local33.anInt1260 - 1) / local274;
													for (local851 = 0; local851 < local675; local851++) {
														for (local866 = 0; local866 < local686; local866++) {
															if (local33.anInt1237 != 0) {
																local1338.method1652(local111 + local274 * local851 + local274 / 2, local664 / 2 + local866 * local664 + local120, local33.anInt1237, 4096);
															} else if (local114 == 0) {
																local1338.method1659(local111 + local274 * local851, local120 + local664 * local866);
															} else {
																local1338.method1640(local111 + local274 * local851, local120 - -(local664 * local866), 256 - (local114 & 0xFF));
															}
														}
													}
													Static63.method2001(arg5, arg3, arg7, arg4);
												} else {
													local675 = local33.anInt1260 * 4096 / local274;
													if (local33.anInt1237 != 0) {
														local1338.method1652(local111 + local33.anInt1260 / 2, local120 + local33.anInt1212 / 2, local33.anInt1237, local675);
													} else if (local114 != 0) {
														local1338.method1642(local111, local120, local33.anInt1260, local33.anInt1212, 256 - (local114 & 0xFF));
													} else if (local274 == local33.anInt1260 && local33.anInt1212 == local664) {
														local1338.method1659(local111, local120);
													} else {
														local1338.method1644(local111, local120, local33.anInt1260, local33.anInt1212);
													}
												}
											} else if (Static61.aBoolean73) {
												Static152.method2858(local33);
											}
										} else {
											local1338 = local33.method781(Static6.method116(local33));
											if (local1338 != null) {
												local1338.method1659(local111, local120);
											} else if (Static61.aBoolean73) {
												Static152.method2858(local33);
											}
										}
									} else {
										@Pc(1630) Class1_Sub1_Sub1 local1630;
										if (local33.anInt1213 == 6) {
											local675 = 0;
											@Pc(1608) boolean local1608 = Static6.method116(local33);
											@Pc(1610) Class1_Sub1_Sub5_Sub4 local1610 = null;
											if (local1608) {
												local274 = local33.anInt1250;
											} else {
												local274 = local33.anInt1231;
											}
											if (local33.anInt1216 != -1) {
												local1630 = Static101.method2134(local33.anInt1216);
												if (local1630 != null) {
													local1630 = local1630.method51(local33.anInt1217);
													local1610 = local1630.method49(1);
													if (local1610 == null) {
														Static152.method2858(local33);
													} else {
														local1610.method1008();
														local675 = local1610.anInt4233 / 2;
													}
												}
											} else if (local33.anInt1244 == 5) {
												if (local33.anInt1218 == 0) {
													local1610 = Static120.aClass31_1.method1289(null, -1, -1, null);
												} else {
													local1610 = Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.method2896();
												}
											} else if (local274 == -1) {
												local1610 = local33.method777(-1, null, local1608, Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.aClass31_2);
												if (local1610 == null && Static61.aBoolean73) {
													Static152.method2858(local33);
												}
											} else {
												@Pc(1691) Class1_Sub1_Sub12 local1691 = Static121.method2378(local274);
												local1610 = local33.method777(local33.anInt1262, local1691, local1608, Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.aClass31_2);
												if (local1610 == null && Static61.aBoolean73) {
													Static152.method2858(local33);
												}
											}
											if (local1610 != null) {
												Static79.method1761(local33.anInt1260 / 2 + local111 + local33.anInt1224, local33.anInt1255 + local33.anInt1212 / 2 + local120);
												local686 = local33.anInt1229 * Class1_Sub1_Sub8_Sub4.anIntArray212[local33.anInt1192] >> 16;
												local851 = Class1_Sub1_Sub8_Sub4.anIntArray216[local33.anInt1192] * local33.anInt1229 >> 16;
												if (!local33.aBoolean44) {
													local1610.method997(local33.anInt1242, 0, local33.anInt1192, 0, local686, local851);
												} else if (local33.aBoolean42) {
													local1610.method1010(local33.anInt1242, local33.anInt1214, local33.anInt1192, local33.anInt1234, local686 + local675 + local33.anInt1245, local33.anInt1245 + local851, local33.anInt1229);
												} else {
													local1610.method997(local33.anInt1242, local33.anInt1214, local33.anInt1192, local33.anInt1234, local33.anInt1245 + local686 + local675, local851 - -local33.anInt1245);
												}
												Static79.method1752();
											}
										} else {
											if (local33.anInt1213 == 7) {
												local1171 = local33.method787();
												if (local1171 == null) {
													if (Static61.aBoolean73) {
														Static152.method2858(local33);
													}
													continue;
												}
												local274 = 0;
												for (local664 = 0; local664 < local33.anInt1212; local664++) {
													for (local675 = 0; local675 < local33.anInt1260; local675++) {
														if (local33.anIntArray79[local274] > 0) {
															local1630 = Static101.method2134(local33.anIntArray79[local274] - 1);
															@Pc(1918) Class18 local1918;
															if (local1630.anInt86 != 1 && local33.anIntArray82[local274] == 1) {
																local1918 = Static144.method2735(new Class18[] { Static3.aClass18_64, local1630.aClass18_28, Static121.aClass18_871 });
															} else {
																local1918 = Static144.method2735(new Class18[] { Static3.aClass18_64, local1630.aClass18_28, Static129.aClass18_930, Static24.method560(local33.anIntArray82[local274]) });
															}
															local866 = local675 * (local33.anInt1252 + 115) + local111;
															local747 = local664 * (local33.anInt1253 + 12) + local120;
															if (local33.anInt1243 == 0) {
																local1171.method2016(local1918, local866, local747, local33.anInt1261, local33.aBoolean47 ? 0 : -1);
															} else if (local33.anInt1243 == 1) {
																local1171.method2015(local1918, local866 + local33.anInt1260 / 2, local747, local33.anInt1261, local33.aBoolean47 ? 0 : -1);
															} else {
																local1171.method2012(local1918, local866 + local33.anInt1260 - 1, local747, local33.anInt1261, local33.aBoolean47 ? 0 : -1);
															}
														}
														local274++;
													}
												}
											}
											@Pc(2210) int local2210;
											if (local33.anInt1213 == 8 && Static45.aClass20_7 == local33 && Static136.anInt3831 == Static14.anInt390) {
												local237 = 0;
												@Pc(2056) Class1_Sub1_Sub8_Sub2_Sub1 local2056 = Static37.aClass1_Sub1_Sub8_Sub2_Sub1_12;
												@Pc(2059) Class18 local2059 = local33.aClass18_296;
												local2059 = Static139.method2683(local33, local2059);
												local274 = 0;
												@Pc(2082) Class18 local2082;
												while (local2059.method747() > 0) {
													local851 = local2059.method731(Static76.aClass18_567);
													if (local851 == -1) {
														local2082 = local2059;
														local2059 = Static62.aClass18_472;
													} else {
														local2082 = local2059.method744(0, local851);
														local2059 = local2059.method733(local851 + 4);
													}
													local866 = local2056.method2026(local2082);
													if (local866 > local237) {
														local237 = local866;
													}
													local274 += local2056.anInt2863 + 1;
												}
												local866 = local120 + local33.anInt1212 + 5;
												local274 += 7;
												if (local866 + local274 > arg4) {
													local866 = arg4 - local274;
												}
												local237 += 6;
												local851 = local111 + local33.anInt1260 - local237 - 5;
												if (local111 + 5 > local851) {
													local851 = local111 + 5;
												}
												if (local237 + local851 > arg7) {
													local851 = arg7 - local237;
												}
												Static63.method1990(local851, local866, local237, local274, 16777120);
												Static63.method2007(local851, local866, local237, local274, 0);
												local2059 = local33.aClass18_296;
												local747 = local866 + local2056.anInt2863 + 2;
												local2059 = Static139.method2683(local33, local2059);
												while (local2059.method747() > 0) {
													local2210 = local2059.method731(Static76.aClass18_567);
													if (local2210 == -1) {
														local2082 = local2059;
														local2059 = Static62.aClass18_472;
													} else {
														local2082 = local2059.method744(0, local2210);
														local2059 = local2059.method733(local2210 + 4);
													}
													local2056.method2016(local2082, local851 + 3, local747, 0, -1);
													local747 += local2056.anInt2863 + 1;
												}
											}
											if (local33.anInt1213 == 9) {
												if (local33.anInt1202 == 1) {
													Static63.method1989(local111, local120, local111 + local33.anInt1260, local120 - -local33.anInt1212, local33.anInt1261);
												} else {
													local237 = local33.anInt1260 < 0 ? -local33.anInt1260 : local33.anInt1260;
													local664 = local237;
													local274 = local33.anInt1212 >= 0 ? local33.anInt1212 : -local33.anInt1212;
													if (local237 < local274) {
														local664 = local274;
													}
													if (local664 != 0) {
														local686 = (local33.anInt1212 << 16) / local664;
														local907 = local120 - arg3;
														local675 = (local33.anInt1260 << 16) / local664;
														if (local675 >= local686) {
															local675 = -local675;
														} else {
															local686 = -local686;
														}
														local2210 = local675 * local33.anInt1202 + 1 >> 17;
														@Pc(2344) int local2344 = local111 - arg5;
														local851 = local686 * local33.anInt1202 >> 17;
														local747 = local33.anInt1202 * local675 >> 17;
														@Pc(2366) int local2366 = local33.anInt1260 + local2344 + local851;
														local905 = local851 + local2344;
														local866 = local33.anInt1202 * local686 + 1 >> 17;
														local934 = local2344 - local866;
														@Pc(2388) int local2388 = local747 + local907;
														@Pc(2395) int local2395 = local33.anInt1260 + local2344 - local866;
														@Pc(2400) int local2400 = local907 - local2210;
														@Pc(2407) int local2407 = local33.anInt1212 + local907 - local2210;
														@Pc(2414) int local2414 = local907 + local33.anInt1212 + local747;
														Static79.method1758(local905, local934, local2395);
														Static79.method1763(local2388, local2400, local2407, local905, local934, local2395, local33.anInt1261);
														Static79.method1758(local905, local2395, local2366);
														Static79.method1763(local2388, local2407, local2414, local905, local2395, local2366, local33.anInt1261);
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

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
	public static void method2313() {
		Static144.aClass56_1.anInt3314 = 0;
		Static86.anInt2615 = 0;
		Static108.aLong96 = 0L;
		Static149.aBoolean184 = true;
		Static160.aBoolean195 = true;
		Static170.method3123();
		Static80.anInt2478 = 0;
		Static104.anInt3065 = -1;
		Static151.anInt4183 = 0;
		Static94.anInt2924 = -1;
		Static149.aBoolean185 = false;
		Static144.anInt4001 = -1;
		Static92.anInt2817 = 0;
		Static86.anInt2621 = 0;
		Static100.anInt2938 = -1;
		Static118.anInt3373 = 0;
		Static95.aClass1_Sub6_Sub1_1.anInt839 = 0;
		Static167.aClass1_Sub6_Sub1_3.anInt839 = 0;
		Static123.method2418(0);
		for (@Pc(2255) int local2255 = 0; local2255 < 100; local2255++) {
			Static59.aClass18Array4[local2255] = null;
		}
		Static45.anInt1553 = 0;
		Static169.anInt4604 = 0;
		Static33.anInt1116 = 0;
		Static98.anInt3018 = 0;
		Static161.anInt4393 = 0;
		Static72.anInt2205 = (int) (Math.random() * 100.0D) - 50;
		Static21.aBoolean19 = false;
		Static129.anInt3682 = (int) (Math.random() * 110.0D) - 55;
		Static98.anInt3021 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static19.anInt567 = 0;
		Static180.anInt4777 = (int) (Math.random() * 120.0D) - 60;
		Static160.anInt4384 = (int) (Math.random() * 30.0D) - 20;
		Static155.anInt4267 = 0;
		Static168.anInt4561 = -1;
		Static167.anInt4529 = (int) (Math.random() * 80.0D) - 40;
		Static166.anInt4506 = 0;
		for (@Pc(2339) int local2339 = 0; local2339 < 2048; local2339++) {
			Static153.aClass1_Sub1_Sub5_Sub1_Sub2Array1[local2339] = null;
			Static85.aClass1_Sub6Array1[local2339] = null;
		}
		for (@Pc(2357) int local2357 = 0; local2357 < 32768; local2357++) {
			Static91.aClass1_Sub1_Sub5_Sub1_Sub1Array1[local2357] = null;
		}
		Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1 = Static153.aClass1_Sub1_Sub5_Sub1_Sub2Array1[2047] = new Class1_Sub1_Sub5_Sub1_Sub2();
		Static40.aClass59_16.method2416();
		Static45.aClass59_25.method2416();
		@Pc(2389) int local2389;
		@Pc(2393) int local2393;
		for (@Pc(2385) int local2385 = 0; local2385 < 4; local2385++) {
			for (local2389 = 0; local2389 < 104; local2389++) {
				for (local2393 = 0; local2393 < 104; local2393++) {
					Static105.aClass59ArrayArrayArray1[local2385][local2389][local2393] = null;
				}
			}
		}
		Static145.aClass59_53 = new Class59();
		Static122.anInt3466 = 0;
		Static20.anInt570 = 0;
		for (local2389 = 0; local2389 < Static2.anInt102; local2389++) {
			@Pc(2435) Class1_Sub1_Sub14 local2435 = Static173.method3151(local2389);
			if (local2435 != null && local2435.anInt3707 == 0) {
				Static162.anIntArray401[local2389] = 0;
				Static170.anIntArray420[local2389] = 0;
			}
		}
		for (local2393 = 0; local2393 < Static43.anIntArray93.length; local2393++) {
			Static43.anIntArray93[local2393] = -1;
		}
		if (Static73.anInt1882 != -1) {
			Static132.method2565(Static73.anInt1882);
		}
		for (@Pc(2481) Class1_Sub8 local2481 = (Class1_Sub8) Static155.aClass14_14.method563(); local2481 != null; local2481 = (Class1_Sub8) Static155.aClass14_14.method571()) {
			Static24.method558(local2481, true);
		}
		Static73.anInt1882 = -1;
		Static155.aClass14_14 = new Class14(8);
		Static80.anInt2478 = 0;
		Static161.aClass20_13 = null;
		Static149.aBoolean185 = false;
		Static120.aClass31_1.method1287(null, false, new int[5], -1);
		for (@Pc(2517) int local2517 = 0; local2517 < 8; local2517++) {
			Static153.aClass18Array22[local2517] = null;
			aBooleanArray12[local2517] = false;
		}
		Static175.method3160();
		Static22.aBoolean20 = true;
		for (@Pc(2539) int local2539 = 0; local2539 < 100; local2539++) {
			Static88.aBooleanArray8[local2539] = true;
		}
		Static26.aClass1_Sub19Array1 = null;
		Static81.anInt2486 = 0;
		Static26.aClass18_225 = null;
		for (@Pc(2559) int local2559 = 0; local2559 < 6; local2559++) {
			Static50.aClass63Array1[local2559] = new Class63();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIZ[Lclient!vfa;IIIII)V")
	public static void method8023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class357[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		Static485.aClass126_17.KA(arg7, arg2, arg9, arg0);
		for (@Pc(17) int local17 = 0; local17 < arg5.length; local17++) {
			@Pc(23) Class357 local23 = arg5[local17];
			if (local23 != null && (arg6 == local23.anInt9837 || arg6 == -1412584499 && Static629.aClass357_15 == local23)) {
				@Pc(42) int local42 = arg1 + local23.anInt9813;
				@Pc(48) int local48 = local23.anInt9876 + arg3;
				@Pc(56) int local56 = local42 + local23.anInt9852 + 1;
				@Pc(64) int local64 = local48 + local23.anInt9797 + 1;
				@Pc(70) int local70;
				if (arg8 == -1) {
					Class5_Sub5_Sub1.aRectangleArray1[Static188.anInt10386].setBounds(local23.anInt9813 + arg1, local23.anInt9876 - -arg3, local23.anInt9852, local23.anInt9797);
					local70 = Static188.anInt10386++;
				} else {
					local70 = arg8;
				}
				local23.anInt9874 = Static235.anInt3998;
				local23.anInt9857 = local70;
				if (!Static74.method1231(local23)) {
					if (local23.anInt9785 != 0) {
						Static97.method1449(local23);
					}
					@Pc(115) int local115 = arg1 + local23.anInt9813;
					@Pc(121) int local121 = local23.anInt9876 + arg3;
					@Pc(123) int local123 = 0;
					@Pc(125) int local125 = 0;
					if (Static144.aBoolean196) {
						local123 = Static577.method8147();
						local125 = Static601.method8395();
					}
					@Pc(136) int local136 = local23.anInt9860;
					if (Static571.aBoolean764 && (Static74.method1225(local23).anInt10264 != 0 || local23.anInt9828 == 0) && local136 > 127) {
						local136 = 127;
					}
					@Pc(194) int local194;
					@Pc(201) int local201;
					if (Static629.aClass357_15 == local23) {
						if (arg6 != -1412584499 && (Static199.anInt8059 == local23.anInt9862 || local23.anInt9862 == Static129.anInt6339)) {
							Static403.anInt6955 = arg3;
							Static201.anInt3585 = arg1;
							Static113.aClass357Array1 = arg5;
							continue;
						}
						if (Static243.aBoolean334 && Static523.aBoolean713) {
							local194 = Static81.aClass13_1.method6355() + local123;
							local201 = Static81.aClass13_1.method6347() + local125;
							local194 -= Static254.anInt4284;
							local201 -= Static466.anInt7864;
							if (local194 < Static645.anInt10431) {
								local194 = Static645.anInt10431;
							}
							if (local23.anInt9852 + local194 > Static536.aClass357_10.anInt9852 + Static645.anInt10431) {
								local194 = Static536.aClass357_10.anInt9852 + Static645.anInt10431 - local23.anInt9852;
							}
							if (Static511.anInt8568 > local201) {
								local201 = Static511.anInt8568;
							}
							if (Static511.anInt8568 + Static536.aClass357_10.anInt9797 < local23.anInt9797 + local201) {
								local201 = Static511.anInt8568 + Static536.aClass357_10.anInt9797 - local23.anInt9797;
							}
							local115 = local194;
							local121 = local201;
						}
						if (Static129.anInt6339 == local23.anInt9862) {
							local136 = 128;
						}
					}
					@Pc(313) int local313;
					@Pc(324) int local324;
					@Pc(281) int local281;
					@Pc(286) int local286;
					if (local23.anInt9828 == 2) {
						local313 = arg9;
						local201 = arg2;
						local194 = arg7;
						local324 = arg0;
					} else {
						local281 = local23.anInt9852 + local115;
						local286 = local121 + local23.anInt9797;
						local194 = local115 > arg7 ? local115 : arg7;
						local201 = local121 <= arg2 ? arg2 : local121;
						if (local23.anInt9828 == 9) {
							local286++;
							local281++;
						}
						local313 = arg9 > local281 ? local281 : arg9;
						local324 = local286 >= arg0 ? arg0 : local286;
					}
					if (local313 > local194 && local324 > local201) {
						@Pc(595) int local595;
						@Pc(640) int local640;
						@Pc(734) int local734;
						@Pc(736) int local736;
						@Pc(627) int local627;
						@Pc(629) int local629;
						if (local23.anInt9785 != 0) {
							if (Static422.anInt7182 == local23.anInt9785 || local23.anInt9785 == Static161.anInt2816) {
								Static173.method2667(local115, local23, local121);
								if (!Static144.aBoolean196) {
									Static222.method3433(local121, Static161.anInt2816 == local23.anInt9785, local115, local23.anInt9797, local23.anInt9852);
									Static485.aClass126_17.KA(arg7, arg2, arg9, arg0);
								}
								Static609.aBooleanArray58[local70] = true;
								continue;
							}
							if (local23.anInt9785 == Static358.anInt8028) {
								if (local23.method8393(Static485.aClass126_17) != null) {
									Static439.method6528();
									Static614.method8509(local121, local115, Static485.aClass126_17, local23);
									Static248.aBooleanArray27[local70] = true;
									Static485.aClass126_17.KA(arg7, arg2, arg9, arg0);
									if (Static144.aBoolean196) {
										if (arg4) {
											Static354.method5603(local56, local42, local64, local48);
										} else {
											Static450.method6697(local42, local64, local56, local48);
										}
									}
								}
								continue;
							}
							if (Static562.anInt9265 == local23.anInt9785) {
								if (local23.method8393(Static485.aClass126_17) != null) {
									Static144.method2155(local115, local23, local121);
									Static248.aBooleanArray27[local70] = true;
									Static485.aClass126_17.KA(arg7, arg2, arg9, arg0);
									if (Static144.aBoolean196) {
										if (arg4) {
											Static354.method5603(local56, local42, local64, local48);
										} else {
											Static450.method6697(local42, local64, local56, local48);
										}
									}
								}
								continue;
							}
							if (local23.anInt9785 == Static44.anInt731) {
								Static542.method7720(local23.anInt9852, Static306.anInterface8_5, local23.anInt9797, Static485.aClass126_17, local115, local121);
								Static609.aBooleanArray58[local70] = true;
								Static485.aClass126_17.KA(arg7, arg2, arg9, arg0);
								continue;
							}
							if (local23.anInt9785 == Static440.anInt7417) {
								Static283.method4243(local23.anInt9852, local115, local121, local23.anInt9797, Static485.aClass126_17);
								Static609.aBooleanArray58[local70] = true;
								Static485.aClass126_17.KA(arg7, arg2, arg9, arg0);
								continue;
							}
							if (local23.anInt9785 == Static199.anInt8055) {
								if (!Static125.aBoolean158 && !Static309.aBoolean452) {
									continue;
								}
								local281 = local23.anInt9852 + local115;
								local286 = local121 + 15;
								if (Static144.aBoolean196) {
									if (arg4) {
										Static354.method5603(local56, local42, local64, local48);
									} else {
										Static450.method6697(local42, local64, local56, local48);
									}
								}
								if (Static125.aBoolean158) {
									local595 = -256;
									if (Static33.anInt623 < 20) {
										local595 = -65536;
									}
									Static437.aClass6_11.method7221(local595, local281, -1, local286, "Fps:" + Static33.anInt623);
									local286 += 15;
									@Pc(617) Runtime local617 = Runtime.getRuntime();
									local627 = (int) ((local617.totalMemory() - local617.freeMemory()) / 1024L);
									local629 = -256;
									if (local627 > 98304) {
										local629 = -65536;
										if (Static458.aBoolean638) {
											Static454.method6739();
											for (local640 = 0; local640 < 10; local640++) {
												System.gc();
											}
											local627 = (int) ((local617.totalMemory() - local617.freeMemory()) / 1024L);
											if (local627 > 65536) {
												Static88.method1388("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
									}
									Static437.aClass6_11.method7221(local629, local281, -1, local286, "Mem:" + local627 + "k");
									local286 += 15;
									Static437.aClass6_11.method7221(-256, local281, -1, local286, "In:" + Static76.anInt1280 + "B/s Out:" + Static612.anInt10006 + "B/s");
									local286 += 15;
									local640 = Static485.aClass126_17.E() / 1024;
									Static437.aClass6_11.method7221(local640 > 65536 ? -65536 : -256, local281, -1, local286, "Offheap:" + local640 + "k");
									local286 += 15;
									local734 = 0;
									local736 = 0;
									@Pc(738) int local738 = 0;
									for (@Pc(740) int local740 = 0; local740 < 37; local740++) {
										if (Static354.aClass277_Sub1Array1[local740] != null) {
											local734 += Static354.aClass277_Sub1Array1[local740].method6643();
											local736 += Static354.aClass277_Sub1Array1[local740].method6642();
											local738 += Static354.aClass277_Sub1Array1[local740].method6645();
										}
									}
									@Pc(780) int local780 = local738 * 100 / local734;
									@Pc(786) int local786 = local736 * 10000 / local734;
									@Pc(806) String local806 = "Cache:" + Static617.method8523(2, (long) local786, 0, true) + "% (" + local780 + "%)";
									Static288.aClass6_8.method7221(-256, local281, -1, local286, local806);
									local286 += 12;
								}
								if (Static647.anInt10483 > 0) {
									Static288.aClass6_8.method7221(-256, local281, -1, local286, "Particles: " + Static633.anInt10303 + " / " + Static647.anInt10483);
								}
								local286 += 12;
								if (Static309.aBoolean452) {
									Static288.aClass6_8.method7221(-256, local281, -1, local286, "Polys: " + Static485.aClass126_17.I() + " Models: " + Static485.aClass126_17.M());
									local286 += 12;
									Static288.aClass6_8.method7221(-256, local281, -1, local286, "Ls: " + Static394.anInt6872 + " La: " + Static287.anInt4692 + " NPC: " + Static77.anInt1289 + " Pl: " + Static204.anInt3598);
									Static582.method8176();
									local286 += 12;
								}
								Static609.aBooleanArray58[local70] = true;
								continue;
							}
						}
						@Pc(974) Class5_Sub15 local974;
						if (local23.anInt9828 == 0) {
							if (local23.anInt9785 == Static452.anInt8703 && Static485.aClass126_17.method7025()) {
								Static485.aClass126_17.method7041(local115, local121, local23.anInt9852, local23.anInt9797);
							}
							method8023(local324, local115 - local23.anInt9814, local201, local121 - local23.anInt9819, arg4, arg5, local23.anInt9804, local194, local70, local313);
							if (local23.aClass357Array2 != null) {
								method8023(local324, local115 - local23.anInt9814, local201, local121 - local23.anInt9819, arg4, local23.aClass357Array2, local23.anInt9804, local194, local70, local313);
							}
							local974 = (Class5_Sub15) Static183.aClass81_27.method1599((long) local23.anInt9804);
							if (local974 != null) {
								Static14.method400(local115, local974.anInt2409, local201, local121, local313, local194, local70, local324);
							}
							if (Static452.anInt8703 == local23.anInt9785 && Static485.aClass126_17.method7025()) {
								Static485.aClass126_17.method7008();
							}
							Static485.aClass126_17.KA(arg7, arg2, arg9, arg0);
						}
						if (Static517.aBooleanArray51[local70] || Static579.anInt9497 > 1) {
							if (local23.anInt9828 == 3) {
								if (local136 == 0) {
									if (local23.aBoolean789) {
										Static485.aClass126_17.aa(local115, local121, local23.anInt9852, local23.anInt9797, local23.anInt9841, 0);
									} else {
										Static485.aClass126_17.method7021(local115, local121, local23.anInt9852, local23.anInt9797, local23.anInt9841, 0);
									}
								} else if (local23.aBoolean789) {
									Static485.aClass126_17.aa(local115, local121, local23.anInt9852, local23.anInt9797, local23.anInt9841 & 0xFFFFFF | 255 - (local136 & 0xFF) << 24, 1);
								} else {
									Static485.aClass126_17.method7021(local115, local121, local23.anInt9852, local23.anInt9797, 255 - (local136 & 0xFF) << 24 | local23.anInt9841 & 0xFFFFFF, 1);
								}
								if (Static144.aBoolean196) {
									if (arg4) {
										Static354.method5603(local56, local42, local64, local48);
									} else {
										Static450.method6697(local42, local64, local56, local48);
									}
								}
							} else {
								@Pc(1149) Class329 local1149;
								if (local23.anInt9828 == 4) {
									@Pc(1123) Class6 local1123 = local23.method8383(Static485.aClass126_17);
									if (local1123 != null) {
										local286 = local23.anInt9841;
										@Pc(1138) String local1138 = local23.aString140;
										if (local23.anInt9871 != -1) {
											local1149 = Static479.aClass348_1.method8197(local23.anInt9871);
											local1138 = local1149.aString127;
											if (local1138 == null) {
												local1138 = "null";
											}
											if ((local1149.anInt9090 == 1 || local23.anInt9815 != 1) && local23.anInt9815 != -1) {
												local1138 = "<col=ff9040>" + local1138 + "</col> x" + Static316.method4962(local23.anInt9815);
											}
										}
										if (local23.anInt9855 != -1) {
											local1138 = Static361.method5654(local23.anInt9855);
											if (local1138 == null) {
												local1138 = "";
											}
										}
										if (Static381.aClass357_7 == local23) {
											local1138 = Static76.aClass58_32.method1237(Static321.anInt5554);
											local286 = local23.anInt9841;
										}
										if (Static271.aBoolean366) {
											Static485.aClass126_17.T(local115, local121, local23.anInt9852 + local115, local121 - -local23.anInt9797);
										}
										local1123.method7205(local23.anInt9864, Static184.aClass44Array8, local23.anInt9812, local23.anInt9853, local121, local23.aBoolean796 ? 255 - (local136 & 0xFF) << 24 : -1, local115, local23.anInt9797, (int[]) null, local23.anInt9852, 0, (Class1) null, 0, 255 - (local136 & 0xFF) << 24 | local286, local23.anInt9867, local1138);
										if (Static271.aBoolean366) {
											Static485.aClass126_17.KA(arg7, arg2, arg9, arg0);
										}
										if (local1138.trim().length() > 0) {
											if (!Static271.aBoolean366) {
												@Pc(1313) Class298 local1313 = Static220.method3394(Static485.aClass126_17, local23.anInt9821);
												local627 = local1313.method6967(local1138, Static184.aClass44Array8, local23.anInt9852);
												local629 = local1313.method6962(local1138, local23.anInt9852, Static184.aClass44Array8, local23.anInt9867);
												if (Static144.aBoolean196) {
													if (arg4) {
														Static354.method5603(local627 + local115, local115, local629 + local121, local121);
													} else {
														Static450.method6697(local115, local629 + local121, local115 + local627, local121);
													}
												}
											} else if (Static144.aBoolean196) {
												if (arg4) {
													Static354.method5603(local56, local42, local64, local48);
												} else {
													Static450.method6697(local42, local64, local56, local48);
												}
											}
										}
									} else if (Static504.aBoolean704) {
										Static637.method8778(local23);
									}
								} else {
									@Pc(1446) int local1446;
									if (local23.anInt9828 == 5) {
										if (local23.anInt9832 < 0) {
											@Pc(1383) Class44 local1383;
											if (local23.anInt9871 != -1) {
												@Pc(1401) Class339 local1401 = local23.aBoolean800 ? Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aClass339_1 : null;
												local1383 = Static479.aClass348_1.method8199(local23.anInt9858 | 0xFF000000, local23.anInt9871, Static485.aClass126_17, local23.anInt9836, local23.anInt9815, local23.anInt9816, local1401);
											} else if (local23.anInt9855 == -1) {
												local1383 = local23.method8394(Static485.aClass126_17);
											} else {
												local1383 = Static467.method6873(Static485.aClass126_17, local23.anInt9855);
											}
											if (local1383 != null) {
												local286 = local1383.method5313();
												local595 = local1383.method5325();
												local1446 = 255 - (local136 & 0xFF) << 24 | (local23.anInt9841 == 0 ? 16777215 : local23.anInt9841 & 0xFFFFFF);
												if (local23.aBoolean805) {
													Static485.aClass126_17.T(local115, local121, local115 + local23.anInt9852, local23.anInt9797 + local121);
													if (local23.anInt9809 != 0) {
														local627 = (local23.anInt9852 + local286 - 1) / local286;
														local629 = (local23.anInt9797 + local595 - 1) / local595;
														for (local640 = 0; local640 < local627; local640++) {
															for (local734 = 0; local734 < local629; local734++) {
																if (local23.anInt9841 == 0) {
																	local1383.method5306((float) local286 / 2.0F + (float) (local286 * local640 + local115), (float) local595 / 2.0F + (float) (local121 - -(local734 * local595)), 4096, local23.anInt9809);
																} else {
																	local1383.method5305((float) local286 / 2.0F + (float) (local640 * local286 + local115), (float) (local121 + local595 * local734) + (float) local595 / 2.0F, 4096, local23.anInt9809, local1446);
																}
															}
														}
													} else if (local23.anInt9841 == 0 && local136 == 0) {
														local1383.method5326(local115, local121, local23.anInt9852, local23.anInt9797);
													} else {
														local1383.method5324(local115, local121, local23.anInt9852, local23.anInt9797, 0, local1446, 1);
													}
													Static485.aClass126_17.KA(arg7, arg2, arg9, arg0);
												} else if (local23.anInt9841 == 0 && local136 == 0) {
													if (local23.anInt9809 != 0) {
														local1383.method5306((float) local23.anInt9852 / 2.0F + (float) local115, (float) local121 + (float) local23.anInt9797 / 2.0F, local23.anInt9852 * 4096 / local286, local23.anInt9809);
													} else if (local23.anInt9852 == local286 && local595 == local23.anInt9797) {
														local1383.method5312(local115, local121);
													} else {
														local1383.method5329(local115, local121, local23.anInt9852, local23.anInt9797);
													}
												} else if (local23.anInt9809 != 0) {
													local1383.method5305((float) local23.anInt9852 / 2.0F + (float) local115, (float) local121 + (float) local23.anInt9797 / 2.0F, local23.anInt9852 * 4096 / local286, local23.anInt9809, local1446);
												} else if (local23.anInt9852 == local286 && local595 == local23.anInt9797) {
													local1383.method5322(local115, local121, 0, local1446, 1);
												} else {
													local1383.method5310(local115, local121, local23.anInt9852, local23.anInt9797, 0, local1446, 1);
												}
											} else if (Static504.aBoolean704) {
												Static637.method8778(local23);
											}
										} else {
											local23.method8385(Static499.aClass121_1, Static629.aClass20_1).method5169(0, local115, 0, Static485.aClass126_17, local23.anInt9850 << 3, local23.anInt9795 << 3, local23.anInt9797, local121, local23.anInt9852);
										}
										if (Static144.aBoolean196) {
											if (arg4) {
												Static354.method5603(local56, local42, local64, local48);
											} else {
												Static450.method6697(local42, local64, local56, local48);
											}
										}
									} else if (local23.anInt9828 == 6) {
										Static235.method3631();
										local974 = null;
										@Pc(1812) Class180 local1812 = null;
										local595 = 0;
										@Pc(1916) Class200 local1916;
										@Pc(1926) Class339 local1926;
										if (local23.anInt9871 != -1) {
											local1149 = Static479.aClass348_1.method8197(local23.anInt9871);
											if (local1149 != null) {
												local1149 = local1149.method7762(local23.anInt9815);
												local1916 = local23.anInt9806 == -1 ? null : Static396.aClass359_2.method8415(local23.anInt9806);
												local1926 = local23.aBoolean800 ? Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aClass339_1 : null;
												local1812 = local1149.method7755(local1916, local23.anInt9798, local1926, Static485.aClass126_17, 1, local23.anInt9800, 2048, local23.anInt9827);
												if (local1812 == null) {
													Static637.method8778(local23);
												} else {
													local595 = -local1812.fa() >> 1;
												}
											}
										} else if (local23.anInt9796 == 5) {
											local1446 = local23.anInt9817;
											if (local1446 >= 0 && local1446 < 2048) {
												@Pc(1965) Class14_Sub1_Sub1_Sub3_Sub1 local1965 = Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local1446];
												@Pc(1978) Class200 local1978 = local23.anInt9806 == -1 ? null : Static396.aClass359_2.method8415(local23.anInt9806);
												if (local1965 != null && (local1446 == Static620.anInt10055 || Static160.method2420(local1965.aString42) == local23.anInt9856)) {
													local1812 = local1965.aClass339_1.method8048(Static396.aClass359_2, 0, Static479.aClass348_1, Static485.aClass126_17, local23.anInt9827, (int[]) null, Static564.aClass304_1, 2048, (Class299[]) null, (Class200) null, Static258.aClass138_1, local23.anInt9800, 0, local23.anInt9798, 0, Static575.aClass190_2, Static608.aClass151_1, -1, local1978);
												}
											}
										} else if (local23.anInt9796 == 8 || local23.anInt9796 == 9) {
											@Pc(1904) Class5_Sub37 local1904 = Static498.method7299(false, local23.anInt9817);
											local1916 = local23.anInt9806 == -1 ? null : Static396.aClass359_2.method8415(local23.anInt9806);
											if (local1904 != null) {
												local1926 = local23.aBoolean800 ? Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aClass339_1 : null;
												local1812 = local1904.method6256(local23.anInt9800, local23.anInt9798, local1916, local23.anInt9856, local1926, Static485.aClass126_17, local23.anInt9827, local23.anInt9796 == 9);
											}
										} else if (local23.anInt9806 == -1) {
											local1812 = local23.method8402(Static564.aClass304_1, Static575.aClass190_2, Static258.aClass138_1, 0, -1, Static485.aClass126_17, Static608.aClass151_1, -1, (Class200) null, Static396.aClass359_2, Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aClass339_1, Static479.aClass348_1, 2048, local974);
											if (local1812 == null && Static504.aBoolean704) {
												Static637.method8778(local23);
											}
										} else {
											@Pc(1841) Class200 local1841 = Static396.aClass359_2.method8415(local23.anInt9806);
											local1812 = local23.method8402(Static564.aClass304_1, Static575.aClass190_2, Static258.aClass138_1, local23.anInt9798, local23.anInt9800, Static485.aClass126_17, Static608.aClass151_1, local23.anInt9827, local1841, Static396.aClass359_2, Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aClass339_1, Static479.aClass348_1, 2048, local974);
											if (local1812 == null && Static504.aBoolean704) {
												Static637.method8778(local23);
											}
										}
										if (local1812 != null) {
											if (local23.anInt9845 <= 0) {
												local1446 = 512;
											} else {
												local1446 = (local23.anInt9852 << 9) / local23.anInt9845;
											}
											if (local23.anInt9848 > 0) {
												local627 = (local23.anInt9797 << 9) / local23.anInt9848;
											} else {
												local627 = 512;
											}
											local629 = local23.anInt9852 / 2 + local115;
											local640 = local23.anInt9797 / 2 + local121;
											if (!local23.aBoolean794) {
												local629 += local1446 * local23.anInt9820 >> 9;
												local640 += local627 * local23.anInt9818 >> 9;
											}
											Static468.aClass117_6.method7251();
											Static485.aClass126_17.method7040(Static468.aClass117_6);
											Static485.aClass126_17.DA(local629, local640, local1446, local627);
											Static485.aClass126_17.ya();
											if (local23.aBoolean804) {
												Static485.aClass126_17.C(false);
											}
											if (local23.aBoolean794) {
												Static88.aClass117_1.method7246(local23.anInt9849);
												Static88.aClass117_1.method7243(local23.anInt9788);
												Static88.aClass117_1.method7257(local23.anInt9831);
												Static88.aClass117_1.method7247(local23.anInt9820, local23.anInt9818, local23.anInt9854);
											} else {
												local734 = (local23.anInt9873 << 2) * Class5_Sub12_Sub1.anIntArray748[local23.anInt9849 << 3] >> 14;
												local736 = Class5_Sub12_Sub1.anIntArray749[local23.anInt9849 << 3] * (local23.anInt9873 << 2) >> 14;
												Static88.aClass117_1.method7249(-local23.anInt9831 << 3);
												Static88.aClass117_1.method7243(local23.anInt9788 << 3);
												Static88.aClass117_1.method7247(local23.anInt9825 << 2, local595 + (local23.anInt9865 << 2) + local734, local736 + (local23.anInt9865 << 2));
												Static88.aClass117_1.method7258(local23.anInt9849 << 3);
											}
											local23.method8389(Static88.aClass117_1, local1812, Static235.anInt3998, Static485.aClass126_17);
											if (Static271.aBoolean366) {
												Static485.aClass126_17.T(local115, local121, local115 + local23.anInt9852, local121 + local23.anInt9797);
											}
											if (local23.aBoolean794) {
												if (local23.aBoolean791) {
													local1812.method7950(Static88.aClass117_1, (Class14_Sub9) null, local23.anInt9873, 1);
												} else {
													local1812.method7949(Static88.aClass117_1, (Class14_Sub9) null, 1);
													if (local23.aClass14_Sub8_8 != null) {
														Static485.aClass126_17.method7058(local23.aClass14_Sub8_8.method4455());
													}
												}
											} else if (local23.aBoolean791) {
												local1812.method7950(Static88.aClass117_1, (Class14_Sub9) null, local23.anInt9873 << 2, 1);
											} else {
												local1812.method7949(Static88.aClass117_1, (Class14_Sub9) null, 1);
												if (local23.aClass14_Sub8_8 != null) {
													Static485.aClass126_17.method7058(local23.aClass14_Sub8_8.method4455());
												}
											}
											if (Static271.aBoolean366) {
												Static485.aClass126_17.KA(arg7, arg2, arg9, arg0);
											}
											if (local23.aBoolean804) {
												Static485.aClass126_17.C(true);
											}
										}
										if (Static144.aBoolean196) {
											if (arg4) {
												Static354.method5603(local56, local42, local64, local48);
											} else {
												Static450.method6697(local42, local64, local56, local48);
											}
										}
									} else if (local23.anInt9828 == 9) {
										if (local23.aBoolean790) {
											local1446 = local121;
											local286 = local23.anInt9797 + local121;
											local595 = local23.anInt9852 + local115;
										} else {
											local1446 = local23.anInt9797 + local121;
											local286 = local121;
											local595 = local115 + local23.anInt9852;
										}
										if (local23.anInt9787 == 1) {
											Static485.aClass126_17.method6991(local115, local286, local595, local1446, local23.anInt9841, 0);
										} else {
											Static485.aClass126_17.method6984(local115, local286, local595, local1446, local23.anInt9841, local23.anInt9787);
										}
										if (Static144.aBoolean196) {
											if (arg4) {
												Static354.method5603(local56, local42, local64, local48);
											} else {
												Static450.method6697(local42, local64, local56, local48);
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

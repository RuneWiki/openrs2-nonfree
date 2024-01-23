import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
	public static int anInt4310;

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "Lclient!wf;")
	public static Class189 aClass189_12;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString263 = "Loaded textures";

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)V")
	public static void method3587(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class32 local7 = Static68.method1065(arg1);
		@Pc(10) int local10 = local7.anInt787;
		@Pc(13) int local13 = local7.anInt794;
		@Pc(16) int local16 = local7.anInt795;
		@Pc(39) int local39 = Class4_Sub3_Sub16.anIntArray455[local16 - local13];
		if (arg0 < 0 || arg0 > local39) {
			arg0 = 0;
		}
		local39 <<= local13;
		Static10.method173(local10, arg0 << local13 & local39 | ~local39 & Static46.anIntArray62[local10]);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
	public static void method3588() {
		try {
			if (Static227.anInt4358 == 1) {
				@Pc(19) int local19 = Static46.aClass4_Sub6_Sub2_3.method2495();
				if (local19 > 0 && Static46.aClass4_Sub6_Sub2_3.method2504()) {
					local19 -= Static107.anInt5398;
					if (local19 < 0) {
						local19 = 0;
					}
					Static46.aClass4_Sub6_Sub2_3.method2486(local19);
					return;
				}
				Static46.aClass4_Sub6_Sub2_3.method2508();
				Static46.aClass4_Sub6_Sub2_3.method2491();
				if (Static85.aClass58_42 == null) {
					Static227.anInt4358 = 0;
				} else {
					Static227.anInt4358 = 2;
				}
				Static287.aClass4_Sub31_2 = null;
				Static38.aClass99_1 = null;
			}
		} catch (@Pc(62) Exception local62) {
			local62.printStackTrace();
			Static46.aClass4_Sub6_Sub2_3.method2508();
			Static287.aClass4_Sub31_2 = null;
			Static85.aClass58_42 = null;
			Static38.aClass99_1 = null;
			Static227.anInt4358 = 0;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZIZILjava/lang/String;IIBJZLjava/lang/String;)V")
	public static void method3590(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) long arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) String arg9) {
		@Pc(12) int[] local12 = new int[4];
		for (@Pc(14) int local14 = 0; local14 < 3; local14++) {
			local12[local14] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(32) Class4_Sub10 local32 = new Class4_Sub10(128);
		local32.method4618(10);
		local32.method4668((arg2 ? 1 : 0) | (arg8 ? 2 : 0) | (arg0 ? 4 : 0));
		local32.method4619(arg7);
		local32.method4654(local12[0]);
		local32.method4612(arg9);
		local32.method4654(local12[1]);
		local32.method4668(Static259.anInt4939);
		local32.method4618(arg1);
		local32.method4618(arg5);
		local32.method4654(local12[2]);
		local32.method4668(arg6);
		local32.method4668(arg3);
		local32.method4654(local12[3]);
		local32.method4665(Static71.aBigInteger1, Static263.aBigInteger2);
		@Pc(118) Class4_Sub10 local118 = new Class4_Sub10(350);
		local118.method4612(arg4);
		@Pc(131) int local131 = 8 - Static111.method1792(arg4) % 8;
		for (@Pc(133) int local133 = 0; local133 < local131; local133++) {
			local118.method4618((int) (Math.random() * 255.0D));
		}
		local118.method4664(local12);
		Static110.aClass4_Sub10_Sub1_1.anInt5713 = 0;
		Static110.aClass4_Sub10_Sub1_1.method4618(22);
		Static110.aClass4_Sub10_Sub1_1.method4668(local118.anInt5713 + local32.anInt5713 + 2);
		Static110.aClass4_Sub10_Sub1_1.method4668(550);
		Static110.aClass4_Sub10_Sub1_1.method4631(local32.aByteArray71, local32.anInt5713);
		Static110.aClass4_Sub10_Sub1_1.method4631(local118.aByteArray71, local118.anInt5713);
		Static268.anInt5174 = -3;
		Static60.anInt1213 = 0;
		Static166.anInt3409 = 0;
		Static250.anInt4760 = 1;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIBI[Lclient!wf;IIIII)V")
	public static void method3591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class189[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static94.aBoolean138) {
			Static104.method1694(arg8, arg6, arg5, arg4);
		} else {
			Static270.method4246(arg8, arg6, arg5, arg4);
			Static158.method2574();
		}
		for (@Pc(22) int local22 = 0; local22 < arg3.length; local22++) {
			@Pc(38) Class189 local38 = arg3[local22];
			if (local38 != null && (arg1 == local38.anInt5941 || arg1 == -1412584499 && local38 == Static35.aClass189_1)) {
				@Pc(89) int local89;
				if (arg2 == -1) {
					Static261.anIntArray540[Static6.anInt113] = local38.anInt5964 + arg0;
					Static299.anIntArray638[Static6.anInt113] = arg7 + local38.anInt5892;
					Static181.anIntArray383[Static6.anInt113] = local38.anInt5897;
					Static289.anIntArray616[Static6.anInt113] = local38.anInt5953;
					local89 = Static6.anInt113++;
				} else {
					local89 = arg2;
				}
				local38.anInt5904 = Static50.anInt954;
				local38.anInt5971 = local89;
				if (!local38.aBoolean417 || !Static41.method692(local38)) {
					if (local38.anInt5908 > 0) {
						Static29.method467(local38);
					}
					@Pc(117) int local117 = local38.anInt5907;
					@Pc(122) int local122 = local38.anInt5892 + arg7;
					@Pc(128) int local128 = local38.anInt5964 + arg0;
					if (Static27.aBoolean26 && (Static41.method687(local38).anInt3947 != 0 || local38.anInt5915 == 0) && local117 > 127) {
						local117 = 127;
					}
					@Pc(183) int local183;
					@Pc(181) int local181;
					if (local38 == Static35.aClass189_1) {
						if (arg1 != -1412584499 && !local38.aBoolean403) {
							Static299.anInt5590 = arg0;
							Static171.anInt3317 = arg7;
							Static166.aClass189Array3 = arg3;
							continue;
						}
						if (!local38.aBoolean403) {
							local117 = 128;
						}
						if (Static128.aBoolean173 && Static171.aBoolean232) {
							local181 = Static312.anInt6042;
							local183 = Static286.anInt5358;
							local181 -= Static41.anInt777;
							local183 -= Static194.anInt5205;
							if (Static268.anInt5183 > local181) {
								local181 = Static268.anInt5183;
							}
							if (local183 < Static73.anInt1633) {
								local183 = Static73.anInt1633;
							}
							if (local181 + local38.anInt5953 > Static268.anInt5183 - -Static38.aClass189_2.anInt5953) {
								local181 = Static268.anInt5183 + Static38.aClass189_2.anInt5953 - local38.anInt5953;
							}
							if (Static38.aClass189_2.anInt5897 + Static73.anInt1633 < local183 + local38.anInt5897) {
								local183 = Static38.aClass189_2.anInt5897 + Static73.anInt1633 - local38.anInt5897;
							}
							local128 = local183;
							local122 = local181;
						}
					}
					@Pc(309) int local309;
					@Pc(298) int local298;
					@Pc(272) int local272;
					@Pc(278) int local278;
					if (local38.anInt5915 == 2) {
						local181 = arg6;
						local309 = arg5;
						local183 = arg8;
						local298 = arg4;
					} else {
						local181 = arg6 < local122 ? local122 : arg6;
						local183 = local128 <= arg8 ? arg8 : local128;
						local272 = local128 + local38.anInt5897;
						local278 = local122 + local38.anInt5953;
						if (local38.anInt5915 == 9) {
							local272++;
							local278++;
						}
						local298 = local278 >= arg4 ? arg4 : local278;
						local309 = local272 >= arg5 ? arg5 : local272;
					}
					if (!local38.aBoolean417 || local183 < local309 && local298 > local181) {
						@Pc(465) int local465;
						@Pc(498) int local498;
						@Pc(502) int local502;
						@Pc(521) int local521;
						@Pc(540) int local540;
						@Pc(567) int local567;
						@Pc(583) int local583;
						@Pc(551) int local551;
						if (local38.anInt5908 != 0) {
							if (local38.anInt5908 == 1337 || local38.anInt5908 == 1403) {
								Static91.anInt2047 = local128;
								Static115.aClass189_5 = local38;
								Static246.anInt4680 = local122;
								Static242.method3783(local128, local38.anInt5953, local38.anInt5908 == 1403, local38.anInt5897, local122);
								Static85.aBooleanArray8[local89] = true;
								if (Static94.aBoolean138) {
									Static104.method1694(arg8, arg6, arg5, arg4);
								} else {
									Static270.method4246(arg8, arg6, arg5, arg4);
								}
								continue;
							}
							if (local38.anInt5908 == 1338) {
								if (!local38.method4775()) {
									continue;
								}
								Static269.method3023(local128, local89, local38, local122);
								if (Static94.aBoolean138) {
									Static104.method1694(arg8, arg6, arg5, arg4);
								} else {
									Static270.method4246(arg8, arg6, arg5, arg4);
								}
								if (Static194.anInt5207 != 0 && Static194.anInt5207 != 3 || Static18.aBoolean17 || Static175.anInt3341 < local183 || local181 > Static198.anInt5852 || local309 <= Static175.anInt3341 || Static198.anInt5852 >= local298) {
									continue;
								}
								local272 = Static175.anInt3341 - local128;
								local278 = Static198.anInt5852 - local122;
								local465 = local38.anIntArray672[local278];
								if (local465 > local272 || local272 > local38.anIntArray657[local278] + local465) {
									continue;
								}
								local278 -= local38.anInt5953 / 2;
								local498 = Static269.anInt3585 + (int) Static202.aFloat97 & 0x7FF;
								local502 = Class111.anIntArray299[local498];
								local272 -= local38.anInt5897 / 2;
								local502 = local502 * (Static250.anInt4762 + 256) >> 8;
								local521 = Class111.anIntArray298[local498];
								local521 = (Static250.anInt4762 + 256) * local521 >> 8;
								local540 = local502 * local278 + local272 * local521 >> 11;
								local551 = local521 * local278 - local502 * local272 >> 11;
								local567 = Static154.aClass53_Sub1_Sub1_2.anInt3974 + local540 + 64 - Static154.aClass53_Sub1_Sub1_2.method3324() * 64 >> 7;
								local583 = Static154.aClass53_Sub1_Sub1_2.anInt4002 + 64 - local551 - Static154.aClass53_Sub1_Sub1_2.method3324() * 64 >> 7;
								if (Static135.aBoolean177 && (Static187.anInt3560 & 0x40) != 0) {
									@Pc(597) Class189 local597 = Static152.method2432(Static21.anInt1053, Static71.anInt1367);
									if (local597 == null) {
										Static188.method4849();
									} else {
										Static84.method1497(1L, local567, local583, " ->", Static155.aString140, (short) 19, Static237.anInt4467);
									}
									continue;
								}
								if (Static76.anInt5724 == 1) {
									Static84.method1497(1L, local567, local583, "", Static125.aString139, (short) 47, -1);
								}
								Static84.method1497(1L, local567, local583, "", Static206.aString236, (short) 26, -1);
								continue;
							}
							if (local38.anInt5908 == 1339) {
								if (local38.method4775()) {
									Static279.method4346(local38, local122, local89, local128);
									if (Static94.aBoolean138) {
										Static104.method1694(arg8, arg6, arg5, arg4);
									} else {
										Static270.method4246(arg8, arg6, arg5, arg4);
									}
								}
								continue;
							}
							if (local38.anInt5908 == 1400) {
								Static125.method1929(local38.anInt5953, local122, local128, local38.anInt5897);
								Static85.aBooleanArray8[local89] = true;
								Static259.aBooleanArray24[local89] = true;
								if (Static94.aBoolean138) {
									Static104.method1694(arg8, arg6, arg5, arg4);
								} else {
									Static270.method4246(arg8, arg6, arg5, arg4);
								}
								continue;
							}
							if (local38.anInt5908 == 1401) {
								Static300.method4561(local38.anInt5953, local38.anInt5897, local128, local122);
								Static85.aBooleanArray8[local89] = true;
								Static259.aBooleanArray24[local89] = true;
								if (Static94.aBoolean138) {
									Static104.method1694(arg8, arg6, arg5, arg4);
								} else {
									Static270.method4246(arg8, arg6, arg5, arg4);
								}
								continue;
							}
							if (local38.anInt5908 == 1402) {
								if (!Static94.aBoolean138) {
									Static123.method1917(local122, local128);
									Static85.aBooleanArray8[local89] = true;
									Static259.aBooleanArray24[local89] = true;
								}
								continue;
							}
							if (local38.anInt5908 == 1405) {
								if (!Static132.aBoolean176) {
									continue;
								}
								local272 = local128 + local38.anInt5897;
								local278 = local122 + 15;
								Static197.aClass4_Sub3_Sub5_2.method2282("Fps:" + Static113.anInt2295, local272, local278, 16776960, -1);
								@Pc(807) Runtime local807 = Runtime.getRuntime();
								local278 += 15;
								local498 = (int) ((local807.totalMemory() - local807.freeMemory()) / 1024L);
								local502 = 16776960;
								if (local498 > 65536) {
									local502 = 16711680;
								}
								Static197.aClass4_Sub3_Sub5_2.method2282("Mem:" + local498 + "k", local272, local278, local502, -1);
								local278 += 15;
								if (Static94.aBoolean138) {
									local502 = 16776960;
									local521 = (Static173.anInt3330 + Static173.anInt3331 + Static173.anInt3333) / 1024;
									if (local521 > 65536) {
										local502 = 16711680;
									}
									Static197.aClass4_Sub3_Sub5_2.method2282("Card:" + local521 + "k", local272, local278, local502, -1);
									local278 += 15;
								}
								local540 = 0;
								local551 = 0;
								local521 = 0;
								for (local567 = 0; local567 < 29; local567++) {
									local521 += Static239.aClass62_Sub1Array2[local567].method4708();
									local540 += Static239.aClass62_Sub1Array2[local567].method4704();
									local551 += Static239.aClass62_Sub1Array2[local567].method4697();
								}
								local567 = local551 * 100 / local521;
								local583 = local540 * 10000 / local521;
								@Pc(950) String local950 = "Cache:" + Static293.method4471((long) local583, true, 2, 0) + "% (" + local567 + "%)";
								Static32.aClass4_Sub3_Sub5_1.method2282(local950, local272, local278, 16776960, -1);
								local278 += 12;
								if (Static184.anInt3504 > 0) {
									Static32.aClass4_Sub3_Sub5_1.method2282("Particles: " + Static184.anInt3505 + " / " + Static184.anInt3504, local272, local278, 16776960, -1);
								}
								local278 += 12;
								Static85.aBooleanArray8[local89] = true;
								Static259.aBooleanArray24[local89] = true;
								continue;
							}
							if (local38.anInt5908 == 1406) {
								Static9.anInt127 = local128;
								Static138.anInt2643 = local122;
								Static289.aClass189_15 = local38;
								continue;
							}
						}
						if (!Static18.aBoolean17) {
							if (local38.anInt5915 == 0 && local38.aBoolean408 && local183 <= Static175.anInt3341 && Static198.anInt5852 >= local181 && Static175.anInt3341 < local309 && local298 > Static198.anInt5852 && !Static27.aBoolean26) {
								Static262.aShortArray100[0] = 1006;
								Static259.aStringArray30[0] = Static254.aString303;
								Static249.aStringArray27[0] = "";
								Static86.anIntArray160[0] = Static313.anInt6054;
								Static300.anInt5638 = 1;
							}
							if (Static175.anInt3341 >= local183 && local181 <= Static198.anInt5852 && Static175.anInt3341 < local309 && local298 > Static198.anInt5852) {
								Static81.method1427(local38, Static198.anInt5852 - local122, Static175.anInt3341 - local128);
							}
						}
						if (local38.anInt5915 == 0) {
							if (!local38.aBoolean417 && Static41.method692(local38) && local38 != Static208.aClass189_11) {
								continue;
							}
							if (!local38.aBoolean417) {
								if (local38.anInt5891 - local38.anInt5953 < local38.anInt5935) {
									local38.anInt5935 = local38.anInt5891 - local38.anInt5953;
								}
								if (local38.anInt5935 < 0) {
									local38.anInt5935 = 0;
								}
							}
							if (Static94.aBoolean138 && local38.anInt5908 == 1407) {
								Static53.method874(local128, local122, local38.anInt5897, local38.anInt5953);
							}
							method3591(local128 - local38.anInt5936, local38.anInt5918, local89, arg3, local298, local309, local181, local122 - local38.anInt5935, local183);
							if (local38.aClass189Array4 != null) {
								method3591(local128 - local38.anInt5936, local38.anInt5918, local89, local38.aClass189Array4, local298, local309, local181, local122 - local38.anInt5935, local183);
							}
							@Pc(1207) Class4_Sub27 local1207 = (Class4_Sub27) Static148.aClass85_13.method1845((long) local38.anInt5918);
							if (local1207 != null) {
								if (local1207.anInt4620 == 0 && !Static18.aBoolean17 && Static175.anInt3341 >= local183 && Static198.anInt5852 >= local181 && local309 > Static175.anInt3341 && Static198.anInt5852 < local298 && !Static27.aBoolean26) {
									Static262.aShortArray100[0] = 1006;
									Static86.anIntArray160[0] = Static313.anInt6054;
									Static259.aStringArray30[0] = Static254.aString303;
									Static249.aStringArray27[0] = "";
									Static300.anInt5638 = 1;
								}
								Static68.method1069(local1207.anInt4621, local181, local122, local128, local298, local183, local309, local89);
							}
							if (Static94.aBoolean138 && local38.anInt5908 == 1407) {
								Static53.method880();
								Static273.aBoolean123 = true;
							}
							if (Static94.aBoolean138) {
								Static104.method1694(arg8, arg6, arg5, arg4);
							} else {
								Static270.method4246(arg8, arg6, arg5, arg4);
								Static158.method2574();
							}
						}
						if (Static9.aBooleanArray2[local89] || Static18.anInt268 > 1) {
							if (local38.anInt5915 == 0 && !local38.aBoolean417 && local38.anInt5953 < local38.anInt5891) {
								Static228.method3644(local38.anInt5953, local38.anInt5897 + local128, local38.anInt5891, local122, local38.anInt5935);
							}
							if (local38.anInt5915 != 1) {
								if (local38.anInt5915 == 2) {
									local272 = 0;
									for (local278 = 0; local278 < local38.anInt5954; local278++) {
										for (local465 = 0; local465 < local38.anInt5931; local465++) {
											local502 = local122 + (local38.anInt5968 + 32) * local278;
											local498 = local128 + local465 * (local38.anInt5947 + 32);
											if (local272 < 20) {
												local502 += local38.anIntArray663[local272];
												local498 += local38.anIntArray664[local272];
											}
											if (local38.anIntArray660[local272] > 0) {
												local551 = local38.anIntArray660[local272] - 1;
												if (local498 + 32 > arg8 && local498 < arg5 && arg6 < local502 + 32 && local502 < arg4 || local38 == Static195.aClass189_10 && Static5.anInt91 == local272) {
													@Pc(1463) Class4_Sub3_Sub14 local1463;
													if (Static69.anInt1334 == 1 && local272 == Static22.anInt314 && local38.anInt5918 == Static223.anInt4303) {
														local1463 = Static305.method4713(local38.anIntArray661[local272], 2, local38.aBoolean406, null, local551, 0);
													} else {
														local1463 = Static305.method4713(local38.anIntArray661[local272], 1, local38.aBoolean406, null, local551, 3153952);
													}
													if (Static158.aBoolean218) {
														Static85.aBooleanArray8[local89] = true;
													}
													if (local1463 == null) {
														Static205.method3283(local38);
													} else if (local38 == Static195.aClass189_10 && local272 == Static5.anInt91) {
														local521 = Static286.anInt5358 - Static34.anInt547;
														local540 = Static312.anInt6042 - Static42.anInt789;
														if (local521 < 5 && local521 > -5) {
															local521 = 0;
														}
														if (local540 < 5 && local540 > -5) {
															local540 = 0;
														}
														if (Static65.anInt1267 < 5) {
															local540 = 0;
															local521 = 0;
														}
														local1463.method4550(local521 + local498, local502 - -local540, 128);
														if (arg1 != -1) {
															@Pc(1551) Class189 local1551 = arg3[arg1 & 0xFFFF];
															@Pc(1557) int local1557;
															@Pc(1555) int local1555;
															if (Static94.aBoolean138) {
																local1555 = Static104.anInt2149;
																local1557 = Static104.anInt2152;
															} else {
																local1555 = Static270.anInt5188;
																local1557 = Static270.anInt5184;
															}
															@Pc(1589) int local1589;
															if (local540 + local502 < local1557 && local1551.anInt5935 > 0) {
																local1589 = Static211.anInt4156 * (local1557 - local502 - local540) / 3;
																if (Static211.anInt4156 * 10 < local1589) {
																	local1589 = Static211.anInt4156 * 10;
																}
																if (local1551.anInt5935 < local1589) {
																	local1589 = local1551.anInt5935;
																}
																Static42.anInt789 += local1589;
																local1551.anInt5935 -= local1589;
																Static205.method3283(local1551);
															}
															if (local1555 < local502 + local540 + 32 && local1551.anInt5935 < local1551.anInt5891 - local1551.anInt5953) {
																local1589 = (local502 + local540 + 32 - local1555) * Static211.anInt4156 / 3;
																if (local1589 > Static211.anInt4156 * 10) {
																	local1589 = Static211.anInt4156 * 10;
																}
																if (local1589 > local1551.anInt5891 - local1551.anInt5935 - local1551.anInt5953) {
																	local1589 = local1551.anInt5891 - local1551.anInt5935 - local1551.anInt5953;
																}
																local1551.anInt5935 += local1589;
																Static42.anInt789 -= local1589;
																Static205.method3283(local1551);
															}
														}
													} else if (local38 == Static48.aClass189_3 && local272 == Static201.anInt3884) {
														local1463.method4550(local498, local502, 128);
													} else {
														local1463.method4543(local498, local502);
													}
												}
											} else if (local38.anIntArray658 != null && local272 < 20) {
												@Pc(1747) Class4_Sub3_Sub14 local1747 = local38.method4761(local272);
												if (local1747 != null) {
													local1747.method4543(local498, local502);
												} else if (Static135.aBoolean178) {
													Static205.method3283(local38);
												}
											}
											local272++;
										}
									}
								} else if (local38.anInt5915 == 3) {
									if (Static268.method4236(local38)) {
										local272 = local38.anInt5906;
										if (Static208.aClass189_11 == local38 && local38.anInt5975 != 0) {
											local272 = local38.anInt5975;
										}
									} else {
										local272 = local38.anInt5937;
										if (Static208.aClass189_11 == local38 && local38.anInt5970 != 0) {
											local272 = local38.anInt5970;
										}
									}
									if (local117 == 0) {
										if (local38.aBoolean414) {
											if (Static94.aBoolean138) {
												Static104.method1702(local128, local122, local38.anInt5897, local38.anInt5953, local272);
											} else {
												Static270.method4242(local128, local122, local38.anInt5897, local38.anInt5953, local272);
											}
										} else if (Static94.aBoolean138) {
											Static104.method1691(local128, local122, local38.anInt5897, local38.anInt5953, local272);
										} else {
											Static270.method4259(local128, local122, local38.anInt5897, local38.anInt5953, local272);
										}
									} else if (local38.aBoolean414) {
										if (Static94.aBoolean138) {
											Static104.method1692(local128, local122, local38.anInt5897, local38.anInt5953, local272, 256 - (local117 & 0xFF));
										} else {
											Static270.method4250(local128, local122, local38.anInt5897, local38.anInt5953, local272, 256 - (local117 & 0xFF));
										}
									} else if (Static94.aBoolean138) {
										Static104.method1685(local128, local122, local38.anInt5897, local38.anInt5953, local272, 256 - (local117 & 0xFF));
									} else {
										Static270.method4258(local128, local122, local38.anInt5897, local38.anInt5953, local272, 256 - (local117 & 0xFF));
									}
								} else {
									@Pc(1944) Class4_Sub3_Sub5 local1944;
									if (local38.anInt5915 == 4) {
										local1944 = local38.method4771(Static125.aClass56Array3);
										if (local1944 != null) {
											@Pc(1957) String local1957 = local38.aString358;
											if (Static268.method4236(local38)) {
												local278 = local38.anInt5906;
												if (local38 == Static208.aClass189_11 && local38.anInt5975 != 0) {
													local278 = local38.anInt5975;
												}
												if (local38.aString357.length() > 0) {
													local1957 = local38.aString357;
												}
											} else {
												local278 = local38.anInt5937;
												if (local38 == Static208.aClass189_11 && local38.anInt5970 != 0) {
													local278 = local38.anInt5970;
												}
											}
											if (local38.aBoolean417 && local38.anInt5942 != -1) {
												@Pc(2008) Class165 local2008 = Static287.method4398(local38.anInt5942);
												local1957 = local2008.aString315;
												if (local1957 == null) {
													local1957 = "null";
												}
												if ((local2008.anInt5076 == 1 || local38.anInt5966 != 1) && local38.anInt5966 != -1) {
													local1957 = "<col=ff9040>" + local1957 + "</col> x" + Static188.method4853(local38.anInt5966);
												}
											}
											if (Static252.aClass189_14 == local38) {
												local1957 = Static109.aString124;
												local278 = local38.anInt5937;
											}
											if (!local38.aBoolean417) {
												local1957 = Static115.method1821(local38, local1957);
											}
											local1944.method2262(local1957, local128, local122, local38.anInt5897, local38.anInt5953, local278, local38.aBoolean416 ? 0 : -1, local38.anInt5928, local38.anInt5926, local38.anInt5952);
										} else if (Static135.aBoolean178) {
											Static205.method3283(local38);
										}
									} else if (local38.anInt5915 == 5) {
										@Pc(2106) Class4_Sub3_Sub14 local2106;
										if (!local38.aBoolean417) {
											local2106 = local38.method4766(Static268.method4236(local38));
											if (local2106 != null) {
												local2106.method4543(local128, local122);
											} else if (Static135.aBoolean178) {
												Static205.method3283(local38);
											}
										} else if (local38.anInt5976 >= 0) {
											@Pc(2619) Class47 local2619 = local38.method4763();
											if (Static94.aBoolean138) {
												local2619.method1025(0, local128, local122, local38.anInt5897, local38.anInt5953, local38.anInt5969, local38.anInt5921, 0);
											} else {
												local2619.method1024(0, local128, local122, local38.anInt5897, local38.anInt5953, local38.anInt5969, local38.anInt5921);
											}
										} else {
											if (local38.anInt5942 == -1) {
												local2106 = local38.method4766(false);
											} else if (local38.aBoolean420 && Static154.aClass53_Sub1_Sub1_2.aClass147_2 != null) {
												local2106 = Static305.method4713(local38.anInt5966, local38.anInt5979, local38.aBoolean406, Static154.aClass53_Sub1_Sub1_2.aClass147_2, local38.anInt5942, local38.anInt5938);
											} else {
												local2106 = Static305.method4713(local38.anInt5966, local38.anInt5979, local38.aBoolean406, null, local38.anInt5942, local38.anInt5938);
											}
											if (local2106 != null) {
												local278 = local2106.anInt5603;
												local465 = local2106.anInt5613;
												if (local38.aBoolean411) {
													local498 = (local278 + local38.anInt5897 - 1) / local278;
													local502 = (local38.anInt5953 + local465 - 1) / local465;
													if (Static94.aBoolean138) {
														Static104.method1693(local128, local122, local128 + local38.anInt5897, local122 - -local38.anInt5953);
														@Pc(2226) boolean local2226 = Static292.method4445(local2106.anInt5610);
														@Pc(2229) Class4_Sub3_Sub14_Sub2 local2229 = (Class4_Sub3_Sub14_Sub2) local2106;
														@Pc(2234) boolean local2234 = Static292.method4445(local2106.anInt5609);
														if (local2226 && local2234) {
															if (local117 == 0) {
																local2229.method4555(local128, local122, local498, local502);
															} else {
																local2229.method4551(local128, local122, 256 - (local117 & 0xFF), local498, local502);
															}
														} else if (local2226) {
															for (local567 = 0; local567 < local502; local567++) {
																if (local117 == 0) {
																	local2229.method4555(local128, local567 * local465 + local122, local498, 1);
																} else {
																	local2229.method4551(local128, local465 * local567 + local122, -(local117 & 0xFF) + 256, local498, 1);
																}
															}
														} else if (local2234) {
															for (local567 = 0; local567 < local498; local567++) {
																if (local117 == 0) {
																	local2229.method4555(local128 + local567 * local278, local122, 1, local502);
																} else {
																	local2229.method4551(local128 + local567 * local278, local122, 256 - (local117 & 0xFF), 1, local502);
																}
															}
														} else {
															for (local567 = 0; local567 < local498; local567++) {
																for (local583 = 0; local583 < local502; local583++) {
																	if (local117 == 0) {
																		local2106.method4543(local278 * local567 + local128, local583 * local465 + local122);
																	} else {
																		local2106.method4550(local567 * local278 + local128, local583 * local465 + local122, 256 - (local117 & 0xFF));
																	}
																}
															}
														}
														Static104.method1694(arg8, arg6, arg5, arg4);
													} else {
														Static270.method4257(local128, local122, local38.anInt5897 + local128, local122 + local38.anInt5953);
														for (local521 = 0; local521 < local498; local521++) {
															for (local540 = 0; local540 < local502; local540++) {
																if (local38.anInt5962 != 0) {
																	local2106.method4546(local122 + local540 * local465 + local465 / 2, local38.anInt5962, local521 * local278 + local128 + local278 / 2, 4096);
																} else if (local117 == 0) {
																	local2106.method4543(local128 + local521 * local278, local122 + local540 * local465);
																} else {
																	local2106.method4550(local521 * local278 + local128, local465 * local540 + local122, 256 - (local117 & 0xFF));
																}
															}
														}
														Static270.method4246(arg8, arg6, arg5, arg4);
													}
												} else {
													local498 = local38.anInt5897 * 4096 / local278;
													if (local38.anInt5962 != 0) {
														local2106.method4546(local122 + local38.anInt5953 / 2, local38.anInt5962, local38.anInt5897 / 2 + local128, local498);
													} else if (local117 != 0) {
														local2106.method4541(local128, local122, local38.anInt5897, local38.anInt5953, 256 - (local117 & 0xFF));
													} else if (local38.anInt5897 == local278 && local465 == local38.anInt5953) {
														local2106.method4543(local128, local122);
													} else {
														local2106.method4544(local128, local122, local38.anInt5897, local38.anInt5953);
													}
												}
											} else if (Static135.aBoolean178) {
												Static205.method3283(local38);
											}
										}
									} else {
										@Pc(2687) Class165 local2687;
										if (local38.anInt5915 == 6) {
											@Pc(2663) boolean local2663 = Static268.method4236(local38);
											@Pc(2665) Class53_Sub4 local2665 = null;
											if (local2663) {
												local278 = local38.anInt5914;
											} else {
												local278 = local38.anInt5895;
											}
											local498 = 0;
											if (local38.anInt5942 != -1) {
												local2687 = Static287.method4398(local38.anInt5942);
												if (local2687 != null) {
													local2687 = local2687.method4161(local38.anInt5966);
													@Pc(2704) Class46 local2704 = local278 == -1 ? null : Static156.method2501(local278);
													if (local38.aBoolean420 && Static154.aClass53_Sub1_Sub1_2.aClass147_2 != null) {
														local2665 = local2687.method4160(local38.anInt5896, 1, local38.anInt5983, Static154.aClass53_Sub1_Sub1_2.aClass147_2, local2704, local38.anInt5901);
													} else {
														local2665 = local2687.method4160(local38.anInt5896, 1, local38.anInt5983, null, local2704, local38.anInt5901);
													}
													if (local2665 == null) {
														Static205.method3283(local38);
													} else {
														local498 = -local2665.method3850() / 2;
													}
												}
											} else if (local38.anInt5943 == 5) {
												if (local38.anInt5899 == -1) {
													local2665 = Static38.aClass147_1.method3645(null, -1, -1, -1, null, -1, false, 0, null, true, 0);
												} else {
													local502 = local38.anInt5899 & 0x7FF;
													if (Static273.anInt2022 == local502) {
														local502 = 2047;
													}
													@Pc(2827) Class53_Sub1_Sub1 local2827 = Static182.aClass53_Sub1_Sub1Array1[local502];
													@Pc(2838) Class46 local2838 = local278 == -1 ? null : Static156.method2501(local278);
													if (local2827 != null && (int) Static108.method1747(local2827.aString88) << 11 == (local38.anInt5899 & 0xFFFFF800)) {
														local2665 = local2827.aClass147_2.method3645(null, 0, -1, -1, null, local38.anInt5896, false, 0, local2838, true, 0);
													}
												}
											} else if (local278 == -1) {
												local2665 = local38.method4760(null, Static154.aClass53_Sub1_Sub1_2.aClass147_2, -1, -1, 0, local2663);
												if (local2665 == null && Static135.aBoolean178) {
													Static205.method3283(local38);
												}
											} else {
												@Pc(2765) Class46 local2765 = Static156.method2501(local278);
												local2665 = local38.method4760(local2765, Static154.aClass53_Sub1_Sub1_2.aClass147_2, local38.anInt5983, local38.anInt5896, local38.anInt5901, local2663);
												if (local2665 == null && Static135.aBoolean178) {
													Static205.method3283(local38);
												}
											}
											if (local2665 != null) {
												if (local38.anInt5961 <= 0) {
													local502 = 256;
												} else {
													local502 = (local38.anInt5897 << 8) / local38.anInt5961;
												}
												if (local38.anInt5924 <= 0) {
													local521 = 256;
												} else {
													local521 = (local38.anInt5953 << 8) / local38.anInt5924;
												}
												local551 = local122 + local38.anInt5953 / 2 + (local38.anInt5925 * local521 >> 8);
												local540 = (local38.anInt5911 * local502 >> 8) + local38.anInt5897 / 2 + local128;
												if (Static94.aBoolean138) {
													if (local38.aBoolean419) {
														Static94.method1598(local540, local551, local38.anInt5922, local38.aShort50, local502, local521);
													} else {
														Static94.method1599(local540, local551, local502, local521);
														Static94.method1621((float) local38.aShort49, (float) local38.aShort50 * 1.5F);
													}
													Static94.method1618();
													Static94.method1588(true);
													Static94.method1593(false);
													Static151.method2423(Static10.anInt185);
													if (Static273.aBoolean123) {
														Static104.method1699();
														Static94.method1603();
														Static104.method1694(arg8, arg6, arg5, arg4);
														Static273.aBoolean123 = false;
													}
													if (local38.aBoolean412) {
														Static94.method1589();
													}
													local583 = Class111.anIntArray298[local38.anInt5948] * local38.anInt5922 >> 16;
													local567 = local38.anInt5922 * Class111.anIntArray299[local38.anInt5948] >> 16;
													if (local38.aBoolean417) {
														local2665.method3859(local38.anInt5980, local38.anInt5890, local38.anInt5948, local38.anInt5967, local38.anInt5910 + local498 + local567, local583 + local38.anInt5910, -1L);
													} else {
														local2665.method3859(local38.anInt5980, 0, local38.anInt5948, 0, local567, local583, -1L);
													}
													if (local38.aBoolean412) {
														Static94.method1591();
													}
												} else {
													Static158.method2569(local540, local551);
													local583 = local38.anInt5922 * Class111.anIntArray298[local38.anInt5948] >> 16;
													local567 = Class111.anIntArray299[local38.anInt5948] * local38.anInt5922 >> 16;
													if (!local38.aBoolean417) {
														local2665.method3859(local38.anInt5980, 0, local38.anInt5948, 0, local567, local583, -1L);
													} else if (local38.aBoolean419) {
														((Class53_Sub4_Sub1) local2665).method2924(local38.anInt5980, local38.anInt5890, local38.anInt5948, local38.anInt5967, local567 + local498 + local38.anInt5910, local583 + local38.anInt5910, local38.anInt5922);
													} else {
														local2665.method3859(local38.anInt5980, local38.anInt5890, local38.anInt5948, local38.anInt5967, local498 + local567 + local38.anInt5910, local583 - -local38.anInt5910, -1L);
													}
													Static158.method2568();
												}
											}
										} else {
											if (local38.anInt5915 == 7) {
												local1944 = local38.method4771(Static125.aClass56Array3);
												if (local1944 == null) {
													if (Static135.aBoolean178) {
														Static205.method3283(local38);
													}
													continue;
												}
												local278 = 0;
												for (local465 = 0; local465 < local38.anInt5954; local465++) {
													for (local498 = 0; local498 < local38.anInt5931; local498++) {
														if (local38.anIntArray660[local278] > 0) {
															local2687 = Static287.method4398(local38.anIntArray660[local278] - 1);
															@Pc(3246) String local3246;
															if (local2687.anInt5076 != 1 && local38.anIntArray661[local278] == 1) {
																local3246 = "<col=ff9040>" + local2687.aString315 + "</col>";
															} else {
																local3246 = "<col=ff9040>" + local2687.aString315 + "</col> x" + Static188.method4853(local38.anIntArray661[local278]);
															}
															local540 = local128 + local498 * (local38.anInt5947 + 115);
															local551 = (local38.anInt5968 + 12) * local465 + local122;
															if (local38.anInt5928 == 0) {
																local1944.method2266(local3246, local540, local551, local38.anInt5937, local38.aBoolean416 ? 0 : -1);
															} else if (local38.anInt5928 == 1) {
																local1944.method2278(local3246, local540 + 57, local551, local38.anInt5937, local38.aBoolean416 ? 0 : -1);
															} else {
																local1944.method2282(local3246, local540 + 114, local551, local38.anInt5937, local38.aBoolean416 ? 0 : -1);
															}
														}
														local278++;
													}
												}
											}
											if (local38.anInt5915 == 8 && Static77.aClass189_4 == local38 && Static167.anInt3493 == Static198.anInt5844) {
												local272 = 0;
												@Pc(3365) Class4_Sub3_Sub5 local3365 = Static197.aClass4_Sub3_Sub5_2;
												local278 = 0;
												@Pc(3370) String local3370 = local38.aString358;
												local3370 = Static115.method1821(local38, local3370);
												@Pc(3394) String local3394;
												while (local3370.length() > 0) {
													local521 = local3370.indexOf("<br>");
													if (local521 == -1) {
														local3394 = local3370;
														local3370 = "";
													} else {
														local3394 = local3370.substring(0, local521);
														local3370 = local3370.substring(local521 + 4);
													}
													local540 = local3365.method2259(local3394);
													if (local540 > local272) {
														local272 = local540;
													}
													local278 += local3365.anInt2820 + 1;
												}
												local278 += 7;
												local272 += 6;
												local540 = local122 + local38.anInt5953 + 5;
												if (arg4 < local278 + local540) {
													local540 = arg4 - local278;
												}
												local521 = local128 + local38.anInt5897 - local272 - 5;
												if (local521 < local128 + 5) {
													local521 = local128 + 5;
												}
												if (local272 + local521 > arg5) {
													local521 = arg5 - local272;
												}
												if (Static94.aBoolean138) {
													Static104.method1702(local521, local540, local272, local278, 16777120);
													Static104.method1691(local521, local540, local272, local278, 0);
												} else {
													Static270.method4242(local521, local540, local272, local278, 16777120);
													Static270.method4259(local521, local540, local272, local278, 0);
												}
												local551 = local3365.anInt2820 + local540 + 2;
												local3370 = local38.aString358;
												local3370 = Static115.method1821(local38, local3370);
												while (local3370.length() > 0) {
													local567 = local3370.indexOf("<br>");
													if (local567 == -1) {
														local3394 = local3370;
														local3370 = "";
													} else {
														local3394 = local3370.substring(0, local567);
														local3370 = local3370.substring(local567 + 4);
													}
													local3365.method2266(local3394, local521 + 3, local551, 0, -1);
													local551 += local3365.anInt2820 + 1;
												}
											}
											if (local38.anInt5915 == 9) {
												if (local38.aBoolean410) {
													local465 = local38.anInt5897 + local128;
													local498 = local122;
													local278 = local38.anInt5953 + local122;
												} else {
													local465 = local128 + local38.anInt5897;
													local498 = local122 + local38.anInt5953;
													local278 = local122;
												}
												if (local38.anInt5903 == 1) {
													if (Static94.aBoolean138) {
														Static104.method1684(local128, local278, local465, local498, local38.anInt5937);
													} else {
														Static270.method4241(local128, local278, local465, local498, local38.anInt5937);
													}
												} else if (Static94.aBoolean138) {
													Static104.method1688(local128, local278, local465, local498, local38.anInt5937, local38.anInt5903);
												} else {
													Static270.method4252(local128, local278, local465, local498, local38.anInt5937, local38.anInt5903);
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

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
	public static void method3592() {
		Static105.aClass26_21.method511();
	}
}

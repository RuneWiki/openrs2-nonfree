import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!fd", name = "C", descriptor = "[I")
	public static int[] anIntArray65;

	@OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
	public static int anInt1184;

	@OriginalMember(owner = "client!fd", name = "R", descriptor = "I")
	public static int anInt1189;

	@OriginalMember(owner = "client!fd", name = "X", descriptor = "I")
	public static int anInt1195;

	@OriginalMember(owner = "client!fd", name = "bb", descriptor = "Lclient!b;")
	public static Class6 aClass6_32;

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
	public static int anInt1173 = 0;

	@OriginalMember(owner = "client!fd", name = "x", descriptor = "Lclient!vc;")
	public static final Class94 aClass94_3 = new Class94(50);

	@OriginalMember(owner = "client!fd", name = "M", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_564 = Static193.method3027("Fertigkeit)2");

	@OriginalMember(owner = "client!fd", name = "cb", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_566 = Static193.method3027("as it was used to break our rules)3");

	@OriginalMember(owner = "client!fd", name = "Y", descriptor = "Lclient!oc;")
	public static Class70 aClass70_565 = aClass70_566;

	@OriginalMember(owner = "client!fd", name = "Z", descriptor = "I")
	public static int anInt1196 = 0;

	@OriginalMember(owner = "client!fd", name = "ab", descriptor = "[S")
	public static final short[] aShortArray13 = new short[500];

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIII[Lclient!b;IIIII)V")
	public static void method874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class6[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static104.method3092(arg0, arg2, arg7, arg1);
		Static177.method2768();
		for (@Pc(18) int local18 = 0; local18 < arg4.length; local18++) {
			@Pc(24) Class6 local24 = arg4[local18];
			if (local24 != null && (arg5 == local24.anInt198 || arg5 == -1412584499 && local24 == Static154.aClass6_83)) {
				@Pc(72) int local72;
				if (arg6 == -1) {
					Static35.anIntArray38[Static127.anInt2495] = local24.anInt236 + arg8;
					Static59.anIntArray136[Static127.anInt2495] = arg3 + local24.anInt219;
					Static150.anIntArray225[Static127.anInt2495] = local24.anInt244;
					Static175.anIntArray292[Static127.anInt2495] = local24.anInt217;
					local72 = Static127.anInt2495++;
				} else {
					local72 = arg6;
				}
				local24.anInt249 = Static184.anInt3760;
				local24.anInt207 = local72;
				if (!local24.aBoolean21 || !Static103.method1468(local24)) {
					if (local24.anInt274 > 0) {
						Static166.method2466(local24);
					}
					@Pc(101) int local101 = local24.anInt219 + arg3;
					@Pc(107) int local107 = local24.anInt236 + arg8;
					@Pc(110) int local110 = local24.anInt215;
					if (Static58.aBoolean74 && (Static157.method2365(local24) != 0 || local24.anInt250 == 0) && local110 > 127) {
						local110 = 127;
					}
					@Pc(154) int local154;
					@Pc(185) int local185;
					if (local24 == Static154.aClass6_83) {
						if (arg5 != -1412584499 && !local24.aBoolean26) {
							Static156.aClass6Array2 = arg4;
							Static34.anInt749 = arg8;
							Static122.anInt2467 = arg3;
							continue;
						}
						if (Static97.aBoolean104 && Static47.aBoolean55) {
							local154 = Static8.anInt187;
							local154 -= Static208.anInt2643;
							if (Static109.anInt2187 > local154) {
								local154 = Static109.anInt2187;
							}
							if (Static87.aClass6_119.anInt244 + Static109.anInt2187 < local154 + local24.anInt244) {
								local154 = Static87.aClass6_119.anInt244 + Static109.anInt2187 - local24.anInt244;
							}
							local107 = local154;
							local185 = Static167.anInt3403;
							local185 -= Static108.anInt2196;
							if (local185 < Static79.anInt1587) {
								local185 = Static79.anInt1587;
							}
							if (Static79.anInt1587 + Static87.aClass6_119.anInt217 < local185 - -local24.anInt217) {
								local185 = Static79.anInt1587 + Static87.aClass6_119.anInt217 - local24.anInt217;
							}
							local101 = local185;
						}
						if (!local24.aBoolean26) {
							local110 = 128;
						}
					}
					@Pc(235) int local235;
					@Pc(233) int local233;
					@Pc(263) int local263;
					@Pc(244) int local244;
					if (local24.anInt250 == 2) {
						local185 = arg2;
						local233 = arg1;
						local235 = arg7;
						local154 = arg0;
					} else {
						local244 = local101 + local24.anInt217;
						local154 = local107 > arg0 ? local107 : arg0;
						local185 = arg2 >= local101 ? arg2 : local101;
						local263 = local24.anInt244 + local107;
						if (local24.anInt250 == 9) {
							local244++;
							local263++;
						}
						local233 = local244 >= arg1 ? arg1 : local244;
						local235 = local263 < arg7 ? local263 : arg7;
					}
					if (!local24.aBoolean21 || local154 < local235 && local233 > local185) {
						if (local24.anInt274 != 0) {
							if (local24.anInt274 == 1337) {
								Static81.anInt1617 = local107;
								Static185.anInt3775 = local101;
								Static144.method2085(local24.anInt244, local24.anInt217, local101, local107);
								Static104.method3092(arg0, arg2, arg7, arg1);
								continue;
							}
							if (local24.anInt274 == 1338) {
								if (local24.method228()) {
									Static78.method1146(local101, local107, local24, local72);
									Static104.method3092(arg0, arg2, arg7, arg1);
								}
								continue;
							}
							if (local24.anInt274 == 1339) {
								if (local24.method228()) {
									Static185.method2905(local72, local101, local107, local24);
									Static104.method3092(arg0, arg2, arg7, arg1);
								}
								continue;
							}
							if (local24.anInt274 == 1400) {
								Static23.method396(local24.anInt244, local107, local101, local24.anInt217);
								Static165.aBooleanArray14[local72] = true;
								Static70.aBooleanArray3[local72] = true;
								Static104.method3092(arg0, arg2, arg7, arg1);
								continue;
							}
							if (local24.anInt274 == 1401) {
								Static48.method3327(local107, local101, local24.anInt244, local24.anInt217);
								Static165.aBooleanArray14[local72] = true;
								Static70.aBooleanArray3[local72] = true;
								Static104.method3092(arg0, arg2, arg7, arg1);
								continue;
							}
						}
						if (local24.anInt250 == 0 && local24.aBoolean12 && local154 <= Static8.anInt187 && local185 <= Static167.anInt3403 && Static8.anInt187 < local235 && local233 > Static167.anInt3403 && !Static134.aBoolean131 && !Static58.aBoolean74) {
							Static35.anInt770 = 1;
							Static136.aClass70Array48[0] = Static13.aClass70_135;
							aShortArray13[0] = 1005;
							Static49.aClass70Array21[0] = Static61.aClass70_596;
						}
						local263 = Static8.anInt187;
						local244 = Static167.anInt3403;
						if (!Static134.aBoolean131 && local154 <= local263 && local185 <= local244 && local235 > local263 && local244 < local233) {
							Static175.method2705(local263 - local107, local24, local244 - local101);
						}
						if (local24.anInt250 == 0) {
							if (!local24.aBoolean21 && Static103.method1468(local24) && local24 != Static85.aClass6_51) {
								continue;
							}
							if (!local24.aBoolean21) {
								if (local24.anInt220 - local24.anInt217 < local24.anInt270) {
									local24.anInt270 = local24.anInt220 - local24.anInt217;
								}
								if (local24.anInt270 < 0) {
									local24.anInt270 = 0;
								}
							}
							method874(local154, local233, local185, local101 - local24.anInt270, arg4, local24.anInt229, local72, local235, local107 - local24.anInt271);
							if (local24.aClass6Array1 != null) {
								method874(local154, local233, local185, local101 - local24.anInt270, local24.aClass6Array1, local24.anInt229, local72, local235, local107 - local24.anInt271);
							}
							@Pc(604) Class3_Sub10 local604 = (Class3_Sub10) Static144.aClass40_9.method1029((long) local24.anInt229);
							if (local604 != null) {
								if (local604.anInt1429 == 0 && local154 <= Static8.anInt187 && Static167.anInt3403 >= local185 && Static8.anInt187 < local235 && local233 > Static167.anInt3403 && !Static134.aBoolean131 && !Static58.aBoolean74) {
									aShortArray13[0] = 1005;
									Static35.anInt770 = 1;
									Static136.aClass70Array48[0] = Static13.aClass70_135;
									Static49.aClass70Array21[0] = Static61.aClass70_596;
								}
								Static113.method1643(local233, local101, local604.anInt1427, local185, local72, local107, local154, local235);
							}
							Static104.method3092(arg0, arg2, arg7, arg1);
							Static177.method2768();
						}
						if (Static38.aBooleanArray2[local72] || Static116.anInt3351 > 1) {
							if (local24.anInt250 == 0 && !local24.aBoolean21 && local24.anInt220 > local24.anInt217) {
								Static139.method3212(local24.anInt270, local24.anInt244 + local107, local24.anInt217, local101, local24.anInt220);
							}
							if (local24.anInt250 != 1) {
								@Pc(718) int local718;
								@Pc(722) int local722;
								@Pc(733) int local733;
								@Pc(872) int local872;
								@Pc(777) int local777;
								@Pc(716) int local716;
								@Pc(885) int local885;
								@Pc(743) int local743;
								if (local24.anInt250 == 2) {
									local716 = 0;
									for (local718 = 0; local718 < local24.anInt234; local718++) {
										for (local722 = 0; local722 < local24.anInt247; local722++) {
											local733 = (local24.anInt240 + 32) * local722 + local107;
											local743 = local718 * (local24.anInt272 + 32) + local101;
											if (local716 < 20) {
												local733 += local24.anIntArray11[local716];
												local743 += local24.anIntArray8[local716];
											}
											if (local24.anIntArray15[local716] > 0) {
												local777 = local24.anIntArray15[local716] - 1;
												if (arg0 < local733 + 32 && arg7 > local733 && local743 + 32 > arg2 && local743 < arg1 || local24 == aClass6_32 && Static23.anInt456 == local716) {
													@Pc(837) Class3_Sub3_Sub2_Sub1 local837;
													if (Static210.anInt4244 == 1 && Static60.anInt3272 == local716 && anInt1195 == local24.anInt229) {
														local837 = Static97.method1402(0, 2, local777, local24.aBoolean15, local24.anIntArray9[local716]);
													} else {
														local837 = Static97.method1402(3153952, 1, local777, local24.aBoolean15, local24.anIntArray9[local716]);
													}
													if (local837 == null) {
														Static9.method237(local24);
													} else if (local24 == aClass6_32 && Static23.anInt456 == local716) {
														local872 = Static167.anInt3403 - Static127.anInt2501;
														if (local872 < 5 && local872 > -5) {
															local872 = 0;
														}
														local885 = Static8.anInt187 - Static209.anInt4238;
														if (local885 < 5 && local885 > -5) {
															local885 = 0;
														}
														if (Static149.anInt3040 < 5) {
															local885 = 0;
															local872 = 0;
														}
														local837.method182(local885 + local733, local743 - -local872, 128);
														if (arg5 != -1) {
															@Pc(923) Class6 local923 = arg4[arg5 & 0xFFFF];
															@Pc(925) int local925 = Static104.anInt3994;
															@Pc(927) int local927 = Static104.anInt3998;
															@Pc(947) int local947;
															if (local925 > local872 + local743 && local923.anInt270 > 0) {
																local947 = Static211.anInt4246 * (local925 - local743 - local872) / 3;
																if (Static211.anInt4246 * 10 < local947) {
																	local947 = Static211.anInt4246 * 10;
																}
																if (local923.anInt270 < local947) {
																	local947 = local923.anInt270;
																}
																local923.anInt270 -= local947;
																Static127.anInt2501 += local947;
																Static9.method237(local923);
															}
															if (local927 < local872 + local743 + 32 && local923.anInt270 < local923.anInt220 - local923.anInt217) {
																local947 = (local872 + local743 + 32 - local927) * Static211.anInt4246 / 3;
																if (Static211.anInt4246 * 10 < local947) {
																	local947 = Static211.anInt4246 * 10;
																}
																if (local923.anInt220 - local923.anInt217 - local923.anInt270 < local947) {
																	local947 = local923.anInt220 - local923.anInt217 - local923.anInt270;
																}
																Static127.anInt2501 -= local947;
																local923.anInt270 += local947;
																Static9.method237(local923);
															}
														}
													} else if (local24 == Static145.aClass6_75 && Static159.anInt3286 == local716) {
														local837.method182(local733, local743, 128);
													} else {
														local837.method185(local733, local743);
													}
												}
											} else if (local24.anIntArray21 != null && local716 < 20) {
												@Pc(1098) Class3_Sub3_Sub2_Sub1 local1098 = local24.method234(local716);
												if (local1098 != null) {
													local1098.method185(local733, local743);
												} else if (Static53.aBoolean71) {
													Static9.method237(local24);
												}
											}
											local716++;
										}
									}
								} else if (local24.anInt250 == 3) {
									if (Static144.method2087(local24)) {
										local716 = local24.anInt256;
										if (Static85.aClass6_51 == local24 && local24.anInt264 != 0) {
											local716 = local24.anInt264;
										}
									} else {
										local716 = local24.anInt243;
										if (Static85.aClass6_51 == local24 && local24.anInt214 != 0) {
											local716 = local24.anInt214;
										}
									}
									if (local110 == 0) {
										if (local24.aBoolean25) {
											Static104.method3079(local107, local101, local24.anInt244, local24.anInt217, local716);
										} else {
											Static104.method3097(local107, local101, local24.anInt244, local24.anInt217, local716);
										}
									} else if (local24.aBoolean25) {
										Static104.method3087(local107, local101, local24.anInt244, local24.anInt217, local716, 256 - (local110 & 0xFF));
									} else {
										Static104.method3088(local107, local101, local24.anInt244, local24.anInt217, local716, 256 - (local110 & 0xFF));
									}
								} else {
									@Pc(1230) Class3_Sub3_Sub2_Sub4_Sub1 local1230;
									if (local24.anInt250 == 4) {
										local1230 = local24.method223(Static93.aClass3_Sub3_Sub2_Sub2Array6);
										if (local1230 != null) {
											@Pc(1242) Class70 local1242 = local24.aClass70_122;
											if (Static144.method2087(local24)) {
												local718 = local24.anInt256;
												if (Static85.aClass6_51 == local24 && local24.anInt264 != 0) {
													local718 = local24.anInt264;
												}
												if (local24.aClass70_123.method2045() > 0) {
													local1242 = local24.aClass70_123;
												}
											} else {
												local718 = local24.anInt243;
												if (local24 == Static85.aClass6_51 && local24.anInt214 != 0) {
													local718 = local24.anInt214;
												}
											}
											if (local24.aBoolean21 && local24.anInt254 != -1) {
												@Pc(1302) Class3_Sub3_Sub11 local1302 = Static14.method275(local24.anInt254);
												local1242 = local1302.aClass70_579;
												if (local1242 == null) {
													local1242 = Static121.aClass70_1173;
												}
												if ((local1302.anInt1232 == 1 || local24.anInt238 != 1) && local24.anInt238 != -1) {
													local1242 = Static207.method3296(new Class70[] { Static149.aClass70_1432, local1242, Static36.aClass70_394, Static143.method2084(local24.anInt238) });
												}
											}
											if (local24 == Static72.aClass6_40) {
												local718 = local24.anInt243;
												local1242 = Static12.aClass70_132;
											}
											if (!local24.aBoolean21) {
												local1242 = Static135.method1935(local1242, local24);
											}
											local1230.method3128(local1242, local107, local101, local24.anInt244, local24.anInt217, local718, local24.aBoolean27 ? 0 : -1, local24.anInt231, local24.anInt239, local24.anInt221);
										} else if (Static53.aBoolean71) {
											Static9.method237(local24);
										}
									} else if (local24.anInt250 == 5) {
										@Pc(1410) Class3_Sub3_Sub2_Sub1 local1410;
										if (local24.aBoolean21) {
											if (local24.anInt254 == -1) {
												local1410 = local24.method239(false);
											} else {
												local1410 = Static97.method1402(local24.anInt232, local24.anInt225, local24.anInt254, local24.aBoolean15, local24.anInt238);
											}
											if (local1410 != null) {
												local718 = local1410.anInt169;
												local722 = local1410.anInt166;
												if (local24.aBoolean13) {
													local733 = (local24.anInt244 + local718 - 1) / local718;
													local743 = (local24.anInt217 + local722 - 1) / local722;
													Static104.method3096(local107, local101, local24.anInt244 + local107, local24.anInt217 + local101);
													for (local885 = 0; local885 < local733; local885++) {
														for (local872 = 0; local872 < local743; local872++) {
															if (local24.anInt206 != 0) {
																local1410.method187(local885 * local718 + local107 + local718 / 2, local722 * local872 + local101 + local722 / 2, local24.anInt206, 4096);
															} else if (local110 == 0) {
																local1410.method185(local718 * local885 + local107, local101 - -(local872 * local722));
															} else {
																local1410.method182(local107 + local885 * local718, local101 - -(local872 * local722), 256 - (local110 & 0xFF));
															}
														}
													}
													Static104.method3092(arg0, arg2, arg7, arg1);
												} else {
													local733 = local24.anInt244 * 4096 / local718;
													if (local24.anInt206 != 0) {
														local1410.method187(local107 + local24.anInt244 / 2, local24.anInt217 / 2 + local101, local24.anInt206, local733);
													} else if (local110 != 0) {
														local1410.method184(local107, local101, local24.anInt244, local24.anInt217, 256 - (local110 & 0xFF));
													} else if (local718 == local24.anInt244 && local722 == local24.anInt217) {
														local1410.method185(local107, local101);
													} else {
														local1410.method176(local107, local101, local24.anInt244, local24.anInt217);
													}
												}
											} else if (Static53.aBoolean71) {
												Static9.method237(local24);
											}
										} else {
											local1410 = local24.method239(Static144.method2087(local24));
											if (local1410 != null) {
												local1410.method185(local107, local101);
											} else if (Static53.aBoolean71) {
												Static9.method237(local24);
											}
										}
									} else {
										@Pc(1802) Class3_Sub3_Sub11 local1802;
										@Pc(1918) int local1918;
										if (local24.anInt250 == 6) {
											@Pc(1662) boolean local1662 = Static144.method2087(local24);
											@Pc(1664) Class26_Sub6 local1664 = null;
											if (local1662) {
												local718 = local24.anInt260;
											} else {
												local718 = local24.anInt248;
											}
											local733 = 0;
											if (local24.anInt254 != -1) {
												local1802 = Static14.method275(local24.anInt254);
												if (local1802 != null) {
													local1802 = local1802.method900(local24.anInt238);
													local1664 = local1802.method905(null, 1, 0);
													if (local1664 == null) {
														Static9.method237(local24);
													} else {
														local733 = -local1664.method2995() / 2;
													}
												}
											} else if (local24.anInt224 == 5) {
												if (local24.anInt201 == -1) {
													local1664 = Static109.aClass101_2.method3316(-1, -1, null, null);
												} else {
													local743 = local24.anInt201 & 0x7FF;
													if (local743 == Static64.anInt1360) {
														local743 = 2047;
													}
													@Pc(1760) Class26_Sub2_Sub1 local1760 = Static146.aClass26_Sub2_Sub1Array1[local743];
													@Pc(1770) Class3_Sub3_Sub17 local1770 = local718 == -1 ? null : Static11.method254(local718);
													if (local1760 != null && (int) local1760.aClass70_952.method2018() << 11 == (local24.anInt201 & 0xFFFFF800)) {
														local1664 = local1760.aClass101_1.method3316(0, local24.anInt265, null, local1770);
													}
												}
											} else if (local718 == -1) {
												local1664 = local24.method233(-1, local1662, Static144.aClass26_Sub2_Sub1_1.aClass101_1, null);
												if (local1664 == null && Static53.aBoolean71) {
													Static9.method237(local24);
												}
											} else {
												@Pc(1712) Class3_Sub3_Sub17 local1712 = Static11.method254(local718);
												local1664 = local24.method233(local24.anInt265, local1662, Static144.aClass26_Sub2_Sub1_1.aClass101_1, local1712);
												if (local1664 == null && Static53.aBoolean71) {
													Static9.method237(local24);
												}
											}
											if (local1664 != null) {
												if (local24.anInt268 > 0) {
													local743 = (local24.anInt244 << 8) / local24.anInt268;
												} else {
													local743 = 256;
												}
												if (local24.anInt262 > 0) {
													local885 = (local24.anInt217 << 8) / local24.anInt262;
												} else {
													local885 = 256;
												}
												local777 = (local24.anInt258 * local885 >> 8) + local24.anInt217 / 2 + local101;
												local872 = (local24.anInt235 * local743 >> 8) + local107 + local24.anInt244 / 2;
												Static177.method2780(local872, local777);
												@Pc(1908) int local1908 = local24.anInt245 * Class3_Sub3_Sub2_Sub5.anIntArray303[local24.anInt263] >> 16;
												local1918 = Class3_Sub3_Sub2_Sub5.anIntArray300[local24.anInt263] * local24.anInt245 >> 16;
												if (!local24.aBoolean21) {
													local1664.method2525(local24.anInt200, 0, local24.anInt263, 0, local1918, local1908);
												} else if (local24.aBoolean23) {
													((Class26_Sub6_Sub1) local1664).method2545(local24.anInt200, local24.anInt204, local24.anInt263, local24.anInt273, local24.anInt276 + local1918 + local733, local1908 + local24.anInt276, local24.anInt245);
												} else {
													local1664.method2525(local24.anInt200, local24.anInt204, local24.anInt263, local24.anInt273, local24.anInt276 + local733 + local1918, local24.anInt276 + local1908);
												}
												Static177.method2773();
											}
										} else {
											if (local24.anInt250 == 7) {
												local1230 = local24.method223(Static93.aClass3_Sub3_Sub2_Sub2Array6);
												if (local1230 == null) {
													if (Static53.aBoolean71) {
														Static9.method237(local24);
													}
													continue;
												}
												local718 = 0;
												for (local722 = 0; local722 < local24.anInt234; local722++) {
													for (local733 = 0; local733 < local24.anInt247; local733++) {
														if (local24.anIntArray15[local718] > 0) {
															local1802 = Static14.method275(local24.anIntArray15[local718] - 1);
															@Pc(2061) Class70 local2061;
															if (local1802.anInt1232 != 1 && local24.anIntArray9[local718] == 1) {
																local2061 = Static207.method3296(new Class70[] { Static149.aClass70_1432, local1802.aClass70_579, Static17.aClass70_167 });
															} else {
																local2061 = Static207.method3296(new Class70[] { Static149.aClass70_1432, local1802.aClass70_579, Static36.aClass70_394, Static143.method2084(local24.anIntArray9[local718]) });
															}
															local872 = local733 * (local24.anInt240 + 115) + local107;
															local777 = (local24.anInt272 + 12) * local722 + local101;
															if (local24.anInt231 == 0) {
																local1230.method3126(local2061, local872, local777, local24.anInt243, local24.aBoolean27 ? 0 : -1);
															} else if (local24.anInt231 == 1) {
																local1230.method3121(local2061, local872 + 57, local777, local24.anInt243, local24.aBoolean27 ? 0 : -1);
															} else {
																local1230.method3113(local2061, local872 + 115 - 1, local777, local24.anInt243, local24.aBoolean27 ? 0 : -1);
															}
														}
														local718++;
													}
												}
											}
											if (local24.anInt250 == 8 && Static191.aClass6_105 == local24 && Static96.anInt2009 == Static95.anInt1979) {
												@Pc(2192) Class3_Sub3_Sub2_Sub4_Sub1 local2192 = Static83.aClass3_Sub3_Sub2_Sub4_Sub1_4;
												local716 = 0;
												@Pc(2197) Class70 local2197 = local24.aClass70_122;
												local2197 = Static135.method1935(local2197, local24);
												local718 = 0;
												@Pc(2216) Class70 local2216;
												while (local2197.method2045() > 0) {
													local885 = local2197.method2036(Static97.aClass70_994);
													if (local885 == -1) {
														local2216 = local2197;
														local2197 = Static61.aClass70_596;
													} else {
														local2216 = local2197.method2023(local885, 0);
														local2197 = local2197.method2019(local885 + 4);
													}
													local872 = local2192.method3115(local2216);
													if (local716 < local872) {
														local716 = local872;
													}
													local718 += local2192.anInt4004 + 1;
												}
												local872 = local101 + local24.anInt217 + 5;
												local716 += 6;
												local885 = local24.anInt244 + local107 - local716 - 5;
												local718 += 7;
												if (arg1 < local872 + local718) {
													local872 = arg1 - local718;
												}
												if (local107 + 5 > local885) {
													local885 = local107 + 5;
												}
												if (arg7 < local716 + local885) {
													local885 = arg7 - local716;
												}
												Static104.method3079(local885, local872, local716, local718, 16777120);
												Static104.method3097(local885, local872, local716, local718, 0);
												local777 = local872 + local2192.anInt4004 + 2;
												local2197 = local24.aClass70_122;
												local2197 = Static135.method1935(local2197, local24);
												while (local2197.method2045() > 0) {
													local1918 = local2197.method2036(Static97.aClass70_994);
													if (local1918 == -1) {
														local2216 = local2197;
														local2197 = Static61.aClass70_596;
													} else {
														local2216 = local2197.method2023(local1918, 0);
														local2197 = local2197.method2019(local1918 + 4);
													}
													local2192.method3126(local2216, local885 + 3, local777, 0, -1);
													local777 += local2192.anInt4004 + 1;
												}
											}
											if (local24.anInt250 == 9) {
												if (local24.aBoolean24) {
													local722 = local24.anInt244 + local107;
													local718 = local101 + local24.anInt217;
													local733 = local101;
												} else {
													local733 = local101 + local24.anInt217;
													local722 = local107 + local24.anInt244;
													local718 = local101;
												}
												if (local24.anInt241 == 1) {
													Static104.method3095(local107, local718, local722, local733, local24.anInt243);
												} else {
													Static104.method3099(local107, local718, local722, local733, local24.anInt243, local24.anInt241);
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

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)Lclient!kd;")
	public static Class51 method876() {
		try {
			return (Class51) Class.forName("Class51_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(III[[[II)V")
	public static void method878(@OriginalArg(3) int[][][] arg0) {
		Static76.anInt1501 = 4;
		Static89.anInt659 = 104;
		Static126.anInt2489 = 104;
		Static118.aClass3_Sub6ArrayArrayArray1 = new Class3_Sub6[4][104][104];
		Static208.anIntArrayArrayArray10 = new int[4][105][105];
		Static210.anIntArrayArrayArray12 = arg0;
		Static61.method944();
		Static40.anInt859 = 25;
		Static190.aBooleanArrayArray2 = new boolean[Static40.anInt859 + Static40.anInt859 + 1][Static40.anInt859 + Static40.anInt859 + 1];
		Static112.aBooleanArrayArray1 = new boolean[Static40.anInt859 + Static40.anInt859 + 2][Static40.anInt859 + Static40.anInt859 + 2];
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V")
	public static void method879() {
		Static48.aClass3_Sub4_Sub1_43.method1302();
		@Pc(11) int local11 = Static48.aClass3_Sub4_Sub1_43.method1299(1);
		if (local11 == 0) {
			return;
		}
		@Pc(20) int local20 = Static48.aClass3_Sub4_Sub1_43.method1299(2);
		if (local20 == 0) {
			Static108.anIntArray130[Static134.anInt2682++] = 2047;
			return;
		}
		@Pc(41) int local41;
		@Pc(55) int local55;
		if (local20 == 1) {
			local41 = Static48.aClass3_Sub4_Sub1_43.method1299(3);
			Static144.aClass26_Sub2_Sub1_1.method1854(false, local41);
			local55 = Static48.aClass3_Sub4_Sub1_43.method1299(1);
			if (local55 == 1) {
				Static108.anIntArray130[Static134.anInt2682++] = 2047;
			}
			return;
		}
		@Pc(97) int local97;
		if (local20 == 2) {
			local41 = Static48.aClass3_Sub4_Sub1_43.method1299(3);
			Static144.aClass26_Sub2_Sub1_1.method1854(true, local41);
			local55 = Static48.aClass3_Sub4_Sub1_43.method1299(3);
			Static144.aClass26_Sub2_Sub1_1.method1854(true, local55);
			local97 = Static48.aClass3_Sub4_Sub1_43.method1299(1);
			if (local97 == 1) {
				Static108.anIntArray130[Static134.anInt2682++] = 2047;
			}
		} else if (local20 == 3) {
			local41 = Static48.aClass3_Sub4_Sub1_43.method1299(7);
			local55 = Static48.aClass3_Sub4_Sub1_43.method1299(1);
			if (local55 == 1) {
				Static108.anIntArray130[Static134.anInt2682++] = 2047;
			}
			Static137.anInt2795 = Static48.aClass3_Sub4_Sub1_43.method1299(2);
			local97 = Static48.aClass3_Sub4_Sub1_43.method1299(1);
			@Pc(156) int local156 = Static48.aClass3_Sub4_Sub1_43.method1299(7);
			Static144.aClass26_Sub2_Sub1_1.method1858(local41, local97 == 1, local156);
		}
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(B)V")
	public static void method880() {
		@Pc(10) int local10 = Static48.aClass3_Sub4_Sub1_43.method1299(8);
		@Pc(15) int local15;
		if (Static80.anInt1607 > local10) {
			for (local15 = local10; local15 < Static80.anInt1607; local15++) {
				Static160.anIntArray244[Static54.anInt1164++] = Static76.anIntArray81[local15];
			}
		}
		if (Static80.anInt1607 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static80.anInt1607 = 0;
		for (local15 = 0; local15 < local10; local15++) {
			@Pc(57) int local57 = Static76.anIntArray81[local15];
			@Pc(61) Class26_Sub2_Sub1 local61 = Static146.aClass26_Sub2_Sub1Array1[local57];
			@Pc(66) int local66 = Static48.aClass3_Sub4_Sub1_43.method1299(1);
			if (local66 == 0) {
				Static76.anIntArray81[Static80.anInt1607++] = local57;
				local61.anInt2645 = Static184.anInt3760;
			} else {
				@Pc(89) int local89 = Static48.aClass3_Sub4_Sub1_43.method1299(2);
				if (local89 == 0) {
					Static76.anIntArray81[Static80.anInt1607++] = local57;
					local61.anInt2645 = Static184.anInt3760;
					Static108.anIntArray130[Static134.anInt2682++] = local57;
				} else {
					@Pc(136) int local136;
					@Pc(146) int local146;
					if (local89 == 1) {
						Static76.anIntArray81[Static80.anInt1607++] = local57;
						local61.anInt2645 = Static184.anInt3760;
						local136 = Static48.aClass3_Sub4_Sub1_43.method1299(3);
						local61.method1854(false, local136);
						local146 = Static48.aClass3_Sub4_Sub1_43.method1299(1);
						if (local146 == 1) {
							Static108.anIntArray130[Static134.anInt2682++] = local57;
						}
					} else if (local89 == 2) {
						Static76.anIntArray81[Static80.anInt1607++] = local57;
						local61.anInt2645 = Static184.anInt3760;
						local136 = Static48.aClass3_Sub4_Sub1_43.method1299(3);
						local61.method1854(true, local136);
						local146 = Static48.aClass3_Sub4_Sub1_43.method1299(3);
						local61.method1854(true, local146);
						@Pc(198) int local198 = Static48.aClass3_Sub4_Sub1_43.method1299(1);
						if (local198 == 1) {
							Static108.anIntArray130[Static134.anInt2682++] = local57;
						}
					} else if (local89 == 3) {
						Static160.anIntArray244[Static54.anInt1164++] = local57;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "()V")
	public static void method881() {
		@Pc(3) int local3 = Static103.anIntArray117[Static172.anInt3462];
		@Pc(7) Class87[] local7 = Static103.aClass87ArrayArray1[Static172.anInt3462];
		Static208.anInt2597 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class87 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(42) int local42;
			@Pc(53) int local53;
			@Pc(85) int local85;
			@Pc(64) boolean local64;
			if (local16.anInt3627 == 1) {
				local27 = local16.anInt3630 + Static40.anInt859 - Static145.anInt2993;
				if (local27 >= 0 && local27 <= Static40.anInt859 + Static40.anInt859) {
					local42 = local16.anInt3624 + Static40.anInt859 - Static31.anInt701;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt3623 + Static40.anInt859 - Static31.anInt701;
					if (local53 > Static40.anInt859 + Static40.anInt859) {
						local53 = Static40.anInt859 + Static40.anInt859;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static190.aBooleanArrayArray2[local27][local42++]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static116.anInt3348 - local16.anInt3641;
						if (local85 > 32) {
							local16.anInt3642 = 1;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt3642 = 2;
							local85 = -local85;
						}
						local16.anInt3631 = (local16.anInt3633 - Static146.anInt3006 << 8) / local85;
						local16.anInt3640 = (local16.anInt3626 - Static146.anInt3006 << 8) / local85;
						local16.anInt3643 = (local16.anInt3632 - Static198.anInt4037 << 8) / local85;
						local16.anInt3629 = (local16.anInt3637 - Static198.anInt4037 << 8) / local85;
						Static24.aClass87Array2[Static208.anInt2597++] = local16;
					}
				}
			} else if (local16.anInt3627 == 2) {
				local27 = local16.anInt3624 + Static40.anInt859 - Static31.anInt701;
				if (local27 >= 0 && local27 <= Static40.anInt859 + Static40.anInt859) {
					local42 = local16.anInt3630 + Static40.anInt859 - Static145.anInt2993;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt3638 + Static40.anInt859 - Static145.anInt2993;
					if (local53 > Static40.anInt859 + Static40.anInt859) {
						local53 = Static40.anInt859 + Static40.anInt859;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static190.aBooleanArrayArray2[local42++][local27]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static146.anInt3006 - local16.anInt3633;
						if (local85 > 32) {
							local16.anInt3642 = 3;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt3642 = 4;
							local85 = -local85;
						}
						local16.anInt3635 = (local16.anInt3641 - Static116.anInt3348 << 8) / local85;
						local16.anInt3625 = (local16.anInt3628 - Static116.anInt3348 << 8) / local85;
						local16.anInt3643 = (local16.anInt3632 - Static198.anInt4037 << 8) / local85;
						local16.anInt3629 = (local16.anInt3637 - Static198.anInt4037 << 8) / local85;
						Static24.aClass87Array2[Static208.anInt2597++] = local16;
					}
				}
			} else if (local16.anInt3627 == 4) {
				local27 = local16.anInt3632 - Static198.anInt4037;
				if (local27 > 128) {
					local42 = local16.anInt3624 + Static40.anInt859 - Static31.anInt701;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt3623 + Static40.anInt859 - Static31.anInt701;
					if (local53 > Static40.anInt859 + Static40.anInt859) {
						local53 = Static40.anInt859 + Static40.anInt859;
					}
					if (local42 <= local53) {
						@Pc(335) int local335 = local16.anInt3630 + Static40.anInt859 - Static145.anInt2993;
						if (local335 < 0) {
							local335 = 0;
						}
						local85 = local16.anInt3638 + Static40.anInt859 - Static145.anInt2993;
						if (local85 > Static40.anInt859 + Static40.anInt859) {
							local85 = Static40.anInt859 + Static40.anInt859;
						}
						@Pc(357) boolean local357 = false;
						label142: for (@Pc(359) int local359 = local335; local359 <= local85; local359++) {
							for (@Pc(362) int local362 = local42; local362 <= local53; local362++) {
								if (Static190.aBooleanArrayArray2[local359][local362]) {
									local357 = true;
									break label142;
								}
							}
						}
						if (local357) {
							local16.anInt3642 = 5;
							local16.anInt3635 = (local16.anInt3641 - Static116.anInt3348 << 8) / local27;
							local16.anInt3625 = (local16.anInt3628 - Static116.anInt3348 << 8) / local27;
							local16.anInt3631 = (local16.anInt3633 - Static146.anInt3006 << 8) / local27;
							local16.anInt3640 = (local16.anInt3626 - Static146.anInt3006 << 8) / local27;
							Static24.aClass87Array2[Static208.anInt2597++] = local16;
						}
					}
				}
			}
		}
	}
}

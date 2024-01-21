import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!eh", name = "vb", descriptor = "I")
	public static int anInt1304;

	@OriginalMember(owner = "client!eh", name = "yb", descriptor = "[Lclient!cg;")
	public static Class1_Sub2_Sub5_Sub1[] aClass1_Sub2_Sub5_Sub1Array5;

	@OriginalMember(owner = "client!eh", name = "hb", descriptor = "Lclient!uc;")
	public static final Class87 aClass87_23 = new Class87(64);

	@OriginalMember(owner = "client!eh", name = "kb", descriptor = "I")
	public static int anInt1297 = 99;

	@OriginalMember(owner = "client!eh", name = "rb", descriptor = "Lclient!uc;")
	public static final Class87 aClass87_24 = new Class87(64);

	@OriginalMember(owner = "client!eh", name = "sb", descriptor = "[I")
	public static final int[] anIntArray122 = new int[128];

	@OriginalMember(owner = "client!eh", name = "xb", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_811 = Static118.method2249("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

	@OriginalMember(owner = "client!eh", name = "tb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_809 = aClass65_811;

	@OriginalMember(owner = "client!eh", name = "ub", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_810 = Static118.method2249("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!eh", name = "wb", descriptor = "Lclient!ea;")
	public static final Class22 aClass22_1 = new Class22();

	@OriginalMember(owner = "client!eh", name = "zb", descriptor = "I")
	public static int anInt1305 = 0;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(III[Lclient!wd;I)V")
	public static void method848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class97[] arg3) {
		for (@Pc(5) int local5 = 0; local5 < arg3.length; local5++) {
			@Pc(10) Class97 local10 = arg3[local5];
			if (local10 != null && local10.anInt4319 == arg1) {
				if (local10.aByte12 == 0) {
					local10.anInt4353 = local10.anInt4371;
				} else if (local10.aByte12 == 1) {
					local10.anInt4353 = arg2 - local10.anInt4371;
				} else if (local10.aByte12 == 2) {
					local10.anInt4353 = local10.anInt4371 * arg2 >> 14;
				} else if (local10.aByte12 == 3) {
					if (local10.anInt4329 == 2) {
						local10.anInt4353 = (local10.anInt4371 - 1) * local10.anInt4355 + local10.anInt4371 * 32;
					} else if (local10.anInt4329 == 7) {
						local10.anInt4353 = local10.anInt4371 * 115 + local10.anInt4355 * (local10.anInt4371 - 1);
					}
				}
				if (local10.aByte13 == 0) {
					local10.anInt4339 = local10.anInt4350;
				} else if (local10.aByte13 == 1) {
					local10.anInt4339 = (arg2 - local10.anInt4353) / 2 + local10.anInt4350;
				} else if (local10.aByte13 == 2) {
					local10.anInt4339 = arg2 - local10.anInt4353 - local10.anInt4350;
				} else if (local10.aByte13 == 3) {
					local10.anInt4339 = local10.anInt4350 * arg2 >> 14;
				} else if (local10.aByte13 == 4) {
					local10.anInt4339 = (arg2 * local10.anInt4350 >> 14) + (arg2 - local10.anInt4353) / 2;
				} else {
					local10.anInt4339 = arg2 - local10.anInt4353 - (arg2 * local10.anInt4350 >> 14);
				}
				if (local10.anInt4368 - local10.anInt4353 < local10.anInt4310) {
					local10.anInt4310 = local10.anInt4368 - local10.anInt4353;
				}
				if (local10.anInt4310 < 0) {
					local10.anInt4310 = 0;
				}
				if (local10.aByte11 == 0) {
					local10.anInt4354 = local10.anInt4346;
				} else if (local10.aByte11 == 1) {
					local10.anInt4354 = arg0 - local10.anInt4346;
				} else if (local10.aByte11 == 2) {
					local10.anInt4354 = local10.anInt4346 * arg0 >> 14;
				} else if (local10.aByte11 == 3) {
					if (local10.anInt4329 == 2) {
						local10.anInt4354 = local10.anInt4346 * 32 + local10.anInt4362 * (local10.anInt4346 - 1);
					} else if (local10.anInt4329 == 7) {
						local10.anInt4354 = local10.anInt4346 * 12 + local10.anInt4362 * (local10.anInt4346 - 1);
					}
				}
				if (local10.aByte10 == 0) {
					local10.anInt4318 = local10.anInt4308;
				} else if (local10.aByte10 == 1) {
					local10.anInt4318 = (arg0 - local10.anInt4354) / 2 + local10.anInt4308;
				} else if (local10.aByte10 == 2) {
					local10.anInt4318 = arg0 - local10.anInt4354 - local10.anInt4308;
				} else if (local10.aByte10 == 3) {
					local10.anInt4318 = arg0 * local10.anInt4308 >> 14;
				} else if (local10.aByte10 == 4) {
					local10.anInt4318 = (arg0 - local10.anInt4354) / 2 + (local10.anInt4308 * arg0 >> 14);
				} else {
					local10.anInt4318 = arg0 - (local10.anInt4308 * arg0 >> 14) - local10.anInt4354;
				}
				if (local10.anInt4341 - local10.anInt4354 < local10.anInt4342) {
					local10.anInt4342 = local10.anInt4341 - local10.anInt4354;
				}
				if (local10.anInt4342 < 0) {
					local10.anInt4342 = 0;
				}
				if (local10.anInt4329 == 0) {
					Static94.method1781(local10);
				}
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II[Lclient!wd;IIIIIII)V")
	public static void method849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static194.method3107(arg1, arg5, arg4, arg6);
		Static56.method1025();
		for (@Pc(18) int local18 = 0; local18 < arg2.length; local18++) {
			@Pc(24) Class97 local24 = arg2[local18];
			if (local24 != null && (arg3 == local24.anInt4319 || arg3 == -1412584499 && Static195.aClass97_13 == local24)) {
				@Pc(50) int local50;
				if (arg0 == -1) {
					Static195.anIntArray481[Static126.anInt3109] = arg8 + local24.anInt4339;
					Static168.anIntArray351[Static126.anInt3109] = local24.anInt4318 + arg7;
					Static105.anIntArray295[Static126.anInt3109] = local24.anInt4353;
					Static183.anIntArray449[Static126.anInt3109] = local24.anInt4354;
					local50 = Static126.anInt3109++;
				} else {
					local50 = arg0;
				}
				local24.anInt4331 = Static174.anInt3887;
				local24.anInt4378 = local50;
				if (!local24.aBoolean181 || !Static16.method300(local24)) {
					if (local24.anInt4314 > 0) {
						Static29.method564(local24);
					}
					@Pc(110) int local110 = local24.anInt4339 + arg8;
					@Pc(116) int local116 = local24.anInt4318 + arg7;
					@Pc(119) int local119 = local24.anInt4382;
					if (Static8.aBoolean9 && (Static153.method2677(local24) != 0 || local24.anInt4329 == 0) && local119 > 127) {
						local119 = 127;
					}
					@Pc(165) int local165;
					@Pc(163) int local163;
					if (local24 == Static195.aClass97_13) {
						if (arg3 != -1412584499 && !local24.aBoolean183) {
							Static73.anInt1796 = arg8;
							Static36.aClass97Array1 = arg2;
							Static167.anInt3777 = arg7;
							continue;
						}
						if (!local24.aBoolean183) {
							local119 = 128;
						}
						if (Static166.aBoolean150 && Static195.aBoolean167) {
							local163 = Static38.anInt1051;
							local165 = Static53.anInt1441;
							local163 -= Static28.anInt854;
							local165 -= Static2.anInt66;
							if (local163 < Static188.anInt4137) {
								local163 = Static188.anInt4137;
							}
							if (Static124.anInt3083 > local165) {
								local165 = Static124.anInt3083;
							}
							if (local24.anInt4353 + local165 > Static57.aClass97_5.anInt4353 + Static124.anInt3083) {
								local165 = Static124.anInt3083 + Static57.aClass97_5.anInt4353 - local24.anInt4353;
							}
							local110 = local165;
							if (Static188.anInt4137 + Static57.aClass97_5.anInt4354 < local24.anInt4354 + local163) {
								local163 = Static57.aClass97_5.anInt4354 + Static188.anInt4137 - local24.anInt4354;
							}
							local116 = local163;
						}
					}
					@Pc(251) int local251;
					@Pc(245) int local245;
					@Pc(278) int local278;
					@Pc(266) int local266;
					if (local24.anInt4329 == 2) {
						local245 = arg6;
						local163 = arg5;
						local165 = arg1;
						local251 = arg4;
					} else {
						local163 = arg5 < local116 ? local116 : arg5;
						local266 = local116 + local24.anInt4354;
						local165 = arg1 >= local110 ? arg1 : local110;
						local278 = local110 + local24.anInt4353;
						if (local24.anInt4329 == 9) {
							local266++;
							local278++;
						}
						local245 = arg6 > local266 ? local266 : arg6;
						local251 = local278 >= arg4 ? arg4 : local278;
					}
					if (!local24.aBoolean181 || local251 > local165 && local245 > local163) {
						if (local24.anInt4314 != 0) {
							if (local24.anInt4314 == 1337) {
								Static161.anInt3643 = local116;
								Static207.anInt4418 = local110;
								Static162.method2795(local24.anInt4354, local24.anInt4353, local116, local110);
								Static194.method3107(arg1, arg5, arg4, arg6);
								continue;
							}
							if (local24.anInt4314 == 1338) {
								if (local24.method3272()) {
									Static2.method48(local50, local110, local24, local116);
									Static194.method3107(arg1, arg5, arg4, arg6);
								}
								continue;
							}
							if (local24.anInt4314 == 1339) {
								if (local24.method3272()) {
									Static67.method1161(local24, local50, local116, local110);
									Static194.method3107(arg1, arg5, arg4, arg6);
								}
								continue;
							}
							if (local24.anInt4314 == 1400) {
								Static128.method2423(local110, local116, local24.anInt4354, local24.anInt4353);
								Static197.aBooleanArray18[local50] = true;
								Static57.aBooleanArray8[local50] = true;
								Static194.method3107(arg1, arg5, arg4, arg6);
							}
							if (local24.anInt4314 == 1401) {
								Static24.method445(local24.anInt4354, local24.anInt4353, local116, local110);
								Static197.aBooleanArray18[local50] = true;
								Static57.aBooleanArray8[local50] = true;
								Static194.method3107(arg1, arg5, arg4, arg6);
								continue;
							}
						}
						local278 = Static53.anInt1441;
						local266 = Static38.anInt1051;
						if (!Static198.aBoolean168 && local165 <= local278 && local163 <= local266 && local251 > local278 && local266 < local245) {
							Static158.method2746(local278 - local110, local24, local266 - local116);
						}
						if (local24.anInt4329 == 0) {
							if (!local24.aBoolean181 && Static16.method300(local24) && local24 != Static204.aClass97_16) {
								continue;
							}
							if (!local24.aBoolean181) {
								if (local24.anInt4342 > local24.anInt4341 - local24.anInt4354) {
									local24.anInt4342 = local24.anInt4341 - local24.anInt4354;
								}
								if (local24.anInt4342 < 0) {
									local24.anInt4342 = 0;
								}
							}
							method849(local50, local165, arg2, local24.anInt4376, local251, local163, local245, local116 - local24.anInt4342, -local24.anInt4310 + local110);
							if (local24.aClass97Array2 != null) {
								method849(local50, local165, local24.aClass97Array2, local24.anInt4376, local251, local163, local245, local116 - local24.anInt4342, -local24.anInt4310 + local110);
							}
							@Pc(580) Class1_Sub20 local580 = (Class1_Sub20) Static200.aClass99_14.method3292((long) local24.anInt4376);
							if (local580 != null) {
								if (local580.anInt3110 == 0 && local165 <= Static53.anInt1441 && local163 <= Static38.anInt1051 && local251 > Static53.anInt1441 && local245 > Static38.anInt1051 && !Static198.aBoolean168 && !Static8.aBoolean9) {
									Static101.anInt2533 = 1;
									Static162.aShortArray52[0] = 1002;
									Static161.aClass65Array51[0] = Static179.aClass65_2404;
									Static198.aClass65Array62[0] = Static117.aClass65_1665;
								}
								Static78.method1380(local165, local580.anInt3111, local251, local50, local116, local110, local245, local163);
							}
							Static194.method3107(arg1, arg5, arg4, arg6);
							Static56.method1025();
						}
						if (local24.anInt4314 != 1400 && (Static45.aBooleanArray7[local50] || Static148.anInt3489 > 1)) {
							if (local24.anInt4329 == 0 && !local24.aBoolean181 && local24.anInt4341 > local24.anInt4354) {
								Static171.method2895(local24.anInt4354, local116, local24.anInt4342, local110 + local24.anInt4353, local24.anInt4341);
							}
							if (local24.anInt4329 != 1) {
								@Pc(703) int local703;
								@Pc(707) int local707;
								@Pc(718) int local718;
								@Pc(903) int local903;
								@Pc(790) int local790;
								@Pc(701) int local701;
								@Pc(920) int local920;
								@Pc(728) int local728;
								if (local24.anInt4329 == 2) {
									local701 = 0;
									for (local703 = 0; local703 < local24.anInt4346; local703++) {
										for (local707 = 0; local707 < local24.anInt4371; local707++) {
											local718 = local707 * (local24.anInt4355 + 32) + local110;
											local728 = local116 + local703 * (local24.anInt4362 + 32);
											if (local701 < 20) {
												local728 += local24.anIntArray505[local701];
												local718 += local24.anIntArray514[local701];
											}
											if (local24.anIntArray512[local701] > 0) {
												local790 = local24.anIntArray512[local701] - 1;
												if (arg1 < local718 + 32 && arg4 > local718 && local728 + 32 > arg5 && arg6 > local728 || local24 == Static130.aClass97_10 && local701 == Static60.anInt1551) {
													@Pc(842) Class1_Sub2_Sub5_Sub3 local842;
													if (Static145.anInt3438 == 1 && Static4.anInt85 == local701 && local24.anInt4376 == Static157.anInt4276) {
														local842 = Static84.method1457(0, local790, local24.aBoolean174, false, false, 2, local24.anIntArray507[local701]);
													} else {
														local842 = Static84.method1457(3153952, local790, local24.aBoolean174, false, false, 1, local24.anIntArray507[local701]);
													}
													if (local842 == null) {
														Static25.method448(local24);
													} else if (Static130.aClass97_10 == local24 && Static60.anInt1551 == local701) {
														local903 = Static38.anInt1051 - Static54.anInt3673;
														if (local903 < 5 && local903 > -5) {
															local903 = 0;
														}
														local920 = Static53.anInt1441 - Static8.anInt209;
														if (local920 < 5 && local920 > -5) {
															local920 = 0;
														}
														if (Static20.anInt622 < 5) {
															local903 = 0;
															local920 = 0;
														}
														local842.method1304(local718 + local920, local728 - -local903, 128);
														if (arg3 != -1) {
															@Pc(959) Class97 local959 = arg2[arg3 & 0xFFFF];
															@Pc(961) int local961 = Static194.anInt4133;
															@Pc(963) int local963 = Static194.anInt4132;
															@Pc(982) int local982;
															if (local963 > local728 + local903 && local959.anInt4342 > 0) {
																local982 = (local963 - local728 - local903) * Static160.anInt2781 / 3;
																if (local982 > Static160.anInt2781 * 10) {
																	local982 = Static160.anInt2781 * 10;
																}
																if (local982 > local959.anInt4342) {
																	local982 = local959.anInt4342;
																}
																Static54.anInt3673 += local982;
																local959.anInt4342 -= local982;
																Static25.method448(local959);
															}
															if (local961 < local903 + local728 + 32 && local959.anInt4342 < local959.anInt4341 - local959.anInt4354) {
																local982 = (local728 + local903 + 32 - local961) * Static160.anInt2781 / 3;
																if (local982 > Static160.anInt2781 * 10) {
																	local982 = Static160.anInt2781 * 10;
																}
																if (local959.anInt4341 - local959.anInt4354 - local959.anInt4342 < local982) {
																	local982 = local959.anInt4341 - local959.anInt4354 - local959.anInt4342;
																}
																Static54.anInt3673 -= local982;
																local959.anInt4342 += local982;
																Static25.method448(local959);
															}
														}
													} else if (Static143.aClass97_6 == local24 && local701 == Static179.anInt4028) {
														local842.method1304(local718, local728, 128);
													} else {
														local842.method1315(local718, local728);
													}
												}
											} else if (local24.anIntArray515 != null && local701 < 20) {
												@Pc(764) Class1_Sub2_Sub5_Sub3 local764 = local24.method3269(local701);
												if (local764 != null) {
													local764.method1315(local718, local728);
												} else if (Static94.aBoolean96) {
													Static25.method448(local24);
												}
											}
											local701++;
										}
									}
								} else if (local24.anInt4329 == 3) {
									if (Static192.method3158(local24)) {
										local701 = local24.anInt4322;
										if (local24 == Static204.aClass97_16 && local24.anInt4317 != 0) {
											local701 = local24.anInt4317;
										}
									} else {
										local701 = local24.anInt4367;
										if (Static204.aClass97_16 == local24 && local24.anInt4345 != 0) {
											local701 = local24.anInt4345;
										}
									}
									if (local119 == 0) {
										if (local24.aBoolean172) {
											Static194.method3096(local110, local116, local24.anInt4353, local24.anInt4354, local701);
										} else {
											Static194.method3095(local110, local116, local24.anInt4353, local24.anInt4354, local701);
										}
									} else if (local24.aBoolean172) {
										Static194.method3105(local110, local116, local24.anInt4353, local24.anInt4354, local701, 256 - (local119 & 0xFF));
									} else {
										Static194.method3093(local110, local116, local24.anInt4353, local24.anInt4354, local701, 256 - (local119 & 0xFF));
									}
								} else {
									@Pc(1225) Class1_Sub2_Sub5_Sub4_Sub1 local1225;
									if (local24.anInt4329 == 4) {
										local1225 = local24.method3270(Static139.aClass1_Sub2_Sub5_Sub1Array11);
										if (local1225 != null) {
											@Pc(1237) Class65 local1237 = local24.aClass65_2566;
											if (Static192.method3158(local24)) {
												local703 = local24.anInt4322;
												if (Static204.aClass97_16 == local24 && local24.anInt4317 != 0) {
													local703 = local24.anInt4317;
												}
												if (local24.aClass65_2567.method2482() > 0) {
													local1237 = local24.aClass65_2567;
												}
											} else {
												local703 = local24.anInt4367;
												if (local24 == Static204.aClass97_16 && local24.anInt4345 != 0) {
													local703 = local24.anInt4345;
												}
											}
											if (local24.aBoolean181 && local24.anInt4306 != -1) {
												@Pc(1294) Class1_Sub2_Sub2 local1294 = Static40.method700(local24.anInt4306);
												local1237 = local1294.aClass65_229;
												if (local1237 == null) {
													local1237 = Static158.aClass65_2098;
												}
												if ((local1294.anInt321 == 1 || local24.anInt4336 != 1) && local24.anInt4336 != -1) {
													local1237 = Static109.method2004(new Class65[] { Static48.aClass65_786, local1237, Static7.aClass65_86, Static99.method1891(local24.anInt4336) });
												}
											}
											if (Static7.aClass97_1 == local24) {
												local703 = local24.anInt4367;
												local1237 = Static33.aClass65_640;
											}
											if (!local24.aBoolean181) {
												local1237 = Static25.method449(local1237, local24);
											}
											local1225.method1619(local1237, local110, local116, local24.anInt4353, local24.anInt4354, local703, local24.aBoolean171 ? 0 : -1, local24.anInt4379, local24.anInt4312, local24.anInt4365);
										} else if (Static94.aBoolean96) {
											Static25.method448(local24);
										}
									} else if (local24.anInt4329 == 5) {
										@Pc(1400) Class1_Sub2_Sub5_Sub3 local1400;
										if (local24.aBoolean181) {
											if (local24.anInt4306 == -1) {
												local1400 = local24.method3265(false);
											} else {
												local1400 = Static84.method1457(local24.anInt4375, local24.anInt4306, local24.aBoolean174, false, false, local24.anInt4360, local24.anInt4336);
											}
											if (local1400 != null) {
												local703 = local1400.anInt1853;
												local707 = local1400.anInt1856;
												if (local24.aBoolean182) {
													local718 = (local703 + local24.anInt4353 - 1) / local703;
													local728 = (local24.anInt4354 + local707 - 1) / local707;
													Static194.method3100(local110, local116, local24.anInt4353 + local110, local116 - -local24.anInt4354);
													for (local920 = 0; local920 < local718; local920++) {
														for (local903 = 0; local903 < local728; local903++) {
															if (local24.anInt4374 != 0) {
																local1400.method1317(local110 + local920 * local703 + local703 / 2, local707 / 2 + local116 - -(local903 * local707), local24.anInt4374, 4096);
															} else if (local119 == 0) {
																local1400.method1315(local703 * local920 + local110, local707 * local903 + local116);
															} else {
																local1400.method1304(local703 * local920 + local110, local116 - -(local903 * local707), 256 - (local119 & 0xFF));
															}
														}
													}
													Static194.method3107(arg1, arg5, arg4, arg6);
												} else {
													local718 = local24.anInt4353 * 4096 / local703;
													if (local24.anInt4374 != 0) {
														local1400.method1317(local110 + local24.anInt4353 / 2, local116 + local24.anInt4354 / 2, local24.anInt4374, local718);
													} else if (local119 != 0) {
														local1400.method1325(local110, local116, local24.anInt4353, local24.anInt4354, 256 - (local119 & 0xFF));
													} else if (local24.anInt4353 == local703 && local24.anInt4354 == local707) {
														local1400.method1315(local110, local116);
													} else {
														local1400.method1312(local110, local116, local24.anInt4353, local24.anInt4354);
													}
												}
											} else if (Static94.aBoolean96) {
												Static25.method448(local24);
											}
										} else {
											local1400 = local24.method3265(Static192.method3158(local24));
											if (local1400 != null) {
												local1400.method1315(local110, local116);
											} else if (Static94.aBoolean96) {
												Static25.method448(local24);
											}
										}
									} else {
										@Pc(1810) Class1_Sub2_Sub2 local1810;
										@Pc(1916) int local1916;
										if (local24.anInt4329 == 6) {
											@Pc(1670) boolean local1670 = Static192.method3158(local24);
											if (local1670) {
												local703 = local24.anInt4351;
											} else {
												local703 = local24.anInt4381;
											}
											local718 = 0;
											@Pc(1684) Class6_Sub3 local1684 = null;
											if (local24.anInt4306 != -1) {
												local1810 = Static40.method700(local24.anInt4306);
												if (local1810 != null) {
													local1810 = local1810.method217(local24.anInt4336);
													local1684 = local1810.method216(null, 0, 1);
													if (local1684 == null) {
														Static25.method448(local24);
													} else {
														local718 = -local1684.method2984() / 2;
													}
												}
											} else if (local24.anInt4315 == 5) {
												if (local24.anInt4325 == -1) {
													local1684 = Static28.aClass19_2.method698(-1, -1, null, null);
												} else {
													local728 = local24.anInt4325 & 0x7FF;
													if (local728 == Static142.anInt3429) {
														local728 = 2047;
													}
													@Pc(1760) Class6_Sub4_Sub1 local1760 = Static158.aClass6_Sub4_Sub1Array1[local728];
													@Pc(1769) Class1_Sub2_Sub14 local1769 = local703 == -1 ? null : Static173.method2924(local703);
													if (local1760 != null && (int) local1760.aClass65_479.method2475() << 11 == (local24.anInt4325 & 0xFFFFF800)) {
														local1684 = local1760.aClass19_1.method698(local24.anInt4316, 0, null, local1769);
													}
												}
											} else if (local703 == -1) {
												local1684 = local24.method3274(null, Static201.aClass6_Sub4_Sub1_3.aClass19_1, local1670, -1);
												if (local1684 == null && Static94.aBoolean96) {
													Static25.method448(local24);
												}
											} else {
												@Pc(1719) Class1_Sub2_Sub14 local1719 = Static173.method2924(local703);
												local1684 = local24.method3274(local1719, Static201.aClass6_Sub4_Sub1_3.aClass19_1, local1670, local24.anInt4316);
												if (local1684 == null && Static94.aBoolean96) {
													Static25.method448(local24);
												}
											}
											if (local1684 != null) {
												if (local24.anInt4332 <= 0) {
													local920 = 256;
												} else {
													local920 = (local24.anInt4354 << 8) / local24.anInt4332;
												}
												local790 = (local920 * local24.anInt4383 >> 8) + (local116 + (local24.anInt4354 / 2));
												if (local24.anInt4356 > 0) {
													local728 = (local24.anInt4353 << 8) / local24.anInt4356;
												} else {
													local728 = 256;
												}
												local903 = local24.anInt4353 / 2 + local110 + (local728 * local24.anInt4349 >> 8);
												Static56.method1040(local903, local790);
												local1916 = Class1_Sub2_Sub5_Sub2.anIntArray138[local24.anInt4370] * local24.anInt4369 >> 16;
												@Pc(1926) int local1926 = local24.anInt4369 * Class1_Sub2_Sub5_Sub2.anIntArray142[local24.anInt4370] >> 16;
												if (!local24.aBoolean181) {
													local1684.method1184(local24.anInt4380, 0, local24.anInt4370, 0, local1916, local1926);
												} else if (local24.aBoolean170) {
													((Class6_Sub3_Sub1) local1684).method1189(local24.anInt4380, local24.anInt4359, local24.anInt4370, local24.anInt4352, local718 + local1916 + local24.anInt4307, local24.anInt4307 + local1926, local24.anInt4369);
												} else {
													local1684.method1184(local24.anInt4380, local24.anInt4359, local24.anInt4370, local24.anInt4352, local24.anInt4307 + local1916 + local718, local1926 - -local24.anInt4307);
												}
												Static56.method1032();
											}
										} else {
											if (local24.anInt4329 == 7) {
												local1225 = local24.method3270(Static139.aClass1_Sub2_Sub5_Sub1Array11);
												if (local1225 == null) {
													if (Static94.aBoolean96) {
														Static25.method448(local24);
													}
													continue;
												}
												local703 = 0;
												for (local707 = 0; local707 < local24.anInt4346; local707++) {
													for (local718 = 0; local718 < local24.anInt4371; local718++) {
														if (local24.anIntArray512[local703] > 0) {
															local1810 = Static40.method700(local24.anIntArray512[local703] - 1);
															@Pc(2083) Class65 local2083;
															if (local1810.anInt321 != 1 && local24.anIntArray507[local703] == 1) {
																local2083 = Static109.method2004(new Class65[] { Static48.aClass65_786, local1810.aClass65_229, Static8.aClass65_95 });
															} else {
																local2083 = Static109.method2004(new Class65[] { Static48.aClass65_786, local1810.aClass65_229, Static7.aClass65_86, Static99.method1891(local24.anIntArray507[local703]) });
															}
															local903 = (local24.anInt4355 + 115) * local718 + local110;
															local790 = local707 * (local24.anInt4362 + 12) + local116;
															if (local24.anInt4379 == 0) {
																local1225.method1597(local2083, local903, local790, local24.anInt4367, local24.aBoolean171 ? 0 : -1);
															} else if (local24.anInt4379 == 1) {
																local1225.method1595(local2083, local903 + 57, local790, local24.anInt4367, local24.aBoolean171 ? 0 : -1);
															} else {
																local1225.method1602(local2083, local903 + 115 - 1, local790, local24.anInt4367, local24.aBoolean171 ? 0 : -1);
															}
														}
														local703++;
													}
												}
											}
											if (local24.anInt4329 == 8 && Static71.aClass97_8 == local24 && Static86.anInt2066 == Static98.anInt2470) {
												local701 = 0;
												local703 = 0;
												@Pc(2211) Class65 local2211 = local24.aClass65_2566;
												@Pc(2213) Class1_Sub2_Sub5_Sub4_Sub1 local2213 = Static200.aClass1_Sub2_Sub5_Sub4_Sub1_5;
												local2211 = Static25.method449(local2211, local24);
												@Pc(2231) Class65 local2231;
												while (local2211.method2482() > 0) {
													local920 = local2211.method2484(Static5.aClass65_58);
													if (local920 == -1) {
														local2231 = local2211;
														local2211 = Static117.aClass65_1665;
													} else {
														local2231 = local2211.method2481(local920, 0);
														local2211 = local2211.method2483(local920 + 4);
													}
													local903 = local2213.method1600(local2231);
													if (local701 < local903) {
														local701 = local903;
													}
													local703 += local2213.anInt2171 + 1;
												}
												local701 += 6;
												local703 += 7;
												local920 = local110 + local24.anInt4353 - local701 - 5;
												if (local110 + 5 > local920) {
													local920 = local110 + 5;
												}
												local903 = local24.anInt4354 + local116 + 5;
												if (local903 + local703 > arg6) {
													local903 = arg6 - local703;
												}
												if (local920 + local701 > arg4) {
													local920 = arg4 - local701;
												}
												Static194.method3096(local920, local903, local701, local703, 16777120);
												Static194.method3095(local920, local903, local701, local703, 0);
												local790 = local2213.anInt2171 + local903 + 2;
												local2211 = local24.aClass65_2566;
												local2211 = Static25.method449(local2211, local24);
												while (local2211.method2482() > 0) {
													local1916 = local2211.method2484(Static5.aClass65_58);
													if (local1916 == -1) {
														local2231 = local2211;
														local2211 = Static117.aClass65_1665;
													} else {
														local2231 = local2211.method2481(local1916, 0);
														local2211 = local2211.method2483(local1916 + 4);
													}
													local2213.method1597(local2231, local920 + 3, local790, 0, -1);
													local790 += local2213.anInt2171 + 1;
												}
											}
											if (local24.anInt4329 == 9) {
												if (local24.aBoolean173) {
													local707 = local110 + local24.anInt4353;
													local703 = local24.anInt4354 + local116;
													local718 = local116;
												} else {
													local718 = local24.anInt4354 + local116;
													local707 = local24.anInt4353 + local110;
													local703 = local116;
												}
												if (local24.anInt4333 == 1) {
													Static194.method3114(local110, local703, local707, local718, local24.anInt4367);
												} else {
													Static194.method3099(local110, local703, local707, local718, local24.anInt4367, local24.anInt4333);
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

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IZ)I")
	public static int method850(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}

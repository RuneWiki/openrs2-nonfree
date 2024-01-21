import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!df", name = "P", descriptor = "Lclient!kh;")
	public static Class29 aClass29_18;

	@OriginalMember(owner = "client!df", name = "Q", descriptor = "[I")
	public static int[] anIntArray64;

	@OriginalMember(owner = "client!df", name = "bb", descriptor = "[I")
	public static int[] anIntArray65;

	@OriginalMember(owner = "client!df", name = "cb", descriptor = "[I")
	public static int[] anIntArray66;

	@OriginalMember(owner = "client!df", name = "R", descriptor = "Lclient!cd;")
	public static Class10 aClass10_393 = Static51.method932("Stufe)2");

	@OriginalMember(owner = "client!df", name = "S", descriptor = "Lclient!cd;")
	private static Class10 aClass10_394 = Static51.method932("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!df", name = "db", descriptor = "Lclient!cd;")
	private static Class10 aClass10_399 = Static51.method932("scroll:");

	@OriginalMember(owner = "client!df", name = "T", descriptor = "Lclient!cd;")
	public static Class10 aClass10_395 = aClass10_399;

	@OriginalMember(owner = "client!df", name = "X", descriptor = "Lclient!cd;")
	public static Class10 aClass10_396 = aClass10_394;

	@OriginalMember(owner = "client!df", name = "Y", descriptor = "Lclient!cd;")
	private static Class10 aClass10_397 = Static51.method932("You have only just left another world)3");

	@OriginalMember(owner = "client!df", name = "Z", descriptor = "Lclient!cd;")
	public static Class10 aClass10_398 = aClass10_399;

	@OriginalMember(owner = "client!df", name = "fb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_400 = aClass10_397;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIII[Lclient!fa;II)V")
	public static void method670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class23[] arg7, @OriginalArg(9) int arg8) {
		Static172.method2023(arg1, arg2, arg8, arg5);
		Static125.method2032();
		for (@Pc(18) int local18 = 0; local18 < arg7.length; local18++) {
			@Pc(24) Class23 local24 = arg7[local18];
			if (local24 != null && (local24.anInt1045 == arg4 || arg4 == -1412584499 && local24 == Static16.aClass23_1)) {
				@Pc(47) int local47;
				if (arg0 == -1) {
					Static72.anIntArray187[Static5.anInt119] = local24.anInt1073 + arg6;
					Static109.anIntArray255[Static5.anInt119] = arg3 + local24.anInt1085;
					Static101.anIntArray244[Static5.anInt119] = local24.anInt1089;
					Static159.anIntArray360[Static5.anInt119] = local24.anInt1087;
					local47 = Static5.anInt119++;
				} else {
					local47 = arg0;
				}
				local24.anInt1096 = local47;
				local24.anInt1078 = Static14.anInt386;
				if (!local24.aBoolean37 || !Static86.method1370(local24)) {
					if (local24.anInt1088 > 0) {
						Static154.method2385(local24);
					}
					@Pc(107) int local107 = local24.anInt1073 + arg6;
					@Pc(112) int local112 = arg3 + local24.anInt1085;
					@Pc(115) int local115 = local24.anInt1083;
					@Pc(143) int local143;
					@Pc(179) int local179;
					if (Static16.aClass23_1 == local24) {
						if (arg4 != -1412584499 && !local24.aBoolean38) {
							Static120.anInt2723 = arg6;
							Static45.anInt1130 = arg3;
							Static53.aClass23Array2 = arg7;
							continue;
						}
						if (!local24.aBoolean38) {
							local115 = 128;
						}
						if (Static139.aBoolean137 && Static142.aBoolean140) {
							local143 = Static72.anInt1723;
							local143 -= Static143.anInt3171;
							if (local143 < Static135.anInt2991) {
								local143 = Static135.anInt2991;
							}
							if (Static169.aClass23_13.anInt1089 + Static135.anInt2991 < local24.anInt1089 + local143) {
								local143 = Static135.anInt2991 + Static169.aClass23_13.anInt1089 - local24.anInt1089;
							}
							local107 = local143;
							local179 = Static61.anInt3635;
							local179 -= Static41.anInt986;
							if (Static87.anInt2091 > local179) {
								local179 = Static87.anInt2091;
							}
							if (Static87.anInt2091 + Static169.aClass23_13.anInt1087 < local179 + local24.anInt1087) {
								local179 = Static169.aClass23_13.anInt1087 + Static87.anInt2091 - local24.anInt1087;
							}
							local112 = local179;
						}
					}
					@Pc(262) int local262;
					@Pc(278) int local278;
					@Pc(251) int local251;
					@Pc(267) int local267;
					@Pc(294) int local294;
					@Pc(289) int local289;
					if (local24.anInt1090 == 2) {
						local278 = arg5;
						local179 = arg2;
						local143 = arg1;
						local262 = arg8;
					} else if (local24.anInt1090 == 9) {
						local251 = local107;
						local267 = local112;
						local289 = local24.anInt1087 + local112;
						local294 = local107 + local24.anInt1089;
						if (local107 > local294) {
							local251 = local294;
							local294 = local107;
						}
						if (local289 < local112) {
							local267 = local289;
							local289 = local112;
						}
						local179 = local267 > arg2 ? local267 : arg2;
						local143 = local251 > arg1 ? local251 : arg1;
						local289++;
						local278 = local289 >= arg5 ? arg5 : local289;
						local294++;
						local262 = arg8 <= local294 ? arg8 : local294;
					} else {
						local179 = arg2 >= local112 ? arg2 : local112;
						local143 = local107 > arg1 ? local107 : arg1;
						local251 = local107 + local24.anInt1089;
						local262 = local251 < arg8 ? local251 : arg8;
						local267 = local24.anInt1087 + local112;
						local278 = arg5 > local267 ? local267 : arg5;
					}
					if (!local24.aBoolean37 || local262 > local143 && local179 < local278) {
						if (local24.anInt1088 != 0) {
							if (local24.anInt1088 == 1337) {
								Static154.anInt3326 = local112;
								Static89.anInt2095 = local107;
								Static50.method929(local112, local107, local24.anInt1087, local24.anInt1089);
								Static172.method2023(arg1, arg2, arg8, arg5);
								continue;
							}
							if (local24.anInt1088 == 1338) {
								Static72.method1224(local112, local107, local47);
								Static172.method2023(arg1, arg2, arg8, arg5);
								continue;
							}
						}
						local251 = Static72.anInt1723;
						local267 = Static61.anInt3635;
						if (!Static119.aBoolean119 && local143 <= local251 && local267 >= local179 && local251 < local262 && local278 > local267) {
							Static88.method1014(local24, local251 - local107, -local112 + local267);
						}
						if (local24.anInt1090 == 0) {
							if (!local24.aBoolean37 && Static86.method1370(local24) && Static59.aClass23_4 != local24) {
								continue;
							}
							if (!local24.aBoolean37) {
								if (local24.anInt1053 > local24.anInt1076 - local24.anInt1087) {
									local24.anInt1053 = local24.anInt1076 - local24.anInt1087;
								}
								if (local24.anInt1053 < 0) {
									local24.anInt1053 = 0;
								}
							}
							method670(local47, local143, local179, local112 - local24.anInt1053, local24.anInt1057, local278, local107 - local24.anInt1071, arg7, local262);
							if (local24.aClass23Array1 != null) {
								method670(local47, local143, local179, local112 - local24.anInt1053, local24.anInt1057, local278, local107 - local24.anInt1071, local24.aClass23Array1, local262);
							}
							@Pc(550) Class2_Sub15 local550 = (Class2_Sub15) Static30.aClass18_2.method683((long) local24.anInt1057);
							if (local550 != null) {
								if (local550.anInt2382 == 0 && local143 <= Static72.anInt1723 && Static61.anInt3635 >= local179 && local262 > Static72.anInt1723 && local278 > Static61.anInt3635 && !Static119.aBoolean119 && !Static54.aBoolean55) {
									Static80.aClass10Array14[0] = Static135.aClass10_1305;
									Static75.aClass10Array12[0] = Static63.aClass10_687;
									Static46.anInt1135 = 1;
									Static93.anIntArray229[0] = 1003;
								}
								Static101.method1660(local107, local112, local179, local262, local47, local143, local278, local550.anInt2387);
							}
							Static172.method2023(arg1, arg2, arg8, arg5);
							Static125.method2032();
						}
						if (Static179.aBooleanArray20[local47] || Static24.anInt566 > 1) {
							if (local24.anInt1090 == 0 && !local24.aBoolean37 && local24.anInt1076 > local24.anInt1087) {
								Static70.method1186(local112, local24.anInt1053, local24.anInt1087, local107 + local24.anInt1089, local24.anInt1076);
							}
							if (local24.anInt1090 != 1) {
								@Pc(669) int local669;
								@Pc(682) int local682;
								@Pc(859) int local859;
								@Pc(755) int local755;
								@Pc(912) int local912;
								@Pc(914) int local914;
								@Pc(934) int local934;
								@Pc(692) int local692;
								@Pc(864) int local864;
								if (local24.anInt1090 == 2) {
									local294 = 0;
									for (local289 = 0; local289 < local24.anInt1087; local289++) {
										for (local669 = 0; local669 < local24.anInt1089; local669++) {
											local682 = local107 + local669 * (local24.anInt1064 + 32);
											local692 = local289 * (local24.anInt1037 + 32) + local112;
											if (local294 < 20) {
												local682 += local24.anIntArray125[local294];
												local692 += local24.anIntArray132[local294];
											}
											if (local24.anIntArray131[local294] > 0) {
												local755 = local24.anIntArray131[local294] - 1;
												if (arg1 < local682 + 32 && local682 < arg8 && arg2 < local692 + 32 && local692 < arg5 || local24 == Static169.aClass23_12 && local294 == Static19.anInt494) {
													@Pc(810) Class2_Sub1_Sub4_Sub2 local810;
													if (Static44.anInt1023 == 1 && local294 == Static73.anInt1744 && Static149.anInt3231 == local24.anInt1057) {
														local810 = Static55.method1047(2, local24.anIntArray126[local294], 0, local755, false);
													} else {
														local810 = Static55.method1047(1, local24.anIntArray126[local294], 3153952, local755, false);
													}
													if (local810 == null) {
														Static3.method34(local24);
													} else if (Static169.aClass23_12 == local24 && Static19.anInt494 == local294) {
														local859 = Static61.anInt3635 - Static83.anInt1905;
														local864 = Static72.anInt1723 - Static12.anInt366;
														if (local859 < 5 && local859 > -5) {
															local859 = 0;
														}
														if (local864 < 5 && local864 > -5) {
															local864 = 0;
														}
														if (Static149.anInt3232 < 5) {
															local864 = 0;
															local859 = 0;
														}
														local810.method723(local682 + local864, local859 + local692, 128);
														if (arg4 != -1) {
															@Pc(910) Class23 local910 = arg7[arg4 & 0xFFFF];
															local912 = Static172.anInt2833;
															local914 = Static172.anInt2828;
															if (local859 + local692 < local912 && local910.anInt1053 > 0) {
																local934 = Static123.anInt2778 * (local912 - local859 - local692) / 3;
																if (Static123.anInt2778 * 10 < local934) {
																	local934 = Static123.anInt2778 * 10;
																}
																if (local910.anInt1053 < local934) {
																	local934 = local910.anInt1053;
																}
																local910.anInt1053 -= local934;
																Static83.anInt1905 += local934;
																Static3.method34(local910);
															}
															if (local859 + local692 + 32 > local914 && local910.anInt1076 - local910.anInt1087 > local910.anInt1053) {
																local934 = Static123.anInt2778 * (local859 + local692 + 32 - local914) / 3;
																if (Static123.anInt2778 * 10 < local934) {
																	local934 = Static123.anInt2778 * 10;
																}
																if (local934 > local910.anInt1076 - local910.anInt1087 - local910.anInt1053) {
																	local934 = local910.anInt1076 - local910.anInt1053 - local910.anInt1087;
																}
																local910.anInt1053 += local934;
																Static83.anInt1905 -= local934;
																Static3.method34(local910);
															}
														}
													} else if (local24 == Static83.aClass23_7 && Static109.anInt2501 == local294) {
														local810.method723(local682, local692, 128);
													} else {
														local810.method738(local682, local692);
													}
												}
											} else if (local24.anIntArray128 != null && local294 < 20) {
												@Pc(729) Class2_Sub1_Sub4_Sub2 local729 = local24.method844(local294);
												if (local729 != null) {
													local729.method738(local682, local692);
												} else if (Static8.aBoolean11) {
													Static3.method34(local24);
												}
											}
											local294++;
										}
									}
								} else if (local24.anInt1090 == 3) {
									if (Static88.method1023(local24)) {
										local294 = local24.anInt1084;
										if (Static59.aClass23_4 == local24 && local24.anInt1027 != 0) {
											local294 = local24.anInt1027;
										}
									} else {
										local294 = local24.anInt1080;
										if (Static59.aClass23_4 == local24 && local24.anInt1066 != 0) {
											local294 = local24.anInt1066;
										}
									}
									if (local115 == 0) {
										if (local24.aBoolean41) {
											Static172.method2026(local107, local112, local24.anInt1089, local24.anInt1087, local294);
										} else {
											Static172.method2018(local107, local112, local24.anInt1089, local24.anInt1087, local294);
										}
									} else if (local24.aBoolean41) {
										Static172.method2016(local107, local112, local24.anInt1089, local24.anInt1087, local294, 256 - (local115 & 0xFF));
									} else {
										Static172.method2013(local107, local112, local24.anInt1089, local24.anInt1087, local294, 256 - (local115 & 0xFF));
									}
								} else {
									@Pc(1176) Class2_Sub1_Sub4_Sub1_Sub1 local1176;
									if (local24.anInt1090 == 4) {
										local1176 = local24.method848();
										if (local1176 != null) {
											@Pc(1188) Class10 local1188 = local24.aClass10_500;
											if (Static88.method1023(local24)) {
												local289 = local24.anInt1084;
												if (local24 == Static59.aClass23_4 && local24.anInt1027 != 0) {
													local289 = local24.anInt1027;
												}
												if (local24.aClass10_504.method340() > 0) {
													local1188 = local24.aClass10_504;
												}
											} else {
												local289 = local24.anInt1080;
												if (Static59.aClass23_4 == local24 && local24.anInt1066 != 0) {
													local289 = local24.anInt1066;
												}
											}
											if (local24.aBoolean37 && local24.anInt1099 != -1) {
												@Pc(1248) Class2_Sub1_Sub6 local1248 = Static78.method577(local24.anInt1099);
												local1188 = local1248.aClass10_662;
												if (local1188 == null) {
													local1188 = Static176.aClass10_1601;
												}
												if ((local1248.anInt1507 == 1 || local24.anInt1067 != 1) && local24.anInt1067 != -1) {
													local1188 = Static3.method36(new Class10[] { Static150.aClass10_1549, local1188, Static76.aClass10_776, Static8.method159(local24.anInt1067) });
												}
											}
											if (Static68.aClass23_6 == local24) {
												local289 = local24.anInt1080;
												local1188 = Static88.aClass10_605;
											}
											if (!local24.aBoolean37) {
												local1188 = Static171.method2635(local24, local1188);
											}
											local1176.method522(local1188, local107, local112, local24.anInt1089, local24.anInt1087, local289, local24.aBoolean39 ? 0 : -1, local24.anInt1077, local24.anInt1075, local24.anInt1024);
										} else if (Static8.aBoolean11) {
											Static3.method34(local24);
										}
									} else if (local24.anInt1090 == 5) {
										@Pc(1349) Class2_Sub1_Sub4_Sub2 local1349;
										if (local24.aBoolean37) {
											if (local24.anInt1099 == -1) {
												local1349 = local24.method847(false);
											} else {
												local1349 = Static55.method1047(local24.anInt1082, local24.anInt1067, local24.anInt1052, local24.anInt1099, false);
											}
											if (local1349 != null) {
												local289 = local1349.anInt891;
												local669 = local1349.anInt889;
												if (local24.aBoolean42) {
													Static172.method2017(local107, local112, local107 + local24.anInt1089, local24.anInt1087 + local112);
													local692 = (local24.anInt1087 + local669 - 1) / local669;
													local682 = (local24.anInt1089 + local289 - 1) / local289;
													for (local864 = 0; local864 < local682; local864++) {
														for (local859 = 0; local859 < local692; local859++) {
															if (local24.anInt1036 != 0) {
																local1349.method740(local289 * local864 + local107 + local289 / 2, local669 * local859 + local112 - -(local669 / 2), local24.anInt1036, 4096);
															} else if (local115 == 0) {
																local1349.method738(local107 + local864 * local289, local112 + local669 * local859);
															} else {
																local1349.method723(local107 + local289 * local864, local112 - -(local859 * local669), 256 - (local115 & 0xFF));
															}
														}
													}
													Static172.method2023(arg1, arg2, arg8, arg5);
												} else {
													local682 = local24.anInt1089 * 4096 / local289;
													if (local24.anInt1036 != 0) {
														local1349.method740(local24.anInt1089 / 2 + local107, local24.anInt1087 / 2 + local112, local24.anInt1036, local682);
													} else if (local115 != 0) {
														local1349.method719(local107, local112, local24.anInt1089, local24.anInt1087, 256 - (local115 & 0xFF));
													} else if (local24.anInt1089 == local289 && local669 == local24.anInt1087) {
														local1349.method738(local107, local112);
													} else {
														local1349.method717(local107, local112, local24.anInt1089, local24.anInt1087);
													}
												}
											} else if (Static8.aBoolean11) {
												Static3.method34(local24);
											}
										} else {
											local1349 = local24.method847(Static88.method1023(local24));
											if (local1349 != null) {
												local1349.method738(local107, local112);
											} else if (Static8.aBoolean11) {
												Static3.method34(local24);
											}
										}
									} else {
										@Pc(1647) Class2_Sub1_Sub6 local1647;
										if (local24.anInt1090 == 6) {
											@Pc(1624) boolean local1624 = Static88.method1023(local24);
											if (local1624) {
												local289 = local24.anInt1043;
											} else {
												local289 = local24.anInt1069;
											}
											@Pc(1636) Class2_Sub1_Sub3_Sub3 local1636 = null;
											local682 = 0;
											if (local24.anInt1099 != -1) {
												local1647 = Static78.method577(local24.anInt1099);
												if (local1647 != null) {
													local1647 = local1647.method1092(local24.anInt1067);
													local1636 = local1647.method1090(1);
													if (local1636 == null) {
														Static3.method34(local24);
													} else {
														local1636.method825();
														local682 = local1636.anInt3614 / 2;
													}
												}
											} else if (local24.anInt1093 == 5) {
												if (local24.anInt1034 == 0) {
													local1636 = Static12.aClass74_1.method2276(-1, null, -1, null);
												} else {
													local1636 = Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.method2544();
												}
											} else if (local289 == -1) {
												local1636 = local24.method845(Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.aClass74_2, local1624, null, -1);
												if (local1636 == null && Static8.aBoolean11) {
													Static3.method34(local24);
												}
											} else {
												@Pc(1704) Class2_Sub1_Sub9 local1704 = Static19.method325(local289);
												local1636 = local24.method845(Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.aClass74_2, local1624, local1704, local24.anInt1062);
												if (local1636 == null && Static8.aBoolean11) {
													Static3.method34(local24);
												}
											}
											if (local1636 != null) {
												Static125.method2033(local24.anInt1035 + local24.anInt1089 / 2 + local107, local24.anInt1070 + local112 + local24.anInt1087 / 2);
												local864 = local24.anInt1039 * Class2_Sub1_Sub4_Sub4.anIntArray304[local24.anInt1058] >> 16;
												local692 = Class2_Sub1_Sub4_Sub4.anIntArray299[local24.anInt1058] * local24.anInt1039 >> 16;
												if (!local24.aBoolean37) {
													local1636.method818(local24.anInt1044, 0, local24.anInt1058, 0, local692, local864);
												} else if (local24.aBoolean47) {
													local1636.method823(local24.anInt1044, local24.anInt1055, local24.anInt1058, local24.anInt1038, local24.anInt1030 + local692 + local682, local24.anInt1030 + local864, local24.anInt1039);
												} else {
													local1636.method818(local24.anInt1044, local24.anInt1055, local24.anInt1058, local24.anInt1038, local692 + local682 + local24.anInt1030, local864 + local24.anInt1030);
												}
												Static125.method2030();
											}
										} else {
											if (local24.anInt1090 == 7) {
												local1176 = local24.method848();
												if (local1176 == null) {
													if (Static8.aBoolean11) {
														Static3.method34(local24);
													}
													continue;
												}
												local289 = 0;
												for (local669 = 0; local669 < local24.anInt1087; local669++) {
													for (local682 = 0; local682 < local24.anInt1089; local682++) {
														if (local24.anIntArray131[local289] > 0) {
															local1647 = Static78.method577(local24.anIntArray131[local289] - 1);
															@Pc(1928) Class10 local1928;
															if (local1647.anInt1507 != 1 && local24.anIntArray126[local289] == 1) {
																local1928 = Static3.method36(new Class10[] { Static150.aClass10_1549, local1647.aClass10_662, Static140.aClass10_1367 });
															} else {
																local1928 = Static3.method36(new Class10[] { Static150.aClass10_1549, local1647.aClass10_662, Static76.aClass10_776, Static8.method159(local24.anIntArray126[local289]) });
															}
															local755 = local112 + (local24.anInt1037 + 12) * local669;
															local859 = (local24.anInt1064 + 115) * local682 + local107;
															if (local24.anInt1077 == 0) {
																local1176.method532(local1928, local859, local755, local24.anInt1080, local24.aBoolean39 ? 0 : -1);
															} else if (local24.anInt1077 == 1) {
																local1176.method510(local1928, local859 + local24.anInt1089 / 2, local755, local24.anInt1080, local24.aBoolean39 ? 0 : -1);
															} else {
																local1176.method505(local1928, local859 + local24.anInt1089 - 1, local755, local24.anInt1080, local24.aBoolean39 ? 0 : -1);
															}
														}
														local289++;
													}
												}
											}
											@Pc(2221) int local2221;
											if (local24.anInt1090 == 8 && local24 == Static175.aClass23_14 && Static114.anInt2583 == Static159.anInt3397) {
												local294 = 0;
												local289 = 0;
												@Pc(2071) Class10 local2071 = local24.aClass10_500;
												@Pc(2073) Class2_Sub1_Sub4_Sub1_Sub1 local2073 = Static13.aClass2_Sub1_Sub4_Sub1_Sub1_2;
												local2071 = Static171.method2635(local24, local2071);
												@Pc(2091) Class10 local2091;
												while (local2071.method340() > 0) {
													local864 = local2071.method365(Static30.aClass10_377);
													if (local864 == -1) {
														local2091 = local2071;
														local2071 = Static63.aClass10_687;
													} else {
														local2091 = local2071.method353(0, local864);
														local2071 = local2071.method333(local864 + 4);
													}
													local859 = local2073.method514(local2091);
													local289 += local2073.anInt636 + 1;
													if (local859 > local294) {
														local294 = local859;
													}
												}
												local294 += 6;
												local289 += 7;
												local859 = local24.anInt1087 + local112 + 5;
												local864 = local24.anInt1089 + local107 - local294 - 5;
												if (local859 + local289 > arg5) {
													local859 = arg5 - local289;
												}
												if (local864 < local107 + 5) {
													local864 = local107 + 5;
												}
												if (local864 + local294 > arg8) {
													local864 = arg8 - local294;
												}
												Static172.method2026(local864, local859, local294, local289, 16777120);
												Static172.method2018(local864, local859, local294, local289, 0);
												local755 = local859 + local2073.anInt636 + 2;
												local2071 = local24.aClass10_500;
												local2071 = Static171.method2635(local24, local2071);
												while (local2071.method340() > 0) {
													local2221 = local2071.method365(Static30.aClass10_377);
													if (local2221 == -1) {
														local2091 = local2071;
														local2071 = Static63.aClass10_687;
													} else {
														local2091 = local2071.method353(0, local2221);
														local2071 = local2071.method333(local2221 + 4);
													}
													local2073.method532(local2091, local864 + 3, local755, 0, -1);
													local755 += local2073.anInt636 + 1;
												}
											}
											if (local24.anInt1090 == 9) {
												if (local24.anInt1050 == 1) {
													Static172.method2015(local107, local112, local107 + local24.anInt1089, local112 + local24.anInt1087, local24.anInt1080);
												} else {
													local289 = local24.anInt1087 >= 0 ? local24.anInt1087 : -local24.anInt1087;
													local294 = local24.anInt1089 >= 0 ? local24.anInt1089 : -local24.anInt1089;
													local669 = local294;
													if (local289 > local294) {
														local669 = local289;
													}
													if (local669 != 0) {
														local682 = (local24.anInt1089 << 16) / local669;
														@Pc(2341) int local2341 = local107 - arg1;
														local692 = (local24.anInt1087 << 16) / local669;
														if (local692 > local682) {
															local692 = -local692;
														} else {
															local682 = -local682;
														}
														local755 = local24.anInt1050 * local682 >> 17;
														local864 = local24.anInt1050 * local692 >> 17;
														local912 = local112 - arg2;
														local859 = local692 * local24.anInt1050 + 1 >> 17;
														@Pc(2397) int local2397 = local24.anInt1089 + local2341 - local859;
														local934 = local2341 - local859;
														@Pc(2410) int local2410 = local2341 + local24.anInt1089 + local864;
														local2221 = local24.anInt1050 * local682 + 1 >> 17;
														@Pc(2424) int local2424 = local912 - local2221;
														@Pc(2432) int local2432 = local912 + local24.anInt1087 - local2221;
														local914 = local864 + local2341;
														@Pc(2440) int local2440 = local912 + local755;
														@Pc(2447) int local2447 = local24.anInt1087 + local912 + local755;
														Static125.method2040(local914, local934, local2397);
														Static125.method2036(local2440, local2424, local2432, local914, local934, local2397, local24.anInt1080);
														Static125.method2040(local914, local2397, local2410);
														Static125.method2036(local2440, local2432, local2447, local914, local2397, local2410, local24.anInt1080);
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

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(Z)V")
	public static void method671() {
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(42) int local42;
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(72) int local72;
		if (Static55.anInt1420 == 111) {
			local14 = Static75.aClass2_Sub11_Sub1_1.method1461();
			local22 = (local14 >> 4 & 0x7) + Static154.anInt3325;
			local28 = (local14 & 0x7) + Static9.anInt253;
			local32 = Static75.aClass2_Sub11_Sub1_1.method1456();
			local36 = Static75.aClass2_Sub11_Sub1_1.method1461();
			local42 = local36 >> 4 & 0xF;
			local46 = local36 & 0x7;
			local50 = Static75.aClass2_Sub11_Sub1_1.method1461();
			if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
				local72 = local42 + 1;
				if (Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0] >= local22 - local72 && local22 + local72 >= Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0] && Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0] >= local28 - local72 && local28 + local72 >= Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0] && Static180.anInt3818 != 0 && local46 > 0 && Static48.anInt1160 < 50) {
					Static59.anIntArray169[Static48.anInt1160] = local32;
					Static110.anIntArray256[Static48.anInt1160] = local46;
					Static28.anIntArray62[Static48.anInt1160] = local50;
					Static26.aClass57Array1[Static48.anInt1160] = null;
					Static106.anIntArray250[Static48.anInt1160] = local42 + (local22 << 16) + (local28 << 8);
					Static48.anInt1160++;
				}
			}
		}
		if (Static55.anInt1420 == 88) {
			local14 = Static75.aClass2_Sub11_Sub1_1.method1461();
			local22 = (local14 >> 4 & 0x7) + Static154.anInt3325;
			local28 = (local14 & 0x7) + Static9.anInt253;
			local32 = Static75.aClass2_Sub11_Sub1_1.method1456();
			local36 = Static75.aClass2_Sub11_Sub1_1.method1461();
			local42 = Static75.aClass2_Sub11_Sub1_1.method1456();
			if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
				local22 = local22 * 128 + 64;
				local28 = local28 * 128 + 64;
				@Pc(241) Class2_Sub1_Sub3_Sub1 local241 = new Class2_Sub1_Sub3_Sub1(local32, Static56.anInt1432, local22, local28, Static178.method2702(local28, local22, Static56.anInt1432) - local36, local42, Static14.anInt386);
				Static177.aClass12_16.method382(local241);
			}
			return;
		}
		@Pc(301) Class2_Sub1_Sub3_Sub4 local301;
		if (Static55.anInt1420 == 150) {
			local14 = Static75.aClass2_Sub11_Sub1_1.method1443();
			local22 = Static75.aClass2_Sub11_Sub1_1.method1461();
			local28 = Static154.anInt3325 + (local22 >> 4 & 0x7);
			local32 = Static9.anInt253 + (local22 & 0x7);
			if (local28 >= 0 && local32 >= 0 && local28 < 104 && local32 < 104) {
				@Pc(294) Class12 local294 = Static132.aClass12ArrayArrayArray1[Static56.anInt1432][local28][local32];
				if (local294 != null) {
					for (local301 = (Class2_Sub1_Sub3_Sub4) local294.method384(); local301 != null; local301 = (Class2_Sub1_Sub3_Sub4) local294.method381()) {
						if (local301.anInt1187 == (local14 & 0x7FFF)) {
							local301.method2705();
							break;
						}
					}
					if (local294.method384() == null) {
						Static132.aClass12ArrayArrayArray1[Static56.anInt1432][local28][local32] = null;
					}
					Static149.method2286(local32, local28);
				}
			}
		} else if (Static55.anInt1420 == 15) {
			local14 = Static75.aClass2_Sub11_Sub1_1.method1462();
			local22 = Static154.anInt3325 + (local14 >> 4 & 0x7);
			local28 = Static9.anInt253 + (local14 & 0x7);
			local32 = Static75.aClass2_Sub11_Sub1_1.method1475();
			local36 = Static75.aClass2_Sub11_Sub1_1.method1456();
			if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
				local301 = new Class2_Sub1_Sub3_Sub4();
				local301.anInt1187 = local36;
				local301.anInt1183 = local32;
				if (Static132.aClass12ArrayArrayArray1[Static56.anInt1432][local22][local28] == null) {
					Static132.aClass12ArrayArrayArray1[Static56.anInt1432][local22][local28] = new Class12();
				}
				Static132.aClass12ArrayArrayArray1[Static56.anInt1432][local22][local28].method382(local301);
				Static149.method2286(local28, local22);
			}
		} else if (Static55.anInt1420 == 13) {
			local14 = Static75.aClass2_Sub11_Sub1_1.method1461();
			local22 = local14 >> 2;
			local32 = Static93.anIntArray227[local22];
			local36 = Static75.aClass2_Sub11_Sub1_1.method1475();
			local28 = local14 & 0x3;
			local42 = Static75.aClass2_Sub11_Sub1_1.method1461();
			local50 = (local42 & 0x7) + Static9.anInt253;
			local46 = (local42 >> 4 & 0x7) + Static154.anInt3325;
			if (local46 >= 0 && local50 >= 0 && local46 < 104 && local50 < 104) {
				Static118.method1907(local46, local36, -1, 0, Static56.anInt1432, local28, local32, local50, local22);
			}
		} else {
			@Pc(556) int local556;
			@Pc(564) int local564;
			@Pc(568) int local568;
			if (Static55.anInt1420 == 42) {
				local14 = Static75.aClass2_Sub11_Sub1_1.method1466();
				local22 = Static154.anInt3325 + (local14 >> 4 & 0x7);
				local28 = Static9.anInt253 + (local14 & 0x7);
				@Pc(532) byte local532 = Static75.aClass2_Sub11_Sub1_1.method1438();
				local36 = Static75.aClass2_Sub11_Sub1_1.method1456();
				local42 = Static75.aClass2_Sub11_Sub1_1.method1459();
				@Pc(544) byte local544 = Static75.aClass2_Sub11_Sub1_1.method1487();
				local50 = Static75.aClass2_Sub11_Sub1_1.method1459();
				@Pc(552) byte local552 = Static75.aClass2_Sub11_Sub1_1.method1438();
				local556 = Static75.aClass2_Sub11_Sub1_1.method1456();
				@Pc(560) byte local560 = Static75.aClass2_Sub11_Sub1_1.method1438();
				local564 = Static75.aClass2_Sub11_Sub1_1.method1461();
				local568 = local564 >> 2;
				@Pc(577) Class2_Sub1_Sub3_Sub2_Sub1 local577;
				if (Static14.anInt385 == local556) {
					local577 = Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1;
				} else {
					local577 = Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local556];
				}
				@Pc(587) int local587 = local564 & 0x3;
				@Pc(591) int local591 = Static93.anIntArray227[local568];
				if (local577 != null) {
					@Pc(597) Class2_Sub1_Sub10 local597 = Static62.method1106(local42);
					@Pc(611) int local611;
					@Pc(608) int local608;
					if (local587 == 1 || local587 == 3) {
						local608 = local597.anInt2225;
						local611 = local597.anInt2210;
					} else {
						local608 = local597.anInt2210;
						local611 = local597.anInt2225;
					}
					@Pc(625) int local625 = local22 + (local611 >> 1);
					@Pc(631) int local631 = (local608 >> 1) + local28;
					@Pc(639) int local639 = local28 + (local608 + 1 >> 1);
					@Pc(647) int local647 = (local611 + 1 >> 1) + local22;
					@Pc(651) int[][] local651 = Static162.anIntArrayArrayArray8[Static56.anInt1432];
					@Pc(660) int local660 = (local22 << 7) + (local611 << 6);
					@Pc(668) int local668 = (local28 << 7) + (local608 << 6);
					@Pc(696) int local696 = local651[local625][local631] + local651[local647][local631] + local651[local625][local639] + local651[local647][local639] >> 2;
					@Pc(706) Class2_Sub1_Sub3_Sub3 local706 = local597.method1574(local696, local660, local668, local568, local651, local587);
					if (local706 != null) {
						@Pc(713) byte local713;
						if (local544 < local552) {
							local713 = local552;
							local552 = local544;
							local544 = local713;
						}
						if (local560 > local532) {
							local713 = local560;
							local560 = local532;
							local532 = local713;
						}
						Static118.method1907(local22, -1, local50 + 1, local36 + 1, Static56.anInt1432, 0, local591, local28, 0);
						local577.anInt1353 = local608 * 64 + local28 * 128;
						local577.anInt1340 = local544 + local22;
						local577.anInt1343 = local36 + Static14.anInt386;
						local577.anInt1347 = local552 + local22;
						local577.anInt1330 = local28 + local560;
						local577.aClass2_Sub1_Sub3_Sub3_1 = local706;
						local577.anInt1345 = local22 * 128 + local611 * 64;
						local577.anInt1341 = local28 + local532;
						local577.anInt1342 = local696;
						local577.anInt1329 = local50 + Static14.anInt386;
					}
				}
			}
			if (Static55.anInt1420 == 11) {
				local14 = Static75.aClass2_Sub11_Sub1_1.method1461();
				local22 = (local14 >> 4 & 0x7) + Static154.anInt3325;
				local28 = Static9.anInt253 + (local14 & 0x7);
				local32 = Static75.aClass2_Sub11_Sub1_1.method1456();
				local36 = Static75.aClass2_Sub11_Sub1_1.method1456();
				local42 = Static75.aClass2_Sub11_Sub1_1.method1456();
				if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
					@Pc(854) Class12 local854 = Static132.aClass12ArrayArrayArray1[Static56.anInt1432][local22][local28];
					if (local854 != null) {
						for (@Pc(861) Class2_Sub1_Sub3_Sub4 local861 = (Class2_Sub1_Sub3_Sub4) local854.method384(); local861 != null; local861 = (Class2_Sub1_Sub3_Sub4) local854.method381()) {
							if ((local32 & 0x7FFF) == local861.anInt1187 && local36 == local861.anInt1183) {
								local861.anInt1183 = local42;
								break;
							}
						}
						Static149.method2286(local28, local22);
					}
				}
			} else if (Static55.anInt1420 == 5) {
				local14 = Static75.aClass2_Sub11_Sub1_1.method1443();
				local22 = Static75.aClass2_Sub11_Sub1_1.method1443();
				local28 = Static75.aClass2_Sub11_Sub1_1.method1460();
				local32 = (local28 >> 4 & 0x7) + Static154.anInt3325;
				local36 = (local28 & 0x7) + Static9.anInt253;
				local42 = Static75.aClass2_Sub11_Sub1_1.method1475();
				if (local32 >= 0 && local36 >= 0 && local32 < 104 && local36 < 104 && Static14.anInt385 != local14) {
					@Pc(950) Class2_Sub1_Sub3_Sub4 local950 = new Class2_Sub1_Sub3_Sub4();
					local950.anInt1187 = local42;
					local950.anInt1183 = local22;
					if (Static132.aClass12ArrayArrayArray1[Static56.anInt1432][local32][local36] == null) {
						Static132.aClass12ArrayArrayArray1[Static56.anInt1432][local32][local36] = new Class12();
					}
					Static132.aClass12ArrayArrayArray1[Static56.anInt1432][local32][local36].method382(local950);
					Static149.method2286(local36, local32);
				}
			} else if (Static55.anInt1420 == 9) {
				local14 = Static75.aClass2_Sub11_Sub1_1.method1461();
				local28 = (local14 & 0x7) + Static9.anInt253;
				local22 = (local14 >> 4 & 0x7) + Static154.anInt3325;
				local32 = local22 + Static75.aClass2_Sub11_Sub1_1.method1463();
				local36 = local28 + Static75.aClass2_Sub11_Sub1_1.method1463();
				local42 = Static75.aClass2_Sub11_Sub1_1.method1455();
				local46 = Static75.aClass2_Sub11_Sub1_1.method1456();
				local50 = Static75.aClass2_Sub11_Sub1_1.method1461() * 4;
				local72 = Static75.aClass2_Sub11_Sub1_1.method1461() * 4;
				local556 = Static75.aClass2_Sub11_Sub1_1.method1456();
				@Pc(1053) int local1053 = Static75.aClass2_Sub11_Sub1_1.method1456();
				local564 = Static75.aClass2_Sub11_Sub1_1.method1461();
				local568 = Static75.aClass2_Sub11_Sub1_1.method1461();
				if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104 && local32 >= 0 && local36 >= 0 && local32 < 104 && local36 < 104 && local46 != 65535) {
					local32 = local32 * 128 + 64;
					local22 = local22 * 128 + 64;
					local28 = local28 * 128 + 64;
					@Pc(1138) Class2_Sub1_Sub3_Sub5 local1138 = new Class2_Sub1_Sub3_Sub5(local46, Static56.anInt1432, local22, local28, Static178.method2702(local28, local22, Static56.anInt1432) - local50, Static14.anInt386 + local556, local1053 + Static14.anInt386, local564, local568, local42, local72);
					local36 = local36 * 128 + 64;
					local1138.method1306(local32, local36, Static178.method2702(local36, local32, Static56.anInt1432) - local72, Static14.anInt386 + local556);
					Static81.aClass12_6.method382(local1138);
				}
			} else if (Static55.anInt1420 == 76) {
				local14 = Static75.aClass2_Sub11_Sub1_1.method1460();
				local22 = local14 >> 2;
				local28 = local14 & 0x3;
				local32 = Static93.anIntArray227[local22];
				local36 = Static75.aClass2_Sub11_Sub1_1.method1461();
				local46 = (local36 & 0x7) + Static9.anInt253;
				local42 = (local36 >> 4 & 0x7) + Static154.anInt3325;
				if (local42 >= 0 && local46 >= 0 && local42 < 104 && local46 < 104) {
					Static118.method1907(local42, -1, -1, 0, Static56.anInt1432, local28, local32, local46, local22);
				}
			} else if (Static55.anInt1420 == 236) {
				local14 = Static75.aClass2_Sub11_Sub1_1.method1466();
				local28 = (local14 & 0x7) + Static9.anInt253;
				local22 = (local14 >> 4 & 0x7) + Static154.anInt3325;
				local32 = Static75.aClass2_Sub11_Sub1_1.method1461();
				local36 = local32 >> 2;
				local46 = Static93.anIntArray227[local36];
				local42 = local32 & 0x3;
				local50 = Static75.aClass2_Sub11_Sub1_1.method1456();
				if (local22 >= 0 && local28 >= 0 && local22 < 103 && local28 < 103) {
					if (local46 == 0) {
						@Pc(1293) Class71 local1293 = Static180.aClass60_1.method1790(Static56.anInt1432, local22, local28);
						if (local1293 != null) {
							local556 = local1293.anInt3170 >> 14 & 0x7FFF;
							if (local36 == 2) {
								local1293.aClass2_Sub1_Sub3_3 = new Class2_Sub1_Sub3_Sub6(local556, 2, local42 + 4, Static56.anInt1432, local22, local28, local50, false, local1293.aClass2_Sub1_Sub3_3);
								local1293.aClass2_Sub1_Sub3_4 = new Class2_Sub1_Sub3_Sub6(local556, 2, local42 + 1 & 0x3, Static56.anInt1432, local22, local28, local50, false, local1293.aClass2_Sub1_Sub3_4);
							} else {
								local1293.aClass2_Sub1_Sub3_3 = new Class2_Sub1_Sub3_Sub6(local556, local36, local42, Static56.anInt1432, local22, local28, local50, false, local1293.aClass2_Sub1_Sub3_3);
							}
						}
					}
					if (local46 == 1) {
						@Pc(1369) Class80 local1369 = Static180.aClass60_1.method1820(Static56.anInt1432, local22, local28);
						if (local1369 != null) {
							local556 = local1369.anInt3387 >> 14 & 0x7FFF;
							if (local36 == 4 || local36 == 5) {
								local1369.aClass2_Sub1_Sub3_8 = new Class2_Sub1_Sub3_Sub6(local556, 4, local42, Static56.anInt1432, local22, local28, local50, false, local1369.aClass2_Sub1_Sub3_8);
							} else if (local36 == 6) {
								local1369.aClass2_Sub1_Sub3_8 = new Class2_Sub1_Sub3_Sub6(local556, 4, local42 + 4, Static56.anInt1432, local22, local28, local50, false, local1369.aClass2_Sub1_Sub3_8);
							} else if (local36 == 7) {
								local1369.aClass2_Sub1_Sub3_8 = new Class2_Sub1_Sub3_Sub6(local556, 4, (local42 + 2 & 0x3) + 4, Static56.anInt1432, local22, local28, local50, false, local1369.aClass2_Sub1_Sub3_8);
							} else if (local36 == 8) {
								local1369.aClass2_Sub1_Sub3_8 = new Class2_Sub1_Sub3_Sub6(local556, 4, local42 + 4, Static56.anInt1432, local22, local28, local50, false, local1369.aClass2_Sub1_Sub3_8);
								local1369.aClass2_Sub1_Sub3_9 = new Class2_Sub1_Sub3_Sub6(local556, 4, (local42 + 2 & 0x3) + 4, Static56.anInt1432, local22, local28, local50, false, local1369.aClass2_Sub1_Sub3_9);
							}
						}
					}
					if (local46 == 2) {
						@Pc(1507) Class48 local1507 = Static180.aClass60_1.method1804(Static56.anInt1432, local22, local28);
						if (local36 == 11) {
							local36 = 10;
						}
						if (local1507 != null) {
							local1507.aClass2_Sub1_Sub3_1 = new Class2_Sub1_Sub3_Sub6(local1507.anInt1938 >> 14 & 0x7FFF, local36, local42, Static56.anInt1432, local22, local28, local50, false, local1507.aClass2_Sub1_Sub3_1);
						}
					}
					if (local46 == 3) {
						@Pc(1547) Class49 local1547 = Static180.aClass60_1.method1816(Static56.anInt1432, local22, local28);
						if (local1547 != null) {
							local1547.aClass2_Sub1_Sub3_2 = new Class2_Sub1_Sub3_Sub6(local1547.anInt2094 >> 14 & 0x7FFF, 22, local42, Static56.anInt1432, local22, local28, local50, false, local1547.aClass2_Sub1_Sub3_2);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "f", descriptor = "(I)V")
	public static void method672() {
		aClass29_18 = null;
		aClass10_400 = null;
		aClass10_393 = null;
		aClass10_395 = null;
		aClass10_397 = null;
		anIntArray66 = null;
		aClass10_399 = null;
		aClass10_394 = null;
		aClass10_398 = null;
		anIntArray65 = null;
		aClass10_396 = null;
		anIntArray64 = null;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!va", name = "A", descriptor = "Lclient!gf;")
	public static Class33 aClass33_13;

	@OriginalMember(owner = "client!va", name = "t", descriptor = "I")
	public static int anInt3991 = 0;

	@OriginalMember(owner = "client!va", name = "u", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1396 = Static170.method3101("(Y<)4col>");

	@OriginalMember(owner = "client!va", name = "w", descriptor = "[I")
	public static int[] anIntArray669 = new int[200];

	@OriginalMember(owner = "client!va", name = "z", descriptor = "I")
	public static int anInt3995 = -2;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(I)V")
	public static void method3033() {
		@Pc(5) Class48 local5 = Static139.aClass48_3;
		synchronized (Static139.aClass48_3) {
			Static136.anInt3480 = Static26.anInt713;
			Static73.anInt2181 = Static104.anInt2690;
			Static35.anInt1049 = Static72.anInt2141;
			Static87.anInt2539 = Static153.anInt3782;
			Static2.anInt80 = Static122.anInt3149;
			Static160.anInt3914 = Static73.anInt2179;
			Static168.aLong138 = Static86.aLong82;
			Static153.anInt3782 = 0;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!qh;Z)V")
	public static void method3034(@OriginalArg(0) Class3_Sub20 arg0, @OriginalArg(1) boolean arg1) {
		Static135.aClass23_13.method850(arg0);
		while (true) {
			@Pc(8) Class3_Sub20 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(30) Class3_Sub20[][] local30;
			@Pc(47) Class3_Sub20 local47;
			@Pc(245) int local245;
			@Pc(579) int local579;
			@Pc(584) int local584;
			@Pc(589) int local589;
			@Pc(906) Class25 local906;
			@Pc(1079) int local1079;
			@Pc(964) int local964;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(251) Class32 var11;
										@Pc(592) int var16;
										@Pc(601) int var17;
										@Pc(613) int var18;
										@Pc(335) int var20;
										@Pc(283) boolean var21;
										@Pc(787) Class3_Sub20 var32;
										while (true) {
											do {
												local8 = (Class3_Sub20) Static135.aClass23_13.method855();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean161);
											local17 = local8.anInt3338;
											local20 = local8.anInt3339;
											local23 = local8.anInt3341;
											local26 = local8.anInt3345;
											local30 = Static149.aClass3_Sub20ArrayArrayArray1[local23];
											if (!local8.aBoolean158) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local47 = Static149.aClass3_Sub20ArrayArrayArray1[local23 - 1][local17][local20];
													if (local47 != null && local47.aBoolean161) {
														continue;
													}
												}
												if (local17 <= Static145.anInt3635 && local17 > Static48.anInt1372) {
													local47 = local30[local17 - 1][local20];
													if (local47 != null && local47.aBoolean161 && (local47.aBoolean158 || (local8.anInt3342 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static145.anInt3635 && local17 < Static38.anInt1091 - 1) {
													local47 = local30[local17 + 1][local20];
													if (local47 != null && local47.aBoolean161 && (local47.aBoolean158 || (local8.anInt3342 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static46.anInt1291 && local20 > Static126.anInt3249) {
													local47 = local30[local17][local20 - 1];
													if (local47 != null && local47.aBoolean161 && (local47.aBoolean158 || (local8.anInt3342 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static46.anInt1291 && local20 < Static179.anInt4268 - 1) {
													local47 = local30[local17][local20 + 1];
													if (local47 != null && local47.aBoolean161 && (local47.aBoolean158 || (local8.anInt3342 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean158 = false;
											if (local8.aClass3_Sub20_1 != null) {
												local47 = local8.aClass3_Sub20_1;
												if (local47.aClass89_1 == null) {
													if (local47.aClass27_1 != null && !Static94.method2076(0, local17, local20)) {
														Static43.method1037(local47.aClass27_1, Static168.anInt4089, Static129.anInt3280, Static38.anInt1088, Static141.anInt3613, local17, local20);
													}
												} else if (!Static94.method2076(0, local17, local20)) {
													Static32.method796(local47.aClass89_1, 0, Static168.anInt4089, Static129.anInt3280, Static38.anInt1088, Static141.anInt3613, local17, local20);
												}
												@Pc(219) Class25 local219 = local47.aClass25_1;
												if (local219 != null) {
													local219.aClass3_Sub2_Sub1_1.method2763(0, Static168.anInt4089, Static129.anInt3280, Static38.anInt1088, Static141.anInt3613, local219.anInt1092 - Static34.anInt1037, local219.anInt1087 - Static125.anInt3217, local219.anInt1089 - Static76.anInt2272, local219.aLong36);
												}
												for (local245 = 0; local245 < local47.anInt3336; local245++) {
													var11 = local47.aClass32Array3[local245];
													if (var11 != null) {
														var11.aClass3_Sub2_Sub1_3.method2763(var11.anInt1443, Static168.anInt4089, Static129.anInt3280, Static38.anInt1088, Static141.anInt3613, var11.anInt1438 - Static34.anInt1037, var11.anInt1445 - Static125.anInt3217, var11.anInt1444 - Static76.anInt2272, var11.aLong49);
													}
												}
											}
											var21 = false;
											if (local8.aClass89_1 == null) {
												if (local8.aClass27_1 != null && !Static94.method2076(local26, local17, local20)) {
													var21 = true;
													Static43.method1037(local8.aClass27_1, Static168.anInt4089, Static129.anInt3280, Static38.anInt1088, Static141.anInt3613, local17, local20);
												}
											} else if (!Static94.method2076(local26, local17, local20)) {
												var21 = true;
												if (local8.aClass89_1.anInt4283 != 12345678 || Static163.aBoolean187 && local23 <= Static55.anInt1552) {
													Static32.method796(local8.aClass89_1, local26, Static168.anInt4089, Static129.anInt3280, Static38.anInt1088, Static141.anInt3613, local17, local20);
												}
											}
											var20 = 0;
											local245 = 0;
											@Pc(340) Class25 local340 = local8.aClass25_1;
											@Pc(343) Class55 local343 = local8.aClass55_1;
											if (local340 != null || local343 != null) {
												if (Static145.anInt3635 == local17) {
													var20++;
												} else if (Static145.anInt3635 < local17) {
													var20 += 2;
												}
												if (Static46.anInt1291 == local20) {
													var20 += 3;
												} else if (Static46.anInt1291 > local20) {
													var20 += 6;
												}
												local245 = Static27.anIntArray175[var20];
												local8.anInt3335 = Static33.anIntArray188[var20];
											}
											if (local340 != null) {
												if ((local340.anInt1093 & Static141.anIntArray608[var20]) == 0) {
													local8.anInt3344 = 0;
												} else if (local340.anInt1093 == 16) {
													local8.anInt3344 = 3;
													local8.anInt3340 = Static161.anIntArray657[var20];
													local8.anInt3337 = 3 - local8.anInt3340;
												} else if (local340.anInt1093 == 32) {
													local8.anInt3344 = 6;
													local8.anInt3340 = Static155.anIntArray646[var20];
													local8.anInt3337 = 6 - local8.anInt3340;
												} else if (local340.anInt1093 == 64) {
													local8.anInt3344 = 12;
													local8.anInt3340 = Static151.anIntArray629[var20];
													local8.anInt3337 = 12 - local8.anInt3340;
												} else {
													local8.anInt3344 = 9;
													local8.anInt3340 = Static95.anIntArray453[var20];
													local8.anInt3337 = 9 - local8.anInt3340;
												}
												if ((local340.anInt1093 & local245) != 0 && !Static2.method65(local26, local17, local20, local340.anInt1093)) {
													local340.aClass3_Sub2_Sub1_1.method2763(0, Static168.anInt4089, Static129.anInt3280, Static38.anInt1088, Static141.anInt3613, local340.anInt1092 - Static34.anInt1037, local340.anInt1087 - Static125.anInt3217, local340.anInt1089 - Static76.anInt2272, local340.aLong36);
												}
												if ((local340.anInt1090 & local245) != 0 && !Static2.method65(local26, local17, local20, local340.anInt1090)) {
													local340.aClass3_Sub2_Sub1_2.method2763(0, Static168.anInt4089, Static129.anInt3280, Static38.anInt1088, Static141.anInt3613, local340.anInt1092 - Static34.anInt1037, local340.anInt1087 - Static125.anInt3217, local340.anInt1089 - Static76.anInt2272, local340.aLong36);
												}
											}
											if (local343 != null && !Static60.method1401(local26, local17, local20, local343.aClass3_Sub2_Sub1_7.aShort36)) {
												if ((local343.anInt2655 & local245) != 0) {
													local343.aClass3_Sub2_Sub1_7.method2763(0, Static168.anInt4089, Static129.anInt3280, Static38.anInt1088, Static141.anInt3613, local343.anInt2664 + local343.anInt2659 - Static34.anInt1037, local343.anInt2665 - Static125.anInt3217, local343.anInt2660 + local343.anInt2662 - Static76.anInt2272, local343.aLong89);
												} else if (local343.anInt2655 == 256) {
													local579 = local343.anInt2664 - Static34.anInt1037;
													local584 = local343.anInt2665 - Static125.anInt3217;
													local589 = local343.anInt2660 - Static76.anInt2272;
													var16 = local343.anInt2666;
													if (var16 == 1 || var16 == 2) {
														var17 = -local579;
													} else {
														var17 = local579;
													}
													if (var16 == 2 || var16 == 3) {
														var18 = -local589;
													} else {
														var18 = local589;
													}
													if (var18 < var17) {
														local343.aClass3_Sub2_Sub1_7.method2763(0, Static168.anInt4089, Static129.anInt3280, Static38.anInt1088, Static141.anInt3613, local579 + local343.anInt2659, local584, local589 + local343.anInt2662, local343.aLong89);
													} else if (local343.aClass3_Sub2_Sub1_8 != null) {
														local343.aClass3_Sub2_Sub1_8.method2763(0, Static168.anInt4089, Static129.anInt3280, Static38.anInt1088, Static141.anInt3613, local579, local584, local589, local343.aLong89);
													}
												}
											}
											if (var21) {
												@Pc(660) Class84 local660 = local8.aClass84_1;
												if (local660 != null) {
													local660.aClass3_Sub2_Sub1_9.method2763(0, Static168.anInt4089, Static129.anInt3280, Static38.anInt1088, Static141.anInt3613, local660.anInt4187 - Static34.anInt1037, local660.anInt4188 - Static125.anInt3217, local660.anInt4186 - Static76.anInt2272, local660.aLong143);
												}
												@Pc(687) Class35 local687 = local8.aClass35_1;
												if (local687 != null && local687.anInt1560 == 0) {
													if (local687.aClass3_Sub2_Sub1_5 != null) {
														local687.aClass3_Sub2_Sub1_5.method2763(0, Static168.anInt4089, Static129.anInt3280, Static38.anInt1088, Static141.anInt3613, local687.anInt1551 - Static34.anInt1037, local687.anInt1558 - Static125.anInt3217, local687.anInt1553 - Static76.anInt2272, local687.aLong51);
													}
													if (local687.aClass3_Sub2_Sub1_6 != null) {
														local687.aClass3_Sub2_Sub1_6.method2763(0, Static168.anInt4089, Static129.anInt3280, Static38.anInt1088, Static141.anInt3613, local687.anInt1551 - Static34.anInt1037, local687.anInt1558 - Static125.anInt3217, local687.anInt1553 - Static76.anInt2272, local687.aLong51);
													}
													if (local687.aClass3_Sub2_Sub1_4 != null) {
														local687.aClass3_Sub2_Sub1_4.method2763(0, Static168.anInt4089, Static129.anInt3280, Static38.anInt1088, Static141.anInt3613, local687.anInt1551 - Static34.anInt1037, local687.anInt1558 - Static125.anInt3217, local687.anInt1553 - Static76.anInt2272, local687.aLong51);
													}
												}
											}
											local579 = local8.anInt3342;
											if (local579 != 0) {
												if (local17 < Static145.anInt3635 && (local579 & 0x4) != 0) {
													var32 = local30[local17 + 1][local20];
													if (var32 != null && var32.aBoolean161) {
														Static135.aClass23_13.method850(var32);
													}
												}
												if (local20 < Static46.anInt1291 && (local579 & 0x2) != 0) {
													var32 = local30[local17][local20 + 1];
													if (var32 != null && var32.aBoolean161) {
														Static135.aClass23_13.method850(var32);
													}
												}
												if (local17 > Static145.anInt3635 && (local579 & 0x1) != 0) {
													var32 = local30[local17 - 1][local20];
													if (var32 != null && var32.aBoolean161) {
														Static135.aClass23_13.method850(var32);
													}
												}
												if (local20 > Static46.anInt1291 && (local579 & 0x8) != 0) {
													var32 = local30[local17][local20 - 1];
													if (var32 != null && var32.aBoolean161) {
														Static135.aClass23_13.method850(var32);
													}
												}
											}
											break;
										}
										if (local8.anInt3344 != 0) {
											var21 = true;
											for (var20 = 0; var20 < local8.anInt3336; var20++) {
												if (local8.aClass32Array3[var20].anInt1437 != Static38.anInt1098 && (local8.anIntArray576[var20] & local8.anInt3344) == local8.anInt3340) {
													var21 = false;
													break;
												}
											}
											if (var21) {
												local906 = local8.aClass25_1;
												if (!Static2.method65(local26, local17, local20, local906.anInt1093)) {
													local906.aClass3_Sub2_Sub1_1.method2763(0, Static168.anInt4089, Static129.anInt3280, Static38.anInt1088, Static141.anInt3613, local906.anInt1092 - Static34.anInt1037, local906.anInt1087 - Static125.anInt3217, local906.anInt1089 - Static76.anInt2272, local906.aLong36);
												}
												local8.anInt3344 = 0;
											}
										}
										if (!local8.aBoolean159) {
											break;
										}
										try {
											@Pc(944) int local944 = local8.anInt3336;
											local8.aBoolean159 = false;
											var20 = 0;
											label558: for (local245 = 0; local245 < local944; local245++) {
												var11 = local8.aClass32Array3[local245];
												if (var11.anInt1437 != Static38.anInt1098) {
													for (local964 = var11.anInt1450; local964 <= var11.anInt1439; local964++) {
														for (local579 = var11.anInt1449; local579 <= var11.anInt1447; local579++) {
															var32 = local30[local964][local579];
															if (var32.aBoolean158) {
																local8.aBoolean159 = true;
																continue label558;
															}
															if (var32.anInt3344 != 0) {
																local589 = 0;
																if (local964 > var11.anInt1450) {
																	local589++;
																}
																if (local964 < var11.anInt1439) {
																	local589 += 4;
																}
																if (local579 > var11.anInt1449) {
																	local589 += 8;
																}
																if (local579 < var11.anInt1447) {
																	local589 += 2;
																}
																if ((local589 & var32.anInt3344) == local8.anInt3337) {
																	local8.aBoolean159 = true;
																	continue label558;
																}
															}
														}
													}
													Static127.aClass32Array2[var20++] = var11;
													local579 = Static145.anInt3635 - var11.anInt1450;
													local584 = var11.anInt1439 - Static145.anInt3635;
													if (local584 > local579) {
														local579 = local584;
													}
													local589 = Static46.anInt1291 - var11.anInt1449;
													var16 = var11.anInt1447 - Static46.anInt1291;
													if (var16 > local589) {
														var11.anInt1451 = local579 + var16;
													} else {
														var11.anInt1451 = local579 + local589;
													}
												}
											}
											while (var20 > 0) {
												local1079 = -50;
												local964 = -1;
												@Pc(1088) Class32 local1088;
												for (local579 = 0; local579 < var20; local579++) {
													local1088 = Static127.aClass32Array2[local579];
													if (local1088.anInt1437 != Static38.anInt1098) {
														if (local1088.anInt1451 > local1079) {
															local1079 = local1088.anInt1451;
															local964 = local579;
														} else if (local1088.anInt1451 == local1079) {
															local589 = local1088.anInt1438 - Static34.anInt1037;
															var16 = local1088.anInt1444 - Static76.anInt2272;
															var17 = Static127.aClass32Array2[local964].anInt1438 - Static34.anInt1037;
															var18 = Static127.aClass32Array2[local964].anInt1444 - Static76.anInt2272;
															if (local589 * local589 + var16 * var16 > var17 * var17 + var18 * var18) {
																local964 = local579;
															}
														}
													}
												}
												if (local964 == -1) {
													break;
												}
												local1088 = Static127.aClass32Array2[local964];
												local1088.anInt1437 = Static38.anInt1098;
												if (!Static93.method2071(local26, local1088.anInt1450, local1088.anInt1439, local1088.anInt1449, local1088.anInt1447, local1088.aClass3_Sub2_Sub1_3.aShort36)) {
													local1088.aClass3_Sub2_Sub1_3.method2763(local1088.anInt1443, Static168.anInt4089, Static129.anInt3280, Static38.anInt1088, Static141.anInt3613, local1088.anInt1438 - Static34.anInt1037, local1088.anInt1445 - Static125.anInt3217, local1088.anInt1444 - Static76.anInt2272, local1088.aLong49);
												}
												for (local589 = local1088.anInt1450; local589 <= local1088.anInt1439; local589++) {
													for (var16 = local1088.anInt1449; var16 <= local1088.anInt1447; var16++) {
														@Pc(1212) Class3_Sub20 local1212 = local30[local589][var16];
														if (local1212.anInt3344 != 0) {
															Static135.aClass23_13.method850(local1212);
														} else if ((local589 != local17 || var16 != local20) && local1212.aBoolean161) {
															Static135.aClass23_13.method850(local1212);
														}
													}
												}
											}
											if (!local8.aBoolean159) {
												break;
											}
										} catch (@Pc(1250) Exception local1250) {
											local8.aBoolean159 = false;
											break;
										}
									}
								} while (!local8.aBoolean161);
							} while (local8.anInt3344 != 0);
							if (local17 > Static145.anInt3635 || local17 <= Static48.anInt1372) {
								break;
							}
							local47 = local30[local17 - 1][local20];
						} while (local47 != null && local47.aBoolean161);
						if (local17 < Static145.anInt3635 || local17 >= Static38.anInt1091 - 1) {
							break;
						}
						local47 = local30[local17 + 1][local20];
					} while (local47 != null && local47.aBoolean161);
					if (local20 > Static46.anInt1291 || local20 <= Static126.anInt3249) {
						break;
					}
					local47 = local30[local17][local20 - 1];
				} while (local47 != null && local47.aBoolean161);
				if (local20 < Static46.anInt1291 || local20 >= Static179.anInt4268 - 1) {
					break;
				}
				local47 = local30[local17][local20 + 1];
			} while (local47 != null && local47.aBoolean161);
			local8.aBoolean161 = false;
			Static150.anInt3718--;
			@Pc(1354) Class35 local1354 = local8.aClass35_1;
			if (local1354 != null && local1354.anInt1560 != 0) {
				if (local1354.aClass3_Sub2_Sub1_5 != null) {
					local1354.aClass3_Sub2_Sub1_5.method2763(0, Static168.anInt4089, Static129.anInt3280, Static38.anInt1088, Static141.anInt3613, local1354.anInt1551 - Static34.anInt1037, local1354.anInt1558 - Static125.anInt3217 - local1354.anInt1560, local1354.anInt1553 - Static76.anInt2272, local1354.aLong51);
				}
				if (local1354.aClass3_Sub2_Sub1_6 != null) {
					local1354.aClass3_Sub2_Sub1_6.method2763(0, Static168.anInt4089, Static129.anInt3280, Static38.anInt1088, Static141.anInt3613, local1354.anInt1551 - Static34.anInt1037, local1354.anInt1558 - Static125.anInt3217 - local1354.anInt1560, local1354.anInt1553 - Static76.anInt2272, local1354.aLong51);
				}
				if (local1354.aClass3_Sub2_Sub1_4 != null) {
					local1354.aClass3_Sub2_Sub1_4.method2763(0, Static168.anInt4089, Static129.anInt3280, Static38.anInt1088, Static141.anInt3613, local1354.anInt1551 - Static34.anInt1037, local1354.anInt1558 - Static125.anInt3217 - local1354.anInt1560, local1354.anInt1553 - Static76.anInt2272, local1354.aLong51);
				}
			}
			if (local8.anInt3335 != 0) {
				@Pc(1449) Class55 local1449 = local8.aClass55_1;
				if (local1449 != null && !Static60.method1401(local26, local17, local20, local1449.aClass3_Sub2_Sub1_7.aShort36)) {
					if ((local1449.anInt2655 & local8.anInt3335) != 0) {
						local1449.aClass3_Sub2_Sub1_7.method2763(0, Static168.anInt4089, Static129.anInt3280, Static38.anInt1088, Static141.anInt3613, local1449.anInt2664 + local1449.anInt2659 - Static34.anInt1037, local1449.anInt2665 - Static125.anInt3217, local1449.anInt2660 + local1449.anInt2662 - Static76.anInt2272, local1449.aLong89);
					} else if (local1449.anInt2655 == 256) {
						local245 = local1449.anInt2664 - Static34.anInt1037;
						local1079 = local1449.anInt2665 - Static125.anInt3217;
						local964 = local1449.anInt2660 - Static76.anInt2272;
						local579 = local1449.anInt2666;
						if (local579 == 1 || local579 == 2) {
							local584 = -local245;
						} else {
							local584 = local245;
						}
						if (local579 == 2 || local579 == 3) {
							local589 = -local964;
						} else {
							local589 = local964;
						}
						if (local589 >= local584) {
							local1449.aClass3_Sub2_Sub1_7.method2763(0, Static168.anInt4089, Static129.anInt3280, Static38.anInt1088, Static141.anInt3613, local245 + local1449.anInt2659, local1079, local964 + local1449.anInt2662, local1449.aLong89);
						} else if (local1449.aClass3_Sub2_Sub1_8 != null) {
							local1449.aClass3_Sub2_Sub1_8.method2763(0, Static168.anInt4089, Static129.anInt3280, Static38.anInt1088, Static141.anInt3613, local245, local1079, local964, local1449.aLong89);
						}
					}
				}
				local906 = local8.aClass25_1;
				if (local906 != null) {
					if ((local906.anInt1090 & local8.anInt3335) != 0 && !Static2.method65(local26, local17, local20, local906.anInt1090)) {
						local906.aClass3_Sub2_Sub1_2.method2763(0, Static168.anInt4089, Static129.anInt3280, Static38.anInt1088, Static141.anInt3613, local906.anInt1092 - Static34.anInt1037, local906.anInt1087 - Static125.anInt3217, local906.anInt1089 - Static76.anInt2272, local906.aLong36);
					}
					if ((local906.anInt1093 & local8.anInt3335) != 0 && !Static2.method65(local26, local17, local20, local906.anInt1093)) {
						local906.aClass3_Sub2_Sub1_1.method2763(0, Static168.anInt4089, Static129.anInt3280, Static38.anInt1088, Static141.anInt3613, local906.anInt1092 - Static34.anInt1037, local906.anInt1087 - Static125.anInt3217, local906.anInt1089 - Static76.anInt2272, local906.aLong36);
					}
				}
			}
			@Pc(1669) Class3_Sub20 local1669;
			if (local23 < Static7.anInt228 - 1) {
				local1669 = Static149.aClass3_Sub20ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1669 != null && local1669.aBoolean161) {
					Static135.aClass23_13.method850(local1669);
				}
			}
			if (local17 < Static145.anInt3635) {
				local1669 = local30[local17 + 1][local20];
				if (local1669 != null && local1669.aBoolean161) {
					Static135.aClass23_13.method850(local1669);
				}
			}
			if (local20 < Static46.anInt1291) {
				local1669 = local30[local17][local20 + 1];
				if (local1669 != null && local1669.aBoolean161) {
					Static135.aClass23_13.method850(local1669);
				}
			}
			if (local17 > Static145.anInt3635) {
				local1669 = local30[local17 - 1][local20];
				if (local1669 != null && local1669.aBoolean161) {
					Static135.aClass23_13.method850(local1669);
				}
			}
			if (local20 > Static46.anInt1291) {
				local1669 = local30[local17][local20 - 1];
				if (local1669 != null && local1669.aBoolean161) {
					Static135.aClass23_13.method850(local1669);
				}
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "d", descriptor = "(I)V")
	public static void method3035() {
		aClass33_13 = null;
		anIntArray669 = null;
		aClass28_1396 = null;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!db;III)V")
	public static void method3036(@OriginalArg(0) Class3_Sub2_Sub1_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((arg2 & 0x200) != 0) {
			arg0.anInt1798 = Static18.aClass3_Sub8_Sub1_1.method1505();
			arg0.anInt1818 = Static18.aClass3_Sub8_Sub1_1.method1505();
			arg0.anInt1806 = Static18.aClass3_Sub8_Sub1_1.method1525();
			arg0.anInt1834 = Static18.aClass3_Sub8_Sub1_1.method1535();
			arg0.anInt1794 = Static18.aClass3_Sub8_Sub1_1.method1549() + Static14.anInt481;
			arg0.anInt1840 = Static18.aClass3_Sub8_Sub1_1.method1517() + Static14.anInt481;
			arg0.anInt1820 = Static18.aClass3_Sub8_Sub1_1.method1525();
			arg0.anInt1808 = 0;
			arg0.anInt1783 = 1;
		}
		@Pc(65) int local65;
		@Pc(69) int local69;
		if ((arg2 & 0x400) != 0) {
			local65 = Static18.aClass3_Sub8_Sub1_1.method1545();
			local69 = Static18.aClass3_Sub8_Sub1_1.method1525();
			arg0.method1432(local69, Static14.anInt481, local65);
		}
		if ((arg2 & 0x40) != 0) {
			local65 = Static18.aClass3_Sub8_Sub1_1.method1517();
			if (local65 == 65535) {
				local65 = -1;
			}
			local69 = Static18.aClass3_Sub8_Sub1_1.method1505();
			Static76.method1740(local65, local69, arg0);
		}
		if ((arg2 & 0x20) != 0) {
			arg0.anInt1796 = Static18.aClass3_Sub8_Sub1_1.method1527();
			if (arg0.anInt1796 == 65535) {
				arg0.anInt1796 = -1;
			}
		}
		if ((arg2 & 0x10) != 0) {
			local65 = Static18.aClass3_Sub8_Sub1_1.method1545();
			local69 = Static18.aClass3_Sub8_Sub1_1.method1505();
			arg0.method1432(local69, Static14.anInt481, local65);
			arg0.anInt1807 = Static14.anInt481 + 300;
			arg0.anInt1803 = Static18.aClass3_Sub8_Sub1_1.method1535();
		}
		if ((arg2 & 0x80) != 0) {
			arg0.aClass28_554 = Static18.aClass3_Sub8_Sub1_1.method1516();
			if (arg0.aClass28_554.method917(0) == 126) {
				arg0.aClass28_554 = arg0.aClass28_554.method905(1);
				Static51.method1192(arg0.aClass28_296, 2, arg0.aClass28_554);
			} else if (arg0 == Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1) {
				Static51.method1192(arg0.aClass28_296, 2, arg0.aClass28_554);
			}
			arg0.anInt1819 = 0;
			arg0.anInt1829 = 150;
			arg0.anInt1785 = 0;
		}
		if ((arg2 & 0x1) != 0) {
			arg0.anInt1811 = Static18.aClass3_Sub8_Sub1_1.method1510();
			arg0.anInt1826 = Static18.aClass3_Sub8_Sub1_1.method1527();
		}
		if ((arg2 & 0x100) != 0) {
			arg0.anInt1790 = Static18.aClass3_Sub8_Sub1_1.method1527();
			local65 = Static18.aClass3_Sub8_Sub1_1.method1536();
			arg0.anInt1828 = 0;
			arg0.anInt1801 = Static14.anInt481 + (local65 & 0xFFFF);
			if (arg0.anInt1790 == 65535) {
				arg0.anInt1790 = -1;
			}
			arg0.anInt1824 = local65 >> 16;
			arg0.anInt1838 = 0;
			if (Static14.anInt481 < arg0.anInt1801) {
				arg0.anInt1838 = -1;
			}
		}
		if ((arg2 & 0x8) != 0) {
			local65 = Static18.aClass3_Sub8_Sub1_1.method1510();
			local69 = Static18.aClass3_Sub8_Sub1_1.method1525();
			@Pc(280) int local280 = Static18.aClass3_Sub8_Sub1_1.method1535();
			@Pc(283) int local283 = Static18.aClass3_Sub8_Sub1_1.anInt1948;
			if (arg0.aClass28_296 != null && arg0.aClass76_1 != null) {
				@Pc(294) long local294 = arg0.aClass28_296.method924();
				@Pc(296) boolean local296 = false;
				if (local69 <= 1) {
					for (@Pc(301) int local301 = 0; local301 < Static4.anInt128; local301++) {
						if (local294 == Static21.aLongArray3[local301]) {
							local296 = true;
							break;
						}
					}
				}
				if (!local296 && Static140.anInt3590 == 0) {
					Static16.aClass3_Sub8_1.anInt1948 = 0;
					Static18.aClass3_Sub8_Sub1_1.method1552(Static16.aClass3_Sub8_1.aByteArray19, local280);
					Static16.aClass3_Sub8_1.anInt1948 = 0;
					@Pc(339) Class28 local339 = Static10.method1786(Static30.method788(Static16.aClass3_Sub8_1).method940());
					arg0.aClass28_554 = local339.method915();
					arg0.anInt1829 = 150;
					arg0.anInt1785 = local65 >> 8;
					arg0.anInt1819 = local65 & 0xFF;
					if (local69 == 2 || local69 == 3) {
						Static51.method1192(Static4.method96(new Class28[] { Static164.aClass28_1389, arg0.aClass28_296 }), 1, local339);
					} else if (local69 == 1) {
						Static51.method1192(Static4.method96(new Class28[] { Static132.aClass28_1097, arg0.aClass28_296 }), 1, local339);
					} else {
						Static51.method1192(arg0.aClass28_296, 2, local339);
					}
				}
			}
			Static18.aClass3_Sub8_Sub1_1.anInt1948 = local283 + local280;
		}
		if ((arg2 & 0x4) == 0) {
			return;
		}
		local69 = Static18.aClass3_Sub8_Sub1_1.method1525();
		@Pc(439) byte[] local439 = new byte[local69];
		@Pc(444) Class3_Sub8 local444 = new Class3_Sub8(local439);
		Static18.aClass3_Sub8_Sub1_1.method1546(local439, local69);
		Static137.aClass3_Sub8Array1[arg1] = local444;
		arg0.method742(local444);
	}
}

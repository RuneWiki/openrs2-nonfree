import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
	public static int anInt3325;

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "[I")
	public static final int[] anIntArray375 = new int[500];

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
	public static int anInt3326 = 0;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!pd;Z)V")
	public static void method2571(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) boolean arg1) {
		Static198.aClass67_16.method2843(arg0);
		while (true) {
			@Pc(8) Class2_Sub17 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(30) Class2_Sub17[][] local30;
			@Pc(47) Class2_Sub17 local47;
			@Pc(245) int local245;
			@Pc(579) int local579;
			@Pc(584) int local584;
			@Pc(589) int local589;
			@Pc(906) Class74 local906;
			@Pc(1079) int local1079;
			@Pc(964) int local964;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(251) Class6 var11;
										@Pc(592) int var16;
										@Pc(601) int var17;
										@Pc(613) int var18;
										@Pc(335) int var20;
										@Pc(283) boolean var21;
										@Pc(787) Class2_Sub17 var32;
										while (true) {
											do {
												local8 = (Class2_Sub17) Static198.aClass67_16.method2842();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean135);
											local17 = local8.anInt3603;
											local20 = local8.anInt3610;
											local23 = local8.anInt3601;
											local26 = local8.anInt3605;
											local30 = Static118.aClass2_Sub17ArrayArrayArray1[local23];
											if (!local8.aBoolean134) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local47 = Static118.aClass2_Sub17ArrayArrayArray1[local23 - 1][local17][local20];
													if (local47 != null && local47.aBoolean135) {
														continue;
													}
												}
												if (local17 <= Static187.anInt4630 && local17 > Static177.anInt4315) {
													local47 = local30[local17 - 1][local20];
													if (local47 != null && local47.aBoolean135 && (local47.aBoolean134 || (local8.anInt3608 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static187.anInt4630 && local17 < Static63.anInt1930 - 1) {
													local47 = local30[local17 + 1][local20];
													if (local47 != null && local47.aBoolean135 && (local47.aBoolean134 || (local8.anInt3608 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static71.anInt4244 && local20 > Static193.anInt4612) {
													local47 = local30[local17][local20 - 1];
													if (local47 != null && local47.aBoolean135 && (local47.aBoolean134 || (local8.anInt3608 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static71.anInt4244 && local20 < Static130.anInt3544 - 1) {
													local47 = local30[local17][local20 + 1];
													if (local47 != null && local47.aBoolean135 && (local47.aBoolean134 || (local8.anInt3608 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean134 = false;
											if (local8.aClass2_Sub17_1 != null) {
												local47 = local8.aClass2_Sub17_1;
												if (local47.aClass34_1 == null) {
													if (local47.aClass45_1 != null && !Static15.method397(0, local17, local20)) {
														Static117.method761(local47.aClass45_1, Static94.anInt2812, Static108.anInt3076, Static189.anInt4498, Static135.anInt3581, local17, local20);
													}
												} else if (!Static15.method397(0, local17, local20)) {
													Static63.method1445(local47.aClass34_1, 0, Static94.anInt2812, Static108.anInt3076, Static189.anInt4498, Static135.anInt3581, local17, local20);
												}
												@Pc(219) Class74 local219 = local47.aClass74_1;
												if (local219 != null) {
													local219.aClass2_Sub1_Sub1_10.method3173(0, Static94.anInt2812, Static108.anInt3076, Static189.anInt4498, Static135.anInt3581, local219.anInt3945 - Static18.anInt4397, local219.anInt3946 - Static145.anInt3794, local219.anInt3949 - Static36.anInt1081, local219.aLong127);
												}
												for (local245 = 0; local245 < local47.anInt3604; local245++) {
													var11 = local47.aClass6Array2[local245];
													if (var11 != null) {
														var11.aClass2_Sub1_Sub1_1.method3173(var11.anInt296, Static94.anInt2812, Static108.anInt3076, Static189.anInt4498, Static135.anInt3581, var11.anInt294 - Static18.anInt4397, var11.anInt297 - Static145.anInt3794, var11.anInt289 - Static36.anInt1081, var11.aLong8);
													}
												}
											}
											var21 = false;
											if (local8.aClass34_1 == null) {
												if (local8.aClass45_1 != null && !Static15.method397(local26, local17, local20)) {
													var21 = true;
													Static117.method761(local8.aClass45_1, Static94.anInt2812, Static108.anInt3076, Static189.anInt4498, Static135.anInt3581, local17, local20);
												}
											} else if (!Static15.method397(local26, local17, local20)) {
												var21 = true;
												if (local8.aClass34_1.anInt2143 != 12345678 || Static27.aBoolean30 && local23 <= Static54.anInt1748) {
													Static63.method1445(local8.aClass34_1, local26, Static94.anInt2812, Static108.anInt3076, Static189.anInt4498, Static135.anInt3581, local17, local20);
												}
											}
											var20 = 0;
											local245 = 0;
											@Pc(340) Class74 local340 = local8.aClass74_1;
											@Pc(343) Class26 local343 = local8.aClass26_1;
											if (local340 != null || local343 != null) {
												if (Static187.anInt4630 == local17) {
													var20++;
												} else if (Static187.anInt4630 < local17) {
													var20 += 2;
												}
												if (Static71.anInt4244 == local20) {
													var20 += 3;
												} else if (Static71.anInt4244 > local20) {
													var20 += 6;
												}
												local245 = Static55.anIntArray169[var20];
												local8.anInt3607 = Static193.anIntArray500[var20];
											}
											if (local340 != null) {
												if ((local340.anInt3947 & Static176.anIntArray466[var20]) == 0) {
													local8.anInt3602 = 0;
												} else if (local340.anInt3947 == 16) {
													local8.anInt3602 = 3;
													local8.anInt3600 = Static77.anIntArray263[var20];
													local8.anInt3609 = 3 - local8.anInt3600;
												} else if (local340.anInt3947 == 32) {
													local8.anInt3602 = 6;
													local8.anInt3600 = Static167.anIntArray452[var20];
													local8.anInt3609 = 6 - local8.anInt3600;
												} else if (local340.anInt3947 == 64) {
													local8.anInt3602 = 12;
													local8.anInt3600 = Static142.anIntArray415[var20];
													local8.anInt3609 = 12 - local8.anInt3600;
												} else {
													local8.anInt3602 = 9;
													local8.anInt3600 = Static104.anIntArray344[var20];
													local8.anInt3609 = 9 - local8.anInt3600;
												}
												if ((local340.anInt3947 & local245) != 0 && !Static84.method1986(local26, local17, local20, local340.anInt3947)) {
													local340.aClass2_Sub1_Sub1_10.method3173(0, Static94.anInt2812, Static108.anInt3076, Static189.anInt4498, Static135.anInt3581, local340.anInt3945 - Static18.anInt4397, local340.anInt3946 - Static145.anInt3794, local340.anInt3949 - Static36.anInt1081, local340.aLong127);
												}
												if ((local340.anInt3948 & local245) != 0 && !Static84.method1986(local26, local17, local20, local340.anInt3948)) {
													local340.aClass2_Sub1_Sub1_9.method3173(0, Static94.anInt2812, Static108.anInt3076, Static189.anInt4498, Static135.anInt3581, local340.anInt3945 - Static18.anInt4397, local340.anInt3946 - Static145.anInt3794, local340.anInt3949 - Static36.anInt1081, local340.aLong127);
												}
											}
											if (local343 != null && !Static143.method2894(local26, local17, local20, local343.aClass2_Sub1_Sub1_5.method3179())) {
												if ((local343.anInt1774 & local245) != 0) {
													local343.aClass2_Sub1_Sub1_5.method3173(0, Static94.anInt2812, Static108.anInt3076, Static189.anInt4498, Static135.anInt3581, local343.anInt1765 + local343.anInt1771 - Static18.anInt4397, local343.anInt1775 - Static145.anInt3794, local343.anInt1773 + local343.anInt1770 - Static36.anInt1081, local343.aLong49);
												} else if (local343.anInt1774 == 256) {
													local579 = local343.anInt1765 - Static18.anInt4397;
													local584 = local343.anInt1775 - Static145.anInt3794;
													local589 = local343.anInt1773 - Static36.anInt1081;
													var16 = local343.anInt1764;
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
														local343.aClass2_Sub1_Sub1_5.method3173(0, Static94.anInt2812, Static108.anInt3076, Static189.anInt4498, Static135.anInt3581, local579 + local343.anInt1771, local584, local589 + local343.anInt1770, local343.aLong49);
													} else if (local343.aClass2_Sub1_Sub1_6 != null) {
														local343.aClass2_Sub1_Sub1_6.method3173(0, Static94.anInt2812, Static108.anInt3076, Static189.anInt4498, Static135.anInt3581, local579, local584, local589, local343.aLong49);
													}
												}
											}
											if (var21) {
												@Pc(660) Class52 local660 = local8.aClass52_1;
												if (local660 != null) {
													local660.aClass2_Sub1_Sub1_7.method3173(0, Static94.anInt2812, Static108.anInt3076, Static189.anInt4498, Static135.anInt3581, local660.anInt3136 - Static18.anInt4397, local660.anInt3138 - Static145.anInt3794, local660.anInt3135 - Static36.anInt1081, local660.aLong105);
												}
												@Pc(687) Class17 local687 = local8.aClass17_1;
												if (local687 != null && local687.anInt1086 == 0) {
													if (local687.aClass2_Sub1_Sub1_4 != null) {
														local687.aClass2_Sub1_Sub1_4.method3173(0, Static94.anInt2812, Static108.anInt3076, Static189.anInt4498, Static135.anInt3581, local687.anInt1084 - Static18.anInt4397, local687.anInt1082 - Static145.anInt3794, local687.anInt1085 - Static36.anInt1081, local687.aLong31);
													}
													if (local687.aClass2_Sub1_Sub1_2 != null) {
														local687.aClass2_Sub1_Sub1_2.method3173(0, Static94.anInt2812, Static108.anInt3076, Static189.anInt4498, Static135.anInt3581, local687.anInt1084 - Static18.anInt4397, local687.anInt1082 - Static145.anInt3794, local687.anInt1085 - Static36.anInt1081, local687.aLong31);
													}
													if (local687.aClass2_Sub1_Sub1_3 != null) {
														local687.aClass2_Sub1_Sub1_3.method3173(0, Static94.anInt2812, Static108.anInt3076, Static189.anInt4498, Static135.anInt3581, local687.anInt1084 - Static18.anInt4397, local687.anInt1082 - Static145.anInt3794, local687.anInt1085 - Static36.anInt1081, local687.aLong31);
													}
												}
											}
											local579 = local8.anInt3608;
											if (local579 != 0) {
												if (local17 < Static187.anInt4630 && (local579 & 0x4) != 0) {
													var32 = local30[local17 + 1][local20];
													if (var32 != null && var32.aBoolean135) {
														Static198.aClass67_16.method2843(var32);
													}
												}
												if (local20 < Static71.anInt4244 && (local579 & 0x2) != 0) {
													var32 = local30[local17][local20 + 1];
													if (var32 != null && var32.aBoolean135) {
														Static198.aClass67_16.method2843(var32);
													}
												}
												if (local17 > Static187.anInt4630 && (local579 & 0x1) != 0) {
													var32 = local30[local17 - 1][local20];
													if (var32 != null && var32.aBoolean135) {
														Static198.aClass67_16.method2843(var32);
													}
												}
												if (local20 > Static71.anInt4244 && (local579 & 0x8) != 0) {
													var32 = local30[local17][local20 - 1];
													if (var32 != null && var32.aBoolean135) {
														Static198.aClass67_16.method2843(var32);
													}
												}
											}
											break;
										}
										if (local8.anInt3602 != 0) {
											var21 = true;
											for (var20 = 0; var20 < local8.anInt3604; var20++) {
												if (local8.aClass6Array2[var20].anInt293 != Static183.anInt4437 && (local8.anIntArray409[var20] & local8.anInt3602) == local8.anInt3600) {
													var21 = false;
													break;
												}
											}
											if (var21) {
												local906 = local8.aClass74_1;
												if (!Static84.method1986(local26, local17, local20, local906.anInt3947)) {
													local906.aClass2_Sub1_Sub1_10.method3173(0, Static94.anInt2812, Static108.anInt3076, Static189.anInt4498, Static135.anInt3581, local906.anInt3945 - Static18.anInt4397, local906.anInt3946 - Static145.anInt3794, local906.anInt3949 - Static36.anInt1081, local906.aLong127);
												}
												local8.anInt3602 = 0;
											}
										}
										if (!local8.aBoolean133) {
											break;
										}
										try {
											@Pc(944) int local944 = local8.anInt3604;
											local8.aBoolean133 = false;
											var20 = 0;
											label558: for (local245 = 0; local245 < local944; local245++) {
												var11 = local8.aClass6Array2[local245];
												if (var11.anInt293 != Static183.anInt4437) {
													for (local964 = var11.anInt299; local964 <= var11.anInt292; local964++) {
														for (local579 = var11.anInt291; local579 <= var11.anInt300; local579++) {
															var32 = local30[local964][local579];
															if (var32.aBoolean134) {
																local8.aBoolean133 = true;
																continue label558;
															}
															if (var32.anInt3602 != 0) {
																local589 = 0;
																if (local964 > var11.anInt299) {
																	local589++;
																}
																if (local964 < var11.anInt292) {
																	local589 += 4;
																}
																if (local579 > var11.anInt291) {
																	local589 += 8;
																}
																if (local579 < var11.anInt300) {
																	local589 += 2;
																}
																if ((local589 & var32.anInt3602) == local8.anInt3609) {
																	local8.aBoolean133 = true;
																	continue label558;
																}
															}
														}
													}
													Static141.aClass6Array3[var20++] = var11;
													local579 = Static187.anInt4630 - var11.anInt299;
													local584 = var11.anInt292 - Static187.anInt4630;
													if (local584 > local579) {
														local579 = local584;
													}
													local589 = Static71.anInt4244 - var11.anInt291;
													var16 = var11.anInt300 - Static71.anInt4244;
													if (var16 > local589) {
														var11.anInt298 = local579 + var16;
													} else {
														var11.anInt298 = local579 + local589;
													}
												}
											}
											while (var20 > 0) {
												local1079 = -50;
												local964 = -1;
												@Pc(1088) Class6 local1088;
												for (local579 = 0; local579 < var20; local579++) {
													local1088 = Static141.aClass6Array3[local579];
													if (local1088.anInt293 != Static183.anInt4437) {
														if (local1088.anInt298 > local1079) {
															local1079 = local1088.anInt298;
															local964 = local579;
														} else if (local1088.anInt298 == local1079) {
															local589 = local1088.anInt294 - Static18.anInt4397;
															var16 = local1088.anInt289 - Static36.anInt1081;
															var17 = Static141.aClass6Array3[local964].anInt294 - Static18.anInt4397;
															var18 = Static141.aClass6Array3[local964].anInt289 - Static36.anInt1081;
															if (local589 * local589 + var16 * var16 > var17 * var17 + var18 * var18) {
																local964 = local579;
															}
														}
													}
												}
												if (local964 == -1) {
													break;
												}
												local1088 = Static141.aClass6Array3[local964];
												local1088.anInt293 = Static183.anInt4437;
												if (!Static75.method1835(local26, local1088.anInt299, local1088.anInt292, local1088.anInt291, local1088.anInt300, local1088.aClass2_Sub1_Sub1_1.method3179())) {
													local1088.aClass2_Sub1_Sub1_1.method3173(local1088.anInt296, Static94.anInt2812, Static108.anInt3076, Static189.anInt4498, Static135.anInt3581, local1088.anInt294 - Static18.anInt4397, local1088.anInt297 - Static145.anInt3794, local1088.anInt289 - Static36.anInt1081, local1088.aLong8);
												}
												for (local589 = local1088.anInt299; local589 <= local1088.anInt292; local589++) {
													for (var16 = local1088.anInt291; var16 <= local1088.anInt300; var16++) {
														@Pc(1212) Class2_Sub17 local1212 = local30[local589][var16];
														if (local1212.anInt3602 != 0) {
															Static198.aClass67_16.method2843(local1212);
														} else if ((local589 != local17 || var16 != local20) && local1212.aBoolean135) {
															Static198.aClass67_16.method2843(local1212);
														}
													}
												}
											}
											if (!local8.aBoolean133) {
												break;
											}
										} catch (@Pc(1250) Exception local1250) {
											local8.aBoolean133 = false;
											break;
										}
									}
								} while (!local8.aBoolean135);
							} while (local8.anInt3602 != 0);
							if (local17 > Static187.anInt4630 || local17 <= Static177.anInt4315) {
								break;
							}
							local47 = local30[local17 - 1][local20];
						} while (local47 != null && local47.aBoolean135);
						if (local17 < Static187.anInt4630 || local17 >= Static63.anInt1930 - 1) {
							break;
						}
						local47 = local30[local17 + 1][local20];
					} while (local47 != null && local47.aBoolean135);
					if (local20 > Static71.anInt4244 || local20 <= Static193.anInt4612) {
						break;
					}
					local47 = local30[local17][local20 - 1];
				} while (local47 != null && local47.aBoolean135);
				if (local20 < Static71.anInt4244 || local20 >= Static130.anInt3544 - 1) {
					break;
				}
				local47 = local30[local17][local20 + 1];
			} while (local47 != null && local47.aBoolean135);
			local8.aBoolean135 = false;
			Static74.anInt2287--;
			@Pc(1354) Class17 local1354 = local8.aClass17_1;
			if (local1354 != null && local1354.anInt1086 != 0) {
				if (local1354.aClass2_Sub1_Sub1_4 != null) {
					local1354.aClass2_Sub1_Sub1_4.method3173(0, Static94.anInt2812, Static108.anInt3076, Static189.anInt4498, Static135.anInt3581, local1354.anInt1084 - Static18.anInt4397, local1354.anInt1082 - Static145.anInt3794 - local1354.anInt1086, local1354.anInt1085 - Static36.anInt1081, local1354.aLong31);
				}
				if (local1354.aClass2_Sub1_Sub1_2 != null) {
					local1354.aClass2_Sub1_Sub1_2.method3173(0, Static94.anInt2812, Static108.anInt3076, Static189.anInt4498, Static135.anInt3581, local1354.anInt1084 - Static18.anInt4397, local1354.anInt1082 - Static145.anInt3794 - local1354.anInt1086, local1354.anInt1085 - Static36.anInt1081, local1354.aLong31);
				}
				if (local1354.aClass2_Sub1_Sub1_3 != null) {
					local1354.aClass2_Sub1_Sub1_3.method3173(0, Static94.anInt2812, Static108.anInt3076, Static189.anInt4498, Static135.anInt3581, local1354.anInt1084 - Static18.anInt4397, local1354.anInt1082 - Static145.anInt3794 - local1354.anInt1086, local1354.anInt1085 - Static36.anInt1081, local1354.aLong31);
				}
			}
			if (local8.anInt3607 != 0) {
				@Pc(1449) Class26 local1449 = local8.aClass26_1;
				if (local1449 != null && !Static143.method2894(local26, local17, local20, local1449.aClass2_Sub1_Sub1_5.method3179())) {
					if ((local1449.anInt1774 & local8.anInt3607) != 0) {
						local1449.aClass2_Sub1_Sub1_5.method3173(0, Static94.anInt2812, Static108.anInt3076, Static189.anInt4498, Static135.anInt3581, local1449.anInt1765 + local1449.anInt1771 - Static18.anInt4397, local1449.anInt1775 - Static145.anInt3794, local1449.anInt1773 + local1449.anInt1770 - Static36.anInt1081, local1449.aLong49);
					} else if (local1449.anInt1774 == 256) {
						local245 = local1449.anInt1765 - Static18.anInt4397;
						local1079 = local1449.anInt1775 - Static145.anInt3794;
						local964 = local1449.anInt1773 - Static36.anInt1081;
						local579 = local1449.anInt1764;
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
							local1449.aClass2_Sub1_Sub1_5.method3173(0, Static94.anInt2812, Static108.anInt3076, Static189.anInt4498, Static135.anInt3581, local245 + local1449.anInt1771, local1079, local964 + local1449.anInt1770, local1449.aLong49);
						} else if (local1449.aClass2_Sub1_Sub1_6 != null) {
							local1449.aClass2_Sub1_Sub1_6.method3173(0, Static94.anInt2812, Static108.anInt3076, Static189.anInt4498, Static135.anInt3581, local245, local1079, local964, local1449.aLong49);
						}
					}
				}
				local906 = local8.aClass74_1;
				if (local906 != null) {
					if ((local906.anInt3948 & local8.anInt3607) != 0 && !Static84.method1986(local26, local17, local20, local906.anInt3948)) {
						local906.aClass2_Sub1_Sub1_9.method3173(0, Static94.anInt2812, Static108.anInt3076, Static189.anInt4498, Static135.anInt3581, local906.anInt3945 - Static18.anInt4397, local906.anInt3946 - Static145.anInt3794, local906.anInt3949 - Static36.anInt1081, local906.aLong127);
					}
					if ((local906.anInt3947 & local8.anInt3607) != 0 && !Static84.method1986(local26, local17, local20, local906.anInt3947)) {
						local906.aClass2_Sub1_Sub1_10.method3173(0, Static94.anInt2812, Static108.anInt3076, Static189.anInt4498, Static135.anInt3581, local906.anInt3945 - Static18.anInt4397, local906.anInt3946 - Static145.anInt3794, local906.anInt3949 - Static36.anInt1081, local906.aLong127);
					}
				}
			}
			@Pc(1669) Class2_Sub17 local1669;
			if (local23 < Static98.anInt2864 - 1) {
				local1669 = Static118.aClass2_Sub17ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1669 != null && local1669.aBoolean135) {
					Static198.aClass67_16.method2843(local1669);
				}
			}
			if (local17 < Static187.anInt4630) {
				local1669 = local30[local17 + 1][local20];
				if (local1669 != null && local1669.aBoolean135) {
					Static198.aClass67_16.method2843(local1669);
				}
			}
			if (local20 < Static71.anInt4244) {
				local1669 = local30[local17][local20 + 1];
				if (local1669 != null && local1669.aBoolean135) {
					Static198.aClass67_16.method2843(local1669);
				}
			}
			if (local17 > Static187.anInt4630) {
				local1669 = local30[local17 - 1][local20];
				if (local1669 != null && local1669.aBoolean135) {
					Static198.aClass67_16.method2843(local1669);
				}
			}
			if (local20 > Static71.anInt4244) {
				local1669 = local30[local17][local20 - 1];
				if (local1669 != null && local1669.aBoolean135) {
					Static198.aClass67_16.method2843(local1669);
				}
			}
		}
	}
}

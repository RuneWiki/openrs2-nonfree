import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "Lclient!ne;")
	public static Class1_Sub1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub1_Sub2_Sub1_7;

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1441 = Static49.method1293("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1440 = aClass70_1441;

	@OriginalMember(owner = "client!oh", name = "j", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1442 = Static49.method1293("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!oh", name = "o", descriptor = "Lclient!ge;")
	public static Class30 aClass30_14 = new Class30(8);

	@OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
	public static int anInt4223 = 20;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!lg;Z)V")
	public static void method3222(@OriginalArg(0) Class1_Sub17 arg0, @OriginalArg(1) boolean arg1) {
		Static111.aClass4_11.method179(arg0);
		while (true) {
			@Pc(8) Class1_Sub17 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(30) Class1_Sub17[][] local30;
			@Pc(47) Class1_Sub17 local47;
			@Pc(245) int local245;
			@Pc(579) int local579;
			@Pc(584) int local584;
			@Pc(589) int local589;
			@Pc(906) Class34 local906;
			@Pc(1079) int local1079;
			@Pc(964) int local964;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(251) Class53 var11;
										@Pc(592) int var16;
										@Pc(601) int var17;
										@Pc(613) int var18;
										@Pc(335) int var20;
										@Pc(283) boolean var21;
										@Pc(787) Class1_Sub17 var32;
										while (true) {
											do {
												local8 = (Class1_Sub17) Static111.aClass4_11.method173();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean120);
											local17 = local8.anInt2944;
											local20 = local8.anInt2947;
											local23 = local8.anInt2950;
											local26 = local8.anInt2952;
											local30 = Static90.aClass1_Sub17ArrayArrayArray1[local23];
											if (!local8.aBoolean121) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local47 = Static90.aClass1_Sub17ArrayArrayArray1[local23 - 1][local17][local20];
													if (local47 != null && local47.aBoolean120) {
														continue;
													}
												}
												if (local17 <= Static72.anInt2244 && local17 > Static109.anInt3066) {
													local47 = local30[local17 - 1][local20];
													if (local47 != null && local47.aBoolean120 && (local47.aBoolean121 || (local8.anInt2949 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static72.anInt2244 && local17 < Static27.anInt738 - 1) {
													local47 = local30[local17 + 1][local20];
													if (local47 != null && local47.aBoolean120 && (local47.aBoolean121 || (local8.anInt2949 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static11.anInt384 && local20 > Static18.anInt484) {
													local47 = local30[local17][local20 - 1];
													if (local47 != null && local47.aBoolean120 && (local47.aBoolean121 || (local8.anInt2949 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static11.anInt384 && local20 < Static54.anInt1758 - 1) {
													local47 = local30[local17][local20 + 1];
													if (local47 != null && local47.aBoolean120 && (local47.aBoolean121 || (local8.anInt2949 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean121 = false;
											if (local8.aClass1_Sub17_1 != null) {
												local47 = local8.aClass1_Sub17_1;
												if (local47.aClass46_1 == null) {
													if (local47.aClass21_1 != null && !Static144.method2837(0, local17, local20)) {
														Static56.method1378(local47.aClass21_1, Static161.anInt4213, Static171.anInt4443, Static114.anInt3121, Static66.anInt2085, local17, local20);
													}
												} else if (!Static144.method2837(0, local17, local20)) {
													Static40.method1025(local47.aClass46_1, 0, Static161.anInt4213, Static171.anInt4443, Static114.anInt3121, Static66.anInt2085, local17, local20);
												}
												@Pc(219) Class34 local219 = local47.aClass34_1;
												if (local219 != null) {
													local219.aClass1_Sub1_Sub4_2.method3063(0, Static161.anInt4213, Static171.anInt4443, Static114.anInt3121, Static66.anInt2085, local219.anInt2089 - Static142.anInt3764, local219.anInt2095 - Static183.anInt4552, local219.anInt2090 - Static108.anInt3059, local219.aLong59);
												}
												for (local245 = 0; local245 < local47.anInt2953; local245++) {
													var11 = local47.aClass53Array2[local245];
													if (var11 != null) {
														var11.aClass1_Sub1_Sub4_4.method3063(var11.anInt3112, Static161.anInt4213, Static171.anInt4443, Static114.anInt3121, Static66.anInt2085, var11.anInt3102 - Static142.anInt3764, var11.anInt3108 - Static183.anInt4552, var11.anInt3100 - Static108.anInt3059, var11.aLong99);
													}
												}
											}
											var21 = false;
											if (local8.aClass46_1 == null) {
												if (local8.aClass21_1 != null && !Static144.method2837(local26, local17, local20)) {
													var21 = true;
													Static56.method1378(local8.aClass21_1, Static161.anInt4213, Static171.anInt4443, Static114.anInt3121, Static66.anInt2085, local17, local20);
												}
											} else if (!Static144.method2837(local26, local17, local20)) {
												var21 = true;
												if (local8.aClass46_1.anInt2862 != 12345678 || Static94.aBoolean108 && local23 <= Static148.anInt3884) {
													Static40.method1025(local8.aClass46_1, local26, Static161.anInt4213, Static171.anInt4443, Static114.anInt3121, Static66.anInt2085, local17, local20);
												}
											}
											var20 = 0;
											local245 = 0;
											@Pc(340) Class34 local340 = local8.aClass34_1;
											@Pc(343) Class54 local343 = local8.aClass54_1;
											if (local340 != null || local343 != null) {
												if (Static72.anInt2244 == local17) {
													var20++;
												} else if (Static72.anInt2244 < local17) {
													var20 += 2;
												}
												if (Static11.anInt384 == local20) {
													var20 += 3;
												} else if (Static11.anInt384 > local20) {
													var20 += 6;
												}
												local245 = Static106.anIntArray292[var20];
												local8.anInt2945 = Static8.anIntArray21[var20];
											}
											if (local340 != null) {
												if ((local340.anInt2086 & Static80.anIntArray240[var20]) == 0) {
													local8.anInt2943 = 0;
												} else if (local340.anInt2086 == 16) {
													local8.anInt2943 = 3;
													local8.anInt2946 = Static53.anIntArray172[var20];
													local8.anInt2948 = 3 - local8.anInt2946;
												} else if (local340.anInt2086 == 32) {
													local8.anInt2943 = 6;
													local8.anInt2946 = Static12.anIntArray26[var20];
													local8.anInt2948 = 6 - local8.anInt2946;
												} else if (local340.anInt2086 == 64) {
													local8.anInt2943 = 12;
													local8.anInt2946 = Static2.anIntArray14[var20];
													local8.anInt2948 = 12 - local8.anInt2946;
												} else {
													local8.anInt2943 = 9;
													local8.anInt2946 = Static123.anIntArray323[var20];
													local8.anInt2948 = 9 - local8.anInt2946;
												}
												if ((local340.anInt2086 & local245) != 0 && !Static164.method3272(local26, local17, local20, local340.anInt2086)) {
													local340.aClass1_Sub1_Sub4_2.method3063(0, Static161.anInt4213, Static171.anInt4443, Static114.anInt3121, Static66.anInt2085, local340.anInt2089 - Static142.anInt3764, local340.anInt2095 - Static183.anInt4552, local340.anInt2090 - Static108.anInt3059, local340.aLong59);
												}
												if ((local340.anInt2091 & local245) != 0 && !Static164.method3272(local26, local17, local20, local340.anInt2091)) {
													local340.aClass1_Sub1_Sub4_3.method3063(0, Static161.anInt4213, Static171.anInt4443, Static114.anInt3121, Static66.anInt2085, local340.anInt2089 - Static142.anInt3764, local340.anInt2095 - Static183.anInt4552, local340.anInt2090 - Static108.anInt3059, local340.aLong59);
												}
											}
											if (local343 != null && !Static78.method1786(local26, local17, local20, local343.aClass1_Sub1_Sub4_6.aShort36)) {
												if ((local343.anInt3120 & local245) != 0) {
													local343.aClass1_Sub1_Sub4_6.method3063(0, Static161.anInt4213, Static171.anInt4443, Static114.anInt3121, Static66.anInt2085, local343.anInt3117 + local343.anInt3119 - Static142.anInt3764, local343.anInt3114 - Static183.anInt4552, local343.anInt3125 + local343.anInt3118 - Static108.anInt3059, local343.aLong100);
												} else if (local343.anInt3120 == 256) {
													local579 = local343.anInt3117 - Static142.anInt3764;
													local584 = local343.anInt3114 - Static183.anInt4552;
													local589 = local343.anInt3125 - Static108.anInt3059;
													var16 = local343.anInt3116;
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
														local343.aClass1_Sub1_Sub4_6.method3063(0, Static161.anInt4213, Static171.anInt4443, Static114.anInt3121, Static66.anInt2085, local579 + local343.anInt3119, local584, local589 + local343.anInt3118, local343.aLong100);
													} else if (local343.aClass1_Sub1_Sub4_5 != null) {
														local343.aClass1_Sub1_Sub4_5.method3063(0, Static161.anInt4213, Static171.anInt4443, Static114.anInt3121, Static66.anInt2085, local579, local584, local589, local343.aLong100);
													}
												}
											}
											if (var21) {
												@Pc(660) Class7 local660 = local8.aClass7_1;
												if (local660 != null) {
													local660.aClass1_Sub1_Sub4_1.method3063(0, Static161.anInt4213, Static171.anInt4443, Static114.anInt3121, Static66.anInt2085, local660.anInt287 - Static142.anInt3764, local660.anInt291 - Static183.anInt4552, local660.anInt284 - Static108.anInt3059, local660.aLong15);
												}
												@Pc(687) Class80 local687 = local8.aClass80_1;
												if (local687 != null && local687.anInt4447 == 0) {
													if (local687.aClass1_Sub1_Sub4_8 != null) {
														local687.aClass1_Sub1_Sub4_8.method3063(0, Static161.anInt4213, Static171.anInt4443, Static114.anInt3121, Static66.anInt2085, local687.anInt4452 - Static142.anInt3764, local687.anInt4444 - Static183.anInt4552, local687.anInt4448 - Static108.anInt3059, local687.aLong142);
													}
													if (local687.aClass1_Sub1_Sub4_7 != null) {
														local687.aClass1_Sub1_Sub4_7.method3063(0, Static161.anInt4213, Static171.anInt4443, Static114.anInt3121, Static66.anInt2085, local687.anInt4452 - Static142.anInt3764, local687.anInt4444 - Static183.anInt4552, local687.anInt4448 - Static108.anInt3059, local687.aLong142);
													}
													if (local687.aClass1_Sub1_Sub4_9 != null) {
														local687.aClass1_Sub1_Sub4_9.method3063(0, Static161.anInt4213, Static171.anInt4443, Static114.anInt3121, Static66.anInt2085, local687.anInt4452 - Static142.anInt3764, local687.anInt4444 - Static183.anInt4552, local687.anInt4448 - Static108.anInt3059, local687.aLong142);
													}
												}
											}
											local579 = local8.anInt2949;
											if (local579 != 0) {
												if (local17 < Static72.anInt2244 && (local579 & 0x4) != 0) {
													var32 = local30[local17 + 1][local20];
													if (var32 != null && var32.aBoolean120) {
														Static111.aClass4_11.method179(var32);
													}
												}
												if (local20 < Static11.anInt384 && (local579 & 0x2) != 0) {
													var32 = local30[local17][local20 + 1];
													if (var32 != null && var32.aBoolean120) {
														Static111.aClass4_11.method179(var32);
													}
												}
												if (local17 > Static72.anInt2244 && (local579 & 0x1) != 0) {
													var32 = local30[local17 - 1][local20];
													if (var32 != null && var32.aBoolean120) {
														Static111.aClass4_11.method179(var32);
													}
												}
												if (local20 > Static11.anInt384 && (local579 & 0x8) != 0) {
													var32 = local30[local17][local20 - 1];
													if (var32 != null && var32.aBoolean120) {
														Static111.aClass4_11.method179(var32);
													}
												}
											}
											break;
										}
										if (local8.anInt2943 != 0) {
											var21 = true;
											for (var20 = 0; var20 < local8.anInt2953; var20++) {
												if (local8.aClass53Array2[var20].anInt3105 != Static59.anInt1907 && (local8.anIntArray288[var20] & local8.anInt2943) == local8.anInt2946) {
													var21 = false;
													break;
												}
											}
											if (var21) {
												local906 = local8.aClass34_1;
												if (!Static164.method3272(local26, local17, local20, local906.anInt2086)) {
													local906.aClass1_Sub1_Sub4_2.method3063(0, Static161.anInt4213, Static171.anInt4443, Static114.anInt3121, Static66.anInt2085, local906.anInt2089 - Static142.anInt3764, local906.anInt2095 - Static183.anInt4552, local906.anInt2090 - Static108.anInt3059, local906.aLong59);
												}
												local8.anInt2943 = 0;
											}
										}
										if (!local8.aBoolean119) {
											break;
										}
										try {
											@Pc(944) int local944 = local8.anInt2953;
											local8.aBoolean119 = false;
											var20 = 0;
											label558: for (local245 = 0; local245 < local944; local245++) {
												var11 = local8.aClass53Array2[local245];
												if (var11.anInt3105 != Static59.anInt1907) {
													for (local964 = var11.anInt3109; local964 <= var11.anInt3111; local964++) {
														for (local579 = var11.anInt3107; local579 <= var11.anInt3101; local579++) {
															var32 = local30[local964][local579];
															if (var32.aBoolean121) {
																local8.aBoolean119 = true;
																continue label558;
															}
															if (var32.anInt2943 != 0) {
																local589 = 0;
																if (local964 > var11.anInt3109) {
																	local589++;
																}
																if (local964 < var11.anInt3111) {
																	local589 += 4;
																}
																if (local579 > var11.anInt3107) {
																	local589 += 8;
																}
																if (local579 < var11.anInt3101) {
																	local589 += 2;
																}
																if ((local589 & var32.anInt2943) == local8.anInt2948) {
																	local8.aBoolean119 = true;
																	continue label558;
																}
															}
														}
													}
													Static134.aClass53Array3[var20++] = var11;
													local579 = Static72.anInt2244 - var11.anInt3109;
													local584 = var11.anInt3111 - Static72.anInt2244;
													if (local584 > local579) {
														local579 = local584;
													}
													local589 = Static11.anInt384 - var11.anInt3107;
													var16 = var11.anInt3101 - Static11.anInt384;
													if (var16 > local589) {
														var11.anInt3106 = local579 + var16;
													} else {
														var11.anInt3106 = local579 + local589;
													}
												}
											}
											while (var20 > 0) {
												local1079 = -50;
												local964 = -1;
												@Pc(1088) Class53 local1088;
												for (local579 = 0; local579 < var20; local579++) {
													local1088 = Static134.aClass53Array3[local579];
													if (local1088.anInt3105 != Static59.anInt1907) {
														if (local1088.anInt3106 > local1079) {
															local1079 = local1088.anInt3106;
															local964 = local579;
														} else if (local1088.anInt3106 == local1079) {
															local589 = local1088.anInt3102 - Static142.anInt3764;
															var16 = local1088.anInt3100 - Static108.anInt3059;
															var17 = Static134.aClass53Array3[local964].anInt3102 - Static142.anInt3764;
															var18 = Static134.aClass53Array3[local964].anInt3100 - Static108.anInt3059;
															if (local589 * local589 + var16 * var16 > var17 * var17 + var18 * var18) {
																local964 = local579;
															}
														}
													}
												}
												if (local964 == -1) {
													break;
												}
												local1088 = Static134.aClass53Array3[local964];
												local1088.anInt3105 = Static59.anInt1907;
												if (!Static81.method1831(local26, local1088.anInt3109, local1088.anInt3111, local1088.anInt3107, local1088.anInt3101, local1088.aClass1_Sub1_Sub4_4.aShort36)) {
													local1088.aClass1_Sub1_Sub4_4.method3063(local1088.anInt3112, Static161.anInt4213, Static171.anInt4443, Static114.anInt3121, Static66.anInt2085, local1088.anInt3102 - Static142.anInt3764, local1088.anInt3108 - Static183.anInt4552, local1088.anInt3100 - Static108.anInt3059, local1088.aLong99);
												}
												for (local589 = local1088.anInt3109; local589 <= local1088.anInt3111; local589++) {
													for (var16 = local1088.anInt3107; var16 <= local1088.anInt3101; var16++) {
														@Pc(1212) Class1_Sub17 local1212 = local30[local589][var16];
														if (local1212.anInt2943 != 0) {
															Static111.aClass4_11.method179(local1212);
														} else if ((local589 != local17 || var16 != local20) && local1212.aBoolean120) {
															Static111.aClass4_11.method179(local1212);
														}
													}
												}
											}
											if (!local8.aBoolean119) {
												break;
											}
										} catch (@Pc(1250) Exception local1250) {
											local8.aBoolean119 = false;
											break;
										}
									}
								} while (!local8.aBoolean120);
							} while (local8.anInt2943 != 0);
							if (local17 > Static72.anInt2244 || local17 <= Static109.anInt3066) {
								break;
							}
							local47 = local30[local17 - 1][local20];
						} while (local47 != null && local47.aBoolean120);
						if (local17 < Static72.anInt2244 || local17 >= Static27.anInt738 - 1) {
							break;
						}
						local47 = local30[local17 + 1][local20];
					} while (local47 != null && local47.aBoolean120);
					if (local20 > Static11.anInt384 || local20 <= Static18.anInt484) {
						break;
					}
					local47 = local30[local17][local20 - 1];
				} while (local47 != null && local47.aBoolean120);
				if (local20 < Static11.anInt384 || local20 >= Static54.anInt1758 - 1) {
					break;
				}
				local47 = local30[local17][local20 + 1];
			} while (local47 != null && local47.aBoolean120);
			local8.aBoolean120 = false;
			Static27.anInt732--;
			@Pc(1354) Class80 local1354 = local8.aClass80_1;
			if (local1354 != null && local1354.anInt4447 != 0) {
				if (local1354.aClass1_Sub1_Sub4_8 != null) {
					local1354.aClass1_Sub1_Sub4_8.method3063(0, Static161.anInt4213, Static171.anInt4443, Static114.anInt3121, Static66.anInt2085, local1354.anInt4452 - Static142.anInt3764, local1354.anInt4444 - Static183.anInt4552 - local1354.anInt4447, local1354.anInt4448 - Static108.anInt3059, local1354.aLong142);
				}
				if (local1354.aClass1_Sub1_Sub4_7 != null) {
					local1354.aClass1_Sub1_Sub4_7.method3063(0, Static161.anInt4213, Static171.anInt4443, Static114.anInt3121, Static66.anInt2085, local1354.anInt4452 - Static142.anInt3764, local1354.anInt4444 - Static183.anInt4552 - local1354.anInt4447, local1354.anInt4448 - Static108.anInt3059, local1354.aLong142);
				}
				if (local1354.aClass1_Sub1_Sub4_9 != null) {
					local1354.aClass1_Sub1_Sub4_9.method3063(0, Static161.anInt4213, Static171.anInt4443, Static114.anInt3121, Static66.anInt2085, local1354.anInt4452 - Static142.anInt3764, local1354.anInt4444 - Static183.anInt4552 - local1354.anInt4447, local1354.anInt4448 - Static108.anInt3059, local1354.aLong142);
				}
			}
			if (local8.anInt2945 != 0) {
				@Pc(1449) Class54 local1449 = local8.aClass54_1;
				if (local1449 != null && !Static78.method1786(local26, local17, local20, local1449.aClass1_Sub1_Sub4_6.aShort36)) {
					if ((local1449.anInt3120 & local8.anInt2945) != 0) {
						local1449.aClass1_Sub1_Sub4_6.method3063(0, Static161.anInt4213, Static171.anInt4443, Static114.anInt3121, Static66.anInt2085, local1449.anInt3117 + local1449.anInt3119 - Static142.anInt3764, local1449.anInt3114 - Static183.anInt4552, local1449.anInt3125 + local1449.anInt3118 - Static108.anInt3059, local1449.aLong100);
					} else if (local1449.anInt3120 == 256) {
						local245 = local1449.anInt3117 - Static142.anInt3764;
						local1079 = local1449.anInt3114 - Static183.anInt4552;
						local964 = local1449.anInt3125 - Static108.anInt3059;
						local579 = local1449.anInt3116;
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
							local1449.aClass1_Sub1_Sub4_6.method3063(0, Static161.anInt4213, Static171.anInt4443, Static114.anInt3121, Static66.anInt2085, local245 + local1449.anInt3119, local1079, local964 + local1449.anInt3118, local1449.aLong100);
						} else if (local1449.aClass1_Sub1_Sub4_5 != null) {
							local1449.aClass1_Sub1_Sub4_5.method3063(0, Static161.anInt4213, Static171.anInt4443, Static114.anInt3121, Static66.anInt2085, local245, local1079, local964, local1449.aLong100);
						}
					}
				}
				local906 = local8.aClass34_1;
				if (local906 != null) {
					if ((local906.anInt2091 & local8.anInt2945) != 0 && !Static164.method3272(local26, local17, local20, local906.anInt2091)) {
						local906.aClass1_Sub1_Sub4_3.method3063(0, Static161.anInt4213, Static171.anInt4443, Static114.anInt3121, Static66.anInt2085, local906.anInt2089 - Static142.anInt3764, local906.anInt2095 - Static183.anInt4552, local906.anInt2090 - Static108.anInt3059, local906.aLong59);
					}
					if ((local906.anInt2086 & local8.anInt2945) != 0 && !Static164.method3272(local26, local17, local20, local906.anInt2086)) {
						local906.aClass1_Sub1_Sub4_2.method3063(0, Static161.anInt4213, Static171.anInt4443, Static114.anInt3121, Static66.anInt2085, local906.anInt2089 - Static142.anInt3764, local906.anInt2095 - Static183.anInt4552, local906.anInt2090 - Static108.anInt3059, local906.aLong59);
					}
				}
			}
			@Pc(1669) Class1_Sub17 local1669;
			if (local23 < Static40.anInt1398 - 1) {
				local1669 = Static90.aClass1_Sub17ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1669 != null && local1669.aBoolean120) {
					Static111.aClass4_11.method179(local1669);
				}
			}
			if (local17 < Static72.anInt2244) {
				local1669 = local30[local17 + 1][local20];
				if (local1669 != null && local1669.aBoolean120) {
					Static111.aClass4_11.method179(local1669);
				}
			}
			if (local20 < Static11.anInt384) {
				local1669 = local30[local17][local20 + 1];
				if (local1669 != null && local1669.aBoolean120) {
					Static111.aClass4_11.method179(local1669);
				}
			}
			if (local17 > Static72.anInt2244) {
				local1669 = local30[local17 - 1][local20];
				if (local1669 != null && local1669.aBoolean120) {
					Static111.aClass4_11.method179(local1669);
				}
			}
			if (local20 > Static11.anInt384) {
				local1669 = local30[local17][local20 - 1];
				if (local1669 != null && local1669.aBoolean120) {
					Static111.aClass4_11.method179(local1669);
				}
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(Ljava/awt/Component;III)Lclient!oh;")
	public static Class14 method3225(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(11) Class local11 = Class.forName("Class14_Sub2");
			@Pc(15) Class14 local15 = (Class14) local11.getDeclaredConstructor().newInstance();
			local15.method3224(arg0, arg1, arg2);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class14_Sub1 local28 = new Class14_Sub1();
			local28.method3224(arg0, arg1, arg2);
			return local28;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZ)Lclient!ig;")
	public static Class39 method3227(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = arg0 >> 16;
		@Pc(18) int local18 = arg0 & 0xFFFF;
		if (Static77.aClass39ArrayArray1[local14] == null || Static77.aClass39ArrayArray1[local14][local18] == null) {
			@Pc(32) boolean local32 = Static106.method2213(local14);
			if (!local32) {
				return null;
			}
		}
		return Static77.aClass39ArrayArray1[local14][local18];
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IBI[B)I")
	public static int method3228(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg0; local9 < arg1; local9++) {
			local7 = Class1_Sub1_Sub4.anIntArray379[(local7 ^ arg2[local9]) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
	public static void method3229() {
		aClass70_1441 = null;
		aClass70_1440 = null;
		aClass1_Sub1_Sub1_Sub2_Sub1_7 = null;
		aClass70_1442 = null;
		aClass30_14 = null;
	}
}

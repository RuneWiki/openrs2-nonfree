import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
	public static int anInt1408;

	@OriginalMember(owner = "client!gg", name = "v", descriptor = "Lclient!nb;")
	public static Class66 aClass66_3;

	@OriginalMember(owner = "client!gg", name = "r", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_475 = Static151.method2243("Loaded wordpack");

	@OriginalMember(owner = "client!gg", name = "s", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_476 = Static151.method2243("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!gg", name = "t", descriptor = "Lclient!mb;")
	public static Class62 aClass62_477 = aClass62_475;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!pf;Z)V")
	public static void method932(@OriginalArg(0) Class2_Sub18 arg0, @OriginalArg(1) boolean arg1) {
		Static103.aClass13_6.method304(arg0);
		while (true) {
			@Pc(8) Class2_Sub18 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(30) Class2_Sub18[][] local30;
			@Pc(47) Class2_Sub18 local47;
			@Pc(245) int local245;
			@Pc(579) int local579;
			@Pc(584) int local584;
			@Pc(589) int local589;
			@Pc(906) Class85 local906;
			@Pc(1079) int local1079;
			@Pc(964) int local964;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(251) Class39 var11;
										@Pc(592) int var16;
										@Pc(601) int var17;
										@Pc(613) int var18;
										@Pc(335) int var20;
										@Pc(283) boolean var21;
										@Pc(787) Class2_Sub18 var32;
										while (true) {
											do {
												local8 = (Class2_Sub18) Static103.aClass13_6.method301();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean143);
											local17 = local8.anInt3304;
											local20 = local8.anInt3293;
											local23 = local8.anInt3299;
											local26 = local8.anInt3288;
											local30 = Static92.aClass2_Sub18ArrayArrayArray1[local23];
											if (!local8.aBoolean142) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local47 = Static92.aClass2_Sub18ArrayArrayArray1[local23 - 1][local17][local20];
													if (local47 != null && local47.aBoolean143) {
														continue;
													}
												}
												if (local17 <= Static140.anInt3022 && local17 > Static172.anInt694) {
													local47 = local30[local17 - 1][local20];
													if (local47 != null && local47.aBoolean143 && (local47.aBoolean142 || (local8.anInt3300 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static140.anInt3022 && local17 < Static48.anInt1051 - 1) {
													local47 = local30[local17 + 1][local20];
													if (local47 != null && local47.aBoolean143 && (local47.aBoolean142 || (local8.anInt3300 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static2.anInt78 && local20 > Static216.anInt4536) {
													local47 = local30[local17][local20 - 1];
													if (local47 != null && local47.aBoolean143 && (local47.aBoolean142 || (local8.anInt3300 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static2.anInt78 && local20 < Static102.anInt2328 - 1) {
													local47 = local30[local17][local20 + 1];
													if (local47 != null && local47.aBoolean143 && (local47.aBoolean142 || (local8.anInt3300 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean142 = false;
											if (local8.aClass2_Sub18_1 != null) {
												local47 = local8.aClass2_Sub18_1;
												if (local47.aClass44_1 == null) {
													if (local47.aClass93_1 != null && !Static131.method1030(0, local17, local20)) {
														Static74.method1042(local47.aClass93_1, Static181.anInt3781, Static36.anInt864, Static91.anInt2043, Static28.anInt641, local17, local20);
													}
												} else if (!Static131.method1030(0, local17, local20)) {
													Static113.method1739(local47.aClass44_1, 0, Static181.anInt3781, Static36.anInt864, Static91.anInt2043, Static28.anInt641, local17, local20);
												}
												@Pc(219) Class85 local219 = local47.aClass85_1;
												if (local219 != null) {
													local219.aClass7_8.method3143(0, Static181.anInt3781, Static36.anInt864, Static91.anInt2043, Static28.anInt641, local219.anInt3573 - Static189.anInt3928, local219.anInt3575 - Static52.anInt1112, local219.anInt3576 - Static172.anInt679, local219.aLong114);
												}
												for (local245 = 0; local245 < local47.anInt3292; local245++) {
													var11 = local47.aClass39Array2[local245];
													if (var11 != null) {
														var11.aClass7_5.method3143(var11.anInt1474, Static181.anInt3781, Static36.anInt864, Static91.anInt2043, Static28.anInt641, var11.anInt1473 - Static189.anInt3928, var11.anInt1479 - Static52.anInt1112, var11.anInt1477 - Static172.anInt679, var11.aLong54);
													}
												}
											}
											var21 = false;
											if (local8.aClass44_1 == null) {
												if (local8.aClass93_1 != null && !Static131.method1030(local26, local17, local20)) {
													var21 = true;
													Static74.method1042(local8.aClass93_1, Static181.anInt3781, Static36.anInt864, Static91.anInt2043, Static28.anInt641, local17, local20);
												}
											} else if (!Static131.method1030(local26, local17, local20)) {
												var21 = true;
												if (local8.aClass44_1.anInt1746 != 12345678 || Static139.aBoolean128 && local23 <= Static182.anInt3832) {
													Static113.method1739(local8.aClass44_1, local26, Static181.anInt3781, Static36.anInt864, Static91.anInt2043, Static28.anInt641, local17, local20);
												}
											}
											var20 = 0;
											local245 = 0;
											@Pc(340) Class85 local340 = local8.aClass85_1;
											@Pc(343) Class100 local343 = local8.aClass100_1;
											if (local340 != null || local343 != null) {
												if (Static140.anInt3022 == local17) {
													var20++;
												} else if (Static140.anInt3022 < local17) {
													var20 += 2;
												}
												if (Static2.anInt78 == local20) {
													var20 += 3;
												} else if (Static2.anInt78 > local20) {
													var20 += 6;
												}
												local245 = Static84.anIntArray328[var20];
												local8.anInt3296 = Static125.anIntArray247[var20];
											}
											if (local340 != null) {
												if ((local340.anInt3574 & Static174.anIntArray319[var20]) == 0) {
													local8.anInt3302 = 0;
												} else if (local340.anInt3574 == 16) {
													local8.anInt3302 = 3;
													local8.anInt3297 = Static168.anIntArray307[var20];
													local8.anInt3287 = 3 - local8.anInt3297;
												} else if (local340.anInt3574 == 32) {
													local8.anInt3302 = 6;
													local8.anInt3297 = Static84.anIntArray329[var20];
													local8.anInt3287 = 6 - local8.anInt3297;
												} else if (local340.anInt3574 == 64) {
													local8.anInt3302 = 12;
													local8.anInt3297 = Static61.anIntArray101[var20];
													local8.anInt3287 = 12 - local8.anInt3297;
												} else {
													local8.anInt3302 = 9;
													local8.anInt3297 = Static151.anIntArray283[var20];
													local8.anInt3287 = 9 - local8.anInt3297;
												}
												if ((local340.anInt3574 & local245) != 0 && !Static60.method843(local26, local17, local20, local340.anInt3574)) {
													local340.aClass7_8.method3143(0, Static181.anInt3781, Static36.anInt864, Static91.anInt2043, Static28.anInt641, local340.anInt3573 - Static189.anInt3928, local340.anInt3575 - Static52.anInt1112, local340.anInt3576 - Static172.anInt679, local340.aLong114);
												}
												if ((local340.anInt3571 & local245) != 0 && !Static60.method843(local26, local17, local20, local340.anInt3571)) {
													local340.aClass7_9.method3143(0, Static181.anInt3781, Static36.anInt864, Static91.anInt2043, Static28.anInt641, local340.anInt3573 - Static189.anInt3928, local340.anInt3575 - Static52.anInt1112, local340.anInt3576 - Static172.anInt679, local340.aLong114);
												}
											}
											if (local343 != null && !Static208.method3038(local26, local17, local20, local343.aClass7_11.method3148())) {
												if ((local343.anInt4041 & local245) != 0) {
													local343.aClass7_11.method3143(0, Static181.anInt3781, Static36.anInt864, Static91.anInt2043, Static28.anInt641, local343.anInt4036 + local343.anInt4037 - Static189.anInt3928, local343.anInt4034 - Static52.anInt1112, local343.anInt4038 + local343.anInt4042 - Static172.anInt679, local343.aLong135);
												} else if (local343.anInt4041 == 256) {
													local579 = local343.anInt4036 - Static189.anInt3928;
													local584 = local343.anInt4034 - Static52.anInt1112;
													local589 = local343.anInt4038 - Static172.anInt679;
													var16 = local343.anInt4033;
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
														local343.aClass7_11.method3143(0, Static181.anInt3781, Static36.anInt864, Static91.anInt2043, Static28.anInt641, local579 + local343.anInt4037, local584, local589 + local343.anInt4042, local343.aLong135);
													} else if (local343.aClass7_10 != null) {
														local343.aClass7_10.method3143(0, Static181.anInt3781, Static36.anInt864, Static91.anInt2043, Static28.anInt641, local579, local584, local589, local343.aLong135);
													}
												}
											}
											if (var21) {
												@Pc(660) Class10 local660 = local8.aClass10_1;
												if (local660 != null) {
													local660.aClass7_1.method3143(0, Static181.anInt3781, Static36.anInt864, Static91.anInt2043, Static28.anInt641, local660.anInt331 - Static189.anInt3928, local660.anInt332 - Static52.anInt1112, local660.anInt335 - Static172.anInt679, local660.aLong23);
												}
												@Pc(687) Class18 local687 = local8.aClass18_1;
												if (local687 != null && local687.anInt516 == 0) {
													if (local687.aClass7_3 != null) {
														local687.aClass7_3.method3143(0, Static181.anInt3781, Static36.anInt864, Static91.anInt2043, Static28.anInt641, local687.anInt508 - Static189.anInt3928, local687.anInt519 - Static52.anInt1112, local687.anInt513 - Static172.anInt679, local687.aLong30);
													}
													if (local687.aClass7_4 != null) {
														local687.aClass7_4.method3143(0, Static181.anInt3781, Static36.anInt864, Static91.anInt2043, Static28.anInt641, local687.anInt508 - Static189.anInt3928, local687.anInt519 - Static52.anInt1112, local687.anInt513 - Static172.anInt679, local687.aLong30);
													}
													if (local687.aClass7_2 != null) {
														local687.aClass7_2.method3143(0, Static181.anInt3781, Static36.anInt864, Static91.anInt2043, Static28.anInt641, local687.anInt508 - Static189.anInt3928, local687.anInt519 - Static52.anInt1112, local687.anInt513 - Static172.anInt679, local687.aLong30);
													}
												}
											}
											local579 = local8.anInt3300;
											if (local579 != 0) {
												if (local17 < Static140.anInt3022 && (local579 & 0x4) != 0) {
													var32 = local30[local17 + 1][local20];
													if (var32 != null && var32.aBoolean143) {
														Static103.aClass13_6.method304(var32);
													}
												}
												if (local20 < Static2.anInt78 && (local579 & 0x2) != 0) {
													var32 = local30[local17][local20 + 1];
													if (var32 != null && var32.aBoolean143) {
														Static103.aClass13_6.method304(var32);
													}
												}
												if (local17 > Static140.anInt3022 && (local579 & 0x1) != 0) {
													var32 = local30[local17 - 1][local20];
													if (var32 != null && var32.aBoolean143) {
														Static103.aClass13_6.method304(var32);
													}
												}
												if (local20 > Static2.anInt78 && (local579 & 0x8) != 0) {
													var32 = local30[local17][local20 - 1];
													if (var32 != null && var32.aBoolean143) {
														Static103.aClass13_6.method304(var32);
													}
												}
											}
											break;
										}
										if (local8.anInt3302 != 0) {
											var21 = true;
											for (var20 = 0; var20 < local8.anInt3292; var20++) {
												if (local8.aClass39Array2[var20].anInt1475 != Static28.anInt638 && (local8.anIntArray286[var20] & local8.anInt3302) == local8.anInt3297) {
													var21 = false;
													break;
												}
											}
											if (var21) {
												local906 = local8.aClass85_1;
												if (!Static60.method843(local26, local17, local20, local906.anInt3574)) {
													local906.aClass7_8.method3143(0, Static181.anInt3781, Static36.anInt864, Static91.anInt2043, Static28.anInt641, local906.anInt3573 - Static189.anInt3928, local906.anInt3575 - Static52.anInt1112, local906.anInt3576 - Static172.anInt679, local906.aLong114);
												}
												local8.anInt3302 = 0;
											}
										}
										if (!local8.aBoolean141) {
											break;
										}
										try {
											@Pc(944) int local944 = local8.anInt3292;
											local8.aBoolean141 = false;
											var20 = 0;
											label558: for (local245 = 0; local245 < local944; local245++) {
												var11 = local8.aClass39Array2[local245];
												if (var11.anInt1475 != Static28.anInt638) {
													for (local964 = var11.anInt1480; local964 <= var11.anInt1481; local964++) {
														for (local579 = var11.anInt1484; local579 <= var11.anInt1482; local579++) {
															var32 = local30[local964][local579];
															if (var32.aBoolean142) {
																local8.aBoolean141 = true;
																continue label558;
															}
															if (var32.anInt3302 != 0) {
																local589 = 0;
																if (local964 > var11.anInt1480) {
																	local589++;
																}
																if (local964 < var11.anInt1481) {
																	local589 += 4;
																}
																if (local579 > var11.anInt1484) {
																	local589 += 8;
																}
																if (local579 < var11.anInt1482) {
																	local589 += 2;
																}
																if ((local589 & var32.anInt3302) == local8.anInt3287) {
																	local8.aBoolean141 = true;
																	continue label558;
																}
															}
														}
													}
													Static64.aClass39Array1[var20++] = var11;
													local579 = Static140.anInt3022 - var11.anInt1480;
													local584 = var11.anInt1481 - Static140.anInt3022;
													if (local584 > local579) {
														local579 = local584;
													}
													local589 = Static2.anInt78 - var11.anInt1484;
													var16 = var11.anInt1482 - Static2.anInt78;
													if (var16 > local589) {
														var11.anInt1476 = local579 + var16;
													} else {
														var11.anInt1476 = local579 + local589;
													}
												}
											}
											while (var20 > 0) {
												local1079 = -50;
												local964 = -1;
												@Pc(1088) Class39 local1088;
												for (local579 = 0; local579 < var20; local579++) {
													local1088 = Static64.aClass39Array1[local579];
													if (local1088.anInt1475 != Static28.anInt638) {
														if (local1088.anInt1476 > local1079) {
															local1079 = local1088.anInt1476;
															local964 = local579;
														} else if (local1088.anInt1476 == local1079) {
															local589 = local1088.anInt1473 - Static189.anInt3928;
															var16 = local1088.anInt1477 - Static172.anInt679;
															var17 = Static64.aClass39Array1[local964].anInt1473 - Static189.anInt3928;
															var18 = Static64.aClass39Array1[local964].anInt1477 - Static172.anInt679;
															if (local589 * local589 + var16 * var16 > var17 * var17 + var18 * var18) {
																local964 = local579;
															}
														}
													}
												}
												if (local964 == -1) {
													break;
												}
												local1088 = Static64.aClass39Array1[local964];
												local1088.anInt1475 = Static28.anInt638;
												if (!Static54.method786(local26, local1088.anInt1480, local1088.anInt1481, local1088.anInt1484, local1088.anInt1482, local1088.aClass7_5.method3148())) {
													local1088.aClass7_5.method3143(local1088.anInt1474, Static181.anInt3781, Static36.anInt864, Static91.anInt2043, Static28.anInt641, local1088.anInt1473 - Static189.anInt3928, local1088.anInt1479 - Static52.anInt1112, local1088.anInt1477 - Static172.anInt679, local1088.aLong54);
												}
												for (local589 = local1088.anInt1480; local589 <= local1088.anInt1481; local589++) {
													for (var16 = local1088.anInt1484; var16 <= local1088.anInt1482; var16++) {
														@Pc(1212) Class2_Sub18 local1212 = local30[local589][var16];
														if (local1212.anInt3302 != 0) {
															Static103.aClass13_6.method304(local1212);
														} else if ((local589 != local17 || var16 != local20) && local1212.aBoolean143) {
															Static103.aClass13_6.method304(local1212);
														}
													}
												}
											}
											if (!local8.aBoolean141) {
												break;
											}
										} catch (@Pc(1250) Exception local1250) {
											local8.aBoolean141 = false;
											break;
										}
									}
								} while (!local8.aBoolean143);
							} while (local8.anInt3302 != 0);
							if (local17 > Static140.anInt3022 || local17 <= Static172.anInt694) {
								break;
							}
							local47 = local30[local17 - 1][local20];
						} while (local47 != null && local47.aBoolean143);
						if (local17 < Static140.anInt3022 || local17 >= Static48.anInt1051 - 1) {
							break;
						}
						local47 = local30[local17 + 1][local20];
					} while (local47 != null && local47.aBoolean143);
					if (local20 > Static2.anInt78 || local20 <= Static216.anInt4536) {
						break;
					}
					local47 = local30[local17][local20 - 1];
				} while (local47 != null && local47.aBoolean143);
				if (local20 < Static2.anInt78 || local20 >= Static102.anInt2328 - 1) {
					break;
				}
				local47 = local30[local17][local20 + 1];
			} while (local47 != null && local47.aBoolean143);
			local8.aBoolean143 = false;
			Static146.anInt3138--;
			@Pc(1354) Class18 local1354 = local8.aClass18_1;
			if (local1354 != null && local1354.anInt516 != 0) {
				if (local1354.aClass7_3 != null) {
					local1354.aClass7_3.method3143(0, Static181.anInt3781, Static36.anInt864, Static91.anInt2043, Static28.anInt641, local1354.anInt508 - Static189.anInt3928, local1354.anInt519 - Static52.anInt1112 - local1354.anInt516, local1354.anInt513 - Static172.anInt679, local1354.aLong30);
				}
				if (local1354.aClass7_4 != null) {
					local1354.aClass7_4.method3143(0, Static181.anInt3781, Static36.anInt864, Static91.anInt2043, Static28.anInt641, local1354.anInt508 - Static189.anInt3928, local1354.anInt519 - Static52.anInt1112 - local1354.anInt516, local1354.anInt513 - Static172.anInt679, local1354.aLong30);
				}
				if (local1354.aClass7_2 != null) {
					local1354.aClass7_2.method3143(0, Static181.anInt3781, Static36.anInt864, Static91.anInt2043, Static28.anInt641, local1354.anInt508 - Static189.anInt3928, local1354.anInt519 - Static52.anInt1112 - local1354.anInt516, local1354.anInt513 - Static172.anInt679, local1354.aLong30);
				}
			}
			if (local8.anInt3296 != 0) {
				@Pc(1449) Class100 local1449 = local8.aClass100_1;
				if (local1449 != null && !Static208.method3038(local26, local17, local20, local1449.aClass7_11.method3148())) {
					if ((local1449.anInt4041 & local8.anInt3296) != 0) {
						local1449.aClass7_11.method3143(0, Static181.anInt3781, Static36.anInt864, Static91.anInt2043, Static28.anInt641, local1449.anInt4036 + local1449.anInt4037 - Static189.anInt3928, local1449.anInt4034 - Static52.anInt1112, local1449.anInt4038 + local1449.anInt4042 - Static172.anInt679, local1449.aLong135);
					} else if (local1449.anInt4041 == 256) {
						local245 = local1449.anInt4036 - Static189.anInt3928;
						local1079 = local1449.anInt4034 - Static52.anInt1112;
						local964 = local1449.anInt4038 - Static172.anInt679;
						local579 = local1449.anInt4033;
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
							local1449.aClass7_11.method3143(0, Static181.anInt3781, Static36.anInt864, Static91.anInt2043, Static28.anInt641, local245 + local1449.anInt4037, local1079, local964 + local1449.anInt4042, local1449.aLong135);
						} else if (local1449.aClass7_10 != null) {
							local1449.aClass7_10.method3143(0, Static181.anInt3781, Static36.anInt864, Static91.anInt2043, Static28.anInt641, local245, local1079, local964, local1449.aLong135);
						}
					}
				}
				local906 = local8.aClass85_1;
				if (local906 != null) {
					if ((local906.anInt3571 & local8.anInt3296) != 0 && !Static60.method843(local26, local17, local20, local906.anInt3571)) {
						local906.aClass7_9.method3143(0, Static181.anInt3781, Static36.anInt864, Static91.anInt2043, Static28.anInt641, local906.anInt3573 - Static189.anInt3928, local906.anInt3575 - Static52.anInt1112, local906.anInt3576 - Static172.anInt679, local906.aLong114);
					}
					if ((local906.anInt3574 & local8.anInt3296) != 0 && !Static60.method843(local26, local17, local20, local906.anInt3574)) {
						local906.aClass7_8.method3143(0, Static181.anInt3781, Static36.anInt864, Static91.anInt2043, Static28.anInt641, local906.anInt3573 - Static189.anInt3928, local906.anInt3575 - Static52.anInt1112, local906.anInt3576 - Static172.anInt679, local906.aLong114);
					}
				}
			}
			@Pc(1669) Class2_Sub18 local1669;
			if (local23 < Static204.anInt4231 - 1) {
				local1669 = Static92.aClass2_Sub18ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1669 != null && local1669.aBoolean143) {
					Static103.aClass13_6.method304(local1669);
				}
			}
			if (local17 < Static140.anInt3022) {
				local1669 = local30[local17 + 1][local20];
				if (local1669 != null && local1669.aBoolean143) {
					Static103.aClass13_6.method304(local1669);
				}
			}
			if (local20 < Static2.anInt78) {
				local1669 = local30[local17][local20 + 1];
				if (local1669 != null && local1669.aBoolean143) {
					Static103.aClass13_6.method304(local1669);
				}
			}
			if (local17 > Static140.anInt3022) {
				local1669 = local30[local17 - 1][local20];
				if (local1669 != null && local1669.aBoolean143) {
					Static103.aClass13_6.method304(local1669);
				}
			}
			if (local20 > Static2.anInt78) {
				local1669 = local30[local17][local20 - 1];
				if (local1669 != null && local1669.aBoolean143) {
					Static103.aClass13_6.method304(local1669);
				}
			}
		}
	}
}

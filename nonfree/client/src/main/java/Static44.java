import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "Lclient!ka;")
	public static Class1_Sub8 aClass1_Sub8_1;

	@OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
	public static int anInt1086;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "Z")
	public static boolean aBoolean40 = false;

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
	public static int anInt1083 = 0;

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "Z")
	public static boolean aBoolean41 = false;

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "Lclient!tg;")
	private static Class81 aClass81_384 = Static120.method2057("You have only just left another world)3");

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "Lclient!tg;")
	public static Class81 aClass81_385 = aClass81_384;

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "Lclient!tg;")
	private static Class81 aClass81_387 = Static120.method2057("Loading fonts )2 ");

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "Lclient!tg;")
	public static Class81 aClass81_386 = aClass81_387;

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
	public static int anInt1084 = 0;

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
	public static int anInt1085 = 0;

	@OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
	public static int anInt1087 = 0;

	@OriginalMember(owner = "client!eg", name = "m", descriptor = "Lclient!tg;")
	public static Class81 aClass81_388 = Static120.method2057(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
	public static int anInt1088 = 10;

	@OriginalMember(owner = "client!eg", name = "o", descriptor = "Lclient!tg;")
	public static Class81 aClass81_389 = Static120.method2057("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
	public static void method819() {
		aClass81_385 = null;
		aClass81_387 = null;
		aClass81_384 = null;
		aClass81_389 = null;
		aClass81_386 = null;
		aClass1_Sub8_1 = null;
		aClass81_388 = null;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!jc;Z)V")
	public static void method820(@OriginalArg(0) Class1_Sub17 arg0, @OriginalArg(1) boolean arg1) {
		Static179.aClass30_16.method1113(arg0);
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
			@Pc(906) Class22 local906;
			@Pc(1079) int local1079;
			@Pc(964) int local964;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(251) Class75 var11;
										@Pc(592) int var16;
										@Pc(601) int var17;
										@Pc(613) int var18;
										@Pc(335) int var20;
										@Pc(283) boolean var21;
										@Pc(787) Class1_Sub17 var32;
										while (true) {
											do {
												local8 = (Class1_Sub17) Static179.aClass30_16.method1122();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean76);
											local17 = local8.anInt1853;
											local20 = local8.anInt1848;
											local23 = local8.anInt1846;
											local26 = local8.anInt1854;
											local30 = Static167.aClass1_Sub17ArrayArrayArray1[local23];
											if (!local8.aBoolean74) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local47 = Static167.aClass1_Sub17ArrayArrayArray1[local23 - 1][local17][local20];
													if (local47 != null && local47.aBoolean76) {
														continue;
													}
												}
												if (local17 <= Static21.anInt535 && local17 > Static138.anInt2966) {
													local47 = local30[local17 - 1][local20];
													if (local47 != null && local47.aBoolean76 && (local47.aBoolean74 || (local8.anInt1852 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static21.anInt535 && local17 < Static14.anInt299 - 1) {
													local47 = local30[local17 + 1][local20];
													if (local47 != null && local47.aBoolean76 && (local47.aBoolean74 || (local8.anInt1852 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static183.anInt4109 && local20 > Static157.anInt3570) {
													local47 = local30[local17][local20 - 1];
													if (local47 != null && local47.aBoolean76 && (local47.aBoolean74 || (local8.anInt1852 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static183.anInt4109 && local20 < Static146.anInt3197 - 1) {
													local47 = local30[local17][local20 + 1];
													if (local47 != null && local47.aBoolean76 && (local47.aBoolean74 || (local8.anInt1852 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean74 = false;
											if (local8.aClass1_Sub17_1 != null) {
												local47 = local8.aClass1_Sub17_1;
												if (local47.aClass54_1 == null) {
													if (local47.aClass12_1 != null && !Static112.method1974(0, local17, local20)) {
														Static157.method2709(local47.aClass12_1, Static119.anInt2638, Static120.anInt2663, Static56.anInt1357, Static33.anInt927, local17, local20);
													}
												} else if (!Static112.method1974(0, local17, local20)) {
													Static157.method2707(local47.aClass54_1, 0, Static119.anInt2638, Static120.anInt2663, Static56.anInt1357, Static33.anInt927, local17, local20);
												}
												@Pc(219) Class22 local219 = local47.aClass22_1;
												if (local219 != null) {
													local219.aClass1_Sub2_Sub1_1.method2784(0, Static119.anInt2638, Static120.anInt2663, Static56.anInt1357, Static33.anInt927, local219.anInt1125 - Static122.anInt2747, local219.anInt1120 - Static89.anInt4025, local219.anInt1124 - Static184.anInt4119, local219.aLong37);
												}
												for (local245 = 0; local245 < local47.anInt1851; local245++) {
													var11 = local47.aClass75Array2[local245];
													if (var11 != null) {
														var11.aClass1_Sub2_Sub1_7.method2784(var11.anInt3166, Static119.anInt2638, Static120.anInt2663, Static56.anInt1357, Static33.anInt927, var11.anInt3152 - Static122.anInt2747, var11.anInt3156 - Static89.anInt4025, var11.anInt3159 - Static184.anInt4119, var11.aLong118);
													}
												}
											}
											var21 = false;
											if (local8.aClass54_1 == null) {
												if (local8.aClass12_1 != null && !Static112.method1974(local26, local17, local20)) {
													var21 = true;
													Static157.method2709(local8.aClass12_1, Static119.anInt2638, Static120.anInt2663, Static56.anInt1357, Static33.anInt927, local17, local20);
												}
											} else if (!Static112.method1974(local26, local17, local20)) {
												var21 = true;
												if (local8.aClass54_1.anInt2169 != 12345678 || Static148.aBoolean143 && local23 <= Static136.anInt2921) {
													Static157.method2707(local8.aClass54_1, local26, Static119.anInt2638, Static120.anInt2663, Static56.anInt1357, Static33.anInt927, local17, local20);
												}
											}
											var20 = 0;
											local245 = 0;
											@Pc(340) Class22 local340 = local8.aClass22_1;
											@Pc(343) Class62 local343 = local8.aClass62_1;
											if (local340 != null || local343 != null) {
												if (Static21.anInt535 == local17) {
													var20++;
												} else if (Static21.anInt535 < local17) {
													var20 += 2;
												}
												if (Static183.anInt4109 == local20) {
													var20 += 3;
												} else if (Static183.anInt4109 > local20) {
													var20 += 6;
												}
												local245 = Static72.anIntArray151[var20];
												local8.anInt1847 = Static20.anIntArray23[var20];
											}
											if (local340 != null) {
												if ((local340.anInt1121 & Static103.anIntArray245[var20]) == 0) {
													local8.anInt1850 = 0;
												} else if (local340.anInt1121 == 16) {
													local8.anInt1850 = 3;
													local8.anInt1856 = Static62.anIntArray126[var20];
													local8.anInt1855 = 3 - local8.anInt1856;
												} else if (local340.anInt1121 == 32) {
													local8.anInt1850 = 6;
													local8.anInt1856 = Static2.anIntArray1[var20];
													local8.anInt1855 = 6 - local8.anInt1856;
												} else if (local340.anInt1121 == 64) {
													local8.anInt1850 = 12;
													local8.anInt1856 = Static139.anIntArray322[var20];
													local8.anInt1855 = 12 - local8.anInt1856;
												} else {
													local8.anInt1850 = 9;
													local8.anInt1856 = Static162.anIntArray387[var20];
													local8.anInt1855 = 9 - local8.anInt1856;
												}
												if ((local340.anInt1121 & local245) != 0 && !Static106.method1753(local26, local17, local20, local340.anInt1121)) {
													local340.aClass1_Sub2_Sub1_1.method2784(0, Static119.anInt2638, Static120.anInt2663, Static56.anInt1357, Static33.anInt927, local340.anInt1125 - Static122.anInt2747, local340.anInt1120 - Static89.anInt4025, local340.anInt1124 - Static184.anInt4119, local340.aLong37);
												}
												if ((local340.anInt1127 & local245) != 0 && !Static106.method1753(local26, local17, local20, local340.anInt1127)) {
													local340.aClass1_Sub2_Sub1_2.method2784(0, Static119.anInt2638, Static120.anInt2663, Static56.anInt1357, Static33.anInt927, local340.anInt1125 - Static122.anInt2747, local340.anInt1120 - Static89.anInt4025, local340.anInt1124 - Static184.anInt4119, local340.aLong37);
												}
											}
											if (local343 != null && !Static18.method391(local26, local17, local20, local343.aClass1_Sub2_Sub1_5.aShort36)) {
												if ((local343.anInt2635 & local245) != 0) {
													local343.aClass1_Sub2_Sub1_5.method2784(0, Static119.anInt2638, Static120.anInt2663, Static56.anInt1357, Static33.anInt927, local343.anInt2634 + local343.anInt2637 - Static122.anInt2747, local343.anInt2629 - Static89.anInt4025, local343.anInt2631 + local343.anInt2636 - Static184.anInt4119, local343.aLong94);
												} else if (local343.anInt2635 == 256) {
													local579 = local343.anInt2634 - Static122.anInt2747;
													local584 = local343.anInt2629 - Static89.anInt4025;
													local589 = local343.anInt2631 - Static184.anInt4119;
													var16 = local343.anInt2632;
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
														local343.aClass1_Sub2_Sub1_5.method2784(0, Static119.anInt2638, Static120.anInt2663, Static56.anInt1357, Static33.anInt927, local579 + local343.anInt2637, local584, local589 + local343.anInt2636, local343.aLong94);
													} else if (local343.aClass1_Sub2_Sub1_6 != null) {
														local343.aClass1_Sub2_Sub1_6.method2784(0, Static119.anInt2638, Static120.anInt2663, Static56.anInt1357, Static33.anInt927, local579, local584, local589, local343.aLong94);
													}
												}
											}
											if (var21) {
												@Pc(660) Class42 local660 = local8.aClass42_1;
												if (local660 != null) {
													local660.aClass1_Sub2_Sub1_3.method2784(0, Static119.anInt2638, Static120.anInt2663, Static56.anInt1357, Static33.anInt927, local660.anInt1834 - Static122.anInt2747, local660.anInt1836 - Static89.anInt4025, local660.anInt1830 - Static184.anInt4119, local660.aLong66);
												}
												@Pc(687) Class83 local687 = local8.aClass83_1;
												if (local687 != null && local687.anInt3908 == 0) {
													if (local687.aClass1_Sub2_Sub1_8 != null) {
														local687.aClass1_Sub2_Sub1_8.method2784(0, Static119.anInt2638, Static120.anInt2663, Static56.anInt1357, Static33.anInt927, local687.anInt3902 - Static122.anInt2747, local687.anInt3911 - Static89.anInt4025, local687.anInt3910 - Static184.anInt4119, local687.aLong138);
													}
													if (local687.aClass1_Sub2_Sub1_9 != null) {
														local687.aClass1_Sub2_Sub1_9.method2784(0, Static119.anInt2638, Static120.anInt2663, Static56.anInt1357, Static33.anInt927, local687.anInt3902 - Static122.anInt2747, local687.anInt3911 - Static89.anInt4025, local687.anInt3910 - Static184.anInt4119, local687.aLong138);
													}
													if (local687.aClass1_Sub2_Sub1_10 != null) {
														local687.aClass1_Sub2_Sub1_10.method2784(0, Static119.anInt2638, Static120.anInt2663, Static56.anInt1357, Static33.anInt927, local687.anInt3902 - Static122.anInt2747, local687.anInt3911 - Static89.anInt4025, local687.anInt3910 - Static184.anInt4119, local687.aLong138);
													}
												}
											}
											local579 = local8.anInt1852;
											if (local579 != 0) {
												if (local17 < Static21.anInt535 && (local579 & 0x4) != 0) {
													var32 = local30[local17 + 1][local20];
													if (var32 != null && var32.aBoolean76) {
														Static179.aClass30_16.method1113(var32);
													}
												}
												if (local20 < Static183.anInt4109 && (local579 & 0x2) != 0) {
													var32 = local30[local17][local20 + 1];
													if (var32 != null && var32.aBoolean76) {
														Static179.aClass30_16.method1113(var32);
													}
												}
												if (local17 > Static21.anInt535 && (local579 & 0x1) != 0) {
													var32 = local30[local17 - 1][local20];
													if (var32 != null && var32.aBoolean76) {
														Static179.aClass30_16.method1113(var32);
													}
												}
												if (local20 > Static183.anInt4109 && (local579 & 0x8) != 0) {
													var32 = local30[local17][local20 - 1];
													if (var32 != null && var32.aBoolean76) {
														Static179.aClass30_16.method1113(var32);
													}
												}
											}
											break;
										}
										if (local8.anInt1850 != 0) {
											var21 = true;
											for (var20 = 0; var20 < local8.anInt1851; var20++) {
												if (local8.aClass75Array2[var20].anInt3157 != Static90.anInt1989 && (local8.anIntArray176[var20] & local8.anInt1850) == local8.anInt1856) {
													var21 = false;
													break;
												}
											}
											if (var21) {
												local906 = local8.aClass22_1;
												if (!Static106.method1753(local26, local17, local20, local906.anInt1121)) {
													local906.aClass1_Sub2_Sub1_1.method2784(0, Static119.anInt2638, Static120.anInt2663, Static56.anInt1357, Static33.anInt927, local906.anInt1125 - Static122.anInt2747, local906.anInt1120 - Static89.anInt4025, local906.anInt1124 - Static184.anInt4119, local906.aLong37);
												}
												local8.anInt1850 = 0;
											}
										}
										if (!local8.aBoolean75) {
											break;
										}
										try {
											@Pc(944) int local944 = local8.anInt1851;
											local8.aBoolean75 = false;
											var20 = 0;
											label558: for (local245 = 0; local245 < local944; local245++) {
												var11 = local8.aClass75Array2[local245];
												if (var11.anInt3157 != Static90.anInt1989) {
													for (local964 = var11.anInt3164; local964 <= var11.anInt3161; local964++) {
														for (local579 = var11.anInt3158; local579 <= var11.anInt3165; local579++) {
															var32 = local30[local964][local579];
															if (var32.aBoolean74) {
																local8.aBoolean75 = true;
																continue label558;
															}
															if (var32.anInt1850 != 0) {
																local589 = 0;
																if (local964 > var11.anInt3164) {
																	local589++;
																}
																if (local964 < var11.anInt3161) {
																	local589 += 4;
																}
																if (local579 > var11.anInt3158) {
																	local589 += 8;
																}
																if (local579 < var11.anInt3165) {
																	local589 += 2;
																}
																if ((local589 & var32.anInt1850) == local8.anInt1855) {
																	local8.aBoolean75 = true;
																	continue label558;
																}
															}
														}
													}
													Static59.aClass75Array1[var20++] = var11;
													local579 = Static21.anInt535 - var11.anInt3164;
													local584 = var11.anInt3161 - Static21.anInt535;
													if (local584 > local579) {
														local579 = local584;
													}
													local589 = Static183.anInt4109 - var11.anInt3158;
													var16 = var11.anInt3165 - Static183.anInt4109;
													if (var16 > local589) {
														var11.anInt3160 = local579 + var16;
													} else {
														var11.anInt3160 = local579 + local589;
													}
												}
											}
											while (var20 > 0) {
												local1079 = -50;
												local964 = -1;
												@Pc(1088) Class75 local1088;
												for (local579 = 0; local579 < var20; local579++) {
													local1088 = Static59.aClass75Array1[local579];
													if (local1088.anInt3157 != Static90.anInt1989) {
														if (local1088.anInt3160 > local1079) {
															local1079 = local1088.anInt3160;
															local964 = local579;
														} else if (local1088.anInt3160 == local1079) {
															local589 = local1088.anInt3152 - Static122.anInt2747;
															var16 = local1088.anInt3159 - Static184.anInt4119;
															var17 = Static59.aClass75Array1[local964].anInt3152 - Static122.anInt2747;
															var18 = Static59.aClass75Array1[local964].anInt3159 - Static184.anInt4119;
															if (local589 * local589 + var16 * var16 > var17 * var17 + var18 * var18) {
																local964 = local579;
															}
														}
													}
												}
												if (local964 == -1) {
													break;
												}
												local1088 = Static59.aClass75Array1[local964];
												local1088.anInt3157 = Static90.anInt1989;
												if (!Static125.method2157(local26, local1088.anInt3164, local1088.anInt3161, local1088.anInt3158, local1088.anInt3165, local1088.aClass1_Sub2_Sub1_7.aShort36)) {
													local1088.aClass1_Sub2_Sub1_7.method2784(local1088.anInt3166, Static119.anInt2638, Static120.anInt2663, Static56.anInt1357, Static33.anInt927, local1088.anInt3152 - Static122.anInt2747, local1088.anInt3156 - Static89.anInt4025, local1088.anInt3159 - Static184.anInt4119, local1088.aLong118);
												}
												for (local589 = local1088.anInt3164; local589 <= local1088.anInt3161; local589++) {
													for (var16 = local1088.anInt3158; var16 <= local1088.anInt3165; var16++) {
														@Pc(1212) Class1_Sub17 local1212 = local30[local589][var16];
														if (local1212.anInt1850 != 0) {
															Static179.aClass30_16.method1113(local1212);
														} else if ((local589 != local17 || var16 != local20) && local1212.aBoolean76) {
															Static179.aClass30_16.method1113(local1212);
														}
													}
												}
											}
											if (!local8.aBoolean75) {
												break;
											}
										} catch (@Pc(1250) Exception local1250) {
											local8.aBoolean75 = false;
											break;
										}
									}
								} while (!local8.aBoolean76);
							} while (local8.anInt1850 != 0);
							if (local17 > Static21.anInt535 || local17 <= Static138.anInt2966) {
								break;
							}
							local47 = local30[local17 - 1][local20];
						} while (local47 != null && local47.aBoolean76);
						if (local17 < Static21.anInt535 || local17 >= Static14.anInt299 - 1) {
							break;
						}
						local47 = local30[local17 + 1][local20];
					} while (local47 != null && local47.aBoolean76);
					if (local20 > Static183.anInt4109 || local20 <= Static157.anInt3570) {
						break;
					}
					local47 = local30[local17][local20 - 1];
				} while (local47 != null && local47.aBoolean76);
				if (local20 < Static183.anInt4109 || local20 >= Static146.anInt3197 - 1) {
					break;
				}
				local47 = local30[local17][local20 + 1];
			} while (local47 != null && local47.aBoolean76);
			local8.aBoolean76 = false;
			Static153.anInt3492--;
			@Pc(1354) Class83 local1354 = local8.aClass83_1;
			if (local1354 != null && local1354.anInt3908 != 0) {
				if (local1354.aClass1_Sub2_Sub1_8 != null) {
					local1354.aClass1_Sub2_Sub1_8.method2784(0, Static119.anInt2638, Static120.anInt2663, Static56.anInt1357, Static33.anInt927, local1354.anInt3902 - Static122.anInt2747, local1354.anInt3911 - Static89.anInt4025 - local1354.anInt3908, local1354.anInt3910 - Static184.anInt4119, local1354.aLong138);
				}
				if (local1354.aClass1_Sub2_Sub1_9 != null) {
					local1354.aClass1_Sub2_Sub1_9.method2784(0, Static119.anInt2638, Static120.anInt2663, Static56.anInt1357, Static33.anInt927, local1354.anInt3902 - Static122.anInt2747, local1354.anInt3911 - Static89.anInt4025 - local1354.anInt3908, local1354.anInt3910 - Static184.anInt4119, local1354.aLong138);
				}
				if (local1354.aClass1_Sub2_Sub1_10 != null) {
					local1354.aClass1_Sub2_Sub1_10.method2784(0, Static119.anInt2638, Static120.anInt2663, Static56.anInt1357, Static33.anInt927, local1354.anInt3902 - Static122.anInt2747, local1354.anInt3911 - Static89.anInt4025 - local1354.anInt3908, local1354.anInt3910 - Static184.anInt4119, local1354.aLong138);
				}
			}
			if (local8.anInt1847 != 0) {
				@Pc(1449) Class62 local1449 = local8.aClass62_1;
				if (local1449 != null && !Static18.method391(local26, local17, local20, local1449.aClass1_Sub2_Sub1_5.aShort36)) {
					if ((local1449.anInt2635 & local8.anInt1847) != 0) {
						local1449.aClass1_Sub2_Sub1_5.method2784(0, Static119.anInt2638, Static120.anInt2663, Static56.anInt1357, Static33.anInt927, local1449.anInt2634 + local1449.anInt2637 - Static122.anInt2747, local1449.anInt2629 - Static89.anInt4025, local1449.anInt2631 + local1449.anInt2636 - Static184.anInt4119, local1449.aLong94);
					} else if (local1449.anInt2635 == 256) {
						local245 = local1449.anInt2634 - Static122.anInt2747;
						local1079 = local1449.anInt2629 - Static89.anInt4025;
						local964 = local1449.anInt2631 - Static184.anInt4119;
						local579 = local1449.anInt2632;
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
							local1449.aClass1_Sub2_Sub1_5.method2784(0, Static119.anInt2638, Static120.anInt2663, Static56.anInt1357, Static33.anInt927, local245 + local1449.anInt2637, local1079, local964 + local1449.anInt2636, local1449.aLong94);
						} else if (local1449.aClass1_Sub2_Sub1_6 != null) {
							local1449.aClass1_Sub2_Sub1_6.method2784(0, Static119.anInt2638, Static120.anInt2663, Static56.anInt1357, Static33.anInt927, local245, local1079, local964, local1449.aLong94);
						}
					}
				}
				local906 = local8.aClass22_1;
				if (local906 != null) {
					if ((local906.anInt1127 & local8.anInt1847) != 0 && !Static106.method1753(local26, local17, local20, local906.anInt1127)) {
						local906.aClass1_Sub2_Sub1_2.method2784(0, Static119.anInt2638, Static120.anInt2663, Static56.anInt1357, Static33.anInt927, local906.anInt1125 - Static122.anInt2747, local906.anInt1120 - Static89.anInt4025, local906.anInt1124 - Static184.anInt4119, local906.aLong37);
					}
					if ((local906.anInt1121 & local8.anInt1847) != 0 && !Static106.method1753(local26, local17, local20, local906.anInt1121)) {
						local906.aClass1_Sub2_Sub1_1.method2784(0, Static119.anInt2638, Static120.anInt2663, Static56.anInt1357, Static33.anInt927, local906.anInt1125 - Static122.anInt2747, local906.anInt1120 - Static89.anInt4025, local906.anInt1124 - Static184.anInt4119, local906.aLong37);
					}
				}
			}
			@Pc(1669) Class1_Sub17 local1669;
			if (local23 < Static77.anInt1828 - 1) {
				local1669 = Static167.aClass1_Sub17ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1669 != null && local1669.aBoolean76) {
					Static179.aClass30_16.method1113(local1669);
				}
			}
			if (local17 < Static21.anInt535) {
				local1669 = local30[local17 + 1][local20];
				if (local1669 != null && local1669.aBoolean76) {
					Static179.aClass30_16.method1113(local1669);
				}
			}
			if (local20 < Static183.anInt4109) {
				local1669 = local30[local17][local20 + 1];
				if (local1669 != null && local1669.aBoolean76) {
					Static179.aClass30_16.method1113(local1669);
				}
			}
			if (local17 > Static21.anInt535) {
				local1669 = local30[local17 - 1][local20];
				if (local1669 != null && local1669.aBoolean76) {
					Static179.aClass30_16.method1113(local1669);
				}
			}
			if (local20 > Static183.anInt4109) {
				local1669 = local30[local17][local20 - 1];
				if (local1669 != null && local1669.aBoolean76) {
					Static179.aClass30_16.method1113(local1669);
				}
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)Lclient!ta;")
	public static Class1_Sub2_Sub16 method821(@OriginalArg(1) int arg0) {
		@Pc(14) Class1_Sub2_Sub16 local14 = (Class1_Sub2_Sub16) Static109.aClass59_19.method1970((long) arg0);
		if (local14 != null) {
			return local14;
		}
		@Pc(28) byte[] local28 = Static181.aClass82_72.method2942(arg0, 4);
		local14 = new Class1_Sub2_Sub16();
		if (local28 != null) {
			local14.method2703(new Class1_Sub8(local28), arg0);
		}
		Static109.aClass59_19.method1973(local14, (long) arg0);
		return local14;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)Lclient!vg;")
	public static Class1_Sub2_Sub19 method822(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub19 local10 = (Class1_Sub2_Sub19) Static40.aClass59_8.method1970((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static9.aClass82_3.method2942(arg0, 8);
		local10 = new Class1_Sub2_Sub19();
		if (local20 != null) {
			local10.method3079(new Class1_Sub8(local20));
		}
		Static40.aClass59_8.method1973(local10, (long) arg0);
		return local10;
	}
}

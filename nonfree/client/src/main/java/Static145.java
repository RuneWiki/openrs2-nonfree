import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!rf", name = "W", descriptor = "Lclient!bg;")
	public static Class11 aClass11_110;

	@OriginalMember(owner = "client!rf", name = "Z", descriptor = "I")
	public static int anInt3081;

	@OriginalMember(owner = "client!rf", name = "R", descriptor = "I")
	public static int anInt3076 = 0;

	@OriginalMember(owner = "client!rf", name = "U", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1398 = Static32.method683("Your account is already logged in)3");

	@OriginalMember(owner = "client!rf", name = "X", descriptor = "[J")
	public static long[] aLongArray18 = new long[32];

	@OriginalMember(owner = "client!rf", name = "cb", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1399 = Static32.method683("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!rf", name = "eb", descriptor = "I")
	public static int anInt3085 = 0;

	@OriginalMember(owner = "client!rf", name = "fb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1400 = aClass49_1398;

	@OriginalMember(owner = "client!rf", name = "gb", descriptor = "I")
	private static final int anInt3086 = 2301979;

	@OriginalMember(owner = "client!rf", name = "lb", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1402 = Static32.method683("Loaded title screen");

	@OriginalMember(owner = "client!rf", name = "ib", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1401 = aClass49_1402;

	@OriginalMember(owner = "client!rf", name = "mb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1403 = aClass49_1399;

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(Z)V")
	public static void method2392() {
		aClass49_1402 = null;
		aClass49_1403 = null;
		aClass11_110 = null;
		aClass49_1399 = null;
		aClass49_1400 = null;
		aLongArray18 = null;
		aClass49_1401 = null;
		aClass49_1398 = null;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!ab;Z)V")
	public static void method2393(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		Static170.aClass81_14.method2683(arg0);
		while (true) {
			@Pc(8) Class2_Sub1 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(30) Class2_Sub1[][] local30;
			@Pc(47) Class2_Sub1 local47;
			@Pc(245) int local245;
			@Pc(579) int local579;
			@Pc(584) int local584;
			@Pc(589) int local589;
			@Pc(906) Class7 local906;
			@Pc(1079) int local1079;
			@Pc(964) int local964;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(251) Class22 var11;
										@Pc(592) int var16;
										@Pc(601) int var17;
										@Pc(613) int var18;
										@Pc(335) int var20;
										@Pc(283) boolean var21;
										@Pc(787) Class2_Sub1 var32;
										while (true) {
											do {
												local8 = (Class2_Sub1) Static170.aClass81_14.method2681();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean3);
											local17 = local8.anInt19;
											local20 = local8.anInt13;
											local23 = local8.anInt18;
											local26 = local8.anInt24;
											local30 = Static72.aClass2_Sub1ArrayArrayArray1[local23];
											if (!local8.aBoolean2) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local47 = Static72.aClass2_Sub1ArrayArrayArray1[local23 - 1][local17][local20];
													if (local47 != null && local47.aBoolean3) {
														continue;
													}
												}
												if (local17 <= Static140.anInt3001 && local17 > Static4.anInt67) {
													local47 = local30[local17 - 1][local20];
													if (local47 != null && local47.aBoolean3 && (local47.aBoolean2 || (local8.anInt20 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static140.anInt3001 && local17 < Static124.anInt2736 - 1) {
													local47 = local30[local17 + 1][local20];
													if (local47 != null && local47.aBoolean3 && (local47.aBoolean2 || (local8.anInt20 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static30.anInt743 && local20 > Static23.anInt501) {
													local47 = local30[local17][local20 - 1];
													if (local47 != null && local47.aBoolean3 && (local47.aBoolean2 || (local8.anInt20 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static30.anInt743 && local20 < Static30.anInt741 - 1) {
													local47 = local30[local17][local20 + 1];
													if (local47 != null && local47.aBoolean3 && (local47.aBoolean2 || (local8.anInt20 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean2 = false;
											if (local8.aClass2_Sub1_1 != null) {
												local47 = local8.aClass2_Sub1_1;
												if (local47.aClass59_1 == null) {
													if (local47.aClass21_1 != null && !Static177.method2902(0, local17, local20)) {
														Static131.method2842(local47.aClass21_1, Static126.anInt2751, Static105.anInt2201, Static163.anInt695, Static46.anInt1062, local17, local20);
													}
												} else if (!Static177.method2902(0, local17, local20)) {
													Static118.method1995(local47.aClass59_1, 0, Static126.anInt2751, Static105.anInt2201, Static163.anInt695, Static46.anInt1062, local17, local20);
												}
												@Pc(219) Class7 local219 = local47.aClass7_1;
												if (local219 != null) {
													local219.aClass2_Sub2_Sub3_1.method2726(0, Static126.anInt2751, Static105.anInt2201, Static163.anInt695, Static46.anInt1062, local219.anInt192 - Static17.anInt2522, local219.anInt186 - Static156.anInt3422, local219.anInt190 - Static128.anInt2775, local219.aLong13);
												}
												for (local245 = 0; local245 < local47.anInt15; local245++) {
													var11 = local47.aClass22Array1[local245];
													if (var11 != null) {
														var11.aClass2_Sub2_Sub3_6.method2726(var11.anInt998, Static126.anInt2751, Static105.anInt2201, Static163.anInt695, Static46.anInt1062, var11.anInt995 - Static17.anInt2522, var11.anInt993 - Static156.anInt3422, var11.anInt985 - Static128.anInt2775, var11.aLong41);
													}
												}
											}
											var21 = false;
											if (local8.aClass59_1 == null) {
												if (local8.aClass21_1 != null && !Static177.method2902(local26, local17, local20)) {
													var21 = true;
													Static131.method2842(local8.aClass21_1, Static126.anInt2751, Static105.anInt2201, Static163.anInt695, Static46.anInt1062, local17, local20);
												}
											} else if (!Static177.method2902(local26, local17, local20)) {
												var21 = true;
												if (local8.aClass59_1.anInt2317 != 12345678 || Static113.aBoolean102 && local23 <= Static4.anInt65) {
													Static118.method1995(local8.aClass59_1, local26, Static126.anInt2751, Static105.anInt2201, Static163.anInt695, Static46.anInt1062, local17, local20);
												}
											}
											var20 = 0;
											local245 = 0;
											@Pc(340) Class7 local340 = local8.aClass7_1;
											@Pc(343) Class47 local343 = local8.aClass47_1;
											if (local340 != null || local343 != null) {
												if (Static140.anInt3001 == local17) {
													var20++;
												} else if (Static140.anInt3001 < local17) {
													var20 += 2;
												}
												if (Static30.anInt743 == local20) {
													var20 += 3;
												} else if (Static30.anInt743 > local20) {
													var20 += 6;
												}
												local245 = Static68.anIntArray169[var20];
												local8.anInt27 = Static19.anIntArray34[var20];
											}
											if (local340 != null) {
												if ((local340.anInt187 & Static176.anIntArray360[var20]) == 0) {
													local8.anInt21 = 0;
												} else if (local340.anInt187 == 16) {
													local8.anInt21 = 3;
													local8.anInt23 = Static8.anIntArray209[var20];
													local8.anInt17 = 3 - local8.anInt23;
												} else if (local340.anInt187 == 32) {
													local8.anInt21 = 6;
													local8.anInt23 = Static124.anIntArray260[var20];
													local8.anInt17 = 6 - local8.anInt23;
												} else if (local340.anInt187 == 64) {
													local8.anInt21 = 12;
													local8.anInt23 = Static4.anIntArray7[var20];
													local8.anInt17 = 12 - local8.anInt23;
												} else {
													local8.anInt21 = 9;
													local8.anInt23 = Static133.anIntArray329[var20];
													local8.anInt17 = 9 - local8.anInt23;
												}
												if ((local340.anInt187 & local245) != 0 && !Static103.method1758(local26, local17, local20, local340.anInt187)) {
													local340.aClass2_Sub2_Sub3_1.method2726(0, Static126.anInt2751, Static105.anInt2201, Static163.anInt695, Static46.anInt1062, local340.anInt192 - Static17.anInt2522, local340.anInt186 - Static156.anInt3422, local340.anInt190 - Static128.anInt2775, local340.aLong13);
												}
												if ((local340.anInt193 & local245) != 0 && !Static103.method1758(local26, local17, local20, local340.anInt193)) {
													local340.aClass2_Sub2_Sub3_2.method2726(0, Static126.anInt2751, Static105.anInt2201, Static163.anInt695, Static46.anInt1062, local340.anInt192 - Static17.anInt2522, local340.anInt186 - Static156.anInt3422, local340.anInt190 - Static128.anInt2775, local340.aLong13);
												}
											}
											if (local343 != null && !Static24.method458(local26, local17, local20, local343.aClass2_Sub2_Sub3_8.aShort34)) {
												if ((local343.anInt1941 & local245) != 0) {
													local343.aClass2_Sub2_Sub3_8.method2726(0, Static126.anInt2751, Static105.anInt2201, Static163.anInt695, Static46.anInt1062, local343.anInt1947 + local343.anInt1943 - Static17.anInt2522, local343.anInt1936 - Static156.anInt3422, local343.anInt1937 + local343.anInt1944 - Static128.anInt2775, local343.aLong89);
												} else if (local343.anInt1941 == 256) {
													local579 = local343.anInt1947 - Static17.anInt2522;
													local584 = local343.anInt1936 - Static156.anInt3422;
													local589 = local343.anInt1937 - Static128.anInt2775;
													var16 = local343.anInt1942;
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
														local343.aClass2_Sub2_Sub3_8.method2726(0, Static126.anInt2751, Static105.anInt2201, Static163.anInt695, Static46.anInt1062, local579 + local343.anInt1943, local584, local589 + local343.anInt1944, local343.aLong89);
													} else if (local343.aClass2_Sub2_Sub3_9 != null) {
														local343.aClass2_Sub2_Sub3_9.method2726(0, Static126.anInt2751, Static105.anInt2201, Static163.anInt695, Static46.anInt1062, local579, local584, local589, local343.aLong89);
													}
												}
											}
											if (var21) {
												@Pc(660) Class26 local660 = local8.aClass26_1;
												if (local660 != null) {
													local660.aClass2_Sub2_Sub3_7.method2726(0, Static126.anInt2751, Static105.anInt2201, Static163.anInt695, Static46.anInt1062, local660.anInt1064 - Static17.anInt2522, local660.anInt1061 - Static156.anInt3422, local660.anInt1063 - Static128.anInt2775, local660.aLong44);
												}
												@Pc(687) Class17 local687 = local8.aClass17_1;
												if (local687 != null && local687.anInt886 == 0) {
													if (local687.aClass2_Sub2_Sub3_3 != null) {
														local687.aClass2_Sub2_Sub3_3.method2726(0, Static126.anInt2751, Static105.anInt2201, Static163.anInt695, Static46.anInt1062, local687.anInt885 - Static17.anInt2522, local687.anInt888 - Static156.anInt3422, local687.anInt890 - Static128.anInt2775, local687.aLong37);
													}
													if (local687.aClass2_Sub2_Sub3_5 != null) {
														local687.aClass2_Sub2_Sub3_5.method2726(0, Static126.anInt2751, Static105.anInt2201, Static163.anInt695, Static46.anInt1062, local687.anInt885 - Static17.anInt2522, local687.anInt888 - Static156.anInt3422, local687.anInt890 - Static128.anInt2775, local687.aLong37);
													}
													if (local687.aClass2_Sub2_Sub3_4 != null) {
														local687.aClass2_Sub2_Sub3_4.method2726(0, Static126.anInt2751, Static105.anInt2201, Static163.anInt695, Static46.anInt1062, local687.anInt885 - Static17.anInt2522, local687.anInt888 - Static156.anInt3422, local687.anInt890 - Static128.anInt2775, local687.aLong37);
													}
												}
											}
											local579 = local8.anInt20;
											if (local579 != 0) {
												if (local17 < Static140.anInt3001 && (local579 & 0x4) != 0) {
													var32 = local30[local17 + 1][local20];
													if (var32 != null && var32.aBoolean3) {
														Static170.aClass81_14.method2683(var32);
													}
												}
												if (local20 < Static30.anInt743 && (local579 & 0x2) != 0) {
													var32 = local30[local17][local20 + 1];
													if (var32 != null && var32.aBoolean3) {
														Static170.aClass81_14.method2683(var32);
													}
												}
												if (local17 > Static140.anInt3001 && (local579 & 0x1) != 0) {
													var32 = local30[local17 - 1][local20];
													if (var32 != null && var32.aBoolean3) {
														Static170.aClass81_14.method2683(var32);
													}
												}
												if (local20 > Static30.anInt743 && (local579 & 0x8) != 0) {
													var32 = local30[local17][local20 - 1];
													if (var32 != null && var32.aBoolean3) {
														Static170.aClass81_14.method2683(var32);
													}
												}
											}
											break;
										}
										if (local8.anInt21 != 0) {
											var21 = true;
											for (var20 = 0; var20 < local8.anInt15; var20++) {
												if (local8.aClass22Array1[var20].anInt987 != Static90.anInt1923 && (local8.anIntArray2[var20] & local8.anInt21) == local8.anInt23) {
													var21 = false;
													break;
												}
											}
											if (var21) {
												local906 = local8.aClass7_1;
												if (!Static103.method1758(local26, local17, local20, local906.anInt187)) {
													local906.aClass2_Sub2_Sub3_1.method2726(0, Static126.anInt2751, Static105.anInt2201, Static163.anInt695, Static46.anInt1062, local906.anInt192 - Static17.anInt2522, local906.anInt186 - Static156.anInt3422, local906.anInt190 - Static128.anInt2775, local906.aLong13);
												}
												local8.anInt21 = 0;
											}
										}
										if (!local8.aBoolean1) {
											break;
										}
										try {
											@Pc(944) int local944 = local8.anInt15;
											local8.aBoolean1 = false;
											var20 = 0;
											label558: for (local245 = 0; local245 < local944; local245++) {
												var11 = local8.aClass22Array1[local245];
												if (var11.anInt987 != Static90.anInt1923) {
													for (local964 = var11.anInt1000; local964 <= var11.anInt983; local964++) {
														for (local579 = var11.anInt988; local579 <= var11.anInt999; local579++) {
															var32 = local30[local964][local579];
															if (var32.aBoolean2) {
																local8.aBoolean1 = true;
																continue label558;
															}
															if (var32.anInt21 != 0) {
																local589 = 0;
																if (local964 > var11.anInt1000) {
																	local589++;
																}
																if (local964 < var11.anInt983) {
																	local589 += 4;
																}
																if (local579 > var11.anInt988) {
																	local589 += 8;
																}
																if (local579 < var11.anInt999) {
																	local589 += 2;
																}
																if ((local589 & var32.anInt21) == local8.anInt17) {
																	local8.aBoolean1 = true;
																	continue label558;
																}
															}
														}
													}
													Static47.aClass22Array2[var20++] = var11;
													local579 = Static140.anInt3001 - var11.anInt1000;
													local584 = var11.anInt983 - Static140.anInt3001;
													if (local584 > local579) {
														local579 = local584;
													}
													local589 = Static30.anInt743 - var11.anInt988;
													var16 = var11.anInt999 - Static30.anInt743;
													if (var16 > local589) {
														var11.anInt992 = local579 + var16;
													} else {
														var11.anInt992 = local579 + local589;
													}
												}
											}
											while (var20 > 0) {
												local1079 = -50;
												local964 = -1;
												@Pc(1088) Class22 local1088;
												for (local579 = 0; local579 < var20; local579++) {
													local1088 = Static47.aClass22Array2[local579];
													if (local1088.anInt987 != Static90.anInt1923) {
														if (local1088.anInt992 > local1079) {
															local1079 = local1088.anInt992;
															local964 = local579;
														} else if (local1088.anInt992 == local1079) {
															local589 = local1088.anInt995 - Static17.anInt2522;
															var16 = local1088.anInt985 - Static128.anInt2775;
															var17 = Static47.aClass22Array2[local964].anInt995 - Static17.anInt2522;
															var18 = Static47.aClass22Array2[local964].anInt985 - Static128.anInt2775;
															if (local589 * local589 + var16 * var16 > var17 * var17 + var18 * var18) {
																local964 = local579;
															}
														}
													}
												}
												if (local964 == -1) {
													break;
												}
												local1088 = Static47.aClass22Array2[local964];
												local1088.anInt987 = Static90.anInt1923;
												if (!Static7.method109(local26, local1088.anInt1000, local1088.anInt983, local1088.anInt988, local1088.anInt999, local1088.aClass2_Sub2_Sub3_6.aShort34)) {
													local1088.aClass2_Sub2_Sub3_6.method2726(local1088.anInt998, Static126.anInt2751, Static105.anInt2201, Static163.anInt695, Static46.anInt1062, local1088.anInt995 - Static17.anInt2522, local1088.anInt993 - Static156.anInt3422, local1088.anInt985 - Static128.anInt2775, local1088.aLong41);
												}
												for (local589 = local1088.anInt1000; local589 <= local1088.anInt983; local589++) {
													for (var16 = local1088.anInt988; var16 <= local1088.anInt999; var16++) {
														@Pc(1212) Class2_Sub1 local1212 = local30[local589][var16];
														if (local1212.anInt21 != 0) {
															Static170.aClass81_14.method2683(local1212);
														} else if ((local589 != local17 || var16 != local20) && local1212.aBoolean3) {
															Static170.aClass81_14.method2683(local1212);
														}
													}
												}
											}
											if (!local8.aBoolean1) {
												break;
											}
										} catch (@Pc(1250) Exception local1250) {
											local8.aBoolean1 = false;
											break;
										}
									}
								} while (!local8.aBoolean3);
							} while (local8.anInt21 != 0);
							if (local17 > Static140.anInt3001 || local17 <= Static4.anInt67) {
								break;
							}
							local47 = local30[local17 - 1][local20];
						} while (local47 != null && local47.aBoolean3);
						if (local17 < Static140.anInt3001 || local17 >= Static124.anInt2736 - 1) {
							break;
						}
						local47 = local30[local17 + 1][local20];
					} while (local47 != null && local47.aBoolean3);
					if (local20 > Static30.anInt743 || local20 <= Static23.anInt501) {
						break;
					}
					local47 = local30[local17][local20 - 1];
				} while (local47 != null && local47.aBoolean3);
				if (local20 < Static30.anInt743 || local20 >= Static30.anInt741 - 1) {
					break;
				}
				local47 = local30[local17][local20 + 1];
			} while (local47 != null && local47.aBoolean3);
			local8.aBoolean3 = false;
			Static33.anInt858--;
			@Pc(1354) Class17 local1354 = local8.aClass17_1;
			if (local1354 != null && local1354.anInt886 != 0) {
				if (local1354.aClass2_Sub2_Sub3_3 != null) {
					local1354.aClass2_Sub2_Sub3_3.method2726(0, Static126.anInt2751, Static105.anInt2201, Static163.anInt695, Static46.anInt1062, local1354.anInt885 - Static17.anInt2522, local1354.anInt888 - Static156.anInt3422 - local1354.anInt886, local1354.anInt890 - Static128.anInt2775, local1354.aLong37);
				}
				if (local1354.aClass2_Sub2_Sub3_5 != null) {
					local1354.aClass2_Sub2_Sub3_5.method2726(0, Static126.anInt2751, Static105.anInt2201, Static163.anInt695, Static46.anInt1062, local1354.anInt885 - Static17.anInt2522, local1354.anInt888 - Static156.anInt3422 - local1354.anInt886, local1354.anInt890 - Static128.anInt2775, local1354.aLong37);
				}
				if (local1354.aClass2_Sub2_Sub3_4 != null) {
					local1354.aClass2_Sub2_Sub3_4.method2726(0, Static126.anInt2751, Static105.anInt2201, Static163.anInt695, Static46.anInt1062, local1354.anInt885 - Static17.anInt2522, local1354.anInt888 - Static156.anInt3422 - local1354.anInt886, local1354.anInt890 - Static128.anInt2775, local1354.aLong37);
				}
			}
			if (local8.anInt27 != 0) {
				@Pc(1449) Class47 local1449 = local8.aClass47_1;
				if (local1449 != null && !Static24.method458(local26, local17, local20, local1449.aClass2_Sub2_Sub3_8.aShort34)) {
					if ((local1449.anInt1941 & local8.anInt27) != 0) {
						local1449.aClass2_Sub2_Sub3_8.method2726(0, Static126.anInt2751, Static105.anInt2201, Static163.anInt695, Static46.anInt1062, local1449.anInt1947 + local1449.anInt1943 - Static17.anInt2522, local1449.anInt1936 - Static156.anInt3422, local1449.anInt1937 + local1449.anInt1944 - Static128.anInt2775, local1449.aLong89);
					} else if (local1449.anInt1941 == 256) {
						local245 = local1449.anInt1947 - Static17.anInt2522;
						local1079 = local1449.anInt1936 - Static156.anInt3422;
						local964 = local1449.anInt1937 - Static128.anInt2775;
						local579 = local1449.anInt1942;
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
							local1449.aClass2_Sub2_Sub3_8.method2726(0, Static126.anInt2751, Static105.anInt2201, Static163.anInt695, Static46.anInt1062, local245 + local1449.anInt1943, local1079, local964 + local1449.anInt1944, local1449.aLong89);
						} else if (local1449.aClass2_Sub2_Sub3_9 != null) {
							local1449.aClass2_Sub2_Sub3_9.method2726(0, Static126.anInt2751, Static105.anInt2201, Static163.anInt695, Static46.anInt1062, local245, local1079, local964, local1449.aLong89);
						}
					}
				}
				local906 = local8.aClass7_1;
				if (local906 != null) {
					if ((local906.anInt193 & local8.anInt27) != 0 && !Static103.method1758(local26, local17, local20, local906.anInt193)) {
						local906.aClass2_Sub2_Sub3_2.method2726(0, Static126.anInt2751, Static105.anInt2201, Static163.anInt695, Static46.anInt1062, local906.anInt192 - Static17.anInt2522, local906.anInt186 - Static156.anInt3422, local906.anInt190 - Static128.anInt2775, local906.aLong13);
					}
					if ((local906.anInt187 & local8.anInt27) != 0 && !Static103.method1758(local26, local17, local20, local906.anInt187)) {
						local906.aClass2_Sub2_Sub3_1.method2726(0, Static126.anInt2751, Static105.anInt2201, Static163.anInt695, Static46.anInt1062, local906.anInt192 - Static17.anInt2522, local906.anInt186 - Static156.anInt3422, local906.anInt190 - Static128.anInt2775, local906.aLong13);
					}
				}
			}
			@Pc(1669) Class2_Sub1 local1669;
			if (local23 < Static40.anInt978 - 1) {
				local1669 = Static72.aClass2_Sub1ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1669 != null && local1669.aBoolean3) {
					Static170.aClass81_14.method2683(local1669);
				}
			}
			if (local17 < Static140.anInt3001) {
				local1669 = local30[local17 + 1][local20];
				if (local1669 != null && local1669.aBoolean3) {
					Static170.aClass81_14.method2683(local1669);
				}
			}
			if (local20 < Static30.anInt743) {
				local1669 = local30[local17][local20 + 1];
				if (local1669 != null && local1669.aBoolean3) {
					Static170.aClass81_14.method2683(local1669);
				}
			}
			if (local17 > Static140.anInt3001) {
				local1669 = local30[local17 - 1][local20];
				if (local1669 != null && local1669.aBoolean3) {
					Static170.aClass81_14.method2683(local1669);
				}
			}
			if (local20 > Static30.anInt743) {
				local1669 = local30[local17][local20 - 1];
				if (local1669 != null && local1669.aBoolean3) {
					Static170.aClass81_14.method2683(local1669);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "(B)V")
	public static void method2394() {
		if (Static181.aClass39_1 != null) {
			@Pc(3) Class39 local3 = Static181.aClass39_1;
			synchronized (Static181.aClass39_1) {
				Static181.aClass39_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIBI)V")
	public static void method2395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = (arg4 - 32) * arg4 / arg2;
		if (local11 < 8) {
			local11 = 8;
		}
		Static34.aClass2_Sub2_Sub2_Sub2Array3[0].method722(arg3, arg0);
		@Pc(44) int local44 = (arg4 - local11 - 32) * arg1 / (arg2 - arg4);
		Static34.aClass2_Sub2_Sub2_Sub2Array3[1].method722(arg3, arg0 + arg4 - 16);
		Static10.method1861(arg3, arg0 + 16, 16, arg4 - 32, anInt3086);
		Static10.method1861(arg3, local44 + arg0 + 16, 16, local11, Static139.anInt2970);
		Static10.method1855(arg3, local44 + arg0 + 16, local11, Static116.anInt2427);
		Static10.method1855(arg3 + 1, local44 + 16 + arg0, local11, Static116.anInt2427);
		Static10.method1853(arg3, arg0 + local44 + 16, 16, Static116.anInt2427);
		Static10.method1853(arg3, local44 + arg0 + 17, 16, Static116.anInt2427);
		Static10.method1855(arg3 + 15, local44 + arg0 - -16, local11, Static20.anInt455);
		Static10.method1855(arg3 + 14, local44 + 17 + arg0, local11 - 1, Static20.anInt455);
		Static10.method1853(arg3, local44 + arg0 + local11 + 15, 16, Static20.anInt455);
		Static10.method1853(arg3 + 1, arg0 - (-14 - local44 - local11), 15, Static20.anInt455);
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(II)Lclient!lf;")
	public static Class49 method2396(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return Static33.method692(new Class49[] { Static140.aClass49_1354, Static48.method882(arg0), Static81.aClass49_865 });
		} else if (arg0 < 10000000) {
			return Static33.method692(new Class49[] { Static55.aClass49_605, Static48.method882(arg0 / 1000), Static49.aClass49_557, Static81.aClass49_865 });
		} else {
			return Static33.method692(new Class49[] { Static162.aClass49_1605, Static48.method882(arg0 / 1000000), Static13.aClass49_132, Static81.aClass49_865 });
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!lf;Lclient!bg;BLclient!lf;)Lclient!df;")
	public static Class2_Sub2_Sub2_Sub2 method2397(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(3) Class49 arg2) {
		@Pc(4) int local4 = arg1.method2053(arg2);
		@Pc(24) int local24 = arg1.method2056(arg0, local4);
		return Static143.method2359(local4, local24, arg1);
	}
}

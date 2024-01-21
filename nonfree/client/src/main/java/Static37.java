import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "Lclient!fd;")
	public static Class20 aClass20_2;

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "Lclient!ag;")
	public static Class4 aClass4_38;

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
	public static int anInt1202;

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray3 = new byte[50][];

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "Lclient!dd;")
	private static Class13 aClass13_416 = Static161.method2971("Ok");

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "Lclient!dd;")
	private static Class13 aClass13_417 = Static161.method2971("Loading)3)3)3");

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "Lclient!dd;")
	private static Class13 aClass13_418 = Static161.method2971("Free world");

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "Lclient!dd;")
	public static Class13 aClass13_419 = aClass13_418;

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "Lclient!dd;")
	public static Class13 aClass13_420 = aClass13_416;

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "Lclient!dd;")
	public static Class13 aClass13_421 = aClass13_417;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLclient!gi;)V")
	public static void method989(@OriginalArg(1) Class1_Sub2_Sub2_Sub2 arg0) {
		arg0.anInt2559 = 0;
		if (arg0.anInt2601 == 0) {
			arg0.anInt2555 = 1024;
		}
		@Pc(18) int local18 = arg0.anInt2588 - Static78.anInt2168;
		if (arg0.anInt2601 == 1) {
			arg0.anInt2555 = 1536;
		}
		if (arg0.anInt2601 == 2) {
			arg0.anInt2555 = 0;
		}
		@Pc(52) int local52 = arg0.anInt2583 * 64 + arg0.anInt2592 * 128;
		arg0.anInt2606 += (local52 - arg0.anInt2606) / local18;
		if (arg0.anInt2601 == 3) {
			arg0.anInt2555 = 512;
		}
		@Pc(82) int local82 = arg0.anInt2595 * 128 + arg0.anInt2583 * 64;
		arg0.anInt2596 += (local82 - arg0.anInt2596) / local18;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!dd;)Z")
	public static boolean method990(@OriginalArg(1) Class13 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static124.anInt3220; local16++) {
			if (arg0.method894(Static52.aClass13Array13[local16])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V")
	public static void method991() {
		Static136.method2433();
		Static126.method2307();
		Static17.method654();
		Static138.method2478();
		Static125.method2301();
		Static170.method2791();
		Static155.method3051();
		Static109.method2130();
		Static112.method2183();
		Static90.method1895();
		Static17.method657();
		Static21.method687();
		((Class49) Static9.anInterface3_1).method2053();
		Static51.aClass47_11.method1995();
		Static147.aClass4_Sub1_48.method2266();
		Static62.aClass4_Sub1_33.method2266();
		Static95.aClass4_Sub1_35.method2266();
		Static51.aClass4_Sub1_24.method2266();
		Static42.aClass4_Sub1_21.method2266();
		Static144.aClass4_Sub1_47.method2266();
		Static71.aClass4_Sub1_27.method2266();
		Static69.aClass4_Sub1_25.method2266();
		Static170.aClass4_Sub1_53.method2266();
		Static90.aClass4_Sub1_34.method2266();
		Static122.aClass4_Sub1_40.method2266();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLclient!w;)V")
	public static void method992(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static109.anInt2976 != 1) {
			return;
		}
		if (Static122.anInt3191 >= 280 && Static122.anInt3191 <= 294 && Static8.anInt293 >= 4 && Static8.anInt293 <= 18) {
			Static53.method1291(0, 0);
			return;
		}
		if (Static122.anInt3191 >= 295 && Static122.anInt3191 <= 360 && Static8.anInt293 >= 4 && Static8.anInt293 <= 18) {
			Static53.method1291(0, 1);
			return;
		}
		if (Static122.anInt3191 >= 390 && Static122.anInt3191 <= 404 && Static8.anInt293 >= 4 && Static8.anInt293 <= 18) {
			Static53.method1291(1, 0);
			return;
		}
		if (Static122.anInt3191 >= 405 && Static122.anInt3191 <= 470 && Static8.anInt293 >= 4 && Static8.anInt293 <= 18) {
			Static53.method1291(1, 1);
			return;
		}
		if (Static122.anInt3191 >= 500 && Static122.anInt3191 <= 514 && Static8.anInt293 >= 4 && Static8.anInt293 <= 18) {
			Static53.method1291(2, 0);
			return;
		}
		if (Static122.anInt3191 >= 515 && Static122.anInt3191 <= 580 && Static8.anInt293 >= 4 && Static8.anInt293 <= 18) {
			Static53.method1291(2, 1);
			return;
		}
		if (Static122.anInt3191 >= 610 && Static122.anInt3191 <= 624 && Static8.anInt293 >= 4 && Static8.anInt293 <= 18) {
			Static53.method1291(3, 0);
			return;
		}
		if (Static122.anInt3191 >= 625 && Static122.anInt3191 <= 690 && Static8.anInt293 >= 4 && Static8.anInt293 <= 18) {
			Static53.method1291(3, 1);
			return;
		}
		if (Static122.anInt3191 >= 708 && Static8.anInt293 >= 4 && Static122.anInt3191 <= 758 && Static8.anInt293 <= 20) {
			Static95.aBoolean208 = false;
			Static3.aClass1_Sub2_Sub1_Sub3_1.method400(0, 0);
			Static167.aClass1_Sub2_Sub1_Sub3_8.method400(382, 0);
			Static49.aClass1_Sub2_Sub1_Sub4_2.method570(382 - Static49.aClass1_Sub2_Sub1_Sub4_2.anInt514 / 2, 18);
			return;
		}
		if (Static148.anInt3589 == -1) {
			return;
		}
		@Pc(263) Class36 local263 = Static16.aClass36Array1[Static148.anInt3589];
		if (Static18.aBoolean52 == local263.aBoolean167) {
			@Pc(287) byte[] local287 = Static57.method1349(new Class13[] { local263.aClass13_728, Static40.aClass13_449 }).method882();
			Static136.aString4 = new String(local287, 0, local287.length);
			if (Static21.anInt787 != 0) {
				Static88.anInt2486 = 443;
				Static21.anInt787 = 0;
				Static73.anInt2093 = 43594;
				Static187.anInt4125 = 43594;
			}
			Static95.aBoolean208 = false;
			Static89.anInt2510 = local263.anInt2134;
			Static3.aClass1_Sub2_Sub1_Sub3_1.method400(0, 0);
			Static167.aClass1_Sub2_Sub1_Sub3_8.method400(382, 0);
			Static49.aClass1_Sub2_Sub1_Sub4_2.method570(382 - Static49.aClass1_Sub2_Sub1_Sub4_2.anInt514 / 2, 18);
			return;
		}
		@Pc(388) Class13 local388 = Static57.method1349(new Class13[] { Static181.aClass13_1407, local263.aClass13_728, Static40.aClass13_449, Static16.aClass13_255, Static161.aClass13_1403, Static3.method75(Static30.aBoolean72 ? 1 : 0), Static187.aClass13_1435, Static3.method75(Static159.anInt3758), Static163.aClass13_1322, Static3.method75(Static1.anInt63) });
		try {
			arg0.getAppletContext().showDocument(local388.method877(), "_self");
		} catch (@Pc(397) Exception local397) {
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!fc;Z)V")
	public static void method993(@OriginalArg(0) Class1_Sub10 arg0, @OriginalArg(1) boolean arg1) {
		Static185.aClass82_17.method2853(arg0);
		while (true) {
			@Pc(8) Class1_Sub10 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(30) Class1_Sub10[][] local30;
			@Pc(47) Class1_Sub10 local47;
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
										@Pc(251) Class59 var11;
										@Pc(592) int var16;
										@Pc(601) int var17;
										@Pc(613) int var18;
										@Pc(335) int var20;
										@Pc(283) boolean var21;
										@Pc(787) Class1_Sub10 var32;
										while (true) {
											do {
												local8 = (Class1_Sub10) Static185.aClass82_17.method2851();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean114);
											local17 = local8.anInt1543;
											local20 = local8.anInt1549;
											local23 = local8.anInt1537;
											local26 = local8.anInt1539;
											local30 = Static170.aClass1_Sub10ArrayArrayArray35[local23];
											if (!local8.aBoolean112) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local47 = Static170.aClass1_Sub10ArrayArrayArray35[local23 - 1][local17][local20];
													if (local47 != null && local47.aBoolean114) {
														continue;
													}
												}
												if (local17 <= Static81.anInt2305 && local17 > Static7.anInt3156) {
													local47 = local30[local17 - 1][local20];
													if (local47 != null && local47.aBoolean114 && (local47.aBoolean112 || (local8.anInt1538 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static81.anInt2305 && local17 < Static103.anInt2865 - 1) {
													local47 = local30[local17 + 1][local20];
													if (local47 != null && local47.aBoolean114 && (local47.aBoolean112 || (local8.anInt1538 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static40.anInt1276 && local20 > Static106.anInt2880) {
													local47 = local30[local17][local20 - 1];
													if (local47 != null && local47.aBoolean114 && (local47.aBoolean112 || (local8.anInt1538 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static40.anInt1276 && local20 < Static53.anInt1721 - 1) {
													local47 = local30[local17][local20 + 1];
													if (local47 != null && local47.aBoolean114 && (local47.aBoolean112 || (local8.anInt1538 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean112 = false;
											if (local8.aClass1_Sub10_1 != null) {
												local47 = local8.aClass1_Sub10_1;
												if (local47.aClass21_1 == null) {
													if (local47.aClass51_1 != null && !Static1.method49(0, local17, local20)) {
														Static102.method2036(local47.aClass51_1, Static1.anInt64, Static179.anInt4051, Static35.anInt1194, Static125.anInt3233, local17, local20);
													}
												} else if (!Static1.method49(0, local17, local20)) {
													Static1.method45(local47.aClass21_1, 0, Static1.anInt64, Static179.anInt4051, Static35.anInt1194, Static125.anInt3233, local17, local20);
												}
												@Pc(219) Class7 local219 = local47.aClass7_1;
												if (local219 != null) {
													local219.aClass1_Sub2_Sub2_2.method2704(0, Static1.anInt64, Static179.anInt4051, Static35.anInt1194, Static125.anInt3233, local219.anInt736 - Static4.anInt122, local219.anInt737 - Static2.anInt95, local219.anInt739 - Static24.anInt869, local219.aLong33);
												}
												for (local245 = 0; local245 < local47.anInt1544; local245++) {
													var11 = local47.aClass59Array4[local245];
													if (var11 != null) {
														var11.aClass1_Sub2_Sub2_7.method2704(var11.anInt3137, Static1.anInt64, Static179.anInt4051, Static35.anInt1194, Static125.anInt3233, var11.anInt3139 - Static4.anInt122, var11.anInt3138 - Static2.anInt95, var11.anInt3132 - Static24.anInt869, var11.aLong106);
													}
												}
											}
											var21 = false;
											if (local8.aClass21_1 == null) {
												if (local8.aClass51_1 != null && !Static1.method49(local26, local17, local20)) {
													var21 = true;
													Static102.method2036(local8.aClass51_1, Static1.anInt64, Static179.anInt4051, Static35.anInt1194, Static125.anInt3233, local17, local20);
												}
											} else if (!Static1.method49(local26, local17, local20)) {
												var21 = true;
												if (local8.aClass21_1.anInt1642 != 12345678 || Static71.aBoolean156 && local23 <= Static165.anInt3891) {
													Static1.method45(local8.aClass21_1, local26, Static1.anInt64, Static179.anInt4051, Static35.anInt1194, Static125.anInt3233, local17, local20);
												}
											}
											var20 = 0;
											local245 = 0;
											@Pc(340) Class7 local340 = local8.aClass7_1;
											@Pc(343) Class69 local343 = local8.aClass69_1;
											if (local340 != null || local343 != null) {
												if (Static81.anInt2305 == local17) {
													var20++;
												} else if (Static81.anInt2305 < local17) {
													var20 += 2;
												}
												if (Static40.anInt1276 == local20) {
													var20 += 3;
												} else if (Static40.anInt1276 > local20) {
													var20 += 6;
												}
												local245 = Static168.anIntArray436[var20];
												local8.anInt1546 = Static2.anIntArray4[var20];
											}
											if (local340 != null) {
												if ((local340.anInt733 & Static170.anIntArray428[var20]) == 0) {
													local8.anInt1545 = 0;
												} else if (local340.anInt733 == 16) {
													local8.anInt1545 = 3;
													local8.anInt1547 = Static135.anIntArray332[var20];
													local8.anInt1550 = 3 - local8.anInt1547;
												} else if (local340.anInt733 == 32) {
													local8.anInt1545 = 6;
													local8.anInt1547 = Static180.anIntArray447[var20];
													local8.anInt1550 = 6 - local8.anInt1547;
												} else if (local340.anInt733 == 64) {
													local8.anInt1545 = 12;
													local8.anInt1547 = Static118.anIntArray300[var20];
													local8.anInt1550 = 12 - local8.anInt1547;
												} else {
													local8.anInt1545 = 9;
													local8.anInt1547 = Static96.anIntArray263[var20];
													local8.anInt1550 = 9 - local8.anInt1547;
												}
												if ((local340.anInt733 & local245) != 0 && !Static166.method2846(local26, local17, local20, local340.anInt733)) {
													local340.aClass1_Sub2_Sub2_2.method2704(0, Static1.anInt64, Static179.anInt4051, Static35.anInt1194, Static125.anInt3233, local340.anInt736 - Static4.anInt122, local340.anInt737 - Static2.anInt95, local340.anInt739 - Static24.anInt869, local340.aLong33);
												}
												if ((local340.anInt732 & local245) != 0 && !Static166.method2846(local26, local17, local20, local340.anInt732)) {
													local340.aClass1_Sub2_Sub2_1.method2704(0, Static1.anInt64, Static179.anInt4051, Static35.anInt1194, Static125.anInt3233, local340.anInt736 - Static4.anInt122, local340.anInt737 - Static2.anInt95, local340.anInt739 - Static24.anInt869, local340.aLong33);
												}
											}
											if (local343 != null && !Static38.method1004(local26, local17, local20, local343.aClass1_Sub2_Sub2_10.aShort27)) {
												if ((local343.anInt3385 & local245) != 0) {
													local343.aClass1_Sub2_Sub2_10.method2704(0, Static1.anInt64, Static179.anInt4051, Static35.anInt1194, Static125.anInt3233, local343.anInt3380 + local343.anInt3375 - Static4.anInt122, local343.anInt3381 - Static2.anInt95, local343.anInt3376 + local343.anInt3383 - Static24.anInt869, local343.aLong114);
												} else if (local343.anInt3385 == 256) {
													local579 = local343.anInt3380 - Static4.anInt122;
													local584 = local343.anInt3381 - Static2.anInt95;
													local589 = local343.anInt3376 - Static24.anInt869;
													var16 = local343.anInt3374;
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
														local343.aClass1_Sub2_Sub2_10.method2704(0, Static1.anInt64, Static179.anInt4051, Static35.anInt1194, Static125.anInt3233, local579 + local343.anInt3375, local584, local589 + local343.anInt3383, local343.aLong114);
													} else if (local343.aClass1_Sub2_Sub2_9 != null) {
														local343.aClass1_Sub2_Sub2_9.method2704(0, Static1.anInt64, Static179.anInt4051, Static35.anInt1194, Static125.anInt3233, local579, local584, local589, local343.aLong114);
													}
												}
											}
											if (var21) {
												@Pc(660) Class56 local660 = local8.aClass56_1;
												if (local660 != null) {
													local660.aClass1_Sub2_Sub2_6.method2704(0, Static1.anInt64, Static179.anInt4051, Static35.anInt1194, Static125.anInt3233, local660.anInt3072 - Static4.anInt122, local660.anInt3074 - Static2.anInt95, local660.anInt3073 - Static24.anInt869, local660.aLong104);
												}
												@Pc(687) Class44 local687 = local8.aClass44_1;
												if (local687 != null && local687.anInt2487 == 0) {
													if (local687.aClass1_Sub2_Sub2_4 != null) {
														local687.aClass1_Sub2_Sub2_4.method2704(0, Static1.anInt64, Static179.anInt4051, Static35.anInt1194, Static125.anInt3233, local687.anInt2492 - Static4.anInt122, local687.anInt2489 - Static2.anInt95, local687.anInt2483 - Static24.anInt869, local687.aLong82);
													}
													if (local687.aClass1_Sub2_Sub2_5 != null) {
														local687.aClass1_Sub2_Sub2_5.method2704(0, Static1.anInt64, Static179.anInt4051, Static35.anInt1194, Static125.anInt3233, local687.anInt2492 - Static4.anInt122, local687.anInt2489 - Static2.anInt95, local687.anInt2483 - Static24.anInt869, local687.aLong82);
													}
													if (local687.aClass1_Sub2_Sub2_3 != null) {
														local687.aClass1_Sub2_Sub2_3.method2704(0, Static1.anInt64, Static179.anInt4051, Static35.anInt1194, Static125.anInt3233, local687.anInt2492 - Static4.anInt122, local687.anInt2489 - Static2.anInt95, local687.anInt2483 - Static24.anInt869, local687.aLong82);
													}
												}
											}
											local579 = local8.anInt1538;
											if (local579 != 0) {
												if (local17 < Static81.anInt2305 && (local579 & 0x4) != 0) {
													var32 = local30[local17 + 1][local20];
													if (var32 != null && var32.aBoolean114) {
														Static185.aClass82_17.method2853(var32);
													}
												}
												if (local20 < Static40.anInt1276 && (local579 & 0x2) != 0) {
													var32 = local30[local17][local20 + 1];
													if (var32 != null && var32.aBoolean114) {
														Static185.aClass82_17.method2853(var32);
													}
												}
												if (local17 > Static81.anInt2305 && (local579 & 0x1) != 0) {
													var32 = local30[local17 - 1][local20];
													if (var32 != null && var32.aBoolean114) {
														Static185.aClass82_17.method2853(var32);
													}
												}
												if (local20 > Static40.anInt1276 && (local579 & 0x8) != 0) {
													var32 = local30[local17][local20 - 1];
													if (var32 != null && var32.aBoolean114) {
														Static185.aClass82_17.method2853(var32);
													}
												}
											}
											break;
										}
										if (local8.anInt1545 != 0) {
											var21 = true;
											for (var20 = 0; var20 < local8.anInt1544; var20++) {
												if (local8.aClass59Array4[var20].anInt3141 != Static89.anInt2511 && (local8.anIntArray160[var20] & local8.anInt1545) == local8.anInt1547) {
													var21 = false;
													break;
												}
											}
											if (var21) {
												local906 = local8.aClass7_1;
												if (!Static166.method2846(local26, local17, local20, local906.anInt733)) {
													local906.aClass1_Sub2_Sub2_2.method2704(0, Static1.anInt64, Static179.anInt4051, Static35.anInt1194, Static125.anInt3233, local906.anInt736 - Static4.anInt122, local906.anInt737 - Static2.anInt95, local906.anInt739 - Static24.anInt869, local906.aLong33);
												}
												local8.anInt1545 = 0;
											}
										}
										if (!local8.aBoolean113) {
											break;
										}
										try {
											@Pc(944) int local944 = local8.anInt1544;
											local8.aBoolean113 = false;
											var20 = 0;
											label558: for (local245 = 0; local245 < local944; local245++) {
												var11 = local8.aClass59Array4[local245];
												if (var11.anInt3141 != Static89.anInt2511) {
													for (local964 = var11.anInt3133; local964 <= var11.anInt3142; local964++) {
														for (local579 = var11.anInt3130; local579 <= var11.anInt3143; local579++) {
															var32 = local30[local964][local579];
															if (var32.aBoolean112) {
																local8.aBoolean113 = true;
																continue label558;
															}
															if (var32.anInt1545 != 0) {
																local589 = 0;
																if (local964 > var11.anInt3133) {
																	local589++;
																}
																if (local964 < var11.anInt3142) {
																	local589 += 4;
																}
																if (local579 > var11.anInt3130) {
																	local589 += 8;
																}
																if (local579 < var11.anInt3143) {
																	local589 += 2;
																}
																if ((local589 & var32.anInt1545) == local8.anInt1550) {
																	local8.aBoolean113 = true;
																	continue label558;
																}
															}
														}
													}
													Static174.aClass59Array3[var20++] = var11;
													local579 = Static81.anInt2305 - var11.anInt3133;
													local584 = var11.anInt3142 - Static81.anInt2305;
													if (local584 > local579) {
														local579 = local584;
													}
													local589 = Static40.anInt1276 - var11.anInt3130;
													var16 = var11.anInt3143 - Static40.anInt1276;
													if (var16 > local589) {
														var11.anInt3135 = local579 + var16;
													} else {
														var11.anInt3135 = local579 + local589;
													}
												}
											}
											while (var20 > 0) {
												local1079 = -50;
												local964 = -1;
												@Pc(1088) Class59 local1088;
												for (local579 = 0; local579 < var20; local579++) {
													local1088 = Static174.aClass59Array3[local579];
													if (local1088.anInt3141 != Static89.anInt2511) {
														if (local1088.anInt3135 > local1079) {
															local1079 = local1088.anInt3135;
															local964 = local579;
														} else if (local1088.anInt3135 == local1079) {
															local589 = local1088.anInt3139 - Static4.anInt122;
															var16 = local1088.anInt3132 - Static24.anInt869;
															var17 = Static174.aClass59Array3[local964].anInt3139 - Static4.anInt122;
															var18 = Static174.aClass59Array3[local964].anInt3132 - Static24.anInt869;
															if (local589 * local589 + var16 * var16 > var17 * var17 + var18 * var18) {
																local964 = local579;
															}
														}
													}
												}
												if (local964 == -1) {
													break;
												}
												local1088 = Static174.aClass59Array3[local964];
												local1088.anInt3141 = Static89.anInt2511;
												if (!Static23.method851(local26, local1088.anInt3133, local1088.anInt3142, local1088.anInt3130, local1088.anInt3143, local1088.aClass1_Sub2_Sub2_7.aShort27)) {
													local1088.aClass1_Sub2_Sub2_7.method2704(local1088.anInt3137, Static1.anInt64, Static179.anInt4051, Static35.anInt1194, Static125.anInt3233, local1088.anInt3139 - Static4.anInt122, local1088.anInt3138 - Static2.anInt95, local1088.anInt3132 - Static24.anInt869, local1088.aLong106);
												}
												for (local589 = local1088.anInt3133; local589 <= local1088.anInt3142; local589++) {
													for (var16 = local1088.anInt3130; var16 <= local1088.anInt3143; var16++) {
														@Pc(1212) Class1_Sub10 local1212 = local30[local589][var16];
														if (local1212.anInt1545 != 0) {
															Static185.aClass82_17.method2853(local1212);
														} else if ((local589 != local17 || var16 != local20) && local1212.aBoolean114) {
															Static185.aClass82_17.method2853(local1212);
														}
													}
												}
											}
											if (!local8.aBoolean113) {
												break;
											}
										} catch (@Pc(1250) Exception local1250) {
											local8.aBoolean113 = false;
											break;
										}
									}
								} while (!local8.aBoolean114);
							} while (local8.anInt1545 != 0);
							if (local17 > Static81.anInt2305 || local17 <= Static7.anInt3156) {
								break;
							}
							local47 = local30[local17 - 1][local20];
						} while (local47 != null && local47.aBoolean114);
						if (local17 < Static81.anInt2305 || local17 >= Static103.anInt2865 - 1) {
							break;
						}
						local47 = local30[local17 + 1][local20];
					} while (local47 != null && local47.aBoolean114);
					if (local20 > Static40.anInt1276 || local20 <= Static106.anInt2880) {
						break;
					}
					local47 = local30[local17][local20 - 1];
				} while (local47 != null && local47.aBoolean114);
				if (local20 < Static40.anInt1276 || local20 >= Static53.anInt1721 - 1) {
					break;
				}
				local47 = local30[local17][local20 + 1];
			} while (local47 != null && local47.aBoolean114);
			local8.aBoolean114 = false;
			Static113.anInt3060--;
			@Pc(1354) Class44 local1354 = local8.aClass44_1;
			if (local1354 != null && local1354.anInt2487 != 0) {
				if (local1354.aClass1_Sub2_Sub2_4 != null) {
					local1354.aClass1_Sub2_Sub2_4.method2704(0, Static1.anInt64, Static179.anInt4051, Static35.anInt1194, Static125.anInt3233, local1354.anInt2492 - Static4.anInt122, local1354.anInt2489 - Static2.anInt95 - local1354.anInt2487, local1354.anInt2483 - Static24.anInt869, local1354.aLong82);
				}
				if (local1354.aClass1_Sub2_Sub2_5 != null) {
					local1354.aClass1_Sub2_Sub2_5.method2704(0, Static1.anInt64, Static179.anInt4051, Static35.anInt1194, Static125.anInt3233, local1354.anInt2492 - Static4.anInt122, local1354.anInt2489 - Static2.anInt95 - local1354.anInt2487, local1354.anInt2483 - Static24.anInt869, local1354.aLong82);
				}
				if (local1354.aClass1_Sub2_Sub2_3 != null) {
					local1354.aClass1_Sub2_Sub2_3.method2704(0, Static1.anInt64, Static179.anInt4051, Static35.anInt1194, Static125.anInt3233, local1354.anInt2492 - Static4.anInt122, local1354.anInt2489 - Static2.anInt95 - local1354.anInt2487, local1354.anInt2483 - Static24.anInt869, local1354.aLong82);
				}
			}
			if (local8.anInt1546 != 0) {
				@Pc(1449) Class69 local1449 = local8.aClass69_1;
				if (local1449 != null && !Static38.method1004(local26, local17, local20, local1449.aClass1_Sub2_Sub2_10.aShort27)) {
					if ((local1449.anInt3385 & local8.anInt1546) != 0) {
						local1449.aClass1_Sub2_Sub2_10.method2704(0, Static1.anInt64, Static179.anInt4051, Static35.anInt1194, Static125.anInt3233, local1449.anInt3380 + local1449.anInt3375 - Static4.anInt122, local1449.anInt3381 - Static2.anInt95, local1449.anInt3376 + local1449.anInt3383 - Static24.anInt869, local1449.aLong114);
					} else if (local1449.anInt3385 == 256) {
						local245 = local1449.anInt3380 - Static4.anInt122;
						local1079 = local1449.anInt3381 - Static2.anInt95;
						local964 = local1449.anInt3376 - Static24.anInt869;
						local579 = local1449.anInt3374;
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
							local1449.aClass1_Sub2_Sub2_10.method2704(0, Static1.anInt64, Static179.anInt4051, Static35.anInt1194, Static125.anInt3233, local245 + local1449.anInt3375, local1079, local964 + local1449.anInt3383, local1449.aLong114);
						} else if (local1449.aClass1_Sub2_Sub2_9 != null) {
							local1449.aClass1_Sub2_Sub2_9.method2704(0, Static1.anInt64, Static179.anInt4051, Static35.anInt1194, Static125.anInt3233, local245, local1079, local964, local1449.aLong114);
						}
					}
				}
				local906 = local8.aClass7_1;
				if (local906 != null) {
					if ((local906.anInt732 & local8.anInt1546) != 0 && !Static166.method2846(local26, local17, local20, local906.anInt732)) {
						local906.aClass1_Sub2_Sub2_1.method2704(0, Static1.anInt64, Static179.anInt4051, Static35.anInt1194, Static125.anInt3233, local906.anInt736 - Static4.anInt122, local906.anInt737 - Static2.anInt95, local906.anInt739 - Static24.anInt869, local906.aLong33);
					}
					if ((local906.anInt733 & local8.anInt1546) != 0 && !Static166.method2846(local26, local17, local20, local906.anInt733)) {
						local906.aClass1_Sub2_Sub2_2.method2704(0, Static1.anInt64, Static179.anInt4051, Static35.anInt1194, Static125.anInt3233, local906.anInt736 - Static4.anInt122, local906.anInt737 - Static2.anInt95, local906.anInt739 - Static24.anInt869, local906.aLong33);
					}
				}
			}
			@Pc(1669) Class1_Sub10 local1669;
			if (local23 < Static4.anInt118 - 1) {
				local1669 = Static170.aClass1_Sub10ArrayArrayArray35[local23 + 1][local17][local20];
				if (local1669 != null && local1669.aBoolean114) {
					Static185.aClass82_17.method2853(local1669);
				}
			}
			if (local17 < Static81.anInt2305) {
				local1669 = local30[local17 + 1][local20];
				if (local1669 != null && local1669.aBoolean114) {
					Static185.aClass82_17.method2853(local1669);
				}
			}
			if (local20 < Static40.anInt1276) {
				local1669 = local30[local17][local20 + 1];
				if (local1669 != null && local1669.aBoolean114) {
					Static185.aClass82_17.method2853(local1669);
				}
			}
			if (local17 > Static81.anInt2305) {
				local1669 = local30[local17 - 1][local20];
				if (local1669 != null && local1669.aBoolean114) {
					Static185.aClass82_17.method2853(local1669);
				}
			}
			if (local20 > Static40.anInt1276) {
				local1669 = local30[local17][local20 - 1];
				if (local1669 != null && local1669.aBoolean114) {
					Static185.aClass82_17.method2853(local1669);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
	public static void method994() {
		for (@Pc(3) int local3 = 0; local3 < Static156.anInt3694; local3++) {
			@Pc(9) int local9 = Static147.anIntArray350[local3];
			@Pc(13) Class1_Sub2_Sub2_Sub2_Sub1 local13 = Static181.aClass1_Sub2_Sub2_Sub2_Sub1Array1[local9];
			@Pc(17) int local17 = Static153.aClass1_Sub8_Sub1_2.method1607();
			@Pc(25) int local25;
			@Pc(29) int local29;
			if ((local17 & 0x10) != 0) {
				local25 = Static153.aClass1_Sub8_Sub1_2.method1603();
				local29 = Static153.aClass1_Sub8_Sub1_2.method1600();
				local13.method1887(local25, local29, Static78.anInt2168);
				local13.anInt2558 = Static78.anInt2168 + 300;
				local13.anInt2563 = Static153.aClass1_Sub8_Sub1_2.method1607();
			}
			if ((local17 & 0x8) != 0) {
				local13.anInt2575 = Static153.aClass1_Sub8_Sub1_2.method1636();
				if (local13.anInt2575 == 65535) {
					local13.anInt2575 = -1;
				}
			}
			if ((local17 & 0x40) != 0) {
				local13.aClass1_Sub2_Sub19_1 = Static165.method2827(Static153.aClass1_Sub8_Sub1_2.method1634());
				local13.anInt2561 = local13.aClass1_Sub2_Sub19_1.anInt3850;
				local13.anInt2577 = local13.aClass1_Sub2_Sub19_1.anInt3851;
				local13.anInt2583 = local13.aClass1_Sub2_Sub19_1.anInt3836;
				local13.anInt2552 = local13.aClass1_Sub2_Sub19_1.anInt3830;
				local13.anInt2582 = local13.aClass1_Sub2_Sub19_1.anInt3831;
				local13.anInt2574 = local13.aClass1_Sub2_Sub19_1.anInt3849;
				local13.anInt2550 = local13.aClass1_Sub2_Sub19_1.anInt3838;
				local13.anInt2584 = local13.aClass1_Sub2_Sub19_1.anInt3857;
				local13.anInt2581 = local13.aClass1_Sub2_Sub19_1.anInt3842;
			}
			if ((local17 & 0x1) != 0) {
				local25 = Static153.aClass1_Sub8_Sub1_2.method1607();
				local29 = Static153.aClass1_Sub8_Sub1_2.method1607();
				local13.method1887(local25, local29, Static78.anInt2168);
			}
			if ((local17 & 0x20) != 0) {
				local25 = Static153.aClass1_Sub8_Sub1_2.method1642();
				if (local25 == 65535) {
					local25 = -1;
				}
				local29 = Static153.aClass1_Sub8_Sub1_2.method1607();
				if (local25 == local13.anInt2553 && local25 != -1) {
					@Pc(184) Class1_Sub2_Sub8 local184 = Static142.method2538(local25);
					@Pc(187) int local187 = local184.anInt1509;
					if (local187 == 1) {
						local13.anInt2585 = local29;
						local13.anInt2580 = 0;
						local13.anInt2590 = 0;
						local13.anInt2551 = 0;
						Static70.method1461(false, local13.anInt2596, local13.anInt2590, local13.anInt2606, local184);
					}
					if (local187 == 2) {
						local13.anInt2580 = 0;
					}
				} else if (local25 == -1 || local13.anInt2553 == -1 || Static142.method2538(local25).anInt1518 >= Static142.method2538(local13.anInt2553).anInt1518) {
					local13.anInt2585 = local29;
					local13.anInt2590 = 0;
					local13.anInt2572 = local13.anInt2586;
					local13.anInt2553 = local25;
					local13.anInt2580 = 0;
					local13.anInt2551 = 0;
					if (local13.anInt2553 != -1) {
						Static70.method1461(false, local13.anInt2596, local13.anInt2590, local13.anInt2606, Static142.method2538(local13.anInt2553));
					}
				}
			}
			if ((local17 & 0x80) != 0) {
				local13.anInt2591 = Static153.aClass1_Sub8_Sub1_2.method1636();
				local13.anInt2565 = Static153.aClass1_Sub8_Sub1_2.method1642();
			}
			if ((local17 & 0x4) != 0) {
				local13.aClass13_846 = Static153.aClass1_Sub8_Sub1_2.method1622();
				local13.anInt2589 = 100;
			}
			if ((local17 & 0x2) != 0) {
				local13.anInt2603 = Static153.aClass1_Sub8_Sub1_2.method1636();
				local25 = Static153.aClass1_Sub8_Sub1_2.method1652();
				local13.anInt2566 = 0;
				local13.anInt2598 = 0;
				local13.anInt2569 = local25 >> 16;
				local13.anInt2557 = Static78.anInt2168 + (local25 & 0xFFFF);
				if (Static78.anInt2168 < local13.anInt2557) {
					local13.anInt2598 = -1;
				}
				if (local13.anInt2603 == 65535) {
					local13.anInt2603 = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
	public static void method995() {
		aClass13_416 = null;
		aClass4_38 = null;
		aClass13_417 = null;
		aClass13_420 = null;
		aClass13_421 = null;
		aClass13_419 = null;
		aClass13_418 = null;
		aClass20_2 = null;
		aByteArrayArray3 = null;
	}
}

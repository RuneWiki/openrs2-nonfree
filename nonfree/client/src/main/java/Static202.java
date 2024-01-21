import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!vh", name = "u", descriptor = "Lclient!o;")
	public static Class72 aClass72_1;

	@OriginalMember(owner = "client!vh", name = "v", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!vh", name = "r", descriptor = "Z")
	public static volatile boolean aBoolean224 = true;

	@OriginalMember(owner = "client!vh", name = "s", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1284 = Static81.method1507("b12_full");

	@OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
	public static volatile int anInt4521 = -1;

	@OriginalMember(owner = "client!vh", name = "w", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1285 = Static81.method1507("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!vh", name = "y", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1286 = Static81.method1507("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!vh", name = "z", descriptor = "I")
	public static int anInt4523 = 0;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(JI)Lclient!dj;")
	public static Class24 method3414(@OriginalArg(0) long arg0) {
		Static127.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static127.aCalendar1.get(7);
		@Pc(17) int local17 = Static127.aCalendar1.get(5);
		@Pc(21) int local21 = Static127.aCalendar1.get(2);
		@Pc(30) int local30 = Static127.aCalendar1.get(1);
		@Pc(34) int local34 = Static127.aCalendar1.get(11);
		@Pc(38) int local38 = Static127.aCalendar1.get(12);
		@Pc(42) int local42 = Static127.aCalendar1.get(13);
		return Static63.method1281(new Class24[] { Static62.aClass24Array9[local13 - 1], Static58.aClass24_388, Static175.method3020(local17 / 10), Static175.method3020(local17 % 10), Static100.aClass24_671, Static123.aClass24Array18[local21], Static100.aClass24_671, Static175.method3020(local30), Static157.aClass24_1013, Static175.method3020(local34 / 10), Static175.method3020(local34 % 10), Static115.aClass24_769, Static175.method3020(local38 / 10), Static175.method3020(local38 % 10), Static115.aClass24_769, Static175.method3020(local42 / 10), Static175.method3020(local42 % 10), Static45.aClass24_288 });
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIII)V")
	public static void method3415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(10) Class1_Sub5 local10 = (Class1_Sub5) Static71.aClass87_11.method2827(); local10 != null; local10 = (Class1_Sub5) Static71.aClass87_11.method2830()) {
			if (local10.anInt687 != -1 || local10.anIntArray70 != null) {
				@Pc(21) int local21 = 0;
				if (arg2 > local10.anInt692) {
					local21 = arg2 - local10.anInt692;
				} else if (local10.anInt681 > arg2) {
					local21 = local10.anInt681 - arg2;
				}
				if (local10.anInt689 < arg3) {
					local21 += arg3 - local10.anInt689;
				} else if (arg3 < local10.anInt690) {
					local21 += local10.anInt690 - arg3;
				}
				if (local10.anInt691 < local21 - 64 || Static200.anInt4473 == 0 || local10.anInt684 != arg1) {
					if (local10.aClass1_Sub3_Sub2_1 != null) {
						Static33.aClass1_Sub3_Sub1_1.method278(local10.aClass1_Sub3_Sub2_1);
						local10.aClass1_Sub3_Sub2_1 = null;
					}
					if (local10.aClass1_Sub3_Sub2_2 != null) {
						Static33.aClass1_Sub3_Sub1_1.method278(local10.aClass1_Sub3_Sub2_2);
						local10.aClass1_Sub3_Sub2_2 = null;
					}
				} else {
					local21 -= 64;
					if (local21 < 0) {
						local21 = 0;
					}
					@Pc(127) int local127 = (local10.anInt691 - local21) * Static200.anInt4473 / local10.anInt691;
					if (local10.aClass1_Sub3_Sub2_1 != null) {
						local10.aClass1_Sub3_Sub2_1.method1637(local127);
					} else if (local10.anInt687 >= 0) {
						@Pc(145) Class11 local145 = Static213.method324(Static57.aClass69_Sub1_49, local10.anInt687, 0);
						if (local145 != null) {
							@Pc(152) Class1_Sub9_Sub1 local152 = local145.method321().method3204(Static121.aClass4_1);
							@Pc(157) Class1_Sub3_Sub2 local157 = Static215.method1623(local152, local127);
							local157.method1618(-1);
							Static33.aClass1_Sub3_Sub1_1.method275(local157);
							local10.aClass1_Sub3_Sub2_1 = local157;
						}
					}
					if (local10.aClass1_Sub3_Sub2_2 != null) {
						local10.aClass1_Sub3_Sub2_2.method1637(local127);
						if (!local10.aClass1_Sub3_Sub2_2.method3561()) {
							local10.aClass1_Sub3_Sub2_2 = null;
						}
					} else if (local10.anIntArray70 != null && (local10.anInt682 -= arg0) <= 0) {
						@Pc(205) int local205 = (int) (Math.random() * (double) local10.anIntArray70.length);
						@Pc(213) Class11 local213 = Static213.method324(Static57.aClass69_Sub1_49, local10.anIntArray70[local205], 0);
						if (local213 != null) {
							@Pc(220) Class1_Sub9_Sub1 local220 = local213.method321().method3204(Static121.aClass4_1);
							@Pc(225) Class1_Sub3_Sub2 local225 = Static215.method1623(local220, local127);
							local225.method1618(0);
							Static33.aClass1_Sub3_Sub1_1.method275(local225);
							local10.aClass1_Sub3_Sub2_2 = local225;
							local10.anInt682 = (int) ((double) (local10.anInt680 - local10.anInt688) * Math.random()) + local10.anInt688;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!ga;Z)V")
	public static void method3416(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) boolean arg1) {
		Static119.aClass87_17.method2823(arg0);
		while (true) {
			@Pc(8) Class1_Sub8 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(30) Class1_Sub8[][] local30;
			@Pc(47) Class1_Sub8 local47;
			@Pc(245) int local245;
			@Pc(579) int local579;
			@Pc(584) int local584;
			@Pc(589) int local589;
			@Pc(906) Class19 local906;
			@Pc(1079) int local1079;
			@Pc(964) int local964;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(251) Class51 var11;
										@Pc(592) int var16;
										@Pc(601) int var17;
										@Pc(613) int var18;
										@Pc(335) int var20;
										@Pc(283) boolean var21;
										@Pc(787) Class1_Sub8 var32;
										while (true) {
											do {
												local8 = (Class1_Sub8) Static119.aClass87_17.method2825();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean77);
											local17 = local8.anInt1556;
											local20 = local8.anInt1548;
											local23 = local8.anInt1549;
											local26 = local8.anInt1545;
											local30 = Static29.aClass1_Sub8ArrayArrayArray1[local23];
											if (!local8.aBoolean79) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local47 = Static29.aClass1_Sub8ArrayArrayArray1[local23 - 1][local17][local20];
													if (local47 != null && local47.aBoolean77) {
														continue;
													}
												}
												if (local17 <= Static137.anInt3098 && local17 > Static96.anInt2203) {
													local47 = local30[local17 - 1][local20];
													if (local47 != null && local47.aBoolean77 && (local47.aBoolean79 || (local8.anInt1546 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static137.anInt3098 && local17 < Static184.anInt4126 - 1) {
													local47 = local30[local17 + 1][local20];
													if (local47 != null && local47.aBoolean77 && (local47.aBoolean79 || (local8.anInt1546 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static89.anInt2074 && local20 > Static103.anInt2300) {
													local47 = local30[local17][local20 - 1];
													if (local47 != null && local47.aBoolean77 && (local47.aBoolean79 || (local8.anInt1546 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static89.anInt2074 && local20 < Static192.anInt4309 - 1) {
													local47 = local30[local17][local20 + 1];
													if (local47 != null && local47.aBoolean77 && (local47.aBoolean79 || (local8.anInt1546 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean79 = false;
											if (local8.aClass1_Sub8_1 != null) {
												local47 = local8.aClass1_Sub8_1;
												if (local47.aClass101_1 == null) {
													if (local47.aClass15_1 != null && !Static85.method2618(0, local17, local20)) {
														Static19.method431(local47.aClass15_1, Static152.anInt3381, Static136.anInt3052, Static75.anInt4697, Static70.anInt3207, local17, local20);
													}
												} else if (!Static85.method2618(0, local17, local20)) {
													Static151.method2589(local47.aClass101_1, 0, Static152.anInt3381, Static136.anInt3052, Static75.anInt4697, Static70.anInt3207, local17, local20);
												}
												@Pc(219) Class19 local219 = local47.aClass19_1;
												if (local219 != null) {
													local219.aClass5_1.method3164(0, Static152.anInt3381, Static136.anInt3052, Static75.anInt4697, Static70.anInt3207, local219.anInt772 - Static167.anInt3703, local219.anInt774 - Static134.anInt2982, local219.anInt778 - Static176.anInt4669, local219.aLong26);
												}
												for (local245 = 0; local245 < local47.anInt1550; local245++) {
													var11 = local47.aClass51Array1[local245];
													if (var11 != null) {
														var11.aClass5_6.method3164(var11.anInt2206, Static152.anInt3381, Static136.anInt3052, Static75.anInt4697, Static70.anInt3207, var11.anInt2214 - Static167.anInt3703, var11.anInt2210 - Static134.anInt2982, var11.anInt2209 - Static176.anInt4669, var11.aLong68);
													}
												}
											}
											var21 = false;
											if (local8.aClass101_1 == null) {
												if (local8.aClass15_1 != null && !Static85.method2618(local26, local17, local20)) {
													var21 = true;
													Static19.method431(local8.aClass15_1, Static152.anInt3381, Static136.anInt3052, Static75.anInt4697, Static70.anInt3207, local17, local20);
												}
											} else if (!Static85.method2618(local26, local17, local20)) {
												var21 = true;
												if (local8.aClass101_1.anInt4645 != 12345678 || Static65.aBoolean84 && local23 <= Static41.anInt1353) {
													Static151.method2589(local8.aClass101_1, local26, Static152.anInt3381, Static136.anInt3052, Static75.anInt4697, Static70.anInt3207, local17, local20);
												}
											}
											var20 = 0;
											local245 = 0;
											@Pc(340) Class19 local340 = local8.aClass19_1;
											@Pc(343) Class49 local343 = local8.aClass49_1;
											if (local340 != null || local343 != null) {
												if (Static137.anInt3098 == local17) {
													var20++;
												} else if (Static137.anInt3098 < local17) {
													var20 += 2;
												}
												if (Static89.anInt2074 == local20) {
													var20 += 3;
												} else if (Static89.anInt2074 > local20) {
													var20 += 6;
												}
												local245 = Static136.anIntArray248[var20];
												local8.anInt1547 = Static183.anIntArray358[var20];
											}
											if (local340 != null) {
												if ((local340.anInt773 & Static55.anIntArray118[var20]) == 0) {
													local8.anInt1553 = 0;
												} else if (local340.anInt773 == 16) {
													local8.anInt1553 = 3;
													local8.anInt1554 = Static68.anIntArray144[var20];
													local8.anInt1555 = 3 - local8.anInt1554;
												} else if (local340.anInt773 == 32) {
													local8.anInt1553 = 6;
													local8.anInt1554 = Static117.anIntArray207[var20];
													local8.anInt1555 = 6 - local8.anInt1554;
												} else if (local340.anInt773 == 64) {
													local8.anInt1553 = 12;
													local8.anInt1554 = Static117.anIntArray209[var20];
													local8.anInt1555 = 12 - local8.anInt1554;
												} else {
													local8.anInt1553 = 9;
													local8.anInt1554 = Static120.anIntArray211[var20];
													local8.anInt1555 = 9 - local8.anInt1554;
												}
												if ((local340.anInt773 & local245) != 0 && !Static178.method3042(local26, local17, local20, local340.anInt773)) {
													local340.aClass5_1.method3164(0, Static152.anInt3381, Static136.anInt3052, Static75.anInt4697, Static70.anInt3207, local340.anInt772 - Static167.anInt3703, local340.anInt774 - Static134.anInt2982, local340.anInt778 - Static176.anInt4669, local340.aLong26);
												}
												if ((local340.anInt776 & local245) != 0 && !Static178.method3042(local26, local17, local20, local340.anInt776)) {
													local340.aClass5_2.method3164(0, Static152.anInt3381, Static136.anInt3052, Static75.anInt4697, Static70.anInt3207, local340.anInt772 - Static167.anInt3703, local340.anInt774 - Static134.anInt2982, local340.anInt778 - Static176.anInt4669, local340.aLong26);
												}
											}
											if (local343 != null && !Static192.method3303(local26, local17, local20, local343.aClass5_5.method3163())) {
												if ((local343.anInt2076 & local245) != 0) {
													local343.aClass5_5.method3164(0, Static152.anInt3381, Static136.anInt3052, Static75.anInt4697, Static70.anInt3207, local343.anInt2084 + local343.anInt2081 - Static167.anInt3703, local343.anInt2077 - Static134.anInt2982, local343.anInt2075 + local343.anInt2078 - Static176.anInt4669, local343.aLong62);
												} else if (local343.anInt2076 == 256) {
													local579 = local343.anInt2084 - Static167.anInt3703;
													local584 = local343.anInt2077 - Static134.anInt2982;
													local589 = local343.anInt2075 - Static176.anInt4669;
													var16 = local343.anInt2079;
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
														local343.aClass5_5.method3164(0, Static152.anInt3381, Static136.anInt3052, Static75.anInt4697, Static70.anInt3207, local579 + local343.anInt2081, local584, local589 + local343.anInt2078, local343.aLong62);
													} else if (local343.aClass5_4 != null) {
														local343.aClass5_4.method3164(0, Static152.anInt3381, Static136.anInt3052, Static75.anInt4697, Static70.anInt3207, local579, local584, local589, local343.aLong62);
													}
												}
											}
											if (var21) {
												@Pc(660) Class96 local660 = local8.aClass96_1;
												if (local660 != null) {
													local660.aClass5_11.method3164(0, Static152.anInt3381, Static136.anInt3052, Static75.anInt4697, Static70.anInt3207, local660.anInt4314 - Static167.anInt3703, local660.anInt4313 - Static134.anInt2982, local660.anInt4320 - Static176.anInt4669, local660.aLong137);
												}
												@Pc(687) Class81 local687 = local8.aClass81_1;
												if (local687 != null && local687.anInt3378 == 0) {
													if (local687.aClass5_9 != null) {
														local687.aClass5_9.method3164(0, Static152.anInt3381, Static136.anInt3052, Static75.anInt4697, Static70.anInt3207, local687.anInt3374 - Static167.anInt3703, local687.anInt3377 - Static134.anInt2982, local687.anInt3379 - Static176.anInt4669, local687.aLong109);
													}
													if (local687.aClass5_10 != null) {
														local687.aClass5_10.method3164(0, Static152.anInt3381, Static136.anInt3052, Static75.anInt4697, Static70.anInt3207, local687.anInt3374 - Static167.anInt3703, local687.anInt3377 - Static134.anInt2982, local687.anInt3379 - Static176.anInt4669, local687.aLong109);
													}
													if (local687.aClass5_8 != null) {
														local687.aClass5_8.method3164(0, Static152.anInt3381, Static136.anInt3052, Static75.anInt4697, Static70.anInt3207, local687.anInt3374 - Static167.anInt3703, local687.anInt3377 - Static134.anInt2982, local687.anInt3379 - Static176.anInt4669, local687.aLong109);
													}
												}
											}
											local579 = local8.anInt1546;
											if (local579 != 0) {
												if (local17 < Static137.anInt3098 && (local579 & 0x4) != 0) {
													var32 = local30[local17 + 1][local20];
													if (var32 != null && var32.aBoolean77) {
														Static119.aClass87_17.method2823(var32);
													}
												}
												if (local20 < Static89.anInt2074 && (local579 & 0x2) != 0) {
													var32 = local30[local17][local20 + 1];
													if (var32 != null && var32.aBoolean77) {
														Static119.aClass87_17.method2823(var32);
													}
												}
												if (local17 > Static137.anInt3098 && (local579 & 0x1) != 0) {
													var32 = local30[local17 - 1][local20];
													if (var32 != null && var32.aBoolean77) {
														Static119.aClass87_17.method2823(var32);
													}
												}
												if (local20 > Static89.anInt2074 && (local579 & 0x8) != 0) {
													var32 = local30[local17][local20 - 1];
													if (var32 != null && var32.aBoolean77) {
														Static119.aClass87_17.method2823(var32);
													}
												}
											}
											break;
										}
										if (local8.anInt1553 != 0) {
											var21 = true;
											for (var20 = 0; var20 < local8.anInt1550; var20++) {
												if (local8.aClass51Array1[var20].anInt2212 != Static164.anInt3660 && (local8.anIntArray131[var20] & local8.anInt1553) == local8.anInt1554) {
													var21 = false;
													break;
												}
											}
											if (var21) {
												local906 = local8.aClass19_1;
												if (!Static178.method3042(local26, local17, local20, local906.anInt773)) {
													local906.aClass5_1.method3164(0, Static152.anInt3381, Static136.anInt3052, Static75.anInt4697, Static70.anInt3207, local906.anInt772 - Static167.anInt3703, local906.anInt774 - Static134.anInt2982, local906.anInt778 - Static176.anInt4669, local906.aLong26);
												}
												local8.anInt1553 = 0;
											}
										}
										if (!local8.aBoolean78) {
											break;
										}
										try {
											@Pc(944) int local944 = local8.anInt1550;
											local8.aBoolean78 = false;
											var20 = 0;
											label558: for (local245 = 0; local245 < local944; local245++) {
												var11 = local8.aClass51Array1[local245];
												if (var11.anInt2212 != Static164.anInt3660) {
													for (local964 = var11.anInt2213; local964 <= var11.anInt2208; local964++) {
														for (local579 = var11.anInt2218; local579 <= var11.anInt2205; local579++) {
															var32 = local30[local964][local579];
															if (var32.aBoolean79) {
																local8.aBoolean78 = true;
																continue label558;
															}
															if (var32.anInt1553 != 0) {
																local589 = 0;
																if (local964 > var11.anInt2213) {
																	local589++;
																}
																if (local964 < var11.anInt2208) {
																	local589 += 4;
																}
																if (local579 > var11.anInt2218) {
																	local589 += 8;
																}
																if (local579 < var11.anInt2205) {
																	local589 += 2;
																}
																if ((local589 & var32.anInt1553) == local8.anInt1555) {
																	local8.aBoolean78 = true;
																	continue label558;
																}
															}
														}
													}
													Static194.aClass51Array3[var20++] = var11;
													local579 = Static137.anInt3098 - var11.anInt2213;
													local584 = var11.anInt2208 - Static137.anInt3098;
													if (local584 > local579) {
														local579 = local584;
													}
													local589 = Static89.anInt2074 - var11.anInt2218;
													var16 = var11.anInt2205 - Static89.anInt2074;
													if (var16 > local589) {
														var11.anInt2215 = local579 + var16;
													} else {
														var11.anInt2215 = local579 + local589;
													}
												}
											}
											while (var20 > 0) {
												local1079 = -50;
												local964 = -1;
												@Pc(1088) Class51 local1088;
												for (local579 = 0; local579 < var20; local579++) {
													local1088 = Static194.aClass51Array3[local579];
													if (local1088.anInt2212 != Static164.anInt3660) {
														if (local1088.anInt2215 > local1079) {
															local1079 = local1088.anInt2215;
															local964 = local579;
														} else if (local1088.anInt2215 == local1079) {
															local589 = local1088.anInt2214 - Static167.anInt3703;
															var16 = local1088.anInt2209 - Static176.anInt4669;
															var17 = Static194.aClass51Array3[local964].anInt2214 - Static167.anInt3703;
															var18 = Static194.aClass51Array3[local964].anInt2209 - Static176.anInt4669;
															if (local589 * local589 + var16 * var16 > var17 * var17 + var18 * var18) {
																local964 = local579;
															}
														}
													}
												}
												if (local964 == -1) {
													break;
												}
												local1088 = Static194.aClass51Array3[local964];
												local1088.anInt2212 = Static164.anInt3660;
												if (!Static162.method2732(local26, local1088.anInt2213, local1088.anInt2208, local1088.anInt2218, local1088.anInt2205, local1088.aClass5_6.method3163())) {
													local1088.aClass5_6.method3164(local1088.anInt2206, Static152.anInt3381, Static136.anInt3052, Static75.anInt4697, Static70.anInt3207, local1088.anInt2214 - Static167.anInt3703, local1088.anInt2210 - Static134.anInt2982, local1088.anInt2209 - Static176.anInt4669, local1088.aLong68);
												}
												for (local589 = local1088.anInt2213; local589 <= local1088.anInt2208; local589++) {
													for (var16 = local1088.anInt2218; var16 <= local1088.anInt2205; var16++) {
														@Pc(1212) Class1_Sub8 local1212 = local30[local589][var16];
														if (local1212.anInt1553 != 0) {
															Static119.aClass87_17.method2823(local1212);
														} else if ((local589 != local17 || var16 != local20) && local1212.aBoolean77) {
															Static119.aClass87_17.method2823(local1212);
														}
													}
												}
											}
											if (!local8.aBoolean78) {
												break;
											}
										} catch (@Pc(1250) Exception local1250) {
											local8.aBoolean78 = false;
											break;
										}
									}
								} while (!local8.aBoolean77);
							} while (local8.anInt1553 != 0);
							if (local17 > Static137.anInt3098 || local17 <= Static96.anInt2203) {
								break;
							}
							local47 = local30[local17 - 1][local20];
						} while (local47 != null && local47.aBoolean77);
						if (local17 < Static137.anInt3098 || local17 >= Static184.anInt4126 - 1) {
							break;
						}
						local47 = local30[local17 + 1][local20];
					} while (local47 != null && local47.aBoolean77);
					if (local20 > Static89.anInt2074 || local20 <= Static103.anInt2300) {
						break;
					}
					local47 = local30[local17][local20 - 1];
				} while (local47 != null && local47.aBoolean77);
				if (local20 < Static89.anInt2074 || local20 >= Static192.anInt4309 - 1) {
					break;
				}
				local47 = local30[local17][local20 + 1];
			} while (local47 != null && local47.aBoolean77);
			local8.aBoolean77 = false;
			Static48.anInt1211--;
			@Pc(1354) Class81 local1354 = local8.aClass81_1;
			if (local1354 != null && local1354.anInt3378 != 0) {
				if (local1354.aClass5_9 != null) {
					local1354.aClass5_9.method3164(0, Static152.anInt3381, Static136.anInt3052, Static75.anInt4697, Static70.anInt3207, local1354.anInt3374 - Static167.anInt3703, local1354.anInt3377 - Static134.anInt2982 - local1354.anInt3378, local1354.anInt3379 - Static176.anInt4669, local1354.aLong109);
				}
				if (local1354.aClass5_10 != null) {
					local1354.aClass5_10.method3164(0, Static152.anInt3381, Static136.anInt3052, Static75.anInt4697, Static70.anInt3207, local1354.anInt3374 - Static167.anInt3703, local1354.anInt3377 - Static134.anInt2982 - local1354.anInt3378, local1354.anInt3379 - Static176.anInt4669, local1354.aLong109);
				}
				if (local1354.aClass5_8 != null) {
					local1354.aClass5_8.method3164(0, Static152.anInt3381, Static136.anInt3052, Static75.anInt4697, Static70.anInt3207, local1354.anInt3374 - Static167.anInt3703, local1354.anInt3377 - Static134.anInt2982 - local1354.anInt3378, local1354.anInt3379 - Static176.anInt4669, local1354.aLong109);
				}
			}
			if (local8.anInt1547 != 0) {
				@Pc(1449) Class49 local1449 = local8.aClass49_1;
				if (local1449 != null && !Static192.method3303(local26, local17, local20, local1449.aClass5_5.method3163())) {
					if ((local1449.anInt2076 & local8.anInt1547) != 0) {
						local1449.aClass5_5.method3164(0, Static152.anInt3381, Static136.anInt3052, Static75.anInt4697, Static70.anInt3207, local1449.anInt2084 + local1449.anInt2081 - Static167.anInt3703, local1449.anInt2077 - Static134.anInt2982, local1449.anInt2075 + local1449.anInt2078 - Static176.anInt4669, local1449.aLong62);
					} else if (local1449.anInt2076 == 256) {
						local245 = local1449.anInt2084 - Static167.anInt3703;
						local1079 = local1449.anInt2077 - Static134.anInt2982;
						local964 = local1449.anInt2075 - Static176.anInt4669;
						local579 = local1449.anInt2079;
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
							local1449.aClass5_5.method3164(0, Static152.anInt3381, Static136.anInt3052, Static75.anInt4697, Static70.anInt3207, local245 + local1449.anInt2081, local1079, local964 + local1449.anInt2078, local1449.aLong62);
						} else if (local1449.aClass5_4 != null) {
							local1449.aClass5_4.method3164(0, Static152.anInt3381, Static136.anInt3052, Static75.anInt4697, Static70.anInt3207, local245, local1079, local964, local1449.aLong62);
						}
					}
				}
				local906 = local8.aClass19_1;
				if (local906 != null) {
					if ((local906.anInt776 & local8.anInt1547) != 0 && !Static178.method3042(local26, local17, local20, local906.anInt776)) {
						local906.aClass5_2.method3164(0, Static152.anInt3381, Static136.anInt3052, Static75.anInt4697, Static70.anInt3207, local906.anInt772 - Static167.anInt3703, local906.anInt774 - Static134.anInt2982, local906.anInt778 - Static176.anInt4669, local906.aLong26);
					}
					if ((local906.anInt773 & local8.anInt1547) != 0 && !Static178.method3042(local26, local17, local20, local906.anInt773)) {
						local906.aClass5_1.method3164(0, Static152.anInt3381, Static136.anInt3052, Static75.anInt4697, Static70.anInt3207, local906.anInt772 - Static167.anInt3703, local906.anInt774 - Static134.anInt2982, local906.anInt778 - Static176.anInt4669, local906.aLong26);
					}
				}
			}
			@Pc(1669) Class1_Sub8 local1669;
			if (local23 < Static143.anInt3201 - 1) {
				local1669 = Static29.aClass1_Sub8ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1669 != null && local1669.aBoolean77) {
					Static119.aClass87_17.method2823(local1669);
				}
			}
			if (local17 < Static137.anInt3098) {
				local1669 = local30[local17 + 1][local20];
				if (local1669 != null && local1669.aBoolean77) {
					Static119.aClass87_17.method2823(local1669);
				}
			}
			if (local20 < Static89.anInt2074) {
				local1669 = local30[local17][local20 + 1];
				if (local1669 != null && local1669.aBoolean77) {
					Static119.aClass87_17.method2823(local1669);
				}
			}
			if (local17 > Static137.anInt3098) {
				local1669 = local30[local17 - 1][local20];
				if (local1669 != null && local1669.aBoolean77) {
					Static119.aClass87_17.method2823(local1669);
				}
			}
			if (local20 > Static89.anInt2074) {
				local1669 = local30[local17][local20 - 1];
				if (local1669 != null && local1669.aBoolean77) {
					Static119.aClass87_17.method2823(local1669);
				}
			}
		}
	}
}

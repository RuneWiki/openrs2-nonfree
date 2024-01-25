import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!du", name = "f", descriptor = "Lclient!hd;")
	private static Class110 aClass110_4;

	@OriginalMember(owner = "client!du", name = "j", descriptor = "Lclient!hd;")
	private static Class110 aClass110_5;

	@OriginalMember(owner = "client!du", name = "l", descriptor = "[I")
	private static int[] anIntArray117;

	@OriginalMember(owner = "client!du", name = "s", descriptor = "Lclient!ag;")
	private static Class7 aClass7_1;

	@OriginalMember(owner = "client!du", name = "v", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray9;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "[I")
	private static final int[] anIntArray115 = new int[5];

	@OriginalMember(owner = "client!du", name = "e", descriptor = "I")
	private static int anInt1577 = 0;

	@OriginalMember(owner = "client!du", name = "k", descriptor = "[I")
	private static final int[] anIntArray116 = new int[1000];

	@OriginalMember(owner = "client!du", name = "m", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!du", name = "o", descriptor = "[[I")
	private static final int[][] anIntArrayArray18 = new int[5][5000];

	@OriginalMember(owner = "client!du", name = "p", descriptor = "I")
	private static int anInt1582 = 0;

	@OriginalMember(owner = "client!du", name = "r", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray8 = new String[1000];

	@OriginalMember(owner = "client!du", name = "t", descriptor = "I")
	private static int anInt1584 = 0;

	@OriginalMember(owner = "client!du", name = "y", descriptor = "[Lclient!bi;")
	private static final Class23[] aClass23Array1 = new Class23[50];

	@OriginalMember(owner = "client!du", name = "z", descriptor = "[I")
	private static final int[] anIntArray118 = new int[3];

	@OriginalMember(owner = "client!du", name = "A", descriptor = "Lclient!jk;")
	public static final Class137 aClass137_11 = new Class137(4);

	@OriginalMember(owner = "client!du", name = "B", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray10 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!du", name = "C", descriptor = "I")
	private static int anInt1588 = 0;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IZ)V")
	private static void method1279(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class110 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class110 local35;
		@Pc(210) Class110 local210;
		@Pc(13) int local13;
		@Pc(158) Class110 local158;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt1584 -= 3;
				local13 = anIntArray116[anInt1584];
				local19 = anIntArray116[anInt1584 + 1];
				local25 = anIntArray116[anInt1584 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static235.method3185(local13);
				if (local35.aClass110Array1 == null) {
					local35.aClass110Array1 = new Class110[local25 + 1];
				}
				if (local35.aClass110Array1.length <= local25) {
					@Pc(54) Class110[] local54 = new Class110[local25 + 1];
					for (local56 = 0; local56 < local35.aClass110Array1.length; local56++) {
						local54[local56] = local35.aClass110Array1[local56];
					}
					local35.aClass110Array1 = local54;
				}
				if (local25 > 0 && local35.aClass110Array1[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class110 local99 = new Class110();
				local99.anInt2627 = local19;
				local99.anInt2649 = local99.anInt2675 = local35.anInt2675;
				local99.anInt2585 = local25;
				local35.aClass110Array1[local25] = local99;
				if (arg1) {
					aClass110_4 = local99;
				} else {
					aClass110_5 = local99;
				}
				Static118.method1693(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass110_4 : aClass110_5;
				if (local137.anInt2585 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static235.method3185(local137.anInt2675);
				local158.aClass110Array1[local137.anInt2585] = null;
				Static118.method1693(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static235.method3185(anIntArray116[--anInt1584]);
				local137.aClass110Array1 = null;
				Static118.method1693(local137);
				return;
			}
			if (arg0 == 200) {
				anInt1584 -= 2;
				local13 = anIntArray116[anInt1584];
				local19 = anIntArray116[anInt1584 + 1];
				local210 = Static220.method2992(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray116[anInt1584++] = 1;
					if (arg1) {
						aClass110_4 = local210;
						return;
					}
					aClass110_5 = local210;
					return;
				}
				anIntArray116[anInt1584++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray116[--anInt1584];
				local158 = Static235.method3185(local13);
				if (local158 != null) {
					anIntArray116[anInt1584++] = 1;
					if (arg1) {
						aClass110_4 = local158;
						return;
					}
					aClass110_5 = local158;
					return;
				}
				anIntArray116[anInt1584++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray116[--anInt1584];
				method1280(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray116[--anInt1584];
				method1288(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt1584 -= 2;
					local13 = anIntArray116[anInt1584];
					local19 = anIntArray116[anInt1584 + 1];
					for (local25 = 0; local25 < Static275.anIntArray374.length; local25++) {
						if (Static275.anIntArray374[local25] == local13) {
							Static401.aClass8_Sub3_Sub1_Sub1_2.aClass60_1.method1333(local19, local25, Static116.aClass101_2);
							return;
						}
					}
					for (local353 = 0; local353 < Static334.anIntArray434.length; local353++) {
						if (Static334.anIntArray434[local353] == local13) {
							Static401.aClass8_Sub3_Sub1_Sub1_2.aClass60_1.method1333(local19, local353, Static116.aClass101_2);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt1584 -= 2;
					local13 = anIntArray116[anInt1584];
					local19 = anIntArray116[anInt1584 + 1];
					Static401.aClass8_Sub3_Sub1_Sub1_2.aClass60_1.method1331(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray116[--anInt1584] != 0;
					Static401.aClass8_Sub3_Sub1_Sub1_2.aClass60_1.method1327(local412);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1488) String local1488;
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static235.method3185(anIntArray116[--anInt1584]);
					} else {
						local137 = arg1 ? aClass110_4 : aClass110_5;
					}
					if (arg0 == 1100) {
						anInt1584 -= 2;
						local137.anInt2630 = anIntArray116[anInt1584];
						if (local137.anInt2630 > local137.anInt2634 - local137.anInt2617) {
							local137.anInt2630 = local137.anInt2634 - local137.anInt2617;
						}
						if (local137.anInt2630 < 0) {
							local137.anInt2630 = 0;
						}
						local137.anInt2642 = anIntArray116[anInt1584 + 1];
						if (local137.anInt2642 > local137.anInt2596 - local137.anInt2590) {
							local137.anInt2642 = local137.anInt2596 - local137.anInt2590;
						}
						if (local137.anInt2642 < 0) {
							local137.anInt2642 = 0;
						}
						Static118.method1693(local137);
						if (local137.anInt2585 == -1) {
							Static178.method2492(local137.anInt2675);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt2665 = anIntArray116[--anInt1584];
						Static118.method1693(local137);
						if (local137.anInt2585 == -1) {
							Static228.method3081(local137.anInt2675);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean182 = anIntArray116[--anInt1584] == 1;
						Static118.method1693(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt2651 = anIntArray116[--anInt1584];
						Static118.method1693(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt2648 = anIntArray116[--anInt1584];
						Static118.method1693(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray116[--anInt1584];
						if (local137.anInt2636 != local19) {
							local137.anInt2636 = local19;
							Static118.method1693(local137);
						}
						if (local137.anInt2585 == -1) {
							Static342.method4553(local137.anInt2675);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt2604 = anIntArray116[--anInt1584];
						Static118.method1693(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean185 = anIntArray116[--anInt1584] == 1;
						Static118.method1693(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt2593 = 1;
						local137.anInt2658 = anIntArray116[--anInt1584];
						Static118.method1693(local137);
						if (local137.anInt2585 == -1) {
							Static444.method5913(local137.anInt2675);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt1584 -= 6;
						local137.anInt2607 = anIntArray116[anInt1584];
						local137.anInt2657 = anIntArray116[anInt1584 + 1];
						local137.anInt2619 = anIntArray116[anInt1584 + 2];
						local137.anInt2597 = anIntArray116[anInt1584 + 3];
						local137.anInt2659 = anIntArray116[anInt1584 + 4];
						local137.anInt2650 = anIntArray116[anInt1584 + 5];
						Static118.method1693(local137);
						if (local137.anInt2585 == -1) {
							Static117.method1688(local137.anInt2675);
							Static440.method5861(local137.anInt2675);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray116[--anInt1584];
						if (local137.anInt2667 != local19) {
							local137.anInt2667 = local19;
							local137.anInt2664 = 0;
							local137.anInt2660 = 1;
							local137.anInt2624 = 0;
							Static118.method1693(local137);
						}
						if (local137.anInt2585 == -1) {
							Static177.method2484(local137.anInt2675);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean174 = anIntArray116[--anInt1584] == 1;
						Static118.method1693(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray8[--anInt1582];
						if (!local1101.equals(local137.aString19)) {
							local137.aString19 = local1101;
							Static118.method1693(local137);
						}
						if (local137.anInt2585 == -1) {
							Static16.method219(local137.anInt2675);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt2662 = anIntArray116[--anInt1584];
						Static118.method1693(local137);
						if (local137.anInt2585 == -1) {
							Static410.method5568(local137.anInt2675);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt1584 -= 3;
						local137.anInt2592 = anIntArray116[anInt1584];
						local137.anInt2631 = anIntArray116[anInt1584 + 1];
						local137.anInt2600 = anIntArray116[anInt1584 + 2];
						Static118.method1693(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean172 = anIntArray116[--anInt1584] == 1;
						Static118.method1693(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt2616 = anIntArray116[--anInt1584];
						Static118.method1693(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt2661 = anIntArray116[--anInt1584];
						Static118.method1693(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.lb = anIntArray116[--anInt1584] == 1;
						Static118.method1693(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean180 = anIntArray116[--anInt1584] == 1;
						Static118.method1693(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt1584 -= 2;
						local137.anInt2634 = anIntArray116[anInt1584];
						local137.anInt2596 = anIntArray116[anInt1584 + 1];
						Static118.method1693(local137);
						if (local137.anInt2627 == 0) {
							Static453.method6005(local137, false);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt1584 -= 2;
						local137.anInt2587 = (short) anIntArray116[anInt1584];
						local137.anInt2655 = (short) anIntArray116[anInt1584 + 1];
						Static118.method1693(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean178 = anIntArray116[--anInt1584] == 1;
						Static118.method1693(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt2650 = anIntArray116[--anInt1584];
						Static118.method1693(local137);
						if (local137.anInt2585 == -1) {
							Static117.method1688(local137.anInt2675);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray116[--anInt1584];
						local137.aBoolean173 = local19 == 1;
						Static118.method1693(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt1584 -= 2;
						local137.anInt2635 = anIntArray116[anInt1584];
						local137.anInt2646 = anIntArray116[anInt1584 + 1];
						Static118.method1693(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt2654 = anIntArray116[--anInt1584];
						Static118.method1693(local137);
						return;
					}
					@Pc(1454) Class247 local1454;
					if (arg0 == 1127) {
						anInt1584 -= 2;
						local19 = anIntArray116[anInt1584];
						local25 = anIntArray116[anInt1584 + 1];
						local1454 = Static435.aClass240_2.method5128(local19);
						if (local25 != local1454.anInt6901) {
							local137.method2056(local19, local25);
							return;
						}
						local137.method2050(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray116[--anInt1584];
						local1488 = aStringArray8[--anInt1582];
						local1454 = Static435.aClass240_2.method5128(local19);
						if (!local1454.aString72.equals(local1488)) {
							local137.method2047(local19, local1488);
							return;
						}
						local137.method2050(local19);
						return;
					}
				} else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static235.method3185(anIntArray116[--anInt1584]);
					} else {
						local137 = arg1 ? aClass110_4 : aClass110_5;
					}
					Static118.method1693(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt1584 -= 2;
						local19 = anIntArray116[anInt1584];
						local25 = anIntArray116[anInt1584 + 1];
						if (local137.anInt2585 == -1) {
							Static332.method4389(local137.anInt2675);
							Static117.method1688(local137.anInt2675);
							Static440.method5861(local137.anInt2675);
						}
						if (local19 == -1) {
							local137.anInt2593 = 1;
							local137.anInt2658 = -1;
							local137.anInt2588 = -1;
							return;
						}
						local137.anInt2588 = local19;
						local137.anInt2610 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean183 = true;
						} else {
							local137.aBoolean183 = false;
						}
						@Pc(1630) Class80 local1630 = Static416.aClass64_2.method1372(local19);
						local137.anInt2619 = local1630.anInt1982;
						local137.anInt2597 = local1630.anInt2021;
						local137.anInt2659 = local1630.anInt1994;
						local137.anInt2607 = local1630.anInt1960;
						local137.anInt2657 = local1630.anInt1993;
						local137.anInt2650 = local1630.anInt2017;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt2628 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt2628 = 1;
						} else {
							local137.anInt2628 = 2;
						}
						if (local137.anInt2621 > 0) {
							local137.anInt2650 = local137.anInt2650 * 32 / local137.anInt2621;
							return;
						}
						if (local137.anInt2608 > 0) {
							local137.anInt2650 = local137.anInt2650 * 32 / local137.anInt2608;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt2593 = 2;
						local137.anInt2658 = anIntArray116[--anInt1584];
						if (local137.anInt2585 == -1) {
							Static444.method5913(local137.anInt2675);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt2593 = 3;
						local137.anInt2658 = -1;
						if (local137.anInt2585 == -1) {
							Static444.method5913(local137.anInt2675);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt2593 = 6;
						local137.anInt2658 = anIntArray116[--anInt1584];
						if (local137.anInt2585 == -1) {
							Static444.method5913(local137.anInt2675);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt2593 = 5;
						local137.anInt2658 = anIntArray116[--anInt1584];
						if (local137.anInt2585 == -1) {
							Static444.method5913(local137.anInt2675);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt1584 -= 4;
						local137.anInt2677 = anIntArray116[anInt1584];
						local137.anInt2595 = anIntArray116[anInt1584 + 1];
						local137.anInt2598 = anIntArray116[anInt1584 + 2];
						local137.anInt2673 = anIntArray116[anInt1584 + 3];
						Static118.method1693(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt1584 -= 2;
						local137.anInt2653 = anIntArray116[anInt1584];
						local137.anInt2666 = anIntArray116[anInt1584 + 1];
						Static118.method1693(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt1584 -= 4;
						local137.anInt2658 = anIntArray116[anInt1584];
						local137.anInt2599 = anIntArray116[anInt1584 + 1];
						if (anIntArray116[anInt1584 + 2] == 1) {
							local137.anInt2593 = 9;
						} else {
							local137.anInt2593 = 8;
						}
						if (anIntArray116[anInt1584 + 3] == 1) {
							local137.aBoolean183 = true;
						} else {
							local137.aBoolean183 = false;
						}
						if (local137.anInt2585 == -1) {
							Static444.method5913(local137.anInt2675);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt2593 = 5;
						local137.anInt2658 = Static12.anInt187;
						local137.anInt2599 = 0;
						if (local137.anInt2585 == -1) {
							Static444.method5913(local137.anInt2675);
						}
						return;
					}
				} else {
					@Pc(2290) int local2290;
					if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
						if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
							if (arg0 >= 2000) {
								arg0 -= 1000;
								local137 = Static235.method3185(anIntArray116[--anInt1584]);
							} else {
								local137 = arg1 ? aClass110_4 : aClass110_5;
							}
							local1101 = aStringArray8[--anInt1582];
							@Pc(2369) int[] local2369 = null;
							if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
								local353 = anIntArray116[--anInt1584];
								if (local353 > 0) {
									local2369 = new int[local353];
									while (local353-- > 0) {
										local2369[local353] = anIntArray116[--anInt1584];
									}
								}
								local1101 = local1101.substring(0, local1101.length() - 1);
							}
							@Pc(2421) Object[] local2421 = new Object[local1101.length() + 1];
							for (local2290 = local2421.length - 1; local2290 >= 1; local2290--) {
								if (local1101.charAt(local2290 - 1) == 's') {
									local2421[local2290] = aStringArray8[--anInt1582];
								} else {
									local2421[local2290] = Integer.valueOf(anIntArray116[--anInt1584]);
								}
							}
							local56 = anIntArray116[--anInt1584];
							if (local56 == -1) {
								local2421 = null;
							} else {
								local2421[0] = Integer.valueOf(local56);
							}
							if (arg0 == 1400) {
								local137.anObjectArray26 = local2421;
							} else if (arg0 == 1401) {
								local137.anObjectArray13 = local2421;
							} else if (arg0 == 1402) {
								local137.anObjectArray17 = local2421;
							} else if (arg0 == 1403) {
								local137.anObjectArray30 = local2421;
							} else if (arg0 == 1404) {
								local137.anObjectArray18 = local2421;
							} else if (arg0 == 1405) {
								local137.anObjectArray8 = local2421;
							} else if (arg0 == 1406) {
								local137.anObjectArray4 = local2421;
							} else if (arg0 == 1407) {
								local137.anObjectArray28 = local2421;
								local137.anIntArray221 = local2369;
							} else if (arg0 == 1408) {
								local137.anObjectArray24 = local2421;
							} else if (arg0 == 1409) {
								local137.anObjectArray6 = local2421;
							} else if (arg0 == 1410) {
								local137.anObjectArray21 = local2421;
							} else if (arg0 == 1411) {
								local137.anObjectArray5 = local2421;
							} else if (arg0 == 1412) {
								local137.anObjectArray25 = local2421;
							} else if (arg0 == 1414) {
								local137.anObjectArray14 = local2421;
								local137.anIntArray223 = local2369;
							} else if (arg0 == 1415) {
								local137.anObjectArray12 = local2421;
								local137.anIntArray216 = local2369;
							} else if (arg0 == 1416) {
								local137.anObjectArray3 = local2421;
							} else if (arg0 == 1417) {
								local137.anObjectArray32 = local2421;
							} else if (arg0 == 1418) {
								local137.anObjectArray16 = local2421;
							} else if (arg0 == 1419) {
								local137.anObjectArray11 = local2421;
							} else if (arg0 == 1420) {
								local137.anObjectArray15 = local2421;
							} else if (arg0 == 1421) {
								local137.anObjectArray19 = local2421;
							} else if (arg0 == 1422) {
								local137.anObjectArray22 = local2421;
							} else if (arg0 == 1423) {
								local137.anObjectArray7 = local2421;
							} else if (arg0 == 1424) {
								local137.anObjectArray31 = local2421;
							} else if (arg0 == 1425) {
								local137.anObjectArray29 = local2421;
							} else if (arg0 == 1426) {
								local137.anObjectArray27 = local2421;
							} else if (arg0 == 1427) {
								local137.anObjectArray10 = local2421;
							} else if (arg0 == 1428) {
								local137.anObjectArray9 = local2421;
								local137.anIntArray219 = local2369;
							} else if (arg0 == 1429) {
								local137.anObjectArray33 = local2421;
								local137.anIntArray222 = local2369;
							} else if (arg0 == 1430) {
								local137.anObjectArray23 = local2421;
							}
							local137.aBoolean176 = true;
							return;
						}
						if (arg0 < 1600) {
							local137 = arg1 ? aClass110_4 : aClass110_5;
							if (arg0 == 1500) {
								anIntArray116[anInt1584++] = local137.anInt2622;
								return;
							}
							if (arg0 == 1501) {
								anIntArray116[anInt1584++] = local137.anInt2643;
								return;
							}
							if (arg0 == 1502) {
								anIntArray116[anInt1584++] = local137.anInt2617;
								return;
							}
							if (arg0 == 1503) {
								anIntArray116[anInt1584++] = local137.anInt2590;
								return;
							}
							if (arg0 == 1504) {
								anIntArray116[anInt1584++] = local137.aBoolean179 ? 1 : 0;
								return;
							}
							if (arg0 == 1505) {
								anIntArray116[anInt1584++] = local137.anInt2649;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static9.method3940(local137);
								anIntArray116[anInt1584++] = local158 == null ? -1 : local158.anInt2675;
								return;
							}
						} else {
							@Pc(3017) Class247 local3017;
							if (arg0 < 1700) {
								local137 = arg1 ? aClass110_4 : aClass110_5;
								if (arg0 == 1600) {
									anIntArray116[anInt1584++] = local137.anInt2630;
									return;
								}
								if (arg0 == 1601) {
									anIntArray116[anInt1584++] = local137.anInt2642;
									return;
								}
								if (arg0 == 1602) {
									aStringArray8[anInt1582++] = local137.aString19;
									return;
								}
								if (arg0 == 1603) {
									anIntArray116[anInt1584++] = local137.anInt2634;
									return;
								}
								if (arg0 == 1604) {
									anIntArray116[anInt1584++] = local137.anInt2596;
									return;
								}
								if (arg0 == 1605) {
									anIntArray116[anInt1584++] = local137.anInt2650;
									return;
								}
								if (arg0 == 1606) {
									anIntArray116[anInt1584++] = local137.anInt2619;
									return;
								}
								if (arg0 == 1607) {
									anIntArray116[anInt1584++] = local137.anInt2659;
									return;
								}
								if (arg0 == 1608) {
									anIntArray116[anInt1584++] = local137.anInt2597;
									return;
								}
								if (arg0 == 1609) {
									anIntArray116[anInt1584++] = local137.anInt2651;
									return;
								}
								if (arg0 == 1610) {
									anIntArray116[anInt1584++] = local137.anInt2607;
									return;
								}
								if (arg0 == 1611) {
									anIntArray116[anInt1584++] = local137.anInt2657;
									return;
								}
								if (arg0 == 1612) {
									anIntArray116[anInt1584++] = local137.anInt2636;
									return;
								}
								if (arg0 == 1613) {
									local19 = anIntArray116[--anInt1584];
									local3017 = Static435.aClass240_2.method5128(local19);
									if (local3017.method5556()) {
										aStringArray8[anInt1582++] = local137.method2059(local19, local3017.aString72);
									} else {
										anIntArray116[anInt1584++] = local137.method2065(local19, local3017.anInt6901);
									}
								}
							} else if (arg0 < 1800) {
								local137 = arg1 ? aClass110_4 : aClass110_5;
								if (arg0 == 1700) {
									anIntArray116[anInt1584++] = local137.anInt2588;
									return;
								}
								if (arg0 == 1701) {
									if (local137.anInt2588 != -1) {
										anIntArray116[anInt1584++] = local137.anInt2610;
										return;
									}
									anIntArray116[anInt1584++] = 0;
									return;
								}
								if (arg0 == 1702) {
									anIntArray116[anInt1584++] = local137.anInt2585;
									return;
								}
							} else if (arg0 < 1900) {
								local137 = arg1 ? aClass110_4 : aClass110_5;
								if (arg0 == 1800) {
									anIntArray116[anInt1584++] = Static55.method752(local137).method2796();
									return;
								}
								if (arg0 == 1801) {
									local19 = anIntArray116[--anInt1584];
									local19--;
									if (local137.aStringArray25 != null && local19 < local137.aStringArray25.length && local137.aStringArray25[local19] != null) {
										aStringArray8[anInt1582++] = local137.aStringArray25[local19];
										return;
									}
									aStringArray8[anInt1582++] = "";
									return;
								}
								if (arg0 == 1802) {
									if (local137.aString18 == null) {
										aStringArray8[anInt1582++] = "";
										return;
									}
									aStringArray8[anInt1582++] = local137.aString18;
									return;
								}
							} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
								if (arg0 >= 2000) {
									local137 = Static235.method3185(anIntArray116[--anInt1584]);
									arg0 -= 1000;
								} else {
									local137 = arg1 ? aClass110_4 : aClass110_5;
								}
								if (anInt1588 >= 10) {
									throw new RuntimeException("C29xx-1");
								}
								if (arg0 == 1927) {
									if (local137.anObjectArray10 == null) {
										return;
									}
									@Pc(3254) Class4_Sub34 local3254 = new Class4_Sub34();
									local3254.aClass110_14 = local137;
									local3254.anObjectArray34 = local137.anObjectArray10;
									local3254.anInt4907 = anInt1588 + 1;
									Static302.aClass244_29.method5273(local3254);
									return;
								}
							} else if (arg0 < 2600) {
								local137 = Static235.method3185(anIntArray116[--anInt1584]);
								if (arg0 == 2500) {
									anIntArray116[anInt1584++] = local137.anInt2622;
									return;
								}
								if (arg0 == 2501) {
									anIntArray116[anInt1584++] = local137.anInt2643;
									return;
								}
								if (arg0 == 2502) {
									anIntArray116[anInt1584++] = local137.anInt2617;
									return;
								}
								if (arg0 == 2503) {
									anIntArray116[anInt1584++] = local137.anInt2590;
									return;
								}
								if (arg0 == 2504) {
									anIntArray116[anInt1584++] = local137.aBoolean179 ? 1 : 0;
									return;
								}
								if (arg0 == 2505) {
									anIntArray116[anInt1584++] = local137.anInt2649;
									return;
								}
								if (arg0 == 1506) {
									local158 = Static9.method3940(local137);
									anIntArray116[anInt1584++] = local158 == null ? -1 : local158.anInt2675;
									return;
								}
							} else if (arg0 < 2700) {
								local137 = Static235.method3185(anIntArray116[--anInt1584]);
								if (arg0 == 2600) {
									anIntArray116[anInt1584++] = local137.anInt2630;
									return;
								}
								if (arg0 == 2601) {
									anIntArray116[anInt1584++] = local137.anInt2642;
									return;
								}
								if (arg0 == 2602) {
									aStringArray8[anInt1582++] = local137.aString19;
									return;
								}
								if (arg0 == 2603) {
									anIntArray116[anInt1584++] = local137.anInt2634;
									return;
								}
								if (arg0 == 2604) {
									anIntArray116[anInt1584++] = local137.anInt2596;
									return;
								}
								if (arg0 == 2605) {
									anIntArray116[anInt1584++] = local137.anInt2650;
									return;
								}
								if (arg0 == 2606) {
									anIntArray116[anInt1584++] = local137.anInt2619;
									return;
								}
								if (arg0 == 2607) {
									anIntArray116[anInt1584++] = local137.anInt2659;
									return;
								}
								if (arg0 == 2608) {
									anIntArray116[anInt1584++] = local137.anInt2597;
									return;
								}
								if (arg0 == 2609) {
									anIntArray116[anInt1584++] = local137.anInt2651;
									return;
								}
								if (arg0 == 2610) {
									anIntArray116[anInt1584++] = local137.anInt2607;
									return;
								}
								if (arg0 == 2611) {
									anIntArray116[anInt1584++] = local137.anInt2657;
									return;
								}
								if (arg0 == 2612) {
									anIntArray116[anInt1584++] = local137.anInt2636;
									return;
								}
							} else {
								@Pc(3751) Class4_Sub8 local3751;
								@Pc(3649) Class4_Sub8 local3649;
								if (arg0 < 2800) {
									if (arg0 == 2700) {
										local137 = Static235.method3185(anIntArray116[--anInt1584]);
										anIntArray116[anInt1584++] = local137.anInt2588;
										return;
									}
									if (arg0 == 2701) {
										local137 = Static235.method3185(anIntArray116[--anInt1584]);
										if (local137.anInt2588 != -1) {
											anIntArray116[anInt1584++] = local137.anInt2610;
											return;
										}
										anIntArray116[anInt1584++] = 0;
										return;
									}
									if (arg0 == 2702) {
										local13 = anIntArray116[--anInt1584];
										local3649 = (Class4_Sub8) Static449.aClass67_37.method1429((long) local13);
										if (local3649 != null) {
											anIntArray116[anInt1584++] = 1;
											return;
										}
										anIntArray116[anInt1584++] = 0;
										return;
									}
									if (arg0 == 2703) {
										local137 = Static235.method3185(anIntArray116[--anInt1584]);
										if (local137.aClass110Array1 == null) {
											anIntArray116[anInt1584++] = 0;
											return;
										}
										local19 = local137.aClass110Array1.length;
										for (local25 = 0; local25 < local137.aClass110Array1.length; local25++) {
											if (local137.aClass110Array1[local25] == null) {
												local19 = local25;
												break;
											}
										}
										anIntArray116[anInt1584++] = local19;
										return;
									}
									if (arg0 == 2704 || arg0 == 2705) {
										anInt1584 -= 2;
										local13 = anIntArray116[anInt1584];
										local19 = anIntArray116[anInt1584 + 1];
										local3751 = (Class4_Sub8) Static449.aClass67_37.method1429((long) local13);
										if (local3751 != null && local3751.anInt861 == local19) {
											anIntArray116[anInt1584++] = 1;
											return;
										}
										anIntArray116[anInt1584++] = 0;
										return;
									}
								} else if (arg0 < 2900) {
									local137 = Static235.method3185(anIntArray116[--anInt1584]);
									if (arg0 == 2800) {
										anIntArray116[anInt1584++] = Static55.method752(local137).method2796();
										return;
									}
									if (arg0 == 2801) {
										local19 = anIntArray116[--anInt1584];
										local19--;
										if (local137.aStringArray25 != null && local19 < local137.aStringArray25.length && local137.aStringArray25[local19] != null) {
											aStringArray8[anInt1582++] = local137.aStringArray25[local19];
											return;
										}
										aStringArray8[anInt1582++] = "";
										return;
									}
									if (arg0 == 2802) {
										if (local137.aString18 == null) {
											aStringArray8[anInt1582++] = "";
											return;
										}
										aStringArray8[anInt1582++] = local137.aString18;
										return;
									}
								} else {
									@Pc(3888) String local3888;
									if (arg0 < 3200) {
										if (arg0 == 3100) {
											local3888 = aStringArray8[--anInt1582];
											Static392.method5198(local3888);
											return;
										}
										if (arg0 == 3101) {
											anInt1584 -= 2;
											Static315.method4080(anIntArray116[anInt1584], anIntArray116[anInt1584 + 1], Static401.aClass8_Sub3_Sub1_Sub1_2);
											return;
										}
										if (arg0 == 3103) {
											Static458.method5401();
											return;
										}
										if (arg0 == 3104) {
											local3888 = aStringArray8[--anInt1582];
											local19 = 0;
											if (Static269.method3566(local3888)) {
												local19 = Static113.method1676(local3888);
											}
											Static448.method5935(Static188.aClass146_51);
											Static247.aClass4_Sub9_Sub2_2.method5047(local19);
											return;
										}
										if (arg0 == 3105) {
											local3888 = aStringArray8[--anInt1582];
											Static448.method5935(Static251.aClass146_58);
											Static247.aClass4_Sub9_Sub2_2.method4999(local3888.length() + 1);
											Static247.aClass4_Sub9_Sub2_2.method5039(local3888);
											return;
										}
										if (arg0 == 3106) {
											local3888 = aStringArray8[--anInt1582];
											Static448.method5935(Static412.aClass146_98);
											Static247.aClass4_Sub9_Sub2_2.method4999(local3888.length() + 1);
											Static247.aClass4_Sub9_Sub2_2.method5039(local3888);
											return;
										}
										if (arg0 == 3107) {
											local13 = anIntArray116[--anInt1584];
											local1101 = aStringArray8[--anInt1582];
											Static437.method5814(local1101, local13);
											return;
										}
										if (arg0 == 3108) {
											anInt1584 -= 3;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											local25 = anIntArray116[anInt1584 + 2];
											local35 = Static235.method3185(local25);
											Static293.method3830(local35, local19, local13);
											return;
										}
										if (arg0 == 3109) {
											anInt1584 -= 2;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											local210 = arg1 ? aClass110_4 : aClass110_5;
											Static293.method3830(local210, local19, local13);
											return;
										}
										if (arg0 == 3110) {
											local13 = anIntArray116[--anInt1584];
											Static448.method5935(Static98.aClass146_33);
											Static247.aClass4_Sub9_Sub2_2.method5029(local13);
											return;
										}
										if (arg0 == 3111) {
											anInt1584 -= 2;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											local3751 = (Class4_Sub8) Static449.aClass67_37.method1429((long) local13);
											if (local3751 != null) {
												Static242.method3223(local3751, local3751.anInt861 != local19, true);
											}
											Static252.method3318(true, local19, local13, 3);
											return;
										}
										if (arg0 == 3112) {
											anInt1584--;
											local13 = anIntArray116[anInt1584];
											local3649 = (Class4_Sub8) Static449.aClass67_37.method1429((long) local13);
											if (local3649 != null && local3649.anInt859 == 3) {
												Static242.method3223(local3649, true, true);
											}
											return;
										}
										if (arg0 == 3113) {
											Static15.method182(aStringArray8[--anInt1582]);
											return;
										}
										if (arg0 == 3114) {
											anInt1584 -= 2;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											local1488 = aStringArray8[--anInt1582];
											Static290.method3782("", local1488, local19, "", local13);
											return;
										}
									} else if (arg0 < 3300) {
										if (arg0 == 3200) {
											anInt1584 -= 3;
											Static341.method4516(anIntArray116[anInt1584 + 2], anIntArray116[anInt1584 + 1], anIntArray116[anInt1584], 255);
											return;
										}
										if (arg0 == 3201) {
											Static108.method139(anIntArray116[--anInt1584], 50, 255);
											return;
										}
										if (arg0 == 3202) {
											anInt1584 -= 2;
											Static25.method342(anIntArray116[anInt1584 + 1], anIntArray116[anInt1584], 255);
											return;
										}
										if (arg0 == 3203) {
											anInt1584 -= 4;
											Static341.method4516(anIntArray116[anInt1584 + 2], anIntArray116[anInt1584 + 1], anIntArray116[anInt1584], anIntArray116[anInt1584 + 3]);
											return;
										}
										if (arg0 == 3204) {
											anInt1584 -= 3;
											Static108.method139(anIntArray116[anInt1584], anIntArray116[anInt1584 + 2], anIntArray116[anInt1584 + 1]);
											return;
										}
										if (arg0 == 3205) {
											anInt1584 -= 3;
											Static25.method342(anIntArray116[anInt1584 + 1], anIntArray116[anInt1584], anIntArray116[anInt1584 + 2]);
											return;
										}
										if (arg0 == 3206) {
											anInt1584 -= 4;
											Static380.method4989(anIntArray116[anInt1584], anIntArray116[anInt1584 + 1], anIntArray116[anInt1584 + 2], anIntArray116[anInt1584 + 3]);
											return;
										}
									} else if (arg0 < 3400) {
										if (arg0 == 3300) {
											anIntArray116[anInt1584++] = Static265.anInt4371;
											return;
										}
										if (arg0 == 3301) {
											anInt1584 -= 2;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											anIntArray116[anInt1584++] = Static188.method2764(local13, local19, false);
											return;
										}
										if (arg0 == 3302) {
											anInt1584 -= 2;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											anIntArray116[anInt1584++] = Static160.method3987(local13, false, local19);
											return;
										}
										if (arg0 == 3303) {
											anInt1584 -= 2;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											anIntArray116[anInt1584++] = Static217.method5785(local19, false, local13);
											return;
										}
										if (arg0 == 3304) {
											local13 = anIntArray116[--anInt1584];
											anIntArray116[anInt1584++] = Static332.aClass159_1.method3063(local13).anInt1106;
											return;
										}
										if (arg0 == 3305) {
											local13 = anIntArray116[--anInt1584];
											anIntArray116[anInt1584++] = Static209.anIntArray273[local13];
											return;
										}
										if (arg0 == 3306) {
											local13 = anIntArray116[--anInt1584];
											anIntArray116[anInt1584++] = Static314.anIntArray410[local13];
											return;
										}
										if (arg0 == 3307) {
											local13 = anIntArray116[--anInt1584];
											anIntArray116[anInt1584++] = Static184.anIntArray258[local13];
											return;
										}
										if (arg0 == 3308) {
											@Pc(4605) byte local4605 = Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99;
											local19 = (Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7339 >> 7) + Static365.anInt6047;
											local25 = (Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7343 >> 7) + Static366.anInt6052;
											anIntArray116[anInt1584++] = (local4605 << 28) + (local19 << 14) + local25;
											return;
										}
										if (arg0 == 3309) {
											local13 = anIntArray116[--anInt1584];
											anIntArray116[anInt1584++] = local13 >> 14 & 0x3FFF;
											return;
										}
										if (arg0 == 3310) {
											local13 = anIntArray116[--anInt1584];
											anIntArray116[anInt1584++] = local13 >> 28;
											return;
										}
										if (arg0 == 3311) {
											local13 = anIntArray116[--anInt1584];
											anIntArray116[anInt1584++] = local13 & 0x3FFF;
											return;
										}
										if (arg0 == 3312) {
											anIntArray116[anInt1584++] = Static225.aBoolean284 ? 1 : 0;
											return;
										}
										if (arg0 == 3313) {
											anInt1584 -= 2;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											anIntArray116[anInt1584++] = Static188.method2764(local13, local19, true);
											return;
										}
										if (arg0 == 3314) {
											anInt1584 -= 2;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											anIntArray116[anInt1584++] = Static160.method3987(local13, true, local19);
											return;
										}
										if (arg0 == 3315) {
											anInt1584 -= 2;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											anIntArray116[anInt1584++] = Static217.method5785(local19, true, local13);
											return;
										}
										if (arg0 == 3316) {
											if (Static270.anInt4509 >= 2) {
												anIntArray116[anInt1584++] = Static270.anInt4509;
												return;
											}
											anIntArray116[anInt1584++] = 0;
											return;
										}
										if (arg0 == 3317) {
											anIntArray116[anInt1584++] = Static385.anInt6297;
											return;
										}
										if (arg0 == 3318) {
											anIntArray116[anInt1584++] = Static338.aClass220_5.anInt5746;
											return;
										}
										if (arg0 == 3321) {
											anIntArray116[anInt1584++] = Static327.anInt5289;
											return;
										}
										if (arg0 == 3322) {
											anIntArray116[anInt1584++] = Static10.anInt160;
											return;
										}
										if (arg0 == 3323) {
											if (Static242.anInt4050 >= 5 && Static242.anInt4050 <= 9) {
												anIntArray116[anInt1584++] = 1;
												return;
											}
											anIntArray116[anInt1584++] = 0;
											return;
										}
										if (arg0 == 3324) {
											if (Static242.anInt4050 >= 5 && Static242.anInt4050 <= 9) {
												anIntArray116[anInt1584++] = Static242.anInt4050;
												return;
											}
											anIntArray116[anInt1584++] = 0;
											return;
										}
										if (arg0 == 3325) {
											anIntArray116[anInt1584++] = Static219.aBoolean281 ? 1 : 0;
											return;
										}
										if (arg0 == 3326) {
											anIntArray116[anInt1584++] = Static401.aClass8_Sub3_Sub1_Sub1_2.anInt5682;
											return;
										}
										if (arg0 == 3327) {
											anIntArray116[anInt1584++] = Static401.aClass8_Sub3_Sub1_Sub1_2.aClass60_1.aBoolean109 ? 1 : 0;
											return;
										}
										if (arg0 == 3329) {
											anIntArray116[anInt1584++] = Static339.aBoolean389 ? 1 : 0;
											return;
										}
										if (arg0 == 3330) {
											local13 = anIntArray116[--anInt1584];
											anIntArray116[anInt1584++] = Static435.method5779(local13);
											return;
										}
										if (arg0 == 3331) {
											anInt1584 -= 2;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											anIntArray116[anInt1584++] = Static93.method1433(local19, local13, false);
											return;
										}
										if (arg0 == 3332) {
											anInt1584 -= 2;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											anIntArray116[anInt1584++] = Static93.method1433(local19, local13, true);
											return;
										}
										if (arg0 == 3333) {
											anIntArray116[anInt1584++] = Static11.anInt178;
											return;
										}
										if (arg0 == 3335) {
											anIntArray116[anInt1584++] = Static429.anInt6999;
											return;
										}
										if (arg0 == 3336) {
											anInt1584 -= 4;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											local25 = anIntArray116[anInt1584 + 2];
											local353 = anIntArray116[anInt1584 + 3];
											local13 += local19 << 14;
											local13 += local25 << 28;
											local13 += local353;
											anIntArray116[anInt1584++] = local13;
											return;
										}
										if (arg0 == 3337) {
											anIntArray116[anInt1584++] = Static400.anInt6511;
											return;
										}
										if (arg0 == 3338) {
											anIntArray116[anInt1584++] = Static259.method3461();
											return;
										}
										if (arg0 == 3339) {
											anIntArray116[anInt1584++] = Static216.aBoolean275 ? 1 : 0;
											return;
										}
										if (arg0 == 3340) {
											anIntArray116[anInt1584++] = Static252.aBoolean308 ? 1 : 0;
											return;
										}
									} else if (arg0 < 3500) {
										@Pc(5245) Class233 local5245;
										if (arg0 == 3400) {
											anInt1584 -= 2;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											local5245 = Static294.aClass252_1.method5639(local13);
											aStringArray8[anInt1582++] = local5245.method4914(local19);
											return;
										}
										if (arg0 == 3408) {
											anInt1584 -= 4;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											local25 = anIntArray116[anInt1584 + 2];
											local353 = anIntArray116[anInt1584 + 3];
											@Pc(5291) Class233 local5291 = Static294.aClass252_1.method5639(local25);
											if (local5291.aChar3 == local13 && local5291.aChar4 == local19) {
												if (local19 == 115) {
													aStringArray8[anInt1582++] = local5291.method4914(local353);
													return;
												}
												anIntArray116[anInt1584++] = local5291.method4915(local353);
												return;
											}
											throw new RuntimeException("C3408-1");
										}
										if (arg0 == 3409) {
											anInt1584 -= 3;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											local25 = anIntArray116[anInt1584 + 2];
											if (local19 == -1) {
												throw new RuntimeException("C3409-2");
											}
											@Pc(5367) Class233 local5367 = Static294.aClass252_1.method5639(local19);
											if (local5367.aChar4 != local13) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray116[anInt1584++] = local5367.method4921(local25) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local13 = anIntArray116[--anInt1584];
											local1101 = aStringArray8[--anInt1582];
											if (local13 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local5245 = Static294.aClass252_1.method5639(local13);
											if (local5245.aChar4 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray116[anInt1584++] = local5245.method4916(local1101) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local13 = anIntArray116[--anInt1584];
											@Pc(5465) Class233 local5465 = Static294.aClass252_1.method5639(local13);
											anIntArray116[anInt1584++] = local5465.aClass67_30.method1432();
											return;
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static423.anInt7106 == 0) {
												anIntArray116[anInt1584++] = -2;
												return;
											}
											if (Static423.anInt7106 == 1) {
												anIntArray116[anInt1584++] = -1;
												return;
											}
											anIntArray116[anInt1584++] = Static284.anInt4659;
											return;
										}
										if (arg0 == 3601) {
											local13 = anIntArray116[--anInt1584];
											if (Static423.anInt7106 == 2 && local13 < Static284.anInt4659) {
												aStringArray8[anInt1582++] = Static322.aStringArray36[local13];
												if (Static161.aStringArray27[local13] != null) {
													aStringArray8[anInt1582++] = Static161.aStringArray27[local13];
													return;
												}
												aStringArray8[anInt1582++] = "";
												return;
											}
											aStringArray8[anInt1582++] = "";
											aStringArray8[anInt1582++] = "";
											return;
										}
										if (arg0 == 3602) {
											local13 = anIntArray116[--anInt1584];
											if (Static423.anInt7106 == 2 && local13 < Static284.anInt4659) {
												anIntArray116[anInt1584++] = Static63.anIntArray454[local13];
												return;
											}
											anIntArray116[anInt1584++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local13 = anIntArray116[--anInt1584];
											if (Static423.anInt7106 == 2 && local13 < Static284.anInt4659) {
												anIntArray116[anInt1584++] = Static135.anIntArray205[local13];
												return;
											}
											anIntArray116[anInt1584++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local3888 = aStringArray8[--anInt1582];
											local19 = anIntArray116[--anInt1584];
											Static39.method542(local19, local3888);
											return;
										}
										if (arg0 == 3605) {
											local3888 = aStringArray8[--anInt1582];
											Static93.method1434(local3888);
											return;
										}
										if (arg0 == 3606) {
											local3888 = aStringArray8[--anInt1582];
											Static298.method3882(local3888);
											return;
										}
										if (arg0 == 3607) {
											local3888 = aStringArray8[--anInt1582];
											Static77.method1253(local3888, false);
											return;
										}
										if (arg0 == 3608) {
											local3888 = aStringArray8[--anInt1582];
											Static311.method4063(local3888);
											return;
										}
										if (arg0 == 3609) {
											local3888 = aStringArray8[--anInt1582];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray116[anInt1584++] = Static411.method5578(local3888) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local13 = anIntArray116[--anInt1584];
											if (Static423.anInt7106 == 2 && local13 < Static284.anInt4659) {
												aStringArray8[anInt1582++] = Static114.aStringArray21[local13];
												return;
											}
											aStringArray8[anInt1582++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static272.aString37 != null) {
												aStringArray8[anInt1582++] = Static333.method4394(Static272.aString37);
												return;
											}
											aStringArray8[anInt1582++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static272.aString37 != null) {
												anIntArray116[anInt1584++] = Static87.anInt1666;
												return;
											}
											anIntArray116[anInt1584++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local13 = anIntArray116[--anInt1584];
											if (Static272.aString37 != null && local13 < Static87.anInt1666) {
												aStringArray8[anInt1582++] = Static404.aClass130Array1[local13].aString27;
												return;
											}
											aStringArray8[anInt1582++] = "";
											return;
										}
										if (arg0 == 3614) {
											local13 = anIntArray116[--anInt1584];
											if (Static272.aString37 != null && local13 < Static87.anInt1666) {
												anIntArray116[anInt1584++] = Static404.aClass130Array1[local13].anInt3233;
												return;
											}
											anIntArray116[anInt1584++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local13 = anIntArray116[--anInt1584];
											if (Static272.aString37 != null && local13 < Static87.anInt1666) {
												anIntArray116[anInt1584++] = Static404.aClass130Array1[local13].aByte67;
												return;
											}
											anIntArray116[anInt1584++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray116[anInt1584++] = Static403.aByte94;
											return;
										}
										if (arg0 == 3617) {
											local3888 = aStringArray8[--anInt1582];
											Static2.method7(local3888);
											return;
										}
										if (arg0 == 3618) {
											anIntArray116[anInt1584++] = Static101.aByte32;
											return;
										}
										if (arg0 == 3619) {
											local3888 = aStringArray8[--anInt1582];
											Static241.method3220(local3888);
											return;
										}
										if (arg0 == 3620) {
											Static337.method4455();
											return;
										}
										if (arg0 == 3621) {
											if (Static423.anInt7106 == 0) {
												anIntArray116[anInt1584++] = -1;
												return;
											}
											anIntArray116[anInt1584++] = Static66.anInt1316;
											return;
										}
										if (arg0 == 3622) {
											local13 = anIntArray116[--anInt1584];
											if (Static423.anInt7106 != 0 && local13 < Static66.anInt1316) {
												aStringArray8[anInt1582++] = Static93.aStringArray14[local13];
												if (Static441.aStringArray46[local13] != null) {
													aStringArray8[anInt1582++] = Static441.aStringArray46[local13];
													return;
												}
												aStringArray8[anInt1582++] = "";
												return;
											}
											aStringArray8[anInt1582++] = "";
											aStringArray8[anInt1582++] = "";
											return;
										}
										if (arg0 == 3623) {
											local3888 = aStringArray8[--anInt1582];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray116[anInt1584++] = Static231.method3150(local3888) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local13 = anIntArray116[--anInt1584];
											if (Static404.aClass130Array1 != null && local13 < Static87.anInt1666 && Static404.aClass130Array1[local13].aString28.equalsIgnoreCase(Static401.aClass8_Sub3_Sub1_Sub1_2.aString60)) {
												anIntArray116[anInt1584++] = 1;
												return;
											}
											anIntArray116[anInt1584++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static83.aString57 != null) {
												aStringArray8[anInt1582++] = Static83.aString57;
												return;
											}
											aStringArray8[anInt1582++] = "";
											return;
										}
										if (arg0 == 3626) {
											local13 = anIntArray116[--anInt1584];
											if (Static272.aString37 != null && local13 < Static87.anInt1666) {
												aStringArray8[anInt1582++] = Static404.aClass130Array1[local13].aString30;
												return;
											}
											aStringArray8[anInt1582++] = "";
											return;
										}
										if (arg0 == 3627) {
											local13 = anIntArray116[--anInt1584];
											if (Static423.anInt7106 == 2 && local13 >= 0 && local13 < Static284.anInt4659) {
												anIntArray116[anInt1584++] = Static314.aBooleanArray24[local13] ? 1 : 0;
												return;
											}
											anIntArray116[anInt1584++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local3888 = aStringArray8[--anInt1582];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray116[anInt1584++] = Static128.method5874(local3888);
											return;
										}
										if (arg0 == 3629) {
											anIntArray116[anInt1584++] = Static339.anInt5516;
											return;
										}
										if (arg0 == 3630) {
											local3888 = aStringArray8[--anInt1582];
											Static77.method1253(local3888, true);
											return;
										}
										if (arg0 == 3631) {
											local13 = anIntArray116[--anInt1584];
											anIntArray116[anInt1584++] = Static29.aBooleanArray3[local13] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local13 = anIntArray116[--anInt1584];
											if (Static272.aString37 != null && local13 < Static87.anInt1666) {
												aStringArray8[anInt1582++] = Static404.aClass130Array1[local13].aString28;
												return;
											}
											aStringArray8[anInt1582++] = "";
											return;
										}
										if (arg0 == 3633) {
											local13 = anIntArray116[--anInt1584];
											if (Static423.anInt7106 != 0 && local13 < Static66.anInt1316) {
												aStringArray8[anInt1582++] = Static406.aStringArray42[local13];
												return;
											}
											aStringArray8[anInt1582++] = "";
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local13 = anIntArray116[--anInt1584];
											anIntArray116[anInt1584++] = Static92.aClass232Array1[local13].method4898();
											return;
										}
										if (arg0 == 3904) {
											local13 = anIntArray116[--anInt1584];
											anIntArray116[anInt1584++] = Static92.aClass232Array1[local13].anInt6097;
											return;
										}
										if (arg0 == 3905) {
											local13 = anIntArray116[--anInt1584];
											anIntArray116[anInt1584++] = Static92.aClass232Array1[local13].anInt6101;
											return;
										}
										if (arg0 == 3906) {
											local13 = anIntArray116[--anInt1584];
											anIntArray116[anInt1584++] = Static92.aClass232Array1[local13].anInt6103;
											return;
										}
										if (arg0 == 3907) {
											local13 = anIntArray116[--anInt1584];
											anIntArray116[anInt1584++] = Static92.aClass232Array1[local13].anInt6102;
											return;
										}
										if (arg0 == 3908) {
											local13 = anIntArray116[--anInt1584];
											anIntArray116[anInt1584++] = Static92.aClass232Array1[local13].anInt6098;
											return;
										}
										if (arg0 == 3910) {
											local13 = anIntArray116[--anInt1584];
											local19 = Static92.aClass232Array1[local13].method4897();
											anIntArray116[anInt1584++] = local19 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local13 = anIntArray116[--anInt1584];
											local19 = Static92.aClass232Array1[local13].method4897();
											anIntArray116[anInt1584++] = local19 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local13 = anIntArray116[--anInt1584];
											local19 = Static92.aClass232Array1[local13].method4897();
											anIntArray116[anInt1584++] = local19 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local13 = anIntArray116[--anInt1584];
											local19 = Static92.aClass232Array1[local13].method4897();
											anIntArray116[anInt1584++] = local19 == 1 ? 1 : 0;
											return;
										}
									} else if (arg0 < 4100) {
										if (arg0 == 4000) {
											anInt1584 -= 2;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											anIntArray116[anInt1584++] = local13 + local19;
											return;
										}
										if (arg0 == 4001) {
											anInt1584 -= 2;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											anIntArray116[anInt1584++] = local13 - local19;
											return;
										}
										if (arg0 == 4002) {
											anInt1584 -= 2;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											anIntArray116[anInt1584++] = local13 * local19;
											return;
										}
										if (arg0 == 4003) {
											anInt1584 -= 2;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											anIntArray116[anInt1584++] = local13 / local19;
											return;
										}
										if (arg0 == 4004) {
											local13 = anIntArray116[--anInt1584];
											anIntArray116[anInt1584++] = (int) (Math.random() * (double) local13);
											return;
										}
										if (arg0 == 4005) {
											local13 = anIntArray116[--anInt1584];
											anIntArray116[anInt1584++] = (int) (Math.random() * (double) (local13 + 1));
											return;
										}
										if (arg0 == 4006) {
											anInt1584 -= 5;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											local25 = anIntArray116[anInt1584 + 2];
											local353 = anIntArray116[anInt1584 + 3];
											local2290 = anIntArray116[anInt1584 + 4];
											anIntArray116[anInt1584++] = local13 + (local19 - local13) * (local2290 - local25) / (local353 - local25);
											return;
										}
										@Pc(6975) long local6975;
										@Pc(6968) long local6968;
										if (arg0 == 4007) {
											anInt1584 -= 2;
											local6968 = anIntArray116[anInt1584];
											local6975 = anIntArray116[anInt1584 + 1];
											anIntArray116[anInt1584++] = (int) (local6968 + local6968 * local6975 / 100L);
											return;
										}
										if (arg0 == 4008) {
											anInt1584 -= 2;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											anIntArray116[anInt1584++] = local13 | 0x1 << local19;
											return;
										}
										if (arg0 == 4009) {
											anInt1584 -= 2;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											anIntArray116[anInt1584++] = local13 & -(0x1 << local19) - 1;
											return;
										}
										if (arg0 == 4010) {
											anInt1584 -= 2;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											anIntArray116[anInt1584++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
											return;
										}
										if (arg0 == 4011) {
											anInt1584 -= 2;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											anIntArray116[anInt1584++] = local13 % local19;
											return;
										}
										if (arg0 == 4012) {
											anInt1584 -= 2;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											if (local13 == 0) {
												anIntArray116[anInt1584++] = 0;
												return;
											}
											anIntArray116[anInt1584++] = (int) Math.pow((double) local13, (double) local19);
											return;
										}
										if (arg0 == 4013) {
											anInt1584 -= 2;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											if (local13 == 0) {
												anIntArray116[anInt1584++] = 0;
												return;
											}
											if (local19 == 0) {
												anIntArray116[anInt1584++] = Integer.MAX_VALUE;
												return;
											}
											anIntArray116[anInt1584++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
											return;
										}
										if (arg0 == 4014) {
											anInt1584 -= 2;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											anIntArray116[anInt1584++] = local13 & local19;
											return;
										}
										if (arg0 == 4015) {
											anInt1584 -= 2;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											anIntArray116[anInt1584++] = local13 | local19;
											return;
										}
										if (arg0 == 4016) {
											anInt1584 -= 2;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											anIntArray116[anInt1584++] = local13 < local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4017) {
											anInt1584 -= 2;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											anIntArray116[anInt1584++] = local13 > local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4018) {
											anInt1584 -= 3;
											local6968 = anIntArray116[anInt1584];
											local6975 = anIntArray116[anInt1584 + 1];
											@Pc(7356) long local7356 = (long) anIntArray116[anInt1584 + 2];
											anIntArray116[anInt1584++] = (int) (local6968 * local7356 / local6975);
											return;
										}
									} else if (arg0 < 4200) {
										if (arg0 == 4100) {
											local3888 = aStringArray8[--anInt1582];
											local19 = anIntArray116[--anInt1584];
											aStringArray8[anInt1582++] = local3888 + local19;
											return;
										}
										if (arg0 == 4101) {
											anInt1582 -= 2;
											local3888 = aStringArray8[anInt1582];
											local1101 = aStringArray8[anInt1582 + 1];
											aStringArray8[anInt1582++] = local3888 + local1101;
											return;
										}
										if (arg0 == 4102) {
											local3888 = aStringArray8[--anInt1582];
											local19 = anIntArray116[--anInt1584];
											aStringArray8[anInt1582++] = local3888 + Static47.method616(local19);
											return;
										}
										if (arg0 == 4103) {
											local3888 = aStringArray8[--anInt1582];
											aStringArray8[anInt1582++] = local3888.toLowerCase();
											return;
										}
										if (arg0 == 4104) {
											aStringArray8[anInt1582++] = method1281(anIntArray116[--anInt1584]);
											return;
										}
										if (arg0 == 4105) {
											anInt1582 -= 2;
											local3888 = aStringArray8[anInt1582];
											local1101 = aStringArray8[anInt1582 + 1];
											if (Static401.aClass8_Sub3_Sub1_Sub1_2.aClass60_1 != null && Static401.aClass8_Sub3_Sub1_Sub1_2.aClass60_1.aBoolean109) {
												aStringArray8[anInt1582++] = local1101;
												return;
											}
											aStringArray8[anInt1582++] = local3888;
											return;
										}
										if (arg0 == 4106) {
											local13 = anIntArray116[--anInt1584];
											aStringArray8[anInt1582++] = Integer.toString(local13);
											return;
										}
										if (arg0 == 4107) {
											anInt1582 -= 2;
											anIntArray116[anInt1584++] = Static350.method4637(Static429.anInt6999, aStringArray8[anInt1582], aStringArray8[anInt1582 + 1]);
											return;
										}
										@Pc(7639) Class158 local7639;
										if (arg0 == 4108) {
											local3888 = aStringArray8[--anInt1582];
											anInt1584 -= 2;
											local19 = anIntArray116[anInt1584];
											local25 = anIntArray116[anInt1584 + 1];
											local7639 = Static259.method3463(Static57.aClass211_18, local25);
											anIntArray116[anInt1584++] = local7639.method3027(local3888, local19, Static164.aClass95Array6);
											return;
										}
										if (arg0 == 4109) {
											local3888 = aStringArray8[--anInt1582];
											anInt1584 -= 2;
											local19 = anIntArray116[anInt1584];
											local25 = anIntArray116[anInt1584 + 1];
											local7639 = Static259.method3463(Static57.aClass211_18, local25);
											anIntArray116[anInt1584++] = local7639.method3036(local19, local3888, Static164.aClass95Array6);
											return;
										}
										if (arg0 == 4110) {
											anInt1582 -= 2;
											local3888 = aStringArray8[anInt1582];
											local1101 = aStringArray8[anInt1582 + 1];
											if (anIntArray116[--anInt1584] == 1) {
												aStringArray8[anInt1582++] = local3888;
												return;
											}
											aStringArray8[anInt1582++] = local1101;
											return;
										}
										if (arg0 == 4111) {
											local3888 = aStringArray8[--anInt1582];
											aStringArray8[anInt1582++] = Static265.method3496(local3888);
											return;
										}
										if (arg0 == 4112) {
											local3888 = aStringArray8[--anInt1582];
											local19 = anIntArray116[--anInt1584];
											if (local19 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray8[anInt1582++] = local3888 + (char) local19;
											return;
										}
										if (arg0 == 4113) {
											local13 = anIntArray116[--anInt1584];
											anIntArray116[anInt1584++] = Static225.method3046((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4114) {
											local13 = anIntArray116[--anInt1584];
											anIntArray116[anInt1584++] = Static148.method2082((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4115) {
											local13 = anIntArray116[--anInt1584];
											anIntArray116[anInt1584++] = Static362.method4777((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4116) {
											local13 = anIntArray116[--anInt1584];
											anIntArray116[anInt1584++] = Static75.method1246((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4117) {
											local3888 = aStringArray8[--anInt1582];
											if (local3888 != null) {
												anIntArray116[anInt1584++] = local3888.length();
												return;
											}
											anIntArray116[anInt1584++] = 0;
											return;
										}
										if (arg0 == 4118) {
											local3888 = aStringArray8[--anInt1582];
											anInt1584 -= 2;
											local19 = anIntArray116[anInt1584];
											local25 = anIntArray116[anInt1584 + 1];
											aStringArray8[anInt1582++] = local3888.substring(local19, local25);
											return;
										}
										if (arg0 == 4119) {
											local3888 = aStringArray8[--anInt1582];
											@Pc(8002) StringBuffer local8002 = new StringBuffer(local3888.length());
											@Pc(8004) boolean local8004 = false;
											for (local353 = 0; local353 < local3888.length(); local353++) {
												@Pc(8011) char local8011 = local3888.charAt(local353);
												if (local8011 == '<') {
													local8004 = true;
												} else if (local8011 == '>') {
													local8004 = false;
												} else if (!local8004) {
													local8002.append(local8011);
												}
											}
											aStringArray8[anInt1582++] = local8002.toString();
											return;
										}
										if (arg0 == 4120) {
											local3888 = aStringArray8[--anInt1582];
											anInt1584 -= 2;
											local19 = anIntArray116[anInt1584];
											local25 = anIntArray116[anInt1584 + 1];
											anIntArray116[anInt1584++] = local3888.indexOf(local19, local25);
											return;
										}
										if (arg0 == 4121) {
											anInt1582 -= 2;
											local3888 = aStringArray8[anInt1582];
											local1101 = aStringArray8[anInt1582 + 1];
											local25 = anIntArray116[--anInt1584];
											anIntArray116[anInt1584++] = local3888.indexOf(local1101, local25);
											return;
										}
										if (arg0 == 4122) {
											local13 = anIntArray116[--anInt1584];
											anIntArray116[anInt1584++] = Character.toLowerCase((char) local13);
											return;
										}
										if (arg0 == 4123) {
											local13 = anIntArray116[--anInt1584];
											anIntArray116[anInt1584++] = Character.toUpperCase((char) local13);
											return;
										}
										if (arg0 == 4124) {
											local412 = anIntArray116[--anInt1584] != 0;
											local19 = anIntArray116[--anInt1584];
											aStringArray8[anInt1582++] = Static125.method1759((long) local19, Static429.anInt6999, 0, local412);
											return;
										}
										if (arg0 == 4125) {
											local3888 = aStringArray8[--anInt1582];
											local19 = anIntArray116[--anInt1584];
											@Pc(8225) Class158 local8225 = Static259.method3463(Static57.aClass211_18, local19);
											anIntArray116[anInt1584++] = local8225.method3032(local3888, Static164.aClass95Array6);
											return;
										}
									} else if (arg0 < 4300) {
										if (arg0 == 4200) {
											local13 = anIntArray116[--anInt1584];
											aStringArray8[anInt1582++] = Static416.aClass64_2.method1372(local13).aString10;
											return;
										}
										@Pc(8287) Class80 local8287;
										if (arg0 == 4201) {
											anInt1584 -= 2;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											local8287 = Static416.aClass64_2.method1372(local13);
											if (local19 >= 1 && local19 <= 5 && local8287.aStringArray17[local19 - 1] != null) {
												aStringArray8[anInt1582++] = local8287.aStringArray17[local19 - 1];
												return;
											}
											aStringArray8[anInt1582++] = "";
											return;
										}
										if (arg0 == 4202) {
											anInt1584 -= 2;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											local8287 = Static416.aClass64_2.method1372(local13);
											if (local19 >= 1 && local19 <= 5 && local8287.aStringArray16[local19 - 1] != null) {
												aStringArray8[anInt1582++] = local8287.aStringArray16[local19 - 1];
												return;
											}
											aStringArray8[anInt1582++] = "";
											return;
										}
										if (arg0 == 4203) {
											local13 = anIntArray116[--anInt1584];
											anIntArray116[anInt1584++] = Static416.aClass64_2.method1372(local13).anInt1989;
											return;
										}
										if (arg0 == 4204) {
											local13 = anIntArray116[--anInt1584];
											anIntArray116[anInt1584++] = Static416.aClass64_2.method1372(local13).anInt2005 == 1 ? 1 : 0;
											return;
										}
										@Pc(8450) Class80 local8450;
										if (arg0 == 4205) {
											local13 = anIntArray116[--anInt1584];
											local8450 = Static416.aClass64_2.method1372(local13);
											if (local8450.anInt1990 == -1 && local8450.anInt1998 >= 0) {
												anIntArray116[anInt1584++] = local8450.anInt1998;
												return;
											}
											anIntArray116[anInt1584++] = local13;
											return;
										}
										if (arg0 == 4206) {
											local13 = anIntArray116[--anInt1584];
											local8450 = Static416.aClass64_2.method1372(local13);
											if (local8450.anInt1990 >= 0 && local8450.anInt1998 >= 0) {
												anIntArray116[anInt1584++] = local8450.anInt1998;
												return;
											}
											anIntArray116[anInt1584++] = local13;
											return;
										}
										if (arg0 == 4207) {
											local13 = anIntArray116[--anInt1584];
											anIntArray116[anInt1584++] = Static416.aClass64_2.method1372(local13).aBoolean140 ? 1 : 0;
											return;
										}
										if (arg0 == 4208) {
											anInt1584 -= 2;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											local3017 = Static435.aClass240_2.method5128(local19);
											if (local3017.method5556()) {
												aStringArray8[anInt1582++] = Static416.aClass64_2.method1372(local13).method1606(local19, local3017.aString72);
												return;
											}
											anIntArray116[anInt1584++] = Static416.aClass64_2.method1372(local13).method1605(local3017.anInt6901, local19);
											return;
										}
										if (arg0 == 4209) {
											anInt1584 -= 2;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1] - 1;
											local8287 = Static416.aClass64_2.method1372(local13);
											if (local8287.anInt1977 == local19) {
												anIntArray116[anInt1584++] = local8287.anInt2020;
												return;
											}
											if (local8287.anInt1992 == local19) {
												anIntArray116[anInt1584++] = local8287.anInt1991;
												return;
											}
											anIntArray116[anInt1584++] = -1;
											return;
										}
										if (arg0 == 4210) {
											local3888 = aStringArray8[--anInt1582];
											local19 = anIntArray116[--anInt1584];
											Static224.method3037(local19 == 1, local3888);
											anIntArray116[anInt1584++] = Static246.anInt4087;
											return;
										}
										if (arg0 == 4211) {
											if (Static193.aShortArray15 != null && Static237.anInt5935 < Static246.anInt4087) {
												anIntArray116[anInt1584++] = Static193.aShortArray15[Static237.anInt5935++] & 0xFFFF;
												return;
											}
											anIntArray116[anInt1584++] = -1;
											return;
										}
										if (arg0 == 4212) {
											Static237.anInt5935 = 0;
											return;
										}
									} else if (arg0 < 4400) {
										if (arg0 == 4300) {
											anInt1584 -= 2;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											local3017 = Static435.aClass240_2.method5128(local19);
											if (local3017.method5556()) {
												aStringArray8[anInt1582++] = Static120.aClass115_2.method2201(local13).method1541(local19, local3017.aString72);
												return;
											}
											anIntArray116[anInt1584++] = Static120.aClass115_2.method2201(local13).method1554(local19, local3017.anInt6901);
											return;
										}
									} else if (arg0 < 4500) {
										if (arg0 == 4400) {
											anInt1584 -= 2;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											local3017 = Static435.aClass240_2.method5128(local19);
											if (local3017.method5556()) {
												aStringArray8[anInt1582++] = Static51.aClass151_1.method2917(local13).method2197(local3017.aString72, local19);
												return;
											}
											anIntArray116[anInt1584++] = Static51.aClass151_1.method2917(local13).method2187(local3017.anInt6901, local19);
											return;
										}
									} else if (arg0 < 4600) {
										if (arg0 == 4500) {
											anInt1584 -= 2;
											local13 = anIntArray116[anInt1584];
											local19 = anIntArray116[anInt1584 + 1];
											local3017 = Static435.aClass240_2.method5128(local19);
											if (local3017.method5556()) {
												aStringArray8[anInt1582++] = Static444.aClass179_1.method3493(local13).method340(local3017.aString72, local19);
												return;
											}
											anIntArray116[anInt1584++] = Static444.aClass179_1.method3493(local13).method336(local19, local3017.anInt6901);
											return;
										}
									} else if (arg0 < 4700 && arg0 == 4600) {
										local13 = anIntArray116[--anInt1584];
										@Pc(8951) Class42 local8951 = Static445.aClass1_1.method1(local13);
										if (local8951.anIntArray95 != null && local8951.anIntArray95.length > 0) {
											local25 = 0;
											local353 = local8951.anIntArray96[0];
											for (local2290 = 1; local2290 < local8951.anIntArray95.length; local2290++) {
												if (local8951.anIntArray96[local2290] > local353) {
													local25 = local2290;
													local353 = local8951.anIntArray96[local2290];
												}
											}
											anIntArray116[anInt1584++] = local8951.anIntArray95[local25];
											return;
										}
										anIntArray116[anInt1584++] = local8951.anInt1008;
										return;
									}
								}
							}
						}
					} else {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static235.method3185(anIntArray116[--anInt1584]);
						} else {
							local137 = arg1 ? aClass110_4 : aClass110_5;
						}
						if (arg0 == 1300) {
							local19 = anIntArray116[--anInt1584] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method2049(aStringArray8[--anInt1582], local19);
								return;
							}
							anInt1582--;
							return;
						}
						if (arg0 == 1301) {
							anInt1584 -= 2;
							local19 = anIntArray116[anInt1584];
							local25 = anIntArray116[anInt1584 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass110_8 = null;
								return;
							}
							local137.aClass110_8 = Static220.method2992(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray116[--anInt1584];
							if (local19 != Static189.anInt3488 && local19 != Static199.anInt3568 && local19 != Static377.anInt3940) {
								return;
							}
							local137.anInt2647 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt2611 = anIntArray116[--anInt1584];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt2603 = anIntArray116[--anInt1584];
							return;
						}
						if (arg0 == 1305) {
							local137.aString18 = aStringArray8[--anInt1582];
							return;
						}
						if (arg0 == 1306) {
							local137.aString17 = aStringArray8[--anInt1582];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray25 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt2613 = anIntArray116[--anInt1584];
							local137.anInt2594 = anIntArray116[--anInt1584];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray116[--anInt1584];
							local25 = anIntArray116[--anInt1584];
							if (local25 >= 1 && local25 <= 10) {
								local137.method2062(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString20 = aStringArray8[--anInt1582];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt2602 = anIntArray116[--anInt1584];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt1584 -= 3;
								local19 = anIntArray116[anInt1584] - 1;
								local25 = anIntArray116[anInt1584 + 1];
								local353 = anIntArray116[anInt1584 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt1584 -= 2;
								local19 = 10;
								local25 = anIntArray116[anInt1584];
								local353 = anIntArray116[anInt1584 + 1];
							}
							if (local137.aByteArray21 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray21 = new byte[11];
								local137.aByteArray22 = new byte[11];
								local137.anIntArray213 = new int[11];
							}
							local137.aByteArray21[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean177 = false;
								for (local2290 = 0; local2290 < local137.aByteArray21.length; local2290++) {
									if (local137.aByteArray21[local2290] != 0) {
										local137.aBoolean177 = true;
										break;
									}
								}
							} else {
								local137.aBoolean177 = true;
							}
							local137.aByteArray22[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt2612 = anIntArray116[--anInt1584];
							return;
						}
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static235.method3185(anIntArray116[--anInt1584]);
				} else {
					local137 = arg1 ? aClass110_4 : aClass110_5;
				}
				if (arg0 == 1000) {
					anInt1584 -= 4;
					local137.anInt2637 = anIntArray116[anInt1584];
					local137.anInt2618 = anIntArray116[anInt1584 + 1];
					local19 = anIntArray116[anInt1584 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray116[anInt1584 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte49 = (byte) local19;
					local137.aByte48 = (byte) local25;
					Static118.method1693(local137);
					Static418.method5663(local137);
					if (local137.anInt2585 == -1) {
						Static3.method34(local137.anInt2675);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt1584 -= 4;
					local137.anInt2608 = anIntArray116[anInt1584];
					local137.anInt2644 = anIntArray116[anInt1584 + 1];
					local137.anInt2621 = 0;
					local137.anInt2632 = 0;
					local19 = anIntArray116[anInt1584 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray116[anInt1584 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte50 = (byte) local19;
					local137.aByte47 = (byte) local25;
					Static118.method1693(local137);
					Static418.method5663(local137);
					if (local137.anInt2627 == 0) {
						Static453.method6005(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray116[--anInt1584] == 1;
					if (local137.aBoolean179 != local620) {
						local137.aBoolean179 = local620;
						Static118.method1693(local137);
					}
					if (local137.anInt2585 == -1) {
						Static165.method2304(local137.anInt2675);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt1584 -= 2;
					local137.anInt2645 = anIntArray116[anInt1584];
					local137.anInt2609 = anIntArray116[anInt1584 + 1];
					Static118.method1693(local137);
					Static418.method5663(local137);
					if (local137.anInt2627 == 0) {
						Static453.method6005(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean181 = anIntArray116[--anInt1584] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V")
	private static void method1280(@OriginalArg(0) int arg0) {
		@Pc(3) Class110 local3 = Static235.method3185(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class110[] local13 = Static185.aClass110ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class110[] local19 = Static412.aClass110ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static185.aClass110ArrayArray1[local9] = new Class110[local22];
			Static461.method1981(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static461.method1981(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(I)Ljava/lang/String;")
	private static String method1281(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar1.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar1.get(5);
		@Pc(20) int local20 = aCalendar1.get(2);
		@Pc(24) int local24 = aCalendar1.get(1);
		return local16 + "-" + aStringArray10[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!pi;I)V")
	private static void method1282(@OriginalArg(0) Class4_Sub2_Sub15 arg0, @OriginalArg(1) int arg1) {
		anInt1584 = 0;
		anInt1582 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray397;
		@Pc(11) int[] local11 = arg0.anIntArray398;
		@Pc(13) byte local13 = -1;
		anInt1577 = 0;
		@Pc(603) int local603;
		try {
			@Pc(17) int local17 = 0;
			label260: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(31) int local31 = local8[local5];
				if (local31 >= 100) {
					@Pc(802) boolean local802;
					if (local11[local5] == 1) {
						local802 = true;
					} else {
						local802 = false;
					}
					if (local31 >= 100 && local31 < 5000) {
						method1279(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method1292(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray116[anInt1584++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray116[anInt1584++] = Static52.aClass81_1.anIntArray159[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static52.aClass81_1.method1662(anIntArray116[--anInt1584], local54);
					} else if (local31 == 3) {
						aStringArray8[anInt1582++] = arg0.aStringArray34[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt1584 -= 2;
						if (anIntArray116[anInt1584] != anIntArray116[anInt1584 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt1584 -= 2;
						if (anIntArray116[anInt1584] == anIntArray116[anInt1584 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt1584 -= 2;
						if (anIntArray116[anInt1584] < anIntArray116[anInt1584 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt1584 -= 2;
						if (anIntArray116[anInt1584] > anIntArray116[anInt1584 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt1577 == 0) {
							return;
						}
						@Pc(216) Class23 local216 = aClass23Array1[--anInt1577];
						arg0 = local216.aClass4_Sub2_Sub15_1;
						local8 = arg0.anIntArray397;
						local11 = arg0.anIntArray398;
						local5 = local216.anInt521;
						anIntArray117 = local216.anIntArray41;
						aStringArray9 = local216.aStringArray3;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray116[anInt1584++] = Static52.aClass81_1.method1660(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static52.aClass81_1.method1666(local54, anIntArray116[--anInt1584]);
					} else if (local31 == 31) {
						anInt1584 -= 2;
						if (anIntArray116[anInt1584] <= anIntArray116[anInt1584 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt1584 -= 2;
						if (anIntArray116[anInt1584] >= anIntArray116[anInt1584 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray116[anInt1584++] = anIntArray117[local11[local5]];
					} else if (local31 == 34) {
						anIntArray117[local11[local5]] = anIntArray116[--anInt1584];
					} else if (local31 == 35) {
						aStringArray8[anInt1582++] = aStringArray9[local11[local5]];
					} else if (local31 == 36) {
						aStringArray9[local11[local5]] = aStringArray8[--anInt1582];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt1582 -= local54;
						@Pc(400) String local400 = Static204.method2869(anInt1582, aStringArray8, local54);
						aStringArray8[anInt1582++] = local400;
					} else if (local31 == 38) {
						anInt1584--;
					} else if (local31 == 39) {
						anInt1582--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class4_Sub2_Sub15 local436 = Static37.method501(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt5004];
							@Pc(450) String[] local450 = new String[local436.anInt5005];
							for (local452 = 0; local452 < local436.anInt5002; local452++) {
								local446[local452] = anIntArray116[anInt1584 + local452 - local436.anInt5002];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt5003; local471++) {
								local450[local471] = aStringArray8[anInt1582 + local471 - local436.anInt5003];
							}
							anInt1584 -= local436.anInt5002;
							anInt1582 -= local436.anInt5003;
							@Pc(502) Class23 local502 = new Class23();
							local502.aClass4_Sub2_Sub15_1 = arg0;
							local502.anInt521 = local5;
							local502.anIntArray41 = anIntArray117;
							local502.aStringArray3 = aStringArray9;
							if (anInt1577 >= aClass23Array1.length) {
								throw new RuntimeException();
							}
							aClass23Array1[anInt1577++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray397;
							local11 = local436.anIntArray398;
							local5 = -1;
							anIntArray117 = local446;
							aStringArray9 = local450;
						} else if (local31 == 42) {
							anIntArray116[anInt1584++] = Static83.anIntArray416[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static83.anIntArray416[local54] = anIntArray116[--anInt1584];
							Static160.method3984(local54);
							Static247.aBoolean303 |= Static269.aBooleanArray22[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray116[--anInt1584];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray115[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray18[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray116[--anInt1584];
							if (local603 < 0 || local603 >= anIntArray115[local54]) {
								throw new RuntimeException();
							}
							anIntArray116[anInt1584++] = anIntArrayArray18[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt1584 -= 2;
							local603 = anIntArray116[anInt1584];
							if (local603 < 0 || local603 >= anIntArray115[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray18[local54][local603] = anIntArray116[anInt1584 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static432.aStringArray45[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray8[anInt1582++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static432.aStringArray45[local54] = aStringArray8[--anInt1582];
							Static231.method3154(local54);
						} else if (local31 == 51) {
							@Pc(774) Class67 local774 = arg0.aClass67Array1[local11[local5]];
							@Pc(787) Class4_Sub24 local787 = (Class4_Sub24) local774.method1429((long) anIntArray116[--anInt1584]);
							if (local787 != null) {
								local5 += local787.anInt4057;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(855) StringBuffer local855;
			if (arg0.aString56 == null) {
				local855 = new StringBuffer(30);
				local855.append("CS2: ").append(arg0.aLong227).append(" ");
				for (local603 = anInt1577 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(aClass23Array1[local603].aClass4_Sub2_Sub15_1.aLong227).append(" ");
				}
				local855.append("op: ").append(local13);
				Static33.method448(local837, local855.toString());
			} else {
				Static392.method5198("Clientscript error in: " + arg0.aString56);
				local855 = new StringBuffer(30);
				local855.append("Clientscript error in: ").append(arg0.aString56).append("\n");
				for (local603 = anInt1577 - 1; local603 >= 0; local603--) {
					local855.append("via: ").append(aClass23Array1[local603].aClass4_Sub2_Sub15_1.aString56).append("\n");
				}
				local855.append("Op: ").append(local13).append("\n");
				@Pc(895) String local895 = local837.getMessage();
				if (local895 != null && local895.length() > 0) {
					local855.append("Message: ").append(local895).append("\n");
				}
				Static33.method448(local837, local855.toString());
				Static385.method5096(local855.toString());
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "c", descriptor = "(I)V")
	public static void method1283(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static131.method1881(arg0)) {
			return;
		}
		@Pc(12) Class110[] local12 = Static412.aClass110ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class110 local19 = local12[local14];
			if (local19.anObjectArray20 != null) {
				@Pc(26) Class4_Sub34 local26 = new Class4_Sub34();
				local26.aClass110_14 = local19;
				local26.anObjectArray34 = local19.anObjectArray20;
				method1286(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(IZ)V")
	public static void method1284() {
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!pd;I)V")
	private static void method1286(@OriginalArg(0) Class4_Sub34 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray34;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class4_Sub2_Sub15 local12 = Static37.method501(local8);
		if (local12 == null) {
			return;
		}
		anIntArray117 = new int[local12.anInt5004];
		@Pc(21) int local21 = 0;
		aStringArray9 = new String[local12.anInt5005];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt4909;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt4910;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass110_14 == null ? -1 : arg0.aClass110_14.anInt2675;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt4908;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass110_14 == null ? -1 : arg0.aClass110_14.anInt2585;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass110_15 == null ? -1 : arg0.aClass110_15.anInt2675;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass110_15 == null ? -1 : arg0.aClass110_15.anInt2585;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt4911;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt4906;
				}
				anIntArray117[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString53;
				}
				aStringArray9[local27++] = local135;
			}
		}
		anInt1588 = arg0.anInt4907;
		method1282(local12, arg1);
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "()V")
	public static void method1287() {
	}

	@OriginalMember(owner = "client!du", name = "d", descriptor = "(I)V")
	private static void method1288(@OriginalArg(0) int arg0) {
		@Pc(3) Class110 local3 = Static235.method3185(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class110[] local13 = Static185.aClass110ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class110[] local19 = Static412.aClass110ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static185.aClass110ArrayArray1[local9] = new Class110[local22];
			Static461.method1981(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static461.method1981(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!pd;)V")
	public static void method1289(@OriginalArg(0) Class4_Sub34 arg0) {
		method1286(arg0, 200000);
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!cq;II)V")
	public static void method1290(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class4_Sub2_Sub15 local5 = Static273.method3633(arg0, arg1, arg2);
		if (local5 == null) {
			return;
		}
		anIntArray117 = new int[local5.anInt5004];
		aStringArray9 = new String[local5.anInt5005];
		if (local5.aClass43_14 == Static127.aClass43_7 || local5.aClass43_14 == Static291.aClass43_13 || local5.aClass43_14 == Static139.aClass43_9) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static123.aClass110_6 != null) {
				local30 = Static123.aClass110_6.anInt2622;
				local32 = Static123.aClass110_6.anInt2643;
			}
			anIntArray117[0] = Static455.aClass48_1.method1138() - local30;
			anIntArray117[1] = Static455.aClass48_1.method1142() - local32;
		}
		method1282(local5, 200000);
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method1291(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static270.anInt4509 == 0 && (Static412.aBoolean491 && !Static119.aBoolean403 || Static339.aBoolean389)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static164.aClass15_47.method180(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static164.aClass15_47.method180(0).length());
		} else if (local11.startsWith(Static420.aClass15_128.method180(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static420.aClass15_128.method180(0).length());
		} else if (local11.startsWith(Static332.aClass15_97.method180(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static332.aClass15_97.method180(0).length());
		} else if (local11.startsWith(Static214.aClass15_59.method180(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static214.aClass15_59.method180(0).length());
		} else if (local11.startsWith(Static167.aClass15_48.method180(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static167.aClass15_48.method180(0).length());
		} else if (local11.startsWith(Static390.aClass15_136.method180(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static390.aClass15_136.method180(0).length());
		} else if (local11.startsWith(Static382.aClass15_115.method180(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static382.aClass15_115.method180(0).length());
		} else if (local11.startsWith(Static102.aClass15_36.method180(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static102.aClass15_36.method180(0).length());
		} else if (local11.startsWith(Static259.aClass15_77.method180(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static259.aClass15_77.method180(0).length());
		} else if (local11.startsWith(Static455.aClass15_135.method180(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static455.aClass15_135.method180(0).length());
		} else if (local11.startsWith(Static14.aClass15_8.method180(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static14.aClass15_8.method180(0).length());
		} else if (local11.startsWith(Static338.aClass15_100.method180(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static338.aClass15_100.method180(0).length());
		} else if (Static429.anInt6999 != 0) {
			if (local11.startsWith(Static164.aClass15_47.method180(Static429.anInt6999))) {
				local13 = 0;
				arg0 = arg0.substring(Static164.aClass15_47.method180(Static429.anInt6999).length());
			} else if (local11.startsWith(Static420.aClass15_128.method180(Static429.anInt6999))) {
				local13 = 1;
				arg0 = arg0.substring(Static420.aClass15_128.method180(Static429.anInt6999).length());
			} else if (local11.startsWith(Static332.aClass15_97.method180(Static429.anInt6999))) {
				local13 = 2;
				arg0 = arg0.substring(Static332.aClass15_97.method180(Static429.anInt6999).length());
			} else if (local11.startsWith(Static214.aClass15_59.method180(Static429.anInt6999))) {
				local13 = 3;
				arg0 = arg0.substring(Static214.aClass15_59.method180(Static429.anInt6999).length());
			} else if (local11.startsWith(Static167.aClass15_48.method180(Static429.anInt6999))) {
				local13 = 4;
				arg0 = arg0.substring(Static167.aClass15_48.method180(Static429.anInt6999).length());
			} else if (local11.startsWith(Static390.aClass15_136.method180(Static429.anInt6999))) {
				local13 = 5;
				arg0 = arg0.substring(Static390.aClass15_136.method180(Static429.anInt6999).length());
			} else if (local11.startsWith(Static382.aClass15_115.method180(Static429.anInt6999))) {
				local13 = 6;
				arg0 = arg0.substring(Static382.aClass15_115.method180(Static429.anInt6999).length());
			} else if (local11.startsWith(Static102.aClass15_36.method180(Static429.anInt6999))) {
				local13 = 7;
				arg0 = arg0.substring(Static102.aClass15_36.method180(Static429.anInt6999).length());
			} else if (local11.startsWith(Static259.aClass15_77.method180(Static429.anInt6999))) {
				local13 = 8;
				arg0 = arg0.substring(Static259.aClass15_77.method180(Static429.anInt6999).length());
			} else if (local11.startsWith(Static455.aClass15_135.method180(Static429.anInt6999))) {
				local13 = 9;
				arg0 = arg0.substring(Static455.aClass15_135.method180(Static429.anInt6999).length());
			} else if (local11.startsWith(Static14.aClass15_8.method180(Static429.anInt6999))) {
				local13 = 10;
				arg0 = arg0.substring(Static14.aClass15_8.method180(Static429.anInt6999).length());
			} else if (local11.startsWith(Static338.aClass15_100.method180(Static429.anInt6999))) {
				local13 = 11;
				arg0 = arg0.substring(Static338.aClass15_100.method180(Static429.anInt6999).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static229.aClass15_62.method180(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static229.aClass15_62.method180(0).length());
		} else if (local11.startsWith(Static96.aClass15_34.method180(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static96.aClass15_34.method180(0).length());
		} else if (local11.startsWith(Static94.aClass15_99.method180(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static94.aClass15_99.method180(0).length());
		} else if (local11.startsWith(Static451.aClass15_134.method180(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static451.aClass15_134.method180(0).length());
		} else if (local11.startsWith(Static74.aClass15_23.method180(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static74.aClass15_23.method180(0).length());
		} else if (Static429.anInt6999 != 0) {
			if (local11.startsWith(Static229.aClass15_62.method180(Static429.anInt6999))) {
				local451 = 1;
				arg0 = arg0.substring(Static229.aClass15_62.method180(Static429.anInt6999).length());
			} else if (local11.startsWith(Static96.aClass15_34.method180(Static429.anInt6999))) {
				local451 = 2;
				arg0 = arg0.substring(Static96.aClass15_34.method180(Static429.anInt6999).length());
			} else if (local11.startsWith(Static94.aClass15_99.method180(Static429.anInt6999))) {
				local451 = 3;
				arg0 = arg0.substring(Static94.aClass15_99.method180(Static429.anInt6999).length());
			} else if (local11.startsWith(Static451.aClass15_134.method180(Static429.anInt6999))) {
				local451 = 4;
				arg0 = arg0.substring(Static451.aClass15_134.method180(Static429.anInt6999).length());
			} else if (local11.startsWith(Static74.aClass15_23.method180(Static429.anInt6999))) {
				local451 = 5;
				arg0 = arg0.substring(Static74.aClass15_23.method180(Static429.anInt6999).length());
			}
		}
		Static448.method5935(Static35.aClass146_16);
		Static247.aClass4_Sub9_Sub2_2.method4999(0);
		@Pc(646) int local646 = Static247.aClass4_Sub9_Sub2_2.anInt6207;
		if (arg1 == 5021) {
			Static247.aClass4_Sub9_Sub2_2.method4999(1);
		} else if (arg1 == 5022) {
			Static247.aClass4_Sub9_Sub2_2.method4999(2);
		} else {
			Static247.aClass4_Sub9_Sub2_2.method4999(0);
		}
		Static247.aClass4_Sub9_Sub2_2.method4999(local13);
		Static247.aClass4_Sub9_Sub2_2.method4999(local451);
		Static390.method6052(Static247.aClass4_Sub9_Sub2_2, arg0);
		Static247.aClass4_Sub9_Sub2_2.method5025(Static247.aClass4_Sub9_Sub2_2.anInt6207 - local646);
	}

	@OriginalMember(owner = "client!du", name = "c", descriptor = "(IZ)V")
	private static void method1292(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(157) int local157;
		@Pc(1313) boolean local1313;
		@Pc(89) int local89;
		@Pc(75) String local75;
		@Pc(192) int local192;
		@Pc(95) int local95;
		@Pc(81) String local81;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray116[anInt1584++] = Static294.anInt4824;
				return;
			}
			if (arg0 == 5001) {
				anInt1584 -= 3;
				Static294.anInt4824 = anIntArray116[anInt1584];
				Static216.aClass21_2 = Static253.method3327(anIntArray116[anInt1584 + 1]);
				if (Static216.aClass21_2 == null) {
					Static216.aClass21_2 = Static375.aClass21_4;
				}
				Static48.anInt759 = anIntArray116[anInt1584 + 2];
				Static448.method5935(Static61.aClass146_20);
				Static247.aClass4_Sub9_Sub2_2.method4999(Static294.anInt4824);
				Static247.aClass4_Sub9_Sub2_2.method4999(Static216.aClass21_2.anInt409);
				Static247.aClass4_Sub9_Sub2_2.method4999(Static48.anInt759);
				return;
			}
			if (arg0 == 5002) {
				anInt1582 -= 2;
				local75 = aStringArray8[anInt1582];
				local81 = aStringArray8[anInt1582 + 1];
				anInt1584 -= 2;
				local89 = anIntArray116[anInt1584];
				local95 = anIntArray116[anInt1584 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static448.method5935(Static104.aClass146_34);
				Static247.aClass4_Sub9_Sub2_2.method4999(Static109.method5003(local75) + Static109.method5003(local81) + 2);
				Static247.aClass4_Sub9_Sub2_2.method5039(local75);
				Static247.aClass4_Sub9_Sub2_2.method4999(local89 - 1);
				Static247.aClass4_Sub9_Sub2_2.method4999(local95);
				Static247.aClass4_Sub9_Sub2_2.method5039(local81);
				return;
			}
			if (arg0 == 5003) {
				local157 = anIntArray116[--anInt1584];
				local81 = null;
				if (local157 < 100) {
					local81 = Static394.aStringArray24[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray8[anInt1582++] = local81;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray116[--anInt1584];
				local192 = -1;
				if (local157 < 100 && Static394.aStringArray24[local157] != null) {
					local192 = Static420.anIntArray532[local157];
				}
				anIntArray116[anInt1584++] = local192;
				return;
			}
			if (arg0 == 5005) {
				if (Static216.aClass21_2 == null) {
					anIntArray116[anInt1584++] = -1;
					return;
				}
				anIntArray116[anInt1584++] = Static216.aClass21_2.anInt409;
				return;
			}
			if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
				local75 = aStringArray8[--anInt1582];
				method1291(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt1582 -= 2;
				local75 = aStringArray8[anInt1582];
				local81 = aStringArray8[anInt1582 + 1];
				if (Static270.anInt4509 != 0 || (!Static412.aBoolean491 || Static119.aBoolean403) && !Static339.aBoolean389) {
					Static448.method5935(Static125.aClass146_39);
					Static247.aClass4_Sub9_Sub2_2.method4999(0);
					local89 = Static247.aClass4_Sub9_Sub2_2.anInt6207;
					Static247.aClass4_Sub9_Sub2_2.method5039(local75);
					Static390.method6052(Static247.aClass4_Sub9_Sub2_2, local81);
					Static247.aClass4_Sub9_Sub2_2.method5025(Static247.aClass4_Sub9_Sub2_2.anInt6207 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray116[--anInt1584];
				local81 = null;
				if (local157 < 100) {
					local81 = Static16.aStringArray2[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray8[anInt1582++] = local81;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray116[--anInt1584];
				local81 = null;
				if (local157 < 100) {
					local81 = Static215.aStringArray38[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray8[anInt1582++] = local81;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray116[--anInt1584];
				local192 = -1;
				if (local157 < 100) {
					local192 = Static128.anIntArray555[local157];
				}
				anIntArray116[anInt1584++] = local192;
				return;
			}
			if (arg0 == 5015) {
				if (Static401.aClass8_Sub3_Sub1_Sub1_2 == null || Static401.aClass8_Sub3_Sub1_Sub1_2.aString59 == null) {
					local75 = Static76.aString7;
				} else {
					local75 = Static401.aClass8_Sub3_Sub1_Sub1_2.method4551();
				}
				aStringArray8[anInt1582++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray116[anInt1584++] = Static48.anInt759;
				return;
			}
			if (arg0 == 5017) {
				anIntArray116[anInt1584++] = Static343.anInt5686;
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray116[--anInt1584];
				local192 = 0;
				if (local157 < 100 && Static394.aStringArray24[local157] != null) {
					local192 = Static457.anIntArray575[local157];
				}
				anIntArray116[anInt1584++] = local192;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray116[--anInt1584];
				local81 = null;
				if (local157 < 100) {
					local81 = Static110.aStringArray18[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray8[anInt1582++] = local81;
				return;
			}
			if (arg0 == 5020) {
				if (Static401.aClass8_Sub3_Sub1_Sub1_2 == null || Static401.aClass8_Sub3_Sub1_Sub1_2.aString59 == null) {
					local75 = Static76.aString7;
				} else {
					local75 = Static401.aClass8_Sub3_Sub1_Sub1_2.method4559();
				}
				aStringArray8[anInt1582++] = local75;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray116[--anInt1584];
				aStringArray8[anInt1582++] = Static190.aClass97_1.method1854(local157).aString43;
				return;
			}
			@Pc(589) Class4_Sub2_Sub13 local589;
			if (arg0 == 5051) {
				local157 = anIntArray116[--anInt1584];
				local589 = Static190.aClass97_1.method1854(local157);
				if (local589.anIntArray384 == null) {
					anIntArray116[anInt1584++] = 0;
					return;
				}
				anIntArray116[anInt1584++] = local589.anIntArray384.length;
				return;
			}
			if (arg0 == 5052) {
				anInt1584 -= 2;
				local157 = anIntArray116[anInt1584];
				local192 = anIntArray116[anInt1584 + 1];
				@Pc(634) Class4_Sub2_Sub13 local634 = Static190.aClass97_1.method1854(local157);
				local95 = local634.anIntArray384[local192];
				anIntArray116[anInt1584++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray116[--anInt1584];
				local589 = Static190.aClass97_1.method1854(local157);
				if (local589.anIntArray383 == null) {
					anIntArray116[anInt1584++] = 0;
					return;
				}
				anIntArray116[anInt1584++] = local589.anIntArray383.length;
				return;
			}
			if (arg0 == 5054) {
				anInt1584 -= 2;
				local157 = anIntArray116[anInt1584];
				local192 = anIntArray116[anInt1584 + 1];
				anIntArray116[anInt1584++] = Static190.aClass97_1.method1854(local157).anIntArray383[local192];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray116[--anInt1584];
				aStringArray8[anInt1582++] = Static350.aClass66_1.method1411(local157).method5545();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray116[--anInt1584];
				@Pc(760) Class4_Sub2_Sub18 local760 = Static350.aClass66_1.method1411(local157);
				if (local760.anIntArray523 == null) {
					anIntArray116[anInt1584++] = 0;
					return;
				}
				anIntArray116[anInt1584++] = local760.anIntArray523.length;
				return;
			}
			if (arg0 == 5057) {
				anInt1584 -= 2;
				local157 = anIntArray116[anInt1584];
				local192 = anIntArray116[anInt1584 + 1];
				anIntArray116[anInt1584++] = Static350.aClass66_1.method1411(local157).anIntArray523[local192];
				return;
			}
			if (arg0 == 5058) {
				aClass7_1 = new Class7();
				aClass7_1.anInt123 = anIntArray116[--anInt1584];
				aClass7_1.aClass4_Sub2_Sub18_1 = Static350.aClass66_1.method1411(aClass7_1.anInt123);
				aClass7_1.anIntArray3 = new int[aClass7_1.aClass4_Sub2_Sub18_1.method5548()];
				return;
			}
			if (arg0 == 5059) {
				Static448.method5935(Static383.aClass146_89);
				Static247.aClass4_Sub9_Sub2_2.method4999(0);
				local157 = Static247.aClass4_Sub9_Sub2_2.anInt6207;
				Static247.aClass4_Sub9_Sub2_2.method4999(0);
				Static247.aClass4_Sub9_Sub2_2.method5029(aClass7_1.anInt123);
				aClass7_1.aClass4_Sub2_Sub18_1.method5553(Static247.aClass4_Sub9_Sub2_2, aClass7_1.anIntArray3);
				Static247.aClass4_Sub9_Sub2_2.method5025(Static247.aClass4_Sub9_Sub2_2.anInt6207 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray8[--anInt1582];
				Static448.method5935(Static18.aClass146_13);
				Static247.aClass4_Sub9_Sub2_2.method4999(0);
				local192 = Static247.aClass4_Sub9_Sub2_2.anInt6207;
				Static247.aClass4_Sub9_Sub2_2.method5039(local75);
				Static247.aClass4_Sub9_Sub2_2.method5029(aClass7_1.anInt123);
				aClass7_1.aClass4_Sub2_Sub18_1.method5553(Static247.aClass4_Sub9_Sub2_2, aClass7_1.anIntArray3);
				Static247.aClass4_Sub9_Sub2_2.method5025(Static247.aClass4_Sub9_Sub2_2.anInt6207 - local192);
				return;
			}
			if (arg0 == 5061) {
				Static448.method5935(Static383.aClass146_89);
				Static247.aClass4_Sub9_Sub2_2.method4999(0);
				local157 = Static247.aClass4_Sub9_Sub2_2.anInt6207;
				Static247.aClass4_Sub9_Sub2_2.method4999(1);
				Static247.aClass4_Sub9_Sub2_2.method5029(aClass7_1.anInt123);
				aClass7_1.aClass4_Sub2_Sub18_1.method5553(Static247.aClass4_Sub9_Sub2_2, aClass7_1.anIntArray3);
				Static247.aClass4_Sub9_Sub2_2.method5025(Static247.aClass4_Sub9_Sub2_2.anInt6207 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt1584 -= 2;
				local157 = anIntArray116[anInt1584];
				local192 = anIntArray116[anInt1584 + 1];
				anIntArray116[anInt1584++] = Static190.aClass97_1.method1854(local157).aCharArray6[local192];
				return;
			}
			if (arg0 == 5063) {
				anInt1584 -= 2;
				local157 = anIntArray116[anInt1584];
				local192 = anIntArray116[anInt1584 + 1];
				anIntArray116[anInt1584++] = Static190.aClass97_1.method1854(local157).aCharArray7[local192];
				return;
			}
			if (arg0 == 5064) {
				anInt1584 -= 2;
				local157 = anIntArray116[anInt1584];
				local192 = anIntArray116[anInt1584 + 1];
				if (local192 == -1) {
					anIntArray116[anInt1584++] = -1;
					return;
				}
				anIntArray116[anInt1584++] = Static190.aClass97_1.method1854(local157).method3764((char) local192);
				return;
			}
			if (arg0 == 5065) {
				anInt1584 -= 2;
				local157 = anIntArray116[anInt1584];
				local192 = anIntArray116[anInt1584 + 1];
				if (local192 == -1) {
					anIntArray116[anInt1584++] = -1;
					return;
				}
				anIntArray116[anInt1584++] = Static190.aClass97_1.method1854(local157).method3761((char) local192);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray116[--anInt1584];
				anIntArray116[anInt1584++] = Static350.aClass66_1.method1411(local157).method5548();
				return;
			}
			if (arg0 == 5067) {
				anInt1584 -= 2;
				local157 = anIntArray116[anInt1584];
				local192 = anIntArray116[anInt1584 + 1];
				local89 = Static350.aClass66_1.method1411(local157).method5543(local192).anInt6544;
				anIntArray116[anInt1584++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt1584 -= 2;
				local157 = anIntArray116[anInt1584];
				local192 = anIntArray116[anInt1584 + 1];
				aClass7_1.anIntArray3[local157] = local192;
				return;
			}
			if (arg0 == 5069) {
				anInt1584 -= 2;
				local157 = anIntArray116[anInt1584];
				local192 = anIntArray116[anInt1584 + 1];
				aClass7_1.anIntArray3[local157] = local192;
				return;
			}
			if (arg0 == 5070) {
				anInt1584 -= 3;
				local157 = anIntArray116[anInt1584];
				local192 = anIntArray116[anInt1584 + 1];
				local89 = anIntArray116[anInt1584 + 2];
				@Pc(1265) Class4_Sub2_Sub18 local1265 = Static350.aClass66_1.method1411(local157);
				if (local1265.method5543(local192).anInt6544 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray116[anInt1584++] = local1265.method5541(local192, local89);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray8[--anInt1582];
				local1313 = anIntArray116[--anInt1584] == 1;
				Static13.method163(local75, local1313);
				anIntArray116[anInt1584++] = Static246.anInt4087;
				return;
			}
			if (arg0 == 5072) {
				if (Static193.aShortArray15 != null && Static237.anInt5935 < Static246.anInt4087) {
					anIntArray116[anInt1584++] = Static193.aShortArray15[Static237.anInt5935++] & 0xFFFF;
					return;
				}
				anIntArray116[anInt1584++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static237.anInt5935 = 0;
				return;
			}
			if (arg0 == 5074) {
				Static448.method5935(Static383.aClass146_89);
				Static247.aClass4_Sub9_Sub2_2.method4999(0);
				local157 = Static247.aClass4_Sub9_Sub2_2.anInt6207;
				Static247.aClass4_Sub9_Sub2_2.method4999(2);
				Static247.aClass4_Sub9_Sub2_2.method5029(aClass7_1.anInt123);
				aClass7_1.aClass4_Sub2_Sub18_1.method5553(Static247.aClass4_Sub9_Sub2_2, aClass7_1.anIntArray3);
				Static247.aClass4_Sub9_Sub2_2.method5025(Static247.aClass4_Sub9_Sub2_2.anInt6207 - local157);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static180.aClass107_1.method2003(86)) {
					anIntArray116[anInt1584++] = 1;
					return;
				}
				anIntArray116[anInt1584++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static180.aClass107_1.method2003(82)) {
					anIntArray116[anInt1584++] = 1;
					return;
				}
				anIntArray116[anInt1584++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static180.aClass107_1.method2003(81)) {
					anIntArray116[anInt1584++] = 1;
					return;
				}
				anIntArray116[anInt1584++] = 0;
				return;
			}
		} else {
			@Pc(2691) int local2691;
			@Pc(1965) boolean local1965;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static378.method5566(anIntArray116[--anInt1584]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray116[anInt1584++] = Static4.method70();
					return;
				}
				if (arg0 == 5205) {
					Static439.method5850(-1, -1, anIntArray116[--anInt1584], false);
					return;
				}
				@Pc(1554) Class4_Sub2_Sub11 local1554;
				if (arg0 == 5206) {
					local157 = anIntArray116[--anInt1584];
					local1554 = Static292.method4933(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1554 == null) {
						anIntArray116[anInt1584++] = -1;
						return;
					}
					anIntArray116[anInt1584++] = local1554.anInt3793;
					return;
				}
				@Pc(1587) Class4_Sub2_Sub11 local1587;
				if (arg0 == 5207) {
					local1587 = Static292.method4938(anIntArray116[--anInt1584]);
					if (local1587 != null && local1587.aString32 != null) {
						aStringArray8[anInt1582++] = local1587.aString32;
						return;
					}
					aStringArray8[anInt1582++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray116[anInt1584++] = Static14.anInt195;
					anIntArray116[anInt1584++] = Static394.anInt2524;
					return;
				}
				if (arg0 == 5209) {
					anIntArray116[anInt1584++] = Static54.anInt860 + Static292.anInt6142;
					anIntArray116[anInt1584++] = Static458.anInt6588 + Static292.anInt6148;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray116[--anInt1584];
					local1554 = Static292.method4938(local157);
					if (local1554 == null) {
						anIntArray116[anInt1584++] = 0;
						anIntArray116[anInt1584++] = 0;
						return;
					}
					anIntArray116[anInt1584++] = local1554.anInt3801 >> 14 & 0x3FFF;
					anIntArray116[anInt1584++] = local1554.anInt3801 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray116[--anInt1584];
					local1554 = Static292.method4938(local157);
					if (local1554 == null) {
						anIntArray116[anInt1584++] = 0;
						anIntArray116[anInt1584++] = 0;
						return;
					}
					anIntArray116[anInt1584++] = local1554.anInt3803 - local1554.anInt3802;
					anIntArray116[anInt1584++] = local1554.anInt3794 - local1554.anInt3804;
					return;
				}
				@Pc(1777) Class4_Sub12 local1777;
				if (arg0 == 5212) {
					local1777 = Static306.method4001();
					if (local1777 == null) {
						anIntArray116[anInt1584++] = -1;
						anIntArray116[anInt1584++] = -1;
						return;
					}
					anIntArray116[anInt1584++] = local1777.anInt1566;
					local192 = local1777.anInt1565 << 28 | local1777.anInt1572 + Static292.anInt6142 << 14 | local1777.anInt1567 + Static292.anInt6148;
					anIntArray116[anInt1584++] = local192;
					return;
				}
				if (arg0 == 5213) {
					local1777 = Static181.method2528();
					if (local1777 == null) {
						anIntArray116[anInt1584++] = -1;
						anIntArray116[anInt1584++] = -1;
						return;
					}
					anIntArray116[anInt1584++] = local1777.anInt1566;
					local192 = local1777.anInt1565 << 28 | local1777.anInt1572 + Static292.anInt6142 << 14 | local1777.anInt1567 + Static292.anInt6148;
					anIntArray116[anInt1584++] = local192;
					return;
				}
				@Pc(1925) boolean local1925;
				if (arg0 == 5214) {
					local157 = anIntArray116[--anInt1584];
					local1554 = Static279.method3691();
					if (local1554 != null) {
						local1925 = local1554.method3006(local157 & 0x3FFF, local157 >> 28 & 0x3, anIntArray118, local157 >> 14 & 0x3FFF);
						if (local1925) {
							Static132.method1940(anIntArray118[2], anIntArray118[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt1584 -= 2;
					local157 = anIntArray116[anInt1584];
					local192 = anIntArray116[anInt1584 + 1];
					@Pc(1963) Class239 local1963 = Static292.method4947(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local1965 = false;
					for (@Pc(1970) Class4_Sub2_Sub11 local1970 = (Class4_Sub2_Sub11) local1963.method5125(); local1970 != null; local1970 = (Class4_Sub2_Sub11) local1963.method5120()) {
						if (local1970.anInt3793 == local192) {
							local1965 = true;
							break;
						}
					}
					if (local1965) {
						anIntArray116[anInt1584++] = 1;
						return;
					}
					anIntArray116[anInt1584++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray116[--anInt1584];
					local1554 = Static292.method4938(local157);
					if (local1554 == null) {
						anIntArray116[anInt1584++] = -1;
						return;
					}
					anIntArray116[anInt1584++] = local1554.anInt3796;
					return;
				}
				if (arg0 == 5220) {
					anIntArray116[anInt1584++] = Static69.anInt3214 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray116[--anInt1584];
					Static132.method1940(local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1587 = Static279.method3691();
					if (local1587 != null) {
						local1313 = local1587.method3008(Static54.anInt860 + Static292.anInt6142, anIntArray118, Static458.anInt6588 + Static292.anInt6148);
						if (local1313) {
							anIntArray116[anInt1584++] = anIntArray118[1];
							anIntArray116[anInt1584++] = anIntArray118[2];
							return;
						}
						anIntArray116[anInt1584++] = -1;
						anIntArray116[anInt1584++] = -1;
						return;
					}
					anIntArray116[anInt1584++] = -1;
					anIntArray116[anInt1584++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt1584 -= 2;
					local157 = anIntArray116[anInt1584];
					local192 = anIntArray116[anInt1584 + 1];
					Static439.method5850(local192 & 0x3FFF, local192 >> 14 & 0x3FFF, local157, false);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray116[--anInt1584];
					local1554 = Static279.method3691();
					if (local1554 != null) {
						local1925 = local1554.method3006(local157 & 0x3FFF, local157 >> 28 & 0x3, anIntArray118, local157 >> 14 & 0x3FFF);
						if (local1925) {
							anIntArray116[anInt1584++] = anIntArray118[1];
							anIntArray116[anInt1584++] = anIntArray118[2];
							return;
						}
						anIntArray116[anInt1584++] = -1;
						anIntArray116[anInt1584++] = -1;
						return;
					}
					anIntArray116[anInt1584++] = -1;
					anIntArray116[anInt1584++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray116[--anInt1584];
					local1554 = Static279.method3691();
					if (local1554 != null) {
						local1925 = local1554.method3008(local157 >> 14 & 0x3FFF, anIntArray118, local157 & 0x3FFF);
						if (local1925) {
							anIntArray116[anInt1584++] = anIntArray118[1];
							anIntArray116[anInt1584++] = anIntArray118[2];
							return;
						}
						anIntArray116[anInt1584++] = -1;
						anIntArray116[anInt1584++] = -1;
						return;
					}
					anIntArray116[anInt1584++] = -1;
					anIntArray116[anInt1584++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static220.method2997(anIntArray116[--anInt1584]);
					return;
				}
				if (arg0 == 5227) {
					anInt1584 -= 2;
					local157 = anIntArray116[anInt1584];
					local192 = anIntArray116[anInt1584 + 1];
					Static439.method5850(local192 & 0x3FFF, local192 >> 14 & 0x3FFF, local157, true);
					return;
				}
				if (arg0 == 5228) {
					Static149.aBoolean187 = anIntArray116[--anInt1584] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray116[anInt1584++] = Static149.aBoolean187 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray116[--anInt1584];
					Static6.method81(local157);
					return;
				}
				@Pc(2483) Class4 local2483;
				if (arg0 == 5231) {
					anInt1584 -= 2;
					local157 = anIntArray116[anInt1584];
					local1313 = anIntArray116[anInt1584 + 1] == 1;
					if (Static333.aClass67_29 != null) {
						local2483 = Static333.aClass67_29.method1429((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method6059();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class4();
							Static333.aClass67_29.method1426(local2483, (long) local157);
						}
					}
					return;
				}
				@Pc(2525) Class4 local2525;
				if (arg0 == 5232) {
					local157 = anIntArray116[--anInt1584];
					if (Static333.aClass67_29 != null) {
						local2525 = Static333.aClass67_29.method1429((long) local157);
						anIntArray116[anInt1584++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray116[anInt1584++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt1584 -= 2;
					local157 = anIntArray116[anInt1584];
					local1313 = anIntArray116[anInt1584 + 1] == 1;
					if (Static143.aClass67_14 != null) {
						local2483 = Static143.aClass67_14.method1429((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method6059();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class4();
							Static143.aClass67_14.method1426(local2483, (long) local157);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray116[--anInt1584];
					if (Static143.aClass67_14 != null) {
						local2525 = Static143.aClass67_14.method1429((long) local157);
						anIntArray116[anInt1584++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray116[anInt1584++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray116[anInt1584++] = Static292.aClass4_Sub2_Sub11_3 == null ? -1 : Static292.aClass4_Sub2_Sub11_3.anInt3793;
					return;
				}
				if (arg0 == 5236) {
					anInt1584 -= 2;
					local157 = anIntArray116[anInt1584];
					local192 = anIntArray116[anInt1584 + 1];
					local89 = local192 >> 14 & 0x3FFF;
					local95 = local192 & 0x3FFF;
					local2691 = Static175.method2461(local157, local89, local95);
					if (local2691 < 0) {
						anIntArray116[anInt1584++] = -1;
						return;
					}
					anIntArray116[anInt1584++] = local2691;
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt1584 -= 2;
					local157 = anIntArray116[anInt1584];
					local192 = anIntArray116[anInt1584 + 1];
					Static265.method3497(false, local192, local157, 3);
					anIntArray116[anInt1584++] = Static276.aFrame5 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static276.aFrame5 != null) {
						Static265.method3497(false, -1, -1, Static413.aClass49_Sub1_1.anInt3207);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2769) Class241[] local2769 = Static98.method1497();
					anIntArray116[anInt1584++] = local2769.length;
					return;
				}
				if (arg0 == 5303) {
					local157 = anIntArray116[--anInt1584];
					@Pc(2793) Class241[] local2793 = Static98.method1497();
					anIntArray116[anInt1584++] = local2793[local157].anInt6346;
					anIntArray116[anInt1584++] = local2793[local157].anInt6344;
					return;
				}
				if (arg0 == 5305) {
					local157 = Static413.aClass49_Sub1_1.anInt3211;
					local192 = Static413.aClass49_Sub1_1.anInt3212;
					local89 = -1;
					@Pc(2830) Class241[] local2830 = Static98.method1497();
					for (local2691 = 0; local2691 < local2830.length; local2691++) {
						@Pc(2837) Class241 local2837 = local2830[local2691];
						if (local2837.anInt6346 == local157 && local2837.anInt6344 == local192) {
							local89 = local2691;
							break;
						}
					}
					anIntArray116[anInt1584++] = local89;
					return;
				}
				if (arg0 == 5306) {
					anIntArray116[anInt1584++] = Static37.method500();
					return;
				}
				if (arg0 == 5307) {
					local157 = anIntArray116[--anInt1584];
					if (local157 >= 1 && local157 <= 2) {
						Static265.method3497(false, -1, -1, local157);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray116[anInt1584++] = Static413.aClass49_Sub1_1.anInt3207;
					return;
				}
				if (arg0 == 5309) {
					local157 = anIntArray116[--anInt1584];
					if (local157 >= 1 && local157 <= 2) {
						Static413.aClass49_Sub1_1.anInt3207 = local157;
						Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
						return;
					}
					return;
				}
			} else {
				@Pc(3345) String local3345;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt1582 -= 2;
						local75 = aStringArray8[anInt1582];
						local81 = aStringArray8[anInt1582 + 1];
						local89 = anIntArray116[--anInt1584];
						Static448.method5935(Static341.aClass146_76);
						Static247.aClass4_Sub9_Sub2_2.method4999(Static109.method5003(local75) + Static109.method5003(local81) + 1);
						Static247.aClass4_Sub9_Sub2_2.method5039(local75);
						Static247.aClass4_Sub9_Sub2_2.method5039(local81);
						Static247.aClass4_Sub9_Sub2_2.method4999(local89);
						return;
					}
					if (arg0 == 5401) {
						anInt1584 -= 2;
						Static252.aShortArray80[anIntArray116[anInt1584]] = (short) Static299.method3891(anIntArray116[anInt1584 + 1]);
						Static416.aClass64_2.method1373();
						Static416.aClass64_2.method1367();
						Static120.aClass115_2.method2202();
						Static194.method5772();
						return;
					}
					if (arg0 == 5405) {
						anInt1584 -= 2;
						local157 = anIntArray116[anInt1584];
						local192 = anIntArray116[anInt1584 + 1];
						if (local157 >= 0 && local157 < 2) {
							Static295.anIntArrayArrayArray7[local157] = new int[local192 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt1584 -= 7;
						local157 = anIntArray116[anInt1584];
						local192 = anIntArray116[anInt1584 + 1] << 1;
						local89 = anIntArray116[anInt1584 + 2];
						local95 = anIntArray116[anInt1584 + 3];
						local2691 = anIntArray116[anInt1584 + 4];
						@Pc(3105) int local3105 = anIntArray116[anInt1584 + 5];
						@Pc(3111) int local3111 = anIntArray116[anInt1584 + 6];
						if (local157 >= 0 && local157 < 2 && Static295.anIntArrayArrayArray7[local157] != null && local192 >= 0 && local192 < Static295.anIntArrayArrayArray7[local157].length) {
							Static295.anIntArrayArrayArray7[local157][local192] = new int[] { (local89 >> 14 & 0x3FFF) << 7, local95, (local89 & 0x3FFF) << 7, local3111 };
							Static295.anIntArrayArrayArray7[local157][local192 + 1] = new int[] { (local2691 >> 14 & 0x3FFF) << 7, local3105, (local2691 & 0x3FFF) << 7 };
						}
						return;
					}
					if (arg0 == 5407) {
						local157 = Static295.anIntArrayArrayArray7[anIntArray116[--anInt1584]].length >> 1;
						anIntArray116[anInt1584++] = local157;
						return;
					}
					if (arg0 == 5411) {
						if (Static276.aFrame5 != null) {
							Static265.method3497(false, -1, -1, Static413.aClass49_Sub1_1.anInt3207);
						}
						if (Static43.aFrame4 != null) {
							Static125.method1758();
							System.exit(0);
							return;
						}
						local75 = Static353.aString64 == null ? Static308.method4031() : Static353.aString64;
						Static434.method5768(Static24.aClass196_1, Static341.anInt5549 == 1, false, local75);
						return;
					}
					if (arg0 == 5419) {
						local75 = "";
						if (Static404.aClass45_8 != null) {
							if (Static404.aClass45_8.anObject5 == null) {
								local75 = Static373.method4912(Static404.aClass45_8.anInt1130);
							} else {
								local75 = (String) Static404.aClass45_8.anObject5;
							}
						}
						aStringArray8[anInt1582++] = local75;
						return;
					}
					if (arg0 == 5420) {
						anIntArray116[anInt1584++] = Static300.anInt4900 == 3 ? 1 : 0;
						return;
					}
					if (arg0 == 5421) {
						if (Static276.aFrame5 != null) {
							Static265.method3497(false, -1, -1, Static413.aClass49_Sub1_1.anInt3207);
						}
						local75 = aStringArray8[--anInt1582];
						local1313 = anIntArray116[--anInt1584] == 1;
						local3345 = Static308.method4031() + local75;
						Static434.method5768(Static24.aClass196_1, Static341.anInt5549 == 1, local1313, local3345);
						return;
					}
					if (arg0 == 5422) {
						anInt1582 -= 2;
						local75 = aStringArray8[anInt1582];
						local81 = aStringArray8[anInt1582 + 1];
						local89 = anIntArray116[--anInt1584];
						if (local75.length() > 0) {
							if (Static63.aStringArray39 == null) {
								Static63.aStringArray39 = new String[Static383.anIntArray499[Static231.aClass6_7.anInt96]];
							}
							Static63.aStringArray39[local89] = local75;
						}
						if (local81.length() > 0) {
							if (Static286.aStringArray32 == null) {
								Static286.aStringArray32 = new String[Static383.anIntArray499[Static231.aClass6_7.anInt96]];
							}
							Static286.aStringArray32[local89] = local81;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray8[--anInt1582]);
						return;
					}
					if (arg0 == 5424) {
						anInt1584 -= 11;
						Static73.anInt1500 = anIntArray116[anInt1584];
						Static61.anInt1105 = anIntArray116[anInt1584 + 1];
						Static6.anInt98 = anIntArray116[anInt1584 + 2];
						Static335.anInt5463 = anIntArray116[anInt1584 + 3];
						Static437.anInt7251 = anIntArray116[anInt1584 + 4];
						Static120.anInt2137 = anIntArray116[anInt1584 + 5];
						Static150.anInt2730 = anIntArray116[anInt1584 + 6];
						Static376.anInt6154 = anIntArray116[anInt1584 + 7];
						Static242.anInt4049 = anIntArray116[anInt1584 + 8];
						Static412.anInt6979 = anIntArray116[anInt1584 + 9];
						Static399.anInt6488 = anIntArray116[anInt1584 + 10];
						Static13.aClass211_11.method4382(Static437.anInt7251);
						Static13.aClass211_11.method4382(Static120.anInt2137);
						Static13.aClass211_11.method4382(Static150.anInt2730);
						Static13.aClass211_11.method4382(Static376.anInt6154);
						Static13.aClass211_11.method4382(Static242.anInt4049);
						Static365.aClass95_19 = null;
						Static73.aClass95_4 = null;
						Static299.aClass95_15 = null;
						Static286.aClass95_12 = null;
						Static147.aClass95_6 = null;
						Static301.aClass95_16 = null;
						Static75.aClass95_5 = null;
						Static8.aClass95_1 = null;
						Static265.aBoolean325 = true;
						return;
					}
					if (arg0 == 5425) {
						Static370.method4890();
						Static265.aBoolean325 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt1584 -= 2;
						Static373.anInt6115 = anIntArray116[anInt1584];
						Static211.anInt3677 = anIntArray116[anInt1584 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt1584 -= 2;
						Static204.anInt3608 = anIntArray116[anInt1584 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt1584 -= 2;
						local157 = anIntArray116[anInt1584];
						local192 = anIntArray116[anInt1584 + 1];
						anIntArray116[anInt1584++] = Static60.method847(local157, local192) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static70.method1164(aStringArray8[--anInt1582], false);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static467.method6000("accountcreated", Static24.aClass196_1.anApplet1);
							return;
						} catch (@Pc(3639) Throwable local3639) {
							return;
						}
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt1584 -= 4;
						local157 = anIntArray116[anInt1584];
						local192 = anIntArray116[anInt1584 + 1];
						local89 = anIntArray116[anInt1584 + 2];
						local95 = anIntArray116[anInt1584 + 3];
						Static304.method3974((local157 >> 14 & 0x3FFF) - Static365.anInt6047, local89, local95, (local157 & 0x3FFF) - Static366.anInt6052, local192, false);
						return;
					}
					if (arg0 == 5501) {
						anInt1584 -= 4;
						local157 = anIntArray116[anInt1584];
						local192 = anIntArray116[anInt1584 + 1];
						local89 = anIntArray116[anInt1584 + 2];
						local95 = anIntArray116[anInt1584 + 3];
						Static406.method5514(local95, local192, (local157 >> 14 & 0x3FFF) - Static365.anInt6047, local89, (local157 & 0x3FFF) - Static366.anInt6052);
						return;
					}
					if (arg0 == 5502) {
						anInt1584 -= 6;
						local157 = anIntArray116[anInt1584];
						if (local157 >= 2) {
							throw new RuntimeException();
						}
						Static320.anInt5206 = local157;
						local192 = anIntArray116[anInt1584 + 1];
						if (local192 + 1 >= Static295.anIntArrayArrayArray7[Static320.anInt5206].length >> 1) {
							throw new RuntimeException();
						}
						Static50.anInt813 = local192;
						Static455.anInt7624 = 0;
						Static61.anInt1104 = anIntArray116[anInt1584 + 2];
						Static253.anInt4185 = anIntArray116[anInt1584 + 3];
						local89 = anIntArray116[anInt1584 + 4];
						if (local89 >= 2) {
							throw new RuntimeException();
						}
						Static171.anInt3113 = local89;
						local95 = anIntArray116[anInt1584 + 5];
						if (local95 + 1 >= Static295.anIntArrayArrayArray7[Static171.anInt3113].length >> 1) {
							throw new RuntimeException();
						}
						Static258.anInt4309 = local95;
						Static97.anInt1791 = 3;
						return;
					}
					if (arg0 == 5503) {
						Static425.method5718();
						return;
					}
					if (arg0 == 5504) {
						anInt1584 -= 2;
						Static418.method5664(anIntArray116[anInt1584], anIntArray116[anInt1584 + 1]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray116[anInt1584++] = (int) Static439.aFloat99 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray116[anInt1584++] = (int) Static109.aFloat75 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static318.method4141();
						return;
					}
					if (arg0 == 5508) {
						Static113.method1672();
						return;
					}
					if (arg0 == 5509) {
						Static199.method2854();
						return;
					}
					if (arg0 == 5510) {
						Static4.method73();
						return;
					}
					if (arg0 == 5511) {
						local157 = anIntArray116[--anInt1584];
						local192 = local157 >> 14 & 0x3FFF;
						local89 = local157 & 0x3FFF;
						local192 -= Static365.anInt6047;
						if (local192 < 0) {
							local192 = 0;
						} else if (local192 >= Static337.anInt5497) {
							local192 = Static337.anInt5497;
						}
						local89 -= Static366.anInt6052;
						if (local89 < 0) {
							local89 = 0;
						} else if (local89 >= Static282.anInt4644) {
							local89 = Static282.anInt4644;
						}
						Static190.anInt3490 = (local192 << 7) + 64;
						Static212.anInt3693 = (local89 << 7) + 64;
						Static97.anInt1791 = 4;
						return;
					}
					if (arg0 == 5512) {
						Static296.method3846();
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt1582 -= 2;
						local75 = aStringArray8[anInt1582];
						local81 = aStringArray8[anInt1582 + 1];
						local89 = anIntArray116[--anInt1584];
						if (Static8.anInt119 != 2) {
							return;
						}
						if (Static166.anInt3041 == 0 && Static254.anInt4212 == 0) {
							Static76.aString7 = local75;
							Static160.aString55 = local81;
							Static11.anInt178 = local89;
							Static119.method4569(5);
							return;
						}
						return;
					}
					if (arg0 == 5601) {
						Static407.method5530();
						return;
					}
					if (arg0 == 5602) {
						if (Static166.anInt3041 == 0) {
							Static347.anInt5752 = -2;
							Static366.anInt6050 = -2;
						}
						return;
					}
					if (arg0 == 5603) {
						anInt1584 -= 4;
						if (Static8.anInt119 != 2) {
							return;
						}
						if (Static166.anInt3041 == 0 && Static254.anInt4212 == 0) {
							Static183.method2545(anIntArray116[anInt1584 + 2], anIntArray116[anInt1584 + 1], anIntArray116[anInt1584 + 3], anIntArray116[anInt1584]);
							return;
						}
						return;
					}
					if (arg0 == 5604) {
						anInt1582--;
						if (Static8.anInt119 != 2) {
							return;
						}
						if (Static166.anInt3041 == 0 && Static254.anInt4212 == 0) {
							Static343.method4565(Static298.method3885(aStringArray8[anInt1582]));
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt1582 -= 3;
						anInt1584 -= 7;
						if (Static8.anInt119 != 2) {
							return;
						}
						if (Static166.anInt3041 == 0 && Static254.anInt4212 == 0) {
							Static73.method1223(aStringArray8[anInt1582 + 2], false, Static298.method3885(aStringArray8[anInt1582]), anIntArray116[anInt1584 + 2], anIntArray116[anInt1584 + 1], anIntArray116[anInt1584 + 4] == 1, anIntArray116[anInt1584 + 3], aStringArray8[anInt1582 + 1], anIntArray116[anInt1584 + 6] == 1, anIntArray116[anInt1584 + 5] == 1, anIntArray116[anInt1584]);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static254.anInt4212 == 0) {
							Static26.anInt634 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray116[anInt1584++] = Static366.anInt6050;
						return;
					}
					if (arg0 == 5608) {
						anIntArray116[anInt1584++] = Static308.anInt5038;
						return;
					}
					if (arg0 == 5609) {
						anIntArray116[anInt1584++] = Static26.anInt634;
						return;
					}
					if (arg0 == 5610) {
						for (local157 = 0; local157 < 5; local157++) {
							aStringArray8[anInt1582++] = Static263.aStringArray30.length > local157 ? Static333.method4394(Static263.aStringArray30[local157]) : "";
						}
						Static263.aStringArray30 = null;
						return;
					}
					if (arg0 == 5611) {
						anIntArray116[anInt1584++] = Static325.anInt5268;
						return;
					}
					if (arg0 == 5612) {
						local157 = anIntArray116[--anInt1584];
						if (Static8.anInt119 != 6) {
							return;
						}
						if (Static166.anInt3041 == 0 && Static254.anInt4212 == 0) {
							if (Static338.aClass152_4 != null) {
								Static338.aClass152_4.method2924();
								Static338.aClass152_4 = null;
							}
							Static11.anInt178 = local157;
							Static119.method4569(8);
							return;
						}
						return;
					}
					if (arg0 == 5613) {
						anIntArray116[anInt1584++] = Static366.anInt6050;
						return;
					}
					if (arg0 == 5615) {
						anInt1582 -= 2;
						local75 = aStringArray8[anInt1582];
						local81 = aStringArray8[anInt1582 + 1];
						if (Static8.anInt119 != 2) {
							return;
						}
						if (Static166.anInt3041 == 0 && Static254.anInt4212 == 0) {
							if (Static338.aClass152_4 != null) {
								Static338.aClass152_4.method2924();
								Static338.aClass152_4 = null;
							}
							Static76.aString7 = local75;
							Static160.aString55 = local81;
							Static119.method4569(4);
							return;
						}
						return;
					}
					if (arg0 == 5616) {
						Static33.method450(false);
						return;
					}
					if (arg0 == 5617) {
						anIntArray116[anInt1584++] = Static347.anInt5752;
						return;
					}
					if (arg0 == 5618) {
						local157 = anIntArray116[--anInt1584];
						Static44.method582(local157, false);
						return;
					}
					if (arg0 == 5619) {
						local157 = anIntArray116[--anInt1584];
						Static44.method582(local157, true);
						return;
					}
					if (arg0 == 5620) {
						Static66.method1087();
						if (Static150.aString22 != "" && Static150.aString22 != "") {
							anIntArray116[anInt1584++] = 1;
							return;
						}
						anIntArray116[anInt1584++] = 0;
						return;
					}
					if (arg0 == 5621) {
						anInt1582 -= 3;
						anInt1584 -= 7;
						if (Static8.anInt119 != 2) {
							return;
						}
						if (Static166.anInt3041 == 0 && Static254.anInt4212 == 0) {
							Static73.method1223(aStringArray8[anInt1582 + 2], true, Static298.method3885(aStringArray8[anInt1582]), anIntArray116[anInt1584 + 2], anIntArray116[anInt1584 + 1], anIntArray116[anInt1584 + 4] == 1, anIntArray116[anInt1584 + 3], aStringArray8[anInt1582 + 1], anIntArray116[anInt1584 + 6] == 1, anIntArray116[anInt1584 + 5] == 1, anIntArray116[anInt1584]);
							return;
						}
						return;
					}
					if (arg0 == 5622) {
						@Pc(4543) Class45 local4543 = Static24.aClass196_1.method3908("3", false);
						while (local4543.anInt1129 == 0) {
							Static435.method5777(1L);
						}
						if (local4543.anInt1129 == 2) {
							throw new RuntimeException("Error opening file");
						}
						@Pc(4563) Class70 local4563 = (Class70) local4543.anObject5;
						if (local4563.method1442().exists()) {
							@Pc(4573) Class4_Sub9 local4573 = new Class4_Sub9(50);
							try {
								local4563.method1441(local4573.aByteArray81, 50, 0);
							} catch (@Pc(4582) IOException local4582) {
							}
						}
						try {
							local4563.method1443();
							return;
						} catch (@Pc(4588) Exception local4588) {
							return;
						}
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local157 = anIntArray116[--anInt1584];
						if (local157 < 1) {
							local157 = 1;
						}
						if (local157 > 4) {
							local157 = 4;
						}
						Static413.aClass49_Sub1_1.anInt3220 = local157;
						Static84.method4130();
						Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
						Static340.aBoolean392 = false;
						return;
					}
					if (arg0 == 6002) {
						Static413.aClass49_Sub1_1.method2486(anIntArray116[--anInt1584] == 1);
						Static84.method4130();
						Static70.method1167();
						Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
						Static340.aBoolean392 = false;
						return;
					}
					if (arg0 == 6003) {
						Static413.aClass49_Sub1_1.aBoolean235 = anIntArray116[--anInt1584] == 1;
						Static70.method1167();
						Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
						Static340.aBoolean392 = false;
						return;
					}
					if (arg0 == 6005) {
						Static413.aClass49_Sub1_1.aBoolean233 = anIntArray116[--anInt1584] == 1;
						Static84.method4130();
						Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
						Static340.aBoolean392 = false;
						return;
					}
					if (arg0 == 6006) {
						Static413.aClass49_Sub1_1.aBoolean241 = anIntArray116[--anInt1584] == 1;
						Static39.aClass135_1.method5380(!Static413.aClass49_Sub1_1.aBoolean241);
						Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
						Static340.aBoolean392 = false;
						return;
					}
					if (arg0 == 6007) {
						Static413.aClass49_Sub1_1.anInt3208 = anIntArray116[--anInt1584];
						Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
						Static340.aBoolean392 = false;
						return;
					}
					if (arg0 == 6008) {
						Static413.aClass49_Sub1_1.aBoolean246 = anIntArray116[--anInt1584] == 1;
						Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
						Static340.aBoolean392 = false;
						return;
					}
					if (arg0 == 6009) {
						Static413.aClass49_Sub1_1.aBoolean232 = anIntArray116[--anInt1584] == 1;
						Static84.method4130();
						Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
						Static340.aBoolean392 = false;
						return;
					}
					if (arg0 == 6010) {
						Static413.aClass49_Sub1_1.aBoolean231 = anIntArray116[--anInt1584] == 1;
						Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
						Static340.aBoolean392 = false;
						return;
					}
					if (arg0 == 6011) {
						local157 = anIntArray116[--anInt1584];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static413.aClass49_Sub1_1.method2480(Static341.anInt5549, local157);
						Static84.method4130();
						Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
						Static340.aBoolean392 = false;
						return;
					}
					if (arg0 == 6012) {
						Static413.aClass49_Sub1_1.method2476(Static341.anInt5549, anIntArray116[--anInt1584] == 1);
						Static207.method2904();
						Static458.method5376();
						Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
						Static340.aBoolean392 = false;
						return;
					}
					if (arg0 == 6014) {
						Static413.aClass49_Sub1_1.aBoolean236 = anIntArray116[--anInt1584] == 1;
						Static84.method4130();
						Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
						Static340.aBoolean392 = false;
						return;
					}
					if (arg0 == 6015) {
						Static413.aClass49_Sub1_1.aBoolean242 = anIntArray116[--anInt1584] == 1;
						Static84.method4130();
						Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
						Static340.aBoolean392 = false;
						return;
					}
					if (arg0 == 6016) {
						local157 = anIntArray116[--anInt1584];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static413.aClass49_Sub1_1.anInt3200 = local157;
						Static398.method4984(Static341.anInt5549);
						Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
						return;
					}
					if (arg0 == 6017) {
						Static413.aClass49_Sub1_1.aBoolean234 = anIntArray116[--anInt1584] == 1;
						Static277.method3667();
						Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
						Static340.aBoolean392 = false;
						return;
					}
					if (arg0 == 6018) {
						local157 = anIntArray116[--anInt1584];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static413.aClass49_Sub1_1.anInt3199 = local157;
						Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
						Static340.aBoolean392 = false;
						return;
					}
					if (arg0 == 6019) {
						local157 = anIntArray116[--anInt1584];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 255) {
							local157 = 255;
						}
						if (local157 != Static413.aClass49_Sub1_1.anInt3203) {
							if (Static413.aClass49_Sub1_1.anInt3203 == 0 && Static267.anInt4386 != -1) {
								Static417.method5641(Static231.aClass211_62, local157, Static267.anInt4386);
								Static26.aBoolean37 = false;
							} else if (local157 == 0) {
								Static46.method611();
								Static26.aBoolean37 = false;
							} else {
								Static58.method823(local157);
							}
							Static413.aClass49_Sub1_1.anInt3203 = local157;
						}
						Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
						Static340.aBoolean392 = false;
						return;
					}
					if (arg0 == 6020) {
						local157 = anIntArray116[--anInt1584];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static413.aClass49_Sub1_1.anInt3204 = local157;
						Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
						Static340.aBoolean392 = false;
						return;
					}
					if (arg0 == 6021) {
						Static413.aClass49_Sub1_1.aBoolean248 = anIntArray116[--anInt1584] == 1;
						Static70.method1167();
						return;
					}
					if (arg0 == 6023) {
						local157 = anIntArray116[--anInt1584];
						local1313 = false;
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 2) {
							local157 = 2;
						}
						if (Static18.anInt296 < 96) {
							local157 = 0;
							local1313 = true;
						}
						Static420.method5669(local157);
						Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
						Static340.aBoolean392 = false;
						anIntArray116[anInt1584++] = local1313 ? 0 : 1;
						return;
					}
					if (arg0 == 6024) {
						local157 = anIntArray116[--anInt1584];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static413.aClass49_Sub1_1.anInt3202 = local157;
						Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
						return;
					}
					if (arg0 == 6025) {
						local157 = anIntArray116[--anInt1584];
						if (local157 < 0 || local157 > Static134.method1950(Static18.anInt296)) {
							local157 = 0;
						}
						Static413.aClass49_Sub1_1.anInt3201 = local157;
						Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
						Static340.aBoolean392 = false;
						return;
					}
					if (arg0 == 6027) {
						local157 = anIntArray116[--anInt1584];
						if (local157 < 0 || local157 > 1) {
							local157 = 0;
						}
						Static350.method4638(local157 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static413.aClass49_Sub1_1.aBoolean238 = anIntArray116[--anInt1584] != 0;
						Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
						return;
					}
					if (arg0 == 6029) {
						Static413.aClass49_Sub1_1.anInt3208 = anIntArray116[--anInt1584];
						Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
						return;
					}
					if (arg0 == 6030) {
						Static413.aClass49_Sub1_1.aBoolean247 = anIntArray116[--anInt1584] != 0;
						Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
						Static84.method4130();
						return;
					}
					if (arg0 == 6031) {
						local157 = anIntArray116[--anInt1584];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static398.method4984(local157);
						return;
					}
					if (arg0 == 6032) {
						local157 = anIntArray116[--anInt1584];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static413.aClass49_Sub1_1.anInt3221 = local157;
						Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
						Static340.aBoolean392 = false;
						return;
					}
					if (arg0 == 6033) {
						local157 = anIntArray116[--anInt1584];
						if (local157 < 0 || local157 > 4) {
							local157 = 2;
						}
						Static413.aClass49_Sub1_1.anInt3216 = local157;
						Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
						return;
					}
					if (arg0 == 6034) {
						Static413.aClass49_Sub1_1.aBoolean237 = anIntArray116[--anInt1584] == 1;
						Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
						Static207.method2904();
						Static340.aBoolean392 = false;
						return;
					}
					if (arg0 == 6035) {
						Static413.aClass49_Sub1_1.aBoolean249 = anIntArray116[--anInt1584] == 1;
						Static84.method4130();
						Static70.method1167();
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray116[anInt1584++] = Static413.aClass49_Sub1_1.anInt3220;
						return;
					}
					if (arg0 == 6102) {
						anIntArray116[anInt1584++] = Static413.aClass49_Sub1_1.method2482(Static341.anInt5549) ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray116[anInt1584++] = Static413.aClass49_Sub1_1.aBoolean235 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray116[anInt1584++] = Static413.aClass49_Sub1_1.aBoolean233 ? 1 : 0;
						return;
					}
					if (arg0 == 6106) {
						anIntArray116[anInt1584++] = Static413.aClass49_Sub1_1.aBoolean241 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray116[anInt1584++] = Static413.aClass49_Sub1_1.anInt3208;
						return;
					}
					if (arg0 == 6108) {
						anIntArray116[anInt1584++] = Static413.aClass49_Sub1_1.aBoolean246 ? 1 : 0;
						return;
					}
					if (arg0 == 6109) {
						anIntArray116[anInt1584++] = Static413.aClass49_Sub1_1.aBoolean232 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray116[anInt1584++] = Static413.aClass49_Sub1_1.aBoolean231 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray116[anInt1584++] = Static413.aClass49_Sub1_1.method2478(Static341.anInt5549);
						return;
					}
					if (arg0 == 6112) {
						anIntArray116[anInt1584++] = Static413.aClass49_Sub1_1.method2481(Static341.anInt5549) ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray116[anInt1584++] = Static413.aClass49_Sub1_1.aBoolean236 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray116[anInt1584++] = Static413.aClass49_Sub1_1.aBoolean242 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray116[anInt1584++] = Static413.aClass49_Sub1_1.anInt3200;
						return;
					}
					if (arg0 == 6117) {
						anIntArray116[anInt1584++] = Static413.aClass49_Sub1_1.aBoolean234 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray116[anInt1584++] = Static413.aClass49_Sub1_1.anInt3199;
						return;
					}
					if (arg0 == 6119) {
						anIntArray116[anInt1584++] = Static413.aClass49_Sub1_1.anInt3203;
						return;
					}
					if (arg0 == 6120) {
						anIntArray116[anInt1584++] = Static413.aClass49_Sub1_1.anInt3204;
						return;
					}
					if (arg0 == 6121) {
						anIntArray116[anInt1584++] = Static39.aClass135_1.method5387() ? 1 : 0;
						return;
					}
					if (arg0 == 6123) {
						anIntArray116[anInt1584++] = Static370.method4889();
						return;
					}
					if (arg0 == 6124) {
						anIntArray116[anInt1584++] = Static413.aClass49_Sub1_1.anInt3202;
						return;
					}
					if (arg0 == 6125) {
						anIntArray116[anInt1584++] = Static413.aClass49_Sub1_1.anInt3201;
						return;
					}
					if (arg0 == 6126) {
						anIntArray116[anInt1584++] = Static39.aClass135_1.method5346() ? 1 : 0;
						return;
					}
					if (arg0 == 6127) {
						anIntArray116[anInt1584++] = Static413.aClass49_Sub1_1.aBoolean245 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray116[anInt1584++] = Static413.aClass49_Sub1_1.aBoolean238 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray116[anInt1584++] = Static413.aClass49_Sub1_1.anInt3208;
						return;
					}
					if (arg0 == 6130) {
						anIntArray116[anInt1584++] = Static413.aClass49_Sub1_1.aBoolean247 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray116[anInt1584++] = Static341.anInt5549;
						return;
					}
					if (arg0 == 6132) {
						anIntArray116[anInt1584++] = Static413.aClass49_Sub1_1.anInt3221;
						return;
					}
					if (arg0 == 6133) {
						anIntArray116[anInt1584++] = Static300.anInt4900 == 1 || Static300.anInt4900 == 4 ? 1 : 0;
						return;
					}
					if (arg0 == 6134) {
						anIntArray116[anInt1584++] = Static134.method1950(Static18.anInt296);
						return;
					}
					if (arg0 == 6135) {
						anIntArray116[anInt1584++] = Static413.aClass49_Sub1_1.anInt3216;
						return;
					}
					if (arg0 == 6136) {
						anIntArray116[anInt1584++] = Static413.aClass49_Sub1_1.aBoolean237 ? 1 : 0;
						return;
					}
					if (arg0 == 6137) {
						@Pc(5978) boolean local5978 = true;
						try {
							local5978 = jagmisc.getTotalPhysicalMemory() > 268435456L;
						} catch (@Pc(5988) Throwable local5988) {
						}
						anIntArray116[anInt1584++] = local5978 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt1584 -= 2;
						Static276.aShort68 = (short) anIntArray116[anInt1584];
						if (Static276.aShort68 <= 0) {
							Static276.aShort68 = 256;
						}
						Static448.aShort102 = (short) anIntArray116[anInt1584 + 1];
						if (Static448.aShort102 <= 0) {
							Static448.aShort102 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt1584 -= 2;
						Static314.aShort71 = (short) anIntArray116[anInt1584];
						if (Static314.aShort71 <= 0) {
							Static314.aShort71 = 256;
						}
						Static81.aShort24 = (short) anIntArray116[anInt1584 + 1];
						if (Static81.aShort24 <= 0) {
							Static81.aShort24 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt1584 -= 4;
						Static45.aShort17 = (short) anIntArray116[anInt1584];
						if (Static45.aShort17 <= 0) {
							Static45.aShort17 = 1;
						}
						Static157.aShort51 = (short) anIntArray116[anInt1584 + 1];
						if (Static157.aShort51 <= 0) {
							Static157.aShort51 = 32767;
						} else if (Static157.aShort51 < Static45.aShort17) {
							Static157.aShort51 = Static45.aShort17;
						}
						Static306.aShort70 = (short) anIntArray116[anInt1584 + 2];
						if (Static306.aShort70 <= 0) {
							Static306.aShort70 = 1;
						}
						Static21.aShort2 = (short) anIntArray116[anInt1584 + 3];
						if (Static21.aShort2 <= 0) {
							Static21.aShort2 = 32767;
							return;
						}
						if (Static21.aShort2 < Static306.aShort70) {
							Static21.aShort2 = Static306.aShort70;
						}
						return;
					}
					if (arg0 == 6203) {
						Static199.method2851(0, Static73.aClass110_3.anInt2617, false, 0, Static73.aClass110_3.anInt2590);
						anIntArray116[anInt1584++] = Static37.anInt613;
						anIntArray116[anInt1584++] = Static178.anInt3232;
						return;
					}
					if (arg0 == 6204) {
						anIntArray116[anInt1584++] = Static314.aShort71;
						anIntArray116[anInt1584++] = Static81.aShort24;
						return;
					}
					if (arg0 == 6205) {
						anIntArray116[anInt1584++] = Static276.aShort68;
						anIntArray116[anInt1584++] = Static448.aShort102;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray116[anInt1584++] = (int) (Static266.method3498() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray116[anInt1584++] = (int) (Static266.method3498() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt1584 -= 3;
						local157 = anIntArray116[anInt1584];
						local192 = anIntArray116[anInt1584 + 1];
						local89 = anIntArray116[anInt1584 + 2];
						aCalendar1.clear();
						aCalendar1.set(11, 12);
						aCalendar1.set(local89, local192, local157);
						anIntArray116[anInt1584++] = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6303) {
						aCalendar1.clear();
						aCalendar1.setTime(new Date(Static266.method3498()));
						anIntArray116[anInt1584++] = aCalendar1.get(1);
						return;
					}
					if (arg0 == 6304) {
						local157 = anIntArray116[--anInt1584];
						local1313 = true;
						if (local157 < 0) {
							local1313 = (local157 + 1) % 4 == 0;
						} else if (local157 < 1582) {
							local1313 = local157 % 4 == 0;
						} else if (local157 % 4 != 0) {
							local1313 = false;
						} else if (local157 % 100 != 0) {
							local1313 = true;
						} else if (local157 % 400 != 0) {
							local1313 = false;
						}
						anIntArray116[anInt1584++] = local1313 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray116[anInt1584++] = Static190.method2772() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray116[anInt1584++] = Static136.method1955() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static8.anInt119 == 6 && Static166.anInt3041 == 0 && Static254.anInt4212 == 0) {
							if (Static99.aBoolean126) {
								anIntArray116[anInt1584++] = 0;
								return;
							}
							if (Static386.aLong194 > Static266.method3498() - 1000L) {
								anIntArray116[anInt1584++] = 1;
								return;
							}
							Static99.aBoolean126 = true;
							Static448.method5935(Static345.aClass146_78);
							Static247.aClass4_Sub9_Sub2_2.method5047(Static134.anInt2443);
							anIntArray116[anInt1584++] = 0;
							return;
						}
						anIntArray116[anInt1584++] = 1;
						return;
					}
					@Pc(6515) Class13 local6515;
					@Pc(6482) Class176_Sub1 local6482;
					if (arg0 == 6501) {
						local6482 = Static419.method5190();
						if (local6482 != null) {
							anIntArray116[anInt1584++] = local6482.anInt4262;
							anIntArray116[anInt1584++] = local6482.anInt4258;
							aStringArray8[anInt1582++] = local6482.aString35;
							local6515 = local6482.method3398();
							anIntArray116[anInt1584++] = local6515.anInt196;
							aStringArray8[anInt1582++] = local6515.aString3;
							anIntArray116[anInt1584++] = local6482.anInt4256;
							anIntArray116[anInt1584++] = local6482.anInt4266;
							aStringArray8[anInt1582++] = local6482.aString34;
							return;
						}
						anIntArray116[anInt1584++] = -1;
						anIntArray116[anInt1584++] = 0;
						aStringArray8[anInt1582++] = "";
						anIntArray116[anInt1584++] = 0;
						aStringArray8[anInt1582++] = "";
						anIntArray116[anInt1584++] = 0;
						anIntArray116[anInt1584++] = 0;
						aStringArray8[anInt1582++] = "";
						return;
					}
					if (arg0 == 6502) {
						local6482 = Static255.method3374();
						if (local6482 != null) {
							anIntArray116[anInt1584++] = local6482.anInt4262;
							anIntArray116[anInt1584++] = local6482.anInt4258;
							aStringArray8[anInt1582++] = local6482.aString35;
							local6515 = local6482.method3398();
							anIntArray116[anInt1584++] = local6515.anInt196;
							aStringArray8[anInt1582++] = local6515.aString3;
							anIntArray116[anInt1584++] = local6482.anInt4256;
							anIntArray116[anInt1584++] = local6482.anInt4266;
							aStringArray8[anInt1582++] = local6482.aString34;
							return;
						}
						anIntArray116[anInt1584++] = -1;
						anIntArray116[anInt1584++] = 0;
						aStringArray8[anInt1582++] = "";
						anIntArray116[anInt1584++] = 0;
						aStringArray8[anInt1582++] = "";
						anIntArray116[anInt1584++] = 0;
						anIntArray116[anInt1584++] = 0;
						aStringArray8[anInt1582++] = "";
						return;
					}
					if (arg0 == 6503) {
						local157 = anIntArray116[--anInt1584];
						local81 = aStringArray8[--anInt1582];
						if (Static8.anInt119 == 6 && Static166.anInt3041 == 0 && Static254.anInt4212 == 0) {
							anIntArray116[anInt1584++] = Static355.method4690(local157, local81) ? 1 : 0;
							return;
						}
						anIntArray116[anInt1584++] = 0;
						return;
					}
					if (arg0 == 6504) {
						Static413.aClass49_Sub1_1.anInt3218 = anIntArray116[--anInt1584];
						Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
						return;
					}
					if (arg0 == 6505) {
						anIntArray116[anInt1584++] = Static413.aClass49_Sub1_1.anInt3218;
						return;
					}
					if (arg0 == 6506) {
						local157 = anIntArray116[--anInt1584];
						@Pc(6872) Class176_Sub1 local6872 = Static252.method3320(local157);
						if (local6872 != null) {
							anIntArray116[anInt1584++] = local6872.anInt4258;
							aStringArray8[anInt1582++] = local6872.aString35;
							@Pc(6896) Class13 local6896 = local6872.method3398();
							anIntArray116[anInt1584++] = local6896.anInt196;
							aStringArray8[anInt1582++] = local6896.aString3;
							anIntArray116[anInt1584++] = local6872.anInt4256;
							anIntArray116[anInt1584++] = local6872.anInt4266;
							aStringArray8[anInt1582++] = local6872.aString34;
							return;
						}
						anIntArray116[anInt1584++] = -1;
						aStringArray8[anInt1582++] = "";
						anIntArray116[anInt1584++] = 0;
						aStringArray8[anInt1582++] = "";
						anIntArray116[anInt1584++] = 0;
						anIntArray116[anInt1584++] = 0;
						aStringArray8[anInt1582++] = "";
						return;
					}
					if (arg0 == 6507) {
						anInt1584 -= 4;
						local157 = anIntArray116[anInt1584];
						local1313 = anIntArray116[anInt1584 + 1] == 1;
						local89 = anIntArray116[anInt1584 + 2];
						local1965 = anIntArray116[anInt1584 + 3] == 1;
						Static419.method5194(local89, local1313, local157, local1965);
						return;
					}
					if (arg0 == 6508) {
						Static53.method707();
						return;
					}
					if (arg0 == 6509) {
						if (Static8.anInt119 != 6) {
							return;
						}
						Static213.aBoolean43 = anIntArray116[--anInt1584] == 1;
						return;
					}
				} else if (arg0 < 6700) {
					if (arg0 == 6600) {
						Static413.aClass49_Sub1_1.aBoolean230 = anIntArray116[--anInt1584] == 1;
						Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
						return;
					}
					if (arg0 == 6601) {
						anIntArray116[anInt1584++] = Static413.aClass49_Sub1_1.aBoolean230 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6800 && Static140.aClass201_3 == Static1.aClass201_1) {
					if (arg0 == 6700) {
						local157 = Static449.aClass67_37.method1432();
						if (Static182.anInt3346 != -1) {
							local157++;
						}
						anIntArray116[anInt1584++] = local157;
						return;
					}
					if (arg0 == 6701) {
						local157 = anIntArray116[--anInt1584];
						if (Static182.anInt3346 != -1) {
							if (local157 == 0) {
								anIntArray116[anInt1584++] = Static182.anInt3346;
								return;
							}
							local157--;
						}
						@Pc(7171) Class4_Sub8 local7171 = (Class4_Sub8) Static449.aClass67_37.method1428();
						while (local157-- > 0) {
							local7171 = (Class4_Sub8) Static449.aClass67_37.method1424();
						}
						anIntArray116[anInt1584++] = local7171.anInt861;
						return;
					}
					if (arg0 == 6702) {
						local157 = anIntArray116[--anInt1584];
						if (Static412.aClass110ArrayArray2[local157] == null) {
							aStringArray8[anInt1582++] = "";
							return;
						}
						local81 = Static412.aClass110ArrayArray2[local157][0].aString16;
						if (local81 == null) {
							aStringArray8[anInt1582++] = "";
							return;
						}
						aStringArray8[anInt1582++] = local81.substring(0, local81.indexOf(58));
						return;
					}
					if (arg0 == 6703) {
						local157 = anIntArray116[--anInt1584];
						if (Static412.aClass110ArrayArray2[local157] == null) {
							anIntArray116[anInt1584++] = 0;
							return;
						}
						anIntArray116[anInt1584++] = Static412.aClass110ArrayArray2[local157].length;
						return;
					}
					if (arg0 == 6704) {
						anInt1584 -= 2;
						local157 = anIntArray116[anInt1584];
						local192 = anIntArray116[anInt1584 + 1];
						if (Static412.aClass110ArrayArray2[local157] == null) {
							aStringArray8[anInt1582++] = "";
							return;
						}
						local3345 = Static412.aClass110ArrayArray2[local157][local192].aString16;
						if (local3345 == null) {
							aStringArray8[anInt1582++] = "";
							return;
						}
						aStringArray8[anInt1582++] = local3345;
						return;
					}
					if (arg0 == 6705) {
						anInt1584 -= 2;
						local157 = anIntArray116[anInt1584];
						local192 = anIntArray116[anInt1584 + 1];
						if (Static412.aClass110ArrayArray2[local157] == null) {
							anIntArray116[anInt1584++] = 0;
							return;
						}
						anIntArray116[anInt1584++] = Static412.aClass110ArrayArray2[local157][local192].anInt2663;
						return;
					}
					if (arg0 == 6706) {
						return;
					}
					if (arg0 == 6707) {
						anInt1584 -= 3;
						local157 = anIntArray116[anInt1584];
						local192 = anIntArray116[anInt1584 + 1];
						local89 = anIntArray116[anInt1584 + 2];
						Static364.method4849(local157 << 16 | local192, "", local89, 1);
						return;
					}
					if (arg0 == 6708) {
						anInt1584 -= 3;
						local157 = anIntArray116[anInt1584];
						local192 = anIntArray116[anInt1584 + 1];
						local89 = anIntArray116[anInt1584 + 2];
						Static364.method4849(local157 << 16 | local192, "", local89, 2);
						return;
					}
					if (arg0 == 6709) {
						anInt1584 -= 3;
						local157 = anIntArray116[anInt1584];
						local192 = anIntArray116[anInt1584 + 1];
						local89 = anIntArray116[anInt1584 + 2];
						Static364.method4849(local157 << 16 | local192, "", local89, 3);
						return;
					}
					if (arg0 == 6710) {
						anInt1584 -= 3;
						local157 = anIntArray116[anInt1584];
						local192 = anIntArray116[anInt1584 + 1];
						local89 = anIntArray116[anInt1584 + 2];
						Static364.method4849(local157 << 16 | local192, "", local89, 4);
						return;
					}
					if (arg0 == 6711) {
						anInt1584 -= 3;
						local157 = anIntArray116[anInt1584];
						local192 = anIntArray116[anInt1584 + 1];
						local89 = anIntArray116[anInt1584 + 2];
						Static364.method4849(local157 << 16 | local192, "", local89, 5);
						return;
					}
					if (arg0 == 6712) {
						anInt1584 -= 3;
						local157 = anIntArray116[anInt1584];
						local192 = anIntArray116[anInt1584 + 1];
						local89 = anIntArray116[anInt1584 + 2];
						Static364.method4849(local157 << 16 | local192, "", local89, 6);
						return;
					}
					if (arg0 == 6713) {
						anInt1584 -= 3;
						local157 = anIntArray116[anInt1584];
						local192 = anIntArray116[anInt1584 + 1];
						local89 = anIntArray116[anInt1584 + 2];
						Static364.method4849(local157 << 16 | local192, "", local89, 7);
						return;
					}
					if (arg0 == 6714) {
						anInt1584 -= 3;
						local157 = anIntArray116[anInt1584];
						local192 = anIntArray116[anInt1584 + 1];
						local89 = anIntArray116[anInt1584 + 2];
						Static364.method4849(local157 << 16 | local192, "", local89, 8);
						return;
					}
					if (arg0 == 6715) {
						anInt1584 -= 3;
						local157 = anIntArray116[anInt1584];
						local192 = anIntArray116[anInt1584 + 1];
						local89 = anIntArray116[anInt1584 + 2];
						Static364.method4849(local157 << 16 | local192, "", local89, 9);
						return;
					}
					if (arg0 == 6716) {
						anInt1584 -= 3;
						local157 = anIntArray116[anInt1584];
						local192 = anIntArray116[anInt1584 + 1];
						local89 = anIntArray116[anInt1584 + 2];
						Static364.method4849(local157 << 16 | local192, "", local89, 10);
						return;
					}
					if (arg0 == 6717) {
						anInt1584 -= 3;
						local157 = anIntArray116[anInt1584];
						local192 = anIntArray116[anInt1584 + 1];
						local89 = anIntArray116[anInt1584 + 2];
						@Pc(7759) Class110 local7759 = Static220.method2992(local157 << 16 | local192, local89);
						Static4.method74();
						@Pc(7764) Class4_Sub20 local7764 = Static55.method752(local7759);
						Static247.method3255(local7759, local7764.anInt3510, local7764.method2796());
						return;
					}
				} else if (arg0 < 6900) {
					@Pc(7792) Class100 local7792;
					if (arg0 == 6800) {
						local157 = anIntArray116[--anInt1584];
						local7792 = Static82.aClass235_1.method4957(local157);
						if (local7792.aString15 == null) {
							aStringArray8[anInt1582++] = "";
							return;
						}
						aStringArray8[anInt1582++] = local7792.aString15;
						return;
					}
					if (arg0 == 6801) {
						local157 = anIntArray116[--anInt1584];
						local7792 = Static82.aClass235_1.method4957(local157);
						anIntArray116[anInt1584++] = local7792.anInt2483;
						return;
					}
					if (arg0 == 6802) {
						local157 = anIntArray116[--anInt1584];
						local7792 = Static82.aClass235_1.method4957(local157);
						anIntArray116[anInt1584++] = local7792.anInt2486;
						return;
					}
					if (arg0 == 6803) {
						local157 = anIntArray116[--anInt1584];
						local7792 = Static82.aClass235_1.method4957(local157);
						anIntArray116[anInt1584++] = local7792.anInt2488;
						return;
					}
					if (arg0 == 6804) {
						anInt1584 -= 2;
						local157 = anIntArray116[anInt1584];
						local192 = anIntArray116[anInt1584 + 1];
						@Pc(7914) Class247 local7914 = Static435.aClass240_2.method5128(local192);
						if (local7914.method5556()) {
							aStringArray8[anInt1582++] = Static82.aClass235_1.method4957(local157).method1961(local7914.aString72, local192);
							return;
						}
						anIntArray116[anInt1584++] = Static82.aClass235_1.method4957(local157).method1959(local7914.anInt6901, local192);
						return;
					}
				} else if (arg0 < 7000) {
					if (arg0 == 6900) {
						anIntArray116[anInt1584++] = Static412.aBoolean491 && !Static119.aBoolean403 ? 1 : 0;
						return;
					}
					if (arg0 == 6901) {
						anIntArray116[anInt1584++] = Static385.anInt6298;
						return;
					}
					if (arg0 == 6902) {
						anIntArray116[anInt1584++] = Static381.anInt914;
						return;
					}
					if (arg0 == 6903) {
						anIntArray116[anInt1584++] = Static408.anInt6899;
						return;
					}
					if (arg0 == 6904) {
						anIntArray116[anInt1584++] = Static400.anInt6500;
						return;
					}
					if (arg0 == 6905) {
						local75 = "";
						if (Static404.aClass45_8 != null) {
							if (Static404.aClass45_8.anObject5 == null) {
								local75 = Static373.method4912(Static404.aClass45_8.anInt1130);
							} else {
								local75 = (String) Static404.aClass45_8.anObject5;
							}
						}
						aStringArray8[anInt1582++] = local75;
						return;
					}
					if (arg0 == 6906) {
						anIntArray116[anInt1584++] = Static342.anInt5684;
						return;
					}
					if (arg0 == 6907) {
						anIntArray116[anInt1584++] = Static224.anInt3837;
						return;
					}
					if (arg0 == 6908) {
						anIntArray116[anInt1584++] = Static455.anInt7623;
						return;
					}
					if (arg0 == 6909) {
						anIntArray116[anInt1584++] = Static151.aBoolean198 ? 1 : 0;
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ah", name = "O", descriptor = "Lclient!dj;")
	public static Class23_Sub1 aClass23_Sub1_1;

	@OriginalMember(owner = "client!ah", name = "G", descriptor = "Lclient!bb;")
	public static final Class8 aClass8_6 = new Class8(64);

	@OriginalMember(owner = "client!ah", name = "K", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_88 = Static161.method2452("Untersuchen");

	@OriginalMember(owner = "client!ah", name = "R", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_92 = Static161.method2452("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!ah", name = "L", descriptor = "Lclient!dc;")
	public static Class20 aClass20_89 = aClass20_92;

	@OriginalMember(owner = "client!ah", name = "M", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_90 = Static161.method2452("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!ah", name = "N", descriptor = "Z")
	public static boolean aBoolean7 = true;

	@OriginalMember(owner = "client!ah", name = "P", descriptor = "[I")
	public static final int[] anIntArray13 = new int[2048];

	@OriginalMember(owner = "client!ah", name = "Q", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_91 = Static161.method2452("titlebutton");

	@OriginalMember(owner = "client!ah", name = "S", descriptor = "I")
	public static int anInt177 = 0;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)J")
	public static long method165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class5_Sub3 local7 = Static157.aClass5_Sub3ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass29_1 == null ? 0L : local7.aClass29_1.aLong61;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZ)Lclient!na;")
	public static Class5_Sub2_Sub13 method166(@OriginalArg(0) int arg0) {
		@Pc(10) Class5_Sub2_Sub13 local10 = (Class5_Sub2_Sub13) Static4.aClass8_5.method227((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static50.aClass23_22.method738(Static127.method1974(arg0), Static121.method1913(arg0));
		local10 = new Class5_Sub2_Sub13();
		if (local24 != null) {
			local10.method1966(new Class5_Sub6(local24));
		}
		Static4.aClass8_5.method232((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!ig;BLclient!ig;)V")
	public static void method167(@OriginalArg(0) Class5_Sub2_Sub8 arg0, @OriginalArg(2) Class5_Sub2_Sub8 arg1) {
		if (Static126.aClass5_Sub2_Sub10Array6 == null) {
			Static126.aClass5_Sub2_Sub10Array6 = Static194.method2884(Static4.anInt107, Static186.aClass23_Sub1_26, 0);
		}
		if (Static30.aClass47Array2 == null) {
			Static30.aClass47Array2 = Static129.method2007(Static186.aClass23_Sub1_26, 0, Static211.anInt4105);
		}
		if (Static58.aClass47Array5 == null) {
			Static58.aClass47Array5 = Static129.method2007(Static186.aClass23_Sub1_26, 0, Static82.anInt1813);
		}
		if (Static125.aClass47Array9 == null) {
			Static125.aClass47Array9 = Static129.method2007(Static186.aClass23_Sub1_26, 0, Static138.anInt3856);
		}
		Static42.method824(0, 23, 765, 480, 0);
		Static42.method810(0, 0, 138, 23, 12425273, 9135624);
		Static42.method810(138, 0, 640, 23, 5197647, 2697513);
		arg1.method1350(Static192.aClass20_1412, 69, 15, 0, -1);
		if (Static125.aClass47Array9 != null) {
			Static125.aClass47Array9[1].method2016(140, 1);
			arg0.method1334(Static103.aClass20_806, 152, 10, 16777215, -1);
			Static125.aClass47Array9[0].method2016(140, 12);
			arg0.method1334(Static139.aClass20_1091, 152, 21, 16777215, -1);
		}
		if (Static58.aClass47Array5 != null) {
			if (Static173.anIntArray366[0] == 0 && Static123.anIntArray289[0] == 0) {
				Static58.aClass47Array5[2].method2016(280, 4);
			} else {
				Static58.aClass47Array5[0].method2016(280, 4);
			}
			if (Static173.anIntArray366[0] == 0 && Static123.anIntArray289[0] == 1) {
				Static58.aClass47Array5[3].method2016(295, 4);
			} else {
				Static58.aClass47Array5[1].method2016(295, 4);
			}
			arg1.method1334(Static179.aClass20_1309, 312, 17, 16777215, -1);
			if (Static173.anIntArray366[0] == 1 && Static123.anIntArray289[0] == 0) {
				Static58.aClass47Array5[2].method2016(390, 4);
			} else {
				Static58.aClass47Array5[0].method2016(390, 4);
			}
			if (Static173.anIntArray366[0] == 1 && Static123.anIntArray289[0] == 1) {
				Static58.aClass47Array5[3].method2016(405, 4);
			} else {
				Static58.aClass47Array5[1].method2016(405, 4);
			}
			arg1.method1334(Static113.aClass20_874, 422, 17, 16777215, -1);
			if (Static173.anIntArray366[0] == 2 && Static123.anIntArray289[0] == 0) {
				Static58.aClass47Array5[2].method2016(500, 4);
			} else {
				Static58.aClass47Array5[0].method2016(500, 4);
			}
			if (Static173.anIntArray366[0] == 2 && Static123.anIntArray289[0] == 1) {
				Static58.aClass47Array5[3].method2016(515, 4);
			} else {
				Static58.aClass47Array5[1].method2016(515, 4);
			}
			arg1.method1334(Static40.aClass20_292, 532, 17, 16777215, -1);
			if (Static173.anIntArray366[0] == 3 && Static123.anIntArray289[0] == 0) {
				Static58.aClass47Array5[2].method2016(610, 4);
			} else {
				Static58.aClass47Array5[0].method2016(610, 4);
			}
			if (Static173.anIntArray366[0] == 3 && Static123.anIntArray289[0] == 1) {
				Static58.aClass47Array5[3].method2016(625, 4);
			} else {
				Static58.aClass47Array5[1].method2016(625, 4);
			}
			arg1.method1334(Static12.aClass20_130, 642, 17, 16777215, -1);
		}
		Static42.method824(700, 4, 58, 16, 0);
		arg0.method1350(Static141.aClass20_1110, 729, 16, 16777215, -1);
		Static5.anInt123 = -1;
		if (Static126.aClass5_Sub2_Sub10Array6 == null) {
			return;
		}
		@Pc(396) int local396 = 8;
		@Pc(402) int local402 = 24;
		@Pc(404) int local404;
		@Pc(406) int local406;
		do {
			local404 = local402;
			local406 = local396;
			if ((local396 - 1) * local402 >= Static101.anInt2157) {
				local396--;
			}
			if (Static101.anInt2157 <= local396 * (local402 - 1)) {
				local402--;
			}
			if (Static101.anInt2157 <= local396 * (local402 - 1)) {
				local402--;
			}
		} while (local404 != local402 || local396 != local406);
		local404 = (765 - local396 * 88) / (local396 - -1);
		if (local404 > 5) {
			local404 = 5;
		}
		@Pc(481) int local481 = (765 - local404 * (local396 - 1) - local396 * 88) / 2;
		local406 = (480 - local402 * 19) / (local402 + 1);
		if (local406 > 5) {
			local406 = 5;
		}
		@Pc(501) int local501 = 0;
		@Pc(503) int local503 = local481;
		@Pc(518) int local518 = (480 - local402 * 19 - local406 * (local402 - 1)) / 2;
		@Pc(523) int local523 = local518 + 23;
		for (@Pc(525) int local525 = 0; local525 < Static101.anInt2157; local525++) {
			@Pc(531) Class85 local531 = Static4.aClass85Array1[local525];
			@Pc(533) boolean local533 = true;
			@Pc(538) Class20 local538 = Static132.method2805(local531.anInt3228);
			if (local531.anInt3228 == -1) {
				local533 = false;
				local538 = Static92.aClass20_726;
			} else if (local531.anInt3228 > 1980) {
				local538 = Static51.aClass20_365;
				local533 = false;
			}
			if (Static70.anInt1549 >= local503 && local523 <= Static207.anInt4069 && Static70.anInt1549 < local503 + 88 && Static207.anInt4069 < local523 + 19 && local533) {
				Static5.anInt123 = local525;
				Static126.aClass5_Sub2_Sub10Array6[local531.aBoolean142 ? 1 : 0].method2408(local503, local523);
			} else {
				Static126.aClass5_Sub2_Sub10Array6[local531.aBoolean142 ? 1 : 0].method2414(local503, local523);
			}
			if (Static30.aClass47Array2 != null) {
				Static30.aClass47Array2[local531.anInt3224 + (local531.aBoolean142 ? 8 : 0)].method2016(local503 + 29, local523);
			}
			arg1.method1350(Static132.method2805(local531.anInt3230), local503 + 15, local523 + 14, 0, -1);
			arg0.method1350(local538, local503 + 60, local523 + 9 - -5, 268435455, -1);
			local523 += local406 + 19;
			@Pc(670) int local670 = ~local402;
			local501++;
			if (local670 >= ~local501) {
				local523 = local518 + 23;
				local501 = 0;
				local503 += local404 + 88;
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZIIIII)I")
	public static int method168(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(8) int local8 = arg4;
			arg4 = arg0;
			arg0 = local8;
		}
		@Pc(25) int local25 = arg3 & 0x3;
		if (local25 == 0) {
			return arg2;
		} else if (local25 == 1) {
			return arg1;
		} else if (local25 == 2) {
			return 7 + 1 - arg2 - arg4;
		} else {
			return 1 + 7 - arg0 - arg1;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIBLclient!mf;)V")
	public static void method170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class69 arg2) {
		if (arg2.anInt2488 == 1) {
			Static175.method2670(0L, (short) 30, 0, Static215.aClass20_1545, arg2.aClass20_919, arg2.anInt2523);
		}
		if (arg2.anInt2488 == 2 && !Static28.aBoolean32) {
			@Pc(40) Class20 local40 = Static194.method2883(arg2);
			if (local40 != null) {
				Static175.method2670(0L, (short) 9, -1, Static70.method1166(new Class20[] { Static200.aClass20_1477, arg2.aClass20_917 }), local40, arg2.anInt2523);
			}
		}
		if (arg2.anInt2488 == 3) {
			Static175.method2670(0L, (short) 13, 0, Static215.aClass20_1545, Static2.aClass20_9, arg2.anInt2523);
		}
		if (arg2.anInt2488 == 4) {
			Static175.method2670(0L, (short) 57, 0, Static215.aClass20_1545, arg2.aClass20_919, arg2.anInt2523);
		}
		if (arg2.anInt2488 == 5) {
			Static175.method2670(0L, (short) 23, 0, Static215.aClass20_1545, arg2.aClass20_919, arg2.anInt2523);
		}
		if (arg2.anInt2488 == 6 && Static133.aClass69_12 == null) {
			Static175.method2670(0L, (short) 15, -1, Static215.aClass20_1545, arg2.aClass20_919, arg2.anInt2523);
		}
		@Pc(154) int local154;
		@Pc(148) int local148;
		if (arg2.anInt2474 == 2) {
			local148 = 0;
			for (@Pc(150) int local150 = 0; local150 < arg2.anInt2527; local150++) {
				for (local154 = 0; local154 < arg2.anInt2533; local154++) {
					@Pc(163) int local163 = local154 * (arg2.anInt2494 + 32);
					@Pc(170) int local170 = local150 * (arg2.anInt2470 + 32);
					if (local148 < 20) {
						local170 += arg2.anIntArray279[local148];
						local163 += arg2.anIntArray276[local148];
					}
					if (local163 <= arg1 && arg0 >= local170 && arg1 < local163 + 32 && arg0 < local170 + 32) {
						Static191.aClass69_15 = arg2;
						Static96.anInt2017 = local148;
						if (arg2.anIntArray277[local148] > 0) {
							@Pc(234) Class5_Sub2_Sub11 local234 = Static196.method2908(arg2.anIntArray277[local148] - 1);
							if (Static57.anInt1307 == 1 && Static216.method3179(Static94.method1538(arg2))) {
								if (Static96.anInt2016 != arg2.anInt2523 || Static37.anInt1354 != local148) {
									Static175.method2670((long) local234.anInt2335, (short) 26, local148, Static70.method1166(new Class20[] { Static196.aClass20_1443, Static33.aClass20_258, local234.aClass20_861 }), Static180.aClass20_1324, arg2.anInt2523);
								}
							} else if (!Static28.aBoolean32 || !Static216.method3179(Static94.method1538(arg2))) {
								@Pc(298) Class20[] local298 = local234.aClass20Array17;
								if (Static32.aBoolean44) {
									local298 = Static170.method2599(local298);
								}
								@Pc(318) int local318;
								@Pc(373) byte local373;
								if (Static216.method3179(Static94.method1538(arg2))) {
									for (local318 = 4; local318 >= 3; local318--) {
										if (local298 != null && local298[local318] != null) {
											if (local318 == 3) {
												local373 = 6;
											} else {
												local373 = 11;
											}
											Static175.method2670((long) local234.anInt2335, local373, local148, Static70.method1166(new Class20[] { Static171.aClass20_1270, local234.aClass20_861 }), local298[local318], arg2.anInt2523);
										} else if (local318 == 4) {
											Static175.method2670((long) local234.anInt2335, (short) 11, local148, Static70.method1166(new Class20[] { Static171.aClass20_1270, local234.aClass20_861 }), Static181.aClass20_1334, arg2.anInt2523);
										}
									}
								}
								if (Static96.method1548(Static94.method1538(arg2))) {
									Static175.method2670((long) local234.anInt2335, (short) 18, local148, Static70.method1166(new Class20[] { Static171.aClass20_1270, local234.aClass20_861 }), Static180.aClass20_1324, arg2.anInt2523);
								}
								if (Static216.method3179(Static94.method1538(arg2)) && local298 != null) {
									for (local318 = 2; local318 >= 0; local318--) {
										if (local298[local318] != null) {
											local373 = 0;
											if (local318 == 0) {
												local373 = 50;
											}
											if (local318 == 1) {
												local373 = 47;
											}
											if (local318 == 2) {
												local373 = 20;
											}
											Static175.method2670((long) local234.anInt2335, local373, local148, Static70.method1166(new Class20[] { Static171.aClass20_1270, local234.aClass20_861 }), local298[local318], arg2.anInt2523);
										}
									}
								}
								local298 = arg2.aClass20Array20;
								if (Static32.aBoolean44) {
									local298 = Static170.method2599(local298);
								}
								if (local298 != null) {
									for (local318 = 4; local318 >= 0; local318--) {
										if (local298[local318] != null) {
											local373 = 0;
											if (local318 == 0) {
												local373 = 36;
											}
											if (local318 == 1) {
												local373 = 7;
											}
											if (local318 == 2) {
												local373 = 8;
											}
											if (local318 == 3) {
												local373 = 28;
											}
											if (local318 == 4) {
												local373 = 51;
											}
											Static175.method2670((long) local234.anInt2335, local373, local148, Static70.method1166(new Class20[] { Static171.aClass20_1270, local234.aClass20_861 }), local298[local318], arg2.anInt2523);
										}
									}
								}
								Static175.method2670((long) local234.anInt2335, (short) 1007, local148, Static70.method1166(new Class20[] { Static171.aClass20_1270, local234.aClass20_861 }), Static136.aClass20_1075, arg2.anInt2523);
							} else if ((Static22.anInt2837 & 0x10) == 16) {
								Static175.method2670((long) local234.anInt2335, (short) 24, local148, Static70.method1166(new Class20[] { Static10.aClass20_115, Static33.aClass20_258, local234.aClass20_861 }), Static96.aClass20_754, arg2.anInt2523);
							}
						}
					}
					local148++;
				}
			}
		}
		if (!arg2.aBoolean103) {
			return;
		}
		if (!Static28.aBoolean32) {
			@Pc(694) Class20 local694;
			for (local148 = 9; local148 >= 5; local148--) {
				local694 = Static85.method1453(local148, arg2);
				if (local694 != null) {
					Static175.method2670((long) (local148 + 1), (short) 1002, arg2.anInt2475, arg2.aClass20_922, local694, arg2.anInt2523);
				}
			}
			local694 = Static194.method2883(arg2);
			if (local694 != null) {
				Static175.method2670(0L, (short) 9, arg2.anInt2475, arg2.aClass20_922, local694, arg2.anInt2523);
			}
			for (local154 = 4; local154 >= 0; local154--) {
				@Pc(748) Class20 local748 = Static85.method1453(local154, arg2);
				if (local748 != null) {
					Static175.method2670((long) (local154 + 1), (short) 19, arg2.anInt2475, arg2.aClass20_922, local748, arg2.anInt2523);
				}
			}
			if (Static30.method455(Static94.method1538(arg2))) {
				Static175.method2670(0L, (short) 15, arg2.anInt2475, Static215.aClass20_1545, Static136.aClass20_1071, arg2.anInt2523);
				return;
			}
			return;
		}
		if (Static75.method1219(Static94.method1538(arg2)) && (Static22.anInt2837 & 0x20) == 32) {
			Static175.method2670(0L, (short) 49, arg2.anInt2475, Static70.method1166(new Class20[] { Static10.aClass20_115, Static65.aClass20_490, arg2.aClass20_922 }), Static96.aClass20_754, arg2.anInt2523);
			return;
		}
	}
}

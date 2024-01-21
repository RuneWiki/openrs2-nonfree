import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "Lclient!ve;")
	public static Class3_Sub1 aClass3_Sub1_20;

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
	public static int anInt2804 = 0;

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "Lclient!ig;")
	public static final Class47 aClass47_21 = new Class47(64);

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1354 = Static187.method3089("Use");

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1352 = aClass92_1354;

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1353 = Static187.method3089("leuchten3:");

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
	public static void method2075() {
		if (Static42.aClass15_3 != null) {
			Static42.aClass15_3.method2627();
		}
		if (Static65.aClass15_2 != null) {
			Static65.aClass15_2.method2627();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZI)I")
	public static int method2076(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IJ)V")
	public static void method2078(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static103.anInt2229 >= 100) {
			Static145.method2151(Static120.aClass92_1181, Static26.aClass92_268, 0);
			return;
		}
		@Pc(29) Class92 local29 = Static179.method2937(arg0).method3198();
		for (@Pc(31) int local31 = 0; local31 < Static103.anInt2229; local31++) {
			if (Static57.aLongArray3[local31] == arg0) {
				Static145.method2151(Static208.method787(new Class92[] { local29, Static116.aClass92_1156 }), Static26.aClass92_268, 0);
				return;
			}
		}
		for (@Pc(66) int local66 = 0; local66 < Static78.anInt1731; local66++) {
			if (Static106.aLongArray7[local66] == arg0) {
				Static145.method2151(Static208.method787(new Class92[] { Static129.aClass92_1257, local29, Static167.aClass92_1683 }), Static26.aClass92_268, 0);
				return;
			}
		}
		if (local29.method3243(Static15.aClass8_Sub3_Sub1_1.aClass92_374)) {
			Static145.method2151(Static202.aClass92_2013, Static26.aClass92_268, 0);
			return;
		}
		Static57.aLongArray3[Static103.anInt2229] = arg0;
		Static75.aClass92Array13[Static103.anInt2229++] = Static179.method2937(arg0);
		Static61.anInt1468 = Static25.anInt588;
		Static38.aClass1_Sub14_Sub1_3.method3067(160);
		Static38.aClass1_Sub14_Sub1_3.method3016(arg0);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BI)V")
	public static void method2080(@OriginalArg(1) int arg0) {
		if (Static52.anInt1299 == 0) {
			Static16.aClass1_Sub12_Sub3_2.method2253(arg0);
		} else {
			Static154.anInt3195 = arg0;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!e;IIIII)V")
	public static void method2081(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static163.anInt3629) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static115.anInt2477) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static160.anInt3334 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class1_Sub17 local62 = Static179.aClass1_Sub17ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static73.anIntArrayArrayArray3[local17][local23][local32] + Static73.anIntArrayArrayArray3[local17][local23 + 1][local32] + Static73.anIntArrayArrayArray3[local17][local23][local32 + 1] + Static73.anIntArrayArrayArray3[local17][local23 + 1][local32 + 1]) / 4 - (Static73.anIntArrayArrayArray3[arg1][arg2][arg3] + Static73.anIntArrayArrayArray3[arg1][arg2 + 1][arg3] + Static73.anIntArrayArrayArray3[arg1][arg2][arg3 + 1] + Static73.anIntArrayArrayArray3[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(151) Class48 local151 = local62.aClass48_1;
									if (local151 != null) {
										if (local151.aClass8_4.method2671()) {
											arg0.method2674(local151.aClass8_4, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local151.aClass8_5 != null && local151.aClass8_5.method2671()) {
											arg0.method2674(local151.aClass8_5, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(222) int local222 = 0; local222 < local62.anInt2380; local222++) {
										@Pc(228) Class16 local228 = local62.aClass16Array3[local222];
										if (local228 != null && local228.aClass8_2.method2671() && (local23 == local228.anInt536 || local23 == local3) && (local32 == local228.anInt540 || local32 == local11)) {
											@Pc(257) int local257 = local228.anInt547 + 1 - local228.anInt536;
											@Pc(265) int local265 = local228.anInt537 + 1 - local228.anInt540;
											arg0.method2674(local228.aClass8_2, (local228.anInt536 - arg2) * 128 + (local257 - arg4) * 64, local148, (local228.anInt540 - arg3) * 128 + (local265 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}

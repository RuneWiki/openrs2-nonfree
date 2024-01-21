import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "[I")
	public static int[] anIntArray133;

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "Lclient!ve;")
	public static Class3_Sub1 aClass3_Sub1_9;

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "J")
	public static long aLong81;

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_699 = Static187.method3089("Null");

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "[I")
	public static final int[] anIntArray134 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_700 = Static187.method3089("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_701 = Static187.method3089("mod_icons");

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_702 = Static187.method3089("VOLL");

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_703 = Static187.method3089("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!hg", name = "m", descriptor = "Z")
	public static boolean aBoolean102 = false;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIII)Z")
	public static boolean method1143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = arg2 * Static165.anInt3434 + arg0 * Static109.anInt2361 >> 16;
		@Pc(19) int local19 = arg2 * Static109.anInt2361 - arg0 * Static165.anInt3434 >> 16;
		@Pc(29) int local29 = arg1 * Static53.anInt1312 + local19 * Static62.anInt1477 >> 16;
		@Pc(39) int local39 = arg1 * Static62.anInt1477 - local19 * Static53.anInt1312 >> 16;
		if (local29 >= 50 && local29 <= 3500) {
			@Pc(55) int local55 = Static42.anInt1092 + (local9 << 9) / local29;
			@Pc(63) int local63 = Static33.anInt802 + (local39 << 9) / local29;
			return local55 >= Static12.anInt367 && local55 <= Static209.anInt4498 && local63 >= Static192.anInt4181 && local63 <= Static102.anInt2210;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!ab;Lclient!ab;I)V")
	public static void method1144(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1) {
		Static111.aClass3_21 = arg1;
		Static144.aClass3_25 = arg0;
		Static173.anInt3695 = Static111.aClass3_21.method3270(3);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI)Lclient!vd;")
	public static Class92 method1145(@OriginalArg(1) int arg0) {
		@Pc(5) Class92 local5 = Static49.method872(arg0);
		for (@Pc(11) int local11 = local5.method3233() - 3; local11 > 0; local11 -= 3) {
			local5 = Static208.method787(new Class92[] { local5.method3208(local11, 0), Static210.aClass92_2066, local5.method3232(local11) });
		}
		if (local5.method3233() > 9) {
			return Static208.method787(new Class92[] { Static48.aClass92_517, local5.method3208(local5.method3233() - 8, 0), Static45.aClass92_487, Static138.aClass92_1348, local5, Static42.aClass92_431 });
		} else if (local5.method3233() > 6) {
			return Static208.method787(new Class92[] { Static32.aClass92_346, local5.method3208(local5.method3233() - 4, 0), Static19.aClass92_211, Static138.aClass92_1348, local5, Static42.aClass92_431 });
		} else {
			return Static208.method787(new Class92[] { Static166.aClass92_1675, local5, Static195.aClass92_1982 });
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIBI)V")
	public static void method1147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg2 - arg4;
		@Pc(15) int local15 = arg3 - arg1;
		if (local10 == 0) {
			if (local15 != 0) {
				Static156.method2379(arg3, arg1, arg4, arg0);
			}
		} else if (local15 == 0) {
			Static32.method581(arg2, arg1, arg4, arg0);
		} else {
			@Pc(54) int local54 = (local15 << 12) / local10;
			@Pc(63) int local63 = arg1 - (local54 * arg4 >> 12);
			@Pc(72) int local72;
			@Pc(80) int local80;
			if (arg2 < Static102.anInt2207) {
				local72 = Static102.anInt2207;
				local80 = local63 + (Static102.anInt2207 * local54 >> 12);
			} else if (arg2 > Static116.anInt2488) {
				local72 = Static116.anInt2488;
				local80 = local63 + (local54 * Static116.anInt2488 >> 12);
			} else {
				local72 = arg2;
				local80 = arg3;
			}
			if (local80 < Static118.anInt2521) {
				local72 = (Static118.anInt2521 - local63 << 12) / local54;
				local80 = Static118.anInt2521;
			} else if (local80 > Static204.anInt2389) {
				local80 = Static204.anInt2389;
				local72 = (Static204.anInt2389 - local63 << 12) / local54;
			}
			@Pc(147) int local147;
			@Pc(149) int local149;
			if (arg4 < Static102.anInt2207) {
				local147 = Static102.anInt2207;
				local149 = (local54 * Static102.anInt2207 >> 12) + local63;
			} else if (Static116.anInt2488 >= arg4) {
				local147 = arg4;
				local149 = arg1;
			} else {
				local149 = (local54 * Static116.anInt2488 >> 12) + local63;
				local147 = Static116.anInt2488;
			}
			if (local149 < Static118.anInt2521) {
				local149 = Static118.anInt2521;
				local147 = (Static118.anInt2521 - local63 << 12) / local54;
			} else if (Static204.anInt2389 < local149) {
				local149 = Static204.anInt2389;
				local147 = (Static204.anInt2389 - local63 << 12) / local54;
			}
			Static59.method973(local72, local149, local80, local147, arg0);
		}
	}
}

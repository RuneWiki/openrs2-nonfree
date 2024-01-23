import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "Lclient!oe;")
	public static Class72 aClass72_143;

	@OriginalMember(owner = "client!jh", name = "i", descriptor = "J")
	public static long aLong89;

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "Lclient!qe;")
	public static Class78 aClass78_495 = Static199.method3560(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
	public static int anInt2284 = 0;

	@OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
	public static int anInt2285 = 0;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILclient!qe;)V")
	public static void method1790(@OriginalArg(1) Class78 arg0) {
		if (Static66.anInt1320 >= 2) {
			@Pc(13) int local13;
			@Pc(32) int local32;
			if (arg0.method3038(Static219.aClass78_853)) {
				for (local13 = 0; local13 < 10; local13++) {
					System.gc();
				}
				@Pc(23) Runtime local23 = Runtime.getRuntime();
				local32 = (int) ((local23.totalMemory() - local23.freeMemory()) / 1024L);
				Static95.method1663(null, Static94.method1640(new Class78[] { Static219.aClass78_855, Static19.method268(local32), Static96.aClass78_466 }), 0);
			}
			if (arg0.method3038(Static225.aClass78_867)) {
				Static162.method2928();
			}
			if (arg0.method3038(Static17.aClass78_56)) {
				Static125.method1281(25);
			}
			if (arg0.method3038(Static38.aClass78_131)) {
				Static108.aBoolean95 = true;
			}
			if (arg0.method3038(Static109.aClass78_520)) {
				Static108.aBoolean95 = false;
			}
			if (arg0.method3038(Static72.aClass78_830)) {
				for (local13 = 0; local13 < 4; local13++) {
					for (@Pc(93) int local93 = 1; local93 < 103; local93++) {
						for (local32 = 1; local32 < 103; local32++) {
							Static202.aClass90Array1[local13].anIntArrayArray41[local93][local32] = 0;
						}
					}
				}
			}
			if (arg0.method3027(Static170.aClass78_680) && Static144.anInt3283 != 0) {
				Static51.method670(arg0.method3052(6).method3017());
			}
			if (arg0.method3038(Static45.aClass78_153) && Static144.anInt3283 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method3027(Static45.aClass78_155)) {
				Static89.anInt1998 = arg0.method3052(12).method3018().method3017();
				Static95.method1663(null, Static94.method1640(new Class78[] { Static198.aClass78_781, Static19.method268(Static89.anInt1998) }), 0);
			}
			if (arg0.method3038(Static50.aClass78_167)) {
				Static57.aBoolean21 = true;
			}
		}
		Static161.aClass2_Sub23_Sub1_5.method2155(84);
		Static161.aClass2_Sub23_Sub1_5.method2132(arg0.method3041() - 1);
		Static161.aClass2_Sub23_Sub1_5.method2085(arg0.method3052(2));
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIII)V")
	public static void method1792(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static6.anInt187 <= arg5 && arg1 <= Static101.anInt2213 && Static73.anInt1576 <= arg0 && arg2 <= Static137.anInt3137) {
			if (arg3 == 1) {
				Static202.method3583(arg2, arg1, arg4, arg0, arg5);
			} else {
				Static30.method404(arg0, arg5, arg3, arg1, arg2, arg4);
			}
		} else if (arg3 == 1) {
			Static205.method543(arg2, arg1, arg0, arg4, arg5);
		} else {
			Static47.method625(arg3, arg5, arg1, arg2, arg4, arg0);
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)Lclient!sj;")
	public static Class87 method1795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub12 local7 = Static226.aClass2_Sub12ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class87 local14 = local7.aClass87_1;
			local7.aClass87_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BIIIIIII)V")
	public static void method1798(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) int local6 = arg0 + arg6;
		@Pc(15) int local15 = arg5 - arg6;
		@Pc(19) int local19 = arg6 + arg4;
		@Pc(24) int local24 = arg2 - arg6;
		for (@Pc(26) int local26 = arg0; local26 < local6; local26++) {
			Static221.method3893(arg3, arg4, Static183.anIntArrayArray40[local26], arg2);
		}
		for (@Pc(46) int local46 = arg5; local46 > local15; local46--) {
			Static221.method3893(arg3, arg4, Static183.anIntArrayArray40[local46], arg2);
		}
		for (@Pc(67) int local67 = local6; local67 <= local15; local67++) {
			@Pc(73) int[] local73 = Static183.anIntArrayArray40[local67];
			Static221.method3893(arg3, arg4, local73, local19);
			Static221.method3893(arg1, local19, local73, local24);
			Static221.method3893(arg3, local24, local73, arg2);
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
	public static void method1799() {
		@Pc(7) boolean local7 = false;
		while (!local7) {
			local7 = true;
			for (@Pc(13) int local13 = 0; local13 < Static138.anInt3182 - 1; local13++) {
				if (Static79.aShortArray53[local13] < 1000 && Static79.aShortArray53[local13 + 1] > 1000) {
					local7 = false;
					@Pc(37) Class78 local37 = Static57.aClass78Array6[local13];
					Static57.aClass78Array6[local13] = Static57.aClass78Array6[local13 + 1];
					Static57.aClass78Array6[local13 + 1] = local37;
					@Pc(55) Class78 local55 = Static32.aClass78Array30[local13];
					Static32.aClass78Array30[local13] = Static32.aClass78Array30[local13 + 1];
					Static32.aClass78Array30[local13 + 1] = local55;
					@Pc(73) int local73 = Static117.anIntArray450[local13];
					Static117.anIntArray450[local13] = Static117.anIntArray450[local13 + 1];
					Static117.anIntArray450[local13 + 1] = local73;
					@Pc(91) int local91 = Static120.anIntArray460[local13];
					Static120.anIntArray460[local13] = Static120.anIntArray460[local13 + 1];
					Static120.anIntArray460[local13 + 1] = local91;
					@Pc(109) short local109 = Static79.aShortArray53[local13];
					Static79.aShortArray53[local13] = Static79.aShortArray53[local13 + 1];
					Static79.aShortArray53[local13 + 1] = local109;
					@Pc(127) long local127 = Static14.aLongArray8[local13];
					Static14.aLongArray8[local13] = Static14.aLongArray8[local13 + 1];
					Static14.aLongArray8[local13 + 1] = local127;
				}
			}
		}
	}
}

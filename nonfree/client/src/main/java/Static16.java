import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!be", name = "N", descriptor = "[I")
	public static int[] anIntArray34;

	@OriginalMember(owner = "client!be", name = "P", descriptor = "I")
	public static int anInt304;

	@OriginalMember(owner = "client!be", name = "S", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!be", name = "D", descriptor = "Lclient!hh;")
	public static Class50 aClass50_128 = Static186.method3527(")3runescape)3com)4l=");

	@OriginalMember(owner = "client!be", name = "G", descriptor = "Lclient!hh;")
	public static Class50 aClass50_129 = Static186.method3527("");

	@OriginalMember(owner = "client!be", name = "K", descriptor = "Lclient!ec;")
	public static Class25 aClass25_1 = new Class25();

	@OriginalMember(owner = "client!be", name = "O", descriptor = "I")
	public static int anInt303 = 3353893;

	@OriginalMember(owner = "client!be", name = "Q", descriptor = "Lclient!hh;")
	public static Class50 aClass50_130 = Static186.method3527("null");

	@OriginalMember(owner = "client!be", name = "T", descriptor = "Lclient!hh;")
	public static Class50 aClass50_131 = Static186.method3527("Art");

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Lclient!lg;")
	public static Class70 method227(@OriginalArg(1) int arg0) {
		@Pc(10) Class70 local10 = (Class70) Static170.aClass84_30.method2579((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static212.aClass86_76.method3325(Static162.method2711(arg0), Static48.method759(arg0));
		local10 = new Class70();
		local10.anInt2421 = arg0;
		if (local26 != null) {
			local10.method1948(new Class1_Sub17(local26));
		}
		local10.method1958();
		if (local10.anInt2401 != -1) {
			local10.method1952(method227(local10.anInt2429), method227(local10.anInt2401));
		}
		if (local10.anInt2449 != -1) {
			local10.method1955(method227(local10.anInt2440), method227(local10.anInt2449));
		}
		if (!Static198.aBoolean186 && local10.aBoolean105) {
			local10.anInt2450 = 0;
			local10.aBoolean106 = false;
			local10.aClass50Array44 = null;
			local10.aClass50_833 = Static120.aClass50_821;
			local10.aClass50Array45 = null;
		}
		Static170.aClass84_30.method2582(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!ta;IIIII)V")
	public static void method228(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static179.anInt3725) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static12.anInt236) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static232.anInt4450 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class1_Sub11 local62 = Static56.aClass1_Sub11ArrayArrayArray3[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static119.anIntArrayArrayArray10[local17][local23][local32] + Static119.anIntArrayArrayArray10[local17][local23 + 1][local32] + Static119.anIntArrayArrayArray10[local17][local23][local32 + 1] + Static119.anIntArrayArrayArray10[local17][local23 + 1][local32 + 1]) / 4 - (Static119.anIntArrayArrayArray10[arg1][arg2][arg3] + Static119.anIntArrayArrayArray10[arg1][arg2 + 1][arg3] + Static119.anIntArrayArrayArray10[arg1][arg2][arg3 + 1] + Static119.anIntArrayArrayArray10[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(151) Class29 local151 = local62.aClass29_1;
									if (local151 != null) {
										if (local151.aClass20_1.method3487()) {
											arg0.method3490(local151.aClass20_1, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local151.aClass20_2 != null && local151.aClass20_2.method3487()) {
											arg0.method3490(local151.aClass20_2, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(222) int local222 = 0; local222 < local62.anInt1072; local222++) {
										@Pc(228) Class94 local228 = local62.aClass94Array1[local222];
										if (local228 != null && local228.aClass20_5.method3487() && (local23 == local228.anInt3686 || local23 == local3) && (local32 == local228.anInt3683 || local32 == local11)) {
											@Pc(257) int local257 = local228.anInt3692 + 1 - local228.anInt3686;
											@Pc(265) int local265 = local228.anInt3684 + 1 - local228.anInt3683;
											arg0.method3490(local228.aClass20_5, (local228.anInt3686 - arg2) * 128 + (local257 - arg4) * 64, local148, (local228.anInt3683 - arg3) * 128 + (local265 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(II)Lclient!ph;")
	public static Class1_Sub1_Sub15 method229(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub1_Sub15 local12 = (Class1_Sub1_Sub15) Static125.aClass84_23.method2579((long) arg0);
		if (local12 != null) {
			return local12;
		}
		local12 = Static46.method701(Static112.aClass86_37, arg0, Static166.aClass86_62);
		if (local12 != null) {
			Static125.aClass84_23.method2582(local12, (long) arg0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "([BZB)Ljava/lang/Object;")
	public static Object method230(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static151.aBoolean135) {
			try {
				@Pc(18) Class99 local18 = (Class99) Class.forName("Class99_Sub1").getDeclaredConstructor().newInstance();
				local18.method2997(arg0);
				return local18;
			} catch (@Pc(25) Throwable local25) {
				Static151.aBoolean135 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIII)V")
	public static void method231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(72) Class50 local72 = Static17.method257(new Class50[] { Static171.aClass50_1146, Static160.method2684(arg1), Static42.aClass50_325, Static160.method2684(arg2 >> 6), Static42.aClass50_325, Static160.method2684(arg0 >> 6), Static42.aClass50_325, Static160.method2684(arg2 & 0x3F), Static42.aClass50_325, Static160.method2684(arg0 & 0x3F) });
		local72.method1232();
		Static218.method2873(local72);
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(B)V")
	public static void method232() {
		if (Static32.aClass81_1 != null) {
			@Pc(7) Class81 local7 = Static32.aClass81_1;
			synchronized (Static32.aClass81_1) {
				Static32.aClass81_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IZ)Z")
	public static boolean method233(@OriginalArg(0) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}
}

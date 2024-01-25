import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "[I")
	public static final int[] anIntArray789 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!oj", name = "y", descriptor = "Lclient!lk;")
	public static final Class2_Sub13 aClass2_Sub13_12 = new Class2_Sub13(new byte[5000]);

	@OriginalMember(owner = "client!oj", name = "z", descriptor = "Z")
	public static boolean aBoolean490 = false;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)V")
	public static void method5606(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub1_Sub2 local8 = Static323.method4982(arg0, 6);
		local8.method410();
		local8.anInt348 = arg1;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIB)Lclient!ms;")
	public static Class155 method5607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class155 local7 = Static240.method3886(arg1);
		if (arg0 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass155Array2 == null || arg0 >= local7.aClass155Array2.length) {
			return null;
		} else {
			return local7.aClass155Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIII)V")
	public static void method5609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		@Pc(3) Class97[] local3 = Static239.aClass97Array1;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(11) Class97 local11 = local3[local5];
			if (local11 != null && local11.anInt2442 == 2) {
				Static307.method4778((local11.anInt2443 - Static133.anInt2474 << 7) + local11.anInt2447, (local11.anInt2445 - Static376.anInt6607 << 7) + local11.anInt2450, local11.anInt2455, local11.anInt2452 * 2, arg2 >> 1, arg1 >> 1);
				if (Static136.anIntArray287[0] > -1 && Static295.anInt5281 % 20 < 10) {
					Static275.aClass5Array14[local11.anInt2456].method5004(arg0 + Static136.anIntArray287[0] - 12, arg3 + -28 + Static136.anIntArray287[1]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IBI)I")
	public static int method5615(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 + arg0 * 57;
		@Pc(15) int local15 = local9 ^ local9 << 13;
		@Pc(29) int local29 = Integer.MAX_VALUE & local15 * (local15 * local15 * 15731 + 789221) + 1376312589;
		return local29 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IBILclient!ms;)V")
	public static void method5621(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class155 arg2) {
		if (Static68.aBoolean110) {
			if (!Static41.method878(arg2).method5126() || (Static26.anInt622 & 0x20) == 0) {
				return;
			}
			Static163.method2688(false, arg2.anInt4135, Static187.aString28 + " -> " + arg2.aString36, arg2.anInt4166, 23, 0L, Static363.anInt5936, arg2.anInt4212, Static258.aString34, true);
			return;
		}
		@Pc(24) String local24;
		for (@Pc(17) int local17 = 9; local17 >= 5; local17--) {
			local24 = Static80.method1438(local17, arg2);
			if (local24 != null) {
				Static163.method2688(false, arg2.anInt4135, arg2.aString36, arg2.anInt4166, 1004, (long) (local17 + 1), Static101.method1816(local17, arg2), arg2.anInt4212, local24, true);
			}
		}
		local24 = Static111.method2140(arg2);
		if (local24 != null) {
			Static163.method2688(false, arg2.anInt4135, arg2.aString36, arg2.anInt4166, 13, 0L, arg2.anInt4146, arg2.anInt4212, local24, true);
		}
		for (@Pc(87) int local87 = 4; local87 >= 0; local87--) {
			@Pc(94) String local94 = Static80.method1438(local87, arg2);
			if (local94 != null) {
				Static163.method2688(false, arg2.anInt4135, arg2.aString36, arg2.anInt4166, 50, (long) (local87 + 1), Static101.method1816(local87, arg2), arg2.anInt4212, local94, true);
			}
		}
		if (!Static41.method878(arg2).method5127()) {
			return;
		}
		if (arg2.aString39 != null) {
			Static163.method2688(false, arg2.anInt4135, "", arg2.anInt4166, 59, 0L, -1, arg2.anInt4212, arg2.aString39, true);
			return;
		}
		Static163.method2688(false, arg2.anInt4135, "", arg2.anInt4166, 59, 0L, -1, arg2.anInt4212, Static149.aClass221_102.method5229(Static189.anInt5185), true);
		return;
	}
}

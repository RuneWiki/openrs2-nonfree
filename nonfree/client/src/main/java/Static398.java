import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!u", name = "p", descriptor = "Lclient!kc;")
	public static Class3 aClass3_6;

	@OriginalMember(owner = "client!u", name = "q", descriptor = "[I")
	public static int[] anIntArray495;

	@OriginalMember(owner = "client!u", name = "n", descriptor = "Lclient!ub;")
	public static final Class244 aClass244_36 = new Class244();

	@OriginalMember(owner = "client!u", name = "r", descriptor = "J")
	public static long aLong191 = -1L;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "(I)V")
	public static void method4982() {
		if (Static39.aClass135_1.method5397()) {
			Static39.aClass135_1.method5334(Static391.aCanvas5);
			Static174.method2448();
			Static39.aClass135_1.method5329(Static391.aCanvas5);
			Static39.aClass135_1.method5377(Static391.aCanvas5);
		} else {
			method4984(Static341.anInt5549);
		}
		Static194.method5772();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IZIIIIII)V")
	public static void method4983(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == arg1) {
			Static204.method2867(arg0, arg2, arg4, arg5, arg3, arg6);
		} else if (Static62.anInt1114 <= arg5 - arg6 && Static207.anInt3632 >= arg5 + arg6 && Static254.anInt4211 <= arg4 - arg1 && Static275.anInt4594 >= arg4 + arg1) {
			Static457.method6057(arg4, arg5, arg0, arg6, arg2, arg3, arg1);
		} else {
			Static208.method5499(arg0, arg6, arg1, arg2, arg5, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)V")
	public static void method4984(@OriginalArg(1) int arg0) {
		Static70.method1165();
		Static174.method2448();
		Static192.method2786(true, arg0);
		Static256.method3379(Static57.aClass211_18, Static39.aClass135_1, Static13.aClass211_11);
		Static129.method1851(Static13.aClass211_11, Static39.aClass135_1);
		Static370.method4890();
		Static225.method3048(Static164.aClass95Array6);
		Static194.method5772();
		if (Static8.anInt119 == 2) {
			Static119.method4569(3);
		} else if (Static8.anInt119 == 6) {
			Static119.method4569(7);
			return;
		} else if (Static8.anInt119 == 9) {
			Static119.method4569(10);
			return;
		} else if (Static8.anInt119 == 1) {
			Static123.method1735(Static39.aClass135_1, Static13.aClass211_11);
			return;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZIIIII)V")
	public static void method4985(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg1 - arg0;
		@Pc(14) int local14 = arg3 - arg2;
		if (local14 == 0) {
			if (local9 != 0) {
				Static311.method4062(arg1, arg0, arg4, arg2);
			}
		} else if (local9 == 0) {
			Static286.method3749(arg4, arg2, arg0, arg3);
		} else {
			if (local14 < 0) {
				local14 = -local14;
			}
			if (local9 < 0) {
				local9 = -local9;
			}
			@Pc(60) boolean local60 = local9 > local14;
			@Pc(68) int local68;
			@Pc(70) int local70;
			if (local60) {
				local68 = arg2;
				local70 = arg3;
				arg2 = arg0;
				arg0 = local68;
				arg3 = arg1;
				arg1 = local70;
			}
			if (arg3 < arg2) {
				local68 = arg2;
				local70 = arg0;
				arg2 = arg3;
				arg0 = arg1;
				arg3 = local68;
				arg1 = local70;
			}
			local68 = arg0;
			local70 = arg3 - arg2;
			@Pc(108) int local108 = arg1 - arg0;
			@Pc(113) int local113 = -(local70 >> 1);
			if (local108 < 0) {
				local108 = -local108;
			}
			@Pc(129) int local129 = arg1 > arg0 ? 1 : -1;
			@Pc(133) int local133;
			if (local60) {
				for (local133 = arg2; local133 <= arg3; local133++) {
					Static267.anIntArrayArray50[local133][local68] = arg4;
					local113 += local108;
					if (local113 > 0) {
						local68 += local129;
						local113 -= local70;
					}
				}
			} else {
				for (local133 = arg2; local133 <= arg3; local133++) {
					Static267.anIntArrayArray50[local68][local133] = arg4;
					local113 += local108;
					if (local113 > 0) {
						local113 -= local70;
						local68 += local129;
					}
				}
			}
		}
	}
}

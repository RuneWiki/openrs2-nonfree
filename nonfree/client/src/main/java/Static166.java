import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!kp", name = "q", descriptor = "[I")
	public static final int[] anIntArray375 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!kp", name = "s", descriptor = "I")
	public static int anInt3137 = 0;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIII)V")
	public static void method3282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = (arg3 - 32) * arg3 / arg4;
		if (local11 < 8) {
			local11 = 8;
		}
		@Pc(37) int local37 = (arg3 - local11 - 32) * arg1 / (arg4 - arg3);
		Static177.aClass40Array23[0].method5077(arg0, arg2);
		Static177.aClass40Array23[1].method5077(arg0, arg2 + arg3 - 16);
		Static289.aClass81_7.method3017(arg3 - 32, Static290.anInt5449, 16, arg0, arg2 + 16);
		Static289.aClass81_7.method3017(local11, Static83.anInt1517, 16, arg0, arg2 + local37 + 16);
		Static289.aClass81_7.method2973(local37 + arg2 + 16, arg0, local11, Static196.anInt3685);
		Static289.aClass81_7.method2973(local37 + arg2 + 16, arg0 + 1, local11, Static196.anInt3685);
		Static289.aClass81_7.method2999(16, arg2 + local37 + 16, arg0, Static196.anInt3685);
		Static289.aClass81_7.method2999(16, local37 + arg2 + 17, arg0, Static196.anInt3685);
		Static289.aClass81_7.method2973(arg2 + local37 + 16, arg0 + 15, local11, Static133.anInt2450);
		Static289.aClass81_7.method2973(arg2 + local37 + 17, arg0 + 14, local11 - 1, Static133.anInt2450);
		Static289.aClass81_7.method2999(16, local11 + arg2 + local37 + 15, arg0, Static133.anInt2450);
		Static289.aClass81_7.method2999(15, local37 + arg2 + local11 + 14, arg0 + 1, Static133.anInt2450);
	}

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "(I)V")
	public static void method3283() {
		Static131.aClass6_Sub10_Sub1_2.method2886(44);
		Static131.aClass6_Sub10_Sub1_2.method3968(Static137.method2629());
		Static131.aClass6_Sub10_Sub1_2.method4025(Static209.anInt3815);
		Static131.aClass6_Sub10_Sub1_2.method4025(Static94.anInt1731);
		Static131.aClass6_Sub10_Sub1_2.method3968(Static297.anInt5582);
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(II)Z")
	public static boolean method3284(@OriginalArg(0) int arg0) {
		if (arg0 == 43 || arg0 == 45 || arg0 == 59 || arg0 == 31 || arg0 == 46) {
			return true;
		} else {
			return arg0 == 2 || arg0 == 38 || arg0 == 1008;
		}
	}
}

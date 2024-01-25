import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
	public static int anInt7461;

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "Lclient!rf;")
	public static final Class253 aClass253_1 = new Class253(0, 3, Static523.aClass306_19);

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "Lclient!rf;")
	public static final Class253 aClass253_2 = new Class253(1, 3, Static523.aClass306_19);

	@OriginalMember(owner = "client!rf", name = "l", descriptor = "Lclient!rf;")
	public static final Class253 aClass253_3 = new Class253(2, 4, Static523.aClass306_15);

	@OriginalMember(owner = "client!rf", name = "m", descriptor = "Lclient!rf;")
	public static final Class253 aClass253_4 = new Class253(3, 1, Static523.aClass306_19);

	@OriginalMember(owner = "client!rf", name = "n", descriptor = "Lclient!rf;")
	public static final Class253 aClass253_5 = new Class253(4, 2, Static523.aClass306_19);

	@OriginalMember(owner = "client!rf", name = "o", descriptor = "Lclient!rf;")
	public static final Class253 aClass253_6 = new Class253(5, 3, Static523.aClass306_19);

	@OriginalMember(owner = "client!rf", name = "p", descriptor = "Lclient!rf;")
	private static final Class253 aClass253_7 = new Class253(6, 4, Static523.aClass306_19);

	@OriginalMember(owner = "client!rf", name = "q", descriptor = "I")
	public static final int anInt7460 = Static344.method5361(16);

	@OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
	public static int anInt7462 = 0;

	@OriginalMember(owner = "client!rf", name = "t", descriptor = "I")
	public static int anInt7463 = -1;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIII)V")
	public static void method6054(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg1 - arg4;
		@Pc(15) int local15 = arg2 - arg0;
		if (local15 == 0) {
			if (local10 != 0) {
				Static236.method4051(arg4, arg0, arg1, arg3);
			}
		} else if (local10 == 0) {
			Static256.method4334(arg3, arg0, arg2, arg4);
		} else {
			if (local10 < 0) {
				local10 = -local10;
			}
			if (local15 < 0) {
				local15 = -local15;
			}
			@Pc(61) boolean local61 = local10 > local15;
			@Pc(65) int local65;
			@Pc(67) int local67;
			if (local61) {
				local65 = arg0;
				local67 = arg2;
				arg0 = arg4;
				arg4 = local65;
				arg2 = arg1;
				arg1 = local67;
			}
			if (arg2 < arg0) {
				local65 = arg0;
				local67 = arg4;
				arg0 = arg2;
				arg4 = arg1;
				arg2 = local65;
				arg1 = local67;
			}
			local65 = arg4;
			local67 = arg2 - arg0;
			@Pc(106) int local106 = arg1 - arg4;
			@Pc(116) int local116 = -(local67 >> 1);
			@Pc(123) int local123 = arg4 < arg1 ? 1 : -1;
			if (local106 < 0) {
				local106 = -local106;
			}
			@Pc(132) int local132;
			if (local61) {
				for (local132 = arg0; local132 <= arg2; local132++) {
					Static352.anIntArrayArray51[local132][local65] = arg3;
					local116 += local106;
					if (local116 > 0) {
						local65 += local123;
						local116 -= local67;
					}
				}
			} else {
				for (local132 = arg0; local132 <= arg2; local132++) {
					Static352.anIntArrayArray51[local65][local132] = arg3;
					local116 += local106;
					if (local116 > 0) {
						local116 -= local67;
						local65 += local123;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)[Lclient!rf;")
	public static Class253[] method6056() {
		return new Class253[] { aClass253_1, aClass253_2, aClass253_3, aClass253_4, aClass253_5, aClass253_6, aClass253_7 };
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!hn;I)V")
	public static void method6057(@OriginalArg(0) Class15_Sub2_Sub1 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static481.anInt8318 == arg0.anInt4718 || arg0.anInt4711 == -1 || arg0.anInt4714 != 0) {
			local5 = true;
		} else {
			@Pc(30) Class31 local30 = Static155.aClass76_2.method2152(arg0.anInt4711);
			if (local30.aBoolean37 || arg0.anInt4704 + 1 > local30.anIntArray68[arg0.anInt4709]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(62) int local62 = arg0.anInt4718 - arg0.anInt4721;
			@Pc(67) int local67 = Static481.anInt8318 - arg0.anInt4721;
			@Pc(78) int local78 = arg0.anInt4684 * 128 + arg0.method4035() * 64;
			@Pc(90) int local90 = arg0.anInt4729 * 128 + arg0.method4035() * 64;
			@Pc(101) int local101 = arg0.anInt4683 * 128 + arg0.method4035() * 64;
			@Pc(112) int local112 = arg0.anInt4698 * 128 + arg0.method4035() * 64;
			arg0.anInt8493 = (local90 * (local62 - local67) + local67 * local112) / local62;
			arg0.anInt8492 = ((local62 - local67) * local78 + local67 * local101) / local62;
		}
		arg0.anInt4755 = 0;
		if (arg0.anInt4680 == 0) {
			arg0.method4025(8192, false);
		}
		if (arg0.anInt4680 == 1) {
			arg0.method4025(12288, false);
		}
		if (arg0.anInt4680 == 2) {
			arg0.method4025(0, false);
		}
		if (arg0.anInt4680 == 3) {
			arg0.method4025(4096, false);
		}
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
	public static void method6058() {
		if (Static110.aClass62_15 == null) {
			return;
		}
		Static541.aClass77_13.method2164();
		Static36.method830();
		Static457.method6380();
		Static393.method5726();
		Static455.method5583();
		Static526.method7197();
		if (Static514.aClass82_1 != null) {
			Static514.aClass82_1.method2240();
		}
		Static161.method2904();
		Static452.method6364();
		Static108.method2159();
		Static515.method2859(false);
		Static372.method2812();
		for (@Pc(39) int local39 = 0; local39 < 2048; local39++) {
			@Pc(45) Class15_Sub2_Sub1_Sub1 local45 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local39];
			if (local45 != null) {
				local45.aClass5_Sub32_3 = null;
				for (@Pc(52) int local52 = 0; local52 < local45.aClass36Array3.length; local52++) {
					local45.aClass36Array3[local52] = null;
				}
			}
		}
		for (@Pc(75) int local75 = 0; local75 < Static310.anInt6066; local75++) {
			@Pc(82) Class15_Sub2_Sub1_Sub2 local82 = Static275.aClass5_Sub51Array1[local75].aClass15_Sub2_Sub1_Sub2_2;
			if (local82 != null) {
				for (@Pc(86) int local86 = 0; local86 < local82.aClass36Array3.length; local86++) {
					local82.aClass36Array3[local86] = null;
				}
			}
		}
		Static434.aClass78_5 = null;
		Static267.aClass78_3 = null;
		Static110.aClass62_15.method7061();
		Static110.aClass62_15 = null;
	}
}

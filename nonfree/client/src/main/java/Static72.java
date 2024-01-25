import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
	public static int anInt1198;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "([BIZ)Ljava/lang/Object;")
	public static Object method1167(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static23.aBoolean17) {
			try {
				@Pc(31) Class121 local31 = (Class121) Class.forName("ft").getDeclaredConstructor().newInstance();
				local31.method3014(arg0);
				return local31;
			} catch (@Pc(38) Throwable local38) {
				Static23.aBoolean17 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg1 + arg4;
		@Pc(14) int local14 = arg5 - arg4;
		for (@Pc(16) int local16 = arg1; local16 < local9; local16++) {
			Static161.method2977(arg2, arg0, arg6, Static120.anIntArrayArray18[local16], -108);
		}
		@Pc(43) int local43 = arg6 - arg4;
		for (@Pc(45) int local45 = arg5; local45 > local14; local45--) {
			Static161.method2977(arg2, arg0, arg6, Static120.anIntArrayArray18[local45], -117);
		}
		@Pc(67) int local67 = arg4 + arg2;
		for (@Pc(69) int local69 = local9; local69 <= local14; local69++) {
			@Pc(77) int[] local77 = Static120.anIntArrayArray18[local69];
			Static161.method2977(arg2, arg0, local67, local77, -115);
			Static161.method2977(local67, arg3, local43, local77, -106);
			Static161.method2977(local43, arg0, arg6, local77, -114);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!ns;B)V")
	public static void method1169(@OriginalArg(0) Class4_Sub1_Sub1_Sub2_Sub2 arg0) {
		for (@Pc(18) Class5_Sub20 local18 = (Class5_Sub20) Static84.aClass20_5.method378(); local18 != null; local18 = (Class5_Sub20) Static84.aClass20_5.method366()) {
			if (local18.aClass4_Sub1_Sub1_Sub2_Sub2_2 == arg0) {
				if (local18.aClass5_Sub4_Sub4_1 != null) {
					Static265.aClass5_Sub4_Sub1_2.method332(local18.aClass5_Sub4_Sub4_1);
					local18.aClass5_Sub4_Sub4_1 = null;
				}
				local18.method9222();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!da;)V")
	public static void method1170(@OriginalArg(0) Class70 arg0) {
		Static453.aClass70_9 = arg0;
	}
}

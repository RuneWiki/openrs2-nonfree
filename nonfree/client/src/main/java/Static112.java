import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "Z")
	public static boolean aBoolean167 = false;

	@OriginalMember(owner = "client!dv", name = "e", descriptor = "[I")
	public static final int[] anIntArray152 = new int[200];

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(II)Z")
	public static boolean method1840(@OriginalArg(0) int arg0) {
		return arg0 == (arg0 & -arg0);
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(BZIIIIZ)V")
	public static void method1841(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg4 <= arg1) {
			return;
		}
		@Pc(23) int local23 = (arg1 + arg4) / 2;
		@Pc(25) int local25 = arg1;
		@Pc(29) Class354_Sub1 local29 = Static456.aClass354_Sub1Array2[local23];
		Static456.aClass354_Sub1Array2[local23] = Static456.aClass354_Sub1Array2[arg4];
		Static456.aClass354_Sub1Array2[arg4] = local29;
		for (@Pc(41) int local41 = arg1; local41 < arg4; local41++) {
			if (Static416.method6444(arg5, arg2, arg3, local29, Static456.aClass354_Sub1Array2[local41], arg0) <= 0) {
				@Pc(58) Class354_Sub1 local58 = Static456.aClass354_Sub1Array2[local41];
				Static456.aClass354_Sub1Array2[local41] = Static456.aClass354_Sub1Array2[local25];
				Static456.aClass354_Sub1Array2[local25++] = local58;
			}
		}
		Static456.aClass354_Sub1Array2[arg4] = Static456.aClass354_Sub1Array2[local25];
		Static456.aClass354_Sub1Array2[local25] = local29;
		method1841(arg0, arg1, arg2, arg3, local25 - 1, arg5);
		method1841(arg0, local25 + 1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IFFF)F")
	public static float method1843(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg1 + (arg0 - arg1) * arg2;
	}
}

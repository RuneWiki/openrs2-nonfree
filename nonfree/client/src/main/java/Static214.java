import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!kk", name = "s", descriptor = "[I")
	public static final int[] anIntArray409 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZIIIZII)V")
	public static void method3287(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 <= arg1) {
			return;
		}
		@Pc(18) int local18 = (arg5 + arg1) / 2;
		@Pc(20) int local20 = arg1;
		@Pc(24) Class56_Sub1 local24 = Static264.aClass56_Sub1Array1[local18];
		Static264.aClass56_Sub1Array1[local18] = Static264.aClass56_Sub1Array1[arg5];
		Static264.aClass56_Sub1Array1[arg5] = local24;
		for (@Pc(36) int local36 = arg1; local36 < arg5; local36++) {
			if (Static242.method4561(arg3, arg0, arg4, local24, arg2, Static264.aClass56_Sub1Array1[local36]) <= 0) {
				@Pc(56) Class56_Sub1 local56 = Static264.aClass56_Sub1Array1[local36];
				Static264.aClass56_Sub1Array1[local36] = Static264.aClass56_Sub1Array1[local20];
				Static264.aClass56_Sub1Array1[local20++] = local56;
			}
		}
		Static264.aClass56_Sub1Array1[arg5] = Static264.aClass56_Sub1Array1[local20];
		Static264.aClass56_Sub1Array1[local20] = local24;
		method3287(arg0, arg1, arg2, arg3, arg4, local20 - 1);
		method3287(arg0, local20 + 1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIZ)Z")
	public static boolean method3288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static68.method1345(arg1, arg0) | Static68.method1351(arg1, arg0) | Static62.method1044(arg0, arg1)) & Static41.method648(arg1, arg0);
	}
}

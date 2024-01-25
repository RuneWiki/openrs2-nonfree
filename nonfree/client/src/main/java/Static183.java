import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!gha", name = "b", descriptor = "Lclient!wu;")
	public static Class384 aClass384_46;

	@OriginalMember(owner = "client!gha", name = "k", descriptor = "F")
	public static float aFloat41;

	@OriginalMember(owner = "client!gha", name = "f", descriptor = "Lclient!du;")
	public static Class81 aClass81_27 = new Class81(8);

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(IIIIZI)V")
	public static void method2933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = arg4 + 1;
		Static260.method3979(arg1, arg0, Static267.anIntArrayArray20[arg4], arg3);
		@Pc(20) int local20 = arg2 - 1;
		Static260.method3979(arg1, arg0, Static267.anIntArrayArray20[arg2], arg3);
		for (@Pc(36) int local36 = local7; local36 <= local20; local36++) {
			@Pc(42) int[] local42 = Static267.anIntArrayArray20[local36];
			local42[arg0] = local42[arg3] = arg1;
		}
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(IIIIIII)V")
	public static void method2936(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg2 - arg5;
		@Pc(13) int local13 = arg5 + arg3;
		for (@Pc(18) int local18 = arg3; local18 < local13; local18++) {
			Static260.method3979(arg0, arg4, Static267.anIntArrayArray20[local18], arg1);
		}
		@Pc(36) int local36 = arg1 - arg5;
		for (@Pc(38) int local38 = arg2; local38 > local9; local38--) {
			Static260.method3979(arg0, arg4, Static267.anIntArrayArray20[local38], arg1);
		}
		@Pc(58) int local58 = arg5 + arg4;
		for (@Pc(60) int local60 = local13; local60 <= local9; local60++) {
			@Pc(66) int[] local66 = Static267.anIntArrayArray20[local60];
			Static260.method3979(arg0, arg4, local66, local58);
			Static260.method3979(arg0, local36, local66, arg1);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static579 {

	@OriginalMember(owner = "client!wea", name = "i", descriptor = "Lclient!pe;")
	public static Class254 aClass254_137;

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(IIIIIIII)V")
	public static void method8273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg3 + arg4;
		@Pc(14) int local14 = arg2 - arg3;
		for (@Pc(16) int local16 = arg4; local16 < local9; local16++) {
			Static426.method6794(arg0, Static333.anIntArrayArray56[local16], arg5, arg1);
		}
		@Pc(34) int local34 = arg3 + arg5;
		for (@Pc(41) int local41 = arg2; local41 > local14; local41--) {
			Static426.method6794(arg0, Static333.anIntArrayArray56[local41], arg5, arg1);
		}
		@Pc(63) int local63 = arg0 - arg3;
		for (@Pc(65) int local65 = local9; local65 <= local14; local65++) {
			@Pc(71) int[] local71 = Static333.anIntArrayArray56[local65];
			Static426.method6794(local34, local71, arg5, arg1);
			Static426.method6794(local63, local71, local34, arg6);
			Static426.method6794(arg0, local71, local63, arg1);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	@OriginalMember(owner = "client!pt", name = "j", descriptor = "Lclient!pga;")
	public static Class281 aClass281_6;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BIIIIIII)V")
	public static void method6528(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg5 + arg4;
		@Pc(14) int local14 = arg6 - arg5;
		for (@Pc(16) int local16 = arg4; local16 < local9; local16++) {
			Static559.method7424(arg1, Static172.anIntArrayArray17[local16], arg2, arg3);
		}
		@Pc(39) int local39 = arg2 - arg5;
		for (@Pc(41) int local41 = arg6; local41 > local14; local41--) {
			Static559.method7424(arg1, Static172.anIntArrayArray17[local41], arg2, arg3);
		}
		@Pc(63) int local63 = arg3 + arg5;
		for (@Pc(65) int local65 = local9; local65 <= local14; local65++) {
			@Pc(71) int[] local71 = Static172.anIntArrayArray17[local65];
			Static559.method7424(arg1, local71, local63, arg3);
			Static559.method7424(arg0, local71, local39, local63);
			Static559.method7424(arg1, local71, arg2, local39);
		}
	}
}

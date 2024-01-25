import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(IIBIIII)V")
	public static void method4929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg3 + arg0;
		@Pc(14) int local14 = arg2 - arg0;
		for (@Pc(16) int local16 = arg3; local16 < local9; local16++) {
			Static188.method3208(arg1, arg4, arg5, Static349.anIntArrayArray71[local16]);
		}
		for (@Pc(32) int local32 = arg2; local32 > local14; local32--) {
			Static188.method3208(arg1, arg4, arg5, Static349.anIntArrayArray71[local32]);
		}
		@Pc(51) int local51 = arg1 - arg0;
		@Pc(55) int local55 = arg0 + arg5;
		for (@Pc(65) int local65 = local9; local65 <= local14; local65++) {
			@Pc(71) int[] local71 = Static349.anIntArrayArray71[local65];
			Static188.method3208(local55, arg4, arg5, local71);
			Static188.method3208(arg1, arg4, local51, local71);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!gca", name = "m", descriptor = "F")
	public static float aFloat118;

	@OriginalMember(owner = "client!gca", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString22 = "";

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIZIIII)V")
	public static void method2880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg1 + arg4;
		@Pc(13) int local13 = arg5 - arg4;
		for (@Pc(15) int local15 = arg1; local15 < local9; local15++) {
			Static276.method3099(arg2, Static582.anIntArrayArray69[local15], arg0, arg3);
		}
		for (@Pc(31) int local31 = arg5; local31 > local13; local31--) {
			Static276.method3099(arg2, Static582.anIntArrayArray69[local31], arg0, arg3);
		}
		@Pc(50) int local50 = arg3 - arg4;
		@Pc(58) int local58 = arg4 + arg2;
		for (@Pc(60) int local60 = local9; local60 <= local13; local60++) {
			@Pc(66) int[] local66 = Static582.anIntArrayArray69[local60];
			Static276.method3099(arg2, local66, arg0, local58);
			Static276.method3099(local50, local66, arg0, arg3);
		}
	}
}

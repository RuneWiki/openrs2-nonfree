import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static238 {

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "[I")
	public static final int[] anIntArray290 = new int[1000];

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(DB)V")
	public static void method3816(@OriginalArg(0) double arg0) {
		Static177.aClass25_1.method4297(Static576.aClass25_8);
		Static177.aClass25_1.method4301(0, 0, (int) arg0);
		Static535.aClass16_10.method8135(Static177.aClass25_1);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(II[[[BLclient!ha;IIIIIIIII)V")
	public static void method3817(@OriginalArg(1) int arg0, @OriginalArg(2) byte[][][] arg1, @OriginalArg(3) Class16 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg6 == 0 || arg9 == 0) {
			return;
		}
		if (arg6 == 9) {
			arg6 = 1;
			arg4 = arg4 + 1 & 0x3;
		}
		if (arg6 == 10) {
			arg4 = arg4 + 3 & 0x3;
			arg6 = 1;
		}
		if (arg6 == 11) {
			arg6 = 8;
			arg4 = arg4 + 3 & 0x3;
		}
		arg2.Q(arg3, arg11, arg0, arg5, arg10, arg8, arg1[arg6 - 1][arg4], arg9, arg7);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIILclient!wm;[[[BIBIIIIII)V", line = 5)
	public static void method58(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg5 == 0 || arg7 == 0) {
			return;
		}
		if (arg5 == 9) {
			arg9 = arg9 + 1 & 0x3;
			arg5 = 1;
		}
		if (arg5 == 10) {
			arg9 = arg9 + 3 & 0x3;
			arg5 = 1;
		}
		if (arg5 == 11) {
			arg9 = arg9 + 3 & 0x3;
			arg5 = 8;
		}
		arg3.method2902(arg1, arg2, arg8, arg11, arg6, arg10, arg4[arg5 - 1][arg9], arg7, arg0);
	}
}

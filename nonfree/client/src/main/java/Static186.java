import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static186 {

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIIIIIIILclient!qa;II[[[BI)V")
	public static void method2834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class109 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte[][][] arg11) {
		if (arg2 == 0 || arg9 == 0) {
			return;
		}
		if (arg2 == 9) {
			arg2 = 1;
			arg7 = arg7 + 1 & 0x3;
		}
		if (arg2 == 10) {
			arg7 = arg7 + 3 & 0x3;
			arg2 = 1;
		}
		if (arg2 == 11) {
			arg2 = 8;
			arg7 = arg7 + 3 & 0x3;
		}
		arg8.aa(arg10, arg1, arg3, arg6, arg4, arg0, arg11[arg2 - 1][arg7], arg9, arg5);
	}
}

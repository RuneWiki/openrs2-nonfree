import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static265 {

	@OriginalMember(owner = "client!ne", name = "z", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_99 = new Class253(99, -2);

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I[[[BZLclient!ya;IIIIIIIII)V")
	public static void method3583(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(3) Class51 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg9 == 0 || arg11 == 0) {
			return;
		}
		if (arg9 == 9) {
			arg4 = arg4 + 1 & 0x3;
			arg9 = 1;
		}
		if (arg9 == 10) {
			arg4 = arg4 + 3 & 0x3;
			arg9 = 1;
		}
		if (arg9 == 11) {
			arg9 = 8;
			arg4 = arg4 + 3 & 0x3;
		}
		arg2.DA(arg3, arg0, arg5, arg8, arg10, arg6, arg1[arg9 - 1][arg4], arg11, arg7);
	}
}

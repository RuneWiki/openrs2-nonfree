import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static426 {

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "Z")
	public static boolean aBoolean481;

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "[S")
	public static short[] aShortArray113;

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
	public static int anInt6882;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIBI[[[BIIILclient!ya;I)V")
	public static void method5652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[][][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class39 arg10, @OriginalArg(12) int arg11) {
		if (arg0 == 0 || arg7 == 0) {
			return;
		}
		if (arg0 == 9) {
			arg0 = 1;
			arg5 = arg5 + 1 & 0x3;
		}
		if (arg0 == 10) {
			arg0 = 1;
			arg5 = arg5 + 3 & 0x3;
		}
		if (arg0 == 11) {
			arg5 = arg5 + 3 & 0x3;
			arg0 = 8;
		}
		arg10.DA(arg3, arg8, arg4, arg11, arg1, arg9, arg6[arg0 - 1][arg5], arg7, arg2);
	}
}

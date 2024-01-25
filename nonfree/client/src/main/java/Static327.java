import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static327 {

	@OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
	public static int anInt5584;

	@OriginalMember(owner = "client!qh", name = "m", descriptor = "Lclient!bu;")
	public static final Class30 aClass30_9 = new Class30("WTI", 5);

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(B[[[BILclient!za;IIIIIIIII)V")
	public static void method4388(@OriginalArg(1) byte[][][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class34 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg4 == 0 || arg9 == 0) {
			return;
		}
		if (arg4 == 9) {
			arg4 = 1;
			arg7 = arg7 + 1 & 0x3;
		}
		if (arg4 == 10) {
			arg7 = arg7 + 3 & 0x3;
			arg4 = 1;
		}
		if (arg4 == 11) {
			arg4 = 8;
			arg7 = arg7 + 3 & 0x3;
		}
		arg2.K(arg3, arg6, arg11, arg10, arg1, arg8, arg0[arg4 - 1][arg7], arg9, arg5);
	}
}

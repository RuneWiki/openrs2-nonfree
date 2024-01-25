import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static112 {

	@OriginalMember(owner = "client!dk", name = "m", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_24 = new Class171(10, 4);

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIII[[[BIIILclient!ha;IIII)V")
	public static void method1725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[][][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class95 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg6 == 0 || arg2 == 0) {
			return;
		}
		if (arg6 == 9) {
			arg5 = arg5 + 1 & 0x3;
			arg6 = 1;
		}
		if (arg6 == 10) {
			arg5 = arg5 + 3 & 0x3;
			arg6 = 1;
		}
		if (arg6 == 11) {
			arg5 = arg5 + 3 & 0x3;
			arg6 = 8;
		}
		arg7.Q(arg9, arg11, arg1, arg0, arg10, arg8, arg3[arg6 - 1][arg5], arg2, arg4);
	}
}

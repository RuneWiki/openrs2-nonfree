import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static223 {

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_123 = new Class194(48, 5);

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIIIIILclient!ha;IIII[[[B)V")
	public static void method3860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class82 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) byte[][][] arg11) {
		if (arg9 == 0 || arg5 == 0) {
			return;
		}
		if (arg9 == 9) {
			arg6 = arg6 + 1 & 0x3;
			arg9 = 1;
		}
		if (arg9 == 10) {
			arg9 = 1;
			arg6 = arg6 + 3 & 0x3;
		}
		if (arg9 == 11) {
			arg9 = 8;
			arg6 = arg6 + 3 & 0x3;
		}
		arg7.Q(arg0, arg4, arg8, arg2, arg3, arg1, arg11[arg9 - 1][arg6], arg5, arg10);
	}
}

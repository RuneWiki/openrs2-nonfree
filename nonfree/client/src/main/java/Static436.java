import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static436 {

	@OriginalMember(owner = "client!vs", name = "q", descriptor = "Lclient!ui;")
	public static final Class248 aClass248_9 = new Class248("WTWIP", 3);

	@OriginalMember(owner = "client!vs", name = "v", descriptor = "I")
	public static int anInt7703 = 0;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(BIIILclient!za;IIII[[[BIII)V")
	public static void method5871(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class106 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[][][] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg9 == 0 || arg10 == 0) {
			return;
		}
		if (arg9 == 9) {
			arg5 = arg5 + 1 & 0x3;
			arg9 = 1;
		}
		if (arg9 == 10) {
			arg9 = 1;
			arg5 = arg5 + 3 & 0x3;
		}
		if (arg9 == 11) {
			arg9 = 8;
			arg5 = arg5 + 3 & 0x3;
		}
		arg3.K(arg1, arg6, arg11, arg7, arg2, arg0, arg8[arg9 - 1][arg5], arg10, arg4);
	}
}

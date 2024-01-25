import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lclient!ha;IBIII[[[BIIIIII)V")
	public static void method5909(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[][][] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg1 == 0 || arg7 == 0) {
			return;
		}
		if (arg1 == 9) {
			arg1 = 1;
			arg2 = arg2 + 1 & 0x3;
		}
		if (arg1 == 10) {
			arg1 = 1;
			arg2 = arg2 + 3 & 0x3;
		}
		if (arg1 == 11) {
			arg1 = 8;
			arg2 = arg2 + 3 & 0x3;
		}
		arg0.Q(arg11, arg6, arg10, arg4, arg8, arg3, arg5[arg1 - 1][arg2], arg7, arg9);
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(II[BZ)[B")
	public static byte[] method5910(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(23) byte[] local23 = new byte[32768];
		Static681.method2476(arg1, arg0, local23, 0, 32768);
		return local23;
	}

	@OriginalMember(owner = "client!nga", name = "i", descriptor = "(Z)J")
	public static long method5912() {
		return Static8.aClass96_1.method3591();
	}
}

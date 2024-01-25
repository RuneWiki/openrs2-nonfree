import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static265 {

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIBIIIIILclient!r;[[[BIII)V")
	public static void method4051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class31 arg7, @OriginalArg(9) byte[][][] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg0 == 0 || arg9 == 0) {
			return;
		}
		if (arg0 == 9) {
			arg0 = 1;
			arg1 = arg1 + 1 & 0x3;
		}
		if (arg0 == 10) {
			arg0 = 1;
			arg1 = arg1 + 3 & 0x3;
		}
		if (arg0 == 11) {
			arg1 = arg1 + 3 & 0x3;
			arg0 = 8;
		}
		arg7.IA(arg5, arg2, arg4, arg10, arg3, arg11, arg8[arg0 - 1][arg1], arg9, arg6);
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ZILclient!cw;II)V")
	public static void method4052(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub10 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg1.aClass3_Sub26_Sub1_1.method6826(arg2);
		arg1.aClass3_Sub26_Sub1_1.method6769(arg3);
		arg1.aClass3_Sub26_Sub1_1.method6820(arg0);
	}

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "(Z)I")
	public static int method4053() {
		return Static572.anInt9830++;
	}
}

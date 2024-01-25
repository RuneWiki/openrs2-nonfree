import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static326 {

	@OriginalMember(owner = "client!lia", name = "J", descriptor = "[I")
	public static int[] anIntArray366;

	@OriginalMember(owner = "client!lia", name = "M", descriptor = "I")
	public static int anInt5713;

	@OriginalMember(owner = "client!lia", name = "N", descriptor = "I")
	public static int anInt5714;

	@OriginalMember(owner = "client!lia", name = "R", descriptor = "I")
	public static int anInt5718;

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIIIIBI[[[BLclient!ha;IIII)V")
	public static void method4972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[][][] arg6, @OriginalArg(8) Class13 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg0 == 0 || arg4 == 0) {
			return;
		}
		if (arg0 == 9) {
			arg10 = arg10 + 1 & 0x3;
			arg0 = 1;
		}
		if (arg0 == 10) {
			arg10 = arg10 + 3 & 0x3;
			arg0 = 1;
		}
		if (arg0 == 11) {
			arg0 = 8;
			arg10 = arg10 + 3 & 0x3;
		}
		arg7.Q(arg1, arg5, arg3, arg9, arg8, arg11, arg6[arg0 - 1][arg10], arg4, arg2);
	}
}

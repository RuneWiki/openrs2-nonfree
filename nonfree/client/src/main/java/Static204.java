import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static204 {

	@OriginalMember(owner = "client!gu", name = "q", descriptor = "Lclient!uda;")
	public static Class361 aClass361_1;

	@OriginalMember(owner = "client!gu", name = "o", descriptor = "Lclient!mja;")
	public static final Class234 aClass234_3 = new Class234("game4", "Game 4", 3);

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lclient!ha;IIIIBII[[[BIIII)V")
	public static void method3080(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[][][] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg8 == 0 || arg4 == 0) {
			return;
		}
		if (arg8 == 9) {
			arg8 = 1;
			arg2 = arg2 + 1 & 0x3;
		}
		if (arg8 == 10) {
			arg8 = 1;
			arg2 = arg2 + 3 & 0x3;
		}
		if (arg8 == 11) {
			arg8 = 8;
			arg2 = arg2 + 3 & 0x3;
		}
		arg0.Q(arg6, arg9, arg5, arg10, arg11, arg3, arg7[arg8 - 1][arg2], arg4, arg1);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIBI)V")
	public static void method3081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static472.anInt7503 <= arg2 - arg3 && arg2 + arg3 <= Static257.anInt4172 && arg1 - arg3 >= Static73.anInt1542 && arg1 + arg3 <= Static527.anInt8177) {
			Static435.method6037(arg3, arg2, arg1, arg0);
		} else {
			Static56.method1301(arg0, arg2, arg1, arg3);
		}
	}
}

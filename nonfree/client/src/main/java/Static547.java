import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static547 {

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "[I")
	public static int[] anIntArray572;

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
	public static int anInt8736;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIZ)V")
	public static void method7284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 - arg1 >= Static469.anInt4270 && Static325.anInt5516 >= arg1 + arg3 && arg0 - arg1 >= Static395.anInt6904 && arg0 + arg1 <= Static561.anInt2703) {
			Static244.method3781(arg3, arg1, arg0, arg2);
		} else {
			Static195.method3276(arg0, arg3, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IBI)Z")
	public static boolean method7285(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZC)Z")
	public static boolean method7286(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}

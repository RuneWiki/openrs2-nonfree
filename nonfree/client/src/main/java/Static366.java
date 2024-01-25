import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static366 {

	@OriginalMember(owner = "client!sh", name = "i", descriptor = "[I")
	public static final int[] anIntArray539 = new int[2];

	@OriginalMember(owner = "client!sh", name = "u", descriptor = "I")
	public static int anInt6139 = -1;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIII)V")
	public static void method5135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 - arg3 >= Static81.anInt1574 && arg0 + arg3 <= Static99.anInt1808 && Static97.anInt1796 <= arg1 - arg3 && arg1 + arg3 <= Static85.anInt1636) {
			Static243.method3765(arg4, arg1, arg0, arg5, arg2, arg3);
		} else {
			Static403.method5491(arg2, arg5, arg1, arg3, arg4, arg0);
		}
	}
}

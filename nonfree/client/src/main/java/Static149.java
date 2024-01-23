import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static149 {

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
	public static int anInt3578;

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
	public static int anInt3580;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
	public static int anInt3577 = 0;

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
	public static int anInt3579 = 0;

	@OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
	public static int anInt3581 = 1;

	@OriginalMember(owner = "client!mk", name = "g", descriptor = "[I")
	public static int[] anIntArray270 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIZIIII)V")
	public static void method2691(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static83.anInt2246 = arg0;
		Static34.anInt969 = arg3;
		Static111.anInt2947 = arg4;
		Static259.anInt5472 = arg2;
		Static57.anInt1588 = arg5;
		if (arg1 && Static57.anInt1588 >= 100) {
			Static110.anInt2935 = Static111.anInt2947 * 128 + 64;
			Static174.anInt4003 = Static34.anInt969 * 128 + 64;
			Static109.anInt2904 = Static200.method3326(Static137.anInt3321, Static110.anInt2935, Static174.anInt4003) - Static83.anInt2246;
		}
		Static61.anInt1682 = 2;
	}
}

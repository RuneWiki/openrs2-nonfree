import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static199 {

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "[I")
	public static int[] anIntArray198;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIII)V")
	public static void method3319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 >= Static469.anInt4270 && arg0 <= Static325.anInt5516 && Static395.anInt6904 <= arg3 && arg1 <= Static561.anInt2703) {
			Static77.method1601(arg0, arg3, arg4, arg1, arg2);
		} else {
			Static253.method3898(arg3, arg4, arg2, arg1, arg0);
		}
	}
}

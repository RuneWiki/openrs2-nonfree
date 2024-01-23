import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static179 {

	@OriginalMember(owner = "client!rh", name = "sb", descriptor = "[I")
	public static int[] anIntArray682;

	@OriginalMember(owner = "client!rh", name = "wb", descriptor = "I")
	public static int anInt4190;

	@OriginalMember(owner = "client!rh", name = "qb", descriptor = "I")
	public static int anInt4185 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!rh", name = "rb", descriptor = "I")
	public static int anInt4186 = 0;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static80.method1339(arg1)) {
			Static36.method471(Static181.aClass64ArrayArray1[arg1], -1, arg6, arg5, arg0, arg2, arg4, arg3);
		}
	}
}

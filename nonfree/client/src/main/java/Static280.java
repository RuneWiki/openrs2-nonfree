import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static280 {

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "[I")
	public static final int[] anIntArray530 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!ln", name = "i", descriptor = "I")
	public static int anInt5243 = 0;

	@OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
	public static int anInt5244 = 0;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)Z")
	public static boolean method4538(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BIIIII)V")
	public static void method4539(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static358.anInt8908 <= arg1 && arg3 <= Static216.anInt4203 && Static99.anInt1988 <= arg4 && arg0 <= Static205.anInt4042) {
			Static33.method781(arg0, arg3, arg2, arg4, arg1);
		} else {
			Static365.method5430(arg4, arg1, arg2, arg0, arg3);
		}
	}
}

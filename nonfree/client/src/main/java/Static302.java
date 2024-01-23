import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static302 {

	@OriginalMember(owner = "client!w", name = "y", descriptor = "I")
	public static int anInt5682;

	@OriginalMember(owner = "client!w", name = "A", descriptor = "I")
	public static int anInt5684;

	@OriginalMember(owner = "client!w", name = "z", descriptor = "I")
	public static volatile int anInt5683 = 0;

	@OriginalMember(owner = "client!w", name = "B", descriptor = "[I")
	public static int[] anIntArray646 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!w", name = "G", descriptor = "[I")
	public static int[] anIntArray647 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 >= Static48.anInt902 && arg5 <= Static131.anInt2553 && Static156.anInt3086 <= arg6 && arg4 <= Static218.anInt4231) {
			Static16.method758(arg1, arg5, arg6, arg0, arg4, arg2, arg3);
		} else {
			Static142.method2191(arg4, arg3, arg2, arg1, arg0, arg5, arg6);
		}
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V")
	public static void method4604() {
		Static110.aClass4_Sub10_Sub1_1.method4687(156);
		Static110.aClass4_Sub10_Sub1_1.method4668(Static290.anInt5427);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static325 {

	@OriginalMember(owner = "client!mea", name = "H", descriptor = "I")
	public static int anInt5503;

	@OriginalMember(owner = "client!mea", name = "Q", descriptor = "I")
	public static int anInt5509;

	@OriginalMember(owner = "client!mea", name = "F", descriptor = "[I")
	public static final int[] anIntArray310 = new int[13];

	@OriginalMember(owner = "client!mea", name = "I", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_62 = new Class303(71, 4);

	@OriginalMember(owner = "client!mea", name = "Z", descriptor = "I")
	public static int anInt5516 = 100;

	@OriginalMember(owner = "client!mea", name = "gb", descriptor = "Z")
	public static final boolean aBoolean400 = false;

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method4707(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IZIIIIII)V")
	public static void method4708(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == arg6) {
			Static58.method1202(arg1, arg4, arg5, arg2, arg3, arg0);
		} else if (Static469.anInt4270 <= arg4 - arg1 && arg4 + arg1 <= anInt5516 && Static395.anInt6904 <= arg5 - arg6 && arg6 + arg5 <= Static561.anInt2703) {
			Static514.method6922(arg3, arg6, arg0, arg1, arg2, arg5, arg4);
		} else {
			Static232.method3628(arg5, arg3, arg2, arg4, arg0, arg1, arg6);
		}
	}
}

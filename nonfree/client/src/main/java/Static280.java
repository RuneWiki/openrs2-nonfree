import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static280 {

	@OriginalMember(owner = "client!lf", name = "A", descriptor = "I")
	public static int anInt5465;

	@OriginalMember(owner = "client!lf", name = "B", descriptor = "Lclient!nu;")
	public static Class214 aClass214_1;

	@OriginalMember(owner = "client!lf", name = "C", descriptor = "I")
	public static int anInt5466;

	@OriginalMember(owner = "client!lf", name = "z", descriptor = "[I")
	public static final int[] anIntArray392 = new int[4096];

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)Z")
	public static boolean method4570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIBIII)V")
	public static void method4572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static75.method1355(arg1, arg5, 0, arg0, arg3, arg2, arg4);
	}
}

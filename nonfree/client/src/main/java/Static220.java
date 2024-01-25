import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static220 {

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "Lclient!o;")
	public static Class13 aClass13_13;

	@OriginalMember(owner = "client!kt", name = "i", descriptor = "[I")
	public static final int[] anIntArray308 = new int[14];

	@OriginalMember(owner = "client!kt", name = "r", descriptor = "I")
	public static int anInt3626 = -1;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIIIZII)V")
	public static void method2912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static317.anInt6670 <= arg2 - arg1 && arg2 + arg1 <= Static215.anInt3546 && arg0 - arg1 >= Static219.anInt6125 && Static155.anInt2670 >= arg1 + arg0) {
			Static383.method4926(arg3, arg4, arg2, arg5, arg0, arg1);
		} else {
			Static74.method1089(arg5, arg0, arg4, arg3, arg1, arg2);
		}
	}
}

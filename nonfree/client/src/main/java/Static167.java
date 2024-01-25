import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static167 {

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
	public static int anInt3227 = -1;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIBIIII)V")
	public static void method2613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 >= Static331.anInt5894 && arg6 <= Static351.anInt6176 && Static75.anInt1858 <= arg4 && Static175.anInt3399 >= arg5) {
			Static190.method3003(arg2, arg1, arg3, arg6, arg0, arg5, arg4);
		} else {
			Static322.method4611(arg4, arg3, arg6, arg5, arg0, arg1, arg2);
		}
	}
}

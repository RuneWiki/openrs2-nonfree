import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static15 {

	@OriginalMember(owner = "client!ap", name = "j", descriptor = "I")
	public static int anInt315;

	@OriginalMember(owner = "client!ap", name = "o", descriptor = "[I")
	public static final int[] anIntArray52 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method288(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 >= Static163.anInt3234 && arg4 <= Static353.anInt6760 && Static163.anInt3234 <= arg5 && Static353.anInt6760 >= arg5 && arg2 >= Static163.anInt3234 && Static353.anInt6760 >= arg2 && Static163.anInt3234 <= arg1 && Static353.anInt6760 >= arg1 && arg7 >= Static75.anInt1447 && arg7 <= Static346.anInt6668 && Static75.anInt1447 <= arg0 && arg0 <= Static346.anInt6668 && Static75.anInt1447 <= arg8 && Static346.anInt6668 >= arg8 && arg3 >= Static75.anInt1447 && arg3 <= Static346.anInt6668) {
			Static84.method3938(arg3, arg2, arg1, arg5, arg0, arg7, arg4, arg6, arg8);
		} else {
			Static263.method4667(arg4, arg0, arg1, arg7, arg3, arg2, arg6, arg5, arg8);
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!ij;I)V")
	public static void method291(@OriginalArg(0) Class93 arg0) {
		Static259.aClass93_101 = arg0;
	}
}

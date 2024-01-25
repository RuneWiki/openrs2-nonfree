import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static68 {

	@OriginalMember(owner = "client!cm", name = "K", descriptor = "Z")
	public static boolean aBoolean123 = false;

	@OriginalMember(owner = "client!cm", name = "N", descriptor = "[I")
	public static final int[] anIntArray85 = new int[3];

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIBIIIIII)V")
	public static void method1123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static553.anInt9074 <= arg0 && Static249.anInt4668 >= arg0 && Static553.anInt9074 <= arg7 && Static249.anInt4668 >= arg7 && arg1 >= Static553.anInt9074 && Static249.anInt4668 >= arg1 && arg6 >= Static553.anInt9074 && arg6 <= Static249.anInt4668 && arg2 >= Static326.anInt6028 && Static80.anInt1738 >= arg2 && Static326.anInt6028 <= arg4 && Static80.anInt1738 >= arg4 && arg8 >= Static326.anInt6028 && arg8 <= Static80.anInt1738 && arg5 >= Static326.anInt6028 && arg5 <= Static80.anInt1738) {
			Static483.method6802(arg2, arg3, arg4, arg8, arg0, arg1, arg5, arg7, arg6);
		} else {
			Static384.method7170(arg2, arg4, arg6, arg7, arg3, arg1, arg5, arg8, arg0);
		}
	}
}

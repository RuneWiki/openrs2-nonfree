import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static657 {

	@OriginalMember(owner = "client!we", name = "K", descriptor = "I")
	public static int anInt10717;

	@OriginalMember(owner = "client!we", name = "I", descriptor = "[[I")
	public static final int[][] anIntArrayArray62 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIIII)V")
	public static void method8786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == arg1) {
			Static204.method3063(arg6, arg4, arg3, arg2, arg0, arg5);
		} else if (Static300.anInt5091 <= arg4 - arg3 && Static629.anInt10412 >= arg4 + arg3 && Static617.anInt6260 <= arg6 - arg1 && arg1 + arg6 <= Static229.anInt4089) {
			Static156.method2499(arg0, arg2, arg5, arg1, arg6, arg4, arg3);
		} else {
			Static326.method4648(arg3, arg1, arg0, arg5, arg2, arg4, arg6);
		}
	}
}

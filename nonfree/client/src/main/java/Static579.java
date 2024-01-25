import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static579 {

	@OriginalMember(owner = "client!uj", name = "H", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray7;

	@OriginalMember(owner = "client!uj", name = "E", descriptor = "[Lclient!vo;")
	public static final Class361[] aClass361Array2 = new Class361[14];

	@OriginalMember(owner = "client!uj", name = "F", descriptor = "[[I")
	public static final int[][] anIntArrayArray61 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method8208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static630.anInt10099 <= arg5 && Static16.anInt4339 >= arg5 && Static630.anInt10099 <= arg3 && Static16.anInt4339 >= arg3 && arg2 >= Static630.anInt10099 && Static16.anInt4339 >= arg2 && arg8 >= Static630.anInt10099 && arg8 <= Static16.anInt4339 && arg7 >= Static11.anInt9803 && Static149.anInt2949 >= arg7 && Static11.anInt9803 <= arg0 && Static149.anInt2949 >= arg0 && arg1 >= Static11.anInt9803 && arg1 <= Static149.anInt2949 && arg6 >= Static11.anInt9803 && arg6 <= Static149.anInt2949) {
			Static366.method5969(arg6, arg2, arg7, arg0, arg8, arg3, arg5, arg1, arg4);
		} else {
			Static27.method1047(arg1, arg5, arg7, arg6, arg0, arg3, arg2, arg4, arg8);
		}
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(II)I")
	public static int method8209(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}

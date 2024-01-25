import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static450 {

	@OriginalMember(owner = "client!pga", name = "k", descriptor = "I")
	public static int anInt10323;

	@OriginalMember(owner = "client!pga", name = "m", descriptor = "I")
	public static int anInt10325 = 999999;

	@OriginalMember(owner = "client!pga", name = "n", descriptor = "[I")
	public static final int[] anIntArray690 = new int[2048];

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(BI)I")
	public static int method8712(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method8715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 >= Static502.anInt8456 && arg5 <= Static153.anInt2554 && Static502.anInt8456 <= arg0 && arg0 <= Static153.anInt2554 && Static502.anInt8456 <= arg3 && arg3 <= Static153.anInt2554 && Static502.anInt8456 <= arg7 && arg7 <= Static153.anInt2554 && arg6 >= Static55.anInt4238 && Static292.anInt4921 >= arg6 && Static55.anInt4238 <= arg2 && Static292.anInt4921 >= arg2 && Static55.anInt4238 <= arg4 && Static292.anInt4921 >= arg4 && Static55.anInt4238 <= arg8 && Static292.anInt4921 >= arg8) {
			Static530.method7378(arg7, arg3, arg6, arg5, arg1, arg8, arg2, arg0, arg4);
		} else {
			Static233.method3511(arg2, arg1, arg6, arg4, arg0, arg3, arg5, arg8, arg7);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static241 {

	@OriginalMember(owner = "client!lo", name = "m", descriptor = "Lclient!gn;")
	public static Class97 aClass97_1;

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_62 = new Class142("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!lo", name = "j", descriptor = "[B")
	public static final byte[] aByteArray61 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!lo", name = "n", descriptor = "[I")
	public static final int[] anIntArray319 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 >= Static281.anInt4757 && Static457.anInt7264 >= arg1 && arg0 >= Static281.anInt4757 && Static457.anInt7264 >= arg0 && arg8 >= Static281.anInt4757 && arg8 <= Static457.anInt7264 && arg4 >= Static281.anInt4757 && Static457.anInt7264 >= arg4 && arg2 >= Static142.anInt2163 && arg2 <= Static182.anInt3402 && arg3 >= Static142.anInt2163 && arg3 <= Static182.anInt3402 && arg5 >= Static142.anInt2163 && Static182.anInt3402 >= arg5 && Static142.anInt2163 <= arg6 && arg6 <= Static182.anInt3402) {
			Static92.method3324(arg1, arg8, arg6, arg4, arg5, arg2, arg0, arg7, arg3);
		} else {
			Static73.method930(arg0, arg2, arg6, arg1, arg4, arg5, arg8, arg3, arg7);
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IBII)I")
	public static int method3467(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 <= arg0) {
			return arg2 >= arg0 ? arg0 : arg2;
		} else {
			return arg1;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static337 {

	@OriginalMember(owner = "client!rd", name = "S", descriptor = "[I")
	public static final int[] anIntArray528 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static414.anInt7043 <= arg5 && arg5 <= Static198.anInt3778 && Static414.anInt7043 <= arg2 && arg2 <= Static198.anInt3778 && arg6 >= Static414.anInt7043 && Static198.anInt3778 >= arg6 && Static414.anInt7043 <= arg8 && Static198.anInt3778 >= arg8 && arg0 >= Static388.anInt6740 && Static387.anInt6727 >= arg0 && arg3 >= Static388.anInt6740 && Static387.anInt6727 >= arg3 && Static388.anInt6740 <= arg1 && Static387.anInt6727 >= arg1 && Static388.anInt6740 <= arg7 && arg7 <= Static387.anInt6727) {
			Static258.method3601(arg6, arg2, arg8, arg7, arg1, arg5, arg0, arg4, arg3);
		} else {
			Static244.method3361(arg3, arg2, arg1, arg6, arg4, arg0, arg5, arg8, arg7);
		}
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(III)Z")
	public static boolean method4617(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static433.method5558(arg0, arg1) || Static314.method4329(arg0, arg1);
	}
}

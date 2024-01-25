import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static176 {

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "Lclient!ne;")
	public static Class146 aClass146_40;

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
	public static int anInt3874;

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "S")
	public static short aShort56 = 1;

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
	public static int anInt3875 = 0;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIII)V")
	public static void method3605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= arg3) {
			Static27.method690(arg3, Static104.anIntArrayArray31[arg0], arg2, arg1);
		} else {
			Static27.method690(arg1, Static104.anIntArrayArray31[arg0], arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (Static6.anInt136 <= arg3 && Static275.anInt5244 >= arg4 && arg0 >= Static32.anInt750 && Static112.anInt2485 >= arg5) {
			Static352.method5924(arg1, arg2, arg3, arg5, arg0, arg4, arg6);
		} else {
			Static47.method1150(arg0, arg2, arg6, arg5, arg4, arg1, arg3);
		}
	}
}

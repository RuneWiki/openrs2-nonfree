import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static150 {

	@OriginalMember(owner = "client!pf", name = "v", descriptor = "[I")
	public static int[] anIntArray434;

	@OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
	public static int anInt3350;

	@OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
	public static int anInt3351;

	@OriginalMember(owner = "client!pf", name = "z", descriptor = "I")
	public static int anInt3353;

	@OriginalMember(owner = "client!pf", name = "u", descriptor = "Z")
	public static boolean aBoolean185 = true;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2564(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 >= Static214.anInt4572 && Static130.anInt2847 >= arg4 && arg7 >= Static214.anInt4572 && Static130.anInt2847 >= arg7 && Static214.anInt4572 <= arg0 && arg0 <= Static130.anInt2847 && arg5 >= Static214.anInt4572 && arg5 <= Static130.anInt2847 && Static141.anInt3163 <= arg2 && Static200.anInt4273 >= arg2 && arg8 >= Static141.anInt3163 && arg8 <= Static200.anInt4273 && Static141.anInt3163 <= arg6 && arg6 <= Static200.anInt4273 && arg1 >= Static141.anInt3163 && Static200.anInt4273 >= arg1) {
			Static141.method2415(arg8, arg3, arg2, arg4, arg7, arg0, arg5, arg1, arg6);
		} else {
			Static146.method2500(arg4, arg0, arg1, arg6, arg7, arg3, arg5, arg8, arg2);
		}
	}
}

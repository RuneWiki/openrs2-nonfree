import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static458 {

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "[I")
	public static int[] anIntArray600;

	@OriginalMember(owner = "client!ss", name = "d", descriptor = "I")
	public static int anInt7886;

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "I")
	public static int anInt7887;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(III)Z")
	public static boolean method6385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(BIIIIIII)V")
	public static void method6387(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == arg3) {
			Static168.method5834(arg0, arg3, arg5, arg6, arg2, arg1);
		} else if (Static398.anInt7144 <= arg2 - arg3 && Static71.anInt4958 >= arg2 + arg3 && Static4.anInt6709 <= arg6 - arg4 && arg4 + arg6 <= Static492.anInt8451) {
			Static325.method5192(arg0, arg3, arg6, arg2, arg1, arg5, arg4);
		} else {
			Static154.method2822(arg1, arg3, arg2, arg4, arg0, arg5, arg6);
		}
	}
}

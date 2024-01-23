import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static179 {

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
	public static int anInt3613;

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
	public static int anInt3614;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "[Lclient!ja;")
	public static Class80[] aClass80Array1 = new Class80[6];

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
	public static int anInt3615 = 0;

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "[I")
	public static int[] anIntArray302 = new int[25];

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
	public static int anInt3616 = 0;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
	public static void method2932() {
		if (!Static162.method2605() && Static60.anInt1347 != Static222.anInt4467) {
			Static104.method1790(Static72.aClass13_Sub5_Sub1_1.anIntArray411[0], false, Static50.anInt1120, Static72.aClass13_Sub5_Sub1_1.anIntArray418[0], Static218.anInt4196, Static222.anInt4467, false);
		} else if (Static16.anInt364 != Static222.anInt4467 && Static57.method1073(Static222.anInt4467)) {
			Static16.anInt364 = Static222.anInt4467;
			Static141.method2264();
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIILclient!uk;IJIIII)Z")
	public static boolean method2933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class13 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static178.method2925(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static434 {

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "[I")
	public static int[] anIntArray528;

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
	public static int anInt7697;

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "[S")
	public static short[] aShortArray113 = new short[256];

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)Z")
	public static boolean method6300() {
		return Static445.anInt7975 == 0 ? Static387.aClass6_Sub4_Sub2_3.method734() : true;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIII)V")
	public static void method6304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 == arg2) {
			Static27.method690(arg1, arg4, arg3, arg0);
		} else if (arg3 - arg4 >= Static165.anInt3313 && arg4 + arg3 <= Static152.anInt3132 && Static172.anInt3442 <= arg0 - arg2 && arg2 + arg0 <= Static324.anInt5590) {
			Static263.method3999(arg2, arg3, arg4, arg0, arg1);
		} else {
			Static411.method6063(arg3, arg1, arg0, arg2, arg4);
		}
	}
}

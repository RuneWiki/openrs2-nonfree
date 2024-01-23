import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!wa", name = "O", descriptor = "[I")
	public static int[] anIntArray465;

	@OriginalMember(owner = "client!wa", name = "P", descriptor = "Lclient!hc;")
	public static Class51 aClass51_82;

	@OriginalMember(owner = "client!wa", name = "T", descriptor = "[Lclient!aa;")
	public static Class2[] aClass2Array2;

	@OriginalMember(owner = "client!wa", name = "N", descriptor = "[I")
	public static int[] anIntArray464 = new int[128];

	@OriginalMember(owner = "client!wa", name = "Q", descriptor = "Z")
	public static boolean aBoolean276 = false;

	@OriginalMember(owner = "client!wa", name = "R", descriptor = "I")
	public static int anInt5424 = -1;

	@OriginalMember(owner = "client!wa", name = "U", descriptor = "I")
	public static int anInt5426 = 0;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIBII)I")
	public static int method4132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg1 & 0x1) == 1) {
			@Pc(12) int local12 = arg5;
			arg5 = arg0;
			arg0 = local12;
		}
		@Pc(20) int local20 = arg3 & 0x3;
		if (local20 == 0) {
			return arg2;
		} else if (local20 == 1) {
			return arg4;
		} else if (local20 == 2) {
			return 8 - arg2 - arg5;
		} else {
			return 1 + 7 - arg0 - arg4;
		}
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(IIIIII)V")
	public static void method4133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 >= Static167.anInt3907 && Static150.anInt3860 >= arg1 && Static202.anInt4469 <= arg3 && Static94.anInt4237 >= arg4) {
			Static266.method4223(arg1, arg0, arg3, arg2, arg4);
		} else {
			Static262.method4183(arg0, arg3, arg4, arg1, arg2);
		}
	}
}

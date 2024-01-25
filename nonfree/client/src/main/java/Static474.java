import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	@OriginalMember(owner = "client!sca", name = "c", descriptor = "I")
	public static int anInt7705;

	@OriginalMember(owner = "client!sca", name = "e", descriptor = "I")
	public static int anInt7706;

	@OriginalMember(owner = "client!sca", name = "g", descriptor = "F")
	public static float aFloat157;

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "Lclient!cb;")
	public static final Class37 aClass37_3 = new Class37();

	@OriginalMember(owner = "client!sca", name = "d", descriptor = "Lclient!rg;")
	public static final Class285 aClass285_6 = new Class285();

	@OriginalMember(owner = "client!sca", name = "f", descriptor = "I")
	public static int anInt7707 = 0;

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIIIIII)V")
	public static void method6506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static110.anInt2597 <= arg4 && arg2 <= Static459.anInt7524 && arg3 >= Static385.anInt6630 && arg5 <= Static69.anInt1918) {
			if (arg1 == 1) {
				Static103.method2185(arg5, arg2, arg3, arg4, arg0);
			} else {
				Static440.method3639(arg3, arg4, arg5, arg0, arg2, arg1);
			}
		} else if (arg1 == 1) {
			Static80.method7504(arg5, arg4, arg0, arg2, arg3);
		} else {
			Static266.method4353(arg4, arg5, arg3, arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "()V")
	public static void method6507() {
		for (@Pc(1) int local1 = 0; local1 < Static488.aClass313Array1.length; local1++) {
			Static488.aClass313Array1[local1].method6675();
		}
		Static488.aClass313Array1 = null;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(II)I")
	public static int method6508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static466.aShortArrayArray83 == null ? 0 : Static466.aShortArrayArray83[arg0][arg1] & 0xFFFF;
	}
}

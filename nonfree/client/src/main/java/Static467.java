import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static467 {

	@OriginalMember(owner = "client!tj", name = "m", descriptor = "Lclient!rd;")
	public static Class41 aClass41_1;

	@OriginalMember(owner = "client!tj", name = "z", descriptor = "[I")
	public static int[] anIntArray715;

	@OriginalMember(owner = "client!tj", name = "E", descriptor = "I")
	public static int anInt8424;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method6978(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 < arg0 + arg6 && arg0 < arg1 + arg5) {
			return arg2 < arg3 + arg4 && arg4 < arg7 + arg2;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V")
	public static void method6980() {
		@Pc(5) int local5 = 0;
		if (Static7.aClass3_Sub15_Sub1_1.method6943(Static382.anInt7091)) {
			local5 = 55;
		}
		if (!Static7.aClass3_Sub15_Sub1_1.aBoolean602) {
			local5 |= 0x40;
		}
		Static401.method6118(local5);
		Static454.aClass298_3.method7189(local5);
		Static99.aClass96_7.method2498(local5);
		Static345.aClass154_1.method4158(local5);
		Static17.aClass231_2.method5902(local5);
		Static170.method3249(local5);
		Static492.method7173(local5);
		Static518.method1674(local5);
		Static533.method5633(local5);
		Static318.method4381();
	}
}

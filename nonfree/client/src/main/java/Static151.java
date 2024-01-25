import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!fj", name = "t", descriptor = "F")
	public static float aFloat64;

	@OriginalMember(owner = "client!fj", name = "v", descriptor = "[I")
	public static final int[] anIntArray282 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)Z")
	public static boolean method2389(@OriginalArg(1) int arg0) {
		return arg0 == 10 || arg0 == 11 || arg0 == 12;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!faa;BII)V")
	public static void method2390(@OriginalArg(0) Class97 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static165.aClass97_8 != null || Static266.aBoolean351 || (arg0 == null || Static479.method6668(arg0) == null)) {
			return;
		}
		Static165.aClass97_8 = arg0;
		Static580.aClass97_26 = Static479.method6668(arg0);
		Static301.aBoolean383 = false;
		Static63.anInt1087 = arg2;
		Static237.anInt4306 = 0;
		Static403.anInt7295 = arg1;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IBII)V")
	public static void method2393(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = Static58.aClass6_Sub17_Sub1_1.anInt9287 * arg2 >> 8;
		if (arg0 == -1 && !Static396.aBoolean490) {
			Static259.method3990();
		} else if (arg0 != -1 && (arg0 != Static175.anInt3168 || !Static110.method1700()) && local14 != 0 && !Static396.aBoolean490) {
			Static21.method322(Static262.aClass248_36, arg1, local14, arg0);
		}
		Static175.anInt3168 = arg0;
	}
}

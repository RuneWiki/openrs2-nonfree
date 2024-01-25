import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
	public static int anInt32;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)Z")
	public static boolean method53(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZ)V")
	public static void method57(@OriginalArg(1) boolean arg0) {
		if (Static466.aClass276_1 == null) {
			Static262.method4306();
		}
		if (arg0) {
			Static466.aClass276_1.method6054();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIII)V")
	public static void method60(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static189.aClass4_Sub2_Sub1_1.anInt9298 != 0 && arg0 != 0 && Static406.anInt7043 < 50 && arg3 != -1) {
			Static479.aClass22Array1[Static406.anInt7043++] = new Class22((byte) 1, arg3, arg0, arg2, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)Lclient!ub;")
	public static Class4_Sub48 method61() {
		if (Static392.aClass124_60 == null || Static269.aClass331_1 == null) {
			return null;
		}
		Static269.aClass331_1.method7400(Static392.aClass124_60);
		@Pc(23) Class4_Sub48 local23 = (Class4_Sub48) Static269.aClass331_1.method7399();
		if (local23 == null) {
			return null;
		} else {
			@Pc(33) Class86 local33 = Static392.aClass337_4.method7441(local23.anInt8895);
			return local33 != null && local33.aBoolean219 && local33.method2406(Static392.anInterface1_2) ? local23 : Static447.method6308();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
	public static int anInt7555;

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
	public static int anInt7557 = 0;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIII)V")
	public static void method6547(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg1 * Static96.aClass6_Sub22_7.aClass29_Sub5_2.method1502() >> 8;
		if (arg0 == -1 && !Static416.aBoolean483) {
			Static536.method7428();
		} else if (arg0 != -1 && (arg0 != Static278.anInt9800 || !Static551.method7234()) && local12 != 0 && !Static416.aBoolean483) {
			Static473.method6969(Static365.aClass8_98, arg2, local12, arg0);
			Static189.method2689();
		}
		if (arg0 != Static278.anInt9800) {
			Static262.aClass6_Sub8_Sub4_8 = null;
		}
		Static278.anInt9800 = arg0;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)Z")
	public static boolean method6548(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static14.method452(arg0, arg1) | Static541.method5288(arg1, arg0) | Static411.method6181(arg1, arg0)) & Static653.method8885(arg0, arg1);
	}
}

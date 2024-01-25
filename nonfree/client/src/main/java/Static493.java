import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!tb", name = "m", descriptor = "Lclient!ki;")
	public static Class183 aClass183_55;

	@OriginalMember(owner = "client!tb", name = "r", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_133 = new Class276(37, 8);

	@OriginalMember(owner = "client!tb", name = "v", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_134 = new Class276(59, 12);

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method7479(@OriginalArg(1) String arg0) {
		for (@Pc(5) int local5 = 0; local5 < Static11.aStringArray1.length; local5++) {
			if (Static11.aStringArray1[local5].equalsIgnoreCase(arg0)) {
				return local5;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
	public static void method7482() {
		if (Static546.aClass15_16.method5292()) {
			Static546.aClass15_16.method5348(Static545.aCanvas14);
			Static120.method2388();
			Static546.aClass15_16.method5286(Static545.aCanvas14);
			Static546.aClass15_16.method5319(Static545.aCanvas14);
		} else {
			Static63.method1592(Static275.anInt5823);
		}
		Static210.method3686();
	}
}

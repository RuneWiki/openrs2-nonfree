import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_955 = Static118.method2249("cookieprefix");

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_956 = Static118.method2249("m");

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_957 = Static118.method2249("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!oc;I)I")
	public static int method1052(@OriginalArg(0) Class65 arg0) {
		return arg0.method2482() + 1;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)Lclient!oc;")
	public static Class65 method1055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return Static165.aClass65_2213;
		} else if (local8 < -6) {
			return Static161.aClass65_2161;
		} else if (local8 < -3) {
			return Static135.aClass65_1872;
		} else if (local8 < 0) {
			return Static16.aClass65_323;
		} else if (local8 > 9) {
			return Static193.aClass65_2483;
		} else if (local8 > 6) {
			return Static22.aClass65_494;
		} else if (local8 > 3) {
			return Static195.aClass65_2509;
		} else if (local8 > 0) {
			return Static112.aClass65_1583;
		} else {
			return Static188.aClass65_2454;
		}
	}
}

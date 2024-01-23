import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static210 {

	@OriginalMember(owner = "client!ui", name = "kb", descriptor = "Lclient!hc;")
	public static Class19 aClass19_1;

	@OriginalMember(owner = "client!ui", name = "Z", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1553 = Static64.method1101("Untersuchen");

	@OriginalMember(owner = "client!ui", name = "db", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1554 = Static64.method1101("sl_stars");

	@OriginalMember(owner = "client!ui", name = "hb", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1555 = Static64.method1101("glow3:");

	@OriginalMember(owner = "client!ui", name = "mb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1556 = aClass51_1555;

	@OriginalMember(owner = "client!ui", name = "nb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1557 = aClass51_1555;

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(BI)I")
	public static int method3489(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "(II)I")
	public static int method3490(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}

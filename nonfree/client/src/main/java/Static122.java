import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!va", name = "j", descriptor = "[I")
	public static int[] anIntArray383;

	@OriginalMember(owner = "client!va", name = "e", descriptor = "I")
	public static int anInt3177 = 0;

	@OriginalMember(owner = "client!va", name = "f", descriptor = "I")
	public static int anInt3178 = 0;

	@OriginalMember(owner = "client!va", name = "h", descriptor = "Lclient!m;")
	public static Class3_Sub11 aClass3_Sub11_35 = new Class3_Sub11(8);

	@OriginalMember(owner = "client!va", name = "i", descriptor = "Lclient!he;")
	public static Class26 aClass26_1728 = Static6.method100("Versteckt");

	@OriginalMember(owner = "client!va", name = "l", descriptor = "Lclient!he;")
	public static Class26 aClass26_1729 = Static6.method100("::rect_debug");

	@OriginalMember(owner = "client!va", name = "o", descriptor = "Lclient!he;")
	private static Class26 aClass26_1731 = Static6.method100("Prepared visibility map");

	@OriginalMember(owner = "client!va", name = "m", descriptor = "Lclient!he;")
	public static Class26 aClass26_1730 = aClass26_1731;

	@OriginalMember(owner = "client!va", name = "p", descriptor = "Lclient!he;")
	public static Class26 aClass26_1732 = Static6.method100("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
	public static void method2169() {
		anIntArray383 = null;
		aClass26_1728 = null;
		aClass26_1732 = null;
		aClass26_1731 = null;
		aClass26_1729 = null;
		aClass3_Sub11_35 = null;
		aClass26_1730 = null;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)Lclient!he;")
	public static Class26 method2170(@OriginalArg(1) int arg0) {
		return Static124.method2187(false, arg0);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BI)Lclient!pc;")
	public static Class3_Sub1_Sub14 method2171(@OriginalArg(1) int arg0) {
		@Pc(15) Class3_Sub1_Sub14 local15 = (Class3_Sub1_Sub14) Static55.aClass66_15.method1970((long) arg0);
		if (local15 != null) {
			return local15;
		}
		local15 = Static6.method95(arg0, Static33.aClass16_48, Static71.aClass16_85);
		if (local15 != null) {
			Static55.aClass66_15.method1969((long) arg0, local15);
		}
		return local15;
	}
}

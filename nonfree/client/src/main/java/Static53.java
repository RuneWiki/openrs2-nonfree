import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "Lclient!ti;")
	public static Class1_Sub14 aClass1_Sub14_1 = new Class1_Sub14(1);

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
	public static int anInt930 = 0;

	@OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
	public static int anInt934 = 0;

	@OriginalMember(owner = "client!cn", name = "i", descriptor = "Z")
	public static boolean aBoolean76 = false;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method782(@OriginalArg(0) String arg0) {
		Static87.aString67 = arg0;
		if (Static403.aClass42_6.anApplet1 == null) {
			return;
		}
		try {
			@Pc(18) String local18 = Static403.aClass42_6.anApplet1.getParameter("cookieprefix");
			@Pc(23) String local23 = Static403.aClass42_6.anApplet1.getParameter("cookiehost");
			@Pc(38) String local38 = local18 + "settings=" + arg0 + "; version=1; path=/; domain=" + local23;
			if (arg0.length() == 0) {
				local38 = local38 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local38 = local38 + "; Expires=" + Static41.method547(Static107.method1707() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static455.method621(Static403.aClass42_6.anApplet1, "document.cookie=\"" + local38 + "\"");
		} catch (@Pc(89) Throwable local89) {
		}
	}
}

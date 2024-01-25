import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!p", name = "k", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_88 = new Class93("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!p", name = "o", descriptor = "[Lclient!kb;")
	public static final Class107[] aClass107Array2 = new Class107[14];

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
	public static void method4099() {
		Static324.aClass119_198.method3312();
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(Z)V")
	public static void method4106() {
		Static326.aClass31Array17 = null;
		Static193.aClass37_2 = null;
		Static355.aClass31Array19 = null;
		Static65.aClass31Array3 = null;
		Static56.aClass37_1 = null;
		Static262.aClass31Array16 = null;
		Static148.aClass31Array10 = null;
		Static338.aClass31Array18 = null;
		Static299.aClass37_5 = null;
		Static144.aClass31Array9 = null;
		Static38.aClass31Array2 = null;
		Static209.aClass31Array15 = null;
		Static105.aClass31Array5 = null;
		Static87.aClass31Array4 = null;
		Static125.aClass31Array6 = null;
		Static170.aClass31Array11 = null;
		Static253.aClass31_141 = null;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IB)V")
	public static void method4108() {
		@Pc(1) Class119 local1 = Static304.aClass119_185;
		synchronized (Static304.aClass119_185) {
			Static304.aClass119_185.method3315(5);
		}
		local1 = Static286.aClass119_172;
		synchronized (Static286.aClass119_172) {
			Static286.aClass119_172.method3315(5);
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4110(@OriginalArg(0) String arg0) {
		Static331.aString28 = arg0;
		if (Static177.aClass168_2.anApplet1 == null) {
			return;
		}
		try {
			@Pc(14) String local14 = Static177.aClass168_2.anApplet1.getParameter("cookieprefix");
			@Pc(19) String local19 = Static177.aClass168_2.anApplet1.getParameter("cookiehost");
			@Pc(34) String local34 = local14 + "settings=" + arg0 + "; version=1; path=/; domain=" + local19;
			if (arg0.length() == 0) {
				local34 = local34 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local34 = local34 + "; Expires=" + Static327.method5748(Static51.method1197() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static358.method1(Static177.aClass168_2.anApplet1, "document.cookie=\"" + local34 + "\"");
		} catch (@Pc(91) Throwable local91) {
		}
	}
}

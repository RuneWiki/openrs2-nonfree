import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!re", name = "a", descriptor = "Lclient!rm;")
	public static final Class178 aClass178_8 = new Class178(64);

	@OriginalMember(owner = "client!re", name = "d", descriptor = "Z")
	public static boolean aBoolean348 = true;

	@OriginalMember(owner = "client!re", name = "g", descriptor = "I")
	public static int anInt5254 = -2;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4683(@OriginalArg(0) String arg0) {
		Static323.aString38 = arg0;
		if (Static105.aClass15_2.anApplet1 == null) {
			return;
		}
		try {
			@Pc(14) String local14 = Static105.aClass15_2.anApplet1.getParameter("cookieprefix");
			@Pc(19) String local19 = Static105.aClass15_2.anApplet1.getParameter("cookiehost");
			@Pc(34) String local34 = local14 + "settings=" + arg0 + "; version=1; path=/; domain=" + local19;
			if (arg0.length() == 0) {
				local34 = local34 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local34 = local34 + "; Expires=" + Static324.method5569(Static168.method3300() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static356.method172(Static105.aClass15_2.anApplet1, "document.cookie=\"" + local34 + "\"");
		} catch (@Pc(91) Throwable local91) {
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(Ljava/lang/String;I)V")
	public static void method4684(@OriginalArg(0) String arg0) {
		Static352.method5922(0, 0, "", arg0, "");
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(B)I")
	public static int method4686() {
		if (Static65.aBoolean376) {
			return 0;
		} else if (Static96.method2208()) {
			return Static29.aBoolean312 ? 2 : 1;
		} else {
			return 1;
		}
	}
}

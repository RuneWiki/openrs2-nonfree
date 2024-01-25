import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!cu", name = "n", descriptor = "[F")
	public static final float[] aFloatArray113 = new float[16];

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method7774(@OriginalArg(1) String arg0) {
		Static568.aString87 = arg0;
		if (Static31.anApplet1 == null) {
			return;
		}
		try {
			@Pc(17) String local17 = Static31.anApplet1.getParameter("cookieprefix");
			@Pc(21) String local21 = Static31.anApplet1.getParameter("cookiehost");
			@Pc(36) String local36 = local17 + "settings=" + arg0 + "; version=1; path=/; domain=" + local21;
			if (arg0.length() == 0) {
				local36 = local36 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local36 = local36 + "; Expires=" + Static159.method2949(Static158.method2936() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static600.method2616("document.cookie=\"" + local36 + "\"", Static31.anApplet1);
		} catch (@Pc(87) Throwable local87) {
		}
	}
}

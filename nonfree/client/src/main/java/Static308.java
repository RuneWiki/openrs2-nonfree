import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "[Lclient!mv;")
	public static final Class1_Sub3_Sub3_Sub1[] aClass1_Sub3_Sub3_Sub1Array1 = new Class1_Sub3_Sub3_Sub1[2048];

	@OriginalMember(owner = "client!pk", name = "j", descriptor = "[I")
	public static final int[] anIntArray418 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!pk", name = "q", descriptor = "[Z")
	public static final boolean[] aBooleanArray18 = new boolean[100];

	@OriginalMember(owner = "client!pk", name = "y", descriptor = "[I")
	public static final int[] anIntArray419 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!pk", name = "B", descriptor = "S")
	public static short aShort165 = 32767;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4522(@OriginalArg(0) String arg0) {
		Static16.aString3 = arg0;
		if (Static295.aClass103_5.anApplet1 == null) {
			return;
		}
		try {
			@Pc(19) String local19 = Static295.aClass103_5.anApplet1.getParameter("cookieprefix");
			@Pc(24) String local24 = Static295.aClass103_5.anApplet1.getParameter("cookiehost");
			@Pc(39) String local39 = local19 + "settings=" + arg0 + "; version=1; path=/; domain=" + local24;
			if (arg0.length() == 0) {
				local39 = local39 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local39 = local39 + "; Expires=" + Static70.method1312(Static150.method2672() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static462.method4869(Static295.aClass103_5.anApplet1, "document.cookie=\"" + local39 + "\"");
		} catch (@Pc(87) Throwable local87) {
		}
	}
}

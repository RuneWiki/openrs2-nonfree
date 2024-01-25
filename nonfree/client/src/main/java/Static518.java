import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!uj", name = "s", descriptor = "Lclient!jo;")
	public static Class168 aClass168_119;

	@OriginalMember(owner = "client!uj", name = "u", descriptor = "F")
	public static float aFloat191;

	@OriginalMember(owner = "client!uj", name = "l", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_164 = new Class254(56, -2);

	@OriginalMember(owner = "client!uj", name = "t", descriptor = "I")
	public static int anInt9045 = -1;

	@OriginalMember(owner = "client!uj", name = "v", descriptor = "[Z")
	public static final boolean[] aBooleanArray39 = new boolean[5];

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIII)V")
	public static void method7590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14;
		if (arg0 >= arg3) {
			for (local14 = arg3; local14 < arg0; local14++) {
				Static183.anIntArrayArray26[local14][arg2] = arg1;
			}
		} else {
			for (local14 = arg0; local14 < arg3; local14++) {
				Static183.anIntArrayArray26[local14][arg2] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method7592(@OriginalArg(1) String arg0) {
		Static166.aString38 = arg0;
		if (Static87.anApplet1 == null) {
			return;
		}
		try {
			@Pc(16) String local16 = Static87.anApplet1.getParameter("cookieprefix");
			@Pc(20) String local20 = Static87.anApplet1.getParameter("cookiehost");
			@Pc(35) String local35 = local16 + "settings=" + arg0 + "; version=1; path=/; domain=" + local20;
			if (arg0.length() == 0) {
				local35 = local35 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local35 = local35 + "; Expires=" + Static48.method6729(Static174.method3502() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static590.method5696("document.cookie=\"" + local35 + "\"", Static87.anApplet1);
		} catch (@Pc(90) Throwable local90) {
		}
	}
}

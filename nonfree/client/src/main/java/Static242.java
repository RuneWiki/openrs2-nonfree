import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "Lclient!in;")
	public static Class157 aClass157_120;

	@OriginalMember(owner = "client!iia", name = "j", descriptor = "I")
	public static int anInt5255;

	@OriginalMember(owner = "client!iia", name = "h", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_48 = new Class94(5, 3);

	@OriginalMember(owner = "client!iia", name = "i", descriptor = "[I")
	public static final int[] anIntArray275 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(B)Lclient!bo;")
	public static Class40 method4501() {
		return Static358.method6065();
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method4502(@OriginalArg(0) String arg0) {
		Static26.aString7 = arg0;
		if (Static334.anApplet2 == null) {
			return;
		}
		try {
			@Pc(18) String local18 = Static334.anApplet2.getParameter("cookieprefix");
			@Pc(22) String local22 = Static334.anApplet2.getParameter("cookiehost");
			@Pc(37) String local37 = local18 + "settings=" + arg0 + "; version=1; path=/; domain=" + local22;
			if (arg0.length() == 0) {
				local37 = local37 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local37 = local37 + "; Expires=" + Static338.method5845(Static277.method5091() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static646.method1786(Static334.anApplet2, "document.cookie=\"" + local37 + "\"");
		} catch (@Pc(88) Throwable local88) {
		}
	}

	@OriginalMember(owner = "client!iia", name = "b", descriptor = "(I)V")
	public static void method4503() {
		for (@Pc(3) int local3 = 0; local3 < Static548.anInt9814; local3++) {
			@Pc(14) int local14 = Static126.method2964(Static605.anInt10972 + local3, Static548.anInt9814) * Static228.anInt5033;
			for (@Pc(16) int local16 = 0; local16 < Static228.anInt5033; local16++) {
				@Pc(28) int local28 = Static126.method2964(local16 + Static90.anInt2649, Static228.anInt5033) + local14;
				if (Static579.anInt10337 == Static380.anIntArray468[local28]) {
					Static326.anInterface14Array1[local28].method8986(0, 0, Static267.anInt5684, Static11.anInt6559, local16 * Static267.anInt5684, Static11.anInt6559 * local3);
				}
			}
		}
	}
}

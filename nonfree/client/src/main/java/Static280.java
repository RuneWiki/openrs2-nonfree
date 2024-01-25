import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!q", name = "m", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_174 = new Class48(29, 3);

	@OriginalMember(owner = "client!q", name = "r", descriptor = "[I")
	public static final int[] anIntArray590 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!q", name = "t", descriptor = "I")
	public static int anInt4876 = 0;

	@OriginalMember(owner = "client!q", name = "u", descriptor = "Z")
	public static boolean aBoolean471 = false;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4287(@OriginalArg(0) String arg0) {
		Static348.aString68 = arg0;
		if (Static341.aClass162_5.anApplet1 == null) {
			return;
		}
		try {
			@Pc(14) String local14 = Static341.aClass162_5.anApplet1.getParameter("cookieprefix");
			@Pc(19) String local19 = Static341.aClass162_5.anApplet1.getParameter("cookiehost");
			@Pc(42) String local42 = local14 + "settings=" + arg0 + "; version=1; path=/; domain=" + local19;
			if (arg0.length() == 0) {
				local42 = local42 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local42 = local42 + "; Expires=" + Static263.method4052(Static378.method5293() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static396.method1249("document.cookie=\"" + local42 + "\"", Static341.aClass162_5.anApplet1);
		} catch (@Pc(94) Throwable local94) {
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIB)Ljava/lang/String;")
	public static String method4288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg0 - arg1;
		if (local13 < -9) {
			return "<col=ff0000>";
		} else if (local13 < -6) {
			return "<col=ff3000>";
		} else if (local13 < -3) {
			return "<col=ff7000>";
		} else if (local13 < 0) {
			return "<col=ffb000>";
		} else if (local13 > 9) {
			return "<col=00ff00>";
		} else if (local13 > 6) {
			return "<col=40ff00>";
		} else if (local13 > 3) {
			return "<col=80ff00>";
		} else if (local13 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!nq", name = "w", descriptor = "I")
	public static int anInt8863;

	@OriginalMember(owner = "client!nq", name = "x", descriptor = "[Z")
	public static final boolean[] aBooleanArray26 = new boolean[100];

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)V")
	public static void method7299(@OriginalArg(0) int arg0) {
		@Pc(10) Class8_Sub52 local10 = (Class8_Sub52) Static16.aClass253_3.method6594((long) arg0);
		if (local10 != null) {
			local10.aClass2_Sub1_1.method4234();
			Static470.method7024(local10.aBoolean756, local10.anInt10660);
			local10.method8640();
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method7302(@OriginalArg(1) String arg0) {
		Static254.aString54 = arg0;
		if (Static152.anApplet1 == null) {
			return;
		}
		try {
			@Pc(17) String local17 = Static152.anApplet1.getParameter("cookieprefix");
			@Pc(21) String local21 = Static152.anApplet1.getParameter("cookiehost");
			@Pc(36) String local36 = local17 + "settings=" + arg0 + "; version=1; path=/; domain=" + local21;
			if (arg0.length() == 0) {
				local36 = local36 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local36 = local36 + "; Expires=" + Static513.method7383(Static342.method5463() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static646.method1436(Static152.anApplet1, "document.cookie=\"" + local36 + "\"");
		} catch (@Pc(84) Throwable local84) {
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)I")
	public static int method7303() {
		@Pc(14) int local14 = Static88.aClass296_2.method7183();
		if (Static73.aClass296Array1.length - 1 > local14) {
			Static88.aClass296_2 = Static73.aClass296Array1[local14 + 1];
		}
		return 100;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static664 {

	@OriginalMember(owner = "client!wj", name = "k", descriptor = "[I")
	public static final int[] anIntArray820 = new int[3];

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method9224(@OriginalArg(0) String arg0) {
		Static273.aString55 = arg0;
		if (Static645.anApplet2 == null) {
			return;
		}
		try {
			@Pc(16) String local16 = Static645.anApplet2.getParameter("cookieprefix");
			@Pc(20) String local20 = Static645.anApplet2.getParameter("cookiehost");
			@Pc(35) String local35 = local16 + "settings=" + arg0 + "; version=1; path=/; domain=" + local20;
			if (arg0.length() == 0) {
				local35 = local35 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local35 = local35 + "; Expires=" + Static483.method7144(Static521.method7499() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static682.method5124("document.cookie=\"" + local35 + "\"", Static645.anApplet2);
		} catch (@Pc(85) Throwable local85) {
		}
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)Lclient!eo;")
	public static Class14_Sub19 method9230() {
		return Static34.anInt915 == 0 ? new Class14_Sub19() : Static628.aClass14_Sub19Array1[--Static34.anInt915];
	}
}

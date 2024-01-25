import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!og", name = "e", descriptor = "I")
	public static int anInt7300;

	@OriginalMember(owner = "client!og", name = "j", descriptor = "Lclient!aw;")
	public static Class20 aClass20_3;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method6082(@OriginalArg(0) String arg0) {
		Static64.aString16 = arg0;
		if (Static253.anApplet3 == null) {
			return;
		}
		try {
			@Pc(16) String local16 = Static253.anApplet3.getParameter("cookieprefix");
			@Pc(20) String local20 = Static253.anApplet3.getParameter("cookiehost");
			@Pc(35) String local35 = local16 + "settings=" + arg0 + "; version=1; path=/; domain=" + local20;
			if (arg0.length() == 0) {
				local35 = local35 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local35 = local35 + "; Expires=" + Static598.method8436(Static376.method6088() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static603.method4978("document.cookie=\"" + local35 + "\"", Static253.anApplet3);
		} catch (@Pc(85) Throwable local85) {
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIB)I")
	public static int method6083(@OriginalArg(1) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(43) int local43 = (arg0 & 0x7F) * 96 >> 7;
			if (local43 < 2) {
				local43 = 2;
			} else if (local43 > 126) {
				local43 = 126;
			}
			return (arg0 & 0xFF80) + local43;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZIILclient!pe;)Lclient!fca;")
	public static Class96 method6085(@OriginalArg(1) int arg0, @OriginalArg(3) Class254 arg1) {
		@Pc(14) byte[] local14 = arg1.method6401(arg0, 0);
		return local14 == null ? null : new Class96(local14);
	}
}

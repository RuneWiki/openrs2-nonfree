import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static544 {

	@OriginalMember(owner = "client!se", name = "o", descriptor = "F")
	public static float aFloat195;

	@OriginalMember(owner = "client!se", name = "p", descriptor = "Lclient!vl;")
	public static Class371 aClass371_6;

	@OriginalMember(owner = "client!se", name = "v", descriptor = "I")
	public static int anInt8963;

	@OriginalMember(owner = "client!se", name = "u", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_178 = new Class180(38, -2);

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(III)Z")
	public static boolean method7820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((arg0 & 0x2000) != 0 | Static568.method8029(arg0, arg1) | Static127.method2387(arg0, arg1)) & Static618.method8719(arg0, arg1);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method7821(@OriginalArg(1) String arg0) {
		Static303.aString49 = arg0;
		if (Static124.anApplet1 == null) {
			return;
		}
		try {
			@Pc(17) String local17 = Static124.anApplet1.getParameter("cookieprefix");
			@Pc(21) String local21 = Static124.anApplet1.getParameter("cookiehost");
			@Pc(36) String local36 = local17 + "settings=" + arg0 + "; version=1; path=/; domain=" + local21;
			if (arg0.length() == 0) {
				local36 = local36 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local36 = local36 + "; Expires=" + Static348.method5201(Static524.method7320() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static686.method8107("document.cookie=\"" + local36 + "\"", Static124.anApplet1);
		} catch (@Pc(84) Throwable local84) {
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([SBI)[S")
	public static short[] method7823(@OriginalArg(0) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) short[] local11 = new short[arg1];
		Static684.method5328(arg0, 0, local11, 0, arg1);
		return local11;
	}
}

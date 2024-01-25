import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BLjava/io/File;)[B")
	public static byte[] method6215(@OriginalArg(1) File arg0) {
		return Static588.method7591(arg0, (int) arg0.length());
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBI)V")
	public static void method6216(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static610.method6274()) {
			return;
		}
		if (Static66.anInt1579 != arg0) {
			Static441.aString88 = "";
		}
		Static565.anInt8601 = arg1;
		Static66.anInt1579 = arg0;
		Static336.method4832(6);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method6217(@OriginalArg(1) String arg0) {
		Static65.aString113 = arg0;
		if (Static41.anApplet1 == null) {
			return;
		}
		try {
			@Pc(15) String local15 = Static41.anApplet1.getParameter("cookieprefix");
			@Pc(21) String local21 = Static41.anApplet1.getParameter("cookiehost");
			@Pc(40) String local40 = local15 + "settings=" + arg0 + "; version=1; path=/; domain=" + local21;
			if (arg0.length() == 0) {
				local40 = local40 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local40 = local40 + "; Expires=" + Static461.method6256(Static517.method6965() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static728.method687(Static41.anApplet1, "document.cookie=\"" + local40 + "\"");
		} catch (@Pc(97) Throwable local97) {
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(BII)Z")
	public static boolean method6218(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static541.method7183(arg1, arg0) & Static493.method6689(arg0, arg1);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IF[BFIIFIIIFLclient!dfa;F)V")
	public static void method6219(@OriginalArg(1) float arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) float arg2, @OriginalArg(6) float arg3, @OriginalArg(8) int arg4, @OriginalArg(10) float arg5, @OriginalArg(11) Class75 arg6, @OriginalArg(12) float arg7) {
		for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
			Static15.method522(arg4, arg3, arg5, local7, arg6, arg0, arg1, arg2, arg7);
			arg4 += 16384;
		}
	}
}

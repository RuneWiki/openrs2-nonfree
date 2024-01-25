import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!eea", name = "l", descriptor = "I")
	public static int anInt2538;

	@OriginalMember(owner = "client!eea", name = "g", descriptor = "I")
	public static int anInt2533 = -1;

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method2234(@OriginalArg(0) String arg0) {
		Static360.aString78 = arg0;
		if (Static339.anApplet2 == null) {
			return;
		}
		try {
			@Pc(12) String local12 = Static339.anApplet2.getParameter("cookieprefix");
			@Pc(21) String local21 = Static339.anApplet2.getParameter("cookiehost");
			@Pc(36) String local36 = local12 + "settings=" + arg0 + "; version=1; path=/; domain=" + local21;
			if (arg0.length() == 0) {
				local36 = local36 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local36 = local36 + "; Expires=" + Static562.method7403(Static15.method380() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static680.method796("document.cookie=\"" + local36 + "\"", Static339.anApplet2);
		} catch (@Pc(87) Throwable local87) {
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(III)Z")
	public static boolean method2235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIIILclient!ec;I)Ljava/awt/Frame;")
	public static Frame method2237(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class92 arg2, @OriginalArg(5) int arg3) {
		if (!arg2.method1869()) {
			return null;
		}
		@Pc(18) Class304[] local18 = Static539.method6915(arg2);
		if (local18 == null) {
			return null;
		}
		@Pc(24) boolean local24 = false;
		for (@Pc(26) int local26 = 0; local26 < local18.length; local26++) {
			if (arg1 == local18[local26].anInt8105 && local18[local26].anInt8107 == arg3 && (!local24 || arg0 < local18[local26].anInt8110)) {
				arg0 = local18[local26].anInt8110;
				local24 = true;
			}
		}
		if (!local24) {
			return null;
		}
		@Pc(95) Class338 local95 = arg2.method1883(arg1, arg0, arg3);
		while (local95.anInt9321 == 0) {
			Static26.method592(10L);
		}
		@Pc(107) Frame local107 = (Frame) local95.anObject18;
		if (local107 == null) {
			return null;
		} else if (local95.anInt9321 == 2) {
			Static28.method626(local107, arg2);
			return null;
		} else {
			return local107;
		}
	}
}

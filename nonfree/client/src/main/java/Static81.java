import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "[Lclient!l;")
	public static Class17[] aClass17Array2;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "Lclient!di;")
	public static final Class54 aClass54_26 = new Class54(34, -1);

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)I")
	public static int method1475() {
		@Pc(7) Class49 local7 = Static33.aClass49_1;
		@Pc(9) boolean local9 = false;
		if (Static399.anInt6653 != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local7 = Static455.method4474(0, null, null, local18, 0);
			local9 = true;
		}
		@Pc(35) long local35 = Static21.method458();
		for (@Pc(37) int local37 = 0; local37 < 10000; local37++) {
			local7.method4482();
		}
		@Pc(64) int local64 = (int) (Static21.method458() - local35);
		local7.method4480(0, 100, -16777216, 0, 100);
		if (local9) {
			local7.method4437();
		}
		return local64;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IJ)V")
	public static void method1477(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static131.method2232(arg0 - 1L);
			Static131.method2232(1L);
		} else {
			Static131.method2232(arg0);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method1478(@OriginalArg(0) String arg0) {
		Static92.aString37 = arg0;
		if (Static43.aClass59_5.anApplet1 == null) {
			return;
		}
		try {
			@Pc(19) String local19 = Static43.aClass59_5.anApplet1.getParameter("cookieprefix");
			@Pc(24) String local24 = Static43.aClass59_5.anApplet1.getParameter("cookiehost");
			@Pc(39) String local39 = local19 + "settings=" + arg0 + "; version=1; path=/; domain=" + local24;
			if (arg0.length() == 0) {
				local39 = local39 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local39 = local39 + "; Expires=" + Static123.method2169(Static21.method458() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static463.method4345("document.cookie=\"" + local39 + "\"", Static43.aClass59_5.anApplet1);
		} catch (@Pc(88) Throwable local88) {
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!uv", name = "q", descriptor = "F")
	public static float aFloat210;

	@OriginalMember(owner = "client!uv", name = "i", descriptor = "[I")
	public static final int[] anIntArray666 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!uv", name = "l", descriptor = "I")
	public static int anInt10366 = -1;

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IB)V")
	public static void method8656(@OriginalArg(0) int arg0) {
		Static248.anInt5350 = -1;
		Static536.anInt9677 = arg0;
		Static248.anInt5350 = -1;
		Static245.method4529();
	}

	@OriginalMember(owner = "client!uv", name = "f", descriptor = "(I)V")
	public static void method8658() {
		if (Static334.anApplet2 == null) {
			return;
		}
		try {
			@Pc(18) String local18 = Static334.anApplet2.getParameter("cookiehost");
			@Pc(26) int local26 = (int) (Static277.method5091() / 86400000L) - 11745;
			@Pc(38) String local38 = "usrdob=" + local26 + "; version=1; path=/; domain=" + local18;
			Static646.method1786(Static334.anApplet2, "document.cookie=\"" + local38 + "\"");
		} catch (@Pc(52) Throwable local52) {
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZIZ)V")
	public static void method8659(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static223.anInt4977--;
			if (Static223.anInt4977 == 0) {
				Static195.anIntArray226 = null;
			}
		}
		if (!arg1) {
			return;
		}
		Static567.anInt10181--;
		if (Static567.anInt10181 == 0) {
			Static373.anIntArray464 = null;
			return;
		}
	}
}

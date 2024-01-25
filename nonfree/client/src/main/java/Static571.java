import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static571 {

	@OriginalMember(owner = "client!uea", name = "l", descriptor = "Lclient!bga;")
	public static Class31 aClass31_1;

	@OriginalMember(owner = "client!uea", name = "r", descriptor = "Lclient!la;")
	public static Class196 aClass196_119;

	@OriginalMember(owner = "client!uea", name = "h", descriptor = "Lclient!rf;")
	public static final Class292 aClass292_5 = new Class292();

	@OriginalMember(owner = "client!uea", name = "k", descriptor = "[Lclient!sn;")
	public static final Class312[] aClass312Array1 = new Class312[100];

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(I)Z")
	public static boolean method8137() {
		if (Static515.aBoolean636) {
			try {
				if ((Boolean) Static646.method3052(Static504.anApplet2, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(22) Throwable local22) {
			}
		}
		return true;
	}
}

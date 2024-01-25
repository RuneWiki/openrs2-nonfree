import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
	public static int anInt8710 = -1;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)Z")
	public static boolean method7165() {
		if (Static48.aBoolean51) {
			try {
				if ((Boolean) Static549.method683(Static375.aClass71_3.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZLclient!vc;)I")
	public static int method7169(@OriginalArg(1) Class301 arg0) {
		if (Static19.aClass301_1 == arg0) {
			return 9216;
		} else if (Static156.aClass301_2 == arg0) {
			return 34065;
		} else if (Static230.aClass301_4 == arg0) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}
}

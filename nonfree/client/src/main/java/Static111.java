import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Z")
	public static boolean method1660() {
		if (Static590.aBoolean730) {
			try {
				if ((Boolean) Static602.method6577("showingVideoAd", Static562.anApplet2)) {
					return false;
				}
				return true;
			} catch (@Pc(22) Throwable local22) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)Z")
	public static boolean method1661(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x10000) != 0 | Static421.method6463(arg1, arg0) || Static128.method2156(arg0, arg1)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static282.method4203(arg0, arg1);
		}
	}
}

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ad", name = "G", descriptor = "I")
	public static int anInt120 = 0;

	@OriginalMember(owner = "client!ad", name = "H", descriptor = "[I")
	public static final int[] anIntArray11 = new int[2];

	@OriginalMember(owner = "client!ad", name = "J", descriptor = "I")
	public static final int anInt122 = 1406;

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)Z")
	public static boolean method92() {
		if (Static566.aBoolean734) {
			try {
				if ((Boolean) Static602.method2417(Static590.anApplet2, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(17) Throwable local17) {
			}
		}
		return true;
	}
}

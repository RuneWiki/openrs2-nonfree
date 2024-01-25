import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!nba", name = "w", descriptor = "Lclient!rc;")
	public static Class285 aClass285_10;

	@OriginalMember(owner = "client!nba", name = "e", descriptor = "Lclient!sf;")
	public static final Class307 aClass307_1 = new Class307();

	@OriginalMember(owner = "client!nba", name = "u", descriptor = "[Z")
	public static final boolean[] aBooleanArray17 = new boolean[8];

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method5612(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static121.aClass84_33.method2710(Static372.anInt7083) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static121.aClass84_35.method2710(Static372.anInt7083) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}
}

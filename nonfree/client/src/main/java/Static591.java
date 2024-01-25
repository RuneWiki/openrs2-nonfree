import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static591 {

	@OriginalMember(owner = "client!ub", name = "Qb", descriptor = "Z")
	public static boolean aBoolean753 = false;

	@OriginalMember(owner = "client!ub", name = "Hb", descriptor = "I")
	public static int anInt9944 = 0;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(ZI)Ljava/lang/String;")
	public static String method8543(@OriginalArg(1) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(22) int local22 = local8.length() - 3; local22 > 0; local22 -= 3) {
			local8 = local8.substring(0, local22) + "," + local8.substring(local22);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static582.aClass335_34.method8349(Static323.anInt5795) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static582.aClass335_36.method8349(Static323.anInt5795) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}
}

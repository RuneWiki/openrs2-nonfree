import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method9120(@OriginalArg(1) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(21) int local21 = local8.length() - 3; local21 > 0; local21 -= 3) {
			local8 = local8.substring(0, local21) + "," + local8.substring(local21);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static430.aClass257_32.method5699(Static456.anInt7118) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static430.aClass257_34.method5699(Static456.anInt7118) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}
}

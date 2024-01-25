import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
	public static int anInt7737;

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
	public static int anInt7739;

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
	public static int anInt7731 = -1;

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
	public static int anInt7732 = 0;

	@OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
	public static int anInt7738 = 0;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method6251(@OriginalArg(1) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(18) int local18 = local8.length() - 3; local18 > 0; local18 -= 3) {
			local8 = local8.substring(0, local18) + "," + local8.substring(local18);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static229.aClass159_35.method2776(Static261.anInt4297) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static229.aClass159_37.method2776(Static261.anInt4297) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}
}

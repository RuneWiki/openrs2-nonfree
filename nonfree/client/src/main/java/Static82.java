import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!du", name = "c", descriptor = "I")
	public static int anInt3899;

	@OriginalMember(owner = "client!du", name = "f", descriptor = "Lclient!mn;")
	public static Class171 aClass171_50;

	@OriginalMember(owner = "client!du", name = "o", descriptor = "[I")
	public static int[] anIntArray354;

	@OriginalMember(owner = "client!du", name = "b", descriptor = "Z")
	public static boolean aBoolean260 = true;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method3172(@OriginalArg(1) int arg0) {
		@Pc(13) String local13 = Integer.toString(arg0);
		for (@Pc(18) int local18 = local13.length() - 3; local18 > 0; local18 -= 3) {
			local13 = local13.substring(0, local18) + "," + local13.substring(local18);
		}
		if (local13.length() > 9) {
			return " <col=00ff80>" + local13.substring(0, local13.length() - 8) + Static388.aClass231_113.method5261(Static80.anInt6195) + " (" + local13 + ")</col>";
		} else if (local13.length() > 6) {
			return " <col=ffffff>" + local13.substring(0, local13.length() - 4) + Static99.aClass231_33.method5261(Static80.anInt6195) + " (" + local13 + ")</col>";
		} else {
			return " <col=ffff00>" + local13 + "</col>";
		}
	}
}

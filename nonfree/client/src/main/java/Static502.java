import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!tg", name = "w", descriptor = "[Lclient!an;")
	public static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_97 = new Class230(82, 18);

	@OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
	public static int anInt9330 = 0;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method7569(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(9) int local9 = 0; local9 < Static403.anInt7927; local9++) {
			if (arg0.equalsIgnoreCase(Static197.aStringArray16[local9])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static199.aStringArray18[local9])) {
				return true;
			}
		}
		return false;
	}
}

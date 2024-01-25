import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bha", name = "o", descriptor = "Lclient!pea;")
	public static Class283 aClass283_1;

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method701(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < Static62.anInt1053; local12++) {
			if (arg0.equalsIgnoreCase(Static300.aStringArray27[local12])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static600.aStringArray40[local12])) {
				return true;
			}
		}
		return false;
	}
}

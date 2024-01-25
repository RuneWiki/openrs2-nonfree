import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
	public static int anInt7305;

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
	public static int anInt7306;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "J")
	public static long aLong206 = -1L;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method6124(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(18) int local18 = 0; local18 < Static81.anInt1768; local18++) {
			if (arg0.equalsIgnoreCase(Static461.aStringArray144[local18])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static408.aStringArray133[local18])) {
				return true;
			}
		}
		return false;
	}
}

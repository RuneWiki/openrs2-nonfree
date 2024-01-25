import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_20 = new Class27(20, 8);

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "Lclient!s;")
	public static final Class217 aClass217_31 = new Class217(107, -2);

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "[I")
	public static final int[] anIntArray69 = new int[1000];

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "[I")
	public static final int[] anIntArray70 = new int[256];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean method837(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static107.anInt2161; local16++) {
			if (arg0.equalsIgnoreCase(Static321.aStringArray35[local16])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static225.aStringArray57[local16])) {
				return true;
			}
		}
		return false;
	}
}

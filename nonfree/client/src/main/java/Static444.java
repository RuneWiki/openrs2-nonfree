import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public static boolean method8130(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static264.anInt4921; local16++) {
			if (arg0.equalsIgnoreCase(Static340.aStringArray35[local16])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static505.aStringArray49[local16])) {
				return true;
			}
		}
		return false;
	}
}

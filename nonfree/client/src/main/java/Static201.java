import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!hba", name = "C", descriptor = "I")
	public static int anInt3961;

	@OriginalMember(owner = "client!hba", name = "B", descriptor = "I")
	public static int anInt3960 = 0;

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public static boolean method3498(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static222.anInt4237; local16++) {
			if (arg0.equalsIgnoreCase(Static236.aStringArray17[local16])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static145.aStringArray9[local16])) {
				return true;
			}
		}
		return false;
	}
}

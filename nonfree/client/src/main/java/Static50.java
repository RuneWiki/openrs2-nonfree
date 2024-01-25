import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
	public static int anInt8645 = -1;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IZ)I")
	public static int method6874(@OriginalArg(1) boolean arg0) {
		if (Static98.anIntArray146 == null) {
			return 0;
		} else if (arg0 || Static564.aClass118Array1 == null) {
			@Pc(20) int local20 = 0;
			for (@Pc(22) int local22 = 0; local22 < Static98.anIntArray146.length; local22++) {
				@Pc(28) int local28 = Static98.anIntArray146[local22];
				if (Static585.aClass248_57.method5804(local28)) {
					local20++;
				}
				if (Static85.aClass248_14.method5804(local28)) {
					local20++;
				}
			}
			return local20;
		} else {
			return Static98.anIntArray146.length * 2;
		}
	}
}

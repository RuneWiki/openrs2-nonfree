import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!mo", name = "hb", descriptor = "J")
	public static long aLong153;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZI)Lclient!paa;")
	public static Class261 method4826(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static559.aClass261ArrayArray2[local7] == null || Static559.aClass261ArrayArray2[local7][local16] == null) {
			@Pc(30) boolean local30 = Static221.method3025(local7);
			if (!local30) {
				return null;
			}
		}
		return Static559.aClass261ArrayArray2[local7][local16];
	}
}

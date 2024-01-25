import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!dea", name = "c", descriptor = "I")
	public static int anInt1607;

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "[I")
	public static int[] anIntArray88;

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(IB)C")
	public static char method1448(@OriginalArg(1) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(55) char local55 = Static135.aCharArray1[local7 - 128];
			if (local55 == '\u0000') {
				local55 = '?';
			}
			local7 = local55;
		}
		return (char) local7;
	}
}

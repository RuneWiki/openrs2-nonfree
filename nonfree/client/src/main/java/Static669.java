import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static669 {

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(IB)C")
	public static char method8682(@OriginalArg(1) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local12, 16) + " provided");
		}
		if (local12 >= 128 && local12 < 160) {
			@Pc(46) char local46 = Static66.aCharArray1[local12 - 128];
			if (local46 == '\u0000') {
				local46 = '?';
			}
			local12 = local46;
		}
		return (char) local12;
	}
}

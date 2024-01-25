import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!ew", name = "z", descriptor = "[I")
	public static final int[] anIntArray116 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IB)C")
	public static char method2636(@OriginalArg(1) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(48) char local48 = Static349.aCharArray7[local7 - 128];
			if (local48 == '\u0000') {
				local48 = '?';
			}
			local7 = local48;
		}
		return (char) local7;
	}
}

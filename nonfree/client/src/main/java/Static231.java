import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!io", name = "a", descriptor = "[I")
	public static final int[] anIntArray212 = new int[] { 7500, 500 };

	@OriginalMember(owner = "client!io", name = "c", descriptor = "I")
	public static int anInt4053 = 0;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BB)C")
	public static char method3591(@OriginalArg(1) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(46) char local46 = Static361.aCharArray16[local7 - 128];
			if (local46 == '\u0000') {
				local46 = '?';
			}
			local7 = local46;
		}
		return (char) local7;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!no", name = "b", descriptor = "I")
	public static int anInt4123;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BB)C")
	public static char method3660(@OriginalArg(0) byte arg0) {
		@Pc(14) int local14 = arg0 & 0xFF;
		if (local14 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local14, 16) + " provided");
		}
		if (local14 >= 128 && local14 < 160) {
			@Pc(43) char local43 = Static367.aCharArray6[local14 - 128];
			if (local43 == '\u0000') {
				local43 = '?';
			}
			local14 = local43;
		}
		return (char) local14;
	}
}

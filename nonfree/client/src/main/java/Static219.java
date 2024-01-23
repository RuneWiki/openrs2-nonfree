import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!qb", name = "S", descriptor = "Lclient!fh;")
	public static Class58 aClass58_82;

	@OriginalMember(owner = "client!qb", name = "W", descriptor = "I")
	public static int anInt4261;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZB)C")
	public static char method3559(@OriginalArg(1) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(47) char local47 = Static257.aCharArray3[local7 - 128];
			if (local47 == '\u0000') {
				local47 = '?';
			}
			local7 = local47;
		}
		return (char) local7;
	}
}

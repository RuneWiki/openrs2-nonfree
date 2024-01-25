import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
	public static int anInt8431;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "Z")
	public static boolean aBoolean605 = false;

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "Z")
	public static boolean aBoolean606 = false;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(BI)C")
	public static char method6803(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(47) char local47 = Static395.aCharArray7[local7 - 128];
			if (local47 == '\u0000') {
				local47 = '?';
			}
			local7 = local47;
		}
		return (char) local7;
	}
}

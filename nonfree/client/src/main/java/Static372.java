import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_100 = new Class194(46, 3);

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "S")
	public static short aShort91 = 32767;

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
	public static int anInt6084 = 0;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BB)C")
	public static char method4863(@OriginalArg(1) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local12, 16) + " provided");
		}
		if (local12 >= 128 && local12 < 160) {
			@Pc(41) char local41 = Static319.aCharArray6[local12 - 128];
			if (local41 == '\u0000') {
				local41 = '?';
			}
			local12 = local41;
		}
		return (char) local12;
	}
}

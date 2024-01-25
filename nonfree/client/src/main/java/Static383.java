import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!mu", name = "l", descriptor = "Lclient!o;")
	public static Class259 aClass259_4;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(BB)C")
	public static char method5912(@OriginalArg(1) byte arg0) {
		@Pc(14) int local14 = arg0 & 0xFF;
		if (local14 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local14, 16) + " provided");
		}
		if (local14 >= 128 && local14 < 160) {
			@Pc(55) char local55 = Static211.aCharArray7[local14 - 128];
			if (local55 == '\u0000') {
				local55 = '?';
			}
			local14 = local55;
		}
		return (char) local14;
	}
}

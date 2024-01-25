import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!maa", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!maa", name = "k", descriptor = "F")
	public static float aFloat157;

	@OriginalMember(owner = "client!maa", name = "j", descriptor = "Lclient!gca;")
	public static final Class111 aClass111_34 = new Class111();

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(IB)C")
	public static char method4655(@OriginalArg(1) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(47) char local47 = Static309.aCharArray7[local7 - 128];
			if (local47 == '\u0000') {
				local47 = '?';
			}
			local7 = local47;
		}
		return (char) local7;
	}

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "(IB)I")
	public static int method4657(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}

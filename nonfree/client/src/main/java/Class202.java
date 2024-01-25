import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class202 {

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "[I")
	public static final int[] anIntArray277 = new int[120];

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "[C")
	public static final char[] aCharArray3;

	static {
		@Pc(4) int local4 = 0;
		@Pc(6) int local6;
		@Pc(11) int local11;
		for (local6 = 0; local6 < 120; local6++) {
			local11 = local6 + 1;
			@Pc(24) int local24 = (int) (Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D + (double) local11);
			local4 += local24;
			anIntArray277[local6] = local4 / 4;
		}
		aCharArray3 = new char[64];
		for (local4 = 0; local4 < 26; local4++) {
			aCharArray3[local4] = (char) (local4 + 65);
		}
		for (local6 = 26; local6 < 52; local6++) {
			aCharArray3[local6] = (char) (local6 + 97 - 26);
		}
		for (local11 = 52; local11 < 62; local11++) {
			aCharArray3[local11] = (char) (local11 + 48 - 52);
		}
		aCharArray3[63] = '/';
		aCharArray3[62] = '+';
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "[I")
	public static final int[] anIntArray526 = new int[25];

	@OriginalMember(owner = "client!rl", name = "t", descriptor = "[I")
	public static final int[] anIntArray527 = new int[14];

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "([BIII)Ljava/lang/String;")
	public static String method7058(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) char[] local6 = new char[arg1];
		@Pc(8) int local8 = 0;
		for (@Pc(19) int local19 = 0; local19 < arg1; local19++) {
			@Pc(28) int local28 = arg0[arg2 + local19] & 0xFF;
			if (local28 != 0) {
				if (local28 >= 128 && local28 < 160) {
					@Pc(46) char local46 = Static397.aCharArray6[local28 - 128];
					if (local46 == '\u0000') {
						local46 = '?';
					}
					local28 = local46;
				}
				local6[local8++] = (char) local28;
			}
		}
		return new String(local6, 0, local8);
	}
}

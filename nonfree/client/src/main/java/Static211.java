import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!i", name = "n", descriptor = "[Lclient!ot;")
	public static Class241[] aClass241Array4;

	@OriginalMember(owner = "client!i", name = "m", descriptor = "I")
	public static int anInt9770 = 0;

	@OriginalMember(owner = "client!i", name = "p", descriptor = "[I")
	public static int[] anIntArray842 = new int[1];

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(III[B)Ljava/lang/String;")
	public static String method8131(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg0];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0; local12++) {
			@Pc(22) int local22 = arg2[local12 + arg1] & 0xFF;
			if (local22 != 0) {
				if (local22 >= 128 && local22 < 160) {
					@Pc(41) char local41 = Static454.aCharArray8[local22 - 128];
					if (local41 == '\u0000') {
						local41 = '?';
					}
					local22 = local41;
				}
				local8[local10++] = (char) local22;
			}
		}
		return new String(local8, 0, local10);
	}
}

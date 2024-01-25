import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!fea", name = "w", descriptor = "I")
	public static int anInt4003 = 0;

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IBI[B)Ljava/lang/String;")
	public static String method3234(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(13) char[] local13 = new char[arg1];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg1; local17++) {
			@Pc(28) int local28 = arg2[arg0 + local17] & 0xFF;
			if (local28 != 0) {
				if (local28 >= 128 && local28 < 160) {
					@Pc(44) char local44 = Static539.aCharArray7[local28 - 128];
					if (local44 == '\u0000') {
						local44 = '?';
					}
					local28 = local44;
				}
				local13[local15++] = (char) local28;
			}
		}
		return new String(local13, 0, local15);
	}
}

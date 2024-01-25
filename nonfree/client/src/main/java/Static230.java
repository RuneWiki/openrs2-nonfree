import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "S")
	public static short aShort31 = 256;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIZ[B)Ljava/lang/String;")
	public static String method3015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(13) char[] local13 = new char[arg0];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg0; local17++) {
			@Pc(27) int local27 = arg2[local17 + arg1] & 0xFF;
			if (local27 != 0) {
				if (local27 >= 128 && local27 < 160) {
					@Pc(45) char local45 = Static243.aCharArray2[local27 - 128];
					if (local45 == '\u0000') {
						local45 = '?';
					}
					local27 = local45;
				}
				local13[local15++] = (char) local27;
			}
		}
		return new String(local13, 0, local15);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bf", name = "s", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2;

	@OriginalMember(owner = "client!bf", name = "t", descriptor = "[[B")
	public static byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString4 = "";

	@OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
	public static int anInt437 = -1;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB[BI)Ljava/lang/String;")
	public static String method357(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(13) char[] local13 = new char[arg0];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg0; local17++) {
			@Pc(27) int local27 = arg1[local17 + arg2] & 0xFF;
			if (local27 != 0) {
				if (local27 >= 128 && local27 < 160) {
					@Pc(48) char local48 = Static99.aCharArray3[local27 - 128];
					if (local48 == '\u0000') {
						local48 = '?';
					}
					local27 = local48;
				}
				local13[local15++] = (char) local27;
			}
		}
		return new String(local13, 0, local15);
	}
}

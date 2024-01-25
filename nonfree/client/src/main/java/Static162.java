import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "Z")
	public static boolean aBoolean224;

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "[Z")
	public static boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
	public static int anInt3333;

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "[I")
	public static final int[] anIntArray242 = new int[1000];

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "[I")
	public static final int[] anIntArray243 = new int[32];

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
	public static String method3074(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg0];
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg0; local17++) {
			@Pc(27) int local27 = arg1[arg2 + local17] & 0xFF;
			if (local27 != 0) {
				if (local27 >= 128 && local27 < 160) {
					@Pc(48) char local48 = Static246.aCharArray46[local27 - 128];
					if (local48 == '\u0000') {
						local48 = '?';
					}
					local27 = local48;
				}
				local8[local10++] = (char) local27;
			}
		}
		return new String(local8, 0, local10);
	}
}

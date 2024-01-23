import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!qj", name = "Y", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray10;

	@OriginalMember(owner = "client!qj", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString143 = "flash1:";

	@OriginalMember(owner = "client!qj", name = "R", descriptor = "S")
	public static short aShort36 = 205;

	@OriginalMember(owner = "client!qj", name = "T", descriptor = "[I")
	public static int[] anIntArray513 = new int[128];

	@OriginalMember(owner = "client!qj", name = "U", descriptor = "[I")
	public static int[] anIntArray514 = new int[100];

	@OriginalMember(owner = "client!qj", name = "W", descriptor = "I")
	public static int anInt4478 = 10;

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(BI)C")
	public static char method3483(@OriginalArg(0) byte arg0) {
		@Pc(10) int local10 = arg0 & 0xFF;
		if (local10 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local10, 16) + " provided");
		}
		if (local10 >= 128 && local10 < 160) {
			@Pc(51) char local51 = Static119.aCharArray16[local10 - 128];
			if (local51 == '\u0000') {
				local51 = '?';
			}
			local10 = local51;
		}
		return (char) local10;
	}
}

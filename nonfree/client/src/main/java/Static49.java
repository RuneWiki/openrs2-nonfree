import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString79 = "You can't add yourself to your own friend list.";

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "[I")
	public static int[] anIntArray107 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "([BIII)I")
	public static int method986(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = arg1; local10 < arg2; local10++) {
			local8 = local8 >>> 8 ^ Class1_Sub29.anIntArray448[(arg0[local10] ^ local8) & 0xFF];
		}
		return ~local8;
	}
}

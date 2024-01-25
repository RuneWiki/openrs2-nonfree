import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!qp", name = "p", descriptor = "I")
	public static int anInt7351 = 0;

	@OriginalMember(owner = "client!qp", name = "v", descriptor = "I")
	public static int anInt7355 = 0;

	@OriginalMember(owner = "client!qp", name = "U", descriptor = "I")
	public static int anInt7368 = 0;

	@OriginalMember(owner = "client!qp", name = "Fb", descriptor = "[I")
	public static final int[] anIntArray461 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 };

	@OriginalMember(owner = "client!qp", name = "Ob", descriptor = "J")
	public static long aLong209 = 0L;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "([BLjava/lang/String;BI)I")
	public static int method6173(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = arg1.length();
		@Pc(15) int local15 = arg2;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			@Pc(23) char local23 = arg1.charAt(local17);
			if (local23 <= '\u007f') {
				arg0[local15++] = (byte) local23;
			} else if (local23 <= '\u07ff') {
				arg0[local15++] = (byte) (local23 >> 6 | 0xC0);
				arg0[local15++] = (byte) (local23 & 0x3F | 0x80);
			} else {
				arg0[local15++] = (byte) (local23 >> 12 | 0xE0);
				arg0[local15++] = (byte) (local23 >> 6 & 0x3F | 0x80);
				arg0[local15++] = (byte) (local23 & 0x3F | 0x80);
			}
		}
		return local15 - arg2;
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(II)Z")
	public static boolean method6182(@OriginalArg(0) int arg0) {
		if (arg0 == 12 || arg0 == 17 || arg0 == 2 || arg0 == 57 || arg0 == 1004) {
			return true;
		} else {
			return arg0 == 22 || arg0 == 1011;
		}
	}
}

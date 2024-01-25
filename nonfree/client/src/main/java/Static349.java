import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!om", name = "n", descriptor = "Lclient!hm;")
	public static final Class122 aClass122_3 = new Class122();

	@OriginalMember(owner = "client!om", name = "o", descriptor = "[I")
	public static final int[] anIntArray479 = new int[2048];

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/String;[BIB)I")
	public static int method5561(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = arg2;
		for (@Pc(15) int local15 = 0; local15 < local11; local15++) {
			@Pc(20) char local20 = arg0.charAt(local15);
			if (local20 <= '\u007f') {
				arg1[local13++] = (byte) local20;
			} else if (local20 <= '\u07ff') {
				arg1[local13++] = (byte) (local20 >> 6 | 0xC0);
				arg1[local13++] = (byte) (local20 & 0x3F | 0x80);
			} else {
				arg1[local13++] = (byte) (local20 >> 12 | 0xE0);
				arg1[local13++] = (byte) (local20 >> 6 & 0x3F | 0x80);
				arg1[local13++] = (byte) (local20 & 0x3F | 0x80);
			}
		}
		return local13 - arg2;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!dv", name = "x", descriptor = "F")
	public static float aFloat43;

	@OriginalMember(owner = "client!dv", name = "J", descriptor = "[I")
	public static int[] anIntArray129;

	@OriginalMember(owner = "client!dv", name = "z", descriptor = "[I")
	public static final int[] anIntArray126 = new int[1];

	@OriginalMember(owner = "client!dv", name = "C", descriptor = "Lclient!wh;")
	public static final Class356 aClass356_8 = new Class356(8);

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Ljava/lang/String;[BII)I")
	public static int method1893(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(15) int local15 = arg2;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 <= '\u007f') {
				arg1[local15++] = (byte) local23;
			} else if (local23 <= '\u07ff') {
				arg1[local15++] = (byte) (local23 >> 6 | 0xC0);
				arg1[local15++] = (byte) (local23 & 0x3F | 0x80);
			} else {
				arg1[local15++] = (byte) (local23 >> 12 | 0xE0);
				arg1[local15++] = (byte) (local23 >> 6 & 0x3F | 0x80);
				arg1[local15++] = (byte) (local23 & 0x3F | 0x80);
			}
		}
		return local15 - arg2;
	}
}

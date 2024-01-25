import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!hi", name = "u", descriptor = "Lclient!hu;")
	public static Class147 aClass147_1;

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_99 = new Class363(2, 0);

	@OriginalMember(owner = "client!hi", name = "p", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_100 = new Class363(58, 3);

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/String;[BIZ)I")
	public static int method3251(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = arg2;
		for (@Pc(21) int local21 = 0; local21 < local8; local21++) {
			@Pc(27) char local27 = arg0.charAt(local21);
			if (local27 <= '\u007f') {
				arg1[local10++] = (byte) local27;
			} else if (local27 <= '\u07ff') {
				arg1[local10++] = (byte) (local27 >> 6 | 0xC0);
				arg1[local10++] = (byte) (local27 & 0x3F | 0x80);
			} else {
				arg1[local10++] = (byte) (local27 >> 12 | 0xE0);
				arg1[local10++] = (byte) (local27 >> 6 & 0x3F | 0x80);
				arg1[local10++] = (byte) (local27 & 0x3F | 0x80);
			}
		}
		return local10 - arg2;
	}
}

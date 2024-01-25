import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "[I")
	public static final int[] anIntArray447 = new int[1000];

	@OriginalMember(owner = "client!rt", name = "k", descriptor = "Lclient!fc;")
	public static final Class77 aClass77_47 = new Class77(8);

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(II)V")
	public static void method4785(@OriginalArg(1) int arg0) {
		if (arg0 == 37) {
			Static430.aFloat54 = 3.0F;
		} else if (arg0 == 50) {
			Static430.aFloat54 = 4.0F;
		} else if (arg0 == 75) {
			Static430.aFloat54 = 6.0F;
		} else if (arg0 == 100) {
			Static430.aFloat54 = 8.0F;
		} else if (arg0 == 200) {
			Static430.aFloat54 = 16.0F;
		}
		Static112.anInt1711 = -1;
		Static112.anInt1711 = -1;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z[BILjava/lang/String;)I")
	public static int method4790(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(10) int local10 = arg1;
		for (@Pc(21) int local21 = 0; local21 < local8; local21++) {
			@Pc(27) char local27 = arg2.charAt(local21);
			if (local27 <= '\u007f') {
				arg0[local10++] = (byte) local27;
			} else if (local27 > '\u07ff') {
				arg0[local10++] = (byte) (local27 >> 12 | 0xE0);
				arg0[local10++] = (byte) (local27 >> 6 & 0x3F | 0x80);
				arg0[local10++] = (byte) (local27 & 0x3F | 0x80);
			} else {
				arg0[local10++] = (byte) (local27 >> 6 | 0xC0);
				arg0[local10++] = (byte) (local27 & 0x3F | 0x80);
			}
		}
		return local10 - arg1;
	}
}

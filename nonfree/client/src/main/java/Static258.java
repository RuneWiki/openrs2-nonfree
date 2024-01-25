import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "Z")
	public static boolean aBoolean367 = false;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILjava/lang/String;B[B)I")
	public static int method4076(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(10) int local10 = arg0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(21) char local21 = arg1.charAt(local12);
			if (local21 <= '\u007f') {
				arg2[local10++] = (byte) local21;
			} else if (local21 > '\u07ff') {
				arg2[local10++] = (byte) (local21 >> 12 | 0xE0);
				arg2[local10++] = (byte) (local21 >> 6 & 0x3F | 0x80);
				arg2[local10++] = (byte) (local21 & 0x3F | 0x80);
			} else {
				arg2[local10++] = (byte) (local21 >> 6 | 0xC0);
				arg2[local10++] = (byte) (local21 & 0x3F | 0x80);
			}
		}
		return local10 - arg0;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)Z")
	public static boolean method4078() {
		return Static188.method3095("jaclib") ? Static188.method3095("hw3d") : false;
	}
}

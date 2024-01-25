import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILjava/lang/String;[BB)I")
	public static int method3281(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(16) int local16 = arg1.length();
		@Pc(18) int local18 = arg0;
		for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
			@Pc(26) char local26 = arg1.charAt(local20);
			if (local26 <= '\u007f') {
				arg2[local18++] = (byte) local26;
			} else if (local26 > '\u07ff') {
				arg2[local18++] = (byte) (local26 >> 12 | 0xE0);
				arg2[local18++] = (byte) (local26 >> 6 & 0x3F | 0x80);
				arg2[local18++] = (byte) (local26 & 0x3F | 0x80);
			} else {
				arg2[local18++] = (byte) (local26 >> 6 | 0xC0);
				arg2[local18++] = (byte) (local26 & 0x3F | 0x80);
			}
		}
		return local18 - arg0;
	}
}

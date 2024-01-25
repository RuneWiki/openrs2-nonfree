import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "[S")
	public static final short[] aShortArray91 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBI)I")
	public static int method4956(@OriginalArg(0) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(48) int local48 = (arg0 & 0x7F) * 96 >> 7;
			if (local48 < 2) {
				local48 = 2;
			} else if (local48 > 126) {
				local48 = 126;
			}
			return (arg0 & 0xFF80) + local48;
		}
	}
}

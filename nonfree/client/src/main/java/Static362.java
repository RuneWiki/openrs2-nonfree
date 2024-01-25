import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "Z")
	public static boolean aBoolean450 = false;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(III)I")
	public static int method5267(@OriginalArg(0) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(39) int local39 = (arg0 & 0x7F) * 96 >> 7;
			if (local39 < 2) {
				local39 = 2;
			} else if (local39 > 126) {
				local39 = 126;
			}
			return (arg0 & 0xFF80) + local39;
		}
	}
}

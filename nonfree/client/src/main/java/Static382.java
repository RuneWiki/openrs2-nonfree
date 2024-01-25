import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!mw", name = "s", descriptor = "Lclient!nm;")
	public static Class247 aClass247_2;

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_203 = new Class196(23, 3);

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IZI)I")
	public static int method5578(@OriginalArg(0) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(38) int local38 = (arg0 & 0x7F) * 96 >> 7;
			if (local38 < 2) {
				local38 = 2;
			} else if (local38 > 126) {
				local38 = 126;
			}
			return (arg0 & 0xFF80) + local38;
		}
	}
}

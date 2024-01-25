import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_199 = new Class322(136, -2);

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(II)I")
	public static int method8878(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(III)I")
	public static int method8880(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(18) int local18 = (arg0 & 0x7F) * 96 >> 7;
		if (local18 < 2) {
			local18 = 2;
		} else if (local18 > 126) {
			local18 = 126;
		}
		return (arg0 & 0xFF80) + local18;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "Lclient!h;")
	public static final Class125 aClass125_42 = new Class125(8);

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_150 = new Class88("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "Lclient!nw;")
	public static Class222 aClass222_1 = new Class222(8);

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)I")
	public static int method4569(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}
}

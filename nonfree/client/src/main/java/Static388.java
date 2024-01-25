import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "Lclient!pe;")
	public static Class254 aClass254_102;

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "Lclient!hca;")
	public static Class134 aClass134_7;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_74 = new Class230(75, -1);

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(CI)Z")
	public static boolean method6203(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(30) char[] local30 = Static397.aCharArray6;
			for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
				@Pc(38) char local38 = local30[local32];
				if (local38 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(BZ)Z")
	public static boolean method6204(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			return false;
		} else {
			return local7 < 128 || local7 >= 160 || Static397.aCharArray6[local7 - 128] != '\u0000';
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!cfa", name = "q", descriptor = "Lclient!jba;")
	public static Class83 aClass83_1;

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IC)Z")
	public static boolean method1014(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static535.method7314(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static516.aCharArray5;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (local26 == arg0) {
					return true;
				}
			}
			@Pc(46) char[] local46 = Static534.aCharArray6;
			for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
				@Pc(57) char local57 = local46[local48];
				if (local57 == arg0) {
					return true;
				}
			}
			return false;
		}
	}
}

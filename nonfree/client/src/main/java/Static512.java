import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!sb", name = "M", descriptor = "[Lclient!ph;")
	public static Class260[] aClass260Array1;

	@OriginalMember(owner = "client!sb", name = "O", descriptor = "I")
	public static int anInt8840 = 0;

	@OriginalMember(owner = "client!sb", name = "R", descriptor = "Lclient!ef;")
	public static final Class80 aClass80_3 = new Class80();

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BC)Z")
	public static boolean method7338(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static212.method3800(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static86.aCharArray15;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (local26 == arg0) {
					return true;
				}
			}
			@Pc(38) char[] local38 = Static366.aCharArray13;
			for (@Pc(40) int local40 = 0; local40 < local38.length; local40++) {
				@Pc(51) char local51 = local38[local40];
				if (arg0 == local51) {
					return true;
				}
			}
			return false;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static521 {

	@OriginalMember(owner = "client!qi", name = "H", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_90 = new Class286(70, 7);

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BI)V")
	public static void method7423(@OriginalArg(1) int arg0) {
		@Pc(9) Class3_Sub4_Sub2 local9 = Static502.method7211(9, (long) arg0);
		local9.method627();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IC)Z")
	public static boolean method7425(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(38) char[] local38 = Static38.aCharArray1;
			for (@Pc(40) int local40 = 0; local40 < local38.length; local40++) {
				@Pc(46) char local46 = local38[local40];
				if (local46 == arg0) {
					return true;
				}
			}
		}
		return false;
	}
}

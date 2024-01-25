import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "Lclient!vg;")
	public static Class349 aClass349_41;

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "Z")
	public static final boolean aBoolean172 = false;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IC)Z")
	public static boolean method2104(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static581.method7526(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static434.aCharArray5;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (local26 == arg0) {
					return true;
				}
			}
			@Pc(38) char[] local38 = Static579.aCharArray8;
			for (@Pc(40) int local40 = 0; local40 < local38.length; local40++) {
				@Pc(46) char local46 = local38[local40];
				if (local46 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(BII)Z")
	public static boolean method2106(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}

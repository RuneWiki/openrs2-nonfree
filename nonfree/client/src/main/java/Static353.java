import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!op", name = "h", descriptor = "I")
	public static int anInt5257;

	@OriginalMember(owner = "client!op", name = "i", descriptor = "I")
	public static int anInt5258;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(CB)Z")
	public static boolean method4514(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static76.method1565(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static391.aCharArray10;
			for (@Pc(28) int local28 = 0; local28 < local18.length; local28++) {
				@Pc(34) char local34 = local18[local28];
				if (arg0 == local34) {
					return true;
				}
			}
			@Pc(54) char[] local54 = Static327.aCharArray8;
			for (@Pc(56) int local56 = 0; local56 < local54.length; local56++) {
				@Pc(62) char local62 = local54[local56];
				if (arg0 == local62) {
					return true;
				}
			}
			return false;
		}
	}
}

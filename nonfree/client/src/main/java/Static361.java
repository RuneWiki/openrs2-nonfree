import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!sk", name = "C", descriptor = "I")
	public static int anInt6359;

	@OriginalMember(owner = "client!sk", name = "L", descriptor = "I")
	public static int anInt6364 = 0;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(CB)Z")
	public static boolean method5045(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static40.method737(arg0)) {
			return true;
		} else {
			@Pc(20) char[] local20 = Static399.aCharArray10;
			for (@Pc(22) int local22 = 0; local22 < local20.length; local22++) {
				@Pc(28) char local28 = local20[local22];
				if (local28 == arg0) {
					return true;
				}
			}
			@Pc(51) char[] local51 = Static187.aCharArray9;
			for (@Pc(53) int local53 = 0; local53 < local51.length; local53++) {
				@Pc(59) char local59 = local51[local53];
				if (local59 == arg0) {
					return true;
				}
			}
			return false;
		}
	}
}

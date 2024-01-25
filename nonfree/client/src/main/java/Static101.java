import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "S")
	public static short aShort42 = 320;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(CI)Z")
	public static boolean method1942(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static152.method2683(arg0)) {
			return true;
		} else {
			@Pc(24) char[] local24 = Static71.aCharArray3;
			for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
				@Pc(31) char local31 = local24[local26];
				if (arg0 == local31) {
					return true;
				}
			}
			@Pc(43) char[] local43 = Static54.aCharArray2;
			for (@Pc(45) int local45 = 0; local45 < local43.length; local45++) {
				@Pc(50) char local50 = local43[local45];
				if (arg0 == local50) {
					return true;
				}
			}
			return false;
		}
	}
}

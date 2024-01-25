import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!ij", name = "S", descriptor = "Lclient!am;")
	public static Class11 aClass11_3;

	@OriginalMember(owner = "client!ij", name = "P", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_101 = new Class221(73, -2);

	@OriginalMember(owner = "client!ij", name = "U", descriptor = "I")
	public static int anInt3002 = 1;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(CB)Z")
	public static boolean method2695(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static32.method439(arg0)) {
			return true;
		} else {
			@Pc(23) char[] local23 = Static79.aCharArray1;
			for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
				@Pc(31) char local31 = local23[local25];
				if (arg0 == local31) {
					return true;
				}
			}
			@Pc(51) char[] local51 = Static163.aCharArray4;
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

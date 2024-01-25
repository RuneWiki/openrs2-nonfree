import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static225 {

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "Z")
	public static boolean aBoolean295 = false;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
	public static void method3706() {
		Static530.method7270();
		Static245.method3870();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IC)Z")
	public static boolean method3707(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V")
	public static void method3708() {
		if (Static409.anInt1461 == 9) {
			Static27.method293(5);
		} else if (Static409.anInt1461 == 5 || Static409.anInt1461 == 6) {
			Static27.method293(3);
		} else if (Static409.anInt1461 == 12) {
			Static27.method293(3);
		}
	}
}

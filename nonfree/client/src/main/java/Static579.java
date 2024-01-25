import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static579 {

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)Lclient!oga;")
	public static Class5_Sub40 method7884() {
		if (Static407.aClass124_66 == null || Static432.aClass328_1 == null) {
			return null;
		}
		for (@Pc(24) Class5_Sub40 local24 = (Class5_Sub40) Static432.aClass328_1.method7631(); local24 != null; local24 = (Class5_Sub40) Static432.aClass328_1.method7631()) {
			@Pc(31) Class262 local31 = Static407.aClass218_3.method5163(local24.anInt7515);
			if (local31 != null && local31.aBoolean557 && local31.method6490(Static407.anInterface23_2)) {
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)Z")
	public static boolean method7885(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 1000 && arg1 < 1000) {
			return true;
		} else if (arg0 >= 1000 || arg1 >= 1000) {
			return arg0 >= 1000 && arg1 >= 1000;
		} else if (Static203.method2848(arg1)) {
			return true;
		} else {
			return !Static203.method2848(arg0);
		}
	}
}

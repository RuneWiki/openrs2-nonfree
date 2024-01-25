import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static578 {

	@OriginalMember(owner = "client!wo", name = "g", descriptor = "F")
	public static float aFloat211;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZI)V")
	public static void method7902() {
		Static534.method7063(Static450.aClass316_101);
		for (@Pc(21) Class6_Sub43 local21 = (Class6_Sub43) Static162.aClass234_23.method5469(); local21 != null; local21 = (Class6_Sub43) Static162.aClass234_23.method5465()) {
			if (!local21.method7949()) {
				local21 = (Class6_Sub43) Static162.aClass234_23.method5469();
				if (local21 == null) {
					break;
				}
			}
			if (local21.anInt8194 == 0) {
				Static536.method7299(true, true, local21);
			}
		}
		if (Static200.aClass97_11 != null) {
			Static479.method6666(Static200.aClass97_11);
			Static200.aClass97_11 = null;
		}
	}
}

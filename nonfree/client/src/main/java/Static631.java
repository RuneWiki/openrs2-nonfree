import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static631 {

	@OriginalMember(owner = "client!uv", name = "Z", descriptor = "Lclient!oe;")
	public static Class266 aClass266_3;

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZI)V")
	public static void method8877() {
		@Pc(13) Class14_Sub54 local13 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static443.aClass251_183);
		Static277.aClass347_2.method8308(local13);
		for (@Pc(27) Class14_Sub13 local27 = (Class14_Sub13) Static27.aClass125_3.method2633(); local27 != null; local27 = (Class14_Sub13) Static27.aClass125_3.method2627()) {
			if (!local27.method9512()) {
				local27 = (Class14_Sub13) Static27.aClass125_3.method2633();
				if (local27 == null) {
					break;
				}
			}
			if (local27.anInt1466 == 0) {
				Static69.method1092(local27, true, true);
			}
		}
		if (Static432.aClass299_7 != null) {
			Static538.method7933(Static432.aClass299_7);
			Static432.aClass299_7 = null;
		}
	}
}

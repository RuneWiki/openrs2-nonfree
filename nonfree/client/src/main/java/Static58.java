import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!c", name = "s", descriptor = "I")
	public static int anInt1145 = 0;

	@OriginalMember(owner = "client!c", name = "v", descriptor = "S")
	public static short aShort24 = 32767;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "()V")
	public static void method966() {
		Static214.method3667(Static68.anInt1380);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZI)Z")
	public static boolean method967(@OriginalArg(0) boolean arg0) {
		@Pc(11) boolean local11 = Static213.aClass133_5.method7319();
		if (local11 == arg0) {
			return true;
		}
		if (!arg0) {
			Static213.aClass133_5.method7234();
		} else if (!Static213.aClass133_5.method7310()) {
			arg0 = false;
		}
		if (arg0 == local11) {
			return false;
		} else {
			Static97.aClass5_Sub25_8.method3683(arg0 ? 1 : 0, Static97.aClass5_Sub25_8.aClass6_Sub3_1);
			Static273.method4418();
			return true;
		}
	}
}

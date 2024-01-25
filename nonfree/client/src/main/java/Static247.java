import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static247 {

	@OriginalMember(owner = "client!me", name = "i", descriptor = "Lclient!wd;")
	public static Class116 aClass116_3;

	@OriginalMember(owner = "client!me", name = "H", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_86 = new Class2(43, 3);

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(CB)Z")
	public static boolean method4214(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V")
	public static void method4215() {
		if (Static213.aBoolean229) {
			return;
		}
		Static213.aBoolean230 = true;
		if (Static130.aClass153_Sub1_1.aBoolean337) {
			Static67.aFloat36 = (int) Static67.aFloat36 - 17 & 0xFFFFFFF0;
		} else {
			Static323.aFloat154 += (-Static323.aFloat154 - 12.0F) / 2.0F;
		}
		Static213.aBoolean229 = true;
	}
}

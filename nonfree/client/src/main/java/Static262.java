import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static262 {

	@OriginalMember(owner = "client!jfa", name = "A", descriptor = "Lclient!cea;")
	public static Class2_Sub11_Sub1 aClass2_Sub11_Sub1_3;

	@OriginalMember(owner = "client!jfa", name = "B", descriptor = "Lclient!hu;")
	public static Class155 aClass155_9;

	@OriginalMember(owner = "client!jfa", name = "N", descriptor = "S")
	public static short aShort71 = 205;

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(B)V")
	public static void method4325() {
		if (Static454.anInt7416 == 9) {
			Static213.method3541(5);
		} else if (Static454.anInt7416 == 5 || Static454.anInt7416 == 6) {
			Static213.method3541(3);
			return;
		} else if (Static454.anInt7416 == 12) {
			Static213.method3541(3);
			return;
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(BC)Z")
	public static boolean method4327(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}

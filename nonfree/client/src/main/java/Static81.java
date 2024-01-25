import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static81 {

	@OriginalMember(owner = "client!d", name = "uc", descriptor = "Lclient!ol;")
	public static Class3_Sub38 aClass3_Sub38_1;

	@OriginalMember(owner = "client!d", name = "v", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_22 = new Class303(55, 2);

	@OriginalMember(owner = "client!d", name = "F", descriptor = "I")
	public static int anInt1761 = 0;

	@OriginalMember(owner = "client!d", name = "Hc", descriptor = "I")
	public static int anInt1829 = 0;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
	public static void method1656() {
		Static288.aClass45_9.pa(Static596.anInt9772, Static405.aClass3_Sub3_Sub1_1.aBoolean584 ? Static196.anInt9123 + 256 << 2 : -1, 0);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(CI)Z")
	public static boolean method1668(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}

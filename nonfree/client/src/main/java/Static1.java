import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "d", descriptor = "I")
	public static int anInt2959;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1743 = Static107.method1838("Loading wordpack )2 ");

	@OriginalMember(owner = "client!a", name = "a", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1741 = aClass28_1743;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "I")
	public static int anInt2957 = -1;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1742 = Static107.method1838("Hierhin gehen");

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(B)V")
	public static void method2038() {
		for (@Pc(10) Class2_Sub4_Sub1_Sub2 local10 = (Class2_Sub4_Sub1_Sub2) Static38.aClass65_3.method2115(); local10 != null; local10 = (Class2_Sub4_Sub1_Sub2) Static38.aClass65_3.method2117()) {
			if (Static103.anInt2568 != local10.anInt725 || local10.aBoolean22) {
				local10.method2888();
			} else if (Static156.anInt3491 >= local10.anInt735) {
				local10.method470(Static119.anInt2853);
				if (local10.aBoolean22) {
					local10.method2888();
				} else {
					Static122.method2002(local10.anInt725, local10.anInt732, local10.anInt730, local10.anInt731, 60, local10, 0, -1L, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
	public static void method2039() {
		aClass28_1742 = null;
		aClass28_1743 = null;
		aClass28_1741 = null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	public static void method2041() {
		Static23.aClass14_38.method596();
	}
}

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
	public static int anInt1952;

	@OriginalMember(owner = "client!hd", name = "L", descriptor = "[I")
	public static int[] anIntArray207;

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "Lclient!dd;")
	private static Class13 aClass13_670 = Static161.method2971("button near the top of that page)3");

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
	public static int anInt1954 = 0;

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "Lclient!dd;")
	public static Class13 aClass13_671 = aClass13_670;

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
	public static int anInt1957 = 0;

	@OriginalMember(owner = "client!hd", name = "K", descriptor = "Lclient!dd;")
	private static Class13 aClass13_673 = Static161.method2971("Please use a different world)3");

	@OriginalMember(owner = "client!hd", name = "B", descriptor = "Lclient!dd;")
	public static Class13 aClass13_672 = aClass13_673;

	@OriginalMember(owner = "client!hd", name = "H", descriptor = "I")
	public static int anInt1964 = 0;

	@OriginalMember(owner = "client!hd", name = "N", descriptor = "Z")
	public static boolean aBoolean152 = false;

	@OriginalMember(owner = "client!hd", name = "T", descriptor = "Lclient!dd;")
	public static Class13 aClass13_674 = aClass13_673;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
	public static void method1453() {
		if (!Static118.aBoolean233) {
			return;
		}
		@Pc(11) Class20 local11 = Static15.method628(Static157.anInt3723, Static24.anInt870);
		if (local11 != null && local11.anObjectArray16 != null) {
			@Pc(28) Class1_Sub23 local28 = new Class1_Sub23();
			local28.anObjectArray29 = local11.anObjectArray16;
			local28.aClass20_13 = local11;
			Static1.method43(local28);
		}
		Static118.aBoolean233 = false;
		Static125.method2300(local11);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
	public static void method1454() {
		aClass13_670 = null;
		aClass13_671 = null;
		aClass13_674 = null;
		aClass13_673 = null;
		aClass13_672 = null;
		anIntArray207 = null;
	}
}

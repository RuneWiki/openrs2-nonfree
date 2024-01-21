import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!td", name = "e", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1;

	@OriginalMember(owner = "client!td", name = "h", descriptor = "Lclient!ai;")
	private static Class6 aClass6_1068 = Static38.method685("Take");

	@OriginalMember(owner = "client!td", name = "a", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1067 = aClass6_1068;

	@OriginalMember(owner = "client!td", name = "f", descriptor = "[I")
	public static int[] anIntArray360 = new int[50];

	@OriginalMember(owner = "client!td", name = "g", descriptor = "Lclient!db;")
	public static Class16 aClass16_12 = new Class16(4096);

	@OriginalMember(owner = "client!td", name = "l", descriptor = "I")
	public static int anInt3648 = 0;

	@OriginalMember(owner = "client!td", name = "m", descriptor = "I")
	public static int anInt3649 = 0;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
	public static void method2416() {
		aClass5_1 = null;
		aClass6_1068 = null;
		anIntArray360 = null;
		aClass16_12 = null;
		aClass6_1067 = null;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V")
	public static void method2417() {
		if (Static166.aClass43_3 != null) {
			Static166.aClass43_3.method1236();
			Static166.aClass43_3 = null;
		}
		Static135.method2097();
		Static30.aClass44_1.method1246();
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			Static51.aClass48Array1[local23].method1484();
		}
		System.gc();
		Static129.method2791();
		Static52.aBoolean56 = false;
		Static94.anInt2328 = -1;
		Static5.method56();
		Static98.method1607(10);
	}
}

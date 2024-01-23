import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!ig", name = "L", descriptor = "[I")
	public static int[] anIntArray273;

	@OriginalMember(owner = "client!ig", name = "H", descriptor = "Lclient!hh;")
	public static Class69 aClass69_11 = new Class69();

	@OriginalMember(owner = "client!ig", name = "Y", descriptor = "S")
	public static short aShort21 = 32767;

	@OriginalMember(owner = "client!ig", name = "ab", descriptor = "I")
	public static volatile int anInt2117 = 0;

	@OriginalMember(owner = "client!ig", name = "bb", descriptor = "[I")
	public static int[] anIntArray274 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V")
	public static void method1762() {
		Static110.aClass31_18.method856(5);
		Static12.aClass31_2.method856(5);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)Lclient!d;")
	public static Class30 method1768() {
		try {
			return (Class30) Class.forName("Class30_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class30_Sub2();
		}
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V")
	public static void method1770() {
		Static115.method1777(false);
		System.gc();
		Static299.method4554(25);
	}
}

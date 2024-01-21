import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "[I")
	public static int[] anIntArray399;

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "Lclient!og;")
	public static Class62 aClass62_1;

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
	public static int anInt3470 = 0;

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1205 = Static65.method1172("Username: ");

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1206 = Static65.method1172("(Udns");

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
	public static int anInt3471 = 0;

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
	public static int anInt3473 = 0;

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1207 = aClass46_1205;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)Lclient!oc;")
	public static Class49 method2518() {
		try {
			return (Class49) Class.forName("Class49_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
	public static void method2519() {
		aClass46_1205 = null;
		anIntArray399 = null;
		aClass62_1 = null;
		aClass46_1206 = null;
		aClass46_1207 = null;
	}
}

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!lf", name = "P", descriptor = "Lclient!ga;")
	public static Class20_Sub1 aClass20_Sub1_14;

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "Lclient!ec;")
	public static Class22 aClass22_143 = Static60.method1113("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!lf", name = "B", descriptor = "Lclient!ec;")
	public static Class22 aClass22_144 = Static60.method1113("title)3jpg");

	@OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
	public static int anInt492 = 0;

	@OriginalMember(owner = "client!lf", name = "J", descriptor = "Lclient!ja;")
	public static Class33 aClass33_8 = new Class33(64);

	@OriginalMember(owner = "client!lf", name = "O", descriptor = "Lclient!ec;")
	private static Class22 aClass22_146 = Static60.method1113("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!lf", name = "L", descriptor = "Lclient!ec;")
	public static Class22 aClass22_145 = aClass22_146;

	@OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
	public static volatile int anInt499 = 0;

	@OriginalMember(owner = "client!lf", name = "N", descriptor = "Z")
	public static boolean aBoolean48 = false;

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)Lclient!ba;")
	public static Class7 method340() {
		try {
			return (Class7) Class.forName("Class7_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class7_Sub1();
		}
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(B)V")
	public static void method345() {
		for (@Pc(15) Class4_Sub21 local15 = (Class4_Sub21) Static90.aClass81_11.method2017(); local15 != null; local15 = (Class4_Sub21) Static90.aClass81_11.method2013()) {
			@Pc(20) int local20 = local15.anInt2939;
			if (Static24.method396(local20)) {
				@Pc(26) boolean local26 = true;
				@Pc(30) Class4_Sub7[] local30 = Static65.aClass4_Sub7ArrayArray1[local20];
				for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
					if (local30[local32] != null) {
						local26 = local30[local32].aBoolean79;
						break;
					}
				}
				if (!local26) {
					@Pc(60) int local60 = (int) local15.aLong99;
					@Pc(64) Class4_Sub7 local64 = Static106.method1749(local60);
					if (local64 != null) {
						Static110.method1772(local64);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(Z)V")
	public static void method350() {
		aClass22_145 = null;
		aClass22_144 = null;
		aClass20_Sub1_14 = null;
		aClass33_8 = null;
		aClass22_143 = null;
		aClass22_146 = null;
	}
}

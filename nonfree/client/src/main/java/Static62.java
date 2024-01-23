import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!g", name = "d", descriptor = "Lclient!ld;")
	public static Class67 aClass67_3;

	@OriginalMember(owner = "client!g", name = "o", descriptor = "I")
	public static int anInt1432;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "Lclient!ia;")
	public static Class51 aClass51_438 = Static64.method1101("Fps:");

	@OriginalMember(owner = "client!g", name = "b", descriptor = "Lclient!ia;")
	private static Class51 aClass51_439 = Static64.method1101("Dec");

	@OriginalMember(owner = "client!g", name = "c", descriptor = "Lclient!ia;")
	private static Class51 aClass51_440 = Static64.method1101("Jul");

	@OriginalMember(owner = "client!g", name = "e", descriptor = "Lclient!ia;")
	private static Class51 aClass51_441 = Static64.method1101("Feb");

	@OriginalMember(owner = "client!g", name = "f", descriptor = "Lclient!ia;")
	private static Class51 aClass51_442 = Static64.method1101("Nov");

	@OriginalMember(owner = "client!g", name = "h", descriptor = "Lclient!ia;")
	private static Class51 aClass51_443 = Static64.method1101("Jun");

	@OriginalMember(owner = "client!g", name = "i", descriptor = "Lclient!ia;")
	private static Class51 aClass51_444 = Static64.method1101("Aug");

	@OriginalMember(owner = "client!g", name = "l", descriptor = "Lclient!ia;")
	private static Class51 aClass51_445 = Static64.method1101("Oct");

	@OriginalMember(owner = "client!g", name = "m", descriptor = "Lclient!ia;")
	private static Class51 aClass51_446 = Static64.method1101("May");

	@OriginalMember(owner = "client!g", name = "n", descriptor = "Lclient!ia;")
	private static Class51 aClass51_447 = Static64.method1101("Sep");

	@OriginalMember(owner = "client!g", name = "p", descriptor = "Lclient!ia;")
	private static Class51 aClass51_448 = Static64.method1101("Jan");

	@OriginalMember(owner = "client!g", name = "q", descriptor = "Lclient!ia;")
	private static Class51 aClass51_449 = Static64.method1101("Apr");

	@OriginalMember(owner = "client!g", name = "r", descriptor = "[I")
	public static int[] anIntArray93 = new int[100];

	@OriginalMember(owner = "client!g", name = "u", descriptor = "Lclient!ia;")
	private static Class51 aClass51_450 = Static64.method1101("Mar");

	@OriginalMember(owner = "client!g", name = "t", descriptor = "[Lclient!ia;")
	public static Class51[] aClass51Array10 = new Class51[] { aClass51_448, aClass51_441, aClass51_450, aClass51_449, aClass51_446, aClass51_443, aClass51_440, aClass51_444, aClass51_447, aClass51_445, aClass51_442, aClass51_439 };

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)Z")
	public static boolean method1084(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(11) int local11 = Static227.aShortArray59[arg0];
		if (local11 >= 2000) {
			local11 -= 2000;
		}
		return local11 == 1005;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)Lclient!ci;")
	public static Class24 method1085() {
		try {
			return (Class24) Class.forName("Class24_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return new Class24_Sub2();
		}
	}
}

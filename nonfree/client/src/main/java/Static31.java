import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "Z")
	public static boolean aBoolean46 = false;

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
	public static int anInt921 = 0;

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
	public static int anInt923 = 0;

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "Lclient!id;")
	private static Class34 aClass34_450 = Static9.method266("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
	public static int anInt924 = 0;

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "Lclient!id;")
	public static Class34 aClass34_451 = Static9.method266("<col=ffff00>");

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "[Lclient!id;")
	public static Class34[] aClass34Array6 = new Class34[1000];

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "Z")
	public static boolean aBoolean47 = true;

	@OriginalMember(owner = "client!ee", name = "n", descriptor = "Lclient!id;")
	private static Class34 aClass34_454 = Static9.method266(" from your friend list first");

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "Lclient!id;")
	public static Class34 aClass34_452 = aClass34_454;

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
	public static int anInt925 = 0;

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "Lclient!id;")
	public static Class34 aClass34_453 = Static9.method266("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
	public static int anInt926 = 0;

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "Z")
	public static boolean aBoolean48 = false;

	@OriginalMember(owner = "client!ee", name = "s", descriptor = "[J")
	public static long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!ee", name = "u", descriptor = "Lclient!id;")
	public static Class34 aClass34_455 = aClass34_450;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
	public static void method565() {
		aClass34_450 = null;
		aClass34Array6 = null;
		aLongArray2 = null;
		aClass34_452 = null;
		aClass34_453 = null;
		aClass34_454 = null;
		aClass34_455 = null;
		aClass34_451 = null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
	public static void method567() {
		@Pc(3) int local3 = Static58.anInt1621;
		@Pc(5) int local5 = Static88.anInt2288;
		@Pc(11) int local11 = Static2.anInt274;
		@Pc(13) int local13 = Static15.anInt605;
		Static111.method1747(local5, local3, local11, local13, 6116423);
		Static111.method1747(local5 + 1, local3 + 1, local11 - 2, 16, 0);
		Static111.method1751(local5 + 1, local3 + 18, local11 - 2, local13 + -19, 0);
		Static90.aClass1_Sub1_Sub2_Sub3_Sub1_7.method839(Static22.aClass34_382, local5 + 3, local3 + 14, 6116423, -1);
		@Pc(65) int local65 = Static39.anInt1143;
		@Pc(67) int local67 = Static19.anInt658;
		for (@Pc(69) int local69 = 0; local69 < Static71.anInt1876; local69++) {
			@Pc(84) int local84 = local3 + (Static71.anInt1876 - local69 - 1) * 15 + 31;
			@Pc(86) int local86 = 16777215;
			if (local5 < local65 && local11 + local5 > local65 && local84 - 13 < local67 && local67 < local84 + 3) {
				local86 = 16776960;
			}
			Static90.aClass1_Sub1_Sub2_Sub3_Sub1_7.method839(Static15.method360(local69), local5 + 3, local84, local86, 0);
		}
		Static75.method1339(Static88.anInt2288, Static15.anInt605, Static58.anInt1621, Static2.anInt274);
	}
}

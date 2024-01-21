import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!d", name = "G", descriptor = "Lclient!qb;")
	public static Class2_Sub2_Sub2_Sub3 aClass2_Sub2_Sub2_Sub3_6;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "Lclient!o;")
	public static Class40 aClass40_112 = null;

	@OriginalMember(owner = "client!d", name = "f", descriptor = "Lclient!o;")
	public static Class40 aClass40_113 = Static13.method257("Enter name of player to add to list");

	@OriginalMember(owner = "client!d", name = "i", descriptor = "Lclient!o;")
	public static Class40 aClass40_114 = Static13.method257("Loaded gamescreen");

	@OriginalMember(owner = "client!d", name = "k", descriptor = "Lclient!o;")
	public static Class40 aClass40_115 = Static13.method257("Unknown");

	@OriginalMember(owner = "client!d", name = "m", descriptor = "Lclient!o;")
	public static Class40 aClass40_116 = Static13.method257("(Z");

	@OriginalMember(owner = "client!d", name = "n", descriptor = "Lclient!o;")
	public static Class40 aClass40_117 = Static13.method257("Invalid username or password)3");

	@OriginalMember(owner = "client!d", name = "v", descriptor = "[I")
	public static int[] anIntArray82 = new int[] { 0, 0, 0, -1, 0, 0, 0, 8, 0, 0, 0, 5, 0, 0, 0, 8, 0, 0, 0, 0, 0, 14, 0, 0, 8, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 2, 6, 0, 2, 0, 0, 0, 0, 0, 0, -2, 7, 0, 0, 0, 0, 0, 0, -2, -2, 0, 5, 0, 10, 0, 0, 0, 5, 7, 0, 0, 1, 0, 0, 15, 2, -1, 0, 0, 1, 0, 0, 0, 0, 0, 6, 0, 0, 0, 4, -1, 0, 0, 0, 0, 6, 0, 0, 0, 2, 0, 0, 4, 0, 0, 0, 0, 2, -1, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 6, 0, 4, 0, 2, 0, -2, 0, 0, 0, -2, 0, -2, 4, 0, 0, 6, 6, 0, 6, 4, 0, 0, 0, 0, 0, -2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 23, 0, 10, 0, -2, 0, 0, 0, 0, 6, 4, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 2, 0, 0, 0, 0, 0, 0, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 6, 1, 0, 0, 0, 0, 3, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 6, 0, 0, 4, 0, 0, 0, 0, 2, 5, 0, 3, 0, 0, 4 };

	@OriginalMember(owner = "client!d", name = "w", descriptor = "Lclient!o;")
	public static Class40 aClass40_118 = Static13.method257("Password: ");

	@OriginalMember(owner = "client!d", name = "y", descriptor = "Lclient!o;")
	public static Class40 aClass40_119 = Static13.method257("@yel@ days of*6nmember credit remaining)3");

	@OriginalMember(owner = "client!d", name = "B", descriptor = "[Lclient!o;")
	public static Class40[] aClass40Array7 = new Class40[100];

	@OriginalMember(owner = "client!d", name = "F", descriptor = "I")
	public static int anInt426 = -1;

	@OriginalMember(owner = "client!d", name = "H", descriptor = "Lclient!o;")
	public static Class40 aClass40_120 = Static13.method257("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
	public static void method345() {
		anIntArray82 = null;
		aClass40_113 = null;
		aClass40_112 = null;
		aClass40_115 = null;
		aClass40_116 = null;
		aClass40_114 = null;
		aClass40Array7 = null;
		aClass40_120 = null;
		aClass40_119 = null;
		aClass40_118 = null;
		aClass2_Sub2_Sub2_Sub3_6 = null;
		aClass40_117 = null;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(B)V")
	public static void method347() {
		if (Static80.aClass24_1 == null) {
			return;
		}
		@Pc(12) long local12 = System.currentTimeMillis();
		if (Static101.aLong143 >= local12) {
			return;
		}
		Static80.aClass24_1.method1654(local12);
		@Pc(30) int local30 = (int) (local12 - Static101.aLong143);
		Static101.aLong143 = local12;
		@Pc(41) Class local41 = wd.class;
		synchronized (wd.class) {
			Static5.anInt173 += local30 * Static12.anInt291;
			@Pc(58) int local58 = (Static5.anInt173 - Static12.anInt291 * 2000) / 1000;
			if (local58 > 0) {
				if (Static21.aClass2_Sub10_1 != null) {
					Static21.aClass2_Sub10_1.method1287(local58);
				}
				Static5.anInt173 -= local58 * 1000;
			}
		}
	}
}

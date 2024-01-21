import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!ff", name = "Ac", descriptor = "I")
	public static int anInt1423;

	@OriginalMember(owner = "client!ff", name = "U", descriptor = "Lclient!gg;")
	private static Class28 aClass28_814 = Static107.method1838("Error loading your profile)3");

	@OriginalMember(owner = "client!ff", name = "fb", descriptor = "J")
	public static long aLong50 = 0L;

	@OriginalMember(owner = "client!ff", name = "wb", descriptor = "[[I")
	public static int[][] anIntArrayArray7 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!ff", name = "yb", descriptor = "I")
	public static int anInt1391 = 0;

	@OriginalMember(owner = "client!ff", name = "Bb", descriptor = "I")
	public static int anInt1392 = 0;

	@OriginalMember(owner = "client!ff", name = "nc", descriptor = "Lclient!gg;")
	public static Class28 aClass28_818 = Static107.method1838("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!ff", name = "uc", descriptor = "Lclient!gg;")
	public static Class28 aClass28_819 = aClass28_814;

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
	public static void method987() {
		Static67.anInt1799 = 0;
		@Pc(12) int local12 = (Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1633 >> 7) + Static3.anInt2434;
		@Pc(19) int local19 = (Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1635 >> 7) + Static39.anInt1055;
		if (local12 >= 3053 && local12 <= 3156 && local19 >= 3056 && local19 <= 3136) {
			Static67.anInt1799 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local19 >= 9492 && local19 <= 9535) {
			Static67.anInt1799 = 1;
		}
		if (Static67.anInt1799 == 1 && local12 >= 3139 && local12 <= 3199 && local19 >= 3008 && local19 <= 3062) {
			Static67.anInt1799 = 0;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
	public static void method989() {
		aClass28_814 = null;
		aClass28_819 = null;
		anIntArrayArray7 = null;
		aClass28_818 = null;
	}
}

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "Lclient!ae;")
	private static Class5 aClass5_305 = Static56.method972(" from your friend list first");

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "Lclient!ae;")
	public static Class5 aClass5_306 = aClass5_305;

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
	public static int anInt702 = 0;

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "Lclient!p;")
	public static Class51 aClass51_6 = new Class51();

	@OriginalMember(owner = "client!dd", name = "j", descriptor = "Lclient!ae;")
	public static Class5 aClass5_307 = Static56.method972("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "Lclient!ae;")
	public static Class5 aClass5_308 = Static56.method972("Einloggen");

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "Lclient!bd;")
	public static Class9 aClass9_9 = new Class9(260);

	@OriginalMember(owner = "client!dd", name = "m", descriptor = "Z")
	public static boolean aBoolean32 = false;

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
	public static int anInt704 = 0;

	@OriginalMember(owner = "client!dd", name = "o", descriptor = "Lclient!ae;")
	private static Class5 aClass5_309 = Static56.method972("Examine");

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "Lclient!ae;")
	public static Class5 aClass5_310 = aClass5_309;

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "[Z")
	public static boolean[] aBooleanArray7 = new boolean[5];

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
	public static void method435() {
		aClass5_305 = null;
		aClass5_309 = null;
		aClass5_307 = null;
		aClass9_9 = null;
		aBooleanArray7 = null;
		aClass5_308 = null;
		aClass5_310 = null;
		aClass5_306 = null;
		aClass51_6 = null;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
	public static void method436() {
		Static56.anIntArray170 = null;
		Static38.aByteArrayArray6 = null;
		Static63.anIntArray375 = null;
		Static116.anIntArray382 = null;
		Static89.anIntArray256 = null;
		Static50.anIntArray157 = null;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V")
	public static void method437() {
		Static73.aBoolean87 = true;
		Static35.method691();
		@Pc(30) boolean local30;
		if (Static106.anInt2736 != -1) {
			local30 = Static82.method1302(261, 190, Static106.anInt2736, 1);
			if (!local30) {
				Static116.aBoolean157 = true;
			}
		} else if (Static88.anIntArray255[Static60.anInt2979] != -1) {
			local30 = Static82.method1302(261, 190, Static88.anIntArray255[Static60.anInt2979], 1);
			if (!local30) {
				Static116.aBoolean157 = true;
			}
		}
		if (Static103.aBoolean142 && Static58.anInt1603 == 1) {
			if (Static23.anInt736 == 1) {
				Static60.method1960();
			} else {
				Static1.method5();
			}
		}
		Static67.method1169();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "W", descriptor = "I")
	public static int anInt95;

	@OriginalMember(owner = "client!aa", name = "ib", descriptor = "[Lclient!bg;")
	public static Class1_Sub2_Sub1_Sub4[] aClass1_Sub2_Sub1_Sub4Array1;

	@OriginalMember(owner = "client!aa", name = "R", descriptor = "Lclient!ce;")
	public static Class1_Sub8 aClass1_Sub8_1 = new Class1_Sub8(new byte[5000]);

	@OriginalMember(owner = "client!aa", name = "Y", descriptor = "Lclient!dd;")
	public static Class13 aClass13_24 = Static161.method2971("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!aa", name = "lb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_30 = Static161.method2971("as it was used to break our rules)3");

	@OriginalMember(owner = "client!aa", name = "Z", descriptor = "Lclient!dd;")
	public static Class13 aClass13_25 = aClass13_30;

	@OriginalMember(owner = "client!aa", name = "ab", descriptor = "Lclient!dd;")
	public static Class13 aClass13_26 = Static161.method2971("hint_mapedge");

	@OriginalMember(owner = "client!aa", name = "bb", descriptor = "I")
	public static int anInt97 = 0;

	@OriginalMember(owner = "client!aa", name = "cb", descriptor = "[I")
	public static int[] anIntArray4 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!aa", name = "db", descriptor = "Z")
	public static boolean aBoolean11 = false;

	@OriginalMember(owner = "client!aa", name = "gb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_27 = Static161.method2971("Bitte geben Sie Ihren Benutzernamen ein)3");

	@OriginalMember(owner = "client!aa", name = "hb", descriptor = "[I")
	public static int[] anIntArray5 = new int[1000];

	@OriginalMember(owner = "client!aa", name = "jb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_28 = Static161.method2971(":duelfriend:");

	@OriginalMember(owner = "client!aa", name = "kb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_29 = Static161.method2971("auf der Hautpseite)3");

	@OriginalMember(owner = "client!aa", name = "nb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_31 = Static161.method2971("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!aa", name = "ob", descriptor = "I")
	public static int anInt101 = 0;

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "(B)V")
	public static void method68() {
		aClass13_30 = null;
		aClass13_28 = null;
		aClass13_24 = null;
		aClass13_26 = null;
		aClass13_29 = null;
		aClass1_Sub2_Sub1_Sub4Array1 = null;
		aClass13_25 = null;
		anIntArray5 = null;
		aClass1_Sub8_1 = null;
		anIntArray4 = null;
		aClass13_31 = null;
		aClass13_27 = null;
	}

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)Z")
	public static boolean method69() {
		@Pc(5) Class23 local5 = Static99.aClass23_1;
		synchronized (Static99.aClass23_1) {
			if (Static157.anInt3721 == Static165.anInt3887) {
				return false;
			} else {
				Static37.anInt1202 = Static93.anIntArray260[Static165.anInt3887];
				Static135.anInt3373 = Static33.anIntArray120[Static165.anInt3887];
				Static165.anInt3887 = Static165.anInt3887 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIZ)V")
	public static void method70(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static98.anInt3739 == 1) {
			Static103.aClass1_Sub2_Sub1_Sub3Array10[Static101.anInt2831 / 100].method422(Static151.anInt4127 - 8, Static119.anInt3146 + -8);
		}
		if (Static98.anInt3739 == 2) {
			Static103.aClass1_Sub2_Sub1_Sub3Array10[Static101.anInt2831 / 100 + 4].method422(Static151.anInt4127 - 8, Static119.anInt3146 - 8);
		}
		Static65.method1442();
		if (!Static162.aBoolean293) {
			return;
		}
		@Pc(47) int local47 = arg1 + 512 - 5;
		@Pc(51) int local51 = arg0 + 20;
		@Pc(53) int local53 = 16776960;
		Static22.aClass1_Sub2_Sub1_Sub1_Sub1_5.method255(Static57.method1349(new Class13[] { Static184.aClass13_1413, Static3.method75(Static62.anInt2605) }), local47, local51, 16776960, -1);
		@Pc(74) int local74 = local51 + 15;
		@Pc(76) Runtime local76 = Runtime.getRuntime();
		@Pc(86) int local86 = (int) ((local76.totalMemory() - local76.freeMemory()) / 1024L);
		if (local86 > 32768 && Static30.aBoolean72) {
			local53 = 16711680;
		}
		if (local86 > 65536 && !Static30.aBoolean72) {
			local53 = 16711680;
		}
		Static22.aClass1_Sub2_Sub1_Sub1_Sub1_5.method255(Static57.method1349(new Class13[] { Static124.aClass13_1075, Static3.method75(local86), Static151.aClass13_1444 }), local47, local74, local53, -1);
		local51 = local74 + 15;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!ag;I)V")
	public static void method71(@OriginalArg(0) Class4 arg0) {
		Static73.aClass4_51 = arg0;
	}
}

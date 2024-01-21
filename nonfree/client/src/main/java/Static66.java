import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "Lclient!t;")
	public static Class68 aClass68_7;

	@OriginalMember(owner = "client!lb", name = "D", descriptor = "[Lclient!ue;")
	public static Class4_Sub4_Sub5_Sub4[] aClass4_Sub4_Sub5_Sub4Array6;

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "Lclient!v;")
	public static Class76 aClass76_703 = Static134.method2017("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!lb", name = "N", descriptor = "Lclient!v;")
	private static Class76 aClass76_705 = Static134.method2017("Please contact customer support)3");

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "Lclient!v;")
	public static Class76 aClass76_704 = aClass76_705;

	@OriginalMember(owner = "client!lb", name = "G", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3 = new int[4][105][105];

	@OriginalMember(owner = "client!lb", name = "H", descriptor = "[I")
	public static int[] anIntArray227 = new int[32];

	@OriginalMember(owner = "client!lb", name = "K", descriptor = "I")
	public static int anInt1679 = 0;

	@OriginalMember(owner = "client!lb", name = "M", descriptor = "[I")
	public static int[] anIntArray228 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!lb", name = "P", descriptor = "Lclient!v;")
	public static Class76 aClass76_706 = Static134.method2017("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	public static void method1112() {
		Static104.anInt2333 = 0;
		Static48.anInt1228 = 0;
		Static121.method1845();
		Static127.method1913();
		Static93.method1502();
		Static121.method1846();
		@Pc(32) int local32;
		for (@Pc(26) int local26 = 0; local26 < Static104.anInt2333; local26++) {
			local32 = Static88.anIntArray290[local26];
			if (Static78.anInt1981 != Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[local32].anInt1391) {
				Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[local32] = null;
			}
		}
		if (Static24.aClass4_Sub10_Sub1_1.anInt931 != Static30.anInt1437) {
			throw new RuntimeException("gpp1 pos:" + Static24.aClass4_Sub10_Sub1_1.anInt931 + " psize:" + Static30.anInt1437);
		}
		for (local32 = 0; local32 < Static106.anInt2357; local32++) {
			if (Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[Static113.anIntArray348[local32]] == null) {
				throw new RuntimeException("gpp2 pos:" + local32 + " size:" + Static106.anInt2357);
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)V")
	public static void method1115() {
		anIntArray228 = null;
		aClass76_703 = null;
		aClass68_7 = null;
		aClass4_Sub4_Sub5_Sub4Array6 = null;
		aClass76_705 = null;
		anIntArrayArrayArray3 = null;
		aClass76_704 = null;
		anIntArray227 = null;
		aClass76_706 = null;
	}
}

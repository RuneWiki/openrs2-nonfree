import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!hd", name = "fb", descriptor = "Lclient!cc;")
	public static Class12 aClass12_7;

	@OriginalMember(owner = "client!hd", name = "L", descriptor = "[I")
	public static int[] anIntArray133 = new int[50];

	@OriginalMember(owner = "client!hd", name = "db", descriptor = "Lclient!ec;")
	private static Class22 aClass22_308 = Static60.method1113("Ok");

	@OriginalMember(owner = "client!hd", name = "T", descriptor = "Lclient!ec;")
	public static Class22 aClass22_307 = aClass22_308;

	@OriginalMember(owner = "client!hd", name = "Z", descriptor = "I")
	public static int anInt1249 = 1;

	@OriginalMember(owner = "client!hd", name = "ib", descriptor = "I")
	public static int anInt1253 = 0;

	@OriginalMember(owner = "client!hd", name = "lb", descriptor = "I")
	public static int anInt1254 = 0;

	@OriginalMember(owner = "client!hd", name = "Xb", descriptor = "Lclient!ec;")
	private static Class22 aClass22_312 = Static60.method1113("Login limit exceeded)3");

	@OriginalMember(owner = "client!hd", name = "zb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_310 = aClass22_312;

	@OriginalMember(owner = "client!hd", name = "Cb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_311 = Static60.method1113("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!hd", name = "Eb", descriptor = "[[I")
	public static int[][] anIntArrayArray11 = new int[104][104];

	@OriginalMember(owner = "client!hd", name = "Nb", descriptor = "J")
	public static long aLong41 = 0L;

	@OriginalMember(owner = "client!hd", name = "Ob", descriptor = "I")
	public static int anInt1278 = 0;

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V")
	public static void method880() {
		anIntArrayArray11 = null;
		aClass12_7 = null;
		aClass22_308 = null;
		aClass22_312 = null;
		aClass22_310 = null;
		anIntArray133 = null;
		aClass22_307 = null;
		aClass22_311 = null;
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)V")
	public static void method881() {
		Static22.aBoolean250 = false;
		Static99.anInt2589 = 0;
		Static4.anInt78 = 0;
		Static72.anInt1915 = -1;
		Static96.anInt2463 = 0;
		Static38.aClass4_Sub11_Sub1_1.anInt1099 = 0;
		Static30.anInt713 = -1;
		Static30.anInt708 = 0;
		Static10.anInt206 = -1;
		Static48.anInt1298 = 0;
		Static133.anInt3142 = -1;
		Static133.aClass4_Sub11_Sub1_3.anInt1099 = 0;
		Static39.anInt971 = 0;
		for (@Pc(40) int local40 = 0; local40 < Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1.length; local40++) {
			if (Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[local40] != null) {
				Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[local40].anInt2509 = -1;
			}
		}
		for (@Pc(58) int local58 = 0; local58 < Static12.aClass4_Sub1_Sub3_Sub2_Sub2Array1.length; local58++) {
			if (Static12.aClass4_Sub1_Sub3_Sub2_Sub2Array1[local58] != null) {
				Static12.aClass4_Sub1_Sub3_Sub2_Sub2Array1[local58].anInt2509 = -1;
			}
		}
		Static58.method1101();
		Static46.method888(30);
		for (@Pc(81) int local81 = 0; local81 < 100; local81++) {
			Static122.aBooleanArray7[local81] = true;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZI)Lclient!ec;")
	public static Class22 method883(@OriginalArg(1) int arg0) {
		return arg0 < 999999999 ? Static134.method2042(arg0) : Static133.aClass22_972;
	}
}

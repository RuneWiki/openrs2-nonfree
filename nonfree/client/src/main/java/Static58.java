import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!gd", name = "Q", descriptor = "I")
	public static int anInt1282;

	@OriginalMember(owner = "client!gd", name = "Y", descriptor = "I")
	public static int anInt1289;

	@OriginalMember(owner = "client!gd", name = "ab", descriptor = "Lclient!na;")
	public static Class61 aClass61_1;

	@OriginalMember(owner = "client!gd", name = "db", descriptor = "I")
	public static int anInt1291;

	@OriginalMember(owner = "client!gd", name = "gb", descriptor = "I")
	public static int anInt1293;

	@OriginalMember(owner = "client!gd", name = "M", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_503 = Static120.method1824("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!gd", name = "V", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_506 = Static120.method1824("Unable to connect)3");

	@OriginalMember(owner = "client!gd", name = "O", descriptor = "Lclient!rd;")
	public static Class80 aClass80_504 = aClass80_506;

	@OriginalMember(owner = "client!gd", name = "P", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_505 = Static120.method1824("Hidden");

	@OriginalMember(owner = "client!gd", name = "S", descriptor = "I")
	public static int anInt1284 = 0;

	@OriginalMember(owner = "client!gd", name = "Z", descriptor = "Lclient!rd;")
	public static Class80 aClass80_507 = aClass80_506;

	@OriginalMember(owner = "client!gd", name = "bb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_508 = Static120.method1824("Abbrechen");

	@OriginalMember(owner = "client!gd", name = "eb", descriptor = "Lclient!rd;")
	public static Class80 aClass80_509 = aClass80_505;

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V")
	public static void method866() {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = -1; local3 < Static15.anInt327; local3++) {
			if (local3 == -1) {
				local12 = 2047;
			} else {
				local12 = Static168.anIntArray460[local3];
			}
			@Pc(20) Class3_Sub1_Sub5_Sub4_Sub2 local20 = Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[local12];
			if (local20 != null && local20.anInt4327 > 0) {
				local20.anInt4327--;
				if (local20.anInt4327 == 0) {
					local20.aClass80_1687 = null;
				}
			}
		}
		for (local12 = 0; local12 < Static59.anInt1317; local12++) {
			@Pc(64) int local64 = Static125.anIntArray359[local12];
			@Pc(68) Class3_Sub1_Sub5_Sub4_Sub1 local68 = Static28.aClass3_Sub1_Sub5_Sub4_Sub1Array1[local64];
			if (local68 != null && local68.anInt4327 > 0) {
				local68.anInt4327--;
				if (local68.anInt4327 == 0) {
					local68.aClass80_1687 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(IB)I")
	public static int method867(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "(I)V")
	public static void method868() {
		Static125.aClass5_37.method146();
		Static66.aClass5_19.method146();
	}

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "(I)V")
	public static void method869() {
		if (!Static5.aBoolean17) {
			return;
		}
		Static13.aClass3_Sub1_Sub4_Sub4_3 = null;
		Static87.aClass3_Sub1_Sub4_Sub1_3 = null;
		Static21.aClass3_Sub1_Sub4_Sub4Array4 = null;
		Static154.aClass3_Sub1_Sub4_Sub1Array10 = null;
		Static170.aClass3_Sub1_Sub4_Sub4_34 = null;
		Static101.aClass3_Sub1_Sub4_Sub1_4 = null;
		Static51.aClass3_Sub1_Sub4_Sub1_1 = null;
		Static184.anIntArray497 = null;
		Static144.aClass3_Sub1_Sub4_Sub1Array9 = null;
		Static130.anIntArray380 = null;
		Static82.aClass3_Sub1_Sub4_Sub1_2 = null;
		Static136.aClass3_Sub1_Sub4_Sub1Array7 = null;
		Static147.aClass3_Sub1_Sub4_Sub4_31 = null;
		Static126.aClass3_Sub1_Sub4_Sub1Array6 = null;
		Static144.anIntArray408 = null;
		Static59.anIntArray172 = null;
		Static190.aClass3_Sub1_Sub4_Sub4_40 = null;
		Static170.anIntArray462 = null;
		Static90.anIntArray227 = null;
		Static151.anIntArray431 = null;
		Static98.aClass3_Sub1_Sub4_Sub1Array4 = null;
		Static31.anIntArray94 = null;
		Static128.method1942();
		Static97.method1466(true);
		Static5.aBoolean17 = false;
	}
}

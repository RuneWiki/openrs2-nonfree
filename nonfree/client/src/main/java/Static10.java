import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!be", name = "mb", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!be", name = "nb", descriptor = "Lclient!r;")
	public static Class2_Sub4_Sub2 aClass2_Sub4_Sub2_1;

	@OriginalMember(owner = "client!be", name = "wb", descriptor = "[I")
	public static int[] anIntArray34;

	@OriginalMember(owner = "client!be", name = "xb", descriptor = "I")
	public static int anInt251;

	@OriginalMember(owner = "client!be", name = "Y", descriptor = "Lclient!ke;")
	public static Class39 aClass39_113 = Static2.method66("leuchten2:");

	@OriginalMember(owner = "client!be", name = "cb", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!be", name = "db", descriptor = "Lclient!ke;")
	public static Class39 aClass39_114 = Static2.method66("mod_icons");

	@OriginalMember(owner = "client!be", name = "gb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_115 = Static2.method66("@or3@");

	@OriginalMember(owner = "client!be", name = "hb", descriptor = "I")
	public static int anInt244 = 0;

	@OriginalMember(owner = "client!be", name = "ob", descriptor = "I")
	public static int anInt248 = 0;

	@OriginalMember(owner = "client!be", name = "qb", descriptor = "Lclient!ke;")
	private static Class39 aClass39_117 = Static2.method66("Loading fonts )2 ");

	@OriginalMember(owner = "client!be", name = "pb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_116 = aClass39_117;

	@OriginalMember(owner = "client!be", name = "rb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_118 = Static2.method66(":");

	@OriginalMember(owner = "client!be", name = "sb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_119 = Static2.method66("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!be", name = "tb", descriptor = "I")
	public static int anInt249 = 0;

	@OriginalMember(owner = "client!be", name = "ub", descriptor = "I")
	public static int anInt250 = 0;

	@OriginalMember(owner = "client!be", name = "vb", descriptor = "Z")
	public static boolean aBoolean10 = false;

	@OriginalMember(owner = "client!be", name = "yb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_120 = Static2.method66("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!be", name = "f", descriptor = "(I)V")
	public static void method162() {
		anIntArray34 = null;
		aClass39_116 = null;
		aClass39_114 = null;
		aClass39_119 = null;
		aClass39_117 = null;
		aClass39_120 = null;
		aBigInteger1 = null;
		aClass39_118 = null;
		aClass2_Sub4_Sub2_1 = null;
		aClass39_115 = null;
		aClass39_113 = null;
		aByteArrayArray2 = null;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(Z)V")
	public static void method165() {
		Static27.aClass34_16 = new Class34();
	}

	@OriginalMember(owner = "client!be", name = "h", descriptor = "(I)V")
	public static void method167() {
		Static7.aClass54_4.method1635();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IZ)V")
	public static void method169(@OriginalArg(1) boolean arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static95.anInt2510; local12++) {
			@Pc(20) Class2_Sub1_Sub2_Sub3_Sub2 local20 = Static27.aClass2_Sub1_Sub2_Sub3_Sub2Array1[Static50.anIntArray193[local12]];
			@Pc(28) int local28 = (Static50.anIntArray193[local12] << 14) + 536870912;
			if (local20 != null && local20.method2067() && local20.aClass2_Sub1_Sub8_1.aBoolean74 == arg0 && local20.aClass2_Sub1_Sub8_1.method946()) {
				@Pc(57) int local57 = local20.anInt2896 >> 7;
				@Pc(62) int local62 = local20.anInt2899 >> 7;
				if (local57 >= 0 && local57 < 104 && local62 >= 0 && local62 < 104) {
					if (local20.anInt2898 == 1 && (local20.anInt2896 & 0x7F) == 64 && (local20.anInt2899 & 0x7F) == 64) {
						if (Static94.anInt2479 == Static39.anIntArrayArray12[local57][local62]) {
							continue;
						}
						Static39.anIntArrayArray12[local57][local62] = Static94.anInt2479;
					}
					if (!local20.aClass2_Sub1_Sub8_1.aBoolean72) {
						local28 += Integer.MIN_VALUE;
					}
					Static77.aClass43_1.method1180(Static18.anInt560, local20.anInt2896, local20.anInt2899, Static51.method1779((local20.anInt2898 - 1) * 64 + local20.anInt2899, (local20.anInt2898 + -1) * 64 + local20.anInt2896, Static18.anInt560), local20.anInt2898 * 64 + 60 - 64, local20, local20.anInt2909, local28, local20.aBoolean135);
				}
			}
		}
	}
}

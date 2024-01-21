import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "Lclient!he;")
	public static Class30 aClass30_3;

	@OriginalMember(owner = "client!ja", name = "t", descriptor = "Lclient!qc;")
	private static Class60 aClass60_517 = Static121.method2047("glow3:");

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "Lclient!qc;")
	public static Class60 aClass60_514 = aClass60_517;

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
	public static int anInt1339 = 0;

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "Lclient!qc;")
	public static Class60 aClass60_515 = aClass60_517;

	@OriginalMember(owner = "client!ja", name = "o", descriptor = "Lclient!tb;")
	public static Class70 aClass70_12 = new Class70();

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "Lclient!qc;")
	public static Class60 aClass60_516 = Static121.method2047("scrollbar");

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "[S")
	public static short[] aShortArray8 = new short[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486 };

	@OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
	public static int anInt1346 = 0;

	@OriginalMember(owner = "client!ja", name = "u", descriptor = "Lclient!qc;")
	public static Class60 aClass60_518 = Static121.method2047("(U0a )2 via: ");

	@OriginalMember(owner = "client!ja", name = "v", descriptor = "I")
	public static int anInt1347 = 0;

	@OriginalMember(owner = "client!ja", name = "w", descriptor = "I")
	public static int anInt1348 = -1;

	@OriginalMember(owner = "client!ja", name = "x", descriptor = "I")
	public static int anInt1349 = 1;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
	public static void method975() {
		Static85.anInt2030 = 0;
		Static128.anInt2631 = 0;
		Static123.method2065();
		Static63.method1272();
		Static130.method2138();
		Static64.method1281();
		@Pc(27) int local27;
		for (@Pc(21) int local21 = 0; local21 < Static128.anInt2631; local21++) {
			local27 = Static73.anIntArray190[local21];
			if (Static81.anInt1944 != Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[local27].anInt2592) {
				Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[local27] = null;
			}
		}
		if (Static78.anInt1911 != Static105.aClass4_Sub13_Sub1_3.anInt1643) {
			throw new RuntimeException("gpp1 pos:" + Static105.aClass4_Sub13_Sub1_3.anInt1643 + " psize:" + Static78.anInt1911);
		}
		for (local27 = 0; local27 < Static43.anInt1107; local27++) {
			if (Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[Static94.anIntArray231[local27]] == null) {
				throw new RuntimeException("gpp2 pos:" + local27 + " size:" + Static43.anInt1107);
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
	public static void method976() {
		aClass60_517 = null;
		aClass60_515 = null;
		aShortArray8 = null;
		aClass60_516 = null;
		aClass60_518 = null;
		aClass60_514 = null;
		aClass30_3 = null;
		aClass70_12 = null;
	}
}

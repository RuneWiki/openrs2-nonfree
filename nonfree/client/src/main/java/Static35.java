import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "[Lclient!ib;")
	public static Class4_Sub4_Sub3_Sub2[] aClass4_Sub4_Sub3_Sub2Array3;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "[I")
	public static int[] anIntArray68 = new int[2048];

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "Lclient!qc;")
	private static Class60 aClass60_383 = Static121.method2047("Loading fonts )2 ");

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "Lclient!qc;")
	public static Class60 aClass60_379 = aClass60_383;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
	public static int anInt913 = 127;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "Lclient!qc;")
	public static Class60 aClass60_380 = Static121.method2047(":duelreq:");

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
	public static int anInt914 = 0;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
	public static int anInt915 = 2;

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "Lclient!qc;")
	public static Class60 aClass60_381 = Static121.method2047("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "Lclient!qc;")
	public static Class60 aClass60_382 = Static121.method2047("l");

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
	public static void method631() {
		aClass60_381 = null;
		aClass60_380 = null;
		aClass60_382 = null;
		anIntArray68 = null;
		aClass60_383 = null;
		aClass60_379 = null;
		aClass4_Sub4_Sub3_Sub2Array3 = null;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIZ)V")
	public static void method632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static26.anInt725 != 0 && Static26.anInt725 != 3 || Static3.anInt28 != 1) {
			return;
		}
		@Pc(26) int local26 = Static128.anInt2648 - arg1 - 25;
		@Pc(32) int local32 = Static22.anInt652 - arg0 - 5;
		if (local26 < 0 || local32 < 0 || local26 >= 146 || local32 >= 151) {
			return;
		}
		local26 -= 73;
		local32 -= 75;
		@Pc(56) int local56 = Static52.anInt1339 + Static129.anInt3002 & 0x7FF;
		@Pc(60) int local60 = Class4_Sub4_Sub3_Sub3.anIntArray217[local56];
		@Pc(64) int local64 = Class4_Sub4_Sub3_Sub3.anIntArray214[local56];
		@Pc(72) int local72 = local64 * (Static17.anInt453 + 256) >> 8;
		@Pc(80) int local80 = local60 * (Static17.anInt453 + 256) >> 8;
		@Pc(90) int local90 = local32 * local72 + local80 * local26 >> 11;
		@Pc(101) int local101 = local80 * local32 - local72 * local26 >> 11;
		@Pc(108) int local108 = Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2601 - local101 >> 7;
		@Pc(116) int local116 = Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2620 + local90 >> 7;
		@Pc(136) boolean local136 = Static99.method1760(1, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], 0, 0, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], 0, local108, 0, 0, local116, true);
		if (!local136) {
			return;
		}
		Static56.aClass4_Sub13_Sub1_1.method1209(local26);
		Static56.aClass4_Sub13_Sub1_1.method1209(local32);
		Static56.aClass4_Sub13_Sub1_1.method1252(Static52.anInt1339);
		Static56.aClass4_Sub13_Sub1_1.method1209(57);
		Static56.aClass4_Sub13_Sub1_1.method1209(Static129.anInt3002);
		Static56.aClass4_Sub13_Sub1_1.method1209(Static17.anInt453);
		Static56.aClass4_Sub13_Sub1_1.method1209(89);
		Static56.aClass4_Sub13_Sub1_1.method1252(Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2620);
		Static56.aClass4_Sub13_Sub1_1.method1252(Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2601);
		Static56.aClass4_Sub13_Sub1_1.method1209(Static105.anInt2514);
		Static56.aClass4_Sub13_Sub1_1.method1209(63);
		return;
	}
}

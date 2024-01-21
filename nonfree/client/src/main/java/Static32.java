import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!f", name = "o", descriptor = "[Lclient!ta;")
	public static Class4_Sub20[] aClass4_Sub20Array1;

	@OriginalMember(owner = "client!f", name = "v", descriptor = "Lclient!q;")
	public static Class4_Sub2_Sub3_Sub4 aClass4_Sub2_Sub3_Sub4_2;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "Lclient!c;")
	public static Class12 aClass12_22 = new Class12(100);

	@OriginalMember(owner = "client!f", name = "c", descriptor = "Lclient!ja;")
	public static Class39 aClass39_434 = Static28.method504("blinken1:");

	@OriginalMember(owner = "client!f", name = "d", descriptor = "Lclient!ja;")
	private static Class39 aClass39_435 = Static28.method504("Examine");

	@OriginalMember(owner = "client!f", name = "i", descriptor = "Lclient!ja;")
	public static Class39 aClass39_436 = aClass39_435;

	@OriginalMember(owner = "client!f", name = "p", descriptor = "Lclient!ja;")
	private static Class39 aClass39_440 = Static28.method504("Please remove ");

	@OriginalMember(owner = "client!f", name = "l", descriptor = "Lclient!ja;")
	public static Class39 aClass39_437 = aClass39_440;

	@OriginalMember(owner = "client!f", name = "n", descriptor = "Lclient!ja;")
	private static Class39 aClass39_439 = Static28.method504("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!f", name = "m", descriptor = "Lclient!ja;")
	public static Class39 aClass39_438 = aClass39_439;

	@OriginalMember(owner = "client!f", name = "w", descriptor = "Lclient!ja;")
	private static Class39 aClass39_444 = Static28.method504("You have only just left another world)3");

	@OriginalMember(owner = "client!f", name = "q", descriptor = "Lclient!ja;")
	public static Class39 aClass39_441 = aClass39_444;

	@OriginalMember(owner = "client!f", name = "r", descriptor = "Lclient!ja;")
	public static Class39 aClass39_442 = Static28.method504("Die Verbindung konnte");

	@OriginalMember(owner = "client!f", name = "s", descriptor = "Lclient!ja;")
	public static Class39 aClass39_443 = aClass39_440;

	@OriginalMember(owner = "client!f", name = "t", descriptor = "I")
	public static int anInt831 = 1;

	@OriginalMember(owner = "client!f", name = "u", descriptor = "[I")
	public static int[] anIntArray93 = new int[200];

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)V")
	public static void method546(@OriginalArg(0) int arg0) {
		@Pc(15) Class4_Sub13 local15 = (Class4_Sub13) Static49.aClass42_7.method1055((long) arg0);
		if (local15 != null) {
			local15.method2189();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
	public static void method547() {
		Static113.anInt2837 = 0;
		Static30.anInt785 = 0;
		Static94.method1700();
		Static51.method1807();
		Static26.method434();
		Static46.method768();
		@Pc(30) int local30;
		for (@Pc(24) int local24 = 0; local24 < Static113.anInt2837; local24++) {
			local30 = Static38.anIntArray103[local24];
			if (Static71.anInt1738 != Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[local30].anInt2681) {
				Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[local30] = null;
			}
		}
		if (Static35.aClass4_Sub16_Sub1_1.anInt2019 != Static97.anInt2446) {
			throw new RuntimeException("gpp1 pos:" + Static35.aClass4_Sub16_Sub1_1.anInt2019 + " psize:" + Static97.anInt2446);
		}
		for (local30 = 0; local30 < Static122.anInt3021; local30++) {
			if (Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[Static116.anIntArray312[local30]] == null) {
				throw new RuntimeException("gpp2 pos:" + local30 + " size:" + Static122.anInt3021);
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(B)V")
	public static void method548() {
		aClass39_440 = null;
		aClass39_435 = null;
		aClass4_Sub20Array1 = null;
		aClass39_437 = null;
		aClass39_439 = null;
		aClass39_444 = null;
		aClass39_434 = null;
		anIntArray93 = null;
		aClass39_436 = null;
		aClass39_441 = null;
		aClass39_443 = null;
		aClass39_442 = null;
		aClass39_438 = null;
		aClass4_Sub2_Sub3_Sub4_2 = null;
		aClass12_22 = null;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZZLclient!pd;Lclient!mf;Lclient!pd;)V")
	public static void method549(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class20 arg1, @OriginalArg(3) Class4_Sub2_Sub3_Sub3 arg2, @OriginalArg(4) Class20 arg3) {
		Static82.aClass20_40 = arg3;
		Static46.aClass20_28 = arg1;
		Static24.aBoolean19 = arg0;
		Static46.aClass20_28.method471(10);
		Static10.aClass4_Sub2_Sub3_Sub3_1 = arg2;
	}
}

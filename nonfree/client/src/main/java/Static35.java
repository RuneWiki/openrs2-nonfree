import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!fe", name = "x", descriptor = "[S")
	public static short[] aShortArray2;

	@OriginalMember(owner = "client!fe", name = "F", descriptor = "[Lclient!hb;")
	public static Class4_Sub1_Sub2_Sub3[] aClass4_Sub1_Sub2_Sub3Array2;

	@OriginalMember(owner = "client!fe", name = "J", descriptor = "Lclient!ea;")
	public static Class20 aClass20_18;

	@OriginalMember(owner = "client!fe", name = "N", descriptor = "I")
	public static int anInt879;

	@OriginalMember(owner = "client!fe", name = "R", descriptor = "Lclient!ea;")
	public static Class20 aClass20_19;

	@OriginalMember(owner = "client!fe", name = "A", descriptor = "Lclient!ec;")
	private static Class22 aClass22_243 = Static60.method1113("Use");

	@OriginalMember(owner = "client!fe", name = "B", descriptor = "Lclient!ec;")
	public static Class22 aClass22_244 = Static60.method1113(" (X");

	@OriginalMember(owner = "client!fe", name = "C", descriptor = "[I")
	public static int[] anIntArray95 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!fe", name = "S", descriptor = "Lclient!ec;")
	private static Class22 aClass22_248 = Static60.method1113(" has logged in)3");

	@OriginalMember(owner = "client!fe", name = "K", descriptor = "Lclient!ec;")
	public static Class22 aClass22_245 = aClass22_248;

	@OriginalMember(owner = "client!fe", name = "M", descriptor = "Lclient!ec;")
	public static Class22 aClass22_246 = aClass22_243;

	@OriginalMember(owner = "client!fe", name = "O", descriptor = "Lclient!ec;")
	public static Class22 aClass22_247 = Static60.method1113("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "(I)V")
	public static void method571() {
		Static50.anInt1405 = 0;
		Static84.anInt2252 = 0;
		Static78.method1304();
		Static119.method1861();
		Static28.method451();
		@Pc(23) int local23;
		for (@Pc(17) int local17 = 0; local17 < Static84.anInt2252; local17++) {
			local23 = Static23.anIntArray60[local17];
			if (Static12.aClass4_Sub1_Sub3_Sub2_Sub2Array1[local23].anInt2475 != Static117.anInt2877) {
				Static12.aClass4_Sub1_Sub3_Sub2_Sub2Array1[local23].aClass4_Sub1_Sub10_1 = null;
				Static12.aClass4_Sub1_Sub3_Sub2_Sub2Array1[local23] = null;
			}
		}
		if (Static133.aClass4_Sub11_Sub1_3.anInt1099 != Static96.anInt2463) {
			throw new RuntimeException("gnp1 pos:" + Static133.aClass4_Sub11_Sub1_3.anInt1099 + " psize:" + Static96.anInt2463);
		}
		for (local23 = 0; local23 < Static84.anInt2255; local23++) {
			if (Static12.aClass4_Sub1_Sub3_Sub2_Sub2Array1[Static13.anIntArray33[local23]] == null) {
				throw new RuntimeException("gnp2 pos:" + local23 + " size:" + Static84.anInt2255);
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V")
	public static void method572() {
		if (Static4.aClass6_1 != null) {
			Static4.aClass6_1.method136();
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
	public static void method574() {
		aClass20_19 = null;
		aClass4_Sub1_Sub2_Sub3Array2 = null;
		aClass20_18 = null;
		aClass22_246 = null;
		aShortArray2 = null;
		anIntArray95 = null;
		aClass22_248 = null;
		aClass22_247 = null;
		aClass22_244 = null;
		aClass22_245 = null;
		aClass22_243 = null;
	}
}

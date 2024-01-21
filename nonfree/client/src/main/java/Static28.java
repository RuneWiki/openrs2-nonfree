import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!ch", name = "Ab", descriptor = "I")
	public static int anInt833;

	@OriginalMember(owner = "client!ch", name = "Bb", descriptor = "I")
	public static int anInt834;

	@OriginalMember(owner = "client!ch", name = "sb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_2 = new Class4();

	@OriginalMember(owner = "client!ch", name = "wb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_290 = Static49.method1293(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!ch", name = "Db", descriptor = "Lclient!rf;")
	private static Class70 aClass70_294 = Static49.method1293("wishes to trade with you)3");

	@OriginalMember(owner = "client!ch", name = "xb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_291 = aClass70_294;

	@OriginalMember(owner = "client!ch", name = "yb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_292 = Static49.method1293("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!ch", name = "zb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_293 = Static49.method1293("Fps:");

	@OriginalMember(owner = "client!ch", name = "Cb", descriptor = "[I")
	public static int[] anIntArray54 = new int[1000];

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "(B)V")
	public static void method632() {
		aClass70_291 = null;
		aClass70_293 = null;
		aClass4_2 = null;
		aClass70_292 = null;
		anIntArray54 = null;
		aClass70_294 = null;
		aClass70_290 = null;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILclient!fa;)Lclient!p;")
	public static Class1_Sub2 method633(@OriginalArg(1) Class1_Sub9 arg0) {
		@Pc(9) int local9 = arg0.method1234();
		@Pc(18) int local18 = arg0.method1234();
		@Pc(24) Class local24 = Static141.method2759(local18);
		try {
			@Pc(28) Class1_Sub2 local28 = (Class1_Sub2) local24.getDeclaredConstructor().newInstance();
			if (local28 != null) {
				local28.anInt4429 = local9;
				local28.anInt4422 = arg0.method1234();
				@Pc(44) int local44 = arg0.method1234();
				for (@Pc(46) int local46 = 0; local46 < local44; local46++) {
					@Pc(52) int local52 = arg0.method1234();
					local28.method3393(local52, arg0);
				}
			}
			local28.method3389();
			return local28;
		} catch (@Pc(73) IllegalAccessException local73) {
			throw new RuntimeException();
		} catch (@Pc(78) InstantiationException local78) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "(I)V")
	public static void method634() {
		for (@Pc(3) int local3 = 0; local3 < Static161.anInt4212; local3++) {
			@Pc(14) int local14 = Static48.anIntArray167[local3];
			@Pc(18) Class1_Sub1_Sub4_Sub2_Sub1 local18 = Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[local14];
			@Pc(22) int local22 = Static98.aClass1_Sub9_Sub1_2.method1234();
			if ((local22 & 0x10) != 0) {
				local22 += Static98.aClass1_Sub9_Sub1_2.method1234() << 8;
			}
			Static79.method1808(local18, local14, local22);
		}
	}
}

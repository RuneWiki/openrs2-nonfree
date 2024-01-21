import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!oe", name = "H", descriptor = "I")
	public static int anInt2188;

	@OriginalMember(owner = "client!oe", name = "Q", descriptor = "I")
	public static int anInt2191;

	@OriginalMember(owner = "client!oe", name = "C", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1177 = Static106.method1849("FULL");

	@OriginalMember(owner = "client!oe", name = "F", descriptor = "I")
	public static volatile int anInt2186 = 0;

	@OriginalMember(owner = "client!oe", name = "I", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1178 = aClass66_1177;

	@OriginalMember(owner = "client!oe", name = "J", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1179 = Static106.method1849(")4slr)3ws?order=LPWM");

	@OriginalMember(owner = "client!oe", name = "K", descriptor = "Lclient!rb;")
	public static Class60 aClass60_63 = new Class60(200);

	@OriginalMember(owner = "client!oe", name = "N", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1180 = Static106.method1849("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!oe", name = "O", descriptor = "I")
	public static int anInt2190 = 0;

	@OriginalMember(owner = "client!oe", name = "P", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1181 = Static106.method1849("sl_stars");

	@OriginalMember(owner = "client!oe", name = "R", descriptor = "[I")
	public static int[] anIntArray362 = new int[128];

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZ)V")
	public static void method1498(@OriginalArg(0) int arg0) {
		if (arg0 == -1 && !Static53.aBoolean68) {
			Static27.method547();
		} else if (arg0 != -1 && arg0 != Static117.anInt2749 && Static124.anInt2862 != 0 && !Static53.aBoolean68) {
			Static33.method627(0, arg0, Static28.aClass5_Sub1_8, Static124.anInt2862);
		}
		Static117.anInt2749 = arg0;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
	public static void method1499() {
		if (!Static84.aBoolean92) {
			return;
		}
		Static96.aClass1_Sub1_Sub2_Sub3_5 = null;
		Static92.aClass1_Sub1_Sub2_Sub3_4 = null;
		Static4.aClass1_Sub1_Sub2_Sub3Array1 = null;
		Static89.aClass1_Sub1_Sub2_Sub3_2 = null;
		Static126.aClass1_Sub1_Sub2_Sub1_15 = null;
		Static27.anIntArray104 = null;
		Static58.aClass1_Sub1_Sub2_Sub3Array7 = null;
		Static123.anIntArray488 = null;
		Static43.anIntArray198 = null;
		Static127.aClass1_Sub1_Sub2_Sub1_16 = null;
		Static86.aClass1_Sub1_Sub2_Sub3_1 = null;
		Static35.anIntArray115 = null;
		Static6.anIntArray51 = null;
		Static42.anIntArray192 = null;
		Static15.anIntArray500 = null;
		Static35.aClass1_Sub1_Sub2_Sub3Array2 = null;
		Static35.aClass1_Sub1_Sub2_Sub3Array3 = null;
		Static84.aClass1_Sub1_Sub2_Sub3Array9 = null;
		Static20.anIntArray85 = null;
		Static15.aClass1_Sub1_Sub2_Sub1Array70 = null;
		Static101.method1767();
		Static86.method1613(true);
		Static84.aBoolean92 = false;
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)V")
	public static void method1500() {
		aClass66_1181 = null;
		aClass66_1179 = null;
		aClass60_63 = null;
		aClass66_1177 = null;
		aClass66_1180 = null;
		anIntArray362 = null;
		aClass66_1178 = null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BI)V")
	public static void method1501(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static51.method1090(arg0)) {
			return;
		}
		@Pc(23) Class1_Sub10[] local23 = Static100.aClass1_Sub10ArrayArray1[arg0];
		for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
			@Pc(31) Class1_Sub10 local31 = local23[local25];
			if (local31.anObjectArray24 != null) {
				@Pc(38) Class1_Sub5 local38 = new Class1_Sub5();
				local38.aClass1_Sub10_1 = local31;
				local38.anObjectArray3 = local31.anObjectArray24;
				Static38.method2005(local38);
			}
		}
	}
}

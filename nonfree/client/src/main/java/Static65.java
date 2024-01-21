import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
	public static int anInt1954;

	@OriginalMember(owner = "client!lf", name = "B", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1049 = Static106.method1849("Hierhin gehen");

	@OriginalMember(owner = "client!lf", name = "C", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1050 = Static106.method1849("<col=40ff00>");

	@OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
	public static int anInt1950 = 128;

	@OriginalMember(owner = "client!lf", name = "E", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1051 = Static106.method1849("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!lf", name = "G", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1052 = Static106.method1849("Freie Welt");

	@OriginalMember(owner = "client!lf", name = "Q", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1053 = aClass66_1051;

	@OriginalMember(owner = "client!lf", name = "ab", descriptor = "[I")
	public static int[] anIntArray310 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!lf", name = "eb", descriptor = "[I")
	public static int[] anIntArray311 = new int[500];

	@OriginalMember(owner = "client!lf", name = "jb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1054 = Static106.method1849("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!sf;Lclient!gf;ZZLclient!sf;)V")
	public static void method1368(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub2_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class5 arg3) {
		Static111.aClass5_82 = arg3;
		Static67.aClass5_49 = arg0;
		Static48.aBoolean63 = arg2;
		Static111.aClass5_82.method106(10);
		Static97.aClass1_Sub1_Sub2_Sub2_Sub1_2 = arg1;
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(B)V")
	public static void method1370() {
		anIntArray310 = null;
		anIntArray311 = null;
		aClass66_1052 = null;
		aClass66_1054 = null;
		aClass66_1050 = null;
		aClass66_1051 = null;
		aClass66_1053 = null;
		aClass66_1049 = null;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(JB)V")
	public static void method1371(@OriginalArg(0) long arg0) {
		if (arg0 != 0L) {
			Static127.aClass1_Sub12_Sub1_2.method1227(119);
			Static127.aClass1_Sub12_Sub1_2.method1195(arg0);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)V")
	public static void method1372(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static5.anInt228 < 2 && Static84.anInt2224 == 0 && !Static51.aBoolean65) {
			return;
		}
		@Pc(37) Class66 local37;
		if (Static84.anInt2224 == 1 && Static5.anInt228 < 2) {
			local37 = Static41.method897(new Class66[] { Static11.aClass66_241, Static50.aClass66_846, Static42.aClass66_710, Static63.aClass66_1018 });
		} else if (Static51.aBoolean65 && Static5.anInt228 < 2) {
			local37 = Static41.method897(new Class66[] { Static87.aClass66_1277, Static50.aClass66_846, Static27.aClass66_445, Static63.aClass66_1018 });
		} else {
			local37 = Static32.method621(Static5.anInt228 - 1);
		}
		if (Static5.anInt228 > 2) {
			local37 = Static41.method897(new Class66[] { local37, Static40.aClass66_704, Static88.method1632(Static5.anInt228 - 2), Static120.aClass66_1611 });
		}
		@Pc(130) int local130 = Static77.aClass1_Sub1_Sub2_Sub2_Sub1_1.method779(local37, arg1 + 4, arg0 + 15, Static63.aRandom1, Static93.anInt2398);
		Static14.method408(arg1 + 4, Static77.aClass1_Sub1_Sub2_Sub2_Sub1_1.method791(local37) + local130, 15, arg0);
	}
}

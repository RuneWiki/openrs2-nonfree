import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "J")
	public static long aLong95;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "[I")
	public static int[] anIntArray267;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "[Lclient!b;")
	public static Class1_Sub2_Sub2_Sub1[] aClass1_Sub2_Sub2_Sub1Array6;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "Lclient!fc;")
	private static Class25 aClass25_620 = Static78.method1313("Could not complete login)3");

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "Lclient!fc;")
	public static Class25 aClass25_621 = Static78.method1313("sl_arrows");

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
	public static int anInt1391 = 0;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "Lclient!fc;")
	public static Class25 aClass25_622 = Static78.method1313(")1");

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
	public static int anInt1392 = 0;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "[I")
	public static int[] anIntArray268 = new int[128];

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "Lclient!fc;")
	public static Class25 aClass25_623 = Static78.method1313("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "Lclient!fc;")
	public static Class25 aClass25_624 = Static78.method1313("logo");

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "Lclient!fc;")
	public static Class25 aClass25_625 = aClass25_620;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)Lclient!ob;")
	public static Class1_Sub2_Sub14 method1091(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class1_Sub2_Sub14 local7 = Static46.method968(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass1_Sub2_Sub14Array2 == null || local7.aClass1_Sub2_Sub14Array2.length <= arg1) {
			return null;
		} else {
			return local7.aClass1_Sub2_Sub14Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V")
	public static void method1092() {
		if (Static100.aClass77_5 != null) {
			Static100.aClass77_5.method1909();
			Static100.aClass77_5 = null;
		}
		Static50.method987();
		Static118.aClass4_1.method56();
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			Static102.aClass62Array1[local18].method1458();
		}
		System.gc();
		Static71.method1147();
		Static8.aBoolean5 = false;
		Static47.anInt1203 = -1;
		Static89.method423();
		Static99.method1645(10);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
	public static void method1093() {
		anIntArray268 = null;
		aClass1_Sub2_Sub2_Sub1Array6 = null;
		aClass25_625 = null;
		anIntArray267 = null;
		aClass25_624 = null;
		aClass25_620 = null;
		aClass25_621 = null;
		aClass25_623 = null;
		aClass25_622 = null;
	}
}

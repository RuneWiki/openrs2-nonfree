import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static53 {

	@OriginalMember(owner = "client!kc", name = "T", descriptor = "Lclient!ab;")
	public static Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_15;

	@OriginalMember(owner = "client!kc", name = "db", descriptor = "Lclient!ac;")
	public static Class3 aClass3_15;

	@OriginalMember(owner = "client!kc", name = "gb", descriptor = "Lclient!ob;")
	public static Class47 aClass47_3;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "Lclient!kc;")
	private static Class36 aClass36_699 = Static14.method2017("Please close the interface you have open before using (Wreport abuse(W");

	@OriginalMember(owner = "client!kc", name = "v", descriptor = "Lclient!wd;")
	public static Class2_Sub12 aClass2_Sub12_3 = new Class2_Sub12(8);

	@OriginalMember(owner = "client!kc", name = "A", descriptor = "I")
	public static int anInt1458 = 256;

	@OriginalMember(owner = "client!kc", name = "B", descriptor = "Lclient!kc;")
	public static Class36 aClass36_700 = aClass36_699;

	@OriginalMember(owner = "client!kc", name = "S", descriptor = "Lclient!kc;")
	public static Class36 aClass36_701 = Static14.method2017("Lade Texturen )2 ");

	@OriginalMember(owner = "client!kc", name = "W", descriptor = "Lclient!kc;")
	public static Class36 aClass36_702 = Static14.method2017("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!kc", name = "cb", descriptor = "I")
	public static int anInt1481 = 99;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IBILclient!ac;)[Lclient!nd;")
	public static Class2_Sub1_Sub1_Sub3[] method1008(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3 arg2) {
		return Static14.method2024(arg2, arg1, arg0) ? Static17.method337() : null;
	}

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "(I)V")
	public static void method1030() {
		aClass2_Sub1_Sub1_Sub1_15 = null;
		aClass36_699 = null;
		aClass47_3 = null;
		aClass2_Sub12_3 = null;
		aClass36_700 = null;
		aClass3_15 = null;
		aClass36_701 = null;
		aClass36_702 = null;
	}

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "(I)V")
	public static void method1031() {
		Static56.aClass22_22.method716();
		Static59.aClass22_23.method716();
	}

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "(I)V")
	public static void method1037() {
		Static9.aClass22_2.method716();
		Static67.aClass22_25.method716();
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZI)V")
	public static void method1039(@OriginalArg(1) int arg0) {
		for (Static22.anInt577 += arg0; Static22.anInt577 >= Static3.anInt1282; Static22.anInt577 -= Static3.anInt1282) {
			Static24.anInt618 -= Static24.anInt618 >> 2;
		}
		Static24.anInt618 -= arg0 * 1000;
		if (Static24.anInt618 < 0) {
			Static24.anInt618 = 0;
		}
	}
}

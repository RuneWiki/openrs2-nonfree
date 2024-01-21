import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
	public static int anInt3979;

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1446 = Static65.method1172("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1447 = Static65.method1172("mapscene");

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1448 = Static65.method1172("Untersuchen");

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1449 = Static65.method1172("::errortest");

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLclient!kb;)Z")
	public static boolean method2899(@OriginalArg(1) Class46 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(14) int local14 = 0; local14 < Static52.anInt1391; local14++) {
			if (arg0.method1389(Static158.aClass46Array23[local14])) {
				return true;
			}
		}
		return arg0.method1389(Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.aClass46_233);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZI)Z")
	public static boolean method2901(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
	public static void method2902() {
		aClass46_1446 = null;
		aClass46_1449 = null;
		aClass46_1447 = null;
		aClass46_1448 = null;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "Lclient!me;")
	public static Class44_Sub1 aClass44_Sub1_11;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1033 = Static65.method1172("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1035 = Static65.method1172(" is already on your ignore list)3");

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1034 = aClass46_1035;

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "[Lclient!ib;")
	public static Class3_Sub2_Sub1_Sub1_Sub2[] aClass3_Sub2_Sub1_Sub1_Sub2Array1 = new Class3_Sub2_Sub1_Sub1_Sub2[32768];

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIII)V")
	public static void method2150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static21.anInt3036; local3++) {
			if (Static119.anIntArray326[local3] + Static42.anIntArray104[local3] > arg2 && arg1 + arg2 > Static119.anIntArray326[local3] && arg0 < Static33.anIntArray68[local3] + Static54.anIntArray133[local3] && Static33.anIntArray68[local3] < arg3 + arg0) {
				Static77.aBooleanArray10[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
	public static void method2151() {
		aClass46_1034 = null;
		aClass46_1033 = null;
		aClass44_Sub1_11 = null;
		aClass46_1035 = null;
		aClass3_Sub2_Sub1_Sub1_Sub2Array1 = null;
	}
}

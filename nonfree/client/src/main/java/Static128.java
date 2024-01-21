import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!q", name = "q", descriptor = "Lclient!h;")
	public static Class33 aClass33_12;

	@OriginalMember(owner = "client!q", name = "s", descriptor = "Lclient!ob;")
	public static Class3_Sub2_Sub3_Sub3 aClass3_Sub2_Sub3_Sub3_32;

	@OriginalMember(owner = "client!q", name = "w", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1048 = Static65.method1172("Login");

	@OriginalMember(owner = "client!q", name = "n", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1045 = aClass46_1048;

	@OriginalMember(owner = "client!q", name = "o", descriptor = "Lclient!nb;")
	public static Class57 aClass57_19 = new Class57(500);

	@OriginalMember(owner = "client!q", name = "p", descriptor = "[Lclient!qf;")
	public static Class69[] aClass69Array1 = new Class69[4];

	@OriginalMember(owner = "client!q", name = "r", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1046 = Static65.method1172("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!q", name = "t", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1047 = Static65.method1172("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!q", name = "x", descriptor = "Z")
	public static final boolean aBoolean125 = false;

	@OriginalMember(owner = "client!q", name = "y", descriptor = "[Z")
	public static boolean[] aBooleanArray17 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(I)Z")
	public static boolean method2159() {
		try {
			if (Static22.anInt527 == 2) {
				if (Static157.aClass3_Sub21_1 == null) {
					Static157.aClass3_Sub21_1 = Static187.method2402(Static88.aClass44_15, Static167.anInt739, Static54.anInt1417);
					if (Static157.aClass3_Sub21_1 == null) {
						return false;
					}
				}
				if (Static21.aClass61_2 == null) {
					Static21.aClass61_2 = new Class61(Static72.aClass44_12, Static15.aClass44_2);
				}
				if (Static125.aClass3_Sub5_Sub2_2.method2294(Static100.aClass44_18, Static21.aClass61_2, Static157.aClass3_Sub21_1)) {
					Static125.aClass3_Sub5_Sub2_2.method2285();
					Static125.aClass3_Sub5_Sub2_2.method2315(Static77.anInt1924);
					Static125.aClass3_Sub5_Sub2_2.method2296(Static157.aClass3_Sub21_1, Static146.aBoolean140);
					Static157.aClass3_Sub21_1 = null;
					Static22.anInt527 = 0;
					Static88.aClass44_15 = null;
					Static21.aClass61_2 = null;
					return true;
				}
			}
		} catch (@Pc(62) Exception local62) {
			local62.printStackTrace();
			Static125.aClass3_Sub5_Sub2_2.method2310();
			Static22.anInt527 = 0;
			Static88.aClass44_15 = null;
			Static21.aClass61_2 = null;
			Static157.aClass3_Sub21_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V")
	public static void method2160() {
		aClass46_1048 = null;
		aClass69Array1 = null;
		aClass57_19 = null;
		aClass46_1045 = null;
		aClass33_12 = null;
		aClass3_Sub2_Sub3_Sub3_32 = null;
		aClass46_1046 = null;
		aClass46_1047 = null;
		aBooleanArray17 = null;
	}
}

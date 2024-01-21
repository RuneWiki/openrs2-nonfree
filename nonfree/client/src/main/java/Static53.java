import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "Lclient!me;")
	public static Class44_Sub1 aClass44_Sub1_4;

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "Lclient!bb;")
	public static Class6 aClass6_3;

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "Lclient!me;")
	public static Class44_Sub1 aClass44_Sub1_5;

	@OriginalMember(owner = "client!gg", name = "m", descriptor = "[Lclient!ob;")
	public static Class3_Sub2_Sub3_Sub3[] aClass3_Sub2_Sub3_Sub3Array3;

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
	public static int anInt1393 = 0;

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "Lclient!kb;")
	private static Class46 aClass46_458 = Static65.method1172("Error connecting to server)3");

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "J")
	public static long aLong54 = 0L;

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "[Lclient!gd;")
	public static Class29[] aClass29Array1 = new Class29[6];

	@OriginalMember(owner = "client!gg", name = "h", descriptor = "Lclient!kb;")
	private static Class46 aClass46_459 = Static65.method1172("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!gg", name = "i", descriptor = "Lclient!kb;")
	private static Class46 aClass46_460 = Static65.method1172("Unable to find ");

	@OriginalMember(owner = "client!gg", name = "j", descriptor = "Lclient!kb;")
	public static Class46 aClass46_461 = aClass46_458;

	@OriginalMember(owner = "client!gg", name = "k", descriptor = "Lclient!kb;")
	public static Class46 aClass46_462 = aClass46_459;

	@OriginalMember(owner = "client!gg", name = "l", descriptor = "Lclient!kb;")
	public static Class46 aClass46_463 = aClass46_460;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
	public static void method1007() {
		aClass3_Sub2_Sub3_Sub3Array3 = null;
		aClass6_3 = null;
		aClass29Array1 = null;
		aClass44_Sub1_5 = null;
		aClass46_462 = null;
		aClass46_460 = null;
		aClass46_459 = null;
		aClass46_461 = null;
		aClass46_458 = null;
		aClass44_Sub1_4 = null;
		aClass46_463 = null;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
	public static void method1008() {
		for (@Pc(6) Class3_Sub15 local6 = (Class3_Sub15) Static86.aClass59_6.method1731(); local6 != null; local6 = (Class3_Sub15) Static86.aClass59_6.method1734()) {
			if (local6.aClass3_Sub5_Sub4_2 != null) {
				Static163.aClass3_Sub5_Sub3_2.method2451(local6.aClass3_Sub5_Sub4_2);
				local6.aClass3_Sub5_Sub4_2 = null;
			}
			if (local6.aClass3_Sub5_Sub4_1 != null) {
				Static163.aClass3_Sub5_Sub3_2.method2451(local6.aClass3_Sub5_Sub4_1);
				local6.aClass3_Sub5_Sub4_1 = null;
			}
		}
		Static86.aClass59_6.method1741();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!ng", name = "w", descriptor = "[I")
	public static int[] anIntArray282;

	@OriginalMember(owner = "client!ng", name = "D", descriptor = "I")
	public static int anInt2828;

	@OriginalMember(owner = "client!ng", name = "x", descriptor = "[I")
	public static final int[] anIntArray283 = new int[50];

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)V")
	public static void method2175(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class2_Sub2_Sub4 local3 = Static82.method1483(arg0);
		@Pc(6) int local6 = local3.anInt590;
		@Pc(13) int local13 = local3.anInt585;
		@Pc(16) int local16 = local3.anInt592;
		@Pc(23) int local23 = Class2_Sub2_Sub10.anIntArray107[local16 - local6];
		if (arg1 < 0 || arg1 > local23) {
			arg1 = 0;
		}
		local23 <<= local6;
		Static14.anIntArray235[local13] = local23 & arg1 << local6 | Static14.anIntArray235[local13] & ~local23;
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)I")
	public static int method2177() {
		return Static172.anInt3534;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(Z)V")
	public static void method2178() {
		Static175.method2695();
		Static85.method1505();
		Static153.method2517();
		method2180();
		Static16.method1832();
		Static213.method3233();
		Static211.method3196();
		Static203.method3081();
		Static61.method1177();
		Static174.method2691();
		Static100.method1728();
		Static144.method2305();
		((Class39) Static24.anInterface3_1).method1297();
		Static192.aClass86_49.method2641();
		Static18.aClass28_Sub1_13.method863();
		Static68.aClass28_Sub1_10.method863();
		Static44.aClass28_Sub1_7.method863();
		Static137.aClass28_Sub1_21.method863();
		Static32.aClass28_Sub1_3.method863();
		Static157.aClass28_Sub1_23.method863();
		Static160.aClass28_Sub1_24.method863();
		Static113.aClass28_Sub1_18.method863();
		Static197.aClass28_Sub1_25.method863();
		Static125.aClass28_Sub1_19.method863();
		Static211.aClass28_Sub1_27.method863();
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BI)Lclient!qe;")
	public static Class83 method2179(@OriginalArg(1) int arg0) {
		return Static37.method756(arg0, false);
	}

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)V")
	private static void method2180() {
		Static16.aClass86_31.method2641();
		Static191.aClass91_14.method2709();
		Static169.aClass91_12.method2709();
		Static177.aClass91_13.method2709();
	}
}

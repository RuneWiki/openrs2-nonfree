import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!io", name = "a", descriptor = "Lclient!ta;")
	public static Class231 aClass231_4;

	@OriginalMember(owner = "client!io", name = "f", descriptor = "[Lclient!hr;")
	public static Class103[] aClass103Array1;

	@OriginalMember(owner = "client!io", name = "g", descriptor = "[Lclient!o;")
	public static Class55[] aClass55Array1;

	@OriginalMember(owner = "client!io", name = "c", descriptor = "Lclient!la;")
	public static final Class136 aClass136_89 = new Class136(46, -1);

	@OriginalMember(owner = "client!io", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray17 = new String[5];

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(I)V")
	public static void method2853() {
		if (!Static73.aBoolean88) {
			return;
		}
		@Pc(11) Class82 local11 = Static360.method5048(Static102.anInt1846, Static327.anInt5460);
		if (local11 != null && local11.anObjectArray5 != null) {
			@Pc(20) Class3_Sub15 local20 = new Class3_Sub15();
			local20.anObjectArray3 = local11.anObjectArray5;
			local20.aClass82_1 = local11;
			Static219.method3217(local20);
		}
		Static73.aBoolean88 = false;
		Static302.anInt5198 = -1;
		Static138.anInt2449 = -1;
		if (local11 != null) {
			Static463.method6297(local11);
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2854(@OriginalArg(1) String arg0) {
		if (!Static73.aBoolean88) {
			return;
		}
		@Pc(10) boolean local10 = false;
		@Pc(12) int local12 = Static271.anInt4534;
		@Pc(14) int[] local14 = Static215.anIntArray267;
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			@Pc(30) Class1_Sub2_Sub6_Sub2 local30 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local14[local22]];
			if (local30 != null && local30 != Static203.aClass1_Sub2_Sub6_Sub2_1 && local30.aString69 != null && local30.aString69.equalsIgnoreCase(arg0)) {
				Static307.method4633(Static285.aClass163_117);
				Static243.aClass3_Sub25_Sub1_7.method4077(Static138.anInt2449);
				Static243.aClass3_Sub25_Sub1_7.method4106(local14[local22]);
				Static243.aClass3_Sub25_Sub1_7.method4084(0);
				Static243.aClass3_Sub25_Sub1_7.method4105(Static327.anInt5460);
				Static243.aClass3_Sub25_Sub1_7.method4077(Static102.anInt1846);
				Static39.method636(0, local30.anIntArray509[0], local30.method6204(), -2, 0, local30.method6204(), true, local30.anIntArray510[0]);
				local10 = true;
				break;
			}
		}
		if (!local10) {
			Static370.method5160(Static85.aClass174_57.method4208(Static300.anInt5192) + arg0);
		}
		if (Static73.aBoolean88) {
			method2853();
		}
	}
}

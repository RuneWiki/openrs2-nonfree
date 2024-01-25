import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
	public static int anInt7141;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "Lclient!di;")
	public static final Class54 aClass54_104 = new Class54(22, 4);

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "Lclient!rm;")
	public static final Class216 aClass216_15 = new Class216(1);

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_26 = new Class214(8, 16);

	@OriginalMember(owner = "client!eb", name = "A", descriptor = "J")
	public static long aLong216 = -1L;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIILclient!ei;)V")
	public static void method5638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub1 arg3) {
		@Pc(4) Class106 local4 = Static292.method4206(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass3_Sub1_2 = arg3;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)V")
	public static void method5642(@OriginalArg(0) int arg0) {
		Static170.anInt3362 = arg0;
		Static377.anInt6398 = 100;
		Static441.anInt300 = -1;
		Static338.anInt6358 = 3;
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)V")
	public static void method5644() {
		Static149.method2452(Static12.aClass79_Sub1_1.aBoolean358);
		Static164.aClass2_Sub3_Sub4_4 = new Class2_Sub3_Sub4();
		Static164.aClass2_Sub3_Sub4_4.method4653();
		Static366.aClass18_2 = Static234.method3657(0, Static339.aCanvas7, 22050, Static43.aClass59_5);
		Static366.aClass18_2.method5633(Static164.aClass2_Sub3_Sub4_4);
		Static74.method1385(Static453.aClass160_92, Static167.aClass160_28, Static285.aClass160_58, Static164.aClass2_Sub3_Sub4_4);
		Static151.aClass18_1 = Static234.method3657(1, Static339.aCanvas7, 2048, Static43.aClass59_5);
		Static260.aClass2_Sub3_Sub1_2 = new Class2_Sub3_Sub1();
		Static151.aClass18_1.method5633(Static260.aClass2_Sub3_Sub1_2);
		Static380.aClass63_1 = new Class63(22050, Static410.anInt6842);
		Static77.anInt1722 = Static186.aClass160_34.method3704("scape main");
	}
}

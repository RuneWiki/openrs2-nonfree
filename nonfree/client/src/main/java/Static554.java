import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static554 {

	@OriginalMember(owner = "client!tq", name = "q", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!tq", name = "m", descriptor = "Lclient!baa;")
	public static final Class25 aClass25_41 = new Class25(16);

	@OriginalMember(owner = "client!tq", name = "r", descriptor = "Lclient!uv;")
	public static Class344 aClass344_13 = null;

	@OriginalMember(owner = "client!tq", name = "s", descriptor = "S")
	public static short aShort107 = 1;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
	public static void method7877() {
		Static511.aClass82_16.xa(((float) Static32.aClass3_Sub41_3.aClass7_Sub24_1.method7021() * 0.1F + 0.7F) * Static462.aFloat151);
		Static511.aClass82_16.ZA(Static21.anInt292, Static15.aFloat2, Static454.aFloat150, (float) (Static65.anInt1293 << 2), (float) (Static587.anInt9514 << 2), (float) (Static342.anInt6329 << 2));
		Static511.aClass82_16.method6145(Static28.aClass141_1);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILjava/lang/String;IIB)V")
	public static void method7878(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class344 local8 = Static258.method4328(arg3, arg0);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray23 != null) {
			@Pc(18) Class3_Sub36 local18 = new Class3_Sub36();
			local18.aString50 = arg1;
			local18.aClass344_6 = local8;
			local18.anObjectArray1 = local8.anObjectArray23;
			local18.anInt6958 = arg2;
			Static400.method6288(local18);
		}
		if (Static82.anInt1653 != 10 || !Static76.method1311(local8).method8091(arg2 - 1)) {
			return;
		}
		@Pc(67) Class3_Sub27 local67;
		if (arg2 == 1) {
			local67 = Static59.method1040(Static325.aClass20_2, Static84.aClass314_133);
			Static182.method2981(arg3, local8.anInt9567, arg0, local67);
			Static148.method2572(local67);
		}
		if (arg2 == 2) {
			local67 = Static59.method1040(Static325.aClass20_2, Static119.aClass314_41);
			Static182.method2981(arg3, local8.anInt9567, arg0, local67);
			Static148.method2572(local67);
		}
		if (arg2 == 3) {
			local67 = Static59.method1040(Static325.aClass20_2, Static485.aClass314_120);
			Static182.method2981(arg3, local8.anInt9567, arg0, local67);
			Static148.method2572(local67);
		}
		if (arg2 == 4) {
			local67 = Static59.method1040(Static325.aClass20_2, Static165.aClass314_54);
			Static182.method2981(arg3, local8.anInt9567, arg0, local67);
			Static148.method2572(local67);
		}
		if (arg2 == 5) {
			local67 = Static59.method1040(Static325.aClass20_2, Static264.aClass314_118);
			Static182.method2981(arg3, local8.anInt9567, arg0, local67);
			Static148.method2572(local67);
		}
		if (arg2 == 6) {
			local67 = Static59.method1040(Static325.aClass20_2, Static22.aClass314_6);
			Static182.method2981(arg3, local8.anInt9567, arg0, local67);
			Static148.method2572(local67);
		}
		if (arg2 == 7) {
			local67 = Static59.method1040(Static325.aClass20_2, Static463.aClass314_113);
			Static182.method2981(arg3, local8.anInt9567, arg0, local67);
			Static148.method2572(local67);
		}
		if (arg2 == 8) {
			local67 = Static59.method1040(Static325.aClass20_2, Static488.aClass314_123);
			Static182.method2981(arg3, local8.anInt9567, arg0, local67);
			Static148.method2572(local67);
		}
		if (arg2 == 9) {
			local67 = Static59.method1040(Static325.aClass20_2, Static464.aClass314_115);
			Static182.method2981(arg3, local8.anInt9567, arg0, local67);
			Static148.method2572(local67);
		}
		if (arg2 == 10) {
			local67 = Static59.method1040(Static325.aClass20_2, Static354.aClass314_98);
			Static182.method2981(arg3, local8.anInt9567, arg0, local67);
			Static148.method2572(local67);
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IB)I")
	public static int method7881(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}
}

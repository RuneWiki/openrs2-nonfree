import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!efa", name = "e", descriptor = "Lclient!mda;")
	public static Class229 aClass229_1;

	@OriginalMember(owner = "client!efa", name = "f", descriptor = "[Lclient!cv;")
	public static Class12_Sub4[] aClass12_Sub4Array1;

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_56 = new Class44(45, 4);

	@OriginalMember(owner = "client!efa", name = "c", descriptor = "Z")
	public static boolean aBoolean202 = false;

	@OriginalMember(owner = "client!efa", name = "d", descriptor = "Lclient!vk;")
	public static final Class372 aClass372_4 = new Class372(0);

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(BZ)V")
	public static void method2105(@OriginalArg(1) boolean arg0) {
		if (Static258.aClass97_2 != null) {
			Static258.aClass97_2.method2286();
			Static258.aClass97_2 = null;
		}
		Static120.method7600();
		Static242.method3619();
		Static420.method6222();
		for (@Pc(26) int local26 = 0; local26 < 4; local26++) {
			Static226.aClass226Array3[local26].method5368();
		}
		Static631.method8821(false);
		System.gc();
		Static282.method4060();
		Static344.anInt11217 = -1;
		Static275.aBoolean329 = false;
		Static669.method9260();
		Static330.method5182(true);
		Static403.anInt7392 = 0;
		Static100.anInt2131 = 0;
		Static202.anInt3755 = 0;
		Static74.anInt1617 = 0;
		Static668.anInt11111 = 0;
		Static329.anInt6225 = 0;
		for (@Pc(69) int local69 = 0; local69 < Static590.aClass390Array1.length; local69++) {
			Static590.aClass390Array1[local69] = null;
		}
		Static484.method7167();
		for (@Pc(84) int local84 = 0; local84 < 2048; local84++) {
			Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local84] = null;
		}
		Static471.anInt8216 = 0;
		Static579.aClass187_73.method4076();
		Static570.anInt9823 = 0;
		Static568.aClass187_71.method4076();
		Static306.method4487();
		Static37.anInt981 = 0;
		Static595.aClass241_1.method5818();
		Static285.method4068();
		Static471.method6838();
		Static432.aClass229_2 = null;
		Static178.aClass14_Sub4_1 = null;
		Static639.aLong293 = 0L;
		Static64.aClass14_Sub25_1 = null;
		Static323.aClass14_Sub25_2 = null;
		aClass229_1 = null;
		if (arg0) {
			Static67.method1345(12);
			return;
		}
		Static67.method1345(3);
		try {
			Static682.method5126("loggedout", Static645.anApplet2);
		} catch (@Pc(145) Throwable local145) {
		}
	}
}

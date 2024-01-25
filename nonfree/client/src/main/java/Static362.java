import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
	public static int anInt5746 = 16777215;

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "[I")
	public static final int[] anIntArray533 = new int[2048];

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
	public static void method4645() {
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			Static172.aBooleanArray15[local10] = false;
		}
		Static9.anInt60 = 1;
		Static131.anInt2511 = 0;
		Static316.anInt5194 = 0;
		Static352.anInt5640 = -1;
		Static31.anInt529 = -1;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZI)V")
	public static void method4646(@OriginalArg(0) boolean arg0) {
		if (Static211.aClass247_4 != null) {
			Static211.aClass247_4.method5162();
			Static211.aClass247_4 = null;
		}
		Static64.anInt1229 = 0;
		Static69.method1173();
		Static261.method3517();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static179.aClass70Array3[local19].method1703();
		}
		Static179.method5739(false);
		System.gc();
		Static4.method5779();
		Static128.anInt2476 = -1;
		Static226.aBoolean244 = false;
		Static307.method4065(true);
		Static323.anInt5346 = 0;
		Static359.anInt5713 = 0;
		Static314.anInt5181 = 0;
		Static97.anInt1979 = 0;
		Static213.anInt3813 = 0;
		for (@Pc(58) int local58 = 0; local58 < Static325.aClass150Array1.length; local58++) {
			Static325.aClass150Array1[local58] = null;
		}
		Static226.method3135();
		for (@Pc(73) int local73 = 0; local73 < 2048; local73++) {
			Static410.aClass26_Sub2_Sub4_Sub2Array1[local73] = null;
		}
		Static56.anInt943 = 0;
		for (@Pc(87) int local87 = 0; local87 < 32768; local87++) {
			Static171.aClass26_Sub2_Sub4_Sub1Array1[local87] = null;
		}
		Static345.aClass164_33.method3509();
		method4645();
		Static385.anInt6209 = 0;
		Static224.aClass239_7.method5000();
		Static12.method111();
		Static281.method5550();
		Static4.aClass7_Sub29_3 = null;
		Static18.aLong17 = 0L;
		if (arg0) {
			Static138.method2151(11);
			return;
		}
		Static138.method2151(2);
		try {
			Static468.method5098(Static230.aClass61_4.anApplet1, "loggedout");
		} catch (@Pc(136) Throwable local136) {
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!vi;I)I")
	public static int method4647(@OriginalArg(0) Class26_Sub2_Sub4_Sub2 arg0) {
		@Pc(8) int local8 = arg0.anInt7152;
		@Pc(12) Class78 local12 = arg0.method5507();
		if (arg0.aBoolean475) {
			local8 = arg0.anInt7121;
		} else if (arg0.anInt7103 == local12.anInt2289 || arg0.anInt7103 == local12.anInt2291 || arg0.anInt7103 == local12.anInt2263 || local12.anInt2274 == arg0.anInt7103) {
			local8 = arg0.anInt7132;
		} else if (local12.anInt2273 == arg0.anInt7103 || arg0.anInt7103 == local12.anInt2268 || local12.anInt2272 == arg0.anInt7103 || local12.anInt2296 == arg0.anInt7103) {
			local8 = arg0.anInt7137;
		}
		return local8;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)Lclient!cs;")
	public static Class7_Sub11 method4648() {
		if (Static93.aClass85_28 == null || Static267.aClass12_1 == null) {
			return null;
		}
		Static267.aClass12_1.method96(Static93.aClass85_28);
		@Pc(18) Class7_Sub11 local18 = (Class7_Sub11) Static267.aClass12_1.method97();
		if (local18 == null) {
			return null;
		} else {
			@Pc(30) Class20 local30 = Static93.aClass62_4.method1481(local18.anInt1062);
			return local30 != null && local30.aBoolean8 && local30.method228(Static93.anInterface1_2) ? local18 : Static359.method4610();
		}
	}
}

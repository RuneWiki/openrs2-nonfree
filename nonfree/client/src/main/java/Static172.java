import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "Lclient!cd;")
	public static final Class36 aClass36_9 = new Class36("", 10);

	@OriginalMember(owner = "client!ii", name = "q", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_61 = new Class27(33, 4);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZI)V")
	public static void method2923(@OriginalArg(0) boolean arg0) {
		if (Static160.aClass253_3 != null) {
			Static160.aClass253_3.method5484();
			Static160.aClass253_3 = null;
		}
		Static197.anInt3945 = 0;
		Static365.method2561();
		Static206.method3214();
		for (@Pc(21) int local21 = 0; local21 < 4; local21++) {
			Static11.aClass220Array1[local21].method4879();
		}
		Static260.method3743(false);
		System.gc();
		Static81.method1529();
		Static290.aBoolean344 = false;
		Static151.anInt3107 = -1;
		Static338.method4529(true);
		Static273.anInt4772 = 0;
		Static321.anInt5511 = 0;
		Static72.anInt1488 = 0;
		Static444.anInt7445 = 0;
		Static168.anInt3353 = 0;
		Static253.anInt4561 = 0;
		for (@Pc(62) int local62 = 0; local62 < Static362.aClass65Array1.length; local62++) {
			Static362.aClass65Array1[local62] = null;
		}
		Static273.method3841();
		for (@Pc(81) int local81 = 0; local81 < 2048; local81++) {
			Static360.aClass24_Sub3_Sub2_Sub2Array1[local81] = null;
		}
		Static219.anInt4155 = 0;
		Static424.aClass167_33.method3701();
		Static134.anInt2764 = 0;
		Static293.aClass167_21.method3701();
		Static96.method1754();
		Static90.anInt1893 = 0;
		Static329.aClass201_9.method4481();
		Static420.method5520();
		Static317.method4362();
		Static37.aLong25 = 0L;
		Static259.aClass10_Sub28_4 = null;
		if (arg0) {
			Static458.method6071(11);
			return;
		}
		Static458.method6071(2);
		try {
			Static464.method2259(Static171.aClass159_1.anApplet1, "loggedout");
		} catch (@Pc(141) Throwable local141) {
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(BLclient!vi;)V")
	public static void method2924(@OriginalArg(1) Class257 arg0) {
		Static379.aClass257_2 = arg0;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2925(@OriginalArg(1) String arg0) {
		if (Static247.aClass113Array1 != null) {
			Static310.method4308(Static402.aClass27_93);
			Static337.aClass10_Sub8_Sub2_2.method2458(Static119.method2056(arg0));
			Static337.aClass10_Sub8_Sub2_2.method2465(arg0);
		}
	}
}

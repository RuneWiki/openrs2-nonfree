import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!dr", name = "zb", descriptor = "I")
	public static int anInt1556;

	@OriginalMember(owner = "client!dr", name = "Cb", descriptor = "Lclient!sv;")
	public static Class233 aClass233_3;

	@OriginalMember(owner = "client!dr", name = "Pb", descriptor = "[Lclient!ju;")
	public static Class129[] aClass129Array1;

	@OriginalMember(owner = "client!dr", name = "Bb", descriptor = "I")
	public static int anInt1558 = 0;

	@OriginalMember(owner = "client!dr", name = "Hb", descriptor = "S")
	public static short aShort23 = 1;

	@OriginalMember(owner = "client!dr", name = "g", descriptor = "(BI)V")
	public static void method1352(@OriginalArg(1) int arg0) {
		@Pc(8) Class7_Sub4_Sub14 local8 = Static54.method750(arg0, 5);
		local8.method4710();
	}

	@OriginalMember(owner = "client!dr", name = "p", descriptor = "(I)V")
	public static void method1359() {
		if (Static269.aClass51_9 == null) {
			return;
		}
		Static256.aClass169_6.method3594();
		Static261.method3517();
		Static140.method793();
		Static292.method3874();
		Static82.method1435();
		Static425.method5465();
		if (Static37.aClass196_1 != null) {
			Static37.aClass196_1.method4081();
		}
		Static44.method599();
		Static69.method1173();
		Static111.method1916();
		Static179.method5739(false);
		Static449.method5708();
		for (@Pc(43) int local43 = 0; local43 < 2048; local43++) {
			@Pc(49) Class26_Sub2_Sub4_Sub2 local49 = Static410.aClass26_Sub2_Sub4_Sub2Array1[local43];
			if (local49 != null) {
				local49.aClass7_Sub42_3 = null;
				for (@Pc(56) int local56 = 0; local56 < local49.aClass163Array3.length; local56++) {
					local49.aClass163Array3[local56] = null;
				}
			}
		}
		for (@Pc(75) int local75 = 0; local75 < Static171.aClass26_Sub2_Sub4_Sub1Array1.length; local75++) {
			@Pc(81) Class26_Sub2_Sub4_Sub1 local81 = Static171.aClass26_Sub2_Sub4_Sub1Array1[local75];
			if (local81 != null) {
				for (@Pc(85) int local85 = 0; local85 < local81.aClass163Array3.length; local85++) {
					local81.aClass163Array3[local85] = null;
				}
			}
		}
		Static379.aClass33_8 = null;
		Static179.aClass33_11 = null;
		Static269.aClass51_9.method5315();
		Static269.aClass51_9 = null;
	}
}

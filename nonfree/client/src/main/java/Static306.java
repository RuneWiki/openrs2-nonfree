import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
	public static int anInt4811;

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "J")
	public static long aLong151;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZLclient!lc;Ljava/lang/String;ZLjava/lang/String;Z)V")
	public static void method4297(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class207 arg1, @OriginalArg(2) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) boolean arg4) {
		if (!arg0) {
			Static464.method6460(3, arg1, arg3);
			return;
		}
		@Pc(20) String local20;
		if (Static332.aString65.startsWith("win") && arg1.aBoolean399) {
			local20 = null;
			if (Static649.anApplet2 != null) {
				local20 = Static649.anApplet2.getParameter("haveie6");
			}
			if (local20 == null || !local20.equals("1")) {
				@Pc(38) Class281 local38 = Static464.method6460(0, arg1, arg3);
				Static340.aClass207_3 = arg1;
				Static182.aString27 = arg3;
				Static592.aClass281_8 = local38;
				return;
			}
		}
		if (Static332.aString65.startsWith("mac")) {
			local20 = null;
			if (Static649.anApplet2 != null) {
				local20 = Static649.anApplet2.getParameter("havefirefox");
			}
			if (local20 != null && local20.equals("1") && arg4) {
				Static195.method3023(arg1, arg2, 1, arg3);
				return;
			}
		}
		Static464.method6460(2, arg1, arg3);
	}

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "(IZ)V")
	public static void method4298(@OriginalArg(1) boolean arg0) {
		if (Static375.aClass192_2 != null) {
			Static375.aClass192_2.method7791();
			Static375.aClass192_2 = null;
		}
		Static44.method820();
		Static424.method5891();
		Static305.method4281();
		for (@Pc(21) int local21 = 0; local21 < 4; local21++) {
			Static263.aClass389Array1[local21].method8817();
		}
		Static90.method7669(false);
		System.gc();
		Static58.method1306();
		Static573.anInt8886 = -1;
		Static299.aBoolean350 = false;
		Static174.method2858();
		Static215.method3217(true);
		Static124.anInt2310 = 0;
		Static408.anInt5896 = 0;
		Static564.anInt8658 = 0;
		Static390.anInt5705 = 0;
		Static445.anInt6949 = 0;
		Static321.anInt5000 = 0;
		for (@Pc(64) int local64 = 0; local64 < Static9.aClass82Array41.length; local64++) {
			Static9.aClass82Array41[local64] = null;
		}
		Static149.method2603();
		for (@Pc(83) int local83 = 0; local83 < 2048; local83++) {
			Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local83] = null;
		}
		Static105.anInt2131 = 0;
		Static597.aClass66_41.method1988();
		Static15.anInt1571 = 0;
		Static406.aClass66_28.method1988();
		Static310.method4320();
		Static209.anInt3391 = 0;
		Static526.aClass293_1.method6532();
		Static178.method2885();
		Static25.method574();
		Static290.aClass4_Sub14_2 = null;
		Static345.aClass267_4 = null;
		Static252.aClass4_Sub55_3 = null;
		Static307.aLong264 = 0L;
		Static64.aClass4_Sub55_1 = null;
		Static140.aClass267_5 = null;
		if (arg0) {
			Static53.method1256(12);
			return;
		}
		Static53.method1256(3);
		try {
			Static684.method6376("loggedout", Static649.anApplet2);
		} catch (@Pc(144) Throwable local144) {
		}
	}
}

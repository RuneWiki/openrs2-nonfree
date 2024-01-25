import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!d", name = "K", descriptor = "F")
	public static float aFloat24;

	@OriginalMember(owner = "client!d", name = "V", descriptor = "I")
	public static int anInt1237;

	@OriginalMember(owner = "client!d", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString45 = "Close";

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)I")
	public static int method1205(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!d", name = "g", descriptor = "(I)V")
	public static void method1206() {
		@Pc(1) Class140 local1 = Static69.aClass140_39;
		synchronized (Static69.aClass140_39) {
			Static69.aClass140_39.method3819();
		}
		local1 = Static102.aClass140_59;
		synchronized (Static102.aClass140_59) {
			Static102.aClass140_59.method3819();
		}
	}

	@OriginalMember(owner = "client!d", name = "h", descriptor = "(I)V")
	public static void method1208() {
		if (Static153.aClass158_2 != null) {
			Static153.aClass158_2.method4339();
			Static153.aClass158_2 = null;
		}
		Static328.method5502();
		Static84.method1606();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static24.aClass91Array1[local17].method2594();
		}
		Static317.method5332(false);
		System.gc();
		Static316.method5326();
		Static275.aBoolean463 = false;
		Static43.anInt2906 = -1;
		Static123.method2193(true);
		Static161.anInt3315 = 0;
		Static182.anInt3775 = 0;
		Static58.anInt1291 = 0;
		Static108.aBoolean187 = false;
		Static51.anInt5042 = 0;
		for (@Pc(54) int local54 = 0; local54 < Static135.aClass136Array1.length; local54++) {
			Static135.aClass136Array1[local54] = null;
		}
		Static334.anInt6370 = 0;
		Static338.anInt6419 = 0;
		for (@Pc(75) int local75 = 0; local75 < 2048; local75++) {
			Static254.aClass5_Sub3_Sub3_Sub1Array1[local75] = null;
			Static30.aClass1_Sub7Array1[local75] = null;
		}
		for (@Pc(91) int local91 = 0; local91 < 32768; local91++) {
			Static169.aClass5_Sub3_Sub3_Sub2Array2[local91] = null;
		}
		Static52.aClass26_4.method876();
		Static198.method3731();
		Static169.anInt4508 = 0;
		Static290.method4939();
		Static3.method170();
		Static138.method2661();
		Static211.method3873(true);
		try {
			Static365.method4929(Static180.aClass110_6.anApplet1, "loggedout");
		} catch (@Pc(127) Throwable local127) {
		}
	}
}

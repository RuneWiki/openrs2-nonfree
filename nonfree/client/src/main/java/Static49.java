import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!cq", name = "m", descriptor = "I")
	public static int anInt4961;

	@OriginalMember(owner = "client!cq", name = "o", descriptor = "I")
	public static int anInt4962;

	@OriginalMember(owner = "client!cq", name = "p", descriptor = "[Lclient!pc;")
	public static Class157[] aClass157Array2;

	@OriginalMember(owner = "client!cq", name = "l", descriptor = "Lclient!le;")
	public static final Class122 aClass122_9 = new Class122(16);

	@OriginalMember(owner = "client!cq", name = "n", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_114 = new Class85("wave:", "", "", "");

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Z)V")
	public static void method4428() {
		if (Static155.aClass41_18 != null) {
			Static155.aClass41_18.method825();
			Static155.aClass41_18 = null;
		}
		Static166.method3025();
		Static60.method1854();
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			Static152.aClass24Array3[local15].method494();
		}
		Static92.method1666(false);
		System.gc();
		Static5.method87();
		Static111.aBoolean156 = false;
		Static236.anInt4219 = -1;
		Static8.method168(true);
		Static339.aBoolean571 = false;
		Static12.anInt3797 = 0;
		Static53.anInt990 = 0;
		Static111.anInt2079 = 0;
		Static172.anInt4394 = 0;
		for (@Pc(53) int local53 = 0; local53 < Static149.aClass131Array1.length; local53++) {
			Static149.aClass131Array1[local53] = null;
		}
		Static133.anInt2579 = 0;
		Static22.anInt472 = 0;
		for (@Pc(73) int local73 = 0; local73 < 2048; local73++) {
			Static62.aClass4_Sub5_Sub2_Sub1Array1[local73] = null;
			Static160.aClass5_Sub12Array1[local73] = null;
		}
		for (@Pc(90) int local90 = 0; local90 < 32768; local90++) {
			Static280.aClass4_Sub5_Sub2_Sub2Array1[local90] = null;
		}
		Static343.aClass190_33.method5472();
		Static77.method1412();
		Static215.anInt4249 = 0;
		Static153.method2737();
		Static216.method3988();
		Static98.method1775();
		Static280.method4870(true);
		try {
			Static370.method5989(Static182.aClass139_5.anApplet1, "loggedout");
		} catch (@Pc(123) Throwable local123) {
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IB)V")
	public static void method4429(@OriginalArg(0) int arg0) {
		Static215.anInt4239 = arg0;
		@Pc(7) Class109 local7 = Static38.aClass109_11;
		synchronized (Static38.aClass109_11) {
			Static38.aClass109_11.method2858();
		}
		local7 = Static174.aClass109_39;
		synchronized (Static174.aClass109_39) {
			Static174.aClass109_39.method2858();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!fa", name = "p", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_59 = new Class44(118, -1);

	@OriginalMember(owner = "client!fa", name = "r", descriptor = "Lclient!vk;")
	public static final Class372 aClass372_5 = new Class372(2);

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)V")
	public static void method2365() {
		Static92.aClass350_2.method8463();
		Static620.aClass119_5.method2837();
		Static372.aClass154_2.method3552();
		Static511.aClass13_2.method83();
		Static63.aClass37_1.method977();
		Static175.aClass247_2.method5959();
		Static501.aClass191_2.method4321();
		Static556.aClass216_2.method5269();
		Static427.aClass225_1.method5331();
		Static195.aClass76_1.method1916();
		Static634.aClass15_1.method134();
		Static110.aClass197_1.method4400();
		Static313.aClass83_6.method2075();
		Static196.aClass116_2.method2785();
		Static605.aClass370_1.method8866();
		Static217.aClass90_1.method2117();
		Static20.aClass385_31.method9139();
		Static379.aClass250_13.method5996();
		Static264.aClass68_1.method1728();
		Static184.aClass151_1.method3505();
		Static296.aClass205_3.method5062();
		Static137.aClass299_1.method7434();
		Static250.method3680();
		Static526.method7554();
		Static624.method8768();
		Static182.method2905();
		Static635.method8867();
		Static372.aClass264_42.method6368();
		Static283.aClass264_32.method6368();
		Static433.aClass264_61.method6368();
		Static546.aClass264_55.method6368();
		Static632.aClass264_63.method6368();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)V")
	public static void method2366(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class14_Sub3_Sub9 local17 = Static142.method2219((long) arg1, 13);
		local17.method2817();
		local17.anInt3419 = arg0;
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)V")
	public static void method2368() {
		if (Static665.aClass14_Sub3_Sub21_4 != null) {
			Static665.aClass14_Sub3_Sub21_4 = null;
			Static481.method7124(Static623.anInt10488, Static539.anInt9256, Static62.anInt9091, Static652.anInt10893);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!wia;B)V")
	public static void method2369(@OriginalArg(0) Class386 arg0) {
		Static654.aClass386_138 = arg0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIB)Ljava/lang/String;")
	public static String method2370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - arg1;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!i", name = "d", descriptor = "I")
	public static int anInt3256;

	@OriginalMember(owner = "client!i", name = "b", descriptor = "[I")
	public static final int[] anIntArray194 = new int[8];

	@OriginalMember(owner = "client!i", name = "p", descriptor = "Z")
	public static volatile boolean aBoolean217 = true;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ZZB)V")
	public static void method2685(@OriginalArg(0) boolean arg0) {
		Static393.anInt6998--;
		if (Static393.anInt6998 == 0) {
			Static97.anIntArray130 = null;
		}
		if (!arg0) {
			return;
		}
		Static14.anInt445--;
		if (Static14.anInt445 == 0) {
			Static427.anIntArray525 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "(I)V")
	public static void method2694() {
		Static281.aClass253_4.method6226();
		Static134.aClass140_3.method3142();
		Static270.aClass18_1.method504();
		Static448.aClass104_4.method2615();
		Static235.aClass263_2.method6418();
		Static380.aClass231_2.method5643();
		Static5.aClass217_1.method5229();
		Static141.aClass141_2.method3186();
		Static69.aClass103_1.method2607();
		Static447.aClass257_10.method6298();
		Static145.aClass27_1.method760();
		Static244.aClass169_29.method3949();
		Static314.aClass108_4.method2650();
		Static80.aClass181_1.method4298();
		Static282.aClass164_1.method3825();
		Static133.aClass133_2.method3064();
		Static89.aClass70_1.method1826();
		Static126.aClass39_1.method1275();
		Static71.aClass83_1.method2100();
		Static89.aClass229_1.method5607();
		Static410.method6047();
		Static97.method1808();
		Static405.method5981();
		Static103.method1840();
		Static295.aClass44_42.method1352(5);
		Static149.aClass44_15.method1352(5);
		Static276.aClass44_38.method1352(5);
		Static176.aClass44_25.method1352(5);
		Static166.aClass44_23.method1352(5);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIILclient!et;Lclient!et;)V")
	public static void method2695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub3 arg3, @OriginalArg(4) Class3_Sub3 arg4) {
		@Pc(4) Class101 local4 = Static217.method3259(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass3_Sub3_2 = arg3;
			local4.aClass3_Sub3_1 = arg4;
		}
	}
}

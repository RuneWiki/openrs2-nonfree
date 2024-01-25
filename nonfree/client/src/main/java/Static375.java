import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
	public static int anInt6392;

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "Z")
	public static boolean aBoolean498;

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
	public static int anInt6391 = 0;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)V")
	public static void method5418() {
		Static74.aClass140_2.method3533();
		Static321.aClass124_7.method2965();
		Static208.aClass29_2.method645();
		Static70.aClass323_1.method7798();
		Static631.aClass85_2.method2213();
		Static243.aClass406_2.method9398();
		Static59.aClass177_1.method4261();
		Static660.aClass307_2.method7492();
		Static135.aClass248_1.method6084();
		Static494.aClass45_1.method900();
		Static101.aClass125_1.method2981();
		Static455.aClass227_1.method5135();
		Static255.aClass238_1.method5901();
		Static462.aClass98_2.method2447();
		Static567.aClass405_3.method9354();
		Static646.aClass106_1.method2676();
		Static12.aClass94_1.method2430();
		Static103.aClass114_1.method2794();
		Static102.aClass126_1.method2991();
		Static605.aClass122_1.method2902();
		Static621.aClass336_2.method8000();
		Static308.aClass321_1.method7783();
		Static610.aClass116_2.method2801();
		Static725.method9440();
		Static485.method6261();
		Static407.method6077();
		Static396.method5962();
		Static480.method7026();
		Static345.aClass338_32.method8052(5);
		Static670.aClass338_61.method8052(5);
		Static297.aClass338_27.method8052(5);
		Static416.aClass338_40.method8052(5);
		Static185.aClass338_15.method8052(5);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZZ)Z")
	public static boolean method5420(@OriginalArg(0) boolean arg0) {
		@Pc(13) boolean local13 = Static488.aClass67_12.method7643();
		if (local13 == arg0) {
			return true;
		}
		if (!arg0) {
			Static488.aClass67_12.method7678();
		} else if (!Static488.aClass67_12.method7655()) {
			arg0 = false;
		}
		if (arg0 == local13) {
			return false;
		} else {
			Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub12_1, arg0 ? 1 : 0);
			Static328.method4885();
			return true;
		}
	}
}

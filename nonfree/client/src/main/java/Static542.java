import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static542 {

	@OriginalMember(owner = "client!un", name = "u", descriptor = "I")
	public static int anInt6417 = 0;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BI)V")
	public static void method5361(@OriginalArg(1) int arg0) {
		Static187.anInt8961 = -1;
		Static317.anInt5332 = -1;
		Static26.anInt449 = arg0;
		Static170.method2217();
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ILclient!mq;)I")
	public static int method5365(@OriginalArg(1) Class12_Sub2_Sub1_Sub4_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt5813;
		@Pc(12) Class61 local12 = arg0.method6767();
		if (arg0.anInt8351 == -1 || arg0.aBoolean710) {
			local8 = arg0.anInt5826;
		} else if (local12.anInt1317 == arg0.anInt8351 || local12.anInt1325 == arg0.anInt8351 || local12.anInt1331 == arg0.anInt8351 || local12.anInt1328 == arg0.anInt8351) {
			local8 = arg0.anInt5832;
		} else if (arg0.anInt8351 == local12.anInt1301 || local12.anInt1309 == arg0.anInt8351 || arg0.anInt8351 == local12.anInt1312 || local12.anInt1298 == arg0.anInt8351) {
			local8 = arg0.anInt5811;
		}
		return local8;
	}
}

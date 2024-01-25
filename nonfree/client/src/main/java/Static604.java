import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static604 {

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lclient!bda;I)V")
	public static void method8285(@OriginalArg(0) Class15_Sub1_Sub2_Sub2 arg0) {
		@Pc(15) int local15 = arg0.anInt8101 - Static435.anInt8192;
		@Pc(26) int local26 = arg0.anInt8128 * 512 + arg0.method6692() * 256;
		@Pc(38) int local38 = arg0.anInt8132 * 512 + arg0.method6692() * 256;
		arg0.anInt10298 += (local38 - arg0.anInt10298) / local15;
		arg0.anInt8138 = 0;
		arg0.anInt10301 += (local26 - arg0.anInt10301) / local15;
		if (arg0.anInt8084 == 0) {
			arg0.method6700(8192);
		}
		if (arg0.anInt8084 == 1) {
			arg0.method6700(12288);
		}
		if (arg0.anInt8084 == 2) {
			arg0.method6700(0);
		}
		if (arg0.anInt8084 == 3) {
			arg0.method6700(4096);
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZ)V")
	public static void method8286(@OriginalArg(1) boolean arg0) {
		Static499.aClass54_9.method5137(Static580.aClass16_10.method6118());
		@Pc(10) int[] local10 = Static580.aClass16_10.Y();
		Static270.anInt9893 = local10[3];
		Static591.anInt10108 = local10[2];
		Static370.anInt7049 = local10[1];
		Static564.anInt9726 = local10[0];
		if (arg0) {
			Static580.aClass16_10.DA(Static53.anInt1807, Static260.anInt5585, Static545.anInt9345, Static307.anInt6235);
			Static111.method2525(Static88.aDouble3);
		} else {
			Static580.aClass16_10.DA(Static598.anInt2010, Static18.anInt873, Static263.anInt5639, Static624.anInt10423);
			Static111.method2525(Static532.aDouble16);
		}
	}
}

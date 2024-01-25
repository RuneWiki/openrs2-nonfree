import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static650 {

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lclient!mj;IBI)V")
	public static void method8982(@OriginalArg(0) Class238 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static388.aClass238_11 != null || Static490.aBoolean536 || (arg0 == null || Static317.method4846(arg0) == null)) {
			return;
		}
		Static388.aClass238_11 = arg0;
		Static230.aClass238_4 = Static317.method4846(arg0);
		Static595.aBoolean673 = false;
		Static501.anInt8061 = arg1;
		Static20.anInt292 = 0;
		Static412.anInt6980 = arg2;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(ILclient!mk;)I")
	public static int method8983(@OriginalArg(1) Class5_Sub1_Sub13 arg0) {
		@Pc(7) String local7 = Static461.method6496(arg0);
		@Pc(9) int[] local9 = null;
		if (Static412.method6083(arg0.anInt6068)) {
			local9 = Static82.aClass134_1.method3191((int) arg0.aLong176).anIntArray372;
		} else if (arg0.anInt6067 != -1) {
			local9 = Static82.aClass134_1.method3191(arg0.anInt6067).anIntArray372;
		} else if (Static250.method4080(arg0.anInt6068)) {
			@Pc(42) Class5_Sub9 local42 = (Class5_Sub9) Static677.aClass306_37.method6943((long) (int) arg0.aLong176);
			if (local42 != null) {
				@Pc(47) Class4_Sub1_Sub1_Sub2_Sub2 local47 = local42.aClass4_Sub1_Sub1_Sub2_Sub2_1;
				@Pc(50) Class105 local50 = local47.aClass105_1;
				if (local50.anIntArray134 != null) {
					local50 = local50.method2622(Static23.aClass247_1);
				}
				if (local50 != null) {
					local9 = local50.anIntArray131;
				}
			}
		} else if (Static126.method1893(arg0.anInt6068)) {
			@Pc(88) Class354 local88;
			if (arg0.anInt6068 == 1001) {
				local88 = Static528.aClass243_3.method5556((int) arg0.aLong176);
			} else {
				local88 = Static528.aClass243_3.method5556((int) (arg0.aLong176 >>> 32 & 0x7FFFFFFFL));
			}
			if (local88.anIntArray526 != null) {
				local88 = local88.method8024(Static23.aClass247_1);
			}
			if (local88 != null) {
				local9 = local88.anIntArray527;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static462.method6508(local9);
		}
		@Pc(147) int local147 = Static73.aClass196_5.method4558(Static67.aClass155Array3, local7);
		if (arg0.aBoolean412) {
			local147 += Static28.aClass155_3.method7213() + 4;
		}
		return local147;
	}
}

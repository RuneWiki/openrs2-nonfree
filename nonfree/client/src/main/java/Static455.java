import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lclient!vj;I)Lclient!qba;")
	public static Class102 method6237(@OriginalArg(0) Class2_Sub22 arg0) {
		@Pc(7) int local7 = arg0.method8546();
		@Pc(14) Class361 local14 = Static108.method1608()[arg0.method8547()];
		@Pc(21) Class306 local21 = Static366.method4960()[arg0.method8547()];
		@Pc(25) int local25 = arg0.method8526();
		@Pc(35) int local35 = arg0.method8526();
		return new Class102(local7, local14, local21, local25, local35);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)V")
	public static void method6238() {
		for (@Pc(7) int local7 = 0; local7 < Static639.anInt10306; local7++) {
			@Pc(13) int local13 = Static147.anIntArray182[local7];
			@Pc(20) Class2_Sub43 local20 = (Class2_Sub43) Static440.aClass118_41.method2595((long) local13);
			if (local20 != null) {
				@Pc(25) Class13_Sub1_Sub1_Sub1_Sub1 local25 = local20.aClass13_Sub1_Sub1_Sub1_Sub1_2;
				Static100.method1529(local25, local25.aClass150_1.anInt3793);
			}
		}
	}
}

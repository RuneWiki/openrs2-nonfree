import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!at;)V")
	public static void method3024(@OriginalArg(0) Class23 arg0) {
		Static326.aClass23_1 = arg0;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!js;I)V")
	public static void method3025(@OriginalArg(0) Class14_Sub29_Sub1 arg0) {
		arg0.method4285();
		@Pc(10) int local10 = Static568.anInt9800;
		@Pc(20) Class12_Sub2_Sub2_Sub1_Sub2 local20 = Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local10] = new Class12_Sub2_Sub2_Sub1_Sub2();
		local20.anInt2945 = local10;
		@Pc(28) int local28 = arg0.method4289(30);
		@Pc(37) byte local37 = (byte) (local28 >> 28);
		@Pc(43) int local43 = local28 >> 14 & 0x3FFF;
		@Pc(47) int local47 = local28 & 0x3FFF;
		local20.anIntArray241[0] = local43 - Static329.anInt6225;
		local20.anInt10998 = (local20.anIntArray241[0] << 9) + (local20.method2422() << 8);
		local20.anIntArray242[0] = local47 - Static202.anInt3755;
		local20.anInt11002 = (local20.anIntArray242[0] << 9) + (local20.method2422() << 8);
		Static586.anInt10060 = local20.aByte146 = local20.aByte145 = local37;
		if (Static329.method5158(local20.anIntArray242[0], local20.anIntArray241[0])) {
			local20.aByte145++;
		}
		if (Static308.aClass14_Sub29Array1[local10] != null) {
			local20.method2433(Static308.aClass14_Sub29Array1[local10]);
		}
		Static209.anInt3954 = 0;
		Static457.anIntArray607[Static209.anInt3954++] = local10;
		Static474.aByteArray38[local10] = 0;
		Static127.anInt2500 = 0;
		for (@Pc(145) int local145 = 1; local145 < 2048; local145++) {
			if (local10 != local145) {
				@Pc(155) int local155 = arg0.method4289(18);
				@Pc(159) int local159 = local155 >> 16;
				@Pc(165) int local165 = local155 >> 8 & 0xFF;
				@Pc(169) int local169 = local155 & 0xFF;
				@Pc(177) Class2 local177 = Static360.aClass2Array1[local145] = new Class2();
				local177.anInt8 = (local165 << 14) + (local159 << 28) + local169;
				local177.anInt9 = 0;
				local177.aBoolean1 = false;
				local177.aBoolean2 = false;
				local177.anInt4 = -1;
				Static422.anIntArray561[Static127.anInt2500++] = local145;
				Static474.aByteArray38[local145] = 0;
			}
		}
		arg0.method4290();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZIZLclient!ij;)V")
	public static void method5820(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class1_Sub23 arg2) {
		@Pc(6) int local6 = arg2.anInt3059;
		@Pc(10) int local10 = (int) arg2.aLong222;
		arg2.method6020();
		if (arg1) {
			Static272.method4010(local6);
		}
		Static292.method4240(local6);
		@Pc(25) Class251 local25 = Static378.method3544(local10);
		if (local25 != null) {
			Static408.method5469(local25);
		}
		Static456.method6005();
		if (!arg0 && Static407.anInt6564 != -1) {
			Static204.method5978(Static407.anInt6564, 1);
		}
		@Pc(53) Class163 local53 = new Class163(Static101.aClass96_16);
		for (@Pc(58) Class1_Sub23 local58 = (Class1_Sub23) local53.method3765(); local58 != null; local58 = (Class1_Sub23) local53.method3759()) {
			if (!local58.method6017()) {
				local58 = (Class1_Sub23) local53.method3765();
				if (local58 == null) {
					return;
				}
			}
			if (local58.anInt3058 == 3) {
				@Pc(79) int local79 = (int) local58.aLong222;
				if (local79 >>> 16 == local6) {
					method5820(arg0, true, local58);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILclient!kd;)V")
	public static void method5821(@OriginalArg(1) Class39_Sub2 arg0) {
		@Pc(22) byte[] local22;
		if (Static400.anObject9 == null) {
			@Pc(13) Class28_Sub1_Sub1 local13 = new Class28_Sub1_Sub1();
			local22 = local13.method751();
			Static400.anObject9 = Static105.method1873(local22);
		}
		if (Static197.anObject6 == null) {
			@Pc(33) Class28_Sub2_Sub1 local33 = new Class28_Sub2_Sub1();
			local22 = local33.method5046();
			Static197.anObject6 = Static105.method1873(local22);
		}
		@Pc(48) Class147 local48 = arg0.aClass147_1;
		if (local48.method3380() && Static224.anObject7 == null) {
			local22 = Static307.method4373(0.6F, 4.0F, new Class103_Sub1(419684), 0.5F, 16.0F, 4.0F);
			Static224.anObject7 = Static105.method1873(local22);
		}
	}
}

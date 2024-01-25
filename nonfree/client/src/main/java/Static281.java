import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "Lclient!dca;")
	public static Class76 aClass76_5;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)I")
	public static int method3944() {
		return Static591.aClass337_3.method8100();
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILclient!tt;)I")
	public static int method3945(@OriginalArg(1) Class2_Sub6_Sub20 arg0) {
		@Pc(7) String local7 = Static275.method3840(arg0);
		@Pc(9) int[] local9 = null;
		if (Static284.method3981(arg0.anInt9603)) {
			local9 = Static543.aClass37_2.method605((int) arg0.aLong302).anIntArray350;
		} else if (arg0.anInt9601 != -1) {
			local9 = Static543.aClass37_2.method605(arg0.anInt9601).anIntArray350;
		} else if (Static690.method9315(arg0.anInt9603)) {
			@Pc(81) Class2_Sub49 local81 = (Class2_Sub49) Static467.aClass218_37.method5095((long) (int) arg0.aLong302, 0);
			if (local81 != null) {
				@Pc(86) Class4_Sub2_Sub1_Sub2_Sub2 local86 = local81.aClass4_Sub2_Sub1_Sub2_Sub2_3;
				@Pc(89) Class261 local89 = local86.aClass261_1;
				if (local89.anIntArray499 != null) {
					local89 = local89.method6272(Static396.aClass107_1);
				}
				if (local89 != null) {
					local9 = local89.anIntArray502;
				}
			}
		} else if (Static575.method7994(arg0.anInt9603)) {
			@Pc(58) Class81 local58 = Static148.aClass153_3.method3342((int) (arg0.aLong302 >>> 32 & 0x7FFFFFFFL));
			if (local58.anIntArray143 != null) {
				local58 = local58.method1629(Static396.aClass107_1);
			}
			if (local58 != null) {
				local9 = local58.anIntArray144;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static657.method9030(local9);
		}
		@Pc(121) int local121 = Static277.aClass289_8.method6930(local7, Static467.aClass43Array17);
		if (arg0.aBoolean826) {
			local121 += Static650.aClass43_29.method9601() + 4;
		}
		return local121;
	}
}

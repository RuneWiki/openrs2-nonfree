import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(Lclient!ha;I)V")
	public static void method3586(@OriginalArg(0) Class22 arg0) {
		if (Static530.aBoolean556) {
			Static605.method7764(arg0);
		} else {
			Static424.method5633(arg0);
		}
	}

	@OriginalMember(owner = "client!hs", name = "i", descriptor = "(I)V")
	public static void method3587() {
		try {
			@Pc(12) int local12;
			if (Static599.anInt9088 == 1) {
				local12 = Static708.aClass3_Sub33_Sub3_4.method7903();
				if (local12 > 0 && Static708.aClass3_Sub33_Sub3_4.method7913()) {
					local12 -= Static344.anInt5509;
					if (local12 < 0) {
						local12 = 0;
					}
					Static708.aClass3_Sub33_Sub3_4.method7887(local12);
					return;
				}
				Static708.aClass3_Sub33_Sub3_4.method7884();
				Static708.aClass3_Sub33_Sub3_4.method7915();
				Static46.aClass138_1 = null;
				if (Static224.aClass182_61 == null) {
					Static599.anInt9088 = 0;
				} else {
					Static599.anInt9088 = 2;
				}
				Static27.aClass3_Sub8_1 = null;
			}
			if (Static599.anInt9088 == 3) {
				local12 = Static708.aClass3_Sub33_Sub3_4.method7903();
				if (local12 < Static576.anInt10894 && Static708.aClass3_Sub33_Sub3_4.method7913()) {
					local12 += Static585.anInt8894;
					if (Static576.anInt10894 < local12) {
						local12 = Static576.anInt10894;
					}
					Static708.aClass3_Sub33_Sub3_4.method7887(local12);
				} else {
					Static585.anInt8894 = 0;
					Static599.anInt9088 = 0;
				}
			}
		} catch (@Pc(103) Exception local103) {
			local103.printStackTrace();
			Static708.aClass3_Sub33_Sub3_4.method7884();
			Static46.aClass138_1 = null;
			Static599.anInt9088 = 0;
			Static224.aClass182_61 = null;
			Static243.aClass3_Sub33_Sub3_1 = null;
			Static27.aClass3_Sub8_1 = null;
		}
	}

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "(Z)I")
	public static int method3589() {
		@Pc(5) Class307 local5 = Static91.aClass307_21;
		synchronized (Static91.aClass307_21) {
			return Static91.aClass307_21.method6997();
		}
	}
}

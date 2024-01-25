import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static659 {

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
	public static int anInt10089 = 0;

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
	public static int anInt10093 = 0;

	@OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
	public static int anInt10095 = -1;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!ha;Lclient!kc;Lclient!da;Ljava/lang/String;ZB)V")
	public static void method8584(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class202 arg1, @OriginalArg(2) Class69 arg2, @OriginalArg(3) String arg3, @OriginalArg(4) boolean arg4) {
		@Pc(14) boolean local14 = !Static573.aBoolean680 || Static83.method1776();
		if (!local14) {
			return;
		}
		@Pc(28) int local28;
		@Pc(37) int local37;
		if (Static573.aBoolean680 && local14) {
			@Pc(136) Class202 local136 = Static571.aClass202_12;
			@Pc(142) Class69 local142 = arg0.method8117(local136, Static403.aClass150Array1);
			local28 = local136.method4626(250, (Class102[]) null, arg3);
			local37 = local136.method4625((Class102[]) null, local136.anInt5467, arg3, 250);
			@Pc(161) int local161 = Static494.aClass150_2.anInt3831;
			@Pc(165) int local165 = local161 + 4;
			local28 += local165 * 2;
			local37 += local165 * 2;
			if (Static327.anInt6070 > local28) {
				local28 = Static327.anInt6070;
			}
			if (Static594.anInt9371 > local37) {
				local37 = Static594.anInt9371;
			}
			@Pc(204) int local204 = Static236.aClass92_5.method2199(Static507.anInt8484, local28) + Static650.anInt10017;
			@Pc(213) int local213 = Static110.aClass65_4.method1786(Static581.anInt9218, local37) + Static541.anInt8830;
			if (Static649.aBoolean735) {
				local204 += Static359.method5380();
				local213 += Static265.method7952();
			}
			arg0.method8132(Static521.aClass150_3, false).method6964(Static68.aClass150_1.anInt3831 + local204, Static68.aClass150_1.anInt3828 + local213, local28 - Static68.aClass150_1.anInt3831 * 2, local37 + -(Static68.aClass150_1.anInt3828 * 2), 1, 0, 0);
			arg0.method8132(Static68.aClass150_1, true).method6961(local204, local213);
			Static68.aClass150_1.method3272();
			arg0.method8132(Static68.aClass150_1, true).method6961(local28 + local204 - local161, local213);
			Static68.aClass150_1.method3274();
			arg0.method8132(Static68.aClass150_1, true).method6961(local28 + local204 - local161, -local161 + local213 - -local37);
			Static68.aClass150_1.method3272();
			arg0.method8132(Static68.aClass150_1, true).method6961(local204, local37 + local213 - local161);
			Static68.aClass150_1.method3274();
			arg0.method8132(Static494.aClass150_2, true).method6949(local204, local213 + Static68.aClass150_1.anInt3828, local161, local37 - Static68.aClass150_1.anInt3828 * 2);
			Static494.aClass150_2.method3283();
			arg0.method8132(Static494.aClass150_2, true).method6949(local204 + Static68.aClass150_1.anInt3831, local213, local28 - Static68.aClass150_1.anInt3831 * 2, local161);
			Static494.aClass150_2.method3283();
			arg0.method8132(Static494.aClass150_2, true).method6949(local28 + local204 - local161, local213 + Static68.aClass150_1.anInt3828, local161, local37 - Static68.aClass150_1.anInt3828 * 2);
			Static494.aClass150_2.method3283();
			arg0.method8132(Static494.aClass150_2, true).method6949(local204 + Static68.aClass150_1.anInt3831, local213 + (local37 - local161), local28 - Static68.aClass150_1.anInt3831 * 2, local161);
			Static494.aClass150_2.method3283();
			local142.method7452(arg3, local213 + local165, 1, local28 - local165 * 2, (Class1) null, 0, 0, 1, local37 - local165 * 2, 0, -1, (int[]) null, (Class102[]) null, local165 + local204, Static180.anInt3378 | 0xFF000000);
			Static471.method8502(local204, local213, local28, local37);
		} else {
			local28 = arg1.method4626(250, (Class102[]) null, arg3);
			local37 = arg1.method4633(arg3, 250, (Class102[]) null) * 13;
			arg0.aa(6, 6, local28 + 4 + 4, local37 + 4 - -4, -16777216, 0);
			arg0.method8146(6, 6, local28 + 4 + 4, local37 + 4 + 4, -1, 0);
			arg2.method7452(arg3, 10, 1, local28, (Class1) null, 0, 0, 1, local37, 0, -1, (int[]) null, (Class102[]) null, 10, -1);
			Static471.method8502(6, 6, local28 + 4 + 4, local37 - -4 + 4);
		}
		if (!arg4) {
			return;
		}
		try {
			if (Static649.aBoolean735) {
				Static13.method134();
			} else {
				arg0.method8123();
			}
		} catch (@Pc(456) Exception_Sub1 local456) {
		}
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V")
	public static void method8585() {
		Static267.anInt5037 = -1;
		Static177.aClass25_1 = null;
		Static418.anInt7055 = -1;
		Static632.anInterface8_1 = null;
		Static256.anIntArray322 = null;
		Static660.anInt10216 = -1;
		Static535.aClass16_10 = null;
		Static164.anInt3010 = -1;
		Static273.aClass25_3 = null;
		Static560.anInterface8Array1 = null;
		Static576.aClass25_8 = null;
		Static455.aClass211_3.method4939();
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method8587(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class3_Sub6_Sub7 local9 = Static198.method3146((long) arg1, 2);
		local9.method1712();
		local9.aString19 = arg0;
	}
}

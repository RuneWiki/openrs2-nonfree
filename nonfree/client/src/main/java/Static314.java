import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "[Lclient!bka;")
	public static Class9[] aClass9Array22;

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "Lclient!tj;")
	public static final Class357 aClass357_27 = new Class357();

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I[B)V")
	public static synchronized void method4747(@OriginalArg(1) byte[] arg0) {
		if (arg0.length == 100 && Static329.anInt5742 < 1000) {
			Static251.aByteArrayArray7[Static329.anInt5742++] = arg0;
		} else if (arg0.length == 5000 && Static52.anInt868 < 250) {
			Static232.aByteArrayArray5[Static52.anInt868++] = arg0;
		} else if (arg0.length == 30000 && Static11.anInt148 < 50) {
			Static672.aByteArrayArray24[Static11.anInt148++] = arg0;
		} else if (Static252.aByteArrayArrayArray16 != null) {
			for (@Pc(79) int local79 = 0; local79 < Static121.anIntArray112.length; local79++) {
				if (arg0.length == Static121.anIntArray112[local79] && Static624.anIntArray578[local79] < Static252.aByteArrayArrayArray16[local79].length) {
					Static252.aByteArrayArrayArray16[local79][Static624.anIntArray578[local79]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method4748(@OriginalArg(0) int arg0) {
		@Pc(20) byte[] local20;
		if (arg0 == 100 && Static329.anInt5742 > 0) {
			local20 = Static251.aByteArrayArray7[--Static329.anInt5742];
			Static251.aByteArrayArray7[Static329.anInt5742] = null;
			return local20;
		} else if (arg0 == 5000 && Static52.anInt868 > 0) {
			local20 = Static232.aByteArrayArray5[--Static52.anInt868];
			Static232.aByteArrayArray5[Static52.anInt868] = null;
			return local20;
		} else if (arg0 == 30000 && Static11.anInt148 > 0) {
			local20 = Static672.aByteArrayArray24[--Static11.anInt148];
			Static672.aByteArrayArray24[Static11.anInt148] = null;
			return local20;
		} else {
			if (Static252.aByteArrayArrayArray16 != null) {
				for (@Pc(83) int local83 = 0; local83 < Static121.anIntArray112.length; local83++) {
					if (Static121.anIntArray112[local83] == arg0 && Static624.anIntArray578[local83] > 0) {
						@Pc(108) byte[] local108 = Static252.aByteArrayArrayArray16[local83][--Static624.anIntArray578[local83]];
						Static252.aByteArrayArrayArray16[local83][Static624.anIntArray578[local83]] = null;
						return local108;
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IILclient!wka;Lclient!wka;IIIIII)V")
	public static void method4749(@OriginalArg(1) int arg0, @OriginalArg(2) Class19_Sub1_Sub3_Sub2 arg1, @OriginalArg(3) Class19_Sub1_Sub3_Sub2 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(9) int local9 = arg2.method6603();
		if (local9 == -1) {
			return;
		}
		@Pc(24) Class9 local24 = (Class9) Static297.aClass338_27.method8049((long) local9);
		if (local24 == null) {
			@Pc(31) Class194[] local31 = Static728.method4754(Static403.aClass221_115, local9);
			if (local31 == null) {
				return;
			}
			local24 = Static488.aClass67_12.method7659(local31[0], true);
			Static297.aClass338_27.method8044((long) local9, local24);
		}
		Static472.method6966(arg1.aByte146, arg1.method6592() * 256, arg1.anInt11204, arg1.anInt11211, 0);
		@Pc(71) int local71 = Static335.anIntArray331[0] + arg5 - 18;
		@Pc(80) int local80 = arg3 + Static335.anIntArray331[1] - 70;
		@Pc(88) int local88 = local71 + arg6 / 4 * 18;
		@Pc(96) int local96 = local80 + arg6 % 4 * 18;
		local24.method8617(local88, local96);
		if (arg1 == arg2) {
			Static488.aClass67_12.method7647(-256, local88 - 1, local96 - 1, 18, 18);
		}
		Static30.method402(local96 - 1, local88 - -18, local88 - 1, local96 + 18);
		@Pc(134) Class19_Sub2 local134 = Static373.method5413();
		local134.anInt1541 = local88;
		local134.aClass19_Sub1_Sub3_Sub2_1 = arg2;
		local134.anInt1539 = local96 + 16;
		local134.anInt1540 = local96;
		local134.anInt1545 = local88 + 16;
		Static624.aClass66_9.method1375(local134);
	}
}

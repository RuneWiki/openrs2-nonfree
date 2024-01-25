import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!ru", name = "M", descriptor = "Lclient!hn;")
	public static Class107 aClass107_182;

	@OriginalMember(owner = "client!ru", name = "H", descriptor = "[Lclient!eb;")
	public static final Class59[] aClass59Array1 = new Class59[2048];

	@OriginalMember(owner = "client!ru", name = "K", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_181 = new Class107(73, -1);

	@OriginalMember(owner = "client!ru", name = "L", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_74 = new Class179(31, 3);

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "()V")
	public static void method4921() {
		Static336.method4750(Static68.anInt1553);
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIZII)V")
	public static void method4922(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (client.lb == null) {
			Static415.aClass39_11.method4563(arg0, -16777216, arg1, arg4, arg3);
		} else if (Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7300 >= 0 && Static195.anInt3537 * 128 > Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7300 && Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7298 >= 0 && Static118.anInt2419 * 128 > Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7298) {
			Static244.anInt4494++;
			if (Static452.aClass31_Sub2_Sub1_Sub1_2 != null && Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7300 + 64 - Static452.aClass31_Sub2_Sub1_Sub1_2.method5989() * 64 >> 7 == Static414.anInt6715 && Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7298 - (Static452.aClass31_Sub2_Sub1_Sub1_2.method5989() - 1) * 64 >> 7 == Static207.anInt3927) {
				Static207.anInt3927 = -1;
				Static414.anInt6715 = -1;
				Static246.method4273();
			}
			Static9.method5190();
			if (!arg2) {
				Static186.method2934();
			}
			Static235.method3555();
			Static105.method1875(arg4, true, arg1, arg0, arg3);
			@Pc(107) int local107 = Static449.anInt7211;
			@Pc(109) int local109 = Static139.anInt2722;
			@Pc(111) int local111 = Static72.anInt1632;
			@Pc(113) int local113 = Static14.anInt406;
			@Pc(121) int local121;
			@Pc(154) int local154;
			if (Static345.anInt5797 == 1) {
				local121 = (int) Static201.aFloat56;
				if (local121 < Static247.anInt7104 >> 8) {
					local121 = Static247.anInt7104 >> 8;
				}
				if (Static62.aBooleanArray8[4] && local121 < Static458.anIntArray663[4] + 128) {
					local121 = Static458.anIntArray663[4] + 128;
				}
				local154 = Static444.anInt7150 + (int) Static142.aFloat89 & 0x3FFF;
				Static188.method2961(Static301.method4312(Static357.anInt5881, Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7300, Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7298) - 50, Static299.anInt698, (local121 >> 3) * 3 + 600 << 0, local107, Static3.anInt108, local154, local121);
			} else if (Static345.anInt5797 == 4) {
				local121 = (int) Static201.aFloat56;
				if (Static247.anInt7104 >> 8 > local121) {
					local121 = Static247.anInt7104 >> 8;
				}
				if (Static62.aBooleanArray8[4] && local121 < Static458.anIntArray663[4] + 128) {
					local121 = Static458.anIntArray663[4] + 128;
				}
				local154 = (int) Static142.aFloat89 & 0x3FFF;
				Static188.method2961(Static301.method4312(Static357.anInt5881, Static190.anInt3416, Static2.anInt63) - 50, Static299.anInt698, (local121 >> 3) * 3 + 600 << 0, local107, Static3.anInt108, local154, local121);
			} else if (Static345.anInt5797 == 5) {
				Static6.method156(local107);
			}
			local121 = Static139.anInt2727;
			local154 = Static142.anInt5535;
			@Pc(263) int local263 = Static92.anInt1946;
			@Pc(265) int local265 = Static296.anInt5167;
			@Pc(267) int local267 = Static406.anInt6527;
			@Pc(310) int local310;
			for (@Pc(269) int local269 = 0; local269 < 5; local269++) {
				if (Static62.aBooleanArray8[local269]) {
					local310 = (int) ((double) (Static121.anIntArray196[local269] * 2 + 1) * Math.random() - (double) Static121.anIntArray196[local269] + Math.sin((double) Static297.anIntArray446[local269] * ((double) Static321.anIntArray508[local269] / 100.0D)) * (double) Static458.anIntArray663[local269]);
					if (local269 == 2) {
						Static92.anInt1946 += local310;
					}
					if (local269 == 4) {
						Static296.anInt5167 += local310;
						if (Static296.anInt5167 < 1024) {
							Static296.anInt5167 = 1024;
						} else if (Static296.anInt5167 > 3072) {
							Static296.anInt5167 = 3072;
						}
					}
					if (local269 == 3) {
						Static406.anInt6527 = local310 + Static406.anInt6527 & 0x3FFF;
					}
					if (local269 == 0) {
						Static139.anInt2727 += local310;
					}
					if (local269 == 1) {
						Static142.anInt5535 += local310;
					}
				}
			}
			if (Static139.anInt2727 < 0) {
				Static139.anInt2727 = 0;
			}
			if (Static92.anInt1946 < 0) {
				Static92.anInt1946 = 0;
			}
			if (Static139.anInt2727 > (Static132.anInt2639 << 7) - 1) {
				Static139.anInt2727 = (Static132.anInt2639 << 7) - 1;
			}
			if (Static92.anInt1946 > (Static87.anInt1875 << 7) - 1) {
				Static92.anInt1946 = (Static87.anInt1875 << 7) - 1;
			}
			Static378.method3540();
			Static191.method2972();
			Static415.aClass39_11.OA(local109, local111, local113 + local109, local107 + local111);
			Static415.aClass39_11.method4524();
			local310 = Static200.anInt3837;
			if (Static432.aClass171_1 == null) {
				Static415.aClass39_11.p(local310);
			} else {
				Static432.aClass171_1.method3878(local107, Static422.anInt6824 << 3, local111, Static406.anInt6527, Static415.aClass39_11, Static296.anInt5167, local113, local109, local310);
			}
			Static435.method5771();
			Static260.aClass33_4.s(Static139.anInt2727, Static142.anInt5535, Static92.anInt1946, -Static296.anInt5167 & 0x3FFF, -Static406.anInt6527 & 0x3FFF, -Static264.anInt4689 & 0x3FFF);
			Static415.aClass39_11.ea(Static260.aClass33_4);
			Static415.aClass39_11.H(local113 / 2 + local109, local111 - -(local107 / 2), Static439.anInt7059 << 1, Static439.anInt7059 << 1);
			Static332.method4699(local113 / 2 + local109, Static439.anInt7059 << 1, Static439.anInt7059 << 1, local111 + local107 / 2);
			Static369.method5057(Static142.anInt5535, -Static296.anInt5167 & 0x3FFF, -Static264.anInt4689 & 0x3FFF, Static139.anInt2727, -Static406.anInt6527 & 0x3FFF, Static92.anInt1946);
			@Pc(534) byte local534 = Static38.aClass135_Sub1_1.method4241(Static143.anInt2766) == 2 ? (byte) Static244.anInt4494 : 1;
			Static338.method4753(Static415.aClass39_11, Static378.anInt4244, Static276.anInt4868, Static260.aClass33_4, Static139.anInt2727, Static142.anInt5535, Static92.anInt1946, Static22.aByteArrayArrayArray10, Static257.anIntArray392, Static24.anIntArray48, Static397.anIntArray590, Static19.anIntArray42, Static188.anIntArray301, Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100 + 1, local534, Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7300 >> 7, Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7298 >> 7, !Static38.aClass135_Sub1_1.aBoolean352);
			Static435.method5771();
			if (Static342.anInt5771 == 9) {
				Static42.method758(local111, local113, local107, local109);
				Static194.method3014(local107, local111, local109, local113);
				Static133.method2307(local107, local113, local111, local109);
				Static356.method4893(local113, local111, local107, local109);
			}
			Static364.method4979();
			Static92.anInt1946 = local263;
			Static142.anInt5535 = local154;
			Static139.anInt2727 = local121;
			Static406.anInt6527 = local267;
			Static296.anInt5167 = local265;
			if (Static189.aBoolean207 && Static365.aClass195_2.method4453() == 0) {
				Static189.aBoolean207 = false;
			}
			if (Static189.aBoolean207) {
				Static415.aClass39_11.method4563(local111, -16777216, local113, local109, local107);
				Static18.method3000(false, Static343.aClass7_150.method331(Static341.anInt5770), Static312.aClass71_7);
			}
		} else {
			Static415.aClass39_11.method4563(arg0, -16777216, arg1, arg4, arg3);
		}
	}
}

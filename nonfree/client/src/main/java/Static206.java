import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!gfa", name = "f", descriptor = "I")
	public static int anInt11288;

	@OriginalMember(owner = "client!gfa", name = "i", descriptor = "[I")
	public static final int[] anIntArray640 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "I")
	public static int anInt11291 = 104;

	@OriginalMember(owner = "client!gfa", name = "c", descriptor = "Z")
	public static boolean aBoolean816 = false;

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ZIIIII)V")
	public static void method9437(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static584.aClass262ArrayArrayArray2 == null) {
			Static488.aClass67_12.method7696(arg3, arg2, arg1, arg4, -16777216);
			return;
		}
		@Pc(19) boolean local19 = false;
		if (Static334.anInt5845 == 0) {
			if (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11204 < 0 || Static362.anInt8653 * 512 <= Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11204 || Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11211 < 0 || anInt11291 * 512 <= Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11211) {
				local19 = true;
			}
		} else if (!Static484.aBoolean631) {
			local19 = true;
		}
		if (local19) {
			Static488.aClass67_12.method7696(arg3, arg2, arg1, arg4, -16777216);
			return;
		}
		Static220.anInt4252++;
		if (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2 != null && Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11204 + 256 - Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.method6592() * 256 >> 9 == Static482.anInt8391 && Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11211 + 256 - Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.method6592() * 256 >> 9 == Static493.anInt8491) {
			Static493.anInt8491 = -1;
			Static482.anInt8391 = -1;
			Static639.method8670();
		}
		Static674.method8920();
		if (!arg0) {
			Static488.method7096();
		}
		Static240.method9043(true, arg4, arg3, arg1, arg2);
		@Pc(153) int local153 = Static575.anInt9442;
		@Pc(155) int local155 = Static523.anInt8906;
		@Pc(157) int local157 = Static141.anInt2657;
		@Pc(159) int local159 = Static9.anInt141;
		Static705.anInt11029 = Static705.anInt11025;
		@Pc(169) int local169;
		@Pc(205) int local205;
		if (Static175.anInt10579 == 1) {
			local169 = (int) Static27.aFloat4;
			if (local169 < Static678.anInt11088 >> 8) {
				local169 = Static678.anInt11088 >> 8;
			}
			if (Static197.aBooleanArray10[4] && local169 < Static175.anIntArray593[4] + 128) {
				local169 = Static175.anIntArray593[4] + 128;
			}
			local205 = (int) Static658.aFloat196 + Static344.anInt5903 & 0x3FFF;
			Static327.method4881(Static680.anInt10754, local169, local205, local153, Static505.method7237(Static712.anInt11117, Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11211, Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11204) - 200, Static270.anInt4887, (local169 >> 3) * 3 + 600 << 2);
		} else if (Static175.anInt10579 == 4) {
			local169 = (int) Static27.aFloat4;
			if (local169 < Static678.anInt11088 >> 8) {
				local169 = Static678.anInt11088 >> 8;
			}
			if (Static197.aBooleanArray10[4] && Static175.anIntArray593[4] + 128 > local169) {
				local169 = Static175.anIntArray593[4] + 128;
			}
			local205 = (int) Static658.aFloat196 & 0x3FFF;
			Static327.method4881(Static680.anInt10754, local169, local205, local153, Static505.method7237(Static712.anInt11117, Static46.anInt795, Static599.anInt9774) - 200, Static270.anInt4887, (local169 >> 3) * 3 + 600 << 2);
		} else if (Static175.anInt10579 == 5) {
			Static173.method2695(local153);
		}
		local169 = Static173.anInt3144;
		local205 = Static376.anInt6408;
		@Pc(321) int local321 = Static235.anInt4471;
		@Pc(323) int local323 = Static228.anInt9136;
		@Pc(325) int local325 = Static703.anInt10997;
		@Pc(370) int local370;
		for (@Pc(327) int local327 = 0; local327 < 5; local327++) {
			if (Static197.aBooleanArray10[local327]) {
				local370 = (int) (Math.random() * (double) (Static395.anIntArray384[local327] * 2 + 1) - (double) Static395.anIntArray384[local327] + Math.sin((double) Static272.anIntArray280[local327] * ((double) Static664.anIntArray594[local327] / 100.0D)) * (double) Static175.anIntArray593[local327]);
				if (local327 == 2) {
					Static235.anInt4471 += local370 << 2;
				}
				if (local327 == 1) {
					Static376.anInt6408 += local370 << 2;
				}
				if (local327 == 4) {
					Static228.anInt9136 += local370;
					if (Static228.anInt9136 < 1024) {
						Static228.anInt9136 = 1024;
					} else if (Static228.anInt9136 > 3072) {
						Static228.anInt9136 = 3072;
					}
				}
				if (local327 == 0) {
					Static173.anInt3144 += local370 << 2;
				}
				if (local327 == 3) {
					Static703.anInt10997 = local370 + Static703.anInt10997 & 0x3FFF;
				}
			}
		}
		if (Static173.anInt3144 < 0) {
			Static173.anInt3144 = 0;
		}
		if (Static173.anInt3144 > (Static509.anInt8656 << 9) - 1) {
			Static173.anInt3144 = (Static509.anInt8656 << 9) - 1;
		}
		if (Static235.anInt4471 < 0) {
			Static235.anInt4471 = 0;
		}
		if ((Static164.anInt3059 << 9) - 1 < Static235.anInt4471) {
			Static235.anInt4471 = (Static164.anInt3059 << 9) - 1;
		}
		Static477.method6995();
		Static488.aClass67_12.KA(local157, local155, local157 + local159, local155 + local153);
		Static624.method8446(true);
		local370 = Static636.anInt10300;
		Static122.aClass181_12.method6352(Static173.anInt3144, Static376.anInt6408, Static235.anInt4471, -Static228.anInt9136 & 0x3FFF, -Static703.anInt10997 & 0x3FFF, -Static212.anInt3807 & 0x3FFF);
		Static488.aClass67_12.method7642(Static122.aClass181_12);
		Static488.aClass67_12.DA(local159 / 2 + local157, local155 - -(local153 / 2), Static2.anInt10934 << 1, Static2.anInt10934 << 1);
		if (Static178.aBoolean264) {
			Static656.method8787(Static636.anInt10300);
			if (Static631.anInt10199 != Static705.anInt11029) {
				Static70.aBoolean89 = true;
			}
			Static631.anInt10199 = Static705.anInt11029;
			Static488.aClass67_12.GA(local370);
			Static488.aClass67_12.ya();
		} else if (Static492.aClass275_4 == null) {
			Static488.aClass67_12.GA(local370);
			Static488.aClass67_12.ya();
		} else {
			Static488.aClass67_12.xa(1.0F);
			Static488.aClass67_12.ZA(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
			Static492.aClass275_4.method6908(local370, Static212.anInt3807, local157, local155, Static488.aClass67_12, local159, Static703.anInt10997, Static228.anInt9136, Static134.anInt2495 << 3, local153);
		}
		Static140.method2345();
		Static545.method5922(Static2.anInt10934 << 1, local153 / 2 + local155, local157 - -(local159 / 2), Static2.anInt10934 << 1);
		Static726.method9448(-Static212.anInt3807 & 0x3FFF, Static376.anInt6408, -Static703.anInt10997 & 0x3FFF, -Static228.anInt9136 & 0x3FFF, Static173.anInt3144, Static235.anInt4471);
		Static359.method5141();
		@Pc(680) byte local680 = Static713.aClass3_Sub55_31.aClass15_Sub7_2.method2473() == 2 ? (byte) Static220.anInt4252 : 1;
		if (Static178.aBoolean264) {
			Static460.method6828(-Static212.anInt3807 & 0x3FFF, -Static228.anInt9136 & 0x3FFF, -Static703.anInt10997 & 0x3FFF);
			Static484.method7067(Static713.aClass3_Sub55_31.aClass15_Sub19_1.method7116() == 0, Static376.anInt6408, Static269.anInt4883, Static705.anInt11029, Static228.anIntArray503, Static603.anIntArray546, local680, Static287.anIntArray305, Static167.anIntArray153, Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146 + 1, Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11204 >> 9, Static173.anInt3144, Static221.aByteArrayArrayArray15, Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11211 >> 9, Static235.anInt4471, Static482.anIntArray460);
		} else {
			Static531.method7495(Static269.anInt4883, Static173.anInt3144, Static376.anInt6408, Static235.anInt4471, Static221.aByteArrayArrayArray15, Static287.anIntArray305, Static167.anIntArray153, Static228.anIntArray503, Static482.anIntArray460, Static603.anIntArray546, Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146 + 1, local680, Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11204 >> 9, Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11211 >> 9, Static713.aClass3_Sub55_31.aClass15_Sub19_1.method7116() == 0, Static568.aBoolean784 ? Static705.anInt11029 : -1, 0, false);
		}
		Static140.method2345();
		if (Static178.anInt3225 == 11) {
			Static349.method5053(local153, local155, local159, local157);
			Static488.method7097(local159, local157, local153, local155);
			Static549.method7769(local155, local157, local159, local153);
			Static723.method9425(local159, local155, local153, local157);
		}
		Static377.method5452();
		Static228.anInt9136 = local323;
		Static703.anInt10997 = local325;
		Static235.anInt4471 = local321;
		Static376.anInt6408 = local205;
		Static173.anInt3144 = local169;
		if (Static343.aBoolean473 && Static406.aClass153_2.method3735() == 0) {
			Static343.aBoolean473 = false;
		}
		if (Static343.aBoolean473) {
			Static488.aClass67_12.method7696(local157, local153, local159, local155, -16777216);
			Static52.method679(Static488.aClass67_12, Static687.aClass330_13, Static476.aClass279_12.method6992(Static141.anInt2658), false, Static418.aClass44_32);
		}
		Static624.method8446(false);
	}

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "(IIB)Z")
	public static boolean method9439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!lc", name = "z", descriptor = "Lclient!ur;")
	public static Class322 aClass322_5;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "Lclient!nd;")
	public static final Class210 aClass210_8 = new Class210("RC", 1);

	@OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
	public static int anInt6564 = -1;

	@OriginalMember(owner = "client!lc", name = "u", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_155 = new Class40(1, 2);

	@OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
	public static int anInt6568 = 0;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZI)I")
	public static int method5538(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method5539(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static216.anInt3692++;
		Static15.anInt8428 = 0;
		@Pc(14) int local14;
		@Pc(17) int local17;
		for (@Pc(7) int local7 = Static518.anInt3345; local7 < Static41.anInt687; local7++) {
			@Pc(12) Class9[][] local12 = Static208.aClass9ArrayArrayArray3[local7];
			for (local14 = Static264.anInt4353; local14 < Static312.anInt8640; local14++) {
				for (local17 = Static69.anInt1154; local17 < Static317.anInt5746; local17++) {
					@Pc(24) Class9 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static6.aBooleanArrayArray3[local14 + Static387.anInt6907 - Static325.anInt5850][local17 + Static387.anInt6907 - Static486.anInt8128] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean9 = true;
							local24.aBoolean8 = true;
							if (local24.aClass66_1 == null) {
								local24.aBoolean7 = false;
							} else {
								local24.aBoolean7 = true;
							}
							Static15.anInt8428++;
						} else {
							local24.aBoolean9 = false;
							local24.aBoolean8 = false;
							local24.aByte4 = 0;
							if (local14 >= Static325.anInt5850 - 16 && local14 <= Static325.anInt5850 + 16 && local17 >= Static486.anInt8128 - 16 && local17 <= Static486.anInt8128 + 16 && (local24.aClass29_Sub5_1 != null || local24.aClass29_Sub5_2 != null || local24.aClass29_Sub1_2 != null || local24.aClass29_Sub1_1 != null || local24.aClass29_Sub3_1 != null || local24.aClass66_1 != null)) {
								Static325.aClass158_1.method5354(local24);
							}
						}
					}
				}
			}
		}
		for (@Pc(140) int local140 = Static518.anInt3345; local140 < Static41.anInt687; local140++) {
			if (Static432.aClass121_14.method7142() && local140 >= arg2 && arg1 != null) {
				local14 = Static6.aBooleanArrayArray3.length;
				if (Static264.anInt4353 + Static6.aBooleanArrayArray3.length > Static80.anInt1391) {
					local14 -= Static264.anInt4353 + Static6.aBooleanArrayArray3.length - Static80.anInt1391;
				}
				local17 = Static6.aBooleanArrayArray3[0].length;
				if (Static69.anInt1154 + Static6.aBooleanArrayArray3[0].length > Static164.anInt2881) {
					local17 -= Static69.anInt1154 + Static6.aBooleanArrayArray3[0].length - Static164.anInt2881;
				}
				@Pc(193) int local193 = Static4.anInt86;
				while (true) {
					if (local193 >= local14) {
						Static325.aClass158_1.method5358(Static285.aClass60Array8[local140], true, local140);
						break;
					}
					@Pc(200) int local200 = local193 + Static264.anInt4353 - Static4.anInt86;
					for (@Pc(202) int local202 = Static108.anInt2008; local202 < local17; local202++) {
						Static286.aBooleanArrayArray5[local193][local202] = false;
						if (Static6.aBooleanArrayArray3[local193][local202]) {
							@Pc(221) int local221 = local202 + Static69.anInt1154 - Static108.anInt2008;
							for (@Pc(223) int local223 = local140; local223 >= 0; local223--) {
								if (Static208.aClass9ArrayArrayArray3[local223][local200][local221] != null && Static208.aClass9ArrayArrayArray3[local223][local200][local221].aByte8 == local140) {
									Static286.aBooleanArrayArray5[local193][local202] = Static208.aClass9ArrayArrayArray3[local223][local200][local221].aBoolean9;
									break;
								}
							}
						}
					}
					local193++;
				}
			} else {
				Static325.aClass158_1.method5358(Static285.aClass60Array8[local140], false, local140);
			}
			Static325.aClass158_1.method5352();
		}
		if (!Static57.method749(true)) {
			Static57.method749(false);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!fca;)V")
	public static void method5544(@OriginalArg(1) Class97 arg0) {
		if (arg0.anInt2264 == 5 && arg0.anInt2277 != -1) {
			Static57.method748(arg0, Static176.aClass121_5);
		}
	}
}

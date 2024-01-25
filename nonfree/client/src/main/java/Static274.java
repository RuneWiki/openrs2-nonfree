import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "Lclient!cn;")
	public static Class35 aClass35_4;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
	public static int anInt4304 = 0;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZIZII)V")
	public static void method3429(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static319.aClass258ArrayArrayArray3 == null) {
			Static407.aClass200_9.method5856(arg3, -16777216, arg4, arg0, arg1);
		} else if (Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7500 >= 0 && Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7500 < Static433.anInt7210 * 128 && Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7502 >= 0 && Static418.anInt6969 * 128 > Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7502) {
			Static409.anInt6832++;
			if (Static220.aClass2_Sub1_Sub3_Sub2_1 != null && Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7500 - (Static220.aClass2_Sub1_Sub3_Sub2_1.method4913() - 1) * 64 >> 7 == Static453.anInt6195 && Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7502 - (Static220.aClass2_Sub1_Sub3_Sub2_1.method4913() - 1) * 64 >> 7 == Static209.anInt3498) {
				Static209.anInt3498 = -1;
				Static453.anInt6195 = -1;
				Static143.method2068();
			}
			Static48.method782();
			if (!arg2) {
				Static444.method5894();
			}
			Static438.method5784();
			Static208.method2784(arg1, arg4, arg3, arg0, true);
			@Pc(115) int local115 = Static356.anInt5822;
			@Pc(117) int local117 = Static192.anInt3196;
			@Pc(119) int local119 = Static368.anInt5971;
			@Pc(121) int local121 = Static143.anInt2594;
			@Pc(129) int local129;
			@Pc(162) int local162;
			if (Static449.anInt7379 == 1) {
				local129 = (int) Static10.aFloat7;
				if (Static304.anInt4780 >> 8 > local129) {
					local129 = Static304.anInt4780 >> 8;
				}
				if (Static222.aBooleanArray12[4] && local129 < Static193.anIntArray184[4] + 128) {
					local129 = Static193.anIntArray184[4] + 128;
				}
				local162 = Static185.anInt3145 + (int) Static99.aFloat33 & 0x3FFF;
				Static306.method1857(local129, Static192.method2572(Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7502, Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7500, Static6.anInt131) - 50, Static300.anInt4681, Static45.anInt41, local121, (local129 >> 3) * 3 + 600 << 0, local162);
			} else if (Static449.anInt7379 == 4) {
				local129 = (int) Static10.aFloat7;
				if (Static304.anInt4780 >> 8 > local129) {
					local129 = Static304.anInt4780 >> 8;
				}
				if (Static222.aBooleanArray12[4] && local129 < Static193.anIntArray184[4] + 128) {
					local129 = Static193.anIntArray184[4] + 128;
				}
				local162 = (int) Static99.aFloat33 & 0x3FFF;
				Static306.method1857(local129, Static192.method2572(Static21.anInt449, Static423.anInt7090, Static6.anInt131) - 50, Static300.anInt4681, Static45.anInt41, local121, (local129 >> 3) * 3 + 600 << 0, local162);
			} else if (Static449.anInt7379 == 5) {
				Static41.method659(local121);
			}
			local129 = Static116.anInt1977;
			local162 = Static444.anInt7360;
			@Pc(268) int local268 = Static393.anInt4184;
			@Pc(270) int local270 = Static248.anInt3998;
			@Pc(272) int local272 = Static442.anInt7328;
			@Pc(316) int local316;
			for (@Pc(274) int local274 = 0; local274 < 5; local274++) {
				if (Static222.aBooleanArray12[local274]) {
					local316 = (int) ((double) -Static11.anIntArray14[local274] + (double) (Static11.anIntArray14[local274] * 2 + 1) * Math.random() + Math.sin((double) Static47.anIntArray42[local274] * ((double) Static432.anIntArray486[local274] / 100.0D)) * (double) Static193.anIntArray184[local274]);
					if (local274 == 4) {
						Static248.anInt3998 += local316;
						if (Static248.anInt3998 < 1024) {
							Static248.anInt3998 = 1024;
						} else if (Static248.anInt3998 > 3072) {
							Static248.anInt3998 = 3072;
						}
					}
					if (local274 == 0) {
						Static116.anInt1977 += local316;
					}
					if (local274 == 2) {
						Static393.anInt4184 += local316;
					}
					if (local274 == 3) {
						Static442.anInt7328 = local316 + Static442.anInt7328 & 0x3FFF;
					}
					if (local274 == 1) {
						Static444.anInt7360 += local316;
					}
				}
			}
			if (Static116.anInt1977 < 0) {
				Static116.anInt1977 = 0;
			}
			if ((Static439.anInt7318 << 7) - 1 < Static116.anInt1977) {
				Static116.anInt1977 = (Static439.anInt7318 << 7) - 1;
			}
			if (Static393.anInt4184 < 0) {
				Static393.anInt4184 = 0;
			}
			if (Static393.anInt4184 > (Static459.anInt4775 << 7) - 1) {
				Static393.anInt4184 = (Static459.anInt4775 << 7) - 1;
			}
			Static54.method841();
			Static268.method3384();
			Static407.aClass200_9.ba(local119, local117, local119 + local115, local121 + local117);
			Static407.aClass200_9.method5881();
			local316 = Static300.anInt4682;
			if (Static51.aClass207_1 == null) {
				Static407.aClass200_9.t(local316);
			} else {
				Static51.aClass207_1.method4567(local117, Static293.anInt4611 << 3, Static442.anInt7328, local316, Static248.anInt3998, Static407.aClass200_9, local115, local121, local119);
			}
			Static341.method4427();
			Static43.aClass29_5.YA(Static116.anInt1977, Static444.anInt7360, Static393.anInt4184, -Static248.anInt3998 & 0x3FFF, -Static442.anInt7328 & 0x3FFF, -Static194.anInt3230 & 0x3FFF);
			Static407.aClass200_9.SA(Static43.aClass29_5);
			Static407.aClass200_9.GA(local115 / 2 + local119, local117 + local121 / 2, Static444.anInt7355 << 1, Static444.anInt7355 << 1);
			Static342.method4458(Static444.anInt7355 << 1, Static444.anInt7355 << 1, local119 + local115 / 2, local117 - -(local121 / 2));
			Static379.method3485(Static116.anInt1977, -Static442.anInt7328 & 0x3FFF, -Static248.anInt3998 & 0x3FFF, -Static194.anInt3230 & 0x3FFF, Static393.anInt4184, Static444.anInt7360);
			@Pc(552) byte local552 = Static216.aClass1_Sub1_1.method3589(Static146.anInt2644) == 2 ? (byte) Static409.anInt6832 : 1;
			Static138.method1986(Static407.aClass200_9, Static85.anInt1536, Static60.anInt1114, Static43.aClass29_5, Static116.anInt1977, Static444.anInt7360, Static393.anInt4184, Static264.aByteArrayArrayArray15, Static264.anIntArray332, Static275.anIntArray342, Static238.anIntArray250, Static432.anIntArray485, Static439.anIntArray491, Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105 + 1, local552, Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7500 >> 7, Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7502 >> 7, !Static216.aClass1_Sub1_1.aBoolean308);
			Static341.method4427();
			if (Static376.anInt6324 == 9) {
				Static165.method2315(local121, local119, local117, local115);
				Static255.method3307(local115, local121, local119, local117);
				Static281.method5918(local119, local117, local121, local115);
				Static188.method2541(local119, local121, local115, local117);
			}
			Static228.method2999();
			Static442.anInt7328 = local272;
			Static116.anInt1977 = local129;
			Static248.anInt3998 = local270;
			Static393.anInt4184 = local268;
			Static444.anInt7360 = local162;
			if (Static89.aBoolean110 && Static247.aClass87_2.method1861() == 0) {
				Static89.aBoolean110 = false;
			}
			if (Static89.aBoolean110) {
				Static407.aClass200_9.method5856(local117, -16777216, local115, local121, local119);
				Static255.method3305(Static428.aClass23_4, Static427.aClass198_118.method4012(Static38.anInt4834), false);
			}
		} else {
			Static407.aClass200_9.method5856(arg3, -16777216, arg4, arg0, arg1);
		}
	}
}

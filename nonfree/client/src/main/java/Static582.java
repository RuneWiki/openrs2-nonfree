import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static582 {

	@OriginalMember(owner = "client!to", name = "K", descriptor = "[[S")
	public static short[][] aShortArrayArray18;

	@OriginalMember(owner = "client!to", name = "L", descriptor = "[[B")
	public static byte[][] aByteArrayArray49;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BII)I")
	public static int method8311(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static388.anIntArray523[arg0 & 0x3] : Static464.anIntArray617[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIZI)V")
	public static void method8312(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (Static486.aClass58ArrayArrayArray2 == null) {
			Static677.aClass137_47.method7869(arg2, arg0, -16777216, arg1, arg4);
		} else if (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt10998 >= 0 && Static26.anInt462 * 512 > Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt10998 && Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt11002 >= 0 && Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt11002 < Static445.anInt6140 * 512) {
			Static274.anInt4757++;
			if (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2 != null && Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt10998 - (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.method2422() - 1) * 256 >> 9 == Static659.anInt10975 && Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt11002 - (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.method2422() - 1) * 256 >> 9 == Static35.anInt964) {
				Static35.anInt964 = -1;
				Static659.anInt10975 = -1;
				Static592.method1599();
			}
			Static172.method2780();
			if (!arg3) {
				Static401.method5990();
			}
			Static429.method3775();
			Static353.method5354(arg1, arg2, true, arg0, arg4);
			@Pc(110) int local110 = Static324.anInt6153;
			Static331.anInt6277 = Static331.anInt6274;
			@Pc(114) int local114 = Static568.anInt9799;
			@Pc(116) int local116 = Static240.anInt4355;
			@Pc(118) int local118 = Static286.anInt4890;
			@Pc(124) int local124;
			@Pc(157) int local157;
			if (Static378.anInt6935 == 1) {
				local124 = (int) Static2.aFloat1;
				if (Static258.anInt4460 >> 8 > local124) {
					local124 = Static258.anInt4460 >> 8;
				}
				if (Static569.aBooleanArray26[4] && Static111.anIntArray174[4] + 128 > local124) {
					local124 = Static111.anIntArray174[4] + 128;
				}
				local157 = Static97.anInt2095 + (int) Static543.aFloat228 & 0x3FFF;
				Static443.method6486((local124 >> 3) * 3 + 600 << 2, Static59.anInt1432, local157, local114, local124, Static152.method2434(Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt10998, Static586.anInt10060, Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt11002) - 200, Static569.anInt9811);
			} else if (Static378.anInt6935 == 4) {
				local124 = (int) Static2.aFloat1;
				if (local124 < Static258.anInt4460 >> 8) {
					local124 = Static258.anInt4460 >> 8;
				}
				if (Static569.aBooleanArray26[4] && local124 < Static111.anIntArray174[4] + 128) {
					local124 = Static111.anIntArray174[4] + 128;
				}
				local157 = (int) Static543.aFloat228 & 0x3FFF;
				Static443.method6486((local124 >> 3) * 3 + 600 << 2, Static59.anInt1432, local157, local114, local124, Static152.method2434(Static322.anInt6116, Static586.anInt10060, Static620.anInt10427) - 200, Static569.anInt9811);
			} else if (Static378.anInt6935 == 5) {
				Static271.method3953(local114);
			}
			local124 = Static233.anInt4273;
			local157 = Static396.anInt7302;
			@Pc(270) int local270 = Static74.anInt1618;
			@Pc(272) int local272 = Static668.anInt11106;
			@Pc(274) int local274 = Static219.anInt4123;
			@Pc(318) int local318;
			for (@Pc(276) int local276 = 0; local276 < 5; local276++) {
				if (Static569.aBooleanArray26[local276]) {
					local318 = (int) ((double) -Static432.anIntArray569[local276] + (double) (Static432.anIntArray569[local276] * 2 + 1) * Math.random() + Math.sin((double) Static469.anIntArray827[local276] / 100.0D * (double) Static417.anIntArray788[local276]) * (double) Static111.anIntArray174[local276]);
					if (local276 == 4) {
						Static668.anInt11106 += local318;
						if (Static668.anInt11106 < 1024) {
							Static668.anInt11106 = 1024;
						} else if (Static668.anInt11106 > 3072) {
							Static668.anInt11106 = 3072;
						}
					}
					if (local276 == 1) {
						Static396.anInt7302 += local318 << 2;
					}
					if (local276 == 3) {
						Static219.anInt4123 = Static219.anInt4123 + local318 & 0x3FFF;
					}
					if (local276 == 2) {
						Static74.anInt1618 += local318 << 2;
					}
					if (local276 == 0) {
						Static233.anInt4273 += local318 << 2;
					}
				}
			}
			if (Static233.anInt4273 < 0) {
				Static233.anInt4273 = 0;
			}
			if (Static74.anInt1618 < 0) {
				Static74.anInt1618 = 0;
			}
			if (Static233.anInt4273 > (Static28.anInt704 << 9) - 1) {
				Static233.anInt4273 = (Static28.anInt704 << 9) - 1;
			}
			if (Static74.anInt1618 > (Static55.anInt1384 << 9) - 1) {
				Static74.anInt1618 = (Static55.anInt1384 << 9) - 1;
			}
			Static189.method2971();
			Static529.method7862();
			Static677.aClass137_47.KA(local116, local110, local118 + local116, local110 + local114);
			Static331.method5193(true);
			if (Static128.aBoolean202) {
				Static162.method9169(Static213.anInt4048);
				if (Static96.anInt2066 != Static331.anInt6277) {
					Static17.aBoolean15 = true;
				}
				Static96.anInt2066 = Static331.anInt6277;
			} else {
				Static677.aClass137_47.ya();
				local318 = Static213.anInt4048;
				if (Static378.aClass153_1 == null) {
					Static677.aClass137_47.GA(local318);
				} else {
					Static378.aClass153_1.method3545(local118, Static668.anInt11106, Static677.aClass137_47, local318, Static419.anInt7564 << 3, local116, local114, Static219.anInt4123, local110);
				}
			}
			Static299.method4404();
			Static551.aClass26_7.method6445(Static233.anInt4273, Static396.anInt7302, Static74.anInt1618, -Static668.anInt11106 & 0x3FFF, -Static219.anInt4123 & 0x3FFF, -Static4.anInt27 & 0x3FFF);
			Static677.aClass137_47.method7950(Static551.aClass26_7);
			Static677.aClass137_47.DA(local118 / 2 + local116, local114 / 2 + local110, Static625.anInt10537 << 1, Static625.anInt10537 << 1);
			Static102.method1825(Static625.anInt10537 << 1, local118 / 2 + local116, local114 / 2 + local110, Static625.anInt10537 << 1);
			Static648.method9018(-Static4.anInt27 & 0x3FFF, Static233.anInt4273, -Static668.anInt11106 & 0x3FFF, Static74.anInt1618, Static396.anInt7302, -Static219.anInt4123 & 0x3FFF);
			@Pc(573) byte local573 = Static56.aClass14_Sub22_5.aClass21_Sub25_2.method8195() == 2 ? (byte) Static274.anInt4757 : 1;
			if (Static128.aBoolean202) {
				Static532.method7626(-Static4.anInt27 & 0x3FFF, -Static219.anInt4123 & 0x3FFF, -Static668.anInt11106 & 0x3FFF);
				Static656.method9107(Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146 + 1, Static241.anIntArray343, Static87.anInt1951, Static616.anIntArray762, Static233.anInt4273, Static74.anInt1618, Static331.anInt6277, Static56.aClass14_Sub22_5.aClass21_Sub19_1.method6498() == 0, Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt11002 >> 9, local573, Static666.anIntArray821, Static539.aByteArrayArrayArray17, Static230.anIntArray335, Static563.anIntArray705, Static396.anInt7302, Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt10998 >> 9);
			} else {
				Static218.method3411(Static87.anInt1951, Static233.anInt4273, Static396.anInt7302, Static74.anInt1618, Static539.aByteArrayArrayArray17, Static666.anIntArray821, Static230.anIntArray335, Static241.anIntArray343, Static563.anIntArray705, Static616.anIntArray762, Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146 + 1, local573, Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt10998 >> 9, Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt11002 >> 9, Static56.aClass14_Sub22_5.aClass21_Sub19_1.method6498() == 0, Static401.aBoolean511 ? Static331.anInt6277 : -1, 0, false);
			}
			Static299.method4404();
			if (Static430.anInt7691 == 10) {
				Static508.method7433(local118, local116, local114, local110);
				Static100.method1802(local118, local116, local114, local110);
				Static497.method8711(local116, local114, local110, local118);
				Static513.method7469(local116, local118, local110, local114);
			}
			Static193.method2993();
			Static74.anInt1618 = local270;
			Static219.anInt4123 = local274;
			Static668.anInt11106 = local272;
			Static396.anInt7302 = local157;
			Static233.anInt4273 = local124;
			if (Static620.aBoolean728 && Static204.aClass135_8.method3065() == 0) {
				Static620.aBoolean728 = false;
			}
			if (Static620.aBoolean728) {
				Static677.aClass137_47.method7869(local116, local118, -16777216, local110, local114);
				Static88.method8992(Static242.aClass38_5, false, Static677.aClass137_47, Static514.aClass303_14.method7473(Static232.anInt4258), Static586.aClass158_12);
			}
			Static331.method5193(false);
		} else {
			Static677.aClass137_47.method7869(arg2, arg0, -16777216, arg1, arg4);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!fq", name = "j", descriptor = "Lclient!da;")
	public static Class57 aClass57_4;

	@OriginalMember(owner = "client!fq", name = "r", descriptor = "Lclient!le;")
	public static final Class222 aClass222_2 = new Class222();

	@OriginalMember(owner = "client!fq", name = "l", descriptor = "Lclient!qw;")
	public static final Class319 aClass319_3 = new Class319();

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIZIII)V")
	public static void method2944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static448.aClass364ArrayArrayArray2 == null) {
			Static153.aClass22_4.method9378(arg4, arg1, -16777216, arg3, arg0);
			return;
		}
		@Pc(19) boolean local19 = false;
		if (Static103.anInt2245 == 0) {
			if (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10694 < 0 || Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10694 >= Static497.anInt7926 * 512 || Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10695 < 0 || Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10695 >= Static646.anInt9979 * 512) {
				local19 = true;
			}
		} else if (!Static521.aBoolean549) {
			local19 = true;
		}
		if (local19) {
			Static153.aClass22_4.method9378(arg4, arg1, -16777216, arg3, arg0);
			return;
		}
		Static247.anInt3877++;
		if (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2 != null && Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10694 - (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.method7485() - 1) * 256 >> 9 == Static681.anInt10651 && Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10695 - (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.method7485() - 1) * 256 >> 9 == Static517.anInt8136) {
			Static681.anInt10651 = -1;
			Static517.anInt8136 = -1;
			Static71.method1569();
		}
		Static41.method1162();
		if (!arg2) {
			Static454.method6025();
		}
		Static511.method6939(arg1, true, arg4, arg3, arg0);
		Static668.anInt10260 = Static668.anInt10259;
		@Pc(140) int local140 = Static469.anInt7375;
		@Pc(142) int local142 = Static117.anInt2407;
		@Pc(144) int local144 = Static581.anInt8861;
		@Pc(146) int local146 = Static239.anInt3796;
		@Pc(154) int local154;
		@Pc(197) int local197;
		if (Static262.anInt4081 == 1) {
			local154 = (int) Static447.aFloat107;
			if (local154 < Static13.anInt569 >> 8) {
				local154 = Static13.anInt569 >> 8;
			}
			if (Static508.aBooleanArray21[4] && Static502.anIntArray582[4] + 128 > local154) {
				local154 = Static502.anIntArray582[4] + 128;
			}
			local197 = Static88.anInt2043 + (int) Static382.aFloat40 & 0x3FFF;
			Static325.method4734(local144, local154, Static77.method1633(Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10695, Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10694, Static723.anInt11225) - 200, Static690.anInt10754, Static504.anInt8040, local197, (local154 >> 3) * 3 + 600 << 2);
		} else if (Static262.anInt4081 == 4) {
			local154 = (int) Static447.aFloat107;
			if (Static13.anInt569 >> 8 > local154) {
				local154 = Static13.anInt569 >> 8;
			}
			if (Static508.aBooleanArray21[4] && Static502.anIntArray582[4] + 128 > local154) {
				local154 = Static502.anIntArray582[4] + 128;
			}
			local197 = (int) Static382.aFloat40 & 0x3FFF;
			Static325.method4734(local144, local154, Static77.method1633(Static78.anInt1842, Static13.anInt566, Static723.anInt11225) - 200, Static690.anInt10754, Static504.anInt8040, local197, (local154 >> 3) * 3 + 600 << 2);
		} else if (Static262.anInt4081 == 5) {
			Static509.method6648(local144);
		}
		local154 = Static305.anInt4908;
		local197 = Static490.anInt7687;
		@Pc(310) int local310 = Static263.anInt4101;
		@Pc(312) int local312 = Static171.anInt8707;
		@Pc(314) int local314 = Static46.anInt1301;
		@Pc(367) int local367;
		for (@Pc(316) int local316 = 0; local316 < 5; local316++) {
			if (Static508.aBooleanArray21[local316]) {
				local367 = (int) ((double) -Static607.anIntArray665[local316] + Math.random() * (double) (Static607.anIntArray665[local316] * 2 + 1) + Math.sin((double) Static286.anIntArray337[local316] / 100.0D * (double) Static502.anIntArray580[local316]) * (double) Static502.anIntArray582[local316]);
				if (local316 == 4) {
					Static171.anInt8707 += local367;
					if (Static171.anInt8707 < 1024) {
						Static171.anInt8707 = 1024;
					} else if (Static171.anInt8707 > 3072) {
						Static171.anInt8707 = 3072;
					}
				}
				if (local316 == 0) {
					Static305.anInt4908 += local367 << 2;
				}
				if (local316 == 3) {
					Static46.anInt1301 = Static46.anInt1301 + local367 & 0x3FFF;
				}
				if (local316 == 1) {
					Static490.anInt7687 += local367 << 2;
				}
				if (local316 == 2) {
					Static263.anInt4101 += local367 << 2;
				}
			}
		}
		if (Static305.anInt4908 < 0) {
			Static305.anInt4908 = 0;
		}
		if (Static263.anInt4101 < 0) {
			Static263.anInt4101 = 0;
		}
		if ((Static128.anInt2531 << 9) - 1 < Static305.anInt4908) {
			Static305.anInt4908 = (Static128.anInt2531 << 9) - 1;
		}
		if (Static263.anInt4101 > (Static448.anInt6835 << 9) - 1) {
			Static263.anInt4101 = (Static448.anInt6835 << 9) - 1;
		}
		Static163.method2668();
		Static153.aClass22_4.KA(local140, local142, local140 + local146, local142 - -local144);
		Static278.method3937(true);
		local367 = Static150.anInt2707;
		Static158.aClass58_1.method9514(Static305.anInt4908, Static490.anInt7687, Static263.anInt4101, -Static171.anInt8707 & 0x3FFF, -Static46.anInt1301 & 0x3FFF, -Static32.anInt1120 & 0x3FFF);
		Static153.aClass22_4.method9405(Static158.aClass58_1);
		Static153.aClass22_4.DA(local146 / 2 + local140, local144 / 2 + local142, Static599.anInt9087 << 1, Static599.anInt9087 << 1);
		if (Static347.aBoolean360) {
			Static22.method649(Static150.anInt2707);
			if (Static668.anInt10260 != Static455.anInt7068) {
				Static632.aBoolean653 = true;
			}
			Static455.anInt7068 = Static668.anInt10260;
			Static153.aClass22_4.GA(local367);
			Static153.aClass22_4.ya();
		} else if (Static538.aClass200_5 == null) {
			Static153.aClass22_4.GA(local367);
			Static153.aClass22_4.ya();
		} else {
			Static153.aClass22_4.xa(1.0F);
			Static153.aClass22_4.ZA(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
			Static538.aClass200_5.method4706(Static153.aClass22_4, local142, local367, local140, local144, Static171.anInt8707, local146, Static32.anInt1120, Static46.anInt1301, Static332.anInt5342 << 3);
		}
		Static445.method5895();
		Static235.method3407(local144 / 2 + local142, local146 / 2 + local140, Static599.anInt9087 << 1, Static599.anInt9087 << 1);
		Static697.method9227(Static490.anInt7687, -Static171.anInt8707 & 0x3FFF, -Static32.anInt1120 & 0x3FFF, -Static46.anInt1301 & 0x3FFF, Static263.anInt4101, Static305.anInt4908);
		Static125.method2294();
		@Pc(677) byte local677 = Static580.aClass3_Sub22_24.aClass21_Sub21_2.method6042() == 2 ? (byte) Static247.anInt3877 : 1;
		if (Static347.aBoolean360) {
			Static693.method9178(-Static171.anInt8707 & 0x3FFF, -Static46.anInt1301 & 0x3FFF, -Static32.anInt1120 & 0x3FFF);
			Static644.method8476(Static668.anInt10260, Static716.anInt11157, Static650.anIntArray724, Static694.anIntArray777, Static502.anIntArray581, Static153.aByteArrayArrayArray3, Static267.anIntArray326, local677, Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139 + 1, Static263.anInt4101, Static490.anInt7687, Static305.anInt4908, Static580.aClass3_Sub22_24.aClass21_Sub9_1.method4103() == 0, Static196.anIntArray284, Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10694 >> 9, Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10695 >> 9);
		} else {
			Static503.method6862(Static716.anInt11157, Static305.anInt4908, Static490.anInt7687, Static263.anInt4101, Static153.aByteArrayArrayArray3, Static694.anIntArray777, Static650.anIntArray724, Static502.anIntArray581, Static196.anIntArray284, Static267.anIntArray326, Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139 + 1, local677, Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10694 >> 9, Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10695 >> 9, Static580.aClass3_Sub22_24.aClass21_Sub9_1.method4103() == 0, Static444.aBoolean451 ? Static668.anInt10260 : -1, 0, false);
		}
		Static445.method5895();
		if (Static98.anInt2140 == 11) {
			Static369.method5073(local142, local144, local140, local146);
			Static502.method6854(local142, local140, local144, local146);
			Static403.method5425(local144, local142, local146, local140);
			Static107.method7325(local144, local146, local142, local140);
		}
		Static607.method7783();
		Static46.anInt1301 = local314;
		Static171.anInt8707 = local312;
		Static305.anInt4908 = local154;
		Static263.anInt4101 = local310;
		Static490.anInt7687 = local197;
		Static543.aBoolean565 = false;
		if (Static125.aBoolean163 && Static294.aClass349_3.method7779() == 0) {
			Static125.aBoolean163 = false;
		}
		if (Static125.aBoolean163) {
			Static153.aClass22_4.method9378(local142, local140, -16777216, local144, local146);
			Static472.method6430(Static153.aClass22_4, false, Static480.aClass57_9, Static52.aClass169_1, Static430.aClass257_12.method5699(Static456.anInt7118));
		}
		Static278.method3937(false);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!sp", name = "I", descriptor = "Lclient!gw;")
	public static final Class91 aClass91_46 = new Class91();

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(BZII)I")
	public static int method5392(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class4_Sub38 local10 = Static351.method5112(arg0, arg1);
		if (local10 == null) {
			return 0;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(29) int local29 = 0; local29 < local10.anIntArray541.length; local29++) {
				if (local10.anIntArray540[local29] == arg2) {
					local27 += local10.anIntArray541[local29];
				}
			}
			return local27;
		}
	}

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "(I)V")
	public static void method5393() {
		@Pc(16) boolean local16 = Static196.aClass4_Sub20_Sub1_4.method4614() == 1;
		@Pc(20) int local20 = Static196.aClass4_Sub20_Sub1_4.method4617();
		@Pc(26) int local26 = Static196.aClass4_Sub20_Sub1_4.method4606();
		Static227.anInt4510 = Static196.aClass4_Sub20_Sub1_4.method4602();
		@Pc(34) int local34 = Static196.aClass4_Sub20_Sub1_4.method4607();
		Static441.method6053();
		Static90.method5069(local20);
		Static196.aClass4_Sub20_Sub1_4.method3235();
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(61) int local61;
		for (@Pc(44) int local44 = 0; local44 < 4; local44++) {
			for (local48 = 0; local48 < Static193.anInt3853 >> 3; local48++) {
				for (local52 = 0; local52 < Static301.anInt5585 >> 3; local52++) {
					local61 = Static196.aClass4_Sub20_Sub1_4.method3245(1);
					if (local61 == 1) {
						Static47.anIntArrayArrayArray1[local44][local48][local52] = Static196.aClass4_Sub20_Sub1_4.method3245(26);
					} else {
						Static47.anIntArrayArrayArray1[local44][local48][local52] = -1;
					}
				}
			}
		}
		Static196.aClass4_Sub20_Sub1_4.method3240();
		local48 = (Static136.anInt2819 - Static196.aClass4_Sub20_Sub1_4.anInt5526) / 16;
		Static423.anIntArrayArray57 = new int[local48][4];
		for (local52 = 0; local52 < local48; local52++) {
			for (local61 = 0; local61 < 4; local61++) {
				Static423.anIntArrayArray57[local52][local61] = Static196.aClass4_Sub20_Sub1_4.method4595();
			}
		}
		Static109.anIntArray203 = new int[local48];
		Static256.aByteArrayArray15 = new byte[local48][];
		Static353.aByteArrayArray18 = new byte[local48][];
		Static55.anIntArray82 = new int[local48];
		Static431.anIntArray600 = new int[local48];
		Static129.anIntArray233 = new int[local48];
		Static164.aByteArrayArray14 = new byte[local48][];
		Static8.aByteArrayArray2 = new byte[local48][];
		Static402.anIntArray574 = new int[local48];
		Static4.anIntArray6 = null;
		Static125.aByteArrayArray9 = null;
		local48 = 0;
		for (local61 = 0; local61 < 4; local61++) {
			for (@Pc(189) int local189 = 0; local189 < Static193.anInt3853 >> 3; local189++) {
				for (@Pc(193) int local193 = 0; local193 < Static301.anInt5585 >> 3; local193++) {
					@Pc(203) int local203 = Static47.anIntArrayArrayArray1[local61][local189][local193];
					if (local203 != -1) {
						@Pc(212) int local212 = local203 >> 14 & 0x3FF;
						@Pc(218) int local218 = local203 >> 3 & 0x7FF;
						@Pc(228) int local228 = local218 / 8 + (local212 / 8 << 8);
						for (@Pc(230) int local230 = 0; local230 < local48; local230++) {
							if (Static109.anIntArray203[local230] == local228) {
								local228 = -1;
								break;
							}
						}
						if (local228 != -1) {
							Static109.anIntArray203[local48] = local228;
							@Pc(263) int local263 = local228 >> 8 & 0xFF;
							@Pc(267) int local267 = local228 & 0xFF;
							Static431.anIntArray600[local48] = Static30.aClass38_8.method1045("m" + local263 + "_" + local267);
							Static55.anIntArray82[local48] = Static30.aClass38_8.method1045("l" + local263 + "_" + local267);
							Static129.anIntArray233[local48] = Static30.aClass38_8.method1045("um" + local263 + "_" + local267);
							Static402.anIntArray574[local48] = Static30.aClass38_8.method1045("ul" + local263 + "_" + local267);
							local48++;
						}
					}
				}
			}
		}
		Static181.method3319(local34, local26, 10, local16);
	}
}

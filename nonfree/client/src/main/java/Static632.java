import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static632 {

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BII)Z")
	public static boolean method9169(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IBI)I")
	public static int method9170(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static269.anIntArray329[arg0 & 0x3] : Static315.anIntArray390[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IILclient!ua;)V")
	public static void method9172(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11_Sub2 arg1) {
		@Pc(17) boolean local17 = arg1.method8400(1) == 1;
		if (local17) {
			Static210.anIntArray244[Static229.anInt5073++] = arg0;
		}
		@Pc(32) int local32 = arg1.method8400(2);
		@Pc(36) Class3_Sub1_Sub3_Sub3_Sub2 local36 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[arg0];
		if (local32 != 0) {
			@Pc(147) int local147;
			@Pc(152) int local152;
			@Pc(157) int local157;
			if (local32 == 1) {
				local147 = arg1.method8400(3);
				local152 = local36.anIntArray358[0];
				local157 = local36.anIntArray357[0];
				if (local147 == 0) {
					local157--;
					local152--;
				} else if (local147 == 1) {
					local157--;
				} else if (local147 == 2) {
					local152++;
					local157--;
				} else if (local147 == 3) {
					local152--;
				} else if (local147 == 4) {
					local152++;
				} else if (local147 == 5) {
					local157++;
					local152--;
				} else if (local147 == 6) {
					local157++;
				} else if (local147 == 7) {
					local157++;
					local152++;
				}
				if (local17) {
					local36.anInt6119 = local157;
					local36.aBoolean459 = true;
					local36.anInt6132 = local152;
				} else {
					local36.method5225(local157, Static566.aByteArray130[arg0], local152);
				}
			} else if (local32 == 2) {
				local147 = arg1.method8400(4);
				local152 = local36.anIntArray358[0];
				local157 = local36.anIntArray357[0];
				if (local147 == 0) {
					local152 -= 2;
					local157 -= 2;
				} else if (local147 == 1) {
					local157 -= 2;
					local152--;
				} else if (local147 == 2) {
					local157 -= 2;
				} else if (local147 == 3) {
					local157 -= 2;
					local152++;
				} else if (local147 == 4) {
					local152 += 2;
					local157 -= 2;
				} else if (local147 == 5) {
					local152 -= 2;
					local157--;
				} else if (local147 == 6) {
					local157--;
					local152 += 2;
				} else if (local147 == 7) {
					local152 -= 2;
				} else if (local147 == 8) {
					local152 += 2;
				} else if (local147 == 9) {
					local157++;
					local152 -= 2;
				} else if (local147 == 10) {
					local157++;
					local152 += 2;
				} else if (local147 == 11) {
					local157 += 2;
					local152 -= 2;
				} else if (local147 == 12) {
					local157 += 2;
					local152--;
				} else if (local147 == 13) {
					local157 += 2;
				} else if (local147 == 14) {
					local157 += 2;
					local152++;
				} else if (local147 == 15) {
					local152 += 2;
					local157 += 2;
				}
				if (local17) {
					local36.aBoolean459 = true;
					local36.anInt6132 = local152;
					local36.anInt6119 = local157;
				} else {
					local36.method5225(local157, Static566.aByteArray130[arg0], local152);
				}
			} else {
				local147 = arg1.method8400(1);
				@Pc(427) int local427;
				@Pc(435) int local435;
				@Pc(446) int local446;
				@Pc(453) int local453;
				if (local147 == 0) {
					local152 = arg1.method8400(12);
					local157 = local152 >> 10;
					local427 = local152 >> 5 & 0x1F;
					if (local427 > 15) {
						local427 -= 32;
					}
					local435 = local152 & 0x1F;
					if (local435 > 15) {
						local435 -= 32;
					}
					local446 = local427 + local36.anIntArray358[0];
					local453 = local435 + local36.anIntArray357[0];
					if (local17) {
						local36.anInt6119 = local453;
						local36.anInt6132 = local446;
						local36.aBoolean459 = true;
					} else {
						local36.method5225(local453, Static566.aByteArray130[arg0], local446);
					}
					local36.aByte132 = local36.aByte131 = (byte) (local36.aByte132 + local157 & 0x3);
					if (Static30.method735(local453, local446)) {
						local36.aByte131++;
					}
					if (Static569.anInt10211 == arg0) {
						if (local36.aByte132 != Static12.anInt172) {
							Static240.aBoolean380 = true;
						}
						Static12.anInt172 = local36.aByte132;
					}
				} else {
					local152 = arg1.method8400(30);
					local157 = local152 >> 28;
					local427 = local152 >> 14 & 0x3FFF;
					local435 = local152 & 0x3FFF;
					local446 = (local427 + local36.anIntArray358[0] + Static84.anInt2565 & 0x3FFF) - Static84.anInt2565;
					local453 = (local435 + Static32.anInt723 + local36.anIntArray357[0] & 0x3FFF) - Static32.anInt723;
					if (local17) {
						local36.aBoolean459 = true;
						local36.anInt6119 = local453;
						local36.anInt6132 = local446;
					} else {
						local36.method5225(local453, Static566.aByteArray130[arg0], local446);
					}
					local36.aByte132 = local36.aByte131 = (byte) (local36.aByte132 + local157 & 0x3);
					if (Static30.method735(local453, local446)) {
						local36.aByte131++;
					}
					if (arg0 == Static569.anInt10211) {
						Static12.anInt172 = local36.aByte132;
					}
				}
			}
		} else if (local17) {
			local36.aBoolean459 = false;
		} else if (arg0 == Static569.anInt10211) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(64) Class102 local64 = Static259.aClass102Array1[arg0] = new Class102();
			local64.anInt3411 = (Static32.anInt723 + local36.anIntArray357[0] >> 6) + (local36.anIntArray358[0] + Static84.anInt2565 >> 6 << 14) + (local36.aByte132 << 28);
			if (local36.anInt6112 == -1) {
				local64.anInt3413 = local36.aClass343_7.method8548();
			} else {
				local64.anInt3413 = local36.anInt6112;
			}
			local64.aBoolean257 = local36.aBoolean461;
			local64.anInt3415 = local36.anInt6070;
			if (local36.anInt6134 > 0) {
				Static619.method9025(local36);
			}
			Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[arg0] = null;
			if (arg1.method8400(1) != 0) {
				Static495.method7668(arg0, arg1);
			}
		}
	}
}

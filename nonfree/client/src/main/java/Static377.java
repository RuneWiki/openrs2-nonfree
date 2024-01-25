import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!sq", name = "A", descriptor = "Ljava/util/Random;")
	public static final Random aRandom2 = new Random();

	@OriginalMember(owner = "client!sq", name = "I", descriptor = "[I")
	public static final int[] anIntArray12 = new int[16];

	@OriginalMember(owner = "client!sq", name = "K", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_7 = new Class27(76, 8);

	@OriginalMember(owner = "client!sq", name = "L", descriptor = "Lclient!s;")
	public static final Class217 aClass217_8 = new Class217(56, -1);

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "([Ljava/lang/Object;III[I)V")
	public static void method155(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 <= arg1) {
			return;
		}
		@Pc(19) int local19 = (arg1 + arg2) / 2;
		@Pc(21) int local21 = arg1;
		@Pc(25) int local25 = arg3[local19];
		arg3[local19] = arg3[arg2];
		arg3[arg2] = local25;
		@Pc(39) Object local39 = arg0[local19];
		arg0[local19] = arg0[arg2];
		arg0[arg2] = local39;
		@Pc(58) int local58 = ~local25 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(60) int local60 = arg1; local60 < arg2; local60++) {
			if (arg3[local60] < (local58 & local60) + local25) {
				@Pc(79) int local79 = arg3[local60];
				arg3[local60] = arg3[local21];
				arg3[local21] = local79;
				@Pc(93) Object local93 = arg0[local60];
				arg0[local60] = arg0[local21];
				arg0[local21++] = local93;
			}
		}
		arg3[arg2] = arg3[local21];
		arg3[local21] = local25;
		arg0[arg2] = arg0[local21];
		arg0[local21] = local39;
		method155(arg0, arg1, local21 - 1, arg3);
		method155(arg0, local21 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIII)V")
	public static void method159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static115.anInt2362 <= arg1 && Static146.anInt3034 >= arg1) {
			@Pc(26) int local26 = Static360.method4841(Static160.anInt3220, Static319.anInt5496, arg3);
			@Pc(32) int local32 = Static360.method4841(Static160.anInt3220, Static319.anInt5496, arg0);
			Static33.method5364(local32, arg1, arg2, local26);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILclient!ha;I)V")
	public static void method160(@OriginalArg(1) Class10_Sub8_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(21) boolean local21 = arg0.method2525(1) == 1;
		if (local21) {
			Static284.anIntArray491[Static106.anInt2139++] = arg1;
		}
		@Pc(36) int local36 = arg0.method2525(2);
		@Pc(40) Class24_Sub3_Sub2_Sub2 local40 = Static360.aClass24_Sub3_Sub2_Sub2Array1[arg1];
		if (local36 != 0) {
			@Pc(152) int local152;
			@Pc(157) int local157;
			@Pc(162) int local162;
			if (local36 == 1) {
				local152 = arg0.method2525(3);
				local157 = local40.anIntArray610[0];
				local162 = local40.anIntArray611[0];
				if (local152 == 0) {
					local157--;
					local162--;
				} else if (local152 == 1) {
					local162--;
				} else if (local152 == 2) {
					local162--;
					local157++;
				} else if (local152 == 3) {
					local157--;
				} else if (local152 == 4) {
					local157++;
				} else if (local152 == 5) {
					local162++;
					local157--;
				} else if (local152 == 6) {
					local162++;
				} else if (local152 == 7) {
					local162++;
					local157++;
				}
				if (local21) {
					local40.anInt6317 = local162;
					local40.aBoolean407 = true;
					local40.anInt6303 = local157;
				} else {
					local40.method4931(local162, local157, Static393.aByteArray87[arg1]);
				}
			} else if (local36 == 2) {
				local152 = arg0.method2525(4);
				local157 = local40.anIntArray610[0];
				local162 = local40.anIntArray611[0];
				if (local152 == 0) {
					local162 -= 2;
					local157 -= 2;
				} else if (local152 == 1) {
					local157--;
					local162 -= 2;
				} else if (local152 == 2) {
					local162 -= 2;
				} else if (local152 == 3) {
					local162 -= 2;
					local157++;
				} else if (local152 == 4) {
					local162 -= 2;
					local157 += 2;
				} else if (local152 == 5) {
					local162--;
					local157 -= 2;
				} else if (local152 == 6) {
					local162--;
					local157 += 2;
				} else if (local152 == 7) {
					local157 -= 2;
				} else if (local152 == 8) {
					local157 += 2;
				} else if (local152 == 9) {
					local162++;
					local157 -= 2;
				} else if (local152 == 10) {
					local157 += 2;
					local162++;
				} else if (local152 == 11) {
					local157 -= 2;
					local162 += 2;
				} else if (local152 == 12) {
					local162 += 2;
					local157--;
				} else if (local152 == 13) {
					local162 += 2;
				} else if (local152 == 14) {
					local157++;
					local162 += 2;
				} else if (local152 == 15) {
					local157 += 2;
					local162 += 2;
				}
				if (local21) {
					local40.anInt6317 = local162;
					local40.aBoolean407 = true;
					local40.anInt6303 = local157;
				} else {
					local40.method4931(local162, local157, Static393.aByteArray87[arg1]);
				}
			} else {
				local152 = arg0.method2525(1);
				@Pc(423) int local423;
				@Pc(433) int local433;
				@Pc(446) int local446;
				@Pc(454) int local454;
				if (local152 == 0) {
					local157 = arg0.method2525(12);
					local162 = local157 >> 10;
					local423 = local157 >> 5 & 0x1F;
					if (local423 > 15) {
						local423 -= 32;
					}
					local433 = local157 & 0x1F;
					if (local433 > 15) {
						local433 -= 32;
					}
					local446 = local40.anIntArray610[0] + local423;
					local454 = local40.anIntArray611[0] + local433;
					if (local21) {
						local40.anInt6317 = local454;
						local40.anInt6303 = local446;
						local40.aBoolean407 = true;
					} else {
						local40.method4931(local454, local446, Static393.aByteArray87[arg1]);
					}
					local40.aByte98 = (byte) (local162 + local40.aByte98 & 0x3);
					if (arg1 == Static245.anInt4435) {
						Static96.anInt1983 = local40.aByte98;
					}
				} else {
					local157 = arg0.method2525(30);
					local162 = local157 >> 28;
					local423 = local157 >> 14 & 0x3FFF;
					local433 = local157 & 0x3FFF;
					local446 = (local423 + Static168.anInt3353 + local40.anIntArray610[0] & 0x3FFF) - Static168.anInt3353;
					local454 = (Static72.anInt1488 + local40.anIntArray611[0] + local433 & 0x3FFF) - Static72.anInt1488;
					if (local21) {
						local40.anInt6303 = local446;
						local40.anInt6317 = local454;
						local40.aBoolean407 = true;
					} else {
						local40.method4931(local454, local446, Static393.aByteArray87[arg1]);
					}
					local40.aByte98 = (byte) (local162 + local40.aByte98 & 0x3);
					if (arg1 == Static245.anInt4435) {
						Static96.anInt1983 = local40.aByte98;
					}
				}
			}
		} else if (local21) {
			local40.aBoolean407 = false;
		} else if (Static245.anInt4435 == arg1) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(67) Class32 local67 = Static458.aClass32Array1[arg1] = new Class32();
			local67.anInt726 = (local40.aByte98 << 28) + (Static168.anInt3353 + local40.anIntArray610[0] >> 6 << 14) + (Static72.anInt1488 - -local40.anIntArray611[0] >> 6);
			if (local40.anInt6298 == -1) {
				local67.anInt724 = local40.aClass145_7.method3304();
			} else {
				local67.anInt724 = local40.anInt6298;
			}
			local67.aBoolean48 = local40.aBoolean408;
			local67.anInt725 = local40.anInt6241;
			if (local40.anInt6328 > 0) {
				Static428.method5675(local40);
			}
			Static360.aClass24_Sub3_Sub2_Sub2Array1[arg1] = null;
			if (arg0.method2525(1) != 0) {
				Static218.method3308(arg0, arg1);
			}
		}
	}
}

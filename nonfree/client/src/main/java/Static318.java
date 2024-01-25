import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!ll", name = "n", descriptor = "Lclient!tc;")
	public static Class113 aClass113_4;

	@OriginalMember(owner = "client!ll", name = "q", descriptor = "[Lclient!em;")
	public static Class4_Sub4[] aClass4_Sub4Array1;

	@OriginalMember(owner = "client!ll", name = "i", descriptor = "[I")
	public static final int[] anIntArray290 = new int[2];

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!da;)V")
	public static void method4860(@OriginalArg(0) Class55 arg0) {
		Static589.aClass55_9 = arg0;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIBIIIII)V")
	public static void method4861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg0 - arg3;
		@Pc(21) int local21 = arg6 - arg3;
		@Pc(25) int local25 = arg0 * arg0;
		@Pc(29) int local29 = arg6 * arg6;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg6 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local41 + local25 * (1 - local57);
		@Pc(79) int local79 = local29 - local45 * (local57 - 1);
		@Pc(88) int local88 = local33 * (1 - local61) + local49;
		@Pc(97) int local97 = local37 - (local61 - 1) * local53;
		@Pc(101) int local101 = local25 << 2;
		@Pc(105) int local105 = local29 << 2;
		@Pc(109) int local109 = local33 << 2;
		@Pc(113) int local113 = local37 << 2;
		@Pc(117) int local117 = local41 * 3;
		@Pc(123) int local123 = local45 * (local57 - 3);
		@Pc(127) int local127 = local49 * 3;
		@Pc(133) int local133 = (local61 - 3) * local53;
		@Pc(143) int local143 = local105;
		@Pc(149) int local149 = (arg6 - 1) * local101;
		@Pc(151) int local151 = local113;
		@Pc(174) int local174;
		@Pc(182) int local182;
		@Pc(191) int local191;
		@Pc(199) int local199;
		if (Static554.anInt9362 <= arg1 && Static62.anInt1300 >= arg1) {
			@Pc(165) int[] local165 = Static249.anIntArrayArray23[arg1];
			local174 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg4 - arg0);
			local182 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg0 + arg4);
			local191 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg4 - local16);
			local199 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg4 + local16);
			Static491.method7219(local165, local174, arg5, local191);
			Static491.method7219(local165, local191, arg2, local199);
			Static491.method7219(local165, local199, arg5, local182);
		}
		@Pc(223) int local223 = local109 * (local21 - 1);
		while (local9 > 0) {
			@Pc(236) boolean local236 = local21 >= local9;
			if (local236) {
				if (local88 < 0) {
					while (local88 < 0) {
						local97 += local151;
						local88 += local127;
						local151 += local113;
						local11++;
						local127 += local113;
					}
				}
				if (local97 < 0) {
					local97 += local151;
					local88 += local127;
					local11++;
					local151 += local113;
					local127 += local113;
				}
				local97 += -local133;
				local88 += -local223;
				local223 -= local109;
				local133 -= local109;
			}
			if (local70 < 0) {
				while (local70 < 0) {
					local70 += local117;
					local79 += local143;
					local143 += local105;
					local117 += local105;
					local7++;
				}
			}
			if (local79 < 0) {
				local79 += local143;
				local70 += local117;
				local117 += local105;
				local143 += local105;
				local7++;
			}
			local79 += -local123;
			local70 += -local149;
			local9--;
			local123 -= local101;
			local149 -= local101;
			local174 = arg1 - local9;
			local182 = arg1 + local9;
			if (Static554.anInt9362 <= local182 && local174 <= Static62.anInt1300) {
				local191 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, local7 + arg4);
				local199 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg4 - local7);
				if (local236) {
					@Pc(413) int local413 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, local11 + arg4);
					@Pc(422) int local422 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg4 - local11);
					@Pc(433) int[] local433;
					if (local174 >= Static554.anInt9362) {
						local433 = Static249.anIntArrayArray23[local174];
						Static491.method7219(local433, local199, arg5, local422);
						Static491.method7219(local433, local422, arg2, local413);
						Static491.method7219(local433, local413, arg5, local191);
					}
					if (local182 <= Static62.anInt1300) {
						local433 = Static249.anIntArrayArray23[local182];
						Static491.method7219(local433, local199, arg5, local422);
						Static491.method7219(local433, local422, arg2, local413);
						Static491.method7219(local433, local413, arg5, local191);
					}
				} else {
					if (local174 >= Static554.anInt9362) {
						Static491.method7219(Static249.anIntArrayArray23[local174], local199, arg5, local191);
					}
					if (local182 <= Static62.anInt1300) {
						Static491.method7219(Static249.anIntArrayArray23[local182], local199, arg5, local191);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(III)Z")
	public static boolean method4862(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static499.method8587(arg1, arg0) | (arg1 & 0x800) != 0 || Static180.method2777(arg0, arg1);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "Lclient!qi;")
	public static final Class208 aClass208_35 = new Class208(16);

	@OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
	public static int anInt6296 = 0;

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
	public static int anInt6297 = 0;

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(IB)I")
	public static int method5080(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B[I[IILclient!ih;I)Lclient!eo;")
	public static Class73_Sub1 method5081(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class117_Sub1 arg3, @OriginalArg(5) int arg4) {
		@Pc(10) byte[] local10 = new byte[arg4 * arg2];
		for (@Pc(19) int local19 = 0; local19 < arg2; local19++) {
			@Pc(29) int local29 = arg0[local19] + local19 * arg4;
			for (@Pc(31) int local31 = 0; local31 < arg1[local19]; local31++) {
				local10[local29++] = -1;
			}
		}
		return new Class73_Sub1(arg3, arg4, arg2, local10);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
	public static void method5084() {
		if (Static366.anInt5957 == -1 || Static320.anInt5279 == -1) {
			return;
		}
		@Pc(25) int local25 = ((Static461.anInt7392 - Static412.anInt6570) * Static122.anInt1844 >> 16) + Static412.anInt6570;
		Static122.anInt1844 += local25;
		if (Static122.anInt1844 < 65535) {
			Static443.aBoolean605 = false;
			Static420.aBoolean588 = false;
		} else {
			if (Static443.aBoolean605) {
				Static420.aBoolean588 = false;
			} else {
				Static420.aBoolean588 = true;
			}
			Static122.anInt1844 = 65535;
			Static443.aBoolean605 = true;
		}
		@Pc(55) float local55 = (float) Static122.anInt1844 / 65535.0F;
		@Pc(58) float[] local58 = new float[3];
		@Pc(62) int local62 = Static431.anInt6865 * 2;
		@Pc(88) int local88;
		@Pc(121) int local121;
		@Pc(129) int local129;
		@Pc(134) int local134;
		@Pc(143) int local143;
		@Pc(161) int local161;
		for (@Pc(64) int local64 = 0; local64 < 3; local64++) {
			@Pc(76) int local76 = Static219.anIntArrayArrayArray4[Static366.anInt5957][local62][local64] * 3;
			local88 = Static219.anIntArrayArrayArray4[Static366.anInt5957][local62 + 1][local64] * 3;
			local121 = (Static219.anIntArrayArrayArray4[Static366.anInt5957][local62 + 2][local64] + Static219.anIntArrayArrayArray4[Static366.anInt5957][local62 + 2][local64] - Static219.anIntArrayArrayArray4[Static366.anInt5957][local62 + 3][local64]) * 3;
			local129 = Static219.anIntArrayArrayArray4[Static366.anInt5957][local62][local64];
			local134 = local88 - local76;
			local143 = local121 + local76 - local88 * 2;
			local161 = local88 + Static219.anIntArrayArrayArray4[Static366.anInt5957][local62 + 2][local64] - local129 - local121;
			local58[local64] = local55 * ((float) local134 + (local55 * (float) local161 + (float) local143) * local55) + (float) local129;
		}
		Static80.anInt1106 = (int) local58[2] - Static47.anInt676 * 128;
		Static386.anInt7155 = (int) local58[0] - Static315.anInt5207 * 128;
		Static375.anInt6055 = (int) local58[1] * -1;
		@Pc(216) float[] local216 = new float[3];
		local88 = Static300.anInt5039 * 2;
		for (local121 = 0; local121 < 3; local121++) {
			local129 = Static219.anIntArrayArrayArray4[Static320.anInt5279][local88][local121] * 3;
			local134 = Static219.anIntArrayArrayArray4[Static320.anInt5279][local88 + 1][local121] * 3;
			local143 = (Static219.anIntArrayArrayArray4[Static320.anInt5279][local88 + 2][local121] + Static219.anIntArrayArrayArray4[Static320.anInt5279][local88 + 2][local121] - Static219.anIntArrayArrayArray4[Static320.anInt5279][local88 + 3][local121]) * 3;
			local161 = Static219.anIntArrayArrayArray4[Static320.anInt5279][local88][local121];
			@Pc(296) int local296 = local134 - local129;
			@Pc(305) int local305 = local143 + local129 - local134 * 2;
			@Pc(323) int local323 = local134 + Static219.anIntArrayArrayArray4[Static320.anInt5279][local88 - -2][local121] - local143 - local161;
			local216[local121] = ((float) local296 + local55 * (local55 * (float) local323 + (float) local305)) * local55 + (float) local161;
		}
		@Pc(355) float local355 = local216[0] - local58[0];
		@Pc(365) float local365 = -1.0F * (local216[1] - local58[1]);
		@Pc(374) float local374 = local216[2] - local58[2];
		@Pc(384) double local384 = Math.sqrt((double) (local374 * local374 + local355 * local355));
		Static129.anInt1972 = (int) (Math.atan2((double) local365, local384) * 2607.5945876176133D) & 0x3FFF;
		Static398.anInt6386 = (int) (-Math.atan2((double) local355, (double) local374) * 2607.5945876176133D) & 0x3FFF;
		Static39.anInt573 = (Static122.anInt1844 * (Static219.anIntArrayArrayArray4[Static366.anInt5957][local62 + 2][3] - Static219.anIntArrayArrayArray4[Static366.anInt5957][local62][3]) >> 16) + Static219.anIntArrayArrayArray4[Static366.anInt5957][local62][3];
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIILclient!ir;)V")
	public static void method5085(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11_Sub1_Sub3_Sub2 arg2) {
		if (arg0 == arg2.anInt3302 && arg0 != -1) {
			@Pc(93) Class64 local93 = Static402.aClass37_2.method665(arg0);
			@Pc(96) int local96 = local93.anInt1204;
			if (local96 == 1) {
				arg2.anInt3337 = arg1;
				arg2.anInt3268 = 0;
				arg2.anInt3278 = 0;
				arg2.anInt3275 = 1;
				arg2.anInt3296 = 0;
				Static379.method131(arg2.anInt3296, arg2.anInt6428, local93, arg2.aByte90, arg2 == Static94.aClass11_Sub1_Sub3_Sub2_1, arg2.anInt6430);
			}
			if (local96 == 2) {
				arg2.anInt3278 = 0;
			}
		} else if (arg0 == -1 || arg2.anInt3302 == -1 || Static402.aClass37_2.method665(arg0).anInt1199 >= Static402.aClass37_2.method665(arg2.anInt3302).anInt1199) {
			arg2.anInt3337 = arg1;
			arg2.anInt3344 = arg2.anInt3342;
			arg2.anInt3296 = 0;
			arg2.anInt3302 = arg0;
			arg2.anInt3278 = 0;
			arg2.anInt3275 = 1;
			arg2.anInt3268 = 0;
			if (arg2.anInt3302 != -1) {
				Static379.method131(arg2.anInt3296, arg2.anInt6428, Static402.aClass37_2.method665(arg2.anInt3302), arg2.aByte90, arg2 == Static94.aClass11_Sub1_Sub3_Sub2_1, arg2.anInt6430);
			}
		}
	}
}

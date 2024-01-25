import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!kda", name = "g", descriptor = "Lclient!saa;")
	public static Class330 aClass330_6;

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "Z")
	public static boolean aBoolean469 = true;

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IIIIIIZI)V")
	public static void method4881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(12) int local12 = arg3 - 334;
		if (local12 < 0) {
			local12 = 0;
		} else if (local12 > 100) {
			local12 = 100;
		}
		@Pc(37) int local37 = Static106.aShort15 + (Static674.aShort126 - Static106.aShort15) * local12 / 100;
		Static705.anInt11029 = local37 * Static705.anInt11025 >> 8;
		@Pc(49) int local49 = local37 * arg6 >> 8;
		@Pc(56) int local56 = 16384 - arg1 & 0x3FFF;
		@Pc(62) int local62 = 16384 - arg2 & 0x3FFF;
		@Pc(64) int local64 = 0;
		@Pc(66) int local66 = 0;
		@Pc(68) int local68 = local49;
		if (local56 != 0) {
			local66 = Class3_Sub2_Sub21.anIntArray358[local56] * -local49 >> 14;
			local68 = local49 * Class3_Sub2_Sub21.anIntArray356[local56] >> 14;
		}
		if (local62 != 0) {
			local64 = Class3_Sub2_Sub21.anIntArray358[local62] * local68 >> 14;
			local68 = local68 * Class3_Sub2_Sub21.anIntArray356[local62] >> 14;
		}
		Static212.anInt3807 = 0;
		Static228.anInt9136 = arg1;
		Static376.anInt6408 = arg4 - local66;
		Static173.anInt3144 = arg0 - local64;
		Static235.anInt4471 = arg5 - local68;
		Static703.anInt10997 = arg2;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IBIII[FI)V")
	public static void method4884(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float[] arg4, @OriginalArg(6) int arg5) {
		if (arg0 > 0 && !Static28.method398(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static28.method398(arg1)) {
			@Pc(54) int local54 = Static291.method4409(6408);
			@Pc(56) int local56 = 0;
			@Pc(64) int local64 = arg0 < arg1 ? arg0 : arg1;
			@Pc(68) int local68 = arg0 >> 1;
			@Pc(72) int local72 = arg1 >> 1;
			@Pc(74) float[] local74 = arg4;
			@Pc(81) float[] local81 = new float[local72 * local68 * local54];
			while (true) {
				OpenGL.glTexImage2Df(3553, local56, 34842, arg0, arg1, 0, 6408, 5126, local74, 0);
				if (local64 <= 1) {
					return;
				}
				@Pc(101) int local101 = local54 * arg0;
				for (@Pc(103) int local103 = 0; local103 < local54; local103++) {
					@Pc(109) int local109 = local103;
					@Pc(111) int local111 = local103;
					@Pc(116) int local116 = local103 + local101;
					for (@Pc(118) int local118 = 0; local118 < local72; local118++) {
						for (@Pc(122) int local122 = 0; local122 < local68; local122++) {
							@Pc(128) float local128 = local74[local111];
							local111 += local54;
							@Pc(138) float local138 = local128 + local74[local111];
							@Pc(144) float local144 = local138 + local74[local116];
							local111 += local54;
							local116 += local54;
							@Pc(158) float local158 = local144 + local74[local116];
							local81[local109] = local158 * 0.25F;
							local116 += local54;
							local109 += local54;
						}
						local111 += local101;
						local116 += local101;
					}
				}
				@Pc(196) float[] local196 = local81;
				local81 = local74;
				arg1 = local72;
				arg0 = local68;
				local74 = local196;
				local56++;
				local72 >>= 0x1;
				local64 >>= 0x1;
				local68 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}

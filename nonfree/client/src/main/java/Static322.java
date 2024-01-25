import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!qb", name = "I", descriptor = "Lclient!ic;")
	public static Class113 aClass113_135;

	@OriginalMember(owner = "client!qb", name = "r", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_252 = new Class214(50, -1);

	@OriginalMember(owner = "client!qb", name = "D", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_253 = new Class214(39, 6);

	@OriginalMember(owner = "client!qb", name = "H", descriptor = "Lclient!ng;")
	public static final Class167 aClass167_103 = new Class167(4);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIBII[F)V")
	public static void method5621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float[] arg5) {
		if (arg2 > 0 && !Static298.method3895(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static298.method3895(arg0)) {
			@Pc(34) int local34 = Static165.method4637(6408);
			@Pc(36) int local36 = 0;
			@Pc(47) int local47 = arg2 >= arg0 ? arg0 : arg2;
			@Pc(51) int local51 = arg2 >> 1;
			@Pc(55) int local55 = arg0 >> 1;
			@Pc(65) float[] local65 = arg5;
			@Pc(72) float[] local72 = new float[local51 * local55 * local34];
			while (true) {
				OpenGL.glTexImage2Df(3553, local36, 34842, arg2, arg0, 0, 6408, 5126, local65, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(91) int local91 = arg2 * local34;
				@Pc(93) float[] local93 = local72;
				for (@Pc(95) int local95 = 0; local95 < local34; local95++) {
					@Pc(99) int local99 = local95;
					@Pc(101) int local101 = local95;
					@Pc(105) int local105 = local91 + local95;
					for (@Pc(107) int local107 = 0; local107 < local55; local107++) {
						for (@Pc(111) int local111 = 0; local111 < local51; local111++) {
							@Pc(117) float local117 = local65[local101];
							local101 += local34;
							@Pc(127) float local127 = local117 + local65[local101];
							@Pc(133) float local133 = local127 + local65[local105];
							local101 += local34;
							local105 += local34;
							@Pc(147) float local147 = local133 + local65[local105];
							local72[local99] = local147 * 0.25F;
							local105 += local34;
							local99 += local34;
						}
						local101 += local91;
						local105 += local91;
					}
				}
				local72 = local65;
				arg2 = local51;
				arg0 = local55;
				local65 = local93;
				local55 >>= 0x1;
				local47 >>= 0x1;
				local36++;
				local51 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIII)I")
	public static int method5629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static202.aClass163Array2 == null) {
			return 0;
		} else if (arg0 < 3) {
			@Pc(16) int local16 = arg1 >> 7;
			@Pc(20) int local20 = arg2 >> 7;
			if (arg4 < 0 || arg3 < 0 || arg4 > Static425.anInt6922 - 1 || Static251.anInt4072 - 1 < arg3) {
				return 0;
			} else if (local16 >= 1 && local20 >= 1 && local16 <= Static425.anInt6922 - 1 && Static251.anInt4072 - 1 >= local20) {
				@Pc(83) boolean local83 = (Static357.aByteArrayArrayArray11[1][arg1 >> 7][arg2 >> 7] & 0x2) != 0;
				@Pc(108) boolean local108;
				@Pc(124) boolean local124;
				if ((arg1 & 0x7F) == 0) {
					local108 = (Static357.aByteArrayArrayArray11[1][local16 - 1][arg2 >> 7] & 0x2) != 0;
					local124 = (Static357.aByteArrayArrayArray11[1][local16][arg2 >> 7] & 0x2) != 0;
					if (local108 != local124) {
						local83 = (Static357.aByteArrayArrayArray11[1][arg4][arg3] & 0x2) != 0;
					}
				}
				if ((arg2 & 0x7F) == 0) {
					local108 = (Static357.aByteArrayArrayArray11[1][arg1 >> 7][local20 - 1] & 0x2) != 0;
					local124 = (Static357.aByteArrayArrayArray11[1][arg1 >> 7][local20] & 0x2) != 0;
					if (local108 != local124) {
						local83 = (Static357.aByteArrayArrayArray11[1][arg4][arg3] & 0x2) != 0;
					}
				}
				if (local83) {
					arg0++;
				}
				return Static202.aClass163Array2[arg0].va(arg1, arg2);
			} else {
				return 0;
			}
		} else {
			return Static202.aClass163Array2[arg0].va(arg1, arg2);
		}
	}
}

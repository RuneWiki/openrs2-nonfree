import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.security.InvalidParameterException;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!sl", name = "I", descriptor = "[I")
	public static int[] anIntArray418;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIII[I)V")
	public static void method4107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !Static86.method1604(arg2)) {
			throw new InvalidParameterException("width must be power of 2");
		} else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !Static86.method1604(arg3)) {
			throw new InvalidParameterException("height must be power of 2");
		} else if (arg4 == 32993 || arg4 == 6408) {
			@Pc(40) GL local40 = Static156.aGL1;
			@Pc(42) int local42 = 0;
			@Pc(49) int local49 = arg2 < arg3 ? arg2 : arg3;
			@Pc(53) int local53 = arg2 >> 1;
			@Pc(57) int local57 = arg3 >> 1;
			@Pc(59) int[] local59 = arg6;
			@Pc(64) int[] local64 = new int[local53 * local57];
			while (true) {
				local40.glTexImage2D(arg0, local42, arg1, arg2, arg3, 0, arg4, arg5, IntBuffer.wrap(local59));
				if (local49 <= 1) {
					return;
				}
				@Pc(81) int local81 = 0;
				@Pc(83) int local83 = 0;
				@Pc(87) int local87 = arg2;
				for (@Pc(89) int local89 = 0; local89 < local57; local89++) {
					for (@Pc(94) int local94 = 0; local94 < local53; local94++) {
						@Pc(102) int local102 = local59[local83++];
						@Pc(107) int local107 = local59[local83++];
						@Pc(112) int local112 = local59[local87++];
						@Pc(117) int local117 = local59[local87++];
						@Pc(123) int local123 = local102 >> 24 & 0xFF;
						@Pc(129) int local129 = local102 >> 16 & 0xFF;
						@Pc(135) int local135 = local102 >> 8 & 0xFF;
						@Pc(139) int local139 = local102 & 0xFF;
						@Pc(147) int local147 = local123 + (local107 >> 24 & 0xFF);
						@Pc(155) int local155 = local129 + (local107 >> 16 & 0xFF);
						@Pc(163) int local163 = local135 + (local107 >> 8 & 0xFF);
						@Pc(169) int local169 = local139 + (local107 & 0xFF);
						@Pc(177) int local177 = local147 + (local112 >> 24 & 0xFF);
						@Pc(185) int local185 = local155 + (local112 >> 16 & 0xFF);
						@Pc(193) int local193 = local163 + (local112 >> 8 & 0xFF);
						@Pc(199) int local199 = local169 + (local112 & 0xFF);
						@Pc(207) int local207 = local177 + (local117 >> 24 & 0xFF);
						@Pc(215) int local215 = local185 + (local117 >> 16 & 0xFF);
						@Pc(223) int local223 = local193 + (local117 >> 8 & 0xFF);
						@Pc(229) int local229 = local199 + (local117 & 0xFF);
						local64[local81++] = (local207 & 0x3FC) << 22 | (local215 & 0x3FC) << 14 | (local223 & 0x3FC) << 6 | local229 >> 2 & 0xFF;
					}
					local83 += arg2;
					local87 += arg2;
				}
				@Pc(270) int[] local270 = local64;
				local64 = local59;
				local59 = local270;
				arg2 = local53;
				arg3 = local57;
				local53 >>= 0x1;
				local57 >>= 0x1;
				local49 >>= 0x1;
				local42++;
			}
		} else {
			throw new InvalidParameterException("Invalid external format");
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIII[F)V")
	public static void method4113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6) {
		if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !Static86.method1604(arg2)) {
			throw new InvalidParameterException("width must be power of 2");
		} else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !Static86.method1604(arg3)) {
			throw new InvalidParameterException("height must be power of 2");
		} else {
			@Pc(32) byte local32;
			if (arg4 == 6406) {
				local32 = 1;
			} else if (arg4 == 6409) {
				local32 = 1;
			} else if (arg4 == 32841) {
				local32 = 1;
			} else if (arg4 == 6410) {
				local32 = 2;
			} else if (arg4 == 6407) {
				local32 = 3;
			} else if (arg4 == 6408) {
				local32 = 4;
			} else {
				throw new InvalidParameterException("Invalid external format");
			}
			@Pc(70) GL local70 = Static156.aGL1;
			@Pc(72) int local72 = 0;
			@Pc(79) int local79 = arg2 < arg3 ? arg2 : arg3;
			@Pc(83) int local83 = arg2 >> 1;
			@Pc(87) int local87 = arg3 >> 1;
			@Pc(89) float[] local89 = arg6;
			@Pc(96) float[] local96 = new float[local83 * local87 * local32];
			while (true) {
				local70.glTexImage2D(arg0, local72, arg1, arg2, arg3, 0, arg4, 5126, FloatBuffer.wrap(local89));
				if (local79 <= 1) {
					return;
				}
				@Pc(115) int local115 = arg2 * local32;
				for (@Pc(117) int local117 = 0; local117 < local32; local117++) {
					@Pc(122) int local122 = local117;
					@Pc(124) int local124 = local117;
					@Pc(128) int local128 = local117 + local115;
					for (@Pc(130) int local130 = 0; local130 < local87; local130++) {
						for (@Pc(135) int local135 = 0; local135 < local83; local135++) {
							@Pc(142) float local142 = local89[local124];
							local124 += local32;
							@Pc(152) float local152 = local142 + local89[local124];
							local124 += local32;
							@Pc(162) float local162 = local152 + local89[local128];
							local128 += local32;
							@Pc(172) float local172 = local162 + local89[local128];
							local128 += local32;
							local96[local122] = local172 * 0.25F;
							local122 += local32;
						}
						local124 += local115;
						local128 += local115;
					}
				}
				@Pc(202) float[] local202 = local96;
				local96 = local89;
				local89 = local202;
				arg2 = local83;
				arg3 = local87;
				local83 >>= 0x1;
				local87 >>= 0x1;
				local79 >>= 0x1;
				local72++;
			}
		}
	}
}

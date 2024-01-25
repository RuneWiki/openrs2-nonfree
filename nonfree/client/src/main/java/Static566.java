import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static566 {

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "Z")
	public static boolean aBoolean661;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "[I")
	public static final int[] anIntArray581 = new int[14];

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([IIIIIIII)V")
	public static void method8122(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg1 > 0 && !Static316.method5292(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static316.method5292(arg2)) {
			@Pc(37) int local37 = 0;
			@Pc(44) int local44 = arg2 > arg1 ? arg1 : arg2;
			@Pc(48) int local48 = arg1 >> 1;
			@Pc(52) int local52 = arg2 >> 1;
			@Pc(54) int[] local54 = arg0;
			@Pc(59) int[] local59 = new int[local48 * local52];
			while (true) {
				OpenGL.glTexImage2Di(arg4, local37, arg3, arg1, arg2, 0, 32993, arg5, local54, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(77) int local77 = 0;
				@Pc(79) int local79 = 0;
				@Pc(83) int local83 = arg1;
				for (@Pc(85) int local85 = 0; local85 < local52; local85++) {
					for (@Pc(89) int local89 = 0; local89 < local48; local89++) {
						@Pc(96) int local96 = local54[local79++];
						@Pc(101) int local101 = local54[local79++];
						@Pc(106) int local106 = local54[local83++];
						@Pc(110) int local110 = local96 & 0xFF;
						@Pc(116) int local116 = local96 >> 24 & 0xFF;
						@Pc(122) int local122 = local96 >> 16 & 0xFF;
						@Pc(128) int local128 = local96 >> 8 & 0xFF;
						@Pc(133) int local133 = local54[local83++];
						@Pc(141) int local141 = local116 + (local101 >> 24 & 0xFF);
						@Pc(149) int local149 = local122 + (local101 >> 16 & 0xFF);
						@Pc(155) int local155 = local110 + (local101 & 0xFF);
						@Pc(163) int local163 = local128 + (local101 >> 8 & 0xFF);
						@Pc(171) int local171 = local149 + (local106 >> 16 & 0xFF);
						@Pc(179) int local179 = local163 + (local106 >> 8 & 0xFF);
						@Pc(185) int local185 = local155 + (local106 & 0xFF);
						@Pc(193) int local193 = local141 + (local106 >> 24 & 0xFF);
						@Pc(201) int local201 = local179 + (local133 >> 8 & 0xFF);
						@Pc(209) int local209 = local193 + (local133 >> 24 & 0xFF);
						@Pc(215) int local215 = local185 + (local133 & 0xFF);
						@Pc(223) int local223 = local171 + (local133 >> 16 & 0xFF);
						local59[local77++] = local215 >> 2 & 0xFF | (local201 & 0x3FC) << 6 | (local209 & 0x3FC) << 22 | (local223 & 0x3FC) << 14;
					}
					local79 += arg1;
					local83 += arg1;
				}
				@Pc(276) int[] local276 = local59;
				local59 = local54;
				local54 = local276;
				arg1 = local48;
				arg2 = local52;
				local48 >>= 0x1;
				local52 >>= 0x1;
				local37++;
				local44 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}

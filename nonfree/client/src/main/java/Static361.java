import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "[I")
	public static final int[] anIntArray374 = new int[8];

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "Z")
	public static boolean aBoolean581 = false;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIII[II)V")
	public static void method5432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int[] arg4, @OriginalArg(7) int arg5) {
		if (arg5 > 0 && !Static111.method4954(arg5)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static111.method4954(arg1)) {
			@Pc(41) int local41 = 0;
			@Pc(48) int local48 = arg5 >= arg1 ? arg1 : arg5;
			@Pc(52) int local52 = arg5 >> 1;
			@Pc(56) int local56 = arg1 >> 1;
			@Pc(58) int[] local58 = arg4;
			@Pc(75) int[] local75 = new int[local56 * local52];
			while (true) {
				OpenGL.glTexImage2Di(arg2, local41, arg0, arg5, arg1, 0, 32993, arg3, local58, 0);
				if (local48 <= 1) {
					return;
				}
				@Pc(93) int local93 = 0;
				@Pc(95) int local95 = 0;
				@Pc(99) int local99 = arg5;
				@Pc(101) int[] local101 = local75;
				for (@Pc(103) int local103 = 0; local103 < local56; local103++) {
					for (@Pc(106) int local106 = 0; local106 < local52; local106++) {
						@Pc(112) int local112 = local58[local95++];
						@Pc(117) int local117 = local58[local95++];
						@Pc(122) int local122 = local58[local99++];
						@Pc(127) int local127 = local58[local99++];
						@Pc(131) int local131 = local112 & 0xFF;
						@Pc(137) int local137 = local112 >> 16 & 0xFF;
						@Pc(143) int local143 = local112 >> 8 & 0xFF;
						@Pc(149) int local149 = local112 >> 24 & 0xFF;
						@Pc(157) int local157 = local149 + (local117 >> 24 & 0xFF);
						@Pc(163) int local163 = local131 + (local117 & 0xFF);
						@Pc(171) int local171 = local137 + (local117 >> 16 & 0xFF);
						@Pc(179) int local179 = local143 + (local117 >> 8 & 0xFF);
						@Pc(185) int local185 = local163 + (local122 & 0xFF);
						@Pc(193) int local193 = local171 + (local122 >> 16 & 0xFF);
						@Pc(201) int local201 = local157 + (local122 >> 24 & 0xFF);
						@Pc(209) int local209 = local179 + (local122 >> 8 & 0xFF);
						@Pc(215) int local215 = local185 + (local127 & 0xFF);
						@Pc(223) int local223 = local193 + (local127 >> 16 & 0xFF);
						@Pc(231) int local231 = local201 + (local127 >> 24 & 0xFF);
						@Pc(239) int local239 = local209 + (local127 >> 8 & 0xFF);
						local75[local93++] = local215 >> 2 & 0xFF | (local239 & 0x3FC) << 6 | (local231 & 0x3FC) << 22 | (local223 & 0x3FC) << 14;
					}
					local99 += arg5;
					local95 += arg5;
				}
				local75 = local58;
				arg1 = local56;
				local58 = local101;
				arg5 = local52;
				local52 >>= 0x1;
				local48 >>= 0x1;
				local41++;
				local56 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}

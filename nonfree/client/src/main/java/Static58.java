import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/awt/Canvas;ZLclient!e;)Lclient!oa;")
	public static Class5 method1163(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Interface4 arg1) {
		return new da(arg0, arg1);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIII[I)V")
	public static void method1165(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int[] arg5) {
		if (arg4 > 0 && !Static260.method4582(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static260.method4582(arg2)) {
			@Pc(42) int local42 = 0;
			@Pc(49) int local49 = arg2 > arg4 ? arg4 : arg2;
			@Pc(53) int local53 = arg4 >> 1;
			@Pc(65) int local65 = arg2 >> 1;
			@Pc(67) int[] local67 = arg5;
			@Pc(72) int[] local72 = new int[local53 * local65];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local42, arg3, arg4, arg2, 0, 32993, arg1, local67, 0);
				if (local49 <= 1) {
					return;
				}
				@Pc(89) int local89 = 0;
				@Pc(91) int local91 = 0;
				@Pc(95) int local95 = arg4;
				@Pc(97) int[] local97 = local72;
				for (@Pc(99) int local99 = 0; local99 < local65; local99++) {
					for (@Pc(103) int local103 = 0; local103 < local53; local103++) {
						@Pc(110) int local110 = local67[local91++];
						@Pc(115) int local115 = local67[local95++];
						@Pc(120) int local120 = local67[local91++];
						@Pc(126) int local126 = local110 >> 16 & 0xFF;
						@Pc(132) int local132 = local110 >> 8 & 0xFF;
						@Pc(138) int local138 = local110 >> 24 & 0xFF;
						@Pc(142) int local142 = local110 & 0xFF;
						@Pc(147) int local147 = local67[local95++];
						@Pc(155) int local155 = local132 + (local120 >> 8 & 0xFF);
						@Pc(163) int local163 = local126 + (local120 >> 16 & 0xFF);
						@Pc(169) int local169 = local142 + (local120 & 0xFF);
						@Pc(177) int local177 = local138 + (local120 >> 24 & 0xFF);
						@Pc(185) int local185 = local163 + (local115 >> 16 & 0xFF);
						@Pc(193) int local193 = local155 + (local115 >> 8 & 0xFF);
						@Pc(199) int local199 = local169 + (local115 & 0xFF);
						@Pc(207) int local207 = local177 + (local115 >> 24 & 0xFF);
						@Pc(215) int local215 = local185 + (local147 >> 16 & 0xFF);
						@Pc(223) int local223 = local207 + (local147 >> 24 & 0xFF);
						@Pc(229) int local229 = local199 + (local147 & 0xFF);
						@Pc(237) int local237 = local193 + (local147 >> 8 & 0xFF);
						local72[local89++] = (local223 & 0x3FC) << 22 | (local215 & 0x3FC) << 14 | (local237 & 0x3FC) << 6 | local229 >> 2 & 0xFF;
					}
					local95 += arg4;
					local91 += arg4;
				}
				local72 = local67;
				local67 = local97;
				arg2 = local65;
				arg4 = local53;
				local65 >>= 0x1;
				local42++;
				local53 >>= 0x1;
				local49 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIBI)I")
	public static int method1166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static511.aClass52Array3 == null) {
			return 0;
		}
		@Pc(19) int local19 = arg1 >> 9;
		@Pc(23) int local23 = arg0 >> 9;
		if (local19 < 0 || local23 < 0 || local19 > Static118.anInt2527 - 1 || Static549.anInt9482 - 1 < local23) {
			return 0;
		}
		@Pc(48) int local48 = arg2;
		if (arg2 < 3 && (Static232.aByteArrayArrayArray18[1][local19][local23] & 0x2) != 0) {
			local48 = arg2 + 1;
		}
		return Static511.aClass52Array3[local48].sa(arg1, arg0);
	}
}

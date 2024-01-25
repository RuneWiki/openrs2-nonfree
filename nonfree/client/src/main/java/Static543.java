import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "D")
	public static double aDouble35;

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray65 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!tea", name = "c", descriptor = "I")
	public static int anInt10432 = 0;

	@OriginalMember(owner = "client!tea", name = "d", descriptor = "[I")
	public static final int[] anIntArray841 = new int[2];

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(III)Z")
	public static boolean method8850(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(II[FIIZI)V")
	public static void method8851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 > 0 && !Static586.method8223(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static586.method8223(arg3)) {
			@Pc(42) int local42 = Static211.method3220(6408);
			@Pc(44) int local44 = 0;
			@Pc(55) int local55 = arg3 <= arg1 ? arg3 : arg1;
			@Pc(59) int local59 = arg1 >> 1;
			@Pc(63) int local63 = arg3 >> 1;
			@Pc(65) float[] local65 = arg2;
			@Pc(72) float[] local72 = new float[local63 * local59 * local42];
			while (true) {
				OpenGL.glTexImage2Df(3553, local44, 34842, arg1, arg3, 0, 6408, 5126, local65, 0);
				if (local55 <= 1) {
					return;
				}
				@Pc(92) int local92 = arg1 * local42;
				for (@Pc(94) int local94 = 0; local94 < local42; local94++) {
					@Pc(98) int local98 = local94;
					@Pc(100) int local100 = local94;
					@Pc(104) int local104 = local92 + local94;
					for (@Pc(106) int local106 = 0; local106 < local63; local106++) {
						for (@Pc(110) int local110 = 0; local110 < local59; local110++) {
							@Pc(116) float local116 = local65[local100];
							local100 += local42;
							@Pc(126) float local126 = local116 + local65[local100];
							@Pc(132) float local132 = local126 + local65[local104];
							local100 += local42;
							local104 += local42;
							@Pc(146) float local146 = local132 + local65[local104];
							local104 += local42;
							local72[local98] = local146 * 0.25F;
							local98 += local42;
						}
						local104 += local92;
						local100 += local92;
					}
				}
				@Pc(190) float[] local190 = local72;
				local72 = local65;
				arg1 = local59;
				local65 = local190;
				arg3 = local63;
				local59 >>= 0x1;
				local55 >>= 0x1;
				local44++;
				local63 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}

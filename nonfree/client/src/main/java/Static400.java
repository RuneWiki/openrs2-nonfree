import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!pfa", name = "D", descriptor = "Lclient!oo;")
	public static Class247 aClass247_8;

	@OriginalMember(owner = "client!pfa", name = "C", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_101 = new Class276(98, -2);

	@OriginalMember(owner = "client!pfa", name = "G", descriptor = "I")
	public static int anInt7815 = 0;

	@OriginalMember(owner = "client!pfa", name = "H", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_77 = new Class230(27, -1);

	@OriginalMember(owner = "client!pfa", name = "I", descriptor = "I")
	public static int anInt7816 = -1;

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(BII[FIII)V")
	public static void method6457(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 > 0 && !Static282.method4863(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static282.method4863(arg0)) {
			@Pc(29) int local29 = Static191.method3300(6408);
			@Pc(31) int local31 = 0;
			@Pc(38) int local38 = arg0 <= arg4 ? arg0 : arg4;
			@Pc(42) int local42 = arg4 >> 1;
			@Pc(46) int local46 = arg0 >> 1;
			@Pc(48) float[] local48 = arg2;
			@Pc(59) float[] local59 = new float[local29 * local46 * local42];
			while (true) {
				OpenGL.glTexImage2Df(3553, local31, 34842, arg4, arg0, 0, 6408, 5126, local48, 0);
				if (local38 <= 1) {
					return;
				}
				@Pc(79) int local79 = arg4 * local29;
				@Pc(81) float[] local81 = local59;
				for (@Pc(83) int local83 = 0; local83 < local29; local83++) {
					@Pc(86) int local86 = local83;
					@Pc(88) int local88 = local83;
					@Pc(92) int local92 = local79 + local83;
					for (@Pc(94) int local94 = 0; local94 < local46; local94++) {
						for (@Pc(97) int local97 = 0; local97 < local42; local97++) {
							@Pc(102) float local102 = local48[local88];
							local88 += local29;
							@Pc(112) float local112 = local102 + local48[local88];
							local88 += local29;
							@Pc(122) float local122 = local112 + local48[local92];
							local92 += local29;
							@Pc(132) float local132 = local122 + local48[local92];
							local92 += local29;
							local59[local86] = local132 * 0.25F;
							local86 += local29;
						}
						local88 += local79;
						local92 += local79;
					}
				}
				local59 = local48;
				arg4 = local42;
				arg0 = local46;
				local48 = local81;
				local31++;
				local38 >>= 0x1;
				local46 >>= 0x1;
				local42 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}

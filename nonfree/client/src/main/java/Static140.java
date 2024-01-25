import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!gq", name = "D", descriptor = "[I")
	public static final int[] anIntArray220 = new int[8];

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIBII[B)V")
	public static void method2188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5) {
		if (arg4 > 0 && !Static409.method687(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static409.method687(arg1)) {
			@Pc(37) int local37 = Static368.method6275(arg0);
			@Pc(39) int local39 = 0;
			@Pc(46) int local46 = arg1 <= arg4 ? arg1 : arg4;
			@Pc(50) int local50 = arg4 >> 1;
			@Pc(62) int local62 = arg1 >> 1;
			@Pc(64) byte[] local64 = arg5;
			@Pc(71) byte[] local71 = new byte[local37 * local50 * local62];
			while (true) {
				OpenGL.glTexImage2Dub(arg3, local39, arg2, arg4, arg1, 0, arg0, 5121, local64, 0);
				if (local46 <= 1) {
					return;
				}
				@Pc(92) int local92 = arg4 * local37;
				@Pc(94) byte[] local94 = local71;
				for (@Pc(96) int local96 = 0; local96 < local37; local96++) {
					@Pc(100) int local100 = local96;
					@Pc(102) int local102 = local96;
					@Pc(107) int local107 = local96 + local92;
					for (@Pc(109) int local109 = 0; local109 < local62; local109++) {
						for (@Pc(113) int local113 = 0; local113 < local50; local113++) {
							@Pc(119) byte local119 = local64[local102];
							local102 += local37;
							@Pc(129) int local129 = local119 + local64[local102];
							@Pc(135) int local135 = local129 + local64[local107];
							local102 += local37;
							local107 += local37;
							@Pc(149) int local149 = local135 + local64[local107];
							local107 += local37;
							local71[local100] = (byte) (local149 >> 2);
							local100 += local37;
						}
						local102 += local92;
						local107 += local92;
					}
				}
				local71 = local64;
				local64 = local94;
				arg1 = local62;
				arg4 = local50;
				local62 >>= 0x1;
				local50 >>= 0x1;
				local46 >>= 0x1;
				local39++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)Z")
	public static boolean method2190(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}
}

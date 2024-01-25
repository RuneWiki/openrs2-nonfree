import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static614 {

	@OriginalMember(owner = "client!vs", name = "A", descriptor = "Lclient!gw;")
	public static final Class136 aClass136_70 = new Class136(30);

	@OriginalMember(owner = "client!vs", name = "C", descriptor = "Lclient!gw;")
	public static final Class136 aClass136_71 = new Class136(4);

	@OriginalMember(owner = "client!vs", name = "D", descriptor = "[I")
	public static final int[] anIntArray634 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(III[BIII)V")
	public static void method8393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg5 > 0 && !Static112.method1840(arg5)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static112.method1840(arg1)) {
			@Pc(36) int local36 = Static285.method6790(arg2);
			@Pc(38) int local38 = 0;
			@Pc(45) int local45 = arg5 >= arg1 ? arg1 : arg5;
			@Pc(49) int local49 = arg5 >> 1;
			@Pc(53) int local53 = arg1 >> 1;
			@Pc(55) byte[] local55 = arg3;
			@Pc(62) byte[] local62 = new byte[local53 * local49 * local36];
			while (true) {
				OpenGL.glTexImage2Dub(arg4, local38, arg0, arg5, arg1, 0, arg2, 5121, local55, 0);
				if (local45 <= 1) {
					return;
				}
				@Pc(92) int local92 = local36 * arg5;
				@Pc(94) byte[] local94 = local62;
				for (@Pc(96) int local96 = 0; local96 < local36; local96++) {
					@Pc(100) int local100 = local96;
					@Pc(102) int local102 = local96;
					@Pc(106) int local106 = local92 + local96;
					for (@Pc(108) int local108 = 0; local108 < local53; local108++) {
						for (@Pc(112) int local112 = 0; local112 < local49; local112++) {
							@Pc(118) byte local118 = local55[local102];
							local102 += local36;
							@Pc(128) int local128 = local118 + local55[local102];
							local102 += local36;
							@Pc(138) int local138 = local128 + local55[local106];
							local106 += local36;
							@Pc(148) int local148 = local138 + local55[local106];
							local62[local100] = (byte) (local148 >> 2);
							local106 += local36;
							local100 += local36;
						}
						local106 += local92;
						local102 += local92;
					}
				}
				local62 = local55;
				local55 = local94;
				arg1 = local53;
				arg5 = local49;
				local49 >>= 0x1;
				local38++;
				local45 >>= 0x1;
				local53 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}

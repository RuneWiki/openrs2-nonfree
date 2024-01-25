import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!li", name = "c", descriptor = "Lclient!ija;")
	public static Class5_Sub5_Sub12 aClass5_Sub5_Sub12_1;

	@OriginalMember(owner = "client!li", name = "f", descriptor = "[Lclient!fs;")
	public static Class134[] aClass134Array8;

	@OriginalMember(owner = "client!li", name = "d", descriptor = "Lclient!la;")
	public static Class208 aClass208_75;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIIII[I)V")
	public static void method5175(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int[] arg5) {
		if (arg3 > 0 && !Static45.method8836(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static45.method8836(arg1)) {
			@Pc(52) int local52 = 0;
			@Pc(64) int local64 = arg3 < arg1 ? arg3 : arg1;
			@Pc(68) int local68 = arg3 >> 1;
			@Pc(72) int local72 = arg1 >> 1;
			@Pc(82) int[] local82 = arg5;
			@Pc(87) int[] local87 = new int[local68 * local72];
			while (true) {
				OpenGL.glTexImage2Di(arg4, local52, arg0, arg3, arg1, 0, 32993, arg2, local82, 0);
				if (local64 <= 1) {
					return;
				}
				@Pc(105) int local105 = 0;
				@Pc(107) int local107 = 0;
				@Pc(111) int local111 = arg3;
				for (@Pc(113) int local113 = 0; local113 < local72; local113++) {
					for (@Pc(119) int local119 = 0; local119 < local68; local119++) {
						@Pc(128) int local128 = local82[local107++];
						@Pc(133) int local133 = local82[local111++];
						@Pc(138) int local138 = local82[local107++];
						@Pc(142) int local142 = local128 & 0xFF;
						@Pc(148) int local148 = local128 >> 8 & 0xFF;
						@Pc(154) int local154 = local128 >> 24 & 0xFF;
						@Pc(160) int local160 = local128 >> 16 & 0xFF;
						@Pc(165) int local165 = local82[local111++];
						@Pc(171) int local171 = local142 + (local138 & 0xFF);
						@Pc(179) int local179 = local154 + (local138 >> 24 & 0xFF);
						@Pc(187) int local187 = local160 + (local138 >> 16 & 0xFF);
						@Pc(195) int local195 = local148 + (local138 >> 8 & 0xFF);
						@Pc(201) int local201 = local171 + (local133 & 0xFF);
						@Pc(209) int local209 = local195 + (local133 >> 8 & 0xFF);
						@Pc(217) int local217 = local179 + (local133 >> 24 & 0xFF);
						@Pc(225) int local225 = local187 + (local133 >> 16 & 0xFF);
						@Pc(231) int local231 = local201 + (local165 & 0xFF);
						@Pc(239) int local239 = local209 + (local165 >> 8 & 0xFF);
						@Pc(247) int local247 = local225 + (local165 >> 16 & 0xFF);
						@Pc(255) int local255 = local217 + (local165 >> 24 & 0xFF);
						local87[local105++] = (local247 & 0x3FC) << 14 | local255 << 22 & 0xFF000000 | (local239 & 0x3FC) << 6 | local231 >> 2 & 0xFF;
					}
					local107 += arg3;
					local111 += arg3;
				}
				@Pc(302) int[] local302 = local87;
				local87 = local82;
				arg1 = local72;
				local82 = local302;
				arg3 = local68;
				local52++;
				local64 >>= 0x1;
				local68 >>= 0x1;
				local72 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)I")
	public static int method5176() {
		if (Static517.aFrame1 == null) {
			return Static168.aBoolean243 ? 2 : 1;
		} else {
			return 3;
		}
	}
}

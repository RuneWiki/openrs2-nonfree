import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static608 {

	@OriginalMember(owner = "client!uk", name = "L", descriptor = "I")
	public static int anInt10692 = 0;

	@OriginalMember(owner = "client!uk", name = "P", descriptor = "[I")
	public static final int[] anIntArray557 = new int[32];

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IBIIIII[I)V")
	public static void method9153(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int[] arg5) {
		if (arg1 > 0 && !Static100.method1457(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static100.method1457(arg2)) {
			@Pc(59) int local59 = 0;
			@Pc(70) int local70 = arg1 < arg2 ? arg1 : arg2;
			@Pc(74) int local74 = arg1 >> 1;
			@Pc(78) int local78 = arg2 >> 1;
			@Pc(80) int[] local80 = arg5;
			@Pc(85) int[] local85 = new int[local74 * local78];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local59, arg4, arg1, arg2, 0, 32993, arg3, local80, 0);
				if (local70 <= 1) {
					return;
				}
				@Pc(104) int local104 = 0;
				@Pc(106) int local106 = 0;
				@Pc(110) int local110 = arg1;
				@Pc(112) int[] local112 = local85;
				for (@Pc(114) int local114 = 0; local114 < local78; local114++) {
					for (@Pc(118) int local118 = 0; local118 < local74; local118++) {
						@Pc(125) int local125 = local80[local106++];
						@Pc(130) int local130 = local80[local106++];
						@Pc(135) int local135 = local80[local110++];
						@Pc(140) int local140 = local80[local110++];
						@Pc(146) int local146 = local125 >> 8 & 0xFF;
						@Pc(152) int local152 = local125 >> 16 & 0xFF;
						@Pc(156) int local156 = local125 & 0xFF;
						@Pc(162) int local162 = local125 >> 24 & 0xFF;
						@Pc(170) int local170 = local146 + (local130 >> 8 & 0xFF);
						@Pc(178) int local178 = local152 + (local130 >> 16 & 0xFF);
						@Pc(186) int local186 = local162 + (local130 >> 24 & 0xFF);
						@Pc(192) int local192 = local156 + (local130 & 0xFF);
						@Pc(200) int local200 = local186 + (local135 >> 24 & 0xFF);
						@Pc(208) int local208 = local178 + (local135 >> 16 & 0xFF);
						@Pc(214) int local214 = local192 + (local135 & 0xFF);
						@Pc(222) int local222 = local170 + (local135 >> 8 & 0xFF);
						@Pc(230) int local230 = local208 + (local140 >> 16 & 0xFF);
						@Pc(238) int local238 = local200 + (local140 >> 24 & 0xFF);
						@Pc(246) int local246 = local222 + (local140 >> 8 & 0xFF);
						@Pc(252) int local252 = local214 + (local140 & 0xFF);
						local85[local104++] = (local246 & 0x3FC) << 6 | (local238 & 0x3FC) << 22 | (local230 & 0x3FC) << 14 | local252 >> 2 & 0xFF;
					}
					local106 += arg1;
					local110 += arg1;
				}
				local85 = local80;
				local80 = local112;
				arg1 = local74;
				arg2 = local78;
				local59++;
				local70 >>= 0x1;
				local78 >>= 0x1;
				local74 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}

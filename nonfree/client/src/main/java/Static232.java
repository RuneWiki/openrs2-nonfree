import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "[Lclient!aba;")
	public static Class4[] aClass4Array3;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_36 = new Class181(58, 4);

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "S")
	public static short aShort59 = 32767;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIB[III)V")
	public static void method3615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(7) int arg5) {
		if (arg0 > 0 && !Static586.method8223(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static586.method8223(arg2)) {
			@Pc(53) int local53 = 0;
			@Pc(60) int local60 = arg0 >= arg2 ? arg2 : arg0;
			@Pc(64) int local64 = arg0 >> 1;
			@Pc(68) int local68 = arg2 >> 1;
			@Pc(70) int[] local70 = arg4;
			@Pc(75) int[] local75 = new int[local68 * local64];
			while (true) {
				OpenGL.glTexImage2Di(arg1, local53, arg3, arg0, arg2, 0, 32993, arg5, local70, 0);
				if (local60 <= 1) {
					return;
				}
				@Pc(93) int local93 = 0;
				@Pc(95) int local95 = 0;
				@Pc(100) int local100 = arg0;
				@Pc(102) int[] local102 = local75;
				for (@Pc(104) int local104 = 0; local104 < local68; local104++) {
					for (@Pc(108) int local108 = 0; local108 < local64; local108++) {
						@Pc(115) int local115 = local70[local95++];
						@Pc(120) int local120 = local70[local100++];
						@Pc(125) int local125 = local70[local95++];
						@Pc(130) int local130 = local70[local100++];
						@Pc(136) int local136 = local115 >> 24 & 0xFF;
						@Pc(142) int local142 = local115 >> 8 & 0xFF;
						@Pc(148) int local148 = local115 >> 16 & 0xFF;
						@Pc(152) int local152 = local115 & 0xFF;
						@Pc(160) int local160 = local136 + (local125 >> 24 & 0xFF);
						@Pc(166) int local166 = local152 + (local125 & 0xFF);
						@Pc(174) int local174 = local142 + (local125 >> 8 & 0xFF);
						@Pc(182) int local182 = local148 + (local125 >> 16 & 0xFF);
						@Pc(190) int local190 = local174 + (local120 >> 8 & 0xFF);
						@Pc(196) int local196 = local166 + (local120 & 0xFF);
						@Pc(204) int local204 = local182 + (local120 >> 16 & 0xFF);
						@Pc(212) int local212 = local160 + (local120 >> 24 & 0xFF);
						@Pc(220) int local220 = local204 + (local130 >> 16 & 0xFF);
						@Pc(228) int local228 = local212 + (local130 >> 24 & 0xFF);
						@Pc(236) int local236 = local190 + (local130 >> 8 & 0xFF);
						@Pc(242) int local242 = local196 + (local130 & 0xFF);
						local75[local93++] = (local236 & 0x3FC) << 6 | local220 << 14 & 0xFF0000 | (local228 & 0x3FC) << 22 | local242 >> 2 & 0xFF;
					}
					local95 += arg0;
					local100 += arg0;
				}
				local75 = local70;
				arg0 = local64;
				arg2 = local68;
				local70 = local102;
				local68 >>= 0x1;
				local53++;
				local60 >>= 0x1;
				local64 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
	public static int anInt3620;

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "[Z")
	public static boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString67 = null;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(III[IIBII)V")
	public static void method2864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg0 > 0 && !Static32.method1002(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static32.method1002(arg4)) {
			@Pc(51) int local51 = 0;
			@Pc(62) int local62 = arg4 <= arg0 ? arg4 : arg0;
			@Pc(66) int local66 = arg0 >> 1;
			@Pc(70) int local70 = arg4 >> 1;
			@Pc(72) int[] local72 = arg2;
			@Pc(77) int[] local77 = new int[local70 * local66];
			while (true) {
				OpenGL.glTexImage2Di(arg3, local51, arg1, arg0, arg4, 0, 32993, arg5, local72, 0);
				if (local62 <= 1) {
					return;
				}
				@Pc(96) int local96 = 0;
				@Pc(98) int local98 = 0;
				@Pc(103) int local103 = arg0;
				@Pc(105) int[] local105 = local77;
				for (@Pc(107) int local107 = 0; local107 < local70; local107++) {
					for (@Pc(111) int local111 = 0; local111 < local66; local111++) {
						@Pc(118) int local118 = local72[local98++];
						@Pc(123) int local123 = local72[local98++];
						@Pc(128) int local128 = local72[local103++];
						@Pc(134) int local134 = local118 >> 24 & 0xFF;
						@Pc(140) int local140 = local118 >> 8 & 0xFF;
						@Pc(146) int local146 = local118 >> 16 & 0xFF;
						@Pc(150) int local150 = local118 & 0xFF;
						@Pc(155) int local155 = local72[local103++];
						@Pc(163) int local163 = local146 + (local123 >> 16 & 0xFF);
						@Pc(171) int local171 = local140 + (local123 >> 8 & 0xFF);
						@Pc(179) int local179 = local134 + (local123 >> 24 & 0xFF);
						@Pc(185) int local185 = local150 + (local123 & 0xFF);
						@Pc(193) int local193 = local179 + (local128 >> 24 & 0xFF);
						@Pc(201) int local201 = local163 + (local128 >> 16 & 0xFF);
						@Pc(207) int local207 = local185 + (local128 & 0xFF);
						@Pc(215) int local215 = local171 + (local128 >> 8 & 0xFF);
						@Pc(223) int local223 = local215 + (local155 >> 8 & 0xFF);
						@Pc(231) int local231 = local201 + (local155 >> 16 & 0xFF);
						@Pc(239) int local239 = local193 + (local155 >> 24 & 0xFF);
						@Pc(245) int local245 = local207 + (local155 & 0xFF);
						local77[local96++] = local245 >> 2 & 0xFF | (local223 & 0x3FC) << 6 | (local239 & 0x3FC) << 22 | (local231 & 0x3FC) << 14;
					}
					local98 += arg0;
					local103 += arg0;
				}
				local77 = local72;
				arg4 = local70;
				local72 = local105;
				arg0 = local66;
				local51++;
				local62 >>= 0x1;
				local70 >>= 0x1;
				local66 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)I")
	public static int method2866() {
		return Static371.anInt7145;
	}
}

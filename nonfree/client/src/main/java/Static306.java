import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
	public static int anInt5072 = 0;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(II[IIIIII)V")
	public static void method4398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg1 > 0 && !Static259.method3656(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static259.method3656(arg3)) {
			@Pc(47) int local47 = 0;
			@Pc(54) int local54 = arg1 >= arg3 ? arg3 : arg1;
			@Pc(58) int local58 = arg1 >> 1;
			@Pc(62) int local62 = arg3 >> 1;
			@Pc(64) int[] local64 = arg2;
			@Pc(69) int[] local69 = new int[local58 * local62];
			while (true) {
				OpenGL.glTexImage2Di(arg5, local47, arg4, arg1, arg3, 0, 32993, arg0, local64, 0);
				if (local54 <= 1) {
					return;
				}
				@Pc(88) int local88 = 0;
				@Pc(90) int local90 = 0;
				@Pc(94) int local94 = arg1;
				@Pc(96) int[] local96 = local69;
				for (@Pc(98) int local98 = 0; local98 < local62; local98++) {
					for (@Pc(102) int local102 = 0; local102 < local58; local102++) {
						@Pc(109) int local109 = local64[local90++];
						@Pc(114) int local114 = local64[local90++];
						@Pc(119) int local119 = local64[local94++];
						@Pc(125) int local125 = local109 >> 8 & 0xFF;
						@Pc(129) int local129 = local109 & 0xFF;
						@Pc(135) int local135 = local109 >> 16 & 0xFF;
						@Pc(140) int local140 = local64[local94++];
						@Pc(146) int local146 = local109 >> 24 & 0xFF;
						@Pc(154) int local154 = local135 + (local114 >> 16 & 0xFF);
						@Pc(162) int local162 = local125 + (local114 >> 8 & 0xFF);
						@Pc(168) int local168 = local129 + (local114 & 0xFF);
						@Pc(176) int local176 = local146 + (local114 >> 24 & 0xFF);
						@Pc(182) int local182 = local168 + (local119 & 0xFF);
						@Pc(190) int local190 = local154 + (local119 >> 16 & 0xFF);
						@Pc(198) int local198 = local162 + (local119 >> 8 & 0xFF);
						@Pc(206) int local206 = local176 + (local119 >> 24 & 0xFF);
						@Pc(214) int local214 = local198 + (local140 >> 8 & 0xFF);
						@Pc(222) int local222 = local190 + (local140 >> 16 & 0xFF);
						@Pc(230) int local230 = local206 + (local140 >> 24 & 0xFF);
						@Pc(236) int local236 = local182 + (local140 & 0xFF);
						local69[local88++] = (local230 & 0x3FC) << 22 | (local222 & 0x3FC) << 14 | (local214 & 0x3FC) << 6 | local236 >> 2 & 0xFF;
					}
					local90 += arg1;
					local94 += arg1;
				}
				local69 = local64;
				local64 = local96;
				arg1 = local58;
				arg3 = local62;
				local54 >>= 0x1;
				local47++;
				local62 >>= 0x1;
				local58 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILclient!ps;ZI)V")
	public static void method4399(@OriginalArg(0) int arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(3) int arg2) {
		Static63.anInt1139 = arg0;
		Static238.aClass273_6 = arg1;
		Static151.anInt2435 = arg2;
	}
}

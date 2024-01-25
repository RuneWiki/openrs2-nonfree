import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!jr", name = "K", descriptor = "[Z")
	public static boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!jr", name = "L", descriptor = "Z")
	public static boolean aBoolean230 = false;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(BI[B)I")
	public static int method2863(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static86.method1339(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZI)Z")
	public static boolean method2864(@OriginalArg(1) int arg0) {
		return arg0 == 6 || arg0 == 7 || arg0 == 8;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(II[IIIIII)V")
	public static void method2865(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg2 > 0 && !Static409.method687(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static409.method687(arg3)) {
			@Pc(45) int local45 = 0;
			@Pc(52) int local52 = arg3 > arg2 ? arg2 : arg3;
			@Pc(56) int local56 = arg2 >> 1;
			@Pc(60) int local60 = arg3 >> 1;
			@Pc(62) int[] local62 = arg1;
			@Pc(67) int[] local67 = new int[local60 * local56];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local45, arg5, arg2, arg3, 0, 32993, arg4, local62, 0);
				if (local52 <= 1) {
					return;
				}
				@Pc(86) int local86 = 0;
				@Pc(88) int local88 = 0;
				@Pc(93) int local93 = arg2;
				for (@Pc(95) int local95 = 0; local95 < local60; local95++) {
					for (@Pc(99) int local99 = 0; local99 < local56; local99++) {
						@Pc(106) int local106 = local62[local88++];
						@Pc(111) int local111 = local62[local93++];
						@Pc(116) int local116 = local62[local88++];
						@Pc(122) int local122 = local106 >> 16 & 0xFF;
						@Pc(128) int local128 = local106 >> 8 & 0xFF;
						@Pc(133) int local133 = local62[local93++];
						@Pc(137) int local137 = local106 & 0xFF;
						@Pc(143) int local143 = local106 >> 24 & 0xFF;
						@Pc(151) int local151 = local128 + (local116 >> 8 & 0xFF);
						@Pc(157) int local157 = local137 + (local116 & 0xFF);
						@Pc(165) int local165 = local122 + (local116 >> 16 & 0xFF);
						@Pc(173) int local173 = local143 + (local116 >> 24 & 0xFF);
						@Pc(181) int local181 = local151 + (local111 >> 8 & 0xFF);
						@Pc(189) int local189 = local173 + (local111 >> 24 & 0xFF);
						@Pc(197) int local197 = local165 + (local111 >> 16 & 0xFF);
						@Pc(203) int local203 = local157 + (local111 & 0xFF);
						@Pc(211) int local211 = local197 + (local133 >> 16 & 0xFF);
						@Pc(219) int local219 = local189 + (local133 >> 24 & 0xFF);
						@Pc(225) int local225 = local203 + (local133 & 0xFF);
						@Pc(233) int local233 = local181 + (local133 >> 8 & 0xFF);
						local67[local86++] = (local233 & 0x3FC) << 6 | (local219 & 0x3FC) << 22 | (local211 & 0x3FC) << 14 | local225 >> 2 & 0xFF;
					}
					local88 += arg2;
					local93 += arg2;
				}
				@Pc(278) int[] local278 = local67;
				local67 = local62;
				local62 = local278;
				arg2 = local56;
				arg3 = local60;
				local60 >>= 0x1;
				local45++;
				local56 >>= 0x1;
				local52 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "(III)V")
	public static void method2866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static46.anInt754 == 1) {
			Static430.method5865(Static122.aClass2_Sub35_1, arg1, arg0);
		} else if (Static46.anInt754 == 2) {
			Static56.method907(arg0, arg1);
		}
		Static46.anInt754 = 0;
		Static122.aClass2_Sub35_1 = null;
	}
}

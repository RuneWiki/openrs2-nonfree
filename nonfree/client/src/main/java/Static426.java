import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "Lclient!cr;")
	public static Class57 aClass57_6;

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "Lclient!ud;")
	public static Class29_Sub2_Sub1_Sub2 aClass29_Sub2_Sub1_Sub2_2;

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "F")
	public static float aFloat171;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(BIIIIII[I)V")
	public static void method6224(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int[] arg5) {
		if (arg0 > 0 && !Static392.method5808(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static392.method5808(arg4)) {
			@Pc(40) int local40 = 0;
			@Pc(47) int local47 = arg0 < arg4 ? arg0 : arg4;
			@Pc(56) int local56 = arg0 >> 1;
			@Pc(60) int local60 = arg4 >> 1;
			@Pc(62) int[] local62 = arg5;
			@Pc(67) int[] local67 = new int[local56 * local60];
			while (true) {
				OpenGL.glTexImage2Di(arg2, local40, arg1, arg0, arg4, 0, 32993, arg3, local62, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(84) int local84 = 0;
				@Pc(86) int local86 = 0;
				@Pc(91) int local91 = arg0;
				for (@Pc(93) int local93 = 0; local93 < local60; local93++) {
					for (@Pc(97) int local97 = 0; local97 < local56; local97++) {
						@Pc(104) int local104 = local62[local86++];
						@Pc(109) int local109 = local62[local91++];
						@Pc(114) int local114 = local62[local86++];
						@Pc(120) int local120 = local104 >> 8 & 0xFF;
						@Pc(125) int local125 = local62[local91++];
						@Pc(129) int local129 = local104 & 0xFF;
						@Pc(135) int local135 = local104 >> 24 & 0xFF;
						@Pc(141) int local141 = local104 >> 16 & 0xFF;
						@Pc(149) int local149 = local141 + (local114 >> 16 & 0xFF);
						@Pc(157) int local157 = local120 + (local114 >> 8 & 0xFF);
						@Pc(163) int local163 = local129 + (local114 & 0xFF);
						@Pc(171) int local171 = local135 + (local114 >> 24 & 0xFF);
						@Pc(179) int local179 = local171 + (local109 >> 24 & 0xFF);
						@Pc(187) int local187 = local149 + (local109 >> 16 & 0xFF);
						@Pc(195) int local195 = local157 + (local109 >> 8 & 0xFF);
						@Pc(201) int local201 = local163 + (local109 & 0xFF);
						@Pc(209) int local209 = local195 + (local125 >> 8 & 0xFF);
						@Pc(215) int local215 = local201 + (local125 & 0xFF);
						@Pc(223) int local223 = local179 + (local125 >> 24 & 0xFF);
						@Pc(231) int local231 = local187 + (local125 >> 16 & 0xFF);
						local67[local84++] = (local209 & 0x3FC) << 6 | (local231 & 0x3FC) << 14 | (local223 & 0x3FC) << 22 | local215 >> 2 & 0xFF;
					}
					local91 += arg0;
					local86 += arg0;
				}
				@Pc(280) int[] local280 = local67;
				local67 = local62;
				arg4 = local60;
				local62 = local280;
				arg0 = local56;
				local56 >>= 0x1;
				local40++;
				local60 >>= 0x1;
				local47 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}

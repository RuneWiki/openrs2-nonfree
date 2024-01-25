import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bba", name = "g", descriptor = "Lclient!la;")
	public static Class196 aClass196_87;

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "[J")
	public static final long[] aLongArray18 = new long[32];

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "I")
	public static int anInt7819 = -1;

	@OriginalMember(owner = "client!bba", name = "l", descriptor = "Lclient!ae;")
	public static final Class7 aClass7_6 = new Class7();

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(I[IBIIIII)V")
	public static void method6777(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 > 0 && !Static323.method5278(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static323.method5278(arg4)) {
			@Pc(42) int local42 = 0;
			@Pc(49) int local49 = arg4 > arg3 ? arg3 : arg4;
			@Pc(61) int local61 = arg3 >> 1;
			@Pc(65) int local65 = arg4 >> 1;
			@Pc(67) int[] local67 = arg1;
			@Pc(72) int[] local72 = new int[local65 * local61];
			while (true) {
				OpenGL.glTexImage2Di(arg5, local42, arg2, arg3, arg4, 0, 32993, arg0, local67, 0);
				if (local49 <= 1) {
					return;
				}
				@Pc(91) int local91 = 0;
				@Pc(93) int local93 = 0;
				@Pc(97) int local97 = arg3;
				for (@Pc(99) int local99 = 0; local99 < local65; local99++) {
					for (@Pc(103) int local103 = 0; local103 < local61; local103++) {
						@Pc(110) int local110 = local67[local93++];
						@Pc(115) int local115 = local67[local93++];
						@Pc(120) int local120 = local67[local97++];
						@Pc(126) int local126 = local110 >> 16 & 0xFF;
						@Pc(132) int local132 = local110 >> 24 & 0xFF;
						@Pc(138) int local138 = local110 >> 8 & 0xFF;
						@Pc(142) int local142 = local110 & 0xFF;
						@Pc(147) int local147 = local67[local97++];
						@Pc(153) int local153 = local142 + (local115 & 0xFF);
						@Pc(161) int local161 = local126 + (local115 >> 16 & 0xFF);
						@Pc(169) int local169 = local138 + (local115 >> 8 & 0xFF);
						@Pc(177) int local177 = local132 + (local115 >> 24 & 0xFF);
						@Pc(185) int local185 = local177 + (local120 >> 24 & 0xFF);
						@Pc(193) int local193 = local161 + (local120 >> 16 & 0xFF);
						@Pc(199) int local199 = local153 + (local120 & 0xFF);
						@Pc(207) int local207 = local169 + (local120 >> 8 & 0xFF);
						@Pc(213) int local213 = local199 + (local147 & 0xFF);
						@Pc(221) int local221 = local185 + (local147 >> 24 & 0xFF);
						@Pc(229) int local229 = local193 + (local147 >> 16 & 0xFF);
						@Pc(237) int local237 = local207 + (local147 >> 8 & 0xFF);
						local72[local91++] = local213 >> 2 & 0xFF | (local237 & 0x3FC) << 6 | (local221 & 0x3FC) << 22 | (local229 & 0x3FC) << 14;
					}
					local97 += arg3;
					local93 += arg3;
				}
				@Pc(286) int[] local286 = local72;
				local72 = local67;
				arg3 = local61;
				local67 = local286;
				arg4 = local65;
				local65 >>= 0x1;
				local49 >>= 0x1;
				local42++;
				local61 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method6779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(14) int local14;
		if (Static219.method3673(arg6)) {
			local14 = 0;
			@Pc(36) int local36 = 0;
			@Pc(51) int local51 = 0;
			@Pc(53) int local53 = 0;
			@Pc(55) int local55 = 0;
			if (Static219.aBoolean285) {
				local51 = Static168.anInt3983;
				local55 = Static201.anInt3960;
				local36 = Static474.anInt8295;
				local14 = Static543.anInt9220;
				local53 = Static391.anInt7250;
				Static201.anInt3960 = 1;
			}
			if (Static158.aClass279ArrayArray2[arg6] == null) {
				Static192.method3264(arg3, arg7, arg1, arg0 < 0, Static92.aClass279ArrayArray1[arg6], arg4, arg5, arg2, arg0, -1);
			} else {
				Static192.method3264(arg3, arg7, arg1, arg0 < 0, Static158.aClass279ArrayArray2[arg6], arg4, arg5, arg2, arg0, -1);
			}
			if (Static219.aBoolean285) {
				if (arg0 >= 0 && Static201.anInt3960 == 2) {
					Static520.method8069(Static543.anInt9220, Static474.anInt8295, Static168.anInt3983, Static391.anInt7250);
				}
				Static391.anInt7250 = local53;
				Static201.anInt3960 = local55;
				Static474.anInt8295 = local36;
				Static168.anInt3983 = local51;
				Static543.anInt9220 = local14;
			}
		} else if (arg0 == -1) {
			for (local14 = 0; local14 < 100; local14++) {
				Static477.aBooleanArray21[local14] = true;
			}
		} else {
			Static477.aBooleanArray21[arg0] = true;
		}
	}
}

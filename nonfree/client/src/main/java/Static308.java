import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "Lclient!la;")
	public static Class20 aClass20_5;

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "F")
	public static float aFloat90;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[IIIBIII)V")
	public static void method4426(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg5 > 0 && !Static25.method518(arg5)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static25.method518(arg4)) {
			@Pc(37) int local37 = 0;
			@Pc(44) int local44 = arg5 >= arg4 ? arg4 : arg5;
			@Pc(48) int local48 = arg5 >> 1;
			@Pc(52) int local52 = arg4 >> 1;
			@Pc(63) int[] local63 = arg1;
			@Pc(68) int[] local68 = new int[local52 * local48];
			while (true) {
				OpenGL.glTexImage2Di(arg3, local37, arg0, arg5, arg4, 0, 32993, arg2, local63, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(84) int local84 = 0;
				@Pc(86) int local86 = 0;
				@Pc(90) int local90 = arg5;
				@Pc(92) int[] local92 = local68;
				for (@Pc(94) int local94 = 0; local94 < local52; local94++) {
					for (@Pc(97) int local97 = 0; local97 < local48; local97++) {
						@Pc(103) int local103 = local63[local86++];
						@Pc(108) int local108 = local63[local90++];
						@Pc(113) int local113 = local63[local86++];
						@Pc(119) int local119 = local103 >> 8 & 0xFF;
						@Pc(125) int local125 = local103 >> 24 & 0xFF;
						@Pc(129) int local129 = local103 & 0xFF;
						@Pc(134) int local134 = local63[local90++];
						@Pc(140) int local140 = local103 >> 16 & 0xFF;
						@Pc(148) int local148 = local125 + (local113 >> 24 & 0xFF);
						@Pc(156) int local156 = local140 + (local113 >> 16 & 0xFF);
						@Pc(164) int local164 = local119 + (local113 >> 8 & 0xFF);
						@Pc(170) int local170 = local129 + (local113 & 0xFF);
						@Pc(178) int local178 = local156 + (local108 >> 16 & 0xFF);
						@Pc(186) int local186 = local164 + (local108 >> 8 & 0xFF);
						@Pc(192) int local192 = local170 + (local108 & 0xFF);
						@Pc(200) int local200 = local148 + (local108 >> 24 & 0xFF);
						@Pc(208) int local208 = local200 + (local134 >> 24 & 0xFF);
						@Pc(214) int local214 = local192 + (local134 & 0xFF);
						@Pc(222) int local222 = local186 + (local134 >> 8 & 0xFF);
						@Pc(230) int local230 = local178 + (local134 >> 16 & 0xFF);
						local68[local84++] = local214 >> 2 & 0xFF | (local222 & 0x3FC) << 6 | (local208 & 0x3FC) << 22 | (local230 & 0x3FC) << 14;
					}
					local86 += arg5;
					local90 += arg5;
				}
				local68 = local63;
				arg5 = local48;
				arg4 = local52;
				local63 = local92;
				local44 >>= 0x1;
				local52 >>= 0x1;
				local37++;
				local48 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IZII)Z")
	public static boolean method4428(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Interface5 local14 = (Interface5) Static232.method3536(arg0, arg2, arg1);
		@Pc(16) boolean local16 = true;
		if (local14 != null) {
			local16 = Static411.method5580(local14) & true;
		}
		local14 = (Interface5) Static461.method5974(arg0, arg2, arg1, jg.class);
		if (local14 != null) {
			local16 &= Static411.method5580(local14);
		}
		local14 = (Interface5) Static454.method6163(arg0, arg2, arg1);
		if (local14 != null) {
			local16 &= Static411.method5580(local14);
		}
		return local16;
	}
}

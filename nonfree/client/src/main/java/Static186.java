import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(B)V")
	public static void method2956() {
		Static35.aClass240_39.method5433();
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BI[IIIIII)V")
	public static void method2957(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg0 > 0 && !Static74.method1330(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg5 <= 0 || Static74.method1330(arg5)) {
			@Pc(40) int local40 = 0;
			@Pc(51) int local51 = arg0 >= arg5 ? arg5 : arg0;
			@Pc(55) int local55 = arg0 >> 1;
			@Pc(67) int local67 = arg5 >> 1;
			@Pc(69) int[] local69 = arg1;
			@Pc(74) int[] local74 = new int[local67 * local55];
			while (true) {
				OpenGL.glTexImage2Di(arg4, local40, arg2, arg0, arg5, 0, 32993, arg3, local69, 0);
				if (local51 <= 1) {
					return;
				}
				@Pc(92) int local92 = 0;
				@Pc(94) int local94 = 0;
				@Pc(98) int local98 = arg0;
				for (@Pc(100) int local100 = 0; local100 < local67; local100++) {
					for (@Pc(104) int local104 = 0; local104 < local55; local104++) {
						@Pc(111) int local111 = local69[local94++];
						@Pc(116) int local116 = local69[local98++];
						@Pc(121) int local121 = local69[local94++];
						@Pc(127) int local127 = local111 >> 16 & 0xFF;
						@Pc(132) int local132 = local69[local98++];
						@Pc(138) int local138 = local111 >> 24 & 0xFF;
						@Pc(142) int local142 = local111 & 0xFF;
						@Pc(148) int local148 = local111 >> 8 & 0xFF;
						@Pc(156) int local156 = local127 + (local121 >> 16 & 0xFF);
						@Pc(164) int local164 = local148 + (local121 >> 8 & 0xFF);
						@Pc(172) int local172 = local138 + (local121 >> 24 & 0xFF);
						@Pc(178) int local178 = local142 + (local121 & 0xFF);
						@Pc(184) int local184 = local178 + (local116 & 0xFF);
						@Pc(192) int local192 = local172 + (local116 >> 24 & 0xFF);
						@Pc(200) int local200 = local156 + (local116 >> 16 & 0xFF);
						@Pc(208) int local208 = local164 + (local116 >> 8 & 0xFF);
						@Pc(216) int local216 = local192 + (local132 >> 24 & 0xFF);
						@Pc(222) int local222 = local184 + (local132 & 0xFF);
						@Pc(230) int local230 = local208 + (local132 >> 8 & 0xFF);
						@Pc(238) int local238 = local200 + (local132 >> 16 & 0xFF);
						local74[local92++] = (local230 & 0x3FC) << 6 | (local216 & 0x3FC) << 22 | (local238 & 0x3FC) << 14 | local222 >> 2 & 0xFF;
					}
					local94 += arg0;
					local98 += arg0;
				}
				@Pc(287) int[] local287 = local74;
				local74 = local69;
				arg5 = local67;
				arg0 = local55;
				local69 = local287;
				local40++;
				local67 >>= 0x1;
				local51 >>= 0x1;
				local55 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!cr;I)V")
	public static void method2958(@OriginalArg(0) Class41 arg0) {
		@Pc(7) Class41 local7 = Static6.method150(arg0);
		@Pc(12) int local12;
		@Pc(15) int local15;
		if (local7 == null) {
			local12 = Static96.anInt2175;
			local15 = Static216.anInt4171;
		} else {
			local12 = local7.anInt1622;
			local15 = local7.anInt1599;
		}
		Static427.method5775(false, local15, arg0, local12);
		Static34.method447(arg0, local15, local12);
	}
}

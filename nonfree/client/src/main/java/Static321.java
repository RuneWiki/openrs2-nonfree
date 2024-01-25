import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!jp", name = "s", descriptor = "I")
	public static int anInt5165;

	@OriginalMember(owner = "client!jp", name = "u", descriptor = "J")
	public static long aLong176;

	@OriginalMember(owner = "client!jp", name = "v", descriptor = "I")
	public static int anInt5167 = 0;

	@OriginalMember(owner = "client!jp", name = "q", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_50 = new Class144(34, 8);

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(BII)Z")
	public static boolean method4686(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIIII[II)V")
	public static void method4688(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int[] arg4, @OriginalArg(7) int arg5) {
		if (arg1 > 0 && !Static88.method1890(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static88.method1890(arg0)) {
			@Pc(47) int local47 = 0;
			@Pc(66) int local66 = arg1 >= arg0 ? arg0 : arg1;
			@Pc(70) int local70 = arg1 >> 1;
			@Pc(74) int local74 = arg0 >> 1;
			@Pc(76) int[] local76 = arg4;
			@Pc(81) int[] local81 = new int[local70 * local74];
			while (true) {
				OpenGL.glTexImage2Di(arg3, local47, arg2, arg1, arg0, 0, 32993, arg5, local76, 0);
				if (local66 <= 1) {
					return;
				}
				@Pc(97) int local97 = 0;
				@Pc(99) int local99 = 0;
				@Pc(103) int local103 = arg1;
				@Pc(105) int[] local105 = local81;
				for (@Pc(107) int local107 = 0; local107 < local74; local107++) {
					for (@Pc(113) int local113 = 0; local113 < local70; local113++) {
						@Pc(122) int local122 = local76[local99++];
						@Pc(127) int local127 = local76[local99++];
						@Pc(132) int local132 = local76[local103++];
						@Pc(138) int local138 = local122 >> 8 & 0xFF;
						@Pc(142) int local142 = local122 & 0xFF;
						@Pc(148) int local148 = local122 >> 16 & 0xFF;
						@Pc(153) int local153 = local76[local103++];
						@Pc(159) int local159 = local122 >> 24 & 0xFF;
						@Pc(167) int local167 = local148 + (local127 >> 16 & 0xFF);
						@Pc(175) int local175 = local159 + (local127 >> 24 & 0xFF);
						@Pc(181) int local181 = local142 + (local127 & 0xFF);
						@Pc(189) int local189 = local138 + (local127 >> 8 & 0xFF);
						@Pc(197) int local197 = local189 + (local132 >> 8 & 0xFF);
						@Pc(203) int local203 = local181 + (local132 & 0xFF);
						@Pc(211) int local211 = local175 + (local132 >> 24 & 0xFF);
						@Pc(219) int local219 = local167 + (local132 >> 16 & 0xFF);
						@Pc(227) int local227 = local197 + (local153 >> 8 & 0xFF);
						@Pc(233) int local233 = local203 + (local153 & 0xFF);
						@Pc(241) int local241 = local211 + (local153 >> 24 & 0xFF);
						@Pc(249) int local249 = local219 + (local153 >> 16 & 0xFF);
						local81[local97++] = local233 >> 2 & 0xFF | (local249 & 0x3FC) << 14 | (local241 & 0x3FC) << 22 | (local227 & 0x3FC) << 6;
					}
					local103 += arg1;
					local99 += arg1;
				}
				local81 = local76;
				local76 = local105;
				arg0 = local74;
				arg1 = local70;
				local74 >>= 0x1;
				local47++;
				local66 >>= 0x1;
				local70 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}

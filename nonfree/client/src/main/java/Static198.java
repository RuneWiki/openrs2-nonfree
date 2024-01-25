import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!jt", name = "R", descriptor = "I")
	public static int anInt3847;

	@OriginalMember(owner = "client!jt", name = "K", descriptor = "Lclient!sl;")
	public static final Class222 aClass222_5 = new Class222("", 17);

	@OriginalMember(owner = "client!jt", name = "Q", descriptor = "I")
	public static int anInt3846 = 0;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(I[BBIIII)V")
	public static void method3092(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 > 0 && !Static74.method1330(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg5 <= 0 || Static74.method1330(arg5)) {
			@Pc(34) int local34 = Static346.method4858(arg3);
			@Pc(36) int local36 = 0;
			@Pc(43) int local43 = arg2 >= arg5 ? arg5 : arg2;
			@Pc(47) int local47 = arg2 >> 1;
			@Pc(51) int local51 = arg5 >> 1;
			@Pc(53) byte[] local53 = arg1;
			@Pc(71) byte[] local71 = new byte[local34 * local47 * local51];
			while (true) {
				OpenGL.glTexImage2Dub(arg4, local36, arg0, arg2, arg5, 0, arg3, 5121, local53, 0);
				if (local43 <= 1) {
					return;
				}
				@Pc(90) int local90 = local34 * arg2;
				for (@Pc(92) int local92 = 0; local92 < local34; local92++) {
					@Pc(96) int local96 = local92;
					@Pc(98) int local98 = local92;
					@Pc(102) int local102 = local90 + local92;
					for (@Pc(104) int local104 = 0; local104 < local51; local104++) {
						for (@Pc(108) int local108 = 0; local108 < local47; local108++) {
							@Pc(114) byte local114 = local53[local98];
							local98 += local34;
							@Pc(124) int local124 = local114 + local53[local98];
							@Pc(130) int local130 = local124 + local53[local102];
							local98 += local34;
							local102 += local34;
							@Pc(144) int local144 = local130 + local53[local102];
							local102 += local34;
							local71[local96] = (byte) (local144 >> 2);
							local96 += local34;
						}
						local98 += local90;
						local102 += local90;
					}
				}
				@Pc(189) byte[] local189 = local71;
				local71 = local53;
				arg2 = local47;
				arg5 = local51;
				local53 = local189;
				local51 >>= 0x1;
				local43 >>= 0x1;
				local36++;
				local47 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}

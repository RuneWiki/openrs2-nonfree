import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static650 {

	@OriginalMember(owner = "client!wca", name = "t", descriptor = "I")
	public static int anInt10264;

	@OriginalMember(owner = "client!wca", name = "m", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_109 = new Class187(17, 15);

	@OriginalMember(owner = "client!wca", name = "q", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_110 = new Class187(67, -1);

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(I[BIIIII)V")
	public static void method8558(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg2 > 0 && !Static384.method5636(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static384.method5636(arg0)) {
			@Pc(34) int local34 = Static135.method2040(arg4);
			@Pc(36) int local36 = 0;
			@Pc(43) int local43 = arg2 >= arg0 ? arg0 : arg2;
			@Pc(47) int local47 = arg2 >> 1;
			@Pc(51) int local51 = arg0 >> 1;
			@Pc(53) byte[] local53 = arg1;
			@Pc(60) byte[] local60 = new byte[local51 * local47 * local34];
			while (true) {
				OpenGL.glTexImage2Dub(arg3, local36, arg5, arg2, arg0, 0, arg4, 5121, local53, 0);
				if (local43 <= 1) {
					return;
				}
				@Pc(80) int local80 = arg2 * local34;
				for (@Pc(82) int local82 = 0; local82 < local34; local82++) {
					@Pc(85) int local85 = local82;
					@Pc(87) int local87 = local82;
					@Pc(91) int local91 = local82 + local80;
					for (@Pc(93) int local93 = 0; local93 < local51; local93++) {
						for (@Pc(96) int local96 = 0; local96 < local47; local96++) {
							@Pc(101) byte local101 = local53[local87];
							local87 += local34;
							@Pc(111) int local111 = local101 + local53[local87];
							@Pc(117) int local117 = local111 + local53[local91];
							local87 += local34;
							local91 += local34;
							@Pc(131) int local131 = local117 + local53[local91];
							local60[local85] = (byte) (local131 >> 2);
							local91 += local34;
							local85 += local34;
						}
						local87 += local80;
						local91 += local80;
					}
				}
				@Pc(168) byte[] local168 = local60;
				local60 = local53;
				arg0 = local51;
				arg2 = local47;
				local53 = local168;
				local47 >>= 0x1;
				local36++;
				local51 >>= 0x1;
				local43 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIIIIIIIIZ)V")
	public static void method8559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (Static361.anInt6317 <= arg2 && arg2 <= Static651.anInt10267 && arg0 >= Static361.anInt6317 && Static651.anInt10267 >= arg0 && Static361.anInt6317 <= arg3 && arg3 <= Static651.anInt10267 && arg5 >= Static361.anInt6317 && arg5 <= Static651.anInt10267 && arg7 >= Static128.anInt2200 && arg7 <= Static380.anInt6585 && Static128.anInt2200 <= arg8 && Static380.anInt6585 >= arg8 && Static128.anInt2200 <= arg1 && Static380.anInt6585 >= arg1 && arg4 >= Static128.anInt2200 && arg4 <= Static380.anInt6585) {
			Static219.method3102(arg8, arg3, arg4, arg5, arg7, arg1, arg2, arg6, arg0);
		} else {
			Static173.method2557(arg6, arg7, arg5, arg2, arg3, arg4, arg1, arg8, arg0);
		}
	}
}

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!ci", name = "i", descriptor = "Z")
	public static boolean aBoolean84 = false;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)Lclient!rg;")
	public static Class275 method984(@OriginalArg(1) int arg0) {
		@Pc(8) Class275[] local8 = Static221.method3510();
		for (@Pc(18) int local18 = 0; local18 < local8.length; local18++) {
			@Pc(24) Class275 local24 = local8[local18];
			if (arg0 == local24.anInt7903) {
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(III[FIII)V")
	public static void method987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 > 0 && !Static331.method5078(arg5)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static331.method5078(arg0)) {
			@Pc(43) int local43 = Static440.method6243(6408);
			@Pc(45) int local45 = 0;
			@Pc(56) int local56 = arg5 < arg0 ? arg5 : arg0;
			@Pc(60) int local60 = arg5 >> 1;
			@Pc(64) int local64 = arg0 >> 1;
			@Pc(66) float[] local66 = arg3;
			@Pc(73) float[] local73 = new float[local43 * local64 * local60];
			while (true) {
				OpenGL.glTexImage2Df(3553, local45, 34842, arg5, arg0, 0, 6408, 5126, local66, 0);
				if (local56 <= 1) {
					return;
				}
				@Pc(91) int local91 = arg5 * local43;
				@Pc(93) float[] local93 = local73;
				for (@Pc(95) int local95 = 0; local95 < local43; local95++) {
					@Pc(99) int local99 = local95;
					@Pc(101) int local101 = local95;
					@Pc(105) int local105 = local91 + local95;
					for (@Pc(107) int local107 = 0; local107 < local64; local107++) {
						for (@Pc(111) int local111 = 0; local111 < local60; local111++) {
							@Pc(117) float local117 = local66[local101];
							local101 += local43;
							@Pc(127) float local127 = local117 + local66[local101];
							local101 += local43;
							@Pc(137) float local137 = local127 + local66[local105];
							local105 += local43;
							@Pc(147) float local147 = local137 + local66[local105];
							local73[local99] = local147 * 0.25F;
							local105 += local43;
							local99 += local43;
						}
						local105 += local91;
						local101 += local91;
					}
				}
				local73 = local66;
				arg0 = local64;
				arg5 = local60;
				local66 = local93;
				local45++;
				local64 >>= 0x1;
				local56 >>= 0x1;
				local60 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}

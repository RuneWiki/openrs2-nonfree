import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "Lclient!kda;")
	public static Class160 aClass160_49;

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_70 = new Class6(90, 5);

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIII[III)V")
	public static void method3942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(7) int arg5) {
		if (arg0 > 0 && !Static183.method3500(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static183.method3500(arg3)) {
			@Pc(40) int local40 = 0;
			@Pc(47) int local47 = arg0 < arg3 ? arg0 : arg3;
			@Pc(51) int local51 = arg0 >> 1;
			@Pc(55) int local55 = arg3 >> 1;
			@Pc(57) int[] local57 = arg4;
			@Pc(62) int[] local62 = new int[local55 * local51];
			while (true) {
				OpenGL.glTexImage2Di(arg5, local40, arg2, arg0, arg3, 0, 32993, arg1, local57, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(81) int local81 = 0;
				@Pc(83) int local83 = 0;
				@Pc(87) int local87 = arg0;
				for (@Pc(89) int local89 = 0; local89 < local55; local89++) {
					for (@Pc(92) int local92 = 0; local92 < local51; local92++) {
						@Pc(98) int local98 = local57[local83++];
						@Pc(103) int local103 = local57[local83++];
						@Pc(108) int local108 = local57[local87++];
						@Pc(113) int local113 = local57[local87++];
						@Pc(117) int local117 = local98 & 0xFF;
						@Pc(123) int local123 = local98 >> 16 & 0xFF;
						@Pc(129) int local129 = local98 >> 24 & 0xFF;
						@Pc(135) int local135 = local98 >> 8 & 0xFF;
						@Pc(143) int local143 = local135 + (local103 >> 8 & 0xFF);
						@Pc(151) int local151 = local123 + (local103 >> 16 & 0xFF);
						@Pc(159) int local159 = local129 + (local103 >> 24 & 0xFF);
						@Pc(165) int local165 = local117 + (local103 & 0xFF);
						@Pc(171) int local171 = local165 + (local108 & 0xFF);
						@Pc(179) int local179 = local151 + (local108 >> 16 & 0xFF);
						@Pc(187) int local187 = local159 + (local108 >> 24 & 0xFF);
						@Pc(195) int local195 = local143 + (local108 >> 8 & 0xFF);
						@Pc(203) int local203 = local187 + (local113 >> 24 & 0xFF);
						@Pc(211) int local211 = local195 + (local113 >> 8 & 0xFF);
						@Pc(219) int local219 = local179 + (local113 >> 16 & 0xFF);
						@Pc(225) int local225 = local171 + (local113 & 0xFF);
						local62[local81++] = local225 >> 2 & 0xFF | (local211 & 0x3FC) << 6 | (local219 & 0x3FC) << 14 | (local203 & 0x3FC) << 22;
					}
					local83 += arg0;
					local87 += arg0;
				}
				@Pc(274) int[] local274 = local62;
				local62 = local57;
				arg0 = local51;
				local57 = local274;
				arg3 = local55;
				local55 >>= 0x1;
				local51 >>= 0x1;
				local40++;
				local47 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIB)V")
	public static void method3946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class308 local14 = Static208.aClass308ArrayArray1[arg0][arg1];
		if (local14 != null) {
			Static120.anInt2877 = local14.anInt8707;
			Static361.anInt6490 = local14.anInt8699;
			Static91.anInt724 = local14.anInt8704;
		}
		Static245.method4144();
	}
}

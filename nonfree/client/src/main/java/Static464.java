import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!qia", name = "o", descriptor = "Lclient!mr;")
	public static final Class223 aClass223_49 = new Class223();

	@OriginalMember(owner = "client!qia", name = "p", descriptor = "[I")
	public static final int[] anIntArray507 = new int[6];

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(Lclient!uea;Lclient!ha;Lclient!jia;IIIZLclient!bm;I)V")
	public static void method7043(@OriginalArg(0) Class3_Sub49 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) Class172 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class36 arg6, @OriginalArg(8) int arg7) {
		@Pc(14) int local14 = arg7 - arg4 / 2 - 5;
		@Pc(18) int local18 = arg5 + 2;
		if (arg6.anInt1353 != 0) {
			arg1.method7528(local14, arg5 + arg2.method4399() * arg3 + 1 - local18, arg4 + 10, local18, arg6.anInt1353);
		}
		if (arg6.anInt1346 != 0) {
			arg1.method7513(local14, local18, arg5 + arg2.method4399() * arg3 + 1 - local18, arg4 + 10, arg6.anInt1346);
		}
		@Pc(73) int local73 = arg6.anInt1335;
		if (arg0.aBoolean675 && arg6.anInt1349 != -1) {
			local73 = arg6.anInt1349;
		}
		for (@Pc(85) int local85 = 0; local85 < arg3; local85++) {
			@Pc(91) String local91 = Static609.aStringArray38[local85];
			if (arg3 - 1 > local85) {
				local91 = local91.substring(0, local91.length() - 4);
			}
			arg2.method4398(arg1, local91, arg7, arg5, local73);
			arg5 += arg2.method4399();
		}
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(ILclient!qk;II)V")
	public static void method7045(@OriginalArg(1) Class279 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static88.anInt2121 = arg1;
		Static366.aClass279_12 = arg0;
		Static362.anInt6901 = arg2;
	}

	@OriginalMember(owner = "client!qia", name = "c", descriptor = "(I)V")
	public static void method7046() {
		Static447.method6931(-1, 255);
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(I[FIIIIB)V")
	public static void method7047(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg2 > 0 && !Static323.method5278(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static323.method5278(arg4)) {
			@Pc(33) int local33 = Static445.method6913(6408);
			@Pc(35) int local35 = 0;
			@Pc(46) int local46 = arg4 > arg2 ? arg2 : arg4;
			@Pc(50) int local50 = arg2 >> 1;
			@Pc(54) int local54 = arg4 >> 1;
			@Pc(56) float[] local56 = arg1;
			@Pc(67) float[] local67 = new float[local33 * local54 * local50];
			while (true) {
				OpenGL.glTexImage2Df(3553, local35, 34842, arg2, arg4, 0, 6408, 5126, local56, 0);
				if (local46 <= 1) {
					return;
				}
				@Pc(85) int local85 = arg2 * local33;
				@Pc(87) float[] local87 = local67;
				for (@Pc(89) int local89 = 0; local89 < local33; local89++) {
					@Pc(93) int local93 = local89;
					@Pc(95) int local95 = local89;
					@Pc(99) int local99 = local85 + local89;
					for (@Pc(101) int local101 = 0; local101 < local54; local101++) {
						for (@Pc(105) int local105 = 0; local105 < local50; local105++) {
							@Pc(111) float local111 = local56[local95];
							local95 += local33;
							@Pc(121) float local121 = local111 + local56[local95];
							local95 += local33;
							@Pc(131) float local131 = local121 + local56[local99];
							local99 += local33;
							@Pc(141) float local141 = local131 + local56[local99];
							local67[local93] = local141 * 0.25F;
							local99 += local33;
							local93 += local33;
						}
						local95 += local85;
						local99 += local85;
					}
				}
				local67 = local56;
				local56 = local87;
				arg4 = local54;
				arg2 = local50;
				local46 >>= 0x1;
				local50 >>= 0x1;
				local54 >>= 0x1;
				local35++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!ci", name = "V", descriptor = "Lclient!so;")
	public static Class227 aClass227_2;

	@OriginalMember(owner = "client!ci", name = "ob", descriptor = "[[I")
	public static int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!ci", name = "pb", descriptor = "[I")
	public static int[] anIntArray80;

	@OriginalMember(owner = "client!ci", name = "T", descriptor = "Lclient!kp;")
	public static final Class147 aClass147_2 = new Class147("runescape", 0);

	@OriginalMember(owner = "client!ci", name = "W", descriptor = "[I")
	public static final int[] anIntArray79 = new int[2048];

	@OriginalMember(owner = "client!ci", name = "Y", descriptor = "Lclient!ru;")
	public static final Class216 aClass216_1 = new Class216(14, 1);

	@OriginalMember(owner = "client!ci", name = "Z", descriptor = "Lclient!ru;")
	public static final Class216 aClass216_2 = new Class216(15, 4);

	@OriginalMember(owner = "client!ci", name = "ab", descriptor = "Lclient!ru;")
	public static final Class216 aClass216_3 = new Class216(16, -2);

	@OriginalMember(owner = "client!ci", name = "bb", descriptor = "Lclient!ru;")
	public static final Class216 aClass216_4 = new Class216(17, 0);

	@OriginalMember(owner = "client!ci", name = "cb", descriptor = "Lclient!ru;")
	public static final Class216 aClass216_5 = new Class216(18, -2);

	@OriginalMember(owner = "client!ci", name = "db", descriptor = "Lclient!ru;")
	public static final Class216 aClass216_6 = new Class216(19, -2);

	@OriginalMember(owner = "client!ci", name = "eb", descriptor = "Lclient!ru;")
	public static final Class216 aClass216_7 = new Class216(20, 6);

	@OriginalMember(owner = "client!ci", name = "fb", descriptor = "Lclient!ru;")
	public static final Class216 aClass216_8 = new Class216(21, 9);

	@OriginalMember(owner = "client!ci", name = "gb", descriptor = "Lclient!ru;")
	public static final Class216 aClass216_9 = new Class216(22, -2);

	@OriginalMember(owner = "client!ci", name = "hb", descriptor = "Lclient!ru;")
	public static final Class216 aClass216_10 = new Class216(23, 4);

	@OriginalMember(owner = "client!ci", name = "ib", descriptor = "Lclient!ru;")
	public static final Class216 aClass216_11 = new Class216(24, -1);

	@OriginalMember(owner = "client!ci", name = "jb", descriptor = "Lclient!ru;")
	public static final Class216 aClass216_12 = new Class216(25, -2);

	@OriginalMember(owner = "client!ci", name = "mb", descriptor = "I")
	public static int anInt967 = 2;

	@OriginalMember(owner = "client!ci", name = "nb", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_22 = new Class27(71, -1);

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(FI[FIIFIIIBFII)V")
	public static void method912(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) float arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(22) int local22 = arg7 - arg3;
		@Pc(26) int local26 = arg8 - arg4;
		@Pc(30) int local30 = arg11 - arg1;
		@Pc(55) float local55 = (float) local30 * arg2[2] + (float) local22 * arg2[0] + (float) local26 * arg2[1];
		@Pc(76) float local76 = (float) local26 * arg2[4] + arg2[3] * (float) local22 + (float) local30 * arg2[5];
		@Pc(97) float local97 = (float) local30 * arg2[8] + (float) local26 * arg2[7] + (float) local22 * arg2[6];
		@Pc(127) float local127;
		@Pc(121) float local121;
		if (arg10 == 0) {
			local121 = arg0 + 0.5F - local97;
			local127 = local55 + arg9 + 0.5F;
		} else if (arg10 == 1) {
			local121 = arg0 + local97 + 0.5F;
			local127 = local55 + arg9 + 0.5F;
		} else if (arg10 == 2) {
			local127 = arg9 + 0.5F - local55;
			local121 = arg5 + 0.5F - local76;
		} else if (arg10 == 3) {
			local121 = arg5 + 0.5F - local76;
			local127 = local55 + arg9 + 0.5F;
		} else if (arg10 == 4) {
			local121 = arg5 + 0.5F - local76;
			local127 = local97 + arg0 + 0.5F;
		} else {
			local121 = arg5 + 0.5F - local76;
			local127 = arg0 + 0.5F - local97;
		}
		@Pc(231) float local231;
		if (arg6 == 1) {
			local231 = local127;
			local127 = -local121;
			local121 = local231;
		} else if (arg6 == 2) {
			local127 = -local127;
			local121 = -local121;
		} else if (arg6 == 3) {
			local231 = local127;
			local127 = local121;
			local121 = -local231;
		}
		Static387.aFloat111 = local121;
		Static55.aFloat12 = local127;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIB[BIII)V")
	public static void method914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 > 0 && !Static131.method2284(arg5)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static131.method2284(arg0)) {
			@Pc(31) int local31 = Static254.method3688(arg4);
			@Pc(33) int local33 = 0;
			@Pc(40) int local40 = arg0 <= arg5 ? arg0 : arg5;
			@Pc(48) int local48 = arg5 >> 1;
			@Pc(52) int local52 = arg0 >> 1;
			@Pc(54) byte[] local54 = arg2;
			@Pc(61) byte[] local61 = new byte[local31 * local52 * local48];
			while (true) {
				OpenGL.glTexImage2Dub(arg3, local33, arg1, arg5, arg0, 0, arg4, 5121, local54, 0);
				if (local40 <= 1) {
					return;
				}
				@Pc(81) int local81 = local31 * arg5;
				for (@Pc(83) int local83 = 0; local83 < local31; local83++) {
					@Pc(87) int local87 = local83;
					@Pc(89) int local89 = local83;
					@Pc(93) int local93 = local81 + local83;
					for (@Pc(95) int local95 = 0; local95 < local52; local95++) {
						for (@Pc(99) int local99 = 0; local99 < local48; local99++) {
							@Pc(105) byte local105 = local54[local89];
							local89 += local31;
							@Pc(115) int local115 = local105 + local54[local89];
							@Pc(121) int local121 = local115 + local54[local93];
							local89 += local31;
							local93 += local31;
							@Pc(135) int local135 = local121 + local54[local93];
							local61[local87] = (byte) (local135 >> 2);
							local93 += local31;
							local87 += local31;
						}
						local93 += local81;
						local89 += local81;
					}
				}
				@Pc(172) byte[] local172 = local61;
				local61 = local54;
				arg5 = local48;
				arg0 = local52;
				local54 = local172;
				local48 >>= 0x1;
				local52 >>= 0x1;
				local33++;
				local40 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILclient!ya;)V")
	public static void method915(@OriginalArg(0) int arg0, @OriginalArg(1) Class154 arg1) {
		Static332.aClass154Array3[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(B[I[ILclient!ig;[I)V")
	public static void method916(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class24_Sub3_Sub2_Sub1 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(22) int local22 = arg1[local7];
			@Pc(26) int local26 = arg0[local7];
			@Pc(30) int local30 = arg3[local7];
			for (@Pc(32) int local32 = 0; local26 != 0 && arg2.aClass91Array3.length > local32; local32++) {
				if ((local26 & 0x1) != 0) {
					if (local22 == -1) {
						arg2.aClass91Array3[local32] = null;
					} else {
						@Pc(47) Class137 local47 = Static281.aClass98_3.method2405(local22);
						@Pc(50) int local50 = local47.anInt4039;
						@Pc(55) Class91 local55 = arg2.aClass91Array3[local32];
						if (local55 != null) {
							if (local55.anInt2758 == local22) {
								if (local50 == 0) {
									local55 = arg2.aClass91Array3[local32] = null;
								} else if (local50 == 1) {
									local55.anInt2761 = 0;
									local55.anInt2759 = local30;
									local55.anInt2762 = 0;
									local55.anInt2763 = 0;
									local55.anInt2755 = 1;
									Static302.method4200(local47, arg2.anInt7092, arg2.anInt7094, arg2.aByte98, 0, false);
								} else if (local50 == 2) {
									local55.anInt2763 = 0;
								}
							} else if (local47.anInt4040 >= Static281.aClass98_3.method2405(local55.anInt2758).anInt4040) {
								local55 = arg2.aClass91Array3[local32] = null;
							}
						}
						if (local55 == null) {
							local55 = arg2.aClass91Array3[local32] = new Class91();
							local55.anInt2763 = 0;
							local55.anInt2762 = 0;
							local55.anInt2759 = local30;
							local55.anInt2761 = 0;
							local55.anInt2758 = local22;
							local55.anInt2755 = 1;
							Static302.method4200(local47, arg2.anInt7092, arg2.anInt7094, arg2.aByte98, 0, false);
						}
					}
				}
				local26 >>>= 0x1;
			}
		}
	}
}

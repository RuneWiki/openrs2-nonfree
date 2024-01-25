import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!rga", name = "w", descriptor = "I")
	public static int anInt9598;

	@OriginalMember(owner = "client!rga", name = "G", descriptor = "I")
	public static int anInt9607;

	@OriginalMember(owner = "client!rga", name = "H", descriptor = "[Lclient!mi;")
	public static Class46[] aClass46Array17;

	@OriginalMember(owner = "client!rga", name = "K", descriptor = "Lclient!wea;")
	public static Class370 aClass370_7;

	@OriginalMember(owner = "client!rga", name = "M", descriptor = "F")
	public static float aFloat200;

	@OriginalMember(owner = "client!rga", name = "B", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_98 = new Class94(7, 6);

	@OriginalMember(owner = "client!rga", name = "N", descriptor = "Z")
	public static boolean aBoolean676 = false;

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(III[FIII)V")
	public static void method7982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 > 0 && !Static468.method7401(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static468.method7401(arg4)) {
			@Pc(34) int local34 = Static452.method7106(6408);
			@Pc(36) int local36 = 0;
			@Pc(47) int local47 = arg0 < arg4 ? arg0 : arg4;
			@Pc(51) int local51 = arg0 >> 1;
			@Pc(55) int local55 = arg4 >> 1;
			@Pc(57) float[] local57 = arg3;
			@Pc(64) float[] local64 = new float[local34 * local51 * local55];
			while (true) {
				OpenGL.glTexImage2Df(3553, local36, 34842, arg0, arg4, 0, 6408, 5126, local57, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(85) int local85 = arg0 * local34;
				@Pc(87) float[] local87 = local64;
				for (@Pc(89) int local89 = 0; local89 < local34; local89++) {
					@Pc(93) int local93 = local89;
					@Pc(95) int local95 = local89;
					@Pc(99) int local99 = local85 + local89;
					for (@Pc(101) int local101 = 0; local101 < local55; local101++) {
						for (@Pc(105) int local105 = 0; local105 < local51; local105++) {
							@Pc(111) float local111 = local57[local95];
							local95 += local34;
							@Pc(121) float local121 = local111 + local57[local95];
							local95 += local34;
							@Pc(131) float local131 = local121 + local57[local99];
							local99 += local34;
							@Pc(141) float local141 = local131 + local57[local99];
							local99 += local34;
							local64[local93] = local141 * 0.25F;
							local93 += local34;
						}
						local95 += local85;
						local99 += local85;
					}
				}
				local64 = local57;
				local57 = local87;
				arg0 = local51;
				arg4 = local55;
				local36++;
				local47 >>= 0x1;
				local51 >>= 0x1;
				local55 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(IIBIII[B)Z")
	public static boolean method7983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) byte[] arg4) {
		@Pc(9) int local9 = arg2 % 8;
		@Pc(26) int local26;
		if (local9 == 0) {
			local26 = 0;
		} else {
			local26 = 8 - local9;
		}
		@Pc(40) int local40 = -((arg1 + 8 - 1) / 8);
		@Pc(49) int local49 = -((arg2 + 8 - 1) / 8);
		for (@Pc(51) int local51 = local40; local51 < 0; local51++) {
			for (@Pc(55) int local55 = local49; local55 < 0; local55++) {
				if (arg4[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local26;
			if (arg4[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg0;
		}
		return false;
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(II[B)I")
	public static int method7985(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static432.method6884(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(ZI)V")
	public static void method7986(@OriginalArg(0) boolean arg0) {
		if (Static152.aString36.length() == 0) {
			return;
		}
		Static300.method2224("--> " + Static152.aString36);
		Static313.method5481(Static152.aString36, false, arg0);
		Static511.anInt9363 = 0;
		Static152.aString36 = "";
		Static568.anInt10191 = 0;
	}
}

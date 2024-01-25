import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "Lclient!h;")
	public static Class90 aClass90_9;

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray43 = new String[200];

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "Z")
	public static boolean aBoolean556 = false;

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
	public static int anInt6789 = 0;

	@OriginalMember(owner = "client!wr", name = "j", descriptor = "I")
	public static int anInt6792 = 0;

	@OriginalMember(owner = "client!wr", name = "n", descriptor = "[I")
	public static final int[] anIntArray680 = new int[4];

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIZLclient!wm;I)V")
	public static void method5866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class10_Sub1_Sub2 arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class118 local13 = arg2.method3408();
		@Pc(23) int local23 = arg2.anInt4056 - arg2.aClass212_7.anInt6528 & 0x3FFF;
		if (arg1 == -1) {
			if (local23 != 0 || arg2.anInt4067 > 25) {
				arg2.aBoolean307 = false;
				if (arg0 < 0 && local13.anInt2966 != -1) {
					arg2.anInt4034 = local13.anInt2966;
				} else if (arg0 <= 0 || local13.anInt2964 == -1) {
					arg2.anInt4034 = local13.anInt2993;
				} else {
					arg2.anInt4034 = local13.anInt2964;
				}
			} else if (!arg2.aBoolean307 || !local13.method2553(arg2.anInt4034)) {
				arg2.anInt4034 = local13.method2555();
				arg2.aBoolean307 = arg2.anInt4034 != -1;
			}
		} else if (arg2.anInt4061 != -1 && (local23 >= 10240 || local23 <= 2048)) {
			@Pc(209) int local209 = Static219.anIntArray429[arg3] - arg2.aClass212_7.anInt6528 & 0x3FFF;
			arg2.aBoolean307 = false;
			if (arg1 == 2 && local13.anInt2967 != -1) {
				if (local209 > 2048 && local209 <= 6144 && local13.anInt2969 != -1) {
					arg2.anInt4034 = local13.anInt2969;
				} else if (local209 >= 10240 && local209 < 14336 && local13.anInt2968 != -1) {
					arg2.anInt4034 = local13.anInt2968;
				} else if (local209 <= 6144 || local209 >= 10240 || local13.anInt2970 == -1) {
					arg2.anInt4034 = local13.anInt2967;
				} else {
					arg2.anInt4034 = local13.anInt2970;
				}
			} else if (arg1 == 0 && local13.anInt2974 != -1) {
				if (local209 > 2048 && local209 <= 6144 && local13.anInt2991 != -1) {
					arg2.anInt4034 = local13.anInt2991;
				} else if (local209 >= 10240 && local209 < 14336 && local13.anInt2957 != -1) {
					arg2.anInt4034 = local13.anInt2957;
				} else if (local209 <= 6144 || local209 >= 10240 || local13.anInt2984 == -1) {
					arg2.anInt4034 = local13.anInt2974;
				} else {
					arg2.anInt4034 = local13.anInt2984;
				}
			} else if (local209 > 2048 && local209 <= 6144 && local13.anInt2962 != -1) {
				arg2.anInt4034 = local13.anInt2962;
			} else if (local209 >= 10240 && local209 < 14336 && local13.anInt2971 != -1) {
				arg2.anInt4034 = local13.anInt2971;
			} else if (local209 <= 6144 || local209 >= 10240 || local13.anInt2990 == -1) {
				arg2.anInt4034 = local13.anInt2993;
			} else {
				arg2.anInt4034 = local13.anInt2990;
			}
		} else if (local23 == 0 && arg2.anInt4067 <= 25) {
			arg2.aBoolean307 = false;
			if (arg1 == 2 && local13.anInt2967 != -1) {
				arg2.anInt4034 = local13.anInt2967;
			} else if (arg1 == 0 && local13.anInt2974 != -1) {
				arg2.anInt4034 = local13.anInt2974;
			} else {
				arg2.anInt4034 = local13.anInt2993;
			}
		} else {
			if (arg1 == 2 && local13.anInt2967 != -1) {
				if (arg0 < 0 && local13.anInt2961 != -1) {
					arg2.anInt4034 = local13.anInt2961;
				} else if (arg0 <= 0 || local13.anInt2988 == -1) {
					arg2.anInt4034 = local13.anInt2967;
				} else {
					arg2.anInt4034 = local13.anInt2988;
				}
			} else if (arg1 == 0 && local13.anInt2974 != -1) {
				if (arg0 < 0 && local13.anInt2985 != -1) {
					arg2.anInt4034 = local13.anInt2985;
				} else if (arg0 <= 0 || local13.anInt2956 == -1) {
					arg2.anInt4034 = local13.anInt2974;
				} else {
					arg2.anInt4034 = local13.anInt2956;
				}
			} else if (arg0 < 0 && local13.anInt2982 != -1) {
				arg2.anInt4034 = local13.anInt2982;
			} else if (arg0 <= 0 || local13.anInt2981 == -1) {
				arg2.anInt4034 = local13.anInt2993;
			} else {
				arg2.anInt4034 = local13.anInt2981;
			}
			arg2.aBoolean307 = false;
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)V")
	public static void method5867() {
		if (Static342.anInt2478 == -1 || Static100.anInt1933 == -1) {
			return;
		}
		@Pc(25) int local25 = Static51.anInt1260 + (Static141.anInt2714 * (Static57.anInt1357 - Static51.anInt1260) >> 16);
		Static141.anInt2714 += local25;
		if (Static141.anInt2714 >= 65535) {
			if (Static4.aBoolean8) {
				Static134.aBoolean211 = false;
			} else {
				Static134.aBoolean211 = true;
			}
			Static141.anInt2714 = 65535;
			Static4.aBoolean8 = true;
		} else {
			Static134.aBoolean211 = false;
			Static4.aBoolean8 = false;
		}
		@Pc(55) float local55 = (float) Static141.anInt2714 / 65535.0F;
		@Pc(58) float[] local58 = new float[3];
		@Pc(62) int local62 = Static126.anInt2451 * 2;
		@Pc(88) int local88;
		@Pc(121) int local121;
		@Pc(129) int local129;
		@Pc(134) int local134;
		@Pc(142) int local142;
		@Pc(159) int local159;
		for (@Pc(64) int local64 = 0; local64 < 3; local64++) {
			@Pc(76) int local76 = Static85.anIntArrayArrayArray3[Static342.anInt2478][local62][local64] * 3;
			local88 = Static85.anIntArrayArrayArray3[Static342.anInt2478][local62 + 1][local64] * 3;
			local121 = (Static85.anIntArrayArrayArray3[Static342.anInt2478][local62 + 2][local64] + Static85.anIntArrayArrayArray3[Static342.anInt2478][local62 + 2][local64] - Static85.anIntArrayArrayArray3[Static342.anInt2478][local62 + 3][local64]) * 3;
			local129 = Static85.anIntArrayArrayArray3[Static342.anInt2478][local62][local64];
			local134 = local88 - local76;
			local142 = local76 + local121 - local88 * 2;
			local159 = Static85.anIntArrayArrayArray3[Static342.anInt2478][local62 + 2][local64] + local88 - local121 - local129;
			local58[local64] = (float) local129 + ((float) local134 + local55 * ((float) local142 + (float) local159 * local55)) * local55;
		}
		Static4.anInt41 = (int) local58[0] - Static92.anInt1755 * 128;
		Static177.anInt3734 = (int) local58[2] - Static98.anInt1911 * 128;
		Static117.anInt2244 = (int) local58[1] * -1;
		@Pc(213) float[] local213 = new float[3];
		local88 = Static47.anInt1206 * 2;
		for (local121 = 0; local121 < 3; local121++) {
			local129 = Static85.anIntArrayArrayArray3[Static100.anInt1933][local88][local121] * 3;
			local134 = Static85.anIntArrayArrayArray3[Static100.anInt1933][local88 + 1][local121] * 3;
			local142 = (Static85.anIntArrayArrayArray3[Static100.anInt1933][local88 + 2][local121] + Static85.anIntArrayArrayArray3[Static100.anInt1933][local88 + 2][local121] - Static85.anIntArrayArrayArray3[Static100.anInt1933][local88 + 3][local121]) * 3;
			local159 = Static85.anIntArrayArrayArray3[Static100.anInt1933][local88][local121];
			@Pc(287) int local287 = local134 - local129;
			@Pc(296) int local296 = local129 + local142 - local134 * 2;
			@Pc(314) int local314 = local134 + Static85.anIntArrayArrayArray3[Static100.anInt1933][local88 + 2][local121] - local142 - local159;
			local213[local121] = local55 * (local55 * ((float) local314 * local55 + (float) local296) + (float) local287) + (float) local159;
		}
		@Pc(352) float local352 = local213[0] - local58[0];
		@Pc(362) float local362 = -1.0F * (local213[1] - local58[1]);
		@Pc(371) float local371 = local213[2] - local58[2];
		@Pc(381) double local381 = Math.sqrt((double) (local371 * local371 + local352 * local352));
		Static338.anInt6530 = (int) (Math.atan2((double) local362, local381) * 2607.5945876176133D) & 0x3FFF;
		Static296.anInt5982 = (int) (-Math.atan2((double) local352, (double) local371) * 2607.5945876176133D) & 0x3FFF;
		Static290.anInt5827 = Static85.anIntArrayArrayArray3[Static342.anInt2478][local62][3] + ((Static85.anIntArrayArrayArray3[Static342.anInt2478][local62 + 2][3] - Static85.anIntArrayArrayArray3[Static342.anInt2478][local62][3]) * Static141.anInt2714 >> 16);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method5868(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(16) char[] local16 = new char[local13];
		@Pc(18) byte local18 = 2;
		for (@Pc(20) int local20 = 0; local20 < local13; local20++) {
			@Pc(26) char local26 = arg0.charAt(local20);
			if (local18 == 0) {
				local26 = Character.toLowerCase(local26);
			} else if (local18 == 2 || Character.isUpperCase(local26)) {
				local26 = Static27.method3643(local26);
			}
			if (Character.isLetter(local26)) {
				local18 = 0;
			} else if (local26 == '.' || local26 == '?' || local26 == '!') {
				local18 = 2;
			} else if (!Character.isSpaceChar(local26)) {
				local18 = 1;
			} else if (local18 != 2) {
				local18 = 1;
			}
			local16[local20] = local26;
		}
		return new String(local16);
	}
}

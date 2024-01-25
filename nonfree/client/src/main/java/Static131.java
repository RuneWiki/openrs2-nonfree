import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!eda", name = "d", descriptor = "[I")
	public static final int[] anIntArray95 = new int[5];

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "([Ljava/lang/Object;ZII[I)V")
	public static void method2369(@OriginalArg(0) Object[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 <= arg1) {
			return;
		}
		@Pc(12) int local12 = (arg1 + arg2) / 2;
		@Pc(14) int local14 = arg1;
		@Pc(18) int local18 = arg3[local12];
		arg3[local12] = arg3[arg2];
		arg3[arg2] = local18;
		@Pc(32) Object local32 = arg0[local12];
		arg0[local12] = arg0[arg2];
		arg0[arg2] = local32;
		@Pc(49) int local49 = local18 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(51) int local51 = arg1; local51 < arg2; local51++) {
			if ((local51 & local49) + local18 > arg3[local51]) {
				@Pc(69) int local69 = arg3[local51];
				arg3[local51] = arg3[local14];
				arg3[local14] = local69;
				@Pc(83) Object local83 = arg0[local51];
				arg0[local51] = arg0[local14];
				arg0[local14++] = local83;
			}
		}
		arg3[arg2] = arg3[local14];
		arg3[local14] = local18;
		arg0[arg2] = arg0[local14];
		arg0[local14] = local32;
		method2369(arg0, arg1, local14 - 1, arg3);
		method2369(arg0, local14 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Ljava/lang/String;Ljava/io/File;B)V")
	public static void method2370(@OriginalArg(0) String arg0, @OriginalArg(1) File arg1) {
		Static207.aHashtable5.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IIBII[IIIIIIIZ[ILclient!eo;)I")
	public static int method2371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) boolean arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) Class106 arg13) {
		for (@Pc(5) int local5 = 0; local5 < 128; local5++) {
			for (@Pc(8) int local8 = 0; local8 < 128; local8++) {
				Static587.anIntArrayArray55[local5][local8] = 0;
				Static572.anIntArrayArray51[local5][local8] = 99999999;
			}
		}
		@Pc(47) boolean local47;
		if (arg10 == 1) {
			local47 = Static494.method7077(arg9, arg7, arg1, arg13, arg0, arg3, arg2, arg6, arg5, arg8);
		} else if (arg10 == 2) {
			local47 = Static302.method4804(arg9, arg5, arg0, arg13, arg2, arg8, arg1, arg6, arg3, arg7);
		} else {
			local47 = Static475.method6805(arg10, arg8, arg6, arg5, arg0, arg9, arg3, arg2, arg7, arg1, arg13);
		}
		@Pc(85) int local85 = arg0 - 64;
		@Pc(89) int local89 = arg5 - 64;
		@Pc(91) int local91 = Static150.anInt3076;
		@Pc(93) int local93 = Static192.anInt3707;
		@Pc(101) int local101;
		@Pc(103) int local103;
		@Pc(110) int local110;
		if (!local47) {
			if (!arg11) {
				return -1;
			}
			local101 = Integer.MAX_VALUE;
			local103 = Integer.MAX_VALUE;
			for (local110 = arg6 - 10; local110 <= arg6 + 10; local110++) {
				for (@Pc(116) int local116 = arg9 - 10; local116 <= arg9 + 10; local116++) {
					@Pc(122) int local122 = local110 - local85;
					@Pc(127) int local127 = local116 - local89;
					if (local122 >= 0 && local127 >= 0 && local122 < 128 && local127 < 128 && Static572.anIntArrayArray51[local122][local127] < 100) {
						@Pc(146) int local146 = 0;
						if (arg6 > local110) {
							local146 = arg6 - local110;
						} else if (arg8 + arg6 - 1 < local110) {
							local146 = local110 + 1 - arg8 - arg6;
						}
						@Pc(176) int local176 = 0;
						if (local116 < arg9) {
							local176 = arg9 - local116;
						} else if (local116 > arg7 + arg9 - 1) {
							local176 = local116 + 1 - arg9 - arg7;
						}
						@Pc(212) int local212 = local146 * local146 + local176 * local176;
						if (local212 < local101 || local101 == local212 && local103 > Static572.anIntArrayArray51[local122][local127]) {
							local91 = local110;
							local93 = local116;
							local101 = local212;
							local103 = Static572.anIntArrayArray51[local122][local127];
						}
					}
				}
			}
			if (local101 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (arg0 == local91 && local93 == arg5) {
			return 0;
		}
		@Pc(281) byte local281 = 0;
		Static267.anIntArray284[0] = local91;
		local101 = local281 + 1;
		Static334.anIntArray356[0] = local93;
		@Pc(307) int local307;
		local103 = local307 = Static587.anIntArrayArray55[local91 - local85][local93 - local89];
		while (local91 != arg0 || local93 != arg5) {
			if (local103 != local307) {
				local307 = local103;
				Static267.anIntArray284[local101] = local91;
				Static334.anIntArray356[local101++] = local93;
			}
			if ((local103 & 0x1) != 0) {
				local93++;
			} else if ((local103 & 0x4) != 0) {
				local93--;
			}
			if ((local103 & 0x2) != 0) {
				local91++;
			} else if ((local103 & 0x8) != 0) {
				local91--;
			}
			local103 = Static587.anIntArrayArray55[local91 - local85][local93 - local89];
		}
		local110 = 0;
		while (local101-- > 0) {
			arg4[local110] = Static267.anIntArray284[local101];
			arg12[local110++] = Static334.anIntArray356[local101];
			if (arg4.length <= local110) {
				break;
			}
		}
		return local110;
	}
}

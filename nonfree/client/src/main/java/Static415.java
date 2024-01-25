import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray33;

	@OriginalMember(owner = "client!qba", name = "f", descriptor = "I")
	public static int anInt7404;

	@OriginalMember(owner = "client!qba", name = "j", descriptor = "I")
	public static int anInt7406;

	@OriginalMember(owner = "client!qba", name = "i", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_116 = new Class98(81, -2);

	@OriginalMember(owner = "client!qba", name = "m", descriptor = "I")
	public static int anInt7409 = 0;

	@OriginalMember(owner = "client!qba", name = "n", descriptor = "Lclient!su;")
	public static final Class298 aClass298_156 = new Class298();

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IILclient!iaa;Z[IZIIII[IIIII)I")
	public static int method5914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class138 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static318.anIntArrayArray48[local3][local7] = 0;
				Static567.anIntArrayArray82[local3][local7] = 99999999;
			}
		}
		@Pc(55) boolean local55;
		if (arg12 == 1) {
			local55 = Static351.method5316(arg2, arg1, arg11, arg8, arg6, arg10, arg5, arg0, arg13, arg7);
		} else if (arg12 == 2) {
			local55 = Static164.method2624(arg7, arg0, arg1, arg13, arg8, arg6, arg5, arg10, arg2, arg11);
		} else {
			local55 = Static291.method4404(arg5, arg0, arg10, arg11, arg8, arg13, arg12, arg7, arg1, arg2, arg6);
		}
		@Pc(93) int local93 = arg10 - 64;
		@Pc(97) int local97 = arg7 - 64;
		@Pc(99) int local99 = Static447.anInt7902;
		@Pc(101) int local101 = Static410.anInt7383;
		@Pc(107) int local107;
		@Pc(109) int local109;
		@Pc(116) int local116;
		if (!local55) {
			if (!arg3) {
				return -1;
			}
			local107 = Integer.MAX_VALUE;
			local109 = Integer.MAX_VALUE;
			for (local116 = arg5 - 10; local116 <= arg5 + 10; local116++) {
				for (@Pc(123) int local123 = arg1 - 10; local123 <= arg1 + 10; local123++) {
					@Pc(130) int local130 = local116 - local93;
					@Pc(135) int local135 = local123 - local97;
					if (local130 >= 0 && local135 >= 0 && local130 < 128 && local135 < 128 && Static567.anIntArrayArray82[local130][local135] < 100) {
						@Pc(159) int local159 = 0;
						if (arg5 > local116) {
							local159 = arg5 - local116;
						} else if (local116 > arg5 + arg8 - 1) {
							local159 = local116 + 1 - arg8 - arg5;
						}
						@Pc(188) int local188 = 0;
						if (arg1 > local123) {
							local188 = arg1 - local123;
						} else if (arg6 + arg1 - 1 < local123) {
							local188 = local123 + 1 - arg6 - arg1;
						}
						@Pc(227) int local227 = local159 * local159 + local188 * local188;
						if (local107 > local227 || local107 == local227 && local109 > Static567.anIntArrayArray82[local130][local135]) {
							local107 = local227;
							local101 = local123;
							local99 = local116;
							local109 = Static567.anIntArrayArray82[local130][local135];
						}
					}
				}
			}
			if (local107 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (arg10 == local99 && arg7 == local101) {
			return 0;
		}
		@Pc(293) byte local293 = 0;
		Static191.anIntArray315[0] = local99;
		local107 = local293 + 1;
		Static313.anIntArray436[0] = local101;
		@Pc(320) int local320;
		local109 = local320 = Static318.anIntArrayArray48[local99 - local93][local101 - local97];
		while (arg10 != local99 || arg7 != local101) {
			if (local109 != local320) {
				Static191.anIntArray315[local107] = local99;
				local320 = local109;
				Static313.anIntArray436[local107++] = local101;
			}
			if ((local109 & 0x1) != 0) {
				local101++;
			} else if ((local109 & 0x4) != 0) {
				local101--;
			}
			if ((local109 & 0x2) != 0) {
				local99++;
			} else if ((local109 & 0x8) != 0) {
				local99--;
			}
			local109 = Static318.anIntArrayArray48[local99 - local93][local101 - local97];
		}
		local116 = 0;
		while (local107-- > 0) {
			arg9[local116] = Static191.anIntArray315[local107];
			arg4[local116++] = Static313.anIntArray436[local107];
			if (arg9.length <= local116) {
				break;
			}
		}
		return local116;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(B)I")
	public static int method5917() {
		return Static50.method6874(false);
	}
}

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!za", name = "q", descriptor = "I")
	public static int anInt7074;

	@OriginalMember(owner = "client!za", name = "r", descriptor = "Lclient!ru;")
	public static Class45 aClass45_4;

	@OriginalMember(owner = "client!za", name = "d", descriptor = "I")
	public static int anInt7063 = 0;

	@OriginalMember(owner = "client!za", name = "j", descriptor = "[Lclient!wh;")
	public static final Class2_Sub5_Sub18[] aClass2_Sub5_Sub18Array7 = new Class2_Sub5_Sub18[14];

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(ILclient!at;)V")
	public static void method5494(@OriginalArg(1) Class16 arg0) {
		if (arg0.anInt298 == 5 && arg0.anInt301 != -1) {
			Static90.method1421(arg0, Static82.aClass163_1);
		}
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(ZLclient!at;)Ljava/lang/String;")
	public static String method5500(@OriginalArg(1) Class16 arg0) {
		if (Static55.method815(arg0).method1538() == 0) {
			return null;
		} else if (arg0.aString15 == null || arg0.aString15.trim().length() == 0) {
			return Static95.aBoolean158 ? "Hidden-use" : null;
		} else {
			return arg0.aString15;
		}
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIZILclient!et;I[IIIIIIII[I)I")
	public static int method5540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class71 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(14) int[] arg13) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
				Static238.anIntArrayArray28[local7][local11] = 0;
				Static284.anIntArrayArray34[local7][local11] = 99999999;
			}
		}
		@Pc(49) boolean local49;
		if (arg11 == 1) {
			local49 = Static127.method1897(arg5, arg4, arg9, arg10, arg12, arg0, arg8, arg1, arg3, arg7);
		} else if (arg11 == 2) {
			local49 = Static211.method2821(arg4, arg10, arg3, arg0, arg12, arg8, arg1, arg7, arg9, arg5);
		} else {
			local49 = Static349.method4647(arg0, arg3, arg10, arg8, arg12, arg1, arg11, arg7, arg9, arg4, arg5);
		}
		@Pc(89) int local89 = arg3 - 64;
		@Pc(93) int local93 = arg0 - 64;
		@Pc(95) int local95 = Static343.anInt5848;
		@Pc(97) int local97 = Static245.anInt3937;
		@Pc(103) int local103;
		@Pc(105) int local105;
		@Pc(112) int local112;
		if (!local49) {
			if (!arg2) {
				return -1;
			}
			local103 = Integer.MAX_VALUE;
			local105 = Integer.MAX_VALUE;
			for (local112 = arg8 - 10; local112 <= arg8 + 10; local112++) {
				for (@Pc(119) int local119 = arg1 - 10; local119 <= arg1 + 10; local119++) {
					@Pc(126) int local126 = local112 - local89;
					@Pc(131) int local131 = local119 - local93;
					if (local126 >= 0 && local131 >= 0 && local126 < 128 && local131 < 128 && Static284.anIntArrayArray34[local126][local131] < 100) {
						@Pc(159) int local159 = 0;
						if (arg8 > local112) {
							local159 = arg8 - local112;
						} else if (arg8 + arg7 - 1 < local112) {
							local159 = local112 + 1 - arg7 - arg8;
						}
						@Pc(196) int local196 = 0;
						if (local119 < arg1) {
							local196 = arg1 - local119;
						} else if (local119 > arg12 + arg1 - 1) {
							local196 = local119 + 1 - arg1 - arg12;
						}
						@Pc(235) int local235 = local159 * local159 + local196 * local196;
						if (local103 > local235 || local235 == local103 && local105 > Static284.anIntArrayArray34[local126][local131]) {
							local103 = local235;
							local97 = local119;
							local105 = Static284.anIntArrayArray34[local126][local131];
							local95 = local112;
						}
					}
				}
			}
			if (local103 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (local95 == arg3 && local97 == arg0) {
			return 0;
		}
		@Pc(297) byte local297 = 0;
		Static350.anIntArray518[0] = local95;
		local103 = local297 + 1;
		Static18.anIntArray300[0] = local97;
		@Pc(318) int local318;
		local105 = local318 = Static238.anIntArrayArray28[local95 - local89][local97 - local93];
		while (arg3 != local95 || local97 != arg0) {
			if (local105 != local318) {
				Static350.anIntArray518[local103] = local95;
				local318 = local105;
				Static18.anIntArray300[local103++] = local97;
			}
			if ((local105 & 0x1) != 0) {
				local97++;
			} else if ((local105 & 0x4) != 0) {
				local97--;
			}
			if ((local105 & 0x2) != 0) {
				local95++;
			} else if ((local105 & 0x8) != 0) {
				local95--;
			}
			local105 = Static238.anIntArrayArray28[local95 - local89][local97 - local93];
		}
		local112 = 0;
		while (local103-- > 0) {
			arg13[local112] = Static350.anIntArray518[local103];
			arg6[local112++] = Static18.anIntArray300[local103];
			if (local112 >= arg13.length) {
				break;
			}
		}
		return local112;
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IILjava/awt/Canvas;Lclient!l;Lclient!or;B)Lclient!za;")
	public static synchronized Class163 method5567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) Interface9 arg3, @OriginalArg(4) Class183 arg4) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
			if (!Static335.aBooleanArray24[local9]) {
				local7 = local9;
				break;
			}
		}
		if (local7 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(61) Class163 local61;
		if (arg0 == 0) {
			local61 = Static358.method5689(arg3, local7, arg2);
		} else if (arg0 == 1) {
			local61 = Static446.method5628(arg4, arg3, local7, arg2, arg1);
		} else if (arg0 == 2) {
			local61 = Static143.method2110(local7, arg4, arg2, arg3);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static335.aBooleanArray24[local7] = true;
		return local61;
	}
}

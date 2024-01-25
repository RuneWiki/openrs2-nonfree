import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
	public static int anInt3845;

	@OriginalMember(owner = "client!gr", name = "i", descriptor = "[I")
	public static int[] anIntArray376;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIIB[ILclient!vi;[IZIIIIII)I")
	public static int method3200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) Class306 arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static474.anIntArrayArray80[local3][local7] = 0;
				Static290.anIntArrayArray56[local3][local7] = 99999999;
			}
		}
		@Pc(52) boolean local52;
		if (arg3 == 1) {
			local52 = Static360.method5634(arg13, arg12, arg1, arg10, arg8, arg9, arg5, arg11, arg2, arg0);
		} else if (arg3 == 2) {
			local52 = Static246.method4257(arg2, arg9, arg1, arg13, arg5, arg12, arg8, arg11, arg10, arg0);
		} else {
			local52 = Static197.method3740(arg13, arg1, arg2, arg9, arg5, arg10, arg3, arg12, arg11, arg0, arg8);
		}
		@Pc(87) int local87 = arg11 - 64;
		@Pc(99) int local99 = arg1 - 64;
		@Pc(101) int local101 = Static335.anInt3038;
		@Pc(103) int local103 = Static23.anInt6895;
		@Pc(109) int local109;
		@Pc(111) int local111;
		@Pc(118) int local118;
		if (!local52) {
			if (!arg7) {
				return -1;
			}
			local109 = Integer.MAX_VALUE;
			local111 = Integer.MAX_VALUE;
			for (local118 = arg13 - 10; local118 <= arg13 + 10; local118++) {
				for (@Pc(125) int local125 = arg12 - 10; local125 <= arg12 + 10; local125++) {
					@Pc(131) int local131 = local118 - local87;
					@Pc(136) int local136 = local125 - local99;
					if (local131 >= 0 && local136 >= 0 && local131 < 128 && local136 < 128 && Static290.anIntArrayArray56[local131][local136] < 100) {
						@Pc(162) int local162 = 0;
						if (arg13 > local118) {
							local162 = arg13 - local118;
						} else if (arg13 + arg8 - 1 < local118) {
							local162 = local118 + 1 - arg8 - arg13;
						}
						@Pc(195) int local195 = 0;
						if (arg12 > local125) {
							local195 = arg12 - local125;
						} else if (arg12 + arg2 - 1 < local125) {
							local195 = local125 + 1 - arg2 - arg12;
						}
						@Pc(232) int local232 = local195 * local195 + local162 * local162;
						if (local109 > local232 || local232 == local109 && Static290.anIntArrayArray56[local131][local136] < local111) {
							local103 = local125;
							local101 = local118;
							local111 = Static290.anIntArrayArray56[local131][local136];
							local109 = local232;
						}
					}
				}
			}
			if (~local109 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg11 == local101 && local103 == arg1) {
			return 0;
		}
		@Pc(304) byte local304 = 0;
		Static135.anIntArray273[0] = local101;
		local109 = local304 + 1;
		Static142.anIntArray282[0] = local103;
		@Pc(326) int local326;
		local111 = local326 = Static474.anIntArrayArray80[local101 - local87][local103 - local99];
		while (local101 != arg11 || local103 != arg1) {
			if (local111 != local326) {
				local326 = local111;
				Static135.anIntArray273[local109] = local101;
				Static142.anIntArray282[local109++] = local103;
			}
			if ((local111 & 0x2) != 0) {
				local101++;
			} else if ((local111 & 0x8) != 0) {
				local101--;
			}
			if ((local111 & 0x1) != 0) {
				local103++;
			} else if ((local111 & 0x4) != 0) {
				local103--;
			}
			local111 = Static474.anIntArrayArray80[local101 - local87][local103 - local99];
		}
		local118 = 0;
		while (local109-- > 0) {
			arg6[local118] = Static135.anIntArray273[local109];
			arg4[local118++] = Static142.anIntArray282[local109];
			if (local118 >= arg6.length) {
				break;
			}
		}
		return local118;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!kea;ILclient!kea;)I")
	public static int method3201(@OriginalArg(0) Class161 arg0, @OriginalArg(2) Class161 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method4268(Static368.anInt6881)) {
			local5++;
		}
		if (arg0.method4268(Static200.anInt9269)) {
			local5++;
		}
		if (arg0.method4268(Static335.anInt3041)) {
			local5++;
		}
		if (arg1.method4268(Static368.anInt6881)) {
			local5++;
		}
		if (arg1.method4268(Static200.anInt9269)) {
			local5++;
		}
		if (arg1.method4268(Static335.anInt3041)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZLjava/lang/String;I)Z")
	public static boolean method3203(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (Static401.aClass285_11.aBoolean625) {
			Static81.aClass319_5 = new Class319();
			Static81.aClass319_5.anInt9320 = arg1;
			Static81.aClass319_5.aString85 = arg0;
			if (Static464.aClass253_15 != Static327.aClass253_10) {
				Static81.aClass319_5.anInt9315 = Static81.aClass319_5.anInt9320 + 40000;
				Static81.aClass319_5.anInt9319 = Static81.aClass319_5.anInt9320 + 50000;
			}
			if (arg1 < Static527.aClass68_Sub1Array2.length && Static527.aClass68_Sub1Array2[arg1] != null) {
				Static407.anInt7464 = Static527.aClass68_Sub1Array2[arg1].anInt2091;
			}
			return true;
		}
		@Pc(49) String local49 = "";
		if (Static464.aClass253_15 != Static327.aClass253_10) {
			local49 = ":" + (arg1 + 7000);
		}
		@Pc(64) String local64 = "";
		if (Static281.aString42 != null) {
			local64 = "/p=" + Static281.aString42;
		}
		@Pc(112) String local112 = "http://" + arg0 + local49 + "/l=" + Static193.anInt7803 + "/a=" + Static142.anInt2899 + local64 + "/j" + (Static255.aBoolean353 ? "1" : "0") + ",o" + (Static317.aBoolean393 ? "1" : "0") + ",a2";
		try {
			Static317.aClient1.getAppletContext().showDocument(new URL(local112), "_self");
			return true;
		} catch (@Pc(130) Exception local130) {
			return false;
		}
	}
}

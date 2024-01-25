import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!iga", name = "h", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_93 = new Class151(1, 0);

	@OriginalMember(owner = "client!iga", name = "d", descriptor = "I")
	public static int anInt4101 = 0;

	@OriginalMember(owner = "client!iga", name = "i", descriptor = "[I")
	public static final int[] anIntArray299 = new int[13];

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(CI)Z")
	public static boolean method3665(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static251.method1890(arg0)) {
			return true;
		} else {
			@Pc(20) char[] local20 = Static277.aCharArray3;
			for (@Pc(22) int local22 = 0; local22 < local20.length; local22++) {
				@Pc(28) char local28 = local20[local22];
				if (arg0 == local28) {
					return true;
				}
			}
			@Pc(49) char[] local49 = Static102.aCharArray9;
			for (@Pc(51) int local51 = 0; local51 < local49.length; local51++) {
				@Pc(57) char local57 = local49[local51];
				if (local57 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(IBI[BIII[BI)V")
	public static void method3667(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg0 >> 2);
		@Pc(15) int local15 = -(arg0 & 0x3);
		for (@Pc(26) int local26 = -arg3; local26 < 0; local26++) {
			@Pc(34) int local34;
			for (@Pc(30) int local30 = local10; local30 < 0; local30++) {
				local34 = arg1++;
				arg6[local34] = (byte) (arg6[local34] - arg2[arg5++]);
				@Pc(47) int local47 = arg1++;
				arg6[local47] = (byte) (arg6[local47] - arg2[arg5++]);
				@Pc(60) int local60 = arg1++;
				arg6[local60] = (byte) (arg6[local60] - arg2[arg5++]);
				@Pc(73) int local73 = arg1++;
				arg6[local73] = (byte) (arg6[local73] - arg2[arg5++]);
			}
			for (@Pc(92) int local92 = local15; local92 < 0; local92++) {
				local34 = arg1++;
				arg6[local34] = (byte) (arg6[local34] - arg2[arg5++]);
			}
			arg5 += arg7;
			arg1 += arg4;
		}
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(ILclient!wj;IZZIIII[IIIII[I)I")
	public static int method3668(@OriginalArg(0) int arg0, @OriginalArg(1) Class389 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int[] arg13) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
				Static410.anIntArrayArray38[local7][local11] = 0;
				Static32.anIntArrayArray2[local7][local11] = 99999999;
			}
		}
		@Pc(57) boolean local57;
		if (arg11 == 1) {
			local57 = Static417.method5289(arg1, arg0, arg9, arg6, arg2, arg7, arg12, arg10, arg5, arg4);
		} else if (arg11 == 2) {
			local57 = Static72.method1547(arg4, arg2, arg1, arg0, arg12, arg5, arg10, arg9, arg6, arg7);
		} else {
			local57 = Static634.method8464(arg12, arg10, arg11, arg5, arg2, arg1, arg7, arg0, arg6, arg4, arg9);
		}
		@Pc(91) int local91 = arg5 - 64;
		@Pc(115) int local115 = arg4 - 64;
		@Pc(117) int local117 = Static54.anInt1253;
		@Pc(119) int local119 = Static437.anInt10168;
		@Pc(127) int local127;
		@Pc(129) int local129;
		@Pc(135) int local135;
		if (!local57) {
			if (!arg3) {
				return -1;
			}
			local127 = Integer.MAX_VALUE;
			local129 = Integer.MAX_VALUE;
			for (local135 = arg9 - 10; local135 <= arg9 + 10; local135++) {
				for (@Pc(142) int local142 = arg0 - 10; local142 <= arg0 + 10; local142++) {
					@Pc(149) int local149 = local135 - local91;
					@Pc(154) int local154 = local142 - local115;
					if (local149 >= 0 && local154 >= 0 && local149 < 128 && local154 < 128 && Static32.anIntArrayArray2[local149][local154] < 100) {
						@Pc(180) int local180 = 0;
						if (arg9 > local135) {
							local180 = arg9 - local135;
						} else if (local135 > arg12 + arg9 - 1) {
							local180 = local135 + 1 - arg12 - arg9;
						}
						@Pc(212) int local212 = 0;
						if (local142 < arg0) {
							local212 = arg0 - local142;
						} else if (local142 > arg10 + arg0 - 1) {
							local212 = local142 + 1 - arg0 - arg10;
						}
						@Pc(252) int local252 = local180 * local180 + local212 * local212;
						if (local127 > local252 || local252 == local127 && local129 > Static32.anIntArrayArray2[local149][local154]) {
							local117 = local135;
							local129 = Static32.anIntArrayArray2[local149][local154];
							local127 = local252;
							local119 = local142;
						}
					}
				}
			}
			if (~local127 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg5 == local117 && arg4 == local119) {
			return 0;
		}
		@Pc(322) byte local322 = 0;
		Static219.anIntArray249[0] = local117;
		local127 = local322 + 1;
		Static555.anIntArray598[0] = local119;
		@Pc(343) int local343;
		local129 = local343 = Static410.anIntArrayArray38[local117 - local91][local119 - local115];
		while (local117 != arg5 || local119 != arg4) {
			if (local343 != local129) {
				local343 = local129;
				Static219.anIntArray249[local127] = local117;
				Static555.anIntArray598[local127++] = local119;
			}
			if ((local129 & 0x2) != 0) {
				local117++;
			} else if ((local129 & 0x8) != 0) {
				local117--;
			}
			if ((local129 & 0x1) != 0) {
				local119++;
			} else if ((local129 & 0x4) != 0) {
				local119--;
			}
			local129 = Static410.anIntArrayArray38[local117 - local91][local119 - local115];
		}
		local135 = 0;
		while (local127-- > 0) {
			arg13[local135] = Static219.anIntArray249[local127];
			arg8[local135++] = Static555.anIntArray598[local127];
			if (local135 >= arg13.length) {
				break;
			}
		}
		return local135;
	}
}

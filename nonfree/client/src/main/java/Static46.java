import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
	public static int anInt737;

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "F")
	public static float aFloat22;

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "Lclient!tv;")
	public static Class241 aClass241_2;

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_15 = new Class2(31, -1);

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "[I")
	public static final int[] anIntArray68 = new int[1000];

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "S")
	public static short aShort12 = 32767;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II[III[IIZIILclient!ep;IIII)I")
	public static int method607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class70 arg10, @OriginalArg(11) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
				Static444.anIntArrayArray62[local7][local11] = 0;
				Static430.anIntArrayArray61[local7][local11] = 99999999;
			}
		}
		@Pc(64) boolean local64;
		if (arg0 == 1) {
			local64 = Static73.method1200(arg3, arg4, arg12, arg8, arg6, arg9, arg13, arg11, arg10, arg1);
		} else if (arg0 == 2) {
			local64 = Static263.method3556(arg12, arg4, arg10, arg3, arg11, arg6, arg9, arg8, arg1, arg13);
		} else {
			local64 = Static258.method3437(arg12, arg4, arg3, arg13, arg9, arg10, arg0, arg8, arg11, arg1, arg6);
		}
		@Pc(98) int local98 = arg1 - 64;
		@Pc(102) int local102 = arg11 - 64;
		@Pc(104) int local104 = Static448.anInt7376;
		@Pc(106) int local106 = Static416.anInt6617;
		@Pc(112) int local112;
		@Pc(114) int local114;
		@Pc(120) int local120;
		if (!local64) {
			if (!arg7) {
				return -1;
			}
			local112 = Integer.MAX_VALUE;
			local114 = Integer.MAX_VALUE;
			for (local120 = arg13 - 10; local120 <= arg13 + 10; local120++) {
				for (@Pc(127) int local127 = arg4 - 10; local127 <= arg4 + 10; local127++) {
					@Pc(134) int local134 = local120 - local98;
					@Pc(139) int local139 = local127 - local102;
					if (local134 >= 0 && local139 >= 0 && local134 < 128 && local139 < 128 && Static430.anIntArrayArray61[local134][local139] < 100) {
						@Pc(163) int local163 = 0;
						if (arg13 > local120) {
							local163 = arg13 - local120;
						} else if (arg13 + arg9 - 1 < local120) {
							local163 = local120 + 1 - arg13 - arg9;
						}
						@Pc(193) int local193 = 0;
						if (arg4 > local127) {
							local193 = arg4 - local127;
						} else if (local127 > arg4 + arg8 - 1) {
							local193 = local127 + 1 - arg4 - arg8;
						}
						@Pc(233) int local233 = local163 * local163 + local193 * local193;
						if (local112 > local233 || local112 == local233 && local114 > Static430.anIntArrayArray61[local134][local139]) {
							local112 = local233;
							local114 = Static430.anIntArrayArray61[local134][local139];
							local104 = local120;
							local106 = local127;
						}
					}
				}
			}
			if (~local112 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg1 == local104 && local106 == arg11) {
			return 0;
		}
		@Pc(298) byte local298 = 0;
		Static345.anIntArray498[0] = local104;
		local112 = local298 + 1;
		Static276.anIntArray422[0] = local106;
		@Pc(320) int local320;
		local114 = local320 = Static444.anIntArrayArray62[local104 - local98][local106 - local102];
		while (local104 != arg1 || arg11 != local106) {
			if (local320 != local114) {
				local320 = local114;
				Static345.anIntArray498[local112] = local104;
				Static276.anIntArray422[local112++] = local106;
			}
			if ((local114 & 0x2) != 0) {
				local104++;
			} else if ((local114 & 0x8) != 0) {
				local104--;
			}
			if ((local114 & 0x1) != 0) {
				local106++;
			} else if ((local114 & 0x4) != 0) {
				local106--;
			}
			local114 = Static444.anIntArrayArray62[local104 - local98][local106 - local102];
		}
		local120 = 0;
		while (local112-- > 0) {
			arg5[local120] = Static345.anIntArray498[local112];
			arg2[local120++] = Static276.anIntArray422[local112];
			if (local120 >= arg5.length) {
				break;
			}
		}
		return local120;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static568 {

	@OriginalMember(owner = "client!ue", name = "w", descriptor = "I")
	public static int anInt2489;

	@OriginalMember(owner = "client!ue", name = "M", descriptor = "Z")
	private static boolean aBoolean198;

	@OriginalMember(owner = "client!ue", name = "N", descriptor = "Z")
	private static boolean aBoolean199;

	@OriginalMember(owner = "client!ue", name = "O", descriptor = "I")
	private static int anInt2504;

	@OriginalMember(owner = "client!ue", name = "P", descriptor = "Z")
	private static boolean aBoolean200;

	@OriginalMember(owner = "client!ue", name = "Q", descriptor = "I")
	private static int anInt2505;

	@OriginalMember(owner = "client!ue", name = "R", descriptor = "I")
	private static int anInt2506;

	@OriginalMember(owner = "client!ue", name = "S", descriptor = "I")
	private static int anInt2507;

	@OriginalMember(owner = "client!ue", name = "T", descriptor = "Z")
	private static boolean aBoolean201;

	@OriginalMember(owner = "client!ue", name = "U", descriptor = "I")
	private static int anInt2508;

	@OriginalMember(owner = "client!ue", name = "V", descriptor = "I")
	private static int anInt2509;

	@OriginalMember(owner = "client!ue", name = "W", descriptor = "I")
	private static int anInt2510;

	@OriginalMember(owner = "client!ue", name = "X", descriptor = "Z")
	private static boolean aBoolean202;

	@OriginalMember(owner = "client!ue", name = "Y", descriptor = "Z")
	private static boolean aBoolean203;

	@OriginalMember(owner = "client!ue", name = "Z", descriptor = "I")
	private static int anInt2511;

	@OriginalMember(owner = "client!ue", name = "ab", descriptor = "I")
	private static int anInt2512;

	@OriginalMember(owner = "client!ue", name = "bb", descriptor = "I")
	private static int anInt2513;

	@OriginalMember(owner = "client!ue", name = "cb", descriptor = "I")
	private static int anInt2514;

	@OriginalMember(owner = "client!ue", name = "db", descriptor = "I")
	private static int anInt2515;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBI)I")
	public static int method2116(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(27) int local27 = 0;
		while (arg0 > 0) {
			local27 = local27 << 1 | arg1 & 0x1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local27;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!pfa;I[IIIIII[IZIIIII)I")
	public static int method2131(@OriginalArg(0) Class258 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
				Static131.anIntArrayArray7[local7][local11] = 0;
				Static577.anIntArrayArray30[local7][local11] = 99999999;
			}
		}
		@Pc(56) boolean local56;
		if (arg1 == 1) {
			local56 = Static626.method8557(arg11, arg6, arg12, arg3, arg10, arg0, arg5, arg4, arg13, arg7);
		} else if (arg1 == 2) {
			local56 = Static326.method5440(arg0, arg6, arg13, arg3, arg11, arg4, arg12, arg5, arg10, arg7);
		} else {
			local56 = Static184.method3439(arg1, arg6, arg12, arg4, arg7, arg11, arg3, arg13, arg10, arg5, arg0);
		}
		@Pc(91) int local91 = arg12 - 64;
		@Pc(95) int local95 = arg7 - 64;
		@Pc(102) int local102 = Static365.anInt7041;
		@Pc(104) int local104 = Static47.anInt1658;
		@Pc(110) int local110;
		@Pc(112) int local112;
		@Pc(119) int local119;
		if (!local56) {
			if (!arg9) {
				return -1;
			}
			local110 = Integer.MAX_VALUE;
			local112 = Integer.MAX_VALUE;
			for (local119 = arg10 - 10; local119 <= arg10 + 10; local119++) {
				for (@Pc(126) int local126 = arg5 - 10; local126 <= arg5 + 10; local126++) {
					@Pc(132) int local132 = local119 - local91;
					@Pc(136) int local136 = local126 - local95;
					if (local132 >= 0 && local136 >= 0 && local132 < 128 && local136 < 128 && Static577.anIntArrayArray30[local132][local136] < 100) {
						@Pc(158) int local158 = 0;
						if (arg10 > local119) {
							local158 = arg10 - local119;
						} else if (arg10 + arg13 - 1 < local119) {
							local158 = local119 + 1 - arg13 - arg10;
						}
						@Pc(187) int local187 = 0;
						if (arg5 > local126) {
							local187 = arg5 - local126;
						} else if (local126 > arg6 + arg5 - 1) {
							local187 = local126 + 1 - arg6 - arg5;
						}
						@Pc(226) int local226 = local158 * local158 + local187 * local187;
						if (local110 > local226 || local110 == local226 && Static577.anIntArrayArray30[local132][local136] < local112) {
							local104 = local126;
							local102 = local119;
							local110 = local226;
							local112 = Static577.anIntArrayArray30[local132][local136];
						}
					}
				}
			}
			if (local110 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (arg12 == local102 && local104 == arg7) {
			return 0;
		}
		@Pc(296) byte local296 = 0;
		Static611.anIntArray552[0] = local102;
		local110 = local296 + 1;
		Static140.anIntArray125[0] = local104;
		@Pc(318) int local318;
		local112 = local318 = Static131.anIntArrayArray7[local102 - local91][local104 - local95];
		while (arg12 != local102 || local104 != arg7) {
			if (local318 != local112) {
				local318 = local112;
				Static611.anIntArray552[local110] = local102;
				Static140.anIntArray125[local110++] = local104;
			}
			if ((local112 & 0x2) != 0) {
				local102++;
			} else if ((local112 & 0x8) != 0) {
				local102--;
			}
			if ((local112 & 0x1) != 0) {
				local104++;
			} else if ((local112 & 0x4) != 0) {
				local104--;
			}
			local112 = Static131.anIntArrayArray7[local102 - local91][local104 - local95];
		}
		local119 = 0;
		while (local110-- > 0) {
			arg2[local119] = Static611.anIntArray552[local110];
			arg8[local119++] = Static140.anIntArray125[local110];
			if (arg2.length <= local119) {
				break;
			}
		}
		return local119;
	}
}

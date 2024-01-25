import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
	public static int anInt5325;

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
	public static int anInt5326;

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "[Z")
	public static final boolean[] aBooleanArray24 = new boolean[100];

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "Lclient!hq;")
	public static final Class87 aClass87_46 = new Class87(64);

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "Z")
	public static boolean aBoolean514 = false;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIZILclient!g;III)Z")
	public static boolean method4634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class71 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg1;
		@Pc(9) int local9 = arg8;
		@Pc(23) int local23 = arg1 - 64;
		@Pc(27) int local27 = arg8 - 64;
		Static252.anIntArrayArray55[64][64] = 99;
		Static109.anIntArrayArray27[64][64] = 0;
		@Pc(41) byte local41 = 0;
		Static45.anIntArray113[0] = arg1;
		@Pc(47) int local47 = 0;
		@Pc(50) int local50 = local41 + 1;
		Static57.anIntArray162[0] = arg8;
		@Pc(55) int[][] local55 = arg6.anIntArrayArray24;
		while (local50 != local47) {
			local7 = Static45.anIntArray113[local47];
			local9 = Static57.anIntArray162[local47];
			@Pc(70) int local70 = local7 - local23;
			local47 = local47 + 1 & 0xFFF;
			@Pc(81) int local81 = local9 - local27;
			@Pc(87) int local87 = local7 - arg6.anInt2230;
			@Pc(93) int local93 = local9 - arg6.anInt2240;
			if (arg4 == -4) {
				if (arg2 == local7 && arg3 == local9) {
					Static129.anInt2839 = local9;
					Static228.anInt4746 = local7;
					return true;
				}
			} else if (arg4 == -3) {
				if (Static77.method1749(arg2, local7, 2, arg9, arg7, arg3, local9, 2)) {
					Static228.anInt4746 = local7;
					Static129.anInt2839 = local9;
					return true;
				}
			} else if (arg4 == -2) {
				if (arg6.method1932(arg3, arg2, local7, arg7, 2, arg9, 2, arg0, local9)) {
					Static129.anInt2839 = local9;
					Static228.anInt4746 = local7;
					return true;
				}
			} else if (arg4 == -1) {
				if (arg6.method1944(local9, arg0, 2, arg2, arg9, arg3, local7, arg7)) {
					Static129.anInt2839 = local9;
					Static228.anInt4746 = local7;
					return true;
				}
			} else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
				if (arg6.method1947(arg2, arg4, local9, arg3, 2, arg5, local7)) {
					Static129.anInt2839 = local9;
					Static228.anInt4746 = local7;
					return true;
				}
			} else if (arg6.method1935(arg2, local9, arg4, arg5, 2, local7, arg3)) {
				Static129.anInt2839 = local9;
				Static228.anInt4746 = local7;
				return true;
			}
			@Pc(244) int local244 = Static109.anIntArrayArray27[local70][local81] + 1;
			if (local70 > 0 && Static252.anIntArrayArray55[local70 - 1][local81] == 0 && (local55[local87 - 1][local93] & 0x43A40000) == 0 && (local55[local87 - 1][local93 + 1] & 0x4E240000) == 0) {
				Static45.anIntArray113[local50] = local7 - 1;
				Static57.anIntArray162[local50] = local9;
				local50 = local50 + 1 & 0xFFF;
				Static252.anIntArrayArray55[local70 - 1][local81] = 2;
				Static109.anIntArrayArray27[local70 - 1][local81] = local244;
			}
			if (local70 < 126 && Static252.anIntArrayArray55[local70 + 1][local81] == 0 && (local55[local87 + 2][local93] & 0x60E40000) == 0 && (local55[local87 + 2][local93 + 1] & 0x78240000) == 0) {
				Static45.anIntArray113[local50] = local7 + 1;
				Static57.anIntArray162[local50] = local9;
				Static252.anIntArrayArray55[local70 + 1][local81] = 8;
				local50 = local50 + 1 & 0xFFF;
				Static109.anIntArrayArray27[local70 + 1][local81] = local244;
			}
			if (local81 > 0 && Static252.anIntArrayArray55[local70][local81 - 1] == 0 && (local55[local87][local93 - 1] & 0x43A40000) == 0 && (local55[local87 + 1][local93 - 1] & 0x60E40000) == 0) {
				Static45.anIntArray113[local50] = local7;
				Static57.anIntArray162[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static252.anIntArrayArray55[local70][local81 - 1] = 1;
				Static109.anIntArrayArray27[local70][local81 - 1] = local244;
			}
			if (local81 < 126 && Static252.anIntArrayArray55[local70][local81 + 1] == 0 && (local55[local87][local93 + 2] & 0x4E240000) == 0 && (local55[local87 + 1][local93 + 2] & 0x78240000) == 0) {
				Static45.anIntArray113[local50] = local7;
				Static57.anIntArray162[local50] = local9 + 1;
				Static252.anIntArrayArray55[local70][local81 + 1] = 4;
				local50 = local50 + 1 & 0xFFF;
				Static109.anIntArrayArray27[local70][local81 + 1] = local244;
			}
			if (local70 > 0 && local81 > 0 && Static252.anIntArrayArray55[local70 - 1][local81 - 1] == 0 && (local55[local87 - 1][local93] & 0x4FA40000) == 0 && (local55[local87 - 1][local93 - 1] & 0x43A40000) == 0 && (local55[local87][local93 - 1] & 0x63E40000) == 0) {
				Static45.anIntArray113[local50] = local7 - 1;
				Static57.anIntArray162[local50] = local9 - 1;
				Static252.anIntArrayArray55[local70 - 1][local81 - 1] = 3;
				local50 = local50 + 1 & 0xFFF;
				Static109.anIntArrayArray27[local70 - 1][local81 - 1] = local244;
			}
			if (local70 < 126 && local81 > 0 && Static252.anIntArrayArray55[local70 + 1][local81 - 1] == 0 && (local55[local87 + 1][local93 - 1] & 0x63E40000) == 0 && (local55[local87 + 2][local93 - 1] & 0x60E40000) == 0 && (local55[local87 + 2][local93] & 0x78E40000) == 0) {
				Static45.anIntArray113[local50] = local7 + 1;
				Static57.anIntArray162[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static252.anIntArrayArray55[local70 + 1][local81 - 1] = 9;
				Static109.anIntArrayArray27[local70 + 1][local81 - 1] = local244;
			}
			if (local70 > 0 && local81 < 126 && Static252.anIntArrayArray55[local70 - 1][local81 + 1] == 0 && (local55[local87 - 1][local93 + 1] & 0x4FA40000) == 0 && (local55[local87 - 1][local93 + 2] & 0x4E240000) == 0 && (local55[local87][local93 + 2] & 0x7E240000) == 0) {
				Static45.anIntArray113[local50] = local7 - 1;
				Static57.anIntArray162[local50] = local9 + 1;
				Static252.anIntArrayArray55[local70 - 1][local81 + 1] = 6;
				local50 = local50 + 1 & 0xFFF;
				Static109.anIntArrayArray27[local70 - 1][local81 + 1] = local244;
			}
			if (local70 < 126 && local81 < 126 && Static252.anIntArrayArray55[local70 + 1][local81 + 1] == 0 && (local55[local87 + 1][local93 + 2] & 0x7E240000) == 0 && (local55[local87 + 2][local93 + 2] & 0x78240000) == 0 && (local55[local87 + 2][local93 + 1] & 0x78E40000) == 0) {
				Static45.anIntArray113[local50] = local7 + 1;
				Static57.anIntArray162[local50] = local9 + 1;
				Static252.anIntArrayArray55[local70 + 1][local81 + 1] = 12;
				local50 = local50 + 1 & 0xFFF;
				Static109.anIntArrayArray27[local70 + 1][local81 + 1] = local244;
			}
		}
		Static228.anInt4746 = local7;
		Static129.anInt2839 = local9;
		return false;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
	public static void method4635() {
		@Pc(1) Class87 local1 = Static307.aClass87_54;
		synchronized (Static307.aClass87_54) {
			Static307.aClass87_54.method2485();
		}
		local1 = Static306.aClass87_53;
		synchronized (Static306.aClass87_53) {
			Static306.aClass87_53.method2485();
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(JI)V")
	public static void method4639(@OriginalArg(0) long arg0) {
		@Pc(18) int local18 = Static148.anInt3244 + Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5109;
		@Pc(23) int local23 = Static123.anInt2804 + Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5108;
		if (Static107.anInt2547 - local18 < -500 || Static107.anInt2547 - local18 > 500 || Static87.anInt2179 - local23 < -500 || Static87.anInt2179 - local23 > 500) {
			Static87.anInt2179 = local23;
			Static107.anInt2547 = local18;
		}
		@Pc(69) int local69;
		@Pc(77) int local77;
		if (Static107.anInt2547 != local18) {
			local69 = local18 - Static107.anInt2547;
			local77 = (int) (arg0 * (long) local69 / 320L);
			if (local69 > 0) {
				if (local77 == 0) {
					local77 = 1;
				} else if (local77 > local69) {
					local77 = local69;
				}
			} else if (local77 == 0) {
				local77 = -1;
			} else if (local77 < local69) {
				local77 = local69;
			}
			Static107.anInt2547 += local77;
		}
		if (local23 != Static87.anInt2179) {
			local69 = local23 - Static87.anInt2179;
			local77 = (int) ((long) local69 * arg0 / 320L);
			if (local69 > 0) {
				if (local77 == 0) {
					local77 = 1;
				} else if (local77 > local69) {
					local77 = local69;
				}
			} else if (local77 == 0) {
				local77 = -1;
			} else if (local77 < local69) {
				local77 = local69;
			}
			Static87.anInt2179 += local77;
		}
		if (!Static327.aBoolean607) {
			Static36.aFloat5 += (float) arg0 * Static146.aFloat40 / 6.0F;
			Static75.aFloat13 += Static356.aFloat79 * (float) arg0 / 6.0F;
		}
		Static218.method4139();
	}
}

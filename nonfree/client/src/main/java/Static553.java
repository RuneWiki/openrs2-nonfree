import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!tq", name = "W", descriptor = "I")
	public static int anInt9617;

	@OriginalMember(owner = "client!tq", name = "G", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_104 = new Class257(60, 8);

	@OriginalMember(owner = "client!tq", name = "X", descriptor = "I")
	public static int anInt9618 = -1;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)I")
	public static int method7768(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "([IIIIILclient!caa;IIZIII[III)I")
	public static int method7769(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class48 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static342.anIntArrayArray37[local3][local7] = 0;
				Static84.anIntArrayArray5[local3][local7] = 99999999;
			}
		}
		@Pc(56) boolean local56;
		if (arg13 == 1) {
			local56 = Static49.method1404(arg7, arg3, arg9, arg4, arg2, arg10, arg5, arg1, arg12, arg6);
		} else if (arg13 == 2) {
			local56 = Static435.method6733(arg4, arg6, arg7, arg3, arg9, arg5, arg12, arg1, arg10, arg2);
		} else {
			local56 = Static580.method4372(arg2, arg9, arg7, arg5, arg6, arg3, arg13, arg10, arg4, arg1, arg12);
		}
		@Pc(93) int local93 = arg2 - 64;
		@Pc(97) int local97 = arg4 - 64;
		@Pc(99) int local99 = Static249.anInt5513;
		@Pc(101) int local101 = Static277.anInt5778;
		@Pc(107) int local107;
		@Pc(109) int local109;
		@Pc(116) int local116;
		if (!local56) {
			if (!arg8) {
				return -1;
			}
			local107 = Integer.MAX_VALUE;
			local109 = Integer.MAX_VALUE;
			for (local116 = arg3 - 10; local116 <= arg3 + 10; local116++) {
				for (@Pc(123) int local123 = arg1 - 10; local123 <= arg1 + 10; local123++) {
					@Pc(129) int local129 = local116 - local93;
					@Pc(134) int local134 = local123 - local97;
					if (local129 >= 0 && local134 >= 0 && local129 < 128 && local134 < 128 && Static84.anIntArrayArray5[local129][local134] < 100) {
						@Pc(163) int local163 = 0;
						if (arg3 > local116) {
							local163 = arg3 - local116;
						} else if (local116 > arg3 + arg6 - 1) {
							local163 = local116 + 1 - arg3 - arg6;
						}
						@Pc(201) int local201 = 0;
						if (local123 < arg1) {
							local201 = arg1 - local123;
						} else if (arg9 + arg1 - 1 < local123) {
							local201 = local123 + 1 - arg9 - arg1;
						}
						@Pc(243) int local243 = local201 * local201 + local163 * local163;
						if (local107 > local243 || local107 == local243 && Static84.anIntArrayArray5[local129][local134] < local109) {
							local107 = local243;
							local101 = local123;
							local99 = local116;
							local109 = Static84.anIntArrayArray5[local129][local134];
						}
					}
				}
			}
			if (local107 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (local99 == arg2 && local101 == arg4) {
			return 0;
		}
		@Pc(309) byte local309 = 0;
		Static452.anIntArray445[0] = local99;
		local107 = local309 + 1;
		Static579.anIntArray580[0] = local101;
		@Pc(331) int local331;
		local109 = local331 = Static342.anIntArrayArray37[local99 - local93][local101 - local97];
		while (local99 != arg2 || arg4 != local101) {
			if (local331 != local109) {
				local331 = local109;
				Static452.anIntArray445[local107] = local99;
				Static579.anIntArray580[local107++] = local101;
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
			local109 = Static342.anIntArrayArray37[local99 - local93][local101 - local97];
		}
		local116 = 0;
		while (local107-- > 0) {
			arg0[local116] = Static452.anIntArray445[local107];
			arg11[local116++] = Static579.anIntArray580[local107];
			if (local116 >= arg0.length) {
				break;
			}
		}
		return local116;
	}

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "(B)V")
	public static void method7770() {
		if (Static175.aString47.toLowerCase().indexOf("microsoft") != -1) {
			Static81.anIntArray100[219] = 42;
			Static81.anIntArray100[189] = 26;
			Static81.anIntArray100[223] = 28;
			Static81.anIntArray100[186] = 57;
			Static81.anIntArray100[222] = 59;
			Static81.anIntArray100[221] = 43;
			Static81.anIntArray100[192] = 58;
			Static81.anIntArray100[188] = 71;
			Static81.anIntArray100[190] = 72;
			Static81.anIntArray100[191] = 73;
			Static81.anIntArray100[220] = 74;
			Static81.anIntArray100[187] = 27;
			return;
		}
		if (Static175.aMethod1 == null) {
			Static81.anIntArray100[192] = 58;
			Static81.anIntArray100[222] = 59;
		} else {
			Static81.anIntArray100[222] = 58;
			Static81.anIntArray100[520] = 59;
			Static81.anIntArray100[192] = 28;
		}
		Static81.anIntArray100[91] = 42;
		Static81.anIntArray100[92] = 74;
		Static81.anIntArray100[61] = 27;
		Static81.anIntArray100[44] = 71;
		Static81.anIntArray100[47] = 73;
		Static81.anIntArray100[93] = 43;
		Static81.anIntArray100[45] = 26;
		Static81.anIntArray100[46] = 72;
		Static81.anIntArray100[59] = 57;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZII)V")
	public static void method7773(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		Static395.method6310(Static121.aClass84_12.method2710(Static372.anInt7083), arg1, arg0);
	}
}

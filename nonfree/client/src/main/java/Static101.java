import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!ds", name = "q", descriptor = "[Lclient!ps;")
	public static Class273[] aClass273Array1;

	@OriginalMember(owner = "client!ds", name = "k", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_20 = new Class154(38, 7);

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
	public static int anInt1807 = 0;

	@OriginalMember(owner = "client!ds", name = "r", descriptor = "[I")
	public static final int[] anIntArray156 = new int[13];

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(BII)Lclient!wg;")
	public static Class362 method1524(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class362 local7 = new Class362();
		local7.anInt9504 = arg0 + 1 + 5;
		local7.anInt9517 = -1;
		local7.anInt9516 = arg1 + 1 + 5;
		local7.anInt9521 = -1;
		local7.anIntArrayArray64 = new int[local7.anInt9504][local7.anInt9516];
		local7.method7592();
		return local7;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IILclient!r;Z)Lclient!vba;")
	public static Class345 method1525(@OriginalArg(1) int arg0, @OriginalArg(2) Class162 arg1, @OriginalArg(3) boolean arg2) {
		if (arg0 == -1) {
			return null;
		}
		if (Static48.anIntArray101 != null) {
			for (@Pc(14) int local14 = 0; local14 < Static48.anIntArray101.length; local14++) {
				if (arg0 == Static48.anIntArray101[local14]) {
					return Static585.aClass345Array1[local14];
				}
			}
		}
		@Pc(41) Class345 local41 = (Class345) Static156.aClass21_25.method324((long) arg0);
		if (local41 != null) {
			if (arg2 && local41.aClass112_12 == null) {
				@Pc(55) Class112 local55 = Static308.method4410(Static37.aClass229_9, arg0);
				if (local55 == null) {
					return null;
				}
				local41.aClass112_12 = local55;
			}
			return local41;
		}
		@Pc(68) Class344[] local68 = Static603.method7126(Static212.aClass229_48, arg0);
		if (local68 == null) {
			return null;
		}
		@Pc(85) Class112 local85 = Static308.method4410(Static37.aClass229_9, arg0);
		if (local85 == null) {
			return null;
		}
		if (arg2) {
			local41 = new Class345(arg1.method6864(local85, local68), local85);
		} else {
			local41 = new Class345(arg1.method6864(local85, local68));
		}
		Static156.aClass21_25.method317(local41, (long) arg0);
		return local41;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIII)V")
	public static void method1526(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10;
		if (arg3 > arg1) {
			for (local10 = arg1; local10 < arg3; local10++) {
				Static238.anIntArrayArray36[local10][arg0] = arg2;
			}
		} else {
			for (local10 = arg3; local10 < arg1; local10++) {
				Static238.anIntArrayArray36[local10][arg0] = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIII[I[IIIIILclient!wg;ZIIB)I")
	public static int method1527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class362 arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
				Static473.anIntArrayArray51[local7][local11] = 0;
				Static481.anIntArrayArray53[local7][local11] = 99999999;
			}
		}
		@Pc(56) boolean local56;
		if (arg9 == 1) {
			local56 = Static186.method2365(arg7, arg13, arg1, arg6, arg10, arg12, arg0, arg8, arg3, arg2);
		} else if (arg9 == 2) {
			local56 = Static116.method1697(arg0, arg7, arg10, arg3, arg12, arg13, arg8, arg1, arg2, arg6);
		} else {
			local56 = Static134.method1818(arg13, arg1, arg9, arg0, arg12, arg7, arg8, arg6, arg2, arg3, arg10);
		}
		@Pc(91) int local91 = arg6 - 64;
		@Pc(95) int local95 = arg3 - 64;
		@Pc(97) int local97 = Static71.anInt4965;
		@Pc(99) int local99 = Static540.anInt8913;
		@Pc(107) int local107;
		@Pc(109) int local109;
		@Pc(122) int local122;
		if (!local56) {
			if (!arg11) {
				return -1;
			}
			local107 = Integer.MAX_VALUE;
			local109 = Integer.MAX_VALUE;
			for (@Pc(116) int local116 = arg13 - 10; local116 <= arg13 + 10; local116++) {
				for (local122 = arg12 - 10; local122 <= arg12 + 10; local122++) {
					@Pc(129) int local129 = local116 - local91;
					@Pc(134) int local134 = local122 - local95;
					if (local129 >= 0 && local134 >= 0 && local129 < 128 && local134 < 128 && Static481.anIntArrayArray53[local129][local134] < 100) {
						@Pc(156) int local156 = 0;
						if (arg13 > local116) {
							local156 = arg13 - local116;
						} else if (arg8 + arg13 - 1 < local116) {
							local156 = local116 + 1 - arg8 - arg13;
						}
						@Pc(191) int local191 = 0;
						if (local122 < arg12) {
							local191 = arg12 - local122;
						} else if (arg12 + arg0 - 1 < local122) {
							local191 = local122 + 1 - arg12 - arg0;
						}
						@Pc(227) int local227 = local156 * local156 + local191 * local191;
						if (local227 < local107 || local227 == local107 && local109 > Static481.anIntArrayArray53[local129][local134]) {
							local107 = local227;
							local97 = local116;
							local99 = local122;
							local109 = Static481.anIntArrayArray53[local129][local134];
						}
					}
				}
			}
			if (~local107 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg6 == local97 && arg3 == local99) {
			return 0;
		}
		@Pc(302) byte local302 = 0;
		Static252.anIntArray303[0] = local97;
		local107 = local302 + 1;
		Static233.anIntArray284[0] = local99;
		@Pc(324) int local324;
		local109 = local324 = Static473.anIntArrayArray51[local97 - local91][local99 - local95];
		while (arg6 != local97 || local99 != arg3) {
			if (local324 != local109) {
				Static252.anIntArray303[local107] = local97;
				local324 = local109;
				Static233.anIntArray284[local107++] = local99;
			}
			if ((local109 & 0x1) != 0) {
				local99++;
			} else if ((local109 & 0x4) != 0) {
				local99--;
			}
			if ((local109 & 0x2) != 0) {
				local97++;
			} else if ((local109 & 0x8) != 0) {
				local97--;
			}
			local109 = Static473.anIntArrayArray51[local97 - local91][local99 - local95];
		}
		local122 = 0;
		while (local107-- > 0) {
			arg5[local122] = Static252.anIntArray303[local107];
			arg4[local122++] = Static233.anIntArray284[local107];
			if (local122 >= arg5.length) {
				break;
			}
		}
		return local122;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V")
	public static void method1528() {
		try {
			@Pc(21) Method local21 = Runtime.class.getMethod("availableProcessors");
			if (local21 != null) {
				try {
					@Pc(25) Runtime local25 = Runtime.getRuntime();
					@Pc(31) Integer local31 = (Integer) local21.invoke(local25, (Object[]) null);
					Static346.anInt5966 = local31;
				} catch (@Pc(36) Throwable local36) {
				}
			}
		} catch (@Pc(38) Exception local38) {
		}
	}
}

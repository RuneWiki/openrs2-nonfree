import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
	public static int anInt5435;

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "[I")
	public static final int[] anIntArray420 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_188 = new Class106("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_181 = new Class217(86, 12);

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "([Lclient!kg;IZIBI)V")
	public static void method4981(@OriginalArg(0) Class112[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(8) int local8 = 0; local8 < arg0.length; local8++) {
			@Pc(14) Class112 local14 = arg0[local8];
			if (local14 != null && local14.anInt3428 == arg1) {
				Static191.method5773(arg4, arg3, arg2, local14);
				Static10.method322(local14, arg4, arg3);
				if (local14.anInt3372 > local14.anInt3374 - local14.anInt3381) {
					local14.anInt3372 = local14.anInt3374 - local14.anInt3381;
				}
				if (local14.anInt3427 - local14.anInt3444 < local14.anInt3419) {
					local14.anInt3419 = local14.anInt3427 - local14.anInt3444;
				}
				if (local14.anInt3372 < 0) {
					local14.anInt3372 = 0;
				}
				if (local14.anInt3419 < 0) {
					local14.anInt3419 = 0;
				}
				if (local14.anInt3373 == 0) {
					Static129.method2662(arg2, local14);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIILclient!ds;Lclient!ds;)V")
	public static void method4982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub4 arg3, @OriginalArg(4) Class11_Sub4 arg4) {
		@Pc(4) Class155 local4 = Static94.method2043(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass11_Sub4_1 = arg3;
			local4.aClass11_Sub4_2 = arg4;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZI)V")
	public static void method4983(@OriginalArg(0) boolean arg0) {
		if (Static239.aBoolean362 != arg0) {
			Static239.aBoolean362 = arg0;
			Static131.method2692();
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V")
	public static void method4984() {
		@Pc(5) Class21 local5 = Static288.aClass21_147;
		synchronized (Static288.aClass21_147) {
			Static288.aClass21_147.method857();
		}
		local5 = Static19.aClass21_18;
		synchronized (Static19.aClass21_18) {
			Static19.aClass21_18.method857();
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIZIIII[ILclient!th;IIII[I)I")
	public static int method4985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) Class196 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(14) int[] arg13) {
		for (@Pc(12) int local12 = 0; local12 < 128; local12++) {
			for (@Pc(16) int local16 = 0; local16 < 128; local16++) {
				Static243.anIntArrayArray52[local12][local16] = 0;
				Static226.anIntArrayArray42[local12][local16] = 99999999;
			}
		}
		@Pc(60) boolean local60;
		if (arg12 == 1) {
			local60 = Static320.method4044(arg0, arg9, arg7, arg1, arg6, arg2, arg11, arg10, arg4, arg5);
		} else if (arg12 == 2) {
			local60 = Static264.method4804(arg4, arg11, arg2, arg9, arg0, arg10, arg5, arg1, arg7, arg6);
		} else {
			local60 = Static209.method3851(arg1, arg12, arg4, arg5, arg6, arg10, arg11, arg9, arg7, arg0, arg2);
		}
		@Pc(94) int local94 = arg7 - 64;
		@Pc(98) int local98 = arg10 - 64;
		@Pc(100) int local100 = Static5.anInt194;
		@Pc(102) int local102 = Static225.anInt4529;
		@Pc(110) int local110;
		@Pc(112) int local112;
		@Pc(119) int local119;
		if (!local60) {
			if (!arg3) {
				return -1;
			}
			local110 = Integer.MAX_VALUE;
			local112 = Integer.MAX_VALUE;
			for (local119 = arg4 - 10; local119 <= arg4 + 10; local119++) {
				for (@Pc(126) int local126 = arg11 - 10; local126 <= arg11 + 10; local126++) {
					@Pc(133) int local133 = local119 - local94;
					@Pc(138) int local138 = local126 - local98;
					if (local133 >= 0 && local138 >= 0 && local133 < 128 && local138 < 128 && Static226.anIntArrayArray42[local133][local138] < 100) {
						@Pc(162) int local162 = 0;
						if (arg4 > local119) {
							local162 = arg4 - local119;
						} else if (local119 > arg1 + arg4 - 1) {
							local162 = local119 + 1 - arg4 - arg1;
						}
						@Pc(191) int local191 = 0;
						if (arg11 > local126) {
							local191 = arg11 - local126;
						} else if (arg5 + arg11 - 1 < local126) {
							local191 = local126 + 1 - arg11 - arg5;
						}
						@Pc(233) int local233 = local191 * local191 + local162 * local162;
						if (local110 > local233 || local110 == local233 && Static226.anIntArrayArray42[local133][local138] < local112) {
							local110 = local233;
							local112 = Static226.anIntArrayArray42[local133][local138];
							local102 = local126;
							local100 = local119;
						}
					}
				}
			}
			if (local110 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (local100 == arg7 && local102 == arg10) {
			return 0;
		}
		@Pc(301) byte local301 = 0;
		Static181.anIntArray282[0] = local100;
		local110 = local301 + 1;
		Static77.anIntArray138[0] = local102;
		@Pc(322) int local322;
		local112 = local322 = Static243.anIntArrayArray52[local100 - local94][local102 - local98];
		while (local100 != arg7 || local102 != arg10) {
			if (local322 != local112) {
				local322 = local112;
				Static181.anIntArray282[local110] = local100;
				Static77.anIntArray138[local110++] = local102;
			}
			if ((local112 & 0x1) != 0) {
				local102++;
			} else if ((local112 & 0x4) != 0) {
				local102--;
			}
			if ((local112 & 0x2) != 0) {
				local100++;
			} else if ((local112 & 0x8) != 0) {
				local100--;
			}
			local112 = Static243.anIntArrayArray52[local100 - local94][local102 - local98];
		}
		local119 = 0;
		while (local110-- > 0) {
			arg8[local119] = Static181.anIntArray282[local110];
			arg13[local119++] = Static77.anIntArray138[local110];
			if (local119 >= arg8.length) {
				break;
			}
		}
		return local119;
	}
}

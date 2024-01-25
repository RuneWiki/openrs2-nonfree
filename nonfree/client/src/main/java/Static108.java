import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "Lclient!oo;")
	public static final Class244 aClass244_5 = new Class244(8, 3);

	@OriginalMember(owner = "client!dl", name = "f", descriptor = "[S")
	public static short[] aShortArray47 = new short[256];

	@OriginalMember(owner = "client!dl", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString25 = null;

	@OriginalMember(owner = "client!dl", name = "h", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_36 = new Class268(85, 11);

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V")
	public static void method1760(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		Static155.anInt2829 = 2;
		Static19.anInt323 = arg1;
		Static269.method4786(arg0, false, arg2);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZI)Z")
	public static boolean method1762(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static12.method219(arg0, arg1) & Static503.method7486(arg0, arg1);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(B[B)V")
	public static void method1763(@OriginalArg(1) byte[] arg0) {
		@Pc(14) Class6_Sub40 local14 = new Class6_Sub40(arg0);
		while (true) {
			@Pc(18) int local18;
			@Pc(42) int local42;
			@Pc(37) int local37;
			label45: do {
				while (true) {
					while (true) {
						local18 = local14.method8604();
						if (local18 == 0) {
							return;
						}
						if (local18 == 1) {
							@Pc(110) int[] local110 = Static368.anIntArray416 = new int[6];
							local110[0] = local14.method8571();
							local110[1] = local14.method8571();
							local110[2] = local14.method8571();
							local110[3] = local14.method8571();
							local110[4] = local14.method8571();
							local110[5] = local14.method8571();
						} else {
							if (local18 != 4) {
								continue label45;
							}
							local37 = local14.method8604();
							Static17.anIntArray9 = new int[local37];
							for (local42 = 0; local42 < local37; local42++) {
								Static17.anIntArray9[local42] = local14.method8571();
								if (Static17.anIntArray9[local42] == 65535) {
									Static17.anIntArray9[local42] = -1;
								}
							}
						}
					}
				}
			} while (local18 != 5);
			local37 = local14.method8604();
			Static282.anIntArray339 = new int[local37];
			for (local42 = 0; local42 < local37; local42++) {
				Static282.anIntArray339[local42] = local14.method8571();
				if (Static282.anIntArray339[local42] == 65535) {
					Static282.anIntArray339[local42] = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIZZIII[ILclient!tea;III[I)I")
	public static int method1764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) Class319 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int[] arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static524.anIntArrayArray46[local3][local7] = 0;
				Static533.anIntArrayArray49[local3][local7] = 99999999;
			}
		}
		@Pc(61) boolean local61;
		if (arg12 == 1) {
			local61 = Static560.method8087(arg6, arg11, arg0, arg7, arg3, arg2, arg1, arg9, arg5, arg10);
		} else if (arg12 == 2) {
			local61 = Static644.method8979(arg6, arg11, arg9, arg5, arg3, arg7, arg1, arg2, arg0, arg10);
		} else {
			local61 = Static395.method6365(arg0, arg1, arg10, arg5, arg3, arg7, arg2, arg9, arg12, arg11, arg6);
		}
		@Pc(96) int local96 = arg1 - 64;
		@Pc(100) int local100 = arg0 - 64;
		@Pc(102) int local102 = Static189.anInt3799;
		@Pc(104) int local104 = Static75.anInt1537;
		@Pc(110) int local110;
		@Pc(112) int local112;
		@Pc(119) int local119;
		if (!local61) {
			if (!arg4) {
				return -1;
			}
			local110 = Integer.MAX_VALUE;
			local112 = Integer.MAX_VALUE;
			for (local119 = arg2 - 10; local119 <= arg2 + 10; local119++) {
				for (@Pc(126) int local126 = arg10 - 10; local126 <= arg10 + 10; local126++) {
					@Pc(132) int local132 = local119 - local96;
					@Pc(136) int local136 = local126 - local100;
					if (local132 >= 0 && local136 >= 0 && local132 < 128 && local136 < 128 && Static533.anIntArrayArray49[local132][local136] < 100) {
						@Pc(157) int local157 = 0;
						if (arg2 > local119) {
							local157 = arg2 - local119;
						} else if (local119 > arg6 + arg2 - 1) {
							local157 = local119 + 1 - arg2 - arg6;
						}
						@Pc(186) int local186 = 0;
						if (local126 < arg10) {
							local186 = arg10 - local126;
						} else if (arg10 + arg3 - 1 < local126) {
							local186 = local126 + 1 - arg10 - arg3;
						}
						@Pc(223) int local223 = local186 * local186 + local157 * local157;
						if (local223 < local110 || local223 == local110 && Static533.anIntArrayArray49[local132][local136] < local112) {
							local110 = local223;
							local112 = Static533.anIntArrayArray49[local132][local136];
							local102 = local119;
							local104 = local126;
						}
					}
				}
			}
			if (local110 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (arg1 == local102 && arg0 == local104) {
			return 0;
		}
		@Pc(289) byte local289 = 0;
		Static151.anIntArray179[0] = local102;
		local110 = local289 + 1;
		Static430.anIntArray478[0] = local104;
		@Pc(311) int local311;
		local112 = local311 = Static524.anIntArrayArray46[local102 - local96][local104 - local100];
		while (local102 != arg1 || arg0 != local104) {
			if (local112 != local311) {
				Static151.anIntArray179[local110] = local102;
				local311 = local112;
				Static430.anIntArray478[local110++] = local104;
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
			local112 = Static524.anIntArrayArray46[local102 - local96][local104 - local100];
		}
		local119 = 0;
		while (local110-- > 0) {
			arg8[local119] = Static151.anIntArray179[local110];
			arg13[local119++] = Static430.anIntArray478[local110];
			if (local119 >= arg8.length) {
				break;
			}
		}
		return local119;
	}
}

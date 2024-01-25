import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!uu", name = "f", descriptor = "I")
	public static int anInt9590;

	@OriginalMember(owner = "client!uu", name = "h", descriptor = "I")
	public static int anInt9592;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "Lclient!dj;")
	public static final Class74 aClass74_15 = new Class74(10, 2, 2, 0);

	@OriginalMember(owner = "client!uu", name = "e", descriptor = "Z")
	public static boolean aBoolean689 = false;

	@OriginalMember(owner = "client!uu", name = "g", descriptor = "I")
	public static int anInt9591 = -1;

	@OriginalMember(owner = "client!uu", name = "i", descriptor = "Z")
	public static boolean aBoolean690 = true;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IZLclient!fe;IIIIIIIII[I[II)I")
	public static int method8266(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class105 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) int arg13) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
				Static426.anIntArrayArray52[local7][local11] = 0;
				Static331.anIntArrayArray43[local7][local11] = 99999999;
			}
		}
		@Pc(61) boolean local61;
		if (arg0 == 1) {
			local61 = Static307.method5019(arg6, arg5, arg2, arg3, arg9, arg8, arg4, arg13, arg7, arg10);
		} else if (arg0 == 2) {
			local61 = Static24.method991(arg3, arg2, arg5, arg4, arg6, arg8, arg7, arg10, arg9, arg13);
		} else {
			local61 = Static640.method8725(arg13, arg6, arg9, arg4, arg10, arg7, arg2, arg8, arg0, arg5, arg3);
		}
		@Pc(96) int local96 = arg13 - 64;
		@Pc(100) int local100 = arg8 - 64;
		@Pc(102) int local102 = Static574.anInt9453;
		@Pc(104) int local104 = Static496.anInt2424;
		@Pc(110) int local110;
		@Pc(112) int local112;
		@Pc(119) int local119;
		if (!local61) {
			if (!arg1) {
				return -1;
			}
			local110 = Integer.MAX_VALUE;
			local112 = Integer.MAX_VALUE;
			for (local119 = arg5 - 10; local119 <= arg5 + 10; local119++) {
				for (@Pc(126) int local126 = arg10 - 10; local126 <= arg10 + 10; local126++) {
					@Pc(133) int local133 = local119 - local96;
					@Pc(138) int local138 = local126 - local100;
					if (local133 >= 0 && local138 >= 0 && local133 < 128 && local138 < 128 && Static331.anIntArrayArray43[local133][local138] < 100) {
						@Pc(167) int local167 = 0;
						if (local119 < arg5) {
							local167 = arg5 - local119;
						} else if (local119 > arg7 + arg5 - 1) {
							local167 = local119 + 1 - arg7 - arg5;
						}
						@Pc(197) int local197 = 0;
						if (local126 < arg10) {
							local197 = arg10 - local126;
						} else if (local126 > arg10 + arg3 - 1) {
							local197 = local126 + 1 - arg3 - arg10;
						}
						@Pc(235) int local235 = local167 * local167 + local197 * local197;
						if (local235 < local110 || local235 == local110 && local112 > Static331.anIntArrayArray43[local133][local138]) {
							local112 = Static331.anIntArrayArray43[local133][local138];
							local104 = local126;
							local110 = local235;
							local102 = local119;
						}
					}
				}
			}
			if (~local110 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (local102 == arg13 && arg8 == local104) {
			return 0;
		}
		@Pc(307) byte local307 = 0;
		Static360.anIntArray409[0] = local102;
		local110 = local307 + 1;
		Static143.anIntArray139[0] = local104;
		@Pc(329) int local329;
		local112 = local329 = Static426.anIntArrayArray52[local102 - local96][local104 - local100];
		while (local102 != arg13 || local104 != arg8) {
			if (local112 != local329) {
				Static360.anIntArray409[local110] = local102;
				local329 = local112;
				Static143.anIntArray139[local110++] = local104;
			}
			if ((local112 & 0x1) != 0) {
				local104++;
			} else if ((local112 & 0x4) != 0) {
				local104--;
			}
			if ((local112 & 0x2) != 0) {
				local102++;
			} else if ((local112 & 0x8) != 0) {
				local102--;
			}
			local112 = Static426.anIntArrayArray52[local102 - local96][local104 - local100];
		}
		local119 = 0;
		while (local110-- > 0) {
			arg11[local119] = Static360.anIntArray409[local110];
			arg12[local119++] = Static143.anIntArray139[local110];
			if (arg11.length <= local119) {
				break;
			}
		}
		return local119;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILclient!as;II)J")
	public static long method8268(@OriginalArg(0) int arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = Long.MIN_VALUE;
		@Pc(14) Class299 local14 = Static105.aClass302_1.method7466(arg1.method7381());
		@Pc(35) long local35 = (long) (arg1.method7382() << 14 | arg2 << 7 | arg0 | arg1.method7379() << 20 | 0x40000000);
		if (local14.anInt8641 == 0) {
			local35 |= local7;
		}
		if (local14.anInt8654 == 1) {
			local35 |= local5;
		}
		return local35 | (long) arg1.method7381() << 32;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Ljava/lang/String;ZII)V")
	public static void method8269(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		Static352.method5819();
		Static544.method7941();
		Static138.method2574();
		Static224.method3733(arg1, arg2, arg0);
		Static296.method4678();
		Static235.method3933(Static323.aClass5_9);
		Static68.method1698(Static323.aClass5_9);
		Static33.method1208(Static323.aClass5_9, Static474.aClass196_98);
		Static90.method2064();
		Static421.method6614(Static135.aClass24Array7);
		Static40.method1343();
		Static128.method2511();
		if (Static485.anInt8420 == 3) {
			Static256.method4279(4);
		} else if (Static485.anInt8420 == 7) {
			Static256.method4279(8);
		} else if (Static485.anInt8420 == 10) {
			Static256.method4279(11);
		} else if (Static485.anInt8420 == 1 || Static485.anInt8420 == 2) {
			Static398.method6438();
		}
	}
}

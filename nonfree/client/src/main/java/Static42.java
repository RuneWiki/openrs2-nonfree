import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray10;

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "Lclient!lf;")
	public static final Class4_Sub11 aClass4_Sub11_5 = new Class4_Sub11(new byte[5000]);

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
	public static int anInt1130 = 0;

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
	public static int anInt1131 = -2;

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "[I")
	public static final int[] anIntArray52 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!ck", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString14 = null;

	@OriginalMember(owner = "client!ck", name = "j", descriptor = "[Lclient!rg;")
	public static final Class4_Sub4_Sub15[] aClass4_Sub4_Sub15Array1 = new Class4_Sub4_Sub15[14];

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIII)V")
	public static void method834(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static324.method5273(arg4);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg4 - arg2;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(28) int local28 = arg4;
		@Pc(31) int local31 = -arg4;
		@Pc(33) int local33 = local15;
		@Pc(36) int local36 = -local15;
		@Pc(38) int local38 = -1;
		@Pc(40) int local40 = -1;
		@Pc(63) int local63;
		@Pc(71) int local71;
		@Pc(80) int local80;
		@Pc(88) int local88;
		if (Static349.anInt6619 <= arg0 && arg0 <= Static195.anInt4097) {
			@Pc(54) int[] local54 = Static223.anIntArrayArray124[arg0];
			local63 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg5 - arg4);
			local71 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg5 + arg4);
			local80 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg5 - local15);
			local88 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, local15 + arg5);
			Static135.method2878(local54, local80, arg3, local63);
			Static135.method2878(local54, local88, arg1, local80);
			Static135.method2878(local54, local71, arg3, local88);
		}
		while (local10 < local28) {
			local38 += 2;
			local40 += 2;
			local36 += local40;
			local31 += local38;
			if (local36 >= 0 && local33 >= 1) {
				local33--;
				local36 -= local33 << 1;
				Static83.anIntArray201[local33] = local10;
			}
			local10++;
			@Pc(197) int local197;
			@Pc(206) int local206;
			@Pc(213) int[] local213;
			@Pc(152) int local152;
			if (local31 >= 0) {
				local28--;
				local31 -= local28 << 1;
				local152 = arg0 - local28;
				local63 = arg0 + local28;
				if (Static349.anInt6619 <= local63 && local152 <= Static195.anInt4097) {
					if (local15 > local28) {
						local71 = Static83.anIntArray201[local28];
						local80 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg5 + local10);
						local88 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg5 - local10);
						local197 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, local71 + arg5);
						local206 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg5 - local71);
						if (Static195.anInt4097 >= local63) {
							local213 = Static223.anIntArrayArray124[local63];
							Static135.method2878(local213, local206, arg3, local88);
							Static135.method2878(local213, local197, arg1, local206);
							Static135.method2878(local213, local80, arg3, local197);
						}
						if (Static349.anInt6619 <= local152) {
							local213 = Static223.anIntArrayArray124[local152];
							Static135.method2878(local213, local206, arg3, local88);
							Static135.method2878(local213, local197, arg1, local206);
							Static135.method2878(local213, local80, arg3, local197);
						}
					} else {
						local71 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, local10 + arg5);
						local80 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg5 - local10);
						if (local63 <= Static195.anInt4097) {
							Static135.method2878(Static223.anIntArrayArray124[local63], local71, arg3, local80);
						}
						if (local152 >= Static349.anInt6619) {
							Static135.method2878(Static223.anIntArrayArray124[local152], local71, arg3, local80);
						}
					}
				}
			}
			local152 = arg0 - local10;
			local63 = arg0 + local10;
			if (local63 >= Static349.anInt6619 && Static195.anInt4097 >= local152) {
				local71 = arg5 + local28;
				local80 = arg5 - local28;
				if (local71 >= Static5.anInt2965 && local80 <= Static220.anInt6565) {
					local71 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, local71);
					local80 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, local80);
					if (local15 <= local10) {
						if (Static195.anInt4097 >= local63) {
							Static135.method2878(Static223.anIntArrayArray124[local63], local71, arg3, local80);
						}
						if (local152 >= Static349.anInt6619) {
							Static135.method2878(Static223.anIntArrayArray124[local152], local71, arg3, local80);
						}
					} else {
						local88 = local33 >= local10 ? local33 : Static83.anIntArray201[local10];
						local197 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg5 + local88);
						local206 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg5 - local88);
						if (local63 <= Static195.anInt4097) {
							local213 = Static223.anIntArrayArray124[local63];
							Static135.method2878(local213, local206, arg3, local80);
							Static135.method2878(local213, local197, arg1, local206);
							Static135.method2878(local213, local71, arg3, local197);
						}
						if (local152 >= Static349.anInt6619) {
							local213 = Static223.anIntArrayArray124[local152];
							Static135.method2878(local213, local206, arg3, local80);
							Static135.method2878(local213, local197, arg1, local206);
							Static135.method2878(local213, local71, arg3, local197);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IJ)V")
	public static void method836(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "([IIIIZIII[IIILclient!qr;III)I")
	public static int method837(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class170 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
				Static98.anIntArrayArray66[local7][local11] = 0;
				Static315.anIntArrayArray169[local7][local11] = 99999999;
			}
		}
		@Pc(53) boolean local53;
		if (arg8 == 1) {
			local53 = Static26.method443(arg6, arg11, arg4, arg12, arg10, arg5, arg9, arg1, arg13, arg2);
		} else if (arg8 == 2) {
			local53 = Static302.method4959(arg9, arg10, arg12, arg2, arg1, arg11, arg5, arg4, arg13, arg6);
		} else {
			local53 = Static327.method5294(arg1, arg6, arg5, arg9, arg4, arg11, arg2, arg12, arg13, arg10, arg8);
		}
		@Pc(91) int local91 = arg13 - 64;
		@Pc(95) int local95 = arg6 - 64;
		@Pc(97) int local97 = Static123.anInt2948;
		@Pc(99) int local99 = Static132.anInt3100;
		@Pc(107) int local107;
		@Pc(109) int local109;
		@Pc(115) int local115;
		if (!local53) {
			if (!arg3) {
				return -1;
			}
			local107 = Integer.MAX_VALUE;
			local109 = Integer.MAX_VALUE;
			for (local115 = arg9 - 10; local115 <= arg9 + 10; local115++) {
				for (@Pc(122) int local122 = arg1 - 10; local122 <= arg1 + 10; local122++) {
					@Pc(128) int local128 = local115 - local91;
					@Pc(133) int local133 = local122 - local95;
					if (local128 >= 0 && local133 >= 0 && local128 < 128 && local133 < 128 && Static315.anIntArrayArray169[local128][local133] < 100) {
						@Pc(159) int local159 = 0;
						if (local115 < arg9) {
							local159 = arg9 - local115;
						} else if (local115 > arg9 + arg12 - 1) {
							local159 = local115 + 1 - arg12 - arg9;
						}
						@Pc(192) int local192 = 0;
						if (arg1 > local122) {
							local192 = arg1 - local122;
						} else if (arg1 + arg11 - 1 < local122) {
							local192 = local122 + 1 - arg1 - arg11;
						}
						@Pc(234) int local234 = local159 * local159 + local192 * local192;
						if (local234 < local107 || local107 == local234 && Static315.anIntArrayArray169[local128][local133] < local109) {
							local97 = local115;
							local99 = local122;
							local107 = local234;
							local109 = Static315.anIntArrayArray169[local128][local133];
						}
					}
				}
			}
			if (~local107 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (local97 == arg13 && local99 == arg6) {
			return 0;
		}
		@Pc(300) byte local300 = 0;
		Static142.anIntArray279[0] = local97;
		local107 = local300 + 1;
		Static186.anIntArray331[0] = local99;
		@Pc(322) int local322;
		local109 = local322 = Static98.anIntArrayArray66[local97 - local91][local99 - local95];
		while (local97 != arg13 || local99 != arg6) {
			if (local109 != local322) {
				local322 = local109;
				Static142.anIntArray279[local107] = local97;
				Static186.anIntArray331[local107++] = local99;
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
			local109 = Static98.anIntArrayArray66[local97 - local91][local99 - local95];
		}
		local115 = 0;
		while (local107-- > 0) {
			arg0[local115] = Static142.anIntArray279[local107];
			arg7[local115++] = Static186.anIntArray331[local107];
			if (arg0.length <= local115) {
				break;
			}
		}
		return local115;
	}
}

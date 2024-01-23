import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!rk", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString315;

	@OriginalMember(owner = "client!rk", name = "B", descriptor = "I")
	public static int anInt4573;

	@OriginalMember(owner = "client!rk", name = "s", descriptor = "[I")
	public static int[] anIntArray353 = new int[200];

	@OriginalMember(owner = "client!rk", name = "v", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!rk", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString316 = "RuneScape is loading - please wait...";

	@OriginalMember(owner = "client!rk", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString318 = "Discard";

	@OriginalMember(owner = "client!rk", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString319 = "Examine";

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z[B[Lclient!jb;ZIIII)[I")
	public static int[] method3459(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class65[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
			for (local13 = 0; local13 < 64; local13++) {
				for (local17 = 0; local17 < 64; local17++) {
					if (arg3 + local13 > 0 && arg3 + local13 < 103 && arg2 + local17 > 0 && local17 + arg2 < 103) {
						arg1[local9].anIntArrayArray19[local13 + arg3][arg2 + local17] &= 0xFFDFFFFF;
					}
				}
			}
		}
		@Pc(107) Class1_Sub13 local107 = new Class1_Sub13(arg0);
		local13 = arg4 + arg3;
		local17 = arg5 + arg2;
		for (@Pc(117) int local117 = 0; local117 < 4; local117++) {
			for (@Pc(121) int local121 = 0; local121 < 64; local121++) {
				for (@Pc(125) int local125 = 0; local125 < 64; local125++) {
					Static43.method921(local17 + local125, local121 + arg3, local121 + local13, local117, local125 + arg2, 0, false, local107);
				}
			}
		}
		@Pc(163) boolean local163 = false;
		@Pc(165) boolean local165 = false;
		@Pc(171) int local171;
		@Pc(223) int local223;
		@Pc(238) int local238;
		@Pc(242) int local242;
		while (local107.anInt2395 < local107.aByteArray29.length) {
			local171 = local107.method1772();
			if (local171 == 128) {
				Static8.anIntArray18[0] = local107.method1764();
				local163 = true;
				Static8.anIntArray18[1] = local107.method1798();
				Static8.anIntArray18[2] = local107.method1798();
				Static8.anIntArray18[3] = local107.method1798();
				Static8.anIntArray18[4] = local107.method1764();
			} else {
				if (local171 != 129) {
					local107.anInt2395--;
					break;
				}
				for (local223 = 0; local223 < 4; local223++) {
					@Pc(229) byte local229 = local107.method1756();
					@Pc(361) int local361;
					@Pc(252) int local252;
					if (local229 == 0) {
						local238 = arg3;
						if (arg3 < 0) {
							local238 = 0;
						} else if (arg3 >= 104) {
							local238 = 104;
						}
						local242 = arg3 + 64;
						if (local242 < 0) {
							local242 = 0;
						} else if (local242 >= 104) {
							local242 = 104;
						}
						local252 = arg2 + 64;
						local361 = arg2;
						if (local252 < 0) {
							local252 = 0;
						} else if (local252 >= 104) {
							local252 = 104;
						}
						if (arg2 < 0) {
							local361 = 0;
						} else if (arg2 >= 104) {
							local361 = 104;
						}
						while (local242 > local238) {
							while (local252 > local361) {
								Static144.aByteArrayArrayArray12[local223][local238][local361] = 0;
								local361++;
							}
							local238++;
						}
					} else if (local229 == 1) {
						for (local238 = 0; local238 < 64; local238 += 4) {
							for (local242 = 0; local242 < 64; local242 += 4) {
								@Pc(248) byte local248 = local107.method1756();
								for (local252 = local238 + arg3; local252 < local238 + arg3 + 4; local252++) {
									for (@Pc(258) int local258 = arg2 + local242; local258 < arg2 + local242 + 4; local258++) {
										if (local252 >= 0 && local252 < 104 && local258 >= 0 && local258 < 104) {
											Static144.aByteArrayArrayArray12[local223][local252][local258] = local248;
										}
									}
								}
							}
						}
					} else if (local229 == 2 && local223 > 0) {
						local242 = arg3 + 64;
						if (local242 < 0) {
							local242 = 0;
						} else if (local242 >= 104) {
							local242 = 104;
						}
						local238 = arg3;
						if (arg3 < 0) {
							local238 = 0;
						} else if (arg3 >= 104) {
							local238 = 104;
						}
						local361 = arg2;
						local252 = arg2 + 64;
						if (arg2 < 0) {
							local361 = 0;
						} else if (arg2 >= 104) {
							local361 = 104;
						}
						if (local252 < 0) {
							local252 = 0;
						} else if (local252 >= 104) {
							local252 = 104;
						}
						while (local238 < local242) {
							while (local361 < local252) {
								Static144.aByteArrayArrayArray12[local223][local238][local361] = Static144.aByteArrayArrayArray12[local223 - 1][local238][local361];
								local361++;
							}
							local238++;
						}
					}
				}
				local165 = true;
			}
		}
		if (!local165) {
			for (local171 = 0; local171 < 4; local171++) {
				for (local223 = 0; local223 < 16; local223++) {
					for (@Pc(544) int local544 = 0; local544 < 16; local544++) {
						local238 = local223 + (arg3 >> 2);
						local242 = (arg2 >> 2) + local544;
						if (local238 >= 0 && local238 < 26 && local242 >= 0 && local242 < 26) {
							Static144.aByteArrayArrayArray12[local171][local238][local242] = 0;
						}
					}
				}
			}
		}
		if (local163) {
			return Static8.anIntArray18;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZB)I")
	public static int method3461(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static31.method591();
		for (@Pc(20) Class1_Sub10 local20 = arg0 ? (Class1_Sub10) Static145.aClass140_10.method4012() : (Class1_Sub10) Static145.aClass140_10.method4013(); local20 != null; local20 = (Class1_Sub10) Static145.aClass140_10.method4013()) {
			if (local8 > (local20.aLong68 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local20.aLong68 & 0x4000000000000000L) != 0L) {
					@Pc(54) int local54 = (int) local20.aLong184;
					Static91.anIntArray189[local54] = Static36.anIntArray57[local54];
					local20.method4186();
					return local54;
				}
				local20.method4186();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(B)V")
	public static void method3462() {
		Static250.aClass140_18.method4010();
		Static237.aClass99_10.method2971();
		Static141.aClass99_6.method2971();
	}
}

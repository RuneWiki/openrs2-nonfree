import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!qj", name = "y", descriptor = "I")
	public static int anInt3717;

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
	public static int anInt3701 = 100;

	@OriginalMember(owner = "client!qj", name = "o", descriptor = "Z")
	public static boolean aBoolean168 = false;

	@OriginalMember(owner = "client!qj", name = "u", descriptor = "J")
	public static long aLong144 = 0L;

	@OriginalMember(owner = "client!qj", name = "z", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1204 = Static186.method3527("overlay2");

	@OriginalMember(owner = "client!qj", name = "A", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1205 = Static186.method3527("(U3");

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BIIII)V")
	public static void method2915(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= Static49.anInt1030 && arg3 <= anInt3701) {
			@Pc(28) int local28 = Static92.method1433(Static131.anInt2713, arg0, Static135.anInt2790);
			@Pc(34) int local34 = Static92.method1433(Static131.anInt2713, arg2, Static135.anInt2790);
			Static126.method2029(arg3, arg1, local28, local34);
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIII)V")
	public static void method2917(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static14.aClass78Array1[0].method3017(arg3, arg4);
		Static14.aClass78Array1[1].method3017(arg3, arg4 + arg1 - 16);
		@Pc(28) int local28 = arg1 * (arg1 - 32) / arg0;
		if (local28 < 8) {
			local28 = 8;
		}
		@Pc(46) int local46 = arg2 * (arg1 - local28 - 32) / (arg0 - arg1);
		Static29.method423(arg3, arg4 + 16, 16, arg1 - 32, Static121.anInt2387);
		Static29.method423(arg3, arg4 + local46 + 16, 16, local28, Static207.anInt4150);
		Static29.method414(arg3, local46 + arg4 + 16, local28, Static191.anInt3935);
		Static29.method414(arg3 + 1, local46 + 16 + arg4, local28, Static191.anInt3935);
		Static29.method415(arg3, arg4 + local46 + 16, 16, Static191.anInt3935);
		Static29.method415(arg3, local46 + arg4 + 17, 16, Static191.anInt3935);
		Static29.method414(arg3 + 15, local46 + 16 + arg4, local28, Static16.anInt303);
		Static29.method414(arg3 + 14, local46 + (arg4 - -17), local28 - 1, Static16.anInt303);
		Static29.method415(arg3, local28 + local46 + arg4 + 15, 16, Static16.anInt303);
		Static29.method415(arg3 + 1, local28 + (arg4 - (-14 - local46)), 15, Static16.anInt303);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(III[[[BIBII)V")
	public static void method2918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		Static1.anInt43++;
		Static145.anInt2969 = 0;
		@Pc(9) int local9 = arg6 - 16;
		@Pc(13) int local13 = arg6 + 16;
		@Pc(17) int local17 = arg7 - 16;
		@Pc(21) int local21 = arg7 + 16;
		@Pc(30) int local30;
		@Pc(33) int local33;
		@Pc(180) int local180;
		for (@Pc(23) int local23 = Static53.anInt1063; local23 < Static179.anInt3725; local23++) {
			@Pc(28) Class1_Sub11[][] local28 = Static56.aClass1_Sub11ArrayArrayArray3[local23];
			for (local30 = Static146.anInt3072; local30 < Static162.anInt3362; local30++) {
				for (local33 = Static160.anInt3326; local33 < Static124.anInt2472; local33++) {
					@Pc(40) Class1_Sub11 local40 = local28[local30][local33];
					if (local40 != null) {
						if (Static16.aBooleanArrayArray1[local30 + Static75.anInt1524 - Static98.anInt2000][local33 + Static75.anInt1524 - Static35.anInt740] && (arg3 == null || local23 < arg4 || arg3[local23][local30][local33] != arg5)) {
							local40.aBoolean51 = true;
							local40.aBoolean52 = true;
							if (local40.anInt1072 > 0) {
								local40.aBoolean53 = true;
							} else {
								local40.aBoolean53 = false;
							}
							Static145.anInt2969++;
						} else {
							local40.aBoolean51 = false;
							local40.aBoolean52 = false;
							local40.anInt1071 = 0;
							if (local30 >= local9 && local30 <= local13 && local33 >= local17 && local33 <= local21) {
								if (local40.aClass29_1 != null) {
									@Pc(97) Class29 local97 = local40.aClass29_1;
									local97.aClass20_1.method3488(local97.anInt1087, local97.anInt1085, local97.anInt1087, local97.anInt1085);
									if (local97.aClass20_2 != null) {
										local97.aClass20_2.method3488(local97.anInt1087, local97.anInt1085, local97.anInt1087, local97.anInt1085);
									}
								}
								if (local40.aClass61_1 != null) {
									@Pc(130) Class61 local130 = local40.aClass61_1;
									local130.aClass20_3.method3488(local130.anInt2075, local130.anInt2074, local130.anInt2075, local130.anInt2074);
									if (local130.aClass20_4 != null) {
										local130.aClass20_4.method3488(local130.anInt2075, local130.anInt2074, local130.anInt2075, local130.anInt2074);
									}
								}
								if (local40.aClass128_1 != null) {
									@Pc(163) Class128 local163 = local40.aClass128_1;
									local163.aClass20_10.method3488(local163.anInt4418, local163.anInt4422, local163.anInt4418, local163.anInt4422);
								}
								if (local40.aClass94Array1 != null) {
									for (local180 = 0; local180 < local40.anInt1072; local180++) {
										@Pc(186) Class94 local186 = local40.aClass94Array1[local180];
										local186.aClass20_5.method3488(local186.anInt3683, local186.anInt3692, local186.anInt3684, local186.anInt3686);
									}
								}
							}
						}
					}
				}
			}
		}
		@Pc(243) boolean local243 = Static119.anIntArrayArrayArray10 == Static72.anIntArrayArrayArray5;
		@Pc(271) int local271;
		@Pc(276) int local276;
		@Pc(280) int local280;
		@Pc(262) int local262;
		for (local30 = Static53.anInt1063; local30 < Static179.anInt3725; local30++) {
			@Pc(250) Class1_Sub11[][] local250 = Static56.aClass1_Sub11ArrayArrayArray3[local30];
			for (@Pc(253) int local253 = -Static75.anInt1524; local253 <= 0; local253++) {
				local180 = Static98.anInt2000 + local253;
				local262 = Static98.anInt2000 - local253;
				if (local180 >= Static146.anInt3072 || local262 < Static162.anInt3362) {
					for (local271 = -Static75.anInt1524; local271 <= 0; local271++) {
						local276 = Static35.anInt740 + local271;
						local280 = Static35.anInt740 - local271;
						@Pc(292) Class1_Sub11 local292;
						if (local180 >= Static146.anInt3072) {
							if (local276 >= Static160.anInt3326) {
								local292 = local250[local180][local276];
								if (local292 != null && local292.aBoolean51) {
									Static233.method3517(local292, true);
								}
							}
							if (local280 < Static124.anInt2472) {
								local292 = local250[local180][local280];
								if (local292 != null && local292.aBoolean51) {
									Static233.method3517(local292, true);
								}
							}
						}
						if (local262 < Static162.anInt3362) {
							if (local276 >= Static160.anInt3326) {
								local292 = local250[local262][local276];
								if (local292 != null && local292.aBoolean51) {
									Static233.method3517(local292, true);
								}
							}
							if (local280 < Static124.anInt2472) {
								local292 = local250[local262][local280];
								if (local292 != null && local292.aBoolean51) {
									Static233.method3517(local292, true);
								}
							}
						}
						if (Static145.anInt2969 == 0) {
							if (!local243) {
								Static183.aBoolean171 = false;
							}
							return;
						}
					}
				}
			}
		}
		for (local33 = Static53.anInt1063; local33 < Static179.anInt3725; local33++) {
			@Pc(378) Class1_Sub11[][] local378 = Static56.aClass1_Sub11ArrayArrayArray3[local33];
			for (local180 = -Static75.anInt1524; local180 <= 0; local180++) {
				local262 = Static98.anInt2000 + local180;
				local271 = Static98.anInt2000 - local180;
				if (local262 >= Static146.anInt3072 || local271 < Static162.anInt3362) {
					for (local276 = -Static75.anInt1524; local276 <= 0; local276++) {
						local280 = Static35.anInt740 + local276;
						@Pc(408) int local408 = Static35.anInt740 - local276;
						@Pc(420) Class1_Sub11 local420;
						if (local262 >= Static146.anInt3072) {
							if (local280 >= Static160.anInt3326) {
								local420 = local378[local262][local280];
								if (local420 != null && local420.aBoolean51) {
									Static233.method3517(local420, false);
								}
							}
							if (local408 < Static124.anInt2472) {
								local420 = local378[local262][local408];
								if (local420 != null && local420.aBoolean51) {
									Static233.method3517(local420, false);
								}
							}
						}
						if (local271 < Static162.anInt3362) {
							if (local280 >= Static160.anInt3326) {
								local420 = local378[local271][local280];
								if (local420 != null && local420.aBoolean51) {
									Static233.method3517(local420, false);
								}
							}
							if (local408 < Static124.anInt2472) {
								local420 = local378[local271][local408];
								if (local420 != null && local420.aBoolean51) {
									Static233.method3517(local420, false);
								}
							}
						}
						if (Static145.anInt2969 == 0) {
							if (!local243) {
								Static183.aBoolean171 = false;
							}
							return;
						}
					}
				}
			}
		}
		Static183.aBoolean171 = false;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)Z")
	public static boolean method2919() {
		@Pc(5) Class81 local5 = Static32.aClass81_1;
		synchronized (Static32.aClass81_1) {
			if (Static2.anInt53 == Static84.anInt1729) {
				return false;
			} else {
				Static69.anInt1316 = Static50.anIntArray87[Static2.anInt53];
				Static57.anInt1134 = Static129.anIntArray286[Static2.anInt53];
				Static2.anInt53 = Static2.anInt53 + 1 & 0x7F;
				return true;
			}
		}
	}
}

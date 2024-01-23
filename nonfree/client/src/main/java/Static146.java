import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!oi", name = "o", descriptor = "Lclient!bj;")
	public static Class15_Sub1 aClass15_Sub1_88;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
	public static int anInt3312 = 0;

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
	public static int anInt3314 = 0;

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
	public static int anInt3317 = 0;

	@OriginalMember(owner = "client!oi", name = "j", descriptor = "Lclient!i;")
	public static Class41 aClass41_921 = Static184.method2923("gelb:");

	@OriginalMember(owner = "client!oi", name = "l", descriptor = "Lclient!i;")
	private static Class41 aClass41_922 = Static184.method2923("Service unavailable)3");

	@OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
	public static int anInt3318 = 1;

	@OriginalMember(owner = "client!oi", name = "n", descriptor = "Lclient!i;")
	public static Class41 aClass41_923 = aClass41_922;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)J")
	public static long method2253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub7 local7 = Static27.aClass2_Sub7ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null || local7.aClass35_1 == null ? 0L : local7.aClass35_1.aLong44;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!i;Lclient!q;I)Lclient!i;")
	public static Class41 method2255(@OriginalArg(0) Class41 arg0, @OriginalArg(1) Class80 arg1) {
		if (arg0.method1406(Static134.aClass41_859) == -1) {
			return arg0;
		}
		while (true) {
			@Pc(18) int local18 = arg0.method1406(Static101.aClass41_731);
			if (local18 == -1) {
				while (true) {
					local18 = arg0.method1406(Static149.aClass41_929);
					if (local18 == -1) {
						while (true) {
							local18 = arg0.method1406(Static17.aClass41_110);
							if (local18 == -1) {
								while (true) {
									local18 = arg0.method1406(Static89.aClass41_656);
									if (local18 == -1) {
										while (true) {
											local18 = arg0.method1406(Static119.aClass41_816);
											if (local18 == -1) {
												while (true) {
													local18 = arg0.method1406(Static166.aClass41_957);
													if (local18 == -1) {
														return arg0;
													}
													@Pc(245) Class41 local245 = Static156.aClass41_981;
													if (Static45.aClass75_2 != null) {
														local245 = Static126.method2066(Static45.aClass75_2.anInt3345);
														try {
															if (Static45.aClass75_2.anObject3 != null) {
																@Pc(261) byte[] local261 = ((String) Static45.aClass75_2.anObject3).getBytes("ISO-8859-1");
																local245 = Static49.method967(0, local261, local261.length);
															}
														} catch (@Pc(270) UnsupportedEncodingException local270) {
														}
													}
													arg0 = Static149.method2324(new Class41[] { arg0.method1412(0, local18), local245, arg0.method1424(local18 + 4) });
												}
											}
											arg0 = Static149.method2324(new Class41[] { arg0.method1412(0, local18), Static187.method2971(Static96.method1672(4, arg1)), arg0.method1424(local18 + 2) });
										}
									}
									arg0 = Static149.method2324(new Class41[] { arg0.method1412(0, local18), Static187.method2971(Static96.method1672(3, arg1)), arg0.method1424(local18 + 2) });
								}
							}
							arg0 = Static149.method2324(new Class41[] { arg0.method1412(0, local18), Static187.method2971(Static96.method1672(2, arg1)), arg0.method1424(local18 + 2) });
						}
					}
					arg0 = Static149.method2324(new Class41[] { arg0.method1412(0, local18), Static187.method2971(Static96.method1672(1, arg1)), arg0.method1424(local18 + 2) });
				}
			}
			arg0 = Static149.method2324(new Class41[] { arg0.method1412(0, local18), Static187.method2971(Static96.method1672(0, arg1)), arg0.method1424(local18 + 2) });
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I[B)V")
	public static void method2256(@OriginalArg(1) byte[] arg0) {
		@Pc(11) int local11 = Static193.anInt3917 >> 2 << 10;
		@Pc(15) byte[][] local15 = new byte[Static95.anInt2353][Static40.anInt1214];
		@Pc(19) int local19 = Static62.anInt1674 >> 1;
		@Pc(21) int local21 = 0;
		while (true) {
			@Pc(34) int local34;
			@Pc(46) int local46;
			while (arg0.length > local21) {
				local34 = (arg0[local21++] & 0xFF) * 64 - Static15.anInt422;
				local46 = (arg0[local21++] & 0xFF) * 64 - Static105.anInt2549;
				if (local34 > 0 && local46 > 0 && local34 + 64 < Static95.anInt2353 && local46 + 64 < Static40.anInt1214) {
					for (@Pc(75) int local75 = 0; local75 < 64; local75++) {
						@Pc(83) byte[] local83 = local15[local34 + local75];
						@Pc(90) int local90 = Static40.anInt1214 - local46 - 1;
						for (@Pc(92) int local92 = -64; local92 < 0; local92++) {
							local83[local90--] = arg0[local21++];
						}
					}
				} else {
					local21 += 4096;
				}
			}
			local46 = Static40.anInt1214;
			local34 = Static95.anInt2353;
			@Pc(122) int[] local122 = new int[local46];
			@Pc(133) int[] local133 = new int[local46];
			@Pc(136) int[] local136 = new int[local46];
			@Pc(139) int[] local139 = new int[local46];
			@Pc(142) int[] local142 = new int[local46];
			for (@Pc(144) int local144 = -5; local144 < local34; local144++) {
				@Pc(165) int local165;
				@Pc(226) int local226;
				for (@Pc(148) int local148 = 0; local148 < local46; local148++) {
					@Pc(154) int local154 = local144 + 5;
					@Pc(209) int local209;
					if (local34 > local154) {
						local165 = local15[local154][local148] & 0xFF;
						if (local165 > 0) {
							@Pc(173) Class2_Sub2_Sub26 local173 = Static27.method1636(local165 - 1);
							local122[local148] += local173.anInt4695;
							local133[local148] += local173.anInt4688;
							local142[local148] += local173.anInt4690;
							local136[local148] += local173.anInt4686;
							local209 = local139[local148]++;
						}
					}
					local165 = local144 - 5;
					if (local165 >= 0) {
						local226 = local15[local165][local148] & 0xFF;
						if (local226 > 0) {
							@Pc(237) Class2_Sub2_Sub26 local237 = Static27.method1636(local226 - 1);
							local122[local148] -= local237.anInt4695;
							local133[local148] -= local237.anInt4688;
							local142[local148] -= local237.anInt4690;
							local136[local148] -= local237.anInt4686;
							local209 = local139[local148]--;
						}
					}
				}
				if (local144 >= 0) {
					@Pc(295) int[][] local295 = Static92.anIntArrayArrayArray11[local144 >> 6];
					local226 = 0;
					@Pc(299) int local299 = 0;
					local165 = 0;
					@Pc(303) int local303 = 0;
					@Pc(305) int local305 = 0;
					for (@Pc(307) int local307 = -5; local307 < local46; local307++) {
						@Pc(313) int local313 = local307 - 5;
						@Pc(317) int local317 = local307 + 5;
						if (local317 < local46) {
							local303 += local136[local317];
							local305 += local139[local317];
							local299 += local142[local317];
							local226 += local133[local317];
							local165 += local122[local317];
						}
						if (local313 >= 0) {
							local303 -= local136[local313];
							local226 -= local133[local313];
							local299 -= local142[local313];
							local165 -= local122[local313];
							local305 -= local139[local313];
						}
						if (local307 >= 0 && local305 > 0) {
							@Pc(399) int local399 = local307 >> 6;
							@Pc(422) int local422 = local303 == 0 ? 0 : Static143.method2232(local165 * 256 / local303, local299 / local305, local226 / local305);
							if (local15[local144][local307] != 0) {
								if (local295[local399] == null) {
									local295[local399] = Static92.anIntArrayArrayArray11[local144 >> 6][local399] = new int[4096];
								}
								@Pc(454) int local454 = local19 + (local422 & 0x7F);
								if (local454 < 0) {
									local454 = 0;
								} else if (local454 > 127) {
									local454 = 127;
								}
								@Pc(482) int local482 = (local422 + local11 & 0xFC00) + ((local422 & 0x380) + local454);
								local295[local399][((local307 & 0x3F) << 6) + (local144 & 0x3F)] = Static155.anIntArray373[Static12.method291(96, local482)];
							} else if (local295[local399] != null) {
								local295[local399][((local307 & 0x3F) << 6) + (local144 & 0x3F)] = 0;
							}
						}
					}
				}
			}
			return;
		}
	}
}

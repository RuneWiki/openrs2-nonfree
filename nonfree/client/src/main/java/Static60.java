import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
	public static int anInt3272;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIILclient!b;II)V")
	public static void method2383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class6 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg4 * arg4 + arg5 * arg5;
		if (local7 > 360000) {
			return;
		}
		@Pc(31) int local31 = Math.min(arg3.anInt244 / 2, arg3.anInt217 / 2);
		if (local31 * local31 >= local7) {
			Static196.method3056(arg4, arg3, arg5, arg2, Static35.aClass3_Sub3_Sub2_Sub1Array3[arg0], arg1);
			return;
		}
		@Pc(42) int local42 = Static179.anInt1329 + Static62.anInt1310 & 0x7FF;
		local31 -= 10;
		@Pc(47) int local47 = Class3_Sub3_Sub2_Sub5.anIntArray300[local42];
		@Pc(55) int local55 = local47 * 256 / (Static212.anInt4284 + 256);
		@Pc(59) int local59 = Class3_Sub3_Sub2_Sub5.anIntArray303[local42];
		@Pc(67) int local67 = local59 * 256 / (Static212.anInt4284 + 256);
		@Pc(78) int local78 = arg4 * local67 - local55 * arg5 >> 16;
		@Pc(88) int local88 = arg4 * local55 + local67 * arg5 >> 16;
		@Pc(94) double local94 = Math.atan2((double) local88, (double) local78);
		@Pc(101) int local101 = (int) (Math.sin(local94) * (double) local31);
		@Pc(108) int local108 = (int) (Math.cos(local94) * (double) local31);
		Static29.aClass3_Sub3_Sub2_Sub1Array1[arg0].method201(arg3.anInt244 / 2 + arg1 + local101 - 10, -local108 + arg3.anInt217 / 2 + arg2 + -10, local94);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)V")
	public static void method2386(@OriginalArg(1) int arg0) {
		Static54.anInt1162 = -1;
		Static54.anInt1162 = -1;
		Static1.anInt1794 = arg0;
		Static149.method2172();
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIII)V")
	public static void method2387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static89.anInt659 * 128) {
			arg0 = Static89.anInt659 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static126.anInt2489 * 128) {
			arg2 = Static126.anInt2489 * 128 - 1;
		}
		Static90.anInt1778++;
		Static113.anInt2292 = Class3_Sub3_Sub2_Sub5.anIntArray300[arg3];
		Static204.anInt4161 = Class3_Sub3_Sub2_Sub5.anIntArray303[arg3];
		Static77.anInt1522 = Class3_Sub3_Sub2_Sub5.anIntArray300[arg4];
		Static71.anInt1416 = Class3_Sub3_Sub2_Sub5.anIntArray303[arg4];
		Static116.anInt3348 = arg0;
		Static198.anInt4037 = arg1;
		Static146.anInt3006 = arg2;
		Static145.anInt2993 = arg0 / 128;
		Static31.anInt701 = arg2 / 128;
		Static172.anInt3462 = arg5;
		Static81.anInt1615 = Static145.anInt2993 - Static40.anInt859;
		if (Static81.anInt1615 < 0) {
			Static81.anInt1615 = 0;
		}
		Static47.anInt969 = Static31.anInt701 - Static40.anInt859;
		if (Static47.anInt969 < 0) {
			Static47.anInt969 = 0;
		}
		Static105.anInt2110 = Static145.anInt2993 + Static40.anInt859;
		if (Static105.anInt2110 > Static89.anInt659) {
			Static105.anInt2110 = Static89.anInt659;
		}
		Static119.anInt2415 = Static31.anInt701 + Static40.anInt859;
		if (Static119.anInt2415 > Static126.anInt2489) {
			Static119.anInt2415 = Static126.anInt2489;
		}
		@Pc(108) int local108;
		@Pc(119) int local119;
		@Pc(129) int local129;
		@Pc(135) int local135;
		@Pc(141) int local141;
		@Pc(163) int local163;
		@Pc(175) int local175;
		for (@Pc(105) int local105 = 0; local105 < Static40.anInt859 + Static40.anInt859 + 2; local105++) {
			for (local108 = 0; local108 < Static40.anInt859 + Static40.anInt859 + 2; local108++) {
				local119 = (local105 - Static40.anInt859 << 7) - (arg0 & 0x7F);
				local129 = (local108 - Static40.anInt859 << 7) - (arg2 & 0x7F);
				local135 = Static145.anInt2993 + local105 - Static40.anInt859;
				local141 = Static31.anInt701 + local108 - Static40.anInt859;
				if (local135 >= 0 && local141 >= 0 && local135 < Static89.anInt659 && local141 < Static126.anInt2489) {
					local163 = Static210.anIntArrayArrayArray12[0][local135][local141] + 128 - arg1;
					local175 = Static210.anIntArrayArrayArray12[3][local135][local141] - arg1 - 1000;
					Static112.aBooleanArrayArray1[local105][local108] = Static76.method1103(local119, local175, local163, local129);
				} else {
					Static112.aBooleanArrayArray1[local105][local108] = false;
				}
			}
		}
		for (local108 = 0; local108 < Static40.anInt859 + Static40.anInt859 + 1; local108++) {
			for (local119 = 0; local119 < Static40.anInt859 + Static40.anInt859 + 1; local119++) {
				Static190.aBooleanArrayArray2[local108][local119] = Static112.aBooleanArrayArray1[local108][local119] || Static112.aBooleanArrayArray1[local108 + 1][local119] || Static112.aBooleanArrayArray1[local108][local119 + 1] || Static112.aBooleanArrayArray1[local108 + 1][local119 + 1];
			}
		}
		Static55.method881();
		Static38.anInt819 = 0;
		for (local119 = Static174.anInt3527; local119 < Static76.anInt1501; local119++) {
			@Pc(281) Class3_Sub6[][] local281 = Static118.aClass3_Sub6ArrayArrayArray1[local119];
			for (local135 = Static81.anInt1615; local135 < Static105.anInt2110; local135++) {
				for (local141 = Static47.anInt969; local141 < Static119.anInt2415; local141++) {
					@Pc(293) Class3_Sub6 local293 = local281[local135][local141];
					if (local293 != null) {
						if (local293.anInt830 <= arg5 && Static190.aBooleanArrayArray2[local135 + Static40.anInt859 - Static145.anInt2993][local141 + Static40.anInt859 - Static31.anInt701]) {
							local293.aBoolean44 = true;
							local293.aBoolean45 = true;
							if (local293.anInt827 > 0) {
								local293.aBoolean46 = true;
							} else {
								local293.aBoolean46 = false;
							}
							Static38.anInt819++;
						} else {
							local293.aBoolean44 = false;
							local293.aBoolean45 = false;
							local293.anInt825 = 0;
						}
					}
				}
			}
		}
		@Pc(383) int local383;
		@Pc(388) int local388;
		@Pc(392) int local392;
		for (local129 = Static174.anInt3527; local129 < Static76.anInt1501; local129++) {
			@Pc(362) Class3_Sub6[][] local362 = Static118.aClass3_Sub6ArrayArrayArray1[local129];
			for (local141 = -Static40.anInt859; local141 <= 0; local141++) {
				local163 = Static145.anInt2993 + local141;
				local175 = Static145.anInt2993 - local141;
				if (local163 >= Static81.anInt1615 || local175 < Static105.anInt2110) {
					for (local383 = -Static40.anInt859; local383 <= 0; local383++) {
						local388 = Static31.anInt701 + local383;
						local392 = Static31.anInt701 - local383;
						@Pc(404) Class3_Sub6 local404;
						if (local163 >= Static81.anInt1615) {
							if (local388 >= Static47.anInt969) {
								local404 = local362[local163][local388];
								if (local404 != null && local404.aBoolean44) {
									Static97.method1401(local404, true);
								}
							}
							if (local392 < Static119.anInt2415) {
								local404 = local362[local163][local392];
								if (local404 != null && local404.aBoolean44) {
									Static97.method1401(local404, true);
								}
							}
						}
						if (local175 < Static105.anInt2110) {
							if (local388 >= Static47.anInt969) {
								local404 = local362[local175][local388];
								if (local404 != null && local404.aBoolean44) {
									Static97.method1401(local404, true);
								}
							}
							if (local392 < Static119.anInt2415) {
								local404 = local362[local175][local392];
								if (local404 != null && local404.aBoolean44) {
									Static97.method1401(local404, true);
								}
							}
						}
						if (Static38.anInt819 == 0) {
							Static1.aBoolean96 = false;
							return;
						}
					}
				}
			}
		}
		for (local135 = Static174.anInt3527; local135 < Static76.anInt1501; local135++) {
			@Pc(488) Class3_Sub6[][] local488 = Static118.aClass3_Sub6ArrayArrayArray1[local135];
			for (local163 = -Static40.anInt859; local163 <= 0; local163++) {
				local175 = Static145.anInt2993 + local163;
				local383 = Static145.anInt2993 - local163;
				if (local175 >= Static81.anInt1615 || local383 < Static105.anInt2110) {
					for (local388 = -Static40.anInt859; local388 <= 0; local388++) {
						local392 = Static31.anInt701 + local388;
						@Pc(518) int local518 = Static31.anInt701 - local388;
						@Pc(530) Class3_Sub6 local530;
						if (local175 >= Static81.anInt1615) {
							if (local392 >= Static47.anInt969) {
								local530 = local488[local175][local392];
								if (local530 != null && local530.aBoolean44) {
									Static97.method1401(local530, false);
								}
							}
							if (local518 < Static119.anInt2415) {
								local530 = local488[local175][local518];
								if (local530 != null && local530.aBoolean44) {
									Static97.method1401(local530, false);
								}
							}
						}
						if (local383 < Static105.anInt2110) {
							if (local392 >= Static47.anInt969) {
								local530 = local488[local383][local392];
								if (local530 != null && local530.aBoolean44) {
									Static97.method1401(local530, false);
								}
							}
							if (local518 < Static119.anInt2415) {
								local530 = local488[local383][local518];
								if (local530 != null && local530.aBoolean44) {
									Static97.method1401(local530, false);
								}
							}
						}
						if (Static38.anInt819 == 0) {
							Static1.aBoolean96 = false;
							return;
						}
					}
				}
			}
		}
		Static1.aBoolean96 = false;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(Z)V")
	public static void method2388() {
		for (@Pc(7) int local7 = -1; local7 < Static80.anInt1607; local7++) {
			@Pc(16) int local16;
			if (local7 == -1) {
				local16 = 2047;
			} else {
				local16 = Static76.anIntArray81[local7];
			}
			@Pc(24) Class26_Sub2_Sub1 local24 = Static146.aClass26_Sub2_Sub1Array1[local16];
			if (local24 != null) {
				Static78.method1142(1, local24);
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)I")
	public static int method2389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) long local15 = (long) (arg0 + (arg1 << 16));
		return Static33.aClass3_Sub3_Sub3_1 != null && local15 == Static33.aClass3_Sub3_Sub3_1.aLong147 ? Static80.aClass3_Sub4_2.anInt1758 * 99 / (Static80.aClass3_Sub4_2.aByteArray12.length - Static33.aClass3_Sub3_Sub3_1.aByte1) + 1 : 0;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BZLclient!oc;)V")
	public static void method2392(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class70 arg1) {
		@Pc(18) int local18 = Static83.aClass3_Sub3_Sub2_Sub4_Sub1_4.method3107(arg1, 250);
		@Pc(29) int local29 = Static83.aClass3_Sub3_Sub2_Sub4_Sub1_4.method3110(arg1, 250) * 13;
		Static104.method3079(6, 6, local18 + 4 + 4, 4 + 4 + local29, 0);
		Static104.method3097(6, 6, local18 + 4 + 4, local29 - -4 + 4, 16777215);
		Static83.aClass3_Sub3_Sub2_Sub4_Sub1_4.method3128(arg1, 10, 10, local18, local29, 16777215, -1, 1, 1, 0);
		Static5.method92(6, local18 + 8, 6, local29 + 8);
		if (!arg0) {
			Static150.method2199(local18, 10, 10, local29);
			return;
		}
		@Pc(118) Canvas local118 = Static211.aCanvas1;
		try {
			@Pc(121) Graphics local121 = local118.getGraphics();
			Static190.aClass22_1.method2338(local121);
		} catch (@Pc(129) Exception local129) {
			local118.repaint();
		}
	}
}

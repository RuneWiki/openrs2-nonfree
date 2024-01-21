import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!fg", name = "x", descriptor = "I")
	public static int anInt1322;

	@OriginalMember(owner = "client!fg", name = "y", descriptor = "Lclient!ud;")
	public static Class62_Sub1 aClass62_Sub1_37;

	@OriginalMember(owner = "client!fg", name = "s", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_510 = Static177.method3050("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)V")
	public static void method1022(@OriginalArg(0) int arg0) {
		@Pc(4) int[] local4 = Static125.aClass4_Sub1_Sub7_Sub2_4.anIntArray323;
		@Pc(11) int local11 = local4.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local4[local13] = 1;
		}
		@Pc(39) int local39;
		@Pc(41) int local41;
		for (@Pc(25) int local25 = 1; local25 < 103; local25++) {
			local39 = (52736 - local25 * 512) * 4 + 24628;
			for (local41 = 1; local41 < 103; local41++) {
				if ((Static53.aByteArrayArrayArray2[arg0][local41][local25] & 0x18) == 0) {
					Static67.method1474(local4, local39, arg0, local41, local25);
				}
				if (arg0 < 3 && (Static53.aByteArrayArrayArray2[arg0 + 1][local41][local25] & 0x8) != 0) {
					Static67.method1474(local4, local39, arg0 + 1, local41, local25);
				}
				local39 += 4;
			}
		}
		Static125.aClass4_Sub1_Sub7_Sub2_4.method2530();
		local41 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		local39 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D) + 238 + -10 << 8) + 238 - 10;
		@Pc(148) int local148;
		for (@Pc(144) int local144 = 1; local144 < 103; local144++) {
			for (local148 = 1; local148 < 103; local148++) {
				if ((Static53.aByteArrayArrayArray2[arg0][local148][local144] & 0x18) == 0) {
					Static26.method437(arg0, local144, local148, local41, local39);
				}
				if (arg0 < 3 && (Static53.aByteArrayArrayArray2[arg0 + 1][local148][local144] & 0x8) != 0) {
					Static26.method437(arg0 + 1, local144, local148, local41, local39);
				}
			}
		}
		Static82.anInt2112 = 0;
		for (local148 = 0; local148 < 104; local148++) {
			for (@Pc(224) int local224 = 0; local224 < 104; local224++) {
				@Pc(231) long local231 = Static78.method1588(Static73.anInt1873, local148, local224);
				if (local231 != 0L) {
					@Pc(247) int local247 = Static113.method2090((int) (local231 >>> 32) & Integer.MAX_VALUE).anInt4184;
					if (local247 >= 0) {
						@Pc(254) int local254 = local148;
						@Pc(256) int local256 = local224;
						if (local247 != 22 && local247 != 29 && local247 != 34 && local247 != 36 && local247 != 46 && local247 != 47 && local247 != 48) {
							@Pc(284) int[][] local284 = Static29.aClass58Array1[Static73.anInt1873].anIntArrayArray20;
							for (@Pc(286) int local286 = 0; local286 < 10; local286++) {
								@Pc(293) int local293 = (int) (Math.random() * 4.0D);
								if (local293 == 0 && local254 > 0 && local254 > local148 - 3 && (local284[local254 - 1][local256] & 0x12C0108) == 0) {
									local254--;
								}
								if (local293 == 1 && local254 < 103 && local148 + 3 > local254 && (local284[local254 + 1][local256] & 0x12C0180) == 0) {
									local254++;
								}
								if (local293 == 2 && local256 > 0 && local224 - 3 < local256 && (local284[local254][local256 - 1] & 0x12C0102) == 0) {
									local256--;
								}
								if (local293 == 3 && local256 < 103 && local256 < local224 + 3 && (local284[local254][local256 + 1] & 0x12C0120) == 0) {
									local256++;
								}
							}
						}
						Static91.aClass4_Sub1_Sub7_Sub2Array7[Static82.anInt2112] = Static63.aClass4_Sub1_Sub7_Sub2Array5[local247];
						Static140.anIntArray314[Static82.anInt2112] = local254;
						Static186.anIntArray437[Static82.anInt2112] = local256;
						Static82.anInt2112++;
					}
				}
			}
		}
		Static69.aClass42_1.method3015();
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILclient!a;)Z")
	public static boolean method1024(@OriginalArg(1) Class1 arg0) {
		if (arg0.anIntArray5 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anIntArray5.length; local17++) {
			@Pc(24) int local24 = Static90.method1796(arg0, local17);
			@Pc(29) int local29 = arg0.anIntArray8[local17];
			if (arg0.anIntArray5[local17] == 2) {
				if (local29 <= local24) {
					return false;
				}
			} else if (arg0.anIntArray5[local17] == 3) {
				if (local24 <= local29) {
					return false;
				}
			} else if (arg0.anIntArray5[local17] == 4) {
				if (local24 == local29) {
					return false;
				}
			} else if (local29 != local24) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IJ)V")
	public static void method1025(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static126.method2226(arg0 - 1L);
			Static126.method2226(1L);
		} else {
			Static126.method2226(arg0);
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!nh;Lclient!nh;B)V")
	public static void method1026(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class62 arg1) {
		Static108.aClass62_29 = arg1;
		Static149.aClass62_38 = arg0;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IBIII)V")
	public static void method1027(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}

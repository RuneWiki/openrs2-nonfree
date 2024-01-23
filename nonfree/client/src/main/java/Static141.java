import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "Lclient!pa;")
	public static Class1_Sub2_Sub1 aClass1_Sub2_Sub1_31;

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
	public static int anInt2839;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "Lclient!qj;")
	public static Class148 aClass148_7 = new Class148(128);

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "J")
	public static long aLong99 = 0L;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "Z")
	public static boolean aBoolean179 = false;

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "J")
	public static long aLong100 = 0L;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIIIB)Z")
	public static boolean method2436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(15) long local15 = Static30.method495(arg2, arg1 + 0, arg0);
		@Pc(40) int local40;
		@Pc(54) int local54;
		@Pc(47) int local47;
		@Pc(60) Class71 local60;
		@Pc(77) int local77;
		@Pc(85) int[] local85;
		@Pc(101) int local101;
		if (local15 != 0L) {
			local40 = (int) local15 >> 20 & 0x3;
			local47 = (int) (local15 >>> 32) & Integer.MAX_VALUE;
			local54 = (int) local15 >> 14 & 0x1F;
			local60 = Static255.method4052(local47);
			if (local60.anInt2375 == -1) {
				local77 = arg4;
				if (local15 > 0L) {
					local77 = arg3;
				}
				local85 = Static25.anIntArray27;
				local101 = (103 - arg0) * 4 * 512 + arg1 * 4 + 24624;
				if (local54 == 0 || local54 == 2) {
					if (local40 == 0) {
						local85[local101] = local77;
						local85[local101 + 512] = local77;
						local85[local101 + 1024] = local77;
						local85[local101 + 1536] = local77;
					} else if (local40 == 1) {
						local85[local101] = local77;
						local85[local101 + 1] = local77;
						local85[local101 + 2] = local77;
						local85[local101 + 3] = local77;
					} else if (local40 == 2) {
						local85[local101 + 3] = local77;
						local85[local101 + 3 + 512] = local77;
						local85[local101 + 1027] = local77;
						local85[local101 + 1539] = local77;
					} else if (local40 == 3) {
						local85[local101 + 1536] = local77;
						local85[local101 + 1 + 1536] = local77;
						local85[local101 + 2 + 1536] = local77;
						local85[local101 + 1536 + 3] = local77;
					}
				}
				if (local54 == 3) {
					if (local40 == 0) {
						local85[local101] = local77;
					} else if (local40 == 1) {
						local85[local101 + 3] = local77;
					} else if (local40 == 2) {
						local85[local101 + 1536 + 3] = local77;
					} else if (local40 == 3) {
						local85[local101 + 1536] = local77;
					}
				}
				if (local54 == 2) {
					if (local40 == 3) {
						local85[local101] = local77;
						local85[local101 + 512] = local77;
						local85[local101 + 1024] = local77;
						local85[local101 + 1536] = local77;
					} else if (local40 == 0) {
						local85[local101] = local77;
						local85[local101 + 1] = local77;
						local85[local101 + 2] = local77;
						local85[local101 + 3] = local77;
					} else if (local40 == 1) {
						local85[local101 + 3] = local77;
						local85[local101 + 3 + 512] = local77;
						local85[local101 + 1024 + 3] = local77;
						local85[local101 + 1536 + 3] = local77;
					} else if (local40 == 2) {
						local85[local101 + 1536] = local77;
						local85[local101 + 1537] = local77;
						local85[local101 + 1536 + 2] = local77;
						local85[local101 + 3 + 1536] = local77;
					}
				}
			} else if (!Static274.method4264(arg1, local60, arg0, local40)) {
				return false;
			}
		}
		local15 = Static86.method1602(arg2, arg1 + 0, arg0);
		if (local15 != 0L) {
			local40 = (int) local15 >> 20 & 0x3;
			local54 = (int) local15 >> 14 & 0x1F;
			local47 = Integer.MAX_VALUE & (int) (local15 >>> 32);
			local60 = Static255.method4052(local47);
			if (local60.anInt2375 == -1) {
				if (local54 == 9) {
					local77 = 15658734;
					if (local15 > 0L) {
						local77 = 15597568;
					}
					local85 = Static25.anIntArray27;
					local101 = arg1 * 4 + 4 * 512 * (103 - arg0) + 24624;
					if (local40 == 0 || local40 == 2) {
						local85[local101 + 1536] = local77;
						local85[local101 + 1024 + 1] = local77;
						local85[local101 + 512 + 2] = local77;
						local85[local101 + 3] = local77;
					} else {
						local85[local101] = local77;
						local85[local101 + 1 + 512] = local77;
						local85[local101 + 1024 + 2] = local77;
						local85[local101 + 3 + 1536] = local77;
					}
				}
			} else if (!Static274.method4264(arg1, local60, arg0, local40)) {
				return false;
			}
		}
		local15 = Static38.method3321(arg2, arg1 + 0, arg0);
		if (local15 != 0L) {
			local40 = (int) local15 >> 20 & 0x3;
			local54 = Integer.MAX_VALUE & (int) (local15 >>> 32);
			@Pc(606) Class71 local606 = Static255.method4052(local54);
			if (local606.anInt2375 != -1 && !Static274.method4264(arg1, local606, arg0, local40)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(DB)V")
	public static void method2437(@OriginalArg(0) double arg0) {
		if (Static175.aDouble1 == arg0) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 256; local16++) {
			@Pc(31) int local31 = (int) (Math.pow((double) local16 / 255.0D, arg0) * 255.0D);
			Static155.anIntArray258[local16] = local31 > 255 ? 255 : local31;
		}
		Static175.aDouble1 = arg0;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)Z")
	public static boolean method2439() {
		if (Static96.aBoolean106) {
			try {
				Static321.method2506("showVideoAd", Static26.aClass154_1.anApplet1);
				return true;
			} catch (@Pc(23) Throwable local23) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
	public static void method2440() {
		while (true) {
			@Pc(10) Class1_Sub32 local10 = (Class1_Sub32) Static125.aClass59_21.method1700();
			if (local10 == null) {
				return;
			}
			@Pc(28) Class15_Sub5 local28;
			@Pc(24) int local24;
			if (local10.anInt5492 >= 0) {
				local24 = local10.anInt5492 - 1;
				local28 = Static83.aClass15_Sub5_Sub1Array1[local24];
			} else {
				local24 = -local10.anInt5492 - 1;
				if (local24 == Static35.anInt3966) {
					local28 = Static90.aClass15_Sub5_Sub2_2;
				} else {
					local28 = Static17.aClass15_Sub5_Sub2Array1[local24];
				}
			}
			if (local28 != null) {
				@Pc(55) Class71 local55 = Static255.method4052(local10.anInt5501);
				@Pc(70) int local70;
				@Pc(73) int local73;
				if (local10.anInt5484 == 1 || local10.anInt5484 == 3) {
					local70 = local55.anInt2385;
					local73 = local55.anInt2377;
				} else {
					local70 = local55.anInt2377;
					local73 = local55.anInt2385;
				}
				@Pc(88) int local88 = (local70 >> 1) + local10.anInt5499;
				if (Static65.anInt1300 < 3) {
				}
				@Pc(102) int local102 = local10.anInt5486 + (local73 + 1 >> 1);
				@Pc(106) int[][] local106 = Static24.anIntArrayArrayArray2[Static65.anInt1300];
				@Pc(115) int local115 = local10.anInt5499 + (local70 + 1 >> 1);
				@Pc(122) int local122 = (local73 >> 1) + local10.anInt5486;
				@Pc(148) int local148 = local106[local115][local102] + local106[local115][local122] + local106[local88][local122] + local106[local88][local102] >> 2;
				@Pc(150) Class15 local150 = null;
				@Pc(155) int local155 = Static28.anIntArray28[local10.anInt5488];
				if (local155 == 0) {
					@Pc(167) Class160 local167 = Static281.method4343(Static65.anInt1300, local10.anInt5499, local10.anInt5486);
					if (local167 != null) {
						local150 = local167.aClass15_7;
					}
				} else if (local155 == 1) {
					@Pc(224) Class52 local224 = Static75.method1471(Static65.anInt1300, local10.anInt5499, local10.anInt5486);
					if (local224 != null) {
						local150 = local224.aClass15_2;
					}
				} else if (local155 == 2) {
					@Pc(190) Class161 local190 = Static178.method2963(Static65.anInt1300, local10.anInt5499, local10.anInt5486);
					if (local190 != null) {
						local150 = local190.aClass15_9;
					}
				} else if (local155 == 3) {
					@Pc(210) Class36 local210 = Static62.method1134(Static65.anInt1300, local10.anInt5499, local10.anInt5486);
					if (local210 != null) {
						local150 = local210.aClass15_1;
					}
				}
				if (local150 != null) {
					Static310.method4731(local155, 0, -1, local10.anInt5499, local10.anInt5487 + 1, Static65.anInt1300, 0, local10.anInt5486, local10.anInt5491 + 1);
					local28.anInt5514 = local70 * 64 + local10.anInt5499 * 128;
					local28.anInt5588 = local10.anInt5487 + Static313.anInt2966;
					local28.anObject7 = local150;
					local28.anInt5582 = local10.anInt5491 + Static313.anInt2966;
					local28.anInt5565 = local148;
					local28.anInt5511 = local73 * 64 + local10.anInt5486 * 128;
					@Pc(293) int local293 = local10.anInt5490;
					@Pc(296) int local296 = local10.anInt5493;
					@Pc(299) int local299 = local10.anInt5495;
					@Pc(302) int local302 = local10.anInt5500;
					@Pc(311) int local311;
					if (local296 > local293) {
						local311 = local296;
						local296 = local293;
						local293 = local311;
					}
					local28.anInt5545 = local10.anInt5499 + local296;
					if (local299 > local302) {
						local311 = local299;
						local299 = local302;
						local302 = local311;
					}
					local28.anInt5551 = local10.anInt5486 + local299;
					local28.anInt5570 = local293 + local10.anInt5499;
					local28.anInt5595 = local10.anInt5486 + local302;
				}
			}
		}
	}
}

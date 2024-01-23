import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "B")
	public static byte aByte12;

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "Z")
	public static boolean aBoolean197;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "Lclient!fl;")
	public static Class51 aClass51_3;

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
	public static int anInt2993 = 0;

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	public static void method2357(@OriginalArg(0) int arg0) {
		Static122.anInt2663 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static247.anInt4706; local3++) {
			for (@Pc(8) int local8 = 0; local8 < Static24.anInt439; local8++) {
				if (Static127.aClass4_Sub11ArrayArrayArray1[arg0][local3][local8] == null) {
					Static127.aClass4_Sub11ArrayArrayArray1[arg0][local3][local8] = new Class4_Sub11(arg0, local3, local8);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BII)V")
	public static void method2365(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) int local21;
		if (arg1 != Static2.anInt19) {
			Static192.anIntArray318 = new int[arg1];
			for (local21 = 0; local21 < arg1; local21++) {
				Static192.anIntArray318[local21] = (local21 << 12) / arg1;
			}
			Static296.anInt1764 = arg1 * 32;
			Static168.anInt3337 = arg1 - 1;
			Static2.anInt19 = arg1;
		}
		if (arg0 == Static16.anInt308) {
			return;
		}
		if (arg0 == Static2.anInt19) {
			Static273.anIntArray127 = Static192.anIntArray318;
		} else {
			Static273.anIntArray127 = new int[arg0];
			for (local21 = 0; local21 < arg0; local21++) {
				Static273.anIntArray127[local21] = (local21 << 12) / arg0;
			}
		}
		Static16.anInt308 = arg0;
		Static137.anInt2812 = arg0 - 1;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIZIIIIII)V")
	public static void method2366(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int arg7, @OriginalArg(11) int arg8) {
		@Pc(10) int local10 = arg5 - arg2;
		@Pc(12) int local12 = -1;
		@Pc(16) int local16 = arg0 - arg8;
		if (Static17.anInt372 > 0) {
			if (Static120.anInt2640 > 10) {
				local12 = 50 + 50 - Static120.anInt2640 * 5;
			} else {
				local12 = Static120.anInt2640 * 5;
			}
		}
		@Pc(42) int local42 = 983040 / arg6;
		@Pc(46) int local46 = 983040 / arg1;
		for (@Pc(49) int local49 = -local42; local49 < local42 + local10; local49++) {
			@Pc(62) int local62 = local49 * arg6 >> 16;
			@Pc(72) int local72 = (local49 + 1) * arg6 >> 16;
			@Pc(77) int local77 = local72 - local62;
			if (local77 > 0) {
				@Pc(85) int local85 = local49 + arg2 >> 6;
				local62 += arg7;
				if (local85 >= 0 && Static214.anIntArrayArrayArray10.length - 1 >= local85) {
					@Pc(114) int[][] local114 = Static214.anIntArrayArrayArray10[local85];
					for (@Pc(117) int local117 = -local46; local117 < local16 + local46; local117++) {
						@Pc(134) int local134 = arg1 * local117 >> 16;
						@Pc(144) int local144 = arg1 * (local117 + 1) >> 16;
						@Pc(149) int local149 = local144 - local134;
						if (local149 > 0) {
							local134 += arg4;
							@Pc(167) int local167 = local117 + arg8 >> 6;
							if (local167 >= 0 && local167 <= local114.length - 1 && local114[local167] != null) {
								@Pc(203) int local203 = (local49 + arg2 & 0x3F) + ((local117 + arg8 & 0x3F) << 6);
								@Pc(209) int local209 = local114[local167][local203];
								if (local209 != 0) {
									@Pc(220) Class47 local220 = Static170.method2683(local209 - 1);
									if (!Static231.aBooleanArray22[local220.anInt1365]) {
										if (local12 != -1 && Static79.anInt1519 == local220.anInt1365) {
											@Pc(249) Class4_Sub13 local249 = new Class4_Sub13();
											local249.anInt1182 = local220.anInt1365;
											local249.anInt1187 = local62;
											local249.anInt1184 = local134;
											Static51.aClass10_9.method184(local249);
										} else {
											Static115.aClass4_Sub2_Sub1_Sub1Array4[local220.anInt1365].method3454(local62 - 7, local134 - 7);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		for (@Pc(274) Class4_Sub13 local274 = (Class4_Sub13) Static51.aClass10_9.method190(); local274 != null; local274 = (Class4_Sub13) Static51.aClass10_9.method191()) {
			Static166.method2625(local274.anInt1187, local274.anInt1184, 15, local12);
			Static166.method2625(local274.anInt1187, local274.anInt1184, 13, local12);
			Static166.method2625(local274.anInt1187, local274.anInt1184, 11, local12);
			Static166.method2625(local274.anInt1187, local274.anInt1184, 9, local12);
			Static115.aClass4_Sub2_Sub1_Sub1Array4[local274.anInt1182].method3454(local274.anInt1187 - 7, local274.anInt1184 + -7);
		}
		Static51.aClass10_9.method192();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
	public static void method2368() {
		aByteArrayArrayArray8 = null;
		aClass51_3 = null;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)I")
	public static int method2369(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLclient!qb;)I")
	public static int method2370(@OriginalArg(1) Class12_Sub3_Sub2 arg0) {
		@Pc(13) int local13 = arg0.anInt4216;
		@Pc(17) Class72 local17 = arg0.method3361();
		if (local17.anInt2564 == arg0.anInt4127) {
			local13 = arg0.anInt4211;
		} else if (local17.anInt2556 == arg0.anInt4127 || local17.anInt2582 == arg0.anInt4127 || arg0.anInt4127 == local17.anInt2549 || local17.anInt2559 == arg0.anInt4127) {
			local13 = arg0.anInt4212;
		} else if (arg0.anInt4127 == local17.anInt2566 || local17.anInt2569 == arg0.anInt4127 || local17.anInt2550 == arg0.anInt4127 || local17.anInt2565 == arg0.anInt4127) {
			local13 = arg0.anInt4195;
		}
		return local13;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
	public static int anInt1128;

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
	public static int anInt1137;

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "Lclient!im;")
	public static Class72 aClass72_1 = new Class72();

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "[Lclient!sf;")
	public static Class4_Sub2_Sub19[] aClass4_Sub2_Sub19Array1 = new Class4_Sub2_Sub19[14];

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "[C")
	public static char[] aCharArray9 = new char[128];

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLclient!lc;)V")
	public static void method922(@OriginalArg(1) Class98 arg0) {
		Static276.aClass98_162 = arg0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZIILclient!cc;I)V")
	public static void method923(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class22 arg3) {
		@Pc(8) int local8 = arg3.anInt546;
		if (arg3.aByte3 == 0) {
			arg3.anInt546 = arg3.anInt600;
		} else if (arg3.aByte3 == 1) {
			arg3.anInt546 = arg1 - arg3.anInt600;
		} else if (arg3.aByte3 == 2) {
			arg3.anInt546 = arg3.anInt600 * arg1 >> 14;
		} else if (arg3.aByte3 == 3) {
			if (arg3.anInt542 == 2) {
				arg3.anInt546 = arg3.anInt600 * 32 + (arg3.anInt600 - 1) * arg3.anInt611;
			} else if (arg3.anInt542 == 7) {
				arg3.anInt546 = arg3.anInt600 * 115 + arg3.anInt611 * (arg3.anInt600 - 1);
			}
		}
		@Pc(97) int local97 = arg3.anInt602;
		if (arg3.aByte5 == 0) {
			arg3.anInt602 = arg3.anInt634;
		} else if (arg3.aByte5 == 1) {
			arg3.anInt602 = arg2 - arg3.anInt634;
		} else if (arg3.aByte5 == 2) {
			arg3.anInt602 = arg2 * arg3.anInt634 >> 14;
		} else if (arg3.aByte5 == 3) {
			if (arg3.anInt542 == 2) {
				arg3.anInt602 = arg3.anInt634 * 32 + (arg3.anInt634 - 1) * arg3.anInt604;
			} else if (arg3.anInt542 == 7) {
				arg3.anInt602 = arg3.anInt634 * 12 + (arg3.anInt634 - 1) * arg3.anInt604;
			}
		}
		if (arg3.aByte3 == 4) {
			arg3.anInt546 = arg3.anInt548 * arg3.anInt602 / arg3.anInt559;
		}
		if (arg3.aByte5 == 4) {
			arg3.anInt602 = arg3.anInt559 * arg3.anInt546 / arg3.anInt548;
		}
		if (Static255.aBoolean311 && (Static40.method681(arg3).anInt3558 != 0 || arg3.anInt542 == 0)) {
			if (arg3.anInt602 < 5 && arg3.anInt546 < 5) {
				arg3.anInt546 = 5;
				arg3.anInt602 = 5;
			} else {
				if (arg3.anInt546 <= 0) {
					arg3.anInt546 = 5;
				}
				if (arg3.anInt602 <= 0) {
					arg3.anInt602 = 5;
				}
			}
		}
		if (arg3.anInt612 == 1337) {
			Static221.aClass22_18 = arg3;
		}
		if (arg0 && arg3.anObjectArray27 != null && (arg3.anInt546 != local8 || arg3.anInt602 != local97)) {
			@Pc(298) Class4_Sub22 local298 = new Class4_Sub22();
			local298.anObjectArray32 = arg3.anObjectArray27;
			local298.aClass22_15 = arg3;
			Static243.aClass10_52.method184(local298);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
	public static void method924() {
		aClass72_1 = null;
		aClass4_Sub2_Sub19Array1 = null;
		aCharArray9 = null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!cc;B)Z")
	public static boolean method925(@OriginalArg(0) Class22 arg0) {
		if (arg0.anInt612 == 205) {
			Static117.anInt2592 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V")
	public static void method926(@OriginalArg(1) int arg0) {
		if (arg0 > 256) {
			arg0 = 256;
		}
		if (arg0 > 10) {
			arg0 = 10;
		}
		Static277.anInt5178 += arg0 * 128;
		@Pc(38) int local38;
		if (Static277.anInt5178 > Static94.anIntArray210.length) {
			Static277.anInt5178 -= Static94.anIntArray210.length;
			local38 = (int) (Math.random() * 12.0D);
			Static158.method2493(Static68.aClass59_Sub2Array2[local38]);
		}
		@Pc(47) int local47 = arg0 * 128;
		@Pc(54) int local54 = (256 - arg0) * 128;
		local38 = 0;
		@Pc(58) int local58;
		@Pc(88) int local88;
		for (local58 = 0; local58 < local54; local58++) {
			local88 = Static165.anIntArray292[local47 + local38] - Static94.anIntArray210[Static94.anIntArray210.length - 1 & local38 - -Static277.anInt5178] * arg0 / 6;
			if (local88 < 0) {
				local88 = 0;
			}
			Static165.anIntArray292[local38++] = local88;
		}
		@Pc(118) int local118;
		@Pc(128) int local128;
		for (local58 = 256 - arg0; local58 < 256; local58++) {
			local88 = local58 * 128;
			for (local118 = 0; local118 < 128; local118++) {
				local128 = (int) (Math.random() * 100.0D);
				if (local128 < 50 && local118 > 10 && local118 < 118) {
					Static165.anIntArray292[local118 + local88] = 255;
				} else {
					Static165.anIntArray292[local118 + local88] = 0;
				}
			}
		}
		for (local58 = 0; local58 < 256 - arg0; local58++) {
			Static212.anIntArray382[local58] = Static212.anIntArray382[local58 + arg0];
		}
		for (local58 = 256 - arg0; local58 < 256; local58++) {
			Static212.anIntArray382[local58] = (int) (Math.sin((double) Static18.anInt382 / 14.0D) * 16.0D + Math.sin((double) Static18.anInt382 / 15.0D) * 14.0D + Math.sin((double) Static18.anInt382 / 16.0D) * 12.0D);
			Static18.anInt382++;
		}
		local58 = (arg0 + (Static104.anInt2226 & 0x1)) / 2;
		Static122.anInt2656 += arg0;
		if (local58 <= 0) {
			return;
		}
		for (local88 = 0; local88 < Static122.anInt2656; local88++) {
			local118 = (int) (Math.random() * 124.0D) + 2;
			local128 = (int) (Math.random() * 128.0D) + 128;
			Static165.anIntArray292[(local128 << 7) + local118] = 192;
		}
		Static122.anInt2656 = 0;
		@Pc(287) int local287;
		for (local88 = 0; local88 < 256; local88++) {
			local118 = 0;
			local128 = local88 * 128;
			for (local287 = -local58; local287 < 128; local287++) {
				if (local58 + local287 < 128) {
					local118 += Static165.anIntArray292[local128 + local287 + local58];
				}
				if (local287 - local58 - 1 >= 0) {
					local118 -= Static165.anIntArray292[local128 + local287 - local58 - 1];
				}
				if (local287 >= 0) {
					Static187.anIntArray314[local128 + local287] = local118 / (local58 * 2 + 1);
				}
			}
		}
		for (local88 = 0; local88 < 128; local88++) {
			local118 = 0;
			for (local128 = -local58; local128 < 256; local128++) {
				local287 = local128 * 128;
				if (local58 + local128 < 256) {
					local118 += Static187.anIntArray314[local88 + local287 + local58 * 128];
				}
				if (local128 - local58 - 1 >= 0) {
					local118 -= Static187.anIntArray314[local88 + local287 - local58 * 128 - 128];
				}
				if (local128 >= 0) {
					Static165.anIntArray292[local287 + local88] = local118 / (local58 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V")
	public static void method927() {
		Static65.aClass33_10.method843();
		Static269.aClass33_39.method843();
		Static102.aClass33_16.method843();
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)Lclient!sf;")
	public static Class4_Sub2_Sub19 method928(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub2_Sub19 local10 = (Class4_Sub2_Sub19) Static295.aClass33_40.method841((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static115.method1984(arg0, Static271.aClass98_159, Static242.aClass98_149);
		if (local10 != null) {
			Static295.aClass33_40.method845(local10, (long) arg0);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public static void method929(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class22 local10 = Static172.method2702(arg3, arg0);
		if (local10 == null) {
			return;
		}
		if (local10.anObjectArray10 != null) {
			@Pc(23) Class4_Sub22 local23 = new Class4_Sub22();
			local23.anInt3409 = arg1;
			local23.aClass22_15 = local10;
			local23.aString111 = arg2;
			local23.anObjectArray32 = local10.anObjectArray10;
			Static125.method2089(local23);
		}
		@Pc(41) boolean local41 = true;
		if (local10.anInt612 > 0) {
			local41 = method925(local10);
		}
		if (!local41 || !Static40.method681(local10).method2833(arg1 - 1)) {
			return;
		}
		if (arg1 == 1) {
			Static142.aClass4_Sub17_Sub1_3.method1905(170);
			Static142.aClass4_Sub17_Sub1_3.method1854(arg3);
			Static142.aClass4_Sub17_Sub1_3.method1875(arg0);
		}
		if (arg1 == 2) {
			Static142.aClass4_Sub17_Sub1_3.method1905(43);
			Static142.aClass4_Sub17_Sub1_3.method1854(arg3);
			Static142.aClass4_Sub17_Sub1_3.method1875(arg0);
		}
		if (arg1 == 3) {
			Static142.aClass4_Sub17_Sub1_3.method1905(68);
			Static142.aClass4_Sub17_Sub1_3.method1854(arg3);
			Static142.aClass4_Sub17_Sub1_3.method1875(arg0);
		}
		if (arg1 == 4) {
			Static142.aClass4_Sub17_Sub1_3.method1905(155);
			Static142.aClass4_Sub17_Sub1_3.method1854(arg3);
			Static142.aClass4_Sub17_Sub1_3.method1875(arg0);
		}
		if (arg1 == 5) {
			Static142.aClass4_Sub17_Sub1_3.method1905(191);
			Static142.aClass4_Sub17_Sub1_3.method1854(arg3);
			Static142.aClass4_Sub17_Sub1_3.method1875(arg0);
		}
		if (arg1 == 6) {
			Static142.aClass4_Sub17_Sub1_3.method1905(60);
			Static142.aClass4_Sub17_Sub1_3.method1854(arg3);
			Static142.aClass4_Sub17_Sub1_3.method1875(arg0);
		}
		if (arg1 == 7) {
			Static142.aClass4_Sub17_Sub1_3.method1905(34);
			Static142.aClass4_Sub17_Sub1_3.method1854(arg3);
			Static142.aClass4_Sub17_Sub1_3.method1875(arg0);
		}
		if (arg1 == 8) {
			Static142.aClass4_Sub17_Sub1_3.method1905(194);
			Static142.aClass4_Sub17_Sub1_3.method1854(arg3);
			Static142.aClass4_Sub17_Sub1_3.method1875(arg0);
		}
		if (arg1 == 9) {
			Static142.aClass4_Sub17_Sub1_3.method1905(253);
			Static142.aClass4_Sub17_Sub1_3.method1854(arg3);
			Static142.aClass4_Sub17_Sub1_3.method1875(arg0);
		}
		if (arg1 == 10) {
			Static142.aClass4_Sub17_Sub1_3.method1905(30);
			Static142.aClass4_Sub17_Sub1_3.method1854(arg3);
			Static142.aClass4_Sub17_Sub1_3.method1875(arg0);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
	public static int anInt2091;

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
	public static int anInt2093;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
	public static int anInt2094;

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
	public static int anInt2099;

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
	public static int anInt2101;

	@OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
	public static int anInt2102;

	@OriginalMember(owner = "client!sd", name = "w", descriptor = "I")
	public static int anInt2104;

	@OriginalMember(owner = "client!sd", name = "D", descriptor = "I")
	public static int anInt2108;

	@OriginalMember(owner = "client!sd", name = "E", descriptor = "I")
	public static int anInt2109;

	@OriginalMember(owner = "client!sd", name = "F", descriptor = "I")
	public static int anInt2110;

	@OriginalMember(owner = "client!sd", name = "J", descriptor = "I")
	public static int anInt2113;

	@OriginalMember(owner = "client!sd", name = "K", descriptor = "I")
	public static int anInt2114;

	@OriginalMember(owner = "client!sd", name = "M", descriptor = "I")
	public static int anInt2115;

	@OriginalMember(owner = "client!sd", name = "S", descriptor = "I")
	public static int anInt2117;

	@OriginalMember(owner = "client!sd", name = "W", descriptor = "I")
	private static int anInt2119;

	@OriginalMember(owner = "client!sd", name = "Y", descriptor = "I")
	private static int anInt2120;

	@OriginalMember(owner = "client!sd", name = "ab", descriptor = "I")
	private static int anInt2121;

	@OriginalMember(owner = "client!sd", name = "bb", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!sd", name = "cb", descriptor = "I")
	private static int anInt2122;

	@OriginalMember(owner = "client!sd", name = "eb", descriptor = "I")
	private static int anInt2123;

	@OriginalMember(owner = "client!sd", name = "hb", descriptor = "I")
	private static int anInt2124;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)I", line = 330)
	public static int method1420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = (127 - arg1) * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([IIIII)V", line = 365)
	public static void method1422(@OriginalArg(0) int[] arg0) {
		anInt2124 = 0;
		anInt2121 = 0;
		anInt2123 = 512;
		anInt2119 = 334;
		anInt2120 = 256;
		anInt2122 = 167;
		@Pc(21) boolean[][][][] local21 = new boolean[9][32][53][53];
		@Pc(26) int local26;
		@Pc(49) int local49;
		@Pc(53) int local53;
		@Pc(55) int local55;
		@Pc(63) int local63;
		@Pc(67) int local67;
		for (@Pc(23) int local23 = 128; local23 <= 384; local23 += 32) {
			for (local26 = 0; local26 < 2048; local26 += 64) {
				anInt2114 = Class2_Sub2_Sub12_Sub4.anIntArray386[local23];
				anInt2104 = Class2_Sub2_Sub12_Sub4.anIntArray402[local23];
				anInt2099 = Class2_Sub2_Sub12_Sub4.anIntArray386[local26];
				anInt2101 = Class2_Sub2_Sub12_Sub4.anIntArray402[local26];
				local49 = (local23 - 128) / 32;
				local53 = local26 / 64;
				for (local55 = -26; local55 <= 26; local55++) {
					for (@Pc(58) int local58 = -26; local58 <= 26; local58++) {
						local63 = local55 * 128;
						local67 = local58 * 128;
						@Pc(69) boolean local69 = false;
						for (@Pc(72) int local72 = -500; local72 <= 800; local72 += 128) {
							if (method1424(local63, arg0[local49] + local72, local67)) {
								local69 = true;
								break;
							}
						}
						local21[local49][local53][local55 + 25 + 1][local58 + 25 + 1] = local69;
					}
				}
			}
		}
		for (local26 = 0; local26 < 8; local26++) {
			for (local49 = 0; local49 < 32; local49++) {
				for (local53 = -25; local53 < 25; local53++) {
					for (local55 = -25; local55 < 25; local55++) {
						@Pc(137) boolean local137 = false;
						label76: for (local63 = -1; local63 <= 1; local63++) {
							for (local67 = -1; local67 <= 1; local67++) {
								if (local21[local26][local49][local53 + local63 + 25 + 1][local55 + local67 + 25 + 1]) {
									local137 = true;
									break label76;
								}
								if (local21[local26][(local49 + 1) % 31][local53 + local63 + 25 + 1][local55 + local67 + 25 + 1]) {
									local137 = true;
									break label76;
								}
								if (local21[local26 + 1][local49][local53 + local63 + 25 + 1][local55 + local67 + 25 + 1]) {
									local137 = true;
									break label76;
								}
								if (local21[local26 + 1][(local49 + 1) % 31][local53 + local63 + 25 + 1][local55 + local67 + 25 + 1]) {
									local137 = true;
									break label76;
								}
							}
						}
						Class55.aBooleanArrayArrayArrayArray1[local26][local49][local53 + 25][local55 + 25] = local137;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "(III)Z", line = 538)
	private static boolean method1424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = arg2 * anInt2099 + arg0 * anInt2101 >> 16;
		@Pc(19) int local19 = arg2 * anInt2101 - arg0 * anInt2099 >> 16;
		@Pc(29) int local29 = arg1 * anInt2114 + local19 * anInt2104 >> 16;
		@Pc(39) int local39 = arg1 * anInt2104 - local19 * anInt2114 >> 16;
		if (local29 >= 50 && local29 <= 3500) {
			@Pc(55) int local55 = anInt2120 + (local9 << 9) / local29;
			@Pc(63) int local63 = anInt2122 + (local39 << 9) / local29;
			return local55 >= anInt2124 && local55 <= anInt2123 && local63 >= anInt2121 && local63 <= anInt2119;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "()V", line = 975)
	public static void method1431() {
		Class55.aClass37Array3 = null;
		Class55.anIntArray455 = null;
		Class55.anIntArray457 = null;
		Class55.anIntArray456 = null;
		Class55.anIntArray459 = null;
		Class55.anIntArray458 = null;
		Class55.aClass54ArrayArray1 = null;
		Class55.aClass54Array1 = null;
		Class55.aClass44_6 = null;
		Class55.anIntArray468 = null;
		Class55.anIntArray463 = null;
		Class55.anIntArray464 = null;
		Class55.anIntArray466 = null;
		Class55.anIntArray462 = null;
		Class55.anIntArray467 = null;
		Class55.anIntArray465 = null;
		Class55.aBooleanArrayArrayArrayArray1 = null;
		aBooleanArrayArray1 = null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIII)V", line = 1088)
	public static void method1433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Class54 local3 = new Class54();
		local3.anInt2070 = arg2 / 128;
		local3.anInt2072 = arg3 / 128;
		local3.anInt2069 = arg4 / 128;
		local3.anInt2071 = arg5 / 128;
		local3.anInt2089 = arg1;
		local3.anInt2074 = arg2;
		local3.anInt2084 = arg3;
		local3.anInt2076 = arg4;
		local3.anInt2088 = arg5;
		local3.anInt2090 = arg6;
		local3.anInt2086 = arg7;
		Class55.aClass54ArrayArray1[arg0][Class55.anIntArray458[arg0]++] = local3;
	}
}

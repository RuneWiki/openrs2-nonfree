import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!p", name = "T", descriptor = "[[[[Z")
	public static boolean[][][][] aBooleanArrayArrayArrayArray1;

	@OriginalMember(owner = "client!p", name = "V", descriptor = "Lclient!wd;")
	public static Class3_Sub1_Sub19 aClass3_Sub1_Sub19_1;

	@OriginalMember(owner = "client!p", name = "M", descriptor = "I")
	public static int anInt2863 = 0;

	@OriginalMember(owner = "client!p", name = "O", descriptor = "[I")
	public static int[] anIntArray384 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!p", name = "P", descriptor = "I")
	public static int anInt2865 = 0;

	@OriginalMember(owner = "client!p", name = "U", descriptor = "I")
	public static int anInt2869 = 0;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BLclient!qf;I)I")
	public static int method2039(@OriginalArg(1) Class77 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArrayArray34 == null || arg1 >= arg0.anIntArrayArray34.length) {
			return -2;
		}
		try {
			@Pc(25) int[] local25 = arg0.anIntArrayArray34[arg1];
			@Pc(27) int local27 = 0;
			@Pc(29) byte local29 = 0;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(36) int local36 = local25[local31++];
				@Pc(38) int local38 = 0;
				@Pc(40) byte local40 = 0;
				if (local36 == 0) {
					return local27;
				}
				if (local36 == 15) {
					local40 = 1;
				}
				if (local36 == 16) {
					local40 = 2;
				}
				if (local36 == 1) {
					local38 = Static176.anIntArray476[local25[local31++]];
				}
				if (local36 == 2) {
					local38 = Static28.anIntArray87[local25[local31++]];
				}
				if (local36 == 17) {
					local40 = 3;
				}
				if (local36 == 3) {
					local38 = Static15.anIntArray55[local25[local31++]];
				}
				@Pc(107) int local107;
				@Pc(118) Class77 local118;
				@Pc(123) int local123;
				@Pc(136) int local136;
				if (local36 == 4) {
					local107 = local25[local31++] << 16;
					@Pc(114) int local114 = local107 + local25[local31++];
					local118 = Static92.method2208(local114);
					local123 = local25[local31++];
					if (local123 != -1 && (!Static173.method2793(local123).aBoolean23 || Static156.aBoolean143)) {
						for (local136 = 0; local136 < local118.anIntArray418.length; local136++) {
							if (local118.anIntArray418[local136] == local123 + 1) {
								local38 += local118.anIntArray417[local136];
							}
						}
					}
				}
				if (local36 == 5) {
					local38 = Static41.anIntArray131[local25[local31++]];
				}
				if (local36 == 6) {
					local38 = Class28.anIntArray154[Static28.anIntArray87[local25[local31++]] - 1];
				}
				if (local36 == 7) {
					local38 = Static41.anIntArray131[local25[local31++]] * 100 / 46875;
				}
				if (local36 == 8) {
					local38 = Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4341;
				}
				if (local36 == 9) {
					for (local107 = 0; local107 < 25; local107++) {
						if (Static66.aBooleanArray9[local107]) {
							local38 += Static28.anIntArray87[local107];
						}
					}
				}
				if (local36 == 10) {
					local107 = local25[local31++] << 16;
					local107 += local25[local31++];
					local118 = Static92.method2208(local107);
					local123 = local25[local31++];
					if (local123 != -1 && (!Static173.method2793(local123).aBoolean23 || Static156.aBoolean143)) {
						for (local136 = 0; local136 < local118.anIntArray418.length; local136++) {
							if (local123 + 1 == local118.anIntArray418[local136]) {
								local38 = 999999999;
								break;
							}
						}
					}
				}
				if (local36 == 11) {
					local38 = Static109.anInt2442;
				}
				if (local36 == 12) {
					local38 = Static183.anInt4099;
				}
				if (local36 == 13) {
					local107 = Static41.anIntArray131[local25[local31++]];
					@Pc(321) int local321 = local25[local31++];
					local38 = (0x1 << local321 & local107) == 0 ? 0 : 1;
				}
				if (local36 == 14) {
					local107 = local25[local31++];
					local38 = Static94.method1432(local107);
				}
				if (local36 == 18) {
					local38 = Static97.anInt2062 + (Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4329 >> 7);
				}
				if (local36 == 19) {
					local38 = Static39.anInt875 + (Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4315 >> 7);
				}
				if (local36 == 20) {
					local38 = local25[local31++];
				}
				if (local40 == 0) {
					if (local29 == 0) {
						local27 += local38;
					}
					if (local29 == 1) {
						local27 -= local38;
					}
					if (local29 == 2 && local38 != 0) {
						local27 /= local38;
					}
					if (local29 == 3) {
						local27 *= local38;
					}
					local29 = 0;
				} else {
					local29 = local40;
				}
			}
		} catch (@Pc(426) Exception local426) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ZI)I")
	public static int method2041(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!bc;Lclient!bc;BLclient!bc;Lclient!bc;)V")
	public static void method2042(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(3) Class1 arg2, @OriginalArg(4) Class1 arg3) {
		Static107.aClass1_17 = arg0;
		Static36.aClass1_7 = arg2;
		Static162.aClass1_28 = arg3;
		Static122.aClass1_18 = arg1;
		Static57.aClass77ArrayArray1 = new Class77[Static107.aClass1_17.method50()][];
		Static129.aBooleanArray16 = new boolean[Static107.aClass1_17.method50()];
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!kh", name = "V", descriptor = "Lclient!lm;")
	public static Class134 aClass134_71;

	@OriginalMember(owner = "client!kh", name = "W", descriptor = "Lclient!ii;")
	public static Class105 aClass105_9;

	@OriginalMember(owner = "client!kh", name = "K", descriptor = "[I")
	public static final int[] anIntArray303 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!kh", name = "O", descriptor = "Z")
	public static boolean aBoolean241 = false;

	@OriginalMember(owner = "client!kh", name = "P", descriptor = "Z")
	public static boolean aBoolean242 = false;

	@OriginalMember(owner = "client!kh", name = "ab", descriptor = "Z")
	public static boolean aBoolean243 = false;

	@OriginalMember(owner = "client!kh", name = "gb", descriptor = "I")
	public static int anInt3124 = -1;

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(Z)V")
	public static void method2657() {
		Static46.method936(Static313.anInt6232);
		@Pc(17) int local17 = (Static4.anInt41 >> 10) + (Static92.anInt1755 >> 3);
		@Pc(25) int local25 = (Static177.anInt3734 >> 10) + (Static98.anInt1911 >> 3);
		Static287.anIntArray560 = new int[18];
		Static331.anIntArray354 = new int[18];
		Static242.aByteArrayArray15 = new byte[18][];
		Static41.aByteArrayArray4 = new byte[18][];
		Static153.aByteArrayArray8 = new byte[18][];
		Static120.anIntArray242 = new int[18];
		Static146.anIntArray446 = new int[18];
		Static281.anIntArrayArray45 = new int[18][4];
		Static219.anIntArray430 = new int[18];
		Static263.aByteArrayArray19 = new byte[18][];
		Static274.aByteArrayArray20 = new byte[18][];
		Static166.anIntArray334 = new int[18];
		@Pc(72) int local72 = 0;
		@Pc(91) int local91;
		for (@Pc(81) int local81 = (local17 - (Static43.anInt1151 >> 4)) / 8; local81 <= ((Static43.anInt1151 >> 4) + local17) / 8; local81++) {
			for (local91 = (local25 - (Static260.anInt5348 >> 4)) / 8; local91 <= (local25 + (Static260.anInt5348 >> 4)) / 8; local91++) {
				@Pc(100) int local100 = (local81 << 8) + local91;
				Static146.anIntArray446[local72] = local100;
				Static166.anIntArray334[local72] = Static29.aClass134_12.method3018("m" + local81 + "_" + local91);
				Static219.anIntArray430[local72] = Static29.aClass134_12.method3018("l" + local81 + "_" + local91);
				Static331.anIntArray354[local72] = Static29.aClass134_12.method3018("n" + local81 + "_" + local91);
				Static287.anIntArray560[local72] = Static29.aClass134_12.method3018("um" + local81 + "_" + local91);
				Static120.anIntArray242[local72] = Static29.aClass134_12.method3018("ul" + local81 + "_" + local91);
				if (Static331.anIntArray354[local72] == -1) {
					Static166.anIntArray334[local72] = -1;
					Static219.anIntArray430[local72] = -1;
					Static287.anIntArray560[local72] = -1;
					Static120.anIntArray242[local72] = -1;
				}
				local72++;
			}
		}
		for (local91 = local72; local91 < Static331.anIntArray354.length; local91++) {
			Static331.anIntArray354[local91] = -1;
			Static166.anIntArray334[local91] = -1;
			Static219.anIntArray430[local91] = -1;
			Static287.anIntArray560[local91] = -1;
			Static120.anIntArray242[local91] = -1;
		}
		Static172.method3082(false, local17, 0, local25, true, 8, 8);
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(II)V")
	public static void method2658(@OriginalArg(1) int arg0) {
		Static289.anInt5793 = -1;
		Static284.anInt5720 = 3;
		Static72.anInt1505 = 100;
		Static101.anInt1939 = arg0;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIII)I")
	public static int method2659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 7 - arg0;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!lm;B)V")
	public static void method2661(@OriginalArg(0) Class134 arg0) {
		Static123.aClass134_117 = arg0;
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(III)I")
	public static int method2662(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}
}

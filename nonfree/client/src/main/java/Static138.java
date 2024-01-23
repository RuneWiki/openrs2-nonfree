import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
	public static int anInt2807;

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
	public static int anInt2812;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
	public static int anInt2806 = 0;

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "Lclient!hh;")
	private static Class50 aClass50_945 = Static186.method3527("yellow:");

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "Lclient!hh;")
	public static Class50 aClass50_944 = aClass50_945;

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
	public static int anInt2810 = 0;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "[Lclient!hh;")
	public static Class50[] aClass50Array53 = new Class50[8];

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "Lclient!hh;")
	public static Class50 aClass50_946 = aClass50_945;

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "[I")
	public static int[] anIntArray297 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "[[I")
	public static int[][] anIntArrayArray20 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "Lclient!hh;")
	public static Class50 aClass50_947 = Static186.method3527("T");

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "Lclient!hh;")
	public static Class50 aClass50_948 = Static186.method3527("scape main");

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
	public static int anInt2817 = 0;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)I")
	public static int method2292(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZLclient!hh;)V")
	public static void method2294(@OriginalArg(0) int arg0, @OriginalArg(2) Class50 arg1) {
		@Pc(8) Class1_Sub1_Sub13 local8 = Static74.method1093(2, arg0);
		local8.method2260();
		local8.aClass50_937 = arg1;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)Z")
	public static boolean method2295(@OriginalArg(0) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
	public static void method2296() {
		@Pc(4) int local4 = Static87.aByteArrayArray6.length;
		for (@Pc(11) int local11 = 0; local11 < local4; local11++) {
			if (Static87.aByteArrayArray6[local11] != null) {
				@Pc(19) int local19 = -1;
				for (@Pc(21) int local21 = 0; local21 < Static70.anInt1326; local21++) {
					if (Static103.anIntArray197[local11] == Static82.anIntArray134[local21]) {
						local19 = local21;
						break;
					}
				}
				if (local19 == -1) {
					Static82.anIntArray134[Static70.anInt1326] = Static103.anIntArray197[local11];
					local19 = Static70.anInt1326++;
				}
				@Pc(65) Class1_Sub17 local65 = new Class1_Sub17(Static87.aByteArrayArray6[local11]);
				@Pc(67) int local67 = 0;
				while (Static87.aByteArrayArray6[local11].length > local65.anInt2656 && local67 < 511) {
					@Pc(81) int local81 = local67++ << 6 | local19;
					@Pc(85) int local85 = local65.method2178();
					@Pc(91) int local91 = local85 >> 7 & 0x3F;
					@Pc(95) int local95 = local85 & 0x3F;
					@Pc(108) int local108 = (Static103.anIntArray197[local11] & 0xFF) * 64 + local95 - Static101.anInt2041;
					@Pc(121) int local121 = local91 + (Static103.anIntArray197[local11] >> 8) * 64 - Static91.anInt4078;
					@Pc(127) Class105 local127 = Static162.method2710(local65.method2178());
					@Pc(131) int local131 = local85 >> 14;
					if (Static78.aClass20_Sub3_Sub2Array1[local81] == null && (local127.aByte13 & 0x1) > 0 && Static185.anInt3848 == local131 && local121 >= 0 && local121 + local127.anInt3889 < 104 && local108 >= 0 && local127.anInt3889 + local108 < 104) {
						Static78.aClass20_Sub3_Sub2Array1[local81] = new Class20_Sub3_Sub2();
						@Pc(176) Class20_Sub3_Sub2 local176 = Static78.aClass20_Sub3_Sub2Array1[local81];
						Static21.anIntArray44[Static103.anInt2065++] = local81;
						local176.aClass105_1 = local127;
						local176.anInt3018 = Static107.anInt2132;
						local176.anInt3064 = local176.aClass105_1.anInt3923;
						local176.anInt3039 = local176.aClass105_1.anInt3895;
						local176.anInt3036 = local176.aClass105_1.anInt3894;
						local176.anInt3044 = local176.aClass105_1.anInt3904;
						if (local176.anInt3036 == 0) {
							local176.anInt3054 = 0;
						}
						local176.anInt3040 = local176.aClass105_1.anInt3890;
						local176.anInt3034 = local176.aClass105_1.anInt3889;
						local176.anInt3050 = local176.aClass105_1.anInt3925;
						local176.anInt3024 = local176.aClass105_1.anInt3908;
						local176.anInt3057 = local176.aClass105_1.anInt3911;
						local176.method2470(local121, local108, true);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!oh;B)V")
	public static void method2297(@OriginalArg(0) Class1_Sub1_Sub10 arg0) {
		arg0.method1826(Static171.aClass50_1147, 382, 225, 16777215, -1);
		Static29.method411(230, 233, 304, 34, 9179409);
		Static29.method411(231, 234, 302, 32, 0);
		Static29.method423(232, 235, Static124.anInt2471 * 3, 30, 9179409);
		Static29.method423(Static124.anInt2471 * 3 + 232, 235, 300 - Static124.anInt2471 * 3, 30, 0);
		arg0.method1826(Static22.aClass50_169, 382, 256, 16777215, -1);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BII)I")
	public static int method2298(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = arg1 + arg0 * 57;
		@Pc(24) int local24 = local6 ^ local6 << 13;
		@Pc(38) int local38 = Integer.MAX_VALUE & local24 * (local24 * 15731 * local24 + 789221) + 1376312589;
		return local38 >> 19 & 0xFF;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!fe", name = "u", descriptor = "Lclient!jg;")
	public static Class44 aClass44_6;

	@OriginalMember(owner = "client!fe", name = "v", descriptor = "I")
	public static int anInt1264;

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "Lclient!nb;")
	public static Class57 aClass57_12 = new Class57(50);

	@OriginalMember(owner = "client!fe", name = "p", descriptor = "Lclient!kb;")
	public static Class46 aClass46_401 = Static65.method1172("<img=1>");

	@OriginalMember(owner = "client!fe", name = "r", descriptor = "Lclient!kb;")
	private static Class46 aClass46_403 = Static65.method1172("Service unavailable)3");

	@OriginalMember(owner = "client!fe", name = "q", descriptor = "Lclient!kb;")
	public static Class46 aClass46_402 = aClass46_403;

	@OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
	public static int anInt1262 = 0;

	@OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
	public static int anInt1263 = 0;

	@OriginalMember(owner = "client!fe", name = "x", descriptor = "Lclient!kb;")
	private static Class46 aClass46_405 = Static65.method1172("Please contact customer support)3");

	@OriginalMember(owner = "client!fe", name = "w", descriptor = "Lclient!kb;")
	public static Class46 aClass46_404 = aClass46_405;

	@OriginalMember(owner = "client!fe", name = "y", descriptor = "[I")
	public static int[] anIntArray122 = new int[500];

	@OriginalMember(owner = "client!fe", name = "z", descriptor = "Lclient!kb;")
	public static Class46 aClass46_406 = Static65.method1172("Schlie-8en");

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)I")
	public static int method907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) long local16 = (long) ((arg1 << 16) + arg0);
		return Static170.aClass3_Sub2_Sub13_1 != null && local16 == Static170.aClass3_Sub2_Sub13_1.aLong143 ? Static68.aClass3_Sub4_2.anInt232 * 99 / (Static68.aClass3_Sub4_2.aByteArray5.length - Static170.aClass3_Sub2_Sub13_1.aByte8) + 1 : 0;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V")
	public static void method909() {
		Static177.anImage4 = null;
		Static174.aFont1 = null;
		Static10.aFontMetrics1 = null;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
	public static void method910() {
		Static153.anInt3469 = 0;
		@Pc(13) int local13 = (Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1711 >> 7) + Static58.anInt1578;
		@Pc(26) int local26 = (Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1700 >> 7) + Static42.anInt1173;
		if (local26 >= 3053 && local26 <= 3156 && local13 >= 3056 && local13 <= 3136) {
			Static153.anInt3469 = 1;
		}
		if (local26 >= 3072 && local26 <= 3118 && local13 >= 9492 && local13 <= 9535) {
			Static153.anInt3469 = 1;
		}
		if (Static153.anInt3469 == 1 && local26 >= 3139 && local26 <= 3199 && local13 >= 3008 && local13 <= 3062) {
			Static153.anInt3469 = 0;
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(Z)V")
	public static void method911() {
		aClass46_403 = null;
		aClass46_402 = null;
		aClass57_12 = null;
		aClass44_6 = null;
		aClass46_404 = null;
		aClass46_406 = null;
		aClass46_401 = null;
		anIntArray122 = null;
		aClass46_405 = null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V")
	public static void method912(@OriginalArg(0) int arg0) {
		Static70.anInt1834 += arg0 * 128;
		@Pc(22) int local22;
		if (Static2.anIntArray2.length < Static70.anInt1834) {
			local22 = (int) (Math.random() * 12.0D);
			Static70.anInt1834 -= Static2.anIntArray2.length;
			Static16.method324(Static122.aClass3_Sub2_Sub3_Sub2Array5[local22]);
		}
		local22 = 0;
		@Pc(41) int local41 = (256 - arg0) * 128;
		@Pc(45) int local45 = arg0 * 128;
		@Pc(71) int local71;
		for (@Pc(47) int local47 = 0; local47 < local41; local47++) {
			local71 = Static54.anIntArray134[local45 + local22] - arg0 * Static2.anIntArray2[Static2.anIntArray2.length - 1 & Static70.anInt1834 + local22] / 6;
			if (local71 < 0) {
				local71 = 0;
			}
			Static54.anIntArray134[local22++] = local71;
		}
		@Pc(99) int local99;
		@Pc(101) int local101;
		@Pc(108) int local108;
		for (local71 = 256 - arg0; local71 < 256; local71++) {
			local99 = local71 * 128;
			for (local101 = 0; local101 < 128; local101++) {
				local108 = (int) (Math.random() * 100.0D);
				if (local108 < 50 && local101 > 10 && local101 < 118) {
					Static54.anIntArray134[local99 + local101] = 255;
				} else {
					Static54.anIntArray134[local99 + local101] = 0;
				}
			}
		}
		if (Static71.anInt1839 > 0) {
			Static71.anInt1839 -= arg0 * 4;
		}
		if (Static88.anInt2168 > 0) {
			Static88.anInt2168 -= arg0 * 4;
		}
		if (Static71.anInt1839 == 0 && Static88.anInt2168 == 0) {
			local99 = (int) ((double) (2000 / arg0) * Math.random());
			if (local99 == 1) {
				Static88.anInt2168 = 1024;
			}
			if (local99 == 0) {
				Static71.anInt1839 = 1024;
			}
		}
		for (local99 = 0; local99 < 256 - arg0; local99++) {
			Static23.anIntArray37[local99] = Static23.anIntArray37[arg0 + local99];
		}
		for (local101 = 256 - arg0; local101 < 256; local101++) {
			Static23.anIntArray37[local101] = (int) (Math.sin((double) Static19.anInt450 / 14.0D) * 16.0D + Math.sin((double) Static19.anInt450 / 15.0D) * 14.0D + Math.sin((double) Static19.anInt450 / 16.0D) * 12.0D);
			Static19.anInt450++;
		}
		Static90.anInt2208 += arg0;
		local108 = ((Static20.anInt512 & 0x1) + arg0) / 2;
		if (local108 <= 0) {
			return;
		}
		@Pc(286) int local286;
		@Pc(279) int local279;
		for (@Pc(270) int local270 = 0; local270 < Static90.anInt2208 * 100; local270++) {
			local279 = (int) (Math.random() * 128.0D) + 128;
			local286 = (int) (Math.random() * 124.0D) + 2;
			Static54.anIntArray134[local286 + (local279 << 7)] = 192;
		}
		Static90.anInt2208 = 0;
		@Pc(311) int local311;
		@Pc(316) int local316;
		for (local286 = 0; local286 < 256; local286++) {
			local311 = local286 * 128;
			local279 = 0;
			for (local316 = -local108; local316 < 128; local316++) {
				if (local108 + local316 < 128) {
					local279 += Static54.anIntArray134[local311 + local316 + local108];
				}
				if (local316 - local108 - 1 >= 0) {
					local279 -= Static54.anIntArray134[local311 + local316 - local108 - 1];
				}
				if (local316 >= 0) {
					Static65.anIntArray165[local316 + local311] = local279 / (local108 * 2 + 1);
				}
			}
		}
		for (local279 = 0; local279 < 128; local279++) {
			local311 = 0;
			for (local316 = -local108; local316 < 256; local316++) {
				@Pc(392) int local392 = local316 * 128;
				if (local108 + local316 < 256) {
					local311 += Static65.anIntArray165[local108 * 128 + local279 + local392];
				}
				if (local316 - local108 - 1 >= 0) {
					local311 -= Static65.anIntArray165[local392 + local279 - local108 * 128 - 128];
				}
				if (local316 >= 0) {
					Static54.anIntArray134[local279 + local392] = local311 / (local108 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(III)I")
	public static int method914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local3 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return local3 * arg0;
		} else {
			return local3;
		}
	}
}

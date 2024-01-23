import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!c", name = "fb", descriptor = "Lclient!l;")
	public static Class98 aClass98_7 = new Class98(64);

	@OriginalMember(owner = "client!c", name = "rb", descriptor = "[[I")
	public static int[][] anIntArrayArray5 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

	@OriginalMember(owner = "client!c", name = "wb", descriptor = "Ljava/lang/String;")
	public static String aString19 = "Connected to update server";

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;")
	public static Object method439(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static39.aBoolean55) {
			try {
				@Pc(21) Class73 local21 = (Class73) Class.forName("Class73_Sub1").getDeclaredConstructor().newInstance();
				local21.method2613(arg0);
				return local21;
			} catch (@Pc(28) Throwable local28) {
				Static39.aBoolean55 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIZ)V")
	public static void method441(@OriginalArg(3) int arg0, @OriginalArg(4) boolean arg1) {
		Static295.anInt4973 = 104;
		Static307.anInt6023 = 104;
		Static285.anInt5736 = arg0;
		Static92.aClass3_Sub25ArrayArrayArray3 = new Class3_Sub25[4][Static295.anInt4973][Static307.anInt6023];
		Static258.anIntArrayArrayArray15 = new int[4][Static295.anInt4973 + 1][Static307.anInt6023 + 1];
		if (Static283.aBoolean393) {
			Static62.aClass3_Sub21ArrayArray2 = new Class3_Sub21[4][];
		}
		if (arg1) {
			Static291.aClass3_Sub25ArrayArrayArray6 = new Class3_Sub25[1][Static295.anInt4973][Static307.anInt6023];
			Static157.anIntArrayArray45 = new int[Static295.anInt4973][Static307.anInt6023];
			Static22.anIntArrayArrayArray1 = new int[1][Static295.anInt4973 + 1][Static307.anInt6023 + 1];
			if (Static283.aBoolean393) {
				Static282.aClass3_Sub21ArrayArray3 = new Class3_Sub21[1][];
			}
		} else {
			Static291.aClass3_Sub25ArrayArrayArray6 = null;
			Static157.anIntArrayArray45 = null;
			Static22.anIntArrayArrayArray1 = null;
			Static282.aClass3_Sub21ArrayArray3 = null;
		}
		Static62.method976(false);
		Static19.aClass134Array1 = new Class134[500];
		Static197.anInt5226 = 0;
		Static132.aClass134Array2 = new Class134[500];
		Static240.anInt4877 = 0;
		Static232.anIntArrayArrayArray12 = new int[4][Static295.anInt4973 + 1][Static307.anInt6023 + 1];
		Static104.aClass85Array1 = new Class85[5000];
		Static51.anInt994 = 0;
		Static108.aClass85Array2 = new Class85[100];
		Static252.aBooleanArrayArray10 = new boolean[Static285.anInt5736 + Static285.anInt5736 + 1][Static285.anInt5736 + Static285.anInt5736 + 1];
		Static15.aBooleanArrayArray6 = new boolean[Static285.anInt5736 + Static285.anInt5736 + 2][Static285.anInt5736 + Static285.anInt5736 + 2];
		Static48.aByteArrayArrayArray3 = new byte[4][Static295.anInt4973][Static307.anInt6023];
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
	public static void method448() {
		Static136.anIntArray307 = Static262.method4367(0.4F);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method451(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(14) String local14 = Static190.method3179(arg0);
		if (local14 == null) {
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < Static149.anInt2817; local27++) {
			@Pc(36) String local36 = Static190.method3179(Static13.aStringArray3[local27]);
			if (local36 != null && local36.equals(local14)) {
				Static149.anInt2817--;
				for (@Pc(52) int local52 = local27; local52 < Static149.anInt2817; local52++) {
					Static13.aStringArray3[local52] = Static13.aStringArray3[local52 + 1];
					Static88.aStringArray17[local52] = Static88.aStringArray17[local52 + 1];
					Static82.aStringArray15[local52] = Static82.aStringArray15[local52 + 1];
					Static308.aStringArray42[local52] = Static308.aStringArray42[local52 + 1];
					Static184.aBooleanArray86[local52] = Static184.aBooleanArray86[local52 + 1];
				}
				Static152.anInt2882 = Static201.anInt3956;
				Static215.aClass3_Sub26_Sub1_2.method3958(11);
				Static215.aClass3_Sub26_Sub1_2.method3907(Static147.method2494(arg0));
				Static215.aClass3_Sub26_Sub1_2.method3914(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
	public static void method456() {
		for (@Pc(7) int local7 = 0; local7 < Static62.anInt1162; local7++) {
			@Pc(23) int local23 = Static277.anIntArray570[local7]--;
			if (Static277.anIntArray570[local7] >= -10) {
				@Pc(99) Class45 local99 = Static151.aClass45Array1[local7];
				if (local99 == null) {
					local99 = Static317.method1046(Static220.aClass155_105, Static136.anIntArray306[local7], 0);
					if (local99 == null) {
						continue;
					}
					Static277.anIntArray570[local7] += local99.method1047();
					Static151.aClass45Array1[local7] = local99;
				}
				if (Static277.anIntArray570[local7] < 0) {
					@Pc(146) int local146;
					if (Static131.anIntArray296[local7] == 0) {
						local146 = Static175.anIntArray399[local7] * Static177.anInt3306 >> 8;
					} else {
						@Pc(156) int local156 = (Static131.anIntArray296[local7] & 0xFF) * 128;
						@Pc(164) int local164 = Static131.anIntArray296[local7] >> 16 & 0xFF;
						@Pc(172) int local172 = Static131.anIntArray296[local7] >> 8 & 0xFF;
						@Pc(182) int local182 = local164 * 128 + 64 - Static136.aClass10_Sub5_Sub1_1.anInt5073;
						@Pc(192) int local192 = local172 * 128 + 64 - Static136.aClass10_Sub5_Sub1_1.anInt5016;
						if (local192 < 0) {
							local192 = -local192;
						}
						if (local182 < 0) {
							local182 = -local182;
						}
						@Pc(210) int local210 = local192 + local182 - 128;
						if (local156 < local210) {
							Static277.anIntArray570[local7] = -100;
							continue;
						}
						if (local210 < 0) {
							local210 = 0;
						}
						local146 = Static305.anInt6006 * (local156 - local210) * Static175.anIntArray399[local7] / local156 >> 8;
					}
					if (local146 > 0) {
						@Pc(249) Class3_Sub11_Sub1 local249 = local99.method1045().method3668(Static231.aClass152_1);
						@Pc(254) Class3_Sub15_Sub1 local254 = Static319.method2148(local249, local146);
						local254.method2133(Static289.anIntArray598[local7] - 1);
						Static86.aClass3_Sub15_Sub2_1.method2430(local254);
					}
					Static277.anIntArray570[local7] = -100;
				}
			} else {
				Static62.anInt1162--;
				for (@Pc(38) int local38 = local7; local38 < Static62.anInt1162; local38++) {
					Static136.anIntArray306[local38] = Static136.anIntArray306[local38 + 1];
					Static151.aClass45Array1[local38] = Static151.aClass45Array1[local38 + 1];
					Static289.anIntArray598[local38] = Static289.anIntArray598[local38 + 1];
					Static277.anIntArray570[local38] = Static277.anIntArray570[local38 + 1];
					Static131.anIntArray296[local38] = Static131.anIntArray296[local38 + 1];
					Static175.anIntArray399[local38] = Static175.anIntArray399[local38 + 1];
				}
				local7--;
			}
		}
		if (Static73.aBoolean123 && !Static270.method4462()) {
			if (Static220.anInt5204 != 0 && Static201.anInt3962 != -1) {
				Static175.method2876(Static220.anInt5204, Static201.anInt3962, Static257.aClass155_106);
			}
			Static73.aBoolean123 = false;
		} else if (Static220.anInt5204 != 0 && Static201.anInt3962 != -1 && !Static270.method4462()) {
			Static215.aClass3_Sub26_Sub1_2.method3958(95);
			Static215.aClass3_Sub26_Sub1_2.method3944(Static201.anInt3962);
			Static201.anInt3962 = -1;
		}
	}
}

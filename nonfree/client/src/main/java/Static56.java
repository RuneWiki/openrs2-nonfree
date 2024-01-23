import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray5 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "[S")
	public static short[] aShortArray40 = new short[256];

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString47 = "Hidden";

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "[Z")
	public static boolean[] aBooleanArray4 = new boolean[100];

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString48 = " more options";

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BJ)V")
	public static void method1124(@OriginalArg(1) long arg0) {
		if (Static280.anInt5999 == 1 || Static280.anInt5999 == 5) {
			Static298.method4852(arg0);
		} else if (Static280.anInt5999 == 2) {
			Static76.method4255();
		} else {
			Static235.method4067();
		}
		if (!Static218.aBoolean267) {
			Static213.aShortArray71[0] = 1003;
			if (Static259.anInt5653 != 0) {
				Static281.anInt6019 = Static3.anInt108;
				Static190.anInt4241 = Static139.anInt6139;
			} else if (Static242.anInt5298 == 0) {
				Static190.anInt4241 = Static84.anInt1989;
				Static281.anInt6019 = Static212.anInt4711;
			} else {
				Static190.anInt4241 = Static182.anInt4419;
				Static281.anInt6019 = Static279.anInt5967;
			}
			Static153.anIntArray326[0] = Static78.anInt1880;
			Static111.anInt2398 = 1;
			Static165.aStringArray17[0] = Static266.aString189;
			Static24.aStringArray3[0] = "";
		}
		if (Static194.anInt4389 != -1) {
			Static140.method2512(Static194.anInt4389);
		}
		@Pc(86) int local86;
		for (local86 = 0; local86 < Static31.anInt803; local86++) {
			if (Static165.aBooleanArray16[local86]) {
				Static138.aBooleanArray13[local86] = true;
			}
			Static217.aBooleanArray20[local86] = Static165.aBooleanArray16[local86];
			Static165.aBooleanArray16[local86] = false;
		}
		Static210.anInt4683 = -1;
		if (Static296.aBoolean335) {
			Static177.aBoolean203 = true;
		}
		Static100.aClass116_18 = null;
		Static227.aClass116_14 = null;
		Static95.anInt2164 = Static32.anInt809;
		Static117.anInt2578 = -1;
		if (Static194.anInt4389 != -1) {
			Static31.anInt803 = 0;
			Static43.method947();
		}
		if (Static296.aBoolean335) {
			Static288.method4710();
		} else {
			Static203.method3609();
		}
		Static81.method1456();
		if (Static218.aBoolean267) {
			if (Static236.aBoolean285) {
				Static159.method2997();
			} else {
				Static133.method2292();
			}
		} else if (Static100.aClass116_18 != null) {
			Static153.method2862(Static100.aClass116_18, Static135.anInt3037, Static65.anInt403);
		} else if (Static210.anInt4683 != -1) {
			Static153.method2862(null, Static117.anInt2578, Static210.anInt4683);
		}
		local86 = Static218.aBoolean267 ? -1 : Static141.method2522();
		if (local86 == -1) {
			local86 = Static266.anInt5786;
		}
		Static257.method4359(local86);
		if (Static112.anInt2415 == 1) {
			Static112.anInt2415 = 2;
		}
		if (Static177.anInt3987 == 1) {
			Static177.anInt3987 = 2;
		}
		if (Static171.anInt3878 == 3) {
			for (@Pc(207) int local207 = 0; local207 < Static31.anInt803; local207++) {
				if (Static217.aBooleanArray20[local207]) {
					if (Static296.aBoolean335) {
						Static288.method4716(Static120.anIntArray298[local207], Static32.anIntArray89[local207], Static129.anIntArray268[local207], Static144.anIntArray299[local207], 16711935, 128);
					} else {
						Static203.method3603(Static120.anIntArray298[local207], Static32.anIntArray89[local207], Static129.anIntArray268[local207], Static144.anIntArray299[local207], 16711935, 128);
					}
				} else if (Static138.aBooleanArray13[local207]) {
					if (Static296.aBoolean335) {
						Static288.method4716(Static120.anIntArray298[local207], Static32.anIntArray89[local207], Static129.anIntArray268[local207], Static144.anIntArray299[local207], 16711680, 128);
					} else {
						Static203.method3603(Static120.anIntArray298[local207], Static32.anIntArray89[local207], Static129.anIntArray268[local207], Static144.anIntArray299[local207], 16711680, 128);
					}
				}
			}
		}
		Static16.method360(Static112.anInt2417, Static239.aClass25_Sub1_Sub1_2.anInt1604, Static145.anInt3477, Static239.aClass25_Sub1_Sub1_2.anInt1635);
		Static112.anInt2417 = 0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)I")
	public static int method1126(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(25) int local25 = local13 | local13 >>> 2;
		@Pc(31) int local31 = local25 | local25 >>> 4;
		@Pc(37) int local37 = local31 | local31 >>> 8;
		@Pc(43) int local43 = local37 | local37 >>> 16;
		return ~local43 & arg0;
	}
}

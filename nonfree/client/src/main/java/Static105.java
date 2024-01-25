import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "Lclient!ul;")
	public static Class246 aClass246_64;

	@OriginalMember(owner = "client!ev", name = "g", descriptor = "[Lclient!ta;")
	public static Class149[] aClass149Array1;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "[[S")
	public static final short[][] aShortArrayArray3 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!ev", name = "c", descriptor = "I")
	public static int anInt2176 = -1;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZB)V")
	public static void method1872(@OriginalArg(0) boolean arg0) {
		Static178.anInt3270 = 0;
		Static372.anInt6091 = 0;
		Static370.method5071();
		Static246.method4276(arg0);
		Static341.method4811();
		@Pc(31) int local31;
		for (@Pc(18) int local18 = 0; local18 < Static178.anInt3270; local18++) {
			local31 = Static255.anIntArray391[local18];
			if (Static378.anInt4244 != Static98.aClass31_Sub2_Sub1_Sub2Array1[local31].anInt7302) {
				if (Static98.aClass31_Sub2_Sub1_Sub2Array1[local31].aClass53_1.method1505()) {
					Static422.method5611(Static98.aClass31_Sub2_Sub1_Sub2Array1[local31]);
				}
				Static98.aClass31_Sub2_Sub1_Sub2Array1[local31].method5997(null);
				Static98.aClass31_Sub2_Sub1_Sub2Array1[local31] = null;
			}
		}
		if (Static167.anInt3076 != Static206.aClass1_Sub5_Sub1_2.anInt6475) {
			throw new RuntimeException("gnp1 pos:" + Static206.aClass1_Sub5_Sub1_2.anInt6475 + " psize:" + Static167.anInt3076);
		}
		for (local31 = 0; local31 < Static5.anInt163; local31++) {
			if (Static98.aClass31_Sub2_Sub1_Sub2Array1[Static331.anIntArray648[local31]] == null) {
				throw new RuntimeException("gnp2 pos:" + local31 + " size:" + Static5.anInt163);
			}
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "([BIZ)Ljava/lang/Object;")
	public static Object method1873(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static321.aBoolean393) {
			try {
				@Pc(25) Class136 local25 = (Class136) Class.forName("Class136_Sub1").getDeclaredConstructor().newInstance();
				local25.method3296(arg0);
				return local25;
			} catch (@Pc(34) Throwable local34) {
				Static321.aBoolean393 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IZIBII)V")
	public static void method1875(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 < 1) {
			arg4 = 1;
		}
		if (arg2 < 1) {
			arg2 = 1;
		}
		@Pc(21) int local21 = arg4 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(43) int local43 = (Static257.aShort72 - Static127.aShort46) * local21 / 100 + Static127.aShort46;
		if (local43 < Static392.aShort86) {
			local43 = Static392.aShort86;
		} else if (Static447.aShort98 < local43) {
			local43 = Static447.aShort98;
		}
		@Pc(72) int local72 = arg4 * local43 * 512 / (arg2 * 334);
		@Pc(106) int local106;
		@Pc(113) int local113;
		@Pc(77) short local77;
		if (Static451.aShort99 > local72) {
			local77 = Static451.aShort99;
			local43 = arg2 * local77 * 334 / (arg4 * 512);
			if (local43 > Static447.aShort98) {
				local43 = Static447.aShort98;
				local106 = local43 * arg4 * 512 / (local77 * 334);
				local113 = (arg2 - local106) / 2;
				if (arg1) {
					Static415.aClass39_11.e();
					Static415.aClass39_11.method4563(arg3, -16777216, local113, arg0, arg4);
					Static415.aClass39_11.method4563(arg3, -16777216, local113, arg2 + arg0 - local113, arg4);
				}
				arg2 -= local113 * 2;
				arg0 += local113;
			}
		} else if (local72 > Static386.aShort85) {
			local77 = Static386.aShort85;
			local43 = local77 * arg2 * 334 / (arg4 * 512);
			if (local43 < Static392.aShort86) {
				local43 = Static392.aShort86;
				local106 = arg2 * 334 * local77 / (local43 * 512);
				local113 = (arg4 - local106) / 2;
				if (arg1) {
					Static415.aClass39_11.e();
					Static415.aClass39_11.method4563(arg3, -16777216, arg2, arg0, local113);
					Static415.aClass39_11.method4563(arg4 + arg3 - local113, -16777216, arg2, arg0, local113);
				}
				arg3 += local113;
				arg4 -= local113 * 2;
			}
		}
		Static449.anInt7211 = (short) arg4;
		Static14.anInt406 = (short) arg2;
		Static439.anInt7059 = local43 * arg4 / 334;
		Static139.anInt2722 = arg0;
		Static72.anInt1632 = arg3;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "([IZ[Ljava/lang/Object;)V")
	public static void method1876(@OriginalArg(0) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static401.method5347(arg0.length - 1, 0, arg1, arg0);
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(BI)I")
	public static int method1877(@OriginalArg(1) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}

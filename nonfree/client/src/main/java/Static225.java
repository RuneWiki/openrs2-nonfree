import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!og", name = "b", descriptor = "I")
	public static int anInt4520;

	@OriginalMember(owner = "client!og", name = "E", descriptor = "I")
	public static int anInt4529;

	@OriginalMember(owner = "client!og", name = "I", descriptor = "[Lclient!ae;")
	public static Class4[] aClass4Array13;

	@OriginalMember(owner = "client!og", name = "m", descriptor = "[I")
	public static final int[] anIntArray372 = new int[25];

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V")
	public static void method4170() {
		@Pc(5) Class21 local5 = Static29.aClass21_29;
		synchronized (Static29.aClass21_29) {
			Static29.aClass21_29.method857();
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZLclient!rc;Lclient!fp;)I")
	public static int method4171(@OriginalArg(1) Class180 arg0, @OriginalArg(2) Class63 arg1) {
		if (arg0.anInt5283 != -1) {
			return arg0.anInt5283;
		}
		if (arg0.anInt5286 != -1) {
			@Pc(31) Class178 local31 = Static314.anInterface3_7.method5486(arg1.method4598() ? arg0.anInt5286 : arg0.anInt5289);
			if (!local31.aBoolean390) {
				return local31.aShort72;
			}
		}
		return arg0.anInt5293;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!eg;ILclient!qm;Lclient!fp;ILclient!td;II)V")
	public static void method4173(@OriginalArg(0) Class1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class174 arg2, @OriginalArg(3) Class63 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class194 arg5, @OriginalArg(6) int arg6) {
		@Pc(26) int local26 = arg0.anInt1644 - arg1 / 2 - 5;
		@Pc(30) int local30 = arg4 + 2;
		if (arg5.anInt5835 != 0) {
			arg3.method4639(local30, local26, arg2.method4791() * arg6 + arg4 + 1 - local30, arg5.anInt5835, arg1 + 10);
		}
		if (arg5.anInt5838 != 0) {
			arg3.method4577(arg2.method4791() * arg6 + arg4 + 1 - local30, local26, arg5.anInt5838, arg1 + 10, local30);
		}
		@Pc(82) int local82 = arg5.anInt5843;
		if (arg0.aBoolean116 && arg5.anInt5845 != -1) {
			local82 = arg5.anInt5845;
		}
		for (@Pc(94) int local94 = 0; local94 < arg6; local94++) {
			@Pc(100) String local100 = Static160.aStringArray15[local94];
			if (local94 < arg6 - 1) {
				local100 = local100.substring(0, local100.length() - 4);
			}
			arg2.method4790(arg3, local100, arg0.anInt1644, arg4, local82);
			arg4 += arg2.method4791();
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIZZIII)V")
	public static void method4174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static129.anInt2807 = arg3;
		Static301.anInt5792 = arg5;
		Static319.anInt6112 = arg0;
		Static12.anInt292 = arg1;
		Static101.anInt2315 = arg4;
		if (arg2 && Static301.anInt5792 >= 100) {
			Static260.anInt5192 = Static129.anInt2807 * 128 + 64;
			Static14.anInt4971 = Static319.anInt6112 * 128 + 64;
			Static294.anInt5665 = Static8.method288(Static284.anInt6477, Static14.anInt4971, Static260.anInt5192) - Static101.anInt2315;
		}
		Static50.anInt1273 = 2;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)I")
	public static int method4175() {
		if (Static180.aBoolean277) {
			return 0;
		} else if (Static150.method4956()) {
			return Static43.aBoolean407 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V")
	public static void method4176() {
		if (Static9.aClass63_1 == null) {
			return;
		}
		Static40.aClass195_2.method5297();
		Static31.method824();
		Static161.method3064();
		Static147.method2869();
		Static243.method4537();
		Static41.method957();
		if (Static191.aClass90_3 != null) {
			Static191.aClass90_3.method2736();
		}
		Static94.method2044();
		Static96.method2069();
		Static140.method2823();
		Static138.method2789(false);
		Static24.method613();
		for (@Pc(39) int local39 = 0; local39 < 2048; local39++) {
			@Pc(45) Class11_Sub2_Sub6_Sub1 local45 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local39];
			if (local45 != null) {
				local45.aClass1_Sub41_3 = null;
				for (@Pc(52) int local52 = 0; local52 < local45.aClass3Array3.length; local52++) {
					local45.aClass3Array3[local52] = null;
				}
			}
		}
		for (@Pc(71) int local71 = 0; local71 < Static231.aClass11_Sub2_Sub6_Sub2Array1.length; local71++) {
			@Pc(77) Class11_Sub2_Sub6_Sub2 local77 = Static231.aClass11_Sub2_Sub6_Sub2Array1[local71];
			if (local77 != null) {
				for (@Pc(81) int local81 = 0; local81 < local77.aClass3Array3.length; local81++) {
					local77.aClass3Array3[local81] = null;
				}
			}
		}
		Static9.aClass63_1.method4625();
		Static9.aClass63_1 = null;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II[Ljava/lang/String;[SI)V")
	public static void method4177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) short[] arg3) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(26) int local26 = (arg0 + arg1) / 2;
		@Pc(28) int local28 = arg1;
		@Pc(32) String local32 = arg2[local26];
		arg2[local26] = arg2[arg0];
		arg2[arg0] = local32;
		@Pc(46) short local46 = arg3[local26];
		arg3[local26] = arg3[arg0];
		arg3[arg0] = local46;
		for (@Pc(58) int local58 = arg1; local58 < arg0; local58++) {
			if (local32 == null || arg2[local58] != null && arg2[local58].compareTo(local32) < (local58 & 0x1)) {
				@Pc(83) String local83 = arg2[local58];
				arg2[local58] = arg2[local28];
				arg2[local28] = local83;
				@Pc(97) short local97 = arg3[local58];
				arg3[local58] = arg3[local28];
				arg3[local28++] = local97;
			}
		}
		arg2[arg0] = arg2[local28];
		arg2[local28] = local32;
		arg3[arg0] = arg3[local28];
		arg3[local28] = local46;
		method4177(local28 - 1, arg1, arg2, arg3);
		method4177(arg0, local28 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(JZ)V")
	public static void method4178(@OriginalArg(0) long arg0) {
		@Pc(10) int local10 = Static255.anInt5175 + Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6729;
		@Pc(19) int local19 = Static315.anInt5994 + Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6726;
		if (Static98.anInt2254 - local10 < -500 || Static98.anInt2254 - local10 > 500 || Static53.anInt1374 - local19 < -500 || Static53.anInt1374 - local19 > 500) {
			Static53.anInt1374 = local19;
			Static98.anInt2254 = local10;
		}
		@Pc(63) int local63;
		@Pc(71) int local71;
		if (local10 != Static98.anInt2254) {
			local63 = local10 - Static98.anInt2254;
			local71 = (int) ((long) local63 * arg0 / 320L);
			if (local63 <= 0) {
				if (local71 == 0) {
					local71 = -1;
				} else if (local63 > local71) {
					local71 = local63;
				}
			} else if (local71 == 0) {
				local71 = 1;
			} else if (local63 < local71) {
				local71 = local63;
			}
			Static98.anInt2254 += local71;
		}
		if (local19 != Static53.anInt1374) {
			local63 = local19 - Static53.anInt1374;
			local71 = (int) (arg0 * (long) local63 / 320L);
			if (local63 > 0) {
				if (local71 == 0) {
					local71 = 1;
				} else if (local63 < local71) {
					local71 = local63;
				}
			} else if (local71 == 0) {
				local71 = -1;
			} else if (local71 < local63) {
				local71 = local63;
			}
			Static53.anInt1374 += local71;
		}
		if (!Static41.aBoolean62) {
			Static357.aFloat76 += Static294.aFloat58 * (float) arg0 / 6.0F;
			Static332.aFloat62 += (float) arg0 * Static118.aFloat22 / 6.0F;
		}
		Static177.method3440();
	}
}

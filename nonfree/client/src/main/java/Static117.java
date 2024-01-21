import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
	public static int anInt2870;

	@OriginalMember(owner = "client!ne", name = "s", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1054 = Static177.method3050("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!ne", name = "u", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1055 = Static177.method3050(")4slr)3ws?order=LPWM");

	@OriginalMember(owner = "client!ne", name = "x", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1057 = Static177.method3050("Please contact customer support)3");

	@OriginalMember(owner = "client!ne", name = "v", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1056 = aClass46_1057;

	@OriginalMember(owner = "client!ne", name = "y", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1058 = Static177.method3050("settings");

	@OriginalMember(owner = "client!ne", name = "A", descriptor = "[I")
	public static final int[] anIntArray264 = new int[5];

	@OriginalMember(owner = "client!ne", name = "E", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1059 = aClass46_1054;

	@OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
	public static int anInt2874 = 0;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([BZ)V")
	public static void method2131(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class4_Sub11 local10 = new Class4_Sub11(arg0);
		local10.anInt1597 = arg0.length - 2;
		Static26.anInt653 = local10.method1252();
		Static107.anIntArray248 = new int[Static26.anInt653];
		Static12.aByteArrayArray1 = new byte[Static26.anInt653][];
		Static35.anIntArray81 = new int[Static26.anInt653];
		Static137.anIntArray312 = new int[Static26.anInt653];
		Static55.anIntArray147 = new int[Static26.anInt653];
		local10.anInt1597 = arg0.length - Static26.anInt653 * 8 - 7;
		Static137.anInt3248 = local10.method1252();
		Static131.anInt3136 = local10.method1252();
		@Pc(62) int local62 = (local10.method1253() & 0xFF) + 1;
		for (@Pc(64) int local64 = 0; local64 < Static26.anInt653; local64++) {
			Static137.anIntArray312[local64] = local10.method1252();
		}
		for (@Pc(78) int local78 = 0; local78 < Static26.anInt653; local78++) {
			Static55.anIntArray147[local78] = local10.method1252();
		}
		for (@Pc(96) int local96 = 0; local96 < Static26.anInt653; local96++) {
			Static107.anIntArray248[local96] = local10.method1252();
		}
		for (@Pc(114) int local114 = 0; local114 < Static26.anInt653; local114++) {
			Static35.anIntArray81[local114] = local10.method1252();
		}
		local10.anInt1597 = arg0.length + 3 - local62 * 3 - Static26.anInt653 * 8 - 7;
		Static110.anIntArray253 = new int[local62];
		for (@Pc(153) int local153 = 1; local153 < local62; local153++) {
			Static110.anIntArray253[local153] = local10.method1225();
			if (Static110.anIntArray253[local153] == 0) {
				Static110.anIntArray253[local153] = 1;
			}
		}
		local10.anInt1597 = 0;
		for (@Pc(182) int local182 = 0; local182 < Static26.anInt653; local182++) {
			@Pc(188) int local188 = Static107.anIntArray248[local182];
			@Pc(192) int local192 = Static35.anIntArray81[local182];
			@Pc(196) int local196 = local192 * local188;
			@Pc(199) byte[] local199 = new byte[local196];
			Static12.aByteArrayArray1[local182] = local199;
			@Pc(207) int local207 = local10.method1253();
			@Pc(211) int local211;
			if (local207 == 0) {
				for (local211 = 0; local211 < local196; local211++) {
					local199[local211] = local10.method1241();
				}
			} else if (local207 == 1) {
				for (local211 = 0; local211 < local188; local211++) {
					for (@Pc(240) int local240 = 0; local240 < local192; local240++) {
						local199[local211 + local240 * local188] = local10.method1241();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BI)I")
	public static int method2132(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(6) int local6 = local0 | local0 >>> 1;
		@Pc(22) int local22 = local6 | local6 >>> 2;
		@Pc(28) int local28 = local22 | local22 >>> 4;
		@Pc(34) int local34 = local28 | local28 >>> 8;
		@Pc(40) int local40 = local34 | local34 >>> 16;
		return local40 + 1;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIZI)V")
	public static void method2133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static59.anInt1457; local7++) {
			if (Static66.anIntArray165[local7] + Static121.anIntArray275[local7] > arg3 && Static121.anIntArray275[local7] < arg3 + arg2 && arg1 < Static167.anIntArray362[local7] + Static180.anIntArray432[local7] && Static167.anIntArray362[local7] < arg0 + arg1) {
				Static38.aBooleanArray5[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(BI)I")
	public static int method2135(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!a;I)V")
	public static void method2136(@OriginalArg(0) Class1 arg0) {
		@Pc(12) int local12 = arg0.anInt62;
		if (local12 == 324) {
			if (Static170.anInt3820 == -1) {
				Static64.anInt1687 = arg0.anInt49;
				Static170.anInt3820 = arg0.anInt59;
			}
			if (Static106.aClass43_2.aBoolean88) {
				arg0.anInt59 = Static170.anInt3820;
			} else {
				arg0.anInt59 = Static64.anInt1687;
			}
		} else if (local12 == 325) {
			if (Static170.anInt3820 == -1) {
				Static64.anInt1687 = arg0.anInt49;
				Static170.anInt3820 = arg0.anInt59;
			}
			if (Static106.aClass43_2.aBoolean88) {
				arg0.anInt59 = Static64.anInt1687;
			} else {
				arg0.anInt59 = Static170.anInt3820;
			}
		} else if (local12 == 327) {
			arg0.anInt35 = 150;
			arg0.anInt56 = (int) (Math.sin((double) Static142.anInt3325 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt71 = -1;
			arg0.anInt33 = 5;
		} else if (local12 == 328) {
			if (Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.aClass46_796 == null) {
				arg0.anInt71 = 0;
			} else {
				arg0.anInt35 = 150;
				arg0.anInt56 = (int) (Math.sin((double) Static142.anInt3325 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt33 = 5;
				arg0.anInt71 = ((int) Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.aClass46_796.method1646() << 11) + 2047;
				arg0.anInt70 = Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2814;
				arg0.anInt19 = Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2809;
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIILclient!a;I)V")
	public static void method2137(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5) {
		@Pc(18) int local18 = Math.min(arg4.anInt50 / 2, arg4.anInt20 / 2);
		@Pc(27) int local27 = arg5 * arg5 + arg2 * arg2;
		if (local27 <= local18 * local18 || local27 >= 90000) {
			Static111.method2059(arg4, Static98.aClass4_Sub1_Sub7_Sub2Array8[arg1], arg5, arg3, arg2, arg0);
			return;
		}
		@Pc(41) int local41 = Static152.anInt3459 + Static8.anInt297 & 0x7FF;
		@Pc(45) int local45 = Class4_Sub1_Sub7_Sub4.anIntArray412[local41];
		local18 -= 10;
		@Pc(54) int local54 = local45 * 256 / (Static114.anInt2767 + 256);
		@Pc(58) int local58 = Class4_Sub1_Sub7_Sub4.anIntArray416[local41];
		@Pc(66) int local66 = local58 * 256 / (Static114.anInt2767 + 256);
		@Pc(77) int local77 = arg2 * local66 - local54 * arg5 >> 16;
		@Pc(87) int local87 = local54 * arg2 + local66 * arg5 >> 16;
		@Pc(93) double local93 = Math.atan2((double) local87, (double) local77);
		@Pc(100) int local100 = (int) (Math.sin(local93) * (double) local18);
		@Pc(107) int local107 = (int) ((double) local18 * Math.cos(local93));
		Static41.aClass4_Sub1_Sub7_Sub2Array3[arg1].method2545(local100 + arg4.anInt50 / 2 + arg0 - 10, -local107 + (arg3 - -(arg4.anInt20 / 2) - 10), local93);
	}
}

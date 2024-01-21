import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!se", name = "f", descriptor = "I")
	public static int anInt4087;

	@OriginalMember(owner = "client!se", name = "l", descriptor = "[[B")
	public static byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!se", name = "m", descriptor = "Lclient!jb;")
	public static Class45 aClass45_3;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1497 = Static177.method3050(")4lang)4de");

	@OriginalMember(owner = "client!se", name = "j", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1499 = Static177.method3050("Unexpected server response)3");

	@OriginalMember(owner = "client!se", name = "b", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1498 = aClass46_1499;

	@OriginalMember(owner = "client!se", name = "d", descriptor = "Z")
	public static boolean aBoolean168 = false;

	@OriginalMember(owner = "client!se", name = "i", descriptor = "I")
	public static int anInt4090 = 0;

	@OriginalMember(owner = "client!se", name = "k", descriptor = "[Lclient!tf;")
	public static final Class86[] aClass86Array5 = new Class86[100];

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
	public static void method3129() {
		@Pc(5) Class32 local5 = Static59.aClass32_1;
		synchronized (Static59.aClass32_1) {
			Static177.anInt3974 = Static144.anInt3348;
			Static25.anInt620 = Static97.anInt2462;
			Static169.anInt3778 = Static104.anInt2622;
			Static66.anInt1811 = Static144.anInt3351;
			Static28.anInt747 = Static44.anInt1091;
			Static73.anInt1877 = Static104.anInt2623;
			Static79.aLong71 = Static165.aLong132;
			Static144.anInt3351 = 0;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method3130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!nh;BLclient!ei;ZLclient!nh;)V")
	public static void method3133(@OriginalArg(0) Class62 arg0, @OriginalArg(2) Class4_Sub1_Sub7_Sub1_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class62 arg3) {
		Static125.aBoolean128 = arg2;
		Static131.aClass62_32 = arg0;
		Static23.aClass62_6 = arg3;
		@Pc(19) int local19 = Static23.aClass62_6.method2863() - 1;
		Static95.anInt3015 = Static23.aClass62_6.method2865(local19) + local19 * 256;
		Static21.aClass4_Sub1_Sub7_Sub1_Sub1_2 = arg1;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!a;IIII)V")
	public static void method3134(@OriginalArg(0) Class1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static6.method100();
		Static145.method2932(arg1, arg3, arg1 + arg0.anInt50, arg0.anInt20 + arg3);
		if (Static123.anInt2973 == 2 || Static123.anInt2973 == 5) {
			Static145.method2934(arg1, arg3, arg0.anIntArray10, arg0.anIntArray1);
		} else {
			@Pc(52) int local52 = Static152.anInt3459 + Static8.anInt297 & 0x7FF;
			@Pc(59) int local59 = Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2832 / 32 + 48;
			@Pc(67) int local67 = 464 - Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2803 / 32;
			Static125.aClass4_Sub1_Sub7_Sub2_4.method2544(arg1, arg3, arg0.anInt50, arg0.anInt20, local59, local67, local52, Static114.anInt2767 + 256, arg0.anIntArray10, arg0.anIntArray1);
			@Pc(103) int local103;
			@Pc(117) int local117;
			for (@Pc(88) int local88 = 0; local88 < Static82.anInt2112; local88++) {
				local103 = Static140.anIntArray314[local88] * 4 + 2 - Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2832 / 32;
				local117 = Static186.anIntArray437[local88] * 4 + 2 - Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2803 / 32;
				Static111.method2059(arg0, Static91.aClass4_Sub1_Sub7_Sub2Array7[local88], local103, arg3, local117, arg1);
			}
			@Pc(173) int local173;
			for (local103 = 0; local103 < 104; local103++) {
				for (local117 = 0; local117 < 104; local117++) {
					@Pc(147) Class11 local147 = Static122.aClass11ArrayArrayArray1[Static73.anInt1873][local103][local117];
					if (local147 != null) {
						@Pc(161) int local161 = local103 * 4 + 2 - Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2832 / 32;
						local173 = local117 * 4 + 2 - Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2803 / 32;
						Static111.method2059(arg0, Static33.aClass4_Sub1_Sub7_Sub2Array2[0], local161, arg3, local173, arg1);
					}
				}
			}
			@Pc(249) int local249;
			for (local117 = 0; local117 < Static87.anInt2219; local117++) {
				@Pc(203) Class4_Sub1_Sub1_Sub1_Sub2 local203 = Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1[Static35.anIntArray82[local117]];
				if (local203 != null && local203.method2111()) {
					@Pc(212) Class4_Sub1_Sub11 local212 = local203.aClass4_Sub1_Sub11_1;
					if (local212 != null && local212.anIntArray210 != null) {
						local212 = local212.method1742();
					}
					if (local212 != null && local212.aBoolean101 && local212.aBoolean98) {
						local173 = local203.anInt2832 / 32 - Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2832 / 32;
						local249 = local203.anInt2803 / 32 - Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2803 / 32;
						Static111.method2059(arg0, Static33.aClass4_Sub1_Sub7_Sub2Array2[1], local173, arg3, local249, arg1);
					}
				}
			}
			for (@Pc(265) int local265 = 0; local265 < Static126.anInt3006; local265++) {
				@Pc(273) Class4_Sub1_Sub1_Sub1_Sub1 local273 = Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[Static167.anIntArray369[local265]];
				if (local273 != null && local273.method2111()) {
					local173 = local273.anInt2832 / 32 - Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2832 / 32;
					local249 = local273.anInt2803 / 32 - Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2803 / 32;
					@Pc(303) boolean local303 = false;
					@Pc(308) long local308 = local273.aClass46_796.method1646();
					for (@Pc(310) int local310 = 0; local310 < Static148.anInt3385; local310++) {
						if (Static84.aLongArray50[local310] == local308 && Static132.anIntArray294[local310] != 0) {
							local303 = true;
							break;
						}
					}
					@Pc(335) boolean local335 = false;
					if (Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2110 != 0 && local273.anInt2110 != 0 && local273.anInt2110 == Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2110) {
						local335 = true;
					}
					if (local303) {
						Static111.method2059(arg0, Static33.aClass4_Sub1_Sub7_Sub2Array2[3], local173, arg3, local249, arg1);
					} else if (local335) {
						Static111.method2059(arg0, Static33.aClass4_Sub1_Sub7_Sub2Array2[4], local173, arg3, local249, arg1);
					} else {
						Static111.method2059(arg0, Static33.aClass4_Sub1_Sub7_Sub2Array2[2], local173, arg3, local249, arg1);
					}
				}
			}
			@Pc(404) Class92[] local404 = Static121.aClass92Array1;
			@Pc(524) int local524;
			for (local173 = 0; local173 < local404.length; local173++) {
				@Pc(412) Class92 local412 = local404[local173];
				if (local412 != null && local412.anInt4005 != 0 && Static142.anInt3325 % 20 < 10) {
					@Pc(475) int local475;
					@Pc(464) int local464;
					if (local412.anInt4005 == 1 && local412.anInt4007 >= 0 && Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1.length > local412.anInt4007) {
						@Pc(451) Class4_Sub1_Sub1_Sub1_Sub2 local451 = Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local412.anInt4007];
						if (local451 != null) {
							local464 = local451.anInt2832 / 32 - Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2832 / 32;
							local475 = local451.anInt2803 / 32 - Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2803 / 32;
							Static117.method2137(arg1, local412.anInt4001, local475, arg3, arg0, local464);
						}
					}
					if (local412.anInt4005 == 2) {
						local464 = (-Static184.anInt4144 + local412.anInt4004) * 4 + 2 - Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2803 / 32;
						local524 = (local412.anInt3996 - Static103.anInt2610) * 4 + 2 - Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2832 / 32;
						Static117.method2137(arg1, local412.anInt4001, local464, arg3, arg0, local524);
					}
					if (local412.anInt4005 == 10 && local412.anInt4007 >= 0 && local412.anInt4007 < Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1.length) {
						@Pc(555) Class4_Sub1_Sub1_Sub1_Sub1 local555 = Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local412.anInt4007];
						if (local555 != null) {
							local475 = local555.anInt2803 / 32 - Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2803 / 32;
							local464 = local555.anInt2832 / 32 - Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2832 / 32;
							Static117.method2137(arg1, local412.anInt4001, local475, arg3, arg0, local464);
						}
					}
				}
			}
			if (Static4.anInt2846 != 0) {
				local524 = Static170.anInt3809 * 4 + 2 - Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2803 / 32;
				local249 = Static4.anInt2846 * 4 + 2 - Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2832 / 32;
				Static111.method2059(arg0, Static185.aClass4_Sub1_Sub7_Sub2_7, local249, arg3, local524, arg1);
			}
			Static145.method2941(arg1 + arg0.anInt50 / 2 - 1, arg0.anInt20 / 2 + arg3 + -1, 3, 3, 16777215);
		}
		Static38.aBooleanArray5[arg2] = true;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)Lclient!a;")
	public static Class1 method3136(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = arg0 >> 16;
		@Pc(19) int local19 = arg0 & 0xFFFF;
		if (Static54.aClass1ArrayArray1[local11] == null || Static54.aClass1ArrayArray1[local11][local19] == null) {
			@Pc(33) boolean local33 = Static165.method2751(local11);
			if (!local33) {
				return null;
			}
		}
		return Static54.aClass1ArrayArray1[local11][local19];
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!be", name = "X", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!be", name = "fb", descriptor = "Lclient!kd;")
	public static Class40_Sub1 aClass40_Sub1_5;

	@OriginalMember(owner = "client!be", name = "zb", descriptor = "J")
	public static long aLong9;

	@OriginalMember(owner = "client!be", name = "Z", descriptor = "Z")
	public static boolean aBoolean6 = true;

	@OriginalMember(owner = "client!be", name = "ab", descriptor = "[I")
	public static int[] anIntArray16 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!be", name = "wb", descriptor = "Lclient!qc;")
	private static Class60 aClass60_100 = Static121.method2047("Please use a different world)3");

	@OriginalMember(owner = "client!be", name = "bb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_96 = aClass60_100;

	@OriginalMember(owner = "client!be", name = "pb", descriptor = "Lclient!qc;")
	private static Class60 aClass60_99 = Static121.method2047("Examine");

	@OriginalMember(owner = "client!be", name = "db", descriptor = "Lclient!qc;")
	public static Class60 aClass60_97 = aClass60_99;

	@OriginalMember(owner = "client!be", name = "gb", descriptor = "[Lclient!qc;")
	public static Class60[] aClass60Array3 = new Class60[5];

	@OriginalMember(owner = "client!be", name = "jb", descriptor = "I")
	public static int anInt233 = 0;

	@OriginalMember(owner = "client!be", name = "kb", descriptor = "I")
	public static int anInt234 = 0;

	@OriginalMember(owner = "client!be", name = "lb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_98 = Static121.method2047("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!be", name = "tb", descriptor = "[Z")
	public static boolean[] aBooleanArray1 = new boolean[112];

	@OriginalMember(owner = "client!be", name = "xb", descriptor = "Z")
	public static boolean aBoolean8 = false;

	@OriginalMember(owner = "client!be", name = "Cb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_101 = aClass60_100;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(JI)V")
	public static void method195(@OriginalArg(0) long arg0) {
		if (arg0 != 0L) {
			Static56.aClass4_Sub13_Sub1_1.method1265(66);
			Static56.aClass4_Sub13_Sub1_1.method1242(arg0);
		}
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V")
	public static void method197() {
		Static120.aClass48_45.method1393();
		Static55.aClass48_34.method1393();
		Static5.aClass48_2.method1393();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IZI)I")
	public static int method198(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class4_Sub12 local15 = (Class4_Sub12) Static111.aClass66_13.method1834((long) arg1);
		if (local15 == null) {
			return 0;
		} else if (arg0 >= 0 && arg0 < local15.anIntArray151.length) {
			return local15.anIntArray151[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(I)I")
	public static int method199() {
		@Pc(9) int local9 = Static54.method1001(Static88.anInt2065, Static74.anInt1856, Static129.anInt3003);
		return local9 - Static23.anInt663 >= 800 || (Static95.aByteArrayArrayArray5[Static129.anInt3003][Static88.anInt2065 >> 7][Static74.anInt1856 >> 7] & 0x4) == 0 ? 3 : Static129.anInt3003;
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V")
	public static void method200() {
		aClass60_98 = null;
		aClass40_Sub1_5 = null;
		aClass60_97 = null;
		aClass60_99 = null;
		aClass60_101 = null;
		aBooleanArray1 = null;
		anIntArray16 = null;
		aClass60Array3 = null;
		aClass60_100 = null;
		aByteArrayArrayArray1 = null;
		aClass60_96 = null;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IZBILclient!kd;IB)V")
	public static void method201(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class40_Sub1 arg4, @OriginalArg(5) int arg5) {
		@Pc(10) long local10 = (long) (arg3 + (arg0 << 16));
		@Pc(16) Class4_Sub4_Sub15 local16 = (Class4_Sub4_Sub15) Static105.aClass66_10.method1834(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class4_Sub4_Sub15) Static32.aClass66_2.method1834(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class4_Sub4_Sub15) Static60.aClass66_8.method1834(local10);
		if (local16 == null) {
			if (!arg1) {
				local16 = (Class4_Sub4_Sub15) Static34.aClass66_3.method1834(local10);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class4_Sub4_Sub15();
			local16.aClass40_Sub1_21 = arg4;
			local16.anInt2865 = arg5;
			local16.aByte7 = arg2;
			if (arg1) {
				Static105.aClass66_10.method1830(local16, local10);
				Static83.anInt1975++;
			} else {
				Static126.aClass13_2.method289(local16);
				Static60.aClass66_8.method1830(local16, local10);
				Static111.anInt2682++;
			}
		} else if (arg1) {
			local16.method2094();
			Static105.aClass66_10.method1830(local16, local10);
			Static111.anInt2682--;
			Static83.anInt1975++;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!rf;I)V")
	public static void method202(@OriginalArg(0) Class4_Sub19 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0.anInt2494 == 0) {
			local1 = Static7.aClass28_3.method796(arg0.anInt2490, arg0.anInt2496, arg0.anInt2499);
		}
		if (arg0.anInt2494 == 1) {
			local1 = Static7.aClass28_3.method804(arg0.anInt2490, arg0.anInt2496, arg0.anInt2499);
		}
		@Pc(34) int local34 = -1;
		if (arg0.anInt2494 == 2) {
			local1 = Static7.aClass28_3.method783(arg0.anInt2490, arg0.anInt2496, arg0.anInt2499);
		}
		if (arg0.anInt2494 == 3) {
			local1 = Static7.aClass28_3.method759(arg0.anInt2490, arg0.anInt2496, arg0.anInt2499);
		}
		@Pc(66) int local66 = 0;
		@Pc(68) int local68 = 0;
		if (local1 != 0) {
			local34 = local1 >> 14 & 0x7FFF;
			@Pc(89) int local89 = Static7.aClass28_3.method760(arg0.anInt2490, arg0.anInt2496, arg0.anInt2499, local1);
			local68 = local89 >> 6 & 0x3;
			local66 = local89 & 0x1F;
		}
		arg0.anInt2485 = local68;
		arg0.anInt2484 = local34;
		arg0.anInt2498 = local66;
	}

	@OriginalMember(owner = "client!be", name = "f", descriptor = "(I)V")
	public static void method203() {
		@Pc(19) int local19;
		if (Static111.anInt2692 > 0) {
			for (local19 = 0; local19 < 256; local19++) {
				if (Static111.anInt2692 > 768) {
					Static8.anIntArray12[local19] = Static48.method936(1024 - Static111.anInt2692, Static23.anIntArray44[local19], Static19.anIntArray31[local19]);
				} else if (Static111.anInt2692 > 256) {
					Static8.anIntArray12[local19] = Static19.anIntArray31[local19];
				} else {
					Static8.anIntArray12[local19] = Static48.method936(256 - Static111.anInt2692, Static19.anIntArray31[local19], Static23.anIntArray44[local19]);
				}
			}
		} else if (Static129.anInt2996 > 0) {
			for (local19 = 0; local19 < 256; local19++) {
				if (Static129.anInt2996 > 768) {
					Static8.anIntArray12[local19] = Static48.method936(1024 - Static129.anInt2996, Static23.anIntArray44[local19], Static95.anIntArray232[local19]);
				} else if (Static129.anInt2996 <= 256) {
					Static8.anIntArray12[local19] = Static48.method936(256 - Static129.anInt2996, Static95.anIntArray232[local19], Static23.anIntArray44[local19]);
				} else {
					Static8.anIntArray12[local19] = Static95.anIntArray232[local19];
				}
			}
		} else {
			for (local19 = 0; local19 < 256; local19++) {
				Static8.anIntArray12[local19] = Static23.anIntArray44[local19];
			}
		}
		Static80.method1712(0, 9, 128, 263);
		Static46.aClass4_Sub4_Sub3_Sub2_3.method915(0, 0);
		@Pc(165) int local165 = 6885;
		local19 = 0;
		Static80.method1711();
		@Pc(183) int local183;
		@Pc(187) int local187;
		@Pc(200) int local200;
		@Pc(207) int local207;
		@Pc(219) int local219;
		@Pc(217) int local217;
		@Pc(224) int local224;
		for (@Pc(170) int local170 = 1; local170 < 255; local170++) {
			local183 = (256 - local170) * Static131.anIntArray341[local170] / 256;
			local187 = local183 + 22;
			if (local187 < 0) {
				local187 = 0;
			}
			local19 += local187;
			for (local200 = local187; local200 < 128; local200++) {
				local207 = Static84.anIntArray203[local19++];
				if (local207 == 0) {
					local165++;
				} else {
					local217 = 256 - local207;
					local219 = local207;
					local224 = Static20.aClass2_1.anIntArray145[local165];
					local207 = Static8.anIntArray12[local207];
					Static20.aClass2_1.anIntArray145[local165++] = (local217 * (local224 & 0xFF00FF) + (local207 & 0xFF00FF) * local219 & 0xFF00FF00) + ((local207 & 0xFF00) * local219 + ((local224 & 0xFF00) * local217) & 0xFF0000) >> 8;
				}
			}
			local165 += local187 + 765 - 128;
		}
		local165 = 7546;
		Static80.method1712(637, 9, 765, 263);
		Static18.aClass4_Sub4_Sub3_Sub2_1.method915(382, 0);
		Static80.method1711();
		local19 = 0;
		for (local183 = 1; local183 < 255; local183++) {
			local187 = (256 - local183) * Static131.anIntArray341[local183] / 256;
			local200 = 103 - local187;
			local165 += local187;
			for (local207 = 0; local207 < local200; local207++) {
				local219 = Static84.anIntArray203[local19++];
				if (local219 == 0) {
					local165++;
				} else {
					local217 = local219;
					@Pc(348) int local348 = Static20.aClass2_1.anIntArray145[local165];
					local224 = 256 - local219;
					local219 = Static8.anIntArray12[local219];
					Static20.aClass2_1.anIntArray145[local165++] = (local217 * (local219 & 0xFF00) + (local348 & 0xFF00) * local224 & 0xFF0000) + (local224 * (local348 & 0xFF00FF) + local217 * (local219 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local165 += 765 - local200 - local187;
			local19 += 128 - local200;
		}
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(Z)I")
	public static int method204() {
		return Static20.anInt582++;
	}
}

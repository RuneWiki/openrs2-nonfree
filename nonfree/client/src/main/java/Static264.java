import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!t", name = "f", descriptor = "[I")
	public static int[] anIntArray426 = new int[64];

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
	public static void method4155() {
		while (true) {
			if (Static13.aClass1_Sub14_Sub1_1.method1412(Static88.anInt1723) >= 27) {
				@Pc(16) int local16 = Static13.aClass1_Sub14_Sub1_1.method1411(15);
				if (local16 != 32767) {
					@Pc(21) boolean local21 = false;
					if (Static83.aClass15_Sub5_Sub1Array1[local16] == null) {
						Static83.aClass15_Sub5_Sub1Array1[local16] = new Class15_Sub5_Sub1();
						local21 = true;
					}
					@Pc(39) Class15_Sub5_Sub1 local39 = Static83.aClass15_Sub5_Sub1Array1[local16];
					Static104.anIntArray178[Static85.anInt1689++] = local16;
					local39.anInt5563 = Static313.anInt2966;
					if (local39.aClass99_1 != null && local39.aClass99_1.method2644()) {
						Static27.method456(local39);
					}
					@Pc(68) int local68 = Static190.anIntArray300[Static13.aClass1_Sub14_Sub1_1.method1411(3)];
					if (local21) {
						local39.anInt5593 = local39.anInt5554 = local68;
					}
					local39.method3200(Static261.method4114(Static13.aClass1_Sub14_Sub1_1.method1411(14)));
					@Pc(91) int local91 = Static13.aClass1_Sub14_Sub1_1.method1411(5);
					@Pc(96) int local96 = Static13.aClass1_Sub14_Sub1_1.method1411(5);
					if (local91 > 15) {
						local91 -= 32;
					}
					@Pc(108) int local108 = Static13.aClass1_Sub14_Sub1_1.method1411(1);
					if (local96 > 15) {
						local96 -= 32;
					}
					@Pc(120) int local120 = Static13.aClass1_Sub14_Sub1_1.method1411(1);
					if (local120 == 1) {
						Static263.anIntArray425[Static224.anInt4118++] = local16;
					}
					local39.method4700(local39.aClass99_1.anInt3050);
					local39.anInt5543 = local39.aClass99_1.anInt3069;
					local39.anInt5529 = local39.aClass99_1.anInt3062;
					if (local39.anInt5529 == 0) {
						local39.anInt5554 = 0;
					}
					local39.method4693(Static90.aClass15_Sub5_Sub2_2.anIntArray501[0] + local91, local39.method4702(), local96 + Static90.aClass15_Sub5_Sub2_2.anIntArray504[0], local108 == 1);
					if (local39.aClass99_1.method2644()) {
						Static224.method3476(0, null, local39.anIntArray501[0], local39, null, local39.anIntArray504[0], Static65.anInt1300);
					}
					continue;
				}
			}
			Static13.aClass1_Sub14_Sub1_1.method1407();
			return;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BI)V")
	public static void method4159(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub2_Sub11 local8 = Static5.method35(arg0, 10);
		local8.method2873();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IBIZLclient!hi;)V")
	public static void method4162(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class66 arg3) {
		@Pc(8) int local8 = arg3.anInt2204;
		if (arg3.aByte10 == 0) {
			arg3.anInt2204 = arg3.anInt2169;
		} else if (arg3.aByte10 == 1) {
			arg3.anInt2204 = arg1 - arg3.anInt2169;
		} else if (arg3.aByte10 == 2) {
			arg3.anInt2204 = arg1 * arg3.anInt2169 >> 14;
		} else if (arg3.aByte10 == 3) {
			if (arg3.anInt2176 == 2) {
				arg3.anInt2204 = arg3.anInt2169 * 32 + (arg3.anInt2169 - 1) * arg3.anInt2155;
			} else if (arg3.anInt2176 == 7) {
				arg3.anInt2204 = (arg3.anInt2169 - 1) * arg3.anInt2155 + arg3.anInt2169 * 115;
			}
		}
		@Pc(96) int local96 = arg3.anInt2207;
		if (arg3.aByte11 == 0) {
			arg3.anInt2207 = arg3.anInt2185;
		} else if (arg3.aByte11 == 1) {
			arg3.anInt2207 = arg0 - arg3.anInt2185;
		} else if (arg3.aByte11 == 2) {
			arg3.anInt2207 = arg0 * arg3.anInt2185 >> 14;
		} else if (arg3.aByte11 == 3) {
			if (arg3.anInt2176 == 2) {
				arg3.anInt2207 = arg3.anInt2185 * 32 + arg3.anInt2146 * (arg3.anInt2185 - 1);
			} else if (arg3.anInt2176 == 7) {
				arg3.anInt2207 = arg3.anInt2146 * (arg3.anInt2185 - 1) + arg3.anInt2185 * 12;
			}
		}
		if (arg3.aByte10 == 4) {
			arg3.anInt2204 = arg3.anInt2193 * arg3.anInt2207 / arg3.anInt2222;
		}
		if (arg3.aByte11 == 4) {
			arg3.anInt2207 = arg3.anInt2222 * arg3.anInt2204 / arg3.anInt2193;
		}
		if (Static95.aBoolean103 && (Static37.method679(arg3).anInt3570 != 0 || arg3.anInt2176 == 0)) {
			if (arg3.anInt2207 < 5 && arg3.anInt2204 < 5) {
				arg3.anInt2207 = 5;
				arg3.anInt2204 = 5;
			} else {
				if (arg3.anInt2204 <= 0) {
					arg3.anInt2204 = 5;
				}
				if (arg3.anInt2207 <= 0) {
					arg3.anInt2207 = 5;
				}
			}
		}
		if (arg3.anInt2210 == 1337) {
			Static7.aClass66_5 = arg3;
		}
		if (arg2 && arg3.anObjectArray12 != null && (arg3.anInt2204 != local8 || arg3.anInt2207 != local96)) {
			@Pc(297) Class1_Sub10 local297 = new Class1_Sub10();
			local297.aClass66_10 = arg3;
			local297.anObjectArray1 = arg3.anObjectArray12;
			Static13.aClass59_8.method1706(local297);
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
	public static void method4163() {
		Static105.aClass66Array2 = null;
		Static157.method1346(0, Static292.anInt5236, Static270.anInt4897, 0, -1, 0, 0, Static120.anInt2505);
		if (Static105.aClass66Array2 != null) {
			Static108.method1949(Static309.aClass66_50.anInt2160, 0, Static292.anInt5236, Static105.aClass66Array2, -1412584499, Static94.anInt3443, Static35.anInt3968, 0, Static120.anInt2505);
			Static105.aClass66Array2 = null;
		}
	}
}

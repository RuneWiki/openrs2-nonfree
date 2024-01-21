import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "Lclient!ei;")
	public static Class4_Sub1_Sub7_Sub1_Sub1 aClass4_Sub1_Sub7_Sub1_Sub1_6;

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "[I")
	public static int[] anIntArray330;

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1303 = Static177.method3050("Take");

	@OriginalMember(owner = "client!sf", name = "k", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1304 = aClass46_1303;

	@OriginalMember(owner = "client!sf", name = "l", descriptor = "[[I")
	public static final int[][] anIntArrayArray27 = new int[104][104];

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZZ)V")
	public static void method2667(@OriginalArg(1) boolean arg0) {
		if (Static4.anInt2846 == Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2832 >> 7 && Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2803 >> 7 == Static170.anInt3809) {
			Static4.anInt2846 = 0;
		}
		@Pc(31) int local31 = Static126.anInt3006;
		if (arg0) {
			local31 = 1;
		}
		for (@Pc(41) int local41 = 0; local41 < local31; local41++) {
			@Pc(47) Class4_Sub1_Sub1_Sub1_Sub1 local47;
			@Pc(49) long local49;
			if (arg0) {
				local47 = Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1;
				local49 = 8791798054912L;
			} else {
				local47 = Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[Static167.anIntArray369[local41]];
				local49 = (long) Static167.anIntArray369[local41] << 32;
			}
			if (local47 != null && local47.method2111()) {
				local47.aBoolean94 = false;
				@Pc(78) int local78 = local47.anInt2832 >> 7;
				if ((Static103.aBoolean113 && Static126.anInt3006 > 50 || Static126.anInt3006 > 200) && !arg0 && local47.anInt2809 == local47.anInt2816) {
					local47.aBoolean94 = true;
				}
				@Pc(107) int local107 = local47.anInt2803 >> 7;
				if (local78 >= 0 && local78 < 104 && local107 >= 0 && local107 < 104) {
					if (local47.aClass4_Sub1_Sub1_Sub4_1 == null || Static142.anInt3325 < local47.anInt2109 || Static142.anInt3325 >= local47.anInt2104) {
						if ((local47.anInt2832 & 0x7F) == 64 && (local47.anInt2803 & 0x7F) == 64) {
							if (Static113.anInt2757 == Static98.anIntArrayArray18[local78][local107]) {
								continue;
							}
							Static98.anIntArrayArray18[local78][local107] = Static113.anInt2757;
						}
						local47.anInt2834 = Static106.method1998(local47.anInt2832, Static73.anInt1873, local47.anInt2803);
						Static101.method1950(Static73.anInt1873, local47.anInt2832, local47.anInt2803, local47.anInt2834, 60, local47, local47.anInt2822, local49, local47.aBoolean120);
					} else {
						local47.aBoolean94 = false;
						local47.anInt2834 = Static106.method1998(local47.anInt2832, Static73.anInt1873, local47.anInt2803);
						Static81.method1611(Static73.anInt1873, local47.anInt2832, local47.anInt2803, local47.anInt2834, local47, local47.anInt2822, local49, local47.anInt2111, local47.anInt2105, local47.anInt2102, local47.anInt2099);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZIILclient!jc;)V")
	public static void method2668(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4_Sub1_Sub1_Sub1_Sub1 arg3) {
		if (Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1 == arg3 || Static3.anInt86 >= 400) {
			return;
		}
		@Pc(54) Class46 local54;
		if (arg3.anInt2098 == 0) {
			local54 = Static69.method1482(new Class46[] { arg3.aClass46_796, method2670(arg3.anInt2107, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2107), Static71.aClass46_715, Static119.aClass46_1070, Static127.method2240(arg3.anInt2107), Static1.aClass46_8 });
		} else {
			local54 = Static69.method1482(new Class46[] { arg3.aClass46_796, Static71.aClass46_715, Static72.aClass46_717, Static127.method2240(arg3.anInt2098), Static1.aClass46_8 });
		}
		@Pc(94) int local94;
		if (Static53.anInt1331 == 1) {
			Static40.method695((short) 15, arg0, (long) arg1, Static69.method1482(new Class46[] { Static1.aClass46_1, Static83.aClass46_800, local54 }), arg2, Static21.aClass46_188);
		} else if (!Static86.aBoolean97) {
			for (local94 = 7; local94 >= 0; local94--) {
				if (Static81.aClass46Array14[local94] != null) {
					@Pc(108) short local108 = 0;
					if (Static41.anInt1061 == 0 && Static81.aClass46Array14[local94].method1683(Static180.aClass46_1479)) {
						if (arg3.anInt2107 > Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2107) {
							local108 = 2000;
						}
						if (Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2110 != 0 && arg3.anInt2110 != 0) {
							if (Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2110 == arg3.anInt2110) {
								local108 = 2000;
							} else {
								local108 = 0;
							}
						}
					} else if (Static46.aBooleanArray7[local94]) {
						local108 = 2000;
					}
					@Pc(160) short local160 = Static94.aShortArray27[local94];
					@Pc(165) short local165 = (short) (local160 + local108);
					Static40.method695(local165, arg0, (long) arg1, Static69.method1482(new Class46[] { Static45.aClass46_394, local54 }), arg2, Static81.aClass46Array14[local94]);
				}
			}
		} else if ((Static38.anInt1000 & 0x8) == 8) {
			Static40.method695((short) 21, arg0, (long) arg1, Static69.method1482(new Class46[] { Static30.aClass46_250, Static83.aClass46_800, local54 }), arg2, Static111.aClass46_1005);
		}
		for (local94 = 0; local94 < Static3.anInt86; local94++) {
			if (Static11.aShortArray5[local94] == 11) {
				Static166.aClass46Array24[local94] = Static69.method1482(new Class46[] { Static45.aClass46_394, local54 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)Lclient!jd;")
	public static Class46 method2670(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return Static181.aClass46_1487;
		} else if (local8 < -6) {
			return Static113.aClass46_1016;
		} else if (local8 < -3) {
			return Static165.aClass46_1347;
		} else if (local8 < 0) {
			return Static131.aClass46_1144;
		} else if (local8 > 9) {
			return Static163.aClass46_1374;
		} else if (local8 > 6) {
			return Static113.aClass46_1014;
		} else if (local8 > 3) {
			return Static100.aClass46_916;
		} else if (local8 > 0) {
			return Static46.aClass46_471;
		} else {
			return Static102.aClass46_941;
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)Z")
	public static boolean method2673() {
		try {
			if (Static71.anInt1861 == 2) {
				if (Static122.aClass4_Sub15_1 == null) {
					Static122.aClass4_Sub15_1 = Static193.method1927(Static140.aClass62_35, Static135.anInt3221, Static134.anInt3187);
					if (Static122.aClass4_Sub15_1 == null) {
						return false;
					}
				}
				if (Static184.aClass77_106 == null) {
					Static184.aClass77_106 = new Class77(Static2.aClass62_1, Static141.aClass62_36);
				}
				if (Static175.aClass4_Sub2_Sub4_2.method2802(Static184.aClass77_106, Static122.aClass4_Sub15_1, Static144.aClass62_37)) {
					Static175.aClass4_Sub2_Sub4_2.method2780();
					Static175.aClass4_Sub2_Sub4_2.method2787(Static99.anInt2522);
					Static175.aClass4_Sub2_Sub4_2.method2775(Static122.aClass4_Sub15_1, Static135.aBoolean135);
					Static122.aClass4_Sub15_1 = null;
					Static71.anInt1861 = 0;
					Static140.aClass62_35 = null;
					Static184.aClass77_106 = null;
					return true;
				}
			}
		} catch (@Pc(56) Exception local56) {
			local56.printStackTrace();
			Static175.aClass4_Sub2_Sub4_2.method2806();
			Static122.aClass4_Sub15_1 = null;
			Static140.aClass62_35 = null;
			Static184.aClass77_106 = null;
			Static71.anInt1861 = 0;
		}
		return false;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!nh;I)V")
	public static void method2675(@OriginalArg(0) Class62 arg0) {
		Static106.aClass62_27 = arg0;
		Static106.aClass62_27.method2865(4);
	}
}

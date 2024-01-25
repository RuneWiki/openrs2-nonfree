import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "F")
	public static float aFloat19;

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_12 = new Class243(56, -1);

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
	public static void method966() {
		@Pc(1) Class231 local1 = Static421.aClass231_60;
		synchronized (Static421.aClass231_60) {
			Static421.aClass231_60.method6240();
		}
		local1 = Static8.aClass231_2;
		synchronized (Static8.aClass231_2) {
			Static8.aClass231_2.method6240();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "()V")
	public static void method968() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static546.aClass262ArrayArrayArray4 != null) {
			for (local3 = 0; local3 < Static546.aClass262ArrayArrayArray4.length; local3++) {
				for (local6 = 0; local6 < Static515.anInt3809; local6++) {
					for (local9 = 0; local9 < Static315.anInt5693; local9++) {
						if (Static546.aClass262ArrayArrayArray4[local3][local6][local9] != null) {
							Static546.aClass262ArrayArrayArray4[local3][local6][local9].method6718();
						}
						Static546.aClass262ArrayArrayArray4[local3][local6][local9] = null;
					}
				}
			}
		}
		Static546.aClass262ArrayArrayArray4 = null;
		Static164.aClass75Array1 = null;
		if (Static274.aClass262ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static274.aClass262ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static515.anInt3809; local6++) {
					for (local9 = 0; local9 < Static315.anInt5693; local9++) {
						if (Static274.aClass262ArrayArrayArray3[local3][local6][local9] != null) {
							Static274.aClass262ArrayArrayArray3[local3][local6][local9].method6718();
						}
						Static274.aClass262ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static274.aClass262ArrayArrayArray3 = null;
		Static427.aClass75Array2 = null;
		Static399.aClass262ArrayArrayArray2 = null;
		Static532.aClass75Array3 = null;
		Static511.anInt8888 = 0;
		if (Static432.aClass266Array2 != null) {
			for (local3 = 0; local3 < Static511.anInt8888; local3++) {
				Static432.aClass266Array2[local3] = null;
			}
		}
		if (Static126.aClass1_Sub1Array5 != null) {
			for (local3 = 0; local3 < Static112.anInt2255; local3++) {
				Static126.aClass1_Sub1Array5[local3] = null;
			}
			Static112.anInt2255 = 0;
		}
		if (Static410.aClass83Array1 != null) {
			for (local3 = 0; local3 < Static361.anInt6824; local3++) {
				Static410.aClass83Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static323.anInt6015; local6++) {
				for (local9 = 0; local9 < Static515.anInt3809; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static315.anInt5693; local160++) {
						Static139.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static361.anInt6824 = 0;
		}
		Static156.anIntArrayArrayArray8 = null;
		Static535.method6662();
		Static64.aClass107_1.method2838();
		Static206.aByteArrayArray15 = null;
		Static63.anIntArrayArray6 = null;
		Static127.aShortArrayArray2 = null;
		Static41.aClass137_1 = null;
		Static88.aClass181_7 = null;
		Static452.aClass39_10 = null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(CI)Z")
	public static boolean method969(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILclient!cd;IIIILclient!cd;II)V")
	public static void method972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(7) Class1_Sub1_Sub2 arg5, @OriginalArg(8) int arg6) {
		@Pc(7) int local7 = arg2.method4384();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class35 local21 = (Class35) Static253.aClass231_43.method6228((long) local7);
		if (local21 == null) {
			@Pc(33) Class241[] local33 = Static558.method6365(Static460.aClass53_147, local7);
			if (local33 == null) {
				return;
			}
			local21 = Static103.aClass39_3.method6018(local33[0]);
			Static253.aClass231_43.method6232(local21, (long) local7);
		}
		Static101.method7084(0, arg5.anInt7660, arg0 >> 1, arg4 >> 1, arg5.aByte90, arg5.anInt7659, arg5.method4394() * 64);
		@Pc(79) int local79 = Static429.anIntArray610[0] + arg1 - 18;
		@Pc(87) int local87 = local79 + arg3 / 4 * 18;
		@Pc(97) int local97 = Static429.anIntArray610[1] + arg6 - 16 - 54;
		@Pc(105) int local105 = local97 + arg3 % 4 * 18;
		local21.method7351(local87, local105);
		if (arg2 == arg5) {
			Static103.aClass39_3.method6061(18, -256, 18, local105 - 1, local87 + -1);
		}
		@Pc(127) Class6_Sub2 local127 = Static212.method3367();
		local127.anInt484 = local87;
		local127.anInt480 = local87 + 16;
		local127.anInt481 = local105;
		local127.anInt482 = local105 + 16;
		local127.aClass1_Sub1_Sub2_1 = arg2;
		Static331.aClass107_5.method2830(local127);
	}
}

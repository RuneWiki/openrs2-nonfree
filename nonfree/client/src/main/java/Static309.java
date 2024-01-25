import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!li", name = "z", descriptor = "I")
	public static int anInt5528;

	@OriginalMember(owner = "client!li", name = "E", descriptor = "[I")
	public static final int[] anIntArray410 = new int[32];

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)Lclient!wl;")
	public static Class360 method4625(@OriginalArg(0) int arg0) {
		@Pc(8) Class360[] local8 = Static284.method4218();
		for (@Pc(16) int local16 = 0; local16 < local8.length; local16++) {
			@Pc(22) Class360 local22 = local8[local16];
			if (local22.anInt9539 == arg0) {
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIIBI)I")
	public static int method4627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg2 & 0x3;
		if ((arg3 & 0x1) == 1) {
			@Pc(12) int local12 = arg4;
			arg4 = arg5;
			arg5 = local12;
		}
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 1 + 7 - arg4 - arg0;
		} else if (local3 == 2) {
			return 1 + 7 - arg1 - arg5;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(II)V")
	public static void method4628(@OriginalArg(0) int arg0) {
		if (-1 != arg0 && Static418.aBooleanArray28[arg0]) {
			Static136.aClass259_54.method5968(arg0);
			Static2.aClass196ArrayArray1[arg0] = null;
			Static348.aClass196ArrayArray2[arg0] = null;
			Static418.aBooleanArray28[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "()V")
	public static void method4629() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static593.aClass346ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static593.aClass346ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static496.anInt8369; local6++) {
					for (local9 = 0; local9 < Static357.anInt6390; local9++) {
						if (Static593.aClass346ArrayArrayArray3[local3][local6][local9] != null) {
							Static593.aClass346ArrayArrayArray3[local3][local6][local9].method7616();
						}
						Static593.aClass346ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static593.aClass346ArrayArrayArray3 = null;
		Static569.aClass67Array8 = null;
		if (Static142.aClass346ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static142.aClass346ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static496.anInt8369; local6++) {
					for (local9 = 0; local9 < Static357.anInt6390; local9++) {
						if (Static142.aClass346ArrayArrayArray1[local3][local6][local9] != null) {
							Static142.aClass346ArrayArrayArray1[local3][local6][local9].method7616();
						}
						Static142.aClass346ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static142.aClass346ArrayArrayArray1 = null;
		Static592.aClass67Array4 = null;
		Static389.aClass346ArrayArrayArray2 = null;
		Static421.aClass67Array7 = null;
		Static557.aBooleanArrayArray9 = null;
		Static282.aBooleanArrayArray4 = null;
		Static430.aBooleanArrayArrayArray2 = null;
		Static277.aBooleanArrayArrayArray1 = null;
		Static577.method7798();
		if (Static497.aClass6_Sub1_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static2.anInt11; local3++) {
				Static497.aClass6_Sub1_Sub1Array1[local3] = null;
			}
			Static2.anInt11 = 0;
		}
		if (Static3.aClass6_Sub1ArrayArray1 != null) {
			for (local3 = 0; local3 < Static26.anIntArray39[0]; local3++) {
				Static3.aClass6_Sub1ArrayArray1[0][local3] = null;
			}
			for (local6 = 0; local6 < Static26.anIntArray39[1]; local6++) {
				Static3.aClass6_Sub1ArrayArray1[1][local6] = null;
			}
			Static26.anIntArray39 = new int[2];
		}
		if (Static312.aClass6_Sub1ArrayArray3 != null) {
			for (local3 = 0; local3 < Static142.anIntArray179[0]; local3++) {
				Static312.aClass6_Sub1ArrayArray3[0][local3] = null;
			}
			for (local6 = 0; local6 < Static142.anIntArray179[1]; local6++) {
				Static312.aClass6_Sub1ArrayArray3[1][local6] = null;
			}
			Static142.anIntArray179 = new int[2];
		}
		if (Static54.aClass6_Sub1ArrayArray2 != null) {
			for (local3 = 0; local3 < Static53.anIntArray64[0]; local3++) {
				Static54.aClass6_Sub1ArrayArray2[0][local3] = null;
			}
			for (local6 = 0; local6 < Static53.anIntArray64[1]; local6++) {
				Static54.aClass6_Sub1ArrayArray2[1][local6] = null;
			}
			Static53.anIntArray64 = new int[2];
		}
		if (Static208.aClass6_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static208.aClass6_Sub1Array1.length; local3++) {
				Static208.aClass6_Sub1Array1[local3] = null;
			}
			Static223.anInt4187 = 0;
		}
		if (Static546.aClass6_Sub1Array2 != null) {
			for (local3 = 0; local3 < Static546.aClass6_Sub1Array2.length; local3++) {
				Static546.aClass6_Sub1Array2[local3] = null;
			}
			Static524.anInt8650 = 0;
		}
		if (Static237.aClass265Array2 != null) {
			for (local3 = 0; local3 < Static441.anInt7764; local3++) {
				Static237.aClass265Array2[local3] = null;
			}
			for (local6 = 0; local6 < Static89.anInt8689; local6++) {
				for (local9 = 0; local9 < Static496.anInt8369; local9++) {
					for (@Pc(292) int local292 = 0; local292 < Static357.anInt6390; local292++) {
						Static501.aLongArrayArrayArray1[local6][local9][local292] = 0L;
					}
				}
			}
			Static441.anInt7764 = 0;
		}
		Static35.method631();
		Static380.aClass109_7.method2311();
		Static435.aByteArrayArray2 = null;
		Static381.anIntArrayArray44 = null;
		Static544.aShortArrayArray33 = null;
		if (Static563.aClass356Array1 != null) {
			Static380.method5627();
			Static356.aClass100_8.method6249(1);
			Static356.aClass100_8.method6244(0);
		}
		if (Static140.aClass72Array1 != null) {
			Static140.aClass72Array1 = null;
		}
		Static356.aClass100_8 = null;
	}
}

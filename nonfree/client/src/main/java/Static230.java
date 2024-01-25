import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!jn", name = "Y", descriptor = "Lclient!f;")
	public static Class93 aClass93_1;

	@OriginalMember(owner = "client!jn", name = "Z", descriptor = "I")
	public static int anInt4474;

	@OriginalMember(owner = "client!jn", name = "S", descriptor = "I")
	public static int anInt4469 = 0;

	@OriginalMember(owner = "client!jn", name = "W", descriptor = "Z")
	public static boolean aBoolean345 = false;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "()V")
	public static void method4159() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static61.aClass64ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static61.aClass64ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static501.anInt9458; local6++) {
					for (local9 = 0; local9 < Static420.anInt7323; local9++) {
						if (Static61.aClass64ArrayArrayArray2[local3][local6][local9] != null) {
							Static61.aClass64ArrayArrayArray2[local3][local6][local9].method1815();
						}
						Static61.aClass64ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static61.aClass64ArrayArrayArray2 = null;
		Static411.aClass7Array12 = null;
		if (Static15.aClass64ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static15.aClass64ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static501.anInt9458; local6++) {
					for (local9 = 0; local9 < Static420.anInt7323; local9++) {
						if (Static15.aClass64ArrayArrayArray1[local3][local6][local9] != null) {
							Static15.aClass64ArrayArrayArray1[local3][local6][local9].method1815();
						}
						Static15.aClass64ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static15.aClass64ArrayArrayArray1 = null;
		Static207.aClass7Array7 = null;
		Static263.aClass64ArrayArrayArray3 = null;
		Static296.aClass7Array11 = null;
		Static84.anInt1919 = 0;
		if (Static220.aClass192Array2 != null) {
			for (local3 = 0; local3 < Static84.anInt1919; local3++) {
				Static220.aClass192Array2[local3] = null;
			}
		}
		if (Static227.aClass20_Sub1Array3 != null) {
			for (local3 = 0; local3 < Static316.anInt6013; local3++) {
				Static227.aClass20_Sub1Array3[local3] = null;
			}
			Static316.anInt6013 = 0;
		}
		if (Static102.aClass108Array1 != null) {
			for (local3 = 0; local3 < Static5.anInt146; local3++) {
				Static102.aClass108Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static63.anInt1587; local6++) {
				for (local9 = 0; local9 < Static501.anInt9458; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static420.anInt7323; local160++) {
						Static8.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static5.anInt146 = 0;
		}
		Static232.anIntArrayArrayArray11 = null;
		Static465.method7074();
		Static191.aClass184_49.method5136();
		Static278.aByteArrayArray16 = null;
		Static523.anIntArrayArray120 = null;
		Static200.aShortArrayArray3 = null;
		Static164.aClass40_1 = null;
		Static170.aClass128_4 = null;
		Static281.aClass4_9 = null;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I[FFIIIIIII)V")
	public static void method4161(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(5) int local5 = arg4 - arg3;
		@Pc(9) int local9 = arg0 - arg8;
		@Pc(13) int local13 = arg6 - arg7;
		@Pc(46) float local46 = arg1[1] * (float) local5 + arg1[0] * (float) local13 + arg1[2] * (float) local9;
		@Pc(67) float local67 = arg1[5] * (float) local9 + arg1[4] * (float) local5 + (float) local13 * arg1[3];
		@Pc(88) float local88 = (float) local9 * arg1[8] + (float) local5 * arg1[7] + (float) local13 * arg1[6];
		@Pc(103) float local103 = (float) Math.sqrt((double) (local46 * local46 + local67 * local67 + local88 * local88));
		@Pc(114) float local114 = (float) Math.atan2((double) local46, (double) local88) / 6.2831855F + 0.5F;
		@Pc(127) float local127 = (float) Math.asin((double) (local67 / local103)) / 3.1415927F + arg2 + 0.5F;
		@Pc(140) float local140;
		if (arg5 == 1) {
			local140 = local114;
			local114 = -local127;
			local127 = local140;
		} else if (arg5 == 2) {
			local114 = -local114;
			local127 = -local127;
		} else if (arg5 == 3) {
			local140 = local114;
			local114 = local127;
			local127 = -local140;
		}
		Static511.aFloat186 = local127;
		Static275.aFloat107 = local114;
	}
}

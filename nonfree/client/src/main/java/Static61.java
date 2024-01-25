import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!cca", name = "I", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_17 = new Class98(68, 12);

	@OriginalMember(owner = "client!cca", name = "M", descriptor = "[I")
	public static int[] anIntArray102 = new int[1];

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "()V")
	public static void method883() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static162.aClass133ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static162.aClass133ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static547.anInt9363; local6++) {
					for (local9 = 0; local9 < Static20.anInt358; local9++) {
						if (Static162.aClass133ArrayArrayArray2[local3][local6][local9] != null) {
							Static162.aClass133ArrayArrayArray2[local3][local6][local9].method3333();
						}
						Static162.aClass133ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static162.aClass133ArrayArrayArray2 = null;
		Static496.aClass46Array4 = null;
		if (Static299.aClass133ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static299.aClass133ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static547.anInt9363; local6++) {
					for (local9 = 0; local9 < Static20.anInt358; local9++) {
						if (Static299.aClass133ArrayArrayArray3[local3][local6][local9] != null) {
							Static299.aClass133ArrayArrayArray3[local3][local6][local9].method3333();
						}
						Static299.aClass133ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static299.aClass133ArrayArrayArray3 = null;
		Static480.aClass46Array2 = null;
		Static113.aClass133ArrayArrayArray1 = null;
		Static205.aClass46Array1 = null;
		Static91.anInt1494 = 0;
		if (Static182.aClass89Array1 != null) {
			for (local3 = 0; local3 < Static91.anInt1494; local3++) {
				Static182.aClass89Array1[local3] = null;
			}
		}
		if (Static158.aClass15_Sub2Array1 != null) {
			for (local3 = 0; local3 < Static398.anInt7207; local3++) {
				Static158.aClass15_Sub2Array1[local3] = null;
			}
			Static398.anInt7207 = 0;
		}
		if (Static111.aClass255Array1 != null) {
			for (local3 = 0; local3 < Static28.anInt487; local3++) {
				Static111.aClass255Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static431.anInt7712; local6++) {
				for (local9 = 0; local9 < Static547.anInt9363; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static20.anInt358; local160++) {
						Static511.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static28.anInt487 = 0;
		}
		Static484.anIntArrayArrayArray20 = null;
		Static308.method4620();
		Static260.aClass349_8.method7897();
		Static464.aByteArrayArray25 = null;
		Static582.anIntArrayArray69 = null;
		Static205.aShortArrayArray15 = null;
		Static221.aClass175_1 = null;
		Static126.aClass93_6 = null;
		Static276.aClass90_9 = null;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIIIZIIIII)V")
	public static void method887(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg2 < 512 || arg5 < 512 || arg2 > (Static18.anInt5706 - 2) * 512 || Static80.anInt1367 * 512 - 1024 < arg5) {
			Static10.anIntArray8[0] = Static10.anIntArray8[1] = -1;
			return;
		}
		@Pc(42) int local42 = Static37.method631(arg5, arg2, arg6) - arg3;
		Static211.aClass93_7.G(arg4, 0, 0);
		Static554.aClass90_12.method7492(Static211.aClass93_7);
		Static554.aClass90_12.na(arg2, local42, arg5, Static10.anIntArray8);
		Static211.aClass93_7.G(-arg4, 0, 0);
		Static554.aClass90_12.method7492(Static211.aClass93_7);
	}
}

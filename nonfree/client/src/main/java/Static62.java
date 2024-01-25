import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
	public static int anInt1432;

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "Lclient!tc;")
	public static Class91 aClass91_3;

	@OriginalMember(owner = "client!dp", name = "i", descriptor = "I")
	public static int anInt1434;

	@OriginalMember(owner = "client!dp", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray5 = new boolean[100];

	@OriginalMember(owner = "client!dp", name = "o", descriptor = "I")
	public static int anInt1439 = 0;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(III)V")
	public static void method1257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray402[0];
		@Pc(13) int local13 = Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray401[0];
		if (Static298.anInt5725 == 1) {
			if (Static227.method3914(local13, arg0, 1, -2, 1, false, 0, 0, local8, arg1)) {
				return;
			}
			Static227.method3914(local13, arg0, 1, -3, 1, false, 0, 0, local8, arg1);
		} else if (Static227.method3914(local13, arg0, 1, -3, 1, false, 0, 0, local8, arg1)) {
			return;
		} else {
			Static227.method3914(local13, arg0, 1, -2, 1, false, 0, 0, local8, arg1);
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIII)V")
	public static void method1258(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = Static111.anInt2405 * arg2 >> 8;
		if (local9 != 0 && arg0 != -1) {
			Static183.method3399(arg0, Static226.aClass170_80, local9);
			Static46.aBoolean84 = true;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(B[[I)V")
	public static void method1259(@OriginalArg(1) int[][] arg0) {
		Static332.anIntArrayArray56 = arg0;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(BI)V")
	public static void method1263(@OriginalArg(1) int arg0) {
		if (!Static323.method5433(arg0)) {
			return;
		}
		@Pc(14) Class96[] local14 = Static348.aClass96ArrayArray1[arg0];
		for (@Pc(20) int local20 = 0; local20 < local14.length; local20++) {
			@Pc(26) Class96 local26 = local14[local20];
			if (local26 != null) {
				local26.anInt2906 = 1;
				local26.anInt2892 = 0;
				local26.anInt2950 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!nj;I[I[I[I)V")
	public static void method1265(@OriginalArg(0) Class25_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg3.length; local7++) {
			@Pc(13) int local13 = arg3[local7];
			@Pc(17) int local17 = arg1[local7];
			@Pc(21) int local21 = arg2[local7];
			for (@Pc(23) int local23 = 0; local17 != 0 && arg0.aClass146Array3.length > local23; local23++) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg0.aClass146Array3[local23] = null;
					} else {
						@Pc(37) Class17 local37 = Static261.method4492(local13);
						@Pc(40) int local40 = local37.anInt505;
						@Pc(45) Class146 local45 = arg0.aClass146Array3[local23];
						if (local45 != null) {
							if (local13 == local45.anInt4452) {
								if (local40 == 0) {
									local45 = arg0.aClass146Array3[local23] = null;
								} else if (local40 == 1) {
									local45.anInt4454 = 1;
									local45.anInt4451 = local21;
									local45.anInt4449 = 0;
									local45.anInt4456 = 0;
									local45.anInt4448 = 0;
									Static207.method3696(0, arg0.anInt5769, local37, arg0.anInt5773, Static85.aClass25_Sub1_Sub1_Sub1_1 == arg0);
								} else if (local40 == 2) {
									local45.anInt4449 = 0;
								}
							} else if (local37.anInt506 >= Static261.method4492(local45.anInt4452).anInt506) {
								local45 = arg0.aClass146Array3[local23] = null;
							}
						}
						if (local45 == null) {
							local45 = arg0.aClass146Array3[local23] = new Class146();
							local45.anInt4454 = 1;
							local45.anInt4452 = local13;
							local45.anInt4449 = 0;
							local45.anInt4448 = 0;
							local45.anInt4456 = 0;
							local45.anInt4451 = local21;
							Static207.method3696(0, arg0.anInt5769, local37, arg0.anInt5773, Static85.aClass25_Sub1_Sub1_Sub1_1 == arg0);
						}
					}
				}
				local17 >>>= 0x1;
			}
		}
	}
}

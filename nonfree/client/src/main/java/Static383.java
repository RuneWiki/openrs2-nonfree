import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "Lclient!hp;")
	public static final Class125 aClass125_39 = new Class125(50);

	@OriginalMember(owner = "client!pt", name = "h", descriptor = "[F")
	public static final float[] aFloatArray40 = new float[4];

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIII)I")
	public static int method4807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) int local16 = arg2 & 0x3;
		if (local16 == 0) {
			return arg0;
		} else if (local16 == 1) {
			return arg1;
		} else if (local16 == 2) {
			return 4095 - arg0;
		} else {
			return 4095 - arg1;
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "([II[ILclient!tt;[I)V")
	public static void method4808(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class6_Sub1_Sub2_Sub2 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) int local13 = arg1[local7];
			@Pc(17) int local17 = arg3[local7];
			@Pc(21) int local21 = arg0[local7];
			@Pc(23) int local23 = 0;
			while (local17 != 0 && arg2.aClass152Array3.length > local23) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg2.aClass152Array3[local23] = null;
					} else {
						@Pc(40) Class122 local40 = Static46.aClass247_1.method6029(local13);
						@Pc(43) int local43 = local40.anInt4145;
						@Pc(48) Class152 local48 = arg2.aClass152Array3[local23];
						if (local48 != null) {
							if (local13 == local48.anInt4899) {
								if (local43 == 0) {
									local48 = arg2.aClass152Array3[local23] = null;
								} else if (local43 == 1) {
									local48.anInt4897 = 1;
									local48.anInt4898 = 0;
									local48.anInt4902 = local21;
									local48.anInt4900 = 0;
									local48.anInt4901 = 0;
									Static448.method6790(false, arg2.anInt8811, arg2.anInt8813, arg2.aByte100, local40, 0);
								} else if (local43 == 2) {
									local48.anInt4898 = 0;
								}
							} else if (local40.anInt4146 >= Static46.aClass247_1.method6029(local48.anInt4899).anInt4146) {
								local48 = arg2.aClass152Array3[local23] = null;
							}
						}
						if (local48 == null) {
							local48 = arg2.aClass152Array3[local23] = new Class152();
							local48.anInt4902 = local21;
							local48.anInt4897 = 1;
							local48.anInt4898 = 0;
							local48.anInt4899 = local13;
							local48.anInt4901 = 0;
							local48.anInt4900 = 0;
							Static448.method6790(false, arg2.anInt8811, arg2.anInt8813, arg2.aByte100, local40, 0);
						}
					}
				}
				local23++;
				local17 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIIIIII)V")
	public static void method4809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static73.method7829(arg0, Static269.anInt5577, Static81.anInt1788);
		@Pc(17) int local17 = Static73.method7829(arg1, Static269.anInt5577, Static81.anInt1788);
		@Pc(23) int local23 = Static73.method7829(arg4, Static190.anInt4314, Static145.anInt2941);
		@Pc(29) int local29 = Static73.method7829(arg3, Static190.anInt4314, Static145.anInt2941);
		@Pc(37) int local37 = Static73.method7829(arg5 + arg0, Static269.anInt5577, Static81.anInt1788);
		@Pc(46) int local46 = Static73.method7829(arg1 - arg5, Static269.anInt5577, Static81.anInt1788);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static257.method4540(Static68.anIntArrayArray24[local48], arg2, local23, local29);
		}
		for (@Pc(72) int local72 = local17; local72 > local46; local72--) {
			Static257.method4540(Static68.anIntArrayArray24[local72], arg2, local23, local29);
		}
		@Pc(99) int local99 = Static73.method7829(arg4 + arg5, Static190.anInt4314, Static145.anInt2941);
		@Pc(108) int local108 = Static73.method7829(arg3 - arg5, Static190.anInt4314, Static145.anInt2941);
		for (@Pc(110) int local110 = local37; local110 <= local46; local110++) {
			@Pc(116) int[] local116 = Static68.anIntArrayArray24[local110];
			Static257.method4540(local116, arg2, local23, local99);
			Static257.method4540(local116, arg2, local108, local29);
		}
	}
}

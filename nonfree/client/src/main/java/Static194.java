import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "[I")
	public static int[] anIntArray188 = new int[2];

	@OriginalMember(owner = "client!haa", name = "j", descriptor = "Z")
	public static boolean aBoolean235 = false;

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(B)V")
	public static void method3032() {
		Static623.method8836(Static97.aClass5_Sub25_8.aClass6_Sub28_1.method8253());
		@Pc(20) int local20 = (Static19.anInt277 >> 12) + (Static565.anInt9560 >> 3);
		@Pc(29) int local29 = (Static117.anInt2170 >> 12) + (Static567.anInt9589 >> 3);
		Static636.anInt10567 = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132 = 0;
		Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.method742(8, 8);
		Static598.aByteArrayArray28 = new byte[18][];
		Static172.aByteArrayArray8 = new byte[18][];
		Static499.aByteArrayArray26 = new byte[18][];
		Static499.anIntArray574 = new int[18];
		Static239.anIntArray219 = new int[18];
		Static275.anIntArrayArray30 = new int[18][4];
		Static312.anIntArray597 = new int[18];
		Static641.aByteArrayArray31 = new byte[18][];
		Static108.anIntArray127 = new int[18];
		Static518.anIntArray491 = new int[18];
		Static136.anIntArray144 = new int[18];
		Static511.aByteArrayArray22 = new byte[18][];
		@Pc(80) int local80 = 0;
		@Pc(100) int local100;
		for (@Pc(89) int local89 = (local20 - (Static326.anInt5541 >> 4)) / 8; local89 <= ((Static326.anInt5541 >> 4) + local20) / 8; local89++) {
			for (local100 = (local29 - (Static448.anInt7637 >> 4)) / 8; local100 <= ((Static448.anInt7637 >> 4) + local29) / 8; local100++) {
				@Pc(109) int local109 = (local89 << 8) + local100;
				Static312.anIntArray597[local80] = local109;
				Static518.anIntArray491[local80] = Static17.aClass207_6.method4686("m" + local89 + "_" + local100);
				Static499.anIntArray574[local80] = Static17.aClass207_6.method4686("l" + local89 + "_" + local100);
				Static136.anIntArray144[local80] = Static17.aClass207_6.method4686("n" + local89 + "_" + local100);
				Static239.anIntArray219[local80] = Static17.aClass207_6.method4686("um" + local89 + "_" + local100);
				Static108.anIntArray127[local80] = Static17.aClass207_6.method4686("ul" + local89 + "_" + local100);
				if (Static136.anIntArray144[local80] == -1) {
					Static518.anIntArray491[local80] = -1;
					Static499.anIntArray574[local80] = -1;
					Static239.anIntArray219[local80] = -1;
					Static108.anIntArray127[local80] = -1;
				}
				local80++;
			}
		}
		for (local100 = local80; local100 < Static136.anIntArray144.length; local100++) {
			Static136.anIntArray144[local100] = -1;
			Static518.anIntArray491[local100] = -1;
			Static499.anIntArray574[local100] = -1;
			Static239.anIntArray219[local100] = -1;
			Static108.anIntArray127[local100] = -1;
		}
		@Pc(292) byte local292;
		if (Static151.anInt2620 == 3) {
			local292 = 4;
		} else {
			local292 = 8;
		}
		Static303.method4735(false, local292, local29, local20);
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!bfa;[I[II[I)V")
	public static void method3033(@OriginalArg(0) Class4_Sub2_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg3.length; local3++) {
			@Pc(9) int local9 = arg3[local3];
			@Pc(13) int local13 = arg1[local3];
			@Pc(17) int local17 = arg2[local3];
			@Pc(19) int local19 = 0;
			while (local13 != 0 && local19 < arg0.aClass228Array3.length) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg0.aClass228Array3[local19] = null;
					} else {
						@Pc(40) Class362 local40 = Static435.aClass298_1.method7034(local9);
						@Pc(43) int local43 = local40.anInt10002;
						@Pc(48) Class228 local48 = arg0.aClass228Array3[local19];
						if (local48 != null) {
							if (local9 == local48.anInt5659) {
								if (local43 == 0) {
									local48 = arg0.aClass228Array3[local19] = null;
								} else if (local43 == 1) {
									local48.anInt5665 = 0;
									local48.anInt5662 = 0;
									local48.anInt5663 = 1;
									local48.anInt5657 = local17;
									local48.anInt5664 = 0;
									if (!arg0.aBoolean71) {
										Static67.method1108(arg0, 0, local40);
									}
								} else if (local43 == 2) {
									local48.anInt5662 = 0;
								}
							} else if (local40.anInt10005 >= Static435.aClass298_1.method7034(local48.anInt5659).anInt10005) {
								local48 = arg0.aClass228Array3[local19] = null;
							}
						}
						if (local48 == null) {
							local48 = arg0.aClass228Array3[local19] = new Class228();
							local48.anInt5657 = local17;
							local48.anInt5659 = local9;
							local48.anInt5664 = 0;
							local48.anInt5663 = 1;
							local48.anInt5665 = 0;
							local48.anInt5662 = 0;
							if (!arg0.aBoolean71) {
								Static67.method1108(arg0, 0, local40);
							}
						}
					}
				}
				local19++;
				local13 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "([BB)Ljava/lang/String;")
	public static String method3034(@OriginalArg(0) byte[] arg0) {
		return Static392.method5817(arg0, 0, arg0.length);
	}
}

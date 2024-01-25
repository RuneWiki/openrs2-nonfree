import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!aq", name = "j", descriptor = "I")
	public static int anInt393;

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "[J")
	public static final long[] aLongArray1 = new long[32];

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "[I")
	public static final int[] anIntArray24 = new int[2048];

	@OriginalMember(owner = "client!aq", name = "l", descriptor = "I")
	public static final int anInt395 = 1339;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIII)V")
	public static void method328(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static275.anInt5312 = arg0;
		Static371.anInt6804 = arg3;
		Static216.anInt4344 = arg2;
		Static374.anInt5604 = arg1;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!i;III[Z)V")
	public static void method329(@OriginalArg(0) Class1_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static396.aClass96Array5 == Static221.aClass96Array4) {
			return;
		}
		@Pc(9) int local9 = Static262.aClass96Array3[arg1].ca(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class96 local22 = Static262.aClass96Array3[local11];
				if (local22 != null) {
					local22.ba(arg0, arg2, local9 - local22.ca(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIII)I")
	public static int method330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static396.aClass96Array5 == null) {
			return 0;
		} else if (arg3 < 3) {
			@Pc(16) int local16 = arg4 >> 7;
			@Pc(20) int local20 = arg0 >> 7;
			if (arg2 < 0 || arg1 < 0 || arg2 > Static209.anInt4283 - 1 || arg1 > Static211.anInt4295 - 1) {
				return 0;
			} else if (local16 >= 1 && local20 >= 1 && local16 <= Static209.anInt4283 - 1 && local20 <= Static211.anInt4295 - 1) {
				@Pc(90) boolean local90 = (Static110.aByteArrayArrayArray20[1][arg4 >> 7][arg0 >> 7] & 0x2) != 0;
				@Pc(115) boolean local115;
				@Pc(131) boolean local131;
				if ((arg4 & 0x7F) == 0) {
					local115 = (Static110.aByteArrayArrayArray20[1][local16 - 1][arg0 >> 7] & 0x2) != 0;
					local131 = (Static110.aByteArrayArrayArray20[1][local16][arg0 >> 7] & 0x2) != 0;
					if (local131 != local115) {
						local90 = (Static110.aByteArrayArrayArray20[1][arg2][arg1] & 0x2) != 0;
					}
				}
				if ((arg0 & 0x7F) == 0) {
					local115 = (Static110.aByteArrayArrayArray20[1][arg4 >> 7][local20 - 1] & 0x2) != 0;
					local131 = (Static110.aByteArrayArrayArray20[1][arg4 >> 7][local20] & 0x2) != 0;
					if (local115 != local131) {
						local90 = (Static110.aByteArrayArrayArray20[1][arg2][arg1] & 0x2) != 0;
					}
				}
				if (local90) {
					arg3++;
				}
				return Static396.aClass96Array5[arg3].ca(arg4, arg0);
			} else {
				return 0;
			}
		} else {
			return Static396.aClass96Array5[arg3].ca(arg4, arg0);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class252 local7 = Static67.aClass252ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class208 local13 = local7.aClass208_3; local13 != null; local13 = local13.aClass208_2) {
			@Pc(17) Class30_Sub1 local17 = local13.aClass30_Sub1_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort104 == arg1 && local17.aShort103 == arg2) {
				Static457.method6174(local17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!ec;I)V")
	public static void method333(@OriginalArg(0) Class68 arg0) {
		if (arg0.anInt2169 != Static235.anInt4652) {
			return;
		}
		if (Static429.aClass30_Sub1_Sub1_Sub2_2.aString9 == null) {
			arg0.anInt2127 = 0;
			arg0.anInt2176 = 0;
			return;
		}
		arg0.anInt2167 = 150;
		arg0.anInt2120 = (int) (Math.sin((double) Static187.anInt3975 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt2162 = 5;
		arg0.anInt2176 = Static32.anInt894;
		arg0.anInt2127 = Static122.method1982(Static429.aClass30_Sub1_Sub1_Sub2_2.aString9);
		arg0.anInt2116 = Static429.aClass30_Sub1_Sub1_Sub2_2.anInt1242;
		arg0.anInt2128 = 0;
		arg0.anInt2151 = Static429.aClass30_Sub1_Sub1_Sub2_2.anInt1297;
		arg0.anInt2111 = Static429.aClass30_Sub1_Sub1_Sub2_2.anInt1255;
	}
}

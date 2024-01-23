import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "[J")
	public static long[] aLongArray11 = new long[200];

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!kb;II)[Lclient!ag;")
	public static Class7_Sub1[] method4696(@OriginalArg(0) Class83 arg0, @OriginalArg(2) int arg1) {
		return Static182.method3508(arg0, arg1) ? Static126.method2146() : null;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IB)V")
	public static void method4697() {
		Static129.aClass155_23.method4364(5);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIIZIIIIII)V")
	public static void method4698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(10) int arg8) {
		@Pc(5) int local5 = arg6 - arg5;
		@Pc(23) int local23 = arg1 - arg8;
		@Pc(25) int local25 = -1;
		if (Static180.anInt4067 > 0) {
			if (Static94.anInt6155 > 10) {
				local25 = (10 + 10 - Static94.anInt6155) * 5;
			} else {
				local25 = Static94.anInt6155 * 5;
			}
		}
		@Pc(52) int local52 = 983040 / arg7;
		@Pc(56) int local56 = 983040 / arg0;
		for (@Pc(59) int local59 = -local56; local59 < local56 + local5; local59++) {
			@Pc(72) int local72 = local59 * arg0 >> 16;
			@Pc(82) int local82 = arg0 * (local59 + 1) >> 16;
			@Pc(87) int local87 = local82 - local72;
			if (local87 > 0) {
				local72 += arg3;
				@Pc(108) int local108 = local59 + arg5 >> 6;
				if (local108 >= 0 && local108 <= Static179.anIntArrayArrayArray15.length - 1) {
					@Pc(127) int[][] local127 = Static179.anIntArrayArrayArray15[local108];
					for (@Pc(130) int local130 = -local52; local130 < local23 + local52; local130++) {
						@Pc(146) int local146 = arg7 * (local130 + 1) >> 16;
						@Pc(154) int local154 = arg7 * local130 >> 16;
						@Pc(159) int local159 = local146 - local154;
						if (local159 > 0) {
							local154 += arg2;
							@Pc(179) int local179 = arg8 + local130 >> 6;
							if (local179 >= 0 && local179 <= local127.length - 1 && local127[local179] != null) {
								@Pc(213) int local213 = (arg5 + local59 & 0x3F) + ((arg8 + local130 & 0x3F) << 6);
								@Pc(219) int local219 = local127[local179][local213];
								if (local219 != 0) {
									@Pc(230) Class30 local230 = Static268.method4511(local219 - 1);
									if (!Static88.aBooleanArray10[local230.anInt832]) {
										if (local25 != -1 && Static169.anInt3863 == local230.anInt832) {
											@Pc(264) Class1_Sub33 local264 = new Class1_Sub33();
											local264.anInt6044 = local72;
											local264.anInt6043 = local154;
											local264.anInt6050 = local230.anInt832;
											Static199.aClass131_13.method3799(local264);
										} else {
											Static3.aClass1_Sub2_Sub14_Sub1Array1[local230.anInt832].method2727(local72 - 7, local154 + -7);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		for (@Pc(289) Class1_Sub33 local289 = (Class1_Sub33) Static199.aClass131_13.method3791(); local289 != null; local289 = (Class1_Sub33) Static199.aClass131_13.method3792()) {
			Static203.method3595(local289.anInt6044, local289.anInt6043, 15, local25);
			Static203.method3595(local289.anInt6044, local289.anInt6043, 13, local25);
			Static203.method3595(local289.anInt6044, local289.anInt6043, 11, local25);
			Static203.method3595(local289.anInt6044, local289.anInt6043, 9, local25);
			Static3.aClass1_Sub2_Sub14_Sub1Array1[local289.anInt6050].method2727(local289.anInt6044 - 7, local289.anInt6043 - 7);
		}
		Static199.aClass131_13.method3795();
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIILclient!ok;I)V")
	public static void method4699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class116 arg2, @OriginalArg(4) int arg3) {
		if (Static296.aBoolean335) {
			Static288.method4714(arg0, arg3, arg0 + arg2.anInt4299, arg3 + arg2.anInt4363);
		}
		if (Static71.anInt1777 >= 3) {
			if (Static296.aBoolean335) {
				@Pc(24) Class1_Sub2_Sub14 local24 = arg2.method3422(false);
				if (local24 != null) {
					local24.method2727(arg0, arg3);
				}
			} else {
				Static203.method3600(arg0, arg3, arg2.anIntArray399, arg2.anIntArray388);
			}
		} else if (Static296.aBoolean335) {
			((Class1_Sub2_Sub14_Sub2) Static212.aClass1_Sub2_Sub14_5).method2739(arg0, arg3, arg2.anInt4299, arg2.anInt4363, Static212.aClass1_Sub2_Sub14_5.anInt3438 / 2, Static212.aClass1_Sub2_Sub14_5.anInt3430 / 2, (int) Static125.aFloat97, 256, (Class1_Sub2_Sub14_Sub2) arg2.method3422(false));
		} else {
			((Class1_Sub2_Sub14_Sub1) Static212.aClass1_Sub2_Sub14_5).method2487(arg0, arg3, arg2.anInt4299, arg2.anInt4363, Static212.aClass1_Sub2_Sub14_5.anInt3438 / 2, Static212.aClass1_Sub2_Sub14_5.anInt3430 / 2, (int) Static125.aFloat97, arg2.anIntArray399, arg2.anIntArray388);
		}
		Static138.aBooleanArray13[arg1] = true;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIII)I")
	public static int method4700(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 1023 - arg0;
		} else if (local3 == 2) {
			return 1023 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIIII)V")
	public static void method4701(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg2 + arg4;
		@Pc(13) int local13 = arg0 - arg2;
		@Pc(17) int local17 = arg2 + arg1;
		@Pc(31) int local31 = arg5 - arg2;
		@Pc(33) int local33;
		for (local33 = arg4; local33 < local9; local33++) {
			Static89.method1538(Static57.anIntArrayArray9[local33], arg5, arg1, arg3);
		}
		for (local33 = arg0; local33 > local13; local33--) {
			Static89.method1538(Static57.anIntArrayArray9[local33], arg5, arg1, arg3);
		}
		for (local33 = local9; local33 <= local13; local33++) {
			@Pc(84) int[] local84 = Static57.anIntArrayArray9[local33];
			Static89.method1538(local84, local17, arg1, arg3);
			Static89.method1538(local84, arg5, local31, arg3);
		}
	}
}

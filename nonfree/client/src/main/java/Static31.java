import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bj", name = "H", descriptor = "[I")
	public static final int[] anIntArray35 = new int[1000];

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!cw;I)V")
	public static void method617(@OriginalArg(0) Class4_Sub12_Sub1 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method1136();
		@Pc(20) int local20;
		@Pc(48) int local48;
		for (@Pc(14) int local14 = 0; local14 < Static33.anInt606; local14++) {
			local20 = Static99.anIntArray157[local14];
			if ((Static116.aByteArray63[local20] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static116.aByteArray63[local20] = (byte) (Static116.aByteArray63[local20] | 0x2);
				} else {
					local48 = arg0.method1143(1);
					if (local48 == 0) {
						local7 = Static413.method5308(arg0);
						Static116.aByteArray63[local20] = (byte) (Static116.aByteArray63[local20] | 0x2);
					} else {
						Static159.method2702(arg0, local20);
					}
				}
			}
		}
		arg0.method1135();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method1136();
		@Pc(131) int local131;
		for (local20 = 0; local20 < Static33.anInt606; local20++) {
			local48 = Static99.anIntArray157[local20];
			if ((Static116.aByteArray63[local48] & 0x1) != 0) {
				if (local7 > 0) {
					Static116.aByteArray63[local48] = (byte) (Static116.aByteArray63[local48] | 0x2);
					local7--;
				} else {
					local131 = arg0.method1143(1);
					if (local131 == 0) {
						local7 = Static413.method5308(arg0);
						Static116.aByteArray63[local48] = (byte) (Static116.aByteArray63[local48] | 0x2);
					} else {
						Static159.method2702(arg0, local48);
					}
				}
			}
		}
		arg0.method1135();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method1136();
		@Pc(213) int local213;
		for (local48 = 0; local48 < Static334.anInt5761; local48++) {
			local131 = Static313.anIntArray374[local48];
			if ((Static116.aByteArray63[local131] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static116.aByteArray63[local131] = (byte) (Static116.aByteArray63[local131] | 0x2);
				} else {
					local213 = arg0.method1143(1);
					if (local213 == 0) {
						local7 = Static413.method5308(arg0);
						Static116.aByteArray63[local131] = (byte) (Static116.aByteArray63[local131] | 0x2);
					} else if (Static409.method5490(arg0, local131)) {
						Static116.aByteArray63[local131] = (byte) (Static116.aByteArray63[local131] | 0x2);
					}
				}
			}
		}
		arg0.method1135();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method1136();
		for (local131 = 0; local131 < Static334.anInt5761; local131++) {
			local213 = Static313.anIntArray374[local131];
			if ((Static116.aByteArray63[local213] & 0x1) == 0) {
				if (local7 > 0) {
					Static116.aByteArray63[local213] = (byte) (Static116.aByteArray63[local213] | 0x2);
					local7--;
				} else {
					@Pc(299) int local299 = arg0.method1143(1);
					if (local299 == 0) {
						local7 = Static413.method5308(arg0);
						Static116.aByteArray63[local213] = (byte) (Static116.aByteArray63[local213] | 0x2);
					} else if (Static409.method5490(arg0, local213)) {
						Static116.aByteArray63[local213] = (byte) (Static116.aByteArray63[local213] | 0x2);
					}
				}
			}
		}
		arg0.method1135();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static334.anInt5761 = 0;
		Static33.anInt606 = 0;
		for (local213 = 1; local213 < 2048; local213++) {
			Static116.aByteArray63[local213] = (byte) (Static116.aByteArray63[local213] >> 1);
			@Pc(369) Class16_Sub1_Sub5_Sub1 local369 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local213];
			if (local369 == null) {
				Static313.anIntArray374[Static334.anInt5761++] = local213;
			} else {
				Static99.anIntArray157[Static33.anInt606++] = local213;
			}
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IFIIZI[FIII)V")
	public static void method619(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg0 - arg8;
		@Pc(13) int local13 = arg4 - arg7;
		@Pc(21) int local21 = arg2 - arg3;
		@Pc(42) float local42 = arg5[2] * (float) local5 + (float) local13 * arg5[1] + arg5[0] * (float) local21;
		@Pc(63) float local63 = (float) local5 * arg5[5] + arg5[4] * (float) local13 + (float) local21 * arg5[3];
		@Pc(84) float local84 = arg5[8] * (float) local5 + arg5[7] * (float) local13 + (float) local21 * arg5[6];
		@Pc(99) float local99 = (float) Math.sqrt((double) (local84 * local84 + local63 * local63 + local42 * local42));
		@Pc(110) float local110 = (float) Math.atan2((double) local42, (double) local84) / 6.2831855F + 0.5F;
		@Pc(123) float local123 = (float) Math.asin((double) (local63 / local99)) / 3.1415927F + arg1 + 0.5F;
		@Pc(130) float local130;
		if (arg6 == 1) {
			local130 = local110;
			local110 = -local123;
			local123 = local130;
		} else if (arg6 == 2) {
			local123 = -local123;
			local110 = -local110;
		} else if (arg6 == 3) {
			local130 = local110;
			local110 = local123;
			local123 = -local130;
		}
		Static164.aFloat143 = local123;
		Static90.aFloat49 = local110;
	}
}

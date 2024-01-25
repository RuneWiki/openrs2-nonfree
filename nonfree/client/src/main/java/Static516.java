import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static516 {

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_184 = new Class40(50, 6);

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
	public static int anInt8936 = 0;

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString112 = null;

	@OriginalMember(owner = "client!uj", name = "n", descriptor = "J")
	public static volatile long aLong222 = 0L;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II[FIIIIFIIF)V")
	public static void method7311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9) {
		@Pc(5) int local5 = arg0 - arg5;
		@Pc(13) int local13 = arg3 - arg7;
		@Pc(17) int local17 = arg4 - arg1;
		@Pc(38) float local38 = (float) local17 * arg2[0] + (float) local5 * arg2[1] + arg2[2] * (float) local13;
		@Pc(59) float local59 = arg2[5] * (float) local13 + arg2[3] * (float) local17 + (float) local5 * arg2[4];
		@Pc(80) float local80 = (float) local5 * arg2[7] + arg2[6] * (float) local17 + arg2[8] * (float) local13;
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg6 != 1.0F) {
			local91 *= arg6;
		}
		@Pc(105) float local105 = arg9 + local59 + 0.5F;
		@Pc(126) float local126;
		if (arg8 == 1) {
			local126 = local91;
			local91 = -local105;
			local105 = local126;
		} else if (arg8 == 2) {
			local105 = -local105;
			local91 = -local91;
		} else if (arg8 == 3) {
			local126 = local91;
			local91 = local105;
			local105 = -local126;
		}
		Static99.aFloat18 = local91;
		Static36.aFloat8 = local105;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)S")
	public static short method7312(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(37) int local37 = local19 > 64 ? (127 - local19) * local15 >> 7 : local19 * local15 >> 7;
		@Pc(41) int local41 = local19 + local37;
		@Pc(52) int local52;
		if (local41 == 0) {
			local52 = local37 << 1;
		} else {
			local52 = (local37 << 8) / local41;
		}
		return (short) (local9 << 10 | local52 >> 4 << 7 | local41);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BI)I")
	public static int method7313(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(15) int local15 = local0 | local0 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IB)Lclient!ek;")
	public static Class85 method7314(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static349.aFloat170 == 3.0D) {
				return Static544.aClass85_8;
			}
			if ((double) Static349.aFloat170 == 4.0D) {
				return Static334.aClass85_6;
			}
			if ((double) Static349.aFloat170 == 6.0D) {
				return Static43.aClass85_2;
			}
			if ((double) Static349.aFloat170 >= 8.0D) {
				return Static199.aClass85_5;
			}
		} else if (arg0 == 1) {
			if ((double) Static349.aFloat170 == 3.0D) {
				return Static43.aClass85_2;
			}
			if ((double) Static349.aFloat170 == 4.0D) {
				return Static199.aClass85_5;
			}
			if ((double) Static349.aFloat170 == 6.0D) {
				return Static173.aClass85_4;
			}
			if ((double) Static349.aFloat170 >= 8.0D) {
				return Static40.aClass85_1;
			}
		} else if (arg0 == 2) {
			if ((double) Static349.aFloat170 == 3.0D) {
				return Static173.aClass85_4;
			}
			if ((double) Static349.aFloat170 == 4.0D) {
				return Static40.aClass85_1;
			}
			if ((double) Static349.aFloat170 == 6.0D) {
				return Static169.aClass85_3;
			}
			if ((double) Static349.aFloat170 >= 8.0D) {
				return Static402.aClass85_7;
			}
		}
		return null;
	}
}

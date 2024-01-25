import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!an", name = "ib", descriptor = "I")
	public static int anInt306;

	@OriginalMember(owner = "client!an", name = "n", descriptor = "Lclient!hr;")
	public static final Class137 aClass137_1 = new Class137(14, 1);

	@OriginalMember(owner = "client!an", name = "U", descriptor = "Lclient!hr;")
	public static final Class137 aClass137_2 = new Class137(15, 4);

	@OriginalMember(owner = "client!an", name = "V", descriptor = "Lclient!hr;")
	public static final Class137 aClass137_3 = new Class137(16, -2);

	@OriginalMember(owner = "client!an", name = "W", descriptor = "Lclient!hr;")
	public static final Class137 aClass137_4 = new Class137(17, 0);

	@OriginalMember(owner = "client!an", name = "X", descriptor = "Lclient!hr;")
	public static final Class137 aClass137_5 = new Class137(18, -2);

	@OriginalMember(owner = "client!an", name = "Y", descriptor = "Lclient!hr;")
	public static final Class137 aClass137_6 = new Class137(19, -2);

	@OriginalMember(owner = "client!an", name = "Z", descriptor = "Lclient!hr;")
	public static final Class137 aClass137_7 = new Class137(20, 6);

	@OriginalMember(owner = "client!an", name = "ab", descriptor = "Lclient!hr;")
	public static final Class137 aClass137_8 = new Class137(21, 9);

	@OriginalMember(owner = "client!an", name = "bb", descriptor = "Lclient!hr;")
	public static final Class137 aClass137_9 = new Class137(22, -2);

	@OriginalMember(owner = "client!an", name = "cb", descriptor = "Lclient!hr;")
	public static final Class137 aClass137_10 = new Class137(23, 4);

	@OriginalMember(owner = "client!an", name = "db", descriptor = "Lclient!hr;")
	public static final Class137 aClass137_11 = new Class137(24, -1);

	@OriginalMember(owner = "client!an", name = "eb", descriptor = "Lclient!hr;")
	public static final Class137 aClass137_12 = new Class137(25, -2);

	@OriginalMember(owner = "client!an", name = "fb", descriptor = "Lclient!hr;")
	public static final Class137 aClass137_13 = new Class137(26, 0);

	@OriginalMember(owner = "client!an", name = "gb", descriptor = "Lclient!hr;")
	public static final Class137 aClass137_14 = new Class137(27, 0);

	@OriginalMember(owner = "client!an", name = "jb", descriptor = "I")
	public static int anInt307 = 0;

	@OriginalMember(owner = "client!an", name = "kb", descriptor = "J")
	public static long aLong6 = 0L;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IJ)V")
	public static void method388(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static80.method5205(arg0 - 1L);
			Static80.method5205(1L);
		} else {
			Static80.method5205(arg0);
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(III)Z")
	public static boolean method391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIFI[FFIIIIFI)V")
	public static void method394(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float[] arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float arg10, @OriginalArg(12) int arg11) {
		@Pc(5) int local5 = arg11 - arg8;
		@Pc(13) int local13 = arg0 - arg7;
		@Pc(17) int local17 = arg1 - arg3;
		@Pc(38) float local38 = (float) local5 * arg4[2] + (float) local17 * arg4[0] + (float) local13 * arg4[1];
		@Pc(59) float local59 = (float) local5 * arg4[5] + (float) local17 * arg4[3] + arg4[4] * (float) local13;
		@Pc(80) float local80 = (float) local5 * arg4[8] + arg4[6] * (float) local17 + arg4[7] * (float) local13;
		@Pc(91) float local91;
		@Pc(98) float local98;
		if (arg9 == 0) {
			local91 = arg2 + local38 + 0.5F;
			local98 = arg5 + 0.5F - local80;
		} else if (arg9 == 1) {
			local98 = local80 + arg5 + 0.5F;
			local91 = arg2 + local38 + 0.5F;
		} else if (arg9 == 2) {
			local91 = arg2 + 0.5F - local38;
			local98 = arg10 + 0.5F - local59;
		} else if (arg9 == 3) {
			local91 = local38 + arg2 + 0.5F;
			local98 = arg10 + 0.5F - local59;
		} else if (arg9 == 4) {
			local98 = arg10 + 0.5F - local59;
			local91 = local80 + arg5 + 0.5F;
		} else {
			local91 = arg5 + 0.5F - local80;
			local98 = arg10 + 0.5F - local59;
		}
		@Pc(195) float local195;
		if (arg6 == 1) {
			local195 = local91;
			local91 = -local98;
			local98 = local195;
		} else if (arg6 == 2) {
			local91 = -local91;
			local98 = -local98;
		} else if (arg6 == 3) {
			local195 = local91;
			local91 = local98;
			local98 = -local195;
		}
		Static191.aFloat112 = local91;
		Static155.aFloat82 = local98;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!hf;I)I")
	public static int method402(@OriginalArg(0) Class129 arg0) {
		if (Static191.aClass129_3 == arg0) {
			return 7681;
		} else if (arg0 == Static506.aClass129_5) {
			return 8448;
		} else if (arg0 == Static159.aClass129_2) {
			return 34165;
		} else if (Static88.aClass129_1 == arg0) {
			return 260;
		} else if (arg0 == Static463.aClass129_4) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIII)I")
	public static int method411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = arg2 & 0x3;
		if (local13 == 0) {
			return arg1;
		} else if (local13 == 1) {
			return 1023 - arg0;
		} else if (local13 == 2) {
			return 1023 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!an", name = "g", descriptor = "(II)V")
	public static void method414(@OriginalArg(0) int arg0) {
		@Pc(13) Class12_Sub4_Sub1 local13 = Static389.method6156(6, arg0);
		local13.method823();
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(III)V")
	public static void method415(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class240 local9 = Static544.aClass240ArrayArray1[arg0][arg1];
		if (local9 != null) {
			Static466.anInt8503 = local9.anInt6891;
			Static24.anInt394 = local9.anInt6884;
			Static368.anInt6838 = local9.anInt6889;
		}
		Static476.method2144();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
	public static int anInt3403;

	@OriginalMember(owner = "client!kk", name = "v", descriptor = "Lclient!ek;")
	public static Class42 aClass42_43;

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString115 = "Ok";

	@OriginalMember(owner = "client!kk", name = "i", descriptor = "[[S")
	public static short[][] aShortArrayArray5 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!kk", name = "n", descriptor = "[I")
	public static int[] anIntArray344 = new int[100];

	@OriginalMember(owner = "client!kk", name = "u", descriptor = "I")
	public static int anInt3409 = 0;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(BZ)V")
	public static void method2804(@OriginalArg(1) boolean arg0) {
		@Pc(12) Class2_Sub31 local12;
		for (local12 = (Class2_Sub31) Static275.aClass44_23.method1352(); local12 != null; local12 = (Class2_Sub31) Static275.aClass44_23.method1360()) {
			if (local12.aClass2_Sub3_Sub2_3 != null) {
				Static173.aClass2_Sub3_Sub4_2.method4662(local12.aClass2_Sub3_Sub2_3);
				local12.aClass2_Sub3_Sub2_3 = null;
			}
			if (local12.aClass2_Sub3_Sub2_2 != null) {
				Static173.aClass2_Sub3_Sub4_2.method4662(local12.aClass2_Sub3_Sub2_2);
				local12.aClass2_Sub3_Sub2_2 = null;
			}
			local12.method4743();
		}
		if (!arg0) {
			return;
		}
		for (local12 = (Class2_Sub31) Static195.aClass44_29.method1352(); local12 != null; local12 = (Class2_Sub31) Static195.aClass44_29.method1360()) {
			if (local12.aClass2_Sub3_Sub2_3 != null) {
				Static173.aClass2_Sub3_Sub4_2.method4662(local12.aClass2_Sub3_Sub2_3);
				local12.aClass2_Sub3_Sub2_3 = null;
			}
			local12.method4743();
		}
		for (local12 = (Class2_Sub31) Static304.aClass101_26.method2868(); local12 != null; local12 = (Class2_Sub31) Static304.aClass101_26.method2859()) {
			if (local12.aClass2_Sub3_Sub2_3 != null) {
				Static173.aClass2_Sub3_Sub4_2.method4662(local12.aClass2_Sub3_Sub2_3);
				local12.aClass2_Sub3_Sub2_3 = null;
			}
			local12.method4743();
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIII)I")
	public static int method2805(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = Static1.anIntArray2[Static125.method2260(arg2, arg1)];
		if (arg0 > 0) {
			@Pc(27) int local27 = Static1.anInterface3_1.method4131(arg0 & 0xFFFF);
			@Pc(44) int local44;
			@Pc(61) int local61;
			if (local27 != 0) {
				if (arg1 < 0) {
					local44 = 0;
				} else if (arg1 <= 127) {
					local44 = arg1 * 131586;
				} else {
					local44 = 16777215;
				}
				if (local27 == 256) {
					local11 = local44;
				} else {
					local61 = 256 - local27;
					local11 = (local27 * (local44 & 0xFF00) + (local11 & 0xFF00) * local61 & 0xFF0000) + ((local11 & 0xFF00FF) * local61 + (local44 & 0xFF00FF) * local27 & 0xFF00FF00) >> 8;
				}
			}
			local44 = Static1.anInterface3_1.method4142(arg0 & 0xFFFF);
			if (local44 != 0) {
				local44 += 256;
				@Pc(117) int local117 = (local11 >> 16 & 0xFF) * local44;
				if (local117 > 65535) {
					local117 = 65535;
				}
				local61 = (local11 >> 8 & 0xFF) * local44;
				@Pc(137) int local137 = local44 * (local11 & 0xFF);
				if (local137 > 65535) {
					local137 = 65535;
				}
				if (local61 > 65535) {
					local61 = 65535;
				}
				local11 = (local61 & 0xFF00) + ((local117 & 0xC100FF00) << 8) + (local137 >> 8);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIILjava/lang/String;Lclient!je;ILclient!g;IZI)V")
	public static void method2807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) Class2_Sub8_Sub5 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class56 arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(13) int local13;
		if (Static16.anInt342 == 4) {
			local13 = (int) Static239.aFloat51 & 0x7FF;
		} else {
			local13 = Static301.anInt5810 + (int) Static239.aFloat51 & 0x7FF;
		}
		@Pc(34) int local34 = Math.max(arg6.anInt2057 / 2, arg6.anInt2031 / 2) + 10;
		@Pc(42) int local42 = arg7 * arg7 + arg2 * arg2;
		if (local34 * local34 < local42) {
			return;
		}
		@Pc(52) int local52 = Class1.anIntArray4[local13];
		@Pc(56) int local56 = Class1.anIntArray3[local13];
		if (Static16.anInt342 != 4) {
			local56 = local56 * 256 / (Static141.anInt3097 + 256);
			local52 = local52 * 256 / (Static141.anInt3097 + 256);
		}
		@Pc(90) int local90 = local56 * arg2 - arg7 * local52 >> 16;
		@Pc(100) int local100 = local56 * arg7 + arg2 * local52 >> 16;
		@Pc(105) int local105 = arg4.method1248(arg3, 100);
		@Pc(111) int local111 = arg4.method1238(arg3);
		@Pc(117) int local117 = local100 - local105 / 2;
		if (local117 < -arg6.anInt2057 || arg6.anInt2057 < local117 || -arg6.anInt2031 > local90 || arg6.anInt2031 < local90) {
			return;
		}
		if (Static116.aBoolean184) {
			Static111.method1891((Class2_Sub8_Sub1_Sub2) arg6.method1555(false));
		} else {
			Static77.method1453(arg6.anIntArray181, arg6.anIntArray176);
		}
		arg4.method1242(arg3, local117 + arg1 + arg6.anInt2057 / 2, arg6.anInt2031 / 2 + (arg5 - (local90 + arg8 - -local111)), local105, 50, arg0, 0, 1, 0, 0);
		if (Static116.aBoolean184) {
			Static111.method1879();
		} else {
			Static77.method1445();
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "([Ljava/lang/Object;I[JII)V")
	public static void method2808(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(14) int local14 = arg1;
		@Pc(20) int local20 = (arg3 + arg1) / 2;
		@Pc(24) long local24 = arg2[local20];
		arg2[local20] = arg2[arg3];
		arg2[arg3] = local24;
		@Pc(38) Object local38 = arg0[local20];
		arg0[local20] = arg0[arg3];
		arg0[arg3] = local38;
		for (@Pc(50) int local50 = arg1; local50 < arg3; local50++) {
			if ((long) (local50 & 0x1) + local24 > arg2[local50]) {
				@Pc(73) long local73 = arg2[local50];
				arg2[local50] = arg2[local14];
				arg2[local14] = local73;
				@Pc(87) Object local87 = arg0[local50];
				arg0[local50] = arg0[local14];
				arg0[local14++] = local87;
			}
		}
		arg2[arg3] = arg2[local14];
		arg2[local14] = local24;
		arg0[arg3] = arg0[local14];
		arg0[local14] = local38;
		method2808(arg0, arg1, arg2, local14 - 1);
		method2808(arg0, local14 + 1, arg2, arg3);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!jl", name = "i", descriptor = "Lclient!g;")
	public static Class56 aClass56_14;

	@OriginalMember(owner = "client!jl", name = "n", descriptor = "Lclient!ol;")
	public static Class130 aClass130_2;

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
	public static int anInt3097 = 0;

	@OriginalMember(owner = "client!jl", name = "g", descriptor = "Lclient!sf;")
	public static Class157 aClass157_25 = new Class157(200);

	@OriginalMember(owner = "client!jl", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString109 = "wave2:";

	@OriginalMember(owner = "client!jl", name = "m", descriptor = "Lclient!sf;")
	public static Class157 aClass157_26 = new Class157(64);

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)Lclient!sb;")
	public static Class2_Sub8_Sub21 method2495() {
		if (Static250.aClass37_10 == null) {
			return null;
		}
		for (@Pc(16) Class2_Sub8_Sub21 local16 = (Class2_Sub8_Sub21) Static32.aClass128_1.method3480(); local16 != null; local16 = (Class2_Sub8_Sub21) Static32.aClass128_1.method3480()) {
			@Pc(29) Class10 local29 = Static48.method890(local16.anInt4970);
			if (local29 != null && local29.aBoolean15 && local29.method157()) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIBLclient!g;III)V")
	public static void method2496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class56 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg2 * arg2 + arg4 * arg4;
		if (local10 > arg1) {
			return;
		}
		@Pc(34) int local34 = Math.min(arg3.anInt2057 / 2, arg3.anInt2031 / 2);
		if (local34 * local34 >= local10) {
			Static201.method3409(Static60.aClass2_Sub8_Sub1Array2[arg0], arg3, arg2, arg5, arg4, arg6);
			return;
		}
		local34 -= 10;
		@Pc(64) int local64;
		if (Static16.anInt342 == 4) {
			local64 = (int) Static239.aFloat51 & 0x7FF;
		} else {
			local64 = Static301.anInt5810 + (int) Static239.aFloat51 & 0x7FF;
		}
		@Pc(75) int local75 = Class1.anIntArray3[local64];
		@Pc(79) int local79 = Class1.anIntArray4[local64];
		if (Static16.anInt342 != 4) {
			local75 = local75 * 256 / (anInt3097 + 256);
			local79 = local79 * 256 / (anInt3097 + 256);
		}
		@Pc(110) int local110 = arg4 * local75 - local79 * arg2 >> 16;
		@Pc(120) int local120 = local79 * arg4 + arg2 * local75 >> 16;
		@Pc(126) double local126 = Math.atan2((double) local120, (double) local110);
		@Pc(133) int local133 = (int) ((double) local34 * Math.sin(local126));
		@Pc(140) int local140 = (int) ((double) local34 * Math.cos(local126));
		if (Static116.aBoolean184) {
			((Class2_Sub8_Sub1_Sub2) Static86.aClass2_Sub8_Sub1Array3[arg0]).method4380((local133 + arg3.anInt2057 / 2 + arg5) * 16, (arg6 + arg3.anInt2031 / 2 - local140) * 16, (int) (local126 * 10430.378D));
		} else {
			((Class2_Sub8_Sub1_Sub1) Static86.aClass2_Sub8_Sub1Array3[arg0]).method2773(local133 + arg3.anInt2057 / 2 + arg5 - 10, arg3.anInt2031 / 2 + -10 + arg6 + -local140, local126);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V")
	public static void method2498(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub10 local12 = (Class2_Sub10) Static219.aClass101_18.method2867((long) arg0);
		if (local12 != null) {
			for (@Pc(23) int local23 = 0; local23 < local12.anIntArray105.length; local23++) {
				local12.anIntArray105[local23] = -1;
				local12.anIntArray104[local23] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IB)I")
	public static int method2499(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIBI)I")
	public static int method2500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = arg1 & 0x3;
		if (local13 == 0) {
			return arg0;
		} else if (local13 == 1) {
			return 1023 - arg2;
		} else if (local13 == 2) {
			return 1023 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIILclient!qn;B)V")
	public static void method2501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class146 arg3) {
		for (@Pc(16) Class2_Sub31 local16 = (Class2_Sub31) Static275.aClass44_23.method1352(); local16 != null; local16 = (Class2_Sub31) Static275.aClass44_23.method1360()) {
			if (local16.anInt5923 == arg2 && local16.anInt5918 == arg0 * 128 && arg1 * 128 == local16.anInt5920 && local16.aClass146_1.anInt4724 == arg3.anInt4724) {
				if (local16.aClass2_Sub3_Sub2_3 != null) {
					Static173.aClass2_Sub3_Sub4_2.method4662(local16.aClass2_Sub3_Sub2_3);
					local16.aClass2_Sub3_Sub2_3 = null;
				}
				if (local16.aClass2_Sub3_Sub2_2 != null) {
					Static173.aClass2_Sub3_Sub4_2.method4662(local16.aClass2_Sub3_Sub2_2);
					local16.aClass2_Sub3_Sub2_2 = null;
				}
				local16.method4743();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)I")
	public static int method2502() {
		return Static43.anInt1121 == 0 ? 0 : Static18.anInterface5Array1[Static43.anInt1121].method4038();
	}

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)I")
	public static int method2503() {
		if (Static127.aFrame2 != null) {
			return 3;
		} else if (Static116.aBoolean184 && Static194.aBoolean279) {
			return 2;
		} else if (Static116.aBoolean184 && !Static194.aBoolean279) {
			return 1;
		} else {
			return 0;
		}
	}
}

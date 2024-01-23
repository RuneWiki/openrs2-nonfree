import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "F")
	public static float aFloat82;

	@OriginalMember(owner = "client!kb", name = "t", descriptor = "Lclient!kl;")
	public static Class11_Sub4_Sub1 aClass11_Sub4_Sub1_3;

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "[Lclient!od;")
	public static Class11_Sub4_Sub2[] aClass11_Sub4_Sub2Array2 = new Class11_Sub4_Sub2[32768];

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
	public static int anInt4490 = 1;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method3839(@OriginalArg(1) long arg0) {
		return Static136.method2356(arg0);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIZ)V")
	public static void method3840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static228.anInt4270 == 2) {
			Static305.anInt5484 = arg1;
			Static53.anInt1161 = arg0;
		}
		Static8.aFloat4 = arg0;
		Static148.aFloat64 = arg1;
		Static248.method3885();
		Static167.aBoolean68 = true;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB)V")
	public static void method3841(@OriginalArg(0) int arg0) {
		@Pc(4) Class1_Sub5_Sub21 local4 = Static278.method4266(3, arg0);
		local4.method4064();
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(IB)I")
	public static int method3842(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(17) int local17 = local4 | local4 >>> 1;
		@Pc(23) int local23 = local17 | local17 >>> 2;
		@Pc(29) int local29 = local23 | local23 >>> 4;
		@Pc(35) int local35 = local29 | local29 >>> 8;
		@Pc(41) int local41 = local35 | local35 >>> 16;
		return local41 + 1;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)V")
	public static void method3843() {
		@Pc(9) int local9 = Static19.aClass1_Sub5_Sub9_1.method2860(Static252.aString165);
		@Pc(11) int local11;
		@Pc(20) int local20;
		for (local11 = 0; local11 < Static241.anInt4470; local11++) {
			local20 = Static19.aClass1_Sub5_Sub9_1.method2860(Static42.method774(local11));
			if (local20 > local9) {
				local9 = local20;
			}
		}
		local11 = Static241.anInt4470 * 15 + 21;
		local9 += 8;
		@Pc(38) int local38 = Static146.anInt3019;
		if (local11 + local38 > Static288.anInt5232) {
			local38 = Static288.anInt5232 - local11;
		}
		local20 = Static35.anInt659 - local9 / 2;
		if (Static194.anInt3876 < local20 + local9) {
			local20 = Static194.anInt3876 - local9;
		}
		if (local20 < 0) {
			local20 = 0;
		}
		if (local38 < 0) {
			local38 = 0;
		}
		if (Static17.anInt371 == 1) {
			if (Static187.anInt3575 == Static35.anInt659 && Static146.anInt3019 == Static136.anInt2668) {
				Static92.anInt1933 = local20;
				Static91.aBoolean183 = true;
				Static282.anInt5139 = (Static284.aBoolean486 ? 26 : 22) + Static241.anInt4470 * 15;
				Static229.anInt4962 = local9;
				Static17.anInt371 = 0;
				Static48.anInt1073 = local38;
			}
		} else if (Static186.anInt3549 == Static35.anInt659 && Static45.anInt1043 == Static146.anInt3019) {
			Static229.anInt4962 = local9;
			Static92.anInt1933 = local20;
			Static91.aBoolean183 = true;
			Static48.anInt1073 = local38;
			Static17.anInt371 = 0;
			Static282.anInt5139 = (Static284.aBoolean486 ? 26 : 22) + Static241.anInt4470 * 15;
		} else {
			Static136.anInt2668 = Static45.anInt1043;
			Static187.anInt3575 = Static186.anInt3549;
			Static17.anInt371 = 1;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BIII)I")
	public static int method3844(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 1023 - arg1;
		} else if (local7 == 2) {
			return 1023 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)V")
	public static void method3845() {
		Static34.aClass175_7.method4288(5);
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(IB)V")
	public static void method3846() {
		Static201.aClass175_32.method4288(5);
		Static281.aClass175_2.method4288(5);
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	public static void method3847() {
		Static145.aClass175_22.method4287();
	}
}

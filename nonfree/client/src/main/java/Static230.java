import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!ql", name = "L", descriptor = "Lclient!ph;")
	public static Class138 aClass138_59;

	@OriginalMember(owner = "client!ql", name = "N", descriptor = "Lclient!ph;")
	public static Class138 aClass138_60;

	@OriginalMember(owner = "client!ql", name = "V", descriptor = "S")
	public static short aShort38 = 320;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(BC)C")
	public static char method3621(@OriginalArg(1) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "(I)I")
	public static int method3622() {
		if (Static75.aFrame1 != null) {
			return 3;
		} else if (Static291.aBoolean404 && Static128.aBoolean191) {
			return 2;
		} else if (Static291.aBoolean404 && !Static128.aBoolean191) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIILclient!h;IJZ)Z")
	public static boolean method3623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class22 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static300.method4500(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

	@OriginalMember(owner = "client!ql", name = "h", descriptor = "(I)V")
	public static void method3624() {
		Static292.aClass169_153.method4018();
	}

	@OriginalMember(owner = "client!ql", name = "i", descriptor = "(I)V")
	public static void method3625() {
		Static17.anInt300 = 0;
		Static110.anInt2185 = 0;
		Static82.method1240();
		Static165.method2791();
		Static115.method1841();
		Static175.method2924();
		@Pc(19) int local19;
		for (local19 = 0; local19 < Static110.anInt2185; local19++) {
			@Pc(30) int local30 = Static119.anIntArray535[local19];
			if (Static37.anInt757 != Static195.aClass22_Sub3_Sub2Array1[local30].anInt4614) {
				if (Static195.aClass22_Sub3_Sub2Array1[local30].anInt4653 > 0) {
					Static232.method2980(Static195.aClass22_Sub3_Sub2Array1[local30], local30);
				}
				Static195.aClass22_Sub3_Sub2Array1[local30] = null;
			}
		}
		if (Static237.aClass1_Sub14_Sub1_7.anInt3290 != Static127.anInt2543) {
			throw new RuntimeException("gpp1 pos:" + Static237.aClass1_Sub14_Sub1_7.anInt3290 + " psize:" + Static127.anInt2543);
		}
		for (local19 = 0; local19 < Static222.anInt4329; local19++) {
			if (Static195.aClass22_Sub3_Sub2Array1[Static46.anIntArray79[local19]] == null) {
				throw new RuntimeException("gpp2 pos:" + local19 + " size:" + Static222.anInt4329);
			}
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public static void method3626(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class146 local8 = Static300.method4492(arg3, arg1);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray29 != null) {
			@Pc(20) Class1_Sub29 local20 = new Class1_Sub29();
			local20.anObjectArray32 = local8.anObjectArray29;
			local20.aClass146_16 = local8;
			local20.aString168 = arg0;
			local20.anInt5097 = arg2;
			Static171.method2886(local20);
		}
		@Pc(38) boolean local38 = true;
		if (local8.anInt4350 > 0) {
			local38 = Static78.method1214(local8);
		}
		if (!local38 || !Static36.method643(local8).method3243(arg2 - 1)) {
			return;
		}
		if (arg2 == 1) {
			Static137.aClass1_Sub14_Sub1_6.method2661(161);
			Static137.aClass1_Sub14_Sub1_6.method2630(arg1);
			Static137.aClass1_Sub14_Sub1_6.method2637(arg3);
		}
		if (arg2 == 2) {
			Static137.aClass1_Sub14_Sub1_6.method2661(5);
			Static137.aClass1_Sub14_Sub1_6.method2630(arg1);
			Static137.aClass1_Sub14_Sub1_6.method2637(arg3);
		}
		if (arg2 == 3) {
			Static137.aClass1_Sub14_Sub1_6.method2661(199);
			Static137.aClass1_Sub14_Sub1_6.method2630(arg1);
			Static137.aClass1_Sub14_Sub1_6.method2637(arg3);
		}
		if (arg2 == 4) {
			Static137.aClass1_Sub14_Sub1_6.method2661(174);
			Static137.aClass1_Sub14_Sub1_6.method2630(arg1);
			Static137.aClass1_Sub14_Sub1_6.method2637(arg3);
		}
		if (arg2 == 5) {
			Static137.aClass1_Sub14_Sub1_6.method2661(151);
			Static137.aClass1_Sub14_Sub1_6.method2630(arg1);
			Static137.aClass1_Sub14_Sub1_6.method2637(arg3);
		}
		if (arg2 == 6) {
			Static137.aClass1_Sub14_Sub1_6.method2661(85);
			Static137.aClass1_Sub14_Sub1_6.method2630(arg1);
			Static137.aClass1_Sub14_Sub1_6.method2637(arg3);
		}
		if (arg2 == 7) {
			Static137.aClass1_Sub14_Sub1_6.method2661(58);
			Static137.aClass1_Sub14_Sub1_6.method2630(arg1);
			Static137.aClass1_Sub14_Sub1_6.method2637(arg3);
		}
		if (arg2 == 8) {
			Static137.aClass1_Sub14_Sub1_6.method2661(50);
			Static137.aClass1_Sub14_Sub1_6.method2630(arg1);
			Static137.aClass1_Sub14_Sub1_6.method2637(arg3);
		}
		if (arg2 == 9) {
			Static137.aClass1_Sub14_Sub1_6.method2661(132);
			Static137.aClass1_Sub14_Sub1_6.method2630(arg1);
			Static137.aClass1_Sub14_Sub1_6.method2637(arg3);
		}
		if (arg2 == 10) {
			Static137.aClass1_Sub14_Sub1_6.method2661(228);
			Static137.aClass1_Sub14_Sub1_6.method2630(arg1);
			Static137.aClass1_Sub14_Sub1_6.method2637(arg3);
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIIIIB)Z")
	public static boolean method3628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg6 < arg2 + arg1 && arg2 < arg6 + arg4) {
			return arg7 + arg3 > arg5 && arg5 + arg0 > arg3;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(IB)I")
	public static int method3629(@OriginalArg(0) int arg0) {
		@Pc(19) int local19 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAA) >>> 1);
		@Pc(29) int local29 = (local19 >>> 2 & 0x33333333) + (local19 & 0x33333333);
		@Pc(37) int local37 = (local29 >>> 4) + local29 & 0xF0F0F0F;
		@Pc(43) int local43 = local37 + (local37 >>> 8);
		@Pc(49) int local49 = local43 + (local43 >>> 16);
		return local49 & 0xFF;
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(II)V")
	public static void method3630(@OriginalArg(0) int arg0) {
		@Pc(4) Class1_Sub1_Sub2 local4 = Static46.method824(6, arg0);
		local4.method299();
	}
}

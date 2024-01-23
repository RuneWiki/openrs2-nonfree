import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!mg", name = "N", descriptor = "I")
	public static int anInt3498;

	@OriginalMember(owner = "client!mg", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString203 = "Use";

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIIIILclient!dn;IZJ)Z")
	public static boolean method2819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class14 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		@Pc(6) boolean local6 = Static55.anIntArrayArrayArray3 == Static255.anIntArrayArrayArray12;
		@Pc(8) int local8 = 0;
		@Pc(17) int local17;
		for (@Pc(10) int local10 = arg1; local10 < arg1 + arg3; local10++) {
			for (local17 = arg2; local17 < arg2 + arg4; local17++) {
				if (local10 < 0 || local17 < 0 || local10 >= Static158.anInt3404 || local17 >= Static209.anInt4179) {
					return false;
				}
				@Pc(42) Class1_Sub26 local42 = Static74.aClass1_Sub26ArrayArrayArray1[arg0][local10][local17];
				if (local42 != null && local42.anInt4090 >= 5) {
					return false;
				}
			}
		}
		@Pc(58) Class25 local58 = new Class25();
		local58.aLong39 = arg11;
		local58.anInt1007 = arg0;
		local58.anInt1009 = arg5;
		local58.anInt1011 = arg6;
		local58.anInt1005 = arg7;
		local58.aClass14_1 = arg8;
		local58.anInt1010 = arg9;
		local58.anInt1003 = arg1;
		local58.anInt1000 = arg2;
		local58.anInt1004 = arg1 + arg3 - 1;
		local58.anInt999 = arg2 + arg4 - 1;
		@Pc(108) int local108;
		for (local17 = arg1; local17 < arg1 + arg3; local17++) {
			for (local108 = arg2; local108 < arg2 + arg4; local108++) {
				@Pc(115) int local115 = 0;
				if (local17 > arg1) {
					local115++;
				}
				if (local17 < arg1 + arg3 - 1) {
					local115 += 4;
				}
				if (local108 > arg2) {
					local115 += 8;
				}
				if (local108 < arg2 + arg4 - 1) {
					local115 += 2;
				}
				for (@Pc(141) int local141 = arg0; local141 >= 0; local141--) {
					if (Static74.aClass1_Sub26ArrayArrayArray1[local141][local17][local108] == null) {
						Static74.aClass1_Sub26ArrayArrayArray1[local141][local17][local108] = new Class1_Sub26(local141, local17, local108);
					}
				}
				@Pc(174) Class1_Sub26 local174 = Static74.aClass1_Sub26ArrayArrayArray1[arg0][local17][local108];
				local174.aClass25Array4[local174.anInt4090] = local58;
				local174.anIntArray366[local174.anInt4090] = local115;
				local174.anInt4088 |= local115;
				local174.anInt4090++;
				if (local6 && Static242.anIntArrayArray31[local17][local108] != 0) {
					local8 = Static242.anIntArrayArray31[local17][local108];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local17 = arg1; local17 < arg1 + arg3; local17++) {
				for (local108 = arg2; local108 < arg2 + arg4; local108++) {
					if (Static242.anIntArrayArray31[local17][local108] == 0) {
						Static242.anIntArrayArray31[local17][local108] = local8;
					}
				}
			}
		}
		if (arg10) {
			Static82.aClass25Array2[Static199.anInt4060++] = local58;
		}
		return true;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILclient!in;IIIII)V")
	public static void method2820(@OriginalArg(1) int arg0, @OriginalArg(2) Class71 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static107.aBoolean176) {
			Static147.anInt3194 = 32;
		} else {
			Static147.anInt3194 = 0;
		}
		Static107.aBoolean176 = false;
		@Pc(113) int local113;
		if (Static66.anInt1384 != 0) {
			if (arg3 >= arg0 && arg0 + 16 > arg3 && arg5 >= arg4 && arg4 + 16 > arg5) {
				arg1.anInt2646 -= 4;
				Static160.method2779(arg1);
			} else if (arg3 >= arg0 && arg0 + 16 > arg3 && arg5 >= arg2 + arg4 - 16 && arg5 < arg4 + arg2) {
				arg1.anInt2646 += 4;
				Static160.method2779(arg1);
			} else if (arg3 >= arg0 - Static147.anInt3194 && Static147.anInt3194 + arg0 + 16 > arg3 && arg5 >= arg4 + 16 && arg5 < arg4 + arg2 - 16) {
				local113 = arg2 * (arg2 - 32) / arg6;
				if (local113 < 8) {
					local113 = 8;
				}
				@Pc(133) int local133 = arg5 - local113 / 2 - arg4 - 16;
				@Pc(139) int local139 = arg2 - local113 - 32;
				arg1.anInt2646 = local133 * (arg6 - arg2) / local139;
				Static160.method2779(arg1);
				Static107.aBoolean176 = true;
			}
		}
		if (Static160.anInt3450 == 0) {
			return;
		}
		local113 = arg1.anInt2722;
		if (arg3 >= arg0 - local113 && arg5 >= arg4 && arg3 < arg0 + 16 && arg5 <= arg2 + arg4) {
			arg1.anInt2646 += Static160.anInt3450 * 45;
			Static160.method2779(arg1);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BIII)I")
	public static int method2821(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "(I)[Lclient!bc;")
	public static Class12[] method2822() {
		@Pc(8) Class12[] local8 = new Class12[Static199.anInt4056];
		for (@Pc(10) int local10 = 0; local10 < Static199.anInt4056; local10++) {
			if (Static277.aBoolean412) {
				local8[local10] = new Class12_Sub1(Static60.anInt1268, Static267.anInt5199, Static268.anIntArray461[local10], Static289.anIntArray543[local10], Static31.anIntArray78[local10], Static44.anIntArray97[local10], Static268.aByteArrayArray13[local10], Static133.anIntArray266);
			} else {
				local8[local10] = new Class12_Sub2(Static60.anInt1268, Static267.anInt5199, Static268.anIntArray461[local10], Static289.anIntArray543[local10], Static31.anIntArray78[local10], Static44.anIntArray97[local10], Static268.aByteArrayArray13[local10], Static133.anIntArray266);
			}
		}
		Static91.method1595();
		return local8;
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(II)V")
	public static void method2823(@OriginalArg(1) int arg0) {
		if (arg0 == Static194.anInt4017) {
			return;
		}
		if (Static194.anInt4017 == 0) {
			Static229.method3572();
		}
		@Pc(38) boolean local38 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		if (arg0 == 40) {
			Static88.method1534();
		}
		if (arg0 != 40 && Static122.aClass113_4 != null) {
			Static122.aClass113_4.method3019();
			Static122.aClass113_4 = null;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static198.anInt35 = 0;
			Static289.anInt5498 = 1;
			Static205.anInt4152 = 1;
			Static69.anInt1472 = 0;
			Static273.anInt5323 = 0;
			Static131.method2228(true);
		}
		if (arg0 == 25 || arg0 == 10) {
			Static73.method1270();
		}
		if (arg0 == 5) {
			Static123.method2163(Static134.aClass91_110);
		} else {
			Static151.method4443();
		}
		@Pc(126) boolean local126 = Static194.anInt4017 == 5 || Static194.anInt4017 == 10 || Static194.anInt4017 == 28;
		if (local38 != local126) {
			if (local38) {
				Static270.anInt5276 = Static189.anInt3910;
				if (Static184.anInt3815 == 0) {
					Static24.method3640();
				} else {
					Static113.method2071(255, Static189.anInt3910, Static197.aClass91_152);
				}
				Static177.aClass162_3.method4046(false);
			} else {
				Static24.method3640();
				Static177.aClass162_3.method4046(true);
			}
		}
		if (Static277.aBoolean412 && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
			Static277.method4201();
		}
		Static194.anInt4017 = arg0;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZLclient!km;I)Z")
	public static boolean method2824(@OriginalArg(1) Class91 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method2488(arg1);
		if (local13 == null) {
			return false;
		} else {
			Static82.method1391(local13);
			return true;
		}
	}

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "(II)Lclient!ao;")
	public static Class10 method2826(@OriginalArg(0) int arg0) {
		@Pc(6) Class10 local6 = (Class10) Static191.aClass135_19.method3316((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(23) byte[] local23 = Static155.aClass91_123.method2495(4, arg0);
		local6 = new Class10();
		if (local23 != null) {
			local6.method283(arg0, new Class1_Sub11(local23));
		}
		Static191.aClass135_19.method3321((long) arg0, local6);
		return local6;
	}
}

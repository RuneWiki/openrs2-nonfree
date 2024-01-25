import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!wu", name = "M", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_467 = new Class305(103, -1);

	@OriginalMember(owner = "client!wu", name = "N", descriptor = "S")
	public static short aShort129 = 32767;

	@OriginalMember(owner = "client!wu", name = "P", descriptor = "I")
	public static int anInt9602 = 0;

	@OriginalMember(owner = "client!wu", name = "Q", descriptor = "I")
	public static int anInt9603 = 0;

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IILclient!qt;IIIIIIII)Z")
	public static boolean method8253(@OriginalArg(0) int arg0, @OriginalArg(2) Class243 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg8;
		@Pc(27) int local27 = arg2 - 64;
		@Pc(32) int local32 = arg8 - 64;
		Static430.anIntArrayArray124[64][64] = 99;
		Static219.anIntArrayArray45[64][64] = 0;
		@Pc(46) byte local46 = 0;
		@Pc(48) int local48 = 0;
		Static159.anIntArray267[0] = arg2;
		@Pc(55) int local55 = local46 + 1;
		Static266.anIntArray423[0] = arg8;
		@Pc(60) int[][] local60 = arg1.anIntArrayArray95;
		while (local48 != local55) {
			local9 = Static266.anIntArray423[local48];
			local7 = Static159.anIntArray267[local48];
			@Pc(75) int local75 = local9 - local32;
			local48 = local48 + 1 & 0xFFF;
			@Pc(85) int local85 = local7 - local27;
			@Pc(91) int local91 = local7 - arg1.anInt7190;
			@Pc(97) int local97 = local9 - arg1.anInt7169;
			if (arg5 == -4) {
				if (arg9 == local7 && local9 == arg6) {
					Static106.anInt2252 = local7;
					Static140.anInt2808 = local9;
					return true;
				}
			} else if (arg5 == -3) {
				if (Static116.method2268(arg3, 2, arg9, local7, arg6, local9, 2, arg7)) {
					Static106.anInt2252 = local7;
					Static140.anInt2808 = local9;
					return true;
				}
			} else if (arg5 == -2) {
				if (arg1.method6465(arg4, arg7, arg6, arg9, local9, 2, 2, local7, arg3)) {
					Static106.anInt2252 = local7;
					Static140.anInt2808 = local9;
					return true;
				}
			} else if (arg5 == -1) {
				if (arg1.method6464(2, local7, arg6, arg3, arg9, arg7, local9, arg4)) {
					Static106.anInt2252 = local7;
					Static140.anInt2808 = local9;
					return true;
				}
			} else if (arg5 == 0 || arg5 == 1 || arg5 == 2 || arg5 == 3 || arg5 == 9) {
				if (arg1.method6461(arg0, arg6, arg5, arg9, local7, 2, local9)) {
					Static106.anInt2252 = local7;
					Static140.anInt2808 = local9;
					return true;
				}
			} else if (arg1.method6463(arg0, arg9, local9, local7, arg5, 2, arg6)) {
				Static106.anInt2252 = local7;
				Static140.anInt2808 = local9;
				return true;
			}
			@Pc(253) int local253 = Static219.anIntArrayArray45[local85][local75] + 1;
			if (local85 > 0 && Static430.anIntArrayArray124[local85 - 1][local75] == 0 && (local60[local91 - 1][local97] & 0x43A40000) == 0 && (local60[local91 - 1][local97 + 1] & 0x4E240000) == 0) {
				Static159.anIntArray267[local55] = local7 - 1;
				Static266.anIntArray423[local55] = local9;
				local55 = local55 + 1 & 0xFFF;
				Static430.anIntArrayArray124[local85 - 1][local75] = 2;
				Static219.anIntArrayArray45[local85 - 1][local75] = local253;
			}
			if (local85 < 126 && Static430.anIntArrayArray124[local85 + 1][local75] == 0 && (local60[local91 + 2][local97] & 0x60E40000) == 0 && (local60[local91 + 2][local97 + 1] & 0x78240000) == 0) {
				Static159.anIntArray267[local55] = local7 + 1;
				Static266.anIntArray423[local55] = local9;
				Static430.anIntArrayArray124[local85 + 1][local75] = 8;
				local55 = local55 + 1 & 0xFFF;
				Static219.anIntArrayArray45[local85 + 1][local75] = local253;
			}
			if (local75 > 0 && Static430.anIntArrayArray124[local85][local75 - 1] == 0 && (local60[local91][local97 - 1] & 0x43A40000) == 0 && (local60[local91 + 1][local97 - 1] & 0x60E40000) == 0) {
				Static159.anIntArray267[local55] = local7;
				Static266.anIntArray423[local55] = local9 - 1;
				local55 = local55 + 1 & 0xFFF;
				Static430.anIntArrayArray124[local85][local75 - 1] = 1;
				Static219.anIntArrayArray45[local85][local75 - 1] = local253;
			}
			if (local75 < 126 && Static430.anIntArrayArray124[local85][local75 + 1] == 0 && (local60[local91][local97 + 2] & 0x4E240000) == 0 && (local60[local91 + 1][local97 + 2] & 0x78240000) == 0) {
				Static159.anIntArray267[local55] = local7;
				Static266.anIntArray423[local55] = local9 + 1;
				local55 = local55 + 1 & 0xFFF;
				Static430.anIntArrayArray124[local85][local75 + 1] = 4;
				Static219.anIntArrayArray45[local85][local75 + 1] = local253;
			}
			if (local85 > 0 && local75 > 0 && Static430.anIntArrayArray124[local85 - 1][local75 - 1] == 0 && (local60[local91 - 1][local97] & 0x4FA40000) == 0 && (local60[local91 - 1][local97 - 1] & 0x43A40000) == 0 && (local60[local91][local97 - 1] & 0x63E40000) == 0) {
				Static159.anIntArray267[local55] = local7 - 1;
				Static266.anIntArray423[local55] = local9 - 1;
				Static430.anIntArrayArray124[local85 - 1][local75 - 1] = 3;
				local55 = local55 + 1 & 0xFFF;
				Static219.anIntArrayArray45[local85 - 1][local75 - 1] = local253;
			}
			if (local85 < 126 && local75 > 0 && Static430.anIntArrayArray124[local85 + 1][local75 - 1] == 0 && (local60[local91 + 1][local97 - 1] & 0x63E40000) == 0 && (local60[local91 + 2][local97 - 1] & 0x60E40000) == 0 && (local60[local91 + 2][local97] & 0x78E40000) == 0) {
				Static159.anIntArray267[local55] = local7 + 1;
				Static266.anIntArray423[local55] = local9 - 1;
				local55 = local55 + 1 & 0xFFF;
				Static430.anIntArrayArray124[local85 + 1][local75 - 1] = 9;
				Static219.anIntArrayArray45[local85 + 1][local75 - 1] = local253;
			}
			if (local85 > 0 && local75 < 126 && Static430.anIntArrayArray124[local85 - 1][local75 + 1] == 0 && (local60[local91 - 1][local97 + 1] & 0x4FA40000) == 0 && (local60[local91 - 1][local97 + 2] & 0x4E240000) == 0 && (local60[local91][local97 + 2] & 0x7E240000) == 0) {
				Static159.anIntArray267[local55] = local7 - 1;
				Static266.anIntArray423[local55] = local9 + 1;
				local55 = local55 + 1 & 0xFFF;
				Static430.anIntArrayArray124[local85 - 1][local75 + 1] = 6;
				Static219.anIntArrayArray45[local85 - 1][local75 + 1] = local253;
			}
			if (local85 < 126 && local75 < 126 && Static430.anIntArrayArray124[local85 + 1][local75 + 1] == 0 && (local60[local91 + 1][local97 + 2] & 0x7E240000) == 0 && (local60[local91 + 2][local97 + 2] & 0x78240000) == 0 && (local60[local91 + 2][local97 + 1] & 0x78E40000) == 0) {
				Static159.anIntArray267[local55] = local7 + 1;
				Static266.anIntArray423[local55] = local9 + 1;
				Static430.anIntArrayArray124[local85 + 1][local75 + 1] = 12;
				local55 = local55 + 1 & 0xFFF;
				Static219.anIntArrayArray45[local85 + 1][local75 + 1] = local253;
			}
		}
		Static106.anInt2252 = local7;
		Static140.anInt2808 = local9;
		return false;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILclient!et;IZI)V")
	public static void method8256(@OriginalArg(1) Class91 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg0.anInt2399;
		@Pc(16) int local16 = arg0.anInt2378;
		if (arg0.aByte40 == 0) {
			arg0.anInt2399 = arg0.anInt2400;
		} else if (arg0.aByte40 == 1) {
			arg0.anInt2399 = arg1 - arg0.anInt2400;
		} else if (arg0.aByte40 == 2) {
			arg0.anInt2399 = arg0.anInt2400 * arg1 >> 14;
		}
		if (arg0.aByte39 == 0) {
			arg0.anInt2378 = arg0.anInt2397;
		} else if (arg0.aByte39 == 1) {
			arg0.anInt2378 = arg3 - arg0.anInt2397;
		} else if (arg0.aByte39 == 2) {
			arg0.anInt2378 = arg3 * arg0.anInt2397 >> 14;
		}
		if (arg0.aByte40 == 4) {
			arg0.anInt2399 = arg0.anInt2422 * arg0.anInt2378 / arg0.anInt2392;
		}
		if (arg0.aByte39 == 4) {
			arg0.anInt2378 = arg0.anInt2399 * arg0.anInt2392 / arg0.anInt2422;
		}
		if (Static428.aBoolean561 && (Static63.method1580(arg0).anInt1806 != 0 || arg0.anInt2452 == 0)) {
			if (arg0.anInt2378 < 5 && arg0.anInt2399 < 5) {
				arg0.anInt2399 = 5;
				arg0.anInt2378 = 5;
			} else {
				if (arg0.anInt2399 <= 0) {
					arg0.anInt2399 = 5;
				}
				if (arg0.anInt2378 <= 0) {
					arg0.anInt2378 = 5;
				}
			}
		}
		if (arg0.anInt2429 == Static429.anInt7441) {
			Static400.aClass91_12 = arg0;
		}
		if (arg2 && arg0.anObjectArray9 != null && (arg0.anInt2399 != local8 || arg0.anInt2378 != local16)) {
			@Pc(195) Class1_Sub10 local195 = new Class1_Sub10();
			local195.anObjectArray4 = arg0.anObjectArray9;
			local195.aClass91_2 = arg0;
			Static282.aClass295_21.method7533(local195);
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IZI)Z")
	public static boolean method8257(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIILclient!cn;I)V")
	public static void method8261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class51 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(14) Class1_Sub37 local14 = (Class1_Sub37) Static307.aClass295_34.method7543(); local14 != null; local14 = (Class1_Sub37) Static307.aClass295_34.method7540()) {
			if (arg1 == local14.anInt5957 && arg0 << 7 == local14.anInt5962 && arg3 << 7 == local14.anInt5960 && arg2.anInt1646 == local14.aClass51_1.anInt1646) {
				if (local14.aClass1_Sub4_Sub1_3 != null) {
					Static475.aClass1_Sub4_Sub2_2.method3184(local14.aClass1_Sub4_Sub1_3);
					local14.aClass1_Sub4_Sub1_3 = null;
				}
				if (local14.aClass1_Sub4_Sub1_2 != null) {
					Static475.aClass1_Sub4_Sub2_2.method3184(local14.aClass1_Sub4_Sub1_2);
					local14.aClass1_Sub4_Sub1_2 = null;
				}
				local14.method8239();
				return;
			}
		}
	}
}

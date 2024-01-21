import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!rc", name = "Q", descriptor = "I")
	public static int anInt3233;

	@OriginalMember(owner = "client!rc", name = "W", descriptor = "Lclient!m;")
	public static Class3_Sub11 aClass3_Sub11_36;

	@OriginalMember(owner = "client!rc", name = "L", descriptor = "Lclient!he;")
	public static Class26 aClass26_1759 = Static6.method100("T");

	@OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
	public static int anInt3231 = 0;

	@OriginalMember(owner = "client!rc", name = "P", descriptor = "Lclient!he;")
	public static Class26 aClass26_1760 = Static6.method100("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!rc", name = "R", descriptor = "I")
	public static int anInt3234 = 1;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)V")
	public static void method2206() {
		aClass3_Sub11_36 = null;
		aClass26_1759 = null;
		aClass26_1760 = null;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZZIZ)Lclient!eb;")
	public static Class16_Sub1 method2207(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(10) Class12 local10 = null;
		if (Static81.aClass27_4 != null) {
			local10 = new Class12(arg2, Static81.aClass27_4, Static39.aClass27Array1[arg2], 1000000);
		}
		return new Class16_Sub1(local10, Static17.aClass12_1, arg2, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
	public static void method2208() {
		for (@Pc(11) int local11 = 0; local11 < Static133.anInt560; local11++) {
			@Pc(17) int local17 = Static48.anIntArray151[local11];
			@Pc(21) Class3_Sub1_Sub5_Sub1_Sub2 local21 = Static93.aClass3_Sub1_Sub5_Sub1_Sub2Array1[local17];
			if (local21 != null) {
				Static20.method388(local21.aClass3_Sub1_Sub3_1.anInt227, local21);
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIIZIIIII)Z")
	public static boolean method2209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				Static15.anIntArrayArray4[local7][local11] = 0;
				Static14.anIntArrayArray3[local7][local11] = 99999999;
			}
		}
		Static15.anIntArrayArray4[arg10][arg1] = 99;
		Static14.anIntArrayArray3[arg10][arg1] = 0;
		local11 = arg10;
		@Pc(53) int local53 = arg1;
		@Pc(55) byte local55 = 0;
		Static78.anIntArray208[0] = arg10;
		@Pc(62) int local62 = local55 + 1;
		Static51.anIntArray158[0] = arg1;
		@Pc(66) int local66 = 0;
		@Pc(68) boolean local68 = false;
		@Pc(71) int local71 = Static78.anIntArray208.length;
		@Pc(76) int[][] local76 = Static93.aClass4Array1[Static132.anInt3270].anIntArrayArray1;
		@Pc(192) int local192;
		while (local62 != local66) {
			local53 = Static51.anIntArray158[local66];
			local11 = Static78.anIntArray208[local66];
			local66 = (local66 + 1) % local71;
			if (local11 == arg3 && local53 == arg2) {
				local68 = true;
				break;
			}
			if (arg5 != 0) {
				if ((arg5 < 5 || arg5 == 10) && Static93.aClass4Array1[Static132.anInt3270].method74(arg2, arg5 - 1, arg3, local11, arg8, local53)) {
					local68 = true;
					break;
				}
				if (arg5 < 10 && Static93.aClass4Array1[Static132.anInt3270].method60(arg2, arg5 - 1, arg3, local53, arg8, local11)) {
					local68 = true;
					break;
				}
			}
			if (arg4 != 0 && arg0 != 0 && Static93.aClass4Array1[Static132.anInt3270].method61(arg0, local53, arg4, local11, arg3, arg2, arg9)) {
				local68 = true;
				break;
			}
			local192 = Static14.anIntArrayArray3[local11][local53] + 1;
			if (local11 > 0 && Static15.anIntArrayArray4[local11 - 1][local53] == 0 && (local76[local11 - 1][local53] & 0x12C0108) == 0) {
				Static78.anIntArray208[local62] = local11 - 1;
				Static51.anIntArray158[local62] = local53;
				Static15.anIntArrayArray4[local11 - 1][local53] = 2;
				local62 = (local62 + 1) % local71;
				Static14.anIntArrayArray3[local11 - 1][local53] = local192;
			}
			if (local11 < 103 && Static15.anIntArrayArray4[local11 + 1][local53] == 0 && (local76[local11 + 1][local53] & 0x12C0180) == 0) {
				Static78.anIntArray208[local62] = local11 + 1;
				Static51.anIntArray158[local62] = local53;
				local62 = (local62 + 1) % local71;
				Static15.anIntArrayArray4[local11 + 1][local53] = 8;
				Static14.anIntArrayArray3[local11 + 1][local53] = local192;
			}
			if (local53 > 0 && Static15.anIntArrayArray4[local11][local53 - 1] == 0 && (local76[local11][local53 - 1] & 0x12C0102) == 0) {
				Static78.anIntArray208[local62] = local11;
				Static51.anIntArray158[local62] = local53 - 1;
				local62 = (local62 + 1) % local71;
				Static15.anIntArrayArray4[local11][local53 - 1] = 1;
				Static14.anIntArrayArray3[local11][local53 - 1] = local192;
			}
			if (local53 < 103 && Static15.anIntArrayArray4[local11][local53 + 1] == 0 && (local76[local11][local53 + 1] & 0x12C0120) == 0) {
				Static78.anIntArray208[local62] = local11;
				Static51.anIntArray158[local62] = local53 + 1;
				Static15.anIntArrayArray4[local11][local53 + 1] = 4;
				Static14.anIntArrayArray3[local11][local53 + 1] = local192;
				local62 = (local62 + 1) % local71;
			}
			if (local11 > 0 && local53 > 0 && Static15.anIntArrayArray4[local11 - 1][local53 - 1] == 0 && (local76[local11 - 1][local53 - 1] & 0x12C010E) == 0 && (local76[local11 - 1][local53] & 0x12C0108) == 0 && (local76[local11][local53 - 1] & 0x12C0102) == 0) {
				Static78.anIntArray208[local62] = local11 - 1;
				Static51.anIntArray158[local62] = local53 - 1;
				local62 = (local62 + 1) % local71;
				Static15.anIntArrayArray4[local11 - 1][local53 - 1] = 3;
				Static14.anIntArrayArray3[local11 - 1][local53 - 1] = local192;
			}
			if (local11 < 103 && local53 > 0 && Static15.anIntArrayArray4[local11 + 1][local53 - 1] == 0 && (local76[local11 + 1][local53 - 1] & 0x12C0183) == 0 && (local76[local11 + 1][local53] & 0x12C0180) == 0 && (local76[local11][local53 - 1] & 0x12C0102) == 0) {
				Static78.anIntArray208[local62] = local11 + 1;
				Static51.anIntArray158[local62] = local53 - 1;
				local62 = (local62 + 1) % local71;
				Static15.anIntArrayArray4[local11 + 1][local53 - 1] = 9;
				Static14.anIntArrayArray3[local11 + 1][local53 - 1] = local192;
			}
			if (local11 > 0 && local53 < 103 && Static15.anIntArrayArray4[local11 - 1][local53 + 1] == 0 && (local76[local11 - 1][local53 + 1] & 0x12C0138) == 0 && (local76[local11 - 1][local53] & 0x12C0108) == 0 && (local76[local11][local53 + 1] & 0x12C0120) == 0) {
				Static78.anIntArray208[local62] = local11 - 1;
				Static51.anIntArray158[local62] = local53 + 1;
				Static15.anIntArrayArray4[local11 - 1][local53 + 1] = 6;
				Static14.anIntArrayArray3[local11 - 1][local53 + 1] = local192;
				local62 = (local62 + 1) % local71;
			}
			if (local11 < 103 && local53 < 103 && Static15.anIntArrayArray4[local11 + 1][local53 + 1] == 0 && (local76[local11 + 1][local53 + 1] & 0x12C01E0) == 0 && (local76[local11 + 1][local53] & 0x12C0180) == 0 && (local76[local11][local53 + 1] & 0x12C0120) == 0) {
				Static78.anIntArray208[local62] = local11 + 1;
				Static51.anIntArray158[local62] = local53 + 1;
				Static15.anIntArrayArray4[local11 + 1][local53 + 1] = 12;
				Static14.anIntArrayArray3[local11 + 1][local53 + 1] = local192;
				local62 = (local62 + 1) % local71;
			}
		}
		Static9.anInt242 = 0;
		@Pc(817) int local817;
		@Pc(826) int local826;
		@Pc(832) int local832;
		if (!local68) {
			if (!arg6) {
				return false;
			}
			local817 = 100;
			local192 = 1000;
			for (local826 = arg3 - 10; local826 <= arg3 + 10; local826++) {
				for (local832 = arg2 - 10; local832 <= arg2 + 10; local832++) {
					if (local826 >= 0 && local832 >= 0 && local826 < 104 && local832 < 104 && Static14.anIntArrayArray3[local826][local832] < 100) {
						@Pc(863) int local863 = 0;
						@Pc(865) int local865 = 0;
						if (arg3 > local826) {
							local863 = arg3 - local826;
						} else if (arg4 + arg3 - 1 < local826) {
							local863 = local826 + 1 - arg4 - arg3;
						}
						if (local832 < arg2) {
							local865 = arg2 - local832;
						} else if (local832 > arg0 + arg2 - 1) {
							local865 = local832 + 1 - arg2 - arg0;
						}
						@Pc(931) int local931 = local865 * local865 + local863 * local863;
						if (local931 < local192 || local931 == local192 && local817 > Static14.anIntArrayArray3[local826][local832]) {
							local53 = local832;
							local817 = Static14.anIntArrayArray3[local826][local832];
							local11 = local826;
							local192 = local931;
						}
					}
				}
			}
			if (local192 == 1000) {
				return false;
			}
			if (local11 == arg10 && local53 == arg1) {
				return false;
			}
			Static9.anInt242 = 1;
		}
		@Pc(999) byte local999 = 0;
		Static78.anIntArray208[0] = local11;
		local66 = local999 + 1;
		Static51.anIntArray158[0] = local53;
		local192 = local817 = Static15.anIntArrayArray4[local11][local53];
		while (arg10 != local11 || arg1 != local53) {
			if (local817 != local192) {
				Static78.anIntArray208[local66] = local11;
				Static51.anIntArray158[local66++] = local53;
				local817 = local192;
			}
			if ((local192 & 0x1) != 0) {
				local53++;
			} else if ((local192 & 0x4) != 0) {
				local53--;
			}
			if ((local192 & 0x2) != 0) {
				local11++;
			} else if ((local192 & 0x8) != 0) {
				local11--;
			}
			local192 = Static15.anIntArrayArray4[local11][local53];
		}
		if (local66 > 0) {
			local71 = local66--;
			@Pc(1077) int local1077 = Static78.anIntArray208[local66];
			if (local71 > 25) {
				local71 = 25;
			}
			local826 = Static51.anIntArray158[local66];
			if (arg7 == 0) {
				Static107.aClass3_Sub11_Sub1_3.method1029(50);
				Static107.aClass3_Sub11_Sub1_3.method992(local71 + local71 + 3);
			}
			if (arg7 == 1) {
				Static107.aClass3_Sub11_Sub1_3.method1029(143);
				Static107.aClass3_Sub11_Sub1_3.method992(local71 + local71 + 14 + 3);
			}
			if (arg7 == 2) {
				Static107.aClass3_Sub11_Sub1_3.method1029(36);
				Static107.aClass3_Sub11_Sub1_3.method992(local71 + local71 + 3);
			}
			Static107.aClass3_Sub11_Sub1_3.method975(Static95.aBooleanArray24[82] ? 1 : 0);
			Static107.aClass3_Sub11_Sub1_3.method989(local826 + Static56.anInt1700);
			Static107.aClass3_Sub11_Sub1_3.method983(local1077 + Static10.anInt286);
			Static110.anInt2946 = Static51.anIntArray158[0];
			Static1.anInt8 = Static78.anIntArray208[0];
			for (local832 = 1; local832 < local71; local832++) {
				local66--;
				Static107.aClass3_Sub11_Sub1_3.method975(Static78.anIntArray208[local66] - local1077);
				Static107.aClass3_Sub11_Sub1_3.method975(Static51.anIntArray158[local66] - local826);
			}
			return true;
		} else if (arg7 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIILclient!ef;)Lclient!qb;")
	public static Class3_Sub1_Sub4_Sub3 method2211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class16 arg2) {
		return Static90.method1659(arg0, arg1, arg2) ? Static31.method1883() : null;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZI)Lclient!nc;")
	public static Class3_Sub14 method2212(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static49.aClass3_Sub14ArrayArray1[local8] == null || Static49.aClass3_Sub14ArrayArray1[local8][local16] == null) {
			@Pc(30) boolean local30 = Static73.method1341(local8);
			if (!local30) {
				return null;
			}
		}
		return Static49.aClass3_Sub14ArrayArray1[local8][local16];
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!qb;IIBII)V")
	public static void method2213(@OriginalArg(0) Class3_Sub1_Sub4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = arg4 * arg4 + arg2 * arg2;
		if (local12 <= 4225 || local12 >= 90000) {
			Static63.method1247(arg4, arg2, arg0, arg1, arg3);
			return;
		}
		@Pc(34) int local34 = Static52.anInt1614 + Static78.anInt2107 & 0x7FF;
		@Pc(38) int local38 = Class3_Sub1_Sub4_Sub4.anIntArray391[local34];
		@Pc(46) int local46 = local38 * 256 / (Static33.anInt1081 + 256);
		@Pc(50) int local50 = Class3_Sub1_Sub4_Sub4.anIntArray392[local34];
		@Pc(58) int local58 = local50 * 256 / (Static33.anInt1081 + 256);
		@Pc(69) int local69 = local58 * arg2 - local46 * arg4 >> 16;
		@Pc(80) int local80 = arg2 * local46 + arg4 * local58 >> 16;
		@Pc(86) double local86 = Math.atan2((double) local80, (double) local69);
		@Pc(92) int local92 = (int) (Math.sin(local86) * 63.0D);
		@Pc(98) int local98 = (int) (Math.cos(local86) * 57.0D);
		Static108.aClass3_Sub1_Sub4_Sub3_4.method1743(arg3 + local92 + 94 - 6, -local98 + -20 + 83 + arg1, local86);
	}
}

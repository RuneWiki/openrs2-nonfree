import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
	public static int anInt5256;

	@OriginalMember(owner = "client!gj", name = "t", descriptor = "I")
	public static int anInt5263;

	@OriginalMember(owner = "client!gj", name = "k", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger5 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
	public static int anInt5257 = 0;

	@OriginalMember(owner = "client!gj", name = "u", descriptor = "[I")
	public static int[] anIntArray566 = new int[2];

	@OriginalMember(owner = "client!gj", name = "v", descriptor = "I")
	public static int anInt5264 = 0;

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)Z")
	public static boolean method4772() {
		try {
			if (Static319.anInt5902 == 2) {
				if (Static175.aClass6_Sub27_2 == null) {
					Static175.aClass6_Sub27_2 = Static366.method3651(Static252.aClass53_117, Static21.anInt335, Static16.anInt300);
					if (Static175.aClass6_Sub27_2 == null) {
						return false;
					}
				}
				if (Static21.aClass213_1 == null) {
					Static21.aClass213_1 = new Class213(Static91.aClass53_86, Static293.aClass53_136);
				}
				if (Static191.aClass6_Sub12_Sub1_3.method1454(Static21.aClass213_1, Static175.aClass6_Sub27_2, Static6.aClass53_9)) {
					Static191.aClass6_Sub12_Sub1_3.method1447();
					Static191.aClass6_Sub12_Sub1_3.method1446(Static76.anInt2855);
					Static191.aClass6_Sub12_Sub1_3.method1444(Static281.aBoolean369, Static175.aClass6_Sub27_2);
					Static252.aClass53_117 = null;
					Static21.aClass213_1 = null;
					Static175.aClass6_Sub27_2 = null;
					Static319.anInt5902 = 0;
					return true;
				}
			}
		} catch (@Pc(58) Exception local58) {
			local58.printStackTrace();
			Static191.aClass6_Sub12_Sub1_3.method1469();
			Static21.aClass213_1 = null;
			Static319.anInt5902 = 0;
			Static175.aClass6_Sub27_2 = null;
			Static252.aClass53_117 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!pf;)V")
	public static void method4773(@OriginalArg(0) Class44_Sub4 arg0) {
		for (@Pc(2) int local2 = arg0.aShort90; local2 <= arg0.aShort87; local2++) {
			for (@Pc(6) int local6 = arg0.aShort89; local6 <= arg0.aShort88; local6++) {
				@Pc(16) Class187 local16 = Static39.aClass187ArrayArrayArray1[arg0.aByte90][local2][local6];
				if (local16 != null) {
					@Pc(21) Class214 local21 = local16.aClass214_19;
					@Pc(23) Class214 local23 = null;
					while (local21 != null) {
						if (local21.aClass44_Sub4_1 == arg0) {
							if (local23 == null) {
								local16.aClass214_19 = local21.aClass214_21;
							} else {
								local23.aClass214_21 = local21.aClass214_21;
							}
							local21.method5645();
							break;
						}
						local23 = local21;
						local21 = local21.aClass214_21;
					}
					local16.aByte80 = 0;
					for (@Pc(56) Class214 local56 = local16.aClass214_19; local56 != null; local56 = local56.aClass214_21) {
						local16.aByte80 = (byte) (local16.aByte80 | local56.anInt6237);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIII)I")
	public static int method4774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = 255 - arg0;
		@Pc(30) int local30 = (arg0 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * arg0 & 0xFF0000) >>> 8;
		return (((arg2 & 0xFF00FF) * local8 & 0xFF00FF00 | local8 * (arg2 & 0xFF00) & 0xFF0000) >>> 8) + local30;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIB)I")
	public static int method4776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIIIBIILclient!c;)Z")
	public static boolean method4780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class27 arg9) {
		@Pc(15) int local15 = arg7;
		@Pc(17) int local17 = arg4;
		@Pc(26) int local26 = arg7 - 64;
		Static27.anIntArrayArray28[64][64] = 99;
		@Pc(36) int local36 = arg4 - 64;
		Static339.anIntArrayArray215[64][64] = 0;
		@Pc(44) byte local44 = 0;
		Static52.anIntArray112[0] = arg7;
		@Pc(50) int local50 = 0;
		@Pc(53) int local53 = local44 + 1;
		Static101.anIntArray258[0] = arg4;
		@Pc(58) int[][] local58 = arg9.anIntArrayArray31;
		while (local53 != local50) {
			local17 = Static101.anIntArray258[local50];
			local15 = Static52.anIntArray112[local50];
			local50 = local50 + 1 & 0xFFF;
			@Pc(79) int local79 = local17 - arg9.anInt621;
			@Pc(84) int local84 = local17 - local36;
			@Pc(88) int local88 = local15 - local26;
			@Pc(94) int local94 = local15 - arg9.anInt632;
			if (arg6 == -4) {
				if (local15 == arg8 && arg2 == local17) {
					Static78.anInt1445 = local17;
					Static151.anInt2862 = local15;
					return true;
				}
			} else if (arg6 == -3) {
				if (method4781(arg8, arg2, arg3, 1, local17, arg1, 1, local15)) {
					Static78.anInt1445 = local17;
					Static151.anInt2862 = local15;
					return true;
				}
			} else if (arg6 == -2) {
				if (arg9.method517(local15, arg1, local17, 1, arg3, arg0, 1, arg2, arg8)) {
					Static78.anInt1445 = local17;
					Static151.anInt2862 = local15;
					return true;
				}
			} else if (arg6 == -1) {
				if (arg9.method511(local15, arg8, arg0, arg1, 1, arg3, local17, arg2)) {
					Static78.anInt1445 = local17;
					Static151.anInt2862 = local15;
					return true;
				}
			} else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
				if (arg9.method515(local15, arg2, local17, 1, arg5, arg8, arg6)) {
					Static151.anInt2862 = local15;
					Static78.anInt1445 = local17;
					return true;
				}
			} else if (arg9.method524(arg2, local17, arg8, 1, arg6, local15, arg5)) {
				Static78.anInt1445 = local17;
				Static151.anInt2862 = local15;
				return true;
			}
			@Pc(239) int local239 = Static339.anIntArrayArray215[local88][local84] + 1;
			if (local88 > 0 && Static27.anIntArrayArray28[local88 - 1][local84] == 0 && (local58[local94 - 1][local79] & 0x42240000) == 0) {
				Static52.anIntArray112[local53] = local15 - 1;
				Static101.anIntArray258[local53] = local17;
				local53 = local53 + 1 & 0xFFF;
				Static27.anIntArrayArray28[local88 - 1][local84] = 2;
				Static339.anIntArrayArray215[local88 - 1][local84] = local239;
			}
			if (local88 < 127 && Static27.anIntArrayArray28[local88 + 1][local84] == 0 && (local58[local94 + 1][local79] & 0x60240000) == 0) {
				Static52.anIntArray112[local53] = local15 + 1;
				Static101.anIntArray258[local53] = local17;
				local53 = local53 + 1 & 0xFFF;
				Static27.anIntArrayArray28[local88 + 1][local84] = 8;
				Static339.anIntArrayArray215[local88 + 1][local84] = local239;
			}
			if (local84 > 0 && Static27.anIntArrayArray28[local88][local84 - 1] == 0 && (local58[local94][local79 - 1] & 0x40A40000) == 0) {
				Static52.anIntArray112[local53] = local15;
				Static101.anIntArray258[local53] = local17 - 1;
				Static27.anIntArrayArray28[local88][local84 - 1] = 1;
				local53 = local53 + 1 & 0xFFF;
				Static339.anIntArrayArray215[local88][local84 - 1] = local239;
			}
			if (local84 < 127 && Static27.anIntArrayArray28[local88][local84 + 1] == 0 && (local58[local94][local79 + 1] & 0x48240000) == 0) {
				Static52.anIntArray112[local53] = local15;
				Static101.anIntArray258[local53] = local17 + 1;
				local53 = local53 + 1 & 0xFFF;
				Static27.anIntArrayArray28[local88][local84 + 1] = 4;
				Static339.anIntArrayArray215[local88][local84 + 1] = local239;
			}
			if (local88 > 0 && local84 > 0 && Static27.anIntArrayArray28[local88 - 1][local84 - 1] == 0 && (local58[local94 - 1][local79 - 1] & 0x43A40000) == 0 && (local58[local94 - 1][local79] & 0x42240000) == 0 && (local58[local94][local79 - 1] & 0x40A40000) == 0) {
				Static52.anIntArray112[local53] = local15 - 1;
				Static101.anIntArray258[local53] = local17 - 1;
				local53 = local53 + 1 & 0xFFF;
				Static27.anIntArrayArray28[local88 - 1][local84 - 1] = 3;
				Static339.anIntArrayArray215[local88 - 1][local84 - 1] = local239;
			}
			if (local88 < 127 && local84 > 0 && Static27.anIntArrayArray28[local88 + 1][local84 - 1] == 0 && (local58[local94 + 1][local79 - 1] & 0x60E40000) == 0 && (local58[local94 + 1][local79] & 0x60240000) == 0 && (local58[local94][local79 - 1] & 0x40A40000) == 0) {
				Static52.anIntArray112[local53] = local15 + 1;
				Static101.anIntArray258[local53] = local17 - 1;
				Static27.anIntArrayArray28[local88 + 1][local84 - 1] = 9;
				local53 = local53 + 1 & 0xFFF;
				Static339.anIntArrayArray215[local88 + 1][local84 - 1] = local239;
			}
			if (local88 > 0 && local84 < 127 && Static27.anIntArrayArray28[local88 - 1][local84 + 1] == 0 && (local58[local94 - 1][local79 + 1] & 0x4E240000) == 0 && (local58[local94 - 1][local79] & 0x42240000) == 0 && (local58[local94][local79 + 1] & 0x48240000) == 0) {
				Static52.anIntArray112[local53] = local15 - 1;
				Static101.anIntArray258[local53] = local17 + 1;
				local53 = local53 + 1 & 0xFFF;
				Static27.anIntArrayArray28[local88 - 1][local84 + 1] = 6;
				Static339.anIntArrayArray215[local88 - 1][local84 + 1] = local239;
			}
			if (local88 < 127 && local84 < 127 && Static27.anIntArrayArray28[local88 + 1][local84 + 1] == 0 && (local58[local94 + 1][local79 + 1] & 0x78240000) == 0 && (local58[local94 + 1][local79] & 0x60240000) == 0 && (local58[local94][local79 + 1] & 0x48240000) == 0) {
				Static52.anIntArray112[local53] = local15 + 1;
				Static101.anIntArray258[local53] = local17 + 1;
				local53 = local53 + 1 & 0xFFF;
				Static27.anIntArrayArray28[local88 + 1][local84 + 1] = 12;
				Static339.anIntArrayArray215[local88 + 1][local84 + 1] = local239;
			}
		}
		Static78.anInt1445 = local17;
		Static151.anInt2862 = local15;
		return false;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method4781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 + arg2 > arg7 && arg0 < arg7 + arg6) {
			return arg4 < arg5 + arg1 && arg1 < arg4 + arg3;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZ)V")
	public static void method4782(@OriginalArg(1) boolean arg0) {
		if (Static78.aBoolean96 != arg0) {
			Static78.aBoolean96 = arg0;
			Static124.method2460();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!nca", name = "m", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_103 = new Class185(26, -1);

	@OriginalMember(owner = "client!nca", name = "o", descriptor = "Lclient!sba;")
	public static Class302 aClass302_17 = null;

	@OriginalMember(owner = "client!nca", name = "t", descriptor = "[I")
	public static final int[] anIntArray496 = new int[5];

	@OriginalMember(owner = "client!nca", name = "v", descriptor = "[[I")
	public static final int[][] anIntArrayArray54 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIII)I")
	public static int method7651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 4095 - arg2;
		} else {
			return 4095 - arg0;
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BC)Ljava/lang/String;")
	public static String method7653(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(21) int local21 = local8;
		@Pc(25) int local25 = local11 - 1;
		if (local25 != 0) {
			@Pc(29) int local29 = 0;
			while (true) {
				local29 = arg0.indexOf(13, local29);
				if (local29 < 0) {
					break;
				}
				local29++;
				local21 += local25;
			}
		}
		@Pc(48) StringBuffer local48 = new StringBuffer(local21);
		@Pc(50) int local50 = 0;
		while (true) {
			@Pc(55) int local55 = arg0.indexOf(13, local50);
			if (local55 < 0) {
				local48.append(arg0.substring(local50));
				return local48.toString();
			}
			local48.append(arg0.substring(local50, local55));
			local50 = local55 + 1;
			local48.append(arg1);
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IZ)V")
	public static void method7654() {
		Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub3_1);
		Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub3_2);
		Static87.aClass6_Sub33_6.method4996(1, Static87.aClass6_Sub33_6.aClass14_Sub15_1);
		Static87.aClass6_Sub33_6.method4996(1, Static87.aClass6_Sub33_6.aClass14_Sub15_2);
		Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub11_1);
		Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub14_1);
		Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub25_1);
		Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub24_1);
		Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub13_1);
		Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub26_1);
		Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub7_1);
		Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub20_1);
		Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub10_1);
		Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub28_1);
		Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub23_1);
		Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub23_2);
		Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub6_1);
		Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub17_1);
		Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub5_1);
		Static19.method602();
		Static87.aClass6_Sub33_6.method4996(2, Static87.aClass6_Sub33_6.aClass14_Sub16_1);
		Static87.aClass6_Sub33_6.method4996(1, Static87.aClass6_Sub33_6.aClass14_Sub12_1);
		Static174.method3297();
		Static638.method8737();
		Static68.aBoolean183 = true;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIBI)V")
	public static void method7655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = Static477.anInt8412 + arg0;
		@Pc(13) int local13 = Static227.anInt5049 + arg2;
		if (Static26.aClass186ArrayArrayArray1 == null || arg0 < 0 || arg2 < 0 || Static306.anInt6176 <= arg0 || arg2 >= Static108.anInt2930 || Static87.aClass6_Sub33_6.aClass14_Sub3_2.method819() == 0 && arg1 != Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135) {
			return;
		}
		@Pc(62) long local62 = (long) (arg1 << 28 | local13 << 14 | local9);
		@Pc(68) Class6_Sub47 local68 = (Class6_Sub47) Static283.aClass380_37.method8747(local62);
		if (local68 == null) {
			Static495.method7179(arg1, arg0, arg2);
			return;
		}
		@Pc(87) Class6_Sub32 local87 = (Class6_Sub32) local68.aClass163_56.method4966();
		if (local87 == null) {
			Static495.method7179(arg1, arg0, arg2);
			return;
		}
		@Pc(101) Class9_Sub4_Sub4_Sub1 local101 = (Class9_Sub4_Sub4_Sub1) Static495.method7179(arg1, arg0, arg2);
		if (local101 == null) {
			local101 = new Class9_Sub4_Sub4_Sub1(arg0 << 9, Static148.aClass245Array1[arg1].method7583(arg2, arg0), arg2 << 9, arg1, arg1);
		} else {
			local101.anInt5316 = local101.anInt5320 = -1;
		}
		local101.anInt5312 = local87.anInt5947;
		local101.anInt5315 = local87.anInt5945;
		label56: while (true) {
			@Pc(144) Class6_Sub32 local144 = (Class6_Sub32) local68.aClass163_56.method4965();
			if (local144 == null) {
				break;
			}
			if (local101.anInt5315 != local144.anInt5945) {
				local101.anInt5324 = local144.anInt5947;
				local101.anInt5316 = local144.anInt5945;
				while (true) {
					@Pc(165) Class6_Sub32 local165 = (Class6_Sub32) local68.aClass163_56.method4965();
					if (local165 == null) {
						break label56;
					}
					if (local165.anInt5945 != local101.anInt5315 && local101.anInt5316 != local165.anInt5945) {
						local101.anInt5320 = local165.anInt5945;
						local101.anInt5308 = local165.anInt5947;
					}
				}
			}
		}
		@Pc(209) int local209 = Static150.method2982(arg1, (arg2 << 9) + 256, (arg0 << 9) + 256);
		local101.anInt5314 = 0;
		local101.aByte135 = (byte) arg1;
		local101.anInt10357 = arg2 << 9;
		local101.anInt10365 = local209;
		local101.anInt10360 = arg0 << 9;
		local101.aByte134 = (byte) arg1;
		if (Static3.method52(arg2, arg0)) {
			local101.aByte134++;
		}
		Static469.method6996(arg1, arg0, arg2, local209, local101);
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method7656(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + arg0.charAt(local12) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(IIII)V")
	public static void method7657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class186 local7 = Static26.aClass186ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class9_Sub4_Sub1 local13 = local7.aClass9_Sub4_Sub1_2;
		@Pc(16) Class9_Sub4_Sub1 local16 = local7.aClass9_Sub4_Sub1_1;
		if (local13 != null) {
			local13.aShort119 = (short) (local13.aShort119 * arg3 / (0x10 << Static606.anInt10280 - 7));
			local13.aShort118 = (short) (local13.aShort118 * arg3 / (0x10 << Static606.anInt10280 - 7));
		}
		if (local16 != null) {
			local16.aShort119 = (short) (local16.aShort119 * arg3 / (0x10 << Static606.anInt10280 - 7));
			local16.aShort118 = (short) (local16.aShort118 * arg3 / (0x10 << Static606.anInt10280 - 7));
		}
	}
}

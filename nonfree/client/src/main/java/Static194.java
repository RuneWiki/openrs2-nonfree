import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "Lclient!ct;")
	public static Class65 aClass65_4;

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray1;

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_33 = new Class144(78, 7);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
	public static int anInt3310 = 0;

	@OriginalMember(owner = "client!ga", name = "i", descriptor = "J")
	public static final long aLong127 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
	public static void method3001() {
		for (@Pc(6) Class3_Sub50 local6 = (Class3_Sub50) Static55.aClass313_7.method7103(); local6 != null; local6 = (Class3_Sub50) Static55.aClass313_7.method7110()) {
			Static56.method1314(local6.anInt8252);
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIILclient!ha;III)Lclient!ka;")
	public static Class170 method3002(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class22 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(20) long local20 = (long) arg4;
		@Pc(26) Class170 local26 = (Class170) Static164.aClass307_40.method7002(local20);
		if (local26 == null) {
			@Pc(36) Class145 local36 = Static716.method9500(arg4, Static299.aClass182_75);
			if (local36 == null) {
				return null;
			}
			if (local36.anInt3633 < 13) {
				local36.method3297(2);
			}
			local26 = arg2.method9382(local36, 2055, Static701.anInt10939, 64, 768);
			Static164.aClass307_40.method7000(local26, local20);
		}
		local26 = local26.method8369((byte) 6, 2055, true);
		if (arg1 != 0) {
			local26.a(arg1);
		}
		if (arg3 != 0) {
			local26.FA(arg3);
		}
		if (arg0 != 0) {
			local26.VA(arg0);
		}
		if (arg5 != 0) {
			local26.H(0, arg5, 0);
		}
		return local26;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
	public static void method3003() {
		@Pc(15) Class292 local15 = Static631.method8307();
		@Pc(21) Class3_Sub29 local21 = Static507.method6901(Static610.aClass144_72, local15.aClass88_2);
		local21.aClass3_Sub2_Sub1_1.method2065(0);
		local15.method6855(local21);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)I")
	public static int method3005(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIIIIIILclient!fe;)Z")
	public static boolean method3006(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class109 arg9) {
		@Pc(7) int local7 = arg8;
		@Pc(9) int local9 = arg6;
		@Pc(24) int local24 = arg8 - 64;
		Static716.anIntArrayArray69[64][64] = 99;
		@Pc(35) int local35 = arg6 - 64;
		Static296.anIntArrayArray20[64][64] = 0;
		@Pc(43) byte local43 = 0;
		Static386.anIntArray438[0] = arg8;
		@Pc(49) int local49 = 0;
		@Pc(52) int local52 = local43 + 1;
		Static267.anIntArray327[0] = arg6;
		@Pc(57) int[][] local57 = arg9.anIntArrayArray9;
		while (local49 != local52) {
			local9 = Static267.anIntArray327[local49];
			local7 = Static386.anIntArray438[local49];
			@Pc(73) int local73 = local7 - arg9.anInt2978;
			local49 = local49 + 1 & 0xFFF;
			@Pc(84) int local84 = local7 - local24;
			@Pc(89) int local89 = local9 - local35;
			@Pc(95) int local95 = local9 - arg9.anInt2989;
			if (arg3 == -4) {
				if (arg5 == local7 && arg7 == local9) {
					Static290.anInt4444 = local9;
					Static286.anInt4374 = local7;
					return true;
				}
			} else if (arg3 == -3) {
				if (Static374.method5105(arg0, arg2, local7, arg5, 1, local9, arg7, 1)) {
					Static290.anInt4444 = local9;
					Static286.anInt4374 = local7;
					return true;
				}
			} else if (arg3 == -2) {
				if (arg9.method2718(arg4, local9, arg0, arg2, arg5, 1, 1, arg7, local7)) {
					Static290.anInt4444 = local9;
					Static286.anInt4374 = local7;
					return true;
				}
			} else if (arg3 == -1) {
				if (arg9.method2720(arg0, local7, local9, arg4, arg5, arg7, arg2, 1)) {
					Static286.anInt4374 = local7;
					Static290.anInt4444 = local9;
					return true;
				}
			} else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
				if (arg9.method2729(local7, arg1, 1, arg3, arg5, arg7, local9)) {
					Static286.anInt4374 = local7;
					Static290.anInt4444 = local9;
					return true;
				}
			} else if (arg9.method2722(arg7, 1, arg1, arg5, local7, arg3, local9)) {
				Static290.anInt4444 = local9;
				Static286.anInt4374 = local7;
				return true;
			}
			@Pc(264) int local264 = Static296.anIntArrayArray20[local84][local89] + 1;
			if (local84 > 0 && Static716.anIntArrayArray69[local84 - 1][local89] == 0 && (local57[local73 - 1][local95] & 0x42240000) == 0) {
				Static386.anIntArray438[local52] = local7 - 1;
				Static267.anIntArray327[local52] = local9;
				Static716.anIntArrayArray69[local84 - 1][local89] = 2;
				local52 = local52 + 1 & 0xFFF;
				Static296.anIntArrayArray20[local84 - 1][local89] = local264;
			}
			if (local84 < 127 && Static716.anIntArrayArray69[local84 + 1][local89] == 0 && (local57[local73 + 1][local95] & 0x60240000) == 0) {
				Static386.anIntArray438[local52] = local7 + 1;
				Static267.anIntArray327[local52] = local9;
				Static716.anIntArrayArray69[local84 + 1][local89] = 8;
				local52 = local52 + 1 & 0xFFF;
				Static296.anIntArrayArray20[local84 + 1][local89] = local264;
			}
			if (local89 > 0 && Static716.anIntArrayArray69[local84][local89 - 1] == 0 && (local57[local73][local95 - 1] & 0x40A40000) == 0) {
				Static386.anIntArray438[local52] = local7;
				Static267.anIntArray327[local52] = local9 - 1;
				local52 = local52 + 1 & 0xFFF;
				Static716.anIntArrayArray69[local84][local89 - 1] = 1;
				Static296.anIntArrayArray20[local84][local89 - 1] = local264;
			}
			if (local89 < 127 && Static716.anIntArrayArray69[local84][local89 + 1] == 0 && (local57[local73][local95 + 1] & 0x48240000) == 0) {
				Static386.anIntArray438[local52] = local7;
				Static267.anIntArray327[local52] = local9 + 1;
				Static716.anIntArrayArray69[local84][local89 + 1] = 4;
				local52 = local52 + 1 & 0xFFF;
				Static296.anIntArrayArray20[local84][local89 + 1] = local264;
			}
			if (local84 > 0 && local89 > 0 && Static716.anIntArrayArray69[local84 - 1][local89 - 1] == 0 && (local57[local73 - 1][local95 - 1] & 0x43A40000) == 0 && (local57[local73 - 1][local95] & 0x42240000) == 0 && (local57[local73][local95 - 1] & 0x40A40000) == 0) {
				Static386.anIntArray438[local52] = local7 - 1;
				Static267.anIntArray327[local52] = local9 - 1;
				Static716.anIntArrayArray69[local84 - 1][local89 - 1] = 3;
				local52 = local52 + 1 & 0xFFF;
				Static296.anIntArrayArray20[local84 - 1][local89 - 1] = local264;
			}
			if (local84 < 127 && local89 > 0 && Static716.anIntArrayArray69[local84 + 1][local89 - 1] == 0 && (local57[local73 + 1][local95 - 1] & 0x60E40000) == 0 && (local57[local73 + 1][local95] & 0x60240000) == 0 && (local57[local73][local95 - 1] & 0x40A40000) == 0) {
				Static386.anIntArray438[local52] = local7 + 1;
				Static267.anIntArray327[local52] = local9 - 1;
				Static716.anIntArrayArray69[local84 + 1][local89 - 1] = 9;
				local52 = local52 + 1 & 0xFFF;
				Static296.anIntArrayArray20[local84 + 1][local89 - 1] = local264;
			}
			if (local84 > 0 && local89 < 127 && Static716.anIntArrayArray69[local84 - 1][local89 + 1] == 0 && (local57[local73 - 1][local95 + 1] & 0x4E240000) == 0 && (local57[local73 - 1][local95] & 0x42240000) == 0 && (local57[local73][local95 + 1] & 0x48240000) == 0) {
				Static386.anIntArray438[local52] = local7 - 1;
				Static267.anIntArray327[local52] = local9 + 1;
				local52 = local52 + 1 & 0xFFF;
				Static716.anIntArrayArray69[local84 - 1][local89 + 1] = 6;
				Static296.anIntArrayArray20[local84 - 1][local89 + 1] = local264;
			}
			if (local84 < 127 && local89 < 127 && Static716.anIntArrayArray69[local84 + 1][local89 + 1] == 0 && (local57[local73 + 1][local95 + 1] & 0x78240000) == 0 && (local57[local73 + 1][local95] & 0x60240000) == 0 && (local57[local73][local95 + 1] & 0x48240000) == 0) {
				Static386.anIntArray438[local52] = local7 + 1;
				Static267.anIntArray327[local52] = local9 + 1;
				local52 = local52 + 1 & 0xFFF;
				Static716.anIntArrayArray69[local84 + 1][local89 + 1] = 12;
				Static296.anIntArrayArray20[local84 + 1][local89 + 1] = local264;
			}
		}
		Static286.anInt4374 = local7;
		Static290.anInt4444 = local9;
		return false;
	}
}

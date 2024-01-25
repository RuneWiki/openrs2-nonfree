import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!gk", name = "r", descriptor = "Z")
	public static boolean aBoolean169 = false;

	@OriginalMember(owner = "client!gk", name = "B", descriptor = "[Z")
	public static final boolean[] aBooleanArray18 = new boolean[100];

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)I")
	public static int method2100() {
		@Pc(5) Class70 local5 = Static136.aClass70_47;
		synchronized (Static136.aClass70_47) {
			return Static136.aClass70_47.method1407();
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILclient!pe;B)V")
	public static void method2101(@OriginalArg(0) int arg0, @OriginalArg(1) Class44_Sub4_Sub4 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg1.anInt5084 > Static76.anInt2853) {
			Static214.method3837(arg1);
		} else if (Static76.anInt2853 > arg1.anInt5134) {
			Static129.method2527(arg1, false);
			local7 = Static289.anInt5439;
			local9 = Static87.anInt1612;
		} else {
			Static252.method4319(arg1);
		}
		if (arg1.anInt6340 < 128 || arg1.anInt6339 < 128 || arg1.anInt6340 >= Static153.anInt2883 * 128 - 128 || arg1.anInt6339 >= (Static246.anInt4606 - 1) * 128) {
			arg1.anInt5099 = -1;
			arg1.anInt5148 = -1;
			arg1.anInt5134 = 0;
			arg1.anInt5084 = 0;
			arg1.anInt6340 = arg1.anIntArray560[0] * 128 + arg1.method4714() * 64;
			arg1.anInt6339 = arg1.anIntArray561[0] * 128 + arg1.method4714() * 64;
			arg1.method4722();
		}
		if (arg1 == Static253.aClass44_Sub4_Sub4_Sub1_1 && (arg1.anInt6340 < 1536 || arg1.anInt6339 < 1536 || arg1.anInt6340 >= Static153.anInt2883 * 128 - 1536 || arg1.anInt6339 >= (Static246.anInt4606 - 12) * 128)) {
			arg1.anInt5099 = -1;
			arg1.anInt5148 = -1;
			arg1.anInt5084 = 0;
			arg1.anInt5134 = 0;
			arg1.anInt6340 = arg1.anIntArray560[0] * 128 + arg1.method4714() * 64;
			arg1.anInt6339 = arg1.anIntArray561[0] * 128 + arg1.method4714() * 64;
			arg1.method4722();
		}
		@Pc(197) int local197 = Static337.method5579(arg1);
		Static326.method5427(local9, local7, arg1, local197);
		Static40.method687(arg1);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZIIII)V")
	public static void method2102(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static252.anInt4702 == 0 || arg2 == 0 || Static284.anInt5378 >= 50 || arg3 == -1) {
			return;
		}
		Static194.anIntArray433[Static284.anInt5378] = arg3;
		Static194.anIntArray432[Static284.anInt5378] = arg2;
		Static263.anIntArray530[Static284.anInt5378] = arg1;
		Static65.aClass12Array1[Static284.anInt5378] = null;
		Static209.anIntArray449[Static284.anInt5378] = 0;
		Static125.anIntArray307[Static284.anInt5378] = arg0;
		Static284.anInt5378++;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZZILclient!oq;)V")
	public static void method2104(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class6_Sub30 arg2) {
		@Pc(8) int local8 = arg2.anInt4313;
		@Pc(12) int local12 = (int) arg2.aLong218;
		arg2.method5756();
		if (arg0) {
			Static223.method3943(local8);
		}
		Static285.method4909(local8);
		@Pc(29) Class132 local29 = Static249.method4316(local12);
		if (local29 != null) {
			Static298.method5108(local29);
		}
		Static30.method482();
		if (!arg1 && Static62.anInt1131 != -1) {
			Static296.method5396(Static62.anInt1131, 1);
		}
		@Pc(54) Class9 local54 = new Class9(Static197.aClass108_30);
		for (@Pc(59) Class6_Sub30 local59 = (Class6_Sub30) local54.method152(); local59 != null; local59 = (Class6_Sub30) local54.method151()) {
			if (!local59.method5757()) {
				local59 = (Class6_Sub30) local54.method152();
				if (local59 == null) {
					return;
				}
			}
			if (local59.anInt4314 == 3) {
				@Pc(83) int local83 = (int) local59.aLong218;
				if (local8 == local83 >>> 16) {
					method2104(true, arg1, local59);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(Z)V")
	public static void method2105() {
		Static24.anInt385 = -1;
		Static299.anInt5652 = -1;
		Static340.anInt657 = 0;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(BB)C")
	public static char method2106(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(42) char local42 = Static240.aCharArray6[local7 - 128];
			if (local42 == '\u0000') {
				local42 = '?';
			}
			local7 = local42;
		}
		return (char) local7;
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "(I)V")
	public static void method2107() {
		Static142.aClass6_Sub10_Sub1_3.method2887();
		@Pc(11) int local11 = Static142.aClass6_Sub10_Sub1_3.method2883(1);
		if (local11 == 0) {
			return;
		}
		@Pc(19) int local19 = Static142.aClass6_Sub10_Sub1_3.method2883(2);
		if (local19 == 0) {
			Static151.anIntArray352[Static15.anInt281++] = 2047;
			return;
		}
		@Pc(39) int local39;
		@Pc(49) int local49;
		if (local19 == 1) {
			local39 = Static142.aClass6_Sub10_Sub1_3.method2883(3);
			Static253.aClass44_Sub4_Sub4_Sub1_1.method4705(local39, 1);
			local49 = Static142.aClass6_Sub10_Sub1_3.method2883(1);
			if (local49 == 1) {
				Static151.anIntArray352[Static15.anInt281++] = 2047;
			}
		} else if (local19 == 2) {
			if (Static142.aClass6_Sub10_Sub1_3.method2883(1) == 1) {
				local39 = Static142.aClass6_Sub10_Sub1_3.method2883(3);
				Static253.aClass44_Sub4_Sub4_Sub1_1.method4705(local39, 2);
				local49 = Static142.aClass6_Sub10_Sub1_3.method2883(3);
				Static253.aClass44_Sub4_Sub4_Sub1_1.method4705(local49, 2);
			} else {
				local39 = Static142.aClass6_Sub10_Sub1_3.method2883(3);
				Static253.aClass44_Sub4_Sub4_Sub1_1.method4705(local39, 0);
			}
			local39 = Static142.aClass6_Sub10_Sub1_3.method2883(1);
			if (local39 == 1) {
				Static151.anIntArray352[Static15.anInt281++] = 2047;
			}
		} else if (local19 == 3) {
			Static343.anInt6225 = Static142.aClass6_Sub10_Sub1_3.method2883(2);
			local39 = Static142.aClass6_Sub10_Sub1_3.method2883(7);
			local49 = Static142.aClass6_Sub10_Sub1_3.method2883(1);
			if (local49 == 1) {
				Static151.anIntArray352[Static15.anInt281++] = 2047;
			}
			@Pc(159) int local159 = Static142.aClass6_Sub10_Sub1_3.method2883(1);
			@Pc(164) int local164 = Static142.aClass6_Sub10_Sub1_3.method2883(7);
			Static253.aClass44_Sub4_Sub4_Sub1_1.method4477(local164, local159 == 1, Static343.anInt6225, local39);
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "([Ljava/lang/String;[SI)V")
	public static void method2108(@OriginalArg(0) String[] arg0, @OriginalArg(1) short[] arg1) {
		Static328.method5460(arg0.length - 1, arg0, arg1, 0);
	}
}

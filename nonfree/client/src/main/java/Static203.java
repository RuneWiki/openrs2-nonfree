import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!ol", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString230 = "M";

	@OriginalMember(owner = "client!ol", name = "r", descriptor = "I")
	public static int anInt3907 = 3353893;

	@OriginalMember(owner = "client!ol", name = "t", descriptor = "I")
	public static int anInt3909 = 0;

	@OriginalMember(owner = "client!ol", name = "w", descriptor = "[I")
	public static int[] anIntArray419 = new int[128];

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!fg;IIIZILclient!nb;Lclient!ho;)V")
	public static void method3257(@OriginalArg(0) Class4_Sub3_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) Class4_Sub17 arg5, @OriginalArg(7) Class83 arg6) {
		@Pc(3) Class108 local3 = null;
		if (arg6.anInt2270 == 0) {
			if ((double) Static121.aFloat68 == 3.0D) {
				local3 = Static228.aClass108_7;
			}
			if ((double) Static121.aFloat68 == 4.0D) {
				local3 = Static142.aClass108_3;
			}
			if ((double) Static121.aFloat68 == 6.0D) {
				local3 = Static172.aClass108_5;
			}
			if ((double) Static121.aFloat68 >= 8.0D) {
				local3 = Static170.aClass108_4;
			}
		} else if (arg6.anInt2270 == 1) {
			if ((double) Static121.aFloat68 == 3.0D) {
				local3 = Static172.aClass108_5;
			}
			if ((double) Static121.aFloat68 == 4.0D) {
				local3 = Static170.aClass108_4;
			}
			if ((double) Static121.aFloat68 == 6.0D) {
				local3 = Static10.aClass108_1;
			}
			if ((double) Static121.aFloat68 >= 8.0D) {
				local3 = Static88.aClass108_2;
			}
		} else if (arg6.anInt2270 == 2) {
			if ((double) Static121.aFloat68 == 3.0D) {
				local3 = Static10.aClass108_1;
			}
			if ((double) Static121.aFloat68 == 4.0D) {
				local3 = Static88.aClass108_2;
			}
			if ((double) Static121.aFloat68 == 6.0D) {
				local3 = Static199.aClass108_6;
			}
			if ((double) Static121.aFloat68 >= 8.0D) {
				local3 = Static243.aClass108_8;
			}
		}
		if (local3 == null) {
			return;
		}
		@Pc(123) int local123 = arg6.anInt2286;
		if (arg0.aBoolean105 && arg6.anInt2287 != -1) {
			local123 = arg6.anInt2287;
		}
		@Pc(141) int local141 = Static32.aClass4_Sub3_Sub5_1.method2286(arg6.aString131, null, Static200.aStringArray24);
		@Pc(144) int local144 = arg0.anInt1764;
		if (arg4) {
			local144 -= local3.method2335() * local141 / 2;
		} else {
			local144 -= arg2 + (local141 - 1) * local3.method2339() + local3.method2335() / 2;
		}
		@Pc(181) int local181 = local144 - local3.method2335();
		local144 += local3.method2335() / 2;
		@Pc(190) int local190 = 0;
		@Pc(192) int local192;
		@Pc(221) int local221;
		for (local192 = 0; local192 < local141; local192++) {
			@Pc(199) String local199 = Static200.aStringArray24[local192];
			if (local141 - 1 > local192) {
				local199 = local199.substring(0, local199.length() - 4);
			}
			local221 = local3.method2333(local199);
			if (local190 < local221) {
				local190 = local221;
			}
		}
		arg5.anInt3456 = arg0.anInt1766 + arg1 - local190 / 2;
		arg5.anInt3466 = arg1 + arg0.anInt1766 + local190 / 2;
		arg5.anInt3464 = local181 + arg3;
		arg5.anInt3465 = arg3 + local181 + local3.method2339() * local141;
		@Pc(274) int local274 = local181 + 2;
		local192 = arg0.anInt1766 - local190 / 2 - 5;
		if (arg6.anInt2274 != 0) {
			Static270.method4250(local192, local274, local190 + 10, local181 - -(local141 * local3.method2339()) - local274 + 1, arg6.anInt2274, arg6.anInt2274 >>> 24);
		}
		if (arg6.anInt2280 != 0) {
			Static270.method4258(local192, local274, local190 + 10, -local274 + local3.method2339() * local141 + local181 + 1, arg6.anInt2280, arg6.anInt2280 >>> 24);
		}
		for (local221 = 0; local221 < local141; local221++) {
			@Pc(354) String local354 = Static200.aStringArray24[local221];
			if (local141 - 1 > local221) {
				local354 = local354.substring(0, local354.length() - 4);
			}
			@Pc(376) int local376 = local3.method2333(local354);
			if (local190 < local376) {
				local190 = local376;
			}
			local3.method2337(local354, arg0.anInt1766, local144, local123);
			local144 += local3.method2339();
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZLclient!rl;I)V")
	public static void method3259(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class4_Sub27 arg1) {
		@Pc(9) int local9 = (int) arg1.aLong217;
		@Pc(12) int local12 = arg1.anInt4621;
		arg1.method4854();
		if (arg0) {
			Static257.method4062(local12);
		}
		Static168.method2702(local12);
		@Pc(28) Class189 local28 = Static114.method1814(local9);
		if (local28 != null) {
			Static205.method3283(local28);
		}
		@Pc(35) int local35 = Static300.anInt5638;
		@Pc(42) int local42;
		for (local42 = 0; local42 < local35; local42++) {
			if (Static237.method3696(Static262.aShortArray100[local42])) {
				Static181.method2942(local42);
			}
		}
		if (Static300.anInt5638 == 1) {
			Static18.aBoolean17 = false;
			Static4.method66(Static234.anInt4441, Static122.anInt2394, Static201.anInt3890, Static181.anInt3455);
		} else {
			Static4.method66(Static234.anInt4441, Static122.anInt2394, Static201.anInt3890, Static181.anInt3455);
			local42 = Static211.aClass4_Sub3_Sub5_3.method2259(Static171.aString202);
			for (@Pc(77) int local77 = 0; local77 < Static300.anInt5638; local77++) {
				@Pc(86) int local86 = Static211.aClass4_Sub3_Sub5_3.method2259(Static190.method3005(local77));
				if (local86 > local42) {
					local42 = local86;
				}
			}
			Static122.anInt2394 = (Static300.aBoolean390 ? 26 : 22) + Static300.anInt5638 * 15;
			Static234.anInt4441 = local42 + 8;
		}
		if (Static107.anInt5399 != -1) {
			Static205.method3290(Static107.anInt5399, 1);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B[B)Lclient!jl;")
	public static Class4_Sub3_Sub13 method3260(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class4_Sub3_Sub13 local9 = new Class4_Sub3_Sub13();
		@Pc(14) Class4_Sub10 local14 = new Class4_Sub10(arg0);
		local14.anInt5713 = local14.aByteArray71.length - 2;
		@Pc(25) int local25 = local14.method4653();
		@Pc(35) int local35 = local14.aByteArray71.length - local25 - 12 - 2;
		local14.anInt5713 = local35;
		@Pc(42) int local42 = local14.method4632();
		local9.anInt2662 = local14.method4653();
		local9.anInt2660 = local14.method4653();
		local9.anInt2658 = local14.method4653();
		local9.anInt2657 = local14.method4653();
		@Pc(66) int local66 = local14.method4666();
		@Pc(77) int local77;
		@Pc(84) int local84;
		if (local66 > 0) {
			local9.aClass85Array1 = new Class85[local66];
			for (local77 = 0; local77 < local66; local77++) {
				local84 = local14.method4653();
				@Pc(91) Class85 local91 = new Class85(Static161.method2608(local84));
				local9.aClass85Array1[local77] = local91;
				while (local84-- > 0) {
					@Pc(103) int local103 = local14.method4632();
					@Pc(107) int local107 = local14.method4632();
					local91.method1841(new Class4_Sub32(local107), (long) local103);
				}
			}
		}
		local77 = 0;
		local14.anInt5713 = 0;
		local9.aString159 = local14.method4662();
		local9.aStringArray19 = new String[local42];
		local9.anIntArray234 = new int[local42];
		local9.anIntArray233 = new int[local42];
		while (local14.anInt5713 < local35) {
			local84 = local14.method4653();
			if (local84 == 3) {
				local9.aStringArray19[local77] = local14.method4630().intern();
			} else if (local84 >= 100 || local84 == 21 || local84 == 38 || local84 == 39) {
				local9.anIntArray233[local77] = local14.method4666();
			} else {
				local9.anIntArray233[local77] = local14.method4632();
			}
			local9.anIntArray234[local77++] = local84;
		}
		return local9;
	}
}

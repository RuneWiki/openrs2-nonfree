import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
	public static int anInt5704;

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "[[S")
	public static short[][] aShortArrayArray7;

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "[[B")
	public static byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
	public static int anInt5713;

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "Lclient!lg;")
	public static final Class119 aClass119_171 = new Class119(64);

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
	public static int anInt5706 = 0;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIII)V")
	public static void method5078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(12) int local12 = -arg3;
		@Pc(14) int local14 = -1;
		@Pc(22) int local22 = Static24.method734(Static96.anInt2180, arg3 + arg1, Static124.anInt4221);
		@Pc(31) int local31 = Static24.method734(Static96.anInt2180, arg1 - arg3, Static124.anInt4221);
		Static205.method3670(arg0, local22, Static146.anIntArrayArray91[arg2], local31);
		while (local7 < local9) {
			local14 += 2;
			local12 += local14;
			@Pc(59) int local59;
			@Pc(63) int local63;
			@Pc(77) int local77;
			@Pc(86) int local86;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local59 = arg2 - local9;
				local63 = local9 + arg2;
				if (Static228.anInt920 <= local63 && local59 <= Static307.anInt6214) {
					local77 = Static24.method734(Static96.anInt2180, arg1 + local7, Static124.anInt4221);
					local86 = Static24.method734(Static96.anInt2180, arg1 - local7, Static124.anInt4221);
					if (Static307.anInt6214 >= local63) {
						Static205.method3670(arg0, local77, Static146.anIntArrayArray91[local63], local86);
					}
					if (local59 >= Static228.anInt920) {
						Static205.method3670(arg0, local77, Static146.anIntArrayArray91[local59], local86);
					}
				}
			}
			local7++;
			local59 = arg2 - local7;
			local63 = local7 + arg2;
			if (local63 >= Static228.anInt920 && Static307.anInt6214 >= local59) {
				local77 = Static24.method734(Static96.anInt2180, arg1 + local9, Static124.anInt4221);
				local86 = Static24.method734(Static96.anInt2180, arg1 - local9, Static124.anInt4221);
				if (Static307.anInt6214 >= local63) {
					Static205.method3670(arg0, local77, Static146.anIntArrayArray91[local63], local86);
				}
				if (local59 >= Static228.anInt920) {
					Static205.method3670(arg0, local77, Static146.anIntArrayArray91[local59], local86);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
	public static void method5079() {
		Static157.method2973();
		Static214.aClass4_9 = null;
		Static318.aClass22_4 = null;
		Static122.aClass105ArrayArray3 = null;
		Static205.aClass22_2 = null;
		Static293.aClass22_3 = null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)Lclient!w;")
	public static Class208 method5080(@OriginalArg(1) int arg0) {
		@Pc(7) Class119 local7 = Static253.aClass119_210;
		@Pc(18) Class208 local18;
		synchronized (Static253.aClass119_210) {
			local18 = (Class208) Static253.aClass119_210.method3311((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(38) byte[] local38 = Static262.aClass191_171.method5459(Static239.method4131(arg0), Static77.method1764(arg0));
		local18 = new Class208();
		local18.anInt6801 = arg0;
		local18.aStringArray63 = new String[] { null, null, Static65.aClass93_22.method2819(Static287.anInt5816), null, null };
		local18.aStringArray64 = new String[] { null, null, null, null, Static317.aClass93_109.method2819(Static287.anInt5816) };
		if (local38 != null) {
			local18.method5855(new Class2_Sub10(local38));
		}
		local18.method5856();
		if (local18.anInt6757 != -1) {
			local18.method5864(method5080(local18.anInt6757), method5080(local18.anInt6805));
		}
		if (local18.anInt6785 != -1) {
			local18.method5857(method5080(local18.anInt6785), method5080(local18.anInt6790));
		}
		if (!Static29.aBoolean64 && local18.aBoolean594) {
			local18.aString63 = Static182.aClass93_71.method2819(Static287.anInt5816);
			local18.aStringArray63 = Static274.aStringArray50;
			local18.aBoolean595 = false;
			local18.aStringArray64 = Static187.aStringArray31;
			local18.anIntArray506 = null;
			local18.anInt6804 = 0;
			if (local18.aClass199_32 != null) {
				@Pc(173) boolean local173 = false;
				for (@Pc(178) Class2 local178 = local18.aClass199_32.method5747(); local178 != null; local178 = local18.aClass199_32.method5753()) {
					@Pc(186) Class2_Sub11_Sub21 local186 = Static2.method57((int) local178.aLong213);
					if (local186.aBoolean603) {
						local178.method5945();
					} else {
						local173 = true;
					}
				}
				if (!local173) {
					local18.aClass199_32 = null;
				}
			}
		}
		@Pc(210) Class119 local210 = Static253.aClass119_210;
		synchronized (Static253.aClass119_210) {
			Static253.aClass119_210.method3308(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BIIIZIIZ)V")
	public static void method5084(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		if (!arg6 && arg2 == Static278.anInt5657 && Static146.anInt3013 == arg5 && (Static69.anInt1511 == arg4 || Static257.method4680())) {
			return;
		}
		Static278.anInt5657 = arg2;
		Static146.anInt3013 = arg5;
		Static69.anInt1511 = arg4;
		if (Static257.method4680()) {
			Static69.anInt1511 = 0;
		}
		if (arg3) {
			Static125.method2616(28);
		} else {
			Static125.method2616(25);
		}
		Static224.method3945(true, Static111.aClass93_46.method2819(Static21.anInt455), Static193.aClass37_2);
		@Pc(59) int local59 = Static138.anInt2879;
		Static138.anInt2879 = (Static278.anInt5657 - (Static95.anInt6381 >> 4)) * 8;
		@Pc(75) int local75 = Static342.anInt6864;
		Static342.anInt6864 = (Static146.anInt3013 - (Static237.anInt4532 >> 4)) * 8;
		Static194.aClass2_Sub11_Sub6_3 = Static127.method1637(Static278.anInt5657 * 8, Static146.anInt3013 * 8);
		Static136.aClass142_3 = null;
		@Pc(99) int local99 = Static138.anInt2879 - local59;
		@Pc(104) int local104 = Static342.anInt6864 - local75;
		@Pc(108) int local108;
		@Pc(118) int local118;
		if (arg3) {
			Static169.anInt3463 = 0;
			local108 = Static95.anInt6381 * 128 - 128;
			@Pc(178) int local178 = (Static237.anInt4532 - 1) * 128;
			for (local118 = 0; local118 < 32768; local118++) {
				@Pc(186) Class62_Sub1_Sub2_Sub1 local186 = Static37.aClass62_Sub1_Sub2_Sub1Array1[local118];
				if (local186 != null) {
					local186.anInt5280 -= local104 * 128;
					local186.anInt5289 -= local99 * 128;
					if (local186.anInt5289 >= 0 && local186.anInt5289 <= local108 && local186.anInt5280 >= 0 && local186.anInt5280 <= local178) {
						@Pc(243) boolean local243 = true;
						for (@Pc(245) int local245 = 0; local245 < 10; local245++) {
							local186.anIntArray397[local245] -= local99;
							local186.anIntArray396[local245] -= local104;
							if (local186.anIntArray397[local245] < 0 || Static95.anInt6381 <= local186.anIntArray397[local245] || local186.anIntArray396[local245] < 0 || Static237.anInt4532 <= local186.anIntArray396[local245]) {
								local243 = false;
							}
						}
						if (local243) {
							Static98.anIntArray215[Static169.anInt3463++] = local118;
						} else {
							Static37.aClass62_Sub1_Sub2_Sub1Array1[local118].method4723(null);
							Static37.aClass62_Sub1_Sub2_Sub1Array1[local118] = null;
						}
					} else {
						Static37.aClass62_Sub1_Sub2_Sub1Array1[local118].method4723(null);
						Static37.aClass62_Sub1_Sub2_Sub1Array1[local118] = null;
					}
				}
			}
		} else {
			for (local108 = 0; local108 < 32768; local108++) {
				@Pc(114) Class62_Sub1_Sub2_Sub1 local114 = Static37.aClass62_Sub1_Sub2_Sub1Array1[local108];
				if (local114 != null) {
					for (local118 = 0; local118 < 10; local118++) {
						local114.anIntArray397[local118] -= local99;
						local114.anIntArray396[local118] -= local104;
					}
					local114.anInt5280 -= local104 * 128;
					local114.anInt5289 -= local99 * 128;
				}
			}
		}
		for (local108 = 0; local108 < 2048; local108++) {
			@Pc(341) Class62_Sub1_Sub2_Sub2 local341 = Static129.aClass62_Sub1_Sub2_Sub2Array1[local108];
			if (local341 != null) {
				for (local118 = 0; local118 < 10; local118++) {
					local341.anIntArray397[local118] -= local99;
					local341.anIntArray396[local118] -= local104;
				}
				local341.anInt5289 -= local99 * 128;
				local341.anInt5280 -= local104 * 128;
			}
		}
		Static182.anInt3603 = arg4;
		Static41.aClass62_Sub1_Sub2_Sub2_2.method4792(Static182.anInt3603, arg0, false, arg1);
		Static316.method5555(local99, local104);
		for (@Pc(405) Class2_Sub20 local405 = (Class2_Sub20) Static147.aClass216_8.method5992(); local405 != null; local405 = (Class2_Sub20) Static147.aClass216_8.method6000()) {
			local405.anInt2468 -= local104;
			local405.anInt2464 -= local99;
			if (local405.anInt2464 < 0 || local405.anInt2468 < 0 || local405.anInt2464 >= Static95.anInt6381 || Static237.anInt4532 <= local405.anInt2468) {
				local405.method5945();
			}
		}
		Static99.anInt2257 = 0;
		if (Static201.anInt3909 != 0) {
			Static116.anInt2576 -= local104;
			Static201.anInt3909 -= local99;
		}
		if (arg3) {
			Static88.anInt1903 -= local104;
			Static290.anInt5837 -= local104 * 128;
			Static311.anInt6287 -= local99;
			Static287.anInt5819 -= local99 * 128;
			Static149.anInt3053 -= local104;
			Static337.anInt6720 -= local99;
			if (Math.abs(local99) > Static95.anInt6381 || Math.abs(local104) > Static237.anInt4532) {
				Static349.method5959();
			}
		} else if (Static182.anInt3602 == 4) {
			Static97.anInt6858 -= local104 * 128;
			Static321.anInt6465 -= local99 * 128;
			Static24.anInt501 -= local99 * 128;
			Static347.anInt4215 -= local104 * 128;
		} else {
			Static182.anInt3602 = 1;
		}
		Static248.method4499();
		Static10.method373();
		Static347.aClass216_36.method5991();
		Static260.aClass216_40.method5991();
		Static31.aClass67_4.method2097();
		Static82.method2656();
	}
}

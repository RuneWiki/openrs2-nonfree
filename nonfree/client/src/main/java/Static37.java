import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!df", name = "r", descriptor = "I")
	public static int anInt3233;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "I")
	public static int anInt3222 = 0;

	@OriginalMember(owner = "client!df", name = "b", descriptor = "I")
	public static int anInt3223 = 0;

	@OriginalMember(owner = "client!df", name = "d", descriptor = "I")
	public static int anInt3225 = 0;

	@OriginalMember(owner = "client!df", name = "h", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1551 = Static193.method3027("glow2:");

	@OriginalMember(owner = "client!df", name = "e", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1549 = aClass70_1551;

	@OriginalMember(owner = "client!df", name = "f", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1550 = aClass70_1551;

	@OriginalMember(owner = "client!df", name = "l", descriptor = "Lclient!vc;")
	public static final Class94 aClass94_8 = new Class94(500);

	@OriginalMember(owner = "client!df", name = "m", descriptor = "I")
	public static int anInt3229 = -1;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	public static void method2336() {
		if (Static71.aClass70_670 == null) {
			return;
		}
		if (Static114.anInt2300 < 10) {
			if (!Static72.aClass52_Sub1_10.method1569(Static71.aClass70_670)) {
				Static114.anInt2300 = Static72.aClass52_Sub1_10.method1564(Static71.aClass70_670) / 10;
				return;
			}
			Static114.anInt2300 = 10;
		}
		if (Static114.anInt2300 == 10) {
			@Pc(44) Class3_Sub4 local44 = new Class3_Sub4(Static72.aClass52_Sub1_10.method1566(Static112.aClass70_1104, Static71.aClass70_670));
			@Pc(48) int local48 = local44.method1270();
			@Pc(52) int local52 = local44.method1270();
			@Pc(56) int local56 = local44.method1270();
			@Pc(60) int local60 = local44.method1270();
			@Pc(64) int local64 = local44.method1270();
			@Pc(68) int local68 = local44.method1270();
			@Pc(74) int local74 = Static132.anInt2576 >> 2 << 10;
			Static87.aDouble115 = 8.0D;
			Static178.aDouble94 = 8.0D;
			Static157.anInt3260 = local48 * 64;
			Static50.anInt1046 = (local60 - local52) * 64 + 64;
			Static102.anIntArray116 = new int[Static144.anInt2951 + 1];
			Static65.anInt1364 = (local56 + 1 - local48) * 64;
			@Pc(109) int local109 = Static183.anInt2960 >> 1;
			@Pc(120) int local120 = Static30.anInt695 + (Static144.aClass26_Sub2_Sub1_1.anInt2593 >> 7) - Static157.anInt3260;
			@Pc(124) int local124 = Static65.anInt1364 >> 6;
			Static115.anInt2318 = local52 * 64;
			@Pc(138) int local138 = (Static144.aClass26_Sub2_Sub1_1.anInt2611 >> 7) + Static55.anInt1184 - Static115.anInt2318;
			@Pc(147) int local147 = local138 + (int) (Math.random() * 10.0D) - 5;
			@Pc(151) int local151 = Static50.anInt1046 >> 6;
			Static98.aByteArrayArrayArray8 = new byte[local124][local151][];
			Static8.anIntArrayArrayArray1 = new int[local124][local151][];
			Static4.aByteArrayArrayArray1 = new byte[local124][local151][];
			@Pc(172) int local172 = local120 + (int) (Math.random() * 10.0D) - 5;
			if (local172 >= 0 && Static65.anInt1364 > local172 && local147 >= 0 && Static50.anInt1046 > local147) {
				Static156.anInt3196 = local172;
				Static1.anInt1794 = Static50.anInt1046 - local147;
			} else {
				Static156.anInt3196 = local64 * 64 - Static157.anInt3260;
				Static1.anInt1794 = Static115.anInt2318 + Static50.anInt1046 - local68 * 64;
			}
			Static36.aByteArrayArrayArray4 = new byte[local124][local151][];
			Static114.aByteArrayArrayArray10 = new byte[local124][local151][];
			Static123.anIntArrayArrayArray9 = new int[local124][local151][];
			Static43.aByteArrayArrayArray5 = new byte[local124][local151][];
			Static198.aByteArrayArrayArray17 = new byte[local124][local151][];
			for (@Pc(233) int local233 = 0; local233 < Static144.anInt2951; local233++) {
				@Pc(239) Class3_Sub3_Sub19 local239 = Static102.method1456(local233);
				if (local239 != null) {
					@Pc(244) int local244 = local239.anInt3081;
					if (local244 >= 0 && !Static177.anInterface1_7.method564(local244)) {
						local244 = -1;
					}
					@Pc(312) int local312;
					@Pc(269) int local269;
					@Pc(276) int local276;
					@Pc(305) int local305;
					if (local239.anInt3080 >= 0) {
						local269 = local239.anInt3080;
						local276 = local109 + (local269 & 0x7F);
						if (local276 < 0) {
							local276 = 0;
						} else if (local276 > 127) {
							local276 = 127;
						}
						local305 = (local269 & 0x380) + (local74 + local269 & 0xFC00) + local276;
						local312 = Static177.anIntArray299[Static114.method1646(local305, 96)];
					} else if (local244 >= 0) {
						local312 = Static177.anIntArray299[Static114.method1646(Static177.anInterface1_7.method561(local244), 96)];
					} else if (local239.anInt3084 == -1) {
						local312 = -1;
					} else {
						local269 = local239.anInt3084;
						local276 = (local269 & 0x7F) + local109;
						if (local276 < 0) {
							local276 = 0;
						} else if (local276 > 127) {
							local276 = 127;
						}
						local305 = (local74 + local269 & 0xFC00) - (-(local269 & 0x380) - local276);
						local312 = Static177.anIntArray299[Static114.method1646(local305, 96)];
					}
					Static102.anIntArray116[local233 + 1] = local312;
				}
			}
			Static114.anInt2300 = 20;
		} else if (Static114.anInt2300 == 20) {
			Static19.method314(Static72.aClass52_Sub1_10.method1566(Static133.aClass70_1247, Static71.aClass70_670));
			Static114.anInt2300 = 30;
			Static57.method906();
		} else if (Static114.anInt2300 == 30) {
			Static146.method2125(Static72.aClass52_Sub1_10.method1566(Static176.aClass70_1729, Static71.aClass70_670));
			Static114.anInt2300 = 50;
			Static57.method906();
		} else if (Static114.anInt2300 == 50) {
			Static59.method1598(Static72.aClass52_Sub1_10.method1566(Static93.aClass70_961, Static71.aClass70_670));
			Static114.anInt2300 = 70;
			Static57.method906();
		} else if (Static114.anInt2300 == 70) {
			Static83.method1201(Static72.aClass52_Sub1_10.method1566(Static90.aClass70_919, Static71.aClass70_670));
			Static114.anInt2300 = 90;
			Static57.method906();
		} else {
			Static30.method546(Static72.aClass52_Sub1_10.method1566(Static75.aClass70_707, Static71.aClass70_670));
			if (Static114.anInt2300 == 90) {
				Static134.aClass3_Sub3_Sub2_Sub3_8 = new Class3_Sub3_Sub2_Sub3(11, true, Static211.aCanvas1);
				Static106.aClass3_Sub3_Sub2_Sub3_3 = new Class3_Sub3_Sub2_Sub3(12, true, Static211.aCanvas1);
				Static109.aClass3_Sub3_Sub2_Sub3_5 = new Class3_Sub3_Sub2_Sub3(14, true, Static211.aCanvas1);
				Static118.aClass3_Sub3_Sub2_Sub3_7 = new Class3_Sub3_Sub2_Sub3(17, true, Static211.aCanvas1);
				Static64.aClass3_Sub3_Sub2_Sub3_2 = new Class3_Sub3_Sub2_Sub3(19, true, Static211.aCanvas1);
				Static108.aClass3_Sub3_Sub2_Sub3_6 = new Class3_Sub3_Sub2_Sub3(22, true, Static211.aCanvas1);
				Static172.aClass3_Sub3_Sub2_Sub3_9 = new Class3_Sub3_Sub2_Sub3(26, true, Static211.aCanvas1);
				Static34.aClass3_Sub3_Sub2_Sub3_1 = new Class3_Sub3_Sub2_Sub3(30, true, Static211.aCanvas1);
				Static114.anInt2300 = 100;
			}
			Static136.anInt2777 = -1;
			Static54.anInt1162 = -1;
			Static114.anInt2300 = 100;
			Static57.method906();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIII[Lclient!pd;[B)V")
	public static void method2339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class77[] arg4, @OriginalArg(6) byte[] arg5) {
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 64; local11++) {
				for (local15 = 0; local15 < 64; local15++) {
					if (arg3 + local11 > 0 && local11 + arg3 < 103 && local15 + arg0 > 0 && local15 + arg0 < 103) {
						arg4[local7].anIntArrayArray23[local11 + arg3][arg0 + local15] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(92) Class3_Sub4 local92 = new Class3_Sub4(arg5);
		for (local15 = 0; local15 < 4; local15++) {
			for (@Pc(98) int local98 = 0; local98 < 64; local98++) {
				for (@Pc(102) int local102 = 0; local102 < 64; local102++) {
					Static196.method3063(local98 + arg3, local15, 0, arg2, local92, arg1, local102 + arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ZI)I")
	public static int method2343(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BI)Lclient!ui;")
	public static Class3_Sub3_Sub24 method2344(@OriginalArg(1) int arg0) {
		@Pc(17) Class3_Sub3_Sub24 local17 = (Class3_Sub3_Sub24) Static185.aClass85_35.method2558((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(31) byte[] local31 = Static123.aClass52_29.method1581(Static91.method1318(arg0), Static14.method277(arg0));
		local17 = new Class3_Sub3_Sub24();
		local17.anInt3976 = arg0;
		if (local31 != null) {
			local17.method3061(new Class3_Sub4(local31));
		}
		local17.method3055();
		Static185.aClass85_35.method2560(local17, (long) arg0);
		return local17;
	}
}

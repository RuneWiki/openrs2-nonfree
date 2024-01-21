import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!he", name = "g", descriptor = "[Lclient!sc;")
	public static Class1_Sub2_Sub2_Sub4[] aClass1_Sub2_Sub2_Sub4Array4;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "Lclient!tg;")
	public static Class81 aClass81_558 = Static120.method2057("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!he", name = "c", descriptor = "Z")
	public static boolean aBoolean65 = false;

	@OriginalMember(owner = "client!he", name = "e", descriptor = "Lclient!tg;")
	private static Class81 aClass81_559 = Static120.method2057("Loading interfaces )2 ");

	@OriginalMember(owner = "client!he", name = "h", descriptor = "I")
	public static volatile int anInt1665 = 0;

	@OriginalMember(owner = "client!he", name = "i", descriptor = "Z")
	public static boolean aBoolean66 = false;

	@OriginalMember(owner = "client!he", name = "k", descriptor = "I")
	public static final int anInt1667 = 2301979;

	@OriginalMember(owner = "client!he", name = "l", descriptor = "Lclient!tg;")
	public static Class81 aClass81_560 = aClass81_559;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method1201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class1_Sub17 local7 = Static167.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass22_1 != null && local7.aClass22_1.aLong37 == arg3) {
			return true;
		} else if (local7.aClass62_1 != null && local7.aClass62_1.aLong94 == arg3) {
			return true;
		} else if (local7.aClass42_1 != null && local7.aClass42_1.aLong66 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt1851; local46++) {
				if (local7.aClass75Array2[local46].aLong118 == arg3) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(III)V")
	public static void method1202(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static121.anInt2708 != 0 && arg1 != -1) {
			Static173.method3042(arg1, Static14.aClass82_Sub1_3, Static121.anInt2708);
			Static141.aBoolean23 = true;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II[BI)Z")
	public static boolean method1203(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class1_Sub8 local12 = new Class1_Sub8(arg1);
		@Pc(18) int local18 = -1;
		label70: while (true) {
			@Pc(22) int local22 = local12.method313();
			if (local22 == 0) {
				return local7;
			}
			local18 += local22;
			@Pc(30) boolean local30 = false;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(61) int local61;
				@Pc(93) Class1_Sub2_Sub8 local93;
				do {
					@Pc(69) int local69;
					@Pc(74) int local74;
					do {
						do {
							do {
								do {
									@Pc(38) int local38;
									while (local30) {
										local38 = local12.method330();
										if (local38 == 0) {
											continue label70;
										}
										local12.method336();
									}
									local38 = local12.method330();
									if (local38 == 0) {
										continue label70;
									}
									local32 += local38 - 1;
									@Pc(55) int local55 = local32 >> 6 & 0x3F;
									local61 = local12.method336() >> 2;
									@Pc(65) int local65 = local32 & 0x3F;
									local69 = arg2 + local55;
									local74 = local65 + arg0;
								} while (local69 <= 0);
							} while (local74 <= 0);
						} while (local69 >= 103);
					} while (local74 >= 103);
					local93 = Static14.method220(local18);
				} while (local61 == 22 && Static50.aBoolean45 && local93.anInt1256 == 0 && local93.anInt1261 != 1 && !local93.aBoolean52);
				if (!local93.method929()) {
					local7 = false;
					Static108.anInt2415++;
				}
				local30 = true;
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
	public static void method1204() {
		aClass1_Sub2_Sub2_Sub4Array4 = null;
		aClass81_558 = null;
		aClass81_559 = null;
		aClass81_560 = null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
	public static void method1205() {
		if (!Static100.aBoolean92) {
			return;
		}
		Static166.aClass1_Sub2_Sub2_Sub4Array11 = null;
		Static184.aClass1_Sub2_Sub2_Sub3_11 = null;
		Static71.anIntArray150 = null;
		Static15.aClass1_Sub2_Sub2_Sub3_1 = null;
		Static125.aClass1_Sub2_Sub2_Sub4_4 = null;
		Static59.aClass1_Sub2_Sub2_Sub3_3 = null;
		Static140.anIntArray329 = null;
		Static162.aClass1_Sub2_Sub2_Sub4Array10 = null;
		Static118.aClass1_Sub2_Sub2_Sub4_3 = null;
		Static116.anIntArray277 = null;
		Static140.aClass1_Sub2_Sub2_Sub3_9 = null;
		Static40.aClass1_Sub2_Sub2_Sub4_2 = null;
		Static9.aClass1_Sub2_Sub2_Sub4_1 = null;
		Static150.anIntArray358 = null;
		Static37.anIntArray78 = null;
		Static6.anIntArray7 = null;
		aClass1_Sub2_Sub2_Sub4Array4 = null;
		Static74.aClass1_Sub2_Sub2_Sub3Array5 = null;
		Static32.aClass1_Sub2_Sub2_Sub4Array9 = null;
		Static5.aClass1_Sub2_Sub2_Sub4Array1 = null;
		Static30.anIntArray61 = null;
		Static165.anIntArray392 = null;
		Static107.method1775();
		Static147.method2503(true);
		Static100.aBoolean92 = false;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I[B)V")
	public static void method1206(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class1_Sub8 local10 = new Class1_Sub8(arg0);
		local10.anInt446 = arg0.length - 2;
		Static43.anInt1081 = local10.method359();
		Static73.anIntArray155 = new int[Static43.anInt1081];
		Static161.anIntArray386 = new int[Static43.anInt1081];
		Static155.anIntArray369 = new int[Static43.anInt1081];
		Static25.anIntArray37 = new int[Static43.anInt1081];
		Static178.aByteArrayArray10 = new byte[Static43.anInt1081][];
		local10.anInt446 = arg0.length - Static43.anInt1081 * 8 - 7;
		Static97.anInt2130 = local10.method359();
		Static23.anInt582 = local10.method359();
		@Pc(62) int local62 = (local10.method336() & 0xFF) + 1;
		for (@Pc(64) int local64 = 0; local64 < Static43.anInt1081; local64++) {
			Static155.anIntArray369[local64] = local10.method359();
		}
		for (@Pc(78) int local78 = 0; local78 < Static43.anInt1081; local78++) {
			Static25.anIntArray37[local78] = local10.method359();
		}
		for (@Pc(96) int local96 = 0; local96 < Static43.anInt1081; local96++) {
			Static73.anIntArray155[local96] = local10.method359();
		}
		for (@Pc(114) int local114 = 0; local114 < Static43.anInt1081; local114++) {
			Static161.anIntArray386[local114] = local10.method359();
		}
		local10.anInt446 = arg0.length - Static43.anInt1081 * 8 - (local62 + -1) * 3 - 7;
		Static73.anIntArray156 = new int[local62];
		for (@Pc(152) int local152 = 1; local152 < local62; local152++) {
			Static73.anIntArray156[local152] = local10.method316();
			if (Static73.anIntArray156[local152] == 0) {
				Static73.anIntArray156[local152] = 1;
			}
		}
		local10.anInt446 = 0;
		for (@Pc(177) int local177 = 0; local177 < Static43.anInt1081; local177++) {
			@Pc(183) int local183 = Static73.anIntArray155[local177];
			@Pc(187) int local187 = Static161.anIntArray386[local177];
			@Pc(191) int local191 = local187 * local183;
			@Pc(194) byte[] local194 = new byte[local191];
			Static178.aByteArrayArray10[local177] = local194;
			@Pc(202) int local202 = local10.method336();
			@Pc(209) int local209;
			if (local202 == 0) {
				for (local209 = 0; local209 < local191; local209++) {
					local194[local209] = local10.method339();
				}
			} else if (local202 == 1) {
				for (local209 = 0; local209 < local183; local209++) {
					for (@Pc(213) int local213 = 0; local213 < local187; local213++) {
						local194[local209 + local213 * local183] = local10.method339();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BI)Lclient!fg;")
	public static Class1_Sub2_Sub7 method1207(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub7 local10 = (Class1_Sub2_Sub7) Static131.aClass59_21.method1970((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static21.aClass82_9.method2942(arg0, 13);
		local10 = new Class1_Sub2_Sub7();
		local10.anInt1218 = arg0;
		if (local20 != null) {
			local10.method916(new Class1_Sub8(local20));
		}
		Static131.aClass59_21.method1973(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIII)V")
	public static void method1208(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static11.anInt651; local7++) {
			if (Static50.anIntArray98[local7] + Static175.anIntArray307[local7] > arg3 && Static175.anIntArray307[local7] < arg2 + arg3 && Static171.anIntArray418[local7] + Static118.anIntArray280[local7] > arg1 && Static171.anIntArray418[local7] < arg1 + arg0) {
				Static87.aBooleanArray11[local7] = true;
			}
		}
	}
}

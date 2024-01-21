import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!vi", name = "f", descriptor = "Lclient!jh;")
	public static Class1_Sub2_Sub5_Sub4_Sub1 aClass1_Sub2_Sub5_Sub4_Sub1_5;

	@OriginalMember(owner = "client!vi", name = "m", descriptor = "Lclient!hh;")
	public static Class1_Sub2_Sub5_Sub3 aClass1_Sub2_Sub5_Sub3_9;

	@OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
	public static int anInt4299;

	@OriginalMember(owner = "client!vi", name = "l", descriptor = "Lclient!wh;")
	public static Class99 aClass99_14 = new Class99(8);

	@OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
	public static int anInt4298 = 0;

	@OriginalMember(owner = "client!vi", name = "p", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2557 = Static118.method2249(")1");

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
	public static void method3234() {
		Static1.aClass1_Sub14_Sub1_43.method1759();
		@Pc(11) int local11 = Static1.aClass1_Sub14_Sub1_43.method1756(8);
		if (Static22.anInt659 > local11) {
			for (@Pc(20) int local20 = local11; local20 < Static22.anInt659; local20++) {
				Static142.anIntArray392[Static20.anInt624++] = Static72.anIntArray197[local20];
			}
		}
		if (local11 > Static22.anInt659) {
			throw new RuntimeException("gnpov1");
		}
		Static22.anInt659 = 0;
		for (@Pc(59) int local59 = 0; local59 < local11; local59++) {
			@Pc(64) int local64 = Static72.anIntArray197[local59];
			@Pc(68) Class6_Sub4_Sub2 local68 = Static106.aClass6_Sub4_Sub2Array1[local64];
			@Pc(73) int local73 = Static1.aClass1_Sub14_Sub1_43.method1756(1);
			if (local73 == 0) {
				Static72.anIntArray197[Static22.anInt659++] = local64;
				local68.anInt3975 = Static174.anInt3887;
			} else {
				@Pc(95) int local95 = Static1.aClass1_Sub14_Sub1_43.method1756(2);
				if (local95 == 0) {
					Static72.anIntArray197[Static22.anInt659++] = local64;
					local68.anInt3975 = Static174.anInt3887;
					Static191.anIntArray474[Static95.anInt2376++] = local64;
				} else {
					@Pc(141) int local141;
					@Pc(151) int local151;
					if (local95 == 1) {
						Static72.anIntArray197[Static22.anInt659++] = local64;
						local68.anInt3975 = Static174.anInt3887;
						local141 = Static1.aClass1_Sub14_Sub1_43.method1756(3);
						local68.method2994(false, local141);
						local151 = Static1.aClass1_Sub14_Sub1_43.method1756(1);
						if (local151 == 1) {
							Static191.anIntArray474[Static95.anInt2376++] = local64;
						}
					} else if (local95 == 2) {
						Static72.anIntArray197[Static22.anInt659++] = local64;
						local68.anInt3975 = Static174.anInt3887;
						local141 = Static1.aClass1_Sub14_Sub1_43.method1756(3);
						local68.method2994(true, local141);
						local151 = Static1.aClass1_Sub14_Sub1_43.method1756(3);
						local68.method2994(true, local151);
						@Pc(202) int local202 = Static1.aClass1_Sub14_Sub1_43.method1756(1);
						if (local202 == 1) {
							Static191.anIntArray474[Static95.anInt2376++] = local64;
						}
					} else if (local95 == 3) {
						Static142.anIntArray392[Static20.anInt624++] = local64;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!sd;II)Lclient!cg;")
	public static Class1_Sub2_Sub5_Sub1 method3235(@OriginalArg(0) Class60 arg0, @OriginalArg(2) int arg1) {
		return Static68.method987(arg1, arg0) ? Static127.method2412() : null;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V")
	public static void method3236() {
		if (Static119.aDouble9 > Static164.aDouble11) {
			Static164.aDouble11 += Static164.aDouble11 / 30.0D;
			if (Static164.aDouble11 > Static119.aDouble9) {
				Static164.aDouble11 = Static119.aDouble9;
			}
			Static210.method3315();
		} else if (Static119.aDouble9 < Static164.aDouble11) {
			Static164.aDouble11 -= Static164.aDouble11 / 30.0D;
			if (Static119.aDouble9 > Static164.aDouble11) {
				Static164.aDouble11 = Static119.aDouble9;
			}
			Static210.method3315();
		}
		if (Static119.anInt2954 == -1 || Static90.anInt4438 == -1) {
			return;
		}
		@Pc(52) int local52 = Static119.anInt2954 - Static94.anInt2345;
		if (local52 < 2 || local52 > 2) {
			local52 >>= 0x4;
		}
		@Pc(67) int local67 = Static90.anInt4438 - Static23.anInt692;
		if (local67 < 2 || local67 > 2) {
			local67 >>= 0x4;
		}
		if (local52 == 0 && local67 == 0) {
			Static90.anInt4438 = -1;
			Static119.anInt2954 = -1;
		}
		Static23.anInt692 += local67;
		Static94.anInt2345 += local52;
		Static210.method3315();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)Lclient!aa;")
	public static Class1_Sub2_Sub1 method3237(@OriginalArg(1) int arg0) {
		@Pc(14) Class1_Sub2_Sub1 local14 = (Class1_Sub2_Sub1) Static105.aClass87_47.method3062((long) arg0);
		if (local14 != null) {
			return local14;
		}
		@Pc(28) byte[] local28 = Static33.aClass60_6.method2340(arg0, 3);
		local14 = new Class1_Sub2_Sub1();
		if (local28 != null) {
			local14.method53(new Class1_Sub14(local28));
		}
		Static105.aClass87_47.method3068(local14, (long) arg0);
		return local14;
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(Z)V")
	public static void method3239() {
		Static71.aByteArrayArrayArray40 = null;
		Static204.anIntArrayArrayArray9 = null;
		Static93.anIntArray267 = null;
		Static82.aByteArrayArrayArray51 = null;
		Static88.anIntArray243 = null;
		Static173.aByteArrayArrayArray104 = null;
		Static162.aByteArrayArrayArray98 = null;
		Static122.anIntArray398 = null;
		Static70.aByteArrayArrayArray38 = null;
		Static196.anIntArray486 = null;
		Static154.anIntArray423 = null;
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)I")
	public static int method3240(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(28) int local28 = (arg0 * local19 >> 12) + 40960;
		return local28 * local13 >> 12;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
	public static void method3241() {
		if (Static124.aClass65_1741 == null) {
			return;
		}
		if (Static108.anInt2648 < 10) {
			if (!Static54.aClass60_Sub1_137.method2327(Static124.aClass65_1741)) {
				Static108.anInt2648 = Static54.aClass60_Sub1_137.method2323(Static124.aClass65_1741) / 10;
				return;
			}
			Static108.anInt2648 = 10;
		}
		if (Static108.anInt2648 == 10) {
			@Pc(42) Class1_Sub14 local42 = new Class1_Sub14(Static54.aClass60_Sub1_137.method2325(Static199.aClass65_2553, Static124.aClass65_1741));
			@Pc(46) int local46 = local42.method1753();
			@Pc(50) int local50 = local42.method1753();
			@Pc(54) int local54 = local42.method1753();
			@Pc(58) int local58 = local42.method1753();
			@Pc(62) int local62 = local42.method1753();
			@Pc(66) int local66 = local42.method1753();
			Static33.anInt974 = local50 * 64;
			Static164.aDouble11 = 8.0D;
			Static119.aDouble9 = 8.0D;
			Static25.anInt737 = (local58 - local50) * 64 + 64;
			Static190.anInt4160 = (local54 + 1 - local46) * 64;
			Static18.anIntArray48 = new int[Static181.anInt4056 + 1];
			Static57.anInt1532 = local46 * 64;
			@Pc(110) int local110 = (Static201.aClass6_Sub4_Sub1_3.anInt3976 >> 7) + Static58.anInt1543 - Static33.anInt974;
			@Pc(119) int local119 = local110 + (int) (Math.random() * 10.0D) - 5;
			@Pc(123) int local123 = Static190.anInt4160 >> 6;
			@Pc(129) int local129 = Static196.anInt4242 >> 2 << 10;
			@Pc(138) int local138 = (Static201.aClass6_Sub4_Sub1_3.anInt3934 >> 7) + (Static205.anInt4337 - Static57.anInt1532);
			@Pc(142) int local142 = Static25.anInt737 >> 6;
			Static139.aByteArrayArrayArray89 = new byte[local123][local142][];
			Static154.anIntArrayArrayArray6 = new int[local123][local142][];
			Static131.aByteArrayArrayArray84 = new byte[local123][local142][];
			Static145.aByteArrayArrayArray90 = new byte[local123][local142][];
			Static159.aByteArrayArrayArray96 = new byte[local123][local142][];
			Static90.aByteArrayArrayArray117 = new byte[local123][local142][];
			Static40.anIntArrayArrayArray1 = new int[local123][local142][];
			Static91.aByteArrayArrayArray55 = new byte[local123][local142][];
			@Pc(183) int local183 = local138 + (int) (Math.random() * 10.0D) - 5;
			if (local183 >= 0 && Static190.anInt4160 > local183 && local119 >= 0 && Static25.anInt737 > local119) {
				Static94.anInt2345 = local183;
				Static23.anInt692 = Static25.anInt737 - local119;
			} else {
				Static23.anInt692 = Static33.anInt974 + Static25.anInt737 - local66 * 64;
				Static94.anInt2345 = local62 * 64 - Static57.anInt1532;
			}
			@Pc(229) int local229 = Static156.anInt3580 >> 1;
			for (@Pc(231) int local231 = 0; local231 < Static181.anInt4056; local231++) {
				@Pc(237) Class1_Sub2_Sub12 local237 = Static45.method757(local231);
				if (local237 != null) {
					@Pc(242) int local242 = local237.anInt1713;
					if (local242 >= 0 && !Static56.anInterface2_1.method1090(local242)) {
						local242 = -1;
					}
					@Pc(298) int local298;
					@Pc(260) int local260;
					@Pc(266) int local266;
					@Pc(291) int local291;
					if (local237.anInt1708 >= 0) {
						local260 = local237.anInt1708;
						local266 = local229 + (local260 & 0x7F);
						if (local266 < 0) {
							local266 = 0;
						} else if (local266 > 127) {
							local266 = 127;
						}
						local291 = (local129 + local260 & 0xFC00) - (-(local260 & 0x380) - local266);
						local298 = Static56.anIntArray141[Static139.method2606(local291, 96)];
					} else if (local242 >= 0) {
						local298 = Static56.anIntArray141[Static139.method2606(Static56.anInterface2_1.method1092(local242), 96)];
					} else if (local237.anInt1714 == -1) {
						local298 = -1;
					} else {
						local260 = local237.anInt1714;
						local266 = (local260 & 0x7F) + local229;
						if (local266 < 0) {
							local266 = 0;
						} else if (local266 > 127) {
							local266 = 127;
						}
						local291 = (local260 + local129 & 0xFC00) + (local260 & 0x380) + local266;
						local298 = Static56.anIntArray141[Static139.method2606(local291, 96)];
					}
					Static18.anIntArray48[local231 + 1] = local298;
				}
			}
			Static108.anInt2648 = 20;
		} else if (Static108.anInt2648 == 20) {
			Static60.method1057(Static54.aClass60_Sub1_137.method2325(Static133.aClass65_1842, Static124.aClass65_1741));
			Static108.anInt2648 = 30;
			Static5.method67();
		} else if (Static108.anInt2648 == 30) {
			Static96.method1822(Static54.aClass60_Sub1_137.method2325(Static162.aClass65_2175, Static124.aClass65_1741));
			Static108.anInt2648 = 50;
			Static5.method67();
		} else if (Static108.anInt2648 == 50) {
			Static197.method3217(Static54.aClass60_Sub1_137.method2325(Static172.aClass65_2277, Static124.aClass65_1741));
			Static108.anInt2648 = 70;
			Static5.method67();
		} else if (Static108.anInt2648 == 70) {
			Static41.method713(Static54.aClass60_Sub1_137.method2325(Static82.aClass65_1219, Static124.aClass65_1741));
			Static108.anInt2648 = 90;
			Static5.method67();
		} else {
			Static174.method2963(Static54.aClass60_Sub1_137.method2325(Static168.aClass65_1731, Static124.aClass65_1741));
			if (Static108.anInt2648 == 90) {
				Static77.aClass1_Sub2_Sub5_Sub5_6 = new Class1_Sub2_Sub5_Sub5(11, true, Static36.aCanvas1);
				Static204.aClass1_Sub2_Sub5_Sub5_9 = new Class1_Sub2_Sub5_Sub5(12, true, Static36.aCanvas1);
				Static105.aClass1_Sub2_Sub5_Sub5_7 = new Class1_Sub2_Sub5_Sub5(14, true, Static36.aCanvas1);
				Static39.aClass1_Sub2_Sub5_Sub5_2 = new Class1_Sub2_Sub5_Sub5(17, true, Static36.aCanvas1);
				Static50.aClass1_Sub2_Sub5_Sub5_4 = new Class1_Sub2_Sub5_Sub5(19, true, Static36.aCanvas1);
				Static133.aClass1_Sub2_Sub5_Sub5_8 = new Class1_Sub2_Sub5_Sub5(22, true, Static36.aCanvas1);
				Static60.aClass1_Sub2_Sub5_Sub5_5 = new Class1_Sub2_Sub5_Sub5(26, true, Static36.aCanvas1);
				Static20.aClass1_Sub2_Sub5_Sub5_1 = new Class1_Sub2_Sub5_Sub5(30, true, Static36.aCanvas1);
				Static108.anInt2648 = 100;
			}
			Static119.anInt2954 = -1;
			Static90.anInt4438 = -1;
			Static108.anInt2648 = 100;
			Static5.method67();
			System.gc();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
	public static int anInt2611;

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "[I")
	public static int[] anIntArray275;

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "[I")
	public static int[] anIntArray277;

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "[Lclient!tg;")
	public static Class81[] aClass81Array13;

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "Lclient!nd;")
	public static Class59 aClass59_20 = new Class59(30);

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
	public static volatile int anInt2613 = 0;

	@OriginalMember(owner = "client!nh", name = "i", descriptor = "[I")
	public static int[] anIntArray276 = new int[50];

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "Lclient!tg;")
	private static Class81 aClass81_953 = Static120.method2057(" is already on your ignore list)3");

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "Lclient!tg;")
	public static Class81 aClass81_952 = aClass81_953;

	@OriginalMember(owner = "client!nh", name = "r", descriptor = "Lclient!tg;")
	private static Class81 aClass81_956 = Static120.method2057("glow2:");

	@OriginalMember(owner = "client!nh", name = "m", descriptor = "Lclient!tg;")
	public static Class81 aClass81_954 = aClass81_956;

	@OriginalMember(owner = "client!nh", name = "q", descriptor = "Lclient!tg;")
	public static Class81 aClass81_955 = aClass81_956;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
	public static void method2025() {
		anIntArray277 = null;
		anIntArrayArrayArray4 = null;
		aClass81_954 = null;
		aClass81_955 = null;
		aClass59_20 = null;
		aClass81_956 = null;
		aClass81Array13 = null;
		aClass81_953 = null;
		anIntArray275 = null;
		anIntArray276 = null;
		aClass81_952 = null;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)V")
	public static void method2026() {
		for (@Pc(10) Class1_Sub2_Sub1_Sub5 local10 = (Class1_Sub2_Sub1_Sub5) Static6.aClass30_3.method1115(); local10 != null; local10 = (Class1_Sub2_Sub1_Sub5) Static6.aClass30_3.method1125()) {
			if (Static44.anInt1086 != local10.anInt2214 || Static142.anInt3104 > local10.anInt2199) {
				local10.method3134();
			} else if (local10.anInt2201 <= Static142.anInt3104) {
				if (local10.anInt2215 > 0) {
					@Pc(43) Class1_Sub2_Sub1_Sub3_Sub2 local43 = Static48.aClass1_Sub2_Sub1_Sub3_Sub2Array11[local10.anInt2215 - 1];
					if (local43 != null && local43.anInt3040 >= 0 && local43.anInt3040 < 13312 && local43.anInt3026 >= 0 && local43.anInt3026 < 13312) {
						local10.method1671(local43.anInt3040, Static142.anInt3104, Static102.method1694(local43.anInt3040, local10.anInt2214, local43.anInt3026) - local10.anInt2210, local43.anInt3026);
					}
				}
				if (local10.anInt2215 < 0) {
					@Pc(94) int local94 = -local10.anInt2215 - 1;
					@Pc(105) Class1_Sub2_Sub1_Sub3_Sub1 local105;
					if (local94 == Static110.anInt2514) {
						local105 = Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1;
					} else {
						local105 = Static51.aClass1_Sub2_Sub1_Sub3_Sub1Array1[local94];
					}
					if (local105 != null && local105.anInt3040 >= 0 && local105.anInt3040 < 13312 && local105.anInt3026 >= 0 && local105.anInt3026 < 13312) {
						local10.method1671(local105.anInt3040, Static142.anInt3104, Static102.method1694(local105.anInt3040, local10.anInt2214, local105.anInt3026) - local10.anInt2210, local105.anInt3026);
					}
				}
				local10.method1670(Static149.anInt3336);
				Static110.method1957(Static44.anInt1086, (int) local10.aDouble6, (int) local10.aDouble8, (int) local10.aDouble2, 60, local10, local10.anInt2219, -1L, false);
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
	public static void method2027() {
		if (Static29.aClass77_4 != null || Static31.aClass77_5 != null) {
			return;
		}
		@Pc(17) int local17 = Static118.anInt2618;
		@Pc(87) int local87;
		@Pc(93) int local93;
		if (Static149.aBoolean145) {
			@Pc(179) int local179;
			if (local17 != 1) {
				local179 = Static36.anInt973;
				local87 = Static172.anInt3997;
				if (Static48.anInt3638 - 10 > local179 || local179 > Static110.anInt2512 + Static48.anInt3638 + 10 || local87 < Static100.anInt2176 - 10 || Static100.anInt2176 + Static61.anInt1539 + 10 < local87) {
					Static149.aBoolean145 = false;
					Static67.method1208(Static61.anInt1539, Static100.anInt2176, Static110.anInt2512, Static48.anInt3638);
				}
			}
			if (local17 != 1) {
				return;
			}
			local87 = Static100.anInt2176;
			local179 = Static48.anInt3638;
			local93 = Static110.anInt2512;
			@Pc(236) int local236 = Static140.anInt3065;
			@Pc(238) int local238 = Static119.anInt2628;
			@Pc(240) int local240 = -1;
			for (@Pc(242) int local242 = 0; local242 < Static118.anInt2616; local242++) {
				@Pc(257) int local257 = local87 + (Static118.anInt2616 + -1 - local242) * 15 + 31;
				if (local179 < local236 && local93 + local179 > local236 && local238 > local257 - 13 && local257 + 3 > local238) {
					local240 = local242;
				}
			}
			if (local240 != -1) {
				Static40.method794(local240);
			}
			Static149.aBoolean145 = false;
			Static67.method1208(Static61.anInt1539, Static100.anInt2176, Static110.anInt2512, Static48.anInt3638);
			return;
		}
		if (local17 == 1 && Static118.anInt2616 > 0) {
			@Pc(35) short local35 = Static49.aShortArray11[Static118.anInt2616 - 1];
			if (local35 == 46 || local35 == 3 || local35 == 21 || local35 == 51 || local35 == 45 || local35 == 58 || local35 == 12 || local35 == 44 || local35 == 2 || local35 == 57 || local35 == 47 || local35 == 1006) {
				local87 = Static144.anIntArray334[Static118.anInt2616 - 1];
				local93 = Static24.anIntArray35[Static118.anInt2616 - 1];
				@Pc(97) Class77 local97 = Static41.method800(local93);
				if (Static106.method1750(Static165.method2894(local97)) || Static157.method2710(Static165.method2894(local97))) {
					Static69.aBoolean67 = false;
					Static161.anInt3681 = 0;
					if (Static29.aClass77_4 != null) {
						Static51.method913(Static29.aClass77_4);
					}
					Static29.aClass77_4 = Static41.method800(local93);
					Static162.anInt3717 = local87;
					Static126.anInt2762 = Static140.anInt3065;
					Static160.anInt3660 = Static119.anInt2628;
					Static51.method913(Static29.aClass77_4);
					return;
				}
			}
		}
		if (local17 == 1 && (Static40.anInt1050 == 1 && Static118.anInt2616 > 2 || Static71.method1253(Static118.anInt2616 - 1))) {
			local17 = 2;
		}
		if (local17 == 1 && Static118.anInt2616 > 0) {
			Static40.method794(Static118.anInt2616 - 1);
		}
		if (local17 == 2 && Static118.anInt2616 > 0) {
			Static100.method1649();
			return;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIILclient!fb;JLclient!fb;Lclient!fb;)V")
	public static void method2028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub2_Sub1 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class1_Sub2_Sub1 arg6, @OriginalArg(7) Class1_Sub2_Sub1 arg7) {
		@Pc(3) Class83 local3 = new Class83();
		local3.aClass1_Sub2_Sub1_10 = arg4;
		local3.anInt3902 = arg1 * 128 + 64;
		local3.anInt3910 = arg2 * 128 + 64;
		local3.anInt3911 = arg3;
		local3.aLong138 = arg5;
		local3.aClass1_Sub2_Sub1_8 = arg6;
		local3.aClass1_Sub2_Sub1_9 = arg7;
		@Pc(34) short local34 = 0;
		@Pc(42) Class1_Sub17 local42 = Static167.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt1851; local46++) {
				if ((local42.aClass75Array2[local46].aLong118 & 0x400000L) == 4194304L && local42.aClass75Array2[local46].aClass1_Sub2_Sub1_7 instanceof Class1_Sub2_Sub1_Sub4) {
					@Pc(71) Class1_Sub2_Sub1_Sub4 local71 = (Class1_Sub2_Sub1_Sub4) local42.aClass75Array2[local46].aClass1_Sub2_Sub1_7;
					local71.method1459();
					if (local71.aShort36 < local34) {
						local34 = local71.aShort36;
					}
				}
			}
		}
		local3.anInt3908 = -local34;
		if (Static167.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static167.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub17(arg0, arg1, arg2);
		}
		Static167.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass83_1 = local3;
	}
}

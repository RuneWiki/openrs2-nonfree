import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!gg", name = "jb", descriptor = "J")
	public static long aLong48;

	@OriginalMember(owner = "client!gg", name = "P", descriptor = "Lclient!tg;")
	public static Class81 aClass81_492 = Static120.method2057("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!gg", name = "T", descriptor = "Lclient!tg;")
	public static Class81 aClass81_493 = Static120.method2057("weiss:");

	@OriginalMember(owner = "client!gg", name = "Y", descriptor = "Lclient!nh;")
	public static Class60 aClass60_1 = new Class60();

	@OriginalMember(owner = "client!gg", name = "bb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_494 = Static120.method2057("VOLL");

	@OriginalMember(owner = "client!gg", name = "hb", descriptor = "Lclient!tg;")
	private static Class81 aClass81_496 = Static120.method2057("Too many connections from your address)3");

	@OriginalMember(owner = "client!gg", name = "gb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_495 = aClass81_496;

	@OriginalMember(owner = "client!gg", name = "ib", descriptor = "Lclient!tg;")
	public static Class81 aClass81_497 = Static120.method2057("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "(I)V")
	public static void method1069() {
		try {
			if (Static89.anInt4032 == 1) {
				@Pc(18) int local18 = Static115.aClass1_Sub10_Sub3_2.method1305();
				if (local18 > 0 && Static115.aClass1_Sub10_Sub3_2.method1318()) {
					local18 -= Static100.anInt2177;
					if (local18 < 0) {
						local18 = 0;
					}
					Static115.aClass1_Sub10_Sub3_2.method1309(local18);
				} else {
					Static115.aClass1_Sub10_Sub3_2.method1311();
					Static115.aClass1_Sub10_Sub3_2.method1298();
					if (Static108.aClass82_40 == null) {
						Static89.anInt4032 = 0;
					} else {
						Static89.anInt4032 = 2;
					}
					Static21.aClass4_1 = null;
					Static78.aClass1_Sub21_1 = null;
				}
			}
		} catch (@Pc(63) Exception local63) {
			local63.printStackTrace();
			Static115.aClass1_Sub10_Sub3_2.method1311();
			Static108.aClass82_40 = null;
			Static21.aClass4_1 = null;
			Static89.anInt4032 = 0;
			Static78.aClass1_Sub21_1 = null;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(JB)V")
	public static void method1070(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static58.anInt1378 >= 100 && Static133.anInt2871 != 1 || Static58.anInt1378 >= 200) {
			Static131.method2247(0, Static58.aClass81_481, Static149.aClass81_1213);
			return;
		}
		@Pc(35) Class81 local35 = Static106.method1751(arg0).method2808();
		for (@Pc(37) int local37 = 0; local37 < Static58.anInt1378; local37++) {
			if (arg0 == Static121.aLongArray6[local37]) {
				Static131.method2247(0, Static127.method2169(new Class81[] { local35, Static105.aClass81_813 }), Static149.aClass81_1213);
				return;
			}
		}
		for (@Pc(76) int local76 = 0; local76 < Static9.anInt178; local76++) {
			if (arg0 == Static90.aLongArray4[local76]) {
				Static131.method2247(0, Static127.method2169(new Class81[] { Static179.aClass81_1418, local35, Static8.aClass81_81 }), Static149.aClass81_1213);
				return;
			}
		}
		if (local35.method2800(Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.aClass81_518)) {
			Static131.method2247(0, Static42.aClass81_372, Static149.aClass81_1213);
			return;
		}
		Static178.aClass81Array22[Static58.anInt1378] = local35;
		Static121.aLongArray6[Static58.anInt1378] = arg0;
		Static179.anIntArray428[Static58.anInt1378] = 0;
		Static111.anIntArray270[Static58.anInt1378] = 0;
		Static140.anInt3066 = Static121.anInt2701;
		Static58.anInt1378++;
		Static104.aClass1_Sub8_Sub1_2.method366(137);
		Static104.aClass1_Sub8_Sub1_2.method355(arg0);
	}

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "(III)V")
	public static void method1071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static118.anInt2616 < 2 && Static164.anInt3767 == 0 && !Static184.aBoolean172) {
			return;
		}
		@Pc(50) Class81 local50;
		if (Static164.anInt3767 == 1 && Static118.anInt2616 < 2) {
			local50 = Static127.method2169(new Class81[] { Static7.aClass81_79, Static69.aClass81_583, Static132.aClass81_1033, Static147.aClass81_1171 });
		} else if (Static184.aBoolean172 && Static118.anInt2616 < 2) {
			local50 = Static127.method2169(new Class81[] { Static14.aClass81_127, Static69.aClass81_583, Static74.aClass81_617, Static147.aClass81_1171 });
		} else {
			local50 = Static185.method2991(Static118.anInt2616 - 1);
		}
		if (Static118.anInt2616 > 2) {
			local50 = Static127.method2169(new Class81[] { local50, Static113.aClass81_937, Static149.method2548(Static118.anInt2616 - 2), Static15.aClass81_136 });
		}
		@Pc(132) int local132 = Static110.aClass1_Sub2_Sub2_Sub2_Sub1_3.method1942(local50, arg1 + 4, arg0 + 15, Static137.aRandom1, Static33.anInt924);
		Static67.method1208(15, arg0, local132 + Static110.aClass1_Sub2_Sub2_Sub2_Sub1_3.method1934(local50), arg1 + 4);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "([Lclient!rh;II)V")
	public static void method1072(@OriginalArg(0) Class77[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(14) Class77 local14 = arg0[local3];
			if (local14 != null && arg1 == local14.anInt3196 && (!local14.aBoolean138 || !Static151.method2628(local14))) {
				if (local14.anInt3226 == 0) {
					if (!local14.aBoolean138 && Static151.method2628(local14) && Static62.aClass77_9 != local14) {
						continue;
					}
					method1072(arg0, local14.anInt3231);
					if (local14.aClass77Array1 != null) {
						method1072(local14.aClass77Array1, local14.anInt3231);
					}
					@Pc(67) Class1_Sub4 local67 = (Class1_Sub4) Static119.aClass5_8.method134((long) local14.anInt3231);
					if (local67 != null) {
						Static147.method2504(local67.anInt155);
					}
				}
				if (local14.anInt3226 == 6) {
					@Pc(96) int local96;
					if (local14.anInt3212 != -1 || local14.anInt3215 != -1) {
						@Pc(91) boolean local91 = Static47.method851(local14);
						if (local91) {
							local96 = local14.anInt3215;
						} else {
							local96 = local14.anInt3212;
						}
						if (local96 != -1) {
							@Pc(111) Class1_Sub2_Sub18 local111 = Static73.method1277(local96);
							local14.anInt3246 += Static149.anInt3336;
							while (local111.anIntArray394[local14.anInt3216] < local14.anInt3246) {
								local14.anInt3246 -= local111.anIntArray394[local14.anInt3216];
								local14.anInt3216++;
								if (local111.anIntArray396.length <= local14.anInt3216) {
									local14.anInt3216 -= local111.anInt3793;
									if (local14.anInt3216 < 0 || local111.anIntArray396.length <= local14.anInt3216) {
										local14.anInt3216 = 0;
									}
								}
								Static51.method913(local14);
							}
						}
					}
					if (local14.anInt3204 != 0 && !local14.aBoolean138) {
						@Pc(182) int local182 = local14.anInt3204 >> 16;
						local96 = local14.anInt3204 << 16 >> 16;
						local96 *= Static149.anInt3336;
						@Pc(197) int local197 = local182 * Static149.anInt3336;
						local14.anInt3214 = local197 + local14.anInt3214 & 0x7FF;
						local14.anInt3210 = local14.anInt3210 + local96 & 0x7FF;
						Static51.method913(local14);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(B)V")
	public static void method1073() {
		aClass81_492 = null;
		aClass81_497 = null;
		aClass81_494 = null;
		aClass81_496 = null;
		aClass81_493 = null;
		aClass60_1 = null;
		aClass81_495 = null;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!tg;)Z")
	public static boolean method1074(@OriginalArg(1) Class81 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static9.anInt178; local11++) {
			if (arg0.method2811(Static105.aClass81Array8[local11])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1075(@OriginalArg(1) Component arg0) {
		@Pc(1) Method local1 = Static130.aMethod1;
		if (local1 != null) {
			try {
				local1.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(15) Throwable local15) {
			}
		}
		arg0.addKeyListener(Static43.aClass14_1);
		arg0.addFocusListener(Static43.aClass14_1);
	}
}

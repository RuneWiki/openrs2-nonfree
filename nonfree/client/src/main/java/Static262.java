import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!wh", name = "B", descriptor = "[[S")
	public static short[][] aShortArrayArray8;

	@OriginalMember(owner = "client!wh", name = "D", descriptor = "I")
	public static int anInt5502;

	@OriginalMember(owner = "client!wh", name = "E", descriptor = "Lclient!se;")
	public static Class122 aClass122_20;

	@OriginalMember(owner = "client!wh", name = "F", descriptor = "Lclient!hc;")
	public static Class51 aClass51_87;

	@OriginalMember(owner = "client!wh", name = "K", descriptor = "Lclient!v;")
	public static Interface4 anInterface4_1;

	@OriginalMember(owner = "client!wh", name = "C", descriptor = "I")
	public static int anInt5501 = 0;

	@OriginalMember(owner = "client!wh", name = "J", descriptor = "I")
	public static int anInt5505 = 0;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILclient!ai;Z)V")
	public static void method4181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class9_Sub1_Sub1 arg2) {
		@Pc(13) int local13;
		if ((arg1 & 0x800) != 0) {
			local13 = Static58.aClass1_Sub13_Sub1_1.method1811();
			@Pc(16) int[] local16 = new int[local13];
			@Pc(19) int[] local19 = new int[local13];
			@Pc(22) int[] local22 = new int[local13];
			for (@Pc(24) int local24 = 0; local24 < local13; local24++) {
				@Pc(30) int local30 = Static58.aClass1_Sub13_Sub1_1.method1793();
				if (local30 == 65535) {
					local30 = -1;
				}
				local16[local24] = local30;
				local19[local24] = Static58.aClass1_Sub13_Sub1_1.method1772();
				local22[local24] = Static58.aClass1_Sub13_Sub1_1.method1784();
			}
			Static195.method3282(arg2, local22, local19, local16);
		}
		if ((arg1 & 0x2) != 0) {
			arg2.anInt423 = Static58.aClass1_Sub13_Sub1_1.method1793();
			if (arg2.anInt423 == 65535) {
				arg2.anInt423 = -1;
			}
		}
		@Pc(105) int local105;
		@Pc(184) int local184;
		if ((arg1 & 0x100) != 0) {
			local13 = Static58.aClass1_Sub13_Sub1_1.method1761();
			if (local13 == 65535) {
				local13 = -1;
			}
			@Pc(101) boolean local101 = true;
			local105 = Static58.aClass1_Sub13_Sub1_1.method1786();
			if (local13 != -1 && arg2.anInt448 != -1 && Static131.method697(Static172.method2975(local13).anInt634).anInt2189 < Static131.method697(Static172.method2975(arg2.anInt448).anInt634).anInt2189) {
				local101 = false;
			}
			if (local101) {
				arg2.anInt472 = 0;
				arg2.anInt461 = 1;
				arg2.anInt460 = 0;
				arg2.anInt448 = local13;
				arg2.anInt444 = Static156.anInt3722 + (local105 & 0xFFFF);
				arg2.anInt449 = local105 >> 16;
				if (arg2.anInt444 > Static156.anInt3722) {
					arg2.anInt472 = -1;
				}
				if (arg2.anInt448 != -1 && Static156.anInt3722 == arg2.anInt444) {
					local184 = Static172.method2975(arg2.anInt448).anInt634;
					if (local184 != -1) {
						@Pc(192) Class49 local192 = Static131.method697(local184);
						if (local192 != null && local192.anIntArray168 != null) {
							Static232.method3865(arg2.anInt479, arg2.anInt427, Static83.aClass9_Sub1_Sub1_1 == arg2, 0, local192);
						}
					}
				}
			}
		}
		if ((arg1 & 0x400) != 0) {
			local13 = Static58.aClass1_Sub13_Sub1_1.method1780();
			local105 = Static58.aClass1_Sub13_Sub1_1.method1772();
			arg2.method205(local105, Static156.anInt3722, local13);
		}
		if ((arg1 & 0x20) != 0) {
			local13 = Static58.aClass1_Sub13_Sub1_1.method1761();
			local105 = Static58.aClass1_Sub13_Sub1_1.method1811();
			@Pc(248) int local248 = Static58.aClass1_Sub13_Sub1_1.method1772();
			local184 = Static58.aClass1_Sub13_Sub1_1.anInt2395;
			@Pc(259) boolean local259 = (local13 & 0x8000) != 0;
			if (arg2.aString12 != null && arg2.aClass94_1 != null) {
				@Pc(270) long local270 = Static93.method2008(arg2.aString12);
				@Pc(272) boolean local272 = false;
				if (local105 <= 1) {
					if (!local259 && (Static123.aBoolean66 && !Static60.aBoolean92 || Static148.aBoolean24)) {
						local272 = true;
					} else {
						for (@Pc(291) int local291 = 0; local291 < Static167.anInt3911; local291++) {
							if (local270 == Static150.aLongArray23[local291]) {
								local272 = true;
								break;
							}
						}
					}
				}
				if (!local272 && Static238.anInt5142 == 0) {
					Static225.aClass1_Sub13_6.anInt2395 = 0;
					@Pc(323) int local323 = -1;
					Static58.aClass1_Sub13_Sub1_1.method1787(local248, Static225.aClass1_Sub13_6.aByteArray29);
					Static225.aClass1_Sub13_6.anInt2395 = 0;
					@Pc(342) String local342;
					if (local259) {
						local13 &= 0x7FFF;
						@Pc(352) Class70 local352 = Static140.method2546(Static225.aClass1_Sub13_6);
						local323 = local352.anInt3087;
						local342 = local352.aClass1_Sub2_Sub12_1.method2906(Static225.aClass1_Sub13_6);
					} else {
						local342 = Static78.method1939(Static128.method2429(Static218.method3558(Static225.aClass1_Sub13_6)));
					}
					arg2.aString13 = local342.trim();
					arg2.anInt402 = 150;
					arg2.anInt467 = local13 & 0xFF;
					arg2.anInt457 = local13 >> 8;
					if (local105 == 2) {
						Static9.method185(null, "<img=1>" + arg2.method184(), local259 ? 17 : 1, local323, local342);
					} else if (local105 == 1) {
						Static9.method185(null, "<img=0>" + arg2.method184(), local259 ? 17 : 1, local323, local342);
					} else {
						Static9.method185(null, arg2.method184(), local259 ? 17 : 2, local323, local342);
					}
				}
			}
			Static58.aClass1_Sub13_Sub1_1.anInt2395 = local184 + local248;
		}
		if ((arg1 & 0x1) != 0) {
			local13 = Static58.aClass1_Sub13_Sub1_1.method1764();
			if (local13 == 65535) {
				local13 = -1;
			}
			local105 = Static58.aClass1_Sub13_Sub1_1.method1811();
			Static22.method2189(arg2, local105, local13);
		}
		if ((arg1 & 0x200) != 0) {
			arg2.anInt463 = Static58.aClass1_Sub13_Sub1_1.method1811();
			arg2.anInt471 = Static58.aClass1_Sub13_Sub1_1.method1779();
			arg2.anInt414 = Static58.aClass1_Sub13_Sub1_1.method1779();
			arg2.anInt456 = Static58.aClass1_Sub13_Sub1_1.method1772();
			arg2.anInt421 = Static58.aClass1_Sub13_Sub1_1.method1784() + Static156.anInt3722;
			arg2.anInt409 = Static58.aClass1_Sub13_Sub1_1.method1793() + Static156.anInt3722;
			arg2.anInt468 = Static58.aClass1_Sub13_Sub1_1.method1779();
			arg2.anInt434 = 0;
			arg2.anInt453 = 1;
		}
		if ((arg1 & 0x10) != 0) {
			local13 = Static58.aClass1_Sub13_Sub1_1.method1772();
			@Pc(544) byte[] local544 = new byte[local13];
			@Pc(549) Class1_Sub13 local549 = new Class1_Sub13(local544);
			Static58.aClass1_Sub13_Sub1_1.method1776(local544, local13);
			Static73.aClass1_Sub13Array1[arg0] = local549;
			arg2.method186(local549);
		}
		if ((arg1 & 0x8) != 0) {
			local13 = Static58.aClass1_Sub13_Sub1_1.method1780();
			local105 = Static58.aClass1_Sub13_Sub1_1.method1779();
			arg2.method205(local105, Static156.anInt3722, local13);
			arg2.anInt480 = Static156.anInt3722 + 300;
			arg2.anInt438 = Static58.aClass1_Sub13_Sub1_1.method1779();
		}
		if ((arg1 & 0x40) != 0) {
			arg2.aString13 = Static58.aClass1_Sub13_Sub1_1.method1774();
			if (arg2.aString13.charAt(0) == '~') {
				arg2.aString13 = arg2.aString13.substring(1);
				Static50.method1013(arg2.method184(), arg2.aString13, 2);
			} else if (Static83.aClass9_Sub1_Sub1_1 == arg2) {
				Static50.method1013(arg2.method184(), arg2.aString13, 2);
			}
			arg2.anInt467 = 0;
			arg2.anInt402 = 150;
			arg2.anInt457 = 0;
		}
		if ((arg1 & 0x4) != 0) {
			arg2.anInt433 = Static58.aClass1_Sub13_Sub1_1.method1793();
			arg2.anInt459 = Static58.aClass1_Sub13_Sub1_1.method1761();
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZ)V")
	public static void method4182(@OriginalArg(1) boolean arg0) {
		Static191.aBoolean213 = arg0;
		Static257.aBoolean279 = !Static25.method507();
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(IIIIII)V")
	public static void method4183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(13) int local13 = Static3.method36(Static202.anInt4469, arg1, Static94.anInt4237);
		@Pc(19) int local19 = Static3.method36(Static202.anInt4469, arg2, Static94.anInt4237);
		@Pc(27) int local27 = Static3.method36(Static167.anInt3907, arg4, Static150.anInt3860);
		@Pc(35) int local35 = Static3.method36(Static167.anInt3907, arg3, Static150.anInt3860);
		for (@Pc(41) int local41 = local13; local41 <= local19; local41++) {
			Static147.method2681(Static29.anIntArrayArray10[local41], arg0, local27, local35);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZLclient!hc;IIII)V")
	public static void method4184(@OriginalArg(1) Class51 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		Static143.anInt3473 = 1;
		Static194.anInt4334 = arg2;
		Static39.aClass51_14 = arg0;
		Static47.anInt1387 = arg1;
		Static54.anInt1501 = 0;
		Static77.anInt2101 = 10000;
		Static172.aBoolean196 = false;
	}
}

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "B")
	public static byte aByte2;

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "Lclient!ja;")
	private static Class39 aClass39_446 = Static28.method504("Loaded interfaces");

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "Lclient!ja;")
	public static Class39 aClass39_445 = aClass39_446;

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
	public static int anInt832 = -2;

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "Lclient!ja;")
	public static Class39 aClass39_447 = Static28.method504(": ");

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "Lclient!pb;")
	public static Class61 aClass61_5 = new Class61();

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "Lclient!ja;")
	public static Class39 aClass39_448 = Static28.method504(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "Lclient!ja;")
	public static Class39 aClass39_449 = Static28.method504("Mitglieder)2Welt");

	@OriginalMember(owner = "client!fa", name = "o", descriptor = "Lclient!ja;")
	public static Class39 aClass39_450 = Static28.method504("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!fa", name = "p", descriptor = "[I")
	public static int[] anIntArray94 = new int[32768];

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILclient!ic;IIII)V")
	public static void method550(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub2_Sub3_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == null) {
			return;
		}
		@Pc(12) int local12 = Static45.anInt1164 + Static54.anInt1446 & 0x7FF;
		@Pc(20) int local20 = arg4 * arg4 + arg0 * arg0;
		if (local20 > 6400) {
			return;
		}
		@Pc(28) int local28 = Class4_Sub2_Sub3_Sub2.anIntArray155[local12];
		@Pc(36) int local36 = local28 * 256 / (Static105.anInt2051 + 256);
		@Pc(40) int local40 = Class4_Sub2_Sub3_Sub2.anIntArray152[local12];
		@Pc(48) int local48 = local40 * 256 / (Static105.anInt2051 + 256);
		@Pc(58) int local58 = local36 * arg4 - local48 * arg0 >> 16;
		@Pc(72) int local72 = arg4 * local48 + arg0 * local36 >> 16;
		if (local20 <= 2500) {
			arg1.method876(local72 + arg3 + 4 + 94 - arg1.anInt1345 / 2, -(arg1.anInt1342 / 2) + -4 + arg2 - (local58 + -83));
		} else {
			arg1.method882(Static108.aClass4_Sub2_Sub3_Sub4_6, local72 + arg3 + 94 + 4 - arg1.anInt1345 / 2, -local58 + -4 + arg2 - -83 - arg1.anInt1342 / 2);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
	public static void method551() {
		anIntArray94 = null;
		aClass39_447 = null;
		aClass39_446 = null;
		aClass39_449 = null;
		aClass61_5 = null;
		aClass39_450 = null;
		aClass39_448 = null;
		aClass39_445 = null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIII)V")
	public static void method553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static25.anInt3168 == arg4 && Static68.anInt1700 == arg2 && (Static47.anInt1183 == arg1 || !Static123.aBoolean150)) {
			return;
		}
		Static25.anInt3168 = arg4;
		Static68.anInt1700 = arg2;
		Static47.anInt1183 = arg1;
		if (!Static123.aBoolean150) {
			Static47.anInt1183 = 0;
		}
		Static54.method966(25);
		Static103.method1845(Static40.aClass39_574, true);
		@Pc(46) int local46 = Static24.anInt503;
		@Pc(48) int local48 = Static36.anInt909;
		Static36.anInt909 = (arg4 - 6) * 8;
		@Pc(59) int local59 = Static36.anInt909 - local48;
		Static24.anInt503 = (arg2 - 6) * 8;
		@Pc(76) int local76 = Static24.anInt503 - local46;
		for (@Pc(80) int local80 = 0; local80 < 32768; local80++) {
			@Pc(86) Class4_Sub2_Sub1_Sub1_Sub2 local86 = Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1[local80];
			if (local86 != null) {
				for (@Pc(90) int local90 = 0; local90 < 10; local90++) {
					local86.anIntArray300[local90] -= local59;
					local86.anIntArray296[local90] -= local76;
				}
				local86.anInt2643 -= local59 * 128;
				local86.anInt2641 -= local76 * 128;
			}
		}
		for (@Pc(138) int local138 = 0; local138 < 2048; local138++) {
			@Pc(144) Class4_Sub2_Sub1_Sub1_Sub1 local144 = Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[local138];
			if (local144 != null) {
				for (@Pc(148) int local148 = 0; local148 < 10; local148++) {
					local144.anIntArray300[local148] -= local59;
					local144.anIntArray296[local148] -= local76;
				}
				local144.anInt2641 -= local76 * 128;
				local144.anInt2643 -= local59 * 128;
			}
		}
		Static131.anInt3202 = arg1;
		@Pc(194) byte local194 = 0;
		Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.method1913(arg0, arg3, false);
		@Pc(202) byte local202 = 1;
		@Pc(204) byte local204 = 104;
		if (local59 < 0) {
			local194 = 103;
			local204 = -1;
			local202 = -1;
		}
		@Pc(214) byte local214 = 0;
		@Pc(216) byte local216 = 104;
		@Pc(218) byte local218 = 1;
		if (local76 < 0) {
			local214 = 103;
			local216 = -1;
			local218 = -1;
		}
		for (@Pc(228) int local228 = local194; local228 != local204; local228 += local202) {
			for (@Pc(232) int local232 = local214; local232 != local216; local232 += local218) {
				@Pc(238) int local238 = local228 + local59;
				@Pc(242) int local242 = local232 + local76;
				for (@Pc(244) int local244 = 0; local244 < 4; local244++) {
					if (local238 >= 0 && local242 >= 0 && local238 < 104 && local242 < 104) {
						Static26.aClass61ArrayArrayArray1[local244][local228][local232] = Static26.aClass61ArrayArrayArray1[local244][local238][local242];
					} else {
						Static26.aClass61ArrayArrayArray1[local244][local228][local232] = null;
					}
				}
			}
		}
		for (@Pc(309) Class4_Sub19 local309 = (Class4_Sub19) Static117.aClass61_15.method1628(); local309 != null; local309 = (Class4_Sub19) Static117.aClass61_15.method1629()) {
			local309.anInt2727 -= local76;
			local309.anInt2719 -= local59;
			if (local309.anInt2719 < 0 || local309.anInt2727 < 0 || local309.anInt2719 >= 104 || local309.anInt2727 >= 104) {
				local309.method2189();
			}
		}
		Static125.anInt3122 = 0;
		Static42.aBoolean48 = false;
		Static10.anInt332 = -1;
		if (Static125.anInt3127 != 0) {
			Static125.anInt3127 -= local59;
			Static22.anInt642 -= local76;
		}
		Static85.aClass61_11.method1633();
		Static114.aClass61_13.method1633();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZLclient!qd;I)V")
	public static void method554(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub2_Sub1_Sub1_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt2678 == arg0 && arg0 != -1) {
			@Pc(15) int local15 = Static116.method2017(arg0).anInt319;
			if (local15 == 1) {
				arg1.anInt2671 = 0;
				arg1.anInt2677 = 0;
				arg1.anInt2646 = 0;
				arg1.anInt2659 = arg2;
			}
			if (local15 == 2) {
				arg1.anInt2677 = 0;
			}
		} else if (arg0 == -1 || arg1.anInt2678 == -1 || Static116.method2017(arg0).anInt313 >= Static116.method2017(arg1.anInt2678).anInt313) {
			arg1.anInt2678 = arg0;
			arg1.anInt2671 = 0;
			arg1.anInt2685 = arg1.anInt2660;
			arg1.anInt2646 = 0;
			arg1.anInt2659 = arg2;
			arg1.anInt2677 = 0;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!rf;IZ)V")
	public static void method555(@OriginalArg(0) Class69 arg0, @OriginalArg(2) boolean arg1) {
		if (Static106.aClass69_4 != null) {
			try {
				Static106.aClass69_4.method1859();
			} catch (@Pc(14) Exception local14) {
			}
			Static106.aClass69_4 = null;
		}
		Static106.aClass69_4 = arg0;
		Static68.method1172(arg1);
		Static69.aClass4_Sub16_4.anInt2019 = 0;
		Static8.aClass4_Sub2_Sub8_1 = null;
		Static125.aClass4_Sub16_6 = null;
		Static70.anInt1726 = 0;
		while (true) {
			@Pc(39) Class4_Sub2_Sub8 local39 = (Class4_Sub2_Sub8) Static104.aClass42_10.method1049();
			if (local39 == null) {
				while (true) {
					local39 = (Class4_Sub2_Sub8) Static82.aClass42_9.method1049();
					if (local39 == null) {
						if (Static112.aByte7 != 0) {
							try {
								@Pc(93) Class4_Sub16 local93 = new Class4_Sub16(4);
								local93.method1459(4);
								local93.method1459(Static112.aByte7);
								local93.method1488(0);
								Static106.aClass69_4.method1860(4, local93.aByteArray22);
							} catch (@Pc(116) IOException local116) {
								try {
									Static106.aClass69_4.method1859();
								} catch (@Pc(121) Exception local121) {
								}
								Static64.anInt1659++;
								Static106.aClass69_4 = null;
							}
						}
						Static105.anInt2066 = 0;
						Static127.aLong154 = Static23.method431();
						return;
					}
					Static82.aClass7_2.method185(local39);
					Static117.aClass42_12.method1056(local39, local39.aLong155);
					Static131.anInt3206--;
					Static4.anInt65++;
				}
			}
			Static16.aClass42_5.method1056(local39, local39.aLong155);
			Static13.anInt349--;
			Static2.anInt16++;
		}
	}
}

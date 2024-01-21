import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "[I")
	public static int[] anIntArray150;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
	public static int anInt1076;

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "Lclient!a;")
	public static Class1_Sub1 aClass1_Sub1_6;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_402 = Static120.method1824("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "Lclient!rd;")
	public static Class80 aClass80_401 = aClass80_402;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_403 = Static120.method1824("Your account has been disabled)3");

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_405 = Static120.method1824(" is already on your ignore list)3");

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "Lclient!rd;")
	public static Class80 aClass80_404 = aClass80_405;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "Lclient!rd;")
	public static Class80 aClass80_406 = aClass80_403;

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_407 = Static120.method1824("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "[Z")
	public static final boolean[] aBooleanArray4 = new boolean[5];

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_409 = Static120.method1824("Please enter your password)3");

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "Lclient!rd;")
	public static Class80 aClass80_408 = aClass80_409;

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
	public static int anInt1078 = 0;

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_410 = Static120.method1824("runes");

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method729(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg0;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg0 - arg1;
		@Pc(20) int local20 = arg0 * arg0;
		@Pc(25) int local25 = arg4 - arg1;
		@Pc(29) int local29 = arg4 * arg4;
		@Pc(33) int local33 = local25 * local25;
		@Pc(37) int local37 = local16 * local16;
		@Pc(41) int local41 = local20 << 1;
		@Pc(45) int local45 = local29 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg0 << 1;
		@Pc(65) int local65 = (1 - local57) * local29 + local41;
		@Pc(69) int local69 = local16 << 1;
		@Pc(78) int local78 = (1 - local69) * local33 + local49;
		@Pc(87) int local87 = local37 - (local69 - 1) * local53;
		@Pc(96) int local96 = local20 - (local57 - 1) * local45;
		@Pc(100) int local100 = local29 << 2;
		@Pc(104) int local104 = local20 << 2;
		@Pc(108) int local108 = local33 << 2;
		@Pc(112) int local112 = local37 << 2;
		@Pc(116) int local116 = local41 * 3;
		@Pc(122) int local122 = local45 * (local57 - 3);
		@Pc(126) int local126 = local49 * 3;
		@Pc(132) int local132 = (local69 - 3) * local53;
		@Pc(134) int local134 = local104;
		@Pc(140) int local140 = local100 * (arg0 - 1);
		@Pc(142) int local142 = local112;
		@Pc(148) int local148 = local108 * (local16 - 1);
		@Pc(175) int local175;
		@Pc(183) int local183;
		@Pc(193) int local193;
		@Pc(201) int local201;
		if (Static34.anInt790 <= arg6 && arg6 <= Static17.anInt440) {
			@Pc(166) int[] local166 = Static96.anIntArrayArray27[arg6];
			local175 = Static61.method895(arg2 - arg4, Static172.anInt3861, Static85.anInt1779);
			local183 = Static61.method895(arg4 + arg2, Static172.anInt3861, Static85.anInt1779);
			local193 = Static61.method895(arg2 - local25, Static172.anInt3861, Static85.anInt1779);
			local201 = Static61.method895(local25 + arg2, Static172.anInt3861, Static85.anInt1779);
			Static46.method726(local175, arg3, local166, local193);
			Static46.method726(local193, arg5, local166, local201);
			Static46.method726(local201, arg3, local166, local183);
		}
		while (local7 > 0) {
			@Pc(228) boolean local228 = local7 <= local16;
			if (local65 < 0) {
				while (local65 < 0) {
					local9++;
					local96 += local134;
					local65 += local116;
					local116 += local104;
					local134 += local104;
				}
			}
			if (local96 < 0) {
				local9++;
				local96 += local134;
				local134 += local104;
				local65 += local116;
				local116 += local104;
			}
			if (local228) {
				if (local78 < 0) {
					while (local78 < 0) {
						local11++;
						local87 += local142;
						local78 += local126;
						local126 += local112;
						local142 += local112;
					}
				}
				if (local87 < 0) {
					local87 += local142;
					local142 += local112;
					local78 += local126;
					local11++;
					local126 += local112;
				}
				local78 += -local148;
				local148 -= local108;
				local87 += -local132;
				local132 -= local108;
			}
			local65 += -local140;
			local96 += -local122;
			local140 -= local100;
			local122 -= local100;
			local7--;
			local183 = local7 + arg6;
			local175 = arg6 - local7;
			if (Static34.anInt790 <= local183 && local175 <= Static17.anInt440) {
				local193 = Static61.method895(local9 + arg2, Static172.anInt3861, Static85.anInt1779);
				local201 = Static61.method895(arg2 - local9, Static172.anInt3861, Static85.anInt1779);
				if (local228) {
					@Pc(442) int local442 = Static61.method895(arg2 + local11, Static172.anInt3861, Static85.anInt1779);
					@Pc(451) int local451 = Static61.method895(arg2 - local11, Static172.anInt3861, Static85.anInt1779);
					@Pc(462) int[] local462;
					if (Static34.anInt790 <= local175) {
						local462 = Static96.anIntArrayArray27[local175];
						Static46.method726(local201, arg3, local462, local451);
						Static46.method726(local451, arg5, local462, local442);
						Static46.method726(local442, arg3, local462, local193);
					}
					if (local183 <= Static17.anInt440) {
						local462 = Static96.anIntArrayArray27[local183];
						Static46.method726(local201, arg3, local462, local451);
						Static46.method726(local451, arg5, local462, local442);
						Static46.method726(local442, arg3, local462, local193);
					}
				} else {
					if (Static34.anInt790 <= local175) {
						Static46.method726(local201, arg3, Static96.anIntArrayArray27[local175], local193);
					}
					if (local183 <= Static17.anInt440) {
						Static46.method726(local201, arg3, Static96.anIntArrayArray27[local183], local193);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
	public static void method730() {
		try {
			if (Static126.anInt2702 == 0) {
				if (Static31.aClass78_1 != null) {
					Static31.aClass78_1.method2417();
					Static31.aClass78_1 = null;
				}
				Static140.aBoolean117 = false;
				Static107.aClass94_3 = null;
				Static126.anInt2702 = 1;
				Static38.anInt867 = 0;
			}
			if (Static126.anInt2702 == 1) {
				if (Static107.aClass94_3 == null) {
					Static107.aClass94_3 = Static58.aClass61_1.method1790(Static60.anInt1320, Static46.aString2);
				}
				if (Static107.aClass94_3.anInt4472 == 2) {
					throw new IOException();
				}
				if (Static107.aClass94_3.anInt4472 == 1) {
					Static31.aClass78_1 = new Class78((Socket) Static107.aClass94_3.anObject3, Static58.aClass61_1);
					Static126.anInt2702 = 2;
					Static107.aClass94_3 = null;
				}
			}
			if (Static126.anInt2702 == 2) {
				@Pc(70) long local70 = Static34.aLong26 = Static78.aClass80_666.method2441();
				Static146.aClass3_Sub17_Sub1_3.anInt2923 = 0;
				Static146.aClass3_Sub17_Sub1_3.method2108(14);
				@Pc(84) int local84 = (int) (local70 >> 16 & 0x1FL);
				Static146.aClass3_Sub17_Sub1_3.method2108(local84);
				Static31.aClass78_1.method2419(Static146.aClass3_Sub17_Sub1_3.aByteArray40, 2);
				Static126.anInt2702 = 3;
				Static63.aClass3_Sub17_Sub1_2.anInt2923 = 0;
			}
			@Pc(119) int local119;
			if (Static126.anInt2702 == 3) {
				if (Static126.aClass38_2 != null) {
					Static126.aClass38_2.method2949();
				}
				if (Static54.aClass38_1 != null) {
					Static54.aClass38_1.method2949();
				}
				local119 = Static31.aClass78_1.method2418();
				if (Static126.aClass38_2 != null) {
					Static126.aClass38_2.method2949();
				}
				if (Static54.aClass38_1 != null) {
					Static54.aClass38_1.method2949();
				}
				if (local119 != 0) {
					Static167.method2702(local119);
					return;
				}
				Static63.aClass3_Sub17_Sub1_2.anInt2923 = 0;
				Static126.anInt2702 = 4;
			}
			if (Static126.anInt2702 == 4) {
				if (Static63.aClass3_Sub17_Sub1_2.anInt2923 < 8) {
					local119 = Static31.aClass78_1.method2416();
					if (8 - Static63.aClass3_Sub17_Sub1_2.anInt2923 < local119) {
						local119 = 8 - Static63.aClass3_Sub17_Sub1_2.anInt2923;
					}
					if (local119 > 0) {
						Static31.aClass78_1.method2415(local119, Static63.aClass3_Sub17_Sub1_2.anInt2923, Static63.aClass3_Sub17_Sub1_2.aByteArray40);
						Static63.aClass3_Sub17_Sub1_2.anInt2923 += local119;
					}
				}
				if (Static63.aClass3_Sub17_Sub1_2.anInt2923 == 8) {
					Static63.aClass3_Sub17_Sub1_2.anInt2923 = 0;
					Static158.aLong118 = Static63.aClass3_Sub17_Sub1_2.method2115();
					Static126.anInt2702 = 5;
				}
			}
			if (Static126.anInt2702 == 5) {
				Static146.aClass3_Sub17_Sub1_3.anInt2923 = 0;
				@Pc(215) int[] local215 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static158.aLong118 >> 32), (int) Static158.aLong118 };
				Static146.aClass3_Sub17_Sub1_3.method2108(10);
				Static146.aClass3_Sub17_Sub1_3.method2131(local215[0]);
				Static146.aClass3_Sub17_Sub1_3.method2131(local215[1]);
				Static146.aClass3_Sub17_Sub1_3.method2131(local215[2]);
				Static146.aClass3_Sub17_Sub1_3.method2131(local215[3]);
				Static146.aClass3_Sub17_Sub1_3.method2112(Static78.aClass80_666.method2441());
				Static146.aClass3_Sub17_Sub1_3.method2130(Static78.aClass80_671);
				Static146.aClass3_Sub17_Sub1_3.method2119(Static21.aBigInteger1, Static68.aBigInteger2);
				Static2.aClass3_Sub17_Sub1_1.anInt2923 = 0;
				if (Static21.anInt516 == 40) {
					Static2.aClass3_Sub17_Sub1_1.method2108(18);
				} else {
					Static2.aClass3_Sub17_Sub1_1.method2108(16);
				}
				Static2.aClass3_Sub17_Sub1_1.method2108(Static146.aClass3_Sub17_Sub1_3.anInt2923 + Static71.method1063(Static53.aClass80_456) + 125);
				Static2.aClass3_Sub17_Sub1_1.method2131(489);
				Static2.aClass3_Sub17_Sub1_1.method2108(Static96.aBoolean83 ? 1 : 0);
				Static154.method2446(Static2.aClass3_Sub17_Sub1_1);
				Static2.aClass3_Sub17_Sub1_1.method2130(Static53.aClass80_456);
				Static2.aClass3_Sub17_Sub1_1.method2131(Static145.anInt3182);
				Static2.aClass3_Sub17_Sub1_1.method2131(Static156.aClass1_Sub1_24.anInt40);
				Static2.aClass3_Sub17_Sub1_1.method2131(Static160.aClass1_Sub1_25.anInt40);
				Static2.aClass3_Sub17_Sub1_1.method2131(Static36.aClass1_Sub1_4.anInt40);
				Static2.aClass3_Sub17_Sub1_1.method2131(Static142.aClass1_Sub1_23.anInt40);
				Static2.aClass3_Sub17_Sub1_1.method2131(Static67.aClass1_Sub1_10.anInt40);
				Static2.aClass3_Sub17_Sub1_1.method2131(Static100.aClass1_Sub1_16.anInt40);
				Static2.aClass3_Sub17_Sub1_1.method2131(Static102.aClass1_Sub1_17.anInt40);
				Static2.aClass3_Sub17_Sub1_1.method2131(Static128.aClass1_Sub1_20.anInt40);
				Static2.aClass3_Sub17_Sub1_1.method2131(Static130.aClass1_Sub1_21.anInt40);
				Static2.aClass3_Sub17_Sub1_1.method2131(Static83.aClass1_Sub1_12.anInt40);
				Static2.aClass3_Sub17_Sub1_1.method2131(Static166.aClass1_Sub1_28.anInt40);
				Static2.aClass3_Sub17_Sub1_1.method2131(Static103.aClass1_Sub1_18.anInt40);
				Static2.aClass3_Sub17_Sub1_1.method2131(aClass1_Sub1_6.anInt40);
				Static2.aClass3_Sub17_Sub1_1.method2131(Static52.aClass1_Sub1_7.anInt40);
				Static2.aClass3_Sub17_Sub1_1.method2131(Static6.aClass1_Sub1_1.anInt40);
				Static2.aClass3_Sub17_Sub1_1.method2131(Static164.aClass1_Sub1_27.anInt40);
				Static2.aClass3_Sub17_Sub1_1.method2131(Static97.aClass1_Sub1_15.anInt40);
				Static2.aClass3_Sub17_Sub1_1.method2131(Static126.aClass1_Sub1_19.anInt40);
				Static2.aClass3_Sub17_Sub1_1.method2131(Static35.aClass1_Sub1_13.anInt40);
				Static2.aClass3_Sub17_Sub1_1.method2131(Static77.aClass1_Sub1_14.anInt40);
				Static2.aClass3_Sub17_Sub1_1.method2131(Static13.aClass1_Sub1_2.anInt40);
				Static2.aClass3_Sub17_Sub1_1.method2131(Static141.aClass1_Sub1_22.anInt40);
				Static2.aClass3_Sub17_Sub1_1.method2131(Static162.aClass1_Sub1_26.anInt40);
				Static2.aClass3_Sub17_Sub1_1.method2094(Static146.aClass3_Sub17_Sub1_3.anInt2923, Static146.aClass3_Sub17_Sub1_3.aByteArray40);
				Static31.aClass78_1.method2419(Static2.aClass3_Sub17_Sub1_1.aByteArray40, Static2.aClass3_Sub17_Sub1_1.anInt2923);
				Static146.aClass3_Sub17_Sub1_3.method2144(local215);
				for (@Pc(496) int local496 = 0; local496 < 4; local496++) {
					local215[local496] += 50;
				}
				Static63.aClass3_Sub17_Sub1_2.method2144(local215);
				Static126.anInt2702 = 6;
			}
			if (Static126.anInt2702 == 6 && Static31.aClass78_1.method2416() > 0) {
				local119 = Static31.aClass78_1.method2418();
				if (local119 == 21 && Static21.anInt516 == 20) {
					Static126.anInt2702 = 7;
				} else if (local119 == 2) {
					Static126.anInt2702 = 9;
				} else if (local119 == 15 && Static21.anInt516 == 40) {
					Static61.method896();
					return;
				} else if (local119 == 23 && anInt1078 < 1) {
					anInt1078++;
					Static126.anInt2702 = 0;
				} else {
					Static167.method2702(local119);
					return;
				}
			}
			if (Static126.anInt2702 == 7 && Static31.aClass78_1.method2416() > 0) {
				Static16.anInt348 = Static31.aClass78_1.method2418() * 60 + 180;
				Static126.anInt2702 = 8;
			}
			if (Static126.anInt2702 == 8) {
				Static38.anInt867 = 0;
				Static43.method657(Static61.aClass80_528, Static154.method2467(new Class80[] { Static83.method1219(Static16.anInt348 / 60), Static195.aClass80_1738 }), Static52.aClass80_437);
				if (--Static16.anInt348 <= 0) {
					Static126.anInt2702 = 0;
				}
			} else {
				if (Static126.anInt2702 == 9 && Static31.aClass78_1.method2416() >= 9) {
					Static177.anInt3975 = Static31.aClass78_1.method2418();
					Static131.anInt4308 = Static31.aClass78_1.method2418();
					Static135.aBoolean115 = Static31.aClass78_1.method2418() == 1;
					Static30.anInt4494 = Static31.aClass78_1.method2418();
					Static30.anInt4494 <<= 0x8;
					Static30.anInt4494 += Static31.aClass78_1.method2418();
					Static71.anInt1582 = Static31.aClass78_1.method2418();
					Static31.aClass78_1.method2415(1, 0, Static63.aClass3_Sub17_Sub1_2.aByteArray40);
					Static63.aClass3_Sub17_Sub1_2.anInt2923 = 0;
					Static85.anInt1777 = Static63.aClass3_Sub17_Sub1_2.method2147();
					Static31.aClass78_1.method2415(2, 0, Static63.aClass3_Sub17_Sub1_2.aByteArray40);
					Static63.aClass3_Sub17_Sub1_2.anInt2923 = 0;
					Static41.anInt905 = Static63.aClass3_Sub17_Sub1_2.method2111();
					Static126.anInt2702 = 10;
				}
				if (Static126.anInt2702 != 10) {
					Static38.anInt867++;
					if (Static38.anInt867 > 2000) {
						if (anInt1078 < 1) {
							Static126.anInt2702 = 0;
							anInt1078++;
							if (Static100.anInt2099 == Static60.anInt1320) {
								Static60.anInt1320 = Static22.anInt537;
							} else {
								Static60.anInt1320 = Static100.anInt2099;
							}
						} else {
							Static167.method2702(-3);
						}
					}
				} else if (Static31.aClass78_1.method2416() >= Static41.anInt905) {
					Static63.aClass3_Sub17_Sub1_2.anInt2923 = 0;
					Static31.aClass78_1.method2415(Static41.anInt905, 0, Static63.aClass3_Sub17_Sub1_2.aByteArray40);
					Static100.method1489();
					Static147.anInt3300 = -1;
					Static130.method1951(false);
					Static85.anInt1777 = -1;
				}
			}
		} catch (@Pc(790) IOException local790) {
			if (anInt1078 < 1) {
				Static126.anInt2702 = 0;
				anInt1078++;
				if (Static60.anInt1320 == Static100.anInt2099) {
					Static60.anInt1320 = Static22.anInt537;
				} else {
					Static60.anInt1320 = Static100.anInt2099;
				}
			} else {
				Static167.method2702(-2);
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!mb;)Lclient!me;")
	public static Class31_Sub3 method731(@OriginalArg(1) Class3_Sub17 arg0) {
		return new Class31_Sub3(arg0.method2138(), arg0.method2138(), arg0.method2138(), arg0.method2138(), arg0.method2136(), arg0.method2136(), arg0.method2107());
	}
}

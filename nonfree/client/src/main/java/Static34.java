import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
	public static int anInt102;

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
	public static int anInt104;

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "Lclient!la;")
	public static Class42 aClass42_2 = new Class42();

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "Lclient!sc;")
	public static Class66 aClass66_104 = Static106.method1849("Okay");

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "Lclient!rb;")
	public static Class60 aClass60_10 = new Class60(64);

	@OriginalMember(owner = "client!ff", name = "l", descriptor = "Lclient!rb;")
	public static Class60 aClass60_11 = new Class60(500);

	@OriginalMember(owner = "client!ff", name = "m", descriptor = "Lclient!sc;")
	public static Class66 aClass66_105 = Static106.method1849("(U4");

	@OriginalMember(owner = "client!ff", name = "n", descriptor = "Lclient!sc;")
	private static Class66 aClass66_106 = Static106.method1849("Members object");

	@OriginalMember(owner = "client!ff", name = "o", descriptor = "Lclient!sc;")
	private static Class66 aClass66_107 = Static106.method1849("glow2:");

	@OriginalMember(owner = "client!ff", name = "p", descriptor = "Lclient!sc;")
	public static Class66 aClass66_108 = aClass66_107;

	@OriginalMember(owner = "client!ff", name = "q", descriptor = "Lclient!sc;")
	public static Class66 aClass66_109 = aClass66_106;

	@OriginalMember(owner = "client!ff", name = "r", descriptor = "Lclient!sc;")
	public static Class66 aClass66_110 = aClass66_107;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
	public static void method66() {
		aClass60_11 = null;
		aClass60_10 = null;
		aClass66_109 = null;
		aClass66_108 = null;
		aClass42_2 = null;
		aClass66_107 = null;
		aClass66_104 = null;
		aClass66_106 = null;
		aClass66_105 = null;
		aClass66_110 = null;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BIIII)V")
	public static void method68(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) Class1_Sub13 local15 = (Class1_Sub13) Static1.aClass61_1.method1748(); local15 != null; local15 = (Class1_Sub13) Static1.aClass61_1.method1760()) {
			if (local15.anInt1923 != -1 || local15.anIntArray294 != null) {
				@Pc(27) int local27 = 0;
				if (local15.anInt1928 < arg1) {
					local27 = arg1 - local15.anInt1928;
				} else if (local15.anInt1929 > arg1) {
					local27 = local15.anInt1929 - arg1;
				}
				if (arg3 > local15.anInt1925) {
					local27 += arg3 - local15.anInt1925;
				} else if (arg3 < local15.anInt1932) {
					local27 += local15.anInt1932 - arg3;
				}
				if (local15.anInt1930 < local27 - 64 || Static119.anInt2780 == 0 || arg0 != local15.anInt1931) {
					if (local15.aClass1_Sub9_Sub4_2 != null) {
						Static73.aClass1_Sub9_Sub2_3.method1012(local15.aClass1_Sub9_Sub4_2);
						local15.aClass1_Sub9_Sub4_2 = null;
					}
					if (local15.aClass1_Sub9_Sub4_1 != null) {
						Static73.aClass1_Sub9_Sub2_3.method1012(local15.aClass1_Sub9_Sub4_1);
						local15.aClass1_Sub9_Sub4_1 = null;
					}
				} else {
					local27 -= 64;
					if (local27 < 0) {
						local27 = 0;
					}
					@Pc(131) int local131 = (local15.anInt1930 - local27) * Static119.anInt2780 / local15.anInt1930;
					if (local15.aClass1_Sub9_Sub4_2 != null) {
						local15.aClass1_Sub9_Sub4_2.method1562(local131);
					} else if (local15.anInt1923 >= 0) {
						@Pc(146) Class11 local146 = Static137.method389(Static86.aClass5_Sub1_23, local15.anInt1923, 0);
						if (local146 != null) {
							@Pc(153) Class1_Sub14_Sub1 local153 = local146.method388().method1932(Static58.aClass12_1);
							@Pc(158) Class1_Sub9_Sub4 local158 = Static140.method1568(local153, local131);
							local158.method1575(-1);
							Static73.aClass1_Sub9_Sub2_3.method1016(local158);
							local15.aClass1_Sub9_Sub4_2 = local158;
						}
					}
					if (local15.aClass1_Sub9_Sub4_1 != null) {
						local15.aClass1_Sub9_Sub4_1.method1562(local131);
						if (!local15.aClass1_Sub9_Sub4_1.method2049()) {
							local15.aClass1_Sub9_Sub4_1 = null;
						}
					} else if (local15.anIntArray294 != null && (local15.anInt1926 -= arg2) <= 0) {
						@Pc(198) int local198 = (int) (Math.random() * (double) local15.anIntArray294.length);
						@Pc(206) Class11 local206 = Static137.method389(Static86.aClass5_Sub1_23, local15.anIntArray294[local198], 0);
						if (local206 != null) {
							@Pc(213) Class1_Sub14_Sub1 local213 = local206.method388().method1932(Static58.aClass12_1);
							@Pc(218) Class1_Sub9_Sub4 local218 = Static140.method1568(local213, local131);
							local218.method1575(0);
							Static73.aClass1_Sub9_Sub2_3.method1016(local218);
							local15.aClass1_Sub9_Sub4_1 = local218;
							local15.anInt1926 = (int) ((double) (local15.anInt1924 - local15.anInt1919) * Math.random()) + local15.anInt1919;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!gf;Lclient!gf;I)V")
	public static void method69(@OriginalArg(0) Class1_Sub1_Sub2_Sub2_Sub1 arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub2_Sub1 arg1) {
		if (Static15.aClass1_Sub1_Sub2_Sub1Array70 == null) {
			Static15.aClass1_Sub1_Sub2_Sub1Array70 = Static51.method1091(Static129.aClass66_1714, Static109.aClass66_1463, Static112.aClass5_Sub1_26);
		}
		if (Static35.aClass1_Sub1_Sub2_Sub3Array2 == null) {
			Static35.aClass1_Sub1_Sub2_Sub3Array2 = Static40.method932(Static60.aClass66_967, Static112.aClass5_Sub1_26, Static109.aClass66_1463);
		}
		if (Static4.aClass1_Sub1_Sub2_Sub3Array1 == null) {
			Static4.aClass1_Sub1_Sub2_Sub3Array1 = Static40.method932(Static98.aClass66_1382, Static112.aClass5_Sub1_26, Static109.aClass66_1463);
		}
		if (Static58.aClass1_Sub1_Sub2_Sub3Array7 == null) {
			Static58.aClass1_Sub1_Sub2_Sub3Array7 = Static40.method932(Static81.aClass66_1181, Static112.aClass5_Sub1_26, Static109.aClass66_1463);
		}
		Static115.method1670(0, 23, 765, 480, 0);
		Static115.method1675(0, 0, 125, 23, 12425273, 9135624);
		Static115.method1675(125, 0, 640, 23, 5197647, 2697513);
		arg1.method781(Static68.aClass66_1058, 62, 15, 0, -1);
		if (Static58.aClass1_Sub1_Sub2_Sub3Array7 != null) {
			Static58.aClass1_Sub1_Sub2_Sub3Array7[1].method997(140, 1);
			arg0.method790(Static59.aClass66_957, 152, 10, 16777215, -1);
			Static58.aClass1_Sub1_Sub2_Sub3Array7[0].method997(140, 12);
			arg0.method790(Static104.aClass66_1433, 152, 21, 16777215, -1);
		}
		if (Static4.aClass1_Sub1_Sub2_Sub3Array1 != null) {
			if (Static119.anIntArray481[0] == 0 && Static44.anIntArray208[0] == 0) {
				Static4.aClass1_Sub1_Sub2_Sub3Array1[2].method997(280, 4);
			} else {
				Static4.aClass1_Sub1_Sub2_Sub3Array1[0].method997(280, 4);
			}
			if (Static119.anIntArray481[0] == 0 && Static44.anIntArray208[0] == 1) {
				Static4.aClass1_Sub1_Sub2_Sub3Array1[3].method997(295, 4);
			} else {
				Static4.aClass1_Sub1_Sub2_Sub3Array1[1].method997(295, 4);
			}
			arg1.method790(Static51.aClass66_851, 312, 17, 16777215, -1);
			if (Static119.anIntArray481[0] == 1 && Static44.anIntArray208[0] == 0) {
				Static4.aClass1_Sub1_Sub2_Sub3Array1[2].method997(390, 4);
			} else {
				Static4.aClass1_Sub1_Sub2_Sub3Array1[0].method997(390, 4);
			}
			if (Static119.anIntArray481[0] == 1 && Static44.anIntArray208[0] == 1) {
				Static4.aClass1_Sub1_Sub2_Sub3Array1[3].method997(405, 4);
			} else {
				Static4.aClass1_Sub1_Sub2_Sub3Array1[1].method997(405, 4);
			}
			arg1.method790(Static92.aClass66_1332, 422, 17, 16777215, -1);
			if (Static119.anIntArray481[0] == 2 && Static44.anIntArray208[0] == 0) {
				Static4.aClass1_Sub1_Sub2_Sub3Array1[2].method997(500, 4);
			} else {
				Static4.aClass1_Sub1_Sub2_Sub3Array1[0].method997(500, 4);
			}
			if (Static119.anIntArray481[0] == 2 && Static44.anIntArray208[0] == 1) {
				Static4.aClass1_Sub1_Sub2_Sub3Array1[3].method997(515, 4);
			} else {
				Static4.aClass1_Sub1_Sub2_Sub3Array1[1].method997(515, 4);
			}
			arg1.method790(Static98.aClass66_1385, 532, 17, 16777215, -1);
			if (Static119.anIntArray481[0] == 3 && Static44.anIntArray208[0] == 0) {
				Static4.aClass1_Sub1_Sub2_Sub3Array1[2].method997(610, 4);
			} else {
				Static4.aClass1_Sub1_Sub2_Sub3Array1[0].method997(610, 4);
			}
			if (Static119.anIntArray481[0] == 3 && Static44.anIntArray208[0] == 1) {
				Static4.aClass1_Sub1_Sub2_Sub3Array1[3].method997(625, 4);
			} else {
				Static4.aClass1_Sub1_Sub2_Sub3Array1[1].method997(625, 4);
			}
			arg1.method790(Static67.aClass66_910, 642, 17, 16777215, -1);
		}
		Static115.method1670(708, 4, 50, 16, 0);
		arg0.method781(Static102.aClass66_1421, 733, 16, 16777215, -1);
		Static131.anInt2691 = -1;
		if (Static15.aClass1_Sub1_Sub2_Sub1Array70 != null) {
			@Pc(393) int local393 = 8;
			@Pc(401) int local401 = 24;
			@Pc(403) int local403;
			@Pc(405) int local405;
			do {
				local403 = local401;
				local405 = local393;
				if (local401 * (local393 - 1) >= Static99.anInt1210) {
					local393--;
				}
				if (Static99.anInt1210 <= (local401 - 1) * local393) {
					local401--;
				}
				if (local393 * (local401 - 1) >= Static99.anInt1210) {
					local401--;
				}
			} while (local401 != local403 || local393 != local405);
			local403 = (765 - local393 * 88) / (local393 + 1);
			local405 = (480 - local401 * 19) / (local401 + 1);
			if (local405 > 5) {
				local405 = 5;
			}
			if (local403 > 5) {
				local403 = 5;
			}
			@Pc(501) int local501 = (480 - local405 * (local401 - 1) - local401 * 19) / 2;
			@Pc(505) int local505 = local501 + 23;
			@Pc(520) int local520 = (765 - local393 * 88 - (local393 - 1) * local403) / 2;
			@Pc(522) int local522 = local520;
			@Pc(524) int local524 = 0;
			for (@Pc(526) int local526 = 0; local526 < Static99.anInt1210; local526++) {
				@Pc(532) Class4 local532 = Static18.aClass4Array1[local526];
				@Pc(534) boolean local534 = true;
				@Pc(539) Class66 local539 = Static88.method1632(local532.anInt119);
				if (local532.anInt119 == -1) {
					local534 = false;
					local539 = Static55.aClass66_926;
				} else if (local532.anInt119 > 1980) {
					local539 = Static81.aClass66_1178;
					local534 = false;
				}
				if (Static50.anInt1542 >= local522 && Static13.anInt462 >= local505 && local522 + 88 > Static50.anInt1542 && Static13.anInt462 < local505 + 19 && local534) {
					Static131.anInt2691 = local526;
					Static15.aClass1_Sub1_Sub2_Sub1Array70[local532.aBoolean4 ? 1 : 0].method229(local522, local505);
				} else {
					Static15.aClass1_Sub1_Sub2_Sub1Array70[local532.aBoolean4 ? 1 : 0].method226(local522, local505);
				}
				if (Static35.aClass1_Sub1_Sub2_Sub3Array2 != null) {
					Static35.aClass1_Sub1_Sub2_Sub3Array2[local532.anInt114 + (local532.aBoolean4 ? 8 : 0)].method997(local522 + 29, local505);
				}
				arg1.method781(Static88.method1632(local532.anInt116), local522 + 15, local505 + 5 + 9, 0, -1);
				arg0.method781(local539, local522 + 60, local505 - -9 + 5, 268435455, -1);
				local505 += local405 + 19;
				local524++;
				if (local401 <= local524) {
					local524 = 0;
					local522 += local403 + 88;
					local505 = local501 + 23;
				}
			}
		}
		try {
			@Pc(708) Graphics local708 = Static104.aCanvas1.getGraphics();
			Static3.aClass6_1.method906(local708);
		} catch (@Pc(716) Exception local716) {
			Static104.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!sc;I)Z")
	public static boolean method70(@OriginalArg(0) Class66 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static126.anInt2886; local11++) {
			if (arg0.method1843(Static123.aClass66Array22[local11])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIII)V")
	public static void method72(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = arg0; local3 <= arg0 + arg2; local3++) {
			for (@Pc(12) int local12 = arg1; local12 <= arg3 + arg1; local12++) {
				if (local12 >= 0 && local12 < 104 && local3 >= 0 && local3 < 104) {
					Static22.aByteArrayArrayArray6[0][local12][local3] = 127;
					if (arg1 == local12 && local12 > 0) {
						Static44.anIntArrayArrayArray3[0][local12][local3] = Static44.anIntArrayArrayArray3[0][local12 - 1][local3];
					}
					if (local12 == arg1 + arg3 && local12 < 103) {
						Static44.anIntArrayArrayArray3[0][local12][local3] = Static44.anIntArrayArrayArray3[0][local12 + 1][local3];
					}
					if (local3 == arg0 && local3 > 0) {
						Static44.anIntArrayArrayArray3[0][local12][local3] = Static44.anIntArrayArrayArray3[0][local12][local3 - 1];
					}
					if (local3 == arg0 + arg2 && local3 < 103) {
						Static44.anIntArrayArrayArray3[0][local12][local3] = Static44.anIntArrayArrayArray3[0][local12][local3 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BZ)V")
	public static void method73(@OriginalArg(1) boolean arg0) {
		for (@Pc(8) int local8 = 0; local8 < Static33.anInt854; local8++) {
			@Pc(16) Class1_Sub1_Sub1_Sub5_Sub1 local16 = Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3[Static54.anIntArray248[local8]];
			@Pc(24) int local24 = (Static54.anIntArray248[local8] << 14) + 536870912;
			if (local16 != null && local16.method931() && arg0 == local16.aClass1_Sub1_Sub5_1.aBoolean61 && local16.aClass1_Sub1_Sub5_1.method1046()) {
				@Pc(53) int local53 = local16.anInt1261 >> 7;
				@Pc(58) int local58 = local16.anInt1271 >> 7;
				if (local53 >= 0 && local53 < 104 && local58 >= 0 && local58 < 104) {
					if (local16.anInt1248 == 1 && (local16.anInt1261 & 0x7F) == 64 && (local16.anInt1271 & 0x7F) == 64) {
						if (Static45.anInt1444 == Static41.anIntArrayArray13[local53][local58]) {
							continue;
						}
						Static41.anIntArrayArray13[local53][local58] = Static45.anInt1444;
					}
					if (!local16.aClass1_Sub1_Sub5_1.aBoolean59) {
						local24 += Integer.MIN_VALUE;
					}
					Static129.aClass9_1.method315(Static22.anInt635, local16.anInt1261, local16.anInt1271, Static77.method1476(local16.anInt1271 + (local16.anInt1248 - 1) * 64, Static22.anInt635, local16.anInt1261 + local16.anInt1248 * 64 - 64), local16.anInt1248 * 64 + 60 - 64, local16, local16.anInt1290, local24, local16.aBoolean44);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZII)I")
	public static int method74(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(29) int local29 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local29;
		}
		return arg1;
	}
}

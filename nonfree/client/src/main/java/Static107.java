import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!vc", name = "Y", descriptor = "I")
	public static int anInt2743;

	@OriginalMember(owner = "client!vc", name = "ab", descriptor = "I")
	public static int anInt2745;

	@OriginalMember(owner = "client!vc", name = "Gb", descriptor = "I")
	public static int anInt2766;

	@OriginalMember(owner = "client!vc", name = "Zb", descriptor = "I")
	public static int anInt2775;

	@OriginalMember(owner = "client!vc", name = "ac", descriptor = "Lclient!oc;")
	public static Class34 aClass34_78;

	@OriginalMember(owner = "client!vc", name = "fb", descriptor = "Lclient!de;")
	public static Class14 aClass14_7 = new Class14(4096);

	@OriginalMember(owner = "client!vc", name = "hb", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1582 = Static15.method178("Please contact customer support)3");

	@OriginalMember(owner = "client!vc", name = "mb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1583 = aClass23_1582;

	@OriginalMember(owner = "client!vc", name = "Mb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1585 = Static15.method178("Lade Texturen )2 ");

	@OriginalMember(owner = "client!vc", name = "Pb", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1587 = Static15.method178("Report abuse");

	@OriginalMember(owner = "client!vc", name = "Nb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1586 = aClass23_1587;

	@OriginalMember(owner = "client!vc", name = "Ub", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1588 = Static15.method178("Lade Freunde)2Liste)3)3)3");

	@OriginalMember(owner = "client!vc", name = "Vb", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1589 = Static15.method178("button near the top of that page)3");

	@OriginalMember(owner = "client!vc", name = "Wb", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1590 = Static15.method178("Enter your username (V password)3");

	@OriginalMember(owner = "client!vc", name = "Xb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1591 = Static15.method178("p11_full");

	@OriginalMember(owner = "client!vc", name = "Yb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1592 = aClass23_1590;

	@OriginalMember(owner = "client!vc", name = "bc", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1593 = aClass23_1589;

	@OriginalMember(owner = "client!vc", name = "cc", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1594 = Static15.method178("Cabbage");

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!gd;Lclient!gd;Lclient!rb;)Lclient!hd;")
	public static Class1_Sub1_Sub6_Sub1 method1815(@OriginalArg(1) Class23 arg0, @OriginalArg(2) Class23 arg1, @OriginalArg(3) Class55 arg2) {
		@Pc(13) int local13 = arg2.method1885(arg1);
		@Pc(19) int local19 = arg2.method1876(local13, arg0);
		return Static76.method1337(local13, local19, arg2);
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)V")
	public static void method1817() {
		aClass23_1586 = null;
		aClass23_1582 = null;
		aClass23_1590 = null;
		aClass14_7 = null;
		aClass34_78 = null;
		aClass23_1589 = null;
		aClass23_1587 = null;
		aClass23_1593 = null;
		aClass23_1591 = null;
		aClass23_1594 = null;
		aClass23_1588 = null;
		aClass23_1583 = null;
		aClass23_1592 = null;
		aClass23_1585 = null;
	}

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "(I)V")
	public static void method1818() {
		@Pc(13) int local13;
		for (@Pc(7) int local7 = 10; local7 < 117; local7++) {
			local13 = (int) (Math.random() * 100.0D);
			if (local13 < 50) {
				Static44.anIntArray176[local7 + 32512] = 255;
			}
		}
		@Pc(41) int local41;
		@Pc(48) int local48;
		@Pc(54) int local54;
		for (local13 = 0; local13 < 100; local13++) {
			local41 = (int) (Math.random() * 124.0D) + 2;
			local48 = (int) (Math.random() * 128.0D) + 128;
			local54 = (local48 << 7) + local41;
			Static44.anIntArray176[local54] = 192;
		}
		for (local41 = 1; local41 < 255; local41++) {
			for (local48 = 1; local48 < 127; local48++) {
				local54 = (local41 << 7) + local48;
				Static64.anIntArray227[local54] = (Static44.anIntArray176[local54 - 1] + Static44.anIntArray176[local54 + 1] + Static44.anIntArray176[local54 - 128] + Static44.anIntArray176[local54 + 128]) / 4;
			}
		}
		Static100.anInt2593 += 128;
		if (Static28.anIntArray261.length < Static100.anInt2593) {
			local48 = (int) (Math.random() * 12.0D);
			Static100.anInt2593 -= Static28.anIntArray261.length;
			Static25.method412(Static12.aClass1_Sub1_Sub6_Sub3Array9[local48]);
		}
		@Pc(155) int local155;
		for (local48 = 1; local48 < 255; local48++) {
			for (local54 = 1; local54 < 127; local54++) {
				local155 = local54 + (local48 << 7);
				@Pc(175) int local175 = Static64.anIntArray227[local155 + 128] - Static28.anIntArray261[Static100.anInt2593 + local155 & Static28.anIntArray261.length + -1] / 5;
				if (local175 < 0) {
					local175 = 0;
				}
				Static44.anIntArray176[local155] = local175;
			}
		}
		for (local54 = 0; local54 < 255; local54++) {
			Static42.anIntArray171[local54] = Static42.anIntArray171[local54 + 1];
		}
		Static42.anIntArray171[255] = (int) (Math.sin((double) Static7.anInt176 / 14.0D) * 16.0D + Math.sin((double) Static7.anInt176 / 15.0D) * 14.0D + Math.sin((double) Static7.anInt176 / 16.0D) * 12.0D);
		if (Static21.anInt693 > 0) {
			Static21.anInt693 -= 4;
		}
		if (Static31.anInt961 > 0) {
			Static31.anInt961 -= 4;
		}
		if (Static31.anInt961 != 0 || Static21.anInt693 != 0) {
			return;
		}
		local155 = (int) (Math.random() * 2000.0D);
		if (local155 == 1) {
			Static21.anInt693 = 1024;
		}
		if (local155 == 0) {
			Static31.anInt961 = 1024;
			return;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIZIIIIBI)Z")
	public static boolean method1822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 104; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				Static8.anIntArrayArray7[local3][local7] = 0;
				Static112.anIntArrayArray75[local3][local7] = 99999999;
			}
		}
		local7 = arg1;
		Static8.anIntArrayArray7[arg1][arg4] = 99;
		@Pc(48) byte local48 = 0;
		@Pc(50) int local50 = arg4;
		@Pc(56) boolean local56 = false;
		Static112.anIntArrayArray75[arg1][arg4] = 0;
		Static60.anIntArray207[0] = arg1;
		@Pc(68) int local68 = 0;
		@Pc(71) int local71 = local48 + 1;
		Static9.anIntArray39[0] = arg4;
		@Pc(76) int local76 = Static60.anIntArray207.length;
		@Pc(81) int[][] local81 = Static45.aClass50Array1[Static79.anInt2137].anIntArrayArray44;
		@Pc(190) int local190;
		while (local68 != local71) {
			local50 = Static9.anIntArray39[local68];
			local7 = Static60.anIntArray207[local68];
			local68 = (local68 + 1) % local76;
			if (local7 == arg2 && local50 == arg3) {
				local56 = true;
				break;
			}
			if (arg0 != 0) {
				if ((arg0 < 5 || arg0 == 10) && Static45.aClass50Array1[Static79.anInt2137].method1354(arg7, arg3, arg2, local50, local7, arg0 - 1)) {
					local56 = true;
					break;
				}
				if (arg0 < 10 && Static45.aClass50Array1[Static79.anInt2137].method1358(arg7, arg2, arg0 - 1, local7, arg3, local50)) {
					local56 = true;
					break;
				}
			}
			if (arg8 != 0 && arg6 != 0 && Static45.aClass50Array1[Static79.anInt2137].method1353(arg2, local50, arg8, arg10, arg3, local7, arg6)) {
				local56 = true;
				break;
			}
			local190 = Static112.anIntArrayArray75[local7][local50] + 1;
			if (local7 > 0 && Static8.anIntArrayArray7[local7 - 1][local50] == 0 && (local81[local7 - 1][local50] & 0x1280108) == 0) {
				Static60.anIntArray207[local71] = local7 - 1;
				Static9.anIntArray39[local71] = local50;
				local71 = (local71 + 1) % local76;
				Static8.anIntArrayArray7[local7 - 1][local50] = 2;
				Static112.anIntArrayArray75[local7 - 1][local50] = local190;
			}
			if (local7 < 103 && Static8.anIntArrayArray7[local7 + 1][local50] == 0 && (local81[local7 + 1][local50] & 0x1280180) == 0) {
				Static60.anIntArray207[local71] = local7 + 1;
				Static9.anIntArray39[local71] = local50;
				Static8.anIntArrayArray7[local7 + 1][local50] = 8;
				Static112.anIntArrayArray75[local7 + 1][local50] = local190;
				local71 = (local71 + 1) % local76;
			}
			if (local50 > 0 && Static8.anIntArrayArray7[local7][local50 - 1] == 0 && (local81[local7][local50 - 1] & 0x1280102) == 0) {
				Static60.anIntArray207[local71] = local7;
				Static9.anIntArray39[local71] = local50 - 1;
				Static8.anIntArrayArray7[local7][local50 - 1] = 1;
				Static112.anIntArrayArray75[local7][local50 - 1] = local190;
				local71 = (local71 + 1) % local76;
			}
			if (local50 < 103 && Static8.anIntArrayArray7[local7][local50 + 1] == 0 && (local81[local7][local50 + 1] & 0x1280120) == 0) {
				Static60.anIntArray207[local71] = local7;
				Static9.anIntArray39[local71] = local50 + 1;
				local71 = (local71 + 1) % local76;
				Static8.anIntArrayArray7[local7][local50 + 1] = 4;
				Static112.anIntArrayArray75[local7][local50 + 1] = local190;
			}
			if (local7 > 0 && local50 > 0 && Static8.anIntArrayArray7[local7 - 1][local50 - 1] == 0 && (local81[local7 - 1][local50 - 1] & 0x128010E) == 0 && (local81[local7 - 1][local50] & 0x1280108) == 0 && (local81[local7][local50 - 1] & 0x1280102) == 0) {
				Static60.anIntArray207[local71] = local7 - 1;
				Static9.anIntArray39[local71] = local50 - 1;
				Static8.anIntArrayArray7[local7 - 1][local50 - 1] = 3;
				local71 = (local71 + 1) % local76;
				Static112.anIntArrayArray75[local7 - 1][local50 - 1] = local190;
			}
			if (local7 < 103 && local50 > 0 && Static8.anIntArrayArray7[local7 + 1][local50 - 1] == 0 && (local81[local7 + 1][local50 - 1] & 0x1280183) == 0 && (local81[local7 + 1][local50] & 0x1280180) == 0 && (local81[local7][local50 - 1] & 0x1280102) == 0) {
				Static60.anIntArray207[local71] = local7 + 1;
				Static9.anIntArray39[local71] = local50 - 1;
				local71 = (local71 + 1) % local76;
				Static8.anIntArrayArray7[local7 + 1][local50 - 1] = 9;
				Static112.anIntArrayArray75[local7 + 1][local50 - 1] = local190;
			}
			if (local7 > 0 && local50 < 103 && Static8.anIntArrayArray7[local7 - 1][local50 + 1] == 0 && (local81[local7 - 1][local50 + 1] & 0x1280138) == 0 && (local81[local7 - 1][local50] & 0x1280108) == 0 && (local81[local7][local50 + 1] & 0x1280120) == 0) {
				Static60.anIntArray207[local71] = local7 - 1;
				Static9.anIntArray39[local71] = local50 + 1;
				Static8.anIntArrayArray7[local7 - 1][local50 + 1] = 6;
				local71 = (local71 + 1) % local76;
				Static112.anIntArrayArray75[local7 - 1][local50 + 1] = local190;
			}
			if (local7 < 103 && local50 < 103 && Static8.anIntArrayArray7[local7 + 1][local50 + 1] == 0 && (local81[local7 + 1][local50 + 1] & 0x12801E0) == 0 && (local81[local7 + 1][local50] & 0x1280180) == 0 && (local81[local7][local50 + 1] & 0x1280120) == 0) {
				Static60.anIntArray207[local71] = local7 + 1;
				Static9.anIntArray39[local71] = local50 + 1;
				Static8.anIntArrayArray7[local7 + 1][local50 + 1] = 12;
				local71 = (local71 + 1) % local76;
				Static112.anIntArrayArray75[local7 + 1][local50 + 1] = local190;
			}
		}
		Static89.anInt2390 = 0;
		@Pc(827) int local827;
		@Pc(834) int local834;
		@Pc(840) int local840;
		if (!local56) {
			if (!arg5) {
				return false;
			}
			local190 = 1000;
			local827 = 100;
			for (local834 = arg2 - 10; local834 <= arg2 + 10; local834++) {
				for (local840 = arg3 - 10; local840 <= arg3 + 10; local840++) {
					if (local834 >= 0 && local840 >= 0 && local834 < 104 && local840 < 104 && Static112.anIntArrayArray75[local834][local840] < 100) {
						@Pc(867) int local867 = 0;
						if (arg2 > local834) {
							local867 = arg2 - local834;
						} else if (local834 > arg2 + arg8 - 1) {
							local867 = local834 + 1 - arg2 - arg8;
						}
						@Pc(903) int local903 = 0;
						if (arg3 > local840) {
							local903 = arg3 - local840;
						} else if (local840 > arg6 + arg3 - 1) {
							local903 = local840 + 1 - arg6 - arg3;
						}
						@Pc(944) int local944 = local867 * local867 + local903 * local903;
						if (local190 > local944 || local944 == local190 && local827 > Static112.anIntArrayArray75[local834][local840]) {
							local50 = local840;
							local827 = Static112.anIntArrayArray75[local834][local840];
							local7 = local834;
							local190 = local944;
						}
					}
				}
			}
			if (local190 == 1000) {
				return false;
			}
			if (local7 == arg1 && arg4 == local50) {
				return false;
			}
			Static89.anInt2390 = 1;
		}
		@Pc(1008) byte local1008 = 0;
		Static60.anIntArray207[0] = local7;
		local68 = local1008 + 1;
		Static9.anIntArray39[0] = local50;
		local190 = local827 = Static8.anIntArrayArray7[local7][local50];
		while (arg1 != local7 || local50 != arg4) {
			if (local190 != local827) {
				Static60.anIntArray207[local68] = local7;
				Static9.anIntArray39[local68++] = local50;
				local827 = local190;
			}
			if ((local190 & 0x2) != 0) {
				local7++;
			} else if ((local190 & 0x8) != 0) {
				local7--;
			}
			if ((local190 & 0x1) != 0) {
				local50++;
			} else if ((local190 & 0x4) != 0) {
				local50--;
			}
			local190 = Static8.anIntArrayArray7[local7][local50];
		}
		if (local68 > 0) {
			local76 = local68--;
			if (local76 > 25) {
				local76 = 25;
			}
			@Pc(1111) int local1111 = Static60.anIntArray207[local68];
			local834 = Static9.anIntArray39[local68];
			if (arg9 == 0) {
				Static76.aClass1_Sub5_Sub1_2.method731(251);
				Static76.aClass1_Sub5_Sub1_2.method674(local76 + local76 + 3);
			}
			if (arg9 == 1) {
				Static76.aClass1_Sub5_Sub1_2.method731(21);
				Static76.aClass1_Sub5_Sub1_2.method674(local76 + local76 + 14 + 3);
			}
			if (arg9 == 2) {
				Static76.aClass1_Sub5_Sub1_2.method731(69);
				Static76.aClass1_Sub5_Sub1_2.method674(local76 + local76 + 3);
			}
			Static40.anInt1397 = Static60.anIntArray207[0];
			Static28.anInt2178 = Static9.anIntArray39[0];
			for (local840 = 1; local840 < local76; local840++) {
				local68--;
				Static76.aClass1_Sub5_Sub1_2.method704(Static60.anIntArray207[local68] - local1111);
				Static76.aClass1_Sub5_Sub1_2.method698(Static9.anIntArray39[local68] - local834);
			}
			Static76.aClass1_Sub5_Sub1_2.method674(Static90.aBooleanArray10[82] ? 1 : 0);
			Static76.aClass1_Sub5_Sub1_2.method719(anInt2745 + local834);
			Static76.aClass1_Sub5_Sub1_2.method689(local1111 + Static104.anInt2684);
			return true;
		} else if (arg9 == 1) {
			return false;
		} else {
			return true;
		}
	}
}

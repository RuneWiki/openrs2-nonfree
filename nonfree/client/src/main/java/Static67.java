import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!m", name = "e", descriptor = "Lclient!ke;")
	public static Class41_Sub1 aClass41_Sub1_12;

	@OriginalMember(owner = "client!m", name = "l", descriptor = "I")
	public static int anInt1531;

	@OriginalMember(owner = "client!m", name = "m", descriptor = "Lclient!h;")
	public static Class32 aClass32_1;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "Lclient!rd;")
	private static Class64 aClass64_954 = Static69.method1153("System update in: ");

	@OriginalMember(owner = "client!m", name = "c", descriptor = "Lclient!rd;")
	public static Class64 aClass64_955 = aClass64_954;

	@OriginalMember(owner = "client!m", name = "d", descriptor = "I")
	public static int anInt1528 = 0;

	@OriginalMember(owner = "client!m", name = "f", descriptor = "Lclient!rd;")
	public static Class64 aClass64_956 = Static69.method1153("gleiten:");

	@OriginalMember(owner = "client!m", name = "g", descriptor = "Lclient!rd;")
	public static Class64 aClass64_957 = Static69.method1153("null");

	@OriginalMember(owner = "client!m", name = "h", descriptor = "Lclient!rd;")
	public static Class64 aClass64_958 = Static69.method1153("backvmid2");

	@OriginalMember(owner = "client!m", name = "k", descriptor = "Lclient!rd;")
	public static Class64 aClass64_959 = Static69.method1153("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <AUS>");

	@OriginalMember(owner = "client!m", name = "n", descriptor = "Lclient!rd;")
	public static Class64 aClass64_960 = Static69.method1153("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
	public static void method1131() {
		while (true) {
			if (Static64.aClass1_Sub6_Sub1_2.method1881(Static62.anInt1454) >= 11) {
				@Pc(27) int local27 = Static64.aClass1_Sub6_Sub1_2.method1873(11);
				if (local27 != 2047) {
					@Pc(32) boolean local32 = false;
					if (Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local27] == null) {
						local32 = true;
						Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local27] = new Class1_Sub1_Sub2_Sub1_Sub2();
						if (Static98.aClass1_Sub6Array1[local27] != null) {
							Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local27].method1697(Static98.aClass1_Sub6Array1[local27]);
						}
					}
					Static90.anIntArray69[Static6.anInt319++] = local27;
					@Pc(70) Class1_Sub1_Sub2_Sub1_Sub2 local70 = Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local27];
					local70.anInt2377 = Static15.anInt471;
					@Pc(78) int local78 = Static64.aClass1_Sub6_Sub1_2.method1873(5);
					if (local78 > 15) {
						local78 -= 32;
					}
					@Pc(91) int local91 = Static13.anIntArray66[Static64.aClass1_Sub6_Sub1_2.method1873(3)];
					if (local32) {
						local70.anInt2363 = local91;
					}
					@Pc(101) int local101 = Static64.aClass1_Sub6_Sub1_2.method1873(1);
					if (local101 == 1) {
						Static96.anIntArray436[Static39.anInt914++] = local27;
					}
					@Pc(117) int local117 = Static64.aClass1_Sub6_Sub1_2.method1873(5);
					if (local117 > 15) {
						local117 -= 32;
					}
					@Pc(128) int local128 = Static64.aClass1_Sub6_Sub1_2.method1873(1);
					local70.method1689(local128 == 1, local117 + Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0] - -local78);
					continue;
				}
			}
			Static64.aClass1_Sub6_Sub1_2.method1878();
			return;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	public static void method1132() {
		aClass41_Sub1_12 = null;
		aClass64_958 = null;
		aClass64_957 = null;
		aClass64_956 = null;
		aClass64_959 = null;
		aClass64_960 = null;
		aClass64_954 = null;
		aClass64_955 = null;
		aClass32_1 = null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIII)V")
	public static void method1133(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = arg3; local7 <= arg2 + arg3; local7++) {
			for (@Pc(16) int local16 = arg0; local16 <= arg0 + arg1; local16++) {
				if (local16 >= 0 && local16 < 104 && local7 >= 0 && local7 < 104) {
					Static110.aByteArrayArrayArray7[0][local16][local7] = 127;
					if (arg0 == local16 && local16 > 0) {
						Static102.anIntArrayArrayArray5[0][local16][local7] = Static102.anIntArrayArrayArray5[0][local16 - 1][local7];
					}
					if (arg0 + arg1 == local16 && local16 < 103) {
						Static102.anIntArrayArrayArray5[0][local16][local7] = Static102.anIntArrayArrayArray5[0][local16 + 1][local7];
					}
					if (local7 == arg3 && local7 > 0) {
						Static102.anIntArrayArrayArray5[0][local16][local7] = Static102.anIntArrayArrayArray5[0][local16][local7 - 1];
					}
					if (arg2 + arg3 == local7 && local7 < 103) {
						Static102.anIntArrayArrayArray5[0][local16][local7] = Static102.anIntArrayArrayArray5[0][local16][local7 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "([Ljava/lang/Object;IIIILclient!nd;Lclient!nd;)V")
	public static void method1134(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class1_Sub1_Sub11 arg4, @OriginalArg(6) Class1_Sub1_Sub11 arg5) {
		@Pc(7) int local7 = (Integer) arg0[0];
		@Pc(11) Class1_Sub1_Sub18 local11 = Static100.method1611(local7);
		if (local11 == null) {
			return;
		}
		@Pc(25) int local25 = -1;
		@Pc(27) int local27 = 0;
		@Pc(30) int[] local30 = local11.anIntArray451;
		@Pc(33) int[] local33 = local11.anIntArray450;
		@Pc(35) int local35 = 0;
		@Pc(37) byte local37 = -1;
		try {
			@Pc(39) int local39 = 0;
			Static7.aClass64Array3 = new Class64[local11.anInt2844];
			Static57.anIntArray185 = new int[local11.anInt2836];
			@Pc(49) int local49 = 0;
			@Pc(79) int local79;
			for (@Pc(51) int local51 = 1; local51 < arg0.length; local51++) {
				if (arg0[local51] instanceof Integer) {
					local79 = (Integer) arg0[local51];
					if (local79 == -2147483647) {
						local79 = arg1;
					}
					if (local79 == -2147483646) {
						local79 = arg3;
					}
					if (local79 == -2147483645) {
						local79 = arg5 == null ? -1 : arg5.anInt1717;
					}
					if (local79 == -2147483644) {
						local79 = arg2;
					}
					if (local79 == -2147483643) {
						local79 = arg5 == null ? -1 : arg5.anInt1742;
					}
					if (local79 == -2147483642) {
						local79 = arg4 == null ? -1 : arg4.anInt1717;
					}
					if (local79 == -2147483641) {
						local79 = arg4 == null ? -1 : arg4.anInt1742;
					}
					Static57.anIntArray185[local39++] = local79;
				} else if (arg0[local51] instanceof Class64) {
					Static7.aClass64Array3[local49++] = (Class64) arg0[local51];
				}
			}
			local79 = 0;
			label1237: while (true) {
				local79++;
				if (local79 > 200000) {
					throw new RuntimeException("slow");
				}
				local25++;
				@Pc(174) int local174 = local30[local25];
				@Pc(713) int local713;
				@Pc(534) Class64 local534;
				@Pc(725) int local725;
				@Pc(578) int local578;
				@Pc(600) int local600;
				if (local174 < 100) {
					if (local174 == 0) {
						Static95.anIntArray317[local27++] = local33[local25];
						continue;
					}
					@Pc(198) int local198;
					if (local174 == 1) {
						local198 = local33[local25];
						Static95.anIntArray317[local27++] = Static101.anIntArray333[local198];
						continue;
					}
					if (local174 == 2) {
						local198 = local33[local25];
						local27--;
						Static101.anIntArray333[local198] = Static95.anIntArray317[local27];
						continue;
					}
					if (local174 == 3) {
						Static14.aClass64Array6[local35++] = local11.aClass64Array18[local25];
						continue;
					}
					if (local174 == 6) {
						local25 += local33[local25];
						continue;
					}
					if (local174 == 7) {
						local27 -= 2;
						if (Static95.anIntArray317[local27 + 1] != Static95.anIntArray317[local27]) {
							local25 += local33[local25];
						}
						continue;
					}
					if (local174 == 8) {
						local27 -= 2;
						if (Static95.anIntArray317[local27] == Static95.anIntArray317[local27 + 1]) {
							local25 += local33[local25];
						}
						continue;
					}
					if (local174 == 9) {
						local27 -= 2;
						if (Static95.anIntArray317[local27] < Static95.anIntArray317[local27 + 1]) {
							local25 += local33[local25];
						}
						continue;
					}
					if (local174 == 10) {
						local27 -= 2;
						if (Static95.anIntArray317[local27 + 1] < Static95.anIntArray317[local27]) {
							local25 += local33[local25];
						}
						continue;
					}
					if (local174 == 21) {
						if (Static39.anInt916 == 0) {
							return;
						}
						@Pc(353) Class14 local353 = Static11.aClass14Array1[--Static39.anInt916];
						Static7.aClass64Array3 = local353.aClass64Array7;
						local25 = local353.anInt469;
						Static57.anIntArray185 = local353.anIntArray67;
						local11 = local353.aClass1_Sub1_Sub18_1;
						local30 = local11.anIntArray451;
						local33 = local11.anIntArray450;
						continue;
					}
					if (local174 == 25) {
						local198 = local33[local25];
						Static95.anIntArray317[local27++] = Static75.method1253(local198);
						continue;
					}
					if (local174 == 27) {
						local198 = local33[local25];
						local27--;
						Static84.method1390(Static95.anIntArray317[local27], local198);
						continue;
					}
					if (local174 == 31) {
						local27 -= 2;
						if (Static95.anIntArray317[local27 + 1] >= Static95.anIntArray317[local27]) {
							local25 += local33[local25];
						}
						continue;
					}
					if (local174 == 32) {
						local27 -= 2;
						if (Static95.anIntArray317[local27] >= Static95.anIntArray317[local27 + 1]) {
							local25 += local33[local25];
						}
						continue;
					}
					if (local174 == 33) {
						Static95.anIntArray317[local27++] = Static57.anIntArray185[local33[local25]];
						continue;
					}
					@Pc(478) int local478;
					if (local174 == 34) {
						local478 = local33[local25];
						local27--;
						Static57.anIntArray185[local478] = Static95.anIntArray317[local27];
						continue;
					}
					if (local174 == 35) {
						Static14.aClass64Array6[local35++] = Static7.aClass64Array3[local33[local25]];
						continue;
					}
					if (local174 == 36) {
						local478 = local33[local25];
						local35--;
						Static7.aClass64Array3[local478] = Static14.aClass64Array6[local35];
						continue;
					}
					if (local174 == 37) {
						local198 = local33[local25];
						local35 -= local198;
						local534 = Static49.method892(Static14.aClass64Array6, local198, local35);
						Static14.aClass64Array6[local35++] = local534;
						continue;
					}
					if (local174 == 38) {
						local27--;
						continue;
					}
					if (local174 == 39) {
						local35--;
						continue;
					}
					if (local174 == 40) {
						local198 = local33[local25];
						@Pc(568) Class1_Sub1_Sub18 local568 = Static100.method1611(local198);
						@Pc(572) Class64[] local572 = new Class64[local568.anInt2844];
						@Pc(576) int[] local576 = new int[local568.anInt2836];
						for (local578 = 0; local578 < local568.anInt2839; local578++) {
							local576[local578] = Static95.anIntArray317[local27 + local578 - local568.anInt2839];
						}
						for (local600 = 0; local600 < local568.anInt2837; local600++) {
							local572[local600] = Static14.aClass64Array6[local600 + local35 - local568.anInt2837];
						}
						local35 -= local568.anInt2837;
						local27 -= local568.anInt2839;
						@Pc(637) Class14 local637 = new Class14();
						local637.aClass64Array7 = Static7.aClass64Array3;
						local637.anInt469 = local25;
						local25 = -1;
						local637.anIntArray67 = Static57.anIntArray185;
						local637.aClass1_Sub1_Sub18_1 = local11;
						local11 = local568;
						Static11.aClass14Array1[Static39.anInt916++] = local637;
						local30 = local568.anIntArray451;
						local33 = local568.anIntArray450;
						Static57.anIntArray185 = local576;
						Static7.aClass64Array3 = local572;
						continue;
					}
					if (local174 == 42) {
						Static95.anIntArray317[local27++] = Static66.anIntArray235[local33[local25]];
						continue;
					}
					if (local174 == 43) {
						local478 = local33[local25];
						local27--;
						Static66.anIntArray235[local478] = Static95.anIntArray317[local27];
						continue;
					}
					if (local174 == 44) {
						local27--;
						local713 = Static95.anIntArray317[local27];
						local198 = local33[local25] >> 16;
						local725 = local33[local25] & 0xFFFF;
						if (local713 >= 0 && local713 <= 5000) {
							@Pc(741) byte local741 = -1;
							Static19.anIntArray78[local198] = local713;
							if (local725 == 105) {
								local741 = 0;
							}
							local578 = 0;
							while (true) {
								if (local578 >= local713) {
									continue label1237;
								}
								Static58.anIntArrayArray11[local198][local578] = local741;
								local578++;
							}
						}
						throw new RuntimeException();
					}
					if (local174 == 45) {
						local198 = local33[local25];
						local27--;
						local725 = Static95.anIntArray317[local27];
						if (local725 >= 0 && local725 < Static19.anIntArray78[local198]) {
							Static95.anIntArray317[local27++] = Static58.anIntArrayArray11[local198][local725];
							continue;
						}
						throw new RuntimeException();
					}
					if (local174 == 46) {
						local198 = local33[local25];
						local27 -= 2;
						local725 = Static95.anIntArray317[local27];
						if (local725 >= 0 && Static19.anIntArray78[local198] > local725) {
							Static58.anIntArrayArray11[local198][local725] = Static95.anIntArray317[local27 + 1];
							continue;
						}
						throw new RuntimeException();
					}
				}
				@Pc(853) boolean local853;
				if (local33[local25] == 1) {
					local853 = true;
				} else {
					local853 = false;
				}
				@Pc(1010) Class1_Sub1_Sub11 local1010;
				@Pc(872) int local872;
				@Pc(916) int local916;
				if (local174 < 1000) {
					if (local174 == 100) {
						local27 -= 3;
						local872 = Static95.anIntArray317[local27 + 2];
						local713 = Static95.anIntArray317[local27 + 1];
						local725 = Static95.anIntArray317[local27];
						if (local713 == 0) {
							throw new RuntimeException();
						}
						@Pc(895) Class1_Sub1_Sub11 local895 = Static12.method1397(local725);
						if (local895.aClass1_Sub1_Sub11Array2 == null) {
							local895.aClass1_Sub1_Sub11Array2 = new Class1_Sub1_Sub11[local872 + 1];
						}
						if (local895.aClass1_Sub1_Sub11Array2.length <= local872) {
							@Pc(914) Class1_Sub1_Sub11[] local914 = new Class1_Sub1_Sub11[local872 + 1];
							for (local916 = 0; local916 < local895.aClass1_Sub1_Sub11Array2.length; local916++) {
								local914[local916] = local895.aClass1_Sub1_Sub11Array2[local916];
							}
							local895.aClass1_Sub1_Sub11Array2 = local914;
						}
						if (local872 > 0 && local895.aClass1_Sub1_Sub11Array2[local872 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local872 - 1));
						}
						@Pc(967) Class1_Sub1_Sub11 local967 = new Class1_Sub1_Sub11();
						local967.anInt1697 = local713;
						local967.anInt1742 = local872;
						local967.aBoolean95 = true;
						local967.anInt1739 = local967.anInt1717 = local895.anInt1717;
						local895.aClass1_Sub1_Sub11Array2[local872] = local967;
						if (local853) {
							Static95.aClass1_Sub1_Sub11_4 = local967;
						} else {
							Static68.aClass1_Sub1_Sub11_2 = local967;
						}
						Static90.method346(local895);
						continue;
					}
					if (local174 == 101) {
						local1010 = local853 ? Static95.aClass1_Sub1_Sub11_4 : Static68.aClass1_Sub1_Sub11_2;
						@Pc(1015) Class1_Sub1_Sub11 local1015 = Static12.method1397(local1010.anInt1717);
						local1015.aClass1_Sub1_Sub11Array2[local1010.anInt1742] = null;
						Static90.method346(local1015);
						continue;
					}
					if (local174 == 102) {
						local27--;
						local1010 = Static12.method1397(Static95.anIntArray317[local27]);
						local1010.aClass1_Sub1_Sub11Array2 = null;
						Static90.method346(local1010);
						continue;
					}
					if (local174 == 200) {
						local27 -= 2;
						local725 = Static95.anIntArray317[local27];
						local713 = Static95.anIntArray317[local27 + 1];
						@Pc(1067) Class1_Sub1_Sub11 local1067 = Static75.method1258(local725, local713);
						if (local1067 != null && local713 != -1) {
							Static95.anIntArray317[local27++] = 1;
							if (local853) {
								Static95.aClass1_Sub1_Sub11_4 = local1067;
							} else {
								Static68.aClass1_Sub1_Sub11_2 = local1067;
							}
							continue;
						}
						Static95.anIntArray317[local27++] = 0;
						continue;
					}
				} else if (local174 >= 1000 && local174 < 1100 || local174 >= 2000 && local174 < 2100) {
					if (local174 < 2000) {
						local1010 = local853 ? Static95.aClass1_Sub1_Sub11_4 : Static68.aClass1_Sub1_Sub11_2;
					} else {
						local174 -= 1000;
						local27--;
						local1010 = Static12.method1397(Static95.anIntArray317[local27]);
					}
					Static90.method346(local1010);
					if (local174 == 1000) {
						local27 -= 2;
						local1010.anInt1690 = Static95.anIntArray317[local27];
						local1010.anInt1702 = Static95.anIntArray317[local27 + 1];
						continue;
					}
					if (local174 == 1001) {
						local27 -= 2;
						local1010.anInt1700 = Static95.anIntArray317[local27];
						local1010.anInt1707 = Static95.anIntArray317[local27 + 1];
						continue;
					}
					if (local174 == 1003) {
						local27--;
						local1010.aBoolean104 = Static95.anIntArray317[local27] == 1;
						continue;
					}
				} else if (local174 >= 1100 && local174 < 1200 || !(local174 < 2100 || local174 >= 2200)) {
					if (local174 < 2000) {
						local1010 = local853 ? Static95.aClass1_Sub1_Sub11_4 : Static68.aClass1_Sub1_Sub11_2;
					} else {
						local27--;
						local1010 = Static12.method1397(Static95.anIntArray317[local27]);
						local174 -= 1000;
					}
					Static90.method346(local1010);
					if (local174 == 1100) {
						local27 -= 2;
						local1010.anInt1706 = Static95.anIntArray317[local27];
						if (local1010.anInt1746 - local1010.anInt1700 < local1010.anInt1706) {
							local1010.anInt1706 = local1010.anInt1746 - local1010.anInt1700;
						}
						if (local1010.anInt1706 < 0) {
							local1010.anInt1706 = 0;
						}
						local1010.anInt1689 = Static95.anIntArray317[local27 + 1];
						if (local1010.anInt1689 > local1010.anInt1692 - local1010.anInt1707) {
							local1010.anInt1689 = local1010.anInt1692 - local1010.anInt1707;
						}
						if (local1010.anInt1689 < 0) {
							local1010.anInt1689 = 0;
						}
						continue;
					}
					if (local174 == 1101) {
						local27--;
						local1010.anInt1682 = Static95.anIntArray317[local27];
						continue;
					}
					if (local174 == 1102) {
						local27--;
						local1010.aBoolean106 = Static95.anIntArray317[local27] == 1;
						continue;
					}
					if (local174 == 1103) {
						local27--;
						local1010.anInt1726 = Static95.anIntArray317[local27];
						continue;
					}
					if (local174 == 1104) {
						local27--;
						local1010.anInt1728 = Static95.anIntArray317[local27];
						continue;
					}
					if (local174 == 1105) {
						local27--;
						local1010.anInt1683 = Static95.anIntArray317[local27];
						continue;
					}
					if (local174 == 1106) {
						local27--;
						local1010.anInt1744 = Static95.anIntArray317[local27];
						continue;
					}
					if (local174 == 1107) {
						local27--;
						local1010.aBoolean98 = Static95.anIntArray317[local27] == 1;
						continue;
					}
					if (local174 == 1108) {
						local1010.anInt1749 = 1;
						local27--;
						local1010.anInt1721 = Static95.anIntArray317[local27];
						continue;
					}
					if (local174 == 1109) {
						local27 -= 6;
						local1010.anInt1745 = Static95.anIntArray317[local27];
						local1010.anInt1715 = Static95.anIntArray317[local27 + 1];
						local1010.anInt1747 = Static95.anIntArray317[local27 + 2];
						local1010.anInt1752 = Static95.anIntArray317[local27 + 3];
						local1010.anInt1696 = Static95.anIntArray317[local27 + 4];
						local1010.anInt1686 = Static95.anIntArray317[local27 + 5];
						continue;
					}
					if (local174 == 1110) {
						local27--;
						local1010.anInt1695 = Static95.anIntArray317[local27];
						continue;
					}
					if (local174 == 1111) {
						local27--;
						local1010.aBoolean100 = Static95.anIntArray317[local27] == 1;
						continue;
					}
					if (local174 == 1112) {
						local35--;
						local1010.aClass64_1064 = Static14.aClass64Array6[local35];
						continue;
					}
					if (local174 == 1113) {
						local27--;
						local1010.anInt1703 = Static95.anIntArray317[local27];
						continue;
					}
					if (local174 == 1114) {
						local27 -= 3;
						local1010.anInt1737 = Static95.anIntArray317[local27];
						local1010.anInt1727 = Static95.anIntArray317[local27 + 1];
						local1010.anInt1684 = Static95.anIntArray317[local27 + 2];
						continue;
					}
					if (local174 == 1115) {
						local27--;
						local1010.aBoolean105 = Static95.anIntArray317[local27] == 1;
						continue;
					}
					if (local174 == 1116) {
						local27--;
						local1010.anInt1738 = Static95.anIntArray317[local27];
						continue;
					}
					if (local174 == 1117) {
						local27--;
						local1010.anInt1751 = Static95.anIntArray317[local27];
						continue;
					}
					if (local174 == 1118) {
						local27--;
						local1010.aBoolean99 = Static95.anIntArray317[local27] == 1;
						continue;
					}
					if (local174 == 1119) {
						local27--;
						local1010.aBoolean97 = Static95.anIntArray317[local27] == 1;
						continue;
					}
					if (local174 == 1120) {
						local27 -= 2;
						local1010.anInt1746 = Static95.anIntArray317[local27];
						local1010.anInt1692 = Static95.anIntArray317[local27 + 1];
						continue;
					}
				} else if (local174 >= 1200 && local174 < 1300 || local174 >= 2200 && local174 < 2300) {
					if (local174 < 2000) {
						local1010 = local853 ? Static95.aClass1_Sub1_Sub11_4 : Static68.aClass1_Sub1_Sub11_2;
					} else {
						local174 -= 1000;
						local27--;
						local1010 = Static12.method1397(Static95.anIntArray317[local27]);
					}
					Static90.method346(local1010);
					if (local174 == 1200) {
						local27 -= 2;
						local872 = Static95.anIntArray317[local27 + 1];
						local713 = Static95.anIntArray317[local27];
						local1010.anInt1719 = local872;
						local1010.anInt1736 = local713;
						@Pc(1700) Class1_Sub1_Sub6 local1700 = Static106.method1739(local713);
						local1010.anInt1715 = local1700.anInt972;
						local1010.anInt1696 = local1700.anInt979;
						local1010.anInt1747 = local1700.anInt995;
						local1010.anInt1745 = local1700.anInt994;
						local1010.anInt1686 = local1700.anInt984;
						local1010.anInt1752 = local1700.anInt971;
						if (local1010.anInt1700 > 0) {
							local1010.anInt1686 = local1010.anInt1686 * 32 / local1010.anInt1700;
						}
						continue;
					}
					if (local174 == 1201) {
						local1010.anInt1749 = 2;
						local27--;
						local1010.anInt1721 = Static95.anIntArray317[local27];
						continue;
					}
					if (local174 == 1202) {
						local1010.anInt1749 = 3;
						local1010.anInt1721 = Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass54_2.method1252();
						continue;
					}
				} else if (local174 >= 1300 && local174 < 1400 || local174 >= 2300 && local174 < 2400) {
					if (local174 < 2000) {
						local1010 = local853 ? Static95.aClass1_Sub1_Sub11_4 : Static68.aClass1_Sub1_Sub11_2;
					} else {
						local27--;
						local1010 = Static12.method1397(Static95.anIntArray317[local27]);
						local174 -= 1000;
					}
					if (local174 == 1300) {
						local27--;
						local713 = Static95.anIntArray317[local27] - 1;
						if (local713 >= 0 && local713 <= 9) {
							local35--;
							local1010.method1235(Static14.aClass64Array6[local35], local713);
							continue;
						}
						local35--;
						continue;
					}
					if (local174 == 1301) {
						local27 -= 2;
						local872 = Static95.anIntArray317[local27 + 1];
						local713 = Static95.anIntArray317[local27];
						local1010.aClass1_Sub1_Sub11_3 = Static75.method1258(local713, local872);
						continue;
					}
					if (local174 == 1302) {
						local27--;
						local1010.aBoolean101 = Static95.anIntArray317[local27] == 1;
						continue;
					}
					if (local174 == 1303) {
						local27--;
						local1010.anInt1731 = Static95.anIntArray317[local27];
						continue;
					}
					if (local174 == 1304) {
						local27--;
						local1010.anInt1708 = Static95.anIntArray317[local27];
						continue;
					}
					if (local174 == 1305) {
						local35--;
						local1010.aClass64_1068 = Static14.aClass64Array6[local35];
						continue;
					}
					if (local174 == 1306) {
						local35--;
						local1010.aClass64_1066 = Static14.aClass64Array6[local35];
						continue;
					}
				} else {
					@Pc(2327) Class64 local2327;
					if (local174 >= 1400 && local174 < 1500 || local174 >= 2400 && local174 < 2500) {
						if (local174 >= 2000) {
							local174 -= 1000;
							local27--;
							local1010 = Static12.method1397(Static95.anIntArray317[local27]);
						} else {
							local1010 = local853 ? Static95.aClass1_Sub1_Sub11_4 : Static68.aClass1_Sub1_Sub11_2;
						}
						local35--;
						local2327 = Static14.aClass64Array6[local35];
						@Pc(4222) Object[] local4222 = new Object[local2327.method1469() + 1];
						for (local578 = local4222.length - 1; local578 >= 1; local578--) {
							if (local2327.method1476(local578 - 1) == 115) {
								local35--;
								local4222[local578] = Static14.aClass64Array6[local35];
							} else {
								local27--;
								local4222[local578] = Integer.valueOf(Static95.anIntArray317[local27]);
							}
						}
						local27--;
						local4222[0] = Integer.valueOf(Static95.anIntArray317[local27]);
						if (local174 == 1410) {
							local1010.anObjectArray3 = local4222;
						}
						if (local174 == 1400) {
							local1010.anObjectArray7 = local4222;
						}
						if (local174 == 1412) {
							local1010.anObjectArray21 = local4222;
						}
						local1010.aBoolean96 = true;
						if (local174 == 1414) {
							local1010.anObjectArray9 = local4222;
						}
						if (local174 == 1404) {
							local1010.anObjectArray16 = local4222;
						}
						if (local174 == 1415) {
							local1010.anObjectArray17 = local4222;
						}
						if (local174 == 1411) {
							local1010.anObjectArray8 = local4222;
						}
						if (local174 == 1407) {
							local1010.anObjectArray19 = local4222;
						}
						if (local174 == 1402) {
							local1010.anObjectArray13 = local4222;
						}
						if (local174 == 1409) {
							local1010.anObjectArray20 = local4222;
						}
						if (local174 == 1408) {
							local1010.anObjectArray6 = local4222;
						}
						if (local174 == 1416) {
							local1010.anObjectArray10 = local4222;
						}
						if (local174 == 1401) {
							local1010.anObjectArray18 = local4222;
						}
						if (local174 == 1406) {
							local1010.anObjectArray15 = local4222;
						}
						if (local174 == 1403) {
							local1010.anObjectArray5 = local4222;
						}
						if (local174 == 1413) {
							local1010.anObjectArray14 = local4222;
						}
						if (local174 == 1405) {
							local1010.anObjectArray11 = local4222;
						}
						if (local174 == 1417) {
							local1010.anObjectArray12 = local4222;
						}
						continue;
					}
					if (local174 < 1600) {
						local1010 = local853 ? Static95.aClass1_Sub1_Sub11_4 : Static68.aClass1_Sub1_Sub11_2;
						if (local174 == 1500) {
							Static95.anIntArray317[local27++] = local1010.anInt1690;
							continue;
						}
						if (local174 == 1501) {
							Static95.anIntArray317[local27++] = local1010.anInt1702;
							continue;
						}
						if (local174 == 1502) {
							Static95.anIntArray317[local27++] = local1010.anInt1700;
							continue;
						}
						if (local174 == 1503) {
							Static95.anIntArray317[local27++] = local1010.anInt1707;
							continue;
						}
						if (local174 == 1504) {
							Static95.anIntArray317[local27++] = local1010.aBoolean104 ? 1 : 0;
							continue;
						}
						if (local174 == 1505) {
							Static95.anIntArray317[local27++] = local1010.anInt1739;
							continue;
						}
					} else if (local174 < 1700) {
						local1010 = local853 ? Static95.aClass1_Sub1_Sub11_4 : Static68.aClass1_Sub1_Sub11_2;
						if (local174 == 1600) {
							Static95.anIntArray317[local27++] = local1010.anInt1706;
							continue;
						}
						if (local174 == 1601) {
							Static95.anIntArray317[local27++] = local1010.anInt1689;
							continue;
						}
						if (local174 == 1602) {
							Static14.aClass64Array6[local35++] = local1010.aClass64_1064;
							continue;
						}
						if (local174 == 1603) {
							Static95.anIntArray317[local27++] = local1010.anInt1746;
							continue;
						}
						if (local174 == 1604) {
							Static95.anIntArray317[local27++] = local1010.anInt1692;
							continue;
						}
						if (local174 == 1605) {
							Static95.anIntArray317[local27++] = local1010.anInt1686;
							continue;
						}
					} else if (local174 < 1800) {
						local1010 = local853 ? Static95.aClass1_Sub1_Sub11_4 : Static68.aClass1_Sub1_Sub11_2;
						if (local174 == 1700) {
							Static95.anIntArray317[local27++] = local1010.anInt1736;
							continue;
						}
						if (local174 == 1701) {
							if (local1010.anInt1736 == -1) {
								Static95.anIntArray317[local27++] = 0;
							} else {
								Static95.anIntArray317[local27++] = local1010.anInt1719;
							}
							continue;
						}
						if (local174 == 1702) {
							Static95.anIntArray317[local27++] = local1010.anInt1742;
							continue;
						}
					} else if (local174 < 1900) {
						local1010 = local853 ? Static95.aClass1_Sub1_Sub11_4 : Static68.aClass1_Sub1_Sub11_2;
						if (local174 == 1800) {
							Static95.anIntArray317[local27++] = Static99.method1599(Static31.method548(local1010));
							continue;
						}
					} else if (local174 < 2600) {
						local27--;
						local1010 = Static12.method1397(Static95.anIntArray317[local27]);
						if (local174 == 2500) {
							Static95.anIntArray317[local27++] = local1010.anInt1690;
							continue;
						}
						if (local174 == 2501) {
							Static95.anIntArray317[local27++] = local1010.anInt1702;
							continue;
						}
						if (local174 == 2502) {
							Static95.anIntArray317[local27++] = local1010.anInt1700;
							continue;
						}
						if (local174 == 2503) {
							Static95.anIntArray317[local27++] = local1010.anInt1707;
							continue;
						}
						if (local174 == 2504) {
							Static95.anIntArray317[local27++] = local1010.aBoolean104 ? 1 : 0;
							continue;
						}
						if (local174 == 2505) {
							Static95.anIntArray317[local27++] = local1010.anInt1739;
							continue;
						}
					} else if (local174 < 2700) {
						local27--;
						local1010 = Static12.method1397(Static95.anIntArray317[local27]);
						if (local174 == 2600) {
							Static95.anIntArray317[local27++] = local1010.anInt1706;
							continue;
						}
						if (local174 == 2601) {
							Static95.anIntArray317[local27++] = local1010.anInt1689;
							continue;
						}
						if (local174 == 2602) {
							Static14.aClass64Array6[local35++] = local1010.aClass64_1064;
							continue;
						}
						if (local174 == 2603) {
							Static95.anIntArray317[local27++] = local1010.anInt1746;
							continue;
						}
						if (local174 == 2604) {
							Static95.anIntArray317[local27++] = local1010.anInt1692;
							continue;
						}
						if (local174 == 2605) {
							Static95.anIntArray317[local27++] = local1010.anInt1686;
							continue;
						}
					} else if (local174 < 2800) {
						local27--;
						local1010 = Static12.method1397(Static95.anIntArray317[local27]);
						if (local174 == 2700) {
							Static95.anIntArray317[local27++] = local1010.anInt1736;
							continue;
						}
						if (local174 == 2701) {
							if (local1010.anInt1736 == -1) {
								Static95.anIntArray317[local27++] = 0;
							} else {
								Static95.anIntArray317[local27++] = local1010.anInt1719;
							}
							continue;
						}
					} else if (local174 < 2900) {
						local27--;
						local1010 = Static12.method1397(Static95.anIntArray317[local27]);
						if (local174 == 2800) {
							Static95.anIntArray317[local27++] = Static99.method1599(Static31.method548(local1010));
							continue;
						}
					} else if (local174 < 3200) {
						if (local174 == 3100) {
							local35--;
							local534 = Static14.aClass64Array6[local35];
							Static71.method1178(Static8.aClass64_249, local534, 0);
							continue;
						}
						if (local174 == 3101) {
							local27 -= 2;
							Static61.method1080(Static95.anIntArray317[local27 + 1], Static95.anIntArray317[local27], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1);
							continue;
						}
						if (local174 == 3102) {
							local27--;
							local725 = Static95.anIntArray317[local27];
							if (local725 >= 0 && local725 < Static101.anIntArray334.length && Static101.anIntArray334[local725] != -1) {
								Static83.anInt1922 = local725;
								Static84.aBoolean118 = true;
								Static19.aBoolean41 = true;
							}
							continue;
						}
						if (local174 == 3103) {
							Static105.method1719();
							continue;
						}
					} else if (local174 < 3300) {
						if (local174 == 3200) {
							local27 -= 3;
							Static10.method251(Static95.anIntArray317[local27 + 1], Static95.anIntArray317[local27 + 2], Static95.anIntArray317[local27]);
							continue;
						}
						if (local174 == 3201) {
							local27--;
							Static104.method1694(Static95.anIntArray317[local27]);
							continue;
						}
						if (local174 == 3202) {
							local27 -= 2;
							Static37.method669(Static95.anIntArray317[local27], Static95.anIntArray317[local27 + 1]);
							continue;
						}
					} else if (local174 < 3400) {
						if (local174 == 3300) {
							Static95.anIntArray317[local27++] = Static15.anInt471;
							continue;
						}
						if (local174 == 3301) {
							local27 -= 2;
							local725 = Static95.anIntArray317[local27];
							local713 = Static95.anIntArray317[local27 + 1];
							Static95.anIntArray317[local27++] = Static80.method1371(local713, local725);
							continue;
						}
						if (local174 == 3302) {
							local27 -= 2;
							local725 = Static95.anIntArray317[local27];
							local713 = Static95.anIntArray317[local27 + 1];
							Static95.anIntArray317[local27++] = Static68.method1136(local725, local713);
							continue;
						}
						if (local174 == 3303) {
							local27 -= 2;
							local725 = Static95.anIntArray317[local27];
							local713 = Static95.anIntArray317[local27 + 1];
							Static95.anIntArray317[local27++] = Static64.method1098(local725, local713);
							continue;
						}
						if (local174 == 3304) {
							local27--;
							local725 = Static95.anIntArray317[local27];
							Static95.anIntArray317[local27++] = Static30.method540(local725).anInt1520;
							continue;
						}
						if (local174 == 3305) {
							local27--;
							local725 = Static95.anIntArray317[local27];
							Static95.anIntArray317[local27++] = Static61.anIntArray221[local725];
							continue;
						}
						if (local174 == 3306) {
							local27--;
							local725 = Static95.anIntArray317[local27];
							Static95.anIntArray317[local27++] = Static25.anIntArray438[local725];
							continue;
						}
						if (local174 == 3307) {
							local27--;
							local725 = Static95.anIntArray317[local27];
							Static95.anIntArray317[local27++] = Static79.anIntArray285[local725];
							continue;
						}
						if (local174 == 3308) {
							local725 = Static15.anInt463;
							local713 = (Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2375 >> 7) + Static60.anInt1350;
							local872 = Static53.anInt1236 + (Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2412 >> 7);
							Static95.anIntArray317[local27++] = local872 + (local713 << 14) + (local725 << 28);
							continue;
						}
						if (local174 == 3309) {
							local27--;
							local725 = Static95.anIntArray317[local27];
							Static95.anIntArray317[local27++] = local725 >> 14 & 0x3FFF;
							continue;
						}
						if (local174 == 3310) {
							local27--;
							local725 = Static95.anIntArray317[local27];
							Static95.anIntArray317[local27++] = local725 >> 28;
							continue;
						}
						if (local174 == 3311) {
							local27--;
							local725 = Static95.anIntArray317[local27];
							Static95.anIntArray317[local27++] = local725 & 0x3FFF;
							continue;
						}
						if (local174 == 3312) {
							Static95.anIntArray317[local27++] = Static113.aBoolean111 ? 1 : 0;
							continue;
						}
						if (local174 == 3313) {
							local27 -= 2;
							local725 = Static95.anIntArray317[local27] + 32768;
							local713 = Static95.anIntArray317[local27 + 1];
							Static95.anIntArray317[local27++] = Static80.method1371(local713, local725);
							continue;
						}
						if (local174 == 3314) {
							local27 -= 2;
							local725 = Static95.anIntArray317[local27] + 32768;
							local713 = Static95.anIntArray317[local27 + 1];
							Static95.anIntArray317[local27++] = Static68.method1136(local725, local713);
							continue;
						}
						if (local174 == 3315) {
							local27 -= 2;
							local725 = Static95.anIntArray317[local27] + 32768;
							local713 = Static95.anIntArray317[local27 + 1];
							Static95.anIntArray317[local27++] = Static64.method1098(local725, local713);
							continue;
						}
					} else if (local174 < 3700) {
						if (local174 == 3600) {
							if (Static61.anInt1422 == 0) {
								Static95.anIntArray317[local27++] = -2;
							} else if (Static61.anInt1422 == 1) {
								Static95.anIntArray317[local27++] = -1;
							} else {
								Static95.anIntArray317[local27++] = Static106.anInt2498;
							}
							continue;
						}
						if (local174 == 3601) {
							local27--;
							local725 = Static95.anIntArray317[local27];
							if (Static61.anInt1422 == 2 && Static106.anInt2498 > local725) {
								Static14.aClass64Array6[local35++] = Static3.aClass64Array1[local725];
								continue;
							}
							Static14.aClass64Array6[local35++] = Static8.aClass64_249;
							continue;
						}
						if (local174 == 3602) {
							local27--;
							local725 = Static95.anIntArray317[local27];
							if (Static61.anInt1422 == 2 && Static106.anInt2498 > local725) {
								Static95.anIntArray317[local27++] = Static27.anIntArray139[local725];
								continue;
							}
							Static95.anIntArray317[local27++] = 0;
							continue;
						}
						if (local174 == 3603) {
							local27--;
							local725 = Static95.anIntArray317[local27];
							if (Static61.anInt1422 == 2 && Static106.anInt2498 > local725) {
								Static95.anIntArray317[local27++] = Static55.anIntArray447[local725];
								continue;
							}
							Static95.anIntArray317[local27++] = 0;
							continue;
						}
						if (local174 == 3604) {
							local35--;
							local534 = Static14.aClass64Array6[local35];
							local27--;
							local713 = Static95.anIntArray317[local27];
							Static116.method2041(local713, local534);
							continue;
						}
					} else if (local174 < 4100) {
						if (local174 == 4000) {
							local27 -= 2;
							local713 = Static95.anIntArray317[local27 + 1];
							local725 = Static95.anIntArray317[local27];
							Static95.anIntArray317[local27++] = local725 + local713;
							continue;
						}
						if (local174 == 4001) {
							local27 -= 2;
							local725 = Static95.anIntArray317[local27];
							local713 = Static95.anIntArray317[local27 + 1];
							Static95.anIntArray317[local27++] = local725 - local713;
							continue;
						}
						if (local174 == 4002) {
							local27 -= 2;
							local713 = Static95.anIntArray317[local27 + 1];
							local725 = Static95.anIntArray317[local27];
							Static95.anIntArray317[local27++] = local713 * local725;
							continue;
						}
						if (local174 == 4003) {
							local27 -= 2;
							local725 = Static95.anIntArray317[local27];
							local713 = Static95.anIntArray317[local27 + 1];
							Static95.anIntArray317[local27++] = local725 / local713;
							continue;
						}
						if (local174 == 4004) {
							local27--;
							local725 = Static95.anIntArray317[local27];
							Static95.anIntArray317[local27++] = (int) (Math.random() * (double) local725);
							continue;
						}
						if (local174 == 4005) {
							local27--;
							local725 = Static95.anIntArray317[local27];
							Static95.anIntArray317[local27++] = (int) (Math.random() * (double) (local725 + 1));
							continue;
						}
						if (local174 == 4006) {
							local27 -= 5;
							local713 = Static95.anIntArray317[local27 + 1];
							local725 = Static95.anIntArray317[local27];
							local872 = Static95.anIntArray317[local27 + 2];
							local578 = Static95.anIntArray317[local27 + 3];
							local600 = Static95.anIntArray317[local27 + 4];
							Static95.anIntArray317[local27++] = local725 + (local600 - local872) * (-local725 + local713) / (local578 - local872);
							continue;
						}
						if (local174 == 4007) {
							local27 -= 2;
							local725 = Static95.anIntArray317[local27];
							local713 = Static95.anIntArray317[local27 + 1];
							Static95.anIntArray317[local27++] = local713 * local725 / 100 + local725;
							continue;
						}
						if (local174 == 4008) {
							local27 -= 2;
							local725 = Static95.anIntArray317[local27];
							local713 = Static95.anIntArray317[local27 + 1];
							Static95.anIntArray317[local27++] = local725 | 0x1 << local713;
							continue;
						}
						if (local174 == 4009) {
							local27 -= 2;
							local725 = Static95.anIntArray317[local27];
							local713 = Static95.anIntArray317[local27 + 1];
							Static95.anIntArray317[local27++] = local725 & -(0x1 << local713) - 1;
							continue;
						}
						if (local174 == 4010) {
							local27 -= 2;
							local725 = Static95.anIntArray317[local27];
							local713 = Static95.anIntArray317[local27 + 1];
							Static95.anIntArray317[local27++] = (0x1 << local713 & local725) == 0 ? 0 : 1;
							continue;
						}
						if (local174 == 4011) {
							local27 -= 2;
							local713 = Static95.anIntArray317[local27 + 1];
							local725 = Static95.anIntArray317[local27];
							Static95.anIntArray317[local27++] = local725 % local713;
							continue;
						}
						if (local174 == 4012) {
							local27 -= 2;
							local725 = Static95.anIntArray317[local27];
							local713 = Static95.anIntArray317[local27 + 1];
							if (local725 == 0) {
								Static95.anIntArray317[local27++] = 0;
							} else {
								Static95.anIntArray317[local27++] = (int) Math.pow((double) local725, (double) local713);
							}
							continue;
						}
						if (local174 == 4013) {
							local27 -= 2;
							local725 = Static95.anIntArray317[local27];
							local713 = Static95.anIntArray317[local27 + 1];
							if (local725 == 0) {
								Static95.anIntArray317[local27++] = 0;
							} else if (local713 == 0) {
								Static95.anIntArray317[local27++] = Integer.MAX_VALUE;
							} else {
								Static95.anIntArray317[local27++] = (int) Math.pow((double) local725, 1.0D / (double) local713);
							}
							continue;
						}
						if (local174 == 4014) {
							local27 -= 2;
							local713 = Static95.anIntArray317[local27 + 1];
							local725 = Static95.anIntArray317[local27];
							Static95.anIntArray317[local27++] = local713 & local725;
							continue;
						}
						if (local174 == 4015) {
							local27 -= 2;
							local713 = Static95.anIntArray317[local27 + 1];
							local725 = Static95.anIntArray317[local27];
							Static95.anIntArray317[local27++] = local713 | local725;
							continue;
						}
					} else if (local174 < 4200) {
						if (local174 == 4100) {
							local35--;
							local534 = Static14.aClass64Array6[local35];
							local27--;
							local713 = Static95.anIntArray317[local27];
							Static14.aClass64Array6[local35++] = Static82.method1383(new Class64[] { local534, Static12.method1395(local713) });
							continue;
						}
						if (local174 == 4101) {
							local35 -= 2;
							local2327 = Static14.aClass64Array6[local35 + 1];
							local534 = Static14.aClass64Array6[local35];
							Static14.aClass64Array6[local35++] = Static82.method1383(new Class64[] { local534, local2327 });
							continue;
						}
						if (local174 == 4102) {
							local35--;
							local534 = Static14.aClass64Array6[local35];
							local27--;
							local713 = Static95.anIntArray317[local27];
							Static14.aClass64Array6[local35++] = Static82.method1383(new Class64[] { local534, Static87.method1432(local713) });
							continue;
						}
						if (local174 == 4103) {
							local35--;
							local534 = Static14.aClass64Array6[local35];
							Static14.aClass64Array6[local35++] = local534.method1503();
							continue;
						}
						if (local174 == 4104) {
							local27--;
							local725 = Static95.anIntArray317[local27];
							@Pc(2417) long local2417 = (long) local725 * 86400000L + 1014768000000L;
							Static44.aCalendar1.setTime(new Date(local2417));
							local578 = Static44.aCalendar1.get(5);
							local600 = Static44.aCalendar1.get(2);
							local916 = Static44.aCalendar1.get(1);
							Static14.aClass64Array6[local35++] = Static82.method1383(new Class64[] { Static12.method1395(local578), Static121.aClass64_1847, Static92.aClass64Array14[local600], Static121.aClass64_1847, Static12.method1395(local916) });
							continue;
						}
						if (local174 == 4105) {
							local35 -= 2;
							local534 = Static14.aClass64Array6[local35];
							local2327 = Static14.aClass64Array6[local35 + 1];
							if (Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass54_2 != null && Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass54_2.aBoolean107) {
								Static14.aClass64Array6[local35++] = local2327;
								continue;
							}
							Static14.aClass64Array6[local35++] = local534;
							continue;
						}
						if (local174 == 4106) {
							local27--;
							local725 = Static95.anIntArray317[local27];
							Static14.aClass64Array6[local35++] = Static12.method1395(local725);
							continue;
						}
						if (local174 == 4107) {
							local35 -= 2;
							Static95.anIntArray317[local27++] = Static14.aClass64Array6[local35].method1472(Static14.aClass64Array6[local35 + 1]);
							continue;
						}
						@Pc(2570) byte[] local2570;
						@Pc(2575) Class1_Sub1_Sub5_Sub1 local2575;
						if (local174 == 4108) {
							local27 -= 2;
							local713 = Static95.anIntArray317[local27];
							local35--;
							local534 = Static14.aClass64Array6[local35];
							local872 = Static95.anIntArray317[local27 + 1];
							local2570 = aClass41_Sub1_12.method1062(local872, 0);
							local2575 = new Class1_Sub1_Sub5_Sub1(local2570);
							Static95.anIntArray317[local27++] = local2575.method656(local534, local713);
							continue;
						}
						if (local174 == 4109) {
							local27 -= 2;
							local872 = Static95.anIntArray317[local27 + 1];
							local713 = Static95.anIntArray317[local27];
							local35--;
							local534 = Static14.aClass64Array6[local35];
							local2570 = aClass41_Sub1_12.method1062(local872, 0);
							local2575 = new Class1_Sub1_Sub5_Sub1(local2570);
							Static95.anIntArray317[local27++] = local2575.method644(local534, local713);
							continue;
						}
					} else if (local174 < 4300) {
						if (local174 == 4200) {
							local27--;
							local725 = Static95.anIntArray317[local27];
							Static14.aClass64Array6[local35++] = Static106.method1739(local725).aClass64_646;
							continue;
						}
						@Pc(2670) Class1_Sub1_Sub6 local2670;
						if (local174 == 4201) {
							local27 -= 2;
							local725 = Static95.anIntArray317[local27];
							local713 = Static95.anIntArray317[local27 + 1];
							local2670 = Static106.method1739(local725);
							if (local713 >= 1 && local713 <= 5 && local2670.aClass64Array10[local713 - 1] != null) {
								Static14.aClass64Array6[local35++] = local2670.aClass64Array10[local713 - 1];
								continue;
							}
							Static14.aClass64Array6[local35++] = Static8.aClass64_249;
							continue;
						}
						if (local174 == 4202) {
							local27 -= 2;
							local713 = Static95.anIntArray317[local27 + 1];
							local725 = Static95.anIntArray317[local27];
							local2670 = Static106.method1739(local725);
							if (local713 >= 1 && local713 <= 5 && local2670.aClass64Array11[local713 - 1] != null) {
								Static14.aClass64Array6[local35++] = local2670.aClass64Array11[local713 - 1];
								continue;
							}
							Static14.aClass64Array6[local35++] = Static8.aClass64_249;
							continue;
						}
						if (local174 == 4203) {
							local27--;
							local725 = Static95.anIntArray317[local27];
							Static95.anIntArray317[local27++] = Static106.method1739(local725).anInt989;
							continue;
						}
						if (local174 == 4204) {
							local27--;
							local725 = Static95.anIntArray317[local27];
							Static95.anIntArray317[local27++] = Static106.method1739(local725).anInt957 == 1 ? 1 : 0;
							continue;
						}
						@Pc(2815) Class1_Sub1_Sub6 local2815;
						if (local174 == 4205) {
							local27--;
							local725 = Static95.anIntArray317[local27];
							local2815 = Static106.method1739(local725);
							if (local2815.anInt967 == -1 && local2815.anInt975 >= 0) {
								Static95.anIntArray317[local27++] = local2815.anInt975;
								continue;
							}
							Static95.anIntArray317[local27++] = local725;
							continue;
						}
						if (local174 == 4206) {
							local27--;
							local725 = Static95.anIntArray317[local27];
							local2815 = Static106.method1739(local725);
							if (local2815.anInt967 >= 0 && local2815.anInt975 >= 0) {
								Static95.anIntArray317[local27++] = local2815.anInt975;
								continue;
							}
							Static95.anIntArray317[local27++] = local725;
							continue;
						}
						if (local174 == 4207) {
							local27--;
							local725 = Static95.anIntArray317[local27];
							Static95.anIntArray317[local27++] = Static106.method1739(local725).aBoolean62 ? 1 : 0;
							continue;
						}
					}
				}
				Static99.method1601(null, "CS2 - nosuchop:" + local174);
				return;
			}
		} catch (@Pc(4419) Exception local4419) {
			Static99.method1601(local4419, "CS2 - scr:" + local11.aLong87 + " op:" + local37);
		}
	}
}

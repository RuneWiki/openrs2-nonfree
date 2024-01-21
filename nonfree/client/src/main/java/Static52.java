import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!ia", name = "F", descriptor = "Lclient!q;")
	public static Class62 aClass62_14;

	@OriginalMember(owner = "client!ia", name = "H", descriptor = "Lclient!bc;")
	public static Class6 aClass6_13;

	@OriginalMember(owner = "client!ia", name = "I", descriptor = "[I")
	private static int[] anIntArray203;

	@OriginalMember(owner = "client!ia", name = "R", descriptor = "I")
	public static int anInt1456;

	@OriginalMember(owner = "client!ia", name = "Y", descriptor = "[Lclient!de;")
	public static Class1_Sub1_Sub4_Sub1[] aClass1_Sub1_Sub4_Sub1Array5;

	@OriginalMember(owner = "client!ia", name = "B", descriptor = "Lclient!kd;")
	private static Class39 aClass39_694 = Static108.method1915("To create a new account you need to");

	@OriginalMember(owner = "client!ia", name = "C", descriptor = "Lclient!kd;")
	public static Class39 aClass39_695 = null;

	@OriginalMember(owner = "client!ia", name = "D", descriptor = "I")
	public static int anInt1452 = 0;

	@OriginalMember(owner = "client!ia", name = "E", descriptor = "Lclient!kd;")
	public static Class39 aClass39_696 = Static108.method1915("sideicons");

	@OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
	public static int anInt1453 = 2;

	@OriginalMember(owner = "client!ia", name = "L", descriptor = "Lclient!kd;")
	public static Class39 aClass39_697 = Static108.method1915("(U2");

	@OriginalMember(owner = "client!ia", name = "M", descriptor = "Lclient!kd;")
	public static Class39 aClass39_698 = aClass39_694;

	@OriginalMember(owner = "client!ia", name = "U", descriptor = "Lclient!kd;")
	public static Class39 aClass39_699 = Static108.method1915("(U1");

	@OriginalMember(owner = "client!ia", name = "W", descriptor = "I")
	public static int anInt1457 = -1;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "([Ljava/lang/Object;IBLclient!a;ILclient!a;I)V")
	public static void method962(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub1_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1_Sub1_Sub1 arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = (Integer) arg0[0];
		@Pc(15) Class1_Sub1_Sub11 local15 = Static39.method696(local11);
		if (local15 == null) {
			return;
		}
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = -1;
		@Pc(24) int local24 = 0;
		@Pc(27) int[] local27 = local15.anIntArray211;
		@Pc(30) int[] local30 = local15.anIntArray212;
		@Pc(32) byte local32 = -1;
		try {
			anIntArray203 = new int[local15.anInt1494];
			Static97.aClass39Array31 = new Class39[local15.anInt1490];
			@Pc(47) int local47 = 0;
			@Pc(49) int local49 = 0;
			@Pc(64) int local64;
			for (@Pc(51) int local51 = 1; local51 < arg0.length; local51++) {
				if (arg0[local51] instanceof Integer) {
					local64 = (Integer) arg0[local51];
					if (local64 == -2147483647) {
						local64 = arg5;
					}
					if (local64 == -2147483646) {
						local64 = arg3;
					}
					if (local64 == -2147483645) {
						local64 = arg4 == null ? -1 : arg4.anInt72;
					}
					if (local64 == -2147483644) {
						local64 = arg1;
					}
					if (local64 == -2147483643) {
						local64 = arg4 == null ? -1 : arg4.anInt46;
					}
					if (local64 == -2147483642) {
						local64 = arg2 == null ? -1 : arg2.anInt72;
					}
					if (local64 == -2147483641) {
						local64 = arg2 == null ? -1 : arg2.anInt46;
					}
					anIntArray203[local49++] = local64;
				} else if (arg0[local51] instanceof Class39) {
					Static97.aClass39Array31[local47++] = (Class39) arg0[local51];
				}
			}
			local64 = 0;
			label1408: while (true) {
				local64++;
				if (local64 > 200000) {
					throw new RuntimeException("slow");
				}
				local22++;
				@Pc(168) int local168 = local27[local22];
				@Pc(719) int local719;
				@Pc(578) int local578;
				@Pc(599) int local599;
				@Pc(714) int local714;
				@Pc(534) Class39 local534;
				if (local168 < 100) {
					if (local168 == 0) {
						Static33.anIntArray150[local20++] = local30[local22];
						continue;
					}
					@Pc(193) int local193;
					if (local168 == 1) {
						local193 = local30[local22];
						Static33.anIntArray150[local20++] = Static44.anIntArray175[local193];
						continue;
					}
					if (local168 == 2) {
						local193 = local30[local22];
						local20--;
						Static44.anIntArray175[local193] = Static33.anIntArray150[local20];
						continue;
					}
					if (local168 == 3) {
						Static55.aClass39Array15[local24++] = local15.aClass39Array14[local22];
						continue;
					}
					if (local168 == 6) {
						local22 += local30[local22];
						continue;
					}
					if (local168 == 7) {
						local20 -= 2;
						if (Static33.anIntArray150[local20 + 1] != Static33.anIntArray150[local20]) {
							local22 += local30[local22];
						}
						continue;
					}
					if (local168 == 8) {
						local20 -= 2;
						if (Static33.anIntArray150[local20 + 1] == Static33.anIntArray150[local20]) {
							local22 += local30[local22];
						}
						continue;
					}
					if (local168 == 9) {
						local20 -= 2;
						if (Static33.anIntArray150[local20 + 1] > Static33.anIntArray150[local20]) {
							local22 += local30[local22];
						}
						continue;
					}
					if (local168 == 10) {
						local20 -= 2;
						if (Static33.anIntArray150[local20 + 1] < Static33.anIntArray150[local20]) {
							local22 += local30[local22];
						}
						continue;
					}
					if (local168 == 21) {
						if (Static57.anInt1548 == 0) {
							return;
						}
						@Pc(357) Class66 local357 = Static56.aClass66Array1[--Static57.anInt1548];
						local22 = local357.anInt2689;
						anIntArray203 = local357.anIntArray415;
						Static97.aClass39Array31 = local357.aClass39Array26;
						local15 = local357.aClass1_Sub1_Sub11_1;
						local30 = local15.anIntArray212;
						local27 = local15.anIntArray211;
						continue;
					}
					if (local168 == 25) {
						local193 = local30[local22];
						Static33.anIntArray150[local20++] = Static18.method360(local193);
						continue;
					}
					if (local168 == 27) {
						local193 = local30[local22];
						local20--;
						Static124.method2077(local193, Static33.anIntArray150[local20]);
						continue;
					}
					if (local168 == 31) {
						local20 -= 2;
						if (Static33.anIntArray150[local20] <= Static33.anIntArray150[local20 + 1]) {
							local22 += local30[local22];
						}
						continue;
					}
					if (local168 == 32) {
						local20 -= 2;
						if (Static33.anIntArray150[local20] >= Static33.anIntArray150[local20 + 1]) {
							local22 += local30[local22];
						}
						continue;
					}
					if (local168 == 33) {
						Static33.anIntArray150[local20++] = anIntArray203[local30[local22]];
						continue;
					}
					@Pc(478) int local478;
					if (local168 == 34) {
						local478 = local30[local22];
						local20--;
						anIntArray203[local478] = Static33.anIntArray150[local20];
						continue;
					}
					if (local168 == 35) {
						Static55.aClass39Array15[local24++] = Static97.aClass39Array31[local30[local22]];
						continue;
					}
					if (local168 == 36) {
						local478 = local30[local22];
						local24--;
						Static97.aClass39Array31[local478] = Static55.aClass39Array15[local24];
						continue;
					}
					if (local168 == 37) {
						local193 = local30[local22];
						local24 -= local193;
						local534 = Static17.method331(Static55.aClass39Array15, local193, local24);
						Static55.aClass39Array15[local24++] = local534;
						continue;
					}
					if (local168 == 38) {
						local20--;
						continue;
					}
					if (local168 == 39) {
						local24--;
						continue;
					}
					if (local168 == 40) {
						local193 = local30[local22];
						@Pc(568) Class1_Sub1_Sub11 local568 = Static39.method696(local193);
						@Pc(572) int[] local572 = new int[local568.anInt1494];
						@Pc(576) Class39[] local576 = new Class39[local568.anInt1490];
						for (local578 = 0; local578 < local568.anInt1495; local578++) {
							local572[local578] = Static33.anIntArray150[local20 + local578 - local568.anInt1495];
						}
						for (local599 = 0; local599 < local568.anInt1486; local599++) {
							local576[local599] = Static55.aClass39Array15[local24 + local599 - local568.anInt1486];
						}
						local24 -= local568.anInt1486;
						local20 -= local568.anInt1495;
						@Pc(633) Class66 local633 = new Class66();
						local633.aClass39Array26 = Static97.aClass39Array31;
						local633.aClass1_Sub1_Sub11_1 = local15;
						local633.anInt2689 = local22;
						local22 = -1;
						local633.anIntArray415 = anIntArray203;
						local15 = local568;
						Static56.aClass66Array1[Static57.anInt1548++] = local633;
						anIntArray203 = local572;
						local30 = local568.anIntArray212;
						local27 = local568.anIntArray211;
						Static97.aClass39Array31 = local576;
						continue;
					}
					if (local168 == 42) {
						Static33.anIntArray150[local20++] = Static98.anIntArray361[local30[local22]];
						continue;
					}
					if (local168 == 43) {
						local478 = local30[local22];
						local20--;
						Static98.anIntArray361[local478] = Static33.anIntArray150[local20];
						continue;
					}
					if (local168 == 44) {
						local193 = local30[local22] >> 16;
						local714 = local30[local22] & 0xFFFF;
						local20--;
						local719 = Static33.anIntArray150[local20];
						if (local719 >= 0 && local719 <= 5000) {
							Static93.anIntArray334[local193] = local719;
							@Pc(736) byte local736 = -1;
							if (local714 == 105) {
								local736 = 0;
							}
							local578 = 0;
							while (true) {
								if (local719 <= local578) {
									continue label1408;
								}
								Static54.anIntArrayArray12[local193][local578] = local736;
								local578++;
							}
						}
						throw new RuntimeException();
					}
					if (local168 == 45) {
						local20--;
						local714 = Static33.anIntArray150[local20];
						local193 = local30[local22];
						if (local714 >= 0 && local714 < Static93.anIntArray334[local193]) {
							Static33.anIntArray150[local20++] = Static54.anIntArrayArray12[local193][local714];
							continue;
						}
						throw new RuntimeException();
					}
					if (local168 == 46) {
						local20 -= 2;
						local193 = local30[local22];
						local714 = Static33.anIntArray150[local20];
						if (local714 >= 0 && Static93.anIntArray334[local193] > local714) {
							Static54.anIntArrayArray12[local193][local714] = Static33.anIntArray150[local20 + 1];
							continue;
						}
						throw new RuntimeException();
					}
				}
				@Pc(840) boolean local840;
				if (local30[local22] == 1) {
					local840 = true;
				} else {
					local840 = false;
				}
				@Pc(998) Class1_Sub1_Sub1 local998;
				@Pc(869) int local869;
				@Pc(902) int local902;
				if (local168 < 1000) {
					if (local168 == 100) {
						local20 -= 3;
						local714 = Static33.anIntArray150[local20];
						local719 = Static33.anIntArray150[local20 + 1];
						local869 = Static33.anIntArray150[local20 + 2];
						if (local719 == 0) {
							throw new RuntimeException();
						}
						@Pc(881) Class1_Sub1_Sub1 local881 = Static41.method2106(local714);
						if (local881.aClass1_Sub1_Sub1Array1 == null) {
							local881.aClass1_Sub1_Sub1Array1 = new Class1_Sub1_Sub1[local869 + 1];
						}
						if (local881.aClass1_Sub1_Sub1Array1.length <= local869) {
							@Pc(900) Class1_Sub1_Sub1[] local900 = new Class1_Sub1_Sub1[local869 + 1];
							for (local902 = 0; local902 < local881.aClass1_Sub1_Sub1Array1.length; local902++) {
								local900[local902] = local881.aClass1_Sub1_Sub1Array1[local902];
							}
							local881.aClass1_Sub1_Sub1Array1 = local900;
						}
						if (local869 > 0 && local881.aClass1_Sub1_Sub1Array1[local869 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local869 - 1));
						}
						@Pc(953) Class1_Sub1_Sub1 local953 = new Class1_Sub1_Sub1();
						local953.anInt102 = local953.anInt72 = local881.anInt72;
						local953.anInt91 = local719;
						local953.anInt46 = local869;
						local953.aBoolean14 = true;
						local881.aClass1_Sub1_Sub1Array1[local869] = local953;
						if (local840) {
							Static123.aClass1_Sub1_Sub1_4 = local953;
						} else {
							Static36.aClass1_Sub1_Sub1_2 = local953;
						}
						Static1.method50(local881);
						continue;
					}
					if (local168 == 101) {
						local998 = local840 ? Static123.aClass1_Sub1_Sub1_4 : Static36.aClass1_Sub1_Sub1_2;
						@Pc(1005) Class1_Sub1_Sub1 local1005 = Static41.method2106(local998.anInt72);
						local1005.aClass1_Sub1_Sub1Array1[local998.anInt46] = null;
						Static1.method50(local1005);
						continue;
					}
					if (local168 == 102) {
						local20--;
						local998 = Static41.method2106(Static33.anIntArray150[local20]);
						local998.aClass1_Sub1_Sub1Array1 = null;
						Static1.method50(local998);
						continue;
					}
					if (local168 == 200) {
						local20 -= 2;
						local714 = Static33.anIntArray150[local20];
						local719 = Static33.anIntArray150[local20 + 1];
						@Pc(1057) Class1_Sub1_Sub1 local1057 = Static32.method393(local714, local719);
						if (local1057 != null && local719 != -1) {
							Static33.anIntArray150[local20++] = 1;
							if (local840) {
								Static123.aClass1_Sub1_Sub1_4 = local1057;
							} else {
								Static36.aClass1_Sub1_Sub1_2 = local1057;
							}
							continue;
						}
						Static33.anIntArray150[local20++] = 0;
						continue;
					}
				} else if (local168 >= 1000 && local168 < 1100 || !(local168 < 2000 || local168 >= 2100)) {
					if (local168 < 2000) {
						local998 = local840 ? Static123.aClass1_Sub1_Sub1_4 : Static36.aClass1_Sub1_Sub1_2;
					} else {
						local168 -= 1000;
						local20--;
						local998 = Static41.method2106(Static33.anIntArray150[local20]);
					}
					Static1.method50(local998);
					if (local168 == 1000) {
						local20 -= 2;
						local998.anInt81 = Static33.anIntArray150[local20];
						local998.anInt110 = Static33.anIntArray150[local20 + 1];
						continue;
					}
					if (local168 == 1001) {
						local20 -= 2;
						local998.anInt101 = Static33.anIntArray150[local20];
						local998.anInt82 = Static33.anIntArray150[local20 + 1];
						continue;
					}
					if (local168 == 1003) {
						local20--;
						local998.aBoolean8 = Static33.anIntArray150[local20] == 1;
						continue;
					}
				} else if (local168 >= 1100 && local168 < 1200 || local168 >= 2100 && local168 < 2200) {
					if (local168 >= 2000) {
						local168 -= 1000;
						local20--;
						local998 = Static41.method2106(Static33.anIntArray150[local20]);
					} else {
						local998 = local840 ? Static123.aClass1_Sub1_Sub1_4 : Static36.aClass1_Sub1_Sub1_2;
					}
					Static1.method50(local998);
					if (local168 == 1100) {
						local20 -= 2;
						local998.anInt87 = Static33.anIntArray150[local20];
						if (local998.anInt87 > local998.anInt111 - local998.anInt101) {
							local998.anInt87 = local998.anInt111 - local998.anInt101;
						}
						if (local998.anInt87 < 0) {
							local998.anInt87 = 0;
						}
						local998.anInt95 = Static33.anIntArray150[local20 + 1];
						if (local998.anInt95 > local998.anInt99 - local998.anInt82) {
							local998.anInt95 = local998.anInt99 - local998.anInt82;
						}
						if (local998.anInt95 < 0) {
							local998.anInt95 = 0;
						}
						continue;
					}
					if (local168 == 1101) {
						local20--;
						local998.anInt108 = Static33.anIntArray150[local20];
						continue;
					}
					if (local168 == 1102) {
						local20--;
						local998.aBoolean10 = Static33.anIntArray150[local20] == 1;
						continue;
					}
					if (local168 == 1103) {
						local20--;
						local998.anInt96 = Static33.anIntArray150[local20];
						continue;
					}
					if (local168 == 1104) {
						local20--;
						local998.anInt77 = Static33.anIntArray150[local20];
						continue;
					}
					if (local168 == 1105) {
						local20--;
						local998.anInt71 = Static33.anIntArray150[local20];
						continue;
					}
					if (local168 == 1106) {
						local20--;
						local998.anInt112 = Static33.anIntArray150[local20];
						continue;
					}
					if (local168 == 1107) {
						local20--;
						local998.aBoolean17 = Static33.anIntArray150[local20] == 1;
						continue;
					}
					if (local168 == 1108) {
						local998.anInt100 = 1;
						local20--;
						local998.anInt66 = Static33.anIntArray150[local20];
						continue;
					}
					if (local168 == 1109) {
						local20 -= 6;
						local998.anInt114 = Static33.anIntArray150[local20];
						local998.anInt69 = Static33.anIntArray150[local20 + 1];
						local998.anInt54 = Static33.anIntArray150[local20 + 2];
						local998.anInt89 = Static33.anIntArray150[local20 + 3];
						local998.anInt67 = Static33.anIntArray150[local20 + 4];
						local998.anInt88 = Static33.anIntArray150[local20 + 5];
						continue;
					}
					if (local168 == 1110) {
						local20--;
						local998.anInt76 = Static33.anIntArray150[local20];
						continue;
					}
					if (local168 == 1111) {
						local20--;
						local998.aBoolean18 = Static33.anIntArray150[local20] == 1;
						continue;
					}
					if (local168 == 1112) {
						local24--;
						local998.aClass39_30 = Static55.aClass39Array15[local24];
						continue;
					}
					if (local168 == 1113) {
						local20--;
						local998.anInt49 = Static33.anIntArray150[local20];
						continue;
					}
					if (local168 == 1114) {
						local20 -= 3;
						local998.anInt57 = Static33.anIntArray150[local20];
						local998.anInt117 = Static33.anIntArray150[local20 + 1];
						local998.anInt56 = Static33.anIntArray150[local20 + 2];
						continue;
					}
					if (local168 == 1115) {
						local20--;
						local998.aBoolean13 = Static33.anIntArray150[local20] == 1;
						continue;
					}
					if (local168 == 1116) {
						local20--;
						local998.anInt61 = Static33.anIntArray150[local20];
						continue;
					}
					if (local168 == 1117) {
						local20--;
						local998.anInt103 = Static33.anIntArray150[local20];
						continue;
					}
					if (local168 == 1118) {
						local20--;
						local998.aBoolean15 = Static33.anIntArray150[local20] == 1;
						continue;
					}
					if (local168 == 1119) {
						local20--;
						local998.aBoolean12 = Static33.anIntArray150[local20] == 1;
						continue;
					}
					if (local168 == 1120) {
						local20 -= 2;
						local998.anInt111 = Static33.anIntArray150[local20];
						local998.anInt99 = Static33.anIntArray150[local20 + 1];
						continue;
					}
				} else if (local168 >= 1200 && local168 < 1300 || local168 >= 2200 && local168 < 2300) {
					if (local168 >= 2000) {
						local168 -= 1000;
						local20--;
						local998 = Static41.method2106(Static33.anIntArray150[local20]);
					} else {
						local998 = local840 ? Static123.aClass1_Sub1_Sub1_4 : Static36.aClass1_Sub1_Sub1_2;
					}
					Static1.method50(local998);
					if (local168 == 1200) {
						local20 -= 2;
						local719 = Static33.anIntArray150[local20];
						local869 = Static33.anIntArray150[local20 + 1];
						local998.anInt97 = local719;
						local998.anInt47 = local869;
						@Pc(4891) Class1_Sub1_Sub17 local4891 = Static8.method224(local719);
						local998.anInt114 = local4891.anInt2730;
						local998.anInt88 = local4891.anInt2724;
						local998.anInt89 = local4891.anInt2740;
						local998.anInt69 = local4891.anInt2744;
						local998.anInt54 = local4891.anInt2721;
						local998.anInt67 = local4891.anInt2737;
						if (local998.anInt101 > 0) {
							local998.anInt88 = local998.anInt88 * 32 / local998.anInt101;
						}
						continue;
					}
					if (local168 == 1201) {
						local998.anInt100 = 2;
						local20--;
						local998.anInt66 = Static33.anIntArray150[local20];
						continue;
					}
					if (local168 == 1202) {
						local998.anInt100 = 3;
						local998.anInt66 = Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass28_1.method862();
						continue;
					}
				} else if ((local168 < 1300 || local168 >= 1400) && (local168 < 2300 || local168 >= 2400)) {
					@Pc(2543) Class39 local2543;
					if (local168 >= 1400 && local168 < 1500 || local168 >= 2400 && local168 < 2500) {
						if (local168 >= 2000) {
							local20--;
							local998 = Static41.method2106(Static33.anIntArray150[local20]);
							local168 -= 1000;
						} else {
							local998 = local840 ? Static123.aClass1_Sub1_Sub1_4 : Static36.aClass1_Sub1_Sub1_2;
						}
						local24--;
						local2543 = Static55.aClass39Array15[local24];
						@Pc(4519) Object[] local4519 = new Object[local2543.method1175() + 1];
						for (local578 = local4519.length - 1; local578 >= 1; local578--) {
							if (local2543.method1167(local578 - 1) == 115) {
								local24--;
								local4519[local578] = Static55.aClass39Array15[local24];
							} else {
								local20--;
								local4519[local578] = Integer.valueOf(Static33.anIntArray150[local20]);
							}
						}
						local20--;
						local599 = Static33.anIntArray150[local20];
						if (local599 == -1) {
							local4519 = null;
						} else {
							local4519[0] = Integer.valueOf(local599);
						}
						if (local168 == 1410) {
							local998.anObjectArray14 = local4519;
						}
						if (local168 == 1400) {
							local998.anObjectArray6 = local4519;
						}
						if (local168 == 1401) {
							local998.anObjectArray3 = local4519;
						}
						if (local168 == 1407) {
							local998.anObjectArray11 = local4519;
						}
						if (local168 == 1413) {
							local998.anObjectArray10 = local4519;
						}
						if (local168 == 1403) {
							local998.anObjectArray9 = local4519;
						}
						if (local168 == 1406) {
							local998.anObjectArray17 = local4519;
						}
						local998.aBoolean16 = true;
						if (local168 == 1415) {
							local998.anObjectArray8 = local4519;
						}
						if (local168 == 1414) {
							local998.anObjectArray2 = local4519;
						}
						if (local168 == 1411) {
							local998.anObjectArray1 = local4519;
						}
						if (local168 == 1408) {
							local998.anObjectArray4 = local4519;
						}
						if (local168 == 1409) {
							local998.anObjectArray15 = local4519;
						}
						if (local168 == 1405) {
							local998.anObjectArray5 = local4519;
						}
						if (local168 == 1404) {
							local998.anObjectArray7 = local4519;
						}
						if (local168 == 1417) {
							local998.anObjectArray18 = local4519;
						}
						if (local168 == 1402) {
							local998.anObjectArray19 = local4519;
						}
						if (local168 == 1416) {
							local998.anObjectArray13 = local4519;
						}
						if (local168 == 1412) {
							local998.anObjectArray12 = local4519;
						}
						continue;
					}
					if (local168 < 1600) {
						local998 = local840 ? Static123.aClass1_Sub1_Sub1_4 : Static36.aClass1_Sub1_Sub1_2;
						if (local168 == 1500) {
							Static33.anIntArray150[local20++] = local998.anInt81;
							continue;
						}
						if (local168 == 1501) {
							Static33.anIntArray150[local20++] = local998.anInt110;
							continue;
						}
						if (local168 == 1502) {
							Static33.anIntArray150[local20++] = local998.anInt101;
							continue;
						}
						if (local168 == 1503) {
							Static33.anIntArray150[local20++] = local998.anInt82;
							continue;
						}
						if (local168 == 1504) {
							Static33.anIntArray150[local20++] = local998.aBoolean8 ? 1 : 0;
							continue;
						}
						if (local168 == 1505) {
							Static33.anIntArray150[local20++] = local998.anInt102;
							continue;
						}
					} else if (local168 < 1700) {
						local998 = local840 ? Static123.aClass1_Sub1_Sub1_4 : Static36.aClass1_Sub1_Sub1_2;
						if (local168 == 1600) {
							Static33.anIntArray150[local20++] = local998.anInt87;
							continue;
						}
						if (local168 == 1601) {
							Static33.anIntArray150[local20++] = local998.anInt95;
							continue;
						}
						if (local168 == 1602) {
							Static55.aClass39Array15[local24++] = local998.aClass39_30;
							continue;
						}
						if (local168 == 1603) {
							Static33.anIntArray150[local20++] = local998.anInt111;
							continue;
						}
						if (local168 == 1604) {
							Static33.anIntArray150[local20++] = local998.anInt99;
							continue;
						}
						if (local168 == 1605) {
							Static33.anIntArray150[local20++] = local998.anInt88;
							continue;
						}
						if (local168 == 1606) {
							Static33.anIntArray150[local20++] = local998.anInt54;
							continue;
						}
						if (local168 == 1607) {
							Static33.anIntArray150[local20++] = local998.anInt67;
							continue;
						}
						if (local168 == 1608) {
							Static33.anIntArray150[local20++] = local998.anInt89;
							continue;
						}
					} else if (local168 < 1800) {
						local998 = local840 ? Static123.aClass1_Sub1_Sub1_4 : Static36.aClass1_Sub1_Sub1_2;
						if (local168 == 1700) {
							Static33.anIntArray150[local20++] = local998.anInt97;
							continue;
						}
						if (local168 == 1701) {
							if (local998.anInt97 == -1) {
								Static33.anIntArray150[local20++] = 0;
							} else {
								Static33.anIntArray150[local20++] = local998.anInt47;
							}
							continue;
						}
						if (local168 == 1702) {
							Static33.anIntArray150[local20++] = local998.anInt46;
							continue;
						}
					} else if (local168 < 1900) {
						local998 = local840 ? Static123.aClass1_Sub1_Sub1_4 : Static36.aClass1_Sub1_Sub1_2;
						if (local168 == 1800) {
							Static33.anIntArray150[local20++] = Static54.method989(Static129.method2213(local998));
							continue;
						}
						if (local168 == 1801) {
							local20--;
							local719 = Static33.anIntArray150[local20];
							if (local998.aClass39Array2 != null && local998.aClass39Array2.length > local719 && local998.aClass39Array2[local719] != null) {
								Static55.aClass39Array15[local24++] = local998.aClass39Array2[local719];
								continue;
							}
							Static55.aClass39Array15[local24++] = Static123.aClass39_1486;
							continue;
						}
						if (local168 == 1802) {
							if (local998.aClass39_35 == null) {
								Static55.aClass39Array15[local24++] = Static123.aClass39_1486;
							} else {
								Static55.aClass39Array15[local24++] = local998.aClass39_35;
							}
							continue;
						}
					} else if (local168 < 2600) {
						local20--;
						local998 = Static41.method2106(Static33.anIntArray150[local20]);
						if (local168 == 2500) {
							Static33.anIntArray150[local20++] = local998.anInt81;
							continue;
						}
						if (local168 == 2501) {
							Static33.anIntArray150[local20++] = local998.anInt110;
							continue;
						}
						if (local168 == 2502) {
							Static33.anIntArray150[local20++] = local998.anInt101;
							continue;
						}
						if (local168 == 2503) {
							Static33.anIntArray150[local20++] = local998.anInt82;
							continue;
						}
						if (local168 == 2504) {
							Static33.anIntArray150[local20++] = local998.aBoolean8 ? 1 : 0;
							continue;
						}
						if (local168 == 2505) {
							Static33.anIntArray150[local20++] = local998.anInt102;
							continue;
						}
					} else if (local168 < 2700) {
						local20--;
						local998 = Static41.method2106(Static33.anIntArray150[local20]);
						if (local168 == 2600) {
							Static33.anIntArray150[local20++] = local998.anInt87;
							continue;
						}
						if (local168 == 2601) {
							Static33.anIntArray150[local20++] = local998.anInt95;
							continue;
						}
						if (local168 == 2602) {
							Static55.aClass39Array15[local24++] = local998.aClass39_30;
							continue;
						}
						if (local168 == 2603) {
							Static33.anIntArray150[local20++] = local998.anInt111;
							continue;
						}
						if (local168 == 2604) {
							Static33.anIntArray150[local20++] = local998.anInt99;
							continue;
						}
						if (local168 == 2605) {
							Static33.anIntArray150[local20++] = local998.anInt88;
							continue;
						}
						if (local168 == 2606) {
							Static33.anIntArray150[local20++] = local998.anInt54;
							continue;
						}
						if (local168 == 2607) {
							Static33.anIntArray150[local20++] = local998.anInt67;
							continue;
						}
						if (local168 == 2608) {
							Static33.anIntArray150[local20++] = local998.anInt89;
							continue;
						}
					} else if (local168 < 2800) {
						local20--;
						local998 = Static41.method2106(Static33.anIntArray150[local20]);
						if (local168 == 2700) {
							Static33.anIntArray150[local20++] = local998.anInt97;
							continue;
						}
						if (local168 == 2701) {
							if (local998.anInt97 == -1) {
								Static33.anIntArray150[local20++] = 0;
							} else {
								Static33.anIntArray150[local20++] = local998.anInt47;
							}
							continue;
						}
					} else if (local168 < 2900) {
						local20--;
						local998 = Static41.method2106(Static33.anIntArray150[local20]);
						if (local168 == 2800) {
							Static33.anIntArray150[local20++] = Static54.method989(Static129.method2213(local998));
							continue;
						}
						if (local168 == 2801) {
							local20--;
							local719 = Static33.anIntArray150[local20];
							if (local998.aClass39Array2 != null && local719 < local998.aClass39Array2.length && local998.aClass39Array2[local719] != null) {
								Static55.aClass39Array15[local24++] = local998.aClass39Array2[local719];
								continue;
							}
							Static55.aClass39Array15[local24++] = Static123.aClass39_1486;
							continue;
						}
						if (local168 == 2802) {
							if (local998.aClass39_35 == null) {
								Static55.aClass39Array15[local24++] = Static123.aClass39_1486;
							} else {
								Static55.aClass39Array15[local24++] = local998.aClass39_35;
							}
							continue;
						}
					} else if (local168 < 3200) {
						if (local168 == 3100) {
							local24--;
							local534 = Static55.aClass39Array15[local24];
							Static66.method1189(Static123.aClass39_1486, local534, 0);
							continue;
						}
						if (local168 == 3101) {
							local20 -= 2;
							Static105.method1877(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1, Static33.anIntArray150[local20], Static33.anIntArray150[local20 + 1]);
							continue;
						}
						if (local168 == 3102) {
							local20--;
							local714 = Static33.anIntArray150[local20];
							if (local714 >= 0 && Static23.anIntArray117.length > local714 && Static23.anIntArray117[local714] != -1) {
								Static126.aBoolean247 = true;
								Static35.aBoolean96 = true;
								Static120.anInt3073 = local714;
							}
							continue;
						}
						if (local168 == 3103) {
							Static20.method408();
							continue;
						}
					} else if (local168 < 3300) {
						if (local168 == 3200) {
							local20 -= 3;
							Static66.method1191(Static33.anIntArray150[local20], Static33.anIntArray150[local20 + 1], Static33.anIntArray150[local20 + 2]);
							continue;
						}
						if (local168 == 3201) {
							local20--;
							Static129.method2209(Static33.anIntArray150[local20]);
							continue;
						}
						if (local168 == 3202) {
							local20 -= 2;
							Static49.method859(Static33.anIntArray150[local20 + 1], Static33.anIntArray150[local20]);
							continue;
						}
					} else if (local168 < 3400) {
						if (local168 == 3300) {
							Static33.anIntArray150[local20++] = Static45.anInt1256;
							continue;
						}
						if (local168 == 3301) {
							local20 -= 2;
							local714 = Static33.anIntArray150[local20];
							local719 = Static33.anIntArray150[local20 + 1];
							Static33.anIntArray150[local20++] = Static19.method366(local719, local714);
							continue;
						}
						if (local168 == 3302) {
							local20 -= 2;
							local714 = Static33.anIntArray150[local20];
							local719 = Static33.anIntArray150[local20 + 1];
							Static33.anIntArray150[local20++] = Static20.method405(local719, local714);
							continue;
						}
						if (local168 == 3303) {
							local20 -= 2;
							local719 = Static33.anIntArray150[local20 + 1];
							local714 = Static33.anIntArray150[local20];
							Static33.anIntArray150[local20++] = Static24.method452(local714, local719);
							continue;
						}
						if (local168 == 3304) {
							local20--;
							local714 = Static33.anIntArray150[local20];
							Static33.anIntArray150[local20++] = Static67.method1202(local714).anInt1003;
							continue;
						}
						if (local168 == 3305) {
							local20--;
							local714 = Static33.anIntArray150[local20];
							Static33.anIntArray150[local20++] = Static1.anIntArray10[local714];
							continue;
						}
						if (local168 == 3306) {
							local20--;
							local714 = Static33.anIntArray150[local20];
							Static33.anIntArray150[local20++] = Static36.anIntArray156[local714];
							continue;
						}
						if (local168 == 3307) {
							local20--;
							local714 = Static33.anIntArray150[local20];
							Static33.anIntArray150[local20++] = Static94.anIntArray339[local714];
							continue;
						}
						if (local168 == 3308) {
							local869 = (Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2508 >> 7) + Static103.anInt2610;
							local719 = Static71.anInt1795 + (Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2521 >> 7);
							local714 = Static9.anInt2983;
							Static33.anIntArray150[local20++] = (local714 << 28) - (-(local719 << 14) - local869);
							continue;
						}
						if (local168 == 3309) {
							local20--;
							local714 = Static33.anIntArray150[local20];
							Static33.anIntArray150[local20++] = local714 >> 14 & 0x3FFF;
							continue;
						}
						if (local168 == 3310) {
							local20--;
							local714 = Static33.anIntArray150[local20];
							Static33.anIntArray150[local20++] = local714 >> 28;
							continue;
						}
						if (local168 == 3311) {
							local20--;
							local714 = Static33.anIntArray150[local20];
							Static33.anIntArray150[local20++] = local714 & 0x3FFF;
							continue;
						}
						if (local168 == 3312) {
							Static33.anIntArray150[local20++] = Static46.aBoolean224 ? 1 : 0;
							continue;
						}
						if (local168 == 3313) {
							local20 -= 2;
							local719 = Static33.anIntArray150[local20 + 1];
							local714 = Static33.anIntArray150[local20] + 32768;
							Static33.anIntArray150[local20++] = Static19.method366(local719, local714);
							continue;
						}
						if (local168 == 3314) {
							local20 -= 2;
							local714 = Static33.anIntArray150[local20] + 32768;
							local719 = Static33.anIntArray150[local20 + 1];
							Static33.anIntArray150[local20++] = Static20.method405(local719, local714);
							continue;
						}
						if (local168 == 3315) {
							local20 -= 2;
							local714 = Static33.anIntArray150[local20] + 32768;
							local719 = Static33.anIntArray150[local20 + 1];
							Static33.anIntArray150[local20++] = Static24.method452(local714, local719);
							continue;
						}
					} else if (local168 < 3500) {
						if (local168 == 3400) {
							local20 -= 2;
							local714 = Static33.anIntArray150[local20];
							local719 = Static33.anIntArray150[local20 + 1];
							@Pc(3458) Class1_Sub1_Sub9 local3458 = Static127.method2190(local714);
							for (local578 = 0; local578 < local3458.anInt1147; local578++) {
								if (local3458.anIntArray165[local578] == local719) {
									Static55.aClass39Array15[local24++] = local3458.aClass39Array10[local578];
									local3458 = null;
									break;
								}
							}
							if (local3458 != null) {
								Static55.aClass39Array15[local24++] = local3458.aClass39_533;
							}
							continue;
						}
						if (local168 == 3408) {
							local20 -= 4;
							local714 = Static33.anIntArray150[local20];
							local869 = Static33.anIntArray150[local20 + 2];
							local719 = Static33.anIntArray150[local20 + 1];
							local578 = Static33.anIntArray150[local20 + 3];
							@Pc(3534) Class1_Sub1_Sub9 local3534 = Static127.method2190(local869);
							if (local3534.anInt1153 == local714 && local3534.anInt1146 == local719) {
								for (local902 = 0; local902 < local3534.anInt1147; local902++) {
									if (local578 == local3534.anIntArray165[local902]) {
										if (local719 == 115) {
											Static55.aClass39Array15[local24++] = local3534.aClass39Array10[local902];
										} else {
											Static33.anIntArray150[local20++] = local3534.anIntArray164[local902];
										}
										local3534 = null;
										break;
									}
								}
								if (local3534 != null) {
									if (local719 == 115) {
										Static55.aClass39Array15[local24++] = local3534.aClass39_533;
									} else {
										Static33.anIntArray150[local20++] = local3534.anInt1150;
									}
								}
								continue;
							}
							if (local719 == 115) {
								Static55.aClass39Array15[local24++] = Static86.aClass39_1041;
							} else {
								Static33.anIntArray150[local20++] = 0;
							}
							continue;
						}
					} else if (local168 < 3700) {
						if (local168 == 3600) {
							if (Static113.anInt2820 == 0) {
								Static33.anIntArray150[local20++] = -2;
							} else if (Static113.anInt2820 == 1) {
								Static33.anIntArray150[local20++] = -1;
							} else {
								Static33.anIntArray150[local20++] = Static12.anInt502;
							}
							continue;
						}
						if (local168 == 3601) {
							local20--;
							local714 = Static33.anIntArray150[local20];
							if (Static113.anInt2820 == 2 && Static12.anInt502 > local714) {
								Static55.aClass39Array15[local24++] = Static117.aClass39Array29[local714];
								continue;
							}
							Static55.aClass39Array15[local24++] = Static123.aClass39_1486;
							continue;
						}
						if (local168 == 3602) {
							local20--;
							local714 = Static33.anIntArray150[local20];
							if (Static113.anInt2820 == 2 && local714 < Static12.anInt502) {
								Static33.anIntArray150[local20++] = Static14.anIntArray93[local714];
								continue;
							}
							Static33.anIntArray150[local20++] = 0;
							continue;
						}
						if (local168 == 3603) {
							local20--;
							local714 = Static33.anIntArray150[local20];
							if (Static113.anInt2820 == 2 && local714 < Static12.anInt502) {
								Static33.anIntArray150[local20++] = Static88.anIntArray322[local714];
								continue;
							}
							Static33.anIntArray150[local20++] = 0;
							continue;
						}
						if (local168 == 3604) {
							local24--;
							local534 = Static55.aClass39Array15[local24];
							local20--;
							local719 = Static33.anIntArray150[local20];
							Static37.method666(local719, local534);
							continue;
						}
						if (local168 == 3611) {
							if (Static79.aClass39_1227 == null) {
								Static55.aClass39Array15[local24++] = Static123.aClass39_1486;
							} else {
								Static55.aClass39Array15[local24++] = Static79.aClass39_1227;
							}
							continue;
						}
						if (local168 == 3612) {
							if (Static79.aClass39_1227 == null) {
								Static33.anIntArray150[local20++] = 0;
							} else {
								Static33.anIntArray150[local20++] = Static47.anInt1304;
							}
							continue;
						}
						if (local168 == 3613) {
							local20--;
							local714 = Static33.anIntArray150[local20];
							if (Static79.aClass39_1227 != null && Static47.anInt1304 > local714) {
								Static55.aClass39Array15[local24++] = Static11.aClass1_Sub12Array1[local714].aClass39_886;
								continue;
							}
							Static55.aClass39Array15[local24++] = Static123.aClass39_1486;
							continue;
						}
						if (local168 == 3614) {
							local20--;
							local714 = Static33.anIntArray150[local20];
							if (Static79.aClass39_1227 != null && local714 < Static47.anInt1304) {
								Static33.anIntArray150[local20++] = Static11.aClass1_Sub12Array1[local714].anInt1787;
								continue;
							}
							Static33.anIntArray150[local20++] = 0;
							continue;
						}
						if (local168 == 3615) {
							local20--;
							local714 = Static33.anIntArray150[local20];
							if (Static79.aClass39_1227 != null && local714 < Static47.anInt1304) {
								Static33.anIntArray150[local20++] = Static11.aClass1_Sub12Array1[local714].aByte3;
								continue;
							}
							Static33.anIntArray150[local20++] = 0;
							continue;
						}
					} else if (local168 < 4100) {
						if (local168 == 4000) {
							local20 -= 2;
							local719 = Static33.anIntArray150[local20 + 1];
							local714 = Static33.anIntArray150[local20];
							Static33.anIntArray150[local20++] = local719 + local714;
							continue;
						}
						if (local168 == 4001) {
							local20 -= 2;
							local714 = Static33.anIntArray150[local20];
							local719 = Static33.anIntArray150[local20 + 1];
							Static33.anIntArray150[local20++] = local714 - local719;
							continue;
						}
						if (local168 == 4002) {
							local20 -= 2;
							local714 = Static33.anIntArray150[local20];
							local719 = Static33.anIntArray150[local20 + 1];
							Static33.anIntArray150[local20++] = local714 * local719;
							continue;
						}
						if (local168 == 4003) {
							local20 -= 2;
							local714 = Static33.anIntArray150[local20];
							local719 = Static33.anIntArray150[local20 + 1];
							Static33.anIntArray150[local20++] = local714 / local719;
							continue;
						}
						if (local168 == 4004) {
							local20--;
							local714 = Static33.anIntArray150[local20];
							Static33.anIntArray150[local20++] = (int) ((double) local714 * Math.random());
							continue;
						}
						if (local168 == 4005) {
							local20--;
							local714 = Static33.anIntArray150[local20];
							Static33.anIntArray150[local20++] = (int) (Math.random() * (double) (local714 + 1));
							continue;
						}
						if (local168 == 4006) {
							local20 -= 5;
							local714 = Static33.anIntArray150[local20];
							local719 = Static33.anIntArray150[local20 + 1];
							local578 = Static33.anIntArray150[local20 + 3];
							local869 = Static33.anIntArray150[local20 + 2];
							local599 = Static33.anIntArray150[local20 + 4];
							Static33.anIntArray150[local20++] = (local599 - local869) * (-local714 + local719) / (local578 - local869) + local714;
							continue;
						}
						if (local168 == 4007) {
							local20 -= 2;
							local714 = Static33.anIntArray150[local20];
							local719 = Static33.anIntArray150[local20 + 1];
							Static33.anIntArray150[local20++] = local714 + local719 * local714 / 100;
							continue;
						}
						if (local168 == 4008) {
							local20 -= 2;
							local714 = Static33.anIntArray150[local20];
							local719 = Static33.anIntArray150[local20 + 1];
							Static33.anIntArray150[local20++] = 0x1 << local719 | local714;
							continue;
						}
						if (local168 == 4009) {
							local20 -= 2;
							local714 = Static33.anIntArray150[local20];
							local719 = Static33.anIntArray150[local20 + 1];
							Static33.anIntArray150[local20++] = local714 & -(0x1 << local719) - 1;
							continue;
						}
						if (local168 == 4010) {
							local20 -= 2;
							local714 = Static33.anIntArray150[local20];
							local719 = Static33.anIntArray150[local20 + 1];
							Static33.anIntArray150[local20++] = (0x1 << local719 & local714) == 0 ? 0 : 1;
							continue;
						}
						if (local168 == 4011) {
							local20 -= 2;
							local714 = Static33.anIntArray150[local20];
							local719 = Static33.anIntArray150[local20 + 1];
							Static33.anIntArray150[local20++] = local714 % local719;
							continue;
						}
						if (local168 == 4012) {
							local20 -= 2;
							local714 = Static33.anIntArray150[local20];
							local719 = Static33.anIntArray150[local20 + 1];
							if (local714 == 0) {
								Static33.anIntArray150[local20++] = 0;
							} else {
								Static33.anIntArray150[local20++] = (int) Math.pow((double) local714, (double) local719);
							}
							continue;
						}
						if (local168 == 4013) {
							local20 -= 2;
							local714 = Static33.anIntArray150[local20];
							local719 = Static33.anIntArray150[local20 + 1];
							if (local714 == 0) {
								Static33.anIntArray150[local20++] = 0;
							} else if (local719 == 0) {
								Static33.anIntArray150[local20++] = Integer.MAX_VALUE;
							} else {
								Static33.anIntArray150[local20++] = (int) Math.pow((double) local714, 1.0D / (double) local719);
							}
							continue;
						}
						if (local168 == 4014) {
							local20 -= 2;
							local719 = Static33.anIntArray150[local20 + 1];
							local714 = Static33.anIntArray150[local20];
							Static33.anIntArray150[local20++] = local719 & local714;
							continue;
						}
						if (local168 == 4015) {
							local20 -= 2;
							local719 = Static33.anIntArray150[local20 + 1];
							local714 = Static33.anIntArray150[local20];
							Static33.anIntArray150[local20++] = local714 | local719;
							continue;
						}
					} else if (local168 < 4200) {
						if (local168 == 4100) {
							local24--;
							local534 = Static55.aClass39Array15[local24];
							local20--;
							local719 = Static33.anIntArray150[local20];
							Static55.aClass39Array15[local24++] = Static30.method601(new Class39[] { local534, Static69.method1226(local719) });
							continue;
						}
						if (local168 == 4101) {
							local24 -= 2;
							local534 = Static55.aClass39Array15[local24];
							local2543 = Static55.aClass39Array15[local24 + 1];
							Static55.aClass39Array15[local24++] = Static30.method601(new Class39[] { local534, local2543 });
							continue;
						}
						if (local168 == 4102) {
							local24--;
							local534 = Static55.aClass39Array15[local24];
							local20--;
							local719 = Static33.anIntArray150[local20];
							Static55.aClass39Array15[local24++] = Static30.method601(new Class39[] { local534, Static120.method2129(local719) });
							continue;
						}
						if (local168 == 4103) {
							local24--;
							local534 = Static55.aClass39Array15[local24];
							Static55.aClass39Array15[local24++] = local534.method1151();
							continue;
						}
						if (local168 == 4104) {
							local20--;
							local714 = Static33.anIntArray150[local20];
							@Pc(2629) long local2629 = (long) local714 * 86400000L + 1014768000000L;
							Static51.aCalendar1.setTime(new Date(local2629));
							local578 = Static51.aCalendar1.get(5);
							local599 = Static51.aCalendar1.get(2);
							local902 = Static51.aCalendar1.get(1);
							Static55.aClass39Array15[local24++] = Static30.method601(new Class39[] { Static69.method1226(local578), Static58.aClass39_766, Static63.aClass39Array18[local599], Static58.aClass39_766, Static69.method1226(local902) });
							continue;
						}
						if (local168 == 4105) {
							local24 -= 2;
							local2543 = Static55.aClass39Array15[local24 + 1];
							local534 = Static55.aClass39Array15[local24];
							if (Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass28_1 != null && Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass28_1.aBoolean118) {
								Static55.aClass39Array15[local24++] = local2543;
								continue;
							}
							Static55.aClass39Array15[local24++] = local534;
							continue;
						}
						if (local168 == 4106) {
							local20--;
							local714 = Static33.anIntArray150[local20];
							Static55.aClass39Array15[local24++] = Static69.method1226(local714);
							continue;
						}
						if (local168 == 4107) {
							local24 -= 2;
							Static33.anIntArray150[local20++] = Static55.aClass39Array15[local24].method1182(Static55.aClass39Array15[local24 + 1]);
							continue;
						}
						@Pc(2786) byte[] local2786;
						@Pc(2791) Class1_Sub1_Sub4_Sub3 local2791;
						if (local168 == 4108) {
							local20 -= 2;
							local24--;
							local534 = Static55.aClass39Array15[local24];
							local719 = Static33.anIntArray150[local20];
							local869 = Static33.anIntArray150[local20 + 1];
							local2786 = Static68.aClass62_Sub1_47.method2008(0, local869);
							local2791 = new Class1_Sub1_Sub4_Sub3(local2786);
							Static33.anIntArray150[local20++] = local2791.method743(local534, local719);
							continue;
						}
						if (local168 == 4109) {
							local20 -= 2;
							local719 = Static33.anIntArray150[local20];
							local24--;
							local534 = Static55.aClass39Array15[local24];
							local869 = Static33.anIntArray150[local20 + 1];
							local2786 = Static68.aClass62_Sub1_47.method2008(0, local869);
							local2791 = new Class1_Sub1_Sub4_Sub3(local2786);
							Static33.anIntArray150[local20++] = local2791.method749(local534, local719);
							continue;
						}
						if (local168 == 4110) {
							local24 -= 2;
							local534 = Static55.aClass39Array15[local24];
							local2543 = Static55.aClass39Array15[local24 + 1];
							local20--;
							if (Static33.anIntArray150[local20] == 1) {
								Static55.aClass39Array15[local24++] = local534;
							} else {
								Static55.aClass39Array15[local24++] = local2543;
							}
							continue;
						}
					} else if (local168 < 4300) {
						if (local168 == 4200) {
							local20--;
							local714 = Static33.anIntArray150[local20];
							Static55.aClass39Array15[local24++] = Static8.method224(local714).aClass39_1321;
							continue;
						}
						@Pc(2922) Class1_Sub1_Sub17 local2922;
						if (local168 == 4201) {
							local20 -= 2;
							local714 = Static33.anIntArray150[local20];
							local719 = Static33.anIntArray150[local20 + 1];
							local2922 = Static8.method224(local714);
							if (local719 >= 1 && local719 <= 5 && local2922.aClass39Array28[local719 - 1] != null) {
								Static55.aClass39Array15[local24++] = local2922.aClass39Array28[local719 - 1];
								continue;
							}
							Static55.aClass39Array15[local24++] = Static123.aClass39_1486;
							continue;
						}
						if (local168 == 4202) {
							local20 -= 2;
							local714 = Static33.anIntArray150[local20];
							local719 = Static33.anIntArray150[local20 + 1];
							local2922 = Static8.method224(local714);
							if (local719 >= 1 && local719 <= 5 && local2922.aClass39Array27[local719 - 1] != null) {
								Static55.aClass39Array15[local24++] = local2922.aClass39Array27[local719 - 1];
								continue;
							}
							Static55.aClass39Array15[local24++] = Static123.aClass39_1486;
							continue;
						}
						if (local168 == 4203) {
							local20--;
							local714 = Static33.anIntArray150[local20];
							Static33.anIntArray150[local20++] = Static8.method224(local714).anInt2742;
							continue;
						}
						if (local168 == 4204) {
							local20--;
							local714 = Static33.anIntArray150[local20];
							Static33.anIntArray150[local20++] = Static8.method224(local714).anInt2755 == 1 ? 1 : 0;
							continue;
						}
						@Pc(3065) Class1_Sub1_Sub17 local3065;
						if (local168 == 4205) {
							local20--;
							local714 = Static33.anIntArray150[local20];
							local3065 = Static8.method224(local714);
							if (local3065.anInt2748 == -1 && local3065.anInt2729 >= 0) {
								Static33.anIntArray150[local20++] = local3065.anInt2729;
								continue;
							}
							Static33.anIntArray150[local20++] = local714;
							continue;
						}
						if (local168 == 4206) {
							local20--;
							local714 = Static33.anIntArray150[local20];
							local3065 = Static8.method224(local714);
							if (local3065.anInt2748 >= 0 && local3065.anInt2729 >= 0) {
								Static33.anIntArray150[local20++] = local3065.anInt2729;
								continue;
							}
							Static33.anIntArray150[local20++] = local714;
							continue;
						}
						if (local168 == 4207) {
							local20--;
							local714 = Static33.anIntArray150[local20];
							Static33.anIntArray150[local20++] = Static8.method224(local714).aBoolean220 ? 1 : 0;
							continue;
						}
					}
				} else {
					if (local168 >= 2000) {
						local20--;
						local998 = Static41.method2106(Static33.anIntArray150[local20]);
						local168 -= 1000;
					} else {
						local998 = local840 ? Static123.aClass1_Sub1_Sub1_4 : Static36.aClass1_Sub1_Sub1_2;
					}
					if (local168 == 1300) {
						local20--;
						local719 = Static33.anIntArray150[local20] - 1;
						if (local719 >= 0 && local719 <= 9) {
							local24--;
							local998.method39(Static55.aClass39Array15[local24], local719);
							continue;
						}
						local24--;
						continue;
					}
					if (local168 == 1301) {
						local20 -= 2;
						local719 = Static33.anIntArray150[local20];
						local869 = Static33.anIntArray150[local20 + 1];
						local998.aClass1_Sub1_Sub1_1 = Static32.method393(local719, local869);
						continue;
					}
					if (local168 == 1302) {
						local20--;
						local998.aBoolean11 = Static33.anIntArray150[local20] == 1;
						continue;
					}
					if (local168 == 1303) {
						local20--;
						local998.anInt68 = Static33.anIntArray150[local20];
						continue;
					}
					if (local168 == 1304) {
						local20--;
						local998.anInt65 = Static33.anIntArray150[local20];
						continue;
					}
					if (local168 == 1305) {
						local24--;
						local998.aClass39_35 = Static55.aClass39Array15[local24];
						continue;
					}
					if (local168 == 1306) {
						local24--;
						local998.aClass39_37 = Static55.aClass39Array15[local24];
						continue;
					}
				}
				Static95.method2004("CS2 - nosuchop:" + local168, null);
				return;
			}
		} catch (@Pc(4972) Exception local4972) {
			Static95.method2004("CS2 - scr:" + local15.aLong98 + " op:" + local32, local4972);
		}
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(Z)V")
	public static void method963() {
		aClass62_14 = null;
		aClass1_Sub1_Sub4_Sub1Array5 = null;
		aClass39_698 = null;
		aClass39_697 = null;
		aClass39_694 = null;
		aClass39_695 = null;
		anIntArray203 = null;
		aClass39_696 = null;
		aClass39_699 = null;
		aClass6_13 = null;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
	public static void method964() {
		Static81.aByteArrayArray8 = null;
		Static21.anIntArray107 = null;
		Static23.anIntArray116 = null;
		Static113.anIntArray436 = null;
		Static2.anIntArray21 = null;
		Static64.anIntArray244 = null;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!pq", name = "k", descriptor = "Lclient!tc;")
	public static Class91 aClass91_9;

	@OriginalMember(owner = "client!pq", name = "r", descriptor = "Lclient!ra;")
	public static Class170 aClass170_74;

	@OriginalMember(owner = "client!pq", name = "i", descriptor = "I")
	public static int anInt3873 = 0;

	@OriginalMember(owner = "client!pq", name = "j", descriptor = "I")
	public static int anInt3874 = 0;

	@OriginalMember(owner = "client!pq", name = "m", descriptor = "I")
	public static int anInt3876 = 0;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZJIII)Ljava/lang/String;")
	public static String method3550(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) char local12 = ',';
		@Pc(14) char local14 = '.';
		if (arg3 == 0) {
			local14 = ',';
			local12 = '.';
		}
		if (arg3 == 2) {
			local14 = ' ';
		}
		@Pc(32) boolean local32 = false;
		if (arg1 < 0L) {
			arg1 = -arg1;
			local32 = true;
		}
		@Pc(48) StringBuffer local48 = new StringBuffer(26);
		@Pc(55) int local55;
		@Pc(60) int local60;
		if (arg2 > 0) {
			for (local55 = 0; local55 < arg2; local55++) {
				local60 = (int) arg1;
				arg1 /= 10L;
				local48.append((char) (local60 + 48 - (int) arg1 * 10));
			}
			local48.append(local12);
		}
		local55 = 0;
		while (true) {
			local60 = (int) arg1;
			arg1 /= 10L;
			local48.append((char) (local60 + 48 - (int) arg1 * 10));
			if (arg1 == 0L) {
				if (local32) {
					local48.append('-');
				}
				return local48.reverse().toString();
			}
			if (arg0) {
				local55++;
				if (local55 % 3 == 0) {
					local48.append(local14);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(III[II)V")
	public static void method3552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		arg1--;
		@Pc(5) int local5 = arg3 - 1;
		@Pc(9) int local9 = local5 - 7;
		while (arg1 < local9) {
			@Pc(16) int local16 = arg1 + 1;
			arg2[local16] = arg0;
			@Pc(21) int local21 = local16 + 1;
			arg2[local21] = arg0;
			@Pc(26) int local26 = local21 + 1;
			arg2[local26] = arg0;
			@Pc(31) int local31 = local26 + 1;
			arg2[local31] = arg0;
			@Pc(36) int local36 = local31 + 1;
			arg2[local36] = arg0;
			@Pc(41) int local41 = local36 + 1;
			arg2[local41] = arg0;
			@Pc(46) int local46 = local41 + 1;
			arg2[local46] = arg0;
			arg1 = local46 + 1;
			arg2[arg1] = arg0;
		}
		while (arg1 < local5) {
			arg1++;
			arg2[arg1] = arg0;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILclient!bq;)V")
	public static void method3554(@OriginalArg(1) Class5_Sub4 arg0) {
		if (arg0 == null || Static60.aClass211_4.aClass5_235 == arg0) {
			return;
		}
		@Pc(20) int local20 = arg0.anInt790;
		@Pc(23) int local23 = arg0.anInt781;
		@Pc(26) int local26 = arg0.anInt785;
		@Pc(30) int local30 = (int) arg0.aLong24;
		@Pc(33) long local33 = arg0.aLong24;
		if (local26 >= 2000) {
			local26 -= 2000;
		}
		@Pc(50) Class96 local50;
		if (local26 == 41) {
			Static279.method4734();
			local50 = Static121.method2396(local23);
			Static229.anInt4484 = local20;
			Static51.anInt1288 = local23;
			Static100.anInt2199 = 1;
			Static135.anInt2754 = local30;
			Static336.method4719(local50);
			Static332.aString362 = "<col=ff9040>" + Static88.method1382(local30).aString291 + "<col=ffffff>";
			if (Static332.aString362 == null) {
				Static332.aString362 = "null";
			}
			return;
		}
		@Pc(88) Class25_Sub1_Sub1_Sub1 local88;
		if (local26 == 58) {
			local88 = Static312.aClass25_Sub1_Sub1_Sub1Array1[local30];
			if (local88 != null) {
				Static172.anInt3527 = Static61.anInt1429;
				Static171.anInt3516 = 2;
				Static67.anInt1692 = Static318.anInt5916;
				anInt3876 = 0;
				Static335.aClass5_Sub1_Sub1_3.method174(210);
				Static335.aClass5_Sub1_Sub1_3.method1851(Static51.anInt1288);
				Static335.aClass5_Sub1_Sub1_3.method1880(Static233.aBooleanArray19[82] ? 1 : 0);
				Static335.aClass5_Sub1_Sub1_3.method1844(Static135.anInt2754);
				Static335.aClass5_Sub1_Sub1_3.method1870(local30);
				Static335.aClass5_Sub1_Sub1_3.method1861(Static229.anInt4484);
				Static227.method3914(Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray401[0], local88.anIntArray401[0], local88.method4646(), -2, local88.method4646(), true, 0, 0, Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray402[0], local88.anIntArray402[0]);
			}
		}
		if (local26 == 29) {
			local50 = Static121.method2396(local23);
			@Pc(176) boolean local176 = true;
			if (local50.anInt2935 > 0) {
				local176 = Static307.method5242(local50);
			}
			if (local176) {
				Static335.aClass5_Sub1_Sub1_3.method174(163);
				Static335.aClass5_Sub1_Sub1_3.method1851(local23);
			}
		}
		if (local26 == 60) {
			Static335.aClass5_Sub1_Sub1_3.method174(33);
			Static335.aClass5_Sub1_Sub1_3.method1851(local23);
			Static335.aClass5_Sub1_Sub1_3.method1870(Static21.anInt6209);
			Static335.aClass5_Sub1_Sub1_3.method1876(Static151.anInt3085);
			Static335.aClass5_Sub1_Sub1_3.method1847(local20);
			Static335.aClass5_Sub1_Sub1_3.method1861(local30);
			Static233.anInt4552 = 0;
			Static72.aClass96_6 = Static121.method2396(local23);
			Static62.anInt1439 = local20;
		}
		if (local26 == 59) {
			if (Static70.anInt1768 > 0 && Static233.aBooleanArray19[82] && Static233.aBooleanArray19[81]) {
				Static194.method3500(Static28.anInt773 + local23, Static156.anInt3123, local20 + Static263.anInt5063);
			} else {
				Static58.method1225(local30, local20, local23);
				if (local30 == 1) {
					Static335.aClass5_Sub1_Sub1_3.method1886(-1);
					Static335.aClass5_Sub1_Sub1_3.method1886(-1);
					Static335.aClass5_Sub1_Sub1_3.method1870((int) Static155.aFloat64);
					Static335.aClass5_Sub1_Sub1_3.method1886(57);
					Static335.aClass5_Sub1_Sub1_3.method1886(Static253.anInt4957);
					Static335.aClass5_Sub1_Sub1_3.method1886(Static339.anInt6353);
					Static335.aClass5_Sub1_Sub1_3.method1886(89);
					Static335.aClass5_Sub1_Sub1_3.method1870(Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5769);
					Static335.aClass5_Sub1_Sub1_3.method1870(Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5773);
					Static335.aClass5_Sub1_Sub1_3.method1886(63);
				} else {
					Static171.anInt3516 = 1;
					Static172.anInt3527 = Static61.anInt1429;
					anInt3876 = 0;
					Static67.anInt1692 = Static318.anInt5916;
				}
				Static227.method3914(Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray401[0], local23, 1, -4, 1, true, 0, 0, Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray402[0], local20);
			}
		}
		if (local26 == 44) {
			Static335.aClass5_Sub1_Sub1_3.method174(173);
			Static335.aClass5_Sub1_Sub1_3.method1851(local23);
			Static335.aClass5_Sub1_Sub1_3.method1844(local20);
			Static335.aClass5_Sub1_Sub1_3.method1861(local30);
			Static233.anInt4552 = 0;
			Static72.aClass96_6 = Static121.method2396(local23);
			Static62.anInt1439 = local20;
		}
		if (local26 == 18) {
			Static171.anInt3516 = 2;
			Static172.anInt3527 = Static61.anInt1429;
			Static67.anInt1692 = Static318.anInt5916;
			anInt3876 = 0;
			Static335.aClass5_Sub1_Sub1_3.method174(135);
			Static335.aClass5_Sub1_Sub1_3.method1870(Static263.anInt5063 + local20);
			Static335.aClass5_Sub1_Sub1_3.method1870(Static28.anInt773 + local23);
			Static335.aClass5_Sub1_Sub1_3.method1844(local30);
			Static335.aClass5_Sub1_Sub1_3.method1847(Static21.anInt6209);
			Static335.aClass5_Sub1_Sub1_3.method1835(Static233.aBooleanArray19[82] ? 1 : 0);
			Static335.aClass5_Sub1_Sub1_3.method1848(Static151.anInt3085);
			Static62.method1257(local23, local20);
		}
		if (local26 == 9) {
			local88 = Static312.aClass25_Sub1_Sub1_Sub1Array1[local30];
			if (local88 != null) {
				Static172.anInt3527 = Static61.anInt1429;
				anInt3876 = 0;
				Static171.anInt3516 = 2;
				Static67.anInt1692 = Static318.anInt5916;
				Static335.aClass5_Sub1_Sub1_3.method174(205);
				Static335.aClass5_Sub1_Sub1_3.method1861(local30);
				Static335.aClass5_Sub1_Sub1_3.method1835(Static233.aBooleanArray19[82] ? 1 : 0);
				Static227.method3914(Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray401[0], local88.anIntArray401[0], local88.method4646(), -2, local88.method4646(), true, 0, 0, Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray402[0], local88.anIntArray402[0]);
			}
		}
		if (local26 == 57) {
			Static335.aClass5_Sub1_Sub1_3.method174(195);
			Static335.aClass5_Sub1_Sub1_3.method1851(local23);
			Static335.aClass5_Sub1_Sub1_3.method1870(local30);
			Static335.aClass5_Sub1_Sub1_3.method1847(local20);
			Static233.anInt4552 = 0;
			Static72.aClass96_6 = Static121.method2396(local23);
			Static62.anInt1439 = local20;
		}
		@Pc(552) Class25_Sub1_Sub1_Sub2 local552;
		if (local26 == 15) {
			local552 = Static188.aClass25_Sub1_Sub1_Sub2Array1[local30];
			if (local552 != null) {
				anInt3876 = 0;
				Static172.anInt3527 = Static61.anInt1429;
				Static171.anInt3516 = 2;
				Static67.anInt1692 = Static318.anInt5916;
				Static335.aClass5_Sub1_Sub1_3.method174(221);
				Static335.aClass5_Sub1_Sub1_3.method1873(Static233.aBooleanArray19[82] ? 1 : 0);
				Static335.aClass5_Sub1_Sub1_3.method1844(local30);
				Static227.method3914(Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray401[0], local552.anIntArray401[0], local552.method4646(), -2, local552.method4646(), true, 0, 0, Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray402[0], local552.anIntArray402[0]);
			}
		}
		if (local26 == 48 || local26 == 1004) {
			Static250.method4375(arg0.aString48, local30, local23, local20);
		}
		if (local26 == 34) {
			Static335.aClass5_Sub1_Sub1_3.method174(194);
			Static335.aClass5_Sub1_Sub1_3.method1851(local23);
			Static335.aClass5_Sub1_Sub1_3.method1861(local20);
			Static335.aClass5_Sub1_Sub1_3.method1847(local30);
			Static233.anInt4552 = 0;
			Static72.aClass96_6 = Static121.method2396(local23);
			Static62.anInt1439 = local20;
		}
		if (local26 == 45) {
			local88 = Static312.aClass25_Sub1_Sub1_Sub1Array1[local30];
			if (local88 != null) {
				anInt3876 = 0;
				Static171.anInt3516 = 2;
				Static172.anInt3527 = Static61.anInt1429;
				Static67.anInt1692 = Static318.anInt5916;
				Static335.aClass5_Sub1_Sub1_3.method174(144);
				Static335.aClass5_Sub1_Sub1_3.method1886(Static233.aBooleanArray19[82] ? 1 : 0);
				Static335.aClass5_Sub1_Sub1_3.method1861(local30);
				Static227.method3914(Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray401[0], local88.anIntArray401[0], local88.method4646(), -2, local88.method4646(), true, 0, 0, Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray402[0], local88.anIntArray402[0]);
			}
		}
		if (local26 == 10) {
			Static67.anInt1692 = Static318.anInt5916;
			Static171.anInt3516 = 2;
			anInt3876 = 0;
			Static172.anInt3527 = Static61.anInt1429;
			Static335.aClass5_Sub1_Sub1_3.method174(243);
			Static335.aClass5_Sub1_Sub1_3.method1847(local30);
			Static335.aClass5_Sub1_Sub1_3.method1870(Static28.anInt773 + local23);
			Static335.aClass5_Sub1_Sub1_3.method1861(Static263.anInt5063 + local20);
			Static335.aClass5_Sub1_Sub1_3.method1880(Static233.aBooleanArray19[82] ? 1 : 0);
			Static62.method1257(local23, local20);
		}
		if (local26 == 14) {
			Static172.anInt3527 = Static61.anInt1429;
			anInt3876 = 0;
			Static67.anInt1692 = Static318.anInt5916;
			Static171.anInt3516 = 2;
			Static335.aClass5_Sub1_Sub1_3.method174(214);
			Static335.aClass5_Sub1_Sub1_3.method1844(local30);
			Static335.aClass5_Sub1_Sub1_3.method1861(local23 + Static28.anInt773);
			Static335.aClass5_Sub1_Sub1_3.method1886(Static233.aBooleanArray19[82] ? 1 : 0);
			Static335.aClass5_Sub1_Sub1_3.method1870(Static263.anInt5063 + local20);
			Static62.method1257(local23, local20);
		}
		if (local26 == 1012) {
			local50 = Static121.method2396(local23);
			if (local50 == null || local50.anIntArray195[local20] < 100000) {
				Static335.aClass5_Sub1_Sub1_3.method174(167);
				Static335.aClass5_Sub1_Sub1_3.method1847(local30);
			} else {
				Static217.method3824(local50.anIntArray195[local20] + " x " + Static88.method1382(local30).aString291);
			}
			Static233.anInt4552 = 0;
			Static72.aClass96_6 = Static121.method2396(local23);
			Static62.anInt1439 = local20;
		}
		if (local26 == 47) {
			Static335.aClass5_Sub1_Sub1_3.method174(164);
			Static335.aClass5_Sub1_Sub1_3.method1851(local23);
			Static335.aClass5_Sub1_Sub1_3.method1870(Static135.anInt2754);
			Static335.aClass5_Sub1_Sub1_3.method1870(Static229.anInt4484);
			Static335.aClass5_Sub1_Sub1_3.method1876(Static51.anInt1288);
			Static335.aClass5_Sub1_Sub1_3.method1847(local20);
			Static335.aClass5_Sub1_Sub1_3.method1861(local30);
			Static233.anInt4552 = 0;
			Static72.aClass96_6 = Static121.method2396(local23);
			Static62.anInt1439 = local20;
		}
		if (local26 == 24) {
			Static171.anInt3516 = 2;
			anInt3876 = 0;
			Static172.anInt3527 = Static61.anInt1429;
			Static67.anInt1692 = Static318.anInt5916;
			Static335.aClass5_Sub1_Sub1_3.method174(90);
			Static335.aClass5_Sub1_Sub1_3.method1873(Static233.aBooleanArray19[82] ? 1 : 0);
			Static335.aClass5_Sub1_Sub1_3.method1847(local20 + Static263.anInt5063);
			Static335.aClass5_Sub1_Sub1_3.method1844(Integer.MAX_VALUE & (int) (local33 >>> 32));
			Static335.aClass5_Sub1_Sub1_3.method1870(Static28.anInt773 + local23);
			Static121.method2398(local20, local33, local23);
		}
		if (local26 == 1011 || local26 == 1010 || local26 == 1008 || local26 == 1003 || local26 == 1006) {
			Static246.method4344(local20, local30, local26);
		}
		if (local26 == 49) {
			Static335.aClass5_Sub1_Sub1_3.method174(73);
			Static335.aClass5_Sub1_Sub1_3.method1851(local23);
			Static335.aClass5_Sub1_Sub1_3.method1847(local20);
			Static335.aClass5_Sub1_Sub1_3.method1844(local30);
			Static233.anInt4552 = 0;
			Static72.aClass96_6 = Static121.method2396(local23);
			Static62.anInt1439 = local20;
		}
		if (local26 == 6) {
			local552 = Static188.aClass25_Sub1_Sub1_Sub2Array1[local30];
			if (local552 != null) {
				Static67.anInt1692 = Static318.anInt5916;
				Static171.anInt3516 = 2;
				anInt3876 = 0;
				Static172.anInt3527 = Static61.anInt1429;
				Static335.aClass5_Sub1_Sub1_3.method174(250);
				Static335.aClass5_Sub1_Sub1_3.method1886(Static233.aBooleanArray19[82] ? 1 : 0);
				Static335.aClass5_Sub1_Sub1_3.method1870(local30);
				Static227.method3914(Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray401[0], local552.anIntArray401[0], local552.method4646(), -2, local552.method4646(), true, 0, 0, Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray402[0], local552.anIntArray402[0]);
			}
		}
		if (local26 == 19) {
			Static335.aClass5_Sub1_Sub1_3.method174(102);
			Static335.aClass5_Sub1_Sub1_3.method1851(local23);
			Static335.aClass5_Sub1_Sub1_3.method1870(local20);
			Static335.aClass5_Sub1_Sub1_3.method1847(local30);
			Static233.anInt4552 = 0;
			Static72.aClass96_6 = Static121.method2396(local23);
			Static62.anInt1439 = local20;
		}
		if (local26 == 1007) {
			Static171.anInt3516 = 2;
			anInt3876 = 0;
			Static172.anInt3527 = Static61.anInt1429;
			Static67.anInt1692 = Static318.anInt5916;
			Static335.aClass5_Sub1_Sub1_3.method174(167);
			Static335.aClass5_Sub1_Sub1_3.method1847(local30);
		}
		if (local26 == 4) {
			anInt3876 = 0;
			Static171.anInt3516 = 2;
			Static172.anInt3527 = Static61.anInt1429;
			Static67.anInt1692 = Static318.anInt5916;
			Static335.aClass5_Sub1_Sub1_3.method174(41);
			Static335.aClass5_Sub1_Sub1_3.method1861(Static229.anInt4484);
			Static335.aClass5_Sub1_Sub1_3.method1870(Static135.anInt2754);
			Static335.aClass5_Sub1_Sub1_3.method1880(Static233.aBooleanArray19[82] ? 1 : 0);
			Static335.aClass5_Sub1_Sub1_3.method1861((int) (local33 >>> 32) & Integer.MAX_VALUE);
			Static335.aClass5_Sub1_Sub1_3.method1825(Static51.anInt1288);
			Static335.aClass5_Sub1_Sub1_3.method1870(local23 + Static28.anInt773);
			Static335.aClass5_Sub1_Sub1_3.method1847(Static263.anInt5063 + local20);
			Static121.method2398(local20, local33, local23);
		}
		if (local26 == 5) {
			Static335.aClass5_Sub1_Sub1_3.method174(129);
			Static335.aClass5_Sub1_Sub1_3.method1851(local23);
			Static335.aClass5_Sub1_Sub1_3.method1870(Static21.anInt6209);
			Static335.aClass5_Sub1_Sub1_3.method1870(local20);
			Static335.aClass5_Sub1_Sub1_3.method1825(Static151.anInt3085);
		}
		if (local26 == 25) {
			local88 = Static312.aClass25_Sub1_Sub1_Sub1Array1[local30];
			if (local88 != null) {
				anInt3876 = 0;
				Static172.anInt3527 = Static61.anInt1429;
				Static171.anInt3516 = 2;
				Static67.anInt1692 = Static318.anInt5916;
				Static335.aClass5_Sub1_Sub1_3.method174(218);
				Static335.aClass5_Sub1_Sub1_3.method1886(Static233.aBooleanArray19[82] ? 1 : 0);
				Static335.aClass5_Sub1_Sub1_3.method1861(local30);
				Static227.method3914(Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray401[0], local88.anIntArray401[0], local88.method4646(), -2, local88.method4646(), true, 0, 0, Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray402[0], local88.anIntArray402[0]);
			}
		}
		if (local26 == 11) {
			Static335.aClass5_Sub1_Sub1_3.method174(143);
			Static335.aClass5_Sub1_Sub1_3.method1851(local23);
			Static335.aClass5_Sub1_Sub1_3.method1844(local30);
			Static335.aClass5_Sub1_Sub1_3.method1844(local20);
			Static233.anInt4552 = 0;
			Static72.aClass96_6 = Static121.method2396(local23);
			Static62.anInt1439 = local20;
		}
		if (local26 == 40) {
			local88 = Static312.aClass25_Sub1_Sub1_Sub1Array1[local30];
			if (local88 != null) {
				Static67.anInt1692 = Static318.anInt5916;
				Static171.anInt3516 = 2;
				Static172.anInt3527 = Static61.anInt1429;
				anInt3876 = 0;
				Static335.aClass5_Sub1_Sub1_3.method174(157);
				Static335.aClass5_Sub1_Sub1_3.method1880(Static233.aBooleanArray19[82] ? 1 : 0);
				Static335.aClass5_Sub1_Sub1_3.method1847(local30);
				Static227.method3914(Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray401[0], local88.anIntArray401[0], local88.method4646(), -2, local88.method4646(), true, 0, 0, Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray402[0], local88.anIntArray402[0]);
			}
		}
		if (local26 == 36) {
			local88 = Static312.aClass25_Sub1_Sub1_Sub1Array1[local30];
			if (local88 != null) {
				Static171.anInt3516 = 2;
				Static67.anInt1692 = Static318.anInt5916;
				Static172.anInt3527 = Static61.anInt1429;
				anInt3876 = 0;
				Static335.aClass5_Sub1_Sub1_3.method174(114);
				Static335.aClass5_Sub1_Sub1_3.method1870(local30);
				Static335.aClass5_Sub1_Sub1_3.method1886(Static233.aBooleanArray19[82] ? 1 : 0);
				Static227.method3914(Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray401[0], local88.anIntArray401[0], local88.method4646(), -2, local88.method4646(), true, 0, 0, Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray402[0], local88.anIntArray402[0]);
			}
		}
		if (local26 == 16) {
			Static172.anInt3527 = Static61.anInt1429;
			Static67.anInt1692 = Static318.anInt5916;
			anInt3876 = 0;
			Static171.anInt3516 = 2;
			Static335.aClass5_Sub1_Sub1_3.method174(161);
			Static335.aClass5_Sub1_Sub1_3.method1861(local30);
			Static335.aClass5_Sub1_Sub1_3.method1873(Static233.aBooleanArray19[82] ? 1 : 0);
			Static335.aClass5_Sub1_Sub1_3.method1861(Static263.anInt5063 + local20);
			Static335.aClass5_Sub1_Sub1_3.method1844(Static28.anInt773 + local23);
			Static62.method1257(local23, local20);
		}
		if (local26 == 33) {
			Static171.anInt3516 = 2;
			Static67.anInt1692 = Static318.anInt5916;
			Static172.anInt3527 = Static61.anInt1429;
			anInt3876 = 0;
			Static335.aClass5_Sub1_Sub1_3.method174(244);
			Static335.aClass5_Sub1_Sub1_3.method1851(Static151.anInt3085);
			Static335.aClass5_Sub1_Sub1_3.method1844(local23 + Static28.anInt773);
			Static335.aClass5_Sub1_Sub1_3.method1847(Integer.MAX_VALUE & (int) (local33 >>> 32));
			Static335.aClass5_Sub1_Sub1_3.method1886(Static233.aBooleanArray19[82] ? 1 : 0);
			Static335.aClass5_Sub1_Sub1_3.method1870(Static21.anInt6209);
			Static335.aClass5_Sub1_Sub1_3.method1847(local20 + Static263.anInt5063);
			Static121.method2398(local20, local33, local23);
		}
		if (local26 == 21) {
			if (Static70.anInt1768 > 0 && Static233.aBooleanArray19[82] && Static233.aBooleanArray19[81]) {
				Static194.method3500(local23 + Static28.anInt773, Static156.anInt3123, Static263.anInt5063 + local20);
			} else {
				anInt3876 = 0;
				Static171.anInt3516 = 1;
				Static67.anInt1692 = Static318.anInt5916;
				Static172.anInt3527 = Static61.anInt1429;
				Static335.aClass5_Sub1_Sub1_3.method174(8);
				Static335.aClass5_Sub1_Sub1_3.method1870(local23 + Static28.anInt773);
				Static335.aClass5_Sub1_Sub1_3.method1847(local20 + Static263.anInt5063);
			}
		}
		if (local26 == 8) {
			local50 = Static305.method5232(local20, local23);
			if (local50 != null) {
				Static279.method4734();
				@Pc(1736) Class5_Sub10 local1736 = Static43.method975(local50);
				Static42.method902(local50.anInt2907, local1736.method1140(), local50.anInt2922, local20, local1736.anInt1278, local23);
				Static100.anInt2199 = 0;
				Static221.aString254 = Static154.method2896(local50);
				if (local50.aBoolean197) {
					Static111.aString151 = local50.aString184 + "<col=ffffff>";
				} else {
					Static111.aString151 = "<col=00ff00>" + local50.lb + "<col=ffffff>";
				}
				if (Static221.aString254 == null) {
					Static221.aString254 = "Null";
				}
			}
			return;
		}
		if (local26 == 42) {
			anInt3876 = 0;
			Static172.anInt3527 = Static61.anInt1429;
			Static67.anInt1692 = Static318.anInt5916;
			Static171.anInt3516 = 2;
			Static335.aClass5_Sub1_Sub1_3.method174(84);
			Static335.aClass5_Sub1_Sub1_3.method1844((int) (local33 >>> 32) & Integer.MAX_VALUE);
			Static335.aClass5_Sub1_Sub1_3.method1870(Static28.anInt773 + local23);
			Static335.aClass5_Sub1_Sub1_3.method1886(Static233.aBooleanArray19[82] ? 1 : 0);
			Static335.aClass5_Sub1_Sub1_3.method1844(local20 + Static263.anInt5063);
			Static121.method2398(local20, local33, local23);
		}
		if (local26 == 39) {
			local552 = Static188.aClass25_Sub1_Sub1_Sub2Array1[local30];
			if (local552 != null) {
				Static172.anInt3527 = Static61.anInt1429;
				anInt3876 = 0;
				Static67.anInt1692 = Static318.anInt5916;
				Static171.anInt3516 = 2;
				Static335.aClass5_Sub1_Sub1_3.method174(28);
				Static335.aClass5_Sub1_Sub1_3.method1886(Static233.aBooleanArray19[82] ? 1 : 0);
				Static335.aClass5_Sub1_Sub1_3.method1847(local30);
				Static335.aClass5_Sub1_Sub1_3.method1844(Static135.anInt2754);
				Static335.aClass5_Sub1_Sub1_3.method1848(Static51.anInt1288);
				Static335.aClass5_Sub1_Sub1_3.method1847(Static229.anInt4484);
				Static227.method3914(Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray401[0], local552.anIntArray401[0], local552.method4646(), -2, local552.method4646(), true, 0, 0, Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray402[0], local552.anIntArray402[0]);
			}
		}
		if (local26 == 17) {
			local88 = Static312.aClass25_Sub1_Sub1_Sub1Array1[local30];
			if (local88 != null) {
				Static172.anInt3527 = Static61.anInt1429;
				Static171.anInt3516 = 2;
				Static67.anInt1692 = Static318.anInt5916;
				anInt3876 = 0;
				Static335.aClass5_Sub1_Sub1_3.method174(124);
				Static335.aClass5_Sub1_Sub1_3.method1870(local30);
				Static335.aClass5_Sub1_Sub1_3.method1873(Static233.aBooleanArray19[82] ? 1 : 0);
				Static227.method3914(Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray401[0], local88.anIntArray401[0], local88.method4646(), -2, local88.method4646(), true, 0, 0, Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray402[0], local88.anIntArray402[0]);
			}
		}
		@Pc(2034) int local2034;
		if (local26 == 37) {
			Static335.aClass5_Sub1_Sub1_3.method174(163);
			Static335.aClass5_Sub1_Sub1_3.method1851(local23);
			local50 = Static121.method2396(local23);
			if (local50.anIntArrayArray20 != null && local50.anIntArrayArray20[0][0] == 5) {
				local2034 = local50.anIntArrayArray20[0][1];
				if (Static69.anIntArray80[local2034] != local50.anIntArray197[0]) {
					Static69.anIntArray80[local2034] = local50.anIntArray197[0];
					Static25.method610(local2034);
				}
			}
		}
		if (local26 == 1) {
			anInt3876 = 0;
			Static67.anInt1692 = Static318.anInt5916;
			Static172.anInt3527 = Static61.anInt1429;
			Static171.anInt3516 = 1;
			Static335.aClass5_Sub1_Sub1_3.method174(77);
			Static335.aClass5_Sub1_Sub1_3.method1847(Static263.anInt5063 + local20);
			Static335.aClass5_Sub1_Sub1_3.method1844(Static28.anInt773 + local23);
			Static335.aClass5_Sub1_Sub1_3.method1844(Static21.anInt6209);
			Static335.aClass5_Sub1_Sub1_3.method1876(Static151.anInt3085);
			Static227.method3914(Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray401[0], local23, 1, -4, 1, true, 0, 0, Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray402[0], local20);
		}
		if (local26 == 23) {
			Static335.aClass5_Sub1_Sub1_3.method174(118);
			Static335.aClass5_Sub1_Sub1_3.method1851(local23);
			Static335.aClass5_Sub1_Sub1_3.method1870(local30);
			Static335.aClass5_Sub1_Sub1_3.method1844(local20);
			Static233.anInt4552 = 0;
			Static72.aClass96_6 = Static121.method2396(local23);
			Static62.anInt1439 = local20;
		}
		if (local26 == 13) {
			local552 = Static188.aClass25_Sub1_Sub1_Sub2Array1[local30];
			if (local552 != null) {
				Static172.anInt3527 = Static61.anInt1429;
				Static171.anInt3516 = 2;
				anInt3876 = 0;
				Static67.anInt1692 = Static318.anInt5916;
				Static335.aClass5_Sub1_Sub1_3.method174(150);
				Static335.aClass5_Sub1_Sub1_3.method1835(Static233.aBooleanArray19[82] ? 1 : 0);
				Static335.aClass5_Sub1_Sub1_3.method1844(local30);
				Static227.method3914(Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray401[0], local552.anIntArray401[0], local552.method4646(), -2, local552.method4646(), true, 0, 0, Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray402[0], local552.anIntArray402[0]);
			}
		}
		if (local26 == 12) {
			local552 = Static188.aClass25_Sub1_Sub1_Sub2Array1[local30];
			if (local552 != null) {
				anInt3876 = 0;
				Static67.anInt1692 = Static318.anInt5916;
				Static172.anInt3527 = Static61.anInt1429;
				Static171.anInt3516 = 2;
				Static335.aClass5_Sub1_Sub1_3.method174(227);
				Static335.aClass5_Sub1_Sub1_3.method1825(Static151.anInt3085);
				Static335.aClass5_Sub1_Sub1_3.method1847(local30);
				Static335.aClass5_Sub1_Sub1_3.method1873(Static233.aBooleanArray19[82] ? 1 : 0);
				Static335.aClass5_Sub1_Sub1_3.method1844(Static21.anInt6209);
				Static227.method3914(Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray401[0], local552.anIntArray401[0], local552.method4646(), -2, local552.method4646(), true, 0, 0, Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray402[0], local552.anIntArray402[0]);
			}
		}
		if (local26 == 38) {
			local88 = Static312.aClass25_Sub1_Sub1_Sub1Array1[local30];
			if (local88 != null) {
				Static172.anInt3527 = Static61.anInt1429;
				Static171.anInt3516 = 2;
				Static67.anInt1692 = Static318.anInt5916;
				anInt3876 = 0;
				Static335.aClass5_Sub1_Sub1_3.method174(115);
				Static335.aClass5_Sub1_Sub1_3.method1870(local30);
				Static335.aClass5_Sub1_Sub1_3.method1835(Static233.aBooleanArray19[82] ? 1 : 0);
				Static227.method3914(Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray401[0], local88.anIntArray401[0], local88.method4646(), -2, local88.method4646(), true, 0, 0, Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray402[0], local88.anIntArray402[0]);
			}
		}
		if (local26 == 30) {
			Static335.aClass5_Sub1_Sub1_3.method174(163);
			Static335.aClass5_Sub1_Sub1_3.method1851(local23);
			local50 = Static121.method2396(local23);
			if (local50.anIntArrayArray20 != null && local50.anIntArrayArray20[0][0] == 5) {
				local2034 = local50.anIntArrayArray20[0][1];
				Static69.anIntArray80[local2034] = 1 - Static69.anIntArray80[local2034];
				Static25.method610(local2034);
			}
		}
		if (local26 == 1005) {
			anInt3876 = 0;
			Static67.anInt1692 = Static318.anInt5916;
			Static171.anInt3516 = 2;
			Static172.anInt3527 = Static61.anInt1429;
			Static335.aClass5_Sub1_Sub1_3.method174(34);
			Static335.aClass5_Sub1_Sub1_3.method1861((int) (local33 >>> 32) & Integer.MAX_VALUE);
			Static335.aClass5_Sub1_Sub1_3.method1835(Static233.aBooleanArray19[82] ? 1 : 0);
			Static335.aClass5_Sub1_Sub1_3.method1870(local23 + Static28.anInt773);
			Static335.aClass5_Sub1_Sub1_3.method1870(Static263.anInt5063 + local20);
			Static121.method2398(local20, local33, local23);
		}
		if (local26 == 1002) {
			Static67.anInt1692 = Static318.anInt5916;
			anInt3876 = 0;
			Static172.anInt3527 = Static61.anInt1429;
			Static171.anInt3516 = 2;
			Static335.aClass5_Sub1_Sub1_3.method174(162);
			Static335.aClass5_Sub1_Sub1_3.method1844(local30);
		}
		if (local26 == 46) {
			local552 = Static188.aClass25_Sub1_Sub1_Sub2Array1[local30];
			if (local552 != null) {
				Static172.anInt3527 = Static61.anInt1429;
				Static67.anInt1692 = Static318.anInt5916;
				Static171.anInt3516 = 2;
				anInt3876 = 0;
				Static335.aClass5_Sub1_Sub1_3.method174(228);
				Static335.aClass5_Sub1_Sub1_3.method1870(local30);
				Static335.aClass5_Sub1_Sub1_3.method1835(Static233.aBooleanArray19[82] ? 1 : 0);
				Static227.method3914(Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray401[0], local552.anIntArray401[0], local552.method4646(), -2, local552.method4646(), true, 0, 0, Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray402[0], local552.anIntArray402[0]);
			}
		}
		if (local26 == 32) {
			anInt3876 = 0;
			Static172.anInt3527 = Static61.anInt1429;
			Static171.anInt3516 = 2;
			Static67.anInt1692 = Static318.anInt5916;
			Static335.aClass5_Sub1_Sub1_3.method174(49);
			Static335.aClass5_Sub1_Sub1_3.method1870(Static263.anInt5063 + local20);
			Static335.aClass5_Sub1_Sub1_3.method1861((int) (local33 >>> 32) & Integer.MAX_VALUE);
			Static335.aClass5_Sub1_Sub1_3.method1847(Static28.anInt773 + local23);
			Static335.aClass5_Sub1_Sub1_3.method1880(Static233.aBooleanArray19[82] ? 1 : 0);
			Static121.method2398(local20, local33, local23);
		}
		if (local26 == 7) {
			Static172.anInt3527 = Static61.anInt1429;
			Static171.anInt3516 = 2;
			anInt3876 = 0;
			Static67.anInt1692 = Static318.anInt5916;
			Static335.aClass5_Sub1_Sub1_3.method174(123);
			Static335.aClass5_Sub1_Sub1_3.method1835(Static233.aBooleanArray19[82] ? 1 : 0);
			Static335.aClass5_Sub1_Sub1_3.method1844(Integer.MAX_VALUE & (int) (local33 >>> 32));
			Static335.aClass5_Sub1_Sub1_3.method1870(local20 + Static263.anInt5063);
			Static335.aClass5_Sub1_Sub1_3.method1844(Static28.anInt773 + local23);
			Static121.method2398(local20, local33, local23);
		}
		if (local26 == 22) {
			Static335.aClass5_Sub1_Sub1_3.method174(207);
			Static335.aClass5_Sub1_Sub1_3.method1851(local23);
			Static335.aClass5_Sub1_Sub1_3.method1870(local20);
			Static335.aClass5_Sub1_Sub1_3.method1861(local30);
			Static233.anInt4552 = 0;
			Static72.aClass96_6 = Static121.method2396(local23);
			Static62.anInt1439 = local20;
		}
		if (local26 == 51) {
			local552 = Static188.aClass25_Sub1_Sub1_Sub2Array1[local30];
			if (local552 != null) {
				Static67.anInt1692 = Static318.anInt5916;
				Static171.anInt3516 = 2;
				Static172.anInt3527 = Static61.anInt1429;
				anInt3876 = 0;
				Static335.aClass5_Sub1_Sub1_3.method174(133);
				Static335.aClass5_Sub1_Sub1_3.method1844(local30);
				Static335.aClass5_Sub1_Sub1_3.method1835(Static233.aBooleanArray19[82] ? 1 : 0);
				Static227.method3914(Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray401[0], local552.anIntArray401[0], local552.method4646(), -2, local552.method4646(), true, 0, 0, Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray402[0], local552.anIntArray402[0]);
			}
		}
		if (local26 == 31) {
			local88 = Static312.aClass25_Sub1_Sub1_Sub1Array1[local30];
			if (local88 != null) {
				Static171.anInt3516 = 2;
				Static172.anInt3527 = Static61.anInt1429;
				Static67.anInt1692 = Static318.anInt5916;
				anInt3876 = 0;
				Static335.aClass5_Sub1_Sub1_3.method174(148);
				Static335.aClass5_Sub1_Sub1_3.method1844(Static21.anInt6209);
				Static335.aClass5_Sub1_Sub1_3.method1825(Static151.anInt3085);
				Static335.aClass5_Sub1_Sub1_3.method1835(Static233.aBooleanArray19[82] ? 1 : 0);
				Static335.aClass5_Sub1_Sub1_3.method1870(local30);
				Static227.method3914(Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray401[0], local88.anIntArray401[0], local88.method4646(), -2, local88.method4646(), true, 0, 0, Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray402[0], local88.anIntArray402[0]);
			}
		}
		if (local26 == 1009) {
			anInt3876 = 0;
			Static172.anInt3527 = Static61.anInt1429;
			Static67.anInt1692 = Static318.anInt5916;
			Static171.anInt3516 = 2;
			local552 = Static188.aClass25_Sub1_Sub1_Sub2Array1[local30];
			if (local552 != null) {
				@Pc(2899) Class216 local2899 = local552.aClass216_1;
				if (local2899.anIntArray562 != null) {
					local2899 = local2899.method5777();
				}
				if (local2899 != null) {
					Static335.aClass5_Sub1_Sub1_3.method174(220);
					Static335.aClass5_Sub1_Sub1_3.method1870(local2899.anInt6564);
				}
			}
		}
		if (local26 == 43) {
			Static171.anInt3516 = 2;
			Static172.anInt3527 = Static61.anInt1429;
			anInt3876 = 0;
			Static67.anInt1692 = Static318.anInt5916;
			Static335.aClass5_Sub1_Sub1_3.method174(131);
			Static335.aClass5_Sub1_Sub1_3.method1835(Static233.aBooleanArray19[82] ? 1 : 0);
			Static335.aClass5_Sub1_Sub1_3.method1876(Static51.anInt1288);
			Static335.aClass5_Sub1_Sub1_3.method1844(Static28.anInt773 + local23);
			Static335.aClass5_Sub1_Sub1_3.method1844(Static135.anInt2754);
			Static335.aClass5_Sub1_Sub1_3.method1861(Static263.anInt5063 + local20);
			Static335.aClass5_Sub1_Sub1_3.method1844(Static229.anInt4484);
			Static335.aClass5_Sub1_Sub1_3.method1847(local30);
			Static62.method1257(local23, local20);
		}
		if (local26 == 20 && Static323.aClass96_20 == null) {
			Static311.method5707(local23, local20);
			Static323.aClass96_20 = Static305.method5232(local20, local23);
			Static336.method4719(Static323.aClass96_20);
		}
		if (local26 == 3) {
			local88 = Static312.aClass25_Sub1_Sub1_Sub1Array1[local30];
			if (local88 != null) {
				Static172.anInt3527 = Static61.anInt1429;
				Static67.anInt1692 = Static318.anInt5916;
				Static171.anInt3516 = 2;
				anInt3876 = 0;
				Static335.aClass5_Sub1_Sub1_3.method174(57);
				Static335.aClass5_Sub1_Sub1_3.method1870(local30);
				Static335.aClass5_Sub1_Sub1_3.method1886(Static233.aBooleanArray19[82] ? 1 : 0);
				Static227.method3914(Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray401[0], local88.anIntArray401[0], local88.method4646(), -2, local88.method4646(), true, 0, 0, Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray402[0], local88.anIntArray402[0]);
			}
		}
		if (local26 == 2) {
			Static335.aClass5_Sub1_Sub1_3.method174(178);
			Static335.aClass5_Sub1_Sub1_3.method1851(local23);
			Static335.aClass5_Sub1_Sub1_3.method1847(local30);
			Static335.aClass5_Sub1_Sub1_3.method1844(local20);
			Static233.anInt4552 = 0;
			Static72.aClass96_6 = Static121.method2396(local23);
			Static62.anInt1439 = local20;
		}
		if (local26 == 50) {
			anInt3876 = 0;
			Static172.anInt3527 = Static61.anInt1429;
			Static171.anInt3516 = 2;
			Static67.anInt1692 = Static318.anInt5916;
			Static335.aClass5_Sub1_Sub1_3.method174(25);
			Static335.aClass5_Sub1_Sub1_3.method1844(local30);
			Static335.aClass5_Sub1_Sub1_3.method1873(Static233.aBooleanArray19[82] ? 1 : 0);
			Static335.aClass5_Sub1_Sub1_3.method1844(Static263.anInt5063 + local20);
			Static335.aClass5_Sub1_Sub1_3.method1861(local23 + Static28.anInt773);
			Static62.method1257(local23, local20);
		}
		if (local26 == 26) {
			Static335.aClass5_Sub1_Sub1_3.method174(71);
			Static335.aClass5_Sub1_Sub1_3.method1851(local23);
			Static335.aClass5_Sub1_Sub1_3.method1861(local30);
			Static335.aClass5_Sub1_Sub1_3.method1844(local20);
			Static233.anInt4552 = 0;
			Static72.aClass96_6 = Static121.method2396(local23);
			Static62.anInt1439 = local20;
		}
		if (local26 == 28) {
			Static344.method944(false);
		}
		if (local26 == 35) {
			anInt3876 = 0;
			Static172.anInt3527 = Static61.anInt1429;
			Static67.anInt1692 = Static318.anInt5916;
			Static171.anInt3516 = 2;
			Static335.aClass5_Sub1_Sub1_3.method174(153);
			Static335.aClass5_Sub1_Sub1_3.method1886(Static233.aBooleanArray19[82] ? 1 : 0);
			Static335.aClass5_Sub1_Sub1_3.method1861(local20 + Static263.anInt5063);
			Static335.aClass5_Sub1_Sub1_3.method1870(local23 + Static28.anInt773);
			Static335.aClass5_Sub1_Sub1_3.method1847(local30);
			Static62.method1257(local23, local20);
		}
		if (Static100.anInt2199 != 0) {
			Static100.anInt2199 = 0;
			Static336.method4719(Static121.method2396(Static51.anInt1288));
		}
		if (Static20.aBoolean40) {
			Static279.method4734();
		}
		if (Static72.aClass96_6 != null && Static233.anInt4552 == 0) {
			Static336.method4719(Static72.aClass96_6);
		}
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(B)V")
	public static void method3555() {
		if (Static195.aBoolean270) {
			return;
		}
		Static195.aBoolean270 = true;
		Static255.aBoolean381 = true;
		if (Static139.aBoolean462) {
			Static155.aFloat64 = (int) Static155.aFloat64 - 65 & 0xFFFFFF80;
		} else {
			Static183.aFloat46 += (-Static183.aFloat46 - 24.0F) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)V")
	public static void method3557() {
		Static287.method4912(false);
		if (Static24.anInt2023 >= 0 && Static24.anInt2023 != 0) {
			Static43.method967(Static24.anInt2023);
			Static24.anInt2023 = -1;
		}
	}
}

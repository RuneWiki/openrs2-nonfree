import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!jc", name = "Y", descriptor = "I")
	public static int anInt1667;

	@OriginalMember(owner = "client!jc", name = "S", descriptor = "Lclient!sd;")
	public static Class73 aClass73_904 = Static122.method531("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!jc", name = "U", descriptor = "Lclient!sd;")
	private static Class73 aClass73_905 = Static122.method531("Username: ");

	@OriginalMember(owner = "client!jc", name = "X", descriptor = "Lclient!sd;")
	private static Class73 aClass73_907 = Static122.method531(" has logged out)3");

	@OriginalMember(owner = "client!jc", name = "W", descriptor = "Lclient!sd;")
	public static Class73 aClass73_906 = aClass73_907;

	@OriginalMember(owner = "client!jc", name = "ab", descriptor = "Lclient!sd;")
	public static Class73 aClass73_908 = Static122.method531("Titelbild geladen)3");

	@OriginalMember(owner = "client!jc", name = "bb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_909 = Static122.method531("(Y<)4col>");

	@OriginalMember(owner = "client!jc", name = "eb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_910 = aClass73_905;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V")
	public static void method1286(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(10) int local10 = Static176.anIntArray419[arg0];
		@Pc(14) int local14 = Static143.anIntArray349[arg0];
		@Pc(18) int local18 = Static14.anIntArray18[arg0];
		if (local10 >= 2000) {
			local10 -= 2000;
		}
		@Pc(26) int local26 = Static50.anIntArray120[arg0];
		if (local10 == 25 && Static43.method780(local18, local26, local14)) {
			Static139.aClass3_Sub12_Sub1_3.method1400(65);
			Static139.aClass3_Sub12_Sub1_3.method1353(local14 >> 14 & 0x7FFF);
			Static139.aClass3_Sub12_Sub1_3.method1363(Static23.anInt626);
			Static139.aClass3_Sub12_Sub1_3.method1353(local18 + Static151.anInt3389);
			Static139.aClass3_Sub12_Sub1_3.method1361(Static148.anInt3335);
			Static139.aClass3_Sub12_Sub1_3.method1353(local26 + Static134.anInt3066);
			Static139.aClass3_Sub12_Sub1_3.method1392(Static92.anInt2038);
		}
		if (local10 == 48) {
			Static139.aClass3_Sub12_Sub1_3.method1400(233);
			Static139.aClass3_Sub12_Sub1_3.method1392(local26);
			Static139.aClass3_Sub12_Sub1_3.method1353(local18);
			Static139.aClass3_Sub12_Sub1_3.method1391(local14);
			Static100.anInt2212 = 0;
			Static20.aClass83_6 = Static80.method1396(local26);
			Static171.anInt3772 = local18;
		}
		if (local10 == 1006) {
			Static171.anInt3765 = 2;
			Static171.anInt3768 = Static61.anInt1463;
			Static76.anInt1683 = 0;
			Static163.anInt3185 = Static51.anInt1243;
			Static139.aClass3_Sub12_Sub1_3.method1400(53);
			Static139.aClass3_Sub12_Sub1_3.method1363(local14);
		}
		@Pc(162) boolean local162;
		if (local10 == 5) {
			local162 = Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 0, 0, local26, false, local18, 0, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
			if (!local162) {
				Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 1, 1, local26, false, local18, 0, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
			}
			Static76.anInt1683 = 0;
			Static171.anInt3765 = 2;
			Static163.anInt3185 = Static51.anInt1243;
			Static171.anInt3768 = Static61.anInt1463;
			Static139.aClass3_Sub12_Sub1_3.method1400(128);
			Static139.aClass3_Sub12_Sub1_3.method1363(local26 + Static134.anInt3066);
			Static139.aClass3_Sub12_Sub1_3.method1353(Static151.anInt3389 + local18);
			Static139.aClass3_Sub12_Sub1_3.method1363(local14);
		}
		if (local10 == 43 && Static11.aClass83_3 == null) {
			Static141.method2357(local18, local26);
			Static11.aClass83_3 = Static109.method1959(local18, local26);
			Static60.method1104(Static11.aClass83_3);
		}
		if (local10 == 36) {
			Static139.aClass3_Sub12_Sub1_3.method1400(9);
			Static139.aClass3_Sub12_Sub1_3.method1361(Static115.anInt2750);
			Static139.aClass3_Sub12_Sub1_3.method1393(local26);
			Static139.aClass3_Sub12_Sub1_3.method1392(Static113.anInt2744);
			Static139.aClass3_Sub12_Sub1_3.method1361(local18);
		}
		if (local10 == 1001) {
			Static171.anInt3765 = 2;
			Static76.anInt1683 = 0;
			Static163.anInt3185 = Static51.anInt1243;
			Static171.anInt3768 = Static61.anInt1463;
			Static139.aClass3_Sub12_Sub1_3.method1400(204);
			Static139.aClass3_Sub12_Sub1_3.method1391(local14 >> 14 & 0x7FFF);
		}
		if (local10 == 51) {
			Static139.aClass3_Sub12_Sub1_3.method1400(112);
			Static139.aClass3_Sub12_Sub1_3.method1353(local18);
			Static139.aClass3_Sub12_Sub1_3.method1344(local26);
			Static139.aClass3_Sub12_Sub1_3.method1361(local14);
			Static100.anInt2212 = 0;
			Static20.aClass83_6 = Static80.method1396(local26);
			Static171.anInt3772 = local18;
		}
		@Pc(360) int local360;
		@Pc(342) Class83 local342;
		if (local10 == 47) {
			Static139.aClass3_Sub12_Sub1_3.method1400(150);
			Static139.aClass3_Sub12_Sub1_3.method1392(local26);
			local342 = Static80.method1396(local26);
			if (local342.anIntArrayArray38 != null && local342.anIntArrayArray38[0][0] == 5) {
				local360 = local342.anIntArrayArray38[0][1];
				if (local342.anIntArray395[0] != Static81.anIntArray186[local360]) {
					Static81.anIntArray186[local360] = local342.anIntArray395[0];
					Static136.method2237(local360);
				}
			}
		}
		if (local10 == 19) {
			local162 = Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 0, 0, local26, false, local18, 0, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
			if (!local162) {
				Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 1, 1, local26, false, local18, 0, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
			}
			Static171.anInt3765 = 2;
			Static171.anInt3768 = Static61.anInt1463;
			Static163.anInt3185 = Static51.anInt1243;
			Static76.anInt1683 = 0;
			Static139.aClass3_Sub12_Sub1_3.method1400(237);
			Static139.aClass3_Sub12_Sub1_3.method1357(Static92.anInt2038);
			Static139.aClass3_Sub12_Sub1_3.method1391(Static23.anInt626);
			Static139.aClass3_Sub12_Sub1_3.method1363(local18 + Static151.anInt3389);
			Static139.aClass3_Sub12_Sub1_3.method1391(local14);
			Static139.aClass3_Sub12_Sub1_3.method1353(Static148.anInt3335);
			Static139.aClass3_Sub12_Sub1_3.method1361(local26 + Static134.anInt3066);
		}
		if (local10 == 8) {
			local162 = Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 0, 0, local26, false, local18, 0, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
			if (!local162) {
				Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 1, 1, local26, false, local18, 0, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
			}
			Static163.anInt3185 = Static51.anInt1243;
			Static171.anInt3768 = Static61.anInt1463;
			Static76.anInt1683 = 0;
			Static171.anInt3765 = 2;
			Static139.aClass3_Sub12_Sub1_3.method1400(76);
			Static139.aClass3_Sub12_Sub1_3.method1363(local14);
			Static139.aClass3_Sub12_Sub1_3.method1363(local26 + Static134.anInt3066);
			Static139.aClass3_Sub12_Sub1_3.method1391(local18 + Static151.anInt3389);
		}
		if (local10 == 1005) {
			Static43.method780(local18, local26, local14);
			Static139.aClass3_Sub12_Sub1_3.method1400(181);
			Static139.aClass3_Sub12_Sub1_3.method1353(local14 >> 14 & 0x7FFF);
			Static139.aClass3_Sub12_Sub1_3.method1361(local18 + Static151.anInt3389);
			Static139.aClass3_Sub12_Sub1_3.method1361(Static134.anInt3066 + local26);
		}
		if (local10 == 12) {
			local162 = Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 0, 0, local26, false, local18, 0, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
			if (!local162) {
				Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 1, 1, local26, false, local18, 0, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
			}
			Static171.anInt3765 = 2;
			Static76.anInt1683 = 0;
			Static171.anInt3768 = Static61.anInt1463;
			Static163.anInt3185 = Static51.anInt1243;
			Static139.aClass3_Sub12_Sub1_3.method1400(61);
			Static139.aClass3_Sub12_Sub1_3.method1361(local26 + Static134.anInt3066);
			Static139.aClass3_Sub12_Sub1_3.method1353(local14);
			Static139.aClass3_Sub12_Sub1_3.method1363(local18 + Static151.anInt3389);
		}
		if (local10 == 29) {
			Static139.aClass3_Sub12_Sub1_3.method1400(126);
			Static139.aClass3_Sub12_Sub1_3.method1363(local18);
			Static139.aClass3_Sub12_Sub1_3.method1344(local26);
			Static139.aClass3_Sub12_Sub1_3.method1391(local14);
			Static100.anInt2212 = 0;
			Static20.aClass83_6 = Static80.method1396(local26);
			Static171.anInt3772 = local18;
		}
		if (local10 == 20) {
			local162 = Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 0, 0, local26, false, local18, 0, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
			if (!local162) {
				Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 1, 1, local26, false, local18, 0, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
			}
			Static76.anInt1683 = 0;
			Static171.anInt3768 = Static61.anInt1463;
			Static171.anInt3765 = 2;
			Static163.anInt3185 = Static51.anInt1243;
			Static139.aClass3_Sub12_Sub1_3.method1400(54);
			Static139.aClass3_Sub12_Sub1_3.method1361(Static134.anInt3066 + local26);
			Static139.aClass3_Sub12_Sub1_3.method1363(local14);
			Static139.aClass3_Sub12_Sub1_3.method1353(local18 + Static151.anInt3389);
		}
		if (local10 == 21) {
			Static139.aClass3_Sub12_Sub1_3.method1400(70);
			Static139.aClass3_Sub12_Sub1_3.method1393(local26);
			Static139.aClass3_Sub12_Sub1_3.method1353(local18);
			Static139.aClass3_Sub12_Sub1_3.method1361(local14);
			Static139.aClass3_Sub12_Sub1_3.method1361(Static115.anInt2750);
			Static139.aClass3_Sub12_Sub1_3.method1393(Static113.anInt2744);
			Static100.anInt2212 = 0;
			Static20.aClass83_6 = Static80.method1396(local26);
			Static171.anInt3772 = local18;
		}
		if (local10 == 1002) {
			local342 = Static80.method1396(local26);
			if (local342 == null || local342.anIntArray389[local18] < 100000) {
				Static139.aClass3_Sub12_Sub1_3.method1400(53);
				Static139.aClass3_Sub12_Sub1_3.method1363(local14);
			} else {
				Static135.method2234(0, Static19.method372(new Class73[] { Static154.method2485(local342.anIntArray389[local18]), Static94.aClass73_1184, Static3.method42(local14).aClass73_680 }), Static173.aClass73_2030);
			}
			Static100.anInt2212 = 0;
			Static20.aClass83_6 = Static80.method1396(local26);
			Static171.anInt3772 = local18;
		}
		if (local10 == 31) {
			Static139.aClass3_Sub12_Sub1_3.method1400(150);
			Static139.aClass3_Sub12_Sub1_3.method1392(local26);
			local342 = Static80.method1396(local26);
			if (local342.anIntArrayArray38 != null && local342.anIntArrayArray38[0][0] == 5) {
				local360 = local342.anIntArrayArray38[0][1];
				Static81.anIntArray186[local360] = 1 - Static81.anIntArray186[local360];
				Static136.method2237(local360);
			}
		}
		if (local10 == 38 || local10 == 1004) {
			Static131.method2173(local14, local18, Static162.aClass73Array24[arg0], local26);
		}
		if (local10 == 30) {
			local342 = Static80.method1396(local26);
			@Pc(973) boolean local973 = true;
			if (local342.anInt3735 > 0) {
				local973 = Static122.method530(local342);
			}
			if (local973) {
				Static139.aClass3_Sub12_Sub1_3.method1400(150);
				Static139.aClass3_Sub12_Sub1_3.method1392(local26);
			}
		}
		@Pc(1004) Class3_Sub1_Sub4_Sub7_Sub2 local1004;
		if (local10 == 41) {
			local1004 = Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1[local14];
			if (local1004 != null) {
				Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 1, 1, local1004.anIntArray326[0], false, local1004.anIntArray329[0], 0, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
				Static163.anInt3185 = Static51.anInt1243;
				Static171.anInt3765 = 2;
				Static76.anInt1683 = 0;
				Static171.anInt3768 = Static61.anInt1463;
				Static139.aClass3_Sub12_Sub1_3.method1400(158);
				Static139.aClass3_Sub12_Sub1_3.method1361(local14);
			}
		}
		if (local10 == 15) {
			local1004 = Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1[local14];
			if (local1004 != null) {
				Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 1, 1, local1004.anIntArray326[0], false, local1004.anIntArray329[0], 0, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
				Static163.anInt3185 = Static51.anInt1243;
				Static171.anInt3765 = 2;
				Static76.anInt1683 = 0;
				Static171.anInt3768 = Static61.anInt1463;
				Static139.aClass3_Sub12_Sub1_3.method1400(100);
				Static139.aClass3_Sub12_Sub1_3.method1353(local14);
			}
		}
		@Pc(1116) Class3_Sub1_Sub4_Sub7_Sub1 local1116;
		if (local10 == 3) {
			local1116 = Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[local14];
			if (local1116 != null) {
				Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 1, 1, local1116.anIntArray326[0], false, local1116.anIntArray329[0], 0, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
				Static76.anInt1683 = 0;
				Static171.anInt3768 = Static61.anInt1463;
				Static163.anInt3185 = Static51.anInt1243;
				Static171.anInt3765 = 2;
				Static139.aClass3_Sub12_Sub1_3.method1400(41);
				Static139.aClass3_Sub12_Sub1_3.method1391(local14);
			}
		}
		if (local10 == 9) {
			local1116 = Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[local14];
			if (local1116 != null) {
				Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 1, 1, local1116.anIntArray326[0], false, local1116.anIntArray329[0], 0, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
				Static171.anInt3768 = Static61.anInt1463;
				Static76.anInt1683 = 0;
				Static171.anInt3765 = 2;
				Static163.anInt3185 = Static51.anInt1243;
				Static139.aClass3_Sub12_Sub1_3.method1400(49);
				Static139.aClass3_Sub12_Sub1_3.method1363(local14);
			}
		}
		if (local10 == 42) {
			Static43.method780(local18, local26, local14);
			Static139.aClass3_Sub12_Sub1_3.method1400(7);
			Static139.aClass3_Sub12_Sub1_3.method1391(local18 + Static151.anInt3389);
			Static139.aClass3_Sub12_Sub1_3.method1353(Static134.anInt3066 + local26);
			Static139.aClass3_Sub12_Sub1_3.method1353(local14 >> 14 & 0x7FFF);
		}
		if (local10 == 10) {
			Static72.method1260();
		}
		if (local10 == 2) {
			Static139.aClass3_Sub12_Sub1_3.method1400(198);
			Static139.aClass3_Sub12_Sub1_3.method1353(local14);
			Static139.aClass3_Sub12_Sub1_3.method1361(local18);
			Static139.aClass3_Sub12_Sub1_3.method1357(local26);
			Static100.anInt2212 = 0;
			Static20.aClass83_6 = Static80.method1396(local26);
			Static171.anInt3772 = local18;
		}
		if (local10 == 35) {
			Static139.aClass3_Sub12_Sub1_3.method1400(173);
			Static139.aClass3_Sub12_Sub1_3.method1353(local14);
			Static139.aClass3_Sub12_Sub1_3.method1357(local26);
			Static139.aClass3_Sub12_Sub1_3.method1353(local18);
			Static100.anInt2212 = 0;
			Static20.aClass83_6 = Static80.method1396(local26);
			Static171.anInt3772 = local18;
		}
		if (local10 == 37) {
			local162 = Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 0, 0, local26, false, local18, 0, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
			if (!local162) {
				Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 1, 1, local26, false, local18, 0, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
			}
			Static76.anInt1683 = 0;
			Static171.anInt3768 = Static61.anInt1463;
			Static163.anInt3185 = Static51.anInt1243;
			Static171.anInt3765 = 2;
			Static139.aClass3_Sub12_Sub1_3.method1400(227);
			Static139.aClass3_Sub12_Sub1_3.method1353(local14);
			Static139.aClass3_Sub12_Sub1_3.method1361(local18 + Static151.anInt3389);
			Static139.aClass3_Sub12_Sub1_3.method1353(local26 + Static134.anInt3066);
		}
		if (local10 == 22) {
			Static139.aClass3_Sub12_Sub1_3.method1400(239);
			Static139.aClass3_Sub12_Sub1_3.method1344(local26);
			Static139.aClass3_Sub12_Sub1_3.method1361(local18);
			Static139.aClass3_Sub12_Sub1_3.method1363(local14);
			Static100.anInt2212 = 0;
			Static20.aClass83_6 = Static80.method1396(local26);
			Static171.anInt3772 = local18;
		}
		if (local10 == 39) {
			Static119.aClass35_1.method1179(Static147.anInt3309, local18, local26);
		}
		if (local10 == 13) {
			local1116 = Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[local14];
			if (local1116 != null) {
				Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 1, 1, local1116.anIntArray326[0], false, local1116.anIntArray329[0], 0, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
				Static163.anInt3185 = Static51.anInt1243;
				Static171.anInt3765 = 2;
				Static171.anInt3768 = Static61.anInt1463;
				Static76.anInt1683 = 0;
				Static139.aClass3_Sub12_Sub1_3.method1400(255);
				Static139.aClass3_Sub12_Sub1_3.method1363(local14);
			}
		}
		if (local10 == 1) {
			local1004 = Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1[local14];
			if (local1004 != null) {
				Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 1, 1, local1004.anIntArray326[0], false, local1004.anIntArray329[0], 0, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
				Static171.anInt3765 = 2;
				Static76.anInt1683 = 0;
				Static163.anInt3185 = Static51.anInt1243;
				Static171.anInt3768 = Static61.anInt1463;
				Static139.aClass3_Sub12_Sub1_3.method1400(31);
				Static139.aClass3_Sub12_Sub1_3.method1363(local14);
			}
		}
		if (local10 == 33) {
			Static139.aClass3_Sub12_Sub1_3.method1400(75);
			Static139.aClass3_Sub12_Sub1_3.method1363(local18);
			Static139.aClass3_Sub12_Sub1_3.method1357(local26);
			Static139.aClass3_Sub12_Sub1_3.method1363(local14);
			Static100.anInt2212 = 0;
			Static20.aClass83_6 = Static80.method1396(local26);
			Static171.anInt3772 = local18;
		}
		if (local10 == 58) {
			local162 = Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 0, 0, local26, false, local18, 0, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
			if (!local162) {
				Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 1, 1, local26, false, local18, 0, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
			}
			Static163.anInt3185 = Static51.anInt1243;
			Static171.anInt3768 = Static61.anInt1463;
			Static171.anInt3765 = 2;
			Static76.anInt1683 = 0;
			Static139.aClass3_Sub12_Sub1_3.method1400(93);
			Static139.aClass3_Sub12_Sub1_3.method1361(Static115.anInt2750);
			Static139.aClass3_Sub12_Sub1_3.method1361(local14);
			Static139.aClass3_Sub12_Sub1_3.method1392(Static113.anInt2744);
			Static139.aClass3_Sub12_Sub1_3.method1361(local18 + Static151.anInt3389);
			Static139.aClass3_Sub12_Sub1_3.method1363(local26 + Static134.anInt3066);
		}
		if (local10 == 50) {
			local1116 = Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[local14];
			if (local1116 != null) {
				Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 1, 1, local1116.anIntArray326[0], false, local1116.anIntArray329[0], 0, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
				Static76.anInt1683 = 0;
				Static163.anInt3185 = Static51.anInt1243;
				Static171.anInt3765 = 2;
				Static171.anInt3768 = Static61.anInt1463;
				Static139.aClass3_Sub12_Sub1_3.method1400(132);
				Static139.aClass3_Sub12_Sub1_3.method1353(local14);
			}
		}
		if (local10 == 32) {
			Static56.method994();
			local342 = Static80.method1396(local26);
			Static23.anInt626 = local14;
			Static92.anInt2038 = local26;
			Static148.anInt3335 = local18;
			Static4.anInt71 = 1;
			Static60.method1104(local342);
			Static122.aClass73_397 = Static19.method372(new Class73[] { Static32.aClass73_480, Static3.method42(local14).aClass73_680, Static178.aClass73_2072 });
			if (Static122.aClass73_397 == null) {
				Static122.aClass73_397 = Static39.aClass73_542;
			}
			return;
		}
		if (local10 == 24) {
			local1116 = Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[local14];
			if (local1116 != null) {
				Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 1, 1, local1116.anIntArray326[0], false, local1116.anIntArray329[0], 0, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
				Static76.anInt1683 = 0;
				Static171.anInt3765 = 2;
				Static171.anInt3768 = Static61.anInt1463;
				Static163.anInt3185 = Static51.anInt1243;
				Static139.aClass3_Sub12_Sub1_3.method1400(86);
				Static139.aClass3_Sub12_Sub1_3.method1391(local14);
			}
		}
		if (local10 == 18) {
			local342 = Static109.method1959(local18, local26);
			if (local342 != null) {
				Static56.method994();
				Static30.method579(local26, Static172.method2691(Static127.method484(local342)), local18);
				Static4.anInt71 = 0;
				Static90.aClass73_1133 = Static46.method809(local342);
				if (Static90.aClass73_1133 == null) {
					Static90.aClass73_1133 = Static16.aClass73_272;
				}
				if (!local342.aBoolean257) {
					Static39.aClass73_541 = Static19.method372(new Class73[] { Static86.aClass73_1045, local342.aClass73_1988, Static178.aClass73_2072 });
					return;
				}
				Static39.aClass73_541 = Static19.method372(new Class73[] { local342.aClass73_1983, Static178.aClass73_2072 });
			}
			return;
		}
		if (local10 == 6) {
			local1116 = Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[local14];
			if (local1116 != null) {
				Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 1, 1, local1116.anIntArray326[0], false, local1116.anIntArray329[0], 0, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
				Static171.anInt3768 = Static61.anInt1463;
				Static163.anInt3185 = Static51.anInt1243;
				Static171.anInt3765 = 2;
				Static76.anInt1683 = 0;
				Static139.aClass3_Sub12_Sub1_3.method1400(205);
				Static139.aClass3_Sub12_Sub1_3.method1391(local14);
			}
		}
		if (local10 == 16) {
			Static139.aClass3_Sub12_Sub1_3.method1400(236);
			Static139.aClass3_Sub12_Sub1_3.method1353(local18);
			Static139.aClass3_Sub12_Sub1_3.method1391(local14);
			Static139.aClass3_Sub12_Sub1_3.method1392(local26);
			Static100.anInt2212 = 0;
			Static20.aClass83_6 = Static80.method1396(local26);
			Static171.anInt3772 = local18;
		}
		if (local10 == 40) {
			local1116 = Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[local14];
			if (local1116 != null) {
				Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 1, 1, local1116.anIntArray326[0], false, local1116.anIntArray329[0], 0, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
				Static163.anInt3185 = Static51.anInt1243;
				Static171.anInt3765 = 2;
				Static171.anInt3768 = Static61.anInt1463;
				Static76.anInt1683 = 0;
				Static139.aClass3_Sub12_Sub1_3.method1400(156);
				Static139.aClass3_Sub12_Sub1_3.method1361(local14);
			}
		}
		if (local10 == 23) {
			local1116 = Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[local14];
			if (local1116 != null) {
				Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 1, 1, local1116.anIntArray326[0], false, local1116.anIntArray329[0], 0, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
				Static163.anInt3185 = Static51.anInt1243;
				Static171.anInt3765 = 2;
				Static76.anInt1683 = 0;
				Static171.anInt3768 = Static61.anInt1463;
				Static139.aClass3_Sub12_Sub1_3.method1400(167);
				Static139.aClass3_Sub12_Sub1_3.method1361(local14);
				Static139.aClass3_Sub12_Sub1_3.method1357(Static92.anInt2038);
				Static139.aClass3_Sub12_Sub1_3.method1391(Static148.anInt3335);
				Static139.aClass3_Sub12_Sub1_3.method1391(Static23.anInt626);
			}
		}
		if (local10 == 11) {
			local1004 = Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1[local14];
			if (local1004 != null) {
				Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 1, 1, local1004.anIntArray326[0], false, local1004.anIntArray329[0], 0, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
				Static171.anInt3765 = 2;
				Static163.anInt3185 = Static51.anInt1243;
				Static171.anInt3768 = Static61.anInt1463;
				Static76.anInt1683 = 0;
				Static139.aClass3_Sub12_Sub1_3.method1400(139);
				Static139.aClass3_Sub12_Sub1_3.method1391(local14);
			}
		}
		if (local10 == 7) {
			local1004 = Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1[local14];
			if (local1004 != null) {
				Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 1, 1, local1004.anIntArray326[0], false, local1004.anIntArray329[0], 0, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
				Static163.anInt3185 = Static51.anInt1243;
				Static171.anInt3765 = 2;
				Static76.anInt1683 = 0;
				Static171.anInt3768 = Static61.anInt1463;
				Static139.aClass3_Sub12_Sub1_3.method1400(101);
				Static139.aClass3_Sub12_Sub1_3.method1363(local14);
				Static139.aClass3_Sub12_Sub1_3.method1363(Static23.anInt626);
				Static139.aClass3_Sub12_Sub1_3.method1393(Static92.anInt2038);
				Static139.aClass3_Sub12_Sub1_3.method1353(Static148.anInt3335);
			}
		}
		if (local10 == 45) {
			Static139.aClass3_Sub12_Sub1_3.method1400(104);
			Static139.aClass3_Sub12_Sub1_3.method1393(local26);
			Static139.aClass3_Sub12_Sub1_3.method1391(local14);
			Static139.aClass3_Sub12_Sub1_3.method1353(local18);
			Static100.anInt2212 = 0;
			Static20.aClass83_6 = Static80.method1396(local26);
			Static171.anInt3772 = local18;
		}
		if (local10 == 4) {
			Static139.aClass3_Sub12_Sub1_3.method1400(56);
			Static139.aClass3_Sub12_Sub1_3.method1363(local18);
			Static139.aClass3_Sub12_Sub1_3.method1353(Static148.anInt3335);
			Static139.aClass3_Sub12_Sub1_3.method1391(Static23.anInt626);
			Static139.aClass3_Sub12_Sub1_3.method1344(Static92.anInt2038);
			Static139.aClass3_Sub12_Sub1_3.method1357(local26);
			Static139.aClass3_Sub12_Sub1_3.method1353(local14);
			Static100.anInt2212 = 0;
			Static20.aClass83_6 = Static80.method1396(local26);
			Static171.anInt3772 = local18;
		}
		if (local10 == 57) {
			Static43.method780(local18, local26, local14);
			Static139.aClass3_Sub12_Sub1_3.method1400(80);
			Static139.aClass3_Sub12_Sub1_3.method1353(Static134.anInt3066 + local26);
			Static139.aClass3_Sub12_Sub1_3.method1353(local14 >> 14 & 0x7FFF);
			Static139.aClass3_Sub12_Sub1_3.method1391(Static151.anInt3389 + local18);
		}
		if (local10 == 26) {
			local1004 = Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1[local14];
			if (local1004 != null) {
				Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 1, 1, local1004.anIntArray326[0], false, local1004.anIntArray329[0], 0, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
				Static171.anInt3768 = Static61.anInt1463;
				Static171.anInt3765 = 2;
				Static163.anInt3185 = Static51.anInt1243;
				Static76.anInt1683 = 0;
				Static139.aClass3_Sub12_Sub1_3.method1400(254);
				Static139.aClass3_Sub12_Sub1_3.method1361(local14);
			}
		}
		if (local10 == 49 && Static43.method780(local18, local26, local14)) {
			Static139.aClass3_Sub12_Sub1_3.method1400(212);
			Static139.aClass3_Sub12_Sub1_3.method1393(Static113.anInt2744);
			Static139.aClass3_Sub12_Sub1_3.method1363(local26 + Static134.anInt3066);
			Static139.aClass3_Sub12_Sub1_3.method1361(local18 + Static151.anInt3389);
			Static139.aClass3_Sub12_Sub1_3.method1361(Static115.anInt2750);
			Static139.aClass3_Sub12_Sub1_3.method1363(local14 >> 14 & 0x7FFF);
		}
		if (local10 == 14) {
			local1116 = Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[local14];
			if (local1116 != null) {
				Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 1, 1, local1116.anIntArray326[0], false, local1116.anIntArray329[0], 0, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
				Static163.anInt3185 = Static51.anInt1243;
				Static171.anInt3768 = Static61.anInt1463;
				Static171.anInt3765 = 2;
				Static76.anInt1683 = 0;
				Static139.aClass3_Sub12_Sub1_3.method1400(46);
				Static139.aClass3_Sub12_Sub1_3.method1353(local14);
			}
		}
		if (local10 == 28) {
			Static43.method780(local18, local26, local14);
			Static139.aClass3_Sub12_Sub1_3.method1400(115);
			Static139.aClass3_Sub12_Sub1_3.method1363(local26 + Static134.anInt3066);
			Static139.aClass3_Sub12_Sub1_3.method1353(local14 >> 14 & 0x7FFF);
			Static139.aClass3_Sub12_Sub1_3.method1363(Static151.anInt3389 + local18);
		}
		if (local10 == 1007) {
			Static171.anInt3765 = 2;
			Static171.anInt3768 = Static61.anInt1463;
			Static76.anInt1683 = 0;
			Static163.anInt3185 = Static51.anInt1243;
			local1004 = Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1[local14];
			if (local1004 != null) {
				@Pc(2598) Class3_Sub1_Sub10 local2598 = local1004.aClass3_Sub1_Sub10_1;
				if (local2598.anIntArray174 != null) {
					local2598 = local2598.method1201();
				}
				if (local2598 != null) {
					Static139.aClass3_Sub12_Sub1_3.method1400(20);
					Static139.aClass3_Sub12_Sub1_3.method1361(local2598.anInt1568);
				}
			}
		}
		if (local10 == 44) {
			local1116 = Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[local14];
			if (local1116 != null) {
				Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 1, 1, local1116.anIntArray326[0], false, local1116.anIntArray329[0], 0, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
				Static163.anInt3185 = Static51.anInt1243;
				Static171.anInt3765 = 2;
				Static76.anInt1683 = 0;
				Static171.anInt3768 = Static61.anInt1463;
				Static139.aClass3_Sub12_Sub1_3.method1400(69);
				Static139.aClass3_Sub12_Sub1_3.method1392(Static113.anInt2744);
				Static139.aClass3_Sub12_Sub1_3.method1361(local14);
				Static139.aClass3_Sub12_Sub1_3.method1363(Static115.anInt2750);
			}
		}
		if (local10 == 46) {
			Static139.aClass3_Sub12_Sub1_3.method1400(209);
			Static139.aClass3_Sub12_Sub1_3.method1344(local26);
			Static139.aClass3_Sub12_Sub1_3.method1361(local18);
			Static139.aClass3_Sub12_Sub1_3.method1353(local14);
			Static100.anInt2212 = 0;
			Static20.aClass83_6 = Static80.method1396(local26);
			Static171.anInt3772 = local18;
		}
		if (local10 == 17) {
			Static43.method780(local18, local26, local14);
			Static139.aClass3_Sub12_Sub1_3.method1400(110);
			Static139.aClass3_Sub12_Sub1_3.method1391(local18 + Static151.anInt3389);
			Static139.aClass3_Sub12_Sub1_3.method1353(local26 + Static134.anInt3066);
			Static139.aClass3_Sub12_Sub1_3.method1361(local14 >> 14 & 0x7FFF);
		}
		if (local10 == 34) {
			local1004 = Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1[local14];
			if (local1004 != null) {
				Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 1, 1, local1004.anIntArray326[0], false, local1004.anIntArray329[0], 0, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
				Static171.anInt3768 = Static61.anInt1463;
				Static163.anInt3185 = Static51.anInt1243;
				Static171.anInt3765 = 2;
				Static76.anInt1683 = 0;
				Static139.aClass3_Sub12_Sub1_3.method1400(27);
				Static139.aClass3_Sub12_Sub1_3.method1344(Static113.anInt2744);
				Static139.aClass3_Sub12_Sub1_3.method1363(Static115.anInt2750);
				Static139.aClass3_Sub12_Sub1_3.method1353(local14);
			}
		}
		if (Static4.anInt71 != 0) {
			Static4.anInt71 = 0;
			Static60.method1104(Static80.method1396(Static92.anInt2038));
		}
		if (Static159.aBoolean233) {
			Static56.method994();
		}
		if (Static20.aClass83_6 != null && Static100.anInt2212 == 0) {
			Static60.method1104(Static20.aClass83_6);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!f;Lclient!sd;BLclient!sd;)[Lclient!kf;")
	public static Class3_Sub1_Sub3_Sub3[] method1287(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class73 arg1, @OriginalArg(3) Class73 arg2) {
		@Pc(13) int local13 = arg0.method359(arg2);
		@Pc(19) int local19 = arg0.method358(local13, arg1);
		return Static167.method2624(local13, arg0, local19);
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)V")
	public static void method1288() {
		Static159.aClass3_Sub12_Sub1_4.method1398();
		@Pc(11) int local11 = Static159.aClass3_Sub12_Sub1_4.method1403(1);
		if (local11 == 0) {
			return;
		}
		@Pc(22) int local22 = Static159.aClass3_Sub12_Sub1_4.method1403(2);
		if (local22 == 0) {
			Static2.anIntArray1[Static181.anInt3975++] = 2047;
			return;
		}
		@Pc(41) int local41;
		@Pc(51) int local51;
		if (local22 == 1) {
			local41 = Static159.aClass3_Sub12_Sub1_4.method1403(3);
			Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.method2272(false, local41);
			local51 = Static159.aClass3_Sub12_Sub1_4.method1403(1);
			if (local51 == 1) {
				Static2.anIntArray1[Static181.anInt3975++] = 2047;
			}
			return;
		}
		@Pc(93) int local93;
		if (local22 == 2) {
			local41 = Static159.aClass3_Sub12_Sub1_4.method1403(3);
			Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.method2272(true, local41);
			local51 = Static159.aClass3_Sub12_Sub1_4.method1403(3);
			Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.method2272(true, local51);
			local93 = Static159.aClass3_Sub12_Sub1_4.method1403(1);
			if (local93 == 1) {
				Static2.anIntArray1[Static181.anInt3975++] = 2047;
			}
		} else if (local22 == 3) {
			local41 = Static159.aClass3_Sub12_Sub1_4.method1403(7);
			Static147.anInt3309 = Static159.aClass3_Sub12_Sub1_4.method1403(2);
			local51 = Static159.aClass3_Sub12_Sub1_4.method1403(1);
			if (local51 == 1) {
				Static2.anIntArray1[Static181.anInt3975++] = 2047;
			}
			local93 = Static159.aClass3_Sub12_Sub1_4.method1403(1);
			@Pc(148) int local148 = Static159.aClass3_Sub12_Sub1_4.method1403(7);
			Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.method2267(local41, local93 == 1, local148);
		}
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(B)V")
	public static void method1289() {
		aClass73_904 = null;
		aClass73_909 = null;
		aClass73_905 = null;
		aClass73_910 = null;
		aClass73_908 = null;
		aClass73_907 = null;
		aClass73_906 = null;
	}
}

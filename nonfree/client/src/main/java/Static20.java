import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!d", name = "i", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!d", name = "m", descriptor = "Lclient!n;")
	public static Class5_Sub2_Sub1_Sub3 aClass5_Sub2_Sub1_Sub3_1;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "Lclient!r;")
	public static Class61 aClass61_185 = Static129.method2060("mod_icons");

	@OriginalMember(owner = "client!d", name = "c", descriptor = "Lclient!r;")
	public static Class61 aClass61_186 = Static129.method2060("blaugr-Un:");

	@OriginalMember(owner = "client!d", name = "d", descriptor = "Lclient!r;")
	public static Class61 aClass61_187 = Static129.method2060("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!d", name = "g", descriptor = "Lclient!r;")
	public static Class61 aClass61_188 = Static129.method2060("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!d", name = "j", descriptor = "Lclient!r;")
	public static Class61 aClass61_189 = Static129.method2060("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!d", name = "k", descriptor = "I")
	public static int anInt636 = -1;

	@OriginalMember(owner = "client!d", name = "l", descriptor = "I")
	public static final int anInt637 = 5063219;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BLclient!ff;Lclient!ff;Lclient!ff;Lclient!ff;)V")
	public static void method455(@OriginalArg(1) Class26 arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) Class26 arg2, @OriginalArg(4) Class26 arg3) {
		Static103.aClass26_24 = arg2;
		Static4.aClass26_23 = arg3;
		Static93.aClass26_20 = arg1;
		Static71.aClass26_14 = arg0;
		Static56.aClass5_Sub11ArrayArray1 = new Class5_Sub11[Static103.aClass26_24.method1045()][];
		Static100.aBooleanArray13 = new boolean[Static103.aClass26_24.method1045()];
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
	public static void method456() {
		aClass61_187 = null;
		aClass61_189 = null;
		aClass61_185 = null;
		aClass61_186 = null;
		aClass5_Sub2_Sub1_Sub3_1 = null;
		aClass61_188 = null;
		aByteArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)V")
	public static void method457() {
		Static83.anInt2281 = 0;
		Static76.anInt1870 = 0;
		Static108.method55();
		Static22.method482();
		Static64.method1760();
		@Pc(23) int local23;
		for (@Pc(17) int local17 = 0; local17 < Static76.anInt1870; local17++) {
			local23 = Static2.anIntArray1[local17];
			if (Static58.anInt1422 != Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1[local23].anInt2900) {
				Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1[local23].aClass5_Sub2_Sub12_1 = null;
				Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1[local23] = null;
			}
		}
		if (Static47.aClass5_Sub14_Sub1_2.anInt2199 != Static80.anInt2057) {
			throw new RuntimeException("gnp1 pos:" + Static47.aClass5_Sub14_Sub1_2.anInt2199 + " psize:" + Static80.anInt2057);
		}
		for (local23 = 0; local23 < Static100.anInt2607; local23++) {
			if (Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1[Static61.anIntArray225[local23]] == null) {
				throw new RuntimeException("gnp2 pos:" + local23 + " size:" + Static100.anInt2607);
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)V")
	public static void method458(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(10) int local10 = Static76.anIntArray266[arg0];
		@Pc(14) int local14 = Static23.anIntArray124[arg0];
		@Pc(18) int local18 = Static38.anIntArray223[arg0];
		if (local18 >= 2000) {
			local18 -= 2000;
		}
		@Pc(26) int local26 = Static86.anIntArray294[arg0];
		@Pc(53) boolean local53;
		if (local18 == 11) {
			local53 = Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local10, local14, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, false, 0, 0, 0, 0);
			if (!local53) {
				Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local10, local14, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, false, 1, 0, 1, 0);
			}
			Static105.anInt3346 = 2;
			Static32.anInt963 = Static12.anInt308;
			Static63.anInt1553 = Static26.anInt613;
			Static8.anInt188 = 0;
			Static1.aClass5_Sub14_Sub1_1.method1489(41);
			Static1.aClass5_Sub14_Sub1_1.method1468(local10 + Static19.anInt623);
			Static1.aClass5_Sub14_Sub1_1.method1481(local26);
			Static1.aClass5_Sub14_Sub1_1.method1482(local14 + Static25.anInt730);
		}
		@Pc(112) Class5_Sub2_Sub2_Sub3_Sub2 local112;
		if (local18 == 37) {
			local112 = Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[local26];
			if (local112 != null) {
				Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local112.anIntArray346[0], local112.anIntArray350[0], Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, false, 1, 0, 1, 0);
				Static32.anInt963 = Static12.anInt308;
				Static8.anInt188 = 0;
				Static63.anInt1553 = Static26.anInt613;
				Static105.anInt3346 = 2;
				Static1.aClass5_Sub14_Sub1_1.method1489(228);
				Static1.aClass5_Sub14_Sub1_1.method1481(local26);
			}
		}
		@Pc(169) Class5_Sub11 local169;
		if (local18 == 18) {
			Static19.method449();
			local169 = Static88.method2191(local14);
			Static112.anInt2933 = local10;
			Static86.anInt2322 = local14;
			Static123.anInt3071 = 1;
			Static36.anInt1011 = local26;
			Static24.method505(local169);
			Static86.aClass61_673 = Static123.method1929(new Class61[] { Static82.aClass61_652, Static111.method1830(local26).aClass61_597, Static57.aClass61_447 });
			if (Static86.aClass61_673 == null) {
				Static86.aClass61_673 = Static121.aClass61_962;
			}
			return;
		}
		@Pc(242) int local242;
		if (local18 == 35) {
			Static1.aClass5_Sub14_Sub1_1.method1489(104);
			Static1.aClass5_Sub14_Sub1_1.method1451(local14);
			local169 = Static88.method2191(local14);
			if (local169.anIntArrayArray18 != null && local169.anIntArrayArray18[0][0] == 5) {
				local242 = local169.anIntArrayArray18[0][1];
				Static83.anIntArray289[local242] = 1 - Static83.anIntArray289[local242];
				Static29.method631(local242);
			}
		}
		if (local18 == 1003) {
			Static109.method1800(local14, local10, local26);
			Static1.aClass5_Sub14_Sub1_1.method1489(111);
			Static1.aClass5_Sub14_Sub1_1.method1448(local26 >> 14 & 0x7FFF);
			Static1.aClass5_Sub14_Sub1_1.method1481(local14 + Static25.anInt730);
			Static1.aClass5_Sub14_Sub1_1.method1481(Static19.anInt623 + local10);
		}
		if (local18 == 46) {
			local53 = Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local10, local14, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, false, 0, 0, 0, 0);
			if (!local53) {
				Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local10, local14, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, false, 1, 0, 1, 0);
			}
			Static32.anInt963 = Static12.anInt308;
			Static63.anInt1553 = Static26.anInt613;
			Static105.anInt3346 = 2;
			Static8.anInt188 = 0;
			Static1.aClass5_Sub14_Sub1_1.method1489(243);
			Static1.aClass5_Sub14_Sub1_1.method1481(local26);
			Static1.aClass5_Sub14_Sub1_1.method1446(Static59.anInt1436);
			Static1.aClass5_Sub14_Sub1_1.method1481(Static25.anInt730 + local14);
			Static1.aClass5_Sub14_Sub1_1.method1448(local10 + Static19.anInt623);
			Static1.aClass5_Sub14_Sub1_1.method1468(Static16.anInt491);
		}
		if (local18 == 7) {
			Static1.aClass5_Sub14_Sub1_1.method1489(121);
			Static1.aClass5_Sub14_Sub1_1.method1482(local10);
			Static1.aClass5_Sub14_Sub1_1.method1446(local14);
			Static1.aClass5_Sub14_Sub1_1.method1481(local26);
			Static21.anInt645 = 0;
			Static29.aClass5_Sub11_3 = Static88.method2191(local14);
			Static32.anInt964 = local10;
		}
		if (local18 == 1002) {
			local169 = Static88.method2191(local14);
			if (local169 == null || local169.anIntArray241[local10] < 100000) {
				Static1.aClass5_Sub14_Sub1_1.method1489(250);
				Static1.aClass5_Sub14_Sub1_1.method1468(local26);
			} else {
				Static91.method1596(Static96.aClass61_746, Static123.method1929(new Class61[] { Static39.method730(local169.anIntArray241[local10]), Static108.aClass61_32, Static111.method1830(local26).aClass61_597 }), 0);
			}
			Static21.anInt645 = 0;
			Static29.aClass5_Sub11_3 = Static88.method2191(local14);
			Static32.anInt964 = local10;
		}
		@Pc(487) Class5_Sub2_Sub2_Sub3_Sub1 local487;
		if (local18 == 5) {
			local487 = Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1[local26];
			if (local487 != null) {
				Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local487.anIntArray346[0], local487.anIntArray350[0], Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, false, 1, 0, 1, 0);
				Static32.anInt963 = Static12.anInt308;
				Static8.anInt188 = 0;
				Static63.anInt1553 = Static26.anInt613;
				Static105.anInt3346 = 2;
				Static1.aClass5_Sub14_Sub1_1.method1489(62);
				Static1.aClass5_Sub14_Sub1_1.method1482(local26);
			}
		}
		if (local18 == 25) {
			Static1.aClass5_Sub14_Sub1_1.method1489(35);
			Static1.aClass5_Sub14_Sub1_1.method1451(local14);
			Static1.aClass5_Sub14_Sub1_1.method1482(local10);
			Static1.aClass5_Sub14_Sub1_1.method1451(Static59.anInt1436);
			Static1.aClass5_Sub14_Sub1_1.method1448(local26);
			Static1.aClass5_Sub14_Sub1_1.method1482(Static16.anInt491);
			Static21.anInt645 = 0;
			Static29.aClass5_Sub11_3 = Static88.method2191(local14);
			Static32.anInt964 = local10;
		}
		if (local18 == 8) {
			Static61.method1055();
		}
		if (local18 == 17) {
			local112 = Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[local26];
			if (local112 != null) {
				Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local112.anIntArray346[0], local112.anIntArray350[0], Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, false, 1, 0, 1, 0);
				Static8.anInt188 = 0;
				Static32.anInt963 = Static12.anInt308;
				Static105.anInt3346 = 2;
				Static63.anInt1553 = Static26.anInt613;
				Static1.aClass5_Sub14_Sub1_1.method1489(213);
				Static1.aClass5_Sub14_Sub1_1.method1481(local26);
			}
		}
		if (local18 == 32) {
			local112 = Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[local26];
			if (local112 != null) {
				Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local112.anIntArray346[0], local112.anIntArray350[0], Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, false, 1, 0, 1, 0);
				Static63.anInt1553 = Static26.anInt613;
				Static8.anInt188 = 0;
				Static105.anInt3346 = 2;
				Static32.anInt963 = Static12.anInt308;
				Static1.aClass5_Sub14_Sub1_1.method1489(255);
				Static1.aClass5_Sub14_Sub1_1.method1481(local26);
			}
		}
		if (local18 == 12) {
			local487 = Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1[local26];
			if (local487 != null) {
				Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local487.anIntArray346[0], local487.anIntArray350[0], Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, false, 1, 0, 1, 0);
				Static8.anInt188 = 0;
				Static63.anInt1553 = Static26.anInt613;
				Static32.anInt963 = Static12.anInt308;
				Static105.anInt3346 = 2;
				Static1.aClass5_Sub14_Sub1_1.method1489(145);
				Static1.aClass5_Sub14_Sub1_1.method1448(Static112.anInt2933);
				Static1.aClass5_Sub14_Sub1_1.method1448(local26);
				Static1.aClass5_Sub14_Sub1_1.method1457(Static86.anInt2322);
				Static1.aClass5_Sub14_Sub1_1.method1468(Static36.anInt1011);
			}
		}
		if (local18 == 28) {
			Static1.aClass5_Sub14_Sub1_1.method1489(46);
			Static1.aClass5_Sub14_Sub1_1.method1446(local14);
			Static1.aClass5_Sub14_Sub1_1.method1481(local26);
			Static1.aClass5_Sub14_Sub1_1.method1448(local10);
			Static21.anInt645 = 0;
			Static29.aClass5_Sub11_3 = Static88.method2191(local14);
			Static32.anInt964 = local10;
		}
		if (local18 == 26) {
			local53 = Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local10, local14, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, false, 0, 0, 0, 0);
			if (!local53) {
				Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local10, local14, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, false, 1, 0, 1, 0);
			}
			Static63.anInt1553 = Static26.anInt613;
			Static8.anInt188 = 0;
			Static32.anInt963 = Static12.anInt308;
			Static105.anInt3346 = 2;
			Static1.aClass5_Sub14_Sub1_1.method1489(95);
			Static1.aClass5_Sub14_Sub1_1.method1482(local14 + Static25.anInt730);
			Static1.aClass5_Sub14_Sub1_1.method1468(local10 + Static19.anInt623);
			Static1.aClass5_Sub14_Sub1_1.method1481(local26);
		}
		if (local18 == 1001) {
			Static8.anInt188 = 0;
			Static105.anInt3346 = 2;
			Static32.anInt963 = Static12.anInt308;
			Static63.anInt1553 = Static26.anInt613;
			local487 = Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1[local26];
			if (local487 != null) {
				@Pc(895) Class5_Sub2_Sub12 local895 = local487.aClass5_Sub2_Sub12_1;
				if (local895.anIntArray318 != null) {
					local895 = local895.method1632();
				}
				if (local895 != null) {
					Static1.aClass5_Sub14_Sub1_1.method1489(65);
					Static1.aClass5_Sub14_Sub1_1.method1468(local895.anInt2509);
				}
			}
		}
		if (local18 == 31) {
			local53 = Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local10, local14, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, false, 0, 0, 0, 0);
			if (!local53) {
				Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local10, local14, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, false, 1, 0, 1, 0);
			}
			Static63.anInt1553 = Static26.anInt613;
			Static8.anInt188 = 0;
			Static32.anInt963 = Static12.anInt308;
			Static105.anInt3346 = 2;
			Static1.aClass5_Sub14_Sub1_1.method1489(58);
			Static1.aClass5_Sub14_Sub1_1.method1457(Static86.anInt2322);
			Static1.aClass5_Sub14_Sub1_1.method1468(Static25.anInt730 + local14);
			Static1.aClass5_Sub14_Sub1_1.method1481(Static36.anInt1011);
			Static1.aClass5_Sub14_Sub1_1.method1448(Static19.anInt623 + local10);
			Static1.aClass5_Sub14_Sub1_1.method1482(Static112.anInt2933);
			Static1.aClass5_Sub14_Sub1_1.method1468(local26);
		}
		if (local18 == 23) {
			Static1.aClass5_Sub14_Sub1_1.method1489(43);
			Static1.aClass5_Sub14_Sub1_1.method1481(local26);
			Static1.aClass5_Sub14_Sub1_1.method1482(local10);
			Static1.aClass5_Sub14_Sub1_1.method1446(local14);
			Static21.anInt645 = 0;
			Static29.aClass5_Sub11_3 = Static88.method2191(local14);
			Static32.anInt964 = local10;
		}
		if (local18 == 48) {
			local53 = Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local10, local14, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, false, 0, 0, 0, 0);
			if (!local53) {
				Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local10, local14, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, false, 1, 0, 1, 0);
			}
			Static105.anInt3346 = 2;
			Static63.anInt1553 = Static26.anInt613;
			Static32.anInt963 = Static12.anInt308;
			Static8.anInt188 = 0;
			Static1.aClass5_Sub14_Sub1_1.method1489(23);
			Static1.aClass5_Sub14_Sub1_1.method1481(local14 + Static25.anInt730);
			Static1.aClass5_Sub14_Sub1_1.method1482(local26);
			Static1.aClass5_Sub14_Sub1_1.method1448(Static19.anInt623 + local10);
		}
		if (local18 == 50) {
			local487 = Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1[local26];
			if (local487 != null) {
				Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local487.anIntArray346[0], local487.anIntArray350[0], Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, false, 1, 0, 1, 0);
				Static8.anInt188 = 0;
				Static63.anInt1553 = Static26.anInt613;
				Static32.anInt963 = Static12.anInt308;
				Static105.anInt3346 = 2;
				Static1.aClass5_Sub14_Sub1_1.method1489(22);
				Static1.aClass5_Sub14_Sub1_1.method1465(Static59.anInt1436);
				Static1.aClass5_Sub14_Sub1_1.method1448(Static16.anInt491);
				Static1.aClass5_Sub14_Sub1_1.method1482(local26);
			}
		}
		if (local18 == 4) {
			Static1.aClass5_Sub14_Sub1_1.method1489(205);
			Static1.aClass5_Sub14_Sub1_1.method1482(local26);
			Static1.aClass5_Sub14_Sub1_1.method1468(local10);
			Static1.aClass5_Sub14_Sub1_1.method1457(local14);
			Static21.anInt645 = 0;
			Static29.aClass5_Sub11_3 = Static88.method2191(local14);
			Static32.anInt964 = local10;
		}
		if (local18 == 44) {
			Static1.aClass5_Sub14_Sub1_1.method1489(138);
			Static1.aClass5_Sub14_Sub1_1.method1448(local26);
			Static1.aClass5_Sub14_Sub1_1.method1451(local14);
			Static1.aClass5_Sub14_Sub1_1.method1468(local10);
			Static21.anInt645 = 0;
			Static29.aClass5_Sub11_3 = Static88.method2191(local14);
			Static32.anInt964 = local10;
		}
		if (local18 == 1006) {
			Static8.anInt188 = 0;
			Static32.anInt963 = Static12.anInt308;
			Static63.anInt1553 = Static26.anInt613;
			Static105.anInt3346 = 2;
			Static1.aClass5_Sub14_Sub1_1.method1489(250);
			Static1.aClass5_Sub14_Sub1_1.method1468(local26);
		}
		if (local18 == 24 || local18 == 1004) {
			Static29.method625(local10, local14, local26, Static107.aClass61Array19[arg0]);
		}
		if (local18 == 1 && Static109.method1800(local14, local10, local26)) {
			Static1.aClass5_Sub14_Sub1_1.method1489(21);
			Static1.aClass5_Sub14_Sub1_1.method1482(local10 + Static19.anInt623);
			Static1.aClass5_Sub14_Sub1_1.method1448(Static112.anInt2933);
			Static1.aClass5_Sub14_Sub1_1.method1468(local14 + Static25.anInt730);
			Static1.aClass5_Sub14_Sub1_1.method1451(Static86.anInt2322);
			Static1.aClass5_Sub14_Sub1_1.method1482(Static36.anInt1011);
			Static1.aClass5_Sub14_Sub1_1.method1481(local26 >> 14 & 0x7FFF);
		}
		if (local18 == 20) {
			local112 = Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[local26];
			if (local112 != null) {
				Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local112.anIntArray346[0], local112.anIntArray350[0], Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, false, 1, 0, 1, 0);
				Static32.anInt963 = Static12.anInt308;
				Static105.anInt3346 = 2;
				Static8.anInt188 = 0;
				Static63.anInt1553 = Static26.anInt613;
				Static1.aClass5_Sub14_Sub1_1.method1489(11);
				Static1.aClass5_Sub14_Sub1_1.method1481(local26);
			}
		}
		if (local18 == 3 && Static90.aClass5_Sub11_9 == null) {
			Static4.method1683(local14, local10);
			Static90.aClass5_Sub11_9 = Static98.method1667(local14, local10);
			Static24.method505(Static90.aClass5_Sub11_9);
		}
		if (local18 == 58) {
			Static1.aClass5_Sub14_Sub1_1.method1489(0);
			Static1.aClass5_Sub14_Sub1_1.method1446(local14);
			Static1.aClass5_Sub14_Sub1_1.method1481(local26);
			Static1.aClass5_Sub14_Sub1_1.method1482(local10);
			Static21.anInt645 = 0;
			Static29.aClass5_Sub11_3 = Static88.method2191(local14);
			Static32.anInt964 = local10;
		}
		if (local18 == 45) {
			Static1.aClass5_Sub14_Sub1_1.method1489(94);
			Static1.aClass5_Sub14_Sub1_1.method1468(local10);
			Static1.aClass5_Sub14_Sub1_1.method1482(local26);
			Static1.aClass5_Sub14_Sub1_1.method1457(local14);
			Static21.anInt645 = 0;
			Static29.aClass5_Sub11_3 = Static88.method2191(local14);
			Static32.anInt964 = local10;
		}
		if (local18 == 6) {
			Static1.aClass5_Sub14_Sub1_1.method1489(76);
			Static1.aClass5_Sub14_Sub1_1.method1468(Static112.anInt2933);
			Static1.aClass5_Sub14_Sub1_1.method1446(local14);
			Static1.aClass5_Sub14_Sub1_1.method1481(Static36.anInt1011);
			Static1.aClass5_Sub14_Sub1_1.method1468(local26);
			Static1.aClass5_Sub14_Sub1_1.method1482(local10);
			Static1.aClass5_Sub14_Sub1_1.method1457(Static86.anInt2322);
			Static21.anInt645 = 0;
			Static29.aClass5_Sub11_3 = Static88.method2191(local14);
			Static32.anInt964 = local10;
		}
		if (local18 == 13) {
			local112 = Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[local26];
			if (local112 != null) {
				Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local112.anIntArray346[0], local112.anIntArray350[0], Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, false, 1, 0, 1, 0);
				Static63.anInt1553 = Static26.anInt613;
				Static105.anInt3346 = 2;
				Static8.anInt188 = 0;
				Static32.anInt963 = Static12.anInt308;
				Static1.aClass5_Sub14_Sub1_1.method1489(103);
				Static1.aClass5_Sub14_Sub1_1.method1481(local26);
			}
		}
		if (local18 == 39) {
			local112 = Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[local26];
			if (local112 != null) {
				Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local112.anIntArray346[0], local112.anIntArray350[0], Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, false, 1, 0, 1, 0);
				Static32.anInt963 = Static12.anInt308;
				Static105.anInt3346 = 2;
				Static63.anInt1553 = Static26.anInt613;
				Static8.anInt188 = 0;
				Static1.aClass5_Sub14_Sub1_1.method1489(107);
				Static1.aClass5_Sub14_Sub1_1.method1448(local26);
			}
		}
		if (local18 == 49 && Static109.method1800(local14, local10, local26)) {
			Static1.aClass5_Sub14_Sub1_1.method1489(118);
			Static1.aClass5_Sub14_Sub1_1.method1468(Static16.anInt491);
			Static1.aClass5_Sub14_Sub1_1.method1468(local10 + Static19.anInt623);
			Static1.aClass5_Sub14_Sub1_1.method1481(local26 >> 14 & 0x7FFF);
			Static1.aClass5_Sub14_Sub1_1.method1465(Static59.anInt1436);
			Static1.aClass5_Sub14_Sub1_1.method1481(local14 + Static25.anInt730);
		}
		if (local18 == 29) {
			local169 = Static88.method2191(local14);
			@Pc(1690) boolean local1690 = true;
			if (local169.anInt1627 > 0) {
				local1690 = Static98.method1665(local169);
			}
			if (local1690) {
				Static1.aClass5_Sub14_Sub1_1.method1489(104);
				Static1.aClass5_Sub14_Sub1_1.method1451(local14);
			}
		}
		if (local18 == 1007) {
			Static8.anInt188 = 0;
			Static32.anInt963 = Static12.anInt308;
			Static63.anInt1553 = Static26.anInt613;
			Static105.anInt3346 = 2;
			Static1.aClass5_Sub14_Sub1_1.method1489(20);
			Static1.aClass5_Sub14_Sub1_1.method1448(local26 >> 14 & 0x7FFF);
		}
		if (local18 == 22) {
			local169 = Static98.method1667(local14, local10);
			if (local169 != null) {
				Static19.method449();
				Static77.method1254(local10, local14, Static27.method1860(Static42.method755(local169)));
				Static123.anInt3071 = 0;
				Static91.aClass61_717 = Static53.method985(local169);
				if (Static91.aClass61_717 == null) {
					Static91.aClass61_717 = Static101.aClass61_796;
				}
				if (local169.aBoolean66) {
					Static50.aClass61_396 = Static123.method1929(new Class61[] { local169.aClass61_510, Static57.aClass61_447 });
					return;
				}
				Static50.aClass61_396 = Static123.method1929(new Class61[] { Static83.aClass61_657, local169.aClass61_505, Static57.aClass61_447 });
			}
			return;
		}
		if (local18 == 2) {
			Static1.aClass5_Sub14_Sub1_1.method1489(39);
			Static1.aClass5_Sub14_Sub1_1.method1482(Static16.anInt491);
			Static1.aClass5_Sub14_Sub1_1.method1448(local10);
			Static1.aClass5_Sub14_Sub1_1.method1465(local14);
			Static1.aClass5_Sub14_Sub1_1.method1446(Static59.anInt1436);
		}
		if (local18 == 57) {
			Static109.method1800(local14, local10, local26);
			Static1.aClass5_Sub14_Sub1_1.method1489(233);
			Static1.aClass5_Sub14_Sub1_1.method1468(local26 >> 14 & 0x7FFF);
			Static1.aClass5_Sub14_Sub1_1.method1448(local14 + Static25.anInt730);
			Static1.aClass5_Sub14_Sub1_1.method1468(Static19.anInt623 + local10);
		}
		if (local18 == 14) {
			local112 = Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[local26];
			if (local112 != null) {
				Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local112.anIntArray346[0], local112.anIntArray350[0], Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, false, 1, 0, 1, 0);
				Static105.anInt3346 = 2;
				Static8.anInt188 = 0;
				Static63.anInt1553 = Static26.anInt613;
				Static32.anInt963 = Static12.anInt308;
				Static1.aClass5_Sub14_Sub1_1.method1489(247);
				Static1.aClass5_Sub14_Sub1_1.method1465(Static59.anInt1436);
				Static1.aClass5_Sub14_Sub1_1.method1482(local26);
				Static1.aClass5_Sub14_Sub1_1.method1448(Static16.anInt491);
			}
		}
		if (local18 == 9) {
			local112 = Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[local26];
			if (local112 != null) {
				Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local112.anIntArray346[0], local112.anIntArray350[0], Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, false, 1, 0, 1, 0);
				Static32.anInt963 = Static12.anInt308;
				Static105.anInt3346 = 2;
				Static8.anInt188 = 0;
				Static63.anInt1553 = Static26.anInt613;
				Static1.aClass5_Sub14_Sub1_1.method1489(82);
				Static1.aClass5_Sub14_Sub1_1.method1481(local26);
			}
		}
		if (local18 == 21) {
			local53 = Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local10, local14, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, false, 0, 0, 0, 0);
			if (!local53) {
				Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local10, local14, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, false, 1, 0, 1, 0);
			}
			Static63.anInt1553 = Static26.anInt613;
			Static32.anInt963 = Static12.anInt308;
			Static8.anInt188 = 0;
			Static105.anInt3346 = 2;
			Static1.aClass5_Sub14_Sub1_1.method1489(190);
			Static1.aClass5_Sub14_Sub1_1.method1481(local14 + Static25.anInt730);
			Static1.aClass5_Sub14_Sub1_1.method1448(Static19.anInt623 + local10);
			Static1.aClass5_Sub14_Sub1_1.method1448(local26);
		}
		if (local18 == 47) {
			Static1.aClass5_Sub14_Sub1_1.method1489(104);
			Static1.aClass5_Sub14_Sub1_1.method1451(local14);
			local169 = Static88.method2191(local14);
			if (local169.anIntArrayArray18 != null && local169.anIntArrayArray18[0][0] == 5) {
				local242 = local169.anIntArrayArray18[0][1];
				if (Static83.anIntArray289[local242] != local169.anIntArray238[0]) {
					Static83.anIntArray289[local242] = local169.anIntArray238[0];
					Static29.method631(local242);
				}
			}
		}
		if (local18 == 33) {
			local112 = Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[local26];
			if (local112 != null) {
				Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local112.anIntArray346[0], local112.anIntArray350[0], Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, false, 1, 0, 1, 0);
				Static32.anInt963 = Static12.anInt308;
				Static8.anInt188 = 0;
				Static105.anInt3346 = 2;
				Static63.anInt1553 = Static26.anInt613;
				Static1.aClass5_Sub14_Sub1_1.method1489(163);
				Static1.aClass5_Sub14_Sub1_1.method1468(Static112.anInt2933);
				Static1.aClass5_Sub14_Sub1_1.method1448(local26);
				Static1.aClass5_Sub14_Sub1_1.method1451(Static86.anInt2322);
				Static1.aClass5_Sub14_Sub1_1.method1468(Static36.anInt1011);
			}
		}
		if (local18 == 38) {
			local487 = Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1[local26];
			if (local487 != null) {
				Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local487.anIntArray346[0], local487.anIntArray350[0], Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, false, 1, 0, 1, 0);
				Static8.anInt188 = 0;
				Static32.anInt963 = Static12.anInt308;
				Static63.anInt1553 = Static26.anInt613;
				Static105.anInt3346 = 2;
				Static1.aClass5_Sub14_Sub1_1.method1489(168);
				Static1.aClass5_Sub14_Sub1_1.method1481(local26);
			}
		}
		if (local18 == 42) {
			Static1.aClass5_Sub14_Sub1_1.method1489(73);
			Static1.aClass5_Sub14_Sub1_1.method1468(local10);
			Static1.aClass5_Sub14_Sub1_1.method1465(local14);
			Static1.aClass5_Sub14_Sub1_1.method1481(local26);
			Static21.anInt645 = 0;
			Static29.aClass5_Sub11_3 = Static88.method2191(local14);
			Static32.anInt964 = local10;
		}
		if (local18 == 16) {
			Static1.aClass5_Sub14_Sub1_1.method1489(106);
			Static1.aClass5_Sub14_Sub1_1.method1448(local26);
			Static1.aClass5_Sub14_Sub1_1.method1482(local10);
			Static1.aClass5_Sub14_Sub1_1.method1465(local14);
			Static21.anInt645 = 0;
			Static29.aClass5_Sub11_3 = Static88.method2191(local14);
			Static32.anInt964 = local10;
		}
		if (local18 == 40) {
			Static1.aClass5_Sub14_Sub1_1.method1489(72);
			Static1.aClass5_Sub14_Sub1_1.method1465(local14);
			Static1.aClass5_Sub14_Sub1_1.method1448(local26);
			Static1.aClass5_Sub14_Sub1_1.method1482(local10);
			Static21.anInt645 = 0;
			Static29.aClass5_Sub11_3 = Static88.method2191(local14);
			Static32.anInt964 = local10;
		}
		if (local18 == 41) {
			Static61.aClass81_1.method2078(Static93.anInt2428, local10, local14);
		}
		if (local18 == 51) {
			Static109.method1800(local14, local10, local26);
			Static1.aClass5_Sub14_Sub1_1.method1489(237);
			Static1.aClass5_Sub14_Sub1_1.method1482(Static19.anInt623 + local10);
			Static1.aClass5_Sub14_Sub1_1.method1468(local14 + Static25.anInt730);
			Static1.aClass5_Sub14_Sub1_1.method1448(local26 >> 14 & 0x7FFF);
		}
		if (local18 == 34) {
			local487 = Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1[local26];
			if (local487 != null) {
				Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local487.anIntArray346[0], local487.anIntArray350[0], Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, false, 1, 0, 1, 0);
				Static63.anInt1553 = Static26.anInt613;
				Static105.anInt3346 = 2;
				Static32.anInt963 = Static12.anInt308;
				Static8.anInt188 = 0;
				Static1.aClass5_Sub14_Sub1_1.method1489(68);
				Static1.aClass5_Sub14_Sub1_1.method1481(local26);
			}
		}
		if (local18 == 10) {
			local487 = Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1[local26];
			if (local487 != null) {
				Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local487.anIntArray346[0], local487.anIntArray350[0], Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, false, 1, 0, 1, 0);
				Static8.anInt188 = 0;
				Static32.anInt963 = Static12.anInt308;
				Static105.anInt3346 = 2;
				Static63.anInt1553 = Static26.anInt613;
				Static1.aClass5_Sub14_Sub1_1.method1489(209);
				Static1.aClass5_Sub14_Sub1_1.method1481(local26);
			}
		}
		if (local18 == 30) {
			local112 = Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[local26];
			if (local112 != null) {
				Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local112.anIntArray346[0], local112.anIntArray350[0], Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, false, 1, 0, 1, 0);
				Static32.anInt963 = Static12.anInt308;
				Static105.anInt3346 = 2;
				Static8.anInt188 = 0;
				Static63.anInt1553 = Static26.anInt613;
				Static1.aClass5_Sub14_Sub1_1.method1489(48);
				Static1.aClass5_Sub14_Sub1_1.method1481(local26);
			}
		}
		if (local18 == 19) {
			local53 = Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local10, local14, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, false, 0, 0, 0, 0);
			if (!local53) {
				Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local10, local14, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, false, 1, 0, 1, 0);
			}
			Static105.anInt3346 = 2;
			Static63.anInt1553 = Static26.anInt613;
			Static32.anInt963 = Static12.anInt308;
			Static8.anInt188 = 0;
			Static1.aClass5_Sub14_Sub1_1.method1489(133);
			Static1.aClass5_Sub14_Sub1_1.method1468(local26);
			Static1.aClass5_Sub14_Sub1_1.method1448(Static25.anInt730 + local14);
			Static1.aClass5_Sub14_Sub1_1.method1481(local10 + Static19.anInt623);
		}
		if (local18 == 36) {
			local487 = Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1[local26];
			if (local487 != null) {
				Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local487.anIntArray346[0], local487.anIntArray350[0], Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, false, 1, 0, 1, 0);
				Static32.anInt963 = Static12.anInt308;
				Static105.anInt3346 = 2;
				Static63.anInt1553 = Static26.anInt613;
				Static8.anInt188 = 0;
				Static1.aClass5_Sub14_Sub1_1.method1489(49);
				Static1.aClass5_Sub14_Sub1_1.method1482(local26);
			}
		}
		if (local18 == 15) {
			Static109.method1800(local14, local10, local26);
			Static1.aClass5_Sub14_Sub1_1.method1489(101);
			Static1.aClass5_Sub14_Sub1_1.method1482(local26 >> 14 & 0x7FFF);
			Static1.aClass5_Sub14_Sub1_1.method1448(Static25.anInt730 + local14);
			Static1.aClass5_Sub14_Sub1_1.method1468(local10 + Static19.anInt623);
		}
		if (local18 == 43) {
			Static109.method1800(local14, local10, local26);
			Static1.aClass5_Sub14_Sub1_1.method1489(211);
			Static1.aClass5_Sub14_Sub1_1.method1482(local14 + Static25.anInt730);
			Static1.aClass5_Sub14_Sub1_1.method1468(local26 >> 14 & 0x7FFF);
			Static1.aClass5_Sub14_Sub1_1.method1468(local10 + Static19.anInt623);
		}
		if (Static123.anInt3071 != 0) {
			Static123.anInt3071 = 0;
			Static24.method505(Static88.method2191(Static86.anInt2322));
		}
		if (Static32.aBoolean27) {
			Static19.method449();
		}
		if (Static29.aClass5_Sub11_3 != null && Static21.anInt645 == 0) {
			Static24.method505(Static29.aClass5_Sub11_3);
		}
	}
}

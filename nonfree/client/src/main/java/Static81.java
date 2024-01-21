import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!kb", name = "fb", descriptor = "[B")
	public static byte[] aByteArray35 = new byte[520];

	@OriginalMember(owner = "client!kb", name = "hb", descriptor = "Lclient!ua;")
	public static Class82 aClass82_34 = new Class82(64);

	@OriginalMember(owner = "client!kb", name = "kb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_835 = Static146.method2172("Konfig geladen)3");

	@OriginalMember(owner = "client!kb", name = "mb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_836 = Static146.method2172("Registrierter Benutzer");

	@OriginalMember(owner = "client!kb", name = "nb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_837 = Static146.method2172("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "(I)V")
	public static void method1496() {
		try {
			if (Static87.anInt2290 == 0) {
				if (Static2.aClass29_2 != null) {
					Static2.aClass29_2.method967();
					Static2.aClass29_2 = null;
				}
				Static149.aBoolean148 = false;
				Static15.anInt482 = 0;
				Static87.anInt2290 = 1;
				Static87.aClass78_4 = null;
			}
			if (Static87.anInt2290 == 1) {
				if (Static87.aClass78_4 == null) {
					Static87.aClass78_4 = Static144.aClass50_4.method1743(Static50.anInt1375, Static18.aString1);
				}
				if (Static87.aClass78_4.anInt3646 == 2) {
					throw new IOException();
				}
				if (Static87.aClass78_4.anInt3646 == 1) {
					Static2.aClass29_2 = new Class29((Socket) Static87.aClass78_4.anObject3, Static144.aClass50_4);
					Static87.aClass78_4 = null;
					Static87.anInt2290 = 2;
				}
			}
			if (Static87.anInt2290 == 2) {
				@Pc(70) long local70 = Static40.aLong39 = Static39.aClass77_446.method2531();
				@Pc(77) int local77 = (int) (local70 >> 16 & 0x1FL);
				Static124.aClass2_Sub18_Sub1_3.anInt3423 = 0;
				Static124.aClass2_Sub18_Sub1_3.method2389(14);
				Static124.aClass2_Sub18_Sub1_3.method2389(local77);
				Static2.aClass29_2.method969(2, Static124.aClass2_Sub18_Sub1_3.aByteArray39);
				Static74.aClass2_Sub18_Sub1_1.anInt3423 = 0;
				Static87.anInt2290 = 3;
			}
			@Pc(119) int local119;
			if (Static87.anInt2290 == 3) {
				if (Static18.aClass19_10 != null) {
					Static18.aClass19_10.method897();
				}
				if (Static131.aClass19_35 != null) {
					Static131.aClass19_35.method897();
				}
				local119 = Static2.aClass29_2.method970();
				if (Static18.aClass19_10 != null) {
					Static18.aClass19_10.method897();
				}
				if (Static131.aClass19_35 != null) {
					Static131.aClass19_35.method897();
				}
				if (local119 != 0) {
					Static58.method1071(local119);
					return;
				}
				Static74.aClass2_Sub18_Sub1_1.anInt3423 = 0;
				Static87.anInt2290 = 4;
			}
			if (Static87.anInt2290 == 4) {
				if (Static74.aClass2_Sub18_Sub1_1.anInt3423 < 8) {
					local119 = Static2.aClass29_2.method966();
					if (local119 > 8 - Static74.aClass2_Sub18_Sub1_1.anInt3423) {
						local119 = 8 - Static74.aClass2_Sub18_Sub1_1.anInt3423;
					}
					if (local119 > 0) {
						Static2.aClass29_2.method965(Static74.aClass2_Sub18_Sub1_1.anInt3423, Static74.aClass2_Sub18_Sub1_1.aByteArray39, local119);
						Static74.aClass2_Sub18_Sub1_1.anInt3423 += local119;
					}
				}
				if (Static74.aClass2_Sub18_Sub1_1.anInt3423 == 8) {
					Static74.aClass2_Sub18_Sub1_1.anInt3423 = 0;
					Static176.aLong128 = Static74.aClass2_Sub18_Sub1_1.method2346();
					Static87.anInt2290 = 5;
				}
			}
			if (Static87.anInt2290 == 5) {
				@Pc(205) int[] local205 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static176.aLong128 >> 32), (int) Static176.aLong128 };
				Static124.aClass2_Sub18_Sub1_3.anInt3423 = 0;
				Static124.aClass2_Sub18_Sub1_3.method2389(10);
				Static124.aClass2_Sub18_Sub1_3.method2370(local205[0]);
				Static124.aClass2_Sub18_Sub1_3.method2370(local205[1]);
				Static124.aClass2_Sub18_Sub1_3.method2370(local205[2]);
				Static124.aClass2_Sub18_Sub1_3.method2370(local205[3]);
				Static124.aClass2_Sub18_Sub1_3.method2384(Static39.aClass77_446.method2531());
				Static124.aClass2_Sub18_Sub1_3.method2367(Static39.aClass77_445);
				Static124.aClass2_Sub18_Sub1_3.method2372(Static17.aBigInteger1, Static158.aBigInteger2);
				Static80.aClass2_Sub18_Sub1_2.anInt3423 = 0;
				if (Static97.anInt2440 == 40) {
					Static80.aClass2_Sub18_Sub1_2.method2389(18);
				} else {
					Static80.aClass2_Sub18_Sub1_2.method2389(16);
				}
				Static80.aClass2_Sub18_Sub1_2.method2389(Static124.aClass2_Sub18_Sub1_3.anInt3423 + 93);
				Static80.aClass2_Sub18_Sub1_2.method2370(475);
				Static80.aClass2_Sub18_Sub1_2.method2389(Static92.aBoolean101 ? 1 : 0);
				Static157.method2672(Static80.aClass2_Sub18_Sub1_2);
				Static80.aClass2_Sub18_Sub1_2.method2370(Static110.aClass43_Sub1_16.anInt3143);
				Static80.aClass2_Sub18_Sub1_2.method2370(Static83.aClass43_Sub1_11.anInt3143);
				Static80.aClass2_Sub18_Sub1_2.method2370(Static8.aClass43_Sub1_1.anInt3143);
				Static80.aClass2_Sub18_Sub1_2.method2370(Static176.aClass43_Sub1_19.anInt3143);
				Static80.aClass2_Sub18_Sub1_2.method2370(Static55.aClass43_Sub1_9.anInt3143);
				Static80.aClass2_Sub18_Sub1_2.method2370(Static120.aClass43_Sub1_6.anInt3143);
				Static80.aClass2_Sub18_Sub1_2.method2370(Static176.aClass43_Sub1_20.anInt3143);
				Static80.aClass2_Sub18_Sub1_2.method2370(Static164.aClass43_Sub1_18.anInt3143);
				Static80.aClass2_Sub18_Sub1_2.method2370(Static91.aClass43_Sub1_12.anInt3143);
				Static80.aClass2_Sub18_Sub1_2.method2370(Static15.aClass43_Sub1_3.anInt3143);
				Static80.aClass2_Sub18_Sub1_2.method2370(Static108.aClass43_Sub1_13.anInt3143);
				Static80.aClass2_Sub18_Sub1_2.method2370(Static125.aClass43_Sub1_15.anInt3143);
				Static80.aClass2_Sub18_Sub1_2.method2370(Static41.aClass43_Sub1_7.anInt3143);
				Static80.aClass2_Sub18_Sub1_2.method2370(Static28.aClass43_Sub1_4.anInt3143);
				Static80.aClass2_Sub18_Sub1_2.method2370(Static161.aClass43_Sub1_17.anInt3143);
				Static80.aClass2_Sub18_Sub1_2.method2370(Static78.aClass43_Sub1_10.anInt3143);
				Static80.aClass2_Sub18_Sub1_2.method2340(Static124.aClass2_Sub18_Sub1_3.aByteArray39, Static124.aClass2_Sub18_Sub1_3.anInt3423);
				Static2.aClass29_2.method969(Static80.aClass2_Sub18_Sub1_2.anInt3423, Static80.aClass2_Sub18_Sub1_2.aByteArray39);
				Static124.aClass2_Sub18_Sub1_3.method2400(local205);
				for (@Pc(418) int local418 = 0; local418 < 4; local418++) {
					local205[local418] += 50;
				}
				Static74.aClass2_Sub18_Sub1_1.method2400(local205);
				Static87.anInt2290 = 6;
			}
			if (Static87.anInt2290 == 6 && Static2.aClass29_2.method966() > 0) {
				local119 = Static2.aClass29_2.method970();
				if (local119 == 21 && Static97.anInt2440 == 20) {
					Static87.anInt2290 = 7;
				} else if (local119 == 2) {
					Static87.anInt2290 = 9;
				} else if (local119 == 15 && Static97.anInt2440 == 40) {
					Static3.method66();
					return;
				} else if (local119 == 23 && Static49.anInt1342 < 1) {
					Static49.anInt1342++;
					Static87.anInt2290 = 0;
				} else {
					Static58.method1071(local119);
					return;
				}
			}
			if (Static87.anInt2290 == 7 && Static2.aClass29_2.method966() > 0) {
				Static4.anInt4365 = (Static2.aClass29_2.method970() + 3) * 60;
				Static87.anInt2290 = 8;
			}
			if (Static87.anInt2290 == 8) {
				Static15.anInt482 = 0;
				Static128.method2194(Static146.method2168(new Class77[] { Static2.method61(Static4.anInt4365 / 60), Static7.aClass77_84 }), Static19.aClass77_273, Static33.aClass77_387);
				if (--Static4.anInt4365 <= 0) {
					Static87.anInt2290 = 0;
				}
			} else {
				if (Static87.anInt2290 == 9 && Static2.aClass29_2.method966() >= 9) {
					Static46.anInt1207 = Static2.aClass29_2.method970();
					Static162.anInt1251 = Static2.aClass29_2.method970();
					Static172.aBoolean178 = Static2.aClass29_2.method970() == 1;
					Static181.anInt4599 = Static2.aClass29_2.method970();
					Static181.anInt4599 <<= 0x8;
					Static181.anInt4599 += Static2.aClass29_2.method970();
					Static150.anInt3701 = Static2.aClass29_2.method970();
					Static2.aClass29_2.method965(0, Static74.aClass2_Sub18_Sub1_1.aByteArray39, 1);
					Static74.aClass2_Sub18_Sub1_1.anInt3423 = 0;
					Static75.anInt1978 = Static74.aClass2_Sub18_Sub1_1.method2406();
					Static2.aClass29_2.method965(0, Static74.aClass2_Sub18_Sub1_1.aByteArray39, 2);
					Static74.aClass2_Sub18_Sub1_1.anInt3423 = 0;
					Static25.anInt731 = Static74.aClass2_Sub18_Sub1_1.method2353();
					Static87.anInt2290 = 10;
				}
				if (Static87.anInt2290 != 10) {
					Static15.anInt482++;
					if (Static15.anInt482 > 2000) {
						if (Static49.anInt1342 < 1) {
							if (Static50.anInt1375 == Static13.anInt381) {
								Static50.anInt1375 = Static70.anInt1895;
							} else {
								Static50.anInt1375 = Static13.anInt381;
							}
							Static87.anInt2290 = 0;
							Static49.anInt1342++;
						} else {
							Static58.method1071(-3);
						}
					}
				} else if (Static2.aClass29_2.method966() >= Static25.anInt731) {
					Static74.aClass2_Sub18_Sub1_1.anInt3423 = 0;
					Static2.aClass29_2.method965(0, Static74.aClass2_Sub18_Sub1_1.aByteArray39, Static25.anInt731);
					Static92.method1681();
					Static6.anInt181 = -1;
					Static105.method1833(false);
					Static75.anInt1978 = -1;
				}
			}
		} catch (@Pc(705) IOException local705) {
			if (Static49.anInt1342 < 1) {
				Static49.anInt1342++;
				Static87.anInt2290 = 0;
				if (Static50.anInt1375 == Static13.anInt381) {
					Static50.anInt1375 = Static70.anInt1895;
				} else {
					Static50.anInt1375 = Static13.anInt381;
				}
			} else {
				Static58.method1071(-2);
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "(I)V")
	public static void method1497() {
		aClass77_837 = null;
		aClass77_835 = null;
		aByteArray35 = null;
		aClass82_34 = null;
		aClass77_836 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BII)I")
	public static int method1498(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static162.method884(arg0 - 1, arg1 - 1) + Static162.method884(arg0 - 1, arg1 - -1) + Static162.method884(arg0 - -1, arg1 - 1) + Static162.method884(arg0 + 1, arg1 - -1);
		@Pc(70) int local70 = Static162.method884(arg0, arg1 - 1) + Static162.method884(arg0, arg1 + 1) + Static162.method884(arg0 - 1, arg1) + Static162.method884(arg0 + 1, arg1);
		@Pc(80) int local80 = Static162.method884(arg0, arg1);
		return local80 / 4 + local40 / 16 + local70 / 8;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!hg;ZLclient!hg;)V")
	public static void method1499(@OriginalArg(0) Class2_Sub2_Sub3_Sub4_Sub1 arg0, @OriginalArg(2) Class2_Sub2_Sub3_Sub4_Sub1 arg1) {
		if (Static126.aClass2_Sub2_Sub3_Sub2Array6 == null) {
			Static126.aClass2_Sub2_Sub3_Sub2Array6 = Static166.method2917(Static91.aClass43_Sub1_12, Static123.aClass77_1113, Static39.aClass77_451);
		}
		if (Static86.aClass2_Sub2_Sub3_Sub3Array13 == null) {
			Static86.aClass2_Sub2_Sub3_Sub3Array13 = Static15.method327(Static13.aClass77_187, Static39.aClass77_451, Static91.aClass43_Sub1_12);
		}
		if (Static75.aClass2_Sub2_Sub3_Sub3Array12 == null) {
			Static75.aClass2_Sub2_Sub3_Sub3Array12 = Static15.method327(Static25.aClass77_311, Static39.aClass77_451, Static91.aClass43_Sub1_12);
		}
		if (Static45.aClass2_Sub2_Sub3_Sub3Array7 == null) {
			Static45.aClass2_Sub2_Sub3_Sub3Array7 = Static15.method327(Static176.aClass77_1527, Static39.aClass77_451, Static91.aClass43_Sub1_12);
		}
		Static113.method1243(0, 23, 765, 480, 0);
		Static113.method1247(0, 0, 125, 23, 12425273, 9135624);
		Static113.method1247(125, 0, 640, 23, 5197647, 2697513);
		arg1.method1255(Static171.aClass77_1449, 62, 15, 0, -1);
		if (Static45.aClass2_Sub2_Sub3_Sub3Array7 != null) {
			Static45.aClass2_Sub2_Sub3_Sub3Array7[1].method1019(140, 1);
			arg0.method1256(Static4.aClass77_1500, 152, 10, 16777215, -1);
			Static45.aClass2_Sub2_Sub3_Sub3Array7[0].method1019(140, 12);
			arg0.method1256(Static131.aClass77_1489, 152, 21, 16777215, -1);
		}
		if (Static75.aClass2_Sub2_Sub3_Sub3Array12 != null) {
			if (Static106.anIntArray410[0] == 0 && Static100.anIntArray102[0] == 0) {
				Static75.aClass2_Sub2_Sub3_Sub3Array12[2].method1019(280, 4);
			} else {
				Static75.aClass2_Sub2_Sub3_Sub3Array12[0].method1019(280, 4);
			}
			if (Static106.anIntArray410[0] == 0 && Static100.anIntArray102[0] == 1) {
				Static75.aClass2_Sub2_Sub3_Sub3Array12[3].method1019(295, 4);
			} else {
				Static75.aClass2_Sub2_Sub3_Sub3Array12[1].method1019(295, 4);
			}
			arg1.method1256(Static166.aClass77_1506, 312, 17, 16777215, -1);
			if (Static106.anIntArray410[0] == 1 && Static100.anIntArray102[0] == 0) {
				Static75.aClass2_Sub2_Sub3_Sub3Array12[2].method1019(390, 4);
			} else {
				Static75.aClass2_Sub2_Sub3_Sub3Array12[0].method1019(390, 4);
			}
			if (Static106.anIntArray410[0] == 1 && Static100.anIntArray102[0] == 1) {
				Static75.aClass2_Sub2_Sub3_Sub3Array12[3].method1019(405, 4);
			} else {
				Static75.aClass2_Sub2_Sub3_Sub3Array12[1].method1019(405, 4);
			}
			arg1.method1256(Static63.aClass77_642, 422, 17, 16777215, -1);
			if (Static106.anIntArray410[0] == 2 && Static100.anIntArray102[0] == 0) {
				Static75.aClass2_Sub2_Sub3_Sub3Array12[2].method1019(500, 4);
			} else {
				Static75.aClass2_Sub2_Sub3_Sub3Array12[0].method1019(500, 4);
			}
			if (Static106.anIntArray410[0] == 2 && Static100.anIntArray102[0] == 1) {
				Static75.aClass2_Sub2_Sub3_Sub3Array12[3].method1019(515, 4);
			} else {
				Static75.aClass2_Sub2_Sub3_Sub3Array12[1].method1019(515, 4);
			}
			arg1.method1256(Static177.aClass77_1537, 532, 17, 16777215, -1);
			if (Static106.anIntArray410[0] == 3 && Static100.anIntArray102[0] == 0) {
				Static75.aClass2_Sub2_Sub3_Sub3Array12[2].method1019(610, 4);
			} else {
				Static75.aClass2_Sub2_Sub3_Sub3Array12[0].method1019(610, 4);
			}
			if (Static106.anIntArray410[0] == 3 && Static100.anIntArray102[0] == 1) {
				Static75.aClass2_Sub2_Sub3_Sub3Array12[3].method1019(625, 4);
			} else {
				Static75.aClass2_Sub2_Sub3_Sub3Array12[1].method1019(625, 4);
			}
			arg1.method1256(Static79.aClass77_823, 642, 17, 16777215, -1);
		}
		Static113.method1243(708, 4, 50, 16, 0);
		arg0.method1255(Static181.aClass77_1563, 733, 16, 16777215, -1);
		Static148.anInt3617 = -1;
		if (Static126.aClass2_Sub2_Sub3_Sub2Array6 == null) {
			return;
		}
		@Pc(398) int local398 = 8;
		@Pc(406) int local406 = 24;
		@Pc(408) int local408;
		@Pc(410) int local410;
		do {
			local408 = local406;
			local410 = local398;
			if (Static58.anInt1526 <= (local398 - 1) * local406) {
				local398--;
			}
			if (local398 * (local406 - 1) >= Static58.anInt1526) {
				local406--;
			}
			if (Static58.anInt1526 <= (local406 - 1) * local398) {
				local406--;
			}
		} while (local406 != local408 || local398 != local410);
		local408 = (765 - local398 * 88) / (local398 + 1);
		local410 = (480 - local406 * 19) / (local406 + 1);
		if (local408 > 5) {
			local408 = 5;
		}
		if (local410 > 5) {
			local410 = 5;
		}
		@Pc(499) int local499 = (765 - local398 * 88 - (local398 + -1) * local408) / 2;
		@Pc(515) int local515 = (480 - (local406 - 1) * local410 - local406 * 19) / 2;
		@Pc(519) int local519 = local515 + 23;
		@Pc(521) int local521 = local499;
		@Pc(523) int local523 = 0;
		for (@Pc(525) int local525 = 0; local525 < Static58.anInt1526; local525++) {
			@Pc(531) Class84 local531 = Static140.aClass84Array1[local525];
			@Pc(533) boolean local533 = true;
			@Pc(538) Class77 local538 = Static2.method61(local531.anInt4015);
			if (local531.anInt4015 == -1) {
				local538 = Static134.aClass77_1184;
				local533 = false;
			} else if (local531.anInt4015 > 1980) {
				local538 = Static161.aClass77_1355;
				local533 = false;
			}
			if (Static20.anInt631 >= local521 && Static132.anInt3185 >= local519 && Static20.anInt631 < local521 + 88 && Static132.anInt3185 < local519 + 19 && local533) {
				Static148.anInt3617 = local525;
				Static126.aClass2_Sub2_Sub3_Sub2Array6[local531.aBoolean166 ? 1 : 0].method396(local521, local519);
			} else {
				Static126.aClass2_Sub2_Sub3_Sub2Array6[local531.aBoolean166 ? 1 : 0].method389(local521, local519);
			}
			if (Static86.aClass2_Sub2_Sub3_Sub3Array13 != null) {
				Static86.aClass2_Sub2_Sub3_Sub3Array13[local531.anInt4016 + (local531.aBoolean166 ? 8 : 0)].method1019(local521 + 29, local519);
			}
			arg1.method1255(Static2.method61(local531.anInt4020), local521 + 15, 5 + 9 + local519, 0, -1);
			arg0.method1255(local538, local521 + 60, local519 + 14, 268435455, -1);
			local519 += local410 + 19;
			local523++;
			if (local523 >= local406) {
				local521 += local408 + 88;
				local519 = local515 + 23;
				local523 = 0;
			}
		}
	}
}

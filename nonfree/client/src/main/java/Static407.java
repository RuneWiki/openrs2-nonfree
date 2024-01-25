import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!ol", name = "B", descriptor = "Ljava/lang/Object;")
	public static Object anObject16;

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)V")
	public static void method6402() {
		if (Static347.anInt6836 == 0 || Static347.anInt6836 == 5) {
			return;
		}
		try {
			@Pc(22) short local22;
			if (Static643.anInt10743 == 0) {
				local22 = 250;
			} else {
				local22 = 2000;
			}
			if (local22 < ++Static271.anInt5798) {
				if (Static226.aClass41_1 != null) {
					Static226.aClass41_1.method1733();
					Static226.aClass41_1 = null;
				}
				if (Static643.anInt10743 >= 3) {
					Static347.anInt6836 = 0;
					Static628.method8566(-5);
					return;
				}
				if (Static554.anInt9496 == 2) {
					Static184.aClass358_1.method8344();
				} else {
					Static578.aClass358_5.method8344();
				}
				Static347.anInt6836 = 1;
				Static271.anInt5798 = 0;
				Static643.anInt10743++;
			}
			if (Static347.anInt6836 == 1) {
				if (Static554.anInt9496 == 2) {
					Static275.aClass159_9 = Static184.aClass358_1.method8340(Static496.aClass104_4);
				} else {
					Static275.aClass159_9 = Static578.aClass358_5.method8340(Static496.aClass104_4);
				}
				Static347.anInt6836 = 2;
			}
			@Pc(124) Class6_Sub17 local124;
			if (Static347.anInt6836 == 2) {
				if (Static275.aClass159_9.anInt5910 == 2) {
					throw new IOException();
				}
				if (Static275.aClass159_9.anInt5910 != 1) {
					return;
				}
				Static226.aClass41_1 = Static360.method5825((Socket) Static275.aClass159_9.anObject13);
				Static275.aClass159_9 = null;
				Static102.method2421();
				local124 = Static145.method2840();
				local124.aClass6_Sub8_Sub1_2.method8211(Static519.aClass238_1.anInt7405);
				Static452.method6867(local124);
				Static169.method3193();
				Static347.anInt6836 = 3;
			}
			@Pc(161) int local161;
			if (Static347.anInt6836 == 3) {
				if (!Static226.aClass41_1.method1729(1)) {
					return;
				}
				Static226.aClass41_1.method1734(Static84.aClass6_Sub8_Sub1_1.aByteArray102, 0, 1);
				local161 = Static84.aClass6_Sub8_Sub1_1.aByteArray102[0] & 0xFF;
				if (local161 != 0) {
					Static347.anInt6836 = 0;
					Static628.method8566(local161);
					Static226.aClass41_1.method1733();
					Static226.aClass41_1 = null;
					Static139.method2768();
					return;
				}
				Static84.aClass6_Sub8_Sub1_1.anInt10061 = 0;
				@Pc(187) Class6_Sub8 local187 = new Class6_Sub8(518);
				@Pc(190) int[] local190 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
				local187.method8211(10);
				local187.method8202(local190[0]);
				local187.method8202(local190[1]);
				local187.method8202(local190[2]);
				local187.method8202(local190[3]);
				local187.method8238(0L);
				local187.method8205(Static613.aString108);
				local187.method8238(Static328.aLong181);
				local187.method8238(Static462.aLong227);
				local187.method8222(Static548.aBigInteger6, Static265.aBigInteger4);
				Static102.method2421();
				@Pc(272) Class6_Sub17 local272 = Static145.method2840();
				@Pc(275) Class6_Sub8_Sub1 local275 = local272.aClass6_Sub8_Sub1_2;
				@Pc(292) int local292;
				@Pc(307) int local307;
				if (Static554.anInt9496 == 2) {
					if (Static333.anInt6626 == 13) {
						local275.method8211(Static519.aClass238_5.anInt7405);
					} else {
						local275.method8211(Static519.aClass238_3.anInt7405);
					}
					local275.method8241(0);
					local292 = local275.anInt10061;
					local275.method8202(637);
					local275.method8234(local187.aByteArray102, local187.anInt10061, 0);
					local307 = local275.anInt10061;
					local275.method8205(Static60.aString69);
					local275.method8211(Static326.anInt6465);
					local275.method8211(Static326.method5447());
					local275.method8241(Static294.anInt6026);
					local275.method8241(Static277.anInt5899);
					local275.method8211(Static87.aClass6_Sub33_6.aClass14_Sub23_2.method7320());
					Static287.method4978(local275);
					local275.method8205(Static162.aString39);
					local275.method8202(Static234.anInt5227);
					@Pc(431) Class6_Sub8 local431 = Static87.aClass6_Sub33_6.method4999();
					local275.method8211(local431.anInt10061);
					local275.method8234(local431.aByteArray102, local431.anInt10061, 0);
					Static406.aBoolean589 = true;
					@Pc(453) Class6_Sub8 local453 = new Class6_Sub8(Static18.aClass6_Sub38_1.method6656());
					Static18.aClass6_Sub38_1.method6654(local453);
					local275.method8234(local453.aByteArray102, local453.aByteArray102.length, 0);
					local275.method8241(Static140.anInt3330);
					local275.method8238(Static361.aLong189);
					local275.method8211(Static108.aString21 == null ? 0 : 1);
					if (Static108.aString21 != null) {
						local275.method8205(Static108.aString21);
					}
					local275.method8211(Static462.method6946("jagtheora") ? 1 : 0);
					Static87.method2237(local275);
					local275.method8252(local190, local307, local275.anInt10061);
					local275.method8224(local275.anInt10061 - local292);
				} else {
					local275.method8211(Static519.aClass238_6.anInt7405);
					local275.method8241(0);
					local292 = local275.anInt10061;
					local275.method8202(637);
					local275.method8234(local187.aByteArray102, local187.anInt10061, 0);
					local307 = local275.anInt10061;
					local275.method8205(Static60.aString69);
					local275.method8211(Static8.aClass290_1.anInt8594);
					local275.method8211(Static638.anInt10709);
					Static287.method4978(local275);
					local275.method8205(Static162.aString39);
					local275.method8202(Static234.anInt5227);
					Static87.method2237(local275);
					local275.method8252(local190, local307, local275.anInt10061);
					local275.method8224(local275.anInt10061 - local292);
				}
				Static452.method6867(local272);
				Static169.method3193();
				Static569.aClass134_2 = new Class134(local190);
				for (local292 = 0; local292 < 4; local292++) {
					local190[local292] += 50;
				}
				Static84.aClass6_Sub8_Sub1_1.method1514(local190);
				Static347.anInt6836 = 4;
			}
			if (Static347.anInt6836 == 4) {
				if (!Static226.aClass41_1.method1729(1)) {
					return;
				}
				Static226.aClass41_1.method1734(Static84.aClass6_Sub8_Sub1_1.aByteArray102, 0, 1);
				local161 = Static84.aClass6_Sub8_Sub1_1.aByteArray102[0] & 0xFF;
				if (local161 == 21) {
					Static347.anInt6836 = 7;
				} else if (local161 == 29) {
					Static347.anInt6836 = 13;
				} else if (local161 == 1) {
					Static347.anInt6836 = 5;
					Static628.method8566(local161);
					return;
				} else if (local161 == 2) {
					Static347.anInt6836 = 8;
				} else if (local161 == 15) {
					Static125.anInt3103 = -2;
					Static347.anInt6836 = 14;
				} else if (local161 == 23 && Static643.anInt10743 < 3) {
					Static643.anInt10743++;
					Static347.anInt6836 = 1;
					Static271.anInt5798 = 0;
					Static226.aClass41_1.method1733();
					Static226.aClass41_1 = null;
					return;
				} else {
					Static347.anInt6836 = 0;
					Static628.method8566(local161);
					Static226.aClass41_1.method1733();
					Static226.aClass41_1 = null;
					Static139.method2768();
					return;
				}
			}
			if (Static347.anInt6836 == 6) {
				Static102.method2421();
				local124 = Static145.method2840();
				@Pc(658) Class6_Sub8_Sub1 local658 = local124.aClass6_Sub8_Sub1_2;
				local658.method1507(Static569.aClass134_2);
				local658.method1516(Static519.aClass238_10.anInt7405);
				Static452.method6867(local124);
				Static169.method3193();
				Static347.anInt6836 = 4;
			} else if (Static347.anInt6836 == 7) {
				if (Static226.aClass41_1.method1729(1)) {
					Static226.aClass41_1.method1734(Static84.aClass6_Sub8_Sub1_1.aByteArray102, 0, 1);
					local161 = Static84.aClass6_Sub8_Sub1_1.aByteArray102[0] & 0xFF;
					Static599.anInt10166 = local161 * 60 + 180;
					Static347.anInt6836 = 0;
					Static628.method8566(21);
					Static226.aClass41_1.method1733();
					Static226.aClass41_1 = null;
					Static139.method2768();
				}
			} else if (Static347.anInt6836 == 13) {
				if (Static226.aClass41_1.method1729(1)) {
					Static226.aClass41_1.method1734(Static84.aClass6_Sub8_Sub1_1.aByteArray102, 0, 1);
					Static347.anInt6836 = 0;
					Static566.anInt9749 = Static84.aClass6_Sub8_Sub1_1.aByteArray102[0] & 0xFF;
					Static628.method8566(29);
					Static226.aClass41_1.method1733();
					Static226.aClass41_1 = null;
					Static139.method2768();
				}
			} else if (Static347.anInt6836 != 8) {
				@Pc(795) Class6_Sub8_Sub1 local795;
				if (Static347.anInt6836 == 9) {
					local795 = Static84.aClass6_Sub8_Sub1_1;
					if (Static554.anInt9496 == 2) {
						if (!Static226.aClass41_1.method1729(Static356.anInt6905)) {
							return;
						}
						Static226.aClass41_1.method1734(local795.aByteArray102, 0, Static356.anInt6905);
						local795.anInt10061 = 0;
						Static497.anInt8643 = local795.method8246();
						Static98.anInt2793 = local795.method8246();
						Static198.aBoolean342 = local795.method8246() == 1;
						Static561.aBoolean771 = local795.method8246() == 1;
						Static415.aBoolean604 = local795.method8246() == 1;
						Static334.aBoolean523 = local795.method8246() == 1;
						Static238.anInt5268 = local795.method8220();
						Static393.aBoolean579 = local795.method8246() == 1;
						Static145.anInt3425 = local795.method8244();
						Static149.aBoolean276 = local795.method8246() == 1;
						Static249.aClass310_1.method7483(Static149.aBoolean276);
						Static356.aClass221_1.method5927(Static149.aBoolean276);
						Static8.aClass309_1.method7460(Static149.aBoolean276);
					} else if (Static226.aClass41_1.method1729(Static356.anInt6905)) {
						Static226.aClass41_1.method1734(local795.aByteArray102, 0, Static356.anInt6905);
						local795.anInt10061 = 0;
						Static497.anInt8643 = local795.method8246();
						Static98.anInt2793 = local795.method8246();
						Static198.aBoolean342 = local795.method8246() == 1;
						Static561.aBoolean771 = local795.method8246() == 1;
						Static415.aBoolean604 = local795.method8246() == 1;
						Static101.anInt3116 = local795.method8231();
						Static393.aBoolean579 = Static101.anInt3116 > 0;
						Static13.anInt556 = local795.method8220();
						Static243.anInt4639 = local795.method8220();
						Static328.anInt6578 = local795.method8220();
						Static342.anInt6802 = local795.method8236();
						Static350.aClass159_6 = Static496.aClass104_4.method3137(Static342.anInt6802);
						Static39.anInt1421 = local795.method8246();
						Static552.anInt9489 = local795.method8220();
						Static559.anInt9602 = local795.method8220();
						Static406.aBoolean588 = local795.method8246() == 1;
						Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aString46 = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aString45 = Static534.aString98 = local795.method8240();
						Static496.anInt8640 = local795.method8246();
						Static74.anInt2416 = local795.method8236();
						Static504.aClass358_4 = new Class358();
						Static504.aClass358_4.anInt10266 = local795.method8220();
						if (Static504.aClass358_4.anInt10266 == 65535) {
							Static504.aClass358_4.anInt10266 = -1;
						}
						Static504.aClass358_4.aString107 = local795.method8240();
						if (Static630.aClass212_18 != Static86.aClass212_19) {
							Static504.aClass358_4.anInt10268 = Static504.aClass358_4.anInt10266 + 50000;
							Static504.aClass358_4.anInt10271 = Static504.aClass358_4.anInt10266 + 40000;
						}
						if (Static630.aClass212_18 != Static496.aClass212_17 && (Static184.aClass358_1.method8343(Static307.aClass358_2) || Static184.aClass358_1.method8343(Static439.aClass358_3))) {
							Static408.method6422();
						}
					} else {
						return;
					}
					if (Static198.aBoolean342 && !Static415.aBoolean604 || Static393.aBoolean579) {
						try {
							Static651.method5913("zap", Static635.anApplet2);
						} catch (@Pc(1107) Throwable local1107) {
							if (Static320.aBoolean496) {
								try {
									Static635.anApplet2.getAppletContext().showDocument(new URL(Static635.anApplet2.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1121) Exception local1121) {
								}
							}
						}
					} else {
						try {
							Static651.method5913("unzap", Static635.anApplet2);
						} catch (@Pc(1098) Throwable local1098) {
						}
					}
					if (Static86.aClass212_19 == Static630.aClass212_18) {
						try {
							Static651.method5913("loggedin", Static635.anApplet2);
						} catch (@Pc(1132) Throwable local1132) {
						}
					}
					if (Static554.anInt9496 != 2) {
						Static347.anInt6836 = 0;
						Static628.method8566(2);
						Static540.method7636();
						Static119.method2558(7);
						Static165.aClass73_55 = null;
						return;
					}
					Static347.anInt6836 = 11;
				}
				if (Static347.anInt6836 == 11) {
					if (!Static226.aClass41_1.method1729(3)) {
						return;
					}
					Static226.aClass41_1.method1734(Static84.aClass6_Sub8_Sub1_1.aByteArray102, 0, 3);
					Static347.anInt6836 = 12;
				}
				if (Static347.anInt6836 == 12) {
					local795 = Static84.aClass6_Sub8_Sub1_1;
					local795.anInt10061 = 0;
					if (local795.method1515()) {
						if (!Static226.aClass41_1.method1729(1)) {
							return;
						}
						Static226.aClass41_1.method1734(local795.aByteArray102, 3, 1);
					}
					Static165.aClass73_55 = Static543.method7665()[local795.method1510()];
					Static125.anInt3103 = local795.method8220();
					Static347.anInt6836 = 10;
				}
				if (Static347.anInt6836 == 10) {
					if (Static226.aClass41_1.method1729(Static125.anInt3103)) {
						Static226.aClass41_1.method1734(Static84.aClass6_Sub8_Sub1_1.aByteArray102, 0, Static125.anInt3103);
						Static84.aClass6_Sub8_Sub1_1.anInt10061 = 0;
						local161 = Static125.anInt3103;
						Static347.anInt6836 = 0;
						Static628.method8566(2);
						Static362.method5844();
						Static636.method7541(Static84.aClass6_Sub8_Sub1_1);
						Static300.anInt6134 = -1;
						if (Static165.aClass73_55 == Static288.aClass73_99) {
							Static440.method6728();
						} else {
							Static458.method6904();
						}
						if (local161 != Static84.aClass6_Sub8_Sub1_1.anInt10061) {
							throw new RuntimeException("lswp pos:" + Static84.aClass6_Sub8_Sub1_1.anInt10061 + " psize:" + local161);
						}
						Static165.aClass73_55 = null;
					}
				} else if (Static347.anInt6836 == 14) {
					if (Static125.anInt3103 == -2) {
						if (!Static226.aClass41_1.method1729(2)) {
							return;
						}
						Static226.aClass41_1.method1734(Static84.aClass6_Sub8_Sub1_1.aByteArray102, 0, 2);
						Static84.aClass6_Sub8_Sub1_1.anInt10061 = 0;
						Static125.anInt3103 = Static84.aClass6_Sub8_Sub1_1.method8220();
					}
					if (Static226.aClass41_1.method1729(Static125.anInt3103)) {
						Static226.aClass41_1.method1734(Static84.aClass6_Sub8_Sub1_1.aByteArray102, 0, Static125.anInt3103);
						Static84.aClass6_Sub8_Sub1_1.anInt10061 = 0;
						Static347.anInt6836 = 0;
						local161 = Static125.anInt3103;
						Static628.method8566(15);
						Static285.method4960();
						Static636.method7541(Static84.aClass6_Sub8_Sub1_1);
						if (local161 != Static84.aClass6_Sub8_Sub1_1.anInt10061) {
							throw new RuntimeException("lswpr pos:" + Static84.aClass6_Sub8_Sub1_1.anInt10061 + " psize:" + local161);
						}
						Static165.aClass73_55 = null;
					}
				}
			} else if (Static226.aClass41_1.method1729(1)) {
				Static226.aClass41_1.method1734(Static84.aClass6_Sub8_Sub1_1.aByteArray102, 0, 1);
				Static356.anInt6905 = Static84.aClass6_Sub8_Sub1_1.aByteArray102[0] & 0xFF;
				Static347.anInt6836 = 9;
			}
		} catch (@Pc(1369) IOException local1369) {
			if (Static226.aClass41_1 != null) {
				Static226.aClass41_1.method1733();
				Static226.aClass41_1 = null;
			}
			if (Static643.anInt10743 >= 3) {
				Static347.anInt6836 = 0;
				Static628.method8566(-4);
				Static139.method2768();
			} else {
				if (Static554.anInt9496 == 2) {
					Static184.aClass358_1.method8344();
				} else {
					Static578.aClass358_5.method8344();
				}
				Static643.anInt10743++;
				Static347.anInt6836 = 1;
				Static271.anInt5798 = 0;
			}
		}
	}
}

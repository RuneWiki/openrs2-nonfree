import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!pn", name = "n", descriptor = "I")
	public static int anInt4981;

	@OriginalMember(owner = "client!pn", name = "t", descriptor = "[I")
	public static int[] anIntArray485;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_116 = new Class85("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!pn", name = "u", descriptor = "[I")
	public static final int[] anIntArray486 = new int[2500];

	@OriginalMember(owner = "client!pn", name = "w", descriptor = "J")
	public static long aLong167 = 0L;

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(Z)V")
	public static void method4447() {
		if (Static150.anInt2940 == 0 || Static150.anInt2940 == 5) {
			return;
		}
		try {
			if (++Static255.anInt5063 > 2000) {
				if (Static155.aClass41_18 != null) {
					Static155.aClass41_18.method825();
					Static155.aClass41_18 = null;
				}
				if (Static148.anInt2911 >= 1) {
					Static150.anInt2940 = 0;
					Static333.anInt6433 = -5;
					return;
				}
				if (Static195.anInt3881 == Static101.anInt1909) {
					Static101.anInt1909 = Static312.anInt6076;
				} else {
					Static101.anInt1909 = Static195.anInt3881;
				}
				Static255.anInt5063 = 0;
				Static148.anInt2911++;
				Static150.anInt2940 = 1;
			}
			if (Static150.anInt2940 == 1) {
				Static164.aClass16_4 = Static182.aClass139_5.method3857(Static101.anInt1909, Static152.aString56);
				Static150.anInt2940 = 2;
			}
			if (Static150.anInt2940 == 2) {
				if (Static164.aClass16_4.anInt381 == 2) {
					throw new IOException();
				}
				if (Static164.aClass16_4.anInt381 != 1) {
					return;
				}
				Static155.aClass41_18 = new Class41((Socket) Static164.aClass16_4.anObject1, Static182.aClass139_5);
				Static164.aClass16_4 = null;
				@Pc(115) long local115 = Static153.aLong105 = Static269.method4712(Static9.aString3);
				Static125.aClass5_Sub12_Sub2_3.anInt5731 = 0;
				@Pc(125) int local125 = (int) (local115 >> 16 & 0x1FL);
				Static125.aClass5_Sub12_Sub2_3.method5089(14);
				Static125.aClass5_Sub12_Sub2_3.method5089(local125);
				Static155.aClass41_18.method829(Static125.aClass5_Sub12_Sub2_3.aByteArray90, 2);
				if (Static143.aClass47_1 != null) {
					Static143.aClass47_1.method5324();
				}
				if (Static311.aClass47_3 != null) {
					Static311.aClass47_3.method5324();
				}
				@Pc(154) int local154 = Static155.aClass41_18.method830();
				if (Static143.aClass47_1 != null) {
					Static143.aClass47_1.method5324();
				}
				if (Static311.aClass47_3 != null) {
					Static311.aClass47_3.method5324();
				}
				if (local154 != 0) {
					Static333.anInt6433 = local154;
					Static150.anInt2940 = 0;
					Static155.aClass41_18.method825();
					Static155.aClass41_18 = null;
					return;
				}
				Static150.anInt2940 = 3;
			}
			if (Static150.anInt2940 == 3) {
				if (Static155.aClass41_18.method826() < 8) {
					return;
				}
				Static155.aClass41_18.method827(Static187.aClass5_Sub12_Sub2_4.aByteArray90, 8, 0);
				Static187.aClass5_Sub12_Sub2_4.anInt5731 = 0;
				Static326.aLong220 = Static187.aClass5_Sub12_Sub2_4.method5099();
				@Pc(211) int[] local211 = new int[4];
				Static125.aClass5_Sub12_Sub2_3.anInt5731 = 0;
				local211[0] = (int) (Math.random() * 9.9999999E7D);
				local211[1] = (int) (Math.random() * 9.9999999E7D);
				local211[3] = (int) Static326.aLong220;
				local211[2] = (int) (Static326.aLong220 >> 32);
				Static125.aClass5_Sub12_Sub2_3.method5089(10);
				Static125.aClass5_Sub12_Sub2_3.method5070(local211[0]);
				Static125.aClass5_Sub12_Sub2_3.method5070(local211[1]);
				Static125.aClass5_Sub12_Sub2_3.method5070(local211[2]);
				Static125.aClass5_Sub12_Sub2_3.method5070(local211[3]);
				Static125.aClass5_Sub12_Sub2_3.method5065(Static269.method4712(Static9.aString3));
				Static125.aClass5_Sub12_Sub2_3.method5094(Static26.aString6);
				Static125.aClass5_Sub12_Sub2_3.method5078(Static304.aBigInteger5, Static292.aBigInteger4);
				Static12.aClass5_Sub12_Sub2_5.anInt5731 = 0;
				if (Static278.anInt5495 == 40) {
					Static12.aClass5_Sub12_Sub2_5.method5089(18);
				} else {
					Static12.aClass5_Sub12_Sub2_5.method5089(16);
				}
				Static12.aClass5_Sub12_Sub2_5.method5084(Static125.aClass5_Sub12_Sub2_3.anInt5731 + Static56.method878(Static96.aString10) + 161);
				Static12.aClass5_Sub12_Sub2_5.method5070(565);
				Static12.aClass5_Sub12_Sub2_5.method5089(Static37.anInt671);
				Static12.aClass5_Sub12_Sub2_5.method5089(Static101.method1804());
				Static12.aClass5_Sub12_Sub2_5.method5084(Static168.anInt3376);
				Static12.aClass5_Sub12_Sub2_5.method5084(Static256.anInt5066);
				Static12.aClass5_Sub12_Sub2_5.method5089(Static44.anInt747);
				Static192.method3438(Static12.aClass5_Sub12_Sub2_5);
				Static12.aClass5_Sub12_Sub2_5.method5094(Static96.aString10);
				Static12.aClass5_Sub12_Sub2_5.method5070(Static16.anInt331);
				Static12.aClass5_Sub12_Sub2_5.method5070(Static141.method2509());
				Static157.aBoolean232 = true;
				Static12.aClass5_Sub12_Sub2_5.method5084(Static215.anInt4249);
				Static12.aClass5_Sub12_Sub2_5.method5070(Static183.aClass93_69.method2395());
				Static12.aClass5_Sub12_Sub2_5.method5070(Static55.aClass93_106.method2395());
				Static12.aClass5_Sub12_Sub2_5.method5070(Static200.aClass93_77.method2395());
				Static12.aClass5_Sub12_Sub2_5.method5070(Static346.aClass93_130.method2395());
				Static12.aClass5_Sub12_Sub2_5.method5070(Static186.aClass93_72.method2395());
				Static12.aClass5_Sub12_Sub2_5.method5070(Static351.aClass93_134.method2395());
				Static12.aClass5_Sub12_Sub2_5.method5070(Static319.aClass93_121.method2395());
				Static12.aClass5_Sub12_Sub2_5.method5070(Static161.aClass93_63.method2395());
				Static12.aClass5_Sub12_Sub2_5.method5070(Static244.aClass93_93.method2395());
				Static12.aClass5_Sub12_Sub2_5.method5070(Static242.aClass93_90.method2395());
				Static12.aClass5_Sub12_Sub2_5.method5070(Static177.aClass93_65.method2395());
				Static12.aClass5_Sub12_Sub2_5.method5070(Static270.aClass93_104.method2395());
				Static12.aClass5_Sub12_Sub2_5.method5070(Static1.aClass93_1.method2395());
				Static12.aClass5_Sub12_Sub2_5.method5070(Static294.aClass93_133.method2395());
				Static12.aClass5_Sub12_Sub2_5.method5070(Static134.aClass93_43.method2395());
				Static12.aClass5_Sub12_Sub2_5.method5070(Static134.aClass93_42.method2395());
				Static12.aClass5_Sub12_Sub2_5.method5070(Static29.aClass93_11.method2395());
				Static12.aClass5_Sub12_Sub2_5.method5070(Static253.aClass93_96.method2395());
				Static12.aClass5_Sub12_Sub2_5.method5070(Static254.aClass93_97.method2395());
				Static12.aClass5_Sub12_Sub2_5.method5070(Static233.aClass93_88.method2395());
				Static12.aClass5_Sub12_Sub2_5.method5070(Static1.aClass93_2.method2395());
				Static12.aClass5_Sub12_Sub2_5.method5070(Static180.aClass93_66.method2395());
				Static12.aClass5_Sub12_Sub2_5.method5070(Static288.aClass93_112.method2395());
				Static12.aClass5_Sub12_Sub2_5.method5070(Static48.aClass93_15.method2395());
				Static12.aClass5_Sub12_Sub2_5.method5070(Static159.aClass93_62.method2395());
				Static12.aClass5_Sub12_Sub2_5.method5070(Static307.aClass93_118.method2395());
				Static12.aClass5_Sub12_Sub2_5.method5070(Static191.aClass93_75.method2395());
				Static12.aClass5_Sub12_Sub2_5.method5070(Static353.aClass93_135.method2395());
				Static12.aClass5_Sub12_Sub2_5.method5070(Static93.aClass93_37.method2395());
				Static12.aClass5_Sub12_Sub2_5.method5110(Static125.aClass5_Sub12_Sub2_3.anInt5731, Static125.aClass5_Sub12_Sub2_3.aByteArray90);
				Static155.aClass41_18.method829(Static12.aClass5_Sub12_Sub2_5.aByteArray90, Static12.aClass5_Sub12_Sub2_5.anInt5731);
				Static125.aClass5_Sub12_Sub2_3.method5118(local211);
				for (@Pc(553) int local553 = 0; local553 < 4; local553++) {
					local211[local553] += 50;
				}
				Static187.aClass5_Sub12_Sub2_4.method5118(local211);
				Static150.anInt2940 = 4;
			}
			if (Static150.anInt2940 == 4) {
				if (Static155.aClass41_18.method826() < 1) {
					return;
				}
				@Pc(589) int local589 = Static155.aClass41_18.method830();
				if (local589 == 21) {
					Static150.anInt2940 = 7;
				} else if (local589 == 29) {
					Static150.anInt2940 = 10;
				} else if (local589 == 1) {
					Static150.anInt2940 = 5;
					Static333.anInt6433 = local589;
					return;
				} else if (local589 == 2) {
					Static150.anInt2940 = 8;
				} else if (local589 == 15) {
					Static150.anInt2940 = 0;
					Static333.anInt6433 = local589;
					return;
				} else if (local589 == 23 && Static148.anInt2911 < 1) {
					Static255.anInt5063 = 0;
					Static148.anInt2911++;
					Static150.anInt2940 = 1;
					Static155.aClass41_18.method825();
					Static155.aClass41_18 = null;
					return;
				} else {
					Static333.anInt6433 = local589;
					Static150.anInt2940 = 0;
					Static155.aClass41_18.method825();
					Static155.aClass41_18 = null;
					return;
				}
			}
			if (Static150.anInt2940 == 6) {
				Static125.aClass5_Sub12_Sub2_3.anInt5731 = 0;
				Static125.aClass5_Sub12_Sub2_3.method5125(17);
				Static155.aClass41_18.method829(Static125.aClass5_Sub12_Sub2_3.aByteArray90, Static125.aClass5_Sub12_Sub2_3.anInt5731);
				Static150.anInt2940 = 4;
			} else if (Static150.anInt2940 == 7) {
				if (Static155.aClass41_18.method826() >= 1) {
					Static315.anInt6162 = Static155.aClass41_18.method830() * 60 + 180;
					Static333.anInt6433 = 21;
					Static150.anInt2940 = 0;
					Static155.aClass41_18.method825();
					Static155.aClass41_18 = null;
				}
			} else if (Static150.anInt2940 != 10) {
				if (Static150.anInt2940 == 8) {
					if (Static155.aClass41_18.method826() < 13) {
						return;
					}
					Static155.aClass41_18.method827(Static187.aClass5_Sub12_Sub2_4.aByteArray90, 13, 0);
					Static187.aClass5_Sub12_Sub2_4.anInt5731 = 0;
					Static262.anInt5151 = Static187.aClass5_Sub12_Sub2_4.method5115();
					Static220.anInt4353 = Static187.aClass5_Sub12_Sub2_4.method5115();
					Static230.aBoolean377 = Static187.aClass5_Sub12_Sub2_4.method5115() == 1;
					Static312.aBoolean510 = Static187.aClass5_Sub12_Sub2_4.method5115() == 1;
					Static239.aBoolean401 = Static187.aClass5_Sub12_Sub2_4.method5115() == 1;
					Static14.aBoolean26 = Static187.aClass5_Sub12_Sub2_4.method5115() == 1;
					Static166.anInt3304 = Static187.aClass5_Sub12_Sub2_4.method5106();
					Static338.aBoolean591 = Static187.aClass5_Sub12_Sub2_4.method5115() == 1;
					Static331.aBoolean537 = Static187.aClass5_Sub12_Sub2_4.method5115() == 1;
					Static157.method2790(Static331.aBoolean537);
					Static102.method1834(Static331.aBoolean537);
					Static132.method2365(Static331.aBoolean537);
					if (Static230.aBoolean377 && !Static239.aBoolean401 || Static338.aBoolean591) {
						try {
							Static370.method5989(Static182.aClass139_5.anApplet1, "zap");
						} catch (@Pc(859) Throwable local859) {
						}
					} else {
						try {
							Static370.method5989(Static182.aClass139_5.anApplet1, "unzap");
						} catch (@Pc(849) Throwable local849) {
						}
					}
					if (Static351.anInt6735 == 0) {
						try {
							Static370.method5989(Static182.aClass139_5.anApplet1, "loggedin");
						} catch (@Pc(873) Throwable local873) {
						}
					}
					Static297.anInt5810 = Static187.aClass5_Sub12_Sub2_4.method5117();
					Static54.anInt1000 = Static187.aClass5_Sub12_Sub2_4.method5106();
					Static150.anInt2940 = 9;
				}
				if (Static150.anInt2940 == 9 && Static155.aClass41_18.method826() >= Static54.anInt1000) {
					Static187.aClass5_Sub12_Sub2_4.anInt5731 = 0;
					Static155.aClass41_18.method827(Static187.aClass5_Sub12_Sub2_4.aByteArray90, Static54.anInt1000, 0);
					Static333.anInt6433 = 2;
					Static150.anInt2940 = 0;
					Static284.method4943();
					Static53.anInt990 = -1;
					Static33.method564(false);
					Static297.anInt5810 = -1;
				}
			} else if (Static155.aClass41_18.method826() >= 1) {
				Static224.anInt4432 = Static155.aClass41_18.method830();
				Static333.anInt6433 = 29;
				Static150.anInt2940 = 0;
				Static155.aClass41_18.method825();
				Static155.aClass41_18 = null;
			}
		} catch (@Pc(922) IOException local922) {
			if (Static155.aClass41_18 != null) {
				Static155.aClass41_18.method825();
				Static155.aClass41_18 = null;
			}
			if (Static148.anInt2911 < 1) {
				Static255.anInt5063 = 0;
				Static148.anInt2911++;
				if (Static101.anInt1909 == Static195.anInt3881) {
					Static101.anInt1909 = Static312.anInt6076;
				} else {
					Static101.anInt1909 = Static195.anInt3881;
				}
				Static150.anInt2940 = 1;
			} else {
				Static150.anInt2940 = 0;
				Static333.anInt6433 = -4;
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "(I)I")
	public static int method4451() {
		try {
			if (Static244.anInt4904 == 0) {
				if (Static113.aLong74 > Static340.method5863() - 5000L) {
					return 0;
				}
				Static116.aClass16_3 = Static182.aClass139_5.method3857(Static89.anInt1684, Static214.aString37);
				Static117.aLong77 = Static340.method5863();
				Static244.anInt4904 = 1;
			}
			if (Static340.method5863() > Static117.aLong77 + 30000L) {
				return Static48.method800(1000);
			}
			@Pc(74) int local74;
			@Pc(117) int local117;
			if (Static244.anInt4904 == 1) {
				if (Static116.aClass16_3.anInt381 == 2) {
					return Static48.method800(1001);
				}
				if (Static116.aClass16_3.anInt381 != 1) {
					return -1;
				}
				Static155.aClass41_18 = new Class41((Socket) Static116.aClass16_3.anObject1, Static182.aClass139_5);
				Static116.aClass16_3 = null;
				local74 = 0;
				Static125.aClass5_Sub12_Sub2_3.anInt5731 = 0;
				if (Static244.aBoolean410) {
					local74 = Static168.anInt3379;
				}
				Static125.aClass5_Sub12_Sub2_3.method5089(23);
				Static125.aClass5_Sub12_Sub2_3.method5070(local74);
				Static155.aClass41_18.method829(Static125.aClass5_Sub12_Sub2_3.aByteArray90, Static125.aClass5_Sub12_Sub2_3.anInt5731);
				if (Static143.aClass47_1 != null) {
					Static143.aClass47_1.method5324();
				}
				if (Static311.aClass47_3 != null) {
					Static311.aClass47_3.method5324();
				}
				local117 = Static155.aClass41_18.method830();
				if (Static143.aClass47_1 != null) {
					Static143.aClass47_1.method5324();
				}
				if (Static311.aClass47_3 != null) {
					Static311.aClass47_3.method5324();
				}
				if (local117 != 0) {
					return Static48.method800(local117);
				}
				Static244.anInt4904 = 2;
			}
			if (Static244.anInt4904 == 2) {
				if (Static155.aClass41_18.method826() < 2) {
					return -1;
				}
				Static306.anInt5963 = Static155.aClass41_18.method830();
				Static306.anInt5963 <<= 0x8;
				Static306.anInt5963 += Static155.aClass41_18.method830();
				Static259.aByteArray71 = new byte[Static306.anInt5963];
				Static244.anInt4904 = 3;
				Static94.anInt1799 = 0;
			}
			if (Static244.anInt4904 != 3) {
				return -1;
			}
			local74 = Static155.aClass41_18.method826();
			if (local74 < 1) {
				return -1;
			}
			if (local74 > Static306.anInt5963 - Static94.anInt1799) {
				local74 = Static306.anInt5963 - Static94.anInt1799;
			}
			Static155.aClass41_18.method827(Static259.aByteArray71, local74, Static94.anInt1799);
			Static94.anInt1799 += local74;
			if (Static94.anInt1799 < Static306.anInt5963) {
				return -1;
			} else if (Static6.method103(Static259.aByteArray71)) {
				Static241.aClass6_Sub1Array2 = new Class6_Sub1[Static117.anInt2167];
				local117 = 0;
				for (@Pc(229) int local229 = Static84.anInt4253; local229 <= Static284.anInt5595; local229++) {
					@Pc(234) Class6_Sub1 local234 = Static14.method286(local229);
					if (local234 != null) {
						Static241.aClass6_Sub1Array2[local117++] = local234;
					}
				}
				Static168.anInt3378 = 0;
				Static128.aClass5_Sub40_3 = null;
				Static155.aClass41_18.method825();
				Static244.anInt4904 = 0;
				Static274.anInt5436 = 0;
				Static259.aByteArray71 = null;
				Static155.aClass41_18 = null;
				Static113.aLong74 = Static340.method5863();
				return 0;
			} else {
				return Static48.method800(1002);
			}
		} catch (@Pc(266) IOException local266) {
			return Static48.method800(1003);
		}
	}
}

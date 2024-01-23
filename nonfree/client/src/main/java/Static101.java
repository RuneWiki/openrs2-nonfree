import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
	public static int anInt4750;

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "Lclient!ie;")
	public static Class4_Sub17_Sub1 aClass4_Sub17_Sub1_4 = new Class4_Sub17_Sub1(5000);

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString162 = "flash1:";

	@OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
	public static int anInt4751 = 0;

	@OriginalMember(owner = "client!hi", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString163 = "glow1:";

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)V")
	public static void method3788() {
		Static287.aClass33_20.method838(5);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
	public static void method3789() {
		aString163 = null;
		aString162 = null;
		aClass4_Sub17_Sub1_4 = null;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
	public static void method3791() {
		if (Static277.anInt5177 == 0 || Static277.anInt5177 == 5) {
			return;
		}
		try {
			if (++Static223.anInt4427 > 2000) {
				if (Static259.aClass158_3 != null) {
					Static259.aClass158_3.method3779();
					Static259.aClass158_3 = null;
				}
				if (Static214.anInt4266 >= 1) {
					Static277.anInt5177 = 0;
					Static254.anInt4785 = -5;
					return;
				}
				if (Static275.anInt5134 == Static187.anInt3757) {
					Static187.anInt3757 = anInt4750;
				} else {
					Static187.anInt3757 = Static275.anInt5134;
				}
				Static223.anInt4427 = 0;
				Static277.anInt5177 = 1;
				Static214.anInt4266++;
			}
			if (Static277.anInt5177 == 1) {
				Static86.aClass123_2 = Static87.aClass164_2.method3941(Static28.aString8, Static187.anInt3757);
				Static277.anInt5177 = 2;
			}
			if (Static277.anInt5177 == 2) {
				if (Static86.aClass123_2.anInt3791 == 2) {
					throw new IOException();
				}
				if (Static86.aClass123_2.anInt3791 != 1) {
					return;
				}
				Static259.aClass158_3 = new Class158((Socket) Static86.aClass123_2.anObject4, Static87.aClass164_2);
				Static86.aClass123_2 = null;
				@Pc(120) long local120 = Static217.aLong158 = Static34.method491(Static106.aString68);
				Static142.aClass4_Sub17_Sub1_3.anInt2400 = 0;
				Static142.aClass4_Sub17_Sub1_3.method1861(14);
				@Pc(134) int local134 = (int) (local120 >> 16 & 0x1FL);
				Static142.aClass4_Sub17_Sub1_3.method1861(local134);
				Static259.aClass158_3.method3780(Static142.aClass4_Sub17_Sub1_3.aByteArray30, 2);
				if (Static83.aClass51_4 != null) {
					Static83.aClass51_4.method3280();
				}
				if (Static147.aClass51_3 != null) {
					Static147.aClass51_3.method3280();
				}
				@Pc(162) int local162 = Static259.aClass158_3.method3777();
				if (Static83.aClass51_4 != null) {
					Static83.aClass51_4.method3280();
				}
				if (Static147.aClass51_3 != null) {
					Static147.aClass51_3.method3280();
				}
				if (local162 != 0) {
					Static277.anInt5177 = 0;
					Static254.anInt4785 = local162;
					Static259.aClass158_3.method3779();
					Static259.aClass158_3 = null;
					return;
				}
				Static277.anInt5177 = 3;
			}
			if (Static277.anInt5177 == 3) {
				if (Static259.aClass158_3.method3774() < 8) {
					return;
				}
				Static259.aClass158_3.method3775(0, 8, aClass4_Sub17_Sub1_4.aByteArray30);
				aClass4_Sub17_Sub1_4.anInt2400 = 0;
				Static106.aLong87 = aClass4_Sub17_Sub1_4.method1864();
				Static142.aClass4_Sub17_Sub1_3.anInt2400 = 0;
				@Pc(226) int[] local226 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static106.aLong87 >> 32), (int) Static106.aLong87 };
				Static142.aClass4_Sub17_Sub1_3.method1861(10);
				Static142.aClass4_Sub17_Sub1_3.method1854(local226[0]);
				Static142.aClass4_Sub17_Sub1_3.method1854(local226[1]);
				Static142.aClass4_Sub17_Sub1_3.method1854(local226[2]);
				Static142.aClass4_Sub17_Sub1_3.method1854(local226[3]);
				Static142.aClass4_Sub17_Sub1_3.method1891(Static34.method491(Static106.aString68));
				Static142.aClass4_Sub17_Sub1_3.method1849(Static268.aString184);
				Static142.aClass4_Sub17_Sub1_3.method1857(Static138.aBigInteger1, Static172.aBigInteger2);
				Static261.aClass4_Sub17_Sub1_5.anInt2400 = 0;
				if (Static267.anInt3573 == 40) {
					Static261.aClass4_Sub17_Sub1_5.method1861(18);
				} else {
					Static261.aClass4_Sub17_Sub1_5.method1861(16);
				}
				Static261.aClass4_Sub17_Sub1_5.method1875(Static142.aClass4_Sub17_Sub1_3.anInt2400 + Static255.method3839(Static90.aString56) + 163);
				Static261.aClass4_Sub17_Sub1_5.method1854(542);
				Static261.aClass4_Sub17_Sub1_5.method1861(Static292.anInt5465);
				Static261.aClass4_Sub17_Sub1_5.method1861(Static148.aBoolean198 ? 1 : 0);
				Static261.aClass4_Sub17_Sub1_5.method1861(1);
				Static261.aClass4_Sub17_Sub1_5.method1861(Static40.method683());
				Static261.aClass4_Sub17_Sub1_5.method1875(Static111.anInt2450);
				Static261.aClass4_Sub17_Sub1_5.method1875(Static216.anInt4287);
				Static261.aClass4_Sub17_Sub1_5.method1861(Static218.anInt5374);
				Static117.method2004(Static261.aClass4_Sub17_Sub1_5);
				Static261.aClass4_Sub17_Sub1_5.method1849(Static90.aString56);
				Static261.aClass4_Sub17_Sub1_5.method1854(Static168.anInt3340);
				Static261.aClass4_Sub17_Sub1_5.method1854(Static2.method10());
				Static189.aBoolean320 = true;
				Static261.aClass4_Sub17_Sub1_5.method1875(Static44.anInt886);
				Static261.aClass4_Sub17_Sub1_5.method1854(Static125.aClass98_77.method2403());
				Static261.aClass4_Sub17_Sub1_5.method1854(Static262.aClass98_152.method2403());
				Static261.aClass4_Sub17_Sub1_5.method1854(Static165.aClass98_95.method2403());
				Static261.aClass4_Sub17_Sub1_5.method1854(Static34.aClass98_18.method2403());
				Static261.aClass4_Sub17_Sub1_5.method1854(Static35.aClass98_22.method2403());
				Static261.aClass4_Sub17_Sub1_5.method1854(Static106.aClass98_65.method2403());
				Static261.aClass4_Sub17_Sub1_5.method1854(Static94.aClass98_56.method2403());
				Static261.aClass4_Sub17_Sub1_5.method1854(Static34.aClass98_19.method2403());
				Static261.aClass4_Sub17_Sub1_5.method1854(Static288.aClass98_66.method2403());
				Static261.aClass4_Sub17_Sub1_5.method1854(Static145.aClass98_88.method2403());
				Static261.aClass4_Sub17_Sub1_5.method1854(Static218.aClass98_168.method2403());
				Static261.aClass4_Sub17_Sub1_5.method1854(Static28.aClass98_17.method2403());
				Static261.aClass4_Sub17_Sub1_5.method1854(Static80.aClass98_49.method2403());
				Static261.aClass4_Sub17_Sub1_5.method1854(Static197.aClass98_116.method2403());
				Static261.aClass4_Sub17_Sub1_5.method1854(Static154.aClass98_91.method2403());
				Static261.aClass4_Sub17_Sub1_5.method1854(Static24.aClass98_11.method2403());
				Static261.aClass4_Sub17_Sub1_5.method1854(Static137.aClass98_83.method2403());
				Static261.aClass4_Sub17_Sub1_5.method1854(Static71.aClass98_44.method2403());
				Static261.aClass4_Sub17_Sub1_5.method1854(Static234.aClass98_136.method2403());
				Static261.aClass4_Sub17_Sub1_5.method1854(Static142.aClass98_87.method2403());
				Static261.aClass4_Sub17_Sub1_5.method1854(Static43.aClass98_174.method2403());
				Static261.aClass4_Sub17_Sub1_5.method1854(Static142.aClass98_86.method2403());
				Static261.aClass4_Sub17_Sub1_5.method1854(Static1.aClass98_1.method2403());
				Static261.aClass4_Sub17_Sub1_5.method1854(Static234.aClass98_137.method2403());
				Static261.aClass4_Sub17_Sub1_5.method1854(Static277.aClass98_163.method2403());
				Static261.aClass4_Sub17_Sub1_5.method1854(Static43.aClass98_173.method2403());
				Static261.aClass4_Sub17_Sub1_5.method1854(Static116.aClass98_73.method2403());
				Static261.aClass4_Sub17_Sub1_5.method1854(Static62.aClass98_34.method2403());
				Static261.aClass4_Sub17_Sub1_5.method1854(Static190.aClass98_109.method2403());
				Static261.aClass4_Sub17_Sub1_5.method1878(Static142.aClass4_Sub17_Sub1_3.anInt2400, Static142.aClass4_Sub17_Sub1_3.aByteArray30);
				Static259.aClass158_3.method3780(Static261.aClass4_Sub17_Sub1_5.aByteArray30, Static261.aClass4_Sub17_Sub1_5.anInt2400);
				Static142.aClass4_Sub17_Sub1_3.method1906(local226);
				for (@Pc(579) int local579 = 0; local579 < 4; local579++) {
					local226[local579] += 50;
				}
				aClass4_Sub17_Sub1_4.method1906(local226);
				Static277.anInt5177 = 4;
			}
			if (Static277.anInt5177 == 4) {
				if (Static259.aClass158_3.method3774() < 1) {
					return;
				}
				@Pc(615) int local615 = Static259.aClass158_3.method3777();
				if (local615 == 21) {
					Static277.anInt5177 = 7;
				} else if (local615 == 29) {
					Static277.anInt5177 = 10;
				} else if (local615 == 1) {
					Static254.anInt4785 = local615;
					Static277.anInt5177 = 5;
					return;
				} else if (local615 == 2) {
					Static277.anInt5177 = 8;
				} else if (local615 == 15) {
					Static254.anInt4785 = local615;
					Static277.anInt5177 = 0;
					return;
				} else if (local615 == 23 && Static214.anInt4266 < 1) {
					Static223.anInt4427 = 0;
					Static277.anInt5177 = 1;
					Static214.anInt4266++;
					Static259.aClass158_3.method3779();
					Static259.aClass158_3 = null;
					return;
				} else {
					Static277.anInt5177 = 0;
					Static254.anInt4785 = local615;
					Static259.aClass158_3.method3779();
					Static259.aClass158_3 = null;
					return;
				}
			}
			if (Static277.anInt5177 == 6) {
				Static142.aClass4_Sub17_Sub1_3.anInt2400 = 0;
				Static142.aClass4_Sub17_Sub1_3.method1905(17);
				Static259.aClass158_3.method3780(Static142.aClass4_Sub17_Sub1_3.aByteArray30, Static142.aClass4_Sub17_Sub1_3.anInt2400);
				Static277.anInt5177 = 4;
				return;
			}
			if (Static277.anInt5177 == 7) {
				if (Static259.aClass158_3.method3774() < 1) {
					return;
				}
				Static230.anInt4510 = (Static259.aClass158_3.method3777() + 3) * 60;
				Static277.anInt5177 = 0;
				Static254.anInt4785 = 21;
				Static259.aClass158_3.method3779();
				Static259.aClass158_3 = null;
				return;
			}
			if (Static277.anInt5177 == 10) {
				if (Static259.aClass158_3.method3774() < 1) {
					return;
				}
				Static16.anInt311 = Static259.aClass158_3.method3777();
				Static277.anInt5177 = 0;
				Static254.anInt4785 = 29;
				Static259.aClass158_3.method3779();
				Static259.aClass158_3 = null;
				return;
			}
			if (Static277.anInt5177 == 8) {
				if (Static259.aClass158_3.method3774() < 14) {
					return;
				}
				Static259.aClass158_3.method3775(0, 14, aClass4_Sub17_Sub1_4.aByteArray30);
				aClass4_Sub17_Sub1_4.anInt2400 = 0;
				Static176.anInt829 = aClass4_Sub17_Sub1_4.method1874();
				Static32.anInt639 = aClass4_Sub17_Sub1_4.method1874();
				Static263.aBoolean68 = aClass4_Sub17_Sub1_4.method1874() == 1;
				Static189.aBoolean321 = aClass4_Sub17_Sub1_4.method1874() == 1;
				Static240.aBoolean332 = aClass4_Sub17_Sub1_4.method1874() == 1;
				Static63.aBoolean91 = aClass4_Sub17_Sub1_4.method1874() == 1;
				Static185.aBoolean241 = aClass4_Sub17_Sub1_4.method1874() == 1;
				Static238.anInt4597 = aClass4_Sub17_Sub1_4.method1837();
				Static183.aBoolean235 = aClass4_Sub17_Sub1_4.method1874() == 1;
				Static39.aBoolean340 = aClass4_Sub17_Sub1_4.method1874() == 1;
				Static32.method476(Static39.aBoolean340);
				Static43.method4374(Static39.aBoolean340);
				if (!Static148.aBoolean198) {
					if (Static263.aBoolean68 && !Static240.aBoolean332 || Static183.aBoolean235) {
						try {
							Static301.method121(Static87.aClass164_2.anApplet1, "zap");
						} catch (@Pc(895) Throwable local895) {
						}
					} else {
						try {
							Static301.method121(Static87.aClass164_2.anApplet1, "unzap");
						} catch (@Pc(885) Throwable local885) {
						}
					}
				}
				try {
					Static301.method121(Static87.aClass164_2.anApplet1, "loggedin");
				} catch (@Pc(903) Throwable local903) {
				}
				Static92.anInt1908 = aClass4_Sub17_Sub1_4.method1899();
				Static131.anInt2781 = aClass4_Sub17_Sub1_4.method1837();
				Static277.anInt5177 = 9;
			}
			if (Static277.anInt5177 == 9) {
				if (Static259.aClass158_3.method3774() >= Static131.anInt2781) {
					aClass4_Sub17_Sub1_4.anInt2400 = 0;
					Static259.aClass158_3.method3775(0, Static131.anInt2781, aClass4_Sub17_Sub1_4.aByteArray30);
					Static277.anInt5177 = 0;
					Static254.anInt4785 = 2;
					Static108.method1748();
					Static25.anInt450 = -1;
					Static43.method4376(false);
					Static92.anInt1908 = -1;
					return;
				}
				return;
			}
		} catch (@Pc(952) IOException local952) {
			if (Static259.aClass158_3 != null) {
				Static259.aClass158_3.method3779();
				Static259.aClass158_3 = null;
			}
			if (Static214.anInt4266 >= 1) {
				Static277.anInt5177 = 0;
				Static254.anInt4785 = -4;
			} else {
				Static277.anInt5177 = 1;
				Static223.anInt4427 = 0;
				if (Static187.anInt3757 == Static275.anInt5134) {
					Static187.anInt3757 = anInt4750;
				} else {
					Static187.anInt3757 = Static275.anInt5134;
				}
				Static214.anInt4266++;
			}
		}
	}
}

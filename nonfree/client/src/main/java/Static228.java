import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!og", name = "j", descriptor = "I")
	public static int anInt4498;

	@OriginalMember(owner = "client!og", name = "l", descriptor = "I")
	public static int anInt4500;

	@OriginalMember(owner = "client!og", name = "f", descriptor = "Lclient!bd;")
	public static final Class18 aClass18_26 = new Class18();

	@OriginalMember(owner = "client!og", name = "i", descriptor = "I")
	public static int anInt4497 = 0;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIII)I")
	public static int method4029(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = 255 - arg1;
		@Pc(31) int local31 = ((arg2 & 0xFF00FF) * arg1 & 0xFF00FF00 | (arg2 & 0xFF00) * arg1 & 0xFF0000) >>> 8;
		return local31 + (((arg0 & 0xFF00) * local8 & 0xFF0000 | (arg0 & 0xFF00FF) * local8 & 0xFF00FF00) >>> 8);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BC)C")
	public static char method4030(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V")
	public static void method4031() {
		if (Static44.anInt1104 == 0 || Static44.anInt1104 == 5) {
			return;
		}
		try {
			if (++Static313.anInt6042 > 2000) {
				if (Static138.aClass159_3 != null) {
					Static138.aClass159_3.method4079();
					Static138.aClass159_3 = null;
				}
				if (Static156.anInt5903 >= 1) {
					Static44.anInt1104 = 0;
					Static276.anInt5254 = -5;
					return;
				}
				if (Static109.anInt2429 == Static165.anInt5083) {
					Static109.anInt2429 = Static273.anInt5185;
				} else {
					Static109.anInt2429 = Static165.anInt5083;
				}
				Static44.anInt1104 = 1;
				Static313.anInt6042 = 0;
				Static156.anInt5903++;
			}
			if (Static44.anInt1104 == 1) {
				Static281.aClass205_10 = Static105.aClass15_2.method284(Static46.aString46, Static109.anInt2429);
				Static44.anInt1104 = 2;
			}
			if (Static44.anInt1104 == 2) {
				if (Static281.aClass205_10.anInt6370 == 2) {
					throw new IOException();
				}
				if (Static281.aClass205_10.anInt6370 != 1) {
					return;
				}
				Static138.aClass159_3 = new Class159((Socket) Static281.aClass205_10.anObject7, Static105.aClass15_2);
				Static281.aClass205_10 = null;
				@Pc(106) long local106 = Static154.aLong101 = Static30.method749(Static166.aString124);
				@Pc(113) int local113 = (int) (local106 >> 16 & 0x1FL);
				Static164.aClass14_Sub4_Sub2_3.anInt2637 = 0;
				Static164.aClass14_Sub4_Sub2_3.method2538(14);
				Static164.aClass14_Sub4_Sub2_3.method2538(local113);
				Static138.aClass159_3.method4082(Static164.aClass14_Sub4_Sub2_3.aByteArray74, 2);
				if (Static115.aClass26_7 != null) {
					Static115.aClass26_7.method4220();
				}
				if (Static311.aClass26_12 != null) {
					Static311.aClass26_12.method4220();
				}
				@Pc(145) int local145 = Static138.aClass159_3.method4086();
				if (Static115.aClass26_7 != null) {
					Static115.aClass26_7.method4220();
				}
				if (Static311.aClass26_12 != null) {
					Static311.aClass26_12.method4220();
				}
				if (local145 != 0) {
					Static44.anInt1104 = 0;
					Static276.anInt5254 = local145;
					Static138.aClass159_3.method4079();
					Static138.aClass159_3 = null;
					return;
				}
				Static44.anInt1104 = 3;
			}
			if (Static44.anInt1104 == 3) {
				if (Static138.aClass159_3.method4083() < 8) {
					return;
				}
				Static138.aClass159_3.method4084(Static30.aClass14_Sub4_Sub2_1.aByteArray74, 8, 0);
				Static30.aClass14_Sub4_Sub2_1.anInt2637 = 0;
				Static46.aLong37 = Static30.aClass14_Sub4_Sub2_1.method2516();
				@Pc(203) int[] local203 = new int[4];
				Static164.aClass14_Sub4_Sub2_3.anInt2637 = 0;
				local203[2] = (int) (Static46.aLong37 >> 32);
				local203[1] = (int) (Math.random() * 9.9999999E7D);
				local203[3] = (int) Static46.aLong37;
				local203[0] = (int) (Math.random() * 9.9999999E7D);
				Static164.aClass14_Sub4_Sub2_3.method2538(10);
				Static164.aClass14_Sub4_Sub2_3.method2541(local203[0]);
				Static164.aClass14_Sub4_Sub2_3.method2541(local203[1]);
				Static164.aClass14_Sub4_Sub2_3.method2541(local203[2]);
				Static164.aClass14_Sub4_Sub2_3.method2541(local203[3]);
				Static164.aClass14_Sub4_Sub2_3.method2544(Static30.method749(Static166.aString124));
				Static164.aClass14_Sub4_Sub2_3.method2527(Static345.aString244);
				Static164.aClass14_Sub4_Sub2_3.method2534(Static166.aBigInteger2, Static101.aBigInteger1);
				Static79.aClass14_Sub4_Sub2_2.anInt2637 = 0;
				if (Static302.anInt5842 == 40) {
					Static79.aClass14_Sub4_Sub2_2.method2538(18);
				} else {
					Static79.aClass14_Sub4_Sub2_2.method2538(16);
				}
				Static79.aClass14_Sub4_Sub2_2.method2509(Static164.aClass14_Sub4_Sub2_3.anInt2637 + Static333.method5739(Static323.aString38) + 161);
				Static79.aClass14_Sub4_Sub2_2.method2541(564);
				Static79.aClass14_Sub4_Sub2_2.method2538(Static339.anInt2494);
				Static79.aClass14_Sub4_Sub2_2.method2538(Static237.method4149());
				Static79.aClass14_Sub4_Sub2_2.method2509(Static294.anInt5659);
				Static79.aClass14_Sub4_Sub2_2.method2509(Static46.anInt1173);
				Static79.aClass14_Sub4_Sub2_2.method2538(Static217.anInt4358);
				Static127.method2658(Static79.aClass14_Sub4_Sub2_2);
				Static79.aClass14_Sub4_Sub2_2.method2527(Static323.aString38);
				Static79.aClass14_Sub4_Sub2_2.method2541(Static74.anInt5346);
				Static79.aClass14_Sub4_Sub2_2.method2541(Static164.method3265());
				Static251.aBoolean207 = true;
				Static79.aClass14_Sub4_Sub2_2.method2509(Static313.anInt6041);
				Static79.aClass14_Sub4_Sub2_2.method2541(Static346.aClass143_116.method3751());
				Static79.aClass14_Sub4_Sub2_2.method2541(Static237.aClass143_89.method3751());
				Static79.aClass14_Sub4_Sub2_2.method2541(Static185.aClass143_75.method3751());
				Static79.aClass14_Sub4_Sub2_2.method2541(Static92.aClass143_51.method3751());
				Static79.aClass14_Sub4_Sub2_2.method2541(Static54.aClass143_38.method3751());
				Static79.aClass14_Sub4_Sub2_2.method2541(Static231.aClass143_85.method3751());
				Static79.aClass14_Sub4_Sub2_2.method2541(Static304.aClass143_106.method3751());
				Static79.aClass14_Sub4_Sub2_2.method2541(Static338.aClass143_114.method3751());
				Static79.aClass14_Sub4_Sub2_2.method2541(Static348.aClass143_98.method3751());
				Static79.aClass14_Sub4_Sub2_2.method2541(Static302.aClass143_105.method3751());
				Static79.aClass14_Sub4_Sub2_2.method2541(Static86.aClass143_49.method3751());
				Static79.aClass14_Sub4_Sub2_2.method2541(Static69.aClass143_42.method3751());
				Static79.aClass14_Sub4_Sub2_2.method2541(Static9.aClass143_8.method3751());
				Static79.aClass14_Sub4_Sub2_2.method2541(Static332.aClass143_111.method3751());
				Static79.aClass14_Sub4_Sub2_2.method2541(Static233.aClass143_86.method3751());
				Static79.aClass14_Sub4_Sub2_2.method2541(Static80.aClass143_48.method3751());
				Static79.aClass14_Sub4_Sub2_2.method2541(Static213.aClass143_80.method3751());
				Static79.aClass14_Sub4_Sub2_2.method2541(Static99.aClass143_53.method3751());
				Static79.aClass14_Sub4_Sub2_2.method2541(Static39.aClass143_25.method3751());
				Static79.aClass14_Sub4_Sub2_2.method2541(Static272.aClass143_96.method3751());
				Static79.aClass14_Sub4_Sub2_2.method2541(Static192.aClass143_77.method3751());
				Static79.aClass14_Sub4_Sub2_2.method2541(Static127.aClass143_59.method3751());
				Static79.aClass14_Sub4_Sub2_2.method2541(Static44.aClass143_30.method3751());
				Static79.aClass14_Sub4_Sub2_2.method2541(Static53.aClass143_37.method3751());
				Static79.aClass14_Sub4_Sub2_2.method2541(Static202.aClass143_79.method3751());
				Static79.aClass14_Sub4_Sub2_2.method2541(Static46.aClass143_32.method3751());
				Static79.aClass14_Sub4_Sub2_2.method2541(Static277.aClass143_97.method3751());
				Static79.aClass14_Sub4_Sub2_2.method2541(Static48.aClass143_34.method3751());
				Static79.aClass14_Sub4_Sub2_2.method2541(Static27.aClass143_18.method3751());
				Static79.aClass14_Sub4_Sub2_2.method2495(Static164.aClass14_Sub4_Sub2_3.aByteArray74, Static164.aClass14_Sub4_Sub2_3.anInt2637);
				Static138.aClass159_3.method4082(Static79.aClass14_Sub4_Sub2_2.aByteArray74, Static79.aClass14_Sub4_Sub2_2.anInt2637);
				Static164.aClass14_Sub4_Sub2_3.method2564(local203);
				for (@Pc(551) int local551 = 0; local551 < 4; local551++) {
					local203[local551] += 50;
				}
				Static30.aClass14_Sub4_Sub2_1.method2564(local203);
				Static44.anInt1104 = 4;
			}
			if (Static44.anInt1104 == 4) {
				if (Static138.aClass159_3.method4083() < 1) {
					return;
				}
				@Pc(585) int local585 = Static138.aClass159_3.method4086();
				if (local585 == 21) {
					Static44.anInt1104 = 7;
				} else if (local585 == 29) {
					Static44.anInt1104 = 10;
				} else if (local585 == 1) {
					Static44.anInt1104 = 5;
					Static276.anInt5254 = local585;
					return;
				} else if (local585 == 2) {
					Static44.anInt1104 = 8;
				} else if (local585 == 15) {
					Static44.anInt1104 = 0;
					Static276.anInt5254 = local585;
					return;
				} else if (local585 == 23 && Static156.anInt5903 < 1) {
					Static313.anInt6042 = 0;
					Static44.anInt1104 = 1;
					Static156.anInt5903++;
					Static138.aClass159_3.method4079();
					Static138.aClass159_3 = null;
					return;
				} else {
					Static44.anInt1104 = 0;
					Static276.anInt5254 = local585;
					Static138.aClass159_3.method4079();
					Static138.aClass159_3 = null;
					return;
				}
			}
			if (Static44.anInt1104 == 6) {
				Static164.aClass14_Sub4_Sub2_3.anInt2637 = 0;
				Static164.aClass14_Sub4_Sub2_3.method2557(17);
				Static138.aClass159_3.method4082(Static164.aClass14_Sub4_Sub2_3.aByteArray74, Static164.aClass14_Sub4_Sub2_3.anInt2637);
				Static44.anInt1104 = 4;
			} else if (Static44.anInt1104 == 7) {
				if (Static138.aClass159_3.method4083() >= 1) {
					Static16.anInt297 = Static138.aClass159_3.method4086() * 60 + 180;
					Static276.anInt5254 = 21;
					Static44.anInt1104 = 0;
					Static138.aClass159_3.method4079();
					Static138.aClass159_3 = null;
				}
			} else if (Static44.anInt1104 != 10) {
				if (Static44.anInt1104 == 8) {
					if (Static138.aClass159_3.method4083() < 14) {
						return;
					}
					Static138.aClass159_3.method4084(Static30.aClass14_Sub4_Sub2_1.aByteArray74, 14, 0);
					Static30.aClass14_Sub4_Sub2_1.anInt2637 = 0;
					Static40.anInt979 = Static30.aClass14_Sub4_Sub2_1.method2548();
					Static154.anInt3267 = Static30.aClass14_Sub4_Sub2_1.method2548();
					Static8.aBoolean9 = Static30.aClass14_Sub4_Sub2_1.method2548() == 1;
					Static104.aBoolean162 = Static30.aClass14_Sub4_Sub2_1.method2548() == 1;
					Static297.aBoolean374 = Static30.aClass14_Sub4_Sub2_1.method2548() == 1;
					Static318.aBoolean423 = Static30.aClass14_Sub4_Sub2_1.method2548() == 1;
					Static254.aBoolean326 = Static30.aClass14_Sub4_Sub2_1.method2548() == 1;
					Static266.anInt5054 = Static30.aClass14_Sub4_Sub2_1.method2498();
					Static301.aBoolean408 = Static30.aClass14_Sub4_Sub2_1.method2548() == 1;
					Static15.aBoolean420 = Static30.aClass14_Sub4_Sub2_1.method2548() == 1;
					Static238.method4173(Static15.aBoolean420);
					Static291.method4989(Static15.aBoolean420);
					Static45.method1113(Static15.aBoolean420);
					if (Static8.aBoolean9 && !Static297.aBoolean374 || Static301.aBoolean408) {
						try {
							Static356.method171(Static105.aClass15_2.anApplet1, "zap");
						} catch (@Pc(862) Throwable local862) {
						}
					} else {
						try {
							Static356.method171(Static105.aClass15_2.anApplet1, "unzap");
						} catch (@Pc(876) Throwable local876) {
						}
					}
					if (Static322.anInt6208 == 0) {
						try {
							Static356.method171(Static105.aClass15_2.anApplet1, "loggedin");
						} catch (@Pc(890) Throwable local890) {
						}
					}
					Static116.anInt2565 = Static30.aClass14_Sub4_Sub2_1.method2560();
					Static327.anInt6307 = Static30.aClass14_Sub4_Sub2_1.method2498();
					Static44.anInt1104 = 9;
				}
				if (Static44.anInt1104 == 9 && Static138.aClass159_3.method4083() >= Static327.anInt6307) {
					Static30.aClass14_Sub4_Sub2_1.anInt2637 = 0;
					Static138.aClass159_3.method4084(Static30.aClass14_Sub4_Sub2_1.aByteArray74, Static327.anInt6307, 0);
					Static44.anInt1104 = 0;
					Static276.anInt5254 = 2;
					Static121.method2580();
					Static217.anInt4356 = -1;
					Static328.method5649(false);
					Static116.anInt2565 = -1;
				}
			} else if (Static138.aClass159_3.method4083() >= 1) {
				Static2.anInt106 = Static138.aClass159_3.method4086();
				Static44.anInt1104 = 0;
				Static276.anInt5254 = 29;
				Static138.aClass159_3.method4079();
				Static138.aClass159_3 = null;
			}
		} catch (@Pc(937) IOException local937) {
			if (Static138.aClass159_3 != null) {
				Static138.aClass159_3.method4079();
				Static138.aClass159_3 = null;
			}
			if (Static156.anInt5903 < 1) {
				Static156.anInt5903++;
				Static44.anInt1104 = 1;
				if (Static109.anInt2429 == Static165.anInt5083) {
					Static109.anInt2429 = Static273.anInt5185;
				} else {
					Static109.anInt2429 = Static165.anInt5083;
				}
				Static313.anInt6042 = 0;
			} else {
				Static44.anInt1104 = 0;
				Static276.anInt5254 = -4;
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZI)Lclient!ag;")
	public static Class7 method4032(@OriginalArg(1) int arg0) {
		@Pc(5) Class11 local5 = Static189.aClass11_134;
		@Pc(14) Class7 local14;
		synchronized (Static189.aClass11_134) {
			local14 = (Class7) Static189.aClass11_134.method209((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(30) byte[] local30 = Static30.aClass143_19.method3745(16, arg0);
		local14 = new Class7();
		if (local30 != null) {
			local14.method133(new Class14_Sub4(local30));
		}
		@Pc(50) Class11 local50 = Static189.aClass11_134;
		synchronized (Static189.aClass11_134) {
			Static189.aClass11_134.method219((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(IIII)V")
	public static void method4033(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg2 * Static345.anInt6584 >> 8;
		if (local9 != 0 && arg0 != -1) {
			Static116.method2446(local9, arg0, Static69.aClass143_42);
			Static134.aBoolean192 = true;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II)V")
	public static void method4034(@OriginalArg(1) int arg0) {
		Static353.anIntArray644 = new int[arg0];
		Static63.anIntArray110 = new int[arg0];
		Static118.anIntArray230 = new int[arg0];
		Static167.anIntArray487 = new int[arg0];
		Static9.anIntArray12 = new int[arg0];
	}
}

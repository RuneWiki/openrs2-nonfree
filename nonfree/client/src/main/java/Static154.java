import java.io.IOException;
import java.math.BigInteger;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!sh", name = "qb", descriptor = "Lclient!bg;")
	public static Class11 aClass11_120;

	@OriginalMember(owner = "client!sh", name = "wb", descriptor = "Lclient!vg;")
	public static Class85 aClass85_13;

	@OriginalMember(owner = "client!sh", name = "xb", descriptor = "Lclient!oh;")
	public static Class11_Sub1 aClass11_Sub1_35;

	@OriginalMember(owner = "client!sh", name = "Bb", descriptor = "Lclient!df;")
	public static Class2_Sub2_Sub2_Sub2 aClass2_Sub2_Sub2_Sub2_4;

	@OriginalMember(owner = "client!sh", name = "gb", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!sh", name = "sb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1488 = Static32.method683("<)4col> x");

	@OriginalMember(owner = "client!sh", name = "ub", descriptor = "I")
	public static final int anInt3327 = 50;

	@OriginalMember(owner = "client!sh", name = "yb", descriptor = "I")
	public static int anInt3329 = 0;

	@OriginalMember(owner = "client!sh", name = "Ab", descriptor = "I")
	public static int anInt3331 = 0;

	@OriginalMember(owner = "client!sh", name = "Gb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1489 = Static32.method683("");

	@OriginalMember(owner = "client!sh", name = "Jb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1490 = aClass49_1489;

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(Z)V")
	public static void method2544() {
		try {
			if (Static30.anInt748 == 0) {
				if (Static51.aClass57_3 != null) {
					Static51.aClass57_3.method1892();
					Static51.aClass57_3 = null;
				}
				Static3.aBoolean4 = false;
				Static30.anInt748 = 1;
				Static19.aClass16_1 = null;
				Static42.anInt1028 = 0;
			}
			if (Static30.anInt748 == 1) {
				if (Static19.aClass16_1 == null) {
					Static19.aClass16_1 = Static45.aClass45_1.method1486(Static114.anInt2376, Static167.aString7);
				}
				if (Static19.aClass16_1.anInt749 == 2) {
					throw new IOException();
				}
				if (Static19.aClass16_1.anInt749 == 1) {
					Static51.aClass57_3 = new Class57((Socket) Static19.aClass16_1.anObject1, Static45.aClass45_1);
					Static19.aClass16_1 = null;
					Static30.anInt748 = 2;
				}
			}
			if (Static30.anInt748 == 2) {
				@Pc(70) long local70 = Static179.aLong155 = Static129.aClass49_1264.method1651();
				Static176.aClass2_Sub13_Sub1_14.anInt3940 = 0;
				@Pc(80) int local80 = (int) (local70 >> 16 & 0x1FL);
				Static176.aClass2_Sub13_Sub1_14.method2932(14);
				Static176.aClass2_Sub13_Sub1_14.method2932(local80);
				Static51.aClass57_3.method1885(2, Static176.aClass2_Sub13_Sub1_14.aByteArray49);
				Static30.anInt748 = 3;
				Static86.aClass2_Sub13_Sub1_13.anInt3940 = 0;
			}
			@Pc(119) int local119;
			if (Static30.anInt748 == 3) {
				if (Static146.aClass5_2 != null) {
					Static146.aClass5_2.method1786();
				}
				if (Static37.aClass5_1 != null) {
					Static37.aClass5_1.method1786();
				}
				local119 = Static51.aClass57_3.method1891();
				if (Static146.aClass5_2 != null) {
					Static146.aClass5_2.method1786();
				}
				if (Static37.aClass5_1 != null) {
					Static37.aClass5_1.method1786();
				}
				if (local119 != 0) {
					Static19.method368(local119);
					return;
				}
				Static86.aClass2_Sub13_Sub1_13.anInt3940 = 0;
				Static30.anInt748 = 4;
			}
			if (Static30.anInt748 == 4) {
				if (Static86.aClass2_Sub13_Sub1_13.anInt3940 < 8) {
					local119 = Static51.aClass57_3.method1884();
					if (8 - Static86.aClass2_Sub13_Sub1_13.anInt3940 < local119) {
						local119 = 8 - Static86.aClass2_Sub13_Sub1_13.anInt3940;
					}
					if (local119 > 0) {
						Static51.aClass57_3.method1883(local119, Static86.aClass2_Sub13_Sub1_13.aByteArray49, Static86.aClass2_Sub13_Sub1_13.anInt3940);
						Static86.aClass2_Sub13_Sub1_13.anInt3940 += local119;
					}
				}
				if (Static86.aClass2_Sub13_Sub1_13.anInt3940 == 8) {
					Static86.aClass2_Sub13_Sub1_13.anInt3940 = 0;
					Static86.aLong144 = Static86.aClass2_Sub13_Sub1_13.method2936();
					Static30.anInt748 = 5;
				}
			}
			if (Static30.anInt748 == 5) {
				Static176.aClass2_Sub13_Sub1_14.anInt3940 = 0;
				@Pc(212) int[] local212 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static86.aLong144 >> 32), (int) Static86.aLong144 };
				Static176.aClass2_Sub13_Sub1_14.method2932(10);
				Static176.aClass2_Sub13_Sub1_14.method2952(local212[0]);
				Static176.aClass2_Sub13_Sub1_14.method2952(local212[1]);
				Static176.aClass2_Sub13_Sub1_14.method2952(local212[2]);
				Static176.aClass2_Sub13_Sub1_14.method2952(local212[3]);
				Static176.aClass2_Sub13_Sub1_14.method2956(Static129.aClass49_1264.method1651());
				Static176.aClass2_Sub13_Sub1_14.method2949(Static129.aClass49_1276);
				Static176.aClass2_Sub13_Sub1_14.method2934(Static28.aBigInteger1, aBigInteger2);
				Static163.aClass2_Sub13_Sub1_5.anInt3940 = 0;
				if (Static95.anInt2009 == 40) {
					Static163.aClass2_Sub13_Sub1_5.method2932(18);
				} else {
					Static163.aClass2_Sub13_Sub1_5.method2932(16);
				}
				Static163.aClass2_Sub13_Sub1_5.method2932(Static176.aClass2_Sub13_Sub1_14.anInt3940 + 93);
				Static163.aClass2_Sub13_Sub1_5.method2952(484);
				Static163.aClass2_Sub13_Sub1_5.method2932(Static159.aBoolean148 ? 1 : 0);
				Static78.method1259(Static163.aClass2_Sub13_Sub1_5);
				Static163.aClass2_Sub13_Sub1_5.method2952(Static57.aClass11_Sub1_12.anInt2532);
				Static163.aClass2_Sub13_Sub1_5.method2952(Static42.aClass11_Sub1_8.anInt2532);
				Static163.aClass2_Sub13_Sub1_5.method2952(Static46.aClass11_Sub1_10.anInt2532);
				Static163.aClass2_Sub13_Sub1_5.method2952(Static53.aClass11_Sub1_11.anInt2532);
				Static163.aClass2_Sub13_Sub1_5.method2952(Static120.aClass11_Sub1_27.anInt2532);
				Static163.aClass2_Sub13_Sub1_5.method2952(Static151.aClass11_Sub1_34.anInt2532);
				Static163.aClass2_Sub13_Sub1_5.method2952(Static91.aClass11_Sub1_23.anInt2532);
				Static163.aClass2_Sub13_Sub1_5.method2952(aClass11_Sub1_35.anInt2532);
				Static163.aClass2_Sub13_Sub1_5.method2952(Static67.aClass11_Sub1_22.anInt2532);
				Static163.aClass2_Sub13_Sub1_5.method2952(Static117.aClass11_Sub1_24.anInt2532);
				Static163.aClass2_Sub13_Sub1_5.method2952(Static35.aClass11_Sub1_7.anInt2532);
				Static163.aClass2_Sub13_Sub1_5.method2952(Static86.aClass11_Sub1_37.anInt2532);
				Static163.aClass2_Sub13_Sub1_5.method2952(Static46.aClass11_Sub1_9.anInt2532);
				Static163.aClass2_Sub13_Sub1_5.method2952(Static62.aClass11_Sub1_19.anInt2532);
				Static163.aClass2_Sub13_Sub1_5.method2952(Static86.aClass11_Sub1_38.anInt2532);
				Static163.aClass2_Sub13_Sub1_5.method2952(Static123.aClass11_Sub1_33.anInt2532);
				Static163.aClass2_Sub13_Sub1_5.method2931(Static176.aClass2_Sub13_Sub1_14.anInt3940, Static176.aClass2_Sub13_Sub1_14.aByteArray49);
				Static51.aClass57_3.method1885(Static163.aClass2_Sub13_Sub1_5.anInt3940, Static163.aClass2_Sub13_Sub1_5.aByteArray49);
				Static176.aClass2_Sub13_Sub1_14.method2972(local212);
				for (@Pc(425) int local425 = 0; local425 < 4; local425++) {
					local212[local425] += 50;
				}
				Static86.aClass2_Sub13_Sub1_13.method2972(local212);
				Static30.anInt748 = 6;
			}
			if (Static30.anInt748 == 6 && Static51.aClass57_3.method1884() > 0) {
				local119 = Static51.aClass57_3.method1891();
				if (local119 == 21 && Static95.anInt2009 == 20) {
					Static30.anInt748 = 7;
				} else if (local119 == 2) {
					Static30.anInt748 = 9;
				} else if (local119 == 15 && Static95.anInt2009 == 40) {
					Static107.method1819();
					return;
				} else if (local119 == 23 && Static30.anInt742 < 1) {
					Static30.anInt742++;
					Static30.anInt748 = 0;
				} else {
					Static19.method368(local119);
					return;
				}
			}
			if (Static30.anInt748 == 7 && Static51.aClass57_3.method1884() > 0) {
				Static129.anInt2806 = Static51.aClass57_3.method1891() * 60 + 180;
				Static30.anInt748 = 8;
			}
			if (Static30.anInt748 == 8) {
				Static42.anInt1028 = 0;
				Static61.method1068(Static33.method692(new Class49[] { Static48.method882(Static129.anInt2806 / 60), Static99.aClass49_1008 }), Static175.aClass49_1705, Static168.aClass49_1643);
				if (--Static129.anInt2806 <= 0) {
					Static30.anInt748 = 0;
				}
			} else {
				if (Static30.anInt748 == 9 && Static51.aClass57_3.method1884() >= 9) {
					Static102.anInt2166 = Static51.aClass57_3.method1891();
					Static178.anInt3900 = Static51.aClass57_3.method1891();
					Static157.aBoolean146 = Static51.aClass57_3.method1891() == 1;
					Static54.anInt1191 = Static51.aClass57_3.method1891();
					Static54.anInt1191 <<= 0x8;
					Static54.anInt1191 += Static51.aClass57_3.method1891();
					Static78.anInt1632 = Static51.aClass57_3.method1891();
					Static51.aClass57_3.method1883(1, Static86.aClass2_Sub13_Sub1_13.aByteArray49, 0);
					Static86.aClass2_Sub13_Sub1_13.anInt3940 = 0;
					Static120.anInt2508 = Static86.aClass2_Sub13_Sub1_13.method2971();
					Static51.aClass57_3.method1883(2, Static86.aClass2_Sub13_Sub1_13.aByteArray49, 0);
					Static86.aClass2_Sub13_Sub1_13.anInt3940 = 0;
					Static180.anInt3988 = Static86.aClass2_Sub13_Sub1_13.method2933();
					Static30.anInt748 = 10;
				}
				if (Static30.anInt748 != 10) {
					Static42.anInt1028++;
					if (Static42.anInt1028 > 2000) {
						if (Static30.anInt742 < 1) {
							if (Static182.anInt4063 == Static114.anInt2376) {
								Static114.anInt2376 = Static58.anInt1235;
							} else {
								Static114.anInt2376 = Static182.anInt4063;
							}
							Static30.anInt742++;
							Static30.anInt748 = 0;
						} else {
							Static19.method368(-3);
						}
					}
				} else if (Static51.aClass57_3.method1884() >= Static180.anInt3988) {
					Static86.aClass2_Sub13_Sub1_13.anInt3940 = 0;
					Static51.aClass57_3.method1883(Static180.anInt3988, Static86.aClass2_Sub13_Sub1_13.aByteArray49, 0);
					Static78.method1257();
					Static94.anInt1979 = -1;
					Static85.method1440(false);
					Static120.anInt2508 = -1;
				}
			}
		} catch (@Pc(716) IOException local716) {
			if (Static30.anInt742 < 1) {
				Static30.anInt748 = 0;
				Static30.anInt742++;
				if (Static114.anInt2376 == Static182.anInt4063) {
					Static114.anInt2376 = Static58.anInt1235;
				} else {
					Static114.anInt2376 = Static182.anInt4063;
				}
			} else {
				Static19.method368(-2);
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "(B)V")
	public static void method2553() {
		aClass11_120 = null;
		aClass2_Sub2_Sub2_Sub2_4 = null;
		aClass85_13 = null;
		aClass49_1490 = null;
		aClass49_1488 = null;
		aClass49_1489 = null;
		aClass11_Sub1_35 = null;
		aBigInteger2 = null;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(JI)V")
	public static void method2556(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(9) InterruptedException local9) {
		}
	}
}

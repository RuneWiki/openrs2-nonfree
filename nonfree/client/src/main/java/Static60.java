import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "Lclient!be;")
	public static Class11_Sub1 aClass11_Sub1_11;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "[Lclient!bc;")
	public static Class10_Sub1_Sub1_Sub1[] aClass10_Sub1_Sub1_Sub1Array8;

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "[I")
	public static int[] anIntArray183;

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "Lclient!m;")
	public static Class10_Sub1_Sub1_Sub2 aClass10_Sub1_Sub1_Sub2_17;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "Lclient!va;")
	public static Class61 aClass61_666 = Static88.method1421("@gr2@");

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "Lclient!va;")
	private static Class61 aClass61_667 = Static88.method1421("Username: ");

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "Z")
	public static boolean aBoolean79 = false;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "Lclient!va;")
	private static Class61 aClass61_668 = Static88.method1421("Friends");

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "Lclient!va;")
	public static Class61 aClass61_669 = aClass61_668;

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "Lclient!va;")
	public static Class61 aClass61_670 = aClass61_667;

	@OriginalMember(owner = "client!mc", name = "s", descriptor = "Lclient!va;")
	public static Class61 aClass61_671 = Static88.method1421("scape main");

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)I")
	public static int method894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(25) int local25 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local25;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
	public static void method897() {
		aClass61_671 = null;
		aClass10_Sub1_Sub1_Sub2_17 = null;
		aClass11_Sub1_11 = null;
		anIntArray183 = null;
		aClass61_666 = null;
		aClass61_668 = null;
		aClass61_670 = null;
		aClass10_Sub1_Sub1_Sub1Array8 = null;
		aClass61_669 = null;
		aClass61_667 = null;
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V")
	public static void method898() {
		try {
			if (Static100.anInt2663 == 0) {
				Static32.aClass19_4 = null;
				Static99.aClass27_4 = null;
				Static100.anInt2663 = 1;
				aBoolean79 = false;
				Static67.anInt1779 = 0;
			}
			if (Static100.anInt2663 == 1) {
				if (Static32.aClass19_4 == null) {
					Static32.aClass19_4 = Static1.aClass55_1.method1407(Static94.anInt2426);
				}
				if (Static32.aClass19_4.anInt879 == 2) {
					throw new IOException();
				}
				if (Static32.aClass19_4.anInt879 == 1) {
					Static99.aClass27_4 = new Class27((Socket) Static32.aClass19_4.anObject2, Static1.aClass55_1);
					Static100.anInt2663 = 2;
					Static32.aClass19_4 = null;
				}
			}
			if (Static100.anInt2663 == 2) {
				@Pc(64) long local64 = Static46.aLong36 = Static15.aClass61_127.method1586();
				Static50.aClass10_Sub10_Sub1_3.anInt1957 = 0;
				Static50.aClass10_Sub10_Sub1_3.method1126(14);
				@Pc(78) int local78 = (int) (local64 >> 16 & 0x1FL);
				Static50.aClass10_Sub10_Sub1_3.method1126(local78);
				Static99.aClass27_4.method613(Static50.aClass10_Sub10_Sub1_3.aByteArray9, 2);
				Static100.anInt2663 = 3;
				Static55.aClass10_Sub10_Sub1_4.anInt1957 = 0;
			}
			@Pc(101) int local101;
			if (Static100.anInt2663 == 3) {
				local101 = Static99.aClass27_4.method612();
				if (local101 != 0) {
					Static88.method1422(local101);
					return;
				}
				Static100.anInt2663 = 4;
				Static55.aClass10_Sub10_Sub1_4.anInt1957 = 0;
			}
			if (Static100.anInt2663 == 4) {
				if (Static55.aClass10_Sub10_Sub1_4.anInt1957 < 8) {
					local101 = Static99.aClass27_4.method608();
					if (local101 > 8 - Static55.aClass10_Sub10_Sub1_4.anInt1957) {
						local101 = 8 - Static55.aClass10_Sub10_Sub1_4.anInt1957;
					}
					if (local101 > 0) {
						Static99.aClass27_4.method609(local101, Static55.aClass10_Sub10_Sub1_4.aByteArray9, Static55.aClass10_Sub10_Sub1_4.anInt1957);
						Static55.aClass10_Sub10_Sub1_4.anInt1957 += local101;
					}
				}
				if (Static55.aClass10_Sub10_Sub1_4.anInt1957 == 8) {
					Static55.aClass10_Sub10_Sub1_4.anInt1957 = 0;
					Static49.aLong39 = Static55.aClass10_Sub10_Sub1_4.method1144();
					Static100.anInt2663 = 5;
				}
			}
			if (Static100.anInt2663 == 5) {
				@Pc(180) int[] local180 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static49.aLong39 >> 32), (int) Static49.aLong39 };
				Static50.aClass10_Sub10_Sub1_3.anInt1957 = 0;
				Static50.aClass10_Sub10_Sub1_3.method1126(10);
				Static50.aClass10_Sub10_Sub1_3.method1157(local180[0]);
				Static50.aClass10_Sub10_Sub1_3.method1157(local180[1]);
				Static50.aClass10_Sub10_Sub1_3.method1157(local180[2]);
				Static50.aClass10_Sub10_Sub1_3.method1157(local180[3]);
				Static50.aClass10_Sub10_Sub1_3.method1157(Static1.aClass55_1.anInt2309);
				Static50.aClass10_Sub10_Sub1_3.method1125(Static15.aClass61_127.method1586());
				Static50.aClass10_Sub10_Sub1_3.method1116(Static15.aClass61_158);
				Static50.aClass10_Sub10_Sub1_3.method1148(Static27.aBigInteger1, Static82.aBigInteger2);
				Static42.aClass10_Sub10_Sub1_5.anInt1957 = 0;
				if (Static11.anInt319 == 40) {
					Static42.aClass10_Sub10_Sub1_5.method1126(18);
				} else {
					Static42.aClass10_Sub10_Sub1_5.method1126(16);
				}
				Static42.aClass10_Sub10_Sub1_5.method1126(Static50.aClass10_Sub10_Sub1_3.anInt1957 + 53);
				Static42.aClass10_Sub10_Sub1_5.method1157(414);
				Static42.aClass10_Sub10_Sub1_5.method1126(Static31.aBoolean43 ? 1 : 0);
				Static42.aClass10_Sub10_Sub1_5.method1157(Static50.aClass11_Sub1_9.anInt267);
				Static42.aClass10_Sub10_Sub1_5.method1157(Static9.aClass11_Sub1_1.anInt267);
				Static42.aClass10_Sub10_Sub1_5.method1157(Static27.aClass11_Sub1_5.anInt267);
				Static42.aClass10_Sub10_Sub1_5.method1157(Static35.aClass11_Sub1_7.anInt267);
				Static42.aClass10_Sub10_Sub1_5.method1157(Static103.aClass11_Sub1_6.anInt267);
				Static42.aClass10_Sub10_Sub1_5.method1157(Static57.aClass11_Sub1_10.anInt267);
				Static42.aClass10_Sub10_Sub1_5.method1157(Static106.aClass11_Sub1_16.anInt267);
				Static42.aClass10_Sub10_Sub1_5.method1157(Static104.aClass11_Sub1_14.anInt267);
				Static42.aClass10_Sub10_Sub1_5.method1157(aClass11_Sub1_11.anInt267);
				Static42.aClass10_Sub10_Sub1_5.method1157(Static22.aClass11_Sub1_4.anInt267);
				Static42.aClass10_Sub10_Sub1_5.method1157(Static106.aClass11_Sub1_15.anInt267);
				Static42.aClass10_Sub10_Sub1_5.method1157(Static99.aClass11_Sub1_13.anInt267);
				Static42.aClass10_Sub10_Sub1_5.method1158(Static50.aClass10_Sub10_Sub1_3.aByteArray9, Static50.aClass10_Sub10_Sub1_3.anInt1957);
				Static99.aClass27_4.method613(Static42.aClass10_Sub10_Sub1_5.aByteArray9, Static42.aClass10_Sub10_Sub1_5.anInt1957);
				Static50.aClass10_Sub10_Sub1_3.method1172(local180);
				for (@Pc(376) int local376 = 0; local376 < 4; local376++) {
					local180[local376] += 50;
				}
				Static55.aClass10_Sub10_Sub1_4.method1172(local180);
				Static100.anInt2663 = 6;
			}
			if (Static100.anInt2663 == 6 && Static99.aClass27_4.method608() > 0) {
				local101 = Static99.aClass27_4.method612();
				if (local101 == 21 && Static11.anInt319 == 20) {
					Static100.anInt2663 = 7;
				} else if (local101 == 2) {
					Static100.anInt2663 = 9;
				} else if (local101 == 15 && Static11.anInt319 == 40) {
					Static79.method1247();
					return;
				} else if (local101 == 23 && Static37.anInt1047 < 1) {
					Static37.anInt1047++;
					Static100.anInt2663 = 0;
				} else {
					Static88.method1422(local101);
					return;
				}
			}
			if (Static100.anInt2663 == 7 && Static99.aClass27_4.method608() > 0) {
				Static56.anInt1500 = (Static99.aClass27_4.method612() + 3) * 60;
				Static100.anInt2663 = 8;
			}
			if (Static100.anInt2663 == 8) {
				Static67.anInt1779 = 0;
				Static46.method735(Static93.method1156(new Class61[] { Static29.method529(Static56.anInt1500 / 60), Static66.aClass61_727 }), Static1.aClass61_2, Static80.aClass61_857);
				if (--Static56.anInt1500 <= 0) {
					Static100.anInt2663 = 0;
				}
			} else {
				if (Static100.anInt2663 == 9 && Static99.aClass27_4.method608() >= 8) {
					Static44.anInt1242 = Static99.aClass27_4.method612();
					Static49.aBoolean65 = Static99.aClass27_4.method612() == 1;
					Static83.anInt2226 = Static99.aClass27_4.method612();
					Static83.anInt2226 <<= 0x8;
					Static83.anInt2226 += Static99.aClass27_4.method612();
					Static70.anInt2675 = Static99.aClass27_4.method612();
					Static99.aClass27_4.method609(1, Static55.aClass10_Sub10_Sub1_4.aByteArray9, 0);
					Static55.aClass10_Sub10_Sub1_4.anInt1957 = 0;
					Static96.anInt2447 = Static55.aClass10_Sub10_Sub1_4.method1166();
					Static99.aClass27_4.method609(2, Static55.aClass10_Sub10_Sub1_4.aByteArray9, 0);
					Static55.aClass10_Sub10_Sub1_4.anInt1957 = 0;
					Static5.anInt34 = Static55.aClass10_Sub10_Sub1_4.method1160();
					Static100.anInt2663 = 10;
				}
				if (Static100.anInt2663 != 10) {
					Static67.anInt1779++;
					if (Static67.anInt1779 > 2000) {
						if (Static37.anInt1047 < 1) {
							Static37.anInt1047++;
							if (Static79.anInt2146 == Static94.anInt2426) {
								Static94.anInt2426 = Static20.anInt2656;
							} else {
								Static94.anInt2426 = Static79.anInt2146;
							}
							Static100.anInt2663 = 0;
						} else {
							Static88.method1422(-3);
						}
					}
				} else if (Static99.aClass27_4.method608() >= Static5.anInt34) {
					Static55.aClass10_Sub10_Sub1_4.anInt1957 = 0;
					Static99.aClass27_4.method609(Static5.anInt34, Static55.aClass10_Sub10_Sub1_4.aByteArray9, 0);
					Static28.method526();
					Static50.anInt1408 = -1;
					Static24.method1431(false);
					Static96.anInt2447 = -1;
				}
			}
		} catch (@Pc(660) IOException local660) {
			if (Static37.anInt1047 < 1) {
				if (Static94.anInt2426 == Static79.anInt2146) {
					Static94.anInt2426 = Static20.anInt2656;
				} else {
					Static94.anInt2426 = Static79.anInt2146;
				}
				Static100.anInt2663 = 0;
				Static37.anInt1047++;
			} else {
				Static88.method1422(-2);
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
	public static void method899() {
		Static101.aClass29_71.method646();
		Static27.aClass29_21.method646();
		Static71.aClass29_50.method646();
		Static62.aClass29_45.method646();
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(III)I")
	public static int method902(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(44) int local44 = Static100.method1658(arg1 + 45365, 4, arg0 + 91923) + (Static100.method1658(arg1 + 10294, 2, arg0 + 37821) - 128 >> 1) + (Static100.method1658(arg1, 1, arg0) + -128 >> 2) - 128;
		local44 = (int) ((double) local44 * 0.3D) + 35;
		if (local44 < 10) {
			local44 = 10;
		} else if (local44 > 60) {
			local44 = 60;
		}
		return local44;
	}
}

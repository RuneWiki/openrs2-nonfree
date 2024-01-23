import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
	public static int anInt51;

	@OriginalMember(owner = "client!ab", name = "s", descriptor = "Lclient!vf;")
	public static Class1_Sub1_Sub14_Sub1_Sub1 aClass1_Sub1_Sub14_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ab", name = "x", descriptor = "Lclient!s;")
	public static Class88 aClass88_1;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "Lclient!kh;")
	public static Class60 aClass60_30 = Static200.method3116("<br>(X");

	@OriginalMember(owner = "client!ab", name = "B", descriptor = "Lclient!eh;")
	public static Class27 aClass27_4 = new Class27(50);

	@OriginalMember(owner = "client!ab", name = "C", descriptor = "I")
	public static int anInt67 = -1;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BIIIII)V")
	public static void method45(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(3) int local3 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(13) int local13 = arg0 * arg0;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = local13 << 1;
		@Pc(25) int local25 = local17 << 1;
		@Pc(29) int local29 = arg1 << 1;
		@Pc(37) int local37 = local25 + (1 - local29) * local13;
		@Pc(41) int local41 = local13 << 2;
		@Pc(50) int local50 = local17 - local21 * (local29 - 1);
		@Pc(59) int local59 = local17 << 2;
		@Pc(67) int local67 = local25 * 3;
		@Pc(75) int local75 = local21 * ((arg1 << 1) - 3);
		@Pc(81) int local81 = local59;
		@Pc(95) int local95;
		@Pc(105) int local105;
		if (Static141.anInt3163 <= arg4 && arg4 <= Static200.anInt4273) {
			local95 = Static107.method1863(Static214.anInt4572, arg0 + arg3, Static130.anInt2847);
			local105 = Static107.method1863(Static214.anInt4572, arg3 - arg0, Static130.anInt2847);
			Static104.method1768(local105, local95, arg2, Static148.anIntArrayArray78[arg4]);
		}
		@Pc(119) int local119 = local41 * (arg1 - 1);
		while (local9 > 0) {
			if (local37 < 0) {
				while (local37 < 0) {
					local37 += local67;
					local50 += local81;
					local3++;
					local67 += local59;
					local81 += local59;
				}
			}
			local9--;
			local95 = arg4 - local9;
			if (local50 < 0) {
				local37 += local67;
				local67 += local59;
				local3++;
				local50 += local81;
				local81 += local59;
			}
			local50 += -local75;
			local105 = arg4 + local9;
			local75 -= local41;
			local37 += -local119;
			local119 -= local41;
			if (local105 >= Static141.anInt3163 && local95 <= Static200.anInt4273) {
				@Pc(216) int local216 = Static107.method1863(Static214.anInt4572, arg3 + local3, Static130.anInt2847);
				@Pc(225) int local225 = Static107.method1863(Static214.anInt4572, arg3 - local3, Static130.anInt2847);
				if (local95 >= Static141.anInt3163) {
					Static104.method1768(local225, local216, arg2, Static148.anIntArrayArray78[local95]);
				}
				if (Static200.anInt4273 >= local105) {
					Static104.method1768(local225, local216, arg2, Static148.anIntArrayArray78[local105]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)V")
	public static void method50() {
		try {
			if (Static113.anInt2595 == 0) {
				if (Static184.aClass55_3 != null) {
					Static184.aClass55_3.method1754();
					Static184.aClass55_3 = null;
				}
				Static204.anInt4324 = 0;
				Static207.aBoolean246 = false;
				Static113.anInt2595 = 1;
				Static25.aClass36_1 = null;
			}
			if (Static113.anInt2595 == 1) {
				if (Static25.aClass36_1 == null) {
					Static25.aClass36_1 = Static116.aClass65_4.method2009(Static40.anInt898, Static178.aString6);
				}
				if (Static25.aClass36_1.anInt1500 == 2) {
					throw new IOException();
				}
				if (Static25.aClass36_1.anInt1500 == 1) {
					Static184.aClass55_3 = new Class55((Socket) Static25.aClass36_1.anObject2, Static116.aClass65_4);
					Static113.anInt2595 = 2;
					Static25.aClass36_1 = null;
				}
			}
			if (Static113.anInt2595 == 2) {
				@Pc(74) long local74 = Static197.aLong133 = Static12.aClass60_95.method1829();
				@Pc(81) int local81 = (int) (local74 >> 16 & 0x1FL);
				Static96.aClass1_Sub9_Sub1_3.anInt1192 = 0;
				Static96.aClass1_Sub9_Sub1_3.method899(14);
				Static96.aClass1_Sub9_Sub1_3.method899(local81);
				Static184.aClass55_3.method1756(Static96.aClass1_Sub9_Sub1_3.aByteArray20, 2);
				Static16.aClass1_Sub9_Sub1_1.anInt1192 = 0;
				Static113.anInt2595 = 3;
			}
			@Pc(121) int local121;
			if (Static113.anInt2595 == 3) {
				if (Static77.aClass15_1 != null) {
					Static77.aClass15_1.method1988();
				}
				if (Static205.aClass15_2 != null) {
					Static205.aClass15_2.method1988();
				}
				local121 = Static184.aClass55_3.method1753();
				if (Static77.aClass15_1 != null) {
					Static77.aClass15_1.method1988();
				}
				if (Static205.aClass15_2 != null) {
					Static205.aClass15_2.method1988();
				}
				if (local121 != 0) {
					Static26.method434(local121);
					return;
				}
				Static16.aClass1_Sub9_Sub1_1.anInt1192 = 0;
				Static113.anInt2595 = 4;
			}
			if (Static113.anInt2595 == 4) {
				if (Static16.aClass1_Sub9_Sub1_1.anInt1192 < 8) {
					local121 = Static184.aClass55_3.method1757();
					if (local121 > 8 - Static16.aClass1_Sub9_Sub1_1.anInt1192) {
						local121 = 8 - Static16.aClass1_Sub9_Sub1_1.anInt1192;
					}
					if (local121 > 0) {
						Static184.aClass55_3.method1759(local121, Static16.aClass1_Sub9_Sub1_1.anInt1192, Static16.aClass1_Sub9_Sub1_1.aByteArray20);
						Static16.aClass1_Sub9_Sub1_1.anInt1192 += local121;
					}
				}
				if (Static16.aClass1_Sub9_Sub1_1.anInt1192 == 8) {
					Static16.aClass1_Sub9_Sub1_1.anInt1192 = 0;
					Static51.aLong42 = Static16.aClass1_Sub9_Sub1_1.method909();
					Static113.anInt2595 = 5;
				}
			}
			if (Static113.anInt2595 == 5) {
				Static96.aClass1_Sub9_Sub1_3.anInt1192 = 0;
				@Pc(215) int[] local215 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static51.aLong42 >> 32), (int) Static51.aLong42 };
				Static96.aClass1_Sub9_Sub1_3.method899(10);
				Static96.aClass1_Sub9_Sub1_3.method921(local215[0]);
				Static96.aClass1_Sub9_Sub1_3.method921(local215[1]);
				Static96.aClass1_Sub9_Sub1_3.method921(local215[2]);
				Static96.aClass1_Sub9_Sub1_3.method921(local215[3]);
				Static96.aClass1_Sub9_Sub1_3.method897(Static12.aClass60_95.method1829());
				Static96.aClass1_Sub9_Sub1_3.method924(Static12.aClass60_94);
				Static96.aClass1_Sub9_Sub1_3.method925(Static12.aBigInteger1, Static49.aBigInteger2);
				Static95.aClass1_Sub9_Sub1_4.anInt1192 = 0;
				if (Static134.anInt2902 == 40) {
					Static95.aClass1_Sub9_Sub1_4.method899(18);
				} else {
					Static95.aClass1_Sub9_Sub1_4.method899(16);
				}
				Static95.aClass1_Sub9_Sub1_4.method899(Static96.aClass1_Sub9_Sub1_3.anInt1192 + Static177.method2834(Static4.aClass60_42) + 141);
				Static95.aClass1_Sub9_Sub1_4.method921(499);
				Static95.aClass1_Sub9_Sub1_4.method899(Static148.aBoolean266 ? 1 : 0);
				Static29.method540(Static95.aClass1_Sub9_Sub1_4);
				Static95.aClass1_Sub9_Sub1_4.method924(Static4.aClass60_42);
				Static95.aClass1_Sub9_Sub1_4.method921(Static162.anInt4652);
				Static95.aClass1_Sub9_Sub1_4.method921(Static72.aClass7_Sub1_16.anInt4403);
				Static95.aClass1_Sub9_Sub1_4.method921(Static195.aClass7_Sub1_29.anInt4403);
				Static95.aClass1_Sub9_Sub1_4.method921(Static84.aClass7_Sub1_8.anInt4403);
				Static95.aClass1_Sub9_Sub1_4.method921(Static62.aClass7_Sub1_10.anInt4403);
				Static95.aClass1_Sub9_Sub1_4.method921(Static193.aClass7_Sub1_28.anInt4403);
				Static95.aClass1_Sub9_Sub1_4.method921(Static71.aClass7_Sub1_15.anInt4403);
				Static95.aClass1_Sub9_Sub1_4.method921(Static106.aClass7_Sub1_19.anInt4403);
				Static95.aClass1_Sub9_Sub1_4.method921(Static71.aClass7_Sub1_14.anInt4403);
				Static95.aClass1_Sub9_Sub1_4.method921(Static152.aClass7_Sub1_23.anInt4403);
				Static95.aClass1_Sub9_Sub1_4.method921(Static56.aClass7_Sub1_9.anInt4403);
				Static95.aClass1_Sub9_Sub1_4.method921(Static5.aClass7_Sub1_2.anInt4403);
				Static95.aClass1_Sub9_Sub1_4.method921(Static4.aClass7_Sub1_1.anInt4403);
				Static95.aClass1_Sub9_Sub1_4.method921(Static21.aClass7_Sub1_3.anInt4403);
				Static95.aClass1_Sub9_Sub1_4.method921(Static125.aClass7_Sub1_20.anInt4403);
				Static95.aClass1_Sub9_Sub1_4.method921(Static21.aClass7_Sub1_4.anInt4403);
				Static95.aClass1_Sub9_Sub1_4.method921(Static71.aClass7_Sub1_13.anInt4403);
				Static95.aClass1_Sub9_Sub1_4.method921(Static192.aClass7_Sub1_27.anInt4403);
				Static95.aClass1_Sub9_Sub1_4.method921(Static64.aClass7_Sub1_11.anInt4403);
				Static95.aClass1_Sub9_Sub1_4.method921(Static151.aClass7_Sub1_22.anInt4403);
				Static95.aClass1_Sub9_Sub1_4.method921(Static103.aClass7_Sub1_18.anInt4403);
				Static95.aClass1_Sub9_Sub1_4.method921(Static94.aClass7_Sub1_17.anInt4403);
				Static95.aClass1_Sub9_Sub1_4.method921(Static26.aClass7_Sub1_5.anInt4403);
				Static95.aClass1_Sub9_Sub1_4.method921(Static66.aClass7_Sub1_12.anInt4403);
				Static95.aClass1_Sub9_Sub1_4.method921(Static198.aClass7_Sub1_30.anInt4403);
				Static95.aClass1_Sub9_Sub1_4.method921(Static159.aClass7_Sub1_25.anInt4403);
				Static95.aClass1_Sub9_Sub1_4.method921(Static155.aClass7_Sub1_24.anInt4403);
				Static95.aClass1_Sub9_Sub1_4.method921(Static29.aClass7_Sub1_6.anInt4403);
				Static95.aClass1_Sub9_Sub1_4.method944(Static96.aClass1_Sub9_Sub1_3.anInt1192, Static96.aClass1_Sub9_Sub1_3.aByteArray20);
				Static184.aClass55_3.method1756(Static95.aClass1_Sub9_Sub1_4.aByteArray20, Static95.aClass1_Sub9_Sub1_4.anInt1192);
				Static96.aClass1_Sub9_Sub1_3.method955(local215);
				for (@Pc(491) int local491 = 0; local491 < 4; local491++) {
					local215[local491] += 50;
				}
				Static16.aClass1_Sub9_Sub1_1.method955(local215);
				Static113.anInt2595 = 6;
			}
			if (Static113.anInt2595 == 6 && Static184.aClass55_3.method1757() > 0) {
				local121 = Static184.aClass55_3.method1753();
				if (local121 == 21 && Static134.anInt2902 == 20) {
					Static113.anInt2595 = 7;
				} else if (local121 == 2) {
					Static113.anInt2595 = 9;
				} else if (local121 == 15 && Static134.anInt2902 == 40) {
					Static178.method2847();
					return;
				} else if (local121 == 23 && Static104.anInt2370 < 1) {
					Static113.anInt2595 = 0;
					Static104.anInt2370++;
				} else {
					Static26.method434(local121);
					return;
				}
			}
			if (Static113.anInt2595 == 7 && Static184.aClass55_3.method1757() > 0) {
				Static74.anInt1820 = Static184.aClass55_3.method1753() * 60 + 180;
				Static113.anInt2595 = 8;
			}
			if (Static113.anInt2595 == 8) {
				Static204.anInt4324 = 0;
				Static141.method2417(Static211.aClass60_1196, Static159.aClass60_1221, Static34.method611(new Class60[] { Static40.method681(Static74.anInt1820 / 60), Static44.aClass60_334 }));
				if (--Static74.anInt1820 <= 0) {
					Static113.anInt2595 = 0;
				}
			} else {
				if (Static113.anInt2595 == 9 && Static184.aClass55_3.method1757() >= 9) {
					Static152.anInt3414 = Static184.aClass55_3.method1753();
					Static139.anInt3109 = Static184.aClass55_3.method1753();
					Static175.anInt3770 = Static184.aClass55_3.method1753();
					if (Static175.anInt3770 == 1) {
						try {
							Static70.aClass60_547.method1803(Static116.aClass65_4.anApplet1);
						} catch (@Pc(667) Throwable local667) {
						}
					} else {
						try {
							Static182.aClass60_1313.method1803(Static116.aClass65_4.anApplet1);
						} catch (@Pc(677) Throwable local677) {
						}
					}
					Static60.anInt1524 = Static184.aClass55_3.method1753();
					Static56.aBoolean75 = Static184.aClass55_3.method1753() == 1;
					Static65.anInt1615 = Static184.aClass55_3.method1753();
					Static65.anInt1615 <<= 0x8;
					Static65.anInt1615 += Static184.aClass55_3.method1753();
					Static173.anInt3728 = Static184.aClass55_3.method1753();
					Static184.aClass55_3.method1759(1, 0, Static16.aClass1_Sub9_Sub1_1.aByteArray20);
					Static16.aClass1_Sub9_Sub1_1.anInt1192 = 0;
					Static172.anInt3718 = Static16.aClass1_Sub9_Sub1_1.method957();
					Static184.aClass55_3.method1759(2, 0, Static16.aClass1_Sub9_Sub1_1.aByteArray20);
					Static16.aClass1_Sub9_Sub1_1.anInt1192 = 0;
					Static27.anInt644 = Static16.aClass1_Sub9_Sub1_1.method946();
					Static113.anInt2595 = 10;
				}
				if (Static113.anInt2595 != 10) {
					Static204.anInt4324++;
					if (Static204.anInt4324 > 2000) {
						if (Static104.anInt2370 < 1) {
							Static113.anInt2595 = 0;
							Static104.anInt2370++;
							if (Static34.anInt831 == Static40.anInt898) {
								Static40.anInt898 = Static162.anInt4654;
							} else {
								Static40.anInt898 = Static34.anInt831;
							}
						} else {
							Static26.method434(-3);
						}
					}
				} else if (Static184.aClass55_3.method1757() >= Static27.anInt644) {
					Static16.aClass1_Sub9_Sub1_1.anInt1192 = 0;
					Static184.aClass55_3.method1759(Static27.anInt644, 0, Static16.aClass1_Sub9_Sub1_1.aByteArray20);
					Static18.method329();
					Static134.anInt2900 = -1;
					Static110.method1905(false);
					Static172.anInt3718 = -1;
				}
			}
		} catch (@Pc(797) IOException local797) {
			if (Static104.anInt2370 < 1) {
				if (Static40.anInt898 == Static34.anInt831) {
					Static40.anInt898 = Static162.anInt4654;
				} else {
					Static40.anInt898 = Static34.anInt831;
				}
				Static113.anInt2595 = 0;
				Static104.anInt2370++;
			} else {
				Static26.method434(-2);
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(III)V")
	public static void method51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static71.aBoolean92 = true;
		Static162.anInt4653 = arg0;
		Static24.anInt573 = arg1;
		Static86.anInt1997 = arg2;
		anInt67 = -1;
		Static194.anInt4139 = -1;
	}
}

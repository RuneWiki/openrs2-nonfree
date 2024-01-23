import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
	public static int anInt5459;

	@OriginalMember(owner = "client!rj", name = "S", descriptor = "I")
	public static volatile int anInt5467 = 0;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!mn;IZI)V")
	public static void method4361(@OriginalArg(0) Class115 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aByte18 == 0) {
			arg0.anInt3556 = arg0.anInt3501;
		} else if (arg0.aByte18 == 1) {
			arg0.anInt3556 = arg0.anInt3501 + (arg1 - arg0.anInt3555) / 2;
		} else if (arg0.aByte18 == 2) {
			arg0.anInt3556 = arg1 - arg0.anInt3501 - arg0.anInt3555;
		} else if (arg0.aByte18 == 3) {
			arg0.anInt3556 = arg0.anInt3501 * arg1 >> 14;
		} else if (arg0.aByte18 == 4) {
			arg0.anInt3556 = (arg1 * arg0.anInt3501 >> 14) + (arg1 - arg0.anInt3555) / 2;
		} else {
			arg0.anInt3556 = arg1 - arg0.anInt3555 - (arg0.anInt3501 * arg1 >> 14);
		}
		if (arg0.aByte15 == 0) {
			arg0.anInt3536 = arg0.anInt3519;
		} else if (arg0.aByte15 == 1) {
			arg0.anInt3536 = arg0.anInt3519 + (arg2 - arg0.anInt3487) / 2;
		} else if (arg0.aByte15 == 2) {
			arg0.anInt3536 = arg2 - arg0.anInt3519 - arg0.anInt3487;
		} else if (arg0.aByte15 == 3) {
			arg0.anInt3536 = arg0.anInt3519 * arg2 >> 14;
		} else if (arg0.aByte15 == 4) {
			arg0.anInt3536 = (arg2 - arg0.anInt3487) / 2 + (arg0.anInt3519 * arg2 >> 14);
		} else {
			arg0.anInt3536 = arg2 - (arg0.anInt3519 * arg2 >> 14) - arg0.anInt3487;
		}
		if (!Static202.aBoolean348 || Static35.method708(arg0).anInt1534 == 0 && arg0.anInt3538 != 0) {
			return;
		}
		if (arg0.anInt3536 < 0) {
			arg0.anInt3536 = 0;
		} else if (arg0.anInt3487 + arg0.anInt3536 > arg2) {
			arg0.anInt3536 = arg2 - arg0.anInt3487;
		}
		if (arg0.anInt3556 < 0) {
			arg0.anInt3556 = 0;
		} else if (arg1 < arg0.anInt3556 + arg0.anInt3555) {
			arg0.anInt3556 = arg1 - arg0.anInt3555;
		}
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)V")
	public static void method4364() {
		Static221.aClass1_18 = new Class1();
	}

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "(B)Lclient!af;")
	public static Class2_Sub3_Sub1_Sub1 method4366() {
		@Pc(9) byte[] local9 = Static273.aByteArrayArray115[0];
		@Pc(17) int local17 = Static19.anIntArray30[0] * Static30.anIntArray46[0];
		@Pc(29) int[] local29 = new int[local17];
		for (@Pc(31) int local31 = 0; local31 < local17; local31++) {
			local29[local31] = Static187.anIntArray314[local9[local31] & 0xFF];
		}
		@Pc(70) Class2_Sub3_Sub1_Sub1 local70 = new Class2_Sub3_Sub1_Sub1(Static148.anInt3175, Static260.anInt5414, Static262.anIntArray528[0], Static40.anIntArray59[0], Static30.anIntArray46[0], Static19.anIntArray30[0], local29);
		Static171.method2953();
		return local70;
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(Z)V")
	public static void method4370() {
		if (Static91.anInt2032 == 0 || Static91.anInt2032 == 5) {
			return;
		}
		try {
			if (++Static44.anInt1071 > 2000) {
				if (Static42.aClass45_1 != null) {
					Static42.aClass45_1.method1045();
					Static42.aClass45_1 = null;
				}
				if (Static195.anInt4050 >= 1) {
					Static231.anInt4770 = -5;
					Static91.anInt2032 = 0;
					return;
				}
				Static91.anInt2032 = 1;
				Static195.anInt4050++;
				if (Static139.anInt3001 == Static205.anInt4279) {
					Static205.anInt4279 = Static2.anInt5943;
				} else {
					Static205.anInt4279 = Static139.anInt3001;
				}
				Static44.anInt1071 = 0;
			}
			if (Static91.anInt2032 == 1) {
				Static23.aClass28_1 = Static299.aClass177_5.method4686(Static205.anInt4279, Static186.aString197);
				Static91.anInt2032 = 2;
			}
			if (Static91.anInt2032 == 2) {
				if (Static23.aClass28_1.anInt726 == 2) {
					throw new IOException();
				}
				if (Static23.aClass28_1.anInt726 != 1) {
					return;
				}
				Static42.aClass45_1 = new Class45((Socket) Static23.aClass28_1.anObject2, Static299.aClass177_5);
				Static23.aClass28_1 = null;
				@Pc(105) long local105 = Static88.aLong249 = Static61.method2447(Static16.aString24);
				Static95.aClass2_Sub26_Sub1_1.anInt5328 = 0;
				@Pc(115) int local115 = (int) (local105 >> 16 & 0x1FL);
				Static95.aClass2_Sub26_Sub1_1.method4239(14);
				Static95.aClass2_Sub26_Sub1_1.method4239(local115);
				Static42.aClass45_1.method1043(2, Static95.aClass2_Sub26_Sub1_1.aByteArray72);
				if (Static107.aClass3_2 != null) {
					Static107.aClass3_2.method2229();
				}
				if (Static68.aClass3_1 != null) {
					Static68.aClass3_1.method2229();
				}
				@Pc(145) int local145 = Static42.aClass45_1.method1047();
				if (Static107.aClass3_2 != null) {
					Static107.aClass3_2.method2229();
				}
				if (Static68.aClass3_1 != null) {
					Static68.aClass3_1.method2229();
				}
				if (local145 != 0) {
					Static91.anInt2032 = 0;
					Static231.anInt4770 = local145;
					Static42.aClass45_1.method1045();
					Static42.aClass45_1 = null;
					return;
				}
				Static91.anInt2032 = 3;
			}
			if (Static91.anInt2032 == 3) {
				if (Static42.aClass45_1.method1040() < 8) {
					return;
				}
				Static42.aClass45_1.method1048(8, 0, Static250.aClass2_Sub26_Sub1_2.aByteArray72);
				@Pc(193) int[] local193 = new int[4];
				Static250.aClass2_Sub26_Sub1_2.anInt5328 = 0;
				Static154.aLong161 = Static250.aClass2_Sub26_Sub1_2.method4264();
				local193[3] = (int) Static154.aLong161;
				Static95.aClass2_Sub26_Sub1_1.anInt5328 = 0;
				local193[2] = (int) (Static154.aLong161 >> 32);
				local193[0] = (int) (Math.random() * 9.9999999E7D);
				local193[1] = (int) (Math.random() * 9.9999999E7D);
				Static95.aClass2_Sub26_Sub1_1.method4239(10);
				Static95.aClass2_Sub26_Sub1_1.method4260(local193[0]);
				Static95.aClass2_Sub26_Sub1_1.method4260(local193[1]);
				Static95.aClass2_Sub26_Sub1_1.method4260(local193[2]);
				Static95.aClass2_Sub26_Sub1_1.method4260(local193[3]);
				Static95.aClass2_Sub26_Sub1_1.method4225(Static61.method2447(Static16.aString24));
				Static95.aClass2_Sub26_Sub1_1.method4253(Static106.aString119);
				Static95.aClass2_Sub26_Sub1_1.method4268(Static248.aBigInteger3, Static125.aBigInteger4);
				Static263.aClass2_Sub26_Sub1_4.anInt5328 = 0;
				if (Static236.anInt4804 == 40) {
					Static263.aClass2_Sub26_Sub1_4.method4239(18);
				} else {
					Static263.aClass2_Sub26_Sub1_4.method4239(16);
				}
				Static263.aClass2_Sub26_Sub1_4.method4231(Static95.aClass2_Sub26_Sub1_1.anInt5328 + Static66.method1280(Static16.aString23) + 163);
				Static263.aClass2_Sub26_Sub1_4.method4260(543);
				Static263.aClass2_Sub26_Sub1_4.method4239(Static207.anInt4318);
				Static263.aClass2_Sub26_Sub1_4.method4239(Static295.aBoolean487 ? 1 : 0);
				Static263.aClass2_Sub26_Sub1_4.method4239(1);
				Static263.aClass2_Sub26_Sub1_4.method4239(Static293.method4858());
				Static263.aClass2_Sub26_Sub1_4.method4231(Static257.anInt5343);
				Static263.aClass2_Sub26_Sub1_4.method4231(Static20.anInt1235);
				Static263.aClass2_Sub26_Sub1_4.method4239(Static287.anInt5952);
				Static87.method1631(Static263.aClass2_Sub26_Sub1_4);
				Static263.aClass2_Sub26_Sub1_4.method4253(Static16.aString23);
				Static263.aClass2_Sub26_Sub1_4.method4260(Static136.anInt2976);
				Static263.aClass2_Sub26_Sub1_4.method4260(Static198.method3357());
				Static278.aBoolean468 = true;
				Static263.aClass2_Sub26_Sub1_4.method4231(Static65.anInt1459);
				Static263.aClass2_Sub26_Sub1_4.method4260(Static294.aClass84_132.method2140());
				Static263.aClass2_Sub26_Sub1_4.method4260(Static150.aClass84_60.method2140());
				Static263.aClass2_Sub26_Sub1_4.method4260(Static73.aClass84_32.method2140());
				Static263.aClass2_Sub26_Sub1_4.method4260(Static88.aClass84_103.method2140());
				Static263.aClass2_Sub26_Sub1_4.method4260(Static115.aClass84_50.method2140());
				Static263.aClass2_Sub26_Sub1_4.method4260(Static11.aClass84_8.method2140());
				Static263.aClass2_Sub26_Sub1_4.method4260(Static152.aClass84_61.method2140());
				Static263.aClass2_Sub26_Sub1_4.method4260(Static233.aClass84_105.method2140());
				Static263.aClass2_Sub26_Sub1_4.method4260(Static201.aClass84_85.method2140());
				Static263.aClass2_Sub26_Sub1_4.method4260(Static227.aClass84_104.method2140());
				Static263.aClass2_Sub26_Sub1_4.method4260(Static42.aClass84_20.method2140());
				Static263.aClass2_Sub26_Sub1_4.method4260(Static233.aClass84_106.method2140());
				Static263.aClass2_Sub26_Sub1_4.method4260(Static171.aClass84_68.method2140());
				Static263.aClass2_Sub26_Sub1_4.method4260(Static107.aClass84_46.method2140());
				Static263.aClass2_Sub26_Sub1_4.method4260(Static63.aClass84_29.method2140());
				Static263.aClass2_Sub26_Sub1_4.method4260(Static75.aClass84_33.method2140());
				Static263.aClass2_Sub26_Sub1_4.method4260(Static291.aClass84_130.method2140());
				Static263.aClass2_Sub26_Sub1_4.method4260(Static101.aClass84_128.method2140());
				Static263.aClass2_Sub26_Sub1_4.method4260(Static42.aClass84_19.method2140());
				Static263.aClass2_Sub26_Sub1_4.method4260(Static197.aClass84_83.method2140());
				Static263.aClass2_Sub26_Sub1_4.method4260(Static174.aClass84_72.method2140());
				Static263.aClass2_Sub26_Sub1_4.method4260(Static140.aClass84_57.method2140());
				Static263.aClass2_Sub26_Sub1_4.method4260(Static172.aClass84_69.method2140());
				Static263.aClass2_Sub26_Sub1_4.method4260(Static164.aClass84_65.method2140());
				Static263.aClass2_Sub26_Sub1_4.method4260(Static180.aClass84_75.method2140());
				Static263.aClass2_Sub26_Sub1_4.method4260(Static270.aClass84_114.method2140());
				Static263.aClass2_Sub26_Sub1_4.method4260(Static15.aClass84_9.method2140());
				Static263.aClass2_Sub26_Sub1_4.method4260(Static136.aClass84_55.method2140());
				Static263.aClass2_Sub26_Sub1_4.method4260(Static159.aClass84_64.method2140());
				Static263.aClass2_Sub26_Sub1_4.method4246(Static95.aClass2_Sub26_Sub1_1.aByteArray72, Static95.aClass2_Sub26_Sub1_1.anInt5328);
				Static42.aClass45_1.method1043(Static263.aClass2_Sub26_Sub1_4.anInt5328, Static263.aClass2_Sub26_Sub1_4.aByteArray72);
				Static95.aClass2_Sub26_Sub1_1.method4283(local193);
				for (@Pc(561) int local561 = 0; local561 < 4; local561++) {
					local193[local561] += 50;
				}
				Static250.aClass2_Sub26_Sub1_2.method4283(local193);
				Static91.anInt2032 = 4;
			}
			if (Static91.anInt2032 == 4) {
				if (Static42.aClass45_1.method1040() < 1) {
					return;
				}
				@Pc(595) int local595 = Static42.aClass45_1.method1047();
				if (local595 == 21) {
					Static91.anInt2032 = 7;
				} else if (local595 == 29) {
					Static91.anInt2032 = 10;
				} else if (local595 == 1) {
					Static231.anInt4770 = local595;
					Static91.anInt2032 = 5;
					return;
				} else if (local595 == 2) {
					Static91.anInt2032 = 8;
				} else if (local595 == 15) {
					Static91.anInt2032 = 0;
					Static231.anInt4770 = local595;
					return;
				} else if (local595 == 23 && Static195.anInt4050 < 1) {
					Static91.anInt2032 = 1;
					Static44.anInt1071 = 0;
					Static195.anInt4050++;
					Static42.aClass45_1.method1045();
					Static42.aClass45_1 = null;
					return;
				} else {
					Static231.anInt4770 = local595;
					Static91.anInt2032 = 0;
					Static42.aClass45_1.method1045();
					Static42.aClass45_1 = null;
					return;
				}
			}
			if (Static91.anInt2032 == 6) {
				Static95.aClass2_Sub26_Sub1_1.anInt5328 = 0;
				Static95.aClass2_Sub26_Sub1_1.method4287(17);
				Static42.aClass45_1.method1043(Static95.aClass2_Sub26_Sub1_1.anInt5328, Static95.aClass2_Sub26_Sub1_1.aByteArray72);
				Static91.anInt2032 = 4;
				return;
			}
			if (Static91.anInt2032 == 7) {
				if (Static42.aClass45_1.method1040() < 1) {
					return;
				}
				Static10.anInt280 = (Static42.aClass45_1.method1047() + 3) * 60;
				Static91.anInt2032 = 0;
				Static231.anInt4770 = 21;
				Static42.aClass45_1.method1045();
				Static42.aClass45_1 = null;
				return;
			}
			if (Static91.anInt2032 == 10) {
				if (Static42.aClass45_1.method1040() < 1) {
					return;
				}
				Static115.anInt2459 = Static42.aClass45_1.method1047();
				Static231.anInt4770 = 29;
				Static91.anInt2032 = 0;
				Static42.aClass45_1.method1045();
				Static42.aClass45_1 = null;
				return;
			}
			if (Static91.anInt2032 == 8) {
				if (Static42.aClass45_1.method1040() < 14) {
					return;
				}
				Static42.aClass45_1.method1048(14, 0, Static250.aClass2_Sub26_Sub1_2.aByteArray72);
				Static250.aClass2_Sub26_Sub1_2.anInt5328 = 0;
				Static189.anInt3958 = Static250.aClass2_Sub26_Sub1_2.method4261();
				Static173.anInt3682 = Static250.aClass2_Sub26_Sub1_2.method4261();
				Static104.aBoolean180 = Static250.aClass2_Sub26_Sub1_2.method4261() == 1;
				Static166.aBoolean281 = Static250.aClass2_Sub26_Sub1_2.method4261() == 1;
				Static19.aBoolean38 = Static250.aClass2_Sub26_Sub1_2.method4261() == 1;
				Static196.aBoolean342 = Static250.aClass2_Sub26_Sub1_2.method4261() == 1;
				Static233.aBoolean406 = Static250.aClass2_Sub26_Sub1_2.method4261() == 1;
				Static11.anInt298 = Static250.aClass2_Sub26_Sub1_2.method4242();
				Static260.aBoolean435 = Static250.aClass2_Sub26_Sub1_2.method4261() == 1;
				Static243.aBoolean323 = Static250.aClass2_Sub26_Sub1_2.method4261() == 1;
				Static166.method2866(Static243.aBoolean323);
				Static120.method2213(Static243.aBoolean323);
				if (!Static295.aBoolean487) {
					if (Static104.aBoolean180 && !Static19.aBoolean38 || Static260.aBoolean435) {
						try {
							Static303.method484("zap", Static299.aClass177_5.anApplet1);
						} catch (@Pc(883) Throwable local883) {
						}
					} else {
						try {
							Static303.method484("unzap", Static299.aClass177_5.anApplet1);
						} catch (@Pc(873) Throwable local873) {
						}
					}
				}
				try {
					Static303.method484("loggedin", Static299.aClass177_5.anApplet1);
				} catch (@Pc(891) Throwable local891) {
				}
				Static21.anInt508 = Static250.aClass2_Sub26_Sub1_2.method4285();
				Static4.anInt151 = Static250.aClass2_Sub26_Sub1_2.method4242();
				Static91.anInt2032 = 9;
			}
			if (Static91.anInt2032 == 9) {
				if (Static42.aClass45_1.method1040() < Static4.anInt151) {
					return;
				}
				Static250.aClass2_Sub26_Sub1_2.anInt5328 = 0;
				Static42.aClass45_1.method1048(Static4.anInt151, 0, Static250.aClass2_Sub26_Sub1_2.aByteArray72);
				Static231.anInt4770 = 2;
				Static91.anInt2032 = 0;
				Static174.method3009();
				Static246.anInt5145 = -1;
				Static90.method1696(false);
				Static21.anInt508 = -1;
				return;
			}
		} catch (@Pc(945) IOException local945) {
			if (Static42.aClass45_1 != null) {
				Static42.aClass45_1.method1045();
				Static42.aClass45_1 = null;
			}
			if (Static195.anInt4050 >= 1) {
				Static91.anInt2032 = 0;
				Static231.anInt4770 = -4;
			} else {
				Static91.anInt2032 = 1;
				Static195.anInt4050++;
				Static44.anInt1071 = 0;
				if (Static205.anInt4279 == Static139.anInt3001) {
					Static205.anInt4279 = Static2.anInt5943;
				} else {
					Static205.anInt4279 = Static139.anInt3001;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "(B)V")
	public static void method4372() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static198.aBooleanArray19[local3] = false;
		}
		Static150.anInt3180 = -1;
		Static65.anInt1462 = -1;
		Static101.anInt6027 = 5;
		Static88.anInt4713 = 0;
		anInt5459 = 0;
	}
}

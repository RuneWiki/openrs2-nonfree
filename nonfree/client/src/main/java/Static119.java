import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!ud", name = "z", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!ud", name = "A", descriptor = "[I")
	public static int[] anIntArray472;

	@OriginalMember(owner = "client!ud", name = "M", descriptor = "Lclient!lf;")
	public static Class7 aClass7_17;

	@OriginalMember(owner = "client!ud", name = "P", descriptor = "Lclient!lf;")
	public static Class7 aClass7_18;

	@OriginalMember(owner = "client!ud", name = "x", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1337 = Static78.method1313("Unable to connect)3");

	@OriginalMember(owner = "client!ud", name = "y", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1338 = Static78.method1313("Hier klicken)1 um fortzufahren)3)3)3");

	@OriginalMember(owner = "client!ud", name = "C", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1339 = aClass25_1337;

	@OriginalMember(owner = "client!ud", name = "F", descriptor = "Lclient!aa;")
	public static Class2 aClass2_11 = new Class2();

	@OriginalMember(owner = "client!ud", name = "I", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1340 = Static78.method1313("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!ud", name = "J", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1341 = Static78.method1313("scrollbar");

	@OriginalMember(owner = "client!ud", name = "L", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1342 = aClass25_1337;

	@OriginalMember(owner = "client!ud", name = "N", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1343 = Static78.method1313("Privater Chat");

	@OriginalMember(owner = "client!ud", name = "O", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1344 = Static78.method1313("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!ud", name = "Q", descriptor = "Lclient!p;")
	public static Class63 aClass63_25 = new Class63(64);

	@OriginalMember(owner = "client!ud", name = "R", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1345 = Static78.method1313(":duelreq:");

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)Z")
	public static boolean method1917() {
		@Pc(10) long local10 = Static26.method596();
		@Pc(16) int local16 = (int) (local10 - Static62.aLong95);
		if (local16 > 200) {
			local16 = 200;
		}
		Static38.anInt1079 += local16;
		Static62.aLong95 = local10;
		if (Static1.anInt22 == 0 && Static98.anInt2779 == 0 && Static60.anInt1364 == 0 && Static30.anInt823 == 0) {
			return true;
		} else if (Static18.aClass77_3 == null) {
			return false;
		} else {
			try {
				if (Static38.anInt1079 > 30000) {
					throw new IOException();
				}
				@Pc(66) Class1_Sub2_Sub12 local66;
				@Pc(71) Class1_Sub5 local71;
				while (Static98.anInt2779 < 20 && Static30.anInt823 > 0) {
					local66 = (Class1_Sub2_Sub12) Static75.aClass66_12.method1647();
					local71 = new Class1_Sub5(4);
					local71.method676(1);
					local71.method659((int) local66.aLong184);
					Static18.aClass77_3.method1904(4, local71.aByteArray13);
					Static90.aClass66_13.method1653(local66, local66.aLong184);
					Static98.anInt2779++;
					Static30.anInt823--;
				}
				while (Static1.anInt22 < 20 && Static60.anInt1364 > 0) {
					local66 = (Class1_Sub2_Sub12) Static127.aClass27_2.method900();
					local71 = new Class1_Sub5(4);
					local71.method676(0);
					local71.method659((int) local66.aLong184);
					Static18.aClass77_3.method1904(4, local71.aByteArray13);
					local66.method1964();
					Static70.aClass66_9.method1653(local66, local66.aLong184);
					Static1.anInt22++;
					Static60.anInt1364--;
				}
				for (@Pc(163) int local163 = 0; local163 < 100; local163++) {
					@Pc(169) int local169 = Static18.aClass77_3.method1902();
					if (local169 < 0) {
						throw new IOException();
					}
					if (local169 == 0) {
						break;
					}
					Static38.anInt1079 = 0;
					@Pc(184) byte local184 = 0;
					if (Static14.aClass1_Sub2_Sub12_1 == null) {
						local184 = 8;
					} else if (Static108.anInt2505 == 0) {
						local184 = 1;
					}
					@Pc(210) int local210;
					@Pc(215) int local215;
					@Pc(248) int local248;
					@Pc(332) int local332;
					if (local184 <= 0) {
						local210 = Static56.aClass1_Sub5_31.aByteArray13.length - Static14.aClass1_Sub2_Sub12_1.aByte4;
						local215 = 512 - Static108.anInt2505;
						if (local215 > local210 - Static56.aClass1_Sub5_31.anInt792) {
							local215 = local210 - Static56.aClass1_Sub5_31.anInt792;
						}
						if (local215 > local169) {
							local215 = local169;
						}
						Static18.aClass77_3.method1905(Static56.aClass1_Sub5_31.anInt792, Static56.aClass1_Sub5_31.aByteArray13, local215);
						if (Static27.aByte2 != 0) {
							for (local248 = 0; local248 < local215; local248++) {
								Static56.aClass1_Sub5_31.aByteArray13[Static56.aClass1_Sub5_31.anInt792 + local248] ^= Static27.aByte2;
							}
						}
						Static108.anInt2505 += local215;
						Static56.aClass1_Sub5_31.anInt792 += local215;
						if (Static56.aClass1_Sub5_31.anInt792 == local210) {
							if (Static14.aClass1_Sub2_Sub12_1.aLong184 == 16711935L) {
								Static122.aClass1_Sub5_62 = Static56.aClass1_Sub5_31;
								for (local248 = 0; local248 < 256; local248++) {
									@Pc(319) Class56_Sub1 local319 = Static88.aClass56_Sub1Array1[local248];
									if (local319 != null) {
										Static122.aClass1_Sub5_62.anInt792 = local248 * 8 + 5;
										local332 = Static122.aClass1_Sub5_62.method663();
										@Pc(336) int local336 = Static122.aClass1_Sub5_62.method663();
										local319.method1291(local332, local336);
									}
								}
							} else {
								Static16.aCRC32_1.reset();
								Static16.aCRC32_1.update(Static56.aClass1_Sub5_31.aByteArray13, 0, local210);
								local248 = (int) Static16.aCRC32_1.getValue();
								if (Static14.aClass1_Sub2_Sub12_1.anInt1780 != local248) {
									try {
										Static18.aClass77_3.method1909();
									} catch (@Pc(372) Exception local372) {
									}
									Static6.anInt120++;
									Static27.aByte2 = (byte) (Math.random() * 255.0D + 1.0D);
									Static18.aClass77_3 = null;
									return false;
								}
								Static21.anInt590 = 0;
								Static6.anInt120 = 0;
								Static14.aClass1_Sub2_Sub12_1.aClass56_Sub1_13.method1298((Static14.aClass1_Sub2_Sub12_1.aLong184 & 0xFF0000L) == 16711680L, Static129.aBoolean132, Static56.aClass1_Sub5_31.aByteArray13, (int) (Static14.aClass1_Sub2_Sub12_1.aLong184 & 0xFFFFL));
							}
							Static14.aClass1_Sub2_Sub12_1.method2024();
							Static108.anInt2505 = 0;
							if (Static129.aBoolean132) {
								Static98.anInt2779--;
							} else {
								Static1.anInt22--;
							}
							Static56.aClass1_Sub5_31 = null;
							Static14.aClass1_Sub2_Sub12_1 = null;
						} else {
							if (Static108.anInt2505 != 512) {
								break;
							}
							Static108.anInt2505 = 0;
						}
					} else {
						local210 = local184 - Static10.aClass1_Sub5_7.anInt792;
						if (local169 < local210) {
							local210 = local169;
						}
						Static18.aClass77_3.method1905(Static10.aClass1_Sub5_7.anInt792, Static10.aClass1_Sub5_7.aByteArray13, local210);
						if (Static27.aByte2 != 0) {
							for (local215 = 0; local215 < local210; local215++) {
								Static10.aClass1_Sub5_7.aByteArray13[local215 + Static10.aClass1_Sub5_7.anInt792] ^= Static27.aByte2;
							}
						}
						Static10.aClass1_Sub5_7.anInt792 += local210;
						if (local184 > Static10.aClass1_Sub5_7.anInt792) {
							break;
						}
						if (Static14.aClass1_Sub2_Sub12_1 == null) {
							Static10.aClass1_Sub5_7.anInt792 = 0;
							local215 = Static10.aClass1_Sub5_7.method672();
							local248 = Static10.aClass1_Sub5_7.method651();
							@Pc(520) int local520 = Static10.aClass1_Sub5_7.method672();
							local332 = Static10.aClass1_Sub5_7.method663();
							@Pc(531) long local531 = (long) ((local215 << 16) + local248);
							@Pc(537) Class1_Sub2_Sub12 local537 = (Class1_Sub2_Sub12) Static90.aClass66_13.method1650(local531);
							Static129.aBoolean132 = true;
							if (local537 == null) {
								local537 = (Class1_Sub2_Sub12) Static70.aClass66_9.method1650(local531);
								Static129.aBoolean132 = false;
							}
							if (local537 == null) {
								throw new IOException();
							}
							Static14.aClass1_Sub2_Sub12_1 = local537;
							@Pc(563) int local563 = local520 == 0 ? 5 : 9;
							Static56.aClass1_Sub5_31 = new Class1_Sub5(Static14.aClass1_Sub2_Sub12_1.aByte4 + local563 + local332);
							Static56.aClass1_Sub5_31.method676(local520);
							Static56.aClass1_Sub5_31.method633(local332);
							Static108.anInt2505 = 8;
							Static10.aClass1_Sub5_7.anInt792 = 0;
						} else if (Static108.anInt2505 == 0) {
							if (Static10.aClass1_Sub5_7.aByteArray13[0] == -1) {
								Static108.anInt2505 = 1;
								Static10.aClass1_Sub5_7.anInt792 = 0;
							} else {
								Static14.aClass1_Sub2_Sub12_1 = null;
							}
						}
					}
				}
				return true;
			} catch (@Pc(613) IOException local613) {
				try {
					Static18.aClass77_3.method1909();
				} catch (@Pc(618) Exception local618) {
				}
				Static21.anInt590++;
				Static18.aClass77_3 = null;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(B)V")
	public static void method1918() {
		Static112.aFontMetrics1 = null;
		Static37.aFont1 = null;
		Static53.anImage5 = null;
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)V")
	public static void method1919() {
		aClass25_1338 = null;
		aClass25_1345 = null;
		anIntArray472 = null;
		aCanvas1 = null;
		aClass7_17 = null;
		aClass25_1341 = null;
		aClass25_1339 = null;
		aClass25_1337 = null;
		aClass25_1342 = null;
		aClass63_25 = null;
		aClass7_18 = null;
		aClass25_1343 = null;
		aClass25_1340 = null;
		aClass2_11 = null;
		aClass25_1344 = null;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!fc;B)I")
	public static int method1920(@OriginalArg(0) Class25 arg0) {
		if (Static34.anInt947 == 1) {
			return 7;
		} else if (arg0.method797(Static94.aClass25_1024)) {
			return 1;
		} else if (arg0.method797(Static105.aClass25_1138)) {
			return 1;
		} else if (arg0.method797(Static109.aClass25_1203)) {
			return 2;
		} else if (arg0.method797(Static50.aClass25_517)) {
			return 2;
		} else if (arg0.method797(Static124.aClass25_1402)) {
			return 3;
		} else if (arg0.method797(Static16.aClass25_228)) {
			return 4;
		} else if (arg0.method797(Static52.aClass25_543)) {
			return 5;
		} else if (arg0.method797(Static105.aClass25_1144)) {
			return 6;
		} else {
			return 0;
		}
	}
}

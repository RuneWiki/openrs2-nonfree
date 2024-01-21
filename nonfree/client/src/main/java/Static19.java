import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!dc", name = "z", descriptor = "[Lclient!hc;")
	public static Class3_Sub3_Sub2_Sub2[] aClass3_Sub3_Sub2_Sub2Array6;

	@OriginalMember(owner = "client!dc", name = "gb", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
	public static int anInt442 = 0;

	@OriginalMember(owner = "client!dc", name = "C", descriptor = "Lclient!hb;")
	private static Class27 aClass27_238 = Static87.method1648("Public chat");

	@OriginalMember(owner = "client!dc", name = "B", descriptor = "Lclient!hb;")
	public static Class27 aClass27_237 = aClass27_238;

	@OriginalMember(owner = "client!dc", name = "D", descriptor = "I")
	public static int anInt444 = 0;

	@OriginalMember(owner = "client!dc", name = "E", descriptor = "I")
	public static int anInt445 = 0;

	@OriginalMember(owner = "client!dc", name = "F", descriptor = "Lclient!hb;")
	public static Class27 aClass27_239 = Static87.method1648("gr-Un:");

	@OriginalMember(owner = "client!dc", name = "G", descriptor = "I")
	public static int anInt446 = -1;

	@OriginalMember(owner = "client!dc", name = "eb", descriptor = "Lclient!he;")
	public static Class28 aClass28_5 = new Class28();

	@OriginalMember(owner = "client!dc", name = "ib", descriptor = "I")
	public static int anInt459 = 0;

	@OriginalMember(owner = "client!dc", name = "jb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_240 = Static87.method1648("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)V")
	public static void method331() {
		aClass27_238 = null;
		aClass27_239 = null;
		aClass27_237 = null;
		aClass28_5 = null;
		aCanvas1 = null;
		aClass27_240 = null;
		aClass3_Sub3_Sub2_Sub2Array6 = null;
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)Z")
	public static boolean method332() {
		@Pc(7) long local7 = System.currentTimeMillis();
		@Pc(13) int local13 = (int) (local7 - Static106.aLong31);
		if (local13 > 200) {
			local13 = 200;
		}
		Static106.aLong31 = local7;
		Static65.anInt1669 += local13;
		if (Static10.anInt267 == 0 && Static33.anInt812 == 0 && anInt459 == 0 && Static48.anInt2393 == 0) {
			return true;
		} else if (Static25.aClass20_13 == null) {
			return false;
		} else {
			try {
				if (Static65.anInt1669 > 30000) {
					throw new IOException();
				}
				@Pc(58) Class3_Sub3_Sub16 local58;
				@Pc(63) Class3_Sub11 local63;
				while (Static33.anInt812 < 20 && Static48.anInt2393 > 0) {
					local58 = (Class3_Sub3_Sub16) Static35.aClass14_3.method316();
					local63 = new Class3_Sub11(4);
					local63.method1443(1);
					local63.method1427((int) local58.aLong83);
					Static25.aClass20_13.method651(4, local63.aByteArray17);
					Static36.aClass14_4.method321(local58.aLong83, local58);
					Static48.anInt2393--;
					Static33.anInt812++;
				}
				while (Static10.anInt267 < 20 && anInt459 > 0) {
					local58 = (Class3_Sub3_Sub16) Static61.aClass11_2.method257();
					local63 = new Class3_Sub11(4);
					local63.method1443(0);
					local63.method1427((int) local58.aLong83);
					Static25.aClass20_13.method651(4, local63.aByteArray17);
					local58.method1892();
					Static64.aClass14_5.method321(local58.aLong83, local58);
					anInt459--;
					Static10.anInt267++;
				}
				for (@Pc(158) int local158 = 0; local158 < 100; local158++) {
					@Pc(164) int local164 = Static25.aClass20_13.method655();
					if (local164 < 0) {
						throw new IOException();
					}
					if (local164 == 0) {
						break;
					}
					Static65.anInt1669 = 0;
					@Pc(182) byte local182 = 0;
					if (Static2.aClass3_Sub3_Sub16_1 == null) {
						local182 = 8;
					} else if (Static104.anInt2722 == 0) {
						local182 = 1;
					}
					@Pc(203) int local203;
					@Pc(224) int local224;
					@Pc(275) int local275;
					@Pc(283) int local283;
					if (local182 > 0) {
						local203 = local182 - Static57.aClass3_Sub11_4.anInt2060;
						if (local164 < local203) {
							local203 = local164;
						}
						Static25.aClass20_13.method648(Static57.aClass3_Sub11_4.anInt2060, Static57.aClass3_Sub11_4.aByteArray17, local203);
						if (Static104.aByte2 != 0) {
							for (local224 = 0; local224 < local203; local224++) {
								Static57.aClass3_Sub11_4.aByteArray17[Static57.aClass3_Sub11_4.anInt2060 + local224] = (byte) (Static57.aClass3_Sub11_4.aByteArray17[Static57.aClass3_Sub11_4.anInt2060 + local224] ^ Static104.aByte2);
							}
						}
						Static57.aClass3_Sub11_4.anInt2060 += local203;
						if (Static57.aClass3_Sub11_4.anInt2060 < local182) {
							break;
						}
						if (Static2.aClass3_Sub3_Sub16_1 == null) {
							Static57.aClass3_Sub11_4.anInt2060 = 0;
							local224 = Static57.aClass3_Sub11_4.method1421();
							local275 = Static57.aClass3_Sub11_4.method1451();
							@Pc(279) int local279 = Static57.aClass3_Sub11_4.method1421();
							local283 = Static57.aClass3_Sub11_4.method1444();
							@Pc(291) long local291 = (long) ((local224 << 16) + local275);
							@Pc(297) Class3_Sub3_Sub16 local297 = (Class3_Sub3_Sub16) Static36.aClass14_4.method317(local291);
							Static85.aBoolean115 = true;
							if (local297 == null) {
								local297 = (Class3_Sub3_Sub16) Static64.aClass14_5.method317(local291);
								Static85.aBoolean115 = false;
							}
							if (local297 == null) {
								throw new IOException();
							}
							Static2.aClass3_Sub3_Sub16_1 = local297;
							@Pc(326) int local326 = local279 == 0 ? 5 : 9;
							Static84.aClass3_Sub11_5 = new Class3_Sub11(local326 + local283 + Static2.aClass3_Sub3_Sub16_1.aByte3);
							Static84.aClass3_Sub11_5.method1443(local279);
							Static84.aClass3_Sub11_5.method1425(local283);
							Static57.aClass3_Sub11_4.anInt2060 = 0;
							Static104.anInt2722 = 8;
						} else if (Static104.anInt2722 == 0) {
							if (Static57.aClass3_Sub11_4.aByteArray17[0] == -1) {
								Static104.anInt2722 = 1;
								Static57.aClass3_Sub11_4.anInt2060 = 0;
							} else {
								Static2.aClass3_Sub3_Sub16_1 = null;
							}
						}
					} else {
						local224 = 512 - Static104.anInt2722;
						local203 = Static84.aClass3_Sub11_5.aByteArray17.length - Static2.aClass3_Sub3_Sub16_1.aByte3;
						if (local224 > local203 - Static84.aClass3_Sub11_5.anInt2060) {
							local224 = local203 - Static84.aClass3_Sub11_5.anInt2060;
						}
						if (local224 > local164) {
							local224 = local164;
						}
						Static25.aClass20_13.method648(Static84.aClass3_Sub11_5.anInt2060, Static84.aClass3_Sub11_5.aByteArray17, local224);
						if (Static104.aByte2 != 0) {
							for (local275 = 0; local275 < local224; local275++) {
								Static84.aClass3_Sub11_5.aByteArray17[Static84.aClass3_Sub11_5.anInt2060 + local275] ^= Static104.aByte2;
							}
						}
						Static104.anInt2722 += local224;
						Static84.aClass3_Sub11_5.anInt2060 += local224;
						if (local203 == Static84.aClass3_Sub11_5.anInt2060) {
							if (Static2.aClass3_Sub3_Sub16_1.aLong83 == 16711935L) {
								Static47.aClass3_Sub11_3 = Static84.aClass3_Sub11_5;
								for (local275 = 0; local275 < 256; local275++) {
									@Pc(552) Class54_Sub1 local552 = Static66.aClass54_Sub1Array1[local275];
									if (local552 != null) {
										Static47.aClass3_Sub11_3.anInt2060 = local275 * 4 + 5;
										local283 = Static47.aClass3_Sub11_3.method1444();
										local552.method1626(local283);
									}
								}
							} else {
								Static99.aCRC32_3.reset();
								Static99.aCRC32_3.update(Static84.aClass3_Sub11_5.aByteArray17, 0, local203);
								local275 = (int) Static99.aCRC32_3.getValue();
								if (Static2.aClass3_Sub3_Sub16_1.anInt2762 != local275) {
									try {
										Static25.aClass20_13.method656();
									} catch (@Pc(496) Exception local496) {
									}
									Static25.aClass20_13 = null;
									Static57.anInt1500++;
									Static104.aByte2 = (byte) (Math.random() * 255.0D + 1.0D);
									return false;
								}
								Static98.anInt2574 = 0;
								Static57.anInt1500 = 0;
								Static2.aClass3_Sub3_Sub16_1.aClass54_Sub1_51.method1634(Static85.aBoolean115, (Static2.aClass3_Sub3_Sub16_1.aLong83 & 0xFF0000L) == 16711680L, (int) (Static2.aClass3_Sub3_Sub16_1.aLong83 & 0xFFFFL), Static84.aClass3_Sub11_5.aByteArray17);
							}
							Static2.aClass3_Sub3_Sub16_1.method1883();
							Static104.anInt2722 = 0;
							Static84.aClass3_Sub11_5 = null;
							Static2.aClass3_Sub3_Sub16_1 = null;
							if (Static85.aBoolean115) {
								Static33.anInt812--;
							} else {
								Static10.anInt267--;
							}
						} else {
							if (Static104.anInt2722 != 512) {
								break;
							}
							Static104.anInt2722 = 0;
						}
					}
				}
				return true;
			} catch (@Pc(615) IOException local615) {
				try {
					Static25.aClass20_13.method656();
				} catch (@Pc(622) Exception local622) {
				}
				Static98.anInt2574++;
				Static25.aClass20_13 = null;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZLclient!td;)V")
	public static void method333(@OriginalArg(1) Class54 arg0) {
		Static28.aClass54_14 = arg0;
		Static37.anInt882 = Static28.aClass54_14.method1609(16);
	}
}

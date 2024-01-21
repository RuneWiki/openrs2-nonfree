import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "[I")
	public static int[] anIntArray233;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "Lclient!gf;")
	public static Class3_Sub1_Sub5_Sub3 aClass3_Sub1_Sub5_Sub3_15;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "Lclient!na;")
	public static Class53 aClass53_827 = Static109.method1737("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
	public static int anInt1832 = 0;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
	public static int anInt1833 = 0;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray4 = new byte[250][];

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "Lclient!na;")
	public static Class53 aClass53_828 = Static109.method1737("auf der Hautpseite)3");

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IILclient!na;Lclient!na;)V")
	public static void method1234(@OriginalArg(1) int arg0, @OriginalArg(2) Class53 arg1, @OriginalArg(3) Class53 arg2) {
		if (Static123.anInt2865 == -1) {
			Static52.aBoolean50 = true;
		}
		if (arg0 == 0 && Static30.anInt1019 != -1) {
			anInt1832 = 0;
			Static114.aClass53_1307 = arg2;
		}
		for (@Pc(22) int local22 = 99; local22 > 0; local22--) {
			Static82.anIntArray110[local22] = Static82.anIntArray110[local22 - 1];
			Static15.aClass53Array4[local22] = Static15.aClass53Array4[local22 - 1];
			Static94.aClass53Array16[local22] = Static94.aClass53Array16[local22 - 1];
		}
		Static82.anIntArray110[0] = arg0;
		Static15.aClass53Array4[0] = arg1;
		Static94.aClass53Array16[0] = arg2;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
	public static void method1235() {
		aClass3_Sub1_Sub5_Sub3_15 = null;
		aClass53_827 = null;
		aByteArrayArray4 = null;
		aClass53_828 = null;
		anIntArray233 = null;
		anIntArrayArray15 = null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)Z")
	public static boolean method1236() {
		@Pc(4) long local4 = Static89.method1462();
		@Pc(19) int local19 = (int) (local4 - Static99.aLong73);
		Static99.aLong73 = local4;
		if (local19 > 200) {
			local19 = 200;
		}
		Static44.anInt1251 += local19;
		if (Static40.anInt1193 == 0 && Static111.anInt2561 == 0 && Static51.anInt1331 == 0 && Static2.anInt63 == 0) {
			return true;
		} else if (Static106.aClass37_4 == null) {
			return false;
		} else {
			try {
				if (Static44.anInt1251 > 30000) {
					throw new IOException();
				}
				@Pc(66) Class3_Sub1_Sub12 local66;
				@Pc(71) Class3_Sub7 local71;
				while (Static111.anInt2561 < 20 && Static2.anInt63 > 0) {
					local66 = (Class3_Sub1_Sub12) Static4.aClass77_1.method1803();
					local71 = new Class3_Sub7(4);
					local71.method625(1);
					local71.method629((int) local66.aLong94);
					Static106.aClass37_4.method953(4, local71.aByteArray15);
					Static42.aClass77_5.method1810(local66, local66.aLong94);
					Static111.anInt2561++;
					Static2.anInt63--;
				}
				while (Static40.anInt1193 < 20 && Static51.anInt1331 > 0) {
					local66 = (Class3_Sub1_Sub12) Static35.aClass41_1.method1067();
					local71 = new Class3_Sub7(4);
					local71.method625(0);
					local71.method629((int) local66.aLong94);
					Static106.aClass37_4.method953(4, local71.aByteArray15);
					local66.method1956();
					Static18.aClass77_2.method1810(local66, local66.aLong94);
					Static51.anInt1331--;
					Static40.anInt1193++;
				}
				for (@Pc(162) int local162 = 0; local162 < 100; local162++) {
					@Pc(168) int local168 = Static106.aClass37_4.method949();
					if (local168 < 0) {
						throw new IOException();
					}
					if (local168 == 0) {
						break;
					}
					@Pc(181) byte local181 = 0;
					Static44.anInt1251 = 0;
					if (Static126.aClass3_Sub1_Sub12_2 == null) {
						local181 = 8;
					} else if (Static85.anInt2071 == 0) {
						local181 = 1;
					}
					@Pc(200) int local200;
					@Pc(220) int local220;
					@Pc(270) int local270;
					@Pc(285) int local285;
					if (local181 > 0) {
						local200 = local181 - Static72.aClass3_Sub7_5.anInt964;
						if (local200 > local168) {
							local200 = local168;
						}
						Static106.aClass37_4.method955(Static72.aClass3_Sub7_5.aByteArray15, local200, Static72.aClass3_Sub7_5.anInt964);
						if (Static60.aByte1 != 0) {
							for (local220 = 0; local220 < local200; local220++) {
								Static72.aClass3_Sub7_5.aByteArray15[Static72.aClass3_Sub7_5.anInt964 + local220] ^= Static60.aByte1;
							}
						}
						Static72.aClass3_Sub7_5.anInt964 += local200;
						if (Static72.aClass3_Sub7_5.anInt964 < local181) {
							break;
						}
						if (Static126.aClass3_Sub1_Sub12_2 == null) {
							Static72.aClass3_Sub7_5.anInt964 = 0;
							local220 = Static72.aClass3_Sub7_5.method647();
							local270 = Static72.aClass3_Sub7_5.method602();
							@Pc(274) int local274 = Static72.aClass3_Sub7_5.method647();
							@Pc(281) long local281 = (long) (local270 + (local220 << 16));
							local285 = Static72.aClass3_Sub7_5.method638();
							@Pc(291) Class3_Sub1_Sub12 local291 = (Class3_Sub1_Sub12) Static42.aClass77_5.method1805(local281);
							Static15.aBoolean19 = true;
							if (local291 == null) {
								local291 = (Class3_Sub1_Sub12) Static18.aClass77_2.method1805(local281);
								Static15.aBoolean19 = false;
							}
							if (local291 == null) {
								throw new IOException();
							}
							Static126.aClass3_Sub1_Sub12_2 = local291;
							@Pc(320) int local320 = local274 == 0 ? 5 : 9;
							Static19.aClass3_Sub7_7 = new Class3_Sub7(Static126.aClass3_Sub1_Sub12_2.aByte3 + local285 + local320);
							Static19.aClass3_Sub7_7.method625(local274);
							Static19.aClass3_Sub7_7.method642(local285);
							Static85.anInt2071 = 8;
							Static72.aClass3_Sub7_5.anInt964 = 0;
						} else if (Static85.anInt2071 == 0) {
							if (Static72.aClass3_Sub7_5.aByteArray15[0] == -1) {
								Static85.anInt2071 = 1;
								Static72.aClass3_Sub7_5.anInt964 = 0;
							} else {
								Static126.aClass3_Sub1_Sub12_2 = null;
							}
						}
					} else {
						local200 = Static19.aClass3_Sub7_7.aByteArray15.length - Static126.aClass3_Sub1_Sub12_2.aByte3;
						local220 = 512 - Static85.anInt2071;
						if (local200 - Static19.aClass3_Sub7_7.anInt964 < local220) {
							local220 = local200 - Static19.aClass3_Sub7_7.anInt964;
						}
						if (local168 < local220) {
							local220 = local168;
						}
						Static106.aClass37_4.method955(Static19.aClass3_Sub7_7.aByteArray15, local220, Static19.aClass3_Sub7_7.anInt964);
						if (Static60.aByte1 != 0) {
							for (local270 = 0; local270 < local220; local270++) {
								Static19.aClass3_Sub7_7.aByteArray15[local270 + Static19.aClass3_Sub7_7.anInt964] ^= Static60.aByte1;
							}
						}
						Static19.aClass3_Sub7_7.anInt964 += local220;
						Static85.anInt2071 += local220;
						if (Static19.aClass3_Sub7_7.anInt964 == local200) {
							if (Static126.aClass3_Sub1_Sub12_2.aLong94 == 16711935L) {
								Static119.aClass3_Sub7_2 = Static19.aClass3_Sub7_7;
								for (local270 = 0; local270 < 256; local270++) {
									@Pc(542) Class62_Sub1 local542 = Static30.aClass62_Sub1Array1[local270];
									if (local542 != null) {
										Static119.aClass3_Sub7_2.anInt964 = local270 * 4 + 5;
										local285 = Static119.aClass3_Sub7_2.method638();
										local542.method1522(local285);
									}
								}
							} else {
								Static88.aCRC32_2.reset();
								Static88.aCRC32_2.update(Static19.aClass3_Sub7_7.aByteArray15, 0, local200);
								local270 = (int) Static88.aCRC32_2.getValue();
								if (local270 != Static126.aClass3_Sub1_Sub12_2.anInt2378) {
									try {
										Static106.aClass37_4.method948();
									} catch (@Pc(488) Exception local488) {
									}
									Static60.aByte1 = (byte) (Math.random() * 255.0D + 1.0D);
									Static106.aClass37_4 = null;
									Static39.anInt1176++;
									return false;
								}
								Static39.anInt1176 = 0;
								Static20.anInt691 = 0;
								Static126.aClass3_Sub1_Sub12_2.aClass62_Sub1_14.method1525(Static19.aClass3_Sub7_7.aByteArray15, (Static126.aClass3_Sub1_Sub12_2.aLong94 & 0xFF0000L) == 16711680L, (int) (Static126.aClass3_Sub1_Sub12_2.aLong94 & 0xFFFFL), Static15.aBoolean19);
							}
							Static126.aClass3_Sub1_Sub12_2.method1962();
							Static19.aClass3_Sub7_7 = null;
							Static85.anInt2071 = 0;
							if (Static15.aBoolean19) {
								Static111.anInt2561--;
							} else {
								Static40.anInt1193--;
							}
							Static126.aClass3_Sub1_Sub12_2 = null;
						} else {
							if (Static85.anInt2071 != 512) {
								break;
							}
							Static85.anInt2071 = 0;
						}
					}
				}
				return true;
			} catch (@Pc(600) IOException local600) {
				try {
					Static106.aClass37_4.method948();
				} catch (@Pc(605) Exception local605) {
				}
				Static20.anInt691++;
				Static106.aClass37_4 = null;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1237(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static23.aClass43_1);
		arg0.addMouseMotionListener(Static23.aClass43_1);
		arg0.addFocusListener(Static23.aClass43_1);
	}
}

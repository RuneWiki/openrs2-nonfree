import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "Lclient!na;")
	public static Class56 aClass56_7;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
	public static int anInt351 = 0;

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "Lclient!pe;")
	public static Class65 aClass65_127 = Static119.method1462("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "Lclient!pe;")
	public static Class65 aClass65_128 = Static119.method1462("<img=1>");

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "Lclient!bf;")
	public static Class9 aClass9_1 = new Class9();

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "Lclient!pe;")
	public static Class65 aClass65_129 = Static119.method1462("hel");

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
	public static int anInt354 = 99;

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
	public static int anInt355 = 0;

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "J")
	public static long aLong16 = 0L;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V")
	public static void method259() {
		aClass56_7 = null;
		aClass9_1 = null;
		aClass65_129 = null;
		aClass65_128 = null;
		aClass65_127 = null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)Z")
	public static boolean method260() {
		@Pc(8) long local8 = Static78.method1296();
		@Pc(13) int local13 = (int) (local8 - Static127.aLong92);
		if (local13 > 200) {
			local13 = 200;
		}
		Static83.anInt1793 += local13;
		Static127.aLong92 = local8;
		if (Static20.anInt506 == 0 && Static47.anInt1163 == 0 && Static34.anInt787 == 0 && Static7.anInt224 == 0) {
			return true;
		} else if (Static13.aClass7_3 == null) {
			return false;
		} else {
			try {
				if (Static83.anInt1793 > 30000) {
					throw new IOException();
				}
				@Pc(71) Class2_Sub1_Sub16 local71;
				@Pc(76) Class2_Sub4 local76;
				while (Static47.anInt1163 < 20 && Static7.anInt224 > 0) {
					local71 = (Class2_Sub1_Sub16) Static68.aClass40_23.method854();
					local76 = new Class2_Sub4(4);
					local76.method926(1);
					local76.method941((int) local71.aLong100);
					Static13.aClass7_3.method161(local76.aByteArray20, 4);
					Static34.aClass40_9.method849(local71, local71.aLong100);
					Static7.anInt224--;
					Static47.anInt1163++;
				}
				while (Static20.anInt506 < 20 && Static34.anInt787 > 0) {
					local71 = (Class2_Sub1_Sub16) Static39.aClass74_2.method1829();
					local76 = new Class2_Sub4(4);
					local76.method926(0);
					local76.method941((int) local71.aLong100);
					Static13.aClass7_3.method161(local76.aByteArray20, 4);
					local71.method2057();
					Static81.aClass40_15.method849(local71, local71.aLong100);
					Static20.anInt506++;
					Static34.anInt787--;
				}
				for (@Pc(172) int local172 = 0; local172 < 100; local172++) {
					@Pc(178) int local178 = Static13.aClass7_3.method155();
					if (local178 < 0) {
						throw new IOException();
					}
					if (local178 == 0) {
						break;
					}
					Static83.anInt1793 = 0;
					@Pc(193) byte local193 = 0;
					if (Static37.aClass2_Sub1_Sub16_1 == null) {
						local193 = 8;
					} else if (Static6.anInt182 == 0) {
						local193 = 1;
					}
					@Pc(213) int local213;
					@Pc(237) int local237;
					@Pc(287) int local287;
					@Pc(302) int local302;
					if (local193 > 0) {
						local213 = local193 - Static13.aClass2_Sub4_32.anInt1298;
						if (local178 < local213) {
							local213 = local178;
						}
						Static13.aClass7_3.method154(Static13.aClass2_Sub4_32.anInt1298, local213, Static13.aClass2_Sub4_32.aByteArray20);
						if (Static134.aByte8 != 0) {
							for (local237 = 0; local237 < local213; local237++) {
								Static13.aClass2_Sub4_32.aByteArray20[local237 + Static13.aClass2_Sub4_32.anInt1298] ^= Static134.aByte8;
							}
						}
						Static13.aClass2_Sub4_32.anInt1298 += local213;
						if (local193 > Static13.aClass2_Sub4_32.anInt1298) {
							break;
						}
						if (Static37.aClass2_Sub1_Sub16_1 == null) {
							Static13.aClass2_Sub4_32.anInt1298 = 0;
							local237 = Static13.aClass2_Sub4_32.method933();
							local287 = Static13.aClass2_Sub4_32.method896();
							@Pc(291) int local291 = Static13.aClass2_Sub4_32.method933();
							@Pc(298) long local298 = (long) ((local237 << 16) + local287);
							local302 = Static13.aClass2_Sub4_32.method903();
							@Pc(308) Class2_Sub1_Sub16 local308 = (Class2_Sub1_Sub16) Static34.aClass40_9.method851(local298);
							Static7.aBoolean10 = true;
							if (local308 == null) {
								local308 = (Class2_Sub1_Sub16) Static81.aClass40_15.method851(local298);
								Static7.aBoolean10 = false;
							}
							if (local308 == null) {
								throw new IOException();
							}
							@Pc(332) int local332 = local291 == 0 ? 5 : 9;
							Static37.aClass2_Sub1_Sub16_1 = local308;
							Static3.aClass2_Sub4_4 = new Class2_Sub4(Static37.aClass2_Sub1_Sub16_1.aByte5 + local302 + local332);
							Static3.aClass2_Sub4_4.method926(local291);
							Static3.aClass2_Sub4_4.method914(local302);
							Static6.anInt182 = 8;
							Static13.aClass2_Sub4_32.anInt1298 = 0;
						} else if (Static6.anInt182 == 0) {
							if (Static13.aClass2_Sub4_32.aByteArray20[0] == -1) {
								Static13.aClass2_Sub4_32.anInt1298 = 0;
								Static6.anInt182 = 1;
							} else {
								Static37.aClass2_Sub1_Sub16_1 = null;
							}
						}
					} else {
						local237 = 512 - Static6.anInt182;
						local213 = Static3.aClass2_Sub4_4.aByteArray20.length - Static37.aClass2_Sub1_Sub16_1.aByte5;
						if (local237 > local213 - Static3.aClass2_Sub4_4.anInt1298) {
							local237 = local213 - Static3.aClass2_Sub4_4.anInt1298;
						}
						if (local178 < local237) {
							local237 = local178;
						}
						Static13.aClass7_3.method154(Static3.aClass2_Sub4_4.anInt1298, local237, Static3.aClass2_Sub4_4.aByteArray20);
						if (Static134.aByte8 != 0) {
							for (local287 = 0; local287 < local237; local287++) {
								Static3.aClass2_Sub4_4.aByteArray20[local287 + Static3.aClass2_Sub4_4.anInt1298] ^= Static134.aByte8;
							}
						}
						Static3.aClass2_Sub4_4.anInt1298 += local237;
						Static6.anInt182 += local237;
						if (Static3.aClass2_Sub4_4.anInt1298 == local213) {
							if (Static37.aClass2_Sub1_Sub16_1.aLong100 == 16711935L) {
								Static104.aClass2_Sub4_38 = Static3.aClass2_Sub4_4;
								for (local287 = 0; local287 < 256; local287++) {
									@Pc(498) Class56_Sub1 local498 = Static59.aClass56_Sub1Array1[local287];
									if (local498 != null) {
										Static104.aClass2_Sub4_38.anInt1298 = local287 * 8 + 5;
										local302 = Static104.aClass2_Sub4_38.method903();
										@Pc(515) int local515 = Static104.aClass2_Sub4_38.method903();
										local498.method1693(local515, local302);
									}
								}
							} else {
								Static47.aCRC32_1.reset();
								Static47.aCRC32_1.update(Static3.aClass2_Sub4_4.aByteArray20, 0, local213);
								local287 = (int) Static47.aCRC32_1.getValue();
								if (local287 != Static37.aClass2_Sub1_Sub16_1.anInt2747) {
									try {
										Static13.aClass7_3.method157();
									} catch (@Pc(553) Exception local553) {
									}
									Static134.aByte8 = (byte) (Math.random() * 255.0D + 1.0D);
									Static90.anInt2002++;
									Static13.aClass7_3 = null;
									return false;
								}
								Static76.anInt1705 = 0;
								Static90.anInt2002 = 0;
								Static37.aClass2_Sub1_Sub16_1.aClass56_Sub1_30.method1705(Static7.aBoolean10, Static3.aClass2_Sub4_4.aByteArray20, (int) (Static37.aClass2_Sub1_Sub16_1.aLong100 & 0xFFFFL), (Static37.aClass2_Sub1_Sub16_1.aLong100 & 0xFF0000L) == 16711680L);
							}
							Static37.aClass2_Sub1_Sub16_1.method2053();
							Static6.anInt182 = 0;
							Static37.aClass2_Sub1_Sub16_1 = null;
							Static3.aClass2_Sub4_4 = null;
							if (Static7.aBoolean10) {
								Static47.anInt1163--;
							} else {
								Static20.anInt506--;
							}
						} else {
							if (Static6.anInt182 != 512) {
								break;
							}
							Static6.anInt182 = 0;
						}
					}
				}
				return true;
			} catch (@Pc(625) IOException local625) {
				try {
					Static13.aClass7_3.method157();
				} catch (@Pc(630) Exception local630) {
				}
				Static76.anInt1705++;
				Static13.aClass7_3 = null;
				return false;
			}
		}
	}
}

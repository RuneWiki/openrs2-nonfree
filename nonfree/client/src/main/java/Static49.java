import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
	public static int anInt1381;

	@OriginalMember(owner = "client!ic", name = "v", descriptor = "Lclient!ia;")
	public static Class5_Sub1_Sub10_Sub1 aClass5_Sub1_Sub10_Sub1_13;

	@OriginalMember(owner = "client!ic", name = "w", descriptor = "Lclient!ia;")
	public static Class5_Sub1_Sub10_Sub1 aClass5_Sub1_Sub10_Sub1_14;

	@OriginalMember(owner = "client!ic", name = "B", descriptor = "Z")
	public static boolean aBoolean52;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
	public static final int anInt1380 = 2301979;

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "Lclient!vc;")
	private static Class71 aClass71_711 = Static38.method736("Connecting to friendserver");

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "Lclient!vc;")
	public static Class71 aClass71_710 = aClass71_711;

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "Lclient!vc;")
	public static Class71 aClass71_712 = Static38.method736("@cr1@");

	@OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
	public static int anInt1394 = 0;

	@OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
	public static final int anInt1396 = 5063219;

	@OriginalMember(owner = "client!ic", name = "F", descriptor = "[I")
	public static int[] anIntArray158 = new int[500];

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)Z")
	public static boolean method943() {
		@Pc(4) long local4 = Static50.method959();
		@Pc(13) int local13 = (int) (local4 - Static83.aLong73);
		if (local13 > 200) {
			local13 = 200;
		}
		Static83.aLong73 = local4;
		Static112.anInt2653 += local13;
		if (Static65.anInt1634 == 0 && Static108.anInt2619 == 0 && Static8.anInt281 == 0 && Static115.anInt2697 == 0) {
			return true;
		} else if (Static116.aClass35_3 == null) {
			return false;
		} else {
			try {
				if (Static112.anInt2653 > 30000) {
					throw new IOException();
				}
				@Pc(63) Class5_Sub1_Sub6 local63;
				@Pc(68) Class5_Sub11 local68;
				while (Static108.anInt2619 < 20 && Static115.anInt2697 > 0) {
					local63 = (Class5_Sub1_Sub6) Static99.aClass57_14.method1579();
					local68 = new Class5_Sub11(4);
					local68.method1545(1);
					local68.method1514((int) local63.aLong118);
					Static116.aClass35_3.method967(4, local68.aByteArray23);
					Static86.aClass57_17.method1581(local63.aLong118, local63);
					Static108.anInt2619++;
					Static115.anInt2697--;
				}
				while (Static65.anInt1634 < 20 && Static8.anInt281 > 0) {
					local63 = (Class5_Sub1_Sub6) Static26.aClass6_2.method157();
					local68 = new Class5_Sub11(4);
					local68.method1545(0);
					local68.method1514((int) local63.aLong118);
					Static116.aClass35_3.method967(4, local68.aByteArray23);
					local63.method2009();
					Static61.aClass57_9.method1581(local63.aLong118, local63);
					Static65.anInt1634++;
					Static8.anInt281--;
				}
				for (@Pc(168) int local168 = 0; local168 < 100; local168++) {
					@Pc(174) int local174 = Static116.aClass35_3.method965();
					if (local174 < 0) {
						throw new IOException();
					}
					if (local174 == 0) {
						break;
					}
					@Pc(190) byte local190 = 0;
					Static112.anInt2653 = 0;
					if (Static5.aClass5_Sub1_Sub6_1 == null) {
						local190 = 8;
					} else if (Static109.anInt2627 == 0) {
						local190 = 1;
					}
					@Pc(215) int local215;
					@Pc(220) int local220;
					@Pc(250) int local250;
					@Pc(390) int local390;
					if (local190 <= 0) {
						local215 = Static20.aClass5_Sub11_2.aByteArray23.length - Static5.aClass5_Sub1_Sub6_1.aByte2;
						local220 = 512 - Static109.anInt2627;
						if (local215 - Static20.aClass5_Sub11_2.anInt2233 < local220) {
							local220 = local215 - Static20.aClass5_Sub11_2.anInt2233;
						}
						if (local174 < local220) {
							local220 = local174;
						}
						Static116.aClass35_3.method968(Static20.aClass5_Sub11_2.anInt2233, Static20.aClass5_Sub11_2.aByteArray23, local220);
						if (Static34.aByte3 != 0) {
							for (local250 = 0; local250 < local220; local250++) {
								Static20.aClass5_Sub11_2.aByteArray23[Static20.aClass5_Sub11_2.anInt2233 + local250] ^= Static34.aByte3;
							}
						}
						Static109.anInt2627 += local220;
						Static20.aClass5_Sub11_2.anInt2233 += local220;
						if (Static20.aClass5_Sub11_2.anInt2233 == local215) {
							if (Static5.aClass5_Sub1_Sub6_1.aLong118 == 16711935L) {
								Static76.aClass5_Sub11_4 = Static20.aClass5_Sub11_2;
								for (local250 = 0; local250 < 256; local250++) {
									@Pc(377) Class24_Sub1 local377 = Static25.aClass24_Sub1Array1[local250];
									if (local377 != null) {
										Static76.aClass5_Sub11_4.anInt2233 = local250 * 4 + 5;
										local390 = Static76.aClass5_Sub11_4.method1540();
										local377.method687(local390);
									}
								}
							} else {
								Static117.aCRC32_2.reset();
								Static117.aCRC32_2.update(Static20.aClass5_Sub11_2.aByteArray23, 0, local215);
								local250 = (int) Static117.aCRC32_2.getValue();
								if (Static5.aClass5_Sub1_Sub6_1.anInt852 != local250) {
									try {
										Static116.aClass35_3.method961();
									} catch (@Pc(321) Exception local321) {
									}
									Static116.aClass35_3 = null;
									Static64.anInt2492++;
									Static34.aByte3 = (byte) (Math.random() * 255.0D + 1.0D);
									return false;
								}
								Static64.anInt2492 = 0;
								Static20.anInt674 = 0;
								Static5.aClass5_Sub1_Sub6_1.aClass24_Sub1_8.method683(Static20.aClass5_Sub11_2.aByteArray23, (int) (Static5.aClass5_Sub1_Sub6_1.aLong118 & 0xFFFFL), (Static5.aClass5_Sub1_Sub6_1.aLong118 & 0xFF0000L) == 16711680L, Static54.aBoolean57);
							}
							Static5.aClass5_Sub1_Sub6_1.method2002();
							Static109.anInt2627 = 0;
							if (Static54.aBoolean57) {
								Static108.anInt2619--;
							} else {
								Static65.anInt1634--;
							}
							Static20.aClass5_Sub11_2 = null;
							Static5.aClass5_Sub1_Sub6_1 = null;
						} else {
							if (Static109.anInt2627 != 512) {
								break;
							}
							Static109.anInt2627 = 0;
						}
					} else {
						local215 = local190 - Static34.aClass5_Sub11_3.anInt2233;
						if (local174 < local215) {
							local215 = local174;
						}
						Static116.aClass35_3.method968(Static34.aClass5_Sub11_3.anInt2233, Static34.aClass5_Sub11_3.aByteArray23, local215);
						if (Static34.aByte3 != 0) {
							for (local220 = 0; local220 < local215; local220++) {
								Static34.aClass5_Sub11_3.aByteArray23[local220 + Static34.aClass5_Sub11_3.anInt2233] ^= Static34.aByte3;
							}
						}
						Static34.aClass5_Sub11_3.anInt2233 += local215;
						if (local190 > Static34.aClass5_Sub11_3.anInt2233) {
							break;
						}
						if (Static5.aClass5_Sub1_Sub6_1 == null) {
							Static34.aClass5_Sub11_3.anInt2233 = 0;
							local220 = Static34.aClass5_Sub11_3.method1546();
							local250 = Static34.aClass5_Sub11_3.method1543();
							@Pc(516) long local516 = (long) ((local220 << 16) + local250);
							@Pc(520) int local520 = Static34.aClass5_Sub11_3.method1546();
							local390 = Static34.aClass5_Sub11_3.method1540();
							@Pc(530) Class5_Sub1_Sub6 local530 = (Class5_Sub1_Sub6) Static86.aClass57_17.method1575(local516);
							Static54.aBoolean57 = true;
							if (local530 == null) {
								local530 = (Class5_Sub1_Sub6) Static61.aClass57_9.method1575(local516);
								Static54.aBoolean57 = false;
							}
							if (local530 == null) {
								throw new IOException();
							}
							Static5.aClass5_Sub1_Sub6_1 = local530;
							@Pc(559) int local559 = local520 == 0 ? 5 : 9;
							Static20.aClass5_Sub11_2 = new Class5_Sub11(local390 + local559 + Static5.aClass5_Sub1_Sub6_1.aByte2);
							Static20.aClass5_Sub11_2.method1545(local520);
							Static20.aClass5_Sub11_2.method1525(local390);
							Static109.anInt2627 = 8;
							Static34.aClass5_Sub11_3.anInt2233 = 0;
						} else if (Static109.anInt2627 == 0) {
							if (Static34.aClass5_Sub11_3.aByteArray23[0] == -1) {
								Static109.anInt2627 = 1;
								Static34.aClass5_Sub11_3.anInt2233 = 0;
							} else {
								Static5.aClass5_Sub1_Sub6_1 = null;
							}
						}
					}
				}
				return true;
			} catch (@Pc(610) IOException local610) {
				try {
					Static116.aClass35_3.method961();
				} catch (@Pc(615) Exception local615) {
				}
				Static20.anInt674++;
				Static116.aClass35_3 = null;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
	public static void method944() {
		if (Static41.aClass48_1 != null) {
			@Pc(15) Class48 local15 = Static41.aClass48_1;
			synchronized (Static41.aClass48_1) {
				Static41.aClass48_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
	public static void method949() {
		aClass71_712 = null;
		aClass71_711 = null;
		aClass5_Sub1_Sub10_Sub1_13 = null;
		aClass5_Sub1_Sub10_Sub1_14 = null;
		anIntArray158 = null;
		aClass71_710 = null;
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
	public static void method954() {
		Static70.anImage4 = null;
		Static107.aFontMetrics1 = null;
		Static88.aFont1 = null;
	}
}

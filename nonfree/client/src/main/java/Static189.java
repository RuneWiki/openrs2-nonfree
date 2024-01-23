import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!si", name = "Q", descriptor = "Lclient!te;")
	public static Class1_Sub2_Sub1 aClass1_Sub2_Sub1_5;

	@OriginalMember(owner = "client!si", name = "H", descriptor = "Lclient!w;")
	public static Class123 aClass123_11 = new Class123(128);

	@OriginalMember(owner = "client!si", name = "O", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1404 = Static64.method1101(" is already on your ignore list)3");

	@OriginalMember(owner = "client!si", name = "N", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1403 = aClass51_1404;

	@OriginalMember(owner = "client!si", name = "P", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1405 = Static64.method1101("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!si", name = "R", descriptor = "[[S")
	public static short[][] aShortArrayArray5 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V")
	public static void method3164() {
		try {
			if (Static16.anInt386 == 0) {
				if (Static192.aClass11_36 != null) {
					Static192.aClass11_36.method271();
					Static192.aClass11_36 = null;
				}
				Static72.aClass38_4 = null;
				Static16.anInt386 = 1;
				Static188.anInt4068 = 0;
				Static200.aBoolean192 = false;
			}
			if (Static16.anInt386 == 1) {
				if (Static72.aClass38_4 == null) {
					Static72.aClass38_4 = Static51.aClass72_3.method2254(Static161.aString6, Static192.anInt4167);
				}
				if (Static72.aClass38_4.anInt1236 == 2) {
					throw new IOException();
				}
				if (Static72.aClass38_4.anInt1236 == 1) {
					Static192.aClass11_36 = new Class11((Socket) Static72.aClass38_4.anObject3, Static51.aClass72_3);
					Static72.aClass38_4 = null;
					Static16.anInt386 = 2;
				}
			}
			if (Static16.anInt386 == 2) {
				@Pc(72) long local72 = Static59.aLong44 = Static81.aClass51_605.method1388();
				Static167.aClass1_Sub16_Sub1_2.anInt4860 = 0;
				Static167.aClass1_Sub16_Sub1_2.method3765(14);
				@Pc(86) int local86 = (int) (local72 >> 16 & 0x1FL);
				Static167.aClass1_Sub16_Sub1_2.method3765(local86);
				Static192.aClass11_36.method269(2, Static167.aClass1_Sub16_Sub1_2.aByteArray62);
				Static225.aClass1_Sub16_Sub1_4.anInt4860 = 0;
				Static16.anInt386 = 3;
			}
			@Pc(121) int local121;
			if (Static16.anInt386 == 3) {
				if (Static200.aClass42_2 != null) {
					Static200.aClass42_2.method2734();
				}
				if (Static92.aClass42_1 != null) {
					Static92.aClass42_1.method2734();
				}
				local121 = Static192.aClass11_36.method275();
				if (Static200.aClass42_2 != null) {
					Static200.aClass42_2.method2734();
				}
				if (Static92.aClass42_1 != null) {
					Static92.aClass42_1.method2734();
				}
				if (local121 != 0) {
					Static153.method2618(local121);
					return;
				}
				Static16.anInt386 = 4;
				Static225.aClass1_Sub16_Sub1_4.anInt4860 = 0;
			}
			if (Static16.anInt386 == 4) {
				if (Static225.aClass1_Sub16_Sub1_4.anInt4860 < 8) {
					local121 = Static192.aClass11_36.method273();
					if (local121 > 8 - Static225.aClass1_Sub16_Sub1_4.anInt4860) {
						local121 = 8 - Static225.aClass1_Sub16_Sub1_4.anInt4860;
					}
					if (local121 > 0) {
						Static192.aClass11_36.method274(Static225.aClass1_Sub16_Sub1_4.aByteArray62, Static225.aClass1_Sub16_Sub1_4.anInt4860, local121);
						Static225.aClass1_Sub16_Sub1_4.anInt4860 += local121;
					}
				}
				if (Static225.aClass1_Sub16_Sub1_4.anInt4860 == 8) {
					Static225.aClass1_Sub16_Sub1_4.anInt4860 = 0;
					Static111.aLong88 = Static225.aClass1_Sub16_Sub1_4.method3791();
					Static16.anInt386 = 5;
				}
			}
			if (Static16.anInt386 == 5) {
				Static167.aClass1_Sub16_Sub1_2.anInt4860 = 0;
				@Pc(208) int[] local208 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static111.aLong88 >> 32), (int) Static111.aLong88 };
				Static167.aClass1_Sub16_Sub1_2.method3765(10);
				Static167.aClass1_Sub16_Sub1_2.method3808(local208[0]);
				Static167.aClass1_Sub16_Sub1_2.method3808(local208[1]);
				Static167.aClass1_Sub16_Sub1_2.method3808(local208[2]);
				Static167.aClass1_Sub16_Sub1_2.method3808(local208[3]);
				Static167.aClass1_Sub16_Sub1_2.method3786(Static81.aClass51_605.method1388());
				Static167.aClass1_Sub16_Sub1_2.method3810(Static81.aClass51_606);
				Static167.aClass1_Sub16_Sub1_2.method3780(Static66.aBigInteger4, Static58.aBigInteger3);
				Static124.aClass1_Sub16_Sub1_3.anInt4860 = 0;
				if (Static47.anInt1142 == 40) {
					Static124.aClass1_Sub16_Sub1_3.method3765(18);
				} else {
					Static124.aClass1_Sub16_Sub1_3.method3765(16);
				}
				Static124.aClass1_Sub16_Sub1_3.method3807(Static167.aClass1_Sub16_Sub1_2.anInt4860 + Static7.method104(Static154.aClass51_1193) + 149);
				Static124.aClass1_Sub16_Sub1_3.method3808(503);
				Static124.aClass1_Sub16_Sub1_3.method3765(0);
				Static124.aClass1_Sub16_Sub1_3.method3807(Static185.anInt4016);
				Static124.aClass1_Sub16_Sub1_3.method3807(Static90.anInt4701);
				Static169.method2899(Static124.aClass1_Sub16_Sub1_3);
				Static124.aClass1_Sub16_Sub1_3.method3810(Static154.aClass51_1193);
				Static124.aClass1_Sub16_Sub1_3.method3808(Static14.anInt340);
				Static124.aClass1_Sub16_Sub1_3.method3808(Static21.method466());
				Static151.aBoolean158 = true;
				Static124.aClass1_Sub16_Sub1_3.method3808(Static43.aClass70_Sub1_12.anInt4539);
				Static124.aClass1_Sub16_Sub1_3.method3808(Static103.aClass70_Sub1_70.anInt4539);
				Static124.aClass1_Sub16_Sub1_3.method3808(Static115.aClass70_Sub1_34.anInt4539);
				Static124.aClass1_Sub16_Sub1_3.method3808(Static104.aClass70_Sub1_28.anInt4539);
				Static124.aClass1_Sub16_Sub1_3.method3808(Static128.aClass70_Sub1_69.anInt4539);
				Static124.aClass1_Sub16_Sub1_3.method3808(Static199.aClass70_Sub1_59.anInt4539);
				Static124.aClass1_Sub16_Sub1_3.method3808(Static8.aClass70_Sub1_3.anInt4539);
				Static124.aClass1_Sub16_Sub1_3.method3808(Static181.aClass70_Sub1_51.anInt4539);
				Static124.aClass1_Sub16_Sub1_3.method3808(Static77.aClass70_Sub1_20.anInt4539);
				Static124.aClass1_Sub16_Sub1_3.method3808(Static176.aClass70_Sub1_49.anInt4539);
				Static124.aClass1_Sub16_Sub1_3.method3808(Static183.aClass70_Sub1_53.anInt4539);
				Static124.aClass1_Sub16_Sub1_3.method3808(Static225.aClass70_Sub1_68.anInt4539);
				Static124.aClass1_Sub16_Sub1_3.method3808(Static188.aClass70_Sub1_57.anInt4539);
				Static124.aClass1_Sub16_Sub1_3.method3808(Static216.aClass70_Sub1_66.anInt4539);
				Static124.aClass1_Sub16_Sub1_3.method3808(Static83.aClass70_Sub1_22.anInt4539);
				Static124.aClass1_Sub16_Sub1_3.method3808(Static111.aClass70_Sub1_32.anInt4539);
				Static124.aClass1_Sub16_Sub1_3.method3808(Static186.aClass70_Sub1_55.anInt4539);
				Static124.aClass1_Sub16_Sub1_3.method3808(Static153.aClass70_Sub1_42.anInt4539);
				Static124.aClass1_Sub16_Sub1_3.method3808(Static161.aClass70_Sub1_46.anInt4539);
				Static124.aClass1_Sub16_Sub1_3.method3808(Static184.aClass70_Sub1_54.anInt4539);
				Static124.aClass1_Sub16_Sub1_3.method3808(Static158.aClass70_Sub1_45.anInt4539);
				Static124.aClass1_Sub16_Sub1_3.method3808(Static101.aClass70_Sub1_25.anInt4539);
				Static124.aClass1_Sub16_Sub1_3.method3808(Static28.aClass70_Sub1_8.anInt4539);
				Static124.aClass1_Sub16_Sub1_3.method3808(Static211.aClass70_Sub1_65.anInt4539);
				Static124.aClass1_Sub16_Sub1_3.method3808(Static105.aClass70_Sub1_30.anInt4539);
				Static124.aClass1_Sub16_Sub1_3.method3808(Static16.aClass70_Sub1_5.anInt4539);
				Static124.aClass1_Sub16_Sub1_3.method3808(Static103.aClass70_Sub1_71.anInt4539);
				Static124.aClass1_Sub16_Sub1_3.method3774(Static167.aClass1_Sub16_Sub1_2.anInt4860, Static167.aClass1_Sub16_Sub1_2.aByteArray62);
				Static192.aClass11_36.method269(Static124.aClass1_Sub16_Sub1_3.anInt4860, Static124.aClass1_Sub16_Sub1_3.aByteArray62);
				Static167.aClass1_Sub16_Sub1_2.method3830(local208);
				for (@Pc(502) int local502 = 0; local502 < 4; local502++) {
					local208[local502] += 50;
				}
				Static225.aClass1_Sub16_Sub1_4.method3830(local208);
				Static16.anInt386 = 6;
			}
			if (Static16.anInt386 == 6 && Static192.aClass11_36.method273() > 0) {
				local121 = Static192.aClass11_36.method275();
				if (local121 == 21 && Static47.anInt1142 == 20) {
					Static16.anInt386 = 7;
				} else if (local121 == 2) {
					Static16.anInt386 = 9;
				} else if (local121 == 15 && Static47.anInt1142 == 40) {
					Static79.method1378();
					return;
				} else if (local121 == 23 && Static221.anInt4654 < 1) {
					Static221.anInt4654++;
					Static16.anInt386 = 0;
				} else {
					Static153.method2618(local121);
					return;
				}
			}
			if (Static16.anInt386 == 7 && Static192.aClass11_36.method273() > 0) {
				Static194.anInt4190 = (Static192.aClass11_36.method275() + 3) * 60;
				Static77.anInt1721 = 21;
				Static16.anInt386 = 8;
			}
			if (Static16.anInt386 == 8) {
				if (--Static194.anInt4190 <= 0) {
					Static16.anInt386 = 0;
				}
				Static188.anInt4068 = 0;
			} else {
				if (Static16.anInt386 == 9 && Static192.aClass11_36.method273() >= 9) {
					Static24.anInt604 = Static192.aClass11_36.method275();
					Static23.anInt597 = Static192.aClass11_36.method275();
					Static135.anInt3030 = Static192.aClass11_36.method275();
					if (Static135.anInt3030 == 1) {
						try {
							Static187.aClass51_1380.method1400(Static51.aClass72_3.anApplet1);
						} catch (@Pc(664) Throwable local664) {
						}
					} else {
						try {
							Static225.aClass51_1612.method1400(Static51.aClass72_3.anApplet1);
						} catch (@Pc(654) Throwable local654) {
						}
					}
					Static97.anInt2132 = Static192.aClass11_36.method275();
					Static223.aBoolean211 = Static192.aClass11_36.method275() == 1;
					Static228.anInt4794 = Static192.aClass11_36.method275();
					Static228.anInt4794 <<= 0x8;
					Static228.anInt4794 += Static192.aClass11_36.method275();
					Static106.anInt2351 = Static192.aClass11_36.method275();
					Static192.aClass11_36.method274(Static225.aClass1_Sub16_Sub1_4.aByteArray62, 0, 1);
					Static225.aClass1_Sub16_Sub1_4.anInt4860 = 0;
					Static216.anInt4583 = Static225.aClass1_Sub16_Sub1_4.method3829();
					Static192.aClass11_36.method274(Static225.aClass1_Sub16_Sub1_4.aByteArray62, 0, 2);
					Static225.aClass1_Sub16_Sub1_4.anInt4860 = 0;
					Static142.anInt3128 = Static225.aClass1_Sub16_Sub1_4.method3805();
					Static16.anInt386 = 10;
				}
				if (Static16.anInt386 != 10) {
					Static188.anInt4068++;
					if (Static188.anInt4068 > 2000) {
						if (Static221.anInt4654 < 1) {
							Static221.anInt4654++;
							Static16.anInt386 = 0;
							if (Static13.anInt329 == Static192.anInt4167) {
								Static192.anInt4167 = Static216.anInt4590;
							} else {
								Static192.anInt4167 = Static13.anInt329;
							}
						} else {
							Static153.method2618(-3);
						}
					}
				} else if (Static192.aClass11_36.method273() >= Static142.anInt3128) {
					Static225.aClass1_Sub16_Sub1_4.anInt4860 = 0;
					Static192.aClass11_36.method274(Static225.aClass1_Sub16_Sub1_4.aByteArray62, 0, Static142.anInt3128);
					Static4.method68();
					Static57.anInt1354 = -1;
					Static114.method1909(false);
					Static216.anInt4583 = -1;
				}
			}
		} catch (@Pc(794) IOException local794) {
			if (Static221.anInt4654 < 1) {
				if (Static13.anInt329 == Static192.anInt4167) {
					Static192.anInt4167 = Static216.anInt4590;
				} else {
					Static192.anInt4167 = Static13.anInt329;
				}
				Static16.anInt386 = 0;
				Static221.anInt4654++;
			} else {
				Static153.method2618(-2);
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(Z)V")
	public static void method3165() {
		Static14.anImage1 = null;
		Static228.aFont1 = null;
		Static193.aFontMetrics1 = null;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILjava/lang/String;)Lclient!ia;")
	public static Class51 method3166(@OriginalArg(1) String arg0) {
		@Pc(9) byte[] local9;
		try {
			local9 = arg0.getBytes("ISO-8859-1");
		} catch (@Pc(11) UnsupportedEncodingException local11) {
			local9 = arg0.getBytes();
		}
		@Pc(18) Class51 local18 = new Class51();
		local18.anInt1858 = 0;
		local18.aByteArray17 = local9;
		for (@Pc(31) int local31 = 0; local31 < local9.length; local31++) {
			if (local9[local31] != 0) {
				local9[local18.anInt1858++] = local9[local31];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(II)V")
	public static void method3168(@OriginalArg(0) int arg0) {
		if (Static220.anIntArray361 == null || Static220.anIntArray361.length < arg0) {
			Static220.anIntArray361 = new int[arg0];
		}
	}
}

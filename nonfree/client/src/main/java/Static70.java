import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!mc", name = "lb", descriptor = "I")
	public static int anInt1896;

	@OriginalMember(owner = "client!mc", name = "S", descriptor = "Lclient!je;")
	public static Class40 aClass40_935 = Static69.method1231("<col=40ff00>");

	@OriginalMember(owner = "client!mc", name = "U", descriptor = "I")
	public static int anInt1886 = 1;

	@OriginalMember(owner = "client!mc", name = "V", descriptor = "[Lclient!ee;")
	public static Class20[] aClass20Array1 = new Class20[4];

	@OriginalMember(owner = "client!mc", name = "eb", descriptor = "Lclient!je;")
	private static Class40 aClass40_938 = Static69.method1231("Use");

	@OriginalMember(owner = "client!mc", name = "W", descriptor = "Lclient!je;")
	public static Class40 aClass40_936 = aClass40_938;

	@OriginalMember(owner = "client!mc", name = "X", descriptor = "I")
	public static int anInt1887 = 0;

	@OriginalMember(owner = "client!mc", name = "Y", descriptor = "I")
	public static int anInt1888 = 0;

	@OriginalMember(owner = "client!mc", name = "bb", descriptor = "Lclient!je;")
	public static Class40 aClass40_937 = Static69.method1231("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!mc", name = "mb", descriptor = "Lclient!je;")
	private static Class40 aClass40_942 = Static69.method1231("You can(Wt add yourself to your own ignore list");

	@OriginalMember(owner = "client!mc", name = "fb", descriptor = "Lclient!je;")
	public static Class40 aClass40_939 = aClass40_942;

	@OriginalMember(owner = "client!mc", name = "gb", descriptor = "Lclient!je;")
	public static Class40 aClass40_940 = Static69.method1231("leuchten1:");

	@OriginalMember(owner = "client!mc", name = "hb", descriptor = "Lclient!je;")
	public static Class40 aClass40_941 = Static69.method1231("sl_flags");

	@OriginalMember(owner = "client!mc", name = "nb", descriptor = "I")
	public static int anInt1897 = 0;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V")
	public static void method1215() {
		aClass40_936 = null;
		aClass20Array1 = null;
		aClass40_940 = null;
		aClass40_941 = null;
		aClass40_942 = null;
		aClass40_937 = null;
		aClass40_938 = null;
		aClass40_939 = null;
		aClass40_935 = null;
	}

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)Z")
	public static boolean method1216() {
		if (Static85.aClass57_2 == null) {
			return false;
		}
		@Pc(156) int local156;
		try {
			@Pc(13) int local13 = Static85.aClass57_2.method1597();
			if (local13 == 0) {
				return false;
			}
			if (Static35.anInt825 == -1) {
				local13--;
				Static85.aClass57_2.method1592(Static7.aClass2_Sub9_Sub1_1.aByteArray16, 1, 0);
				Static7.aClass2_Sub9_Sub1_1.anInt976 = 0;
				Static35.anInt825 = Static7.aClass2_Sub9_Sub1_1.method670();
				Static130.anInt3009 = Static38.anIntArray99[Static35.anInt825];
			}
			if (Static130.anInt3009 == -1) {
				if (local13 <= 0) {
					return false;
				}
				local13--;
				Static85.aClass57_2.method1592(Static7.aClass2_Sub9_Sub1_1.aByteArray16, 1, 0);
				Static130.anInt3009 = Static7.aClass2_Sub9_Sub1_1.aByteArray16[0] & 0xFF;
			}
			if (Static130.anInt3009 == -2) {
				if (local13 <= 1) {
					return false;
				}
				Static85.aClass57_2.method1592(Static7.aClass2_Sub9_Sub1_1.aByteArray16, 2, 0);
				local13 -= 2;
				Static7.aClass2_Sub9_Sub1_1.anInt976 = 0;
				Static130.anInt3009 = Static7.aClass2_Sub9_Sub1_1.method632();
			}
			if (local13 < Static130.anInt3009) {
				return false;
			}
			Static7.aClass2_Sub9_Sub1_1.anInt976 = 0;
			Static85.aClass57_2.method1592(Static7.aClass2_Sub9_Sub1_1.aByteArray16, Static130.anInt3009, 0);
			Static58.anInt1520 = 0;
			Static39.anInt1057 = Static15.anInt297;
			Static15.anInt297 = Static116.anInt2705;
			Static116.anInt2705 = Static35.anInt825;
			@Pc(129) int local129;
			if (Static35.anInt825 == 179) {
				local129 = Static7.aClass2_Sub9_Sub1_1.method639();
				if (local129 == 65535) {
					local129 = -1;
				}
				Static126.method2092(local129);
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 20) {
				local129 = Static7.aClass2_Sub9_Sub1_1.method655();
				local156 = Static7.aClass2_Sub9_Sub1_1.method621();
				if (local156 == 65535) {
					local156 = -1;
				}
				Static24.method2215(local156, local129);
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 213) {
				Static23.anInt652 = Static7.aClass2_Sub9_Sub1_1.method640();
				Static14.anInt279 = Static7.aClass2_Sub9_Sub1_1.method640();
				Static133.anInt3072 = Static7.aClass2_Sub9_Sub1_1.method640();
				Static35.anInt825 = -1;
				return true;
			}
			@Pc(257) int local257;
			@Pc(209) Class2_Sub13 local209;
			@Pc(224) int local224;
			@Pc(251) int local251;
			@Pc(261) int local261;
			if (Static35.anInt825 == 8) {
				local129 = Static7.aClass2_Sub9_Sub1_1.method622();
				local156 = Static7.aClass2_Sub9_Sub1_1.method632();
				if (local129 >= 0) {
					local209 = Static55.method972(local129);
				} else {
					local209 = null;
				}
				if (local129 < -70000) {
					local156 += 32768;
				}
				if (local209 != null) {
					for (local224 = 0; local224 < local209.anIntArray161.length; local224++) {
						local209.anIntArray161[local224] = 0;
						local209.anIntArray154[local224] = 0;
					}
				}
				Static38.method684(local156);
				local224 = Static7.aClass2_Sub9_Sub1_1.method632();
				for (local251 = 0; local251 < local224; local251++) {
					local257 = Static7.aClass2_Sub9_Sub1_1.method621();
					local261 = Static7.aClass2_Sub9_Sub1_1.method614();
					if (local261 == 255) {
						local261 = Static7.aClass2_Sub9_Sub1_1.method637();
					}
					if (local209 != null && local251 < local209.anIntArray161.length) {
						local209.anIntArray161[local251] = local257;
						local209.anIntArray154[local251] = local261;
					}
					Static21.method403(local156, local261, local257 - 1, local251);
				}
				if (local209 != null) {
					Static17.method316(local209);
				}
				Static47.method864();
				Static106.anIntArray288[Static5.anInt159++ & 0x1F] = local156 & 0x7FFF;
				Static35.anInt825 = -1;
				return true;
			}
			@Pc(343) Class40 local343;
			if (Static35.anInt825 == 82) {
				local129 = Static7.aClass2_Sub9_Sub1_1.method612();
				local156 = Static7.aClass2_Sub9_Sub1_1.method614();
				local343 = Static7.aClass2_Sub9_Sub1_1.method625();
				if (local129 >= 1 && local129 <= 8) {
					if (local343.method984(Static12.aClass40_1633)) {
						local343 = null;
					}
					Static120.aClass40Array20[local129 - 1] = local343;
					Static84.aBooleanArray22[local129 - 1] = local156 == 0;
				}
				Static35.anInt825 = -1;
				return true;
			}
			@Pc(392) Class40 local392;
			if (Static35.anInt825 == 105) {
				local129 = Static7.aClass2_Sub9_Sub1_1.method637();
				local392 = Static7.aClass2_Sub9_Sub1_1.method625();
				local209 = Static55.method972(local129);
				if (!local392.method960(local209.aClass40_768)) {
					local209.aClass40_768 = local392;
					Static17.method316(local209);
				}
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 76) {
				Static102.method1801();
				Static35.anInt825 = -1;
				return false;
			}
			if (Static35.anInt825 == 18) {
				local129 = Static7.aClass2_Sub9_Sub1_1.method622();
				local156 = Static7.aClass2_Sub9_Sub1_1.method632();
				if (local129 < 0) {
					local209 = null;
				} else {
					local209 = Static55.method972(local129);
				}
				if (local129 < -70000) {
					local156 += 32768;
				}
				while (Static130.anInt3009 > Static7.aClass2_Sub9_Sub1_1.anInt976) {
					local224 = Static7.aClass2_Sub9_Sub1_1.method653();
					local251 = Static7.aClass2_Sub9_Sub1_1.method632();
					local257 = 0;
					if (local251 != 0) {
						local257 = Static7.aClass2_Sub9_Sub1_1.method640();
						if (local257 == 255) {
							local257 = Static7.aClass2_Sub9_Sub1_1.method622();
						}
					}
					if (local209 != null && local224 >= 0 && local224 < local209.anIntArray161.length) {
						local209.anIntArray161[local224] = local251;
						local209.anIntArray154[local224] = local257;
					}
					Static21.method403(local156, local257, local251 - 1, local224);
				}
				if (local209 != null) {
					Static17.method316(local209);
				}
				Static47.method864();
				Static106.anIntArray288[Static5.anInt159++ & 0x1F] = local156 & 0x7FFF;
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 228) {
				Static92.method1666(Static7.aClass2_Sub9_Sub1_1, Static130.anInt3009, Static129.aClass59_5);
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 136) {
				local129 = Static7.aClass2_Sub9_Sub1_1.method648();
				local156 = Static7.aClass2_Sub9_Sub1_1.method639();
				local209 = Static55.method972(local129);
				if (local209.anInt1559 != 1 || local209.anInt1562 != local156) {
					local209.anInt1562 = local156;
					local209.anInt1559 = 1;
					Static17.method316(local209);
				}
				Static35.anInt825 = -1;
				return true;
			}
			@Pc(602) int local602;
			if (Static35.anInt825 == 170) {
				local129 = Static7.aClass2_Sub9_Sub1_1.method622();
				local156 = Static7.aClass2_Sub9_Sub1_1.method639();
				local602 = local156 >> 10 & 0x1F;
				local224 = local156 >> 5 & 0x1F;
				@Pc(612) Class2_Sub13 local612 = Static55.method972(local129);
				local251 = local156 & 0x1F;
				local257 = (local251 << 3) + (local224 << 11) + (local602 << 19);
				if (local612.anInt1549 != local257) {
					local612.anInt1549 = local257;
					Static17.method316(local612);
				}
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 25) {
				Static94.method1734(Static7.aClass2_Sub9_Sub1_1);
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 149 || Static35.anInt825 == 129 || Static35.anInt825 == 68 || Static35.anInt825 == 10 || Static35.anInt825 == 107 || Static35.anInt825 == 66 || Static35.anInt825 == 75 || Static35.anInt825 == 22 || Static35.anInt825 == 67 || Static35.anInt825 == 140 || Static35.anInt825 == 24) {
				Static13.method210();
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 192) {
				for (local129 = 0; local129 < Static74.anInt951; local129++) {
					@Pc(720) Class2_Sub1_Sub8 local720 = Static83.method1493(local129);
					if (local720 != null && local720.anInt2025 == 0) {
						Static63.anIntArray56[local129] = 0;
						Static35.anIntArray96[local129] = 0;
					}
				}
				Static47.method864();
				Static74.anInt949 += 32;
				Static35.anInt825 = -1;
				return true;
			}
			@Pc(764) Class2_Sub13 local764;
			if (Static35.anInt825 == 237) {
				local129 = Static7.aClass2_Sub9_Sub1_1.method637();
				local764 = Static55.method972(local129);
				for (local602 = 0; local602 < local764.anIntArray161.length; local602++) {
					local764.anIntArray161[local602] = -1;
					local764.anIntArray161[local602] = 0;
				}
				Static17.method316(local764);
				Static35.anInt825 = -1;
				return true;
			}
			@Pc(798) long local798;
			@Pc(803) long local803;
			@Pc(808) long local808;
			@Pc(822) int local822;
			if (Static35.anInt825 == 42) {
				local798 = Static7.aClass2_Sub9_Sub1_1.method626();
				local803 = Static7.aClass2_Sub9_Sub1_1.method632();
				local808 = Static7.aClass2_Sub9_Sub1_1.method628();
				local261 = Static7.aClass2_Sub9_Sub1_1.method640();
				@Pc(818) long local818 = local808 + (local803 << 32);
				@Pc(820) boolean local820 = false;
				for (local822 = 0; local822 < 100; local822++) {
					if (local818 == Static43.aLongArray6[local822]) {
						local820 = true;
						break;
					}
				}
				if (local261 <= 1) {
					for (@Pc(849) int local849 = 0; local849 < Static75.anInt1945; local849++) {
						if (Static10.aLongArray8[local849] == local798) {
							local820 = true;
							break;
						}
					}
				}
				if (!local820 && Static47.anInt1272 == 0) {
					Static43.aLongArray6[Static28.anInt691] = local818;
					Static28.anInt691 = (Static28.anInt691 + 1) % 100;
					@Pc(893) Class40 local893 = Static82.method1541(Static133.method2226(Static7.aClass2_Sub9_Sub1_1).method967());
					if (local261 == 2 || local261 == 3) {
						Static72.method1228(local893, Static40.method722(new Class40[] { Static118.aClass40_1495, Static74.method665(local798).method965() }), 7);
					} else if (local261 == 1) {
						Static72.method1228(local893, Static40.method722(new Class40[] { Static2.aClass40_71, Static74.method665(local798).method965() }), 7);
					} else {
						Static72.method1228(local893, Static74.method665(local798).method965(), 3);
					}
				}
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 205) {
				Static20.aBoolean47 = true;
				Static84.anInt2250 = Static7.aClass2_Sub9_Sub1_1.method640();
				Static11.anInt234 = Static7.aClass2_Sub9_Sub1_1.method640();
				Static125.anInt2892 = Static7.aClass2_Sub9_Sub1_1.method632();
				Static29.anInt726 = Static7.aClass2_Sub9_Sub1_1.method640();
				Static62.anInt1691 = Static7.aClass2_Sub9_Sub1_1.method640();
				if (Static62.anInt1691 >= 100) {
					local129 = Static84.anInt2250 * 128 + 64;
					local156 = Static11.anInt234 * 128 + 64;
					local602 = Static93.method1730(local129, Static105.anInt2531, local156) - Static125.anInt2892;
					local251 = local602 - Static2.anInt101;
					local224 = local129 - Static83.anInt2155;
					local257 = local156 - Static127.anInt2944;
					local261 = (int) Math.sqrt((double) (local257 * local257 + local224 * local224));
					Static38.anInt1005 = (int) (Math.atan2((double) local251, (double) local261) * 325.949D) & 0x7FF;
					Static67.anInt1832 = (int) (Math.atan2((double) local224, (double) local257) * -325.949D) & 0x7FF;
					if (Static38.anInt1005 < 128) {
						Static38.anInt1005 = 128;
					}
					if (Static38.anInt1005 > 383) {
						Static38.anInt1005 = 383;
					}
				}
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 26) {
				local129 = Static7.aClass2_Sub9_Sub1_1.method637();
				local764 = Static55.method972(local129);
				local764.anInt1559 = 3;
				local764.anInt1562 = Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.aClass41_1.method993();
				Static17.method316(local764);
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 84) {
				local129 = Static7.aClass2_Sub9_Sub1_1.method662();
				local156 = Static7.aClass2_Sub9_Sub1_1.method621();
				local209 = Static55.method972(local129);
				if (local209 != null && local209.anInt1583 == 0) {
					if (local209.anInt1535 - local209.anInt1568 < local156) {
						local156 = local209.anInt1535 - local209.anInt1568;
					}
					if (local156 < 0) {
						local156 = 0;
					}
					if (local209.anInt1598 != local156) {
						local209.anInt1598 = local156;
						Static17.method316(local209);
					}
				}
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 95) {
				local129 = Static7.aClass2_Sub9_Sub1_1.method648();
				Static12.aClass26_69 = Static129.aClass59_5.method1637(local129);
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 45) {
				local129 = Static7.aClass2_Sub9_Sub1_1.method632();
				Static92.anInt2332 = local129;
				Static134.method1097(local129);
				Static15.method237(Static92.anInt2332);
				for (local156 = 0; local156 < 100; local156++) {
					Static64.aBooleanArray17[local156] = true;
				}
				Static35.anInt825 = -1;
				return true;
			}
			@Pc(1355) int local1355;
			@Pc(1239) boolean local1239;
			if (Static35.anInt825 == 193) {
				local798 = Static7.aClass2_Sub9_Sub1_1.method626();
				local602 = Static7.aClass2_Sub9_Sub1_1.method632();
				@Pc(1237) byte local1237 = Static7.aClass2_Sub9_Sub1_1.method658();
				local1239 = false;
				if ((local798 & Long.MIN_VALUE) != 0L) {
					local1239 = true;
				}
				if (local1239) {
					if (Static87.anInt1327 == 0) {
						Static35.anInt825 = -1;
						return true;
					}
					local798 &= Long.MAX_VALUE;
					for (local257 = 0; Static87.anInt1327 > local257 && (local798 != Static115.aClass2_Sub16Array1[local257].aLong100 || Static115.aClass2_Sub16Array1[local257].anInt1943 != local602); local257++) {
					}
					if (local257 < Static87.anInt1327) {
						while (Static87.anInt1327 - 1 > local257) {
							Static115.aClass2_Sub16Array1[local257] = Static115.aClass2_Sub16Array1[local257 + 1];
							local257++;
						}
						Static115.aClass2_Sub16Array1[Static87.anInt1327] = null;
						Static87.anInt1327--;
					}
				} else {
					@Pc(1325) Class2_Sub16 local1325 = new Class2_Sub16();
					local1325.aLong100 = local798;
					local1325.aClass40_971 = Static74.method665(local1325.aLong100);
					local1325.aByte4 = local1237;
					local1325.anInt1943 = local602;
					for (local261 = Static87.anInt1327 - 1; local261 >= 0; local261--) {
						local1355 = Static115.aClass2_Sub16Array1[local261].aClass40_971.method976(local1325.aClass40_971);
						if (local1355 == 0) {
							Static115.aClass2_Sub16Array1[local261].anInt1943 = local602;
							Static115.aClass2_Sub16Array1[local261].aByte4 = local1237;
							if (Static33.aLong75 == local798) {
								Static76.aByte5 = local1237;
							}
							Static16.anInt409 = anInt1886;
							Static35.anInt825 = -1;
							return true;
						}
						if (local1355 < 0) {
							break;
						}
					}
					if (Static115.aClass2_Sub16Array1.length <= Static87.anInt1327) {
						Static35.anInt825 = -1;
						return true;
					}
					for (local1355 = Static87.anInt1327 - 1; local1355 > local261; local1355--) {
						Static115.aClass2_Sub16Array1[local1355 + 1] = Static115.aClass2_Sub16Array1[local1355];
					}
					if (Static87.anInt1327 == 0) {
						Static115.aClass2_Sub16Array1 = new Class2_Sub16[100];
					}
					Static115.aClass2_Sub16Array1[local261 + 1] = local1325;
					Static87.anInt1327++;
					if (Static33.aLong75 == local798) {
						Static76.aByte5 = local1237;
					}
				}
				Static16.anInt409 = anInt1886;
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 21) {
				local129 = Static7.aClass2_Sub9_Sub1_1.method632();
				local156 = Static7.aClass2_Sub9_Sub1_1.method640();
				local602 = Static7.aClass2_Sub9_Sub1_1.method632();
				Static61.method1111(local602, local129, local156);
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 165) {
				Static109.anInt2952 = Static7.aClass2_Sub9_Sub1_1.method640();
				Static57.anInt1501 = Static7.aClass2_Sub9_Sub1_1.method614();
				for (local129 = Static57.anInt1501; local129 < Static57.anInt1501 + 8; local129++) {
					for (local156 = Static109.anInt2952; local156 < Static109.anInt2952 + 8; local156++) {
						if (Static81.aClass3ArrayArrayArray1[Static105.anInt2531][local129][local156] != null) {
							Static81.aClass3ArrayArrayArray1[Static105.anInt2531][local129][local156] = null;
							Static83.method1495(local129, local156);
						}
					}
				}
				for (@Pc(1536) Class2_Sub22 local1536 = (Class2_Sub22) Static19.aClass3_4.method82(); local1536 != null; local1536 = (Class2_Sub22) Static19.aClass3_4.method74()) {
					if (local1536.anInt2642 >= Static57.anInt1501 && local1536.anInt2642 < Static57.anInt1501 + 8 && Static109.anInt2952 <= local1536.anInt2653 && local1536.anInt2653 < Static109.anInt2952 + 8 && local1536.anInt2647 == Static105.anInt2531) {
						local1536.anInt2652 = 0;
					}
				}
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 222) {
				Static47.method864();
				Static1.anInt12 = Static7.aClass2_Sub9_Sub1_1.method666();
				Static28.anInt699 = anInt1886;
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 29) {
				Static109.anInt2952 = Static7.aClass2_Sub9_Sub1_1.method613();
				Static57.anInt1501 = Static7.aClass2_Sub9_Sub1_1.method613();
				while (Static130.anInt3009 > Static7.aClass2_Sub9_Sub1_1.anInt976) {
					Static35.anInt825 = Static7.aClass2_Sub9_Sub1_1.method640();
					Static13.method210();
				}
				Static35.anInt825 = -1;
				return true;
			}
			@Pc(1651) Class2_Sub13 local1651;
			if (Static35.anInt825 == 173) {
				local129 = Static7.aClass2_Sub9_Sub1_1.method666();
				local156 = Static7.aClass2_Sub9_Sub1_1.method661();
				local602 = Static7.aClass2_Sub9_Sub1_1.method622();
				local1651 = Static55.method972(local602);
				local251 = local1651.anInt1555 + local156;
				local257 = local129 + local1651.anInt1573;
				if (local1651.anInt1591 != local251 || local257 != local1651.anInt1545) {
					local1651.anInt1591 = local251;
					local1651.anInt1545 = local257;
					Static17.method316(local1651);
				}
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 164) {
				Static45.method816();
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 181) {
				Static20.aBoolean47 = true;
				Static3.anInt114 = Static7.aClass2_Sub9_Sub1_1.method640();
				Static116.anInt2704 = Static7.aClass2_Sub9_Sub1_1.method640();
				Static24.anInt3056 = Static7.aClass2_Sub9_Sub1_1.method632();
				Static120.anInt2826 = Static7.aClass2_Sub9_Sub1_1.method640();
				Static66.anInt1737 = Static7.aClass2_Sub9_Sub1_1.method640();
				if (Static66.anInt1737 >= 100) {
					Static127.anInt2944 = Static116.anInt2704 * 128 + 64;
					Static83.anInt2155 = Static3.anInt114 * 128 + 64;
					Static2.anInt101 = Static93.method1730(Static83.anInt2155, Static105.anInt2531, Static127.anInt2944) - Static24.anInt3056;
				}
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 32) {
				Static103.anInt2510 = Static7.aClass2_Sub9_Sub1_1.method640();
				Static35.anInt825 = -1;
				Static21.anInt643 = anInt1886;
				return true;
			}
			if (Static35.anInt825 == 208) {
				local129 = Static7.aClass2_Sub9_Sub1_1.method622();
				@Pc(1779) boolean local1779 = Static7.aClass2_Sub9_Sub1_1.method613() == 1;
				local209 = Static55.method972(local129);
				if (local1779 != local209.aBoolean118) {
					local209.aBoolean118 = local1779;
					Static17.method316(local209);
				}
				Static35.anInt825 = -1;
				return true;
			}
			@Pc(1829) Class2_Sub11 local1829;
			if (Static35.anInt825 == 195) {
				local129 = Static7.aClass2_Sub9_Sub1_1.method648();
				local156 = Static7.aClass2_Sub9_Sub1_1.method613();
				local602 = Static7.aClass2_Sub9_Sub1_1.method621();
				local1829 = (Class2_Sub11) Static61.aClass77_6.method2034((long) local129);
				if (local1829 != null) {
					Static50.method891(local602 != local1829.anInt1313, local1829);
				}
				Static54.method946(local129, local156, local602);
				Static35.anInt825 = -1;
				return true;
			}
			@Pc(1969) int local1969;
			if (Static35.anInt825 == 63) {
				Static16.anInt409 = anInt1886;
				local798 = Static7.aClass2_Sub9_Sub1_1.method626();
				if (local798 == 0L) {
					Static59.aClass40_774 = null;
					Static87.anInt1327 = 0;
					Static35.anInt825 = -1;
					Static11.aClass40_200 = null;
					Static115.aClass2_Sub16Array1 = null;
					return true;
				}
				local803 = Static7.aClass2_Sub9_Sub1_1.method626();
				Static59.aClass40_774 = Static74.method665(local803);
				Static11.aClass40_200 = Static74.method665(local798);
				Static67.aByte3 = Static7.aClass2_Sub9_Sub1_1.method658();
				local251 = Static7.aClass2_Sub9_Sub1_1.method640();
				if (local251 == 255) {
					Static35.anInt825 = -1;
					return true;
				}
				Static87.anInt1327 = local251;
				@Pc(1908) Class2_Sub16[] local1908 = new Class2_Sub16[100];
				for (local261 = 0; local261 < Static87.anInt1327; local261++) {
					local1908[local261] = new Class2_Sub16();
					local1908[local261].aLong100 = Static7.aClass2_Sub9_Sub1_1.method626();
					local1908[local261].aClass40_971 = Static74.method665(local1908[local261].aLong100);
					local1908[local261].anInt1943 = Static7.aClass2_Sub9_Sub1_1.method632();
					local1908[local261].aByte4 = Static7.aClass2_Sub9_Sub1_1.method658();
					if (Static33.aLong75 == local1908[local261].aLong100) {
						Static76.aByte5 = local1908[local261].aByte4;
					}
				}
				local1969 = Static87.anInt1327;
				while (local1969 > 0) {
					@Pc(1973) boolean local1973 = true;
					local1969--;
					for (local822 = 0; local822 < local1969; local822++) {
						if (local1908[local822].aClass40_971.method976(local1908[local822 + 1].aClass40_971) > 0) {
							@Pc(1995) Class2_Sub16 local1995 = local1908[local822];
							local1973 = false;
							local1908[local822] = local1908[local822 + 1];
							local1908[local822 + 1] = local1995;
						}
					}
					if (local1973) {
						break;
					}
				}
				Static115.aClass2_Sub16Array1 = local1908;
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 101) {
				for (local129 = 0; local129 < Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2.length; local129++) {
					if (Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[local129] != null) {
						Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[local129].anInt1817 = -1;
					}
				}
				for (local156 = 0; local156 < Static127.aClass2_Sub1_Sub1_Sub3_Sub1Array1.length; local156++) {
					if (Static127.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local156] != null) {
						Static127.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local156].anInt1817 = -1;
					}
				}
				Static35.anInt825 = -1;
				return true;
			}
			@Pc(2091) Class40 local2091;
			if (Static35.anInt825 == 211) {
				local2091 = Static7.aClass2_Sub9_Sub1_1.method625();
				if (local2091.method957(Static29.aClass40_425)) {
					local392 = local2091.method953(0, local2091.method977(Static106.aClass40_1364));
					local803 = local392.method981();
					local1239 = false;
					for (local257 = 0; local257 < Static75.anInt1945; local257++) {
						if (Static10.aLongArray8[local257] == local803) {
							local1239 = true;
							break;
						}
					}
					if (!local1239 && Static47.anInt1272 == 0) {
						Static72.method1228(Static111.aClass40_1404, local392, 4);
					}
				} else if (local2091.method957(Static69.aClass40_949)) {
					local392 = local2091.method953(0, local2091.method977(Static106.aClass40_1364));
					local803 = local392.method981();
					local1239 = false;
					for (local257 = 0; local257 < Static75.anInt1945; local257++) {
						if (Static10.aLongArray8[local257] == local803) {
							local1239 = true;
							break;
						}
					}
					if (!local1239 && Static47.anInt1272 == 0) {
						Static72.method1228(Static130.aClass40_1608, local392, 8);
					}
				} else if (local2091.method957(Static92.aClass40_1218)) {
					local392 = local2091.method953(0, local2091.method977(Static106.aClass40_1364));
					local803 = local392.method981();
					local1239 = false;
					for (local257 = 0; local257 < Static75.anInt1945; local257++) {
						if (local803 == Static10.aLongArray8[local257]) {
							local1239 = true;
							break;
						}
					}
					if (!local1239 && Static47.anInt1272 == 0) {
						@Pc(2387) Class40 local2387 = local2091.method953(local2091.method977(Static106.aClass40_1364) + 1, local2091.method950() + -9);
						Static72.method1228(local2387, local392, 8);
					}
				} else if (local2091.method957(Static117.aClass40_1474)) {
					local392 = local2091.method953(0, local2091.method977(Static106.aClass40_1364));
					local803 = local392.method981();
					local1239 = false;
					for (local257 = 0; local257 < Static75.anInt1945; local257++) {
						if (Static10.aLongArray8[local257] == local803) {
							local1239 = true;
							break;
						}
					}
					if (!local1239 && Static47.anInt1272 == 0) {
						Static72.method1228(Static43.aClass40_568, local392, 10);
					}
				} else if (local2091.method957(Static101.aClass40_1322)) {
					local392 = local2091.method953(0, local2091.method977(Static101.aClass40_1322));
					Static72.method1228(local392, Static43.aClass40_568, 11);
				} else if (local2091.method957(Static39.aClass40_555)) {
					local392 = local2091.method953(0, local2091.method977(Static39.aClass40_555));
					if (Static47.anInt1272 == 0) {
						Static72.method1228(local392, Static43.aClass40_568, 12);
					}
				} else if (local2091.method957(Static21.aClass40_360)) {
					local392 = local2091.method953(0, local2091.method977(Static21.aClass40_360));
					if (Static47.anInt1272 == 0) {
						Static72.method1228(local392, Static43.aClass40_568, 13);
					}
				} else {
					Static72.method1228(local2091, Static43.aClass40_568, 0);
				}
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 71) {
				Static75.anInt1945 = Static130.anInt3009 / 8;
				for (local129 = 0; local129 < Static75.anInt1945; local129++) {
					Static10.aLongArray8[local129] = Static7.aClass2_Sub9_Sub1_1.method626();
					Static56.aClass40Array5[local129] = Static74.method665(Static10.aLongArray8[local129]);
				}
				Static35.anInt825 = -1;
				Static21.anInt643 = anInt1886;
				return true;
			}
			@Pc(2466) int local2466;
			@Pc(2499) int local2499;
			@Pc(2472) long local2472;
			if (Static35.anInt825 == 232) {
				local798 = Static7.aClass2_Sub9_Sub1_1.method626();
				Static7.aClass2_Sub9_Sub1_1.method658();
				local803 = Static7.aClass2_Sub9_Sub1_1.method626();
				local808 = Static7.aClass2_Sub9_Sub1_1.method632();
				@Pc(2462) long local2462 = (long) Static7.aClass2_Sub9_Sub1_1.method628();
				local2466 = Static7.aClass2_Sub9_Sub1_1.method640();
				local2472 = local2462 + (local808 << 32);
				@Pc(2474) boolean local2474 = false;
				for (@Pc(2476) int local2476 = 0; local2476 < 100; local2476++) {
					if (local2472 == Static43.aLongArray6[local2476]) {
						local2474 = true;
						break;
					}
				}
				if (local2466 <= 1) {
					for (local2499 = 0; local2499 < Static75.anInt1945; local2499++) {
						if (Static10.aLongArray8[local2499] == local798) {
							local2474 = true;
							break;
						}
					}
				}
				if (!local2474 && Static47.anInt1272 == 0) {
					Static43.aLongArray6[Static28.anInt691] = local2472;
					Static28.anInt691 = (Static28.anInt691 + 1) % 100;
					@Pc(2543) Class40 local2543 = Static82.method1541(Static133.method2226(Static7.aClass2_Sub9_Sub1_1).method967());
					if (local2466 == 2 || local2466 == 3) {
						Static56.method1001(9, Static74.method665(local803).method965(), Static40.method722(new Class40[] { Static118.aClass40_1495, Static74.method665(local798).method965() }), local2543);
					} else if (local2466 == 1) {
						Static56.method1001(9, Static74.method665(local803).method965(), Static40.method722(new Class40[] { Static2.aClass40_71, Static74.method665(local798).method965() }), local2543);
					} else {
						Static56.method1001(9, Static74.method665(local803).method965(), Static74.method665(local798).method965(), local2543);
					}
				}
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 227) {
				Static27.anInt680 = Static7.aClass2_Sub9_Sub1_1.method640();
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 206) {
				Static47.method864();
				local129 = Static7.aClass2_Sub9_Sub1_1.method648();
				local156 = Static7.aClass2_Sub9_Sub1_1.method612();
				local602 = Static7.aClass2_Sub9_Sub1_1.method614();
				Static111.anIntArray294[local156] = local129;
				Static112.anIntArray297[local156] = local602;
				Static40.anIntArray109[local156] = 1;
				for (local224 = 0; local224 < 98; local224++) {
					if (local129 >= Class2_Sub10.anIntArray132[local224]) {
						Static40.anIntArray109[local156] = local224 + 2;
					}
				}
				Static52.anIntArray142[Static34.anInt812++ & 0x1F] = local156;
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 188) {
				Static20.aBoolean47 = false;
				for (local129 = 0; local129 < 5; local129++) {
					Static126.aBooleanArray25[local129] = false;
				}
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 246) {
				local129 = Static7.aClass2_Sub9_Sub1_1.method640();
				local156 = Static7.aClass2_Sub9_Sub1_1.method640();
				local602 = Static7.aClass2_Sub9_Sub1_1.method640();
				local224 = Static7.aClass2_Sub9_Sub1_1.method640();
				Static126.aBooleanArray25[local129] = true;
				Static73.anIntArray203[local129] = local156;
				Static95.anIntArray264[local129] = local602;
				Static33.anIntArray303[local129] = local224;
				Static95.anIntArray263[local129] = 0;
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 233) {
				Static66.anInt1743 = 0;
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 234) {
				local129 = Static7.aClass2_Sub9_Sub1_1.method639();
				Static72.method1229(local129);
				Static106.anIntArray288[Static5.anInt159++ & 0x1F] = local129 & 0x7FFF;
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 168) {
				for (local129 = 0; local129 < Static35.anIntArray96.length; local129++) {
					if (Static35.anIntArray96[local129] != Static63.anIntArray56[local129]) {
						Static35.anIntArray96[local129] = Static63.anIntArray56[local129];
						Static48.method871(local129);
						Static26.anIntArray78[Static74.anInt949++ & 0x1F] = local129;
					}
				}
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 16) {
				Static87.method895(true);
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 157) {
				local129 = Static130.anInt3009 + Static7.aClass2_Sub9_Sub1_1.anInt976;
				local156 = Static7.aClass2_Sub9_Sub1_1.method632();
				local602 = Static7.aClass2_Sub9_Sub1_1.method632();
				if (Static92.anInt2332 != local156) {
					Static92.anInt2332 = local156;
					Static134.method1097(Static92.anInt2332);
					Static15.method237(Static92.anInt2332);
					for (local224 = 0; local224 < 100; local224++) {
						Static64.aBooleanArray17[local224] = true;
					}
				}
				while (local602-- > 0) {
					local224 = Static7.aClass2_Sub9_Sub1_1.method622();
					local251 = Static7.aClass2_Sub9_Sub1_1.method632();
					local257 = Static7.aClass2_Sub9_Sub1_1.method640();
					@Pc(2928) Class2_Sub11 local2928 = (Class2_Sub11) Static61.aClass77_6.method2034((long) local224);
					if (local2928 != null && local2928.anInt1313 != local251) {
						Static50.method891(true, local2928);
						local2928 = null;
					}
					if (local2928 == null) {
						local2928 = Static54.method946(local224, local257, local251);
					}
					local2928.aBoolean93 = true;
				}
				for (local1829 = (Class2_Sub11) Static61.aClass77_6.method2031(); local1829 != null; local1829 = (Class2_Sub11) Static61.aClass77_6.method2039()) {
					if (local1829.aBoolean93) {
						local1829.aBoolean93 = false;
					} else {
						Static50.method891(true, local1829);
					}
				}
				Static105.aClass77_11 = new Class77(512);
				while (local129 > Static7.aClass2_Sub9_Sub1_1.anInt976) {
					local251 = Static7.aClass2_Sub9_Sub1_1.method622();
					local257 = Static7.aClass2_Sub9_Sub1_1.method632();
					local261 = Static7.aClass2_Sub9_Sub1_1.method632();
					local1355 = Static7.aClass2_Sub9_Sub1_1.method622();
					for (local2466 = local257; local2466 <= local261; local2466++) {
						local2472 = (long) local2466 + ((long) local251 << 32);
						Static105.aClass77_11.method2030(local2472, new Class2_Sub15(local1355));
					}
				}
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 241) {
				Static47.method864();
				Static54.anInt1414 = Static7.aClass2_Sub9_Sub1_1.method640();
				Static35.anInt825 = -1;
				Static28.anInt699 = anInt1886;
				return true;
			}
			if (Static35.anInt825 == 162) {
				if (Static92.anInt2332 != -1) {
					Static74.method627(0, Static92.anInt2332);
				}
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 196) {
				local129 = Static7.aClass2_Sub9_Sub1_1.method650();
				if (local129 == 65535) {
					local129 = -1;
				}
				local156 = Static7.aClass2_Sub9_Sub1_1.method637();
				local602 = Static7.aClass2_Sub9_Sub1_1.method637();
				local224 = Static7.aClass2_Sub9_Sub1_1.method650();
				if (local224 == 65535) {
					local224 = -1;
				}
				for (local251 = local129; local251 <= local224; local251++) {
					@Pc(3123) long local3123 = ((long) local602 << 32) + ((long) local251);
					@Pc(3128) Class2 local3128 = Static105.aClass77_11.method2034(local3123);
					if (local3128 != null) {
						local3128.method2209();
					}
					Static105.aClass77_11.method2030(local3123, new Class2_Sub15(local156));
				}
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 1) {
				local129 = Static7.aClass2_Sub9_Sub1_1.method650();
				local156 = Static7.aClass2_Sub9_Sub1_1.method639();
				local602 = Static7.aClass2_Sub9_Sub1_1.method662();
				local1651 = Static55.method972(local602);
				local1651.anInt1588 = local156 + (local129 << 16);
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 15) {
				local129 = Static7.aClass2_Sub9_Sub1_1.method649();
				local156 = Static7.aClass2_Sub9_Sub1_1.method648();
				local209 = Static55.method972(local156);
				if (local209.anInt1575 != local129 || local129 == -1) {
					local209.anInt1575 = local129;
					local209.anInt1595 = 0;
					local209.anInt1582 = 0;
					Static17.method316(local209);
				}
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 14) {
				Static30.anInt730 = Static7.aClass2_Sub9_Sub1_1.method640();
				if (Static30.anInt730 == 1) {
					Static39.anInt1058 = Static7.aClass2_Sub9_Sub1_1.method632();
				}
				if (Static30.anInt730 >= 2 && Static30.anInt730 <= 6) {
					if (Static30.anInt730 == 2) {
						Static35.anInt826 = 64;
						Static16.anInt416 = 64;
					}
					if (Static30.anInt730 == 3) {
						Static35.anInt826 = 0;
						Static16.anInt416 = 64;
					}
					if (Static30.anInt730 == 4) {
						Static16.anInt416 = 64;
						Static35.anInt826 = 128;
					}
					if (Static30.anInt730 == 5) {
						Static35.anInt826 = 64;
						Static16.anInt416 = 0;
					}
					if (Static30.anInt730 == 6) {
						Static16.anInt416 = 128;
						Static35.anInt826 = 64;
					}
					Static30.anInt730 = 2;
					Static63.anInt398 = Static7.aClass2_Sub9_Sub1_1.method632();
					Static62.anInt1685 = Static7.aClass2_Sub9_Sub1_1.method632();
					Static122.anInt2860 = Static7.aClass2_Sub9_Sub1_1.method640();
				}
				if (Static30.anInt730 == 10) {
					Static84.anInt2219 = Static7.aClass2_Sub9_Sub1_1.method632();
				}
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 116) {
				local129 = Static7.aClass2_Sub9_Sub1_1.method621();
				local156 = Static7.aClass2_Sub9_Sub1_1.method639();
				local602 = Static7.aClass2_Sub9_Sub1_1.method648();
				local224 = Static7.aClass2_Sub9_Sub1_1.method621();
				@Pc(3337) Class2_Sub13 local3337 = Static55.method972(local602);
				if (local224 != local3337.anInt1580 || local129 != local3337.anInt1557 || local3337.anInt1539 != local156) {
					local3337.anInt1580 = local224;
					local3337.anInt1539 = local156;
					local3337.anInt1557 = local129;
					Static17.method316(local3337);
				}
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 134) {
				Static109.anInt2952 = Static7.aClass2_Sub9_Sub1_1.method612();
				Static57.anInt1501 = Static7.aClass2_Sub9_Sub1_1.method614();
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 175) {
				local798 = Static7.aClass2_Sub9_Sub1_1.method626();
				local602 = Static7.aClass2_Sub9_Sub1_1.method632();
				local224 = Static7.aClass2_Sub9_Sub1_1.method640();
				@Pc(3416) Class40 local3416 = Static74.method665(local798).method965();
				for (local257 = 0; local257 < Static114.anInt2621; local257++) {
					if (Static88.aLongArray7[local257] == local798) {
						if (Static39.anIntArray104[local257] != local602) {
							Static39.anIntArray104[local257] = local602;
							if (local602 > 0) {
								Static72.method1228(Static40.method722(new Class40[] { local3416, Static18.aClass40_325 }), Static43.aClass40_568, 5);
							}
							if (local602 == 0) {
								Static72.method1228(Static40.method722(new Class40[] { local3416, Static103.aClass40_1338 }), Static43.aClass40_568, 5);
							}
						}
						local3416 = null;
						Static3.anIntArray7[local257] = local224;
						break;
					}
				}
				if (local3416 != null && Static114.anInt2621 < 200) {
					Static88.aLongArray7[Static114.anInt2621] = local798;
					Static85.aClass40Array17[Static114.anInt2621] = local3416;
					Static39.anIntArray104[Static114.anInt2621] = local602;
					Static3.anIntArray7[Static114.anInt2621] = local224;
					Static114.anInt2621++;
				}
				local1355 = Static114.anInt2621;
				Static21.anInt643 = anInt1886;
				while (local1355 > 0) {
					@Pc(3521) boolean local3521 = true;
					local1355--;
					for (local2466 = 0; local2466 < local1355; local2466++) {
						if (Static39.anIntArray104[local2466] != Static15.anInt298 && Static15.anInt298 == Static39.anIntArray104[local2466 + 1] || Static39.anIntArray104[local2466] == 0 && Static39.anIntArray104[local2466 + 1] != 0) {
							local3521 = false;
							local1969 = Static39.anIntArray104[local2466];
							Static39.anIntArray104[local2466] = Static39.anIntArray104[local2466 + 1];
							Static39.anIntArray104[local2466 + 1] = local1969;
							@Pc(3578) Class40 local3578 = Static85.aClass40Array17[local2466];
							Static85.aClass40Array17[local2466] = Static85.aClass40Array17[local2466 + 1];
							Static85.aClass40Array17[local2466 + 1] = local3578;
							@Pc(3596) long local3596 = Static88.aLongArray7[local2466];
							Static88.aLongArray7[local2466] = Static88.aLongArray7[local2466 + 1];
							Static88.aLongArray7[local2466 + 1] = local3596;
							local2499 = Static3.anIntArray7[local2466];
							Static3.anIntArray7[local2466] = Static3.anIntArray7[local2466 + 1];
							Static3.anIntArray7[local2466 + 1] = local2499;
						}
					}
					if (local3521) {
						break;
					}
				}
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 118) {
				local2091 = Static7.aClass2_Sub9_Sub1_1.method625();
				@Pc(3658) Object[] local3658 = new Object[local2091.method950() + 1];
				for (local602 = local2091.method950() - 1; local602 >= 0; local602--) {
					if (local2091.method982(local602) == 115) {
						local3658[local602 + 1] = Static7.aClass2_Sub9_Sub1_1.method625();
					} else {
						local3658[local602 + 1] = Integer.valueOf(Static7.aClass2_Sub9_Sub1_1.method622());
					}
				}
				local3658[0] = Integer.valueOf(Static7.aClass2_Sub9_Sub1_1.method622());
				@Pc(3711) Class2_Sub7 local3711 = new Class2_Sub7();
				local3711.anObjectArray1 = local3658;
				Static58.method1028(local3711);
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 219) {
				local129 = Static7.aClass2_Sub9_Sub1_1.method621();
				local156 = Static7.aClass2_Sub9_Sub1_1.method662();
				Static63.anIntArray56[local129] = local156;
				if (Static35.anIntArray96[local129] != local156) {
					Static35.anIntArray96[local129] = local156;
					Static48.method871(local129);
				}
				Static26.anIntArray78[Static74.anInt949++ & 0x1F] = local129;
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 104) {
				local129 = Static7.aClass2_Sub9_Sub1_1.method622();
				local156 = Static7.aClass2_Sub9_Sub1_1.method632();
				local209 = Static55.method972(local129);
				if (local209.anInt1559 != 2 || local209.anInt1562 != local156) {
					local209.anInt1559 = 2;
					local209.anInt1562 = local156;
					Static17.method316(local209);
				}
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 130) {
				local798 = Static7.aClass2_Sub9_Sub1_1.method626();
				local343 = Static82.method1541(Static133.method2226(Static7.aClass2_Sub9_Sub1_1).method967());
				Static72.method1228(local343, Static74.method665(local798).method965(), 6);
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 198) {
				Static87.method895(false);
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 145) {
				local129 = Static7.aClass2_Sub9_Sub1_1.method613();
				local156 = Static7.aClass2_Sub9_Sub1_1.method614();
				local602 = Static7.aClass2_Sub9_Sub1_1.method612();
				Static105.anInt2531 = local602 >> 1;
				Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.method1176((local602 & 0x1) == 1, local156, local129);
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 178) {
				@Pc(3882) byte local3882 = Static7.aClass2_Sub9_Sub1_1.method630();
				local156 = Static7.aClass2_Sub9_Sub1_1.method650();
				Static63.anIntArray56[local156] = local3882;
				if (local3882 != Static35.anIntArray96[local156]) {
					Static35.anIntArray96[local156] = local3882;
					Static48.method871(local156);
				}
				Static26.anIntArray78[Static74.anInt949++ & 0x1F] = local156;
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 252) {
				local129 = Static7.aClass2_Sub9_Sub1_1.method622();
				@Pc(3932) Class2_Sub11 local3932 = (Class2_Sub11) Static61.aClass77_6.method2034((long) local129);
				if (local3932 != null) {
					Static50.method891(true, local3932);
				}
				if (Static56.aClass2_Sub13_7 != null) {
					Static17.method316(Static56.aClass2_Sub13_7);
					Static56.aClass2_Sub13_7 = null;
				}
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 229) {
				Static1.anInt9 = Static7.aClass2_Sub9_Sub1_1.method621() * 30;
				Static35.anInt825 = -1;
				Static28.anInt699 = anInt1886;
				return true;
			}
			if (Static35.anInt825 == 56) {
				Static124.method2070();
				Static35.anInt825 = -1;
				return true;
			}
			if (Static35.anInt825 == 74) {
				local129 = Static7.aClass2_Sub9_Sub1_1.method621();
				if (local129 == 65535) {
					local129 = -1;
				}
				local156 = Static7.aClass2_Sub9_Sub1_1.method662();
				local602 = Static7.aClass2_Sub9_Sub1_1.method662();
				local1651 = Static55.method972(local156);
				@Pc(4023) Class2_Sub1_Sub10 local4023;
				if (local1651.aBoolean112) {
					local1651.anInt1550 = local129;
					local1651.anInt1565 = local602;
					local4023 = Static102.method1800(local129);
					local1651.anInt1577 = local4023.anInt2218;
					local1651.anInt1557 = local4023.anInt2240;
					local1651.anInt1593 = local4023.anInt2224;
					local1651.anInt1556 = local4023.anInt2222;
					local1651.anInt1539 = local4023.anInt2239;
					local1651.anInt1580 = local4023.anInt2248;
					if (local1651.anInt1599 > 0) {
						local1651.anInt1539 = local1651.anInt1539 * 32 / local1651.anInt1599;
					}
					Static17.method316(local1651);
				} else if (local129 == -1) {
					local1651.anInt1559 = 0;
					Static35.anInt825 = -1;
					return true;
				} else {
					local4023 = Static102.method1800(local129);
					local1651.anInt1557 = local4023.anInt2240;
					local1651.anInt1559 = 4;
					local1651.anInt1580 = local4023.anInt2248;
					local1651.anInt1562 = local129;
					local1651.anInt1539 = local4023.anInt2239 * 100 / local602;
					Static17.method316(local1651);
				}
				Static35.anInt825 = -1;
				return true;
			}
			Static92.method1662(null, "T1 - " + Static35.anInt825 + "," + Static15.anInt297 + "," + Static39.anInt1057 + " - " + Static130.anInt3009);
			Static102.method1801();
		} catch (@Pc(4132) IOException local4132) {
			Static49.method887();
		} catch (@Pc(4136) Exception local4136) {
			@Pc(4176) String local4176 = "T2 - " + Static35.anInt825 + "," + Static15.anInt297 + "," + Static39.anInt1057 + " - " + Static130.anInt3009 + "," + (Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0] + Static107.anInt2546) + "," + (Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0] + Static29.anInt720) + " - ";
			for (local156 = 0; Static130.anInt3009 > local156 && local156 < 50; local156++) {
				local4176 = local4176 + Static7.aClass2_Sub9_Sub1_1.aByteArray16[local156] + ",";
			}
			Static92.method1662(local4136, local4176);
			Static102.method1801();
		}
		return true;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V")
	public static void method1217() {
		Static17.method316(Static38.aClass2_Sub13_5);
		Static114.anInt2620++;
		if (Static73.aBoolean141 && Static25.aBoolean50) {
			@Pc(26) int local26 = Static112.anInt2616;
			local26 -= Static19.anInt615;
			if (local26 < Static75.anInt1947) {
				local26 = Static75.anInt1947;
			}
			@Pc(37) int local37 = Static85.anInt2261;
			if (Static65.aClass2_Sub13_11.anInt1599 + Static75.anInt1947 < local26 - -Static38.aClass2_Sub13_5.anInt1599) {
				local26 = Static65.aClass2_Sub13_11.anInt1599 + Static75.anInt1947 - Static38.aClass2_Sub13_5.anInt1599;
			}
			@Pc(61) int local61 = local26 - Static74.anInt958;
			local37 -= Static122.anInt2859;
			@Pc(73) int local73 = Static65.aClass2_Sub13_11.anInt1606 + local26 - Static75.anInt1947;
			if (Static103.anInt2505 > local37) {
				local37 = Static103.anInt2505;
			}
			@Pc(85) int local85 = Static38.aClass2_Sub13_5.anInt1581;
			if (Static38.aClass2_Sub13_5.anInt1568 + local37 > Static65.aClass2_Sub13_11.anInt1568 + Static103.anInt2505) {
				local37 = Static65.aClass2_Sub13_11.anInt1568 + Static103.anInt2505 - Static38.aClass2_Sub13_5.anInt1568;
			}
			@Pc(117) int local117 = local37 - Static122.anInt2866;
			if (Static114.anInt2620 > Static38.aClass2_Sub13_5.anInt1584 && (local85 < local61 || -local85 > local61 || local85 < local117 || local117 < -local85)) {
				Static45.aBoolean85 = true;
			}
			@Pc(145) int local145 = local37 + Static65.aClass2_Sub13_11.anInt1598 - Static103.anInt2505;
			@Pc(154) Class2_Sub7 local154;
			if (Static38.aClass2_Sub13_5.anObjectArray6 != null && Static45.aBoolean85) {
				local154 = new Class2_Sub7();
				local154.aClass2_Sub13_4 = Static38.aClass2_Sub13_5;
				local154.anObjectArray1 = Static38.aClass2_Sub13_5.anObjectArray6;
				local154.anInt725 = local145;
				local154.anInt722 = local73;
				Static58.method1028(local154);
			}
			if (Static107.anInt2544 == 0) {
				if (Static45.aBoolean85) {
					if (Static38.aClass2_Sub13_5.anObjectArray16 != null) {
						local154 = new Class2_Sub7();
						local154.aClass2_Sub13_4 = Static38.aClass2_Sub13_5;
						local154.anInt725 = local145;
						local154.anInt722 = local73;
						local154.aClass2_Sub13_2 = Static13.aClass2_Sub13_1;
						local154.anObjectArray1 = Static38.aClass2_Sub13_5.anObjectArray16;
						Static58.method1028(local154);
					}
					if (Static13.aClass2_Sub13_1 != null && Static86.method2165(Static38.aClass2_Sub13_5) != null) {
						Static57.aClass2_Sub9_Sub1_2.method673(151);
						Static57.aClass2_Sub9_Sub1_2.method657(Static13.aClass2_Sub13_1.anInt1578);
						Static57.aClass2_Sub9_Sub1_2.method616(Static38.aClass2_Sub13_5.anInt1578);
						Static57.aClass2_Sub9_Sub1_2.method631(Static13.aClass2_Sub13_1.anInt1560);
						Static57.aClass2_Sub9_Sub1_2.method629(Static38.aClass2_Sub13_5.anInt1560);
					}
				} else if ((Static23.anInt650 == 1 || Static54.method947(Static57.anInt1500 - 1)) && Static57.anInt1500 > 2) {
					Static12.method2205();
				} else if (Static57.anInt1500 > 0) {
					Static19.method375(Static57.anInt1500 - 1);
				}
				Static38.aClass2_Sub13_5 = null;
			}
		} else if (Static114.anInt2620 > 1) {
			Static38.aClass2_Sub13_5 = null;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLclient!pc;Z)V")
	public static void method1218(@OriginalArg(1) Class57 arg0, @OriginalArg(2) boolean arg1) {
		if (Static11.aClass57_1 != null) {
			try {
				Static11.aClass57_1.method1596();
			} catch (@Pc(8) Exception local8) {
			}
			Static11.aClass57_1 = null;
		}
		Static11.aClass57_1 = arg0;
		Static111.method1867(arg1);
		Static49.anInt1311 = 0;
		Static1.aClass2_Sub9_1 = null;
		Static120.aClass2_Sub1_Sub12_1 = null;
		Static76.aClass2_Sub9_4.anInt976 = 0;
		while (true) {
			@Pc(33) Class2_Sub1_Sub12 local33 = (Class2_Sub1_Sub12) Static97.aClass77_10.method2031();
			if (local33 == null) {
				while (true) {
					local33 = (Class2_Sub1_Sub12) Static14.aClass77_3.method2031();
					if (local33 == null) {
						if (Static133.aByte8 != 0) {
							try {
								@Pc(92) Class2_Sub9 local92 = new Class2_Sub9(4);
								local92.method644(4);
								local92.method644(Static133.aByte8);
								local92.method657(0);
								Static11.aClass57_1.method1591(local92.aByteArray16, 4);
							} catch (@Pc(113) IOException local113) {
								try {
									Static11.aClass57_1.method1596();
								} catch (@Pc(118) Exception local118) {
								}
								Static15.anInt299++;
								Static11.aClass57_1 = null;
							}
						}
						Static126.anInt2911 = 0;
						Static5.aLong6 = Static125.method2075();
						return;
					}
					Static72.aClass56_1.method1587(local33);
					Static121.aClass77_14.method2030(local33.aLong100, local33);
					Static52.anInt1394--;
					Static121.anInt2842++;
				}
			}
			Static68.aClass77_7.method2030(local33.aLong100, local33);
			Static79.anInt2064++;
			Static47.anInt1280--;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!kd;I)V")
	public static void method1219(@OriginalArg(0) Class2_Sub1_Sub2_Sub1 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static115.anIntArray302.length; local7++) {
			Static115.anIntArray302[local7] = 0;
		}
		@Pc(37) int local37;
		for (@Pc(27) int local27 = 0; local27 < 5000; local27++) {
			local37 = (int) ((double) 256 * 128.0D * Math.random());
			Static115.anIntArray302[local37] = (int) (Math.random() * 256.0D);
		}
		@Pc(56) int local56;
		@Pc(60) int local60;
		@Pc(69) int local69;
		for (local37 = 0; local37 < 20; local37++) {
			for (local56 = 1; local56 < 255; local56++) {
				for (local60 = 1; local60 < 127; local60++) {
					local69 = local60 + (local56 << 7);
					Static14.anIntArray51[local69] = (Static115.anIntArray302[local69 + 128] + Static115.anIntArray302[local69 + 1] + Static115.anIntArray302[local69 + -1] + Static115.anIntArray302[local69 - 128]) / 4;
				}
			}
			@Pc(112) int[] local112 = Static115.anIntArray302;
			Static115.anIntArray302 = Static14.anIntArray51;
			Static14.anIntArray51 = local112;
		}
		if (arg0 == null) {
			return;
		}
		local56 = 0;
		for (local60 = 0; local60 < arg0.anInt1631; local60++) {
			for (local69 = 0; local69 < arg0.anInt1632; local69++) {
				if (arg0.aByteArray19[local56++] != 0) {
					@Pc(147) int local147 = arg0.anInt1630 + local69 + 16;
					@Pc(154) int local154 = arg0.anInt1635 + local60 + 16;
					@Pc(160) int local160 = (local154 << 7) + local147;
					Static115.anIntArray302[local160] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "(I)V")
	public static void method1220() {
		for (@Pc(15) Class2_Sub1_Sub1_Sub6 local15 = (Class2_Sub1_Sub1_Sub6) Static79.aClass3_12.method82(); local15 != null; local15 = (Class2_Sub1_Sub1_Sub6) Static79.aClass3_12.method74()) {
			if (Static105.anInt2531 != local15.anInt1366 || local15.aBoolean98) {
				local15.method2209();
			} else if (local15.anInt1360 <= Static28.anInt704) {
				local15.method919(Static49.anInt1315);
				if (local15.aBoolean98) {
					local15.method2209();
				} else {
					Static111.aClass30_1.method768(local15.anInt1366, local15.anInt1364, local15.anInt1358, local15.anInt1361, 60, local15, 0, -1, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "(I)V")
	public static void method1221() {
		for (@Pc(3) int local3 = 0; local3 < Static58.anInt1521; local3++) {
			@Pc(9) int local9 = Static73.anIntArray202[local3];
			@Pc(13) Class2_Sub1_Sub1_Sub3_Sub1 local13 = Static127.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local9];
			@Pc(17) int local17 = Static7.aClass2_Sub9_Sub1_1.method640();
			if ((local17 & 0x80) != 0) {
				local13.aClass2_Sub1_Sub11_1 = Static87.method896(Static7.aClass2_Sub9_Sub1_1.method639());
				local13.anInt1812 = local13.aClass2_Sub1_Sub11_1.anInt2337;
				local13.anInt1813 = local13.aClass2_Sub1_Sub11_1.anInt2362;
				local13.anInt1786 = local13.aClass2_Sub1_Sub11_1.anInt2347;
				local13.anInt1823 = local13.aClass2_Sub1_Sub11_1.anInt2330;
				local13.anInt1771 = local13.aClass2_Sub1_Sub11_1.anInt2354;
				local13.anInt1822 = local13.aClass2_Sub1_Sub11_1.anInt2336;
				local13.anInt1789 = local13.aClass2_Sub1_Sub11_1.anInt2343;
				local13.anInt1777 = local13.aClass2_Sub1_Sub11_1.anInt2353;
				local13.anInt1796 = local13.aClass2_Sub1_Sub11_1.anInt2355;
			}
			@Pc(85) int local85;
			@Pc(94) int local94;
			if ((local17 & 0x4) != 0) {
				local85 = Static7.aClass2_Sub9_Sub1_1.method621();
				if (local85 == 65535) {
					local85 = -1;
				}
				local94 = Static7.aClass2_Sub9_Sub1_1.method614();
				if (local85 == local13.anInt1817 && local85 != -1) {
					@Pc(111) int local111 = Static40.method724(local85).anInt1972;
					if (local111 == 1) {
						local13.anInt1814 = local94;
						local13.anInt1776 = 0;
						local13.anInt1769 = 0;
						local13.anInt1804 = 0;
					}
					if (local111 == 2) {
						local13.anInt1776 = 0;
					}
				} else if (local85 == -1 || local13.anInt1817 == -1 || Static40.method724(local85).anInt1970 >= Static40.method724(local13.anInt1817).anInt1970) {
					local13.anInt1817 = local85;
					local13.anInt1782 = local13.anInt1779;
					local13.anInt1804 = 0;
					local13.anInt1769 = 0;
					local13.anInt1814 = local94;
					local13.anInt1776 = 0;
				}
			}
			if ((local17 & 0x2) != 0) {
				local85 = Static7.aClass2_Sub9_Sub1_1.method613();
				local94 = Static7.aClass2_Sub9_Sub1_1.method640();
				local13.method1175(local94, Static28.anInt704, local85);
				local13.anInt1783 = Static28.anInt704 + 300;
				local13.anInt1803 = Static7.aClass2_Sub9_Sub1_1.method613();
				local13.anInt1820 = Static7.aClass2_Sub9_Sub1_1.method612();
			}
			if ((local17 & 0x20) != 0) {
				local13.aClass40_884 = Static7.aClass2_Sub9_Sub1_1.method625();
				local13.anInt1780 = 100;
			}
			if ((local17 & 0x40) != 0) {
				local85 = Static7.aClass2_Sub9_Sub1_1.method614();
				local94 = Static7.aClass2_Sub9_Sub1_1.method613();
				local13.method1175(local94, Static28.anInt704, local85);
				local13.anInt1783 = Static28.anInt704 + 300;
				local13.anInt1803 = Static7.aClass2_Sub9_Sub1_1.method640();
				local13.anInt1820 = Static7.aClass2_Sub9_Sub1_1.method612();
			}
			if ((local17 & 0x10) != 0) {
				local13.anInt1799 = Static7.aClass2_Sub9_Sub1_1.method632();
				local13.anInt1819 = Static7.aClass2_Sub9_Sub1_1.method632();
			}
			if ((local17 & 0x8) != 0) {
				local13.anInt1815 = Static7.aClass2_Sub9_Sub1_1.method632();
				if (local13.anInt1815 == 65535) {
					local13.anInt1815 = -1;
				}
			}
			if ((local17 & 0x1) != 0) {
				local13.anInt1816 = Static7.aClass2_Sub9_Sub1_1.method639();
				local85 = Static7.aClass2_Sub9_Sub1_1.method662();
				local13.anInt1774 = 0;
				local13.anInt1811 = (local85 & 0xFFFF) + Static28.anInt704;
				if (local13.anInt1811 > Static28.anInt704) {
					local13.anInt1774 = -1;
				}
				if (local13.anInt1816 == 65535) {
					local13.anInt1816 = -1;
				}
				local13.anInt1795 = 0;
				local13.anInt1791 = local85 >> 16;
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIZII)V")
	public static void method1222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static10.anInt2974 = 0;
		@Pc(74) int local74;
		for (@Pc(9) int local9 = -1; local9 < Static130.anInt3007 + Static102.anInt2484; local9++) {
			@Pc(27) Class2_Sub1_Sub1_Sub3 local27;
			if (local9 == -1) {
				local27 = Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1;
			} else if (local9 >= Static130.anInt3007) {
				local27 = Static127.aClass2_Sub1_Sub1_Sub3_Sub1Array1[Static37.anIntArray97[local9 - Static130.anInt3007]];
			} else {
				local27 = Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[Static126.anIntArray347[local9]];
			}
			if (local27 != null && local27.method1174()) {
				@Pc(54) Class2_Sub1_Sub11 local54;
				if (local27 instanceof Class2_Sub1_Sub1_Sub3_Sub1) {
					local54 = ((Class2_Sub1_Sub1_Sub3_Sub1) local27).aClass2_Sub1_Sub11_1;
					if (local54.anIntArray255 != null) {
						local54 = local54.method1665();
					}
					if (local54 == null) {
						continue;
					}
				}
				if (local9 >= Static130.anInt3007) {
					local54 = ((Class2_Sub1_Sub1_Sub3_Sub1) local27).aClass2_Sub1_Sub11_1;
					if (local54.anIntArray255 != null) {
						local54 = local54.method1665();
					}
					if (local54.anInt2334 >= 0 && local54.anInt2334 < Static62.aClass2_Sub1_Sub2_Sub4Array11.length) {
						Static79.method1399(local27, local27.anInt1773 + 15);
						if (Static123.anInt2876 > -1) {
							Static62.aClass2_Sub1_Sub2_Sub4Array11[local54.anInt2334].method1722(Static123.anInt2876 + arg3 - 12, Static118.anInt2788 + arg2 + -30);
						}
					}
					if (Static30.anInt730 == 1 && Static39.anInt1058 == Static37.anIntArray97[local9 - Static130.anInt3007] && Static28.anInt704 % 20 < 10) {
						Static79.method1399(local27, local27.anInt1773 + 15);
						if (Static123.anInt2876 > -1) {
							Static50.aClass2_Sub1_Sub2_Sub4Array8[0].method1722(arg3 + Static123.anInt2876 - 12, arg2 + Static118.anInt2788 + -28);
						}
					}
				} else {
					local74 = 30;
					@Pc(77) Class2_Sub1_Sub1_Sub3_Sub2 local77 = (Class2_Sub1_Sub1_Sub3_Sub2) local27;
					if (local77.anInt1834 != -1 || local77.anInt1841 != -1) {
						Static79.method1399(local27, local27.anInt1773 + 15);
						if (Static123.anInt2876 > -1) {
							if (local77.anInt1834 != -1) {
								Static64.aClass2_Sub1_Sub2_Sub4Array12[local77.anInt1834].method1722(Static123.anInt2876 + arg3 - 12, Static118.anInt2788 + arg2 + -30);
								local74 += 25;
							}
							if (local77.anInt1841 != -1) {
								Static62.aClass2_Sub1_Sub2_Sub4Array11[local77.anInt1841].method1722(arg3 + Static123.anInt2876 - 12, -local74 + (arg2 - -Static118.anInt2788));
								local74 += 25;
							}
						}
					}
					if (local9 >= 0 && Static30.anInt730 == 10 && Static126.anIntArray347[local9] == Static84.anInt2219) {
						Static79.method1399(local27, local27.anInt1773 + 15);
						if (Static123.anInt2876 > -1) {
							Static50.aClass2_Sub1_Sub2_Sub4Array8[1].method1722(Static123.anInt2876 + arg3 - 12, -local74 + Static118.anInt2788 + arg2);
						}
					}
				}
				if (local27.aClass40_884 != null && (local9 >= Static130.anInt3007 || Static23.anInt652 == 0 || Static23.anInt652 == 3 || Static23.anInt652 == 1 && Static39.method710(((Class2_Sub1_Sub1_Sub3_Sub2) local27).aClass40_892))) {
					Static79.method1399(local27, local27.anInt1773);
					if (Static123.anInt2876 > -1 && Static124.anInt2886 > Static10.anInt2974) {
						Static124.anIntArray336[Static10.anInt2974] = Static73.aClass2_Sub1_Sub2_Sub3_Sub1_3.method1553(local27.aClass40_884) / 2;
						Static124.anIntArray338[Static10.anInt2974] = Static73.aClass2_Sub1_Sub2_Sub3_Sub1_3.anInt2187;
						Static124.anIntArray337[Static10.anInt2974] = Static123.anInt2876;
						Static124.anIntArray341[Static10.anInt2974] = Static118.anInt2788;
						Static124.anIntArray339[Static10.anInt2974] = local27.anInt1806;
						Static124.anIntArray340[Static10.anInt2974] = local27.anInt1794;
						Static124.anIntArray342[Static10.anInt2974] = local27.anInt1780;
						Static124.aClass40Array22[Static10.anInt2974] = local27.aClass40_884;
						Static10.anInt2974++;
					}
				}
				if (Static28.anInt704 < local27.anInt1783) {
					Static79.method1399(local27, local27.anInt1773 + 15);
					if (Static123.anInt2876 > -1) {
						local74 = local27.anInt1803 * 30 / local27.anInt1820;
						if (local74 > 30) {
							local74 = 30;
						}
						Static6.method1695(arg3 + Static123.anInt2876 - 15, Static118.anInt2788 + -3 + arg2, local74, 5, 65280);
						Static6.method1695(local74 + arg3 + Static123.anInt2876 - 15, arg2 + Static118.anInt2788 + -3, 30 - local74, 5, 16711680);
					}
				}
				for (local74 = 0; local74 < 4; local74++) {
					if (local27.anIntArray178[local74] > Static28.anInt704) {
						Static79.method1399(local27, local27.anInt1773 / 2);
						if (Static123.anInt2876 > -1) {
							if (local74 == 1) {
								Static118.anInt2788 -= 20;
							}
							if (local74 == 2) {
								Static123.anInt2876 -= 15;
								Static118.anInt2788 -= 10;
							}
							if (local74 == 3) {
								Static123.anInt2876 += 15;
								Static118.anInt2788 -= 10;
							}
							Static25.aClass2_Sub1_Sub2_Sub4Array3[local27.anIntArray179[local74]].method1722(Static123.anInt2876 + arg3 - 12, arg2 - -Static118.anInt2788 + -12);
							Static95.aClass2_Sub1_Sub2_Sub3_Sub1_4.method1547(Static49.method886(local27.anIntArray176[local74]), arg3 + Static123.anInt2876 - 1, arg2 + 3 + Static118.anInt2788, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(522) int local522 = 0; local522 < Static10.anInt2974; local522++) {
			local74 = Static124.anIntArray337[local522];
			@Pc(532) int local532 = Static124.anIntArray336[local522];
			@Pc(536) int local536 = Static124.anIntArray338[local522];
			@Pc(540) int local540 = Static124.anIntArray341[local522];
			@Pc(542) boolean local542 = true;
			while (local542) {
				local542 = false;
				for (@Pc(548) int local548 = 0; local548 < local522; local548++) {
					if (Static124.anIntArray341[local548] - Static124.anIntArray338[local548] < local540 + 2 && local540 - local536 < Static124.anIntArray341[local548] + 2 && Static124.anIntArray337[local548] + Static124.anIntArray336[local548] > -local532 + local74 && local532 + local74 > -Static124.anIntArray336[local548] + Static124.anIntArray337[local548] && Static124.anIntArray341[local548] - Static124.anIntArray338[local548] < local540) {
						local540 = Static124.anIntArray341[local548] - Static124.anIntArray338[local548];
						local542 = true;
					}
				}
			}
			Static123.anInt2876 = Static124.anIntArray337[local522];
			Static118.anInt2788 = Static124.anIntArray341[local522] = local540;
			@Pc(648) Class40 local648 = Static124.aClass40Array22[local522];
			if (Static109.anInt2955 == 0) {
				@Pc(655) int local655 = 16776960;
				if (Static124.anIntArray339[local522] < 6) {
					local655 = Static66.anIntArray174[Static124.anIntArray339[local522]];
				}
				if (Static124.anIntArray339[local522] == 6) {
					local655 = Static96.anInt2435 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static124.anIntArray339[local522] == 7) {
					local655 = Static96.anInt2435 % 20 >= 10 ? 65535 : 255;
				}
				if (Static124.anIntArray339[local522] == 8) {
					local655 = Static96.anInt2435 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(730) int local730;
				if (Static124.anIntArray339[local522] == 9) {
					local730 = 150 - Static124.anIntArray342[local522];
					if (local730 < 50) {
						local655 = local730 * 1280 + 16711680;
					} else if (local730 < 100) {
						local655 = 16776960 + 16384000 - local730 * 327680;
					} else if (local730 < 150) {
						local655 = (local730 - 100) * 5 + 65280;
					}
				}
				if (Static124.anIntArray339[local522] == 10) {
					local730 = 150 - Static124.anIntArray342[local522];
					if (local730 < 50) {
						local655 = local730 * 5 + 16711680;
					} else if (local730 < 100) {
						local655 = 16711935 - (local730 - 50) * 327680;
					} else if (local730 < 150) {
						local655 = (local730 - 100) * 327680 + 500 + 255 - local730 * 5;
					}
				}
				if (Static124.anIntArray339[local522] == 11) {
					local730 = 150 - Static124.anIntArray342[local522];
					if (local730 < 50) {
						local655 = 16777215 - local730 * 327685;
					} else if (local730 < 100) {
						local655 = local730 * 327685 + 65280 - 16384250;
					} else if (local730 < 150) {
						local655 = 16777215 - (local730 - 100) * 327680;
					}
				}
				if (Static124.anIntArray340[local522] == 0) {
					Static73.aClass2_Sub1_Sub2_Sub3_Sub1_3.method1547(local648, arg3 + Static123.anInt2876, Static118.anInt2788 + arg2, local655, 0);
				}
				if (Static124.anIntArray340[local522] == 1) {
					Static73.aClass2_Sub1_Sub2_Sub3_Sub1_3.method1546(local648, Static123.anInt2876 + arg3, Static118.anInt2788 + arg2, local655, Static96.anInt2435);
				}
				if (Static124.anIntArray340[local522] == 2) {
					Static73.aClass2_Sub1_Sub2_Sub3_Sub1_3.method1550(local648, Static123.anInt2876 + arg3, Static118.anInt2788 + arg2, local655, Static96.anInt2435);
				}
				if (Static124.anIntArray340[local522] == 3) {
					Static73.aClass2_Sub1_Sub2_Sub3_Sub1_3.method1537(local648, Static123.anInt2876 + arg3, arg2 - -Static118.anInt2788, local655, Static96.anInt2435, 150 - Static124.anIntArray342[local522]);
				}
				if (Static124.anIntArray340[local522] == 4) {
					local730 = (150 - Static124.anIntArray342[local522]) * (Static73.aClass2_Sub1_Sub2_Sub3_Sub1_3.method1553(local648) + 100) / 150;
					Static6.method1700(Static123.anInt2876 + arg3 - 50, arg2, Static123.anInt2876 + arg3 + 50, arg1 + arg2);
					Static73.aClass2_Sub1_Sub2_Sub3_Sub1_3.method1549(local648, Static123.anInt2876 + arg3 + 50 - local730, arg2 - -Static118.anInt2788, local655, 0);
					Static6.method1685(arg3, arg2, arg3 + arg0, arg2 - -arg1);
				}
				if (Static124.anIntArray340[local522] == 5) {
					local730 = 150 - Static124.anIntArray342[local522];
					Static6.method1700(arg3, Static118.anInt2788 + arg2 - Static73.aClass2_Sub1_Sub2_Sub3_Sub1_3.anInt2187 - 1, arg0 + arg3, arg2 + Static118.anInt2788 + 5);
					@Pc(1066) int local1066 = 0;
					if (local730 < 25) {
						local1066 = local730 - 25;
					} else if (local730 > 125) {
						local1066 = local730 - 125;
					}
					Static73.aClass2_Sub1_Sub2_Sub3_Sub1_3.method1547(local648, arg3 + Static123.anInt2876, Static118.anInt2788 + arg2 - -local1066, local655, 0);
					Static6.method1685(arg3, arg2, arg3 + arg0, arg1 + arg2);
				}
			} else {
				Static73.aClass2_Sub1_Sub2_Sub3_Sub1_3.method1547(local648, arg3 + Static123.anInt2876, Static118.anInt2788 + arg2, 16776960, 0);
			}
		}
	}
}

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!td", name = "g", descriptor = "I")
	public static int anInt3840;

	@OriginalMember(owner = "client!td", name = "i", descriptor = "Lclient!n;")
	public static Class56 aClass56_15 = new Class56();

	@OriginalMember(owner = "client!td", name = "k", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1482 = Static169.method2903("Username: ");

	@OriginalMember(owner = "client!td", name = "l", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1483 = Static169.method2903("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!td", name = "m", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1484 = Static169.method2903("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!td", name = "p", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1485 = aClass23_1482;

	@OriginalMember(owner = "client!td", name = "r", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1486 = Static169.method2903("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
	public static void method2654() {
		aClass23_1484 = null;
		aClass23_1485 = null;
		aClass56_15 = null;
		aClass23_1482 = null;
		aClass23_1486 = null;
		aClass23_1483 = null;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(I)Z")
	public static boolean method2656() {
		if (Static43.aClass44_4 == null) {
			return false;
		}
		@Pc(126) int local126;
		try {
			@Pc(13) int local13 = Static43.aClass44_4.method1418();
			if (local13 == 0) {
				return false;
			}
			if (Static15.anInt475 == -1) {
				local13--;
				Static43.aClass44_4.method1421(1, 0, Static35.aClass1_Sub8_Sub1_2.aByteArray12);
				Static35.aClass1_Sub8_Sub1_2.anInt1357 = 0;
				Static15.anInt475 = Static35.aClass1_Sub8_Sub1_2.method917();
				Static103.anInt2645 = Static8.anIntArray47[Static15.anInt475];
			}
			if (Static103.anInt2645 == -1) {
				if (local13 <= 0) {
					return false;
				}
				local13--;
				Static43.aClass44_4.method1421(1, 0, Static35.aClass1_Sub8_Sub1_2.aByteArray12);
				Static103.anInt2645 = Static35.aClass1_Sub8_Sub1_2.aByteArray12[0] & 0xFF;
			}
			if (Static103.anInt2645 == -2) {
				if (local13 <= 1) {
					return false;
				}
				Static43.aClass44_4.method1421(2, 0, Static35.aClass1_Sub8_Sub1_2.aByteArray12);
				Static35.aClass1_Sub8_Sub1_2.anInt1357 = 0;
				Static103.anInt2645 = Static35.aClass1_Sub8_Sub1_2.method878();
				local13 -= 2;
			}
			if (local13 < Static103.anInt2645) {
				return false;
			}
			Static35.aClass1_Sub8_Sub1_2.anInt1357 = 0;
			Static43.aClass44_4.method1421(Static103.anInt2645, 0, Static35.aClass1_Sub8_Sub1_2.aByteArray12);
			Static17.anInt531 = 0;
			Static140.anInt3588 = Static87.anInt957;
			Static87.anInt957 = Class88.anInt4185;
			Class88.anInt4185 = Static15.anInt475;
			@Pc(130) Class60 local130;
			@Pc(122) int local122;
			if (Static15.anInt475 == 66) {
				local122 = Static35.aClass1_Sub8_Sub1_2.method855();
				local126 = Static35.aClass1_Sub8_Sub1_2.method880();
				local130 = Static111.method1964(local122);
				if (local126 != local130.anInt2975 || local126 == -1) {
					local130.anInt2975 = local126;
					local130.anInt3026 = 0;
					local130.anInt2976 = 0;
					Static39.method659(local130);
				}
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 253) {
				if (Static165.anInt4050 != -1) {
					Static60.method3140(0, Static165.anInt4050);
				}
				Static15.anInt475 = -1;
				return true;
			}
			@Pc(221) int local221;
			@Pc(178) long local178;
			@Pc(182) int local182;
			@Pc(345) int local345;
			@Pc(188) boolean local188;
			@Pc(234) int local234;
			if (Static15.anInt475 == 36) {
				local178 = Static35.aClass1_Sub8_Sub1_2.method884();
				local182 = Static35.aClass1_Sub8_Sub1_2.method878();
				@Pc(186) byte local186 = Static35.aClass1_Sub8_Sub1_2.method900();
				local188 = false;
				if ((Long.MIN_VALUE & local178) != 0L) {
					local188 = true;
				}
				if (local188) {
					if (Static109.anInt2811 == 0) {
						Static15.anInt475 = -1;
						return true;
					}
					local178 &= Long.MAX_VALUE;
					for (local345 = 0; Static109.anInt2811 > local345 && (local178 != Static30.aClass1_Sub24Array2[local345].aLong140 || Static30.aClass1_Sub24Array2[local345].anInt4108 != local182); local345++) {
					}
					if (local345 < Static109.anInt2811) {
						while (local345 < Static109.anInt2811 - 1) {
							Static30.aClass1_Sub24Array2[local345] = Static30.aClass1_Sub24Array2[local345 + 1];
							local345++;
						}
						Static109.anInt2811--;
						Static30.aClass1_Sub24Array2[Static109.anInt2811] = null;
					}
				} else {
					@Pc(202) Class1_Sub24 local202 = new Class1_Sub24();
					local202.aLong140 = local178;
					local202.aClass23_1565 = Static8.method183(local202.aLong140);
					local202.aByte10 = local186;
					local202.anInt4108 = local182;
					for (local221 = Static109.anInt2811 - 1; local221 >= 0; local221--) {
						local234 = Static30.aClass1_Sub24Array2[local221].aClass23_1565.method656(local202.aClass23_1565);
						if (local234 == 0) {
							Static30.aClass1_Sub24Array2[local221].anInt4108 = local182;
							Static30.aClass1_Sub24Array2[local221].aByte10 = local186;
							if (Static8.aLong10 == local178) {
								Static81.aByte2 = local186;
							}
							Static15.anInt475 = -1;
							Static130.anInt3403 = Static176.anInt4191;
							return true;
						}
						if (local234 < 0) {
							break;
						}
					}
					if (Static109.anInt2811 >= Static30.aClass1_Sub24Array2.length) {
						Static15.anInt475 = -1;
						return true;
					}
					for (local234 = Static109.anInt2811 - 1; local234 > local221; local234--) {
						Static30.aClass1_Sub24Array2[local234 + 1] = Static30.aClass1_Sub24Array2[local234];
					}
					if (Static109.anInt2811 == 0) {
						Static30.aClass1_Sub24Array2 = new Class1_Sub24[100];
					}
					Static30.aClass1_Sub24Array2[local221 + 1] = local202;
					Static109.anInt2811++;
					if (Static8.aLong10 == local178) {
						Static81.aByte2 = local186;
					}
				}
				Static130.anInt3403 = Static176.anInt4191;
				Static15.anInt475 = -1;
				return true;
			}
			@Pc(439) Class60 local439;
			if (Static15.anInt475 == 155) {
				local122 = Static35.aClass1_Sub8_Sub1_2.method855();
				local126 = Static35.aClass1_Sub8_Sub1_2.method870();
				local182 = Static35.aClass1_Sub8_Sub1_2.method902();
				if (local182 == 65535) {
					local182 = -1;
				}
				local439 = Static111.method1964(local126);
				@Pc(456) Class1_Sub1_Sub7 local456;
				if (local439.aBoolean155) {
					local439.anInt3021 = local182;
					local439.anInt2972 = local122;
					local456 = Static2.method118(local182);
					local439.anInt2983 = local456.anInt1158;
					local439.anInt2979 = local456.anInt1169;
					local439.anInt3035 = local456.anInt1131;
					local439.anInt2988 = local456.anInt1141;
					local439.anInt3030 = local456.anInt1154;
					local439.anInt2978 = local456.anInt1163;
					if (local439.anInt3014 > 0) {
						local439.anInt3030 = local439.anInt3030 * 32 / local439.anInt3014;
					}
					Static39.method659(local439);
				} else if (local182 == -1) {
					local439.anInt3000 = 0;
					Static15.anInt475 = -1;
					return true;
				} else {
					local456 = Static2.method118(local182);
					local439.anInt2982 = local182;
					local439.anInt3000 = 4;
					local439.anInt2979 = local456.anInt1169;
					local439.anInt2978 = local456.anInt1163;
					local439.anInt3030 = local456.anInt1154 * 100 / local122;
					Static39.method659(local439);
				}
				Static15.anInt475 = -1;
				return true;
			}
			@Pc(567) int local567;
			@Pc(591) int local591;
			@Pc(638) Class1_Sub16 local638;
			@Pc(686) int local686;
			@Pc(697) long local697;
			if (Static15.anInt475 == 187) {
				local122 = Static103.anInt2645 + Static35.aClass1_Sub8_Sub1_2.anInt1357;
				local126 = Static35.aClass1_Sub8_Sub1_2.method878();
				local182 = Static35.aClass1_Sub8_Sub1_2.method878();
				if (Static165.anInt4050 != local126) {
					Static165.anInt4050 = local126;
					Static31.method544(Static165.anInt4050);
					Static84.method3154(Static165.anInt4050);
					for (local567 = 0; local567 < 100; local567++) {
						Static98.aBooleanArray12[local567] = true;
					}
				}
				while (local182-- > 0) {
					local567 = Static35.aClass1_Sub8_Sub1_2.method868();
					local591 = Static35.aClass1_Sub8_Sub1_2.method878();
					local345 = Static35.aClass1_Sub8_Sub1_2.method861();
					@Pc(602) Class1_Sub16 local602 = (Class1_Sub16) Static12.aClass10_1.method256((long) local567);
					if (local602 != null && local591 != local602.anInt3207) {
						Static27.method495(local602, true);
						local602 = null;
					}
					if (local602 == null) {
						local602 = Static181.method3132(local345, local567, local591);
					}
					local602.aBoolean167 = true;
				}
				for (local638 = (Class1_Sub16) Static12.aClass10_1.method257(); local638 != null; local638 = (Class1_Sub16) Static12.aClass10_1.method260()) {
					if (local638.aBoolean167) {
						local638.aBoolean167 = false;
					} else {
						Static27.method495(local638, true);
					}
				}
				Static78.aClass10_5 = new Class10(512);
				while (local122 > Static35.aClass1_Sub8_Sub1_2.anInt1357) {
					local591 = Static35.aClass1_Sub8_Sub1_2.method868();
					local345 = Static35.aClass1_Sub8_Sub1_2.method878();
					local221 = Static35.aClass1_Sub8_Sub1_2.method878();
					local234 = Static35.aClass1_Sub8_Sub1_2.method868();
					for (local686 = local345; local686 <= local221; local686++) {
						local697 = ((long) local591 << 32) + ((long) local686);
						Static78.aClass10_5.method263(new Class1_Sub7(local234), local697);
					}
				}
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 244) {
				Static115.method2043();
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 138) {
				Static51.method941(Static35.aClass1_Sub8_Sub1_2, Static103.anInt2645, Static29.aClass74_2);
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 119) {
				local122 = Static35.aClass1_Sub8_Sub1_2.method861();
				if (Static35.aClass1_Sub8_Sub1_2.method861() == 0) {
					Static130.aClass64Array1[local122] = new Class64();
				} else {
					Static35.aClass1_Sub8_Sub1_2.anInt1357--;
					Static130.aClass64Array1[local122] = new Class64(Static35.aClass1_Sub8_Sub1_2);
				}
				Static51.anInt1467 = Static176.anInt4191;
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 245) {
				Static106.aBoolean133 = false;
				for (local122 = 0; local122 < 5; local122++) {
					Static99.aBooleanArray13[local122] = false;
				}
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 113) {
				Static106.aBoolean133 = true;
				Static119.anInt3099 = Static35.aClass1_Sub8_Sub1_2.method861();
				Static27.anInt863 = Static35.aClass1_Sub8_Sub1_2.method861();
				Static92.anInt2438 = Static35.aClass1_Sub8_Sub1_2.method878();
				anInt3840 = Static35.aClass1_Sub8_Sub1_2.method861();
				Static170.anInt815 = Static35.aClass1_Sub8_Sub1_2.method861();
				if (Static170.anInt815 >= 100) {
					Static162.anInt3999 = Static119.anInt3099 * 128 + 64;
					Static166.anInt4090 = Static27.anInt863 * 128 + 64;
					Static163.anInt4011 = Static99.method1680(Static166.anInt4090, Static162.anInt3999, Static85.anInt2267) - Static92.anInt2438;
				}
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 85) {
				Static69.method1227(true);
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 239) {
				Static65.anInt3673 = Static103.anInt2645 / 8;
				for (local122 = 0; local122 < Static65.anInt3673; local122++) {
					Static70.aLongArray4[local122] = Static35.aClass1_Sub8_Sub1_2.method884();
					Static163.aClass23Array22[local122] = Static8.method183(Static70.aLongArray4[local122]);
				}
				Static23.anInt698 = Static176.anInt4191;
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 241) {
				local122 = Static35.aClass1_Sub8_Sub1_2.method902();
				local126 = Static35.aClass1_Sub8_Sub1_2.method855();
				local182 = Static35.aClass1_Sub8_Sub1_2.method886();
				local567 = Static35.aClass1_Sub8_Sub1_2.method867();
				@Pc(944) Class60 local944 = Static111.method1964(local126);
				if (local944.anInt2979 != local567 || local944.anInt2978 != local122 || local944.anInt3030 != local182) {
					local944.anInt2979 = local567;
					local944.anInt2978 = local122;
					local944.anInt3030 = local182;
					Static39.method659(local944);
				}
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 118) {
				local122 = Static35.aClass1_Sub8_Sub1_2.method868();
				local126 = Static35.aClass1_Sub8_Sub1_2.method878();
				if (local122 < -70000) {
					local126 += 32768;
				}
				if (local122 < 0) {
					local130 = null;
				} else {
					local130 = Static111.method1964(local122);
				}
				if (local130 != null) {
					for (local567 = 0; local567 < local130.anIntArray397.length; local567++) {
						local130.anIntArray397[local567] = 0;
						local130.anIntArray398[local567] = 0;
					}
				}
				Static35.method585(local126);
				local567 = Static35.aClass1_Sub8_Sub1_2.method878();
				for (local591 = 0; local591 < local567; local591++) {
					local345 = Static35.aClass1_Sub8_Sub1_2.method866();
					if (local345 == 255) {
						local345 = Static35.aClass1_Sub8_Sub1_2.method863();
					}
					local221 = Static35.aClass1_Sub8_Sub1_2.method886();
					if (local130 != null && local130.anIntArray397.length > local591) {
						local130.anIntArray397[local591] = local221;
						local130.anIntArray398[local591] = local345;
					}
					Static142.method2474(local221 - 1, local126, local591, local345);
				}
				if (local130 != null) {
					Static39.method659(local130);
				}
				Static105.method1817();
				Static49.anIntArray160[Static8.anInt347++ & 0x1F] = local126 & 0x7FFF;
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 74) {
				Static35.anInt973 = Static35.aClass1_Sub8_Sub1_2.method866();
				Static85.anInt2264 = Static35.aClass1_Sub8_Sub1_2.method861();
				Static15.anInt475 = -1;
				return true;
			}
			@Pc(1152) Class23 local1152;
			if (Static15.anInt475 == 148) {
				local122 = Static35.aClass1_Sub8_Sub1_2.method866();
				local126 = Static35.aClass1_Sub8_Sub1_2.method861();
				local1152 = Static35.aClass1_Sub8_Sub1_2.method864();
				if (local122 >= 1 && local122 <= 8) {
					if (local1152.method644(Static42.aClass23_438)) {
						local1152 = null;
					}
					Static140.aClass23Array21[local122 - 1] = local1152;
					Static110.aBooleanArray16[local122 - 1] = local126 == 0;
				}
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 128) {
				Static1.anInt220 = Static35.aClass1_Sub8_Sub1_2.method861();
				Static89.anInt2374 = Static35.aClass1_Sub8_Sub1_2.method861();
				Static108.anInt1866 = Static35.aClass1_Sub8_Sub1_2.method861();
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 115) {
				local122 = Static35.aClass1_Sub8_Sub1_2.method861();
				local126 = Static35.aClass1_Sub8_Sub1_2.method901();
				local182 = Static35.aClass1_Sub8_Sub1_2.method901();
				Static85.anInt2267 = local126 >> 1;
				Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.method1217(local182, local122, (local126 & 0x1) == 1);
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 117) {
				Static80.method1423();
				Static15.anInt475 = -1;
				return false;
			}
			@Pc(1270) Class60 local1270;
			if (Static15.anInt475 == 255) {
				local122 = Static35.aClass1_Sub8_Sub1_2.method868();
				local1270 = Static111.method1964(local122);
				for (local182 = 0; local182 < local1270.anIntArray397.length; local182++) {
					local1270.anIntArray397[local182] = -1;
					local1270.anIntArray397[local182] = 0;
				}
				Static39.method659(local1270);
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 189 || Static15.anInt475 == 49 || Static15.anInt475 == 143 || Static15.anInt475 == 226 || Static15.anInt475 == 205 || Static15.anInt475 == 133 || Static15.anInt475 == 235 || Static15.anInt475 == 136 || Static15.anInt475 == 188 || Static15.anInt475 == 64 || Static15.anInt475 == 247) {
				Static32.method572();
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 53) {
				Static105.method1817();
				Static128.anInt3380 = Static35.aClass1_Sub8_Sub1_2.method875();
				Static15.anInt475 = -1;
				Static33.anInt952 = Static176.anInt4191;
				return true;
			}
			if (Static15.anInt475 == 228) {
				local122 = Static35.aClass1_Sub8_Sub1_2.method867();
				local126 = Static35.aClass1_Sub8_Sub1_2.method855();
				Static32.anIntArray120[local122] = local126;
				if (Static27.anIntArray108[local122] != local126) {
					Static27.anIntArray108[local122] = local126;
					Static167.method2884(local122);
				}
				Static19.anIntArray83[Static90.anInt2407++ & 0x1F] = local122;
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 131) {
				local122 = Static35.aClass1_Sub8_Sub1_2.method902();
				Static181.method3131(local122);
				Static49.anIntArray160[Static8.anInt347++ & 0x1F] = local122 & 0x7FFF;
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 144) {
				local122 = Static35.aClass1_Sub8_Sub1_2.method863();
				local126 = Static35.aClass1_Sub8_Sub1_2.method878();
				local591 = local126 & 0x1F;
				local182 = local126 >> 10 & 0x1F;
				local567 = local126 >> 5 & 0x1F;
				local345 = (local591 << 3) + (local182 << 19) + (local567 << 11);
				@Pc(1483) Class60 local1483 = Static111.method1964(local122);
				if (local1483.anInt3013 != local345) {
					local1483.anInt3013 = local345;
					Static39.method659(local1483);
				}
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 180) {
				Static105.method1817();
				Static113.anInt2905 = Static35.aClass1_Sub8_Sub1_2.method861();
				Static15.anInt475 = -1;
				Static33.anInt952 = Static176.anInt4191;
				return true;
			}
			if (Static15.anInt475 == 73) {
				local122 = Static35.aClass1_Sub8_Sub1_2.method867();
				Static165.anInt4050 = local122;
				Static31.method544(local122);
				Static84.method3154(Static165.anInt4050);
				for (local126 = 0; local126 < 100; local126++) {
					Static98.aBooleanArray12[local126] = true;
				}
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 209) {
				Static7.anInt328 = Static35.aClass1_Sub8_Sub1_2.method861();
				if (Static7.anInt328 == 1) {
					Static153.anInt3783 = Static35.aClass1_Sub8_Sub1_2.method878();
				}
				if (Static7.anInt328 >= 2 && Static7.anInt328 <= 6) {
					if (Static7.anInt328 == 2) {
						Static116.anInt3015 = 64;
						Static103.anInt2647 = 64;
					}
					if (Static7.anInt328 == 3) {
						Static116.anInt3015 = 0;
						Static103.anInt2647 = 64;
					}
					if (Static7.anInt328 == 4) {
						Static116.anInt3015 = 128;
						Static103.anInt2647 = 64;
					}
					if (Static7.anInt328 == 5) {
						Static103.anInt2647 = 0;
						Static116.anInt3015 = 64;
					}
					if (Static7.anInt328 == 6) {
						Static103.anInt2647 = 128;
						Static116.anInt3015 = 64;
					}
					Static7.anInt328 = 2;
					Static105.anInt2702 = Static35.aClass1_Sub8_Sub1_2.method878();
					Static127.anInt3360 = Static35.aClass1_Sub8_Sub1_2.method878();
					Static144.anInt3642 = Static35.aClass1_Sub8_Sub1_2.method861();
				}
				if (Static7.anInt328 == 10) {
					Static147.anInt3708 = Static35.aClass1_Sub8_Sub1_2.method878();
				}
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 237) {
				local122 = Static35.aClass1_Sub8_Sub1_2.method886();
				@Pc(1650) byte local1650 = Static35.aClass1_Sub8_Sub1_2.method854();
				Static32.anIntArray120[local122] = local1650;
				if (local1650 != Static27.anIntArray108[local122]) {
					Static27.anIntArray108[local122] = local1650;
					Static167.method2884(local122);
				}
				Static19.anIntArray83[Static90.anInt2407++ & 0x1F] = local122;
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 7) {
				Static106.aBoolean133 = true;
				Static178.anInt4248 = Static35.aClass1_Sub8_Sub1_2.method861();
				Static21.anInt684 = Static35.aClass1_Sub8_Sub1_2.method861();
				Static93.anInt2445 = Static35.aClass1_Sub8_Sub1_2.method878();
				Static135.anInt3417 = Static35.aClass1_Sub8_Sub1_2.method861();
				Static10.anInt382 = Static35.aClass1_Sub8_Sub1_2.method861();
				if (Static10.anInt382 >= 100) {
					local122 = Static178.anInt4248 * 128 + 64;
					local126 = Static21.anInt684 * 128 + 64;
					local182 = Static99.method1680(local126, local122, Static85.anInt2267) - Static93.anInt2445;
					local567 = local122 - Static162.anInt3999;
					local345 = local126 - Static166.anInt4090;
					local591 = local182 - Static163.anInt4011;
					local221 = (int) Math.sqrt((double) (local567 * local567 + local345 * local345));
					Static46.anInt4326 = (int) (Math.atan2((double) local591, (double) local221) * 325.949D) & 0x7FF;
					Static29.anInt886 = (int) (Math.atan2((double) local567, (double) local345) * -325.949D) & 0x7FF;
					if (Static46.anInt4326 < 128) {
						Static46.anInt4326 = 128;
					}
					if (Static46.anInt4326 > 383) {
						Static46.anInt4326 = 383;
					}
				}
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 122) {
				Static179.anInt4266 = Static35.aClass1_Sub8_Sub1_2.method886() * 30;
				Static15.anInt475 = -1;
				Static33.anInt952 = Static176.anInt4191;
				return true;
			}
			if (Static15.anInt475 == 169) {
				local122 = Static35.aClass1_Sub8_Sub1_2.method870();
				local1270 = Static111.method1964(local122);
				local1270.anInt3000 = 3;
				local1270.anInt2982 = Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.aClass41_5.method1184();
				Static39.method659(local1270);
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 72) {
				for (local122 = 0; local122 < Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length; local122++) {
					if (Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local122] != null) {
						Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local122].anInt1842 = -1;
					}
				}
				for (local126 = 0; local126 < Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length; local126++) {
					if (Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local126] != null) {
						Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local126].anInt1842 = -1;
					}
				}
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 191) {
				local122 = Static35.aClass1_Sub8_Sub1_2.method867();
				local126 = Static35.aClass1_Sub8_Sub1_2.method863();
				local182 = Static35.aClass1_Sub8_Sub1_2.method861();
				local638 = (Class1_Sub16) Static12.aClass10_1.method256((long) local126);
				if (local638 != null) {
					Static27.method495(local638, local122 != local638.anInt3207);
				}
				Static181.method3132(local182, local126, local122);
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 84) {
				Static105.method1817();
				local122 = Static35.aClass1_Sub8_Sub1_2.method870();
				local126 = Static35.aClass1_Sub8_Sub1_2.method861();
				local182 = Static35.aClass1_Sub8_Sub1_2.method861();
				Static87.anIntArray122[local126] = local122;
				Static99.anIntArray314[local126] = local182;
				Static29.anIntArray116[local126] = 1;
				for (local567 = 0; local567 < 98; local567++) {
					if (Class88.anIntArray581[local567] <= local122) {
						Static29.anIntArray116[local126] = local567 + 2;
					}
				}
				Static41.anIntArray139[Static139.anInt3551++ & 0x1F] = local126;
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 153) {
				local122 = Static35.aClass1_Sub8_Sub1_2.method867();
				local126 = Static35.aClass1_Sub8_Sub1_2.method902();
				local182 = Static35.aClass1_Sub8_Sub1_2.method855();
				if (local126 == 65535) {
					local126 = -1;
				}
				if (local122 == 65535) {
					local122 = -1;
				}
				local567 = Static35.aClass1_Sub8_Sub1_2.method868();
				for (local591 = local126; local591 <= local122; local591++) {
					@Pc(2042) long local2042 = ((long) local567 << 32) + ((long) local591);
					@Pc(2047) Class1 local2047 = Static78.aClass10_5.method256(local2042);
					if (local2047 != null) {
						local2047.method3141();
					}
					Static78.aClass10_5.method263(new Class1_Sub7(local182), local2042);
				}
				Static15.anInt475 = -1;
				return true;
			}
			@Pc(2313) int local2313;
			@Pc(2259) int local2259;
			if (Static15.anInt475 == 222) {
				local178 = Static35.aClass1_Sub8_Sub1_2.method884();
				local182 = Static35.aClass1_Sub8_Sub1_2.method878();
				local567 = Static35.aClass1_Sub8_Sub1_2.method861();
				@Pc(2091) Class23 local2091 = Static8.method183(local178).method667();
				for (local345 = 0; local345 < Static37.anInt996; local345++) {
					if (local178 == Static106.aLongArray5[local345]) {
						if (Static72.anIntArray264[local345] != local182) {
							Static72.anIntArray264[local345] = local182;
							if (local182 > 0) {
								Static73.method1339(Static149.method2571(new Class23[] { local2091, Static154.aClass23_1457 }), Static101.aClass23_1001, 5);
							}
							if (local182 == 0) {
								Static73.method1339(Static149.method2571(new Class23[] { local2091, Static68.aClass23_657 }), Static101.aClass23_1001, 5);
							}
						}
						local2091 = null;
						Static70.anIntArray255[local345] = local567;
						break;
					}
				}
				if (local2091 != null && Static37.anInt996 < 200) {
					Static106.aLongArray5[Static37.anInt996] = local178;
					Static133.aClass23Array19[Static37.anInt996] = local2091;
					Static72.anIntArray264[Static37.anInt996] = local182;
					Static70.anIntArray255[Static37.anInt996] = local567;
					Static37.anInt996++;
				}
				local234 = Static37.anInt996;
				Static23.anInt698 = Static176.anInt4191;
				while (local234 > 0) {
					@Pc(2212) boolean local2212 = true;
					local234--;
					for (local686 = 0; local686 < local234; local686++) {
						if (Static86.anInt2304 != Static72.anIntArray264[local686] && Static72.anIntArray264[local686 + 1] == Static86.anInt2304 || Static72.anIntArray264[local686] == 0 && Static72.anIntArray264[local686 + 1] != 0) {
							local2212 = false;
							local2259 = Static72.anIntArray264[local686];
							Static72.anIntArray264[local686] = Static72.anIntArray264[local686 + 1];
							Static72.anIntArray264[local686 + 1] = local2259;
							@Pc(2277) Class23 local2277 = Static133.aClass23Array19[local686];
							Static133.aClass23Array19[local686] = Static133.aClass23Array19[local686 + 1];
							Static133.aClass23Array19[local686 + 1] = local2277;
							@Pc(2295) long local2295 = Static106.aLongArray5[local686];
							Static106.aLongArray5[local686] = Static106.aLongArray5[local686 + 1];
							Static106.aLongArray5[local686 + 1] = local2295;
							local2313 = Static70.anIntArray255[local686];
							Static70.anIntArray255[local686] = Static70.anIntArray255[local686 + 1];
							Static70.anIntArray255[local686 + 1] = local2313;
						}
					}
					if (local2212) {
						break;
					}
				}
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 47) {
				Static111.anInt2840 = 0;
				Static15.anInt475 = -1;
				return true;
			}
			@Pc(2369) Class23 local2369;
			@Pc(2391) long local2391;
			if (Static15.anInt475 == 147) {
				local2369 = Static35.aClass1_Sub8_Sub1_2.method864();
				@Pc(2387) Class23 local2387;
				if (local2369.method637(Static13.aClass23_166)) {
					local188 = false;
					local2387 = local2369.method635(0, local2369.method655(Static49.aClass23_514));
					local2391 = local2387.method643();
					for (local345 = 0; local345 < Static65.anInt3673; local345++) {
						if (Static70.aLongArray4[local345] == local2391) {
							local188 = true;
							break;
						}
					}
					if (!local188 && Static51.anInt1466 == 0) {
						Static73.method1339(Static16.aClass23_191, local2387, 4);
					}
				} else if (local2369.method637(Static142.aClass23_1361)) {
					local2387 = local2369.method635(0, local2369.method655(Static49.aClass23_514));
					local188 = false;
					local2391 = local2387.method643();
					for (local345 = 0; local345 < Static65.anInt3673; local345++) {
						if (Static70.aLongArray4[local345] == local2391) {
							local188 = true;
							break;
						}
					}
					if (!local188 && Static51.anInt1466 == 0) {
						@Pc(2480) Class23 local2480 = local2369.method635(local2369.method655(Static49.aClass23_514) + 1, local2369.method642() + -9);
						Static73.method1339(local2480, local2387, 8);
					}
				} else if (local2369.method637(Static138.aClass23_1318)) {
					local2387 = local2369.method635(0, local2369.method655(Static49.aClass23_514));
					local2391 = local2387.method643();
					local188 = false;
					for (local345 = 0; local345 < Static65.anInt3673; local345++) {
						if (Static70.aLongArray4[local345] == local2391) {
							local188 = true;
							break;
						}
					}
					if (!local188 && Static51.anInt1466 == 0) {
						Static73.method1339(Static101.aClass23_1001, local2387, 10);
					}
				} else if (local2369.method637(Static144.aClass23_1384)) {
					local2387 = local2369.method635(0, local2369.method655(Static144.aClass23_1384));
					Static73.method1339(local2387, Static101.aClass23_1001, 11);
				} else if (local2369.method637(Static43.aClass23_443)) {
					local2387 = local2369.method635(0, local2369.method655(Static43.aClass23_443));
					if (Static51.anInt1466 == 0) {
						Static73.method1339(local2387, Static101.aClass23_1001, 12);
					}
				} else if (local2369.method637(Static52.aClass23_716)) {
					local2387 = local2369.method635(0, local2369.method655(Static52.aClass23_716));
					if (Static51.anInt1466 == 0) {
						Static73.method1339(local2387, Static101.aClass23_1001, 13);
					}
				} else if (local2369.method637(Static149.aClass23_1418)) {
					local2387 = local2369.method635(0, local2369.method655(Static49.aClass23_514));
					local2391 = local2387.method643();
					local188 = false;
					for (local345 = 0; local345 < Static65.anInt3673; local345++) {
						if (Static70.aLongArray4[local345] == local2391) {
							local188 = true;
							break;
						}
					}
					if (!local188 && Static51.anInt1466 == 0) {
						Static73.method1339(Static101.aClass23_1001, local2387, 14);
					}
				} else if (local2369.method637(Static49.aClass23_516)) {
					local2387 = local2369.method635(0, local2369.method655(Static49.aClass23_514));
					local188 = false;
					local2391 = local2387.method643();
					for (local345 = 0; local345 < Static65.anInt3673; local345++) {
						if (Static70.aLongArray4[local345] == local2391) {
							local188 = true;
							break;
						}
					}
					if (!local188 && Static51.anInt1466 == 0) {
						Static73.method1339(Static101.aClass23_1001, local2387, 15);
					}
				} else if (local2369.method637(Static96.aClass23_952)) {
					local2387 = local2369.method635(0, local2369.method655(Static49.aClass23_514));
					local2391 = local2387.method643();
					local188 = false;
					for (local345 = 0; local345 < Static65.anInt3673; local345++) {
						if (local2391 == Static70.aLongArray4[local345]) {
							local188 = true;
							break;
						}
					}
					if (!local188 && Static51.anInt1466 == 0) {
						Static73.method1339(Static101.aClass23_1001, local2387, 16);
					}
				} else {
					Static73.method1339(local2369, Static101.aClass23_1001, 0);
				}
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 95) {
				Static96.method1663();
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 1) {
				Static107.anInt2752 = Static35.aClass1_Sub8_Sub1_2.method861();
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 121) {
				Static35.anInt973 = Static35.aClass1_Sub8_Sub1_2.method866();
				Static85.anInt2264 = Static35.aClass1_Sub8_Sub1_2.method866();
				for (local122 = Static85.anInt2264; local122 < Static85.anInt2264 + 8; local122++) {
					for (local126 = Static35.anInt973; local126 < Static35.anInt973 + 8; local126++) {
						if (Static41.aClass56ArrayArrayArray1[Static85.anInt2267][local122][local126] != null) {
							Static41.aClass56ArrayArrayArray1[Static85.anInt2267][local122][local126] = null;
							Static110.method1954(local126, local122);
						}
					}
				}
				for (@Pc(2880) Class1_Sub17 local2880 = (Class1_Sub17) aClass56_15.method1853(); local2880 != null; local2880 = (Class1_Sub17) aClass56_15.method1855()) {
					if (local2880.anInt3231 >= Static85.anInt2264 && local2880.anInt3231 < Static85.anInt2264 + 8 && Static35.anInt973 <= local2880.anInt3228 && local2880.anInt3228 < Static35.anInt973 + 8 && local2880.anInt3225 == Static85.anInt2267) {
						local2880.anInt3226 = 0;
					}
				}
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 26) {
				for (local122 = 0; local122 < Static133.anInt3410; local122++) {
					@Pc(2945) Class1_Sub1_Sub8 local2945 = Static169.method2900(local122);
					if (local2945 != null && local2945.anInt1282 == 0) {
						Static32.anIntArray120[local122] = 0;
						Static27.anIntArray108[local122] = 0;
					}
				}
				Static105.method1817();
				Static90.anInt2407 += 32;
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 168) {
				@Pc(2984) boolean local2984 = Static35.aClass1_Sub8_Sub1_2.method883() == 1;
				local126 = Static35.aClass1_Sub8_Sub1_2.method870();
				local130 = Static111.method1964(local126);
				if (local2984 != local130.aBoolean153) {
					local130.aBoolean153 = local2984;
					Static39.method659(local130);
				}
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 196) {
				local122 = Static35.aClass1_Sub8_Sub1_2.method861();
				local126 = Static35.aClass1_Sub8_Sub1_2.method861();
				local182 = Static35.aClass1_Sub8_Sub1_2.method861();
				local567 = Static35.aClass1_Sub8_Sub1_2.method861();
				local591 = Static35.aClass1_Sub8_Sub1_2.method878();
				Static99.aBooleanArray13[local122] = true;
				Static20.anIntArray87[local122] = local126;
				Static123.anIntArray428[local122] = local182;
				Static100.anIntArray321[local122] = local567;
				Static139.anIntArray471[local122] = local591;
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 199) {
				local122 = Static35.aClass1_Sub8_Sub1_2.method880();
				local126 = Static35.aClass1_Sub8_Sub1_2.method868();
				local182 = Static35.aClass1_Sub8_Sub1_2.method875();
				local439 = Static111.method1964(local126);
				local591 = local439.anInt2973 + local122;
				local345 = local182 + local439.anInt3023;
				if (local591 != local439.anInt2999 || local439.anInt2985 != local345) {
					local439.anInt2985 = local345;
					local439.anInt2999 = local591;
					Static39.method659(local439);
				}
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 216) {
				local122 = Static35.aClass1_Sub8_Sub1_2.method886();
				local126 = Static35.aClass1_Sub8_Sub1_2.method855();
				local182 = Static35.aClass1_Sub8_Sub1_2.method902();
				local439 = Static111.method1964(local126);
				Static15.anInt475 = -1;
				local439.anInt3025 = (local182 << 16) + local122;
				return true;
			}
			@Pc(3171) long local3171;
			if (Static15.anInt475 == 145) {
				local178 = Static35.aClass1_Sub8_Sub1_2.method884();
				Static35.aClass1_Sub8_Sub1_2.method900();
				local2391 = Static35.aClass1_Sub8_Sub1_2.method884();
				local3171 = Static35.aClass1_Sub8_Sub1_2.method878();
				@Pc(3176) long local3176 = (long) Static35.aClass1_Sub8_Sub1_2.method888();
				local686 = Static35.aClass1_Sub8_Sub1_2.method861();
				@Pc(3182) boolean local3182 = false;
				local697 = local3176 + (local3171 << 32);
				for (@Pc(3190) int local3190 = 0; local3190 < 100; local3190++) {
					if (local697 == Static35.aLongArray2[local3190]) {
						local3182 = true;
						break;
					}
				}
				if (local686 <= 1) {
					for (local2313 = 0; local2313 < Static65.anInt3673; local2313++) {
						if (Static70.aLongArray4[local2313] == local178) {
							local3182 = true;
							break;
						}
					}
				}
				if (!local3182 && Static51.anInt1466 == 0) {
					Static35.aLongArray2[Static162.anInt4004] = local697;
					Static162.anInt4004 = (Static162.anInt4004 + 1) % 100;
					@Pc(3257) Class23 local3257 = Static136.method3049(Static100.method1710(Static35.aClass1_Sub8_Sub1_2).method639());
					if (local686 == 2 || local686 == 3) {
						Static26.method483(local3257, Static149.method2571(new Class23[] { Static141.aClass23_1360, Static8.method183(local178).method667() }), 9, Static8.method183(local2391).method667());
					} else if (local686 == 1) {
						Static26.method483(local3257, Static149.method2571(new Class23[] { Static137.aClass23_1311, Static8.method183(local178).method667() }), 9, Static8.method183(local2391).method667());
					} else {
						Static26.method483(local3257, Static8.method183(local178).method667(), 9, Static8.method183(local2391).method667());
					}
				}
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 137) {
				local178 = Static35.aClass1_Sub8_Sub1_2.method884();
				local1152 = Static136.method3049(Static100.method1710(Static35.aClass1_Sub8_Sub1_2).method639());
				Static73.method1339(local1152, Static8.method183(local178).method667(), 6);
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 192) {
				local122 = Static35.aClass1_Sub8_Sub1_2.method870();
				Static19.aClass63_1 = Static29.aClass74_2.method2482(local122);
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 249) {
				local122 = Static35.aClass1_Sub8_Sub1_2.method878();
				local126 = Static35.aClass1_Sub8_Sub1_2.method868();
				local130 = Static111.method1964(local126);
				if (local130 != null && local130.anInt3032 == 0) {
					if (local130.anInt2977 - local130.anInt3017 < local122) {
						local122 = local130.anInt2977 - local130.anInt3017;
					}
					if (local122 < 0) {
						local122 = 0;
					}
					if (local122 != local130.anInt3029) {
						local130.anInt3029 = local122;
						Static39.method659(local130);
					}
				}
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 171) {
				Static167.method2888(Static35.aClass1_Sub8_Sub1_2);
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 111) {
				local2369 = Static35.aClass1_Sub8_Sub1_2.method864();
				@Pc(3493) Object[] local3493 = new Object[local2369.method642() + 1];
				for (local182 = local2369.method642() - 1; local182 >= 0; local182--) {
					if (local2369.method650(local182) == 115) {
						local3493[local182 + 1] = Static35.aClass1_Sub8_Sub1_2.method864();
					} else {
						local3493[local182 + 1] = Integer.valueOf(Static35.aClass1_Sub8_Sub1_2.method868());
					}
				}
				local3493[0] = Integer.valueOf(Static35.aClass1_Sub8_Sub1_2.method868());
				@Pc(3549) Class1_Sub13 local3549 = new Class1_Sub13();
				local3549.anObjectArray3 = local3493;
				Static178.method3065(local3549);
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 2) {
				local122 = Static35.aClass1_Sub8_Sub1_2.method868();
				local126 = Static35.aClass1_Sub8_Sub1_2.method878();
				if (local122 < -70000) {
					local126 += 32768;
				}
				if (local122 >= 0) {
					local130 = Static111.method1964(local122);
				} else {
					local130 = null;
				}
				while (Static35.aClass1_Sub8_Sub1_2.anInt1357 < Static103.anInt2645) {
					local567 = Static35.aClass1_Sub8_Sub1_2.method856();
					local345 = 0;
					local591 = Static35.aClass1_Sub8_Sub1_2.method878();
					if (local591 != 0) {
						local345 = Static35.aClass1_Sub8_Sub1_2.method861();
						if (local345 == 255) {
							local345 = Static35.aClass1_Sub8_Sub1_2.method868();
						}
					}
					if (local130 != null && local567 >= 0 && local130.anIntArray397.length > local567) {
						local130.anIntArray397[local567] = local591;
						local130.anIntArray398[local567] = local345;
					}
					Static142.method2474(local591 - 1, local126, local567, local345);
				}
				if (local130 != null) {
					Static39.method659(local130);
				}
				Static105.method1817();
				Static49.anIntArray160[Static8.anInt347++ & 0x1F] = local126 & 0x7FFF;
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 58) {
				local122 = Static35.aClass1_Sub8_Sub1_2.method878();
				local126 = Static35.aClass1_Sub8_Sub1_2.method861();
				local182 = Static35.aClass1_Sub8_Sub1_2.method878();
				Static167.method2885(local182, local126, local122);
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 8) {
				Static45.anInt1254 = Static35.aClass1_Sub8_Sub1_2.method861();
				Static15.anInt475 = -1;
				Static23.anInt698 = Static176.anInt4191;
				return true;
			}
			@Pc(3851) int local3851;
			if (Static15.anInt475 == 33) {
				Static130.anInt3403 = Static176.anInt4191;
				local178 = Static35.aClass1_Sub8_Sub1_2.method884();
				if (local178 == 0L) {
					Static30.aClass1_Sub24Array2 = null;
					Static77.aClass23_772 = null;
					Static109.anInt2811 = 0;
					Static15.anInt475 = -1;
					Static156.aClass23_1468 = null;
					return true;
				}
				local2391 = Static35.aClass1_Sub8_Sub1_2.method884();
				Static156.aClass23_1468 = Static8.method183(local2391);
				Static77.aClass23_772 = Static8.method183(local178);
				Static171.aByte11 = Static35.aClass1_Sub8_Sub1_2.method900();
				local591 = Static35.aClass1_Sub8_Sub1_2.method861();
				if (local591 == 255) {
					Static15.anInt475 = -1;
					return true;
				}
				Static109.anInt2811 = local591;
				@Pc(3779) Class1_Sub24[] local3779 = new Class1_Sub24[100];
				for (local221 = 0; local221 < Static109.anInt2811; local221++) {
					local3779[local221] = new Class1_Sub24();
					local3779[local221].aLong140 = Static35.aClass1_Sub8_Sub1_2.method884();
					local3779[local221].aClass23_1565 = Static8.method183(local3779[local221].aLong140);
					local3779[local221].anInt4108 = Static35.aClass1_Sub8_Sub1_2.method878();
					local3779[local221].aByte10 = Static35.aClass1_Sub8_Sub1_2.method900();
					if (Static8.aLong10 == local3779[local221].aLong140) {
						Static81.aByte2 = local3779[local221].aByte10;
					}
				}
				local2259 = Static109.anInt2811;
				while (local2259 > 0) {
					local2259--;
					@Pc(3849) boolean local3849 = true;
					for (local3851 = 0; local3851 < local2259; local3851++) {
						if (local3779[local3851].aClass23_1565.method656(local3779[local3851 + 1].aClass23_1565) > 0) {
							@Pc(3875) Class1_Sub24 local3875 = local3779[local3851];
							local3779[local3851] = local3779[local3851 + 1];
							local3779[local3851 + 1] = local3875;
							local3849 = false;
						}
					}
					if (local3849) {
						break;
					}
				}
				Static30.aClass1_Sub24Array2 = local3779;
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 12) {
				local122 = Static35.aClass1_Sub8_Sub1_2.method886();
				if (local122 == 65535) {
					local122 = -1;
				}
				Static20.method378(local122);
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 172) {
				local122 = Static35.aClass1_Sub8_Sub1_2.method897();
				local126 = Static35.aClass1_Sub8_Sub1_2.method902();
				if (local126 == 65535) {
					local126 = -1;
				}
				Static99.method1683(local126, local122);
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 162) {
				local178 = Static35.aClass1_Sub8_Sub1_2.method884();
				local2391 = Static35.aClass1_Sub8_Sub1_2.method878();
				local3171 = Static35.aClass1_Sub8_Sub1_2.method888();
				local221 = Static35.aClass1_Sub8_Sub1_2.method861();
				@Pc(3984) boolean local3984 = false;
				@Pc(3991) long local3991 = (local2391 << 32) + local3171;
				for (local3851 = 0; local3851 < 100; local3851++) {
					if (Static35.aLongArray2[local3851] == local3991) {
						local3984 = true;
						break;
					}
				}
				if (local221 <= 1) {
					for (@Pc(4022) int local4022 = 0; local4022 < Static65.anInt3673; local4022++) {
						if (Static70.aLongArray4[local4022] == local178) {
							local3984 = true;
							break;
						}
					}
				}
				if (!local3984 && Static51.anInt1466 == 0) {
					Static35.aLongArray2[Static162.anInt4004] = local3991;
					Static162.anInt4004 = (Static162.anInt4004 + 1) % 100;
					@Pc(4069) Class23 local4069 = Static136.method3049(Static100.method1710(Static35.aClass1_Sub8_Sub1_2).method639());
					if (local221 == 2 || local221 == 3) {
						Static73.method1339(local4069, Static149.method2571(new Class23[] { Static141.aClass23_1360, Static8.method183(local178).method667() }), 7);
					} else if (local221 == 1) {
						Static73.method1339(local4069, Static149.method2571(new Class23[] { Static137.aClass23_1311, Static8.method183(local178).method667() }), 7);
					} else {
						Static73.method1339(local4069, Static8.method183(local178).method667(), 3);
					}
				}
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 97) {
				for (local122 = 0; local122 < Static27.anIntArray108.length; local122++) {
					if (Static32.anIntArray120[local122] != Static27.anIntArray108[local122]) {
						Static27.anIntArray108[local122] = Static32.anIntArray120[local122];
						Static167.method2884(local122);
						Static19.anIntArray83[Static90.anInt2407++ & 0x1F] = local122;
					}
				}
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 35) {
				local122 = Static35.aClass1_Sub8_Sub1_2.method886();
				local126 = Static35.aClass1_Sub8_Sub1_2.method855();
				local130 = Static111.method1964(local126);
				if (local130.anInt3000 != 1 || local130.anInt2982 != local122) {
					local130.anInt2982 = local122;
					local130.anInt3000 = 1;
					Static39.method659(local130);
				}
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 18) {
				local122 = Static35.aClass1_Sub8_Sub1_2.method867();
				local126 = Static35.aClass1_Sub8_Sub1_2.method868();
				local130 = Static111.method1964(local126);
				if (local130.anInt3000 != 2 || local122 != local130.anInt2982) {
					local130.anInt3000 = 2;
					local130.anInt2982 = local122;
					Static39.method659(local130);
				}
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 27) {
				Static69.method1227(false);
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 139) {
				local2369 = Static35.aClass1_Sub8_Sub1_2.method864();
				local126 = Static35.aClass1_Sub8_Sub1_2.method868();
				local130 = Static111.method1964(local126);
				if (!local2369.method651(local130.aClass23_1142)) {
					local130.aClass23_1142 = local2369;
					Static39.method659(local130);
				}
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 183) {
				Static35.anInt973 = Static35.aClass1_Sub8_Sub1_2.method901();
				Static85.anInt2264 = Static35.aClass1_Sub8_Sub1_2.method866();
				while (Static35.aClass1_Sub8_Sub1_2.anInt1357 < Static103.anInt2645) {
					Static15.anInt475 = Static35.aClass1_Sub8_Sub1_2.method861();
					Static32.method572();
				}
				Static15.anInt475 = -1;
				return true;
			}
			if (Static15.anInt475 == 174) {
				local122 = Static35.aClass1_Sub8_Sub1_2.method868();
				@Pc(4361) Class1_Sub16 local4361 = (Class1_Sub16) Static12.aClass10_1.method256((long) local122);
				if (local4361 != null) {
					Static27.method495(local4361, true);
				}
				if (Static98.aClass60_5 != null) {
					Static39.method659(Static98.aClass60_5);
					Static98.aClass60_5 = null;
				}
				Static15.anInt475 = -1;
				return true;
			}
			Static153.method2616("T1 - " + Static15.anInt475 + "," + Static87.anInt957 + "," + Static140.anInt3588 + " - " + Static103.anInt2645, null);
			Static80.method1423();
		} catch (@Pc(4406) IOException local4406) {
			Static49.method913();
		} catch (@Pc(4410) Exception local4410) {
			@Pc(4450) String local4450 = "T2 - " + Static15.anInt475 + "," + Static87.anInt957 + "," + Static140.anInt3588 + " - " + Static103.anInt2645 + "," + (Static152.anInt3545 + Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0]) + "," + (Static75.anInt2039 + Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0]) + " - ";
			for (local126 = 0; local126 < Static103.anInt2645 && local126 < 50; local126++) {
				local4450 = local4450 + Static35.aClass1_Sub8_Sub1_2.aByteArray12[local126] + ",";
			}
			Static153.method2616(local4450, local4410);
			Static80.method1423();
		}
		return true;
	}
}

import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!na", name = "b", descriptor = "I")
	public static int anInt2101;

	@OriginalMember(owner = "client!na", name = "f", descriptor = "[I")
	public static int[] anIntArray207;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "Z")
	public static boolean aBoolean105 = false;

	@OriginalMember(owner = "client!na", name = "e", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!na", name = "j", descriptor = "I")
	public static int anInt2107 = 0;

	@OriginalMember(owner = "client!na", name = "l", descriptor = "Lclient!he;")
	public static Class26 aClass26_1079 = Static6.method100("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!na", name = "n", descriptor = "[I")
	public static int[] anIntArray208 = new int[4000];

	@OriginalMember(owner = "client!na", name = "o", descriptor = "Lclient!he;")
	public static Class26 aClass26_1080 = Static6.method100("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BII)I")
	public static int method1360(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class3_Sub2 local17 = (Class3_Sub2) Static52.aClass17_8.method599((long) arg0);
		if (local17 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(31) int local31 = 0; local31 < local17.anIntArray15.length; local31++) {
				if (arg1 == local17.anIntArray17[local31]) {
					local29 += local17.anIntArray15[local31];
				}
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
	public static void method1361() {
		aClass26_1079 = null;
		anIntArray208 = null;
		anIntArray207 = null;
		aClass26_1080 = null;
		aBigInteger2 = null;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!ef;II)Lclient!ce;")
	public static Class3_Sub1_Sub4_Sub1 method1362(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1) {
		return Static109.method1997(arg0, arg1) ? Static95.method1770() : null;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(B)Z")
	public static boolean method1363() {
		if (Static118.aClass76_4 == null) {
			return false;
		}
		@Pc(169) int local169;
		try {
			@Pc(13) int local13 = Static118.aClass76_4.method2191();
			if (local13 == 0) {
				return false;
			}
			if (Static72.anInt2056 == -1) {
				Static118.aClass76_4.method2188(Static33.aClass3_Sub11_Sub1_2.aByteArray13, 0, 1);
				Static33.aClass3_Sub11_Sub1_2.anInt1562 = 0;
				Static72.anInt2056 = Static33.aClass3_Sub11_Sub1_2.method1030();
				Static104.anInt2841 = Static113.anIntArray364[Static72.anInt2056];
				local13--;
			}
			if (Static104.anInt2841 == -1) {
				if (local13 <= 0) {
					return false;
				}
				local13--;
				Static118.aClass76_4.method2188(Static33.aClass3_Sub11_Sub1_2.aByteArray13, 0, 1);
				Static104.anInt2841 = Static33.aClass3_Sub11_Sub1_2.aByteArray13[0] & 0xFF;
			}
			if (Static104.anInt2841 == -2) {
				if (local13 <= 1) {
					return false;
				}
				Static118.aClass76_4.method2188(Static33.aClass3_Sub11_Sub1_2.aByteArray13, 0, 2);
				local13 -= 2;
				Static33.aClass3_Sub11_Sub1_2.anInt1562 = 0;
				Static104.anInt2841 = Static33.aClass3_Sub11_Sub1_2.method974();
			}
			if (local13 < Static104.anInt2841) {
				return false;
			}
			Static33.aClass3_Sub11_Sub1_2.anInt1562 = 0;
			Static118.aClass76_4.method2188(Static33.aClass3_Sub11_Sub1_2.aByteArray13, 0, Static104.anInt2841);
			Static113.anInt3001 = 0;
			Static85.anInt2341 = Static65.anInt1955;
			Static65.anInt1955 = Static67.anInt2794;
			Static67.anInt2794 = Static72.anInt2056;
			if (Static72.anInt2056 == 30) {
				Static93.anInt2522 = Static33.aClass3_Sub11_Sub1_2.method974() * 30;
				Static72.anInt2056 = -1;
				Static67.anInt2791 = Static71.anInt2023;
				return true;
			}
			if (Static72.anInt2056 == 187) {
				if (Static32.anInt1048 != -1) {
					Static96.method1776(0, Static32.anInt1048);
				}
				Static72.anInt2056 = -1;
				return true;
			}
			@Pc(173) int local173;
			@Pc(298) int local298;
			@Pc(302) int local302;
			@Pc(304) int local304;
			@Pc(314) long local314;
			@Pc(165) int local165;
			@Pc(190) int local190;
			@Pc(210) int local210;
			@Pc(214) int local214;
			@Pc(258) Class3_Sub17 local258;
			if (Static72.anInt2056 == 79) {
				local165 = Static33.aClass3_Sub11_Sub1_2.anInt1562 + Static104.anInt2841;
				local169 = Static33.aClass3_Sub11_Sub1_2.method974();
				local173 = Static33.aClass3_Sub11_Sub1_2.method974();
				if (Static32.anInt1048 != local169) {
					Static32.anInt1048 = local169;
					Static107.method1967(Static32.anInt1048);
					Static102.method1898(Static32.anInt1048);
					for (local190 = 0; local190 < 100; local190++) {
						Static72.aBooleanArray19[local190] = true;
					}
				}
				while (local173-- > 0) {
					local190 = Static33.aClass3_Sub11_Sub1_2.method984();
					local210 = Static33.aClass3_Sub11_Sub1_2.method974();
					local214 = Static33.aClass3_Sub11_Sub1_2.method981();
					@Pc(221) Class3_Sub17 local221 = (Class3_Sub17) Static52.aClass17_9.method599((long) local190);
					if (local221 != null && local210 != local221.anInt2552) {
						Static36.method730(true, local221);
						local221 = null;
					}
					if (local221 == null) {
						local221 = Static39.method779(local210, local214, local190);
					}
					local221.aBoolean142 = true;
				}
				for (local258 = (Class3_Sub17) Static52.aClass17_9.method598(); local258 != null; local258 = (Class3_Sub17) Static52.aClass17_9.method597()) {
					if (local258.aBoolean142) {
						local258.aBoolean142 = false;
					} else {
						Static36.method730(true, local258);
					}
				}
				Static105.aClass17_19 = new Class17(512);
				while (Static33.aClass3_Sub11_Sub1_2.anInt1562 < local165) {
					local210 = Static33.aClass3_Sub11_Sub1_2.method984();
					local214 = Static33.aClass3_Sub11_Sub1_2.method974();
					local298 = Static33.aClass3_Sub11_Sub1_2.method974();
					local302 = Static33.aClass3_Sub11_Sub1_2.method984();
					for (local304 = local214; local304 <= local298; local304++) {
						local314 = (long) local304 + ((long) local210 << 32);
						Static105.aClass17_19.method594(new Class3_Sub16(local302), local314);
					}
				}
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 61 || Static72.anInt2056 == 208 || Static72.anInt2056 == 239 || Static72.anInt2056 == 26 || Static72.anInt2056 == 186 || Static72.anInt2056 == 218 || Static72.anInt2056 == 39 || Static72.anInt2056 == 112 || Static72.anInt2056 == 140 || Static72.anInt2056 == 16 || Static72.anInt2056 == 17) {
				Static18.method275();
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 190) {
				Static43.method1870();
				local165 = Static33.aClass3_Sub11_Sub1_2.method1005();
				local169 = Static33.aClass3_Sub11_Sub1_2.method987();
				local173 = Static33.aClass3_Sub11_Sub1_2.method981();
				Static74.anIntArray202[local165] = local169;
				Static124.anIntArray385[local165] = local173;
				Static52.anIntArray160[local165] = 1;
				for (local190 = 0; local190 < 98; local190++) {
					if (local169 >= Class34.anIntArray164[local190]) {
						Static52.anIntArray160[local165] = local190 + 2;
					}
				}
				Static66.anIntArray295[Static121.anInt3170++ & 0x1F] = local165;
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 44) {
				for (local165 = 0; local165 < Static132.anInt3271; local165++) {
					@Pc(466) Class3_Sub1_Sub15 local466 = Static60.method1198(local165);
					if (local466 != null && local466.anInt2835 == 0) {
						Static30.anIntArray97[local165] = 0;
						Static52.anIntArray159[local165] = 0;
					}
				}
				Static43.method1870();
				Static72.anInt2056 = -1;
				Static125.anInt3205 += 32;
				return true;
			}
			if (Static72.anInt2056 == 221) {
				Static110.method2002(false);
				Static72.anInt2056 = -1;
				return true;
			}
			@Pc(514) long local514;
			@Pc(519) long local519;
			@Pc(524) long local524;
			if (Static72.anInt2056 == 50) {
				local514 = Static33.aClass3_Sub11_Sub1_2.method980();
				local519 = Static33.aClass3_Sub11_Sub1_2.method974();
				local524 = Static33.aClass3_Sub11_Sub1_2.method1013();
				local298 = Static33.aClass3_Sub11_Sub1_2.method981();
				@Pc(534) long local534 = (local519 << 32) + local524;
				@Pc(536) boolean local536 = false;
				for (@Pc(538) int local538 = 0; local538 < 100; local538++) {
					if (local534 == Static29.aLongArray3[local538]) {
						local536 = true;
						break;
					}
				}
				if (local298 <= 1) {
					for (@Pc(567) int local567 = 0; local567 < Static44.anInt1362; local567++) {
						if (Static14.aLongArray1[local567] == local514) {
							local536 = true;
							break;
						}
					}
				}
				if (!local536 && Static131.anInt3269 == 0) {
					Static29.aLongArray3[Static85.anInt2340] = local534;
					Static85.anInt2340 = (Static85.anInt2340 + 1) % 100;
					@Pc(608) Class26 local608 = Static129.method1614(Static114.method2078(Static33.aClass3_Sub11_Sub1_2).method815());
					if (local298 == 2 || local298 == 3) {
						Static67.method1915(local608, Static119.method2136(new Class26[] { Static105.aClass26_1537, Static111.method2010(local514).method853() }), 7);
					} else if (local298 == 1) {
						Static67.method1915(local608, Static119.method2136(new Class26[] { Static76.aClass26_1077, Static111.method2010(local514).method853() }), 7);
					} else {
						Static67.method1915(local608, Static111.method2010(local514).method853(), 3);
					}
				}
				Static72.anInt2056 = -1;
				return true;
			}
			@Pc(689) Class3_Sub14 local689;
			if (Static72.anInt2056 == 2) {
				local165 = Static33.aClass3_Sub11_Sub1_2.method1006();
				local689 = Static100.method2212(local165);
				for (local173 = 0; local173 < local689.anIntArray214.length; local173++) {
					local689.anIntArray214[local173] = -1;
					local689.anIntArray214[local173] = 0;
				}
				Static110.method2004(local689);
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 254) {
				local165 = Static33.aClass3_Sub11_Sub1_2.method984();
				local169 = Static33.aClass3_Sub11_Sub1_2.method978();
				if (local169 == 65535) {
					local169 = -1;
				}
				local173 = Static33.aClass3_Sub11_Sub1_2.method1002();
				local190 = Static33.aClass3_Sub11_Sub1_2.method988();
				if (local190 == 65535) {
					local190 = -1;
				}
				for (local210 = local190; local210 <= local169; local210++) {
					@Pc(765) long local765 = (long) local210 + ((long) local165 << 32);
					@Pc(770) Class3 local770 = Static105.aClass17_19.method599(local765);
					if (local770 != null) {
						local770.method2201();
					}
					Static105.aClass17_19.method594(new Class3_Sub16(local173), local765);
				}
				Static72.anInt2056 = -1;
				return true;
			}
			@Pc(810) Class3_Sub14 local810;
			if (Static72.anInt2056 == 63) {
				local165 = Static33.aClass3_Sub11_Sub1_2.method1002();
				local169 = Static33.aClass3_Sub11_Sub1_2.method1015();
				local810 = Static100.method2212(local165);
				if (local169 != local810.anInt2176 || local169 == -1) {
					local810.anInt2196 = 0;
					local810.anInt2176 = local169;
					local810.anInt2144 = 0;
					Static110.method2004(local810);
				}
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 8) {
				local165 = Static33.aClass3_Sub11_Sub1_2.method987();
				local689 = Static100.method2212(local165);
				local689.anInt2134 = 3;
				local689.anInt2201 = Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.aClass35_1.method1139();
				Static110.method2004(local689);
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 1) {
				local165 = Static33.aClass3_Sub11_Sub1_2.method1006();
				local169 = Static33.aClass3_Sub11_Sub1_2.method988();
				local173 = Static33.aClass3_Sub11_Sub1_2.method988();
				local190 = Static33.aClass3_Sub11_Sub1_2.method974();
				@Pc(888) Class3_Sub14 local888 = Static100.method2212(local165);
				if (local888.anInt2179 != local173 || local888.anInt2192 != local190 || local888.anInt2151 != local169) {
					local888.anInt2151 = local169;
					local888.anInt2179 = local173;
					local888.anInt2192 = local190;
					Static110.method2004(local888);
				}
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 182) {
				Static113.method2068(Static104.anInt2841, Static67.aClass75_4, Static33.aClass3_Sub11_Sub1_2);
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 9) {
				local165 = Static33.aClass3_Sub11_Sub1_2.method1006();
				local169 = Static33.aClass3_Sub11_Sub1_2.method988();
				local810 = Static100.method2212(local165);
				if (local810.anInt2134 != 1 || local169 != local810.anInt2201) {
					local810.anInt2201 = local169;
					local810.anInt2134 = 1;
					Static110.method2004(local810);
				}
				Static72.anInt2056 = -1;
				return true;
			}
			@Pc(989) Class26 local989;
			if (Static72.anInt2056 == 72) {
				local989 = Static33.aClass3_Sub11_Sub1_2.method977();
				local169 = Static33.aClass3_Sub11_Sub1_2.method1005();
				local173 = Static33.aClass3_Sub11_Sub1_2.method973();
				if (local169 >= 1 && local169 <= 8) {
					if (local989.method832(Static119.aClass26_1692)) {
						local989 = null;
					}
					Static114.aClass26Array25[local169 - 1] = local989;
					Static43.aBooleanArray25[local169 - 1] = local173 == 0;
				}
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 82) {
				Static40.aBoolean67 = true;
				Static31.anInt2721 = Static33.aClass3_Sub11_Sub1_2.method981();
				Static115.anInt3050 = Static33.aClass3_Sub11_Sub1_2.method981();
				Static73.anInt2073 = Static33.aClass3_Sub11_Sub1_2.method974();
				Static1.anInt1 = Static33.aClass3_Sub11_Sub1_2.method981();
				Static118.anInt3118 = Static33.aClass3_Sub11_Sub1_2.method981();
				if (Static118.anInt3118 >= 100) {
					Static54.anInt1624 = Static115.anInt3050 * 128 + 64;
					Static10.anInt282 = Static31.anInt2721 * 128 + 64;
					Static79.anInt2157 = Static110.method2006(Static10.anInt282, Static54.anInt1624, Static132.anInt3270) - Static73.anInt2073;
				}
				Static72.anInt2056 = -1;
				return true;
			}
			@Pc(1110) Class26 local1110;
			if (Static72.anInt2056 == 47) {
				local165 = Static33.aClass3_Sub11_Sub1_2.method1006();
				local1110 = Static33.aClass3_Sub11_Sub1_2.method977();
				local810 = Static100.method2212(local165);
				if (!local1110.method816(local810.aClass26_1112)) {
					local810.aClass26_1112 = local1110;
					Static110.method2004(local810);
				}
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 142) {
				@Pc(1144) boolean local1144 = Static33.aClass3_Sub11_Sub1_2.method1005() == 1;
				local169 = Static33.aClass3_Sub11_Sub1_2.method1006();
				local810 = Static100.method2212(local169);
				if (local1144 != local810.aBoolean118) {
					local810.aBoolean118 = local1144;
					Static110.method2004(local810);
				}
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 40) {
				local165 = Static33.aClass3_Sub11_Sub1_2.method974();
				local169 = Static33.aClass3_Sub11_Sub1_2.method981();
				local173 = Static33.aClass3_Sub11_Sub1_2.method974();
				Static57.method1141(local173, local165, local169);
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 74) {
				for (local165 = 0; local165 < Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1.length; local165++) {
					if (Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1[local165] != null) {
						Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1[local165].anInt2738 = -1;
					}
				}
				for (local169 = 0; local169 < Static93.aClass3_Sub1_Sub5_Sub1_Sub2Array1.length; local169++) {
					if (Static93.aClass3_Sub1_Sub5_Sub1_Sub2Array1[local169] != null) {
						Static93.aClass3_Sub1_Sub5_Sub1_Sub2Array1[local169].anInt2738 = -1;
					}
				}
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 156) {
				Static47.anInt1425 = Static33.aClass3_Sub11_Sub1_2.method981();
				Static124.anInt3200 = Static33.aClass3_Sub11_Sub1_2.method981();
				Static38.anInt1235 = Static33.aClass3_Sub11_Sub1_2.method981();
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 120) {
				local165 = Static33.aClass3_Sub11_Sub1_2.method984();
				local169 = Static33.aClass3_Sub11_Sub1_2.method974();
				if (local165 < -70000) {
					local169 += 32768;
				}
				if (local165 < 0) {
					local810 = null;
				} else {
					local810 = Static100.method2212(local165);
				}
				while (Static104.anInt2841 > Static33.aClass3_Sub11_Sub1_2.anInt1562) {
					local190 = Static33.aClass3_Sub11_Sub1_2.method979();
					local210 = Static33.aClass3_Sub11_Sub1_2.method974();
					local214 = 0;
					if (local210 != 0) {
						local214 = Static33.aClass3_Sub11_Sub1_2.method981();
						if (local214 == 255) {
							local214 = Static33.aClass3_Sub11_Sub1_2.method984();
						}
					}
					if (local810 != null && local190 >= 0 && local190 < local810.anIntArray214.length) {
						local810.anIntArray214[local190] = local210;
						local810.anIntArray215[local190] = local214;
					}
					Static114.method2079(local214, local210 - 1, local190, local169);
				}
				if (local810 != null) {
					Static110.method2004(local810);
				}
				Static43.method1870();
				Static2.anIntArray2[Static16.anInt418++ & 0x1F] = local169 & 0x7FFF;
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 166) {
				local165 = Static33.aClass3_Sub11_Sub1_2.method974();
				local169 = Static33.aClass3_Sub11_Sub1_2.method987();
				local810 = Static100.method2212(local169);
				if (local810 != null && local810.anInt2204 == 0) {
					if (local165 > local810.anInt2172 - local810.anInt2161) {
						local165 = local810.anInt2172 - local810.anInt2161;
					}
					if (local165 < 0) {
						local165 = 0;
					}
					if (local165 != local810.anInt2193) {
						local810.anInt2193 = local165;
						Static110.method2004(local810);
					}
				}
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 245) {
				local165 = Static33.aClass3_Sub11_Sub1_2.method988();
				@Pc(1454) byte local1454 = Static33.aClass3_Sub11_Sub1_2.method994();
				Static30.anIntArray97[local165] = local1454;
				if (local1454 != Static52.anIntArray159[local165]) {
					Static52.anIntArray159[local165] = local1454;
					Static4.method77(local165);
				}
				Static42.anIntArray141[Static125.anInt3205++ & 0x1F] = local165;
				Static72.anInt2056 = -1;
				return true;
			}
			@Pc(1509) Class3_Sub14 local1509;
			if (Static72.anInt2056 == 201) {
				local165 = Static33.aClass3_Sub11_Sub1_2.method1017();
				local169 = Static33.aClass3_Sub11_Sub1_2.method1017();
				local173 = Static33.aClass3_Sub11_Sub1_2.method1002();
				local1509 = Static100.method2212(local173);
				local214 = local1509.anInt2188 + local169;
				local210 = local165 + local1509.anInt2165;
				if (local1509.anInt2158 != local210 || local1509.anInt2178 != local214) {
					local1509.anInt2178 = local214;
					local1509.anInt2158 = local210;
					Static110.method2004(local1509);
				}
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 113) {
				Static40.aBoolean67 = true;
				Static18.anInt442 = Static33.aClass3_Sub11_Sub1_2.method981();
				Static25.anInt3161 = Static33.aClass3_Sub11_Sub1_2.method981();
				Static12.anInt304 = Static33.aClass3_Sub11_Sub1_2.method974();
				Static29.anInt1007 = Static33.aClass3_Sub11_Sub1_2.method981();
				Static87.anInt2440 = Static33.aClass3_Sub11_Sub1_2.method981();
				if (Static87.anInt2440 >= 100) {
					local165 = Static18.anInt442 * 128 + 64;
					local169 = Static25.anInt3161 * 128 + 64;
					local173 = Static110.method2006(local165, local169, Static132.anInt3270) - Static12.anInt304;
					local190 = local165 - Static10.anInt282;
					local210 = local173 - Static79.anInt2157;
					local214 = local169 - Static54.anInt1624;
					local298 = (int) Math.sqrt((double) (local190 * local190 + local214 * local214));
					Static81.anInt2248 = (int) (Math.atan2((double) local210, (double) local298) * 325.949D) & 0x7FF;
					Static32.anInt1052 = (int) (Math.atan2((double) local190, (double) local214) * -325.949D) & 0x7FF;
					if (Static81.anInt2248 < 128) {
						Static81.anInt2248 = 128;
					}
					if (Static81.anInt2248 > 383) {
						Static81.anInt2248 = 383;
					}
				}
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 159) {
				Static38.anInt1241 = Static33.aClass3_Sub11_Sub1_2.method1004();
				Static105.anInt2856 = Static33.aClass3_Sub11_Sub1_2.method1004();
				for (local165 = Static38.anInt1241; local165 < Static38.anInt1241 + 8; local165++) {
					for (local169 = Static105.anInt2856; local169 < Static105.anInt2856 + 8; local169++) {
						if (Static64.aClass65ArrayArrayArray1[Static132.anInt3270][local165][local169] != null) {
							Static64.aClass65ArrayArrayArray1[Static132.anInt3270][local165][local169] = null;
							Static102.method1899(local169, local165);
						}
					}
				}
				for (@Pc(1720) Class3_Sub8 local1720 = (Class3_Sub8) Static99.aClass65_70.method1958(); local1720 != null; local1720 = (Class3_Sub8) Static99.aClass65_70.method1962()) {
					if (Static38.anInt1241 <= local1720.anInt1141 && local1720.anInt1141 < Static38.anInt1241 + 8 && Static105.anInt2856 <= local1720.anInt1138 && Static105.anInt2856 + 8 > local1720.anInt1138 && Static132.anInt3270 == local1720.anInt1146) {
						local1720.anInt1142 = 0;
					}
				}
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 168) {
				local165 = Static33.aClass3_Sub11_Sub1_2.method978();
				Static28.method601(local165);
				Static2.anIntArray2[Static16.anInt418++ & 0x1F] = local165 & 0x7FFF;
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 99) {
				Static40.aBoolean67 = false;
				for (local165 = 0; local165 < 5; local165++) {
					Static6.aBooleanArray1[local165] = false;
				}
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 174) {
				Static88.method1630();
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 152) {
				Static17.anInt424 = Static33.aClass3_Sub11_Sub1_2.method981();
				Static3.anInt81 = Static71.anInt2023;
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 237) {
				local165 = Static33.aClass3_Sub11_Sub1_2.method973();
				local169 = Static33.aClass3_Sub11_Sub1_2.method1005();
				local173 = Static33.aClass3_Sub11_Sub1_2.method1005();
				Static132.anInt3270 = local165 >> 1;
				Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.method1881(local173, (local165 & 0x1) == 1, local169);
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 0) {
				local165 = Static33.aClass3_Sub11_Sub1_2.method1006();
				Static98.aClass22_4 = Static67.aClass75_4.method2181(local165);
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 252) {
				Static43.anInt2689 = Static4.anInt136;
				local514 = Static33.aClass3_Sub11_Sub1_2.method980();
				if (local514 == 0L) {
					Static60.anInt1823 = 0;
					Static72.anInt2056 = -1;
					Static80.aClass26_1123 = null;
					Static46.aClass3_Sub9Array1 = null;
					return true;
				}
				Static80.aClass26_1123 = Static111.method2010(local514);
				Static118.aByte8 = Static33.aClass3_Sub11_Sub1_2.method994();
				local173 = Static33.aClass3_Sub11_Sub1_2.method981();
				if (local173 == 255) {
					Static72.anInt2056 = -1;
					return true;
				}
				Static60.anInt1823 = local173;
				@Pc(1951) Class3_Sub9[] local1951 = new Class3_Sub9[100];
				for (local210 = 0; local210 < Static60.anInt1823; local210++) {
					local1951[local210] = new Class3_Sub9();
					local1951[local210].aLong100 = Static33.aClass3_Sub11_Sub1_2.method980();
					local1951[local210].aClass26_673 = Static111.method2010(local1951[local210].aLong100);
					local1951[local210].anInt1279 = Static33.aClass3_Sub11_Sub1_2.method974();
					local1951[local210].aByte3 = Static33.aClass3_Sub11_Sub1_2.method994();
					if (Static40.aLong36 == local1951[local210].aLong100) {
						Static47.aByte4 = local1951[local210].aByte3;
					}
				}
				local302 = Static60.anInt1823;
				while (local302 > 0) {
					local302--;
					@Pc(2021) boolean local2021 = true;
					for (local304 = 0; local304 < local302; local304++) {
						if (local1951[local304].aClass26_673.method827(local1951[local304 + 1].aClass26_673) > 0) {
							@Pc(2045) Class3_Sub9 local2045 = local1951[local304];
							local1951[local304] = local1951[local304 + 1];
							local1951[local304 + 1] = local2045;
							local2021 = false;
						}
					}
					if (local2021) {
						break;
					}
				}
				Static72.anInt2056 = -1;
				Static46.aClass3_Sub9Array1 = local1951;
				return true;
			}
			if (Static72.anInt2056 == 214) {
				Static38.anInt1241 = Static33.aClass3_Sub11_Sub1_2.method981();
				Static105.anInt2856 = Static33.aClass3_Sub11_Sub1_2.method1004();
				while (Static104.anInt2841 > Static33.aClass3_Sub11_Sub1_2.anInt1562) {
					Static72.anInt2056 = Static33.aClass3_Sub11_Sub1_2.method981();
					Static18.method275();
				}
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 238) {
				local165 = Static33.aClass3_Sub11_Sub1_2.method1006();
				local169 = Static33.aClass3_Sub11_Sub1_2.method974();
				local173 = Static33.aClass3_Sub11_Sub1_2.method973();
				local258 = (Class3_Sub17) Static52.aClass17_9.method599((long) local165);
				if (local258 != null) {
					Static36.method730(local258.anInt2552 != local169, local258);
				}
				Static39.method779(local169, local173, local165);
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 173) {
				local165 = Static33.aClass3_Sub11_Sub1_2.method981();
				local169 = Static33.aClass3_Sub11_Sub1_2.method981();
				local173 = Static33.aClass3_Sub11_Sub1_2.method981();
				local190 = Static33.aClass3_Sub11_Sub1_2.method981();
				Static6.aBooleanArray1[local165] = true;
				Static126.anIntArray387[local165] = local169;
				Static15.anIntArray53[local165] = local173;
				Static96.anIntArray310[local165] = local190;
				Static91.anIntArray302[local165] = 0;
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 132) {
				Static105.anInt2856 = Static33.aClass3_Sub11_Sub1_2.method981();
				Static38.anInt1241 = Static33.aClass3_Sub11_Sub1_2.method981();
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 160) {
				Static93.anInt2529 = Static33.aClass3_Sub11_Sub1_2.method981();
				if (Static93.anInt2529 == 1) {
					Static16.anInt420 = Static33.aClass3_Sub11_Sub1_2.method974();
				}
				if (Static93.anInt2529 >= 2 && Static93.anInt2529 <= 6) {
					if (Static93.anInt2529 == 2) {
						Static17.anInt422 = 64;
						Static17.anInt426 = 64;
					}
					if (Static93.anInt2529 == 3) {
						Static17.anInt426 = 0;
						Static17.anInt422 = 64;
					}
					if (Static93.anInt2529 == 4) {
						Static17.anInt422 = 64;
						Static17.anInt426 = 128;
					}
					if (Static93.anInt2529 == 5) {
						Static17.anInt422 = 0;
						Static17.anInt426 = 64;
					}
					if (Static93.anInt2529 == 6) {
						Static17.anInt426 = 64;
						Static17.anInt422 = 128;
					}
					Static93.anInt2529 = 2;
					Static124.anInt3202 = Static33.aClass3_Sub11_Sub1_2.method974();
					Static124.anInt3189 = Static33.aClass3_Sub11_Sub1_2.method974();
					Static95.anInt2598 = Static33.aClass3_Sub11_Sub1_2.method981();
				}
				if (Static93.anInt2529 == 10) {
					Static28.anInt981 = Static33.aClass3_Sub11_Sub1_2.method974();
				}
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 77) {
				local165 = Static33.aClass3_Sub11_Sub1_2.method1000();
				Static32.anInt1048 = local165;
				Static107.method1967(local165);
				Static102.method1898(Static32.anInt1048);
				for (local169 = 0; local169 < 100; local169++) {
					Static72.aBooleanArray19[local169] = true;
				}
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 233) {
				local165 = Static33.aClass3_Sub11_Sub1_2.method1006();
				local169 = Static33.aClass3_Sub11_Sub1_2.method988();
				local173 = Static33.aClass3_Sub11_Sub1_2.method1000();
				local1509 = Static100.method2212(local165);
				Static72.anInt2056 = -1;
				local1509.anInt2198 = local173 + (local169 << 16);
				return true;
			}
			@Pc(2614) int local2614;
			if (Static72.anInt2056 == 100) {
				local514 = Static33.aClass3_Sub11_Sub1_2.method980();
				local173 = Static33.aClass3_Sub11_Sub1_2.method974();
				local190 = Static33.aClass3_Sub11_Sub1_2.method981();
				@Pc(2404) Class26 local2404 = Static111.method2010(local514).method853();
				for (local214 = 0; local214 < Static133.anInt568; local214++) {
					if (Static105.aLongArray8[local214] == local514) {
						if (Static80.anIntArray221[local214] != local173) {
							Static80.anIntArray221[local214] = local173;
							if (local173 > 0) {
								Static67.method1915(Static119.method2136(new Class26[] { local2404, Static36.aClass26_608 }), Static22.aClass26_415, 5);
							}
							if (local173 == 0) {
								Static67.method1915(Static119.method2136(new Class26[] { local2404, Static89.aClass26_1287 }), Static22.aClass26_415, 5);
							}
						}
						Static55.anIntArray163[local214] = local190;
						local2404 = null;
						break;
					}
				}
				if (local2404 != null && Static133.anInt568 < 200) {
					Static105.aLongArray8[Static133.anInt568] = local514;
					Static33.aClass26Array9[Static133.anInt568] = local2404;
					Static80.anIntArray221[Static133.anInt568] = local173;
					Static55.anIntArray163[Static133.anInt568] = local190;
					Static133.anInt568++;
				}
				Static3.anInt81 = Static71.anInt2023;
				local302 = Static133.anInt568;
				while (local302 > 0) {
					@Pc(2523) boolean local2523 = true;
					local302--;
					for (local304 = 0; local304 < local302; local304++) {
						if (Static101.anInt2759 != Static80.anIntArray221[local304] && Static101.anInt2759 == Static80.anIntArray221[local304 + 1] || Static80.anIntArray221[local304] == 0 && Static80.anIntArray221[local304 + 1] != 0) {
							@Pc(2558) int local2558 = Static80.anIntArray221[local304];
							Static80.anIntArray221[local304] = Static80.anIntArray221[local304 + 1];
							Static80.anIntArray221[local304 + 1] = local2558;
							local2523 = false;
							@Pc(2578) Class26 local2578 = Static33.aClass26Array9[local304];
							Static33.aClass26Array9[local304] = Static33.aClass26Array9[local304 + 1];
							Static33.aClass26Array9[local304 + 1] = local2578;
							@Pc(2596) long local2596 = Static105.aLongArray8[local304];
							Static105.aLongArray8[local304] = Static105.aLongArray8[local304 + 1];
							Static105.aLongArray8[local304 + 1] = local2596;
							local2614 = Static55.anIntArray163[local304];
							Static55.anIntArray163[local304] = Static55.anIntArray163[local304 + 1];
							Static55.anIntArray163[local304 + 1] = local2614;
						}
					}
					if (local2523) {
						break;
					}
				}
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 92) {
				local165 = Static33.aClass3_Sub11_Sub1_2.method984();
				local169 = Static33.aClass3_Sub11_Sub1_2.method974();
				if (local165 < -70000) {
					local169 += 32768;
				}
				if (local165 >= 0) {
					local810 = Static100.method2212(local165);
				} else {
					local810 = null;
				}
				if (local810 != null) {
					for (local190 = 0; local190 < local810.anIntArray214.length; local190++) {
						local810.anIntArray214[local190] = 0;
						local810.anIntArray215[local190] = 0;
					}
				}
				Static124.method2189(local169);
				local190 = Static33.aClass3_Sub11_Sub1_2.method974();
				for (local210 = 0; local210 < local190; local210++) {
					local214 = Static33.aClass3_Sub11_Sub1_2.method973();
					if (local214 == 255) {
						local214 = Static33.aClass3_Sub11_Sub1_2.method984();
					}
					local298 = Static33.aClass3_Sub11_Sub1_2.method978();
					if (local810 != null && local210 < local810.anIntArray214.length) {
						local810.anIntArray214[local210] = local298;
						local810.anIntArray215[local210] = local214;
					}
					Static114.method2079(local214, local298 - 1, local210, local169);
				}
				if (local810 != null) {
					Static110.method2004(local810);
				}
				Static43.method1870();
				Static2.anIntArray2[Static16.anInt418++ & 0x1F] = local169 & 0x7FFF;
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 114) {
				local165 = Static33.aClass3_Sub11_Sub1_2.method987();
				local169 = Static33.aClass3_Sub11_Sub1_2.method974();
				if (local169 == 65535) {
					local169 = -1;
				}
				local173 = Static33.aClass3_Sub11_Sub1_2.method987();
				local1509 = Static100.method2212(local173);
				@Pc(2828) Class3_Sub1_Sub9 local2828;
				if (local1509.aBoolean113) {
					local1509.anInt2139 = local165;
					local1509.anInt2185 = local169;
					local2828 = Static117.method2099(local169);
					local1509.anInt2143 = local2828.anInt1691;
					local1509.anInt2192 = local2828.anInt1704;
					local1509.anInt2151 = local2828.anInt1696;
					if (local1509.anInt2146 > 0) {
						local1509.anInt2151 = local1509.anInt2151 * 32 / local1509.anInt2146;
					}
					local1509.anInt2179 = local2828.anInt1708;
					local1509.anInt2142 = local2828.anInt1713;
					local1509.anInt2184 = local2828.anInt1682;
					Static110.method2004(local1509);
				} else if (local169 == -1) {
					local1509.anInt2134 = 0;
					Static72.anInt2056 = -1;
					return true;
				} else {
					local2828 = Static117.method2099(local169);
					local1509.anInt2134 = 4;
					local1509.anInt2179 = local2828.anInt1708;
					local1509.anInt2201 = local169;
					local1509.anInt2192 = local2828.anInt1704;
					local1509.anInt2151 = local2828.anInt1696 * 100 / local165;
					Static110.method2004(local1509);
				}
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 163) {
				Static43.method1870();
				Static31.anInt2715 = Static33.aClass3_Sub11_Sub1_2.method981();
				Static67.anInt2791 = Static71.anInt2023;
				Static72.anInt2056 = -1;
				return true;
			}
			@Pc(2961) boolean local2961;
			if (Static72.anInt2056 == 108) {
				local989 = Static33.aClass3_Sub11_Sub1_2.method977();
				if (local989.method840(Static29.aClass26_482)) {
					local1110 = local989.method843(0, local989.method817(Static70.aClass26_776));
					local519 = local1110.method820();
					local2961 = false;
					for (local214 = 0; local214 < Static44.anInt1362; local214++) {
						if (local519 == Static14.aLongArray1[local214]) {
							local2961 = true;
							break;
						}
					}
					if (!local2961 && Static131.anInt3269 == 0) {
						Static67.method1915(Static133.aClass26_310, local1110, 4);
					}
				} else if (local989.method840(Static75.aClass26_1068)) {
					local1110 = local989.method843(0, local989.method817(Static70.aClass26_776));
					local519 = local1110.method820();
					local2961 = false;
					for (local214 = 0; local214 < Static44.anInt1362; local214++) {
						if (Static14.aLongArray1[local214] == local519) {
							local2961 = true;
							break;
						}
					}
					if (!local2961 && Static131.anInt3269 == 0) {
						Static67.method1915(Static9.aClass26_132, local1110, 8);
					}
				} else if (local989.method840(Static27.aClass26_468)) {
					local1110 = local989.method843(0, local989.method817(Static70.aClass26_776));
					local519 = local1110.method820();
					local2961 = false;
					for (local214 = 0; local214 < Static44.anInt1362; local214++) {
						if (Static14.aLongArray1[local214] == local519) {
							local2961 = true;
							break;
						}
					}
					if (!local2961 && Static131.anInt3269 == 0) {
						@Pc(3107) Class26 local3107 = local989.method843(local989.method817(Static70.aClass26_776) + 1, local989.method839() - 9);
						Static67.method1915(local3107, local1110, 8);
					}
				} else if (local989.method840(Static39.aClass26_643)) {
					local1110 = local989.method843(0, local989.method817(Static70.aClass26_776));
					local519 = local1110.method820();
					local2961 = false;
					for (local214 = 0; local214 < Static44.anInt1362; local214++) {
						if (local519 == Static14.aLongArray1[local214]) {
							local2961 = true;
							break;
						}
					}
					if (!local2961 && Static131.anInt3269 == 0) {
						Static67.method1915(Static22.aClass26_415, local1110, 10);
					}
				} else {
					Static67.method1915(local989, Static22.aClass26_415, 0);
				}
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 90) {
				Static43.method1875();
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 101) {
				for (local165 = 0; local165 < Static52.anIntArray159.length; local165++) {
					if (Static52.anIntArray159[local165] != Static30.anIntArray97[local165]) {
						Static52.anIntArray159[local165] = Static30.anIntArray97[local165];
						Static4.method77(local165);
						Static42.anIntArray141[Static125.anInt3205++ & 0x1F] = local165;
					}
				}
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 68) {
				Static1.anInt8 = 0;
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 137) {
				local165 = Static33.aClass3_Sub11_Sub1_2.method984();
				@Pc(3265) Class3_Sub17 local3265 = (Class3_Sub17) Static52.aClass17_9.method599((long) local165);
				if (local3265 != null) {
					Static36.method730(true, local3265);
				}
				if (Static79.aClass3_Sub14_8 != null) {
					Static110.method2004(Static79.aClass3_Sub14_8);
					Static79.aClass3_Sub14_8 = null;
				}
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 89) {
				local514 = Static33.aClass3_Sub11_Sub1_2.method980();
				Static33.aClass3_Sub11_Sub1_2.method994();
				local519 = Static33.aClass3_Sub11_Sub1_2.method980();
				local524 = Static33.aClass3_Sub11_Sub1_2.method974();
				@Pc(3311) long local3311 = (long) Static33.aClass3_Sub11_Sub1_2.method1013();
				local304 = Static33.aClass3_Sub11_Sub1_2.method981();
				local314 = (local524 << 32) + local3311;
				@Pc(3324) boolean local3324 = false;
				for (@Pc(3326) int local3326 = 0; local3326 < 100; local3326++) {
					if (local314 == Static29.aLongArray3[local3326]) {
						local3324 = true;
						break;
					}
				}
				if (local304 <= 1) {
					for (local2614 = 0; local2614 < Static44.anInt1362; local2614++) {
						if (Static14.aLongArray1[local2614] == local514) {
							local3324 = true;
							break;
						}
					}
				}
				if (!local3324 && Static131.anInt3269 == 0) {
					Static29.aLongArray3[Static85.anInt2340] = local314;
					Static85.anInt2340 = (Static85.anInt2340 + 1) % 100;
					@Pc(3390) Class26 local3390 = Static129.method1614(Static114.method2078(Static33.aClass3_Sub11_Sub1_2).method815());
					if (local304 == 2 || local304 == 3) {
						Static101.method1897(Static119.method2136(new Class26[] { Static105.aClass26_1537, Static111.method2010(local514).method853() }), 9, Static111.method2010(local519), local3390);
					} else if (local304 == 1) {
						Static101.method1897(Static119.method2136(new Class26[] { Static76.aClass26_1077, Static111.method2010(local514).method853() }), 9, Static111.method2010(local519), local3390);
					} else {
						Static101.method1897(Static111.method2010(local514).method853(), 9, Static111.method2010(local519), local3390);
					}
				}
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 5) {
				local165 = Static33.aClass3_Sub11_Sub1_2.method978();
				if (local165 == 65535) {
					local165 = -1;
				}
				Static48.method1040(local165);
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 86) {
				local165 = Static33.aClass3_Sub11_Sub1_2.method1013();
				local169 = Static33.aClass3_Sub11_Sub1_2.method988();
				if (local169 == 65535) {
					local169 = -1;
				}
				Static74.method1345(local169, local165);
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 69) {
				local989 = Static33.aClass3_Sub11_Sub1_2.method977();
				@Pc(3540) Object[] local3540 = new Object[local989.method839() + 1];
				for (local173 = local989.method839() - 1; local173 >= 0; local173--) {
					if (local989.method848(local173) == 115) {
						local3540[local173 + 1] = Static33.aClass3_Sub11_Sub1_2.method977();
					} else {
						local3540[local173 + 1] = Integer.valueOf(Static33.aClass3_Sub11_Sub1_2.method984());
					}
				}
				local3540[0] = Integer.valueOf(Static33.aClass3_Sub11_Sub1_2.method984());
				@Pc(3593) Class3_Sub15 local3593 = new Class3_Sub15();
				local3593.anObjectArray28 = local3540;
				Static28.method595(local3593);
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 143) {
				Static63.anInt1934 = Static33.aClass3_Sub11_Sub1_2.method981();
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 167) {
				Static64.method1264();
				Static72.anInt2056 = -1;
				return false;
			}
			if (Static72.anInt2056 == 199) {
				Static43.method1870();
				Static125.anInt3206 = Static33.aClass3_Sub11_Sub1_2.method1003();
				Static72.anInt2056 = -1;
				Static67.anInt2791 = Static71.anInt2023;
				return true;
			}
			if (Static72.anInt2056 == 244) {
				local165 = Static33.aClass3_Sub11_Sub1_2.method984();
				local169 = Static33.aClass3_Sub11_Sub1_2.method988();
				local173 = local169 >> 10 & 0x1F;
				local190 = local169 >> 5 & 0x1F;
				local210 = local169 & 0x1F;
				local214 = (local173 << 19) + (local190 << 11) + (local210 << 3);
				@Pc(3692) Class3_Sub14 local3692 = Static100.method2212(local165);
				if (local3692.anInt2167 != local214) {
					local3692.anInt2167 = local214;
					Static110.method2004(local3692);
				}
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 75) {
				Static44.anInt1362 = Static104.anInt2841 / 8;
				for (local165 = 0; local165 < Static44.anInt1362; local165++) {
					Static14.aLongArray1[local165] = Static33.aClass3_Sub11_Sub1_2.method980();
				}
				Static72.anInt2056 = -1;
				Static3.anInt81 = Static71.anInt2023;
				return true;
			}
			if (Static72.anInt2056 == 37) {
				local165 = Static33.aClass3_Sub11_Sub1_2.method988();
				local169 = Static33.aClass3_Sub11_Sub1_2.method987();
				Static30.anIntArray97[local165] = local169;
				if (local169 != Static52.anIntArray159[local165]) {
					Static52.anIntArray159[local165] = local169;
					Static4.method77(local165);
				}
				Static42.anIntArray141[Static125.anInt3205++ & 0x1F] = local165;
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 207) {
				local165 = Static33.aClass3_Sub11_Sub1_2.method1000();
				local169 = Static33.aClass3_Sub11_Sub1_2.method984();
				local810 = Static100.method2212(local169);
				if (local810.anInt2134 != 2 || local165 != local810.anInt2201) {
					local810.anInt2201 = local165;
					local810.anInt2134 = 2;
					Static110.method2004(local810);
				}
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 23) {
				local514 = Static33.aClass3_Sub11_Sub1_2.method980();
				@Pc(3842) Class26 local3842 = Static129.method1614(Static114.method2078(Static33.aClass3_Sub11_Sub1_2).method815());
				Static67.method1915(local3842, Static111.method2010(local514).method853(), 6);
				Static72.anInt2056 = -1;
				return true;
			}
			if (Static72.anInt2056 == 104) {
				local514 = Static33.aClass3_Sub11_Sub1_2.method980();
				local173 = Static33.aClass3_Sub11_Sub1_2.method974();
				local2961 = false;
				if ((local514 & Long.MIN_VALUE) != 0L) {
					local2961 = true;
				}
				@Pc(3886) byte local3886 = Static33.aClass3_Sub11_Sub1_2.method994();
				if (local2961) {
					if (Static60.anInt1823 == 0) {
						Static72.anInt2056 = -1;
						return true;
					}
					local514 &= Long.MAX_VALUE;
					for (local214 = 0; Static60.anInt1823 > local214 && (Static46.aClass3_Sub9Array1[local214].aLong100 != local514 || local173 != Static46.aClass3_Sub9Array1[local214].anInt1279); local214++) {
					}
					if (local214 < Static60.anInt1823) {
						while (Static60.anInt1823 - 1 > local214) {
							Static46.aClass3_Sub9Array1[local214] = Static46.aClass3_Sub9Array1[local214 + 1];
							local214++;
						}
						Static46.aClass3_Sub9Array1[Static60.anInt1823] = null;
						Static60.anInt1823--;
					}
				} else {
					@Pc(3964) Class3_Sub9 local3964 = new Class3_Sub9();
					local3964.aLong100 = local514;
					local3964.aClass26_673 = Static111.method2010(local3964.aLong100);
					local3964.aByte3 = local3886;
					local3964.anInt1279 = local173;
					for (local298 = Static60.anInt1823 - 1; local298 >= 0; local298--) {
						local302 = Static46.aClass3_Sub9Array1[local298].aClass26_673.method827(local3964.aClass26_673);
						if (local302 == 0) {
							Static46.aClass3_Sub9Array1[local298].anInt1279 = local173;
							Static46.aClass3_Sub9Array1[local298].aByte3 = local3886;
							if (Static40.aLong36 == local514) {
								Static47.aByte4 = local3886;
							}
							Static72.anInt2056 = -1;
							Static43.anInt2689 = Static4.anInt136;
							return true;
						}
						if (local302 < 0) {
							break;
						}
					}
					if (Static46.aClass3_Sub9Array1.length <= Static60.anInt1823) {
						Static72.anInt2056 = -1;
						return true;
					}
					for (local302 = Static60.anInt1823 - 1; local302 > local298; local302--) {
						Static46.aClass3_Sub9Array1[local302 + 1] = Static46.aClass3_Sub9Array1[local302];
					}
					if (Static60.anInt1823 == 0) {
						Static46.aClass3_Sub9Array1 = new Class3_Sub9[100];
					}
					Static46.aClass3_Sub9Array1[local298 + 1] = local3964;
					Static60.anInt1823++;
					if (Static40.aLong36 == local514) {
						Static47.aByte4 = local3886;
					}
				}
				Static72.anInt2056 = -1;
				Static43.anInt2689 = Static4.anInt136;
				return true;
			}
			if (Static72.anInt2056 == 222) {
				Static110.method2002(true);
				Static72.anInt2056 = -1;
				return true;
			}
			Static38.method768(null, "T1 - " + Static72.anInt2056 + "," + Static65.anInt1955 + "," + Static85.anInt2341 + " - " + Static104.anInt2841);
			Static64.method1264();
		} catch (@Pc(4130) IOException local4130) {
			Static17.method274();
		} catch (@Pc(4136) Exception local4136) {
			@Pc(4176) String local4176 = "T2 - " + Static72.anInt2056 + "," + Static65.anInt1955 + "," + Static85.anInt2341 + " - " + Static104.anInt2841 + "," + (Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0] + Static10.anInt286) + "," + (Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0] + Static56.anInt1700) + " - ";
			for (local169 = 0; Static104.anInt2841 > local169 && local169 < 50; local169++) {
				local4176 = local4176 + Static33.aClass3_Sub11_Sub1_2.aByteArray13[local169] + ",";
			}
			Static38.method768(local4136, local4176);
			Static64.method1264();
		}
		return true;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
	public static void method1364() {
		for (@Pc(6) Class3_Sub22 local6 = (Class3_Sub22) Static70.aClass65_38.method1958(); local6 != null; local6 = (Class3_Sub22) Static70.aClass65_38.method1962()) {
			if (local6.aClass3_Sub3_Sub3_3 != null) {
				Static5.aClass3_Sub3_Sub2_63.method1074(local6.aClass3_Sub3_Sub3_3);
				local6.aClass3_Sub3_Sub3_3 = null;
			}
			if (local6.aClass3_Sub3_Sub3_2 != null) {
				Static5.aClass3_Sub3_Sub2_63.method1074(local6.aClass3_Sub3_Sub3_2);
				local6.aClass3_Sub3_Sub3_2 = null;
			}
		}
		Static70.aClass65_38.method1957();
	}
}

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!s", name = "a", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1438 = Static161.method2971("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!s", name = "g", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1441 = Static161.method2971("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!s", name = "b", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1439 = aClass13_1441;

	@OriginalMember(owner = "client!s", name = "c", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1440 = Static161.method2971(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!s", name = "e", descriptor = "[[S")
	public static short[][] aShortArrayArray8 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!s", name = "h", descriptor = "I")
	public static int anInt4127 = 0;

	@OriginalMember(owner = "client!s", name = "i", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1442 = Static161.method2971(")1 ");

	@OriginalMember(owner = "client!s", name = "l", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1443 = Static161.method2971(":tradereq:");

	@OriginalMember(owner = "client!s", name = "p", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1444 = Static161.method2971("k");

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)Z")
	public static boolean method3030() {
		if (Static96.aClass62_4 == null) {
			return false;
		}
		@Pc(133) int local133;
		try {
			@Pc(13) int local13 = Static96.aClass62_4.method2280();
			if (local13 == 0) {
				return false;
			}
			if (Static184.anInt4077 == -1) {
				local13--;
				Static96.aClass62_4.method2279(1, Static153.aClass1_Sub8_Sub1_2.aByteArray27, 0);
				Static153.aClass1_Sub8_Sub1_2.anInt2195 = 0;
				Static184.anInt4077 = Static153.aClass1_Sub8_Sub1_2.method1663();
				Static89.anInt2506 = Static73.anIntArray225[Static184.anInt4077];
			}
			if (Static89.anInt2506 == -1) {
				if (local13 <= 0) {
					return false;
				}
				local13--;
				Static96.aClass62_4.method2279(1, Static153.aClass1_Sub8_Sub1_2.aByteArray27, 0);
				Static89.anInt2506 = Static153.aClass1_Sub8_Sub1_2.aByteArray27[0] & 0xFF;
			}
			if (Static89.anInt2506 == -2) {
				if (local13 <= 1) {
					return false;
				}
				local13 -= 2;
				Static96.aClass62_4.method2279(2, Static153.aClass1_Sub8_Sub1_2.aByteArray27, 0);
				Static153.aClass1_Sub8_Sub1_2.anInt2195 = 0;
				Static89.anInt2506 = Static153.aClass1_Sub8_Sub1_2.method1642();
			}
			if (Static89.anInt2506 > local13) {
				return false;
			}
			Static153.aClass1_Sub8_Sub1_2.anInt2195 = 0;
			Static96.aClass62_4.method2279(Static89.anInt2506, Static153.aClass1_Sub8_Sub1_2.aByteArray27, 0);
			Static10.anInt387 = Static101.anInt2828;
			Static143.anInt3523 = 0;
			Static101.anInt2828 = Static101.anInt2830;
			Static101.anInt2830 = Static184.anInt4077;
			@Pc(123) int local123;
			if (Static184.anInt4077 == 6) {
				local123 = Static153.aClass1_Sub8_Sub1_2.method1624();
				Static82.anInt2319 = local123;
				Static23.method852(local123);
				Static184.method2991(Static82.anInt2319);
				for (local133 = 0; local133 < 100; local133++) {
					Static140.aBooleanArray45[local133] = true;
				}
				Static184.anInt4077 = -1;
				return true;
			}
			@Pc(162) Class20 local162;
			if (Static184.anInt4077 == 253) {
				local123 = Static153.aClass1_Sub8_Sub1_2.method1649();
				local133 = Static153.aClass1_Sub8_Sub1_2.method1602();
				local162 = Static119.method2230(local133);
				if (local123 != local162.anInt1588 || local123 == -1) {
					local162.anInt1553 = 0;
					local162.anInt1588 = local123;
					local162.anInt1580 = 0;
					Static125.method2300(local162);
				}
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 0) {
				Static84.anInt2393 = Static153.aClass1_Sub8_Sub1_2.method1607();
				Static88.anInt2490 = Static10.anInt388;
				Static184.anInt4077 = -1;
				return true;
			}
			@Pc(213) int local213;
			@Pc(217) int local217;
			@Pc(221) int local221;
			if (Static184.anInt4077 == 214) {
				local123 = Static153.aClass1_Sub8_Sub1_2.method1607();
				local133 = Static153.aClass1_Sub8_Sub1_2.method1607();
				local213 = Static153.aClass1_Sub8_Sub1_2.method1607();
				local217 = Static153.aClass1_Sub8_Sub1_2.method1607();
				local221 = Static153.aClass1_Sub8_Sub1_2.method1642();
				Static42.aBooleanArray22[local123] = true;
				Static24.anIntArray109[local123] = local133;
				Static85.anIntArray238[local123] = local213;
				Static15.anIntArray97[local123] = local217;
				Static32.anIntArray450[local123] = local221;
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 78) {
				Static108.anInt2954 = Static153.aClass1_Sub8_Sub1_2.method1607();
				Static10.anInt392 = Static153.aClass1_Sub8_Sub1_2.method1638();
				for (local123 = Static10.anInt392; local123 < Static10.anInt392 + 8; local123++) {
					for (local133 = Static108.anInt2954; local133 < Static108.anInt2954 + 8; local133++) {
						if (Static131.aClass82ArrayArrayArray1[Static156.anInt3696][local123][local133] != null) {
							Static131.aClass82ArrayArrayArray1[Static156.anInt3696][local123][local133] = null;
							Static162.method2778(local133, local123);
						}
					}
				}
				for (@Pc(307) Class1_Sub7 local307 = (Class1_Sub7) Static124.aClass82_9.method2849(); local307 != null; local307 = (Class1_Sub7) Static124.aClass82_9.method2855()) {
					if (Static10.anInt392 <= local307.anInt718 && local307.anInt718 < Static10.anInt392 + 8 && Static108.anInt2954 <= local307.anInt727 && local307.anInt727 < Static108.anInt2954 + 8 && local307.anInt729 == Static156.anInt3696) {
						local307.anInt712 = 0;
					}
				}
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 108) {
				Static44.method1171();
				Static184.anInt4077 = -1;
				return false;
			}
			if (Static184.anInt4077 == 105) {
				for (local123 = 0; local123 < Static118.anInt3117; local123++) {
					@Pc(379) Class1_Sub2_Sub4 local379 = Static99.method1996(local123);
					if (local379 != null && local379.anInt873 == 0) {
						Static98.anIntArray390[local123] = 0;
						Static103.anIntArray266[local123] = 0;
					}
				}
				method3035();
				Static184.anInt4077 = -1;
				Static103.anInt2855 += 32;
				return true;
			}
			if (Static184.anInt4077 == 18) {
				for (local123 = 0; local123 < Static103.anIntArray266.length; local123++) {
					if (Static98.anIntArray390[local123] != Static103.anIntArray266[local123]) {
						Static103.anIntArray266[local123] = Static98.anIntArray390[local123];
						Static145.method2572(local123);
						Static63.anIntArray196[Static103.anInt2855++ & 0x1F] = local123;
					}
				}
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 111) {
				Static124.anInt3220 = Static89.anInt2506 / 8;
				for (local123 = 0; local123 < Static124.anInt3220; local123++) {
					Static5.aLongArray1[local123] = Static153.aClass1_Sub8_Sub1_2.method1616();
					Static52.aClass13Array13[local123] = Static43.method1141(Static5.aLongArray1[local123]);
				}
				Static184.anInt4077 = -1;
				Static88.anInt2490 = Static10.anInt388;
				return true;
			}
			if (Static184.anInt4077 == 198) {
				local123 = Static153.aClass1_Sub8_Sub1_2.method1642();
				local133 = Static153.aClass1_Sub8_Sub1_2.method1607();
				if (local123 == 65535) {
					local123 = -1;
				}
				local213 = Static153.aClass1_Sub8_Sub1_2.method1642();
				Static149.method2600(local133, local123, local213);
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 26) {
				local123 = Static153.aClass1_Sub8_Sub1_2.method1607();
				local133 = local123 >> 6;
				@Pc(534) Class41 local534 = new Class41();
				local534.anInt2172 = local123 & 0x3F;
				local534.anInt2163 = Static153.aClass1_Sub8_Sub1_2.method1607();
				if (local534.anInt2163 >= 0 && local534.anInt2163 < Static182.aClass1_Sub2_Sub1_Sub3Array3.length) {
					if (local534.anInt2172 == 1 || local534.anInt2172 == 10) {
						local534.anInt2165 = Static153.aClass1_Sub8_Sub1_2.method1642();
					}
					if (local534.anInt2172 >= 2 && local534.anInt2172 <= 6) {
						if (local534.anInt2172 == 2) {
							local534.anInt2169 = 64;
							local534.anInt2171 = 64;
						}
						if (local534.anInt2172 == 3) {
							local534.anInt2169 = 0;
							local534.anInt2171 = 64;
						}
						if (local534.anInt2172 == 4) {
							local534.anInt2171 = 64;
							local534.anInt2169 = 128;
						}
						if (local534.anInt2172 == 5) {
							local534.anInt2171 = 0;
							local534.anInt2169 = 64;
						}
						if (local534.anInt2172 == 6) {
							local534.anInt2171 = 128;
							local534.anInt2169 = 64;
						}
						local534.anInt2172 = 2;
						local534.anInt2170 = Static153.aClass1_Sub8_Sub1_2.method1642();
						local534.anInt2167 = Static153.aClass1_Sub8_Sub1_2.method1642();
						local534.anInt2173 = Static153.aClass1_Sub8_Sub1_2.method1607();
					}
					Static144.aClass41Array1[local133] = local534;
				}
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 134) {
				local123 = Static153.aClass1_Sub8_Sub1_2.method1617();
				local133 = Static153.aClass1_Sub8_Sub1_2.method1642();
				Static98.anIntArray390[local133] = local123;
				if (local123 != Static103.anIntArray266[local133]) {
					Static103.anIntArray266[local133] = local123;
					Static145.method2572(local133);
				}
				Static63.anIntArray196[Static103.anInt2855++ & 0x1F] = local133;
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 187) {
				Static16.anInt689 = Static153.aClass1_Sub8_Sub1_2.method1642() * 30;
				Static184.anInt4077 = -1;
				Static1.anInt65 = Static10.anInt388;
				return true;
			}
			if (Static184.anInt4077 == 216) {
				Static166.method2844(Static153.aClass1_Sub8_Sub1_2);
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 160) {
				Static40.method1044(false);
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 201) {
				local123 = Static153.aClass1_Sub8_Sub1_2.method1642();
				if (local123 == 65535) {
					local123 = -1;
				}
				Static122.method2275(local123);
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 34) {
				local123 = Static153.aClass1_Sub8_Sub1_2.method1624();
				if (local123 == 65535) {
					local123 = -1;
				}
				local133 = Static153.aClass1_Sub8_Sub1_2.method1605();
				Static106.method2063(local133, local123);
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 95) {
				local123 = Static153.aClass1_Sub8_Sub1_2.method1652();
				@Pc(799) Class20 local799 = Static119.method2230(local123);
				local799.anInt1595 = 3;
				local799.anInt1556 = Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.aClass6_2.method639();
				Static125.method2300(local799);
				Static184.anInt4077 = -1;
				return true;
			}
			@Pc(836) Class20 local836;
			if (Static184.anInt4077 == 50) {
				local123 = Static153.aClass1_Sub8_Sub1_2.method1624();
				local133 = Static153.aClass1_Sub8_Sub1_2.method1634();
				local213 = Static153.aClass1_Sub8_Sub1_2.method1602();
				local836 = Static119.method2230(local213);
				Static184.anInt4077 = -1;
				local836.anInt1614 = local133 + (local123 << 16);
				return true;
			}
			@Pc(910) int local910;
			@Pc(976) int local976;
			@Pc(858) long local858;
			@Pc(980) boolean local980;
			@Pc(983) int local983;
			@Pc(880) long local880;
			if (Static184.anInt4077 == 1) {
				Static69.anInt1982 = Static10.anInt388;
				local858 = Static153.aClass1_Sub8_Sub1_2.method1616();
				if (local858 == 0L) {
					Static10.aClass13_169 = null;
					Static184.anInt4077 = -1;
					Static11.anInt411 = 0;
					Static40.aClass13_453 = null;
					Static156.aClass1_Sub11Array1 = null;
					return true;
				}
				local880 = Static153.aClass1_Sub8_Sub1_2.method1616();
				Static10.aClass13_169 = Static43.method1141(local880);
				Static40.aClass13_453 = Static43.method1141(local858);
				Static134.aByte8 = Static153.aClass1_Sub8_Sub1_2.method1611();
				local221 = Static153.aClass1_Sub8_Sub1_2.method1607();
				if (local221 == 255) {
					Static184.anInt4077 = -1;
					return true;
				}
				Static11.anInt411 = local221;
				@Pc(908) Class1_Sub11[] local908 = new Class1_Sub11[100];
				for (local910 = 0; local910 < Static11.anInt411; local910++) {
					local908[local910] = new Class1_Sub11();
					local908[local910].aLong158 = Static153.aClass1_Sub8_Sub1_2.method1616();
					local908[local910].aClass13_767 = Static43.method1141(local908[local910].aLong158);
					local908[local910].anInt2318 = Static153.aClass1_Sub8_Sub1_2.method1642();
					local908[local910].aByte5 = Static153.aClass1_Sub8_Sub1_2.method1611();
					local908[local910].aClass13_772 = Static153.aClass1_Sub8_Sub1_2.method1622();
					if (Static134.aLong112 == local908[local910].aLong158) {
						Static20.aByte2 = local908[local910].aByte5;
					}
				}
				local976 = Static11.anInt411;
				while (local976 > 0) {
					local980 = true;
					local976--;
					for (local983 = 0; local983 < local976; local983++) {
						if (local908[local983].aClass13_767.method896(local908[local983 + 1].aClass13_767) > 0) {
							local980 = false;
							@Pc(1007) Class1_Sub11 local1007 = local908[local983];
							local908[local983] = local908[local983 + 1];
							local908[local983 + 1] = local1007;
						}
					}
					if (local980) {
						break;
					}
				}
				Static156.aClass1_Sub11Array1 = local908;
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 51) {
				local123 = Static153.aClass1_Sub8_Sub1_2.method1636();
				Static112.method2187(local123);
				Static93.anIntArray259[Static59.anInt1838++ & 0x1F] = local123 & 0x7FFF;
				Static184.anInt4077 = -1;
				return true;
			}
			@Pc(1112) long local1112;
			if (Static184.anInt4077 == 136) {
				local123 = Static153.aClass1_Sub8_Sub1_2.method1652();
				local133 = Static153.aClass1_Sub8_Sub1_2.method1642();
				if (local133 == 65535) {
					local133 = -1;
				}
				local213 = Static153.aClass1_Sub8_Sub1_2.method1624();
				local217 = Static153.aClass1_Sub8_Sub1_2.method1617();
				if (local213 == 65535) {
					local213 = -1;
				}
				for (local221 = local133; local221 <= local213; local221++) {
					local1112 = (long) local221 + ((long) local123 << 32);
					@Pc(1117) Class1 local1117 = Static22.aClass45_8.method1988(local1112);
					if (local1117 != null) {
						local1117.method3056();
					}
					Static22.aClass45_8.method1981(new Class1_Sub6(local217), local1112);
				}
				Static184.anInt4077 = -1;
				return true;
			}
			@Pc(1193) int local1193;
			@Pc(1278) int local1278;
			@Pc(1280) int local1280;
			if (Static184.anInt4077 == 102) {
				local123 = Static89.anInt2506 + Static153.aClass1_Sub8_Sub1_2.anInt2195;
				local133 = Static153.aClass1_Sub8_Sub1_2.method1642();
				local213 = Static153.aClass1_Sub8_Sub1_2.method1642();
				if (Static82.anInt2319 != local133) {
					Static82.anInt2319 = local133;
					Static23.method852(Static82.anInt2319);
					Static184.method2991(Static82.anInt2319);
					for (local217 = 0; local217 < 100; local217++) {
						Static140.aBooleanArray45[local217] = true;
					}
				}
				while (local213-- > 0) {
					local217 = Static153.aClass1_Sub8_Sub1_2.method1626();
					local221 = Static153.aClass1_Sub8_Sub1_2.method1642();
					local1193 = Static153.aClass1_Sub8_Sub1_2.method1607();
					@Pc(1200) Class1_Sub22 local1200 = (Class1_Sub22) Static18.aClass45_3.method1988((long) local217);
					if (local1200 != null && local1200.anInt3978 != local221) {
						Static4.method83(true, local1200);
						local1200 = null;
					}
					if (local1200 == null) {
						local1200 = Static88.method1855(local217, local221, local1193);
					}
					local1200.aBoolean310 = true;
				}
				for (@Pc(1234) Class1_Sub22 local1234 = (Class1_Sub22) Static18.aClass45_3.method1982(); local1234 != null; local1234 = (Class1_Sub22) Static18.aClass45_3.method1986()) {
					if (local1234.aBoolean310) {
						local1234.aBoolean310 = false;
					} else {
						Static4.method83(true, local1234);
					}
				}
				Static22.aClass45_8 = new Class45(512);
				while (Static153.aClass1_Sub8_Sub1_2.anInt2195 < local123) {
					local221 = Static153.aClass1_Sub8_Sub1_2.method1626();
					local1193 = Static153.aClass1_Sub8_Sub1_2.method1642();
					local910 = Static153.aClass1_Sub8_Sub1_2.method1642();
					local1278 = Static153.aClass1_Sub8_Sub1_2.method1626();
					for (local1280 = local1193; local1280 <= local910; local1280++) {
						@Pc(1291) long local1291 = ((long) local221 << 32) + ((long) local1280);
						Static22.aClass45_8.method1981(new Class1_Sub6(local1278), local1291);
					}
				}
				Static184.anInt4077 = -1;
				return true;
			}
			@Pc(1346) Class13 local1346;
			@Pc(1528) Class13 local1528;
			if (Static184.anInt4077 == 90) {
				local858 = Static153.aClass1_Sub8_Sub1_2.method1616();
				local213 = Static153.aClass1_Sub8_Sub1_2.method1642();
				local217 = Static153.aClass1_Sub8_Sub1_2.method1607();
				@Pc(1334) Class13 local1334 = Static16.aClass13_253;
				if (local213 > 0) {
					local1334 = Static153.aClass1_Sub8_Sub1_2.method1622();
				}
				local1346 = Static43.method1141(local858).method903();
				for (local910 = 0; local910 < Static21.anInt784; local910++) {
					if (local858 == Static149.aLongArray8[local910]) {
						if (local213 != Static162.anIntArray427[local910]) {
							Static162.anIntArray427[local910] = local213;
							if (local213 > 0) {
								Static169.method2887(Static16.aClass13_253, Static57.method1349(new Class13[] { local1346, Static147.aClass13_1237 }), 5);
							}
							if (local213 == 0) {
								Static169.method2887(Static16.aClass13_253, Static57.method1349(new Class13[] { local1346, Static47.aClass13_1092 }), 5);
							}
						}
						local1346 = null;
						Static60.aClass13Array16[local910] = local1334;
						Static39.anIntArray133[local910] = local217;
						break;
					}
				}
				if (local1346 != null && Static21.anInt784 < 200) {
					Static149.aLongArray8[Static21.anInt784] = local858;
					Static34.aClass13Array7[Static21.anInt784] = local1346;
					Static162.anIntArray427[Static21.anInt784] = local213;
					Static60.aClass13Array16[Static21.anInt784] = local1334;
					Static39.anIntArray133[Static21.anInt784] = local217;
					Static21.anInt784++;
				}
				Static88.anInt2490 = Static10.anInt388;
				local1280 = Static21.anInt784;
				while (local1280 > 0) {
					local1280--;
					local980 = true;
					for (local976 = 0; local976 < local1280; local976++) {
						if (Static162.anIntArray427[local976] != Static89.anInt2510 && Static89.anInt2510 == Static162.anIntArray427[local976 + 1] || Static162.anIntArray427[local976] == 0 && Static162.anIntArray427[local976 + 1] != 0) {
							local983 = Static162.anIntArray427[local976];
							local980 = false;
							Static162.anIntArray427[local976] = Static162.anIntArray427[local976 + 1];
							Static162.anIntArray427[local976 + 1] = local983;
							local1528 = Static60.aClass13Array16[local976];
							Static60.aClass13Array16[local976] = Static60.aClass13Array16[local976 + 1];
							Static60.aClass13Array16[local976 + 1] = local1528;
							@Pc(1546) Class13 local1546 = Static34.aClass13Array7[local976];
							Static34.aClass13Array7[local976] = Static34.aClass13Array7[local976 + 1];
							Static34.aClass13Array7[local976 + 1] = local1546;
							@Pc(1564) long local1564 = Static149.aLongArray8[local976];
							Static149.aLongArray8[local976] = Static149.aLongArray8[local976 + 1];
							Static149.aLongArray8[local976 + 1] = local1564;
							@Pc(1582) int local1582 = Static39.anIntArray133[local976];
							Static39.anIntArray133[local976] = Static39.anIntArray133[local976 + 1];
							Static39.anIntArray133[local976 + 1] = local1582;
						}
					}
					if (local980) {
						break;
					}
				}
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 127) {
				if (Static82.anInt2319 != -1) {
					Static73.method1541(Static82.anInt2319, 0);
				}
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 120) {
				local123 = Static153.aClass1_Sub8_Sub1_2.method1634();
				@Pc(1639) byte local1639 = Static153.aClass1_Sub8_Sub1_2.method1609();
				Static98.anIntArray390[local123] = local1639;
				if (Static103.anIntArray266[local123] != local1639) {
					Static103.anIntArray266[local123] = local1639;
					Static145.method2572(local123);
				}
				Static63.anIntArray196[Static103.anInt2855++ & 0x1F] = local123;
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 207) {
				method3035();
				Static103.anInt2871 = Static153.aClass1_Sub8_Sub1_2.method1607();
				Static184.anInt4077 = -1;
				Static1.anInt65 = Static10.anInt388;
				return true;
			}
			if (Static184.anInt4077 == 42) {
				local123 = Static153.aClass1_Sub8_Sub1_2.method1617();
				local133 = Static153.aClass1_Sub8_Sub1_2.method1624();
				local213 = Static153.aClass1_Sub8_Sub1_2.method1652();
				local836 = Static119.method2230(local213);
				if (local133 == 65535) {
					local133 = -1;
				}
				@Pc(1734) Class1_Sub2_Sub6 local1734;
				if (local836.aBoolean118) {
					local836.anInt1562 = local123;
					local836.anInt1564 = local133;
					local1734 = Static184.method2994(local133);
					local836.anInt1600 = local1734.anInt1299;
					local836.anInt1606 = local1734.anInt1288;
					local836.anInt1589 = local1734.anInt1326;
					local836.anInt1590 = local1734.anInt1305;
					local836.anInt1560 = local1734.anInt1322;
					if (local836.anInt1559 > 0) {
						local836.anInt1560 = local836.anInt1560 * 32 / local836.anInt1559;
					}
					local836.anInt1583 = local1734.anInt1291;
					Static125.method2300(local836);
				} else if (local133 == -1) {
					local836.anInt1595 = 0;
					Static184.anInt4077 = -1;
					return true;
				} else {
					local1734 = Static184.method2994(local133);
					local836.anInt1595 = 4;
					local836.anInt1600 = local1734.anInt1299;
					local836.anInt1560 = local1734.anInt1322 * 100 / local123;
					local836.anInt1556 = local133;
					local836.anInt1589 = local1734.anInt1326;
					Static125.method2300(local836);
				}
				Static184.anInt4077 = -1;
				return true;
			}
			@Pc(1837) long local1837;
			if (Static184.anInt4077 == 122) {
				local858 = Static153.aClass1_Sub8_Sub1_2.method1616();
				local880 = Static153.aClass1_Sub8_Sub1_2.method1642();
				@Pc(1831) long local1831 = (long) Static153.aClass1_Sub8_Sub1_2.method1618();
				local1837 = local1831 + (local880 << 32);
				local910 = Static153.aClass1_Sub8_Sub1_2.method1607();
				@Pc(1843) boolean local1843 = false;
				for (local983 = 0; local983 < 100; local983++) {
					if (Static25.aLongArray3[local983] == local1837) {
						local1843 = true;
						break;
					}
				}
				if (local910 <= 1) {
					for (@Pc(1874) int local1874 = 0; local1874 < Static124.anInt3220; local1874++) {
						if (Static5.aLongArray1[local1874] == local858) {
							local1843 = true;
							break;
						}
					}
				}
				if (!local1843 && Static49.anInt1575 == 0) {
					Static25.aLongArray3[Static11.anInt410] = local1837;
					Static11.anInt410 = (Static11.anInt410 + 1) % 100;
					local1528 = Static177.method241(Static98.method2709(Static153.aClass1_Sub8_Sub1_2).method914());
					if (local910 == 2 || local910 == 3) {
						Static169.method2887(Static57.method1349(new Class13[] { Static87.aClass13_819, Static43.method1141(local858).method903() }), local1528, 7);
					} else if (local910 == 1) {
						Static169.method2887(Static57.method1349(new Class13[] { Static41.aClass13_461, Static43.method1141(local858).method903() }), local1528, 7);
					} else {
						Static169.method2887(Static43.method1141(local858).method903(), local1528, 3);
					}
				}
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 63) {
				method3035();
				Static20.anInt773 = Static153.aClass1_Sub8_Sub1_2.method1627();
				Static1.anInt65 = Static10.anInt388;
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 155) {
				Static29.anInt1044 = Static153.aClass1_Sub8_Sub1_2.method1607();
				Static184.anInt4077 = -1;
				return true;
			}
			@Pc(2021) Class13 local2021;
			@Pc(2035) Class13 local2035;
			@Pc(2037) boolean local2037;
			if (Static184.anInt4077 == 218) {
				local2021 = Static153.aClass1_Sub8_Sub1_2.method1622();
				if (local2021.method874(aClass13_1443)) {
					local2035 = local2021.method883(0, local2021.method884(Static33.aClass13_393));
					local2037 = false;
					local880 = local2035.method878();
					for (local1193 = 0; local1193 < Static124.anInt3220; local1193++) {
						if (Static5.aLongArray1[local1193] == local880) {
							local2037 = true;
							break;
						}
					}
					if (!local2037 && Static49.anInt1575 == 0) {
						Static169.method2887(local2035, Static57.aClass13_609, 4);
					}
				} else if (local2021.method874(Static157.aClass13_1280)) {
					local2035 = local2021.method883(0, local2021.method884(Static33.aClass13_393));
					local880 = local2035.method878();
					local2037 = false;
					for (local1193 = 0; local1193 < Static124.anInt3220; local1193++) {
						if (local880 == Static5.aLongArray1[local1193]) {
							local2037 = true;
							break;
						}
					}
					if (!local2037 && Static49.anInt1575 == 0) {
						@Pc(2142) Class13 local2142 = local2021.method883(local2021.method884(Static33.aClass13_393) + 1, local2021.method904() + -9);
						Static169.method2887(local2035, local2142, 8);
					}
				} else if (local2021.method874(Static45.aClass13_517)) {
					local2037 = false;
					local2035 = local2021.method883(0, local2021.method884(Static33.aClass13_393));
					local880 = local2035.method878();
					for (local1193 = 0; local1193 < Static124.anInt3220; local1193++) {
						if (local880 == Static5.aLongArray1[local1193]) {
							local2037 = true;
							break;
						}
					}
					if (!local2037 && Static49.anInt1575 == 0) {
						Static169.method2887(local2035, Static16.aClass13_253, 10);
					}
				} else if (local2021.method874(Static7.aClass13_1056)) {
					local2035 = local2021.method883(0, local2021.method884(Static7.aClass13_1056));
					Static169.method2887(Static16.aClass13_253, local2035, 11);
				} else if (local2021.method874(Static156.aClass13_1260)) {
					local2035 = local2021.method883(0, local2021.method884(Static156.aClass13_1260));
					if (Static49.anInt1575 == 0) {
						Static169.method2887(Static16.aClass13_253, local2035, 12);
					}
				} else if (local2021.method874(Static133.aClass13_1123)) {
					local2035 = local2021.method883(0, local2021.method884(Static133.aClass13_1123));
					if (Static49.anInt1575 == 0) {
						Static169.method2887(Static16.aClass13_253, local2035, 13);
					}
				} else if (local2021.method874(Static130.aClass13_1095)) {
					local2035 = local2021.method883(0, local2021.method884(Static33.aClass13_393));
					local2037 = false;
					local880 = local2035.method878();
					for (local1193 = 0; local1193 < Static124.anInt3220; local1193++) {
						if (Static5.aLongArray1[local1193] == local880) {
							local2037 = true;
							break;
						}
					}
					if (!local2037 && Static49.anInt1575 == 0) {
						Static169.method2887(local2035, Static16.aClass13_253, 14);
					}
				} else if (local2021.method874(Static2.aClass13_28)) {
					local2035 = local2021.method883(0, local2021.method884(Static33.aClass13_393));
					local880 = local2035.method878();
					local2037 = false;
					for (local1193 = 0; local1193 < Static124.anInt3220; local1193++) {
						if (Static5.aLongArray1[local1193] == local880) {
							local2037 = true;
							break;
						}
					}
					if (!local2037 && Static49.anInt1575 == 0) {
						Static169.method2887(local2035, Static16.aClass13_253, 15);
					}
				} else if (local2021.method874(Static173.aClass13_1375)) {
					local2035 = local2021.method883(0, local2021.method884(Static33.aClass13_393));
					local880 = local2035.method878();
					local2037 = false;
					for (local1193 = 0; local1193 < Static124.anInt3220; local1193++) {
						if (local880 == Static5.aLongArray1[local1193]) {
							local2037 = true;
							break;
						}
					}
					if (!local2037 && Static49.anInt1575 == 0) {
						Static169.method2887(local2035, Static16.aClass13_253, 16);
					}
				} else {
					Static169.method2887(Static16.aClass13_253, local2021, 0);
				}
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 143) {
				local123 = Static153.aClass1_Sub8_Sub1_2.method1602();
				Static150.aClass32_8 = Static163.aClass16_5.method979(local123);
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 75) {
				Static2.aBoolean11 = true;
				Static39.anInt1240 = Static153.aClass1_Sub8_Sub1_2.method1607();
				Static148.anInt3600 = Static153.aClass1_Sub8_Sub1_2.method1607();
				Static115.anInt3075 = Static153.aClass1_Sub8_Sub1_2.method1642();
				Static98.anInt3738 = Static153.aClass1_Sub8_Sub1_2.method1607();
				Static90.anInt2621 = Static153.aClass1_Sub8_Sub1_2.method1607();
				if (Static90.anInt2621 >= 100) {
					Static7.anInt3157 = Static148.anInt3600 * 128 + 64;
					Static22.anInt2236 = Static39.anInt1240 * 128 + 64;
					Static45.anInt1493 = Static66.method1449(Static156.anInt3696, Static7.anInt3157, Static22.anInt2236) - Static115.anInt3075;
				}
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 124) {
				local858 = Static153.aClass1_Sub8_Sub1_2.method1616();
				local213 = Static153.aClass1_Sub8_Sub1_2.method1642();
				@Pc(2555) byte local2555 = Static153.aClass1_Sub8_Sub1_2.method1611();
				local2037 = false;
				if ((Long.MIN_VALUE & local858) != 0L) {
					local2037 = true;
				}
				if (local2037) {
					if (Static11.anInt411 == 0) {
						Static184.anInt4077 = -1;
						return true;
					}
					local858 &= Long.MAX_VALUE;
					for (local1193 = 0; local1193 < Static11.anInt411 && (local858 != Static156.aClass1_Sub11Array1[local1193].aLong158 || local213 != Static156.aClass1_Sub11Array1[local1193].anInt2318); local1193++) {
					}
					if (local1193 < Static11.anInt411) {
						while (Static11.anInt411 - 1 > local1193) {
							Static156.aClass1_Sub11Array1[local1193] = Static156.aClass1_Sub11Array1[local1193 + 1];
							local1193++;
						}
						Static11.anInt411--;
						Static156.aClass1_Sub11Array1[Static11.anInt411] = null;
					}
				} else {
					local1346 = Static153.aClass1_Sub8_Sub1_2.method1622();
					@Pc(2653) Class1_Sub11 local2653 = new Class1_Sub11();
					local2653.aLong158 = local858;
					local2653.aClass13_767 = Static43.method1141(local2653.aLong158);
					local2653.aByte5 = local2555;
					local2653.anInt2318 = local213;
					local2653.aClass13_772 = local1346;
					for (local1278 = Static11.anInt411 - 1; local1278 >= 0; local1278--) {
						local1280 = Static156.aClass1_Sub11Array1[local1278].aClass13_767.method896(local2653.aClass13_767);
						if (local1280 == 0) {
							Static156.aClass1_Sub11Array1[local1278].anInt2318 = local213;
							Static156.aClass1_Sub11Array1[local1278].aByte5 = local2555;
							Static156.aClass1_Sub11Array1[local1278].aClass13_772 = local1346;
							Static184.anInt4077 = -1;
							if (Static134.aLong112 == local858) {
								Static20.aByte2 = local2555;
							}
							Static69.anInt1982 = Static10.anInt388;
							return true;
						}
						if (local1280 < 0) {
							break;
						}
					}
					if (Static11.anInt411 >= Static156.aClass1_Sub11Array1.length) {
						Static184.anInt4077 = -1;
						return true;
					}
					for (local1280 = Static11.anInt411 - 1; local1280 > local1278; local1280--) {
						Static156.aClass1_Sub11Array1[local1280 + 1] = Static156.aClass1_Sub11Array1[local1280];
					}
					if (Static11.anInt411 == 0) {
						Static156.aClass1_Sub11Array1 = new Class1_Sub11[100];
					}
					Static156.aClass1_Sub11Array1[local1278 + 1] = local2653;
					if (local858 == Static134.aLong112) {
						Static20.aByte2 = local2555;
					}
					Static11.anInt411++;
				}
				Static69.anInt1982 = Static10.anInt388;
				Static184.anInt4077 = -1;
				return true;
			}
			@Pc(2808) Class20 local2808;
			if (Static184.anInt4077 == 110) {
				local123 = Static153.aClass1_Sub8_Sub1_2.method1634();
				local133 = Static153.aClass1_Sub8_Sub1_2.method1642();
				local213 = Static153.aClass1_Sub8_Sub1_2.method1617();
				local217 = Static153.aClass1_Sub8_Sub1_2.method1634();
				local2808 = Static119.method2230(local213);
				if (local2808.anInt1589 != local133 || local123 != local2808.anInt1600 || local2808.anInt1560 != local217) {
					local2808.anInt1560 = local217;
					local2808.anInt1589 = local133;
					local2808.anInt1600 = local123;
					Static125.method2300(local2808);
				}
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 168) {
				Static2.aBoolean11 = false;
				for (local123 = 0; local123 < 5; local123++) {
					Static42.aBooleanArray22[local123] = false;
				}
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 94) {
				local2021 = Static153.aClass1_Sub8_Sub1_2.method1622();
				local133 = Static153.aClass1_Sub8_Sub1_2.method1638();
				local213 = Static153.aClass1_Sub8_Sub1_2.method1607();
				if (local213 >= 1 && local213 <= 8) {
					if (local2021.method894(Static4.aClass13_39)) {
						local2021 = null;
					}
					Static21.aClass13Array4[local213 - 1] = local2021;
					Static77.aBooleanArray30[local213 - 1] = local133 == 0;
				}
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 33) {
				Static123.method2278(Static153.aClass1_Sub8_Sub1_2, Static89.anInt2506, Static163.aClass16_5);
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 150) {
				local123 = Static153.aClass1_Sub8_Sub1_2.method1634();
				if (local123 == 65535) {
					local123 = -1;
				}
				local133 = Static153.aClass1_Sub8_Sub1_2.method1617();
				local162 = Static119.method2230(local133);
				if (local162.anInt1595 != 1 || local162.anInt1556 != local123) {
					local162.anInt1556 = local123;
					local162.anInt1595 = 1;
					Static125.method2300(local162);
				}
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 146) {
				method3035();
				local123 = Static153.aClass1_Sub8_Sub1_2.method1607();
				local133 = Static153.aClass1_Sub8_Sub1_2.method1602();
				local213 = Static153.aClass1_Sub8_Sub1_2.method1607();
				Static153.anIntArray365[local123] = local133;
				Static141.anIntArray337[local123] = local213;
				Static117.anIntArray299[local123] = 1;
				for (local217 = 0; local217 < 98; local217++) {
					if (Class79.anIntArray381[local217] <= local133) {
						Static117.anIntArray299[local123] = local217 + 2;
					}
				}
				Static60.anIntArray191[Static55.anInt1767++ & 0x1F] = local123;
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 113) {
				Static10.anInt392 = Static153.aClass1_Sub8_Sub1_2.method1603();
				Static108.anInt2954 = Static153.aClass1_Sub8_Sub1_2.method1638();
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 239) {
				local133 = Static153.aClass1_Sub8_Sub1_2.method1626();
				local213 = Static153.aClass1_Sub8_Sub1_2.method1636();
				local836 = Static119.method2230(local133);
				if (local836 != null && local836.anInt1619 == 0) {
					if (local213 > local836.anInt1563 - local836.anInt1603) {
						local213 = local836.anInt1563 - local836.anInt1603;
					}
					if (local213 < 0) {
						local213 = 0;
					}
					if (local836.anInt1592 != local213) {
						local836.anInt1592 = local213;
						Static125.method2300(local836);
					}
				}
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 192) {
				local133 = Static153.aClass1_Sub8_Sub1_2.method1637();
				local213 = Static153.aClass1_Sub8_Sub1_2.method1627();
				local217 = Static153.aClass1_Sub8_Sub1_2.method1652();
				local2808 = Static119.method2230(local217);
				local910 = local2808.anInt1601 + local213;
				local1193 = local133 + local2808.anInt1565;
				if (local1193 != local2808.anInt1613 || local910 != local2808.anInt1594) {
					local2808.anInt1613 = local1193;
					local2808.anInt1594 = local910;
					Static125.method2300(local2808);
				}
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 45) {
				Static49.anInt1616 = 0;
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 178) {
				local133 = Static153.aClass1_Sub8_Sub1_2.method1638();
				local213 = Static153.aClass1_Sub8_Sub1_2.method1607();
				local217 = Static153.aClass1_Sub8_Sub1_2.method1638();
				Static156.anInt3696 = local217 >> 1;
				Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.method1884((local217 & 0x1) == 1, local213, local133);
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 25) {
				local133 = Static153.aClass1_Sub8_Sub1_2.method1602();
				local162 = Static119.method2230(local133);
				for (local217 = 0; local217 < local162.anIntArray168.length; local217++) {
					local162.anIntArray168[local217] = -1;
					local162.anIntArray168[local217] = 0;
				}
				Static125.method2300(local162);
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 19) {
				local133 = Static153.aClass1_Sub8_Sub1_2.method1652();
				@Pc(3282) boolean local3282 = Static153.aClass1_Sub8_Sub1_2.method1638() == 1;
				local836 = Static119.method2230(local133);
				if (local836.aBoolean124 != local3282) {
					local836.aBoolean124 = local3282;
					Static125.method2300(local836);
				}
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 167) {
				local133 = Static153.aClass1_Sub8_Sub1_2.method1642();
				local213 = Static153.aClass1_Sub8_Sub1_2.method1602();
				local836 = Static119.method2230(local213);
				if (local133 == 65535) {
					local133 = -1;
				}
				if (local836.anInt1595 != 2 || local836.anInt1556 != local133) {
					local836.anInt1556 = local133;
					local836.anInt1595 = 2;
					Static125.method2300(local836);
				}
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 162) {
				local2035 = Static153.aClass1_Sub8_Sub1_2.method1622();
				@Pc(3369) Object[] local3369 = new Object[local2035.method904() + 1];
				for (local217 = local2035.method904() - 1; local217 >= 0; local217--) {
					if (local2035.method898(local217) == 115) {
						local3369[local217 + 1] = Static153.aClass1_Sub8_Sub1_2.method1622();
					} else {
						local3369[local217 + 1] = Integer.valueOf(Static153.aClass1_Sub8_Sub1_2.method1626());
					}
				}
				local3369[0] = Integer.valueOf(Static153.aClass1_Sub8_Sub1_2.method1626());
				@Pc(3425) Class1_Sub23 local3425 = new Class1_Sub23();
				local3425.anObjectArray29 = local3369;
				Static1.method43(local3425);
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 221) {
				local133 = Static153.aClass1_Sub8_Sub1_2.method1626();
				local213 = Static153.aClass1_Sub8_Sub1_2.method1642();
				if (local133 >= 0) {
					local836 = Static119.method2230(local133);
				} else {
					local836 = null;
				}
				if (local133 < -70000) {
					local213 += 32768;
				}
				while (Static89.anInt2506 > Static153.aClass1_Sub8_Sub1_2.anInt2195) {
					local221 = Static153.aClass1_Sub8_Sub1_2.method1645();
					local910 = 0;
					local1193 = Static153.aClass1_Sub8_Sub1_2.method1642();
					if (local1193 != 0) {
						local910 = Static153.aClass1_Sub8_Sub1_2.method1607();
						if (local910 == 255) {
							local910 = Static153.aClass1_Sub8_Sub1_2.method1626();
						}
					}
					if (local836 != null && local221 >= 0 && local221 < local836.anIntArray168.length) {
						local836.anIntArray168[local221] = local1193;
						local836.anIntArray163[local221] = local910;
					}
					Static21.method690(local1193 - 1, local910, local221, local213);
				}
				if (local836 != null) {
					Static125.method2300(local836);
				}
				method3035();
				Static93.anIntArray259[Static59.anInt1838++ & 0x1F] = local213 & 0x7FFF;
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 9) {
				Static44.method1167();
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 29) {
				local133 = Static153.aClass1_Sub8_Sub1_2.method1607();
				if (Static153.aClass1_Sub8_Sub1_2.method1607() == 0) {
					Static7.aClass58Array2[local133] = new Class58();
				} else {
					Static153.aClass1_Sub8_Sub1_2.anInt2195--;
					Static7.aClass58Array2[local133] = new Class58(Static153.aClass1_Sub8_Sub1_2);
				}
				Static184.anInt4077 = -1;
				Static3.anInt109 = Static10.anInt388;
				return true;
			}
			if (Static184.anInt4077 == 153) {
				local133 = Static153.aClass1_Sub8_Sub1_2.method1617();
				local213 = Static153.aClass1_Sub8_Sub1_2.method1603();
				local217 = Static153.aClass1_Sub8_Sub1_2.method1624();
				@Pc(3622) Class1_Sub22 local3622 = (Class1_Sub22) Static18.aClass45_3.method1988((long) local133);
				if (local3622 != null) {
					Static4.method83(local217 != local3622.anInt3978, local3622);
				}
				Static88.method1855(local133, local217, local213);
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 2) {
				Static155.aClass13_1449 = Static153.aClass1_Sub8_Sub1_2.method1622();
				Static134.method2407(Static155.aClass13_1449);
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 252) {
				for (local133 = 0; local133 < Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1.length; local133++) {
					if (Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1[local133] != null) {
						Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1[local133].anInt2553 = -1;
					}
				}
				for (local213 = 0; local213 < Static181.aClass1_Sub2_Sub2_Sub2_Sub1Array1.length; local213++) {
					if (Static181.aClass1_Sub2_Sub2_Sub2_Sub1Array1[local213] != null) {
						Static181.aClass1_Sub2_Sub2_Sub2_Sub1Array1[local213].anInt2553 = -1;
					}
				}
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 144) {
				local133 = Static153.aClass1_Sub8_Sub1_2.method1626();
				local213 = Static153.aClass1_Sub8_Sub1_2.method1642();
				if (local133 < -70000) {
					local213 += 32768;
				}
				if (local133 < 0) {
					local836 = null;
				} else {
					local836 = Static119.method2230(local133);
				}
				if (local836 != null) {
					for (local221 = 0; local221 < local836.anIntArray168.length; local221++) {
						local836.anIntArray168[local221] = 0;
						local836.anIntArray163[local221] = 0;
					}
				}
				Static15.method627(local213);
				local221 = Static153.aClass1_Sub8_Sub1_2.method1642();
				for (local1193 = 0; local1193 < local221; local1193++) {
					local910 = Static153.aClass1_Sub8_Sub1_2.method1607();
					if (local910 == 255) {
						local910 = Static153.aClass1_Sub8_Sub1_2.method1617();
					}
					local1278 = Static153.aClass1_Sub8_Sub1_2.method1624();
					if (local836 != null && local1193 < local836.anIntArray168.length) {
						local836.anIntArray168[local1193] = local1278;
						local836.anIntArray163[local1193] = local910;
					}
					Static21.method690(local1278 - 1, local910, local1193, local213);
				}
				if (local836 != null) {
					Static125.method2300(local836);
				}
				method3035();
				Static93.anIntArray259[Static59.anInt1838++ & 0x1F] = local213 & 0x7FFF;
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 82) {
				local2035 = Static153.aClass1_Sub8_Sub1_2.method1622();
				local213 = Static153.aClass1_Sub8_Sub1_2.method1617();
				local836 = Static119.method2230(local213);
				if (!local2035.method889(local836.aClass13_544)) {
					local836.aClass13_544 = local2035;
					Static125.method2300(local836);
				}
				Static184.anInt4077 = -1;
				return true;
			}
			@Pc(3894) long local3894;
			if (Static184.anInt4077 == 173) {
				local3894 = Static153.aClass1_Sub8_Sub1_2.method1616();
				Static153.aClass1_Sub8_Sub1_2.method1611();
				@Pc(3902) long local3902 = Static153.aClass1_Sub8_Sub1_2.method1616();
				local1112 = Static153.aClass1_Sub8_Sub1_2.method1642();
				local1837 = Static153.aClass1_Sub8_Sub1_2.method1618();
				@Pc(3919) long local3919 = (local1112 << 32) + local1837;
				@Pc(3921) boolean local3921 = false;
				local976 = Static153.aClass1_Sub8_Sub1_2.method1607();
				for (@Pc(3927) int local3927 = 0; local3927 < 100; local3927++) {
					if (local3919 == Static25.aLongArray3[local3927]) {
						local3921 = true;
						break;
					}
				}
				if (local976 <= 1) {
					for (@Pc(3952) int local3952 = 0; local3952 < Static124.anInt3220; local3952++) {
						if (Static5.aLongArray1[local3952] == local3894) {
							local3921 = true;
							break;
						}
					}
				}
				if (!local3921 && Static49.anInt1575 == 0) {
					Static25.aLongArray3[Static11.anInt410] = local3919;
					Static11.anInt410 = (Static11.anInt410 + 1) % 100;
					@Pc(3989) Class13 local3989 = Static177.method241(Static98.method2709(Static153.aClass1_Sub8_Sub1_2).method914());
					if (local976 == 2 || local976 == 3) {
						Static134.method2402(local3989, Static57.method1349(new Class13[] { Static87.aClass13_819, Static43.method1141(local3894).method903() }), Static43.method1141(local3902).method903(), 9);
					} else if (local976 == 1) {
						Static134.method2402(local3989, Static57.method1349(new Class13[] { Static41.aClass13_461, Static43.method1141(local3894).method903() }), Static43.method1141(local3902).method903(), 9);
					} else {
						Static134.method2402(local3989, Static43.method1141(local3894).method903(), Static43.method1141(local3902).method903(), 9);
					}
				}
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 175) {
				Static108.anInt2954 = Static153.aClass1_Sub8_Sub1_2.method1638();
				Static10.anInt392 = Static153.aClass1_Sub8_Sub1_2.method1600();
				while (Static153.aClass1_Sub8_Sub1_2.anInt2195 < Static89.anInt2506) {
					Static184.anInt4077 = Static153.aClass1_Sub8_Sub1_2.method1607();
					Static83.method1778();
				}
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 60) {
				local133 = Static153.aClass1_Sub8_Sub1_2.method1624();
				local213 = Static153.aClass1_Sub8_Sub1_2.method1642();
				Static104.anInt2874 = local133;
				Static184.anInt4077 = -1;
				Static49.anInt1557 = local213;
				return true;
			}
			if (Static184.anInt4077 == 195) {
				Static40.method1044(true);
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 225) {
				local3894 = Static153.aClass1_Sub8_Sub1_2.method1616();
				@Pc(4154) Class13 local4154 = Static177.method241(Static98.method2709(Static153.aClass1_Sub8_Sub1_2).method914());
				Static169.method2887(Static43.method1141(local3894).method903(), local4154, 6);
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 141) {
				local133 = Static153.aClass1_Sub8_Sub1_2.method1626();
				@Pc(4183) Class1_Sub22 local4183 = (Class1_Sub22) Static18.aClass45_3.method1988((long) local133);
				if (local4183 != null) {
					Static4.method83(true, local4183);
				}
				if (Static89.aClass20_7 != null) {
					Static125.method2300(Static89.aClass20_7);
					Static89.aClass20_7 = null;
				}
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 98) {
				Static88.method1851();
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 48) {
				local133 = Static153.aClass1_Sub8_Sub1_2.method1642();
				local217 = local133 >> 10 & 0x1F;
				local213 = Static153.aClass1_Sub8_Sub1_2.method1652();
				local221 = local133 >> 5 & 0x1F;
				@Pc(4238) Class20 local4238 = Static119.method2230(local213);
				local1193 = local133 & 0x1F;
				local910 = (local217 << 19) + (local221 << 11) + (local1193 << 3);
				if (local4238.anInt1579 != local910) {
					local4238.anInt1579 = local910;
					Static125.method2300(local4238);
				}
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 109) {
				Static80.anInt2285 = Static153.aClass1_Sub8_Sub1_2.method1607();
				Static122.anInt3195 = Static153.aClass1_Sub8_Sub1_2.method1607();
				Static135.anInt3377 = Static153.aClass1_Sub8_Sub1_2.method1607();
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 235 || Static184.anInt4077 == 97 || Static184.anInt4077 == 170 || Static184.anInt4077 == 130 || Static184.anInt4077 == 84 || Static184.anInt4077 == 148 || Static184.anInt4077 == 200 || Static184.anInt4077 == 32 || Static184.anInt4077 == 206 || Static184.anInt4077 == 232 || Static184.anInt4077 == 85) {
				Static83.method1778();
				Static184.anInt4077 = -1;
				return true;
			}
			if (Static184.anInt4077 == 164) {
				Static2.aBoolean11 = true;
				Static89.anInt2505 = Static153.aClass1_Sub8_Sub1_2.method1607();
				Static154.anInt3652 = Static153.aClass1_Sub8_Sub1_2.method1607();
				Static163.anInt3847 = Static153.aClass1_Sub8_Sub1_2.method1642();
				Static84.anInt2396 = Static153.aClass1_Sub8_Sub1_2.method1607();
				Static18.anInt740 = Static153.aClass1_Sub8_Sub1_2.method1607();
				if (Static18.anInt740 >= 100) {
					local133 = Static89.anInt2505 * 128 + 64;
					local213 = Static154.anInt3652 * 128 + 64;
					local217 = Static66.method1449(Static156.anInt3696, local213, local133) - Static163.anInt3847;
					local221 = local133 - Static22.anInt2236;
					local1193 = local217 - Static45.anInt1493;
					local910 = local213 - Static7.anInt3157;
					local1278 = (int) Math.sqrt((double) (local910 * local910 + local221 * local221));
					Static104.anInt2874 = (int) (Math.atan2((double) local1193, (double) local1278) * 325.949D) & 0x7FF;
					Static49.anInt1557 = (int) (-325.949D * Math.atan2((double) local221, (double) local910)) & 0x7FF;
					if (Static104.anInt2874 < 128) {
						Static104.anInt2874 = 128;
					}
					if (Static104.anInt2874 > 383) {
						Static104.anInt2874 = 383;
					}
				}
				Static184.anInt4077 = -1;
				return true;
			}
			Static154.method2661("T1 - " + Static184.anInt4077 + "," + Static101.anInt2828 + "," + Static10.anInt387 + " - " + Static89.anInt2506, null);
			Static44.method1171();
		} catch (@Pc(4483) IOException local4483) {
			Static49.method1238();
		} catch (@Pc(4487) Exception local4487) {
			@Pc(4527) String local4527 = "T2 - " + Static184.anInt4077 + "," + Static101.anInt2828 + "," + Static10.anInt387 + " - " + Static89.anInt2506 + "," + (Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0] + Static153.anInt3629) + "," + (Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0] + Static60.anInt1864) + " - ";
			for (local133 = 0; Static89.anInt2506 > local133 && local133 < 50; local133++) {
				local4527 = local4527 + Static153.aClass1_Sub8_Sub1_2.aByteArray27[local133] + ",";
			}
			Static154.method2661(local4527, local4487);
			Static44.method1171();
		}
		return true;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)Lclient!jc;")
	public static Class1_Sub2_Sub9 method3034(@OriginalArg(0) int arg0) {
		@Pc(15) Class1_Sub2_Sub9 local15 = (Class1_Sub2_Sub9) Static109.aClass47_23.method1999((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static118.aClass4_75.method2243(4, arg0);
		local15 = new Class1_Sub2_Sub9();
		if (local25 != null) {
			local15.method1697(arg0, new Class1_Sub8(local25));
		}
		Static109.aClass47_23.method1998(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
	public static void method3035() {
		for (@Pc(8) Class1_Sub22 local8 = (Class1_Sub22) Static18.aClass45_3.method1982(); local8 != null; local8 = (Class1_Sub22) Static18.aClass45_3.method1986()) {
			@Pc(13) int local13 = local8.anInt3978;
			if (Static171.method2892(local13)) {
				@Pc(19) boolean local19 = true;
				@Pc(23) Class20[] local23 = Static145.aClass20ArrayArray1[local13];
				for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
					if (local23[local25] != null) {
						local19 = local23[local25].aBoolean118;
						break;
					}
				}
				if (!local19) {
					@Pc(49) int local49 = (int) local8.aLong158;
					@Pc(53) Class20 local53 = Static119.method2230(local49);
					if (local53 != null) {
						Static125.method2300(local53);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
	public static void method3037() {
		aClass13_1442 = null;
		aShortArrayArray8 = null;
		aClass13_1443 = null;
		aClass13_1438 = null;
		aClass13_1439 = null;
		aClass13_1444 = null;
		aClass13_1440 = null;
		aClass13_1441 = null;
	}
}

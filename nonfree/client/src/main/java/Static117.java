import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "Lclient!jb;")
	public static Class25 aClass25_31;

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "Lclient!ha;")
	public static Class25_Sub1 aClass25_Sub1_19;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1337 = Static59.method1195("<col=ffff00>*V");

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1338 = Static59.method1195("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1339 = Static59.method1195(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1340 = Static59.method1195(":duelreq:");

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1341 = Static59.method1195("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1342 = Static59.method1195("Loading sprites )2 ");

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "[I")
	public static int[] anIntArray340 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1343 = aClass60_1342;

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "[I")
	public static int[] anIntArray341 = new int[1000];

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1344 = Static59.method1195("::clientdrop");

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	public static void method2131() {
		Static43.aClass16_37.method1668();
		Static105.aClass3_Sub1_Sub2_Sub4_16.method1903(0, 0);
		Static7.method274();
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)[B")
	public static synchronized byte[] method2132(@OriginalArg(0) int arg0) {
		@Pc(24) byte[] local24;
		if (arg0 == 100 && Static22.anInt876 > 0) {
			local24 = Static130.aByteArrayArray18[--Static22.anInt876];
			Static130.aByteArrayArray18[Static22.anInt876] = null;
			return local24;
		} else if (arg0 == 5000 && Static73.anInt2343 > 0) {
			local24 = Static64.aByteArrayArray12[--Static73.anInt2343];
			Static64.aByteArrayArray12[Static73.anInt2343] = null;
			return local24;
		} else if (arg0 == 30000 && Static13.anInt407 > 0) {
			local24 = Static8.aByteArrayArray5[--Static13.anInt407];
			Static8.aByteArrayArray5[Static13.anInt407] = null;
			return local24;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZI)V")
	public static void method2133(@OriginalArg(0) boolean arg0) {
		if (Static105.aClass47_4 == null) {
			return;
		}
		try {
			@Pc(16) Class3_Sub12 local16 = new Class3_Sub12(4);
			local16.method1937(arg0 ? 2 : 3);
			local16.method1934(0);
			Static105.aClass47_4.method1562(local16.aByteArray77, 4);
		} catch (@Pc(37) IOException local37) {
			try {
				Static105.aClass47_4.method1564();
			} catch (@Pc(42) Exception local42) {
			}
			Static105.aClass47_4 = null;
			Static108.anInt3059++;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public static void method2134() {
		anIntArray341 = null;
		anIntArray340 = null;
		aClass60_1338 = null;
		aClass60_1343 = null;
		aClass60_1344 = null;
		aClass25_Sub1_19 = null;
		aClass60_1340 = null;
		aClass60_1337 = null;
		aClass25_31 = null;
		aClass60_1342 = null;
		aClass60_1339 = null;
		aClass60_1341 = null;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
	public static void method2135() {
		Static100.method1983();
		Static71.method1022();
		@Pc(27) int local27;
		@Pc(29) int local29;
		if (Static64.anInt2045 == 2 || Static64.anInt2045 == 5) {
			@Pc(22) byte[] local22 = Static98.aClass3_Sub1_Sub2_Sub4_12.aByteArray75;
			@Pc(24) int[] local24 = Static40.anIntArray304;
			local27 = local22.length;
			for (local29 = 0; local29 < local27; local29++) {
				if (local22[local29] == 0) {
					local24[local29] = 0;
				}
			}
			if (Static64.anInt2045 < 3) {
				Static65.aClass3_Sub1_Sub2_Sub3_3.method1435(0, 0, 33, 33, 25, 25, Static107.anInt3040, 256, Static85.anIntArray270, Static107.anIntArray323);
			}
			Static108.method2041();
			return;
		}
		@Pc(72) int local72 = Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1524 / 32 + 48;
		@Pc(79) int local79 = Static107.anInt3040 + Static39.anInt1294 & 0x7FF;
		local27 = 464 - Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1494 / 32;
		Static12.aClass3_Sub1_Sub2_Sub3_1.method1435(25, 5, 146, 151, local72, local27, local79, Static43.anInt1424 + 256, Static13.anIntArray54, Static33.anIntArray139);
		for (local29 = 0; local29 < Static91.anInt2643; local29++) {
			local72 = Static80.anIntArray251[local29] * 4 + 2 - Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1524 / 32;
			local27 = Static71.anIntArray186[local29] * 4 + 2 - Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1494 / 32;
			Static119.method2150(local27, Static91.aClass3_Sub1_Sub2_Sub3Array5[local29], local72);
		}
		@Pc(154) int local154;
		for (@Pc(150) int local150 = 0; local150 < 104; local150++) {
			for (local154 = 0; local154 < 104; local154++) {
				@Pc(164) Class5 local164 = Static34.aClass5ArrayArrayArray1[Static119.anInt3243][local150][local154];
				if (local164 != null) {
					local27 = local154 * 4 + 2 - Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1494 / 32;
					local72 = local150 * 4 + 2 - Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1524 / 32;
					Static119.method2150(local27, Static20.aClass3_Sub1_Sub2_Sub3Array2[0], local72);
				}
			}
		}
		for (local154 = 0; local154 < Static20.anInt829; local154++) {
			@Pc(216) Class3_Sub1_Sub1_Sub3_Sub2 local216 = Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[Static128.anIntArray390[local154]];
			if (local216 != null && local216.method1023()) {
				@Pc(225) Class3_Sub1_Sub16 local225 = local216.aClass3_Sub1_Sub16_1;
				if (local225 != null && local225.anIntArray334 != null) {
					local225 = local225.method2093();
				}
				if (local225 != null && local225.aBoolean110 && local225.aBoolean109) {
					local27 = local216.anInt1494 / 32 - Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1494 / 32;
					local72 = local216.anInt1524 / 32 - Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1524 / 32;
					Static119.method2150(local27, Static20.aClass3_Sub1_Sub2_Sub3Array2[1], local72);
				}
			}
		}
		@Pc(327) int local327;
		@Pc(290) Class3_Sub1_Sub1_Sub3_Sub1 local290;
		for (@Pc(282) int local282 = 0; local282 < Static53.anInt1744; local282++) {
			local290 = Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[Static14.anIntArray56[local282]];
			if (local290 != null && local290.method1023()) {
				local27 = local290.anInt1494 / 32 - Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1494 / 32;
				@Pc(309) boolean local309 = false;
				local72 = local290.anInt1524 / 32 - Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1524 / 32;
				@Pc(325) long local325 = local290.aClass60_245.method1863();
				for (local327 = 0; local327 < Static61.anInt1946; local327++) {
					if (local325 == Static83.aLongArray4[local327] && Static41.anIntArray159[local327] != 0) {
						local309 = true;
						break;
					}
				}
				@Pc(353) boolean local353 = false;
				if (Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt637 != 0 && local290.anInt637 != 0 && Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt637 == local290.anInt637) {
					local353 = true;
				}
				if (local309) {
					Static119.method2150(local27, Static20.aClass3_Sub1_Sub2_Sub3Array2[3], local72);
				} else if (local353) {
					Static119.method2150(local27, Static20.aClass3_Sub1_Sub2_Sub3Array2[4], local72);
				} else {
					Static119.method2150(local27, Static20.aClass3_Sub1_Sub2_Sub3Array2[2], local72);
				}
			}
		}
		if (Static111.anInt3098 != 0 && Static34.anInt1183 % 20 < 10) {
			if (Static111.anInt3098 == 1 && Static100.anInt2954 >= 0 && Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1.length > Static100.anInt2954) {
				@Pc(437) Class3_Sub1_Sub1_Sub3_Sub2 local437 = Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[Static100.anInt2954];
				if (local437 != null) {
					local27 = local437.anInt1494 / 32 - Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1494 / 32;
					local72 = local437.anInt1524 / 32 - Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1524 / 32;
					Static12.method339(Static123.aClass3_Sub1_Sub2_Sub3Array10[1], local27, local72);
				}
			}
			if (Static111.anInt3098 == 2) {
				local27 = (Static120.anInt3296 - Static13.anInt410) * 4 + 2 - Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1494 / 32;
				local72 = (Static109.anInt3095 - Static112.anInt3118) * 4 + 2 - Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1524 / 32;
				Static12.method339(Static123.aClass3_Sub1_Sub2_Sub3Array10[1], local27, local72);
			}
			if (Static111.anInt3098 == 10 && Static124.anInt3223 >= 0 && Static124.anInt3223 < Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3.length) {
				local290 = Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[Static124.anInt3223];
				if (local290 != null) {
					local72 = local290.anInt1524 / 32 - Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1524 / 32;
					local27 = local290.anInt1494 / 32 - Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1494 / 32;
					Static12.method339(Static123.aClass3_Sub1_Sub2_Sub3Array10[1], local27, local72);
				}
			}
		}
		if (Static77.anInt2428 != 0) {
			local72 = Static77.anInt2428 * 4 + 2 - Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1524 / 32;
			local27 = Static31.anInt1107 * 4 + 2 - Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1494 / 32;
			Static119.method2150(local27, Static123.aClass3_Sub1_Sub2_Sub3Array10[0], local72);
		}
		Static40.method1893(97, 78, 3, 3, 16777215);
		if (Static64.anInt2045 < 3) {
			Static65.aClass3_Sub1_Sub2_Sub3_3.method1435(0, 0, 33, 33, 25, 25, Static107.anInt3040, 256, Static85.anIntArray270, Static107.anIntArray323);
		} else {
			@Pc(616) int[] local616 = Static40.anIntArray304;
			@Pc(619) byte[] local619 = Static98.aClass3_Sub1_Sub2_Sub4_12.aByteArray75;
			for (@Pc(621) int local621 = 0; local621 <= 33; local621++) {
				@Pc(628) int local628 = Static98.aClass3_Sub1_Sub2_Sub4_12.anInt2860 * local621;
				for (local327 = 0; local327 <= 33; local327++) {
					if (local619[local327 + local628] == 0) {
						local616[local327 + local628] = 0;
					}
				}
			}
		}
		Static108.method2041();
	}
}

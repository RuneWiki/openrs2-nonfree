import java.awt.Component;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!ja", name = "v", descriptor = "Lclient!ac;")
	public static Class3 aClass3_12;

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "Z")
	public static boolean aBoolean63 = false;

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
	public static int anInt1229 = -1;

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "Lclient!kc;")
	public static Class36 aClass36_620 = Static14.method2017("Wen m-Ochten Sie von der Liste entfernen?");

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "Lclient!kc;")
	public static Class36 aClass36_621 = Static14.method2017("Weiter");

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "Lclient!kc;")
	private static Class36 aClass36_623 = Static14.method2017("scroll:");

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "Lclient!kc;")
	public static Class36 aClass36_622 = aClass36_623;

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "[Lclient!kc;")
	public static Class36[] aClass36Array23 = new Class36[1000];

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "Lclient!kc;")
	public static Class36 aClass36_624 = Static14.method2017("");

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!ac;Ljava/awt/Component;B)V")
	public static void method903(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Component arg1) {
		if (Static103.aBoolean122) {
			return;
		}
		Static53.aClass2_Sub1_Sub1_Sub1_15 = Static14.method2023(arg0, Static20.aClass36_259, Static58.aClass36_740);
		Static17.aClass2_Sub1_Sub1_Sub1_6 = Static14.method2023(arg0, Static20.aClass36_259, Static107.aClass36_1353);
		Static64.aClass2_Sub1_Sub1_Sub1_17 = Static14.method2023(arg0, Static20.aClass36_259, Static113.aClass36_1447);
		Static10.aClass2_Sub1_Sub1_Sub1_3 = Static14.method2023(arg0, Static20.aClass36_259, Static62.aClass36_781);
		Static50.aClass2_Sub1_Sub1_Sub1_14 = Static14.method2023(arg0, Static20.aClass36_259, Static115.aClass36_881);
		Static90.aClass2_Sub1_Sub1_Sub1_22 = Static14.method2023(arg0, Static20.aClass36_259, Static107.aClass36_1354);
		Static113.aClass14_39 = Static39.method751(479, 96, arg1);
		Static17.aClass2_Sub1_Sub1_Sub1_6.method97(0, 0);
		Static94.aClass14_29 = Static39.method751(172, 156, arg1);
		Static54.method1587();
		Static64.aClass2_Sub1_Sub1_Sub1_17.method97(0, 0);
		Static96.aClass14_31 = Static39.method751(190, 261, arg1);
		Static53.aClass2_Sub1_Sub1_Sub1_15.method97(0, 0);
		Static19.aClass14_38 = Static39.method751(512, 334, arg1);
		Static54.method1587();
		Static20.aClass14_7 = Static39.method751(496, 50, arg1);
		Static118.aClass14_40 = Static39.method751(269, 37, arg1);
		Static111.aClass14_37 = Static39.method751(249, 45, arg1);
		@Pc(106) Class2_Sub1_Sub1_Sub3 local106 = Static63.method1126(Static20.aClass36_259, Static67.aClass36_827, arg0);
		Static77.aClass14_26 = Static39.method751(local106.anInt1783, local106.anInt1781, arg1);
		local106.method1241(0, 0);
		@Pc(124) Class2_Sub1_Sub1_Sub3 local124 = Static63.method1126(Static20.aClass36_259, Static89.aClass36_1080, arg0);
		Static3.aClass14_18 = Static39.method751(local124.anInt1783, local124.anInt1781, arg1);
		local124.method1241(0, 0);
		@Pc(142) Class2_Sub1_Sub1_Sub3 local142 = Static63.method1126(Static20.aClass36_259, Static10.aClass36_147, arg0);
		Static17.aClass14_5 = Static39.method751(local142.anInt1783, local142.anInt1781, arg1);
		local142.method1241(0, 0);
		@Pc(160) Class2_Sub1_Sub1_Sub3 local160 = Static63.method1126(Static20.aClass36_259, Static81.aClass36_977, arg0);
		Static43.aClass14_15 = Static39.method751(local160.anInt1783, local160.anInt1781, arg1);
		local160.method1241(0, 0);
		@Pc(178) Class2_Sub1_Sub1_Sub3 local178 = Static63.method1126(Static20.aClass36_259, Static55.aClass36_1326, arg0);
		Static63.aClass14_23 = Static39.method751(local178.anInt1783, local178.anInt1781, arg1);
		local178.method1241(0, 0);
		@Pc(196) Class2_Sub1_Sub1_Sub3 local196 = Static63.method1126(Static20.aClass36_259, Static60.aClass36_769, arg0);
		Static3.aClass14_17 = Static39.method751(local196.anInt1783, local196.anInt1781, arg1);
		local196.method1241(0, 0);
		@Pc(214) Class2_Sub1_Sub1_Sub3 local214 = Static63.method1126(Static20.aClass36_259, Static73.aClass36_893, arg0);
		Static34.aClass14_9 = Static39.method751(local214.anInt1783, local214.anInt1781, arg1);
		local214.method1241(0, 0);
		@Pc(232) Class2_Sub1_Sub1_Sub3 local232 = Static63.method1126(Static20.aClass36_259, Static110.aClass36_1405, arg0);
		Static52.aClass14_20 = Static39.method751(local232.anInt1783, local232.anInt1781, arg1);
		local232.method1241(0, 0);
		@Pc(250) Class2_Sub1_Sub1_Sub3 local250 = Static63.method1126(Static20.aClass36_259, Static6.aClass36_86, arg0);
		Static9.aClass14_4 = Static39.method751(local250.anInt1783, local250.anInt1781, arg1);
		local250.method1241(0, 0);
		Static3.aClass2_Sub1_Sub1_Sub1_12 = Static14.method2023(arg0, Static20.aClass36_259, Static91.aClass36_1129);
		Static13.aClass2_Sub1_Sub1_Sub1_5 = Static14.method2023(arg0, Static20.aClass36_259, Static64.aClass36_800);
		Static56.aClass2_Sub1_Sub1_Sub1_16 = Static14.method2023(arg0, Static20.aClass36_259, Static80.aClass36_970);
		Static78.aClass2_Sub1_Sub1_Sub1_19 = Static3.aClass2_Sub1_Sub1_Sub1_12.method95();
		Static78.aClass2_Sub1_Sub1_Sub1_19.method93();
		Static110.aClass2_Sub1_Sub1_Sub1_25 = Static13.aClass2_Sub1_Sub1_Sub1_5.method95();
		Static110.aClass2_Sub1_Sub1_Sub1_25.method93();
		Static3.aClass2_Sub1_Sub1_Sub1_13 = Static3.aClass2_Sub1_Sub1_Sub1_12.method95();
		Static3.aClass2_Sub1_Sub1_Sub1_13.method92();
		Static115.aClass2_Sub1_Sub1_Sub1_18 = Static13.aClass2_Sub1_Sub1_Sub1_5.method95();
		Static115.aClass2_Sub1_Sub1_Sub1_18.method92();
		Static92.aClass2_Sub1_Sub1_Sub1_23 = Static56.aClass2_Sub1_Sub1_Sub1_16.method95();
		Static92.aClass2_Sub1_Sub1_Sub1_23.method92();
		Static104.aClass2_Sub1_Sub1_Sub1_24 = Static3.aClass2_Sub1_Sub1_Sub1_12.method95();
		Static104.aClass2_Sub1_Sub1_Sub1_24.method93();
		Static104.aClass2_Sub1_Sub1_Sub1_24.method92();
		Static18.aClass2_Sub1_Sub1_Sub1_7 = Static13.aClass2_Sub1_Sub1_Sub1_5.method95();
		Static18.aClass2_Sub1_Sub1_Sub1_7.method93();
		Static18.aClass2_Sub1_Sub1_Sub1_7.method92();
		Static61.aClass2_Sub1_Sub1_Sub1Array29 = Static89.method1639(Static103.aClass36_1310, Static20.aClass36_259, arg0);
		Static27.anIntArray61 = new int[33];
		Static78.anIntArray244 = new int[151];
		Static112.anIntArray349 = new int[151];
		Static94.anIntArray310 = new int[33];
		@Pc(347) int local347;
		@Pc(349) int local349;
		@Pc(351) int local351;
		for (@Pc(343) int local343 = 0; local343 < 33; local343++) {
			local347 = 999;
			local349 = 0;
			for (local351 = 0; local351 < 34; local351++) {
				if (Static64.aClass2_Sub1_Sub1_Sub1_17.aByteArray1[Static64.aClass2_Sub1_Sub1_Sub1_17.anInt94 * local343 + local351] == 0) {
					if (local347 == 999) {
						local347 = local351;
					}
				} else if (local347 != 999) {
					local349 = local351;
					break;
				}
			}
			Static27.anIntArray61[local343] = local347;
			Static94.anIntArray310[local343] = local349 - local347;
		}
		for (local347 = 5; local347 < 156; local347++) {
			local349 = 999;
			local351 = 0;
			for (@Pc(410) int local410 = 25; local410 < 172; local410++) {
				if (Static64.aClass2_Sub1_Sub1_Sub1_17.aByteArray1[Static64.aClass2_Sub1_Sub1_Sub1_17.anInt94 * local347 + local410] == 0 && (local410 > 34 || local347 > 34)) {
					if (local349 == 999) {
						local349 = local410;
					}
				} else if (local349 != 999) {
					local351 = local410;
					break;
				}
			}
			Static112.anIntArray349[local347 - 5] = local349 - 25;
			Static78.anIntArray244[local347 - 5] = local351 - local349;
		}
		Static103.aBoolean122 = true;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILclient!nd;I)V")
	public static void method904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub1_Sub3 arg2) {
		@Pc(11) int local11 = arg0 * arg0 + arg1 * arg1;
		if (local11 <= 4225 || local11 >= 90000) {
			Static64.method1132(arg0, arg2, arg1);
			return;
		}
		@Pc(38) int local38 = Static65.anInt1672 + Static14.anInt2903 & 0x7FF;
		@Pc(42) int local42 = Static30.anIntArray105[local38];
		@Pc(50) int local50 = local42 * 256 / (Static7.anInt194 + 256);
		@Pc(54) int local54 = Static30.anIntArray96[local38];
		@Pc(62) int local62 = local54 * 256 / (Static7.anInt194 + 256);
		@Pc(73) int local73 = arg0 * local62 - arg1 * local50 >> 16;
		@Pc(83) int local83 = arg0 * local50 + arg1 * local62 >> 16;
		@Pc(89) double local89 = Math.atan2((double) local83, (double) local73);
		@Pc(95) int local95 = (int) (Math.sin(local89) * 63.0D);
		@Pc(101) int local101 = (int) (Math.cos(local89) * 57.0D);
		Static79.aClass2_Sub1_Sub1_Sub3_6.method1243(local95 + 4 + 94 - 10, -local101 + -20 + 83, local89);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)Z")
	public static boolean method906() {
		@Pc(8) long local8 = Static66.method1158();
		@Pc(19) int local19 = (int) (local8 - Static23.aLong18);
		Static23.aLong18 = local8;
		if (local19 > 200) {
			local19 = 200;
		}
		Static77.anInt2025 += local19;
		if (Static62.anInt1619 == 0 && Static43.anInt1148 == 0 && Static41.anInt1078 == 0 && Static76.anInt2015 == 0) {
			return true;
		} else if (Static80.aClass51_4 == null) {
			return false;
		} else {
			try {
				if (Static77.anInt2025 > 30000) {
					throw new IOException();
				}
				@Pc(60) Class2_Sub1_Sub3 local60;
				@Pc(65) Class2_Sub12 local65;
				while (Static43.anInt1148 < 20 && Static76.anInt2015 > 0) {
					local60 = (Class2_Sub1_Sub3) Static89.aClass31_5.method910();
					local65 = new Class2_Sub12(4);
					local65.method1409(1);
					local65.method1390((int) local60.aLong89);
					Static80.aClass51_4.method1486(4, local65.aByteArray20);
					Static91.aClass31_6.method912(local60.aLong89, local60);
					Static43.anInt1148++;
					Static76.anInt2015--;
				}
				while (Static62.anInt1619 < 20 && Static41.anInt1078 > 0) {
					local60 = (Class2_Sub1_Sub3) Static33.aClass1_2.method3();
					local65 = new Class2_Sub12(4);
					local65.method1409(0);
					local65.method1390((int) local60.aLong89);
					Static80.aClass51_4.method1486(4, local65.aByteArray20);
					local60.method2025();
					Static73.aClass31_4.method912(local60.aLong89, local60);
					Static41.anInt1078--;
					Static62.anInt1619++;
				}
				for (@Pc(161) int local161 = 0; local161 < 100; local161++) {
					@Pc(167) int local167 = Static80.aClass51_4.method1484();
					if (local167 < 0) {
						throw new IOException();
					}
					if (local167 == 0) {
						break;
					}
					@Pc(177) byte local177 = 0;
					Static77.anInt2025 = 0;
					if (Static82.aClass2_Sub1_Sub3_1 == null) {
						local177 = 8;
					} else if (Static52.anInt1433 == 0) {
						local177 = 1;
					}
					@Pc(202) int local202;
					@Pc(207) int local207;
					@Pc(248) int local248;
					@Pc(388) int local388;
					if (local177 <= 0) {
						local202 = Static15.aClass2_Sub12_1.aByteArray20.length - Static82.aClass2_Sub1_Sub3_1.aByte1;
						local207 = 512 - Static52.anInt1433;
						if (local207 > local202 - Static15.aClass2_Sub12_1.anInt1939) {
							local207 = local202 - Static15.aClass2_Sub12_1.anInt1939;
						}
						if (local207 > local167) {
							local207 = local167;
						}
						Static80.aClass51_4.method1481(Static15.aClass2_Sub12_1.anInt1939, local207, Static15.aClass2_Sub12_1.aByteArray20);
						if (Static82.aByte3 != 0) {
							for (local248 = 0; local248 < local207; local248++) {
								Static15.aClass2_Sub12_1.aByteArray20[Static15.aClass2_Sub12_1.anInt1939 + local248] ^= Static82.aByte3;
							}
						}
						Static52.anInt1433 += local207;
						Static15.aClass2_Sub12_1.anInt1939 += local207;
						if (local202 == Static15.aClass2_Sub12_1.anInt1939) {
							if (Static82.aClass2_Sub1_Sub3_1.aLong89 == 16711935L) {
								Static79.aClass2_Sub12_4 = Static15.aClass2_Sub12_1;
								for (local248 = 0; local248 < 256; local248++) {
									@Pc(375) Class3_Sub1 local375 = Static95.aClass3_Sub1Array1[local248];
									if (local375 != null) {
										Static79.aClass2_Sub12_4.anInt1939 = local248 * 4 + 5;
										local388 = Static79.aClass2_Sub12_4.method1412();
										local375.method954(local388);
									}
								}
							} else {
								Static43.aCRC32_1.reset();
								Static43.aCRC32_1.update(Static15.aClass2_Sub12_1.aByteArray20, 0, local202);
								local248 = (int) Static43.aCRC32_1.getValue();
								if (local248 != Static82.aClass2_Sub1_Sub3_1.anInt234) {
									try {
										Static80.aClass51_4.method1483();
									} catch (@Pc(321) Exception local321) {
									}
									Static84.anInt2112++;
									Static82.aByte3 = (byte) (Math.random() * 255.0D + 1.0D);
									Static80.aClass51_4 = null;
									return false;
								}
								Static22.anInt580 = 0;
								Static84.anInt2112 = 0;
								Static82.aClass2_Sub1_Sub3_1.aClass3_Sub1_1.method955(Static34.aBoolean49, (int) (Static82.aClass2_Sub1_Sub3_1.aLong89 & 0xFFFFL), Static15.aClass2_Sub12_1.aByteArray20, (Static82.aClass2_Sub1_Sub3_1.aLong89 & 0xFF0000L) == 16711680L);
							}
							Static82.aClass2_Sub1_Sub3_1.method2073();
							if (Static34.aBoolean49) {
								Static43.anInt1148--;
							} else {
								Static62.anInt1619--;
							}
							Static52.anInt1433 = 0;
							Static15.aClass2_Sub12_1 = null;
							Static82.aClass2_Sub1_Sub3_1 = null;
						} else {
							if (Static52.anInt1433 != 512) {
								break;
							}
							Static52.anInt1433 = 0;
						}
					} else {
						local202 = local177 - Static53.aClass2_Sub12_3.anInt1939;
						if (local167 < local202) {
							local202 = local167;
						}
						Static80.aClass51_4.method1481(Static53.aClass2_Sub12_3.anInt1939, local202, Static53.aClass2_Sub12_3.aByteArray20);
						if (Static82.aByte3 != 0) {
							for (local207 = 0; local207 < local202; local207++) {
								Static53.aClass2_Sub12_3.aByteArray20[local207 + Static53.aClass2_Sub12_3.anInt1939] ^= Static82.aByte3;
							}
						}
						Static53.aClass2_Sub12_3.anInt1939 += local202;
						if (Static53.aClass2_Sub12_3.anInt1939 < local177) {
							break;
						}
						if (Static82.aClass2_Sub1_Sub3_1 == null) {
							Static53.aClass2_Sub12_3.anInt1939 = 0;
							local207 = Static53.aClass2_Sub12_3.method1399();
							local248 = Static53.aClass2_Sub12_3.method1366();
							@Pc(500) int local500 = Static53.aClass2_Sub12_3.method1399();
							local388 = Static53.aClass2_Sub12_3.method1412();
							@Pc(511) long local511 = (long) ((local207 << 16) + local248);
							@Pc(517) Class2_Sub1_Sub3 local517 = (Class2_Sub1_Sub3) Static91.aClass31_6.method905(local511);
							Static34.aBoolean49 = true;
							if (local517 == null) {
								local517 = (Class2_Sub1_Sub3) Static73.aClass31_4.method905(local511);
								Static34.aBoolean49 = false;
							}
							if (local517 == null) {
								throw new IOException();
							}
							@Pc(541) int local541 = local500 == 0 ? 5 : 9;
							Static82.aClass2_Sub1_Sub3_1 = local517;
							Static15.aClass2_Sub12_1 = new Class2_Sub12(Static82.aClass2_Sub1_Sub3_1.aByte1 + local541 + local388);
							Static15.aClass2_Sub12_1.method1409(local500);
							Static15.aClass2_Sub12_1.method1394(local388);
							Static52.anInt1433 = 8;
							Static53.aClass2_Sub12_3.anInt1939 = 0;
						} else if (Static52.anInt1433 == 0) {
							if (Static53.aClass2_Sub12_3.aByteArray20[0] == -1) {
								Static53.aClass2_Sub12_3.anInt1939 = 0;
								Static52.anInt1433 = 1;
							} else {
								Static82.aClass2_Sub1_Sub3_1 = null;
							}
						}
					}
				}
				return true;
			} catch (@Pc(594) IOException local594) {
				try {
					Static80.aClass51_4.method1483();
				} catch (@Pc(599) Exception local599) {
				}
				Static22.anInt580++;
				Static80.aClass51_4 = null;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	public static String method908(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			local10 = local15.aString8 + " | ";
			arg0 = local15.aThrowable1;
		} else {
			local10 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(56) String local56 = local53.readLine();
		while (true) {
			while (true) {
				@Pc(64) String local64 = local53.readLine();
				if (local64 == null) {
					return local10 + "| " + local56;
				}
				@Pc(70) int local70 = local64.indexOf(40);
				@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
				if (local70 >= 0 && local77 >= 0) {
					@Pc(91) String local91 = local64.substring(local70 + 1, local77);
					@Pc(95) int local95 = local91.indexOf(".java:");
					if (local95 >= 0) {
						local91 = local91.substring(0, local95) + local91.substring(local95 + 5);
						local10 = local10 + local91 + ' ';
						continue;
					}
					local64 = local64.substring(0, local70);
				}
				local64 = local64.trim();
				local64 = local64.substring(local64.lastIndexOf(32) + 1);
				local64 = local64.substring(local64.lastIndexOf(9) + 1);
				local10 = local10 + local64 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
	public static void method909() {
		aClass36_621 = null;
		aClass3_12 = null;
		aClass36Array23 = null;
		aClass36_624 = null;
		aClass36_623 = null;
		aClass36_620 = null;
		aClass36_622 = null;
	}
}

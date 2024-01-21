import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!c", name = "qb", descriptor = "Lclient!w;")
	public static Class79 aClass79_1;

	@OriginalMember(owner = "client!c", name = "tb", descriptor = "I")
	public static int anInt525;

	@OriginalMember(owner = "client!c", name = "Gb", descriptor = "Z")
	public static boolean aBoolean48;

	@OriginalMember(owner = "client!c", name = "jb", descriptor = "Lclient!kd;")
	private static Class39 aClass39_281 = Static108.method1915("Enter object name");

	@OriginalMember(owner = "client!c", name = "ob", descriptor = "Lclient!kd;")
	public static Class39 aClass39_282 = Static108.method1915("redstone1");

	@OriginalMember(owner = "client!c", name = "rb", descriptor = "Z")
	public static boolean aBoolean47 = false;

	@OriginalMember(owner = "client!c", name = "sb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_283 = Static108.method1915("Titelbild geladen)3");

	@OriginalMember(owner = "client!c", name = "zb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_284 = Static108.method1915("Freund hinzuf-Ugen");

	@OriginalMember(owner = "client!c", name = "Ab", descriptor = "I")
	public static int anInt530 = 0;

	@OriginalMember(owner = "client!c", name = "Cb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_285 = Static108.method1915(" loggt sich aus)3");

	@OriginalMember(owner = "client!c", name = "Ib", descriptor = "Lclient!kd;")
	public static Class39 aClass39_286 = aClass39_281;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
	public static void method284() {
		aClass79_1 = null;
		aClass39_283 = null;
		aClass39_284 = null;
		aClass39_282 = null;
		aClass39_285 = null;
		aClass39_286 = null;
		aClass39_281 = null;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
	public static void method285() {
		if (Static91.anInt2130 != 1) {
			return;
		}
		if (Static89.anInt2109 >= 6 && Static89.anInt2109 <= 106 && Static38.anInt1157 >= 467 && Static38.anInt1157 <= 499) {
			Static114.anInt2845 = (Static114.anInt2845 + 1) % 4;
			Static66.aBoolean145 = true;
			Static113.aBoolean226 = true;
			Static103.aClass1_Sub18_Sub1_5.method2203(161);
			Static103.aClass1_Sub18_Sub1_5.method2168(Static114.anInt2845);
			Static103.aClass1_Sub18_Sub1_5.method2168(Static24.anInt816);
			Static103.aClass1_Sub18_Sub1_5.method2168(Static11.anInt495);
		}
		if (Static89.anInt2109 >= 135 && Static89.anInt2109 <= 235 && Static38.anInt1157 >= 467 && Static38.anInt1157 <= 499) {
			Static24.anInt816 = (Static24.anInt816 + 1) % 3;
			Static66.aBoolean145 = true;
			Static113.aBoolean226 = true;
			Static103.aClass1_Sub18_Sub1_5.method2203(161);
			Static103.aClass1_Sub18_Sub1_5.method2168(Static114.anInt2845);
			Static103.aClass1_Sub18_Sub1_5.method2168(Static24.anInt816);
			Static103.aClass1_Sub18_Sub1_5.method2168(Static11.anInt495);
		}
		if (Static89.anInt2109 >= 273 && Static89.anInt2109 <= 373 && Static38.anInt1157 >= 467 && Static38.anInt1157 <= 499) {
			Static113.aBoolean226 = true;
			Static11.anInt495 = (Static11.anInt495 + 1) % 3;
			Static66.aBoolean145 = true;
			Static103.aClass1_Sub18_Sub1_5.method2203(161);
			Static103.aClass1_Sub18_Sub1_5.method2168(Static114.anInt2845);
			Static103.aClass1_Sub18_Sub1_5.method2168(Static24.anInt816);
			Static103.aClass1_Sub18_Sub1_5.method2168(Static11.anInt495);
		}
		if (Static89.anInt2109 < 412 || Static89.anInt2109 > 512 || Static38.anInt1157 < 467 || Static38.anInt1157 > 499) {
			return;
		}
		if (Static48.anInt1318 != -1) {
			Static66.method1189(Static8.aClass39_147, Static103.aClass39_1270, 0);
			if (Static23.aClass39_402 != null) {
				Static66.method1189(Static8.aClass39_147, Static23.aClass39_402, 0);
				return;
			}
			return;
		}
		Static20.method408();
		if (Static76.anInt1913 != -1) {
			Static46.aBoolean221 = false;
			Static8.aClass39_152 = Static8.aClass39_147;
			Static52.anInt1457 = Static48.anInt1318 = Static76.anInt1913;
			return;
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V")
	public static void method286() {
		if (Static63.aClass45_1 != null) {
			@Pc(3) Class45 local3 = Static63.aClass45_1;
			synchronized (Static63.aClass45_1) {
				Static63.aClass45_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BLclient!a;)Lclient!a;")
	public static Class1_Sub1_Sub1 method287(@OriginalArg(1) Class1_Sub1_Sub1 arg0) {
		@Pc(15) Class1_Sub1_Sub1 local15 = Static34.method644(arg0);
		if (local15 == null) {
			local15 = arg0.aClass1_Sub1_Sub1_1;
		}
		return local15;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!wb;BI)V")
	public static void method288(@OriginalArg(0) Class1_Sub18_Sub1 arg0) {
		while (true) {
			@Pc(18) Class1_Sub9 local18 = (Class1_Sub9) Static67.aClass31_39.method1000();
			if (local18 == null) {
				return;
			}
			@Pc(23) boolean local23 = false;
			for (@Pc(25) int local25 = 0; local25 < local18.anInt1455; local25++) {
				if (local18.aClass34Array1[local25] != null) {
					if (local18.aClass34Array1[local25].anInt1567 == 2) {
						local18.anIntArray204[local25] = -5;
					}
					if (local18.aClass34Array1[local25].anInt1567 == 0) {
						local23 = true;
					}
				}
				if (local18.aClass34Array2[local25] != null) {
					if (local18.aClass34Array2[local25].anInt1567 == 2) {
						local18.anIntArray204[local25] = -6;
					}
					if (local18.aClass34Array2[local25].anInt1567 == 0) {
						local23 = true;
					}
				}
			}
			if (local23) {
				return;
			}
			arg0.method2203(159);
			arg0.method2168(0);
			@Pc(105) int local105 = arg0.anInt3078;
			arg0.method2149(local18.anInt1454);
			for (@Pc(112) int local112 = 0; local112 < local18.anInt1455; local112++) {
				if (local18.anIntArray204[local112] == 0) {
					try {
						@Pc(133) int local133 = local18.anIntArray202[local112];
						@Pc(142) Field local142;
						@Pc(146) int local146;
						if (local133 == 0) {
							local142 = (Field) local18.aClass34Array1[local112].anObject2;
							local146 = local142.getInt(null);
							arg0.method2168(0);
							arg0.method2149(local146);
						} else if (local133 == 1) {
							local142 = (Field) local18.aClass34Array1[local112].anObject2;
							local142.setInt(null, local18.anIntArray205[local112]);
							arg0.method2168(0);
						} else if (local133 == 2) {
							local142 = (Field) local18.aClass34Array1[local112].anObject2;
							local146 = local142.getModifiers();
							arg0.method2168(0);
							arg0.method2149(local146);
						}
						@Pc(216) Method local216;
						if (local133 == 3) {
							local216 = (Method) local18.aClass34Array2[local112].anObject2;
							@Pc(221) byte[][] local221 = local18.aByteArrayArrayArray4[local112];
							@Pc(225) Object[] local225 = new Object[local221.length];
							for (@Pc(227) int local227 = 0; local227 < local221.length; local227++) {
								@Pc(239) ObjectInputStream local239 = new ObjectInputStream(new ByteArrayInputStream(local221[local227]));
								local225[local227] = local239.readObject();
							}
							@Pc(258) Object local258 = local216.invoke(null, local225);
							if (local258 == null) {
								arg0.method2168(0);
							} else if (local258 instanceof Number) {
								arg0.method2168(1);
								arg0.method2179(((Number) local258).longValue());
							} else if (local258 instanceof Class39) {
								arg0.method2168(2);
								arg0.method2165((Class39) local258);
							} else {
								arg0.method2168(4);
							}
						} else if (local133 == 4) {
							local216 = (Method) local18.aClass34Array2[local112].anObject2;
							local146 = local216.getModifiers();
							arg0.method2168(0);
							arg0.method2149(local146);
						}
					} catch (@Pc(326) ClassNotFoundException local326) {
						arg0.method2168(-10);
					} catch (@Pc(332) InvalidClassException local332) {
						arg0.method2168(-11);
					} catch (@Pc(338) StreamCorruptedException local338) {
						arg0.method2168(-12);
					} catch (@Pc(344) OptionalDataException local344) {
						arg0.method2168(-13);
					} catch (@Pc(350) IllegalAccessException local350) {
						arg0.method2168(-14);
					} catch (@Pc(356) IllegalArgumentException local356) {
						arg0.method2168(-15);
					} catch (@Pc(362) InvocationTargetException local362) {
						arg0.method2168(-16);
					} catch (@Pc(368) SecurityException local368) {
						arg0.method2168(-17);
					} catch (@Pc(374) IOException local374) {
						arg0.method2168(-18);
					} catch (@Pc(380) NullPointerException local380) {
						arg0.method2168(-19);
					} catch (@Pc(386) Exception local386) {
						arg0.method2168(-20);
					} catch (@Pc(392) Throwable local392) {
						arg0.method2168(-21);
					}
				} else {
					arg0.method2168(local18.anIntArray204[local112]);
				}
			}
			arg0.method2162(local105);
			arg0.method2180(arg0.anInt3078 - local105);
			local18.method2128();
		}
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
	public static void method289() {
		@Pc(14) int local14;
		if (Static98.anInt2381 > 0) {
			for (local14 = 0; local14 < 256; local14++) {
				if (Static98.anInt2381 > 768) {
					Static101.anIntArray394[local14] = Static91.method1485(Static49.anIntArray186[local14], 1024 - Static98.anInt2381, Static41.anIntArray472[local14]);
				} else if (Static98.anInt2381 > 256) {
					Static101.anIntArray394[local14] = Static49.anIntArray186[local14];
				} else {
					Static101.anIntArray394[local14] = Static91.method1485(Static41.anIntArray472[local14], 256 - Static98.anInt2381, Static49.anIntArray186[local14]);
				}
			}
		} else if (anInt530 <= 0) {
			for (local14 = 0; local14 < 256; local14++) {
				Static101.anIntArray394[local14] = Static41.anIntArray472[local14];
			}
		} else {
			for (local14 = 0; local14 < 256; local14++) {
				if (anInt530 > 768) {
					Static101.anIntArray394[local14] = Static91.method1485(Static48.anIntArray181[local14], 1024 - anInt530, Static41.anIntArray472[local14]);
				} else if (anInt530 > 256) {
					Static101.anIntArray394[local14] = Static48.anIntArray181[local14];
				} else {
					Static101.anIntArray394[local14] = Static91.method1485(Static41.anIntArray472[local14], 256 - anInt530, Static48.anIntArray181[local14]);
				}
			}
		}
		@Pc(156) int local156 = 6885;
		local14 = 0;
		Static15.method1513(0, 9, 128, 263);
		Static68.aClass1_Sub1_Sub4_Sub4_5.method1520(0, 0);
		Static15.method1505();
		@Pc(185) int local185;
		@Pc(189) int local189;
		@Pc(202) int local202;
		@Pc(209) int local209;
		@Pc(213) int local213;
		@Pc(223) int local223;
		@Pc(218) int local218;
		for (@Pc(172) int local172 = 1; local172 < 255; local172++) {
			local185 = Static100.anIntArray391[local172] * (256 - local172) / 256;
			local189 = local185 + 22;
			if (local189 < 0) {
				local189 = 0;
			}
			local14 += local189;
			for (local202 = local189; local202 < 128; local202++) {
				local209 = Static51.anIntArray195[local14++];
				if (local209 == 0) {
					local156++;
				} else {
					local213 = local209;
					local218 = Static79.aClass6_18.anIntArray467[local156];
					local223 = 256 - local209;
					local209 = Static101.anIntArray394[local209];
					Static79.aClass6_18.anIntArray467[local156++] = ((local209 & 0xFF00) * local213 + (local218 & 0xFF00) * local223 & 0xFF0000) + ((local218 & 0xFF00FF) * local223 + (local209 & 0xFF00FF) * local213 & 0xFF00FF00) >> 8;
				}
			}
			local156 += local189 + 637;
		}
		Static15.method1513(637, 9, 765, 263);
		Static95.aClass1_Sub1_Sub4_Sub4_7.method1520(382, 0);
		local14 = 0;
		Static15.method1505();
		local156 = 7546;
		for (local185 = 1; local185 < 255; local185++) {
			local189 = Static100.anIntArray391[local185] * (256 - local185) / 256;
			local202 = 103 - local189;
			local156 += local189;
			for (local209 = 0; local209 < local202; local209++) {
				local213 = Static51.anIntArray195[local14++];
				if (local213 == 0) {
					local156++;
				} else {
					local218 = 256 - local213;
					local223 = local213;
					local213 = Static101.anIntArray394[local213];
					@Pc(353) int local353 = Static79.aClass6_18.anIntArray467[local156];
					Static79.aClass6_18.anIntArray467[local156++] = ((local213 & 0xFF00FF) * local223 + (local353 & 0xFF00FF) * local218 & 0xFF00FF00) + ((local213 & 0xFF00) * local223 + ((local353 & 0xFF00) * local218) & 0xFF0000) >> 8;
				}
			}
			local156 += 765 - local189 - local202;
			local14 += 128 - local202;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZB)V")
	public static void method290(@OriginalArg(0) boolean arg0) {
		if (Static35.anInt1069 == Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2521 >> 7 && Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2508 >> 7 == Static32.anInt684) {
			Static35.anInt1069 = 0;
		}
		@Pc(21) int local21 = Static57.anInt1547;
		if (arg0) {
			local21 = 1;
		}
		for (@Pc(27) int local27 = 0; local27 < local21; local27++) {
			@Pc(45) Class1_Sub1_Sub2_Sub1_Sub2 local45;
			@Pc(51) int local51;
			if (arg0) {
				local51 = 33538048;
				local45 = Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1;
			} else {
				local45 = Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[Static12.anIntArray91[local27]];
				local51 = Static12.anIntArray91[local27] << 14;
			}
			if (local45 != null && local45.method1797()) {
				@Pc(68) int local68 = local45.anInt2521 >> 7;
				local45.aBoolean204 = false;
				if ((Static68.aBoolean149 && Static57.anInt1547 > 50 || Static57.anInt1547 > 200) && !arg0 && local45.anInt2503 == local45.anInt2495) {
					local45.aBoolean204 = true;
				}
				@Pc(96) int local96 = local45.anInt2508 >> 7;
				if (local68 >= 0 && local68 < 104 && local96 >= 0 && local96 < 104) {
					if (local45.aClass1_Sub1_Sub2_Sub7_3 == null || local45.anInt2559 > Static45.anInt1256 || local45.anInt2558 <= Static45.anInt1256) {
						if ((local45.anInt2521 & 0x7F) == 64 && (local45.anInt2508 & 0x7F) == 64) {
							if (Static38.anInt1159 == Static46.anIntArrayArray26[local68][local96]) {
								continue;
							}
							Static46.anIntArrayArray26[local68][local96] = Static38.anInt1159;
						}
						local45.anInt2537 = Static62.method2035(Static9.anInt2983, local45.anInt2521, local45.anInt2508);
						Static32.aClass5_2.method108(Static9.anInt2983, local45.anInt2521, local45.anInt2508, local45.anInt2537, 60, local45, local45.anInt2509, local51, local45.aBoolean203);
					} else {
						local45.aBoolean204 = false;
						local45.anInt2537 = Static62.method2035(Static9.anInt2983, local45.anInt2521, local45.anInt2508);
						Static32.aClass5_2.method137(Static9.anInt2983, local45.anInt2521, local45.anInt2508, local45.anInt2537, local45, local45.anInt2509, local51, local45.anInt2548, local45.anInt2544, local45.anInt2553, local45.anInt2541);
					}
				}
			}
		}
	}
}

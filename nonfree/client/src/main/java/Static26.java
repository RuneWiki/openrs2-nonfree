import java.awt.Graphics;
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

public final class Static26 {

	@OriginalMember(owner = "client!ea", name = "Z", descriptor = "Lclient!jb;")
	public static Class35 aClass35_1;

	@OriginalMember(owner = "client!ea", name = "W", descriptor = "I")
	public static int anInt724 = 0;

	@OriginalMember(owner = "client!ea", name = "X", descriptor = "I")
	public static int anInt725 = 0;

	@OriginalMember(owner = "client!ea", name = "db", descriptor = "Lclient!qc;")
	public static Class60 aClass60_302 = Static121.method2047("mapfunction");

	@OriginalMember(owner = "client!ea", name = "eb", descriptor = "I")
	public static volatile int anInt729 = 0;

	@OriginalMember(owner = "client!ea", name = "ib", descriptor = "[I")
	public static int[] anIntArray46 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!ea", name = "nb", descriptor = "[I")
	public static int[] anIntArray47 = new int[2000];

	@OriginalMember(owner = "client!ea", name = "pb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_303 = Static121.method2047("Nehmen");

	@OriginalMember(owner = "client!ea", name = "ub", descriptor = "J")
	public static long aLong22 = 0L;

	@OriginalMember(owner = "client!ea", name = "xb", descriptor = "I")
	public static int anInt744 = 0;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!qf;BLclient!qf;)V")
	public static void method504(@OriginalArg(0) Class4_Sub4_Sub3_Sub4 arg0, @OriginalArg(2) Class4_Sub4_Sub3_Sub4 arg1) {
		if (Static90.aBoolean86) {
			Static4.method29(arg1, arg0);
			return;
		}
		if (Static71.anInt1828 == 0 || Static71.anInt1828 == 5) {
			arg0.method1729(Static18.aClass60_166, 382, 225, 16777215, -1);
			Static80.method1718(230, 233, 304, 34, 9179409);
			Static80.method1718(231, 234, 302, 32, 0);
			Static80.method1705(232, 235, Static111.anInt2691 * 3, 30, 9179409);
			Static80.method1705(Static111.anInt2691 * 3 + 232, 235, 300 - Static111.anInt2691 * 3, 30, 0);
			arg0.method1729(Static33.aClass60_369, 382, 256, 16777215, -1);
		}
		@Pc(114) short local114;
		@Pc(122) int local122;
		if (Static71.anInt1828 == 20) {
			Static31.aClass4_Sub4_Sub3_Sub1_2.method431(382 - Static31.aClass4_Sub4_Sub3_Sub1_2.anInt635 / 2, -(Static31.aClass4_Sub4_Sub3_Sub1_2.anInt633 / 2) + 271);
			local114 = 211;
			arg0.method1729(Static33.aClass60_368, 382, 211, 16776960, 0);
			local122 = local114 + 15;
			arg0.method1729(Static33.aClass60_362, 382, 226, 16776960, 0);
			@Pc(130) int local130 = local122 + 15;
			arg0.method1729(Static33.aClass60_364, 382, 241, 16776960, 0);
			@Pc(138) int local138 = local130 + 15;
			@Pc(139) int local139 = local138 + 10;
			arg0.method1745(Static125.method2072(new Class60[] { Static9.aClass60_62, Static97.method1747(Static33.aClass60_361) }), 272, 266, 16777215, 0);
			@Pc(159) int local159 = local139 + 15;
			arg0.method1745(Static125.method2072(new Class60[] { Static16.aClass60_149, Static33.aClass60_371.method1647() }), 274, 281, 16777215, 0);
			@Pc(180) int local180 = local159 + 15;
		}
		if (Static71.anInt1828 == 10) {
			Static31.aClass4_Sub4_Sub3_Sub1_2.method431(202, 171);
			if (Static90.anInt2110 == 0) {
				local114 = 251;
				arg0.method1729(Static11.aClass60_103, 382, 251, 16776960, 0);
				local122 = local114 + 30;
				Static62.aClass4_Sub4_Sub3_Sub1_3.method431(229, 271);
				arg0.method1730(Static34.aClass60_377, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				Static62.aClass4_Sub4_Sub3_Sub1_3.method431(389, 271);
				arg0.method1730(Static36.aClass60_385, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (Static90.anInt2110 == 2) {
				local114 = 211;
				arg0.method1729(Static33.aClass60_368, 382, 211, 16776960, 0);
				local122 = local114 + 15;
				arg0.method1729(Static33.aClass60_362, 382, 226, 16776960, 0);
				local122 += 15;
				arg0.method1729(Static33.aClass60_364, 382, 241, 16776960, 0);
				local122 += 15;
				local122 += 10;
				arg0.method1745(Static125.method2072(new Class60[] { Static9.aClass60_62, Static97.method1747(Static33.aClass60_361), Static54.anInt1381 == 0 & Static81.anInt1944 % 40 < 20 ? Static16.aClass60_153 : Static33.aClass60_365 }), 272, 266, 16777215, 0);
				local122 += 15;
				arg0.method1745(Static125.method2072(new Class60[] { Static16.aClass60_149, Static33.aClass60_371.method1647(), Static81.anInt1944 % 40 < 20 & Static54.anInt1381 == 1 ? Static16.aClass60_153 : Static33.aClass60_365 }), 274, 281, 16777215, 0);
				Static62.aClass4_Sub4_Sub3_Sub1_3.method431(229, 301);
				arg0.method1729(Static25.aClass60_286, 302, 326, 16777215, 0);
				local122 += 15;
				Static62.aClass4_Sub4_Sub3_Sub1_3.method431(389, 301);
				arg0.method1729(Static83.aClass60_817, 462, 326, 16777215, 0);
			} else if (Static90.anInt2110 == 3) {
				arg0.method1729(Static15.aClass60_1188, 382, 211, 16776960, 0);
				local114 = 236;
				arg0.method1729(Static38.aClass60_401, 382, 236, 16777215, 0);
				local122 = local114 + 15;
				arg0.method1729(Static114.aClass60_1097, 382, 251, 16777215, 0);
				local122 += 15;
				arg0.method1729(Static76.aClass60_743, 382, 266, 16777215, 0);
				local122 += 15;
				arg0.method1729(Static32.aClass60_360, 382, 281, 16777215, 0);
				local122 += 15;
				Static62.aClass4_Sub4_Sub3_Sub1_3.method431(309, 301);
				arg0.method1729(Static83.aClass60_817, 382, 326, 16777215, 0);
			}
		}
		if (Static6.anInt71 != 1) {
			if (Static108.anInt2554 > 0) {
				Static37.method641(Static108.anInt2554);
				Static108.anInt2554 = 0;
			}
			Static10.method203();
		}
		Static59.aClass4_Sub4_Sub3_Sub1Array4[Static130.aBoolean125 ? 1 : 0].method431(725, 463);
		if (Static71.anInt1828 > 5 && Static7.anInt2989 != 2 && Static25.anInt697 == 0) {
			if (Static82.aClass4_Sub4_Sub3_Sub1_4 == null) {
				Static82.aClass4_Sub4_Sub3_Sub1_4 = Static123.method2066(Static1.aClass40_Sub1_1, Static55.aClass60_537, Static33.aClass60_365);
			} else {
				Static82.aClass4_Sub4_Sub3_Sub1_4.method431(5, 463);
				arg0.method1729(Static125.method2072(new Class60[] { Static120.aClass60_785, Static7.aClass60_1200, Static120.method1450(Static83.anInt1974) }), 55, 478, 16777215, 0);
				if (Static127.aClass23_1 == null) {
					arg1.method1729(Static76.aClass60_745, 55, 492, 16777215, 0);
				} else {
					arg1.method1729(Static108.aClass60_1037, 55, 492, 16777215, 0);
				}
			}
		}
		try {
			@Pc(615) Graphics local615 = Static83.aCanvas1.getGraphics();
			Static20.aClass2_1.method989(local615);
		} catch (@Pc(623) Exception local623) {
			Static83.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIII)V")
	public static void method505(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static92.anInt2256; local3++) {
			if (Static60.anIntArray235[local3] + Static109.anIntArray290[local3] > arg2 && Static60.anIntArray235[local3] < arg1 + arg2 && Static101.anIntArray276[local3] + Static125.anIntArray330[local3] > arg3 && Static125.anIntArray330[local3] < arg0 + arg3) {
				Static69.aBooleanArray8[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
	public static void method506() {
		Static60.aLong82 = 0L;
		Static30.aClass22_1.anInt917 = 0;
		Static32.aBoolean25 = true;
		Static13.aBoolean14 = true;
		Static3.anInt30 = 0;
		Static7.method2118();
		Static7.anInt2988 = -1;
		Static77.anInt1906 = 0;
		Static3.anInt33 = 0;
		Static25.anInt693 = 0;
		Static63.anInt1695 = 0;
		Static8.anInt130 = -1;
		Static93.aBoolean105 = false;
		Static56.aClass4_Sub13_Sub1_1.anInt1643 = 0;
		Static105.aClass4_Sub13_Sub1_3.anInt1643 = 0;
		Static99.anInt2423 = -1;
		Static83.anInt1979 = 0;
		Static115.anInt2762 = -1;
		Static63.method1268(0);
		for (@Pc(1936) int local1936 = 0; local1936 < 100; local1936++) {
			Static28.aClass60Array6[local1936] = null;
		}
		Static114.anInt2750 = 0;
		anInt725 = 0;
		Static43.anInt1107 = 0;
		Static130.anInt3022 = 0;
		Static81.anInt1951 = 0;
		Static129.anInt3002 = (int) (Math.random() * 120.0D) - 60;
		Static67.anInt2823 = -1;
		Static69.anInt1768 = (int) (Math.random() * 100.0D) - 50;
		Static9.anInt159 = (int) (Math.random() * 80.0D) - 40;
		Static83.anInt1976 = (int) (Math.random() * 110.0D) - 55;
		Static123.anInt2922 = 0;
		Static52.anInt1339 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		anInt724 = 0;
		Static71.aBoolean70 = false;
		Static17.anInt453 = (int) (Math.random() * 30.0D) - 20;
		for (@Pc(2016) int local2016 = 0; local2016 < 2048; local2016++) {
			Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[local2016] = null;
			Static22.aClass4_Sub13Array1[local2016] = null;
		}
		for (@Pc(2034) int local2034 = 0; local2034 < 32768; local2034++) {
			Static120.aClass4_Sub4_Sub1_Sub2_Sub1Array2[local2034] = null;
		}
		Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1 = Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[2047] = new Class4_Sub4_Sub1_Sub2_Sub2();
		Static129.aClass70_19.method1933();
		Static127.aClass70_18.method1933();
		@Pc(2066) int local2066;
		@Pc(2070) int local2070;
		for (@Pc(2062) int local2062 = 0; local2062 < 4; local2062++) {
			for (local2066 = 0; local2066 < 104; local2066++) {
				for (local2070 = 0; local2070 < 104; local2070++) {
					Static74.aClass70ArrayArrayArray1[local2062][local2066][local2070] = null;
				}
			}
		}
		Static52.aClass70_12 = new Class70();
		Static18.anInt469 = 0;
		Static46.anInt1193 = 0;
		for (local2066 = 0; local2066 < Static108.anInt2558; local2066++) {
			@Pc(2110) Class4_Sub4_Sub17 local2110 = Static107.method1837(local2066);
			if (local2110 != null && local2110.anInt2968 == 0) {
				Static105.anIntArray280[local2066] = 0;
				Static62.anIntArray168[local2066] = 0;
			}
		}
		for (local2070 = 0; local2070 < anIntArray47.length; local2070++) {
			anIntArray47[local2070] = -1;
		}
		if (Static23.anInt664 != -1) {
			Static34.method629(Static23.anInt664);
		}
		for (@Pc(2154) Class4_Sub18 local2154 = (Class4_Sub18) Static111.aClass66_12.method1838(); local2154 != null; local2154 = (Class4_Sub18) Static111.aClass66_12.method1831()) {
			Static5.method38(true, local2154);
		}
		Static23.anInt664 = -1;
		Static111.aClass66_12 = new Class66(8);
		Static93.aBoolean105 = false;
		Static11.aClass4_Sub17_1 = null;
		Static25.anInt693 = 0;
		Static112.aClass36_2.method1041(-1, false, new int[5], null);
		for (@Pc(2190) int local2190 = 0; local2190 < 5; local2190++) {
			Static10.aClass60Array3[local2190] = null;
			Static93.aBooleanArray11[local2190] = false;
		}
		Static67.method1980();
		Static10.aBoolean6 = true;
		for (@Pc(2212) int local2212 = 0; local2212 < 100; local2212++) {
			Static69.aBooleanArray8[local2212] = true;
		}
		Static57.aClass60_186 = null;
		Static58.aClass4_Sub22Array1 = null;
		Static105.anInt2506 = 0;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)V")
	public static void method507(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static27.method520(arg0)) {
			return;
		}
		@Pc(20) Class4_Sub17[] local20 = Static82.aClass4_Sub17ArrayArray1[arg0];
		for (@Pc(22) int local22 = 0; local22 < local20.length; local22++) {
			@Pc(28) Class4_Sub17 local28 = local20[local22];
			if (local28.anObjectArray12 != null) {
				@Pc(35) Class4_Sub16 local35 = new Class4_Sub16();
				local35.aClass4_Sub17_9 = local28;
				local35.anObjectArray3 = local28.anObjectArray12;
				Static18.method296(local35);
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!kf;IB)V")
	public static void method508(@OriginalArg(0) Class4_Sub13_Sub1 arg0) {
		while (true) {
			@Pc(18) Class4_Sub20 local18 = (Class4_Sub20) Static112.aClass70_17.method1939();
			if (local18 == null) {
				return;
			}
			@Pc(23) boolean local23 = false;
			for (@Pc(25) int local25 = 0; local25 < local18.anInt2549; local25++) {
				if (local18.aClass30Array2[local25] != null) {
					if (local18.aClass30Array2[local25].anInt1209 == 2) {
						local18.anIntArray283[local25] = -5;
					}
					if (local18.aClass30Array2[local25].anInt1209 == 0) {
						local23 = true;
					}
				}
				if (local18.aClass30Array1[local25] != null) {
					if (local18.aClass30Array1[local25].anInt1209 == 2) {
						local18.anIntArray283[local25] = -6;
					}
					if (local18.aClass30Array1[local25].anInt1209 == 0) {
						local23 = true;
					}
				}
			}
			if (local23) {
				return;
			}
			arg0.method1265(152);
			arg0.method1209(0);
			@Pc(105) int local105 = arg0.anInt1643;
			arg0.method1221(local18.anInt2557);
			for (@Pc(112) int local112 = 0; local112 < local18.anInt2549; local112++) {
				if (local18.anIntArray283[local112] == 0) {
					try {
						@Pc(133) int local133 = local18.anIntArray282[local112];
						@Pc(148) Field local148;
						@Pc(174) int local174;
						if (local133 == 0) {
							local148 = (Field) local18.aClass30Array2[local112].anObject3;
							local174 = local148.getInt(null);
							arg0.method1209(0);
							arg0.method1221(local174);
						} else if (local133 == 1) {
							local148 = (Field) local18.aClass30Array2[local112].anObject3;
							local148.setInt(null, local18.anIntArray281[local112]);
							arg0.method1209(0);
						} else if (local133 == 2) {
							local148 = (Field) local18.aClass30Array2[local112].anObject3;
							local174 = local148.getModifiers();
							arg0.method1209(0);
							arg0.method1221(local174);
						}
						@Pc(215) Method local215;
						if (local133 == 3) {
							local215 = (Method) local18.aClass30Array1[local112].anObject3;
							@Pc(220) byte[][] local220 = local18.aByteArrayArrayArray6[local112];
							@Pc(224) Object[] local224 = new Object[local220.length];
							for (@Pc(226) int local226 = 0; local226 < local220.length; local226++) {
								@Pc(238) ObjectInputStream local238 = new ObjectInputStream(new ByteArrayInputStream(local220[local226]));
								local224[local226] = local238.readObject();
							}
							@Pc(253) Object local253 = local215.invoke(null, local224);
							if (local253 == null) {
								arg0.method1209(0);
							} else if (local253 instanceof Number) {
								arg0.method1209(1);
								arg0.method1242(((Number) local253).longValue());
							} else if (local253 instanceof Class60) {
								arg0.method1209(2);
								arg0.method1225((Class60) local253);
							} else {
								arg0.method1209(4);
							}
						} else if (local133 == 4) {
							local215 = (Method) local18.aClass30Array1[local112].anObject3;
							local174 = local215.getModifiers();
							arg0.method1209(0);
							arg0.method1221(local174);
						}
					} catch (@Pc(321) ClassNotFoundException local321) {
						arg0.method1209(-10);
					} catch (@Pc(327) InvalidClassException local327) {
						arg0.method1209(-11);
					} catch (@Pc(333) StreamCorruptedException local333) {
						arg0.method1209(-12);
					} catch (@Pc(339) OptionalDataException local339) {
						arg0.method1209(-13);
					} catch (@Pc(345) IllegalAccessException local345) {
						arg0.method1209(-14);
					} catch (@Pc(351) IllegalArgumentException local351) {
						arg0.method1209(-15);
					} catch (@Pc(357) InvocationTargetException local357) {
						arg0.method1209(-16);
					} catch (@Pc(363) SecurityException local363) {
						arg0.method1209(-17);
					} catch (@Pc(369) IOException local369) {
						arg0.method1209(-18);
					} catch (@Pc(375) NullPointerException local375) {
						arg0.method1209(-19);
					} catch (@Pc(381) Exception local381) {
						arg0.method1209(-20);
					} catch (@Pc(387) Throwable local387) {
						arg0.method1209(-21);
					}
				} else {
					arg0.method1209(local18.anIntArray283[local112]);
				}
			}
			arg0.method1247(local105);
			arg0.method1204(arg0.anInt1643 - local105);
			local18.method2124();
		}
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V")
	public static void method509() {
		anIntArray47 = null;
		aClass60_302 = null;
		aClass35_1 = null;
		aClass60_303 = null;
		anIntArray46 = null;
	}

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)Z")
	public static boolean method510() {
		@Pc(8) long local8 = Static16.method286();
		@Pc(14) int local14 = (int) (local8 - Static98.aLong85);
		Static98.aLong85 = local8;
		if (local14 > 200) {
			local14 = 200;
		}
		Static93.anInt2272 += local14;
		if (Static86.anInt675 == 0 && Static114.anInt2749 == 0 && Static111.anInt2682 == 0 && Static83.anInt1975 == 0) {
			return true;
		} else if (Static71.aClass78_4 == null) {
			return false;
		} else {
			try {
				if (Static93.anInt2272 > 30000) {
					throw new IOException();
				}
				@Pc(58) Class4_Sub4_Sub15 local58;
				@Pc(63) Class4_Sub13 local63;
				while (Static114.anInt2749 < 20 && Static83.anInt1975 > 0) {
					local58 = (Class4_Sub4_Sub15) Static105.aClass66_10.method1838();
					local63 = new Class4_Sub13(4);
					local63.method1209(1);
					local63.method1245((int) local58.aLong100);
					Static71.aClass78_4.method2081(local63.aByteArray68, 4);
					Static32.aClass66_2.method1830(local58, local58.aLong100);
					Static83.anInt1975--;
					Static114.anInt2749++;
				}
				while (Static86.anInt675 < 20 && Static111.anInt2682 > 0) {
					local58 = (Class4_Sub4_Sub15) Static126.aClass13_2.method287();
					local63 = new Class4_Sub13(4);
					local63.method1209(0);
					local63.method1245((int) local58.aLong100);
					Static71.aClass78_4.method2081(local63.aByteArray68, 4);
					local58.method2094();
					Static34.aClass66_3.method1830(local58, local58.aLong100);
					Static111.anInt2682--;
					Static86.anInt675++;
				}
				for (@Pc(161) int local161 = 0; local161 < 100; local161++) {
					@Pc(167) int local167 = Static71.aClass78_4.method2076();
					if (local167 < 0) {
						throw new IOException();
					}
					if (local167 == 0) {
						break;
					}
					Static93.anInt2272 = 0;
					@Pc(185) byte local185 = 0;
					if (Static27.aClass4_Sub4_Sub15_1 == null) {
						local185 = 8;
					} else if (Static27.anInt757 == 0) {
						local185 = 1;
					}
					@Pc(208) int local208;
					@Pc(213) int local213;
					@Pc(246) int local246;
					@Pc(380) int local380;
					if (local185 <= 0) {
						local208 = Static56.aClass4_Sub13_2.aByteArray68.length - Static27.aClass4_Sub4_Sub15_1.aByte7;
						local213 = 512 - Static27.anInt757;
						if (local213 > local208 - Static56.aClass4_Sub13_2.anInt1643) {
							local213 = local208 - Static56.aClass4_Sub13_2.anInt1643;
						}
						if (local213 > local167) {
							local213 = local167;
						}
						Static71.aClass78_4.method2077(local213, Static56.aClass4_Sub13_2.anInt1643, Static56.aClass4_Sub13_2.aByteArray68);
						if (Static5.aByte1 != 0) {
							for (local246 = 0; local246 < local213; local246++) {
								Static56.aClass4_Sub13_2.aByteArray68[local246 + Static56.aClass4_Sub13_2.anInt1643] ^= Static5.aByte1;
							}
						}
						Static27.anInt757 += local213;
						Static56.aClass4_Sub13_2.anInt1643 += local213;
						if (local208 == Static56.aClass4_Sub13_2.anInt1643) {
							if (Static27.aClass4_Sub4_Sub15_1.aLong100 == 16711935L) {
								Static83.aClass4_Sub13_4 = Static56.aClass4_Sub13_2;
								for (local246 = 0; local246 < 256; local246++) {
									@Pc(367) Class40_Sub1 local367 = Static131.aClass40_Sub1Array1[local246];
									if (local367 != null) {
										Static83.aClass4_Sub13_4.anInt1643 = local246 * 8 + 5;
										local380 = Static83.aClass4_Sub13_4.method1215();
										@Pc(384) int local384 = Static83.aClass4_Sub13_4.method1215();
										local367.method1128(local380, local384);
									}
								}
							} else {
								Static16.aCRC32_1.reset();
								Static16.aCRC32_1.update(Static56.aClass4_Sub13_2.aByteArray68, 0, local208);
								local246 = (int) Static16.aCRC32_1.getValue();
								if (Static27.aClass4_Sub4_Sub15_1.anInt2865 != local246) {
									try {
										Static71.aClass78_4.method2085();
									} catch (@Pc(311) Exception local311) {
									}
									Static30.anInt839++;
									Static71.aClass78_4 = null;
									Static5.aByte1 = (byte) (Math.random() * 255.0D + 1.0D);
									return false;
								}
								Static30.anInt839 = 0;
								Static11.anInt250 = 0;
								Static27.aClass4_Sub4_Sub15_1.aClass40_Sub1_21.method1129((int) (Static27.aClass4_Sub4_Sub15_1.aLong100 & 0xFFFFL), Static33.aBoolean26, Static56.aClass4_Sub13_2.aByteArray68, (Static27.aClass4_Sub4_Sub15_1.aLong100 & 0xFF0000L) == 16711680L);
							}
							Static27.aClass4_Sub4_Sub15_1.method2124();
							Static27.aClass4_Sub4_Sub15_1 = null;
							if (Static33.aBoolean26) {
								Static114.anInt2749--;
							} else {
								Static86.anInt675--;
							}
							Static56.aClass4_Sub13_2 = null;
							Static27.anInt757 = 0;
						} else {
							if (Static27.anInt757 != 512) {
								break;
							}
							Static27.anInt757 = 0;
						}
					} else {
						local208 = local185 - Static34.aClass4_Sub13_1.anInt1643;
						if (local167 < local208) {
							local208 = local167;
						}
						Static71.aClass78_4.method2077(local208, Static34.aClass4_Sub13_1.anInt1643, Static34.aClass4_Sub13_1.aByteArray68);
						if (Static5.aByte1 != 0) {
							for (local213 = 0; local213 < local208; local213++) {
								Static34.aClass4_Sub13_1.aByteArray68[local213 + Static34.aClass4_Sub13_1.anInt1643] ^= Static5.aByte1;
							}
						}
						Static34.aClass4_Sub13_1.anInt1643 += local208;
						if (local185 > Static34.aClass4_Sub13_1.anInt1643) {
							break;
						}
						if (Static27.aClass4_Sub4_Sub15_1 == null) {
							Static34.aClass4_Sub13_1.anInt1643 = 0;
							local213 = Static34.aClass4_Sub13_1.method1223();
							local246 = Static34.aClass4_Sub13_1.method1244();
							@Pc(519) int local519 = Static34.aClass4_Sub13_1.method1223();
							local380 = Static34.aClass4_Sub13_1.method1215();
							@Pc(530) long local530 = (long) ((local213 << 16) + local246);
							@Pc(536) Class4_Sub4_Sub15 local536 = (Class4_Sub4_Sub15) Static32.aClass66_2.method1834(local530);
							Static33.aBoolean26 = true;
							if (local536 == null) {
								local536 = (Class4_Sub4_Sub15) Static34.aClass66_3.method1834(local530);
								Static33.aBoolean26 = false;
							}
							if (local536 == null) {
								throw new IOException();
							}
							Static27.aClass4_Sub4_Sub15_1 = local536;
							@Pc(565) int local565 = local519 == 0 ? 5 : 9;
							Static56.aClass4_Sub13_2 = new Class4_Sub13(local380 + local565 + Static27.aClass4_Sub4_Sub15_1.aByte7);
							Static56.aClass4_Sub13_2.method1209(local519);
							Static56.aClass4_Sub13_2.method1221(local380);
							Static34.aClass4_Sub13_1.anInt1643 = 0;
							Static27.anInt757 = 8;
						} else if (Static27.anInt757 == 0) {
							if (Static34.aClass4_Sub13_1.aByteArray68[0] == -1) {
								Static34.aClass4_Sub13_1.anInt1643 = 0;
								Static27.anInt757 = 1;
							} else {
								Static27.aClass4_Sub4_Sub15_1 = null;
							}
						}
					}
				}
				return true;
			} catch (@Pc(617) IOException local617) {
				try {
					Static71.aClass78_4.method2085();
				} catch (@Pc(622) Exception local622) {
				}
				Static71.aClass78_4 = null;
				Static11.anInt250++;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)V")
	public static void method511() {
		if (!Static71.aBoolean70) {
			return;
		}
		@Pc(11) Class4_Sub17 local11 = Static23.method459(Static89.anInt2076, Static52.anInt1348);
		if (local11 != null && local11.anObjectArray10 != null) {
			@Pc(26) Class4_Sub16 local26 = new Class4_Sub16();
			local26.aClass4_Sub17_9 = local11;
			local26.anObjectArray3 = local11.anObjectArray10;
			Static18.method296(local26);
		}
		Static71.aBoolean70 = false;
		Static130.method2133(local11);
	}

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "(I)V")
	public static void method512() {
		Static54.method995();
		Static110.method1894();
		Static24.method476();
		Static92.method1621();
		Static19.method338();
		Static95.method1674();
		Static121.method2042();
		Static45.method812();
		Static9.method139();
		Static76.method1417();
		Static128.method1882();
		Static10.method197();
		((Class21) Static91.anInterface2_1).method624();
		Static51.aClass48_30.method1393();
		Static120.aClass40_Sub1_15.method1109();
		Static10.aClass40_Sub1_5.method1109();
		Static119.aClass40_Sub1_19.method1109();
		Static2.aClass40_Sub1_9.method1109();
		Static119.aClass40_Sub1_20.method1109();
		Static5.aClass40_Sub1_3.method1109();
		Static88.aClass40_Sub1_17.method1109();
		Static1.aClass40_Sub1_1.method1109();
		Static120.aClass40_Sub1_16.method1109();
		Static110.aClass40_Sub1_18.method1109();
		Static23.aClass40_Sub1_7.method1109();
		Static72.aClass40_Sub1_11.method1109();
	}
}

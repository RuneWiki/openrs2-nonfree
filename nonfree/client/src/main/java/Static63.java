import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!la", name = "O", descriptor = "Lclient!df;")
	public static Class16 aClass16_68;

	@OriginalMember(owner = "client!la", name = "U", descriptor = "Lclient!r;")
	public static Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_13;

	@OriginalMember(owner = "client!la", name = "eb", descriptor = "Lclient!jb;")
	public static Class25 aClass25_28;

	@OriginalMember(owner = "client!la", name = "gb", descriptor = "Lclient!jb;")
	public static Class25 aClass25_29;

	@OriginalMember(owner = "client!la", name = "ib", descriptor = "[I")
	public static int[] anIntArray307;

	@OriginalMember(owner = "client!la", name = "lb", descriptor = "Lclient!la;")
	public static Class3_Sub12 aClass3_Sub12_6;

	@OriginalMember(owner = "client!la", name = "rb", descriptor = "I")
	public static int anInt2908;

	@OriginalMember(owner = "client!la", name = "yb", descriptor = "I")
	public static int anInt2914;

	@OriginalMember(owner = "client!la", name = "K", descriptor = "[Lclient!ha;")
	public static Class25_Sub1[] aClass25_Sub1Array2 = new Class25_Sub1[256];

	@OriginalMember(owner = "client!la", name = "Q", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!la", name = "Y", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1224 = Static59.method1195("Click to switch");

	@OriginalMember(owner = "client!la", name = "hb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1225 = aClass60_1224;

	@OriginalMember(owner = "client!la", name = "jb", descriptor = "I")
	public static int anInt2901 = 0;

	@OriginalMember(owner = "client!la", name = "tb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1226 = Static59.method1195("(Udns");

	@OriginalMember(owner = "client!la", name = "Lb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1227 = Static59.method1195("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!la", name = "Ub", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1228 = Static59.method1195("mapedge");

	@OriginalMember(owner = "client!la", name = "Wb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1229 = Static59.method1195("Lade)3)3)3");

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V")
	public static void method1918() {
		@Pc(5) int local5;
		if (Static68.anInt2131 > 0) {
			for (local5 = 0; local5 < 256; local5++) {
				if (Static68.anInt2131 > 768) {
					Static66.anIntArray215[local5] = Static86.method1064(Static100.anIntArray309[local5], 1024 - Static68.anInt2131, Static113.anIntArray335[local5]);
				} else if (Static68.anInt2131 <= 256) {
					Static66.anIntArray215[local5] = Static86.method1064(Static113.anIntArray335[local5], 256 - Static68.anInt2131, Static100.anIntArray309[local5]);
				} else {
					Static66.anIntArray215[local5] = Static113.anIntArray335[local5];
				}
			}
		} else if (Static6.anInt183 <= 0) {
			for (local5 = 0; local5 < 256; local5++) {
				Static66.anIntArray215[local5] = Static100.anIntArray309[local5];
			}
		} else {
			for (local5 = 0; local5 < 256; local5++) {
				if (Static6.anInt183 > 768) {
					Static66.anIntArray215[local5] = Static86.method1064(Static100.anIntArray309[local5], 1024 - Static6.anInt183, Static130.anIntArray392[local5]);
				} else if (Static6.anInt183 > 256) {
					Static66.anIntArray215[local5] = Static130.anIntArray392[local5];
				} else {
					Static66.anIntArray215[local5] = Static86.method1064(Static130.anIntArray392[local5], 256 - Static6.anInt183, Static100.anIntArray309[local5]);
				}
			}
		}
		Static40.method1891(0, 9, 128, 263);
		Static82.aClass3_Sub1_Sub2_Sub3_4.method1455(0, 0);
		Static40.method1896();
		local5 = 0;
		@Pc(161) int local161 = 6885;
		@Pc(176) int local176;
		@Pc(180) int local180;
		@Pc(190) int local190;
		@Pc(197) int local197;
		@Pc(214) int local214;
		@Pc(212) int local212;
		@Pc(207) int local207;
		for (@Pc(163) int local163 = 1; local163 < 255; local163++) {
			local176 = Static91.anIntArray283[local163] * (256 - local163) / 256;
			local180 = local176 + 22;
			if (local180 < 0) {
				local180 = 0;
			}
			local5 += local180;
			for (local190 = local180; local190 < 128; local190++) {
				local197 = Static114.anIntArray338[local5++];
				if (local197 == 0) {
					local161++;
				} else {
					local207 = Static55.aClass16_41.anIntArray269[local161];
					local212 = 256 - local197;
					local214 = local197;
					local197 = Static66.anIntArray215[local197];
					Static55.aClass16_41.anIntArray269[local161++] = ((local207 & 0xFF00) * local212 + local214 * (local197 & 0xFF00) & 0xFF0000) + (local212 * (local207 & 0xFF00FF) + local214 * (local197 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local161 += local180 + 765 - 128;
		}
		local161 = 7546;
		local5 = 0;
		Static40.method1891(637, 9, 765, 263);
		Static62.aClass3_Sub1_Sub2_Sub3_2.method1455(382, 0);
		Static40.method1896();
		for (local176 = 1; local176 < 255; local176++) {
			local180 = (256 - local176) * Static91.anIntArray283[local176] / 256;
			local190 = 103 - local180;
			local161 += local180;
			for (local197 = 0; local197 < local190; local197++) {
				local214 = Static114.anIntArray338[local5++];
				if (local214 == 0) {
					local161++;
				} else {
					local212 = local214;
					@Pc(342) int local342 = Static55.aClass16_41.anIntArray269[local161];
					local207 = 256 - local214;
					local214 = Static66.anIntArray215[local214];
					Static55.aClass16_41.anIntArray269[local161++] = ((local342 & 0xFF00) * local207 + (local214 & 0xFF00) * local212 & 0xFF0000) + (local212 * (local214 & 0xFF00FF) + ((local342 & 0xFF00FF) * local207) & 0xFF00FF00) >> 8;
				}
			}
			local161 += 765 - local180 - local190;
			local5 += 128 - local190;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BII)I")
	public static int method1928(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = arg0 * 57 + arg1;
		@Pc(11) int local11 = local5 ^ local5 << 13;
		@Pc(37) int local37 = Integer.MAX_VALUE & local11 * (local11 * 15731 * local11 + 789221) + 1376312589;
		return local37 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!la", name = "g", descriptor = "(B)V")
	public static void method1930() {
		aClass25_29 = null;
		aClass3_Sub1_Sub2_Sub4_13 = null;
		aClass25_28 = null;
		anIntArray307 = null;
		aCalendar2 = null;
		aClass3_Sub12_6 = null;
		aClass16_68 = null;
		aClass60_1225 = null;
		aClass60_1229 = null;
		aClass60_1226 = null;
		aClass60_1227 = null;
		aClass60_1224 = null;
		aClass25_Sub1Array2 = null;
		aClass60_1228 = null;
	}

	@OriginalMember(owner = "client!la", name = "g", descriptor = "(I)V")
	public static void method1931() {
		Static18.anIntArray79 = null;
		Static125.aByteArrayArrayArray7 = null;
		Static36.aByteArrayArrayArray2 = null;
		Static27.anIntArrayArrayArray1 = null;
		Static39.anIntArrayArray37 = null;
		Static32.anIntArray134 = null;
		Static101.aByteArrayArrayArray6 = null;
		Static55.aByteArrayArrayArray3 = null;
		Static14.anIntArray57 = null;
		anIntArray307 = null;
		Static11.aByteArrayArrayArray1 = null;
		Static26.anIntArray124 = null;
	}

	@OriginalMember(owner = "client!la", name = "g", descriptor = "(II)Lclient!hc;")
	public static Class3_Sub1_Sub8 method1939(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub8 local10 = (Class3_Sub1_Sub8) Static85.aClass17_44.method643((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static54.aClass25_12.method931(arg0, 5);
		local10 = new Class3_Sub1_Sub8();
		if (local20 != null) {
			local10.method968(new Class3_Sub12(local20));
		}
		Static85.aClass17_44.method644((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!cf;BI)V")
	public static void method1968(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub1_Sub3_Sub1 arg1, @OriginalArg(3) int arg2) {
		if ((arg2 & 0x80) != 0) {
			arg1.anInt1542 = Static79.aClass3_Sub12_Sub1_1.method1955();
			arg1.anInt1514 = Static79.aClass3_Sub12_Sub1_1.method1955();
		}
		@Pc(30) int local30;
		@Pc(34) int local34;
		if ((arg2 & 0x200) != 0) {
			local30 = Static79.aClass3_Sub12_Sub1_1.method1925();
			local34 = Static79.aClass3_Sub12_Sub1_1.method1925();
			arg1.method1018(local34, Static34.anInt1183, local30);
			arg1.anInt1519 = Static34.anInt1183 + 300;
			arg1.anInt1513 = Static79.aClass3_Sub12_Sub1_1.method1917();
			arg1.anInt1483 = Static79.aClass3_Sub12_Sub1_1.method1917();
		}
		if ((arg2 & 0x1) != 0) {
			arg1.aClass60_656 = Static79.aClass3_Sub12_Sub1_1.method1943();
			if (arg1.aClass60_656.method1832(0) == 126) {
				arg1.aClass60_656 = arg1.aClass60_656.method1829(1);
				Static76.method1565(2, arg1.aClass60_656, arg1.aClass60_245);
			} else if (Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1 == arg1) {
				Static76.method1565(2, arg1.aClass60_656, arg1.aClass60_245);
			}
			arg1.anInt1534 = 0;
			arg1.anInt1527 = 150;
			arg1.anInt1499 = 0;
		}
		if ((arg2 & 0x4) != 0) {
			local30 = Static79.aClass3_Sub12_Sub1_1.method1955();
			local34 = Static79.aClass3_Sub12_Sub1_1.method1917();
			@Pc(126) int local126 = Static79.aClass3_Sub12_Sub1_1.method1936();
			@Pc(129) int local129 = Static79.aClass3_Sub12_Sub1_1.anInt2886;
			if (arg1.aClass60_245 != null && arg1.aClass50_1 != null) {
				@Pc(140) long local140 = arg1.aClass60_245.method1863();
				@Pc(142) boolean local142 = false;
				if (local34 <= 1) {
					for (@Pc(147) int local147 = 0; local147 < Static107.anInt3035; local147++) {
						if (Static113.aLongArray5[local147] == local140) {
							local142 = true;
							break;
						}
					}
				}
				if (!local142 && Static127.anInt2664 == 0) {
					Static46.aClass3_Sub12_2.anInt2886 = 0;
					Static79.aClass3_Sub12_Sub1_1.method1946(local126, Static46.aClass3_Sub12_2.aByteArray77);
					Static46.aClass3_Sub12_2.anInt2886 = 0;
					@Pc(187) Class60 local187 = Static37.method834(Static16.method484(Static46.aClass3_Sub12_2).method1862());
					arg1.aClass60_656 = local187.method1827();
					arg1.anInt1534 = local30 >> 8;
					arg1.anInt1499 = local30 & 0xFF;
					arg1.anInt1527 = 150;
					if (local34 == 2 || local34 == 3) {
						Static76.method1565(1, local187, Static60.method1211(new Class60[] { Static103.aClass60_1258, arg1.aClass60_245 }));
					} else if (local34 == 1) {
						Static76.method1565(1, local187, Static60.method1211(new Class60[] { Static43.aClass60_624, arg1.aClass60_245 }));
					} else {
						Static76.method1565(2, local187, arg1.aClass60_245);
					}
				}
			}
			Static79.aClass3_Sub12_Sub1_1.anInt2886 = local129 + local126;
		}
		if ((arg2 & 0x20) != 0) {
			local30 = Static79.aClass3_Sub12_Sub1_1.method1917();
			local34 = Static79.aClass3_Sub12_Sub1_1.method1917();
			arg1.method1018(local34, Static34.anInt1183, local30);
			arg1.anInt1519 = Static34.anInt1183 + 300;
			arg1.anInt1513 = Static79.aClass3_Sub12_Sub1_1.method1962();
			arg1.anInt1483 = Static79.aClass3_Sub12_Sub1_1.method1936();
		}
		if ((arg2 & 0x10) != 0) {
			arg1.anInt1523 = Static79.aClass3_Sub12_Sub1_1.method1953();
			if (arg1.anInt1523 == 65535) {
				arg1.anInt1523 = -1;
			}
		}
		if ((arg2 & 0x40) != 0) {
			local30 = Static79.aClass3_Sub12_Sub1_1.method1963();
			if (local30 == 65535) {
				local30 = -1;
			}
			local34 = Static79.aClass3_Sub12_Sub1_1.method1962();
			Static55.method1143(arg1, local34, local30);
		}
		if ((arg2 & 0x100) != 0) {
			arg1.anInt1536 = Static79.aClass3_Sub12_Sub1_1.method1940();
			local30 = Static79.aClass3_Sub12_Sub1_1.method1933();
			arg1.anInt1510 = local30 >> 16;
			arg1.anInt1504 = Static34.anInt1183 + (local30 & 0xFFFF);
			arg1.anInt1495 = 0;
			if (arg1.anInt1536 == 65535) {
				arg1.anInt1536 = -1;
			}
			arg1.anInt1507 = 0;
			if (arg1.anInt1504 > Static34.anInt1183) {
				arg1.anInt1495 = -1;
			}
		}
		if ((arg2 & 0x8) != 0) {
			local30 = Static79.aClass3_Sub12_Sub1_1.method1936();
			@Pc(415) byte[] local415 = new byte[local30];
			@Pc(420) Class3_Sub12 local420 = new Class3_Sub12(local415);
			Static79.aClass3_Sub12_Sub1_1.method1946(local30, local415);
			Static2.aClass3_Sub12Array1[arg0] = local420;
			arg1.method431(local420);
		}
		if ((arg2 & 0x400) == 0) {
			return;
		}
		arg1.anInt1528 = Static79.aClass3_Sub12_Sub1_1.method1917();
		arg1.anInt1526 = Static79.aClass3_Sub12_Sub1_1.method1925();
		arg1.anInt1515 = Static79.aClass3_Sub12_Sub1_1.method1917();
		arg1.anInt1529 = Static79.aClass3_Sub12_Sub1_1.method1962();
		arg1.anInt1535 = Static79.aClass3_Sub12_Sub1_1.method1953() + Static34.anInt1183;
		arg1.anInt1506 = Static79.aClass3_Sub12_Sub1_1.method1953() + Static34.anInt1183;
		arg1.anInt1541 = Static79.aClass3_Sub12_Sub1_1.method1962();
		arg1.anInt1491 = 0;
		arg1.anInt1497 = 1;
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(Z)V")
	public static void method1971() {
		Static36.aByteArrayArrayArray2 = new byte[4][104][104];
		Static14.anIntArray57 = new int[104];
		Static125.aByteArrayArrayArray7 = new byte[4][104][104];
		Static27.anIntArrayArrayArray1 = new int[4][105][105];
		Static39.anIntArrayArray37 = new int[105][105];
		Static101.aByteArrayArrayArray6 = new byte[4][104][104];
		Static11.aByteArrayArrayArray1 = new byte[4][105][105];
		Static55.aByteArrayArrayArray3 = new byte[4][104][104];
		Static15.anInt636 = 99;
		Static26.anIntArray124 = new int[104];
		Static18.anIntArray79 = new int[104];
		Static32.anIntArray134 = new int[104];
		anIntArray307 = new int[104];
	}
}

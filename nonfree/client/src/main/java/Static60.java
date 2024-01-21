import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!kd", name = "o", descriptor = "Lclient!g;")
	public static Class28 aClass28_5;

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
	public static int anInt1350;

	@OriginalMember(owner = "client!kd", name = "F", descriptor = "I")
	public static int anInt1351;

	@OriginalMember(owner = "client!kd", name = "q", descriptor = "Lclient!rd;")
	private static Class64 aClass64_860 = Static69.method1153("Sorry invited players only)3");

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "Lclient!rd;")
	public static Class64 aClass64_854 = aClass64_860;

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "Lclient!rd;")
	private static Class64 aClass64_855 = Static69.method1153("Loaded wordpack");

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "Lclient!rd;")
	public static Class64 aClass64_856 = Static69.method1153("Privater Chat");

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "[I")
	public static int[] anIntArray207 = new int[500];

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "Lclient!rd;")
	public static Class64 aClass64_857 = Static69.method1153("Die Verbindung konnte");

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "Lclient!rd;")
	public static Class64 aClass64_858 = Static69.method1153("mapback");

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "[I")
	public static int[] anIntArray208 = new int[] { 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800 };

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "Lclient!md;")
	public static Class50 aClass50_8 = new Class50();

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "Lclient!rd;")
	public static Class64 aClass64_859 = Static69.method1153("null");

	@OriginalMember(owner = "client!kd", name = "r", descriptor = "Lclient!rd;")
	public static Class64 aClass64_861 = aClass64_855;

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
	public static int anInt1349 = -1;

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "[I")
	public static int[] anIntArray209 = new int[128];

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "Lclient!rd;")
	public static Class64 aClass64_862 = Static69.method1153("");

	@OriginalMember(owner = "client!kd", name = "x", descriptor = "Lclient!rd;")
	public static Class64 aClass64_863 = aClass64_862;

	@OriginalMember(owner = "client!kd", name = "y", descriptor = "Lclient!rd;")
	public static Class64 aClass64_864 = aClass64_862;

	@OriginalMember(owner = "client!kd", name = "z", descriptor = "Lclient!rd;")
	public static Class64 aClass64_865 = aClass64_862;

	@OriginalMember(owner = "client!kd", name = "A", descriptor = "Lclient!rd;")
	public static Class64 aClass64_866 = aClass64_862;

	@OriginalMember(owner = "client!kd", name = "B", descriptor = "[I")
	public static int[] anIntArray210 = new int[50];

	@OriginalMember(owner = "client!kd", name = "C", descriptor = "Lclient!rd;")
	public static Class64 aClass64_867 = aClass64_862;

	@OriginalMember(owner = "client!kd", name = "D", descriptor = "Lclient!rd;")
	public static Class64 aClass64_868 = aClass64_862;

	@OriginalMember(owner = "client!kd", name = "E", descriptor = "Lclient!rd;")
	public static Class64 aClass64_869 = aClass64_862;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	public static void method1016() {
		Static109.method1876(false);
		Static18.anInt585 = 0;
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < Static11.aByteArrayArray1.length; local16++) {
			if (Static61.anIntArray222[local16] != -1 && Static11.aByteArrayArray1[local16] == null) {
				Static11.aByteArrayArray1[local16] = Static81.aClass41_Sub1_11.method1062(Static61.anIntArray222[local16], 0);
				if (Static11.aByteArrayArray1[local16] == null) {
					Static18.anInt585++;
					local14 = false;
				}
			}
			if (Static27.anIntArray137[local16] != -1 && Static31.aByteArrayArray2[local16] == null) {
				Static31.aByteArrayArray2[local16] = Static81.aClass41_Sub1_11.method1063(Static27.anIntArray137[local16], 0, Static23.anIntArrayArray5[local16]);
				if (Static31.aByteArrayArray2[local16] == null) {
					local14 = false;
					Static18.anInt585++;
				}
			}
		}
		if (!local14) {
			Static117.anInt2814 = 1;
			return;
		}
		Static43.anInt961 = 0;
		local14 = true;
		@Pc(115) int local115;
		@Pc(126) int local126;
		for (@Pc(96) int local96 = 0; local96 < Static11.aByteArrayArray1.length; local96++) {
			@Pc(102) byte[] local102 = Static31.aByteArrayArray2[local96];
			if (local102 != null) {
				local115 = (Static62.anIntArray226[local96] >> 8) * 64 - anInt1350;
				local126 = (Static62.anIntArray226[local96] & 0xFF) * 64 - Static53.anInt1236;
				if (Static121.aBoolean170) {
					local115 = 10;
					local126 = 10;
				}
				local14 &= Static26.method515(local115, local102, local126);
			}
		}
		if (!local14) {
			Static117.anInt2814 = 2;
			return;
		}
		if (Static117.anInt2814 != 0) {
			Static74.method1233(Static16.aClass64_328, true, Static95.aClass64_1384);
		}
		Static106.method1743();
		Static82.aClass68_1.method1768();
		System.gc();
		for (@Pc(179) int local179 = 0; local179 < 4; local179++) {
			Static74.aClass52Array1[local179].method1199();
		}
		@Pc(202) int local202;
		for (local115 = 0; local115 < 4; local115++) {
			for (local126 = 0; local126 < 104; local126++) {
				for (local202 = 0; local202 < 104; local202++) {
					Static18.aByteArrayArrayArray2[local115][local126][local202] = 0;
				}
			}
		}
		Static104.method1696();
		local126 = Static11.aByteArrayArray1.length;
		Static90.method340();
		Static109.method1876(true);
		@Pc(257) int local257;
		@Pc(268) int local268;
		@Pc(376) int local376;
		@Pc(320) int local320;
		@Pc(365) int local365;
		if (!Static121.aBoolean170) {
			@Pc(272) byte[] local272;
			for (local202 = 0; local202 < local126; local202++) {
				local257 = (Static62.anIntArray226[local202] >> 8) * 64 - anInt1350;
				local268 = (Static62.anIntArray226[local202] & 0xFF) * 64 - Static53.anInt1236;
				local272 = Static11.aByteArrayArray1[local202];
				if (local272 != null) {
					Static102.method1654(local272, local257, local268, Static74.aClass52Array1, Static53.anInt1237 * 8 - 48, Static108.anInt2553 * 8 + -48);
				}
			}
			for (local257 = 0; local257 < local126; local257++) {
				local268 = (Static62.anIntArray226[local257] >> 8) * 64 - anInt1350;
				local320 = (Static62.anIntArray226[local257] & 0xFF) * 64 - Static53.anInt1236;
				@Pc(324) byte[] local324 = Static11.aByteArrayArray1[local257];
				if (local324 == null && Static53.anInt1237 < 800) {
					Static67.method1133(local268, 64, 64, local320);
				}
			}
			Static109.method1876(true);
			for (local268 = 0; local268 < local126; local268++) {
				local272 = Static31.aByteArrayArray2[local268];
				if (local272 != null) {
					local365 = (Static62.anIntArray226[local268] >> 8) * 64 - anInt1350;
					local376 = (Static62.anIntArray226[local268] & 0xFF) * 64 - Static53.anInt1236;
					Static7.method214(Static82.aClass68_1, Static74.aClass52Array1, local365, local272, local376);
				}
			}
		}
		@Pc(421) int local421;
		@Pc(427) int local427;
		if (Static121.aBoolean170) {
			@Pc(433) int local433;
			@Pc(449) int local449;
			@Pc(451) int local451;
			for (local202 = 0; local202 < 4; local202++) {
				for (local257 = 0; local257 < 13; local257++) {
					for (local268 = 0; local268 < 13; local268++) {
						local365 = Static2.anIntArrayArrayArray1[local202][local257][local268];
						@Pc(411) boolean local411 = false;
						if (local365 != -1) {
							local421 = local365 >> 1 & 0x3;
							local427 = local365 >> 14 & 0x3FF;
							local433 = local365 >> 3 & 0x7FF;
							local376 = local365 >> 24 & 0x3;
							local449 = (local427 / 8 << 8) + local433 / 8;
							for (local451 = 0; local451 < Static62.anIntArray226.length; local451++) {
								if (local449 == Static62.anIntArray226[local451] && Static11.aByteArrayArray1[local451] != null) {
									local411 = true;
									Static114.method1997(local376, local257 * 8, Static74.aClass52Array1, (local427 & 0x7) * 8, (local433 & 0x7) * 8, local421, local268 * 8, local202, Static11.aByteArrayArray1[local451]);
									break;
								}
							}
						}
						if (!local411) {
							Static28.method1691(local268 * 8, local202, local257 * 8);
						}
					}
				}
			}
			for (local257 = 0; local257 < 13; local257++) {
				for (local268 = 0; local268 < 13; local268++) {
					local320 = Static2.anIntArrayArrayArray1[0][local257][local268];
					if (local320 == -1) {
						Static67.method1133(local257 * 8, 8, 8, local268 * 8);
					}
				}
			}
			Static109.method1876(true);
			for (local268 = 0; local268 < 4; local268++) {
				for (local320 = 0; local320 < 13; local320++) {
					for (local365 = 0; local365 < 13; local365++) {
						local376 = Static2.anIntArrayArrayArray1[local268][local320][local365];
						if (local376 != -1) {
							local421 = local376 >> 24 & 0x3;
							local427 = local376 >> 1 & 0x3;
							local433 = local376 >> 14 & 0x3FF;
							local449 = local376 >> 3 & 0x7FF;
							local451 = local449 / 8 + (local433 / 8 << 8);
							for (@Pc(628) int local628 = 0; local628 < Static62.anIntArray226.length; local628++) {
								if (local451 == Static62.anIntArray226[local628] && Static31.aByteArrayArray2[local628] != null) {
									Static21.method411(local427, local268, Static74.aClass52Array1, (local433 & 0x7) * 8, local365 * 8, Static82.aClass68_1, Static31.aByteArrayArray2[local628], local320 * 8, local421, (local449 & 0x7) * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static109.method1876(true);
		Static106.method1743();
		Static80.method1367(Static82.aClass68_1, Static74.aClass52Array1);
		Static109.method1876(true);
		local202 = Static17.anInt569;
		if (Static15.anInt463 < local202) {
			local202 = Static15.anInt463;
		}
		if (local202 < Static15.anInt463 - 1) {
		}
		if (Static52.aBoolean169) {
			Static82.aClass68_1.method1783(Static17.anInt569);
		} else {
			Static82.aClass68_1.method1783(0);
		}
		for (local257 = 0; local257 < 104; local257++) {
			for (local268 = 0; local268 < 104; local268++) {
				Static26.method517(local257, local268);
			}
		}
		Static116.method2040();
		Static26.aClass19_27.method416();
		if (Static26.aFrame1 != null) {
			Static49.aClass1_Sub6_Sub1_1.method1877(67);
			Static49.aClass1_Sub6_Sub1_1.method1851(1057001181);
		}
		if (!Static121.aBoolean170) {
			local320 = (Static108.anInt2553 + 6) / 8;
			local268 = (Static108.anInt2553 - 6) / 8;
			local376 = (Static53.anInt1237 + 6) / 8;
			local365 = (Static53.anInt1237 - 6) / 8;
			for (local421 = local268 - 1; local421 <= local320 + 1; local421++) {
				for (local427 = local365 - 1; local427 <= local376 + 1; local427++) {
					if (local268 > local421 || local421 > local320 || local427 < local365 || local427 > local376) {
						Static81.aClass41_Sub1_11.method1064(Static82.method1383(new Class64[] { Static17.aClass64_346, Static12.method1395(local421), Static51.aClass64_766, Static12.method1395(local427) }));
						Static81.aClass41_Sub1_11.method1064(Static82.method1383(new Class64[] { Static91.aClass64_1294, Static12.method1395(local421), Static51.aClass64_766, Static12.method1395(local427) }));
					}
				}
			}
		}
		if (Static27.anInt889 == -1) {
			Static10.method258(30);
		} else {
			Static10.method258(35);
		}
		Static110.method1892();
		Static49.aClass1_Sub6_Sub1_1.method1877(100);
		Static58.method969();
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)Z")
	public static boolean method1017() {
		@Pc(5) Class69 local5 = Static74.aClass69_1;
		synchronized (Static74.aClass69_1) {
			if (Static95.anInt2167 == Static74.anInt1753) {
				return false;
			} else {
				Static5.anInt122 = Static94.anIntArray311[Static95.anInt2167];
				Static21.anInt654 = Static89.anIntArray301[Static95.anInt2167];
				Static95.anInt2167 = Static95.anInt2167 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)[Lclient!oa;")
	public static Class1_Sub1_Sub5_Sub3[] method1018() {
		@Pc(8) Class1_Sub1_Sub5_Sub3[] local8 = new Class1_Sub1_Sub5_Sub3[Static98.anInt2198];
		for (@Pc(10) int local10 = 0; local10 < Static98.anInt2198; local10++) {
			@Pc(20) Class1_Sub1_Sub5_Sub3 local20 = local8[local10] = new Class1_Sub1_Sub5_Sub3();
			local20.anInt1795 = Static65.anInt1495;
			local20.anInt1798 = Static1.anInt47;
			local20.anInt1796 = Static23.anIntArray95[local10];
			local20.anInt1797 = Static98.anIntArray327[local10];
			local20.anInt1799 = Static91.anIntArray303[local10];
			local20.anInt1800 = Static116.anIntArray441[local10];
			local20.anIntArray259 = Static25.anIntArray437;
			local20.aByteArray22 = Static116.aByteArrayArray8[local10];
		}
		Static27.method675();
		return local8;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
	public static void method1019() {
		aClass64_866 = null;
		aClass64_860 = null;
		aClass64_859 = null;
		anIntArray207 = null;
		aClass64_864 = null;
		aClass64_865 = null;
		aClass28_5 = null;
		aClass64_856 = null;
		aClass50_8 = null;
		anIntArray208 = null;
		aClass64_858 = null;
		anIntArray209 = null;
		aClass64_867 = null;
		aClass64_862 = null;
		aClass64_855 = null;
		aClass64_861 = null;
		aClass64_857 = null;
		aClass64_869 = null;
		anIntArray210 = null;
		aClass64_863 = null;
		aClass64_854 = null;
		aClass64_868 = null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)V")
	public static void method1020(@OriginalArg(1) int arg0) {
		Static20.method406();
		@Pc(8) int local8 = Static117.method2063(arg0).anInt1615;
		if (local8 == 0) {
			return;
		}
		@Pc(19) int local19 = Static101.anIntArray333[arg0];
		if (local8 == 1) {
			if (local19 == 1) {
				Static112.method1979(0.9D);
				((Class71) Static112.anInterface2_1).method2097(0.9D);
			}
			if (local19 == 2) {
				Static112.method1979(0.8D);
				((Class71) Static112.anInterface2_1).method2097(0.8D);
			}
			if (local19 == 3) {
				Static112.method1979(0.7D);
				((Class71) Static112.anInterface2_1).method2097(0.7D);
			}
			if (local19 == 4) {
				Static112.method1979(0.6D);
				((Class71) Static112.anInterface2_1).method2097(0.6D);
			}
			Static49.method889();
			Static27.aBoolean59 = true;
		}
		if (local8 == 3) {
			@Pc(80) short local80 = 0;
			if (local19 == 0) {
				local80 = 255;
			}
			if (local19 == 1) {
				local80 = 192;
			}
			if (local19 == 2) {
				local80 = 128;
			}
			if (local19 == 3) {
				local80 = 64;
			}
			if (local19 == 4) {
				local80 = 0;
			}
			if (local80 != Static31.anInt803) {
				if (Static31.anInt803 == 0 && Static6.anInt317 != -1) {
					Static65.method1103(Static6.anInt317, Static114.aClass41_Sub1_21, 0, local80);
					Static68.anInt1536 = 0;
				} else if (local80 == 0) {
					Static65.method1106();
					Static68.anInt1536 = 0;
				} else {
					Static113.method1304(local80);
				}
				Static31.anInt803 = local80;
			}
		}
		if (local8 == 9) {
			Static108.anInt2549 = local19;
		}
		if (local8 == 6) {
			Static81.anInt1408 = local19;
		}
		if (local8 == 5) {
			Static3.anInt116 = local19;
		}
		if (local8 == 8) {
			Static116.aBoolean166 = true;
			Static21.anInt649 = local19;
		}
		if (local8 == 4) {
			if (local19 == 0) {
				Static46.anInt1086 = 127;
			}
			if (local19 == 1) {
				Static46.anInt1086 = 96;
			}
			if (local19 == 2) {
				Static46.anInt1086 = 64;
			}
			if (local19 == 3) {
				Static46.anInt1086 = 32;
			}
			if (local19 == 4) {
				Static46.anInt1086 = 0;
			}
		}
		if (local8 != 10) {
			return;
		}
		if (local19 == 0) {
			Static69.anInt1549 = 127;
		}
		if (local19 == 1) {
			Static69.anInt1549 = 96;
		}
		if (local19 == 2) {
			Static69.anInt1549 = 64;
		}
		if (local19 == 3) {
			Static69.anInt1549 = 32;
		}
		if (local19 == 4) {
			Static69.anInt1549 = 0;
			return;
		}
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)I")
	public static int method1021() {
		return 19;
	}
}

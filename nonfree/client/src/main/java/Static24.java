import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!ea", name = "A", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_9;

	@OriginalMember(owner = "client!ea", name = "F", descriptor = "I")
	public static int anInt713;

	@OriginalMember(owner = "client!ea", name = "Q", descriptor = "Lclient!ec;")
	public static Class2_Sub1_Sub4_Sub2 aClass2_Sub1_Sub4_Sub2_4;

	@OriginalMember(owner = "client!ea", name = "V", descriptor = "[I")
	public static int[] anIntArray98;

	@OriginalMember(owner = "client!ea", name = "Z", descriptor = "I")
	public static int anInt721;

	@OriginalMember(owner = "client!ea", name = "eb", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_10;

	@OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
	public static int anInt711 = 0;

	@OriginalMember(owner = "client!ea", name = "z", descriptor = "Lclient!wb;")
	private static Class65 aClass65_334 = method441("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!ea", name = "C", descriptor = "Z")
	public static boolean aBoolean49 = false;

	@OriginalMember(owner = "client!ea", name = "D", descriptor = "Lclient!wb;")
	public static Class65 aClass65_335 = method441(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!ea", name = "L", descriptor = "Lclient!wb;")
	public static Class65 aClass65_336 = method441("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!ea", name = "M", descriptor = "I")
	public static int anInt717 = 0;

	@OriginalMember(owner = "client!ea", name = "T", descriptor = "Lclient!wb;")
	private static Class65 aClass65_340 = method441("Unable to connect)3");

	@OriginalMember(owner = "client!ea", name = "N", descriptor = "Lclient!wb;")
	public static Class65 aClass65_337 = aClass65_340;

	@OriginalMember(owner = "client!ea", name = "O", descriptor = "Lclient!wb;")
	public static Class65 aClass65_338 = method441("Lade Spiel)2Fenster )2 ");

	@OriginalMember(owner = "client!ea", name = "P", descriptor = "[I")
	public static int[] anIntArray97 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!ea", name = "S", descriptor = "Lclient!wb;")
	public static Class65 aClass65_339 = aClass65_334;

	@OriginalMember(owner = "client!ea", name = "U", descriptor = "I")
	public static int anInt719 = 0;

	@OriginalMember(owner = "client!ea", name = "W", descriptor = "Lclient!wb;")
	public static Class65 aClass65_341 = aClass65_340;

	@OriginalMember(owner = "client!ea", name = "X", descriptor = "I")
	public static int anInt720 = 0;

	@OriginalMember(owner = "client!ea", name = "Y", descriptor = "Lclient!wb;")
	public static Class65 aClass65_342 = aClass65_334;

	@OriginalMember(owner = "client!ea", name = "ab", descriptor = "Lclient!wb;")
	public static Class65 aClass65_343 = method441("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!ea", name = "cb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_344 = aClass65_334;

	@OriginalMember(owner = "client!ea", name = "db", descriptor = "[Lclient!fb;")
	public static Class2_Sub1_Sub1_Sub2_Sub1[] aClass2_Sub1_Sub1_Sub2_Sub1Array1 = new Class2_Sub1_Sub1_Sub2_Sub1[32768];

	@OriginalMember(owner = "client!ea", name = "fb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_345 = method441("headicons_pk");

	@OriginalMember(owner = "client!ea", name = "gb", descriptor = "I")
	public static int anInt723 = 0;

	@OriginalMember(owner = "client!ea", name = "hb", descriptor = "[I")
	public static int[] anIntArray99 = new int[2048];

	@OriginalMember(owner = "client!ea", name = "ib", descriptor = "Lclient!wb;")
	public static Class65 aClass65_346 = method441("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IBI)I")
	public static int method440(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(28) int local28 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local28;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!wb;")
	public static Class65 method441(@OriginalArg(0) String arg0) {
		@Pc(2) byte[] local2 = arg0.getBytes();
		@Pc(14) int local14 = local2.length;
		@Pc(18) Class65 local18 = new Class65();
		local18.aByteArray70 = new byte[local14];
		@Pc(24) int local24 = 0;
		while (local14 > local24) {
			@Pc(32) int local32 = local2[local24++] & 0xFF;
			if (local32 <= 45 && local32 >= 40) {
				if (local24 >= local14) {
					break;
				}
				@Pc(54) int local54 = local2[local24++] & 0xFF;
				local18.aByteArray70[local18.anInt2878++] = (byte) (local54 + (local32 + -40) * 43 - 48);
			} else if (local32 != 0) {
				local18.aByteArray70[local18.anInt2878++] = (byte) local32;
			}
		}
		local18.method1774();
		return local18.method1761();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BJ)Lclient!wb;")
	public static Class65 method442(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(36) int local36 = 0;
			for (@Pc(38) long local38 = arg0; local38 != 0L; local38 /= 37L) {
				local36++;
			}
			@Pc(52) byte[] local52 = new byte[local36];
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				local36--;
				local52[local36] = Static59.aByteArray48[(int) (local56 - arg0 * 37L)];
			}
			@Pc(83) Class65 local83 = new Class65();
			local83.aByteArray70 = local52;
			local83.anInt2878 = local52.length;
			return local83;
		}
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)V")
	public static void method443() {
		aClass65_345 = null;
		aClass65_343 = null;
		anIntArray98 = null;
		anIntArray97 = null;
		aClass65_342 = null;
		anIntArray99 = null;
		aClass65_334 = null;
		aClass65_335 = null;
		aClass65_336 = null;
		aClass65_341 = null;
		aClass65_346 = null;
		aClass2_Sub1_Sub4_Sub2_4 = null;
		aClass65_337 = null;
		aClass65_344 = null;
		aClass2_Sub1_Sub4_Sub3_10 = null;
		aClass2_Sub1_Sub4_Sub3_9 = null;
		aClass2_Sub1_Sub1_Sub2_Sub1Array1 = null;
		aClass65_339 = null;
		aClass65_338 = null;
		aClass65_340 = null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!ec;II)V")
	public static void method444(@OriginalArg(1) Class2_Sub1_Sub4_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null) {
			return;
		}
		@Pc(12) int local12 = Static71.anInt2176 + Static3.anInt160 & 0x7FF;
		@Pc(21) int local21 = arg1 * arg1 + arg2 * arg2;
		if (local21 > 6400) {
			return;
		}
		@Pc(34) int local34 = Static86.anIntArray354[local12];
		@Pc(42) int local42 = local34 * 256 / (Static98.anInt2758 + 256);
		@Pc(46) int local46 = Static86.anIntArray363[local12];
		@Pc(54) int local54 = local46 * 256 / (Static98.anInt2758 + 256);
		@Pc(64) int local64 = local54 * arg1 + local42 * arg2 >> 16;
		@Pc(75) int local75 = arg2 * local54 - local42 * arg1 >> 16;
		if (local21 <= 2500) {
			arg0.method486(local64 + 94 + 4 - arg0.anInt760 / 2, -(arg0.anInt763 / 2) + -4 + -local75 + 83);
		} else {
			arg0.method485(Static65.aClass2_Sub1_Sub4_Sub3_16, local64 + 94 + 4 - arg0.anInt760 / 2, -(arg0.anInt763 / 2) + 83 + -local75 + -4);
		}
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
	public static void method445() {
		if (Static68.aClass31_1 == null) {
			return;
		}
		@Pc(9) long local9 = Static76.method1306();
		if (local9 <= Static102.aLong80) {
			return;
		}
		Static68.aClass31_1.method1178(local9);
		@Pc(22) int local22 = (int) (local9 - Static102.aLong80);
		Static102.aLong80 = local9;
		@Pc(36) Class local36 = sc.class;
		synchronized (sc.class) {
			Static93.anInt2623 += local22 * Static42.anInt1353;
			@Pc(52) int local52 = (Static93.anInt2623 - Static42.anInt1353 * 2000) / 1000;
			if (local52 > 0) {
				if (Static60.aClass2_Sub10_1 != null) {
					Static60.aClass2_Sub10_1.method1669(local52);
				}
				Static93.anInt2623 -= local52 * 1000;
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(B)V")
	public static void method446() {
		Static3.method84();
		@Pc(18) int local18;
		@Pc(20) int local20;
		if (anInt717 == 2) {
			@Pc(13) byte[] local13 = Static65.aClass2_Sub1_Sub4_Sub3_16.aByteArray62;
			@Pc(15) int[] local15 = Static43.anIntArray417;
			local18 = local13.length;
			for (local20 = 0; local20 < local18; local20++) {
				if (local13[local20] == 0) {
					local15[local20] = 0;
				}
			}
			aClass2_Sub1_Sub4_Sub2_4.method484(0, 0, 33, 33, 25, 25, Static3.anInt160, 256, Static96.anIntArray397, Static53.anIntArray262);
			Static27.method497();
			return;
		}
		@Pc(60) int local60 = Static3.anInt160 + Static71.anInt2176 & 0x7FF;
		@Pc(71) int local71 = Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1518 / 32 + 48;
		local18 = 464 - Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1562 / 32;
		Static90.aClass2_Sub1_Sub4_Sub2_6.method484(25, 5, 146, 151, local71, local18, local60, Static98.anInt2758 + 256, Static32.anIntArray148, Static42.anIntArray176);
		for (local20 = 0; local20 < Static9.anInt314; local20++) {
			local71 = Static76.anIntArray300[local20] * 4 + 2 - Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1518 / 32;
			local18 = Static102.anIntArray408[local20] * 4 + 2 - Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1562 / 32;
			method444(Static16.aClass2_Sub1_Sub4_Sub2Array5[local20], local71, local18);
		}
		@Pc(144) int local144;
		for (@Pc(140) int local140 = 0; local140 < 104; local140++) {
			for (local144 = 0; local144 < 104; local144++) {
				@Pc(154) Class52 local154 = Static22.aClass52ArrayArrayArray1[Static62.anInt1879][local140][local144];
				if (local154 != null) {
					local18 = local144 * 4 + 2 - Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1562 / 32;
					local71 = local140 * 4 + 2 - Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1518 / 32;
					method444(Static3.aClass2_Sub1_Sub4_Sub2Array2[0], local71, local18);
				}
			}
		}
		for (local144 = 0; local144 < Static51.anInt1482; local144++) {
			@Pc(209) Class2_Sub1_Sub1_Sub2_Sub1 local209 = aClass2_Sub1_Sub1_Sub2_Sub1Array1[Static23.anIntArray92[local144]];
			if (local209 != null && local209.method925()) {
				@Pc(218) Class2_Sub1_Sub11 local218 = local209.aClass2_Sub1_Sub11_1;
				if (local218.anIntArray285 != null) {
					local218 = local218.method1262();
				}
				if (local218 != null && local218.aBoolean109 && local218.aBoolean111) {
					local71 = local209.anInt1518 / 32 - Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1518 / 32;
					local18 = local209.anInt1562 / 32 - Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1562 / 32;
					method444(Static3.aClass2_Sub1_Sub4_Sub2Array2[1], local71, local18);
				}
			}
		}
		@Pc(281) Class2_Sub1_Sub1_Sub2_Sub2 local281;
		for (@Pc(273) int local273 = 0; local273 < Static54.anInt1640; local273++) {
			local281 = Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[anIntArray99[local273]];
			if (local281 != null && local281.method925()) {
				local18 = local281.anInt1562 / 32 - Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1562 / 32;
				local71 = local281.anInt1518 / 32 - Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1518 / 32;
				@Pc(310) boolean local310 = false;
				@Pc(315) long local315 = local281.aClass65_726.method1790();
				for (@Pc(317) int local317 = 0; local317 < Static32.anInt1047; local317++) {
					if (local315 == Static4.aLongArray2[local317] && Static12.anIntArray71[local317] != 0) {
						local310 = true;
						break;
					}
				}
				@Pc(342) boolean local342 = false;
				if (Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1593 != 0 && local281.anInt1593 != 0 && Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1593 == local281.anInt1593) {
					local342 = true;
				}
				if (local310) {
					method444(Static3.aClass2_Sub1_Sub4_Sub2Array2[3], local71, local18);
				} else if (local342) {
					method444(Static3.aClass2_Sub1_Sub4_Sub2Array2[4], local71, local18);
				} else {
					method444(Static3.aClass2_Sub1_Sub4_Sub2Array2[2], local71, local18);
				}
			}
		}
		if (Static108.anInt2865 != 0 && Static108.anInt2902 % 20 < 10) {
			if (Static108.anInt2865 == 1 && Static99.anInt2539 >= 0 && Static99.anInt2539 < aClass2_Sub1_Sub1_Sub2_Sub1Array1.length) {
				@Pc(425) Class2_Sub1_Sub1_Sub2_Sub1 local425 = aClass2_Sub1_Sub1_Sub2_Sub1Array1[Static99.anInt2539];
				if (local425 != null) {
					local18 = local425.anInt1562 / 32 - Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1562 / 32;
					local71 = local425.anInt1518 / 32 - Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1518 / 32;
					Static82.method1422(local71, Static2.aClass2_Sub1_Sub4_Sub2Array1[1], local18);
				}
			}
			if (Static108.anInt2865 == 2) {
				local71 = (Static55.anInt1678 - Static107.anInt2849) * 4 + 2 - Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1518 / 32;
				local18 = (Static77.anInt2245 + -Static37.anInt1220) * 4 + 2 - Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1562 / 32;
				Static82.method1422(local71, Static2.aClass2_Sub1_Sub4_Sub2Array1[1], local18);
			}
			if (Static108.anInt2865 == 10 && Static25.anInt729 >= 0 && Static25.anInt729 < Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1.length) {
				local281 = Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[Static25.anInt729];
				if (local281 != null) {
					local18 = local281.anInt1562 / 32 - Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1562 / 32;
					local71 = local281.anInt1518 / 32 - Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1518 / 32;
					Static82.method1422(local71, Static2.aClass2_Sub1_Sub4_Sub2Array1[1], local18);
				}
			}
		}
		if (Static99.anInt2533 != 0) {
			local71 = Static99.anInt2533 * 4 + 2 - Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1518 / 32;
			local18 = Static54.anInt1641 * 4 + 2 - Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1562 / 32;
			method444(Static2.aClass2_Sub1_Sub4_Sub2Array1[0], local71, local18);
		}
		Static43.method1815(97, 78, 3, 3, 16777215);
		aClass2_Sub1_Sub4_Sub2_4.method484(0, 0, 33, 33, 25, 25, Static3.anInt160, 256, Static96.anIntArray397, Static53.anIntArray262);
		Static27.method497();
	}
}

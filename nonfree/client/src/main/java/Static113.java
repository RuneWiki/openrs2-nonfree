import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "Z")
	public static boolean aBoolean165;

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString72 = "Allocated memory";

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
	public static int anInt2470 = 0;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIII)V")
	public static void method1929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static220.anInt4365; local3++) {
			if (Static77.anIntArray154[local3] + Static267.anIntArray300[local3] > arg1 && arg0 + arg1 > Static77.anIntArray154[local3] && Static243.anIntArray427[local3] + Static197.anIntArray324[local3] > arg3 && Static197.anIntArray324[local3] < arg2 + arg3) {
				Static72.aBooleanArray11[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V")
	public static void method1931() {
		@Pc(7) boolean local7 = true;
		Static155.method2474(false);
		Static117.anInt2596 = 0;
		@Pc(14) int local14;
		for (local14 = 0; local14 < Static249.aByteArrayArray19.length; local14++) {
			if (Static233.anIntArray422[local14] != -1 && Static249.aByteArrayArray19[local14] == null) {
				Static249.aByteArrayArray19[local14] = Static106.aClass98_65.method2396(0, Static233.anIntArray422[local14]);
				if (Static249.aByteArrayArray19[local14] == null) {
					Static117.anInt2596++;
					local7 = false;
				}
			}
			if (Static22.anIntArray43[local14] != -1 && Static81.aByteArrayArray16[local14] == null) {
				Static81.aByteArrayArray16[local14] = Static106.aClass98_65.method2381(Static51.anIntArrayArray15[local14], 0, Static22.anIntArray43[local14]);
				if (Static81.aByteArrayArray16[local14] == null) {
					local7 = false;
					Static117.anInt2596++;
				}
			}
			if (Static178.aBoolean216) {
				if (Static61.anIntArray133[local14] != -1 && Static207.aByteArrayArray17[local14] == null) {
					Static207.aByteArrayArray17[local14] = Static106.aClass98_65.method2396(0, Static61.anIntArray133[local14]);
					if (Static207.aByteArrayArray17[local14] == null) {
						Static117.anInt2596++;
						local7 = false;
					}
				}
				if (Static271.anIntArray451[local14] != -1 && Static90.aByteArrayArray9[local14] == null) {
					Static90.aByteArrayArray9[local14] = Static106.aClass98_65.method2396(0, Static271.anIntArray451[local14]);
					if (Static90.aByteArrayArray9[local14] == null) {
						local7 = false;
						Static117.anInt2596++;
					}
				}
			}
			if (Static22.anIntArray42 != null && Static171.aByteArrayArray13[local14] == null && Static22.anIntArray42[local14] != -1) {
				Static171.aByteArrayArray13[local14] = Static106.aClass98_65.method2381(Static51.anIntArrayArray15[local14], 0, Static22.anIntArray42[local14]);
				if (Static171.aByteArrayArray13[local14] == null) {
					Static117.anInt2596++;
					local7 = false;
				}
			}
		}
		if (Static158.aClass9_1 == null) {
			if (Static117.aClass4_Sub2_Sub9_2 == null || !Static234.aClass98_137.method2388(Static117.aClass4_Sub2_Sub9_2.aString54 + "_labels")) {
				Static158.aClass9_1 = new Class9(0);
			} else if (Static234.aClass98_137.method2404(Static117.aClass4_Sub2_Sub9_2.aString54 + "_labels")) {
				Static158.aClass9_1 = Static218.method4255(Static234.aClass98_137, Static117.aClass4_Sub2_Sub9_2.aString54 + "_labels");
			} else {
				local7 = false;
				Static117.anInt2596++;
			}
		}
		if (!local7) {
			Static5.anInt134 = 1;
			return;
		}
		local7 = true;
		Static131.anInt2782 = 0;
		@Pc(287) int local287;
		@Pc(297) int local297;
		for (local14 = 0; local14 < Static249.aByteArrayArray19.length; local14++) {
			@Pc(274) byte[] local274 = Static81.aByteArrayArray16[local14];
			if (local274 != null) {
				local287 = (Static262.anIntArray442[local14] >> 8) * 64 - Static170.anInt3385;
				local297 = (Static262.anIntArray442[local14] & 0xFF) * 64 - Static239.anInt4613;
				if (Static54.aBoolean77) {
					local287 = 10;
					local297 = 10;
				}
				local7 &= Static214.method3424(local274, local287, local297);
			}
			if (Static178.aBoolean216) {
				local274 = Static90.aByteArrayArray9[local14];
				if (local274 != null) {
					local287 = (Static262.anIntArray442[local14] >> 8) * 64 - Static170.anInt3385;
					local297 = (Static262.anIntArray442[local14] & 0xFF) * 64 - Static239.anInt4613;
					if (Static54.aBoolean77) {
						local287 = 10;
						local297 = 10;
					}
					local7 &= Static214.method3424(local274, local287, local297);
				}
			}
		}
		if (!local7) {
			Static5.anInt134 = 2;
			return;
		}
		if (Static5.anInt134 != 0) {
			Static265.method3986(Static86.aString50 + "<br>(100%)", true);
		}
		@Pc(382) boolean local382 = false;
		Static81.method3275();
		Static116.method1999();
		@Pc(403) int local403;
		if (Static178.aBoolean216 && Static139.aBoolean188) {
			for (local403 = 0; local403 < Static249.aByteArrayArray19.length; local403++) {
				if (Static90.aByteArrayArray9[local403] != null || Static207.aByteArrayArray17[local403] != null) {
					local382 = true;
					break;
				}
			}
		}
		Static127.method2097(Static178.aBoolean216 ? 28 : 25, local382);
		for (local403 = 0; local403 < 4; local403++) {
			Static121.aClass63Array1[local403].method1668();
		}
		for (local403 = 0; local403 < 4; local403++) {
			for (local287 = 0; local287 < 104; local287++) {
				for (local297 = 0; local297 < 104; local297++) {
					Static46.aByteArrayArrayArray2[local403][local287][local297] = 0;
				}
			}
		}
		Static271.method4063(false);
		if (Static178.aBoolean216) {
			Static64.aClass59_Sub2_1.method3798();
			for (local403 = 0; local403 < 13; local403++) {
				for (local287 = 0; local287 < 13; local287++) {
					Static64.aClass176ArrayArray1[local403][local287].aBoolean351 = true;
				}
			}
		}
		if (Static178.aBoolean216) {
			Static12.method202();
		}
		if (Static178.aBoolean216) {
			Static52.method864();
		}
		Static81.method3275();
		System.gc();
		Static155.method2474(true);
		Static248.method3761(false);
		if (!Static54.aBoolean77) {
			Static224.method3584(false);
			Static155.method2474(true);
			if (Static178.aBoolean216) {
				local403 = Static239.aClass12_Sub3_Sub2_2.anIntArray376[0] >> 3;
				local287 = Static239.aClass12_Sub3_Sub2_2.anIntArray379[0] >> 3;
				Static278.method4126(local287, local403);
			}
			Static193.method3019(false);
			if (Static171.aByteArrayArray13 != null) {
				Static233.method3643();
			}
		}
		if (Static54.aBoolean77) {
			Static251.method3785(false);
			Static155.method2474(true);
			if (Static178.aBoolean216) {
				local403 = Static239.aClass12_Sub3_Sub2_2.anIntArray376[0] >> 3;
				local287 = Static239.aClass12_Sub3_Sub2_2.anIntArray379[0] >> 3;
				Static278.method4126(local287, local403);
			}
			Static6.method134(false);
		}
		Static116.method1999();
		Static155.method2474(true);
		Static36.method517(false, Static121.aClass63Array1, Static54.aBoolean77 ? Static38.anIntArrayArrayArray3 : (int[][][]) null);
		if (Static178.aBoolean216) {
			Static12.method193();
		}
		Static155.method2474(true);
		local403 = Static145.anInt2969;
		if (Static210.anInt4103 < local403) {
			local403 = Static210.anInt4103;
		}
		if (Static210.anInt4103 - 1 <= local403) {
		}
		if (Static62.method957()) {
			Static147.method2357(0);
		} else {
			Static147.method2357(Static145.anInt2969);
		}
		Static189.method3930();
		if (Static178.aBoolean216 && local382) {
			Static205.method3261(true);
			Static248.method3761(true);
			if (!Static54.aBoolean77) {
				Static224.method3584(true);
				Static155.method2474(true);
				Static193.method3019(true);
			}
			if (Static54.aBoolean77) {
				Static251.method3785(true);
				Static155.method2474(true);
				Static6.method134(true);
			}
			Static116.method1999();
			Static155.method2474(true);
			Static36.method517(true, Static121.aClass63Array1, Static54.aBoolean77 ? Static38.anIntArrayArrayArray3 : (int[][][]) null);
			Static155.method2474(true);
			Static189.method3930();
			Static205.method3261(false);
		}
		if (Static178.aBoolean216) {
			for (local287 = 0; local287 < 13; local287++) {
				for (local297 = 0; local297 < 13; local297++) {
					Static64.aClass176ArrayArray1[local287][local297].method4245(Static250.anIntArrayArrayArray13[0], local287 * 8, local297 * 8);
				}
			}
		}
		for (local287 = 0; local287 < 104; local287++) {
			for (local297 = 0; local297 < 104; local297++) {
				Static261.method3957(local287, local297);
			}
		}
		Static265.method3980();
		Static81.method3275();
		method1937();
		Static116.method1999();
		Static111.aBoolean163 = false;
		if (Static178.aBoolean216) {
			Static193.method3018(true);
		}
		if (Static27.aFrame3 != null && Static259.aClass158_3 != null && Static267.anInt3573 == 25) {
			Static142.aClass4_Sub17_Sub1_3.method1905(81);
			Static142.aClass4_Sub17_Sub1_3.method1854(1057001181);
		}
		if (!Static54.aBoolean77) {
			local287 = (Static25.anInt450 - 6) / 8;
			local297 = (Static25.anInt450 + 6) / 8;
			@Pc(839) int local839 = (Static257.anInt4842 - 6) / 8;
			@Pc(845) int local845 = (Static257.anInt4842 + 6) / 8;
			for (@Pc(849) int local849 = local287 - 1; local849 <= local297 + 1; local849++) {
				for (@Pc(858) int local858 = local839 - 1; local858 <= local845 + 1; local858++) {
					if (local287 > local849 || local849 > local297 || local839 > local858 || local845 < local858) {
						Static106.aClass98_65.method2389("m" + local849 + "_" + local858);
						Static106.aClass98_65.method2389("l" + local849 + "_" + local858);
					}
				}
			}
		}
		if (Static267.anInt3573 == 28) {
			Static264.method3976(10);
		} else {
			Static264.method3976(30);
			if (Static259.aClass158_3 != null) {
				Static142.aClass4_Sub17_Sub1_3.method1905(75);
			}
		}
		Static36.method519();
		Static81.method3275();
		Static62.method959();
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)Lclient!ha;")
	public static Class4_Sub2_Sub11 method1934(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub2_Sub11 local10 = (Class4_Sub2_Sub11) Static232.aClass69_11.method1930((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static207.aClass98_126.method2396(arg0, 26);
		local10 = new Class4_Sub2_Sub11();
		if (local21 != null) {
			local10.method1511(new Class4_Sub17(local21));
		}
		Static232.aClass69_11.method1933((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)V")
	public static void method1936() {
		aString72 = null;
	}

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "(I)V")
	private static void method1937() {
		for (@Pc(18) Class4_Sub30 local18 = (Class4_Sub30) Static231.aClass10_47.method190(); local18 != null; local18 = (Class4_Sub30) Static231.aClass10_47.method191()) {
			if (local18.anInt5335 == -1) {
				local18.anInt5339 = 0;
				Static232.method3633(local18);
			} else {
				local18.method4391();
			}
		}
	}
}

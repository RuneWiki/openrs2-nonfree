import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!nk", name = "j", descriptor = "Lclient!fi;")
	public static Class66 aClass66_71 = new Class66(64);

	@OriginalMember(owner = "client!nk", name = "q", descriptor = "I")
	public static int anInt4106 = -1;

	@OriginalMember(owner = "client!nk", name = "r", descriptor = "Ljava/lang/String;")
	public static final String aString240 = "green:";

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(B)V")
	public static void method3694() {
		Static56.aClass66_19.method1933();
		Static38.aClass66_11.method1933();
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IILclient!bb;IIZ)V")
	public static void method3696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static225.anInt4428 >= 50 || (arg2 == null || arg2.anIntArrayArray1 == null || arg2.anIntArrayArray1.length <= arg0 || arg2.anIntArrayArray1[arg0] == null)) {
			return;
		}
		@Pc(34) int local34 = arg2.anIntArrayArray1[arg0][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(44) int local44 = local34 >> 5 & 0x7;
		@Pc(63) int local63;
		if (arg2.anIntArrayArray1[arg0].length > 1) {
			local63 = (int) ((double) arg2.anIntArrayArray1[arg0].length * Math.random());
			if (local63 > 0) {
				local38 = arg2.anIntArrayArray1[arg0][local63];
			}
		}
		@Pc(79) int local79 = local34 & 0x1F;
		if (local79 == 0) {
			if (arg4) {
				Static83.method1902(0, 255, local44, local38);
			}
		} else if (Static123.anInt2600 != 0) {
			Static77.anIntArray100[Static225.anInt4428] = local38;
			Static70.anIntArray82[Static225.anInt4428] = local44;
			Static144.anIntArray189[Static225.anInt4428] = 0;
			Static94.aClass196Array1[Static225.anInt4428] = null;
			Static48.anIntArray57[Static225.anInt4428] = 255;
			local63 = (arg1 - 64) / 128;
			@Pc(131) int local131 = (arg3 - 64) / 128;
			Static337.anIntArray548[Static225.anInt4428] = (local63 << 16) + (local131 << 8) + local79;
			Static225.anInt4428++;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZB)V")
	public static void method3697(@OriginalArg(0) boolean arg0) {
		Static324.aBoolean460 = arg0;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(42) int local42;
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(169) int local169;
		@Pc(180) int local180;
		@Pc(188) int local188;
		if (!Static324.aBoolean460) {
			local18 = Static6.aClass5_Sub1_Sub1_1.method1832();
			local22 = Static6.aClass5_Sub1_Sub1_1.method1875();
			@Pc(26) int local26 = Static6.aClass5_Sub1_Sub1_1.method1832();
			local30 = Static6.aClass5_Sub1_Sub1_1.method1845();
			local34 = Static6.aClass5_Sub1_Sub1_1.method1839();
			local42 = (Static179.anInt3568 - Static6.aClass5_Sub1_Sub1_1.anInt2029) / 16;
			Static19.anIntArrayArray2 = new int[local42][4];
			for (local48 = 0; local48 < local42; local48++) {
				for (local52 = 0; local52 < 4; local52++) {
					Static19.anIntArrayArray2[local48][local52] = Static6.aClass5_Sub1_Sub1_1.method1853();
				}
			}
			local52 = Static6.aClass5_Sub1_Sub1_1.method1867();
			@Pc(87) boolean local87 = Static6.aClass5_Sub1_Sub1_1.method1846() == 1;
			Static177.method2209(local26);
			Static210.aByteArrayArray21 = new byte[local42][];
			Static353.aByteArrayArray25 = new byte[local42][];
			Static139.anIntArray529 = new int[local42];
			Static249.anIntArray376 = null;
			Static55.anIntArray63 = new int[local42];
			Static338.anIntArray283 = new int[local42];
			Static27.aByteArrayArray19 = null;
			Static287.anIntArray415 = new int[local42];
			Static49.aByteArrayArray4 = new byte[local42][];
			Static228.anIntArray321 = new int[local42];
			Static129.aByteArrayArray6 = new byte[local42][];
			@Pc(123) boolean local123 = false;
			if ((local22 / 8 == 48 || local22 / 8 == 49) && local30 / 8 == 48) {
				local123 = true;
			}
			if (local22 / 8 == 48 && local30 / 8 == 148) {
				local123 = true;
			}
			local42 = 0;
			for (local169 = (local22 - (Static266.anInt5101 >> 4)) / 8; local169 <= (local22 + (Static266.anInt5101 >> 4)) / 8; local169++) {
				for (local180 = (local30 - (Static339.anInt6352 >> 4)) / 8; local180 <= (local30 + (Static339.anInt6352 >> 4)) / 8; local180++) {
					local188 = (local169 << 8) + local180;
					if (local123 && (local180 == 49 || local180 == 149 || local180 == 147 || local169 == 50 || local169 == 49 && local180 == 47)) {
						Static338.anIntArray283[local42] = local188;
						Static139.anIntArray529[local42] = -1;
						Static55.anIntArray63[local42] = -1;
						Static228.anIntArray321[local42] = -1;
						Static287.anIntArray415[local42] = -1;
					} else {
						Static338.anIntArray283[local42] = local188;
						Static139.anIntArray529[local42] = Static2.aClass170_1.method4555("m" + local169 + "_" + local180);
						Static55.anIntArray63[local42] = Static2.aClass170_1.method4555("l" + local169 + "_" + local180);
						Static228.anIntArray321[local42] = Static2.aClass170_1.method4555("um" + local169 + "_" + local180);
						Static287.anIntArray415[local42] = Static2.aClass170_1.method4555("ul" + local169 + "_" + local180);
					}
					local42++;
				}
			}
			Static214.method3768(local30, local34, false, local52, local87, local18, local22);
			return;
		}
		local18 = Static6.aClass5_Sub1_Sub1_1.method1846();
		local22 = Static6.aClass5_Sub1_Sub1_1.method1839();
		@Pc(362) boolean local362 = Static6.aClass5_Sub1_Sub1_1.method1846() == 1;
		local30 = Static6.aClass5_Sub1_Sub1_1.method1875();
		local34 = Static6.aClass5_Sub1_Sub1_1.method1839();
		local42 = Static6.aClass5_Sub1_Sub1_1.method1845();
		local48 = Static6.aClass5_Sub1_Sub1_1.method1846();
		Static177.method2209(local18);
		Static6.aClass5_Sub1_Sub1_1.method178();
		@Pc(390) int local390;
		@Pc(394) int local394;
		for (local52 = 0; local52 < 4; local52++) {
			for (local390 = 0; local390 < Static266.anInt5101 >> 3; local390++) {
				for (local394 = 0; local394 < Static339.anInt6352 >> 3; local394++) {
					local169 = Static6.aClass5_Sub1_Sub1_1.method182(1);
					if (local169 == 1) {
						Static118.anIntArrayArrayArray6[local52][local390][local394] = Static6.aClass5_Sub1_Sub1_1.method182(26);
					} else {
						Static118.anIntArrayArrayArray6[local52][local390][local394] = -1;
					}
				}
			}
		}
		Static6.aClass5_Sub1_Sub1_1.method175();
		local390 = (Static179.anInt3568 - Static6.aClass5_Sub1_Sub1_1.anInt2029) / 16;
		Static19.anIntArrayArray2 = new int[local390][4];
		for (local394 = 0; local394 < local390; local394++) {
			for (local169 = 0; local169 < 4; local169++) {
				Static19.anIntArrayArray2[local394][local169] = Static6.aClass5_Sub1_Sub1_1.method1826();
			}
		}
		Static287.anIntArray415 = new int[local390];
		Static353.aByteArrayArray25 = new byte[local390][];
		Static249.anIntArray376 = null;
		Static129.aByteArrayArray6 = new byte[local390][];
		Static228.anIntArray321 = new int[local390];
		Static210.aByteArrayArray21 = new byte[local390][];
		Static55.anIntArray63 = new int[local390];
		Static338.anIntArray283 = new int[local390];
		Static139.anIntArray529 = new int[local390];
		Static27.aByteArrayArray19 = null;
		Static49.aByteArrayArray4 = new byte[local390][];
		local390 = 0;
		for (local169 = 0; local169 < 4; local169++) {
			for (local180 = 0; local180 < Static266.anInt5101 >> 3; local180++) {
				for (local188 = 0; local188 < Static339.anInt6352 >> 3; local188++) {
					@Pc(544) int local544 = Static118.anIntArrayArrayArray6[local169][local180][local188];
					if (local544 != -1) {
						@Pc(553) int local553 = local544 >> 14 & 0x3FF;
						@Pc(559) int local559 = local544 >> 3 & 0x7FF;
						@Pc(569) int local569 = local559 / 8 + (local553 / 8 << 8);
						for (@Pc(571) int local571 = 0; local571 < local390; local571++) {
							if (Static338.anIntArray283[local571] == local569) {
								local569 = -1;
								break;
							}
						}
						if (local569 != -1) {
							Static338.anIntArray283[local390] = local569;
							@Pc(607) int local607 = local569 >> 8 & 0xFF;
							@Pc(611) int local611 = local569 & 0xFF;
							Static139.anIntArray529[local390] = Static2.aClass170_1.method4555("m" + local607 + "_" + local611);
							Static55.anIntArray63[local390] = Static2.aClass170_1.method4555("l" + local607 + "_" + local611);
							Static228.anIntArray321[local390] = Static2.aClass170_1.method4555("um" + local607 + "_" + local611);
							Static287.anIntArray415[local390] = Static2.aClass170_1.method4555("ul" + local607 + "_" + local611);
							local390++;
						}
					}
				}
			}
		}
		Static214.method3768(local30, local42, false, local34, local362, local48, local22);
	}

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "(B)Ljava/lang/String;")
	public static String method3698() {
		@Pc(5) String local5 = "www";
		if (Static226.anInt4439 != 0) {
			local5 = "www-wtqa";
		}
		@Pc(11) String local11 = "";
		if (Static31.aString51 != null) {
			local11 = "/p=" + Static31.aString51;
		}
		return Static298.anInt5725 == 1 ? "http://" + local5 + ".stellardawn.com/l=" + Static259.anInt3205 + "/a=" + Static255.anInt4972 + local11 + "/" : "http://" + local5 + ".runescape.com/l=" + Static259.anInt3205 + "/a=" + Static255.anInt4972 + local11 + "/";
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IB)V")
	public static void method3699() {
		Static41.aClass66_12.method1944(50);
		Static265.aClass66_101.method1944(50);
		Static216.aClass66_73.method1944(50);
		Static168.aClass66_60.method1944(50);
		Static148.aClass66_50.method1944(50);
	}
}

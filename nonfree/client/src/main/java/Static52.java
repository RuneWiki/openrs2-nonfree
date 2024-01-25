import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!bs", name = "Gb", descriptor = "Lclient!bq;")
	public static Class43 aClass43_15;

	@OriginalMember(owner = "client!bs", name = "zb", descriptor = "Ljava/lang/String;")
	public static String aString13 = null;

	@OriginalMember(owner = "client!bs", name = "Bb", descriptor = "Lclient!of;")
	public static final Class236 aClass236_7 = new Class236(64);

	@OriginalMember(owner = "client!bs", name = "Eb", descriptor = "J")
	public static long aLong40 = -1L;

	@OriginalMember(owner = "client!bs", name = "Ib", descriptor = "Lclient!so;")
	public static final Class314 aClass314_1 = new Class314(5, 8);

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!ig;B)Lclient!kk;")
	public static Class180 method1574(@OriginalArg(0) Class8_Sub8 arg0) {
		@Pc(15) int local15 = arg0.method8578();
		return new Class180(local15);
	}

	@OriginalMember(owner = "client!bs", name = "m", descriptor = "(II)V")
	public static void method1577(@OriginalArg(1) int arg0) {
		Static329.anInt6567 = -1;
		Static561.anInt9691 = arg0;
		Static329.anInt6567 = -1;
		Static119.method2632();
	}

	@OriginalMember(owner = "client!bs", name = "r", descriptor = "(I)V")
	public static void method1579() {
		Static542.method7654(false);
		Static308.anInt6237 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static65.aByteArrayArray30.length; local14++) {
			if (Static414.anIntArray422[local14] != -1 && Static65.aByteArrayArray30[local14] == null) {
				Static65.aByteArrayArray30[local14] = Static140.aClass237_41.method6314(Static414.anIntArray422[local14], 0);
				if (Static65.aByteArrayArray30[local14] == null) {
					local12 = false;
					Static308.anInt6237++;
				}
			}
			if (Static87.anIntArray604[local14] != -1 && Static19.aByteArrayArray59[local14] == null) {
				Static19.aByteArrayArray59[local14] = Static140.aClass237_41.method6323(0, Static87.anIntArray604[local14], Static466.anIntArrayArray45[local14]);
				if (Static19.aByteArrayArray59[local14] == null) {
					Static308.anInt6237++;
					local12 = false;
				}
			}
			if (Static158.anIntArray212[local14] != -1 && Static568.aByteArrayArray154[local14] == null) {
				Static568.aByteArrayArray154[local14] = Static140.aClass237_41.method6314(Static158.anIntArray212[local14], 0);
				if (Static568.aByteArrayArray154[local14] == null) {
					local12 = false;
					Static308.anInt6237++;
				}
			}
			if (Static488.anIntArray481[local14] != -1 && Static177.aByteArrayArray63[local14] == null) {
				Static177.aByteArrayArray63[local14] = Static140.aClass237_41.method6314(Static488.anIntArray481[local14], 0);
				if (Static177.aByteArrayArray63[local14] == null) {
					local12 = false;
					Static308.anInt6237++;
				}
			}
			if (Static161.anIntArray214 != null && Static357.aByteArrayArray65[local14] == null && Static161.anIntArray214[local14] != -1) {
				Static357.aByteArrayArray65[local14] = Static140.aClass237_41.method6323(0, Static161.anIntArray214[local14], Static466.anIntArrayArray45[local14]);
				if (Static357.aByteArrayArray65[local14] == null) {
					local12 = false;
					Static308.anInt6237++;
				}
			}
		}
		if (Static246.aClass14_2 == null) {
			if (Static16.aClass8_Sub5_Sub4_1 == null || !Static50.aClass237_15.method6302(Static16.aClass8_Sub5_Sub4_1.aString26 + "_staticelements")) {
				Static246.aClass14_2 = new Class14(0);
			} else if (Static50.aClass237_15.method6299(Static16.aClass8_Sub5_Sub4_1.aString26 + "_staticelements")) {
				Static246.aClass14_2 = Static249.method4528(Static50.aClass237_15, Static16.aClass8_Sub5_Sub4_1.aString26 + "_staticelements", Static565.aBoolean307);
			} else {
				Static308.anInt6237++;
				local12 = false;
			}
		}
		if (!local12) {
			Static201.anInt4620 = 1;
			return;
		}
		Static137.anInt3573 = 0;
		local12 = true;
		@Pc(272) int local272;
		@Pc(282) int local282;
		for (@Pc(254) int local254 = 0; local254 < Static65.aByteArrayArray30.length; local254++) {
			@Pc(260) byte[] local260 = Static19.aByteArrayArray59[local254];
			if (local260 != null) {
				local272 = (Static170.anIntArray225[local254] >> 8) * 64 - Static628.anInt10493;
				local282 = (Static170.anIntArray225[local254] & 0xFF) * 64 - Static594.anInt10160;
				if (Static336.anInt6621 != 0) {
					local272 = 10;
					local282 = 10;
				}
				local12 &= Static4.method39(Static372.anInt7082, local272, local282, Static218.anInt5023, local260);
			}
			local260 = Static177.aByteArrayArray63[local254];
			if (local260 != null) {
				local272 = (Static170.anIntArray225[local254] >> 8) * 64 - Static628.anInt10493;
				local282 = (Static170.anIntArray225[local254] & 0xFF) * 64 - Static594.anInt10160;
				if (Static336.anInt6621 != 0) {
					local272 = 10;
					local282 = 10;
				}
				local12 &= Static4.method39(Static372.anInt7082, local272, local282, Static218.anInt5023, local260);
			}
		}
		if (!local12) {
			Static201.anInt4620 = 2;
			return;
		}
		if (Static201.anInt4620 != 0) {
			Static500.method7268(Static634.aClass27_19, true, Static171.aClass16_5, Static121.aClass84_12.method2710(Static372.anInt7083) + "<br>(100%)", Static446.aClass345_13);
		}
		Static92.method2160();
		Static593.method8194();
		Static505.method7310();
		@Pc(396) boolean local396 = false;
		if (Static171.aClass16_5.method6102() && Static155.aClass8_Sub25_6.aClass36_Sub2_1.method1626() == 2) {
			for (local272 = 0; local272 < Static65.aByteArrayArray30.length; local272++) {
				if (Static177.aByteArrayArray63[local272] != null || Static568.aByteArrayArray154[local272] != null) {
					local396 = true;
					break;
				}
			}
		}
		if (Static155.aClass8_Sub25_6.aClass36_Sub12_1.method4665() == 1) {
			local272 = Static539.anIntArray509[Static334.anInt6594];
		} else {
			local272 = Static534.anIntArray507[Static334.anInt6594];
		}
		if (Static171.aClass16_5.method6123()) {
			local272++;
		}
		Static432.method6712(Static171.aClass16_5, Static170.anInt4134, Static372.anInt7082, Static218.anInt5023, local272, local396, Static171.aClass16_5.method6074() > 0);
		Static393.method6277(Static282.anInt5837);
		if (Static282.anInt5837 == 0) {
			Static50.method1414(null);
		} else {
			Static50.method1414(Static87.aClass27_21);
		}
		for (local282 = 0; local282 < 4; local282++) {
			Static204.aClass48Array1[local282].method1636();
		}
		Static100.method2295();
		Static291.method4858(false);
		Static592.method8179();
		Static328.aClass203_5 = null;
		Static370.aBoolean496 = false;
		Static92.method2160();
		System.gc();
		Static542.method7654(true);
		Static262.method4603();
		Static250.anInt5522 = Static155.aClass8_Sub25_6.aClass36_Sub14_1.method4894();
		Static524.aBoolean645 = Static153.anInt3785 >= 96;
		Static209.aBoolean369 = Static155.aClass8_Sub25_6.aClass36_Sub2_1.method1626() == 2;
		Static537.aBoolean657 = Static155.aClass8_Sub25_6.aClass36_Sub21_1.method6959() == 1;
		Static145.anInt3683 = Static155.aClass8_Sub25_6.aClass36_Sub13_1.method4838() == 1 ? -1 : Static591.anInt10125;
		Static505.aBoolean635 = Static155.aClass8_Sub25_6.aClass36_Sub20_1.method6729() == 1;
		Static415.aBoolean567 = Static155.aClass8_Sub25_6.aClass36_Sub17_1.method5459() == 1;
		Static32.aClass19_Sub1_1 = new Class19_Sub1(4, Static372.anInt7082, Static218.anInt5023, false);
		if (Static336.anInt6621 == 0) {
			Static122.method2767(Static65.aByteArrayArray30, Static32.aClass19_Sub1_1);
		} else {
			Static532.method7505(Static65.aByteArrayArray30, Static32.aClass19_Sub1_1);
		}
		Static413.method6509(Static218.anInt5023 >> 4, Static372.anInt7082 >> 4);
		Static623.method5387();
		if (local396) {
			Static287.method4821(true);
			Static338.aClass19_Sub1_2 = new Class19_Sub1(1, Static372.anInt7082, Static218.anInt5023, true);
			if (Static336.anInt6621 == 0) {
				Static122.method2767(Static568.aByteArrayArray154, Static338.aClass19_Sub1_2);
				Static542.method7654(true);
			} else {
				Static532.method7505(Static568.aByteArrayArray154, Static338.aClass19_Sub1_2);
				Static542.method7654(true);
			}
			Static338.aClass19_Sub1_2.method3000(Static32.aClass19_Sub1_1.anIntArrayArrayArray8[0]);
			Static338.aClass19_Sub1_2.method2997(null, Static171.aClass16_5, null);
			Static287.method4821(false);
		}
		Static32.aClass19_Sub1_1.method2997(Static204.aClass48Array1, Static171.aClass16_5, local396 ? Static338.aClass19_Sub1_2.anIntArrayArrayArray8 : null);
		if (Static336.anInt6621 == 0) {
			Static542.method7654(true);
			Static616.method8365(Static19.aByteArrayArray59, Static32.aClass19_Sub1_1);
			if (Static357.aByteArrayArray65 != null) {
				Static608.method8297();
			}
		} else {
			Static542.method7654(true);
			Static628.method8460(Static19.aByteArrayArray59, Static32.aClass19_Sub1_1);
		}
		Static593.method8194();
		if (Static153.anInt3785 < 96) {
			Static634.method7629();
		}
		Static542.method7654(true);
		Static32.aClass19_Sub1_1.method2995(local396 ? Static253.aClass86Array4[0] : null, Static171.aClass16_5, null);
		Static32.aClass19_Sub1_1.method3009(false, Static171.aClass16_5);
		Static542.method7654(true);
		if (local396) {
			Static287.method4821(true);
			Static542.method7654(true);
			if (Static336.anInt6621 == 0) {
				Static616.method8365(Static177.aByteArrayArray63, Static338.aClass19_Sub1_2);
			} else {
				Static628.method8460(Static177.aByteArrayArray63, Static338.aClass19_Sub1_2);
			}
			Static593.method8194();
			Static542.method7654(true);
			Static338.aClass19_Sub1_2.method2995(null, Static171.aClass16_5, Static86.aClass86Array2[0]);
			Static338.aClass19_Sub1_2.method3009(true, Static171.aClass16_5);
			Static542.method7654(true);
			Static287.method4821(false);
		}
		Static346.method5515();
		@Pc(774) int local774 = Static32.aClass19_Sub1_1.anInt3650;
		if (Static128.anInt3428 < local774) {
			local774 = Static128.anInt3428;
		}
		if (local774 < Static128.anInt3428 - 1) {
			local774 = Static128.anInt3428 - 1;
		}
		if (Static155.aClass8_Sub25_6.aClass36_Sub13_1.method4838() == 0) {
			Static158.method3215(local774);
		} else {
			Static158.method3215(0);
		}
		@Pc(812) int local812;
		@Pc(816) int local816;
		for (@Pc(808) int local808 = 0; local808 < 4; local808++) {
			for (local812 = 0; local812 < Static372.anInt7082; local812++) {
				for (local816 = 0; local816 < Static218.anInt5023; local816++) {
					Static510.method7349(local816, local808, local812);
				}
			}
		}
		Static140.method2960();
		Static92.method2160();
		Static543.method7660();
		Static593.method8194();
		Static75.method1960();
		@Pc(869) Class8_Sub31 local869;
		if (Static602.aFrame3 != null && Static319.aClass240_2 != null && Static435.anInt8191 == 11) {
			local869 = Static51.method1418(Static91.aClass257_20, Static608.aClass336_1);
			local869.aClass8_Sub8_Sub2_1.method8523(1057001181);
			Static262.method4604(local869);
		}
		if (Static336.anInt6621 == 0) {
			local812 = (Static325.anInt6515 - (Static372.anInt7082 >> 4)) / 8;
			local816 = ((Static372.anInt7082 >> 4) + Static325.anInt6515) / 8;
			@Pc(907) int local907 = (Static19.anInt3646 - (Static218.anInt5023 >> 4)) / 8;
			@Pc(916) int local916 = (Static19.anInt3646 + (Static218.anInt5023 >> 4)) / 8;
			for (@Pc(920) int local920 = local812 - 1; local920 <= local816 + 1; local920++) {
				for (@Pc(926) int local926 = local907 - 1; local926 <= local916 + 1; local926++) {
					if (local920 < local812 || local816 < local920 || local907 > local926 || local926 > local916) {
						Static140.aClass237_41.method6297("m" + local920 + "_" + local926);
						Static140.aClass237_41.method6297("l" + local920 + "_" + local926);
					}
				}
			}
		}
		if (Static435.anInt8191 == 4) {
			Static63.method1687(3);
		} else if (Static435.anInt8191 == 8) {
			Static63.method1687(7);
		} else {
			Static63.method1687(10);
			if (Static319.aClass240_2 != null) {
				local869 = Static51.method1418(Static1.aClass257_120, Static608.aClass336_1);
				Static262.method4604(local869);
			}
		}
		Static224.method4185();
		Static92.method2160();
		Static200.method3717();
		Static147.aBoolean271 = true;
		if (Static370.aBoolean495) {
			Static481.method7139("Took: " + (Static342.method5463() - Static40.aLong33) + "ms");
			Static370.aBoolean495 = false;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!pb", name = "y", descriptor = "Lclient!la;")
	public static Class56 aClass56_13;

	@OriginalMember(owner = "client!pb", name = "ab", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "[J")
	public static final long[] aLongArray9 = new long[500];

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1049 = Static151.method2243("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1050 = Static151.method2243("Unable to find ");

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1051 = aClass62_1050;

	@OriginalMember(owner = "client!pb", name = "w", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1052 = Static151.method2243("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZB)V")
	public static void method2138(@OriginalArg(0) boolean arg0) {
		Static76.aBoolean77 = arg0;
		@Pc(17) int local17;
		@Pc(23) int local23;
		@Pc(27) int local27;
		@Pc(59) int local59;
		@Pc(65) int local65;
		@Pc(69) int local69;
		@Pc(73) int local73;
		@Pc(129) int local129;
		@Pc(137) int local137;
		@Pc(146) int local146;
		if (!Static76.aBoolean77) {
			local17 = (Static35.anInt838 - Static108.aClass2_Sub11_Sub1_3.anInt2235) / 16;
			Static59.anIntArrayArray9 = new int[local17][4];
			for (local23 = 0; local23 < local17; local23++) {
				for (local27 = 0; local27 < 4; local27++) {
					Static59.anIntArrayArray9[local23][local27] = Static108.aClass2_Sub11_Sub1_3.method1577();
				}
			}
			local27 = Static108.aClass2_Sub11_Sub1_3.method1534();
			local59 = Static108.aClass2_Sub11_Sub1_3.method1557();
			@Pc(61) boolean local61 = false;
			local65 = Static108.aClass2_Sub11_Sub1_3.method1562();
			local69 = Static108.aClass2_Sub11_Sub1_3.method1562();
			local73 = Static108.aClass2_Sub11_Sub1_3.method1562();
			Static12.anIntArray27 = new int[local17];
			Static93.anIntArray197 = new int[local17];
			Static84.anIntArray327 = new int[local17];
			Static122.aByteArrayArray7 = new byte[local17][];
			Static61.aByteArrayArray3 = new byte[local17][];
			local17 = 0;
			if ((local65 / 8 == 48 || local65 / 8 == 49) && (local69 / 8) == 48) {
				local61 = true;
			}
			if (local65 / 8 == 48 && local69 / 8 == 148) {
				local61 = true;
			}
			for (local129 = (local65 - 6) / 8; local129 <= (local65 + 6) / 8; local129++) {
				for (local137 = (local69 - 6) / 8; local137 <= (local69 + 6) / 8; local137++) {
					local146 = (local129 << 8) + local137;
					if (local61 && (local137 == 49 || local137 == 149 || local137 == 147 || local129 == 50 || local129 == 49 && local137 == 47)) {
						Static84.anIntArray327[local17] = local146;
						Static12.anIntArray27[local17] = -1;
						Static93.anIntArray197[local17] = -1;
					} else {
						Static84.anIntArray327[local17] = local146;
						Static12.anIntArray27[local17] = Static153.aClass71_Sub1_16.method2114(Static169.method2460(new Class62[] { Static99.aClass62_779, Static119.method1865(local129), Static134.aClass62_1011, Static119.method1865(local137) }));
						Static93.anIntArray197[local17] = Static153.aClass71_Sub1_16.method2114(Static169.method2460(new Class62[] { Static147.aClass62_1080, Static119.method1865(local129), Static134.aClass62_1011, Static119.method1865(local137) }));
					}
					local17++;
				}
			}
			Static176.method2553(local59, local73, local69, local65, local27);
			return;
		}
		Static108.aClass2_Sub11_Sub1_3.method1586();
		for (local17 = 0; local17 < 4; local17++) {
			for (local23 = 0; local23 < 13; local23++) {
				for (local27 = 0; local27 < 13; local27++) {
					local59 = Static108.aClass2_Sub11_Sub1_3.method1584(1);
					if (local59 == 1) {
						Static192.anIntArrayArrayArray8[local17][local23][local27] = Static108.aClass2_Sub11_Sub1_3.method1584(26);
					} else {
						Static192.anIntArrayArrayArray8[local17][local23][local27] = -1;
					}
				}
			}
		}
		Static108.aClass2_Sub11_Sub1_3.method1585();
		local23 = (Static35.anInt838 - Static108.aClass2_Sub11_Sub1_3.anInt2235) / 16;
		Static59.anIntArrayArray9 = new int[local23][4];
		for (local27 = 0; local27 < local23; local27++) {
			for (local59 = 0; local59 < 4; local59++) {
				Static59.anIntArrayArray9[local27][local59] = Static108.aClass2_Sub11_Sub1_3.method1577();
			}
		}
		local59 = Static108.aClass2_Sub11_Sub1_3.method1562();
		local65 = Static108.aClass2_Sub11_Sub1_3.method1557();
		local69 = Static108.aClass2_Sub11_Sub1_3.method1557();
		local73 = Static108.aClass2_Sub11_Sub1_3.method1571();
		@Pc(400) int local400 = Static108.aClass2_Sub11_Sub1_3.method1581();
		Static84.anIntArray327 = new int[local23];
		Static93.anIntArray197 = new int[local23];
		Static122.aByteArrayArray7 = new byte[local23][];
		Static61.aByteArrayArray3 = new byte[local23][];
		Static12.anIntArray27 = new int[local23];
		local23 = 0;
		for (local129 = 0; local129 < 4; local129++) {
			for (local137 = 0; local137 < 13; local137++) {
				for (local146 = 0; local146 < 13; local146++) {
					@Pc(437) int local437 = Static192.anIntArrayArrayArray8[local129][local137][local146];
					if (local437 != -1) {
						@Pc(446) int local446 = local437 >> 14 & 0x3FF;
						@Pc(452) int local452 = local437 >> 3 & 0x7FF;
						@Pc(463) int local463 = (local446 / 8 << 8) + (local452 / 8);
						for (@Pc(465) int local465 = 0; local465 < local23; local465++) {
							if (Static84.anIntArray327[local465] == local463) {
								local463 = -1;
								break;
							}
						}
						if (local463 != -1) {
							Static84.anIntArray327[local23] = local463;
							@Pc(491) int local491 = local463 & 0xFF;
							@Pc(497) int local497 = local463 >> 8 & 0xFF;
							Static12.anIntArray27[local23] = Static153.aClass71_Sub1_16.method2114(Static169.method2460(new Class62[] { Static99.aClass62_779, Static119.method1865(local497), Static134.aClass62_1011, Static119.method1865(local491) }));
							Static93.anIntArray197[local23] = Static153.aClass71_Sub1_16.method2114(Static169.method2460(new Class62[] { Static147.aClass62_1080, Static119.method1865(local497), Static134.aClass62_1011, Static119.method1865(local491) }));
							local23++;
						}
					}
				}
			}
		}
		Static176.method2553(local59, local73, local65, local69, local400);
	}
}

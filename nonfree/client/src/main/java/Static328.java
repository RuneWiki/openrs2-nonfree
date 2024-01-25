import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "Lclient!s;")
	public static final Class217 aClass217_158 = new Class217(40, 7);

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
	public static int anInt7217 = 0;

	@OriginalMember(owner = "client!qh", name = "p", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_103 = new Class27(30, 7);

	@OriginalMember(owner = "client!qh", name = "r", descriptor = "[I")
	public static int[] anIntArray701 = new int[2];

	@OriginalMember(owner = "client!qh", name = "s", descriptor = "Lclient!wm;")
	public static final Class267 aClass267_81 = new Class267(50);

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(JI)V")
	public static void method5696(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static41.method647(arg0 - 1L);
			Static41.method647(1L);
		} else {
			Static41.method647(arg0);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IBI)I")
	public static int method5697(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg1 >>> 31;
		return (arg1 + local15) / arg0 - local15;
	}

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "(I)V")
	public static void method5698() {
		Static149.method2572(false);
		Static135.anInt6870 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static236.aByteArrayArray31.length; local14++) {
			if (Static195.anIntArray390[local14] != -1 && Static236.aByteArrayArray31[local14] == null) {
				Static236.aByteArrayArray31[local14] = Static77.aClass187_32.method4300(Static195.anIntArray390[local14], 0);
				if (Static236.aByteArrayArray31[local14] == null) {
					local12 = false;
					Static135.anInt6870++;
				}
			}
			if (Static384.anIntArray636[local14] != -1 && Static148.aByteArrayArray21[local14] == null) {
				Static148.aByteArrayArray21[local14] = Static77.aClass187_32.method4301(Static384.anIntArray636[local14], 0, Static372.anIntArrayArray59[local14]);
				if (Static148.aByteArrayArray21[local14] == null) {
					local12 = false;
					Static135.anInt6870++;
				}
			}
			if (Static49.anIntArray72[local14] != -1 && Static86.aByteArrayArray13[local14] == null) {
				Static86.aByteArrayArray13[local14] = Static77.aClass187_32.method4300(Static49.anIntArray72[local14], 0);
				if (Static86.aByteArrayArray13[local14] == null) {
					Static135.anInt6870++;
					local12 = false;
				}
			}
			if (Static226.anIntArray421[local14] != -1 && Static378.aByteArrayArray44[local14] == null) {
				Static378.aByteArrayArray44[local14] = Static77.aClass187_32.method4300(Static226.anIntArray421[local14], 0);
				if (Static378.aByteArrayArray44[local14] == null) {
					local12 = false;
					Static135.anInt6870++;
				}
			}
			if (Static222.anIntArray416 != null && Static164.aByteArrayArray27[local14] == null && Static222.anIntArray416[local14] != -1) {
				Static164.aByteArrayArray27[local14] = Static77.aClass187_32.method4301(Static222.anIntArray416[local14], 0, Static372.anIntArrayArray59[local14]);
				if (Static164.aByteArrayArray27[local14] == null) {
					local12 = false;
					Static135.anInt6870++;
				}
			}
		}
		if (Static33.aClass125_5 == null) {
			if (Static180.aClass10_Sub1_Sub2_3 == null || !Static251.aClass187_110.method4280(Static180.aClass10_Sub1_Sub2_3.aString4 + "_staticelements")) {
				Static33.aClass125_5 = new Class125(0);
			} else if (Static251.aClass187_110.method4275(Static180.aClass10_Sub1_Sub2_3.aString4 + "_staticelements")) {
				Static33.aClass125_5 = Static54.method939(Static180.aClass10_Sub1_Sub2_3.aString4 + "_staticelements", Static251.aClass187_110, Static175.aBoolean118);
			} else {
				Static135.anInt6870++;
				local12 = false;
			}
		}
		if (!local12) {
			Static66.anInt1197 = 1;
			return;
		}
		Static378.anInt6503 = 0;
		local12 = true;
		@Pc(272) int local272;
		@Pc(283) int local283;
		for (@Pc(253) int local253 = 0; local253 < Static236.aByteArrayArray31.length; local253++) {
			@Pc(259) byte[] local259 = Static148.aByteArrayArray21[local253];
			if (local259 != null) {
				local272 = (Static144.anIntArray288[local253] >> 8) * 64 - Static168.anInt3353;
				local283 = (Static144.anIntArray288[local253] & 0xFF) * 64 - Static72.anInt1488;
				if (Static273.anInt4772 != 0) {
					local283 = 10;
					local272 = 10;
				}
				local12 &= Static216.method3294(local259, local283, local272, Static17.anInt315, Static2.anInt7);
			}
			local259 = Static378.aByteArrayArray44[local253];
			if (local259 != null) {
				local272 = (Static144.anIntArray288[local253] >> 8) * 64 - Static168.anInt3353;
				local283 = (Static144.anIntArray288[local253] & 0xFF) * 64 - Static72.anInt1488;
				if (Static273.anInt4772 != 0) {
					local283 = 10;
					local272 = 10;
				}
				local12 &= Static216.method3294(local259, local283, local272, Static17.anInt315, Static2.anInt7);
			}
		}
		if (!local12) {
			Static66.anInt1197 = 2;
			return;
		}
		if (Static66.anInt1197 != 0) {
			Static77.method1475(true, Static114.aClass57_4, Static5.aClass182_1.method4155(Static191.anInt3842) + "<br>(100%)");
		}
		Static278.method4705();
		Static365.method2561();
		@Pc(383) boolean local383 = false;
		if (Static412.aClass50_8.method5813() && Static361.aClass85_Sub1_1.aBoolean170) {
			for (local272 = 0; local272 < Static236.aByteArrayArray31.length; local272++) {
				if (Static378.aByteArrayArray44[local272] != null || Static86.aByteArrayArray13[local272] != null) {
					local383 = true;
					break;
				}
			}
		}
		if (Static361.aClass85_Sub1_1.aBoolean168) {
			local272 = Static382.anIntArray687[Static248.anInt4481];
		} else {
			local272 = Static106.anIntArray187[Static248.anInt4481];
		}
		if (Static412.aClass50_8.method5860()) {
			local272++;
		}
		Static17.method254(Static2.anInt7, Static17.anInt315, local272, local383, Static412.aClass50_8.method5854() > 0);
		for (local283 = 0; local283 < 4; local283++) {
			Static11.aClass220Array1[local283].method4879();
		}
		Static332.method4494();
		Static338.method4529(false);
		Static382.method5563();
		Static378.aClass230_1 = null;
		Static278.method4705();
		System.gc();
		Static149.method2572(true);
		Static138.method5377();
		Static74.anInt1519 = Static361.aClass85_Sub1_1.method2106(Static423.anInt7114);
		Static138.aBoolean452 = Static361.aClass85_Sub1_1.aBoolean170;
		Static407.aBoolean449 = Static108.anInt2167 >= 96;
		Static20.aBoolean30 = Static361.aClass85_Sub1_1.method2105(Static423.anInt7114);
		Static300.aBoolean351 = !Static361.aClass85_Sub1_1.aBoolean172;
		Static197.anInt3927 = Static361.aClass85_Sub1_1.method2113(Static423.anInt7114) ? -1 : Static166.anInt3284;
		Static443.aBoolean490 = Static423.anInt7114 == 1 || Static361.aClass85_Sub1_1.aBoolean178;
		Static18.aBoolean25 = Static361.aClass85_Sub1_1.aBoolean167;
		Static356.aClass101_Sub1_1 = new Class101_Sub1(4, Static2.anInt7, Static17.anInt315, false);
		if (Static273.anInt4772 == 0) {
			Static280.method3968(Static236.aByteArrayArray31, Static356.aClass101_Sub1_1);
		} else {
			Static16.method250(Static236.aByteArrayArray31, Static356.aClass101_Sub1_1);
		}
		Static320.method4389(Static2.anInt7 >> 4, Static17.anInt315 >> 4);
		Static92.method1713();
		if (local383) {
			Static45.method5774(true);
			Static409.aClass101_Sub1_2 = new Class101_Sub1(1, Static2.anInt7, Static17.anInt315, true);
			if (Static273.anInt4772 == 0) {
				Static280.method3968(Static86.aByteArrayArray13, Static409.aClass101_Sub1_2);
				Static149.method2572(true);
			} else {
				Static16.method250(Static86.aByteArrayArray13, Static409.aClass101_Sub1_2);
				Static149.method2572(true);
			}
			Static409.aClass101_Sub1_2.method2435(Static356.aClass101_Sub1_1.anIntArrayArrayArray3[0]);
			Static409.aClass101_Sub1_2.method2432(Static412.aClass50_8, null, null);
			Static45.method5774(false);
		}
		Static356.aClass101_Sub1_1.method2432(Static412.aClass50_8, Static11.aClass220Array1, local383 ? Static409.aClass101_Sub1_2.anIntArrayArrayArray3 : null);
		if (Static273.anInt4772 == 0) {
			Static149.method2572(true);
			Static59.method1022(Static356.aClass101_Sub1_1, Static148.aByteArrayArray21);
			if (Static164.aByteArrayArray27 != null) {
				Static201.method3167();
			}
		} else {
			Static149.method2572(true);
			Static139.method2395(Static148.aByteArrayArray21, Static356.aClass101_Sub1_1);
		}
		Static365.method2561();
		Static149.method2572(true);
		Static356.aClass101_Sub1_1.method2437(null, Static412.aClass50_8, local383 ? Static173.aClass154Array1[0] : null);
		Static356.aClass101_Sub1_1.method2449(Static412.aClass50_8);
		Static149.method2572(true);
		if (local383) {
			Static45.method5774(true);
			Static149.method2572(true);
			if (Static273.anInt4772 == 0) {
				Static59.method1022(Static409.aClass101_Sub1_2, Static378.aByteArrayArray44);
			} else {
				Static139.method2395(Static378.aByteArrayArray44, Static409.aClass101_Sub1_2);
			}
			Static365.method2561();
			Static149.method2572(true);
			Static409.aClass101_Sub1_2.method2437(Static256.aClass154Array2[0], Static412.aClass50_8, null);
			Static409.aClass101_Sub1_2.method2449(Static412.aClass50_8);
			Static149.method2572(true);
			Static45.method5774(false);
		}
		Static73.method1391();
		@Pc(739) int local739 = Static356.aClass101_Sub1_1.anInt2939;
		if (Static96.anInt1983 < local739) {
			local739 = Static96.anInt1983;
		}
		if (Static96.anInt1983 - 1 > local739) {
			local739 = Static96.anInt1983 - 1;
		}
		if (Static361.aClass85_Sub1_1.method2113(Static423.anInt7114)) {
			Static457.method6060(0);
		} else {
			Static457.method6060(local739);
		}
		@Pc(774) int local774;
		@Pc(778) int local778;
		for (@Pc(770) int local770 = 0; local770 < 4; local770++) {
			for (local774 = 0; local774 < Static2.anInt7; local774++) {
				for (local778 = 0; local778 < Static17.anInt315; local778++) {
					Static179.method2955(local770, local778, local774);
				}
			}
		}
		Static124.method2183();
		Static278.method4705();
		Static66.method1097();
		Static365.method2561();
		Static343.aBoolean375 = false;
		Static152.method2604();
		if (Static451.aFrame2 != null && Static160.aClass253_3 != null && Static358.anInt6086 == 10) {
			Static310.method4308(Static172.aClass27_61);
			Static337.aClass10_Sub8_Sub2_2.method2506(1057001181);
		}
		if (Static273.anInt4772 == 0) {
			local774 = (Static444.anInt7445 - (Static2.anInt7 >> 4)) / 8;
			local778 = (Static444.anInt7445 + (Static2.anInt7 >> 4)) / 8;
			@Pc(865) int local865 = (Static253.anInt4561 - (Static17.anInt315 >> 4)) / 8;
			@Pc(873) int local873 = (Static253.anInt4561 + (Static17.anInt315 >> 4)) / 8;
			for (@Pc(877) int local877 = local774 - 1; local877 <= local778 + 1; local877++) {
				for (@Pc(883) int local883 = local865 - 1; local883 <= local873 + 1; local883++) {
					if (local774 > local877 || local778 < local877 || local865 > local883 || local883 > local873) {
						Static77.aClass187_32.method4290("m" + local877 + "_" + local883);
						Static77.aClass187_32.method4290("l" + local877 + "_" + local883);
					}
				}
			}
		}
		if (Static358.anInt6086 == 3) {
			Static458.method6071(2);
		} else if (Static358.anInt6086 == 7) {
			Static458.method6071(6);
		} else {
			Static458.method6071(9);
			if (Static160.aClass253_3 != null) {
				Static310.method4308(Static104.aClass27_42);
			}
		}
		Static168.method2801();
		Static278.method4705();
		Static349.method4739();
	}
}

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
	public static int anInt1345;

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "[S")
	public static short[] aShortArray14;

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "Lclient!wo;")
	public static Class4_Sub18_Sub4 aClass4_Sub18_Sub4_1;

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
	public static int anInt1347 = -1;

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "[C")
	public static final char[] aCharArray3 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V")
	public static void method1024() {
		Static39.aClass3Array2 = null;
		Static136.aClass3Array6 = null;
		Static356.aClass3Array14 = null;
		Static145.aClass3Array7 = null;
		Static449.aClass3Array17 = null;
		Static454.aClass3_25 = null;
		Static352.aClass3Array13 = null;
		Static241.aClass3_13 = null;
		Static390.aClass105_7 = null;
		Static162.aClass105_6 = null;
		Static397.aClass3Array15 = null;
		Static402.aClass3Array4 = null;
		Static332.aClass3Array11 = null;
		Static327.aClass3Array10 = null;
		Static350.aClass3Array12 = null;
		Static245.aClass105_4 = null;
		Static134.aClass3Array5 = null;
		Static171.aClass3Array8 = null;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
	public static void method1026() {
		Static39.method1428(false);
		Static276.anInt4866 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static435.aByteArrayArray20.length; local14++) {
			if (Static70.anIntArray647[local14] != -1 && Static435.aByteArrayArray20[local14] == null) {
				Static435.aByteArrayArray20[local14] = Static193.aClass166_291.method3696(0, Static70.anIntArray647[local14]);
				if (Static435.aByteArrayArray20[local14] == null) {
					Static276.anInt4866++;
					local12 = false;
				}
			}
			if (Static66.anIntArray102[local14] != -1 && Static325.aByteArrayArray16[local14] == null) {
				Static325.aByteArrayArray16[local14] = Static193.aClass166_291.method3666(Static66.anIntArray102[local14], Static205.anIntArrayArray33[local14], 0);
				if (Static325.aByteArrayArray16[local14] == null) {
					Static276.anInt4866++;
					local12 = false;
				}
			}
			if (Static310.anIntArray475[local14] != -1 && Static196.aByteArrayArray6[local14] == null) {
				Static196.aByteArrayArray6[local14] = Static193.aClass166_291.method3696(0, Static310.anIntArray475[local14]);
				if (Static196.aByteArrayArray6[local14] == null) {
					local12 = false;
					Static276.anInt4866++;
				}
			}
			if (Static80.anIntArray115[local14] != -1 && Static104.aByteArrayArray1[local14] == null) {
				Static104.aByteArrayArray1[local14] = Static193.aClass166_291.method3696(0, Static80.anIntArray115[local14]);
				if (Static104.aByteArrayArray1[local14] == null) {
					Static276.anInt4866++;
					local12 = false;
				}
			}
			if (Static389.anIntArray592 != null && Static288.aByteArrayArray13[local14] == null && Static389.anIntArray592[local14] != -1) {
				Static288.aByteArrayArray13[local14] = Static193.aClass166_291.method3666(Static389.anIntArray592[local14], Static205.anIntArrayArray33[local14], 0);
				if (Static288.aByteArrayArray13[local14] == null) {
					Static276.anInt4866++;
					local12 = false;
				}
			}
		}
		if (Static406.aClass257_3 == null) {
			if (Static447.aClass4_Sub1_Sub16_3 == null || !Static260.aClass166_302.method3679(Static447.aClass4_Sub1_Sub16_3.aString58 + "_staticelements")) {
				Static406.aClass257_3 = new Class257(0);
			} else if (Static260.aClass166_302.method3682(Static447.aClass4_Sub1_Sub16_3.aString58 + "_staticelements")) {
				Static406.aClass257_3 = Static455.method5874(Static165.aBoolean225, Static260.aClass166_302, Static447.aClass4_Sub1_Sub16_3.aString58 + "_staticelements");
			} else {
				local12 = false;
				Static276.anInt4866++;
			}
		}
		if (!local12) {
			Static113.anInt2413 = 1;
			return;
		}
		Static235.anInt4317 = 0;
		local12 = true;
		@Pc(266) int local266;
		@Pc(276) int local276;
		for (@Pc(247) int local247 = 0; local247 < Static435.aByteArrayArray20.length; local247++) {
			@Pc(253) byte[] local253 = Static325.aByteArrayArray16[local247];
			if (local253 != null) {
				local266 = (Static100.anIntArray134[local247] >> 8) * 64 - Static381.anInt6688;
				local276 = (Static100.anIntArray134[local247] & 0xFF) * 64 - Static285.anInt5187;
				if (Static323.anInt5755 != 0) {
					local276 = 10;
					local266 = 10;
				}
				local12 &= Static263.method3581(local276, local253, local266, Static190.anInt3697, Static126.anInt2569);
			}
			local253 = Static104.aByteArrayArray1[local247];
			if (local253 != null) {
				local266 = (Static100.anIntArray134[local247] >> 8) * 64 - Static381.anInt6688;
				local276 = (Static100.anIntArray134[local247] & 0xFF) * 64 - Static285.anInt5187;
				if (Static323.anInt5755 != 0) {
					local266 = 10;
					local276 = 10;
				}
				local12 &= Static263.method3581(local276, local253, local266, Static190.anInt3697, Static126.anInt2569);
			}
		}
		if (!local12) {
			Static113.anInt2413 = 2;
			return;
		}
		if (Static113.anInt2413 != 0) {
			Static309.method4260(Static390.aClass105_7, Static104.aClass242_28.method5320(Static139.anInt2670) + "<br>(100%)", true);
		}
		Static10.method281();
		Static13.method325();
		@Pc(376) boolean local376 = false;
		if (Static16.aClass30_11.method4681() && Static126.aClass67_Sub1_1.aBoolean388) {
			for (local266 = 0; local266 < Static435.aByteArrayArray20.length; local266++) {
				if (Static104.aByteArrayArray1[local266] != null || Static196.aByteArrayArray6[local266] != null) {
					local376 = true;
					break;
				}
			}
		}
		if (Static126.aClass67_Sub1_1.aBoolean399) {
			local266 = Static96.anIntArray130[Static118.anInt2476];
		} else {
			local266 = Static85.anIntArray121[Static118.anInt2476];
		}
		if (Static16.aClass30_11.method4668()) {
			local266++;
		}
		Static387.method5228(Static126.anInt2569, Static190.anInt3697, local266, local376, Static16.aClass30_11.method4657() > 0);
		for (local276 = 0; local276 < 4; local276++) {
			Static395.aClass268Array1[local276].method5815();
		}
		Static373.method5105();
		Static436.method5628(false);
		Static117.method1842();
		Static132.aClass129_1 = null;
		Static10.method281();
		System.gc();
		Static39.method1428(true);
		Static173.method2536();
		Static343.anInt6178 = Static126.aClass67_Sub1_1.method4523(Static286.anInt5207);
		Static233.aBoolean316 = Static126.aClass67_Sub1_1.aBoolean388;
		Static442.aBoolean490 = Static346.anInt6291 >= 96;
		Static214.aBoolean303 = Static126.aClass67_Sub1_1.method4524(Static286.anInt5207);
		Static69.aBoolean116 = !Static126.aClass67_Sub1_1.aBoolean404;
		Static317.anInt5682 = Static126.aClass67_Sub1_1.method4531(Static286.anInt5207) ? -1 : Static107.anInt2257;
		Static76.aBoolean121 = Static286.anInt5207 == 1 || Static126.aClass67_Sub1_1.aBoolean397;
		Static244.aBoolean328 = Static126.aClass67_Sub1_1.aBoolean396;
		Static237.aClass134_Sub1_1 = new Class134_Sub1(4, Static126.anInt2569, Static190.anInt3697, false);
		if (Static323.anInt5755 == 0) {
			Static430.method5522(Static237.aClass134_Sub1_1, Static435.aByteArrayArray20);
		} else {
			Static75.method1362(Static237.aClass134_Sub1_1, Static435.aByteArrayArray20);
		}
		Static298.method4122(Static126.anInt2569 >> 4, Static190.anInt3697 >> 4);
		Static153.method2272();
		if (local376) {
			Static171.method2497(true);
			Static249.aClass134_Sub1_2 = new Class134_Sub1(1, Static126.anInt2569, Static190.anInt3697, true);
			if (Static323.anInt5755 == 0) {
				Static430.method5522(Static249.aClass134_Sub1_2, Static196.aByteArrayArray6);
				Static39.method1428(true);
			} else {
				Static75.method1362(Static249.aClass134_Sub1_2, Static196.aByteArrayArray6);
				Static39.method1428(true);
			}
			Static249.aClass134_Sub1_2.method5153(Static237.aClass134_Sub1_1.anIntArrayArrayArray15[0]);
			Static249.aClass134_Sub1_2.method5150(Static16.aClass30_11, null, null);
			Static171.method2497(false);
		}
		Static237.aClass134_Sub1_1.method5150(Static16.aClass30_11, Static395.aClass268Array1, local376 ? Static249.aClass134_Sub1_2.anIntArrayArrayArray15 : null);
		if (Static323.anInt5755 == 0) {
			Static39.method1428(true);
			Static285.method3981(Static237.aClass134_Sub1_1, Static325.aByteArrayArray16);
			if (Static288.aByteArrayArray13 != null) {
				Static3.method105();
			}
		} else {
			Static39.method1428(true);
			Static423.method4750(Static237.aClass134_Sub1_1, Static325.aByteArrayArray16);
		}
		Static13.method325();
		Static39.method1428(true);
		Static237.aClass134_Sub1_1.method5145(null, Static16.aClass30_11, local376 ? Static117.aClass146Array1[0] : null);
		Static237.aClass134_Sub1_1.method5156(Static16.aClass30_11);
		Static39.method1428(true);
		if (local376) {
			Static171.method2497(true);
			Static39.method1428(true);
			if (Static323.anInt5755 == 0) {
				Static285.method3981(Static249.aClass134_Sub1_2, Static104.aByteArrayArray1);
			} else {
				Static423.method4750(Static249.aClass134_Sub1_2, Static104.aByteArrayArray1);
			}
			Static13.method325();
			Static39.method1428(true);
			Static249.aClass134_Sub1_2.method5145(Static422.aClass146Array3[0], Static16.aClass30_11, null);
			Static249.aClass134_Sub1_2.method5156(Static16.aClass30_11);
			Static39.method1428(true);
			Static171.method2497(false);
		}
		Static208.method2969();
		@Pc(713) int local713 = Static237.aClass134_Sub1_1.anInt6644;
		if (Static221.anInt4855 < local713) {
			local713 = Static221.anInt4855;
		}
		if (Static221.anInt4855 - 1 > local713) {
			local713 = Static221.anInt4855 - 1;
		}
		if (Static126.aClass67_Sub1_1.method4531(Static286.anInt5207)) {
			Static424.method5492(0);
		} else {
			Static424.method5492(local713);
		}
		@Pc(752) int local752;
		@Pc(756) int local756;
		for (@Pc(748) int local748 = 0; local748 < 4; local748++) {
			for (local752 = 0; local752 < Static126.anInt2569; local752++) {
				for (local756 = 0; local756 < Static190.anInt3697; local756++) {
					Static387.method5232(local748, local752, local756);
				}
			}
		}
		Static176.method2582();
		Static10.method281();
		Static53.method1054();
		Static13.method325();
		Static250.aBoolean333 = false;
		Static353.method4953();
		if (Static373.aFrame2 != null && Static223.aClass5_3 != null && Static73.anInt1749 == 25) {
			Static209.method2982(Static438.aClass36_135);
			Static116.aClass4_Sub30_Sub1_1.method4861(1057001181);
		}
		if (Static323.anInt5755 == 0) {
			local752 = (Static50.anInt1367 - (Static126.anInt2569 >> 4)) / 8;
			local756 = (Static50.anInt1367 + (Static126.anInt2569 >> 4)) / 8;
			@Pc(843) int local843 = (Static33.anInt781 - (Static190.anInt3697 >> 4)) / 8;
			@Pc(851) int local851 = (Static33.anInt781 + (Static190.anInt3697 >> 4)) / 8;
			for (@Pc(855) int local855 = local752 - 1; local855 <= local756 + 1; local855++) {
				for (@Pc(861) int local861 = local843 - 1; local861 <= local851 + 1; local861++) {
					if (local752 > local855 || local855 > local756 || local843 > local861 || local861 > local851) {
						Static193.aClass166_291.method3667("m" + local855 + "_" + local861);
						Static193.aClass166_291.method3667("l" + local855 + "_" + local861);
					}
				}
			}
		}
		if (Static73.anInt1749 == 28) {
			Static321.method4406(10);
		} else {
			Static321.method4406(30);
			if (Static223.aClass5_3 != null) {
				Static209.method2982(Static291.aClass36_94);
			}
		}
		Static84.method1450();
		Static10.method281();
		Static208.method2967();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!w", name = "g", descriptor = "[[[Lclient!e;")
	public static Class57[][][] aClass57ArrayArrayArray3;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "I")
	public static final int anInt6701 = -9017772;

	@OriginalMember(owner = "client!w", name = "c", descriptor = "I")
	public static volatile int anInt6703 = 0;

	@OriginalMember(owner = "client!w", name = "f", descriptor = "I")
	public static int anInt6706 = 0;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BI)Z")
	public static boolean method5574(@OriginalArg(1) int arg0) {
		return (-arg0 & arg0) == arg0;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	public static void method5575() {
		Static59.method1049(false);
		Static298.anInt6031 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static235.aByteArrayArray25.length; local14++) {
			if (Static173.anIntArray335[local14] != -1 && Static235.aByteArrayArray25[local14] == null) {
				Static235.aByteArrayArray25[local14] = Static159.aClass11_72.method288(0, Static173.anIntArray335[local14]);
				if (Static235.aByteArrayArray25[local14] == null) {
					Static298.anInt6031++;
					local12 = false;
				}
			}
			if (Static281.anIntArray461[local14] != -1 && Static118.aByteArrayArray8[local14] == null) {
				Static118.aByteArrayArray8[local14] = Static159.aClass11_72.method279(0, Static281.anIntArray461[local14], Static57.anIntArrayArray17[local14]);
				if (Static118.aByteArrayArray8[local14] == null) {
					Static298.anInt6031++;
					local12 = false;
				}
			}
			if (Static98.anIntArray526[local14] != -1 && Static247.aByteArrayArray19[local14] == null) {
				Static247.aByteArrayArray19[local14] = Static159.aClass11_72.method288(0, Static98.anIntArray526[local14]);
				if (Static247.aByteArrayArray19[local14] == null) {
					local12 = false;
					Static298.anInt6031++;
				}
			}
			if (Static128.anIntArray268[local14] != -1 && Static68.aByteArrayArray3[local14] == null) {
				Static68.aByteArrayArray3[local14] = Static159.aClass11_72.method288(0, Static128.anIntArray268[local14]);
				if (Static68.aByteArrayArray3[local14] == null) {
					local12 = false;
					Static298.anInt6031++;
				}
			}
			if (Static182.anIntArray344 != null && Static40.aByteArrayArray1[local14] == null && Static182.anIntArray344[local14] != -1) {
				Static40.aByteArrayArray1[local14] = Static159.aClass11_72.method279(0, Static182.anIntArray344[local14], Static57.anIntArrayArray17[local14]);
				if (Static40.aByteArrayArray1[local14] == null) {
					local12 = false;
					Static298.anInt6031++;
				}
			}
		}
		if (Static200.aClass158_3 == null) {
			if (Static329.aClass4_Sub1_Sub11_5 == null || !Static150.aClass11_147.method282(Static329.aClass4_Sub1_Sub11_5.aString102 + "_staticelements")) {
				Static200.aClass158_3 = new Class158(0);
			} else if (Static150.aClass11_147.method291(Static329.aClass4_Sub1_Sub11_5.aString102 + "_staticelements")) {
				Static200.aClass158_3 = Static123.method2468(Static329.aClass4_Sub1_Sub11_5.aString102 + "_staticelements", Static150.aClass11_147, Static197.aBoolean352);
			} else {
				local12 = false;
				Static298.anInt6031++;
			}
		}
		if (!local12) {
			Static19.anInt6738 = 1;
			return;
		}
		local12 = true;
		Static339.anInt6678 = 0;
		@Pc(268) int local268;
		@Pc(278) int local278;
		for (@Pc(250) int local250 = 0; local250 < Static235.aByteArrayArray25.length; local250++) {
			@Pc(256) byte[] local256 = Static118.aByteArrayArray8[local250];
			if (local256 != null) {
				local268 = (Static313.anIntArray505[local250] >> 8) * 64 - Static10.anInt231;
				local278 = (Static313.anIntArray505[local250] & 0xFF) * 64 - Static81.anInt1732;
				if (Static83.aBoolean137) {
					local278 = 10;
					local268 = 10;
				}
				local12 &= Static180.method3344(local268, local256, local278);
			}
			local256 = Static68.aByteArrayArray3[local250];
			if (local256 != null) {
				local268 = (Static313.anIntArray505[local250] >> 8) * 64 - Static10.anInt231;
				local278 = (Static313.anIntArray505[local250] & 0xFF) * 64 - Static81.anInt1732;
				if (Static83.aBoolean137) {
					local278 = 10;
					local268 = 10;
				}
				local12 &= Static180.method3344(local268, local256, local278);
			}
		}
		if (!local12) {
			Static19.anInt6738 = 2;
			return;
		}
		if (Static19.anInt6738 != 0) {
			Static164.method3149(Static118.aClass78_3, Static38.aString27 + "<br>(100%)", true);
		}
		Static294.method3383();
		Static207.method3647();
		@Pc(367) boolean local367 = false;
		if (Static164.aClass92_7.method4460() && Static86.aBoolean166) {
			for (local268 = 0; local268 < Static235.aByteArrayArray25.length; local268++) {
				if (Static68.aByteArrayArray3[local268] != null || Static247.aByteArrayArray19[local268] != null) {
					local367 = true;
					break;
				}
			}
		}
		if (Static131.aBoolean249) {
			local268 = Static319.anIntArray506[Static337.anInt5814];
		} else {
			local268 = Static337.anIntArray483[Static337.anInt5814];
		}
		if (Static164.aClass92_7.method4491()) {
			local268++;
		}
		Static318.method5276(Static92.anInt2048, Static290.anInt5893, local268, local367, Static164.aClass92_7.method4499() > 0);
		for (local278 = 0; local278 < 4; local278++) {
			Static345.aClass174Array1[local278].method4654();
		}
		Static121.method2452();
		Static81.method1446(false);
		Static301.method5110();
		Static294.method3383();
		System.gc();
		Static59.method1049(true);
		Static182.method3392(4);
		@Pc(459) int[][] local459 = null;
		if (!Static83.aBoolean137) {
			Static91.method1637(false);
			Static191.method3459(Static110.aClass2_Sub2_Sub1_Sub1_1.anIntArray518[0] >> 3, Static110.aClass2_Sub2_Sub1_Sub1_1.anIntArray517[0] >> 3);
			Static178.method5426();
			Static58.method1044(Static164.aClass92_7, false, null, 4);
			local459 = Static57.anIntArrayArrayArray4[0];
			Static59.method1049(true);
			Static336.method5528(false);
			if (Static40.aByteArrayArray1 != null) {
				Static127.method2539();
			}
		}
		if (Static83.aBoolean137) {
			Static247.method4274(false);
			Static191.method3459(Static110.aClass2_Sub2_Sub1_Sub1_1.anIntArray518[0] >> 3, Static110.aClass2_Sub2_Sub1_Sub1_1.anIntArray517[0] >> 3);
			Static178.method5426();
			Static58.method1044(Static164.aClass92_7, false, null, 4);
			local459 = Static57.anIntArrayArrayArray4[0];
			Static59.method1049(true);
			Static151.method2907(false);
		}
		Static207.method3647();
		Static59.method1049(true);
		Static355.method5718(false, Static164.aClass92_7, null, Static345.aClass174Array1, 4);
		Static258.method4403(4, Static164.aClass92_7);
		Static59.method1049(true);
		@Pc(558) int local558 = Static68.anInt1532;
		if (Static279.anInt5645 < local558) {
			local558 = Static279.anInt5645;
		}
		if (local558 < Static279.anInt5645 - 1) {
			local558 = Static279.anInt5645 - 1;
		}
		if (Static313.method5257()) {
			Static33.method523(0);
		} else {
			Static33.method523(local558);
		}
		Static58.method1047();
		if (local367) {
			Static229.method3925(true);
			Static182.method3392(1);
			if (!Static83.aBoolean137) {
				Static91.method1637(true);
				Static58.method1044(Static164.aClass92_7, true, local459, 1);
				Static59.method1049(true);
				Static336.method5528(true);
				Static258.method4403(1, Static164.aClass92_7);
			}
			if (Static83.aBoolean137) {
				Static247.method4274(true);
				Static58.method1044(Static164.aClass92_7, true, local459, 1);
				Static59.method1049(true);
				Static151.method2907(true);
			}
			Static207.method3647();
			Static59.method1049(true);
			Static355.method5718(true, Static164.aClass92_7, Static310.aClass26Array4[0], Static345.aClass174Array1, 1);
			Static258.method4403(1, Static164.aClass92_7);
			Static59.method1049(true);
			Static58.method1047();
			Static229.method3925(false);
		}
		@Pc(659) int local659;
		@Pc(663) int local663;
		for (@Pc(655) int local655 = 0; local655 < 4; local655++) {
			for (local659 = 0; local659 < Static92.anInt2048; local659++) {
				for (local663 = 0; local663 < Static290.anInt5893; local663++) {
					Static152.method2934(local659, local663, local655);
				}
			}
		}
		Static233.method3964();
		Static294.method3383();
		Static39.method736();
		Static207.method3647();
		Static14.aBoolean19 = false;
		Static284.method4854();
		if (Static350.aFrame3 != null && Static131.aClass171_3 != null && Static139.anInt3135 == 25) {
			Static320.aClass4_Sub7_Sub1_3.method1237(128);
			Static320.aClass4_Sub7_Sub1_3.method2387(1057001181);
		}
		if (!Static83.aBoolean137) {
			local659 = (Static182.anInt4006 - (Static92.anInt2048 >> 4)) / 8;
			local663 = ((Static92.anInt2048 >> 4) + Static182.anInt4006) / 8;
			@Pc(746) int local746 = (Static252.anInt5225 - (Static290.anInt5893 >> 4)) / 8;
			@Pc(754) int local754 = ((Static290.anInt5893 >> 4) + Static252.anInt5225) / 8;
			for (@Pc(758) int local758 = local659 - 1; local758 <= local663 + 1; local758++) {
				for (@Pc(764) int local764 = local746 - 1; local764 <= local754 + 1; local764++) {
					if (local659 > local758 || local758 > local663 || local764 < local746 || local754 < local764) {
						Static159.aClass11_72.method284("m" + local758 + "_" + local764);
						Static159.aClass11_72.method284("l" + local758 + "_" + local764);
					}
				}
			}
		}
		if (Static139.anInt3135 == 28) {
			Static233.method3965(10);
		} else {
			Static233.method3965(30);
			if (Static131.aClass171_3 != null) {
				Static320.aClass4_Sub7_Sub1_3.method1237(47);
			}
		}
		Static239.method5167();
		Static294.method3383();
		Static304.method5144();
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(B)V")
	public static void method5576() {
		@Pc(1) Class154 local1 = Static36.aClass154_8;
		synchronized (Static36.aClass154_8) {
			Static36.aClass154_8.method4219();
		}
	}
}

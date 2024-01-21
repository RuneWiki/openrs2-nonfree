import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!pb", name = "T", descriptor = "I")
	public static int anInt3201;

	@OriginalMember(owner = "client!pb", name = "Q", descriptor = "I")
	public static final int anInt3199 = 50;

	@OriginalMember(owner = "client!pb", name = "S", descriptor = "Lclient!l;")
	public static Class57 aClass57_32 = new Class57(512);

	@OriginalMember(owner = "client!pb", name = "V", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_944 = Static81.method1507("mapdots");

	@OriginalMember(owner = "client!pb", name = "W", descriptor = "Lclient!ih;")
	public static final Class46 aClass46_6 = new Class46(50);

	@OriginalMember(owner = "client!pb", name = "X", descriptor = "I")
	public static int anInt3203 = 0;

	@OriginalMember(owner = "client!pb", name = "Y", descriptor = "[I")
	public static final int[] anIntArray269 = new int[32];

	@OriginalMember(owner = "client!pb", name = "Z", descriptor = "[I")
	public static final int[] anIntArray270 = new int[50];

	@OriginalMember(owner = "client!pb", name = "ab", descriptor = "I")
	public static int anInt3204 = 0;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
	public static void method2481() {
		@Pc(7) Class37 local7 = Static15.aClass37_1;
		synchronized (Static15.aClass37_1) {
			Static129.anInt2833++;
			Static173.anInt3864 = Static178.anInt3955;
			@Pc(31) int local31;
			if (Static100.anInt2251 >= 0) {
				while (Static100.anInt2251 != Static204.anInt4556) {
					local31 = Static132.anIntArray239[Static204.anInt4556];
					Static204.anInt4556 = Static204.anInt4556 + 1 & 0x7F;
					if (local31 >= 0) {
						Static116.aBooleanArray11[local31] = true;
					} else {
						Static116.aBooleanArray11[~local31] = false;
					}
				}
			} else {
				for (local31 = 0; local31 < 112; local31++) {
					Static116.aBooleanArray11[local31] = false;
				}
				Static100.anInt2251 = Static204.anInt4556;
			}
			Static178.anInt3955 = Static50.anInt1254;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!gb;ZLclient!gb;)V")
	public static void method2482(@OriginalArg(0) Class1_Sub2_Sub8_Sub1_Sub1 arg0, @OriginalArg(2) Class1_Sub2_Sub8_Sub1_Sub1 arg1) {
		if (Static96.aClass1_Sub2_Sub8_Sub3Array11 == null) {
			Static96.aClass1_Sub2_Sub8_Sub3Array11 = Static103.method1785(Static16.anInt379, 0, Static44.aClass69_Sub1_34);
		}
		if (Static193.aClass1_Sub2_Sub8_Sub2Array11 == null) {
			Static193.aClass1_Sub2_Sub8_Sub2Array11 = Static49.method905(Static147.anInt3282, 0, Static44.aClass69_Sub1_34);
		}
		if (Static68.aClass1_Sub2_Sub8_Sub2Array9 == null) {
			Static68.aClass1_Sub2_Sub8_Sub2Array9 = Static49.method905(Static125.anInt2736, 0, Static44.aClass69_Sub1_34);
		}
		if (Static79.aClass1_Sub2_Sub8_Sub2Array10 == null) {
			Static79.aClass1_Sub2_Sub8_Sub2Array10 = Static49.method905(Static145.anInt3265, 0, Static44.aClass69_Sub1_34);
		}
		Static90.method3482(0, 23, 765, 480, 0);
		Static90.method3494(0, 0, 138, 23, 12425273, 9135624);
		Static90.method3494(138, 0, 640, 23, 5197647, 2697513);
		arg1.method1246(Static125.aClass24_826, 69, 15, 0, -1);
		if (Static79.aClass1_Sub2_Sub8_Sub2Array10 != null) {
			Static79.aClass1_Sub2_Sub8_Sub2Array10[1].method1960(140, 1);
			arg0.method1273(Static121.aClass24_797, 152, 10, 16777215, -1);
			Static79.aClass1_Sub2_Sub8_Sub2Array10[0].method1960(140, 12);
			arg0.method1273(Static181.aClass24_1168, 152, 21, 16777215, -1);
		}
		if (Static68.aClass1_Sub2_Sub8_Sub2Array9 != null) {
			if (Static15.anIntArray36[0] == 0 && Static136.anIntArray250[0] == 0) {
				Static68.aClass1_Sub2_Sub8_Sub2Array9[2].method1960(280, 4);
			} else {
				Static68.aClass1_Sub2_Sub8_Sub2Array9[0].method1960(280, 4);
			}
			if (Static15.anIntArray36[0] == 0 && Static136.anIntArray250[0] == 1) {
				Static68.aClass1_Sub2_Sub8_Sub2Array9[3].method1960(295, 4);
			} else {
				Static68.aClass1_Sub2_Sub8_Sub2Array9[1].method1960(295, 4);
			}
			arg1.method1273(Static187.aClass24_1202, 312, 17, 16777215, -1);
			if (Static15.anIntArray36[0] == 1 && Static136.anIntArray250[0] == 0) {
				Static68.aClass1_Sub2_Sub8_Sub2Array9[2].method1960(390, 4);
			} else {
				Static68.aClass1_Sub2_Sub8_Sub2Array9[0].method1960(390, 4);
			}
			if (Static15.anIntArray36[0] == 1 && Static136.anIntArray250[0] == 1) {
				Static68.aClass1_Sub2_Sub8_Sub2Array9[3].method1960(405, 4);
			} else {
				Static68.aClass1_Sub2_Sub8_Sub2Array9[1].method1960(405, 4);
			}
			arg1.method1273(Static14.aClass24_100, 422, 17, 16777215, -1);
			if (Static15.anIntArray36[0] == 2 && Static136.anIntArray250[0] == 0) {
				Static68.aClass1_Sub2_Sub8_Sub2Array9[2].method1960(500, 4);
			} else {
				Static68.aClass1_Sub2_Sub8_Sub2Array9[0].method1960(500, 4);
			}
			if (Static15.anIntArray36[0] == 2 && Static136.anIntArray250[0] == 1) {
				Static68.aClass1_Sub2_Sub8_Sub2Array9[3].method1960(515, 4);
			} else {
				Static68.aClass1_Sub2_Sub8_Sub2Array9[1].method1960(515, 4);
			}
			arg1.method1273(Static43.aClass24_269, 532, 17, 16777215, -1);
			if (Static15.anIntArray36[0] == 3 && Static136.anIntArray250[0] == 0) {
				Static68.aClass1_Sub2_Sub8_Sub2Array9[2].method1960(610, 4);
			} else {
				Static68.aClass1_Sub2_Sub8_Sub2Array9[0].method1960(610, 4);
			}
			if (Static15.anIntArray36[0] == 3 && Static136.anIntArray250[0] == 1) {
				Static68.aClass1_Sub2_Sub8_Sub2Array9[3].method1960(625, 4);
			} else {
				Static68.aClass1_Sub2_Sub8_Sub2Array9[1].method1960(625, 4);
			}
			arg1.method1273(Static193.aClass24_1240, 642, 17, 16777215, -1);
		}
		Static90.method3482(700, 4, 58, 16, 0);
		arg0.method1246(Static95.aClass24_649, 729, 16, 16777215, -1);
		Static89.anInt2080 = -1;
		if (Static96.aClass1_Sub2_Sub8_Sub3Array11 == null) {
			return;
		}
		@Pc(386) int local386 = 24;
		@Pc(392) int local392 = 8;
		@Pc(394) int local394;
		@Pc(396) int local396;
		do {
			local394 = local386;
			local396 = local392;
			if ((local392 - 1) * local386 >= Static190.anInt4253) {
				local392--;
			}
			if (local392 * (local386 - 1) >= Static190.anInt4253) {
				local386--;
			}
			if ((local386 - 1) * local392 >= Static190.anInt4253) {
				local386--;
			}
		} while (local386 != local394 || local392 != local396);
		local394 = (765 - local392 * 88) / (local392 - -1);
		if (local394 > 5) {
			local394 = 5;
		}
		local396 = (480 - local386 * 19) / (local386 + 1);
		if (local396 > 5) {
			local396 = 5;
		}
		@Pc(485) int local485 = (765 - local392 * 88 - (local392 - 1) * local394) / 2;
		@Pc(501) int local501 = (480 - local386 * 19 - local396 * (local386 + -1)) / 2;
		@Pc(506) int local506 = local501 + 23;
		@Pc(508) int local508 = local485;
		@Pc(510) int local510 = 0;
		for (@Pc(512) int local512 = 0; local512 < Static190.anInt4253; local512++) {
			@Pc(516) boolean local516 = true;
			@Pc(520) Class63 local520 = Static160.aClass63Array105[local512];
			@Pc(525) Class24 local525 = Static175.method3020(local520.anInt2667);
			if (local520.anInt2667 == -1) {
				local516 = false;
				local525 = Static96.aClass24_651;
			} else if (local520.anInt2667 > 1980) {
				local516 = false;
				local525 = Static111.aClass24_752;
			}
			if (Static24.anInt661 >= local508 && Static7.anInt174 >= local506 && Static24.anInt661 < local508 + 88 && local506 + 19 > Static7.anInt174 && local516) {
				Static89.anInt2080 = local512;
				Static96.aClass1_Sub2_Sub8_Sub3Array11[local520.aBoolean121 ? 1 : 0].method2338(local508, local506);
			} else {
				Static96.aClass1_Sub2_Sub8_Sub3Array11[local520.aBoolean121 ? 1 : 0].method2352(local508, local506);
			}
			if (Static193.aClass1_Sub2_Sub8_Sub2Array11 != null) {
				Static193.aClass1_Sub2_Sub8_Sub2Array11[(local520.aBoolean121 ? 8 : 0) + local520.anInt2668].method1960(local508 + 29, local506);
			}
			arg1.method1246(Static175.method3020(local520.anInt2671), local508 + 15, local506 + 9 - -5, 0, -1);
			arg0.method1246(local525, local508 + 60, local506 + 9 + 5, 268435455, -1);
			local506 += local396 + 19;
			local510++;
			if (local510 >= local386) {
				local506 = local501 + 23;
				local508 += local394 + 88;
				local510 = 0;
			}
		}
	}
}

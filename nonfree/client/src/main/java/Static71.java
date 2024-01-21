import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "[I")
	public static int[] anIntArray207;

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "[I")
	public static int[] anIntArray208;

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "Lclient!m;")
	public static Class10_Sub1_Sub1_Sub2 aClass10_Sub1_Sub1_Sub2_20;

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "Lclient!w;")
	public static Class15 aClass15_28;

	@OriginalMember(owner = "client!ob", name = "w", descriptor = "Z")
	public static boolean aBoolean89;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "Lclient!va;")
	private static Class61 aClass61_753 = Static88.method1421("Please contact customer support)3");

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "Lclient!va;")
	public static Class61 aClass61_754 = aClass61_753;

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "Lclient!va;")
	private static Class61 aClass61_755 = Static88.method1421("Your ignore list is full)3 Max of 100 hit");

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "Lclient!va;")
	private static Class61 aClass61_758 = Static88.method1421("Loaded sprites");

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "Lclient!va;")
	public static Class61 aClass61_756 = aClass61_758;

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "Lclient!va;")
	public static Class61 aClass61_757 = Static88.method1421("@red@");

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "Z")
	public static boolean aBoolean88 = false;

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "Lclient!va;")
	public static Class61 aClass61_759 = Static88.method1421("Cabbage");

	@OriginalMember(owner = "client!ob", name = "s", descriptor = "Lclient!va;")
	public static Class61 aClass61_760 = aClass61_755;

	@OriginalMember(owner = "client!ob", name = "v", descriptor = "Lclient!i;")
	public static Class29 aClass29_50 = new Class29(10);

	@OriginalMember(owner = "client!ob", name = "z", descriptor = "Lclient!va;")
	public static Class61 aClass61_761 = Static88.method1421("null");

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
	public static void method1016() {
		if (Static57.anInt1519 == 0) {
			return;
		}
		@Pc(10) int local10 = 0;
		if (Static19.anInt628 != 0) {
			local10 = 1;
		}
		@Pc(16) Class10_Sub1_Sub1_Sub4 local16 = Static99.aClass10_Sub1_Sub1_Sub4_4;
		for (@Pc(18) int local18 = 0; local18 < 100; local18++) {
			if (Static39.aClass61Array2[local18] != null) {
				@Pc(28) int local28 = Static51.anIntArray154[local18];
				@Pc(32) Class61 local32 = Static48.aClass61Array8[local18];
				@Pc(34) byte local34 = 0;
				if (local32 != null && local32.method1602(Static104.aClass61_1058)) {
					local34 = 1;
					local32 = local32.method1619(5);
				}
				if (local32 != null && local32.method1602(Static44.aClass61_515)) {
					local34 = 2;
					local32 = local32.method1619(5);
				}
				@Pc(95) int local95;
				if ((local28 == 3 || local28 == 7) && (local28 == 7 || Static17.anInt584 == 0 || Static17.anInt584 == 1 && Static94.method1495(local32))) {
					local95 = 329 - local10 * 13;
					local10++;
					local16.method1548(Static51.aClass61_589, 4, local95, 0);
					local16.method1548(Static51.aClass61_589, 4, local95 - 1, 65535);
					@Pc(116) int local116 = local16.method1549(Static51.aClass61_589) + 4;
					local116 += local16.method1552(32);
					if (local34 == 1) {
						Static25.aClass10_Sub1_Sub1_Sub2Array1[0].method873(local116, local95 - 12);
						local116 += 14;
					}
					if (local34 == 2) {
						Static25.aClass10_Sub1_Sub1_Sub2Array1[1].method873(local116, local95 - 12);
						local116 += 14;
					}
					local16.method1548(Static93.method1156(new Class61[] { local32, Static79.aClass61_855, Static39.aClass61Array2[local18] }), local116, local95, 0);
					local16.method1548(Static93.method1156(new Class61[] { local32, Static79.aClass61_855, Static39.aClass61Array2[local18] }), local116, local95 - 1, 65535);
					if (local10 >= 5) {
						return;
					}
				}
				if (local28 == 5 && Static17.anInt584 < 2) {
					local95 = 329 - local10 * 13;
					local16.method1548(Static39.aClass61Array2[local18], 4, local95, 0);
					local10++;
					local16.method1548(Static39.aClass61Array2[local18], 4, local95 - 1, 65535);
					if (local10 >= 5) {
						return;
					}
				}
				if (local28 == 6 && Static17.anInt584 < 2) {
					local95 = 329 - local10 * 13;
					local10++;
					local16.method1548(Static93.method1156(new Class61[] { Static93.aClass61_809, Static24.aClass61_925, local32, Static79.aClass61_855, Static39.aClass61Array2[local18] }), 4, local95, 0);
					local16.method1548(Static93.method1156(new Class61[] { Static93.aClass61_809, Static24.aClass61_925, local32, Static79.aClass61_855, Static39.aClass61Array2[local18] }), 4, local95 - 1, 65535);
					if (local10 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V")
	public static void method1017() {
		if (Static78.anInt2122 == 2) {
			Static50.method784(Static17.anInt585 * 2, (Static30.anInt922 - Static7.anInt80 << 7) + Static51.anInt1414, (-Static107.anInt2431 + Static93.anInt2002 << 7) - -Static39.anInt262);
			if (Static39.anInt280 > -1 && Static95.anInt2442 % 20 < 10) {
				Static78.aClass10_Sub1_Sub1_Sub1Array9[0].method142(Static39.anInt280 - 12, Static32.anInt947 + -28);
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
	public static void method1018() {
		aClass15_28 = null;
		aClass61_760 = null;
		aClass61_759 = null;
		aClass61_754 = null;
		aClass29_50 = null;
		aClass61_756 = null;
		aClass61_757 = null;
		aClass61_758 = null;
		aClass61_755 = null;
		anIntArray208 = null;
		anIntArray207 = null;
		aClass61_761 = null;
		aClass10_Sub1_Sub1_Sub2_20 = null;
		aClass61_753 = null;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
	public static void method1019() {
		while (true) {
			if (Static55.aClass10_Sub10_Sub1_4.method1164(Static5.anInt34) >= 26) {
				@Pc(12) int local12 = Static55.aClass10_Sub10_Sub1_4.method1171(14);
				if (local12 != 16383) {
					if (Static6.aClass10_Sub1_Sub5_Sub2_Sub1Array1[local12] == null) {
						Static6.aClass10_Sub1_Sub5_Sub2_Sub1Array1[local12] = new Class10_Sub1_Sub5_Sub2_Sub1();
					}
					@Pc(31) Class10_Sub1_Sub5_Sub2_Sub1 local31 = Static6.aClass10_Sub1_Sub5_Sub2_Sub1Array1[local12];
					Static1.anIntArray3[Static34.anInt1005++] = local12;
					local31.anInt1631 = Static95.anInt2442;
					@Pc(47) int local47 = Static55.aClass10_Sub10_Sub1_4.method1171(5);
					if (local47 > 15) {
						local47 -= 32;
					}
					@Pc(58) int local58 = Static55.aClass10_Sub10_Sub1_4.method1171(5);
					local31.aClass10_Sub1_Sub3_1 = Static53.method802(Static55.aClass10_Sub10_Sub1_4.method1171(13));
					@Pc(73) int local73 = Static55.aClass10_Sub10_Sub1_4.method1171(1);
					if (local73 == 1) {
						Static12.anIntArray46[Static76.anInt2030++] = local12;
					}
					if (local58 > 15) {
						local58 -= 32;
					}
					@Pc(97) int local97 = Static55.aClass10_Sub10_Sub1_4.method1171(1);
					local31.anInt1662 = local31.aClass10_Sub1_Sub3_1.anInt386;
					local31.anInt1647 = local31.aClass10_Sub1_Sub3_1.anInt384;
					local31.anInt1681 = local31.aClass10_Sub1_Sub3_1.anInt397;
					local31.anInt1665 = local31.aClass10_Sub1_Sub3_1.anInt392;
					local31.anInt1668 = local31.aClass10_Sub1_Sub3_1.anInt400;
					local31.anInt1637 = local31.aClass10_Sub1_Sub3_1.anInt378;
					local31.anInt1630 = local31.aClass10_Sub1_Sub3_1.anInt370;
					local31.method928(local47 + Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0], local97 == 1, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0] + local58);
					continue;
				}
			}
			Static55.aClass10_Sub10_Sub1_4.method1165();
			return;
		}
	}
}

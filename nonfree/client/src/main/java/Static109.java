import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!o", name = "a", descriptor = "I")
	public static int anInt893 = 0;

	@OriginalMember(owner = "client!o", name = "c", descriptor = "Lclient!qf;")
	public static Class66 aClass66_4 = null;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "[I")
	public static int[] anIntArray143 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!o", name = "e", descriptor = "I")
	public static int anInt895 = 0;

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V")
	public static void method622() {
		anIntArray143 = null;
		aClass66_4 = null;
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V")
	public static void method624() {
		Static57.method2994(Static34.aClass66_5);
		Static27.anInt827++;
		if (Static56.aBoolean77 && Static50.aBoolean70) {
			@Pc(33) int local33 = Static20.anInt631;
			local33 -= Static40.anInt1150;
			if (local33 < Static62.anInt1660) {
				local33 = Static62.anInt1660;
			}
			if (Static34.aClass66_5.anInt3227 + local33 > Static158.aClass66_13.anInt3227 + Static62.anInt1660) {
				local33 = Static158.aClass66_13.anInt3227 + Static62.anInt1660 - Static34.aClass66_5.anInt3227;
			}
			@Pc(62) int local62 = Static132.anInt3185;
			local62 -= Static150.anInt3698;
			@Pc(71) int local71 = local33 - Static137.anInt3307;
			@Pc(74) int local74 = Static34.aClass66_5.anInt3195;
			if (Static57.anInt4549 > local62) {
				local62 = Static57.anInt4549;
			}
			if (Static57.anInt4549 + Static158.aClass66_13.anInt3168 < Static34.aClass66_5.anInt3168 + local62) {
				local62 = Static158.aClass66_13.anInt3168 + Static57.anInt4549 - Static34.aClass66_5.anInt3168;
			}
			@Pc(103) int local103 = local62 - Static52.anInt1424;
			@Pc(111) int local111 = Static158.aClass66_13.anInt3189 + local62 - Static57.anInt4549;
			@Pc(118) int local118 = local33 + Static158.aClass66_13.anInt3218 - Static62.anInt1660;
			if (Static34.aClass66_5.anInt3191 < Static27.anInt827 && (local71 > local74 || -local74 > local71 || local74 < local103 || local103 < -local74)) {
				Static7.aBoolean8 = true;
			}
			@Pc(163) Class2_Sub21 local163;
			if (Static34.aClass66_5.anObjectArray11 != null && Static7.aBoolean8) {
				local163 = new Class2_Sub21();
				local163.anInt4461 = local111;
				local163.anInt4466 = local118;
				local163.aClass66_14 = Static34.aClass66_5;
				local163.anObjectArray29 = Static34.aClass66_5.anObjectArray11;
				Static150.method2565(local163);
			}
			if (Static31.anInt887 == 0) {
				if (Static7.aBoolean8) {
					if (Static34.aClass66_5.anObjectArray24 != null) {
						local163 = new Class2_Sub21();
						local163.aClass66_14 = Static34.aClass66_5;
						local163.anInt4466 = local118;
						local163.aClass66_15 = aClass66_4;
						local163.anInt4461 = local111;
						local163.anObjectArray29 = Static34.aClass66_5.anObjectArray24;
						Static150.method2565(local163);
					}
					if (aClass66_4 != null && Static108.method1923(Static34.aClass66_5) != null) {
						Static124.aClass2_Sub18_Sub1_3.method2398(84);
						Static124.aClass2_Sub18_Sub1_3.method2365(aClass66_4.anInt3212);
						Static124.aClass2_Sub18_Sub1_3.method2342(Static34.aClass66_5.anInt3229);
						Static124.aClass2_Sub18_Sub1_3.method2378(Static34.aClass66_5.anInt3212);
						Static124.aClass2_Sub18_Sub1_3.method2370(aClass66_4.anInt3229);
					}
				} else if ((Static98.anInt2481 == 1 || Static131.method2904(Static18.anInt618 - 1)) && Static18.anInt618 > 2) {
					Static80.method1473();
				} else if (Static18.anInt618 > 0) {
					Static53.method1024(Static18.anInt618 - 1);
				}
				Static34.aClass66_5 = null;
			}
		} else if (Static27.anInt827 > 1) {
			Static34.aClass66_5 = null;
		}
	}
}

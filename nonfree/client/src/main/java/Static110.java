import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!t", name = "x", descriptor = "Lclient!pe;")
	public static Class26_Sub1 aClass26_Sub1_67;

	@OriginalMember(owner = "client!t", name = "y", descriptor = "Lclient!ae;")
	public static Class2_Sub2_Sub1_Sub1 aClass2_Sub2_Sub1_Sub1_44;

	@OriginalMember(owner = "client!t", name = "A", descriptor = "Lclient!id;")
	public static Class35 aClass35_1;

	@OriginalMember(owner = "client!t", name = "v", descriptor = "Lclient!u;")
	public static Class74 aClass74_1532 = Static72.method1077("@cya@");

	@OriginalMember(owner = "client!t", name = "z", descriptor = "Lclient!u;")
	private static Class74 aClass74_1534 = Static72.method1077("Loaded textures");

	@OriginalMember(owner = "client!t", name = "w", descriptor = "Lclient!u;")
	public static Class74 aClass74_1533 = aClass74_1534;

	@OriginalMember(owner = "client!t", name = "G", descriptor = "I")
	public static int anInt2411 = -1;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
	public static void method1674() {
		@Pc(1) Object local1 = Static52.anObject1;
		synchronized (Static52.anObject1) {
			if (Static77.anInt1675 == 0) {
				Static35.aClass15_59.method463(5, new Class23());
			}
			Static77.anInt1675 = 600;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!cc;Lclient!cc;I)V")
	public static void method1675(@OriginalArg(0) Class2_Sub2_Sub1_Sub3 arg0, @OriginalArg(1) Class2_Sub2_Sub1_Sub3 arg1) {
		if (Static98.aBoolean87) {
			Static61.method1097(arg1, arg0);
			return;
		}
		if (Static68.anInt1490 == 0 || Static68.anInt1490 == 5) {
			arg1.method314(Static41.aClass74_697, 382, 225, 16777215);
			Static58.method712(230, 233, 304, 34, 9179409);
			Static58.method712(231, 234, 302, 32, 0);
			Static58.method702(232, 235, Static81.anInt1787 * 3, 30, 9179409);
			Static58.method702(Static81.anInt1787 * 3 + 232, 235, 300 - Static81.anInt1787 * 3, 30, 0);
			arg1.method314(Static49.aClass74_850, 382, 256, 16777215);
		}
		@Pc(104) short local104;
		@Pc(112) int local112;
		if (Static68.anInt1490 == 20) {
			Static77.aClass2_Sub2_Sub1_Sub1_33.method97(382 - Static77.aClass2_Sub2_Sub1_Sub1_33.anInt116 / 2, 271 - Static77.aClass2_Sub2_Sub1_Sub1_33.anInt118 / 2);
			local104 = 211;
			arg1.method317(Static49.aClass74_849, 382, 211, 16776960, true);
			local112 = local104 + 15;
			arg1.method317(Static49.aClass74_847, 382, 226, 16776960, true);
			@Pc(120) int local120 = local112 + 15;
			arg1.method317(Static49.aClass74_851, 382, 241, 16776960, true);
			@Pc(128) int local128 = local120 + 15;
			@Pc(129) int local129 = local128 + 10;
			arg1.method324(Static91.method1340(new Class74[] { Static50.aClass74_874, Static49.aClass74_842 }), 272, 266, 16777215, true);
			@Pc(150) int local150 = local129 + 15;
			arg1.method324(Static91.method1340(new Class74[] { Static50.aClass74_873, Static49.aClass74_853.method1712() }), 274, 281, 16777215, true);
			@Pc(171) int local171 = local150 + 15;
		}
		if (Static68.anInt1490 == 10) {
			Static77.aClass2_Sub2_Sub1_Sub1_33.method97(202, 171);
			if (Static31.anInt791 == 0) {
				local104 = 251;
				arg1.method317(Static52.aClass74_882, 382, 251, 16776960, true);
				local112 = local104 + 30;
				Static126.aClass2_Sub2_Sub1_Sub1_50.method97(229, 271);
				arg1.method311(Static10.aClass74_291, 229, 271, 144, 40, 16777215, true, 1, 1, 0);
				Static126.aClass2_Sub2_Sub1_Sub1_50.method97(389, 271);
				arg1.method311(Static39.aClass74_682, 389, 271, 144, 40, 16777215, true, 1, 1, 0);
			} else if (Static31.anInt791 == 2) {
				local104 = 211;
				arg1.method317(Static49.aClass74_849, 382, 211, 16776960, true);
				local112 = local104 + 15;
				arg1.method317(Static49.aClass74_847, 382, 226, 16776960, true);
				local112 += 15;
				arg1.method317(Static49.aClass74_851, 382, 241, 16776960, true);
				local112 += 15;
				local112 += 10;
				arg1.method324(Static91.method1340(new Class74[] { Static50.aClass74_874, Static49.aClass74_842, Static120.anInt2555 == 0 & Static107.anInt2338 % 40 < 20 ? Static86.aClass74_1259 : Static49.aClass74_843 }), 272, 266, 16777215, true);
				local112 += 15;
				arg1.method324(Static91.method1340(new Class74[] { Static50.aClass74_873, Static49.aClass74_853.method1712(), Static120.anInt2555 == 1 & Static107.anInt2338 % 40 < 20 ? Static86.aClass74_1259 : Static49.aClass74_843 }), 274, 281, 16777215, true);
				Static126.aClass2_Sub2_Sub1_Sub1_50.method97(229, 301);
				arg1.method317(Static1.aClass74_1396, 302, 326, 16777215, true);
				local112 += 15;
				Static126.aClass2_Sub2_Sub1_Sub1_50.method97(389, 301);
				arg1.method317(Static27.aClass74_530, 462, 326, 16777215, true);
			} else if (Static31.anInt791 == 3) {
				arg1.method317(Static87.aClass74_940, 382, 211, 16776960, true);
				local104 = 236;
				arg1.method317(Static91.aClass74_1308, 382, 236, 16777215, true);
				local112 = local104 + 15;
				arg1.method317(Static23.aClass74_502, 382, 251, 16777215, true);
				local112 += 15;
				arg1.method317(Static46.aClass74_774, 382, 266, 16777215, true);
				local112 += 15;
				arg1.method317(Static69.aClass74_1081, 382, 281, 16777215, true);
				local112 += 15;
				Static126.aClass2_Sub2_Sub1_Sub1_50.method97(309, 301);
				arg1.method317(Static27.aClass74_530, 382, 326, 16777215, true);
			}
		}
		if (Static36.anInt875 > 0) {
			Static21.method455(Static36.anInt875);
			Static36.anInt875 = 0;
		}
		Static126.method1924();
		Static37.aClass2_Sub2_Sub1_Sub1Array9[Static4.aBoolean6 ? 1 : 0].method97(725, 463);
		if (Static68.anInt1490 > 5 && Static54.anInt1321 != 2 && Static95.anInt2095 == 0) {
			if (aClass2_Sub2_Sub1_Sub1_44 == null) {
				aClass2_Sub2_Sub1_Sub1_44 = Static29.method517(Static49.aClass74_843, Static106.aClass74_1492, Static50.aClass26_Sub1_35);
			} else {
				aClass2_Sub2_Sub1_Sub1_44.method97(5, 463);
				arg1.method317(Static91.method1340(new Class74[] { Static126.aClass74_1704, Static45.aClass74_739, Static56.method940(Static45.anInt1033) }), 55, 478, 16777215, true);
				if (Static23.aClass57_1 == null) {
					arg0.method317(Static23.aClass74_510, 55, 492, 16777215, true);
				} else {
					arg0.method317(Static18.aClass74_441, 55, 492, 16777215, true);
				}
			}
		}
		try {
			@Pc(615) Graphics local615 = Static51.aCanvas2.getGraphics();
			Static97.aClass9_58.method1585(0, local615, 0);
		} catch (@Pc(623) Exception local623) {
			Static51.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!t", name = "d", descriptor = "(I)V")
	public static void method1676() {
		aClass74_1533 = null;
		aClass74_1534 = null;
		aClass26_Sub1_67 = null;
		aClass2_Sub2_Sub1_Sub1_44 = null;
		aClass35_1 = null;
		aClass74_1532 = null;
	}
}

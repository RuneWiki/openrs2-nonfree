import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!jf", name = "gb", descriptor = "I")
	public static int anInt3453;

	@OriginalMember(owner = "client!jf", name = "hb", descriptor = "[[[Lclient!dc;")
	public static Class51[][][] aClass51ArrayArrayArray2;

	@OriginalMember(owner = "client!jf", name = "N", descriptor = "Lclient!jg;")
	public static Class107 aClass107_17 = new Class107(64);

	@OriginalMember(owner = "client!jf", name = "U", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_81 = new Class140("wave:", "welle:", "ondulation:", "onda:");

	@OriginalMember(owner = "client!jf", name = "eb", descriptor = "I")
	public static final int anInt3451 = 1403;

	@OriginalMember(owner = "client!jf", name = "ib", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_82 = new Class140("K", "T", "K", "K");

	@OriginalMember(owner = "client!jf", name = "jb", descriptor = "Lclient!rg;")
	public static final Class172 aClass172_3 = new Class172("stellardawn", 1);

	@OriginalMember(owner = "client!jf", name = "kb", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_83 = new Class140("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "(I)V")
	public static void method3006() {
		Static114.method2241(Static18.aClass68_1);
		Static81.anInt1525++;
		if (Static280.aBoolean499 && Static193.aBoolean354) {
			@Pc(26) int local26 = Class1_Sub2_Sub5.lb.method2470();
			@Pc(30) int local30 = Class1_Sub2_Sub5.lb.method2466();
			local26 -= Static68.anInt1184;
			local30 -= Static214.anInt4719;
			@Pc(55) int local55;
			@Pc(59) int local59;
			if (Static81.anInt1525 > Static18.aClass68_1.anInt1882) {
				local55 = local26 - Static91.anInt1787;
				local59 = local30 - Static191.anInt4212;
				if (Static18.aClass68_1.anInt1852 < local55 || local55 < -Static18.aClass68_1.anInt1852 || local59 > Static18.aClass68_1.anInt1852 || local59 < -Static18.aClass68_1.anInt1852) {
					Static268.aBoolean489 = true;
				}
			}
			if (local26 < Static180.anInt4016) {
				local26 = Static180.anInt4016;
			}
			if (Static84.anInt1567 > local30) {
				local30 = Static84.anInt1567;
			}
			if (local26 + Static18.aClass68_1.anInt1874 > Static180.anInt4016 - -Static132.aClass68_20.anInt1874) {
				local26 = Static180.anInt4016 + Static132.aClass68_20.anInt1874 - Static18.aClass68_1.anInt1874;
			}
			if (Static84.anInt1567 + Static132.aClass68_20.anInt1845 < Static18.aClass68_1.anInt1845 + local30) {
				local30 = Static84.anInt1567 + Static132.aClass68_20.anInt1845 - Static18.aClass68_1.anInt1845;
			}
			local55 = Static132.aClass68_20.anInt1854 + local26 - Static180.anInt4016;
			local59 = Static132.aClass68_20.anInt1872 + local30 - Static84.anInt1567;
			@Pc(165) Class2_Sub41 local165;
			if (Static18.aClass68_1.anObjectArray22 != null && Static268.aBoolean489) {
				local165 = new Class2_Sub41();
				local165.aClass68_35 = Static18.aClass68_1;
				local165.anInt6102 = local55;
				local165.anObjectArray35 = Static18.aClass68_1.anObjectArray22;
				local165.anInt6105 = local59;
				Static367.method5890(local165);
			}
			if (!Class1_Sub2_Sub5.lb.method2464()) {
				if (Static268.aBoolean489) {
					if (Static18.aClass68_1.anObjectArray12 != null) {
						local165 = new Class2_Sub41();
						local165.aClass68_36 = Static114.aClass68_17;
						local165.anObjectArray35 = Static18.aClass68_1.anObjectArray12;
						local165.aClass68_35 = Static18.aClass68_1;
						local165.anInt6105 = local59;
						local165.anInt6102 = local55;
						Static367.method5890(local165);
					}
					if (Static114.aClass68_17 != null && Static46.method879(Static18.aClass68_1) != null) {
						Static60.method1274(Static114.aClass68_17, Static18.aClass68_1);
					}
				} else if ((Static163.anInt3758 == 1 || Static354.method5666()) && Static225.anInt4918 > 2) {
					Static227.method4203(Static68.anInt1184 + Static91.anInt1787, 2, Static214.anInt4719 + Static191.anInt4212);
				} else if (Static106.method2087()) {
					Static227.method4203(Static91.anInt1787 + Static68.anInt1184, 0, Static214.anInt4719 + Static191.anInt4212);
				}
				Static18.aClass68_1 = null;
			}
		} else if (Static81.anInt1525 > 1) {
			Static18.aClass68_1 = null;
		}
	}
}

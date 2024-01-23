import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!se", name = "A", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics3;

	@OriginalMember(owner = "client!se", name = "B", descriptor = "I")
	public static int anInt4752;

	@OriginalMember(owner = "client!se", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString155 = "Mechscape is loading - please wait...";

	@OriginalMember(owner = "client!se", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString156 = "Allocated memory";

	@OriginalMember(owner = "client!se", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString157 = "Hidden";

	@OriginalMember(owner = "client!se", name = "I", descriptor = "I")
	public static int anInt4756 = -2;

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(B)V")
	public static void method3717() {
		@Pc(14) int local14 = Static44.anInt848;
		@Pc(16) int local16 = Static143.anInt2824;
		@Pc(18) int local18 = Static78.anInt1455;
		@Pc(22) int local22 = Static66.anInt1303 - 3;
		if (Static219.aClass1_Sub1_Sub3_7 == null || Static213.aClass1_Sub1_Sub3_6 == null) {
			if (Static241.aClass138_64.method3340(Static252.anInt4940) && Static241.aClass138_64.method3340(Static122.anInt2470)) {
				Static219.aClass1_Sub1_Sub3_7 = Static223.method3506(Static252.anInt4940, Static241.aClass138_64);
				Static213.aClass1_Sub1_Sub3_6 = Static223.method3506(Static122.anInt2470, Static241.aClass138_64);
				if (Static291.aBoolean404) {
					if (Static219.aClass1_Sub1_Sub3_7 instanceof Class1_Sub1_Sub3_Sub2_Sub1) {
						Static219.aClass1_Sub1_Sub3_7 = new Class1_Sub1_Sub3_Sub1_Sub1((Class1_Sub1_Sub3_Sub2) Static219.aClass1_Sub1_Sub3_7);
					} else {
						Static219.aClass1_Sub1_Sub3_7 = new Class1_Sub1_Sub3_Sub1((Class1_Sub1_Sub3_Sub2) Static219.aClass1_Sub1_Sub3_7);
					}
					if (Static213.aClass1_Sub1_Sub3_6 instanceof Class1_Sub1_Sub3_Sub2_Sub1) {
						Static213.aClass1_Sub1_Sub3_6 = new Class1_Sub1_Sub3_Sub1_Sub1((Class1_Sub1_Sub3_Sub2) Static213.aClass1_Sub1_Sub3_6);
					} else {
						Static213.aClass1_Sub1_Sub3_6 = new Class1_Sub1_Sub3_Sub1((Class1_Sub1_Sub3_Sub2) Static213.aClass1_Sub1_Sub3_6);
					}
				}
			} else if (Static291.aBoolean404) {
				Static133.method2177(local16, local18, local14, 20, Static200.anInt5634, 256 - Static46.anInt890);
			} else {
				Static41.method728(local16, local18, local14, 20, Static200.anInt5634, 256 - Static46.anInt890);
			}
		}
		@Pc(128) int local128;
		@Pc(130) int local130;
		if (Static219.aClass1_Sub1_Sub3_7 != null && Static213.aClass1_Sub1_Sub3_6 != null) {
			local128 = (local14 - Static213.aClass1_Sub1_Sub3_6.anInt5875 * 2) / Static219.aClass1_Sub1_Sub3_7.anInt5875;
			for (local130 = 0; local130 < local128; local130++) {
				Static219.aClass1_Sub1_Sub3_7.method4628(Static219.aClass1_Sub1_Sub3_7.anInt5875 * local130 + Static213.aClass1_Sub1_Sub3_6.anInt5875 + local16, local18);
			}
			Static213.aClass1_Sub1_Sub3_6.method4628(local16, local18);
			Static213.aClass1_Sub1_Sub3_6.method4637(local16 + local14 - Static213.aClass1_Sub1_Sub3_6.anInt5875, local18);
		}
		Static245.aClass1_Sub1_Sub12_2.method4421(Static143.aString98, local16 + 3, local18 - -14, Static148.anInt2980, -1);
		if (Static291.aBoolean404) {
			Static133.method2177(local16, local18 + 20, local14, local22 - 20, Static200.anInt5634, 256 - Static46.anInt890);
		} else {
			Static41.method728(local16, local18 + 20, local14, local22 - 20, Static200.anInt5634, 256 - Static46.anInt890);
		}
		local128 = Static152.anInt3132;
		local130 = Static300.anInt5678;
		@Pc(219) int local219;
		@Pc(242) int local242;
		for (local219 = 0; local219 < Static316.anInt5941; local219++) {
			local242 = local18 + (Static316.anInt5941 + -1 + -local219) * 15 + 20 + 13;
			if (local128 > local16 && local14 + local16 > local128 && local242 - 13 < local130 && local242 + 3 > local130) {
				if (Static291.aBoolean404) {
					Static133.method2177(local16, local242 - 12, local14, 15, Static94.anInt1781, 256 - Static228.anInt709);
				} else {
					Static41.method728(local16, local242 - 12, local14, 15, Static94.anInt1781, 256 - Static228.anInt709);
				}
			}
		}
		if ((Static261.aClass1_Sub1_Sub3_8 == null || Static301.aClass1_Sub1_Sub3_10 == null || Static29.aClass1_Sub1_Sub3_1 == null) && Static241.aClass138_64.method3340(Static201.anInt4030) && Static241.aClass138_64.method3340(Static120.anInt2416) && Static241.aClass138_64.method3340(Static270.anInt5143)) {
			Static261.aClass1_Sub1_Sub3_8 = Static223.method3506(Static201.anInt4030, Static241.aClass138_64);
			Static301.aClass1_Sub1_Sub3_10 = Static223.method3506(Static120.anInt2416, Static241.aClass138_64);
			Static29.aClass1_Sub1_Sub3_1 = Static223.method3506(Static270.anInt5143, Static241.aClass138_64);
			if (Static291.aBoolean404) {
				if (Static261.aClass1_Sub1_Sub3_8 instanceof Class1_Sub1_Sub3_Sub2_Sub1) {
					Static261.aClass1_Sub1_Sub3_8 = new Class1_Sub1_Sub3_Sub1_Sub1((Class1_Sub1_Sub3_Sub2) Static261.aClass1_Sub1_Sub3_8);
				} else {
					Static261.aClass1_Sub1_Sub3_8 = new Class1_Sub1_Sub3_Sub1((Class1_Sub1_Sub3_Sub2) Static261.aClass1_Sub1_Sub3_8);
				}
				if (Static301.aClass1_Sub1_Sub3_10 instanceof Class1_Sub1_Sub3_Sub2_Sub1) {
					Static301.aClass1_Sub1_Sub3_10 = new Class1_Sub1_Sub3_Sub1_Sub1((Class1_Sub1_Sub3_Sub2) Static301.aClass1_Sub1_Sub3_10);
				} else {
					Static301.aClass1_Sub1_Sub3_10 = new Class1_Sub1_Sub3_Sub1((Class1_Sub1_Sub3_Sub2) Static301.aClass1_Sub1_Sub3_10);
				}
				if (Static29.aClass1_Sub1_Sub3_1 instanceof Class1_Sub1_Sub3_Sub2_Sub1) {
					Static29.aClass1_Sub1_Sub3_1 = new Class1_Sub1_Sub3_Sub1_Sub1((Class1_Sub1_Sub3_Sub2) Static29.aClass1_Sub1_Sub3_1);
				} else {
					Static29.aClass1_Sub1_Sub3_1 = new Class1_Sub1_Sub3_Sub1((Class1_Sub1_Sub3_Sub2) Static29.aClass1_Sub1_Sub3_1);
				}
			}
		}
		@Pc(455) int local455;
		if (Static261.aClass1_Sub1_Sub3_8 != null && Static301.aClass1_Sub1_Sub3_10 != null && Static29.aClass1_Sub1_Sub3_1 != null) {
			local219 = (local14 - Static29.aClass1_Sub1_Sub3_1.anInt5875 * 2) / Static261.aClass1_Sub1_Sub3_8.anInt5875;
			for (local242 = 0; local242 < local219; local242++) {
				Static261.aClass1_Sub1_Sub3_8.method4628(local242 * Static261.aClass1_Sub1_Sub3_8.anInt5875 + Static29.aClass1_Sub1_Sub3_1.anInt5875 + local16, local22 + local18 + -Static261.aClass1_Sub1_Sub3_8.anInt5887);
			}
			local242 = (local22 - Static29.aClass1_Sub1_Sub3_1.anInt5887 - 20) / Static301.aClass1_Sub1_Sub3_10.anInt5887;
			for (local455 = 0; local455 < local242; local455++) {
				Static301.aClass1_Sub1_Sub3_10.method4628(local16, local18 + local455 * Static301.aClass1_Sub1_Sub3_10.anInt5887 + 20);
				Static301.aClass1_Sub1_Sub3_10.method4637(local16 + local14 - Static301.aClass1_Sub1_Sub3_10.anInt5875, local455 * Static301.aClass1_Sub1_Sub3_10.anInt5887 + 20 + local18);
			}
			Static29.aClass1_Sub1_Sub3_1.method4628(local16, local22 + local18 - Static29.aClass1_Sub1_Sub3_1.anInt5887);
			Static29.aClass1_Sub1_Sub3_1.method4637(local16 + local14 - Static29.aClass1_Sub1_Sub3_1.anInt5875, -Static29.aClass1_Sub1_Sub3_1.anInt5887 + local22 + local18);
		}
		for (local219 = 0; local219 < Static316.anInt5941; local219++) {
			local242 = local18 + (Static316.anInt5941 + -1 - local219) * 15 + 13 + 20;
			local455 = Static148.anInt2980;
			if (local16 < local128 && local16 + local14 > local128 && local130 > local242 - 13 && local242 + 3 > local130) {
				local455 = Static296.anInt5594;
			}
			Static245.aClass1_Sub1_Sub12_2.method4421(Static190.method3114(local219), local16 + 3, local242, local455, 0);
		}
		Static247.method3813(Static44.anInt848, Static66.anInt1303, Static78.anInt1455, Static143.anInt2824);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!ph;I)V")
	public static void method3718(@OriginalArg(0) Class138 arg0) {
		Static124.aClass138_39 = arg0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IZ)V")
	public static void method3722(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub1_Sub2 local8 = Static46.method824(9, arg0);
		local8.method299();
	}

	@OriginalMember(owner = "client!se", name = "h", descriptor = "(I)V")
	public static void method3723() {
		@Pc(2) Class2 local2 = Static268.aClass2_5;
		synchronized (Static268.aClass2_5) {
			Static191.anInt3909 = Static190.anInt3899;
			Static209.anInt4120++;
			Static152.anInt3132 = Static302.anInt5719;
			Static300.anInt5678 = Static97.anInt1808;
			Static86.anInt1565 = Static217.anInt4270;
			Static84.anInt1530 = Static56.anInt1114;
			Static46.anInt894 = Static314.anInt5910;
			Static95.aLong195 = Static1.aLong6;
			Static217.anInt4270 = 0;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZIIII)V")
	public static void method3724(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= Static240.anInt1319 && arg0 <= Static59.anInt1155) {
			@Pc(20) int local20 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg1);
			@Pc(26) int local26 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg3);
			Static285.method4245(arg2, local20, arg0, local26);
		}
	}
}

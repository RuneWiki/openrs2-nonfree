import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Z)V")
	public static void method6598() {
		Static155.method2111(Class12_Sub2_Sub1_Sub3.lb);
		Static275.anInt4755++;
		if (Static258.aBoolean319 && Static469.aBoolean646) {
			@Pc(26) int local26 = Static205.aClass131_1.method6544();
			@Pc(30) int local30 = Static205.aClass131_1.method6542();
			local26 -= Static529.anInt8481;
			local30 -= Static385.anInt6376;
			if (Static490.anInt7768 > local26) {
				local26 = Static490.anInt7768;
			}
			if (local30 < Static434.anInt6970) {
				local30 = Static434.anInt6970;
			}
			if (local26 + Class12_Sub2_Sub1_Sub3.lb.anInt6883 > Static490.anInt7768 + Static344.aClass273_8.anInt6883) {
				local26 = Static344.aClass273_8.anInt6883 + Static490.anInt7768 - Class12_Sub2_Sub1_Sub3.lb.anInt6883;
			}
			if (Static344.aClass273_8.anInt6814 + Static434.anInt6970 < local30 + Class12_Sub2_Sub1_Sub3.lb.anInt6814) {
				local30 = Static434.anInt6970 + Static344.aClass273_8.anInt6814 - Class12_Sub2_Sub1_Sub3.lb.anInt6814;
			}
			@Pc(100) int local100 = Static344.aClass273_8.anInt6812 + local26 - Static490.anInt7768;
			@Pc(107) int local107 = local30 + Static344.aClass273_8.anInt6880 - Static434.anInt6970;
			@Pc(174) Class2_Sub10 local174;
			if (Static205.aClass131_1.method6538()) {
				if (Static275.anInt4755 > Class12_Sub2_Sub1_Sub3.lb.anInt6829) {
					@Pc(124) int local124 = local26 - Static371.anInt6214;
					@Pc(129) int local129 = local30 - Static472.anInt7587;
					if (local124 > Class12_Sub2_Sub1_Sub3.lb.anInt6876 || local124 < -Class12_Sub2_Sub1_Sub3.lb.anInt6876 || Class12_Sub2_Sub1_Sub3.lb.anInt6876 < local129 || -Class12_Sub2_Sub1_Sub3.lb.anInt6876 > local129) {
						Static489.aBoolean658 = true;
					}
				}
				if (Class12_Sub2_Sub1_Sub3.lb.anObjectArray24 != null && Static489.aBoolean658) {
					local174 = new Class2_Sub10();
					local174.anObjectArray1 = Class12_Sub2_Sub1_Sub3.lb.anObjectArray24;
					local174.anInt1609 = local100;
					local174.aClass273_4 = Class12_Sub2_Sub1_Sub3.lb;
					local174.anInt1606 = local107;
					Static566.method7398(local174);
					return;
				}
			} else {
				if (Static489.aBoolean658) {
					Static5.method84();
					if (Class12_Sub2_Sub1_Sub3.lb.anObjectArray6 != null) {
						local174 = new Class2_Sub10();
						local174.aClass273_4 = Class12_Sub2_Sub1_Sub3.lb;
						local174.anInt1606 = local107;
						local174.anObjectArray1 = Class12_Sub2_Sub1_Sub3.lb.anObjectArray6;
						local174.anInt1609 = local100;
						local174.aClass273_3 = Static310.aClass273_7;
						Static566.method7398(local174);
					}
					if (Static310.aClass273_7 != null && Static70.method1169(Class12_Sub2_Sub1_Sub3.lb) != null) {
						Static189.method2394(Class12_Sub2_Sub1_Sub3.lb, Static310.aClass273_7);
					}
				} else if ((Static304.anInt5055 == 1 || Static327.method4752()) && Static484.anInt7715 > 2) {
					Static9.method177(Static385.anInt6376 + Static472.anInt7587, Static529.anInt8481 + Static371.anInt6214);
				} else if (Static216.method7672()) {
					Static9.method177(Static385.anInt6376 + Static472.anInt7587, Static529.anInt8481 - -Static371.anInt6214);
				}
				Class12_Sub2_Sub1_Sub3.lb = null;
			}
		} else if (Static275.anInt4755 > 1) {
			Class12_Sub2_Sub1_Sub3.lb = null;
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIII)Z")
	public static boolean method6599(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!Static431.aBoolean567) {
			return false;
		} else if (Static427.anInt6937 < 100) {
			return false;
		} else {
			@Pc(22) int local22 = Static364.anIntArrayArrayArray7[arg1][arg2][arg0];
			if (local22 == -Static86.anInt1458) {
				return false;
			} else if (Static86.anInt1458 == local22) {
				return true;
			} else if (Static114.aClass151Array1 == Static320.aClass151Array3) {
				return false;
			} else {
				@Pc(47) int local47 = arg2 << Static562.anInt9207;
				@Pc(51) int local51 = arg0 << Static562.anInt9207;
				if (Static523.method6730(local51 + 1, Static481.anInt7681 + local47 - 1, local51 + Static481.anInt7681 - 1, local47 - -1, local47 + 1, Static114.aClass151Array1[arg1].method7676(arg0 + 1, arg2), Static114.aClass151Array1[arg1].method7676(arg0 + 1, arg2 - -1), Static114.aClass151Array1[arg1].method7676(arg0, arg2), Static481.anInt7681 + local51 - 1) && Static523.method6730(local51 + 1, Static481.anInt7681 + local47 - 1, local51 + Static481.anInt7681 - 1, local47 + (Static481.anInt7681 - 1), local47 + 1, Static114.aClass151Array1[arg1].method7676(arg0 + 1, arg2 + 1), Static114.aClass151Array1[arg1].method7676(arg0, arg2 + 1), Static114.aClass151Array1[arg1].method7676(arg0, arg2), local51 + 1)) {
					Static5.anInt96++;
					Static364.anIntArrayArrayArray7[arg1][arg2][arg0] = Static86.anInt1458;
					return true;
				} else {
					Static364.anIntArrayArrayArray7[arg1][arg2][arg0] = -Static86.anInt1458;
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(B)V")
	public static void method6600() {
		Static11.method218();
		Static123.method1657(Static257.aClass2_Sub35_Sub1_1.aBoolean639);
		Static382.aClass7_3 = Static467.method6016(Static169.aClass99_2, Static9.aCanvas1, 22050, 0);
		Static177.method2289(Static269.method3734(null));
		Static51.aClass7_1 = Static467.method6016(Static169.aClass99_2, Static9.aCanvas1, 2048, 1);
		Static51.aClass7_1.method6321(Static246.aClass2_Sub3_Sub4_2);
	}
}

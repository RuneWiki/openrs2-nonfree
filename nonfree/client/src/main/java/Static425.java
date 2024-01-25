import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "[Lclient!wa;")
	public static final Class2_Sub3_Sub19[] aClass2_Sub3_Sub19Array5 = new Class2_Sub3_Sub19[14];

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	public static void method4962() {
		Static515.method7134(Static288.aClass196_3);
		Static7.anInt333++;
		if (Static43.aBoolean627 && Static578.aBoolean720) {
			@Pc(28) int local28 = Static326.aClass149_1.method5879();
			@Pc(32) int local32 = Static326.aClass149_1.method5875();
			local28 -= Static403.anInt7032;
			local32 -= Static339.anInt2916;
			if (Static419.anInt6521 > local28) {
				local28 = Static419.anInt6521;
			}
			if (Static547.anInt6998 > local32) {
				local32 = Static547.anInt6998;
			}
			if (Static288.aClass196_3.anInt5130 + local28 > Static453.aClass196_8.anInt5130 + Static419.anInt6521) {
				local28 = Static419.anInt6521 + Static453.aClass196_8.anInt5130 - Static288.aClass196_3.anInt5130;
			}
			if (Static547.anInt6998 + Static453.aClass196_8.anInt5078 < local32 - -Static288.aClass196_3.anInt5078) {
				local32 = Static547.anInt6998 + Static453.aClass196_8.anInt5078 - Static288.aClass196_3.anInt5078;
			}
			@Pc(96) int local96 = local28 + Static453.aClass196_8.anInt5125 - Static419.anInt6521;
			@Pc(105) int local105 = local32 + Static453.aClass196_8.anInt5115 - Static547.anInt6998;
			@Pc(159) Class2_Sub31 local159;
			if (Static326.aClass149_1.method5877()) {
				if (Static7.anInt333 > Static288.aClass196_3.lb) {
					@Pc(125) int local125 = local28 - Static196.anInt3904;
					@Pc(130) int local130 = local32 - Static225.anInt4216;
					if (local125 > Static288.aClass196_3.anInt5091 || -Static288.aClass196_3.anInt5091 > local125 || local130 > Static288.aClass196_3.anInt5091 || local130 < -Static288.aClass196_3.anInt5091) {
						Static146.aBoolean241 = true;
					}
				}
				if (Static288.aClass196_3.anObjectArray7 != null && Static146.aBoolean241) {
					local159 = new Class2_Sub31();
					local159.anObjectArray32 = Static288.aClass196_3.anObjectArray7;
					local159.anInt6077 = local96;
					local159.aClass196_4 = Static288.aClass196_3;
					local159.anInt6076 = local105;
					Static552.method7490(local159);
					return;
				}
			} else {
				if (Static146.aBoolean241) {
					Static566.method7699();
					if (Static288.aClass196_3.anObjectArray29 != null) {
						local159 = new Class2_Sub31();
						local159.anObjectArray32 = Static288.aClass196_3.anObjectArray29;
						local159.aClass196_5 = Static49.aClass196_1;
						local159.anInt6076 = local105;
						local159.anInt6077 = local96;
						local159.aClass196_4 = Static288.aClass196_3;
						Static552.method7490(local159);
					}
					if (Static49.aClass196_1 != null && Static67.method1088(Static288.aClass196_3) != null) {
						Static78.method7562(Static49.aClass196_1, Static288.aClass196_3);
					}
				} else if ((Static224.anInt4203 == 1 || Static411.method5983()) && Static347.anInt6255 > 2) {
					Static277.method4189(Static196.anInt3904 + Static403.anInt7032, Static339.anInt2916 - -Static225.anInt4216);
				} else if (Static181.method3116()) {
					Static277.method4189(Static196.anInt3904 + Static403.anInt7032, Static225.anInt4216 + Static339.anInt2916);
				}
				Static288.aClass196_3 = null;
			}
		} else if (Static7.anInt333 > 1) {
			Static288.aClass196_3 = null;
		}
	}
}

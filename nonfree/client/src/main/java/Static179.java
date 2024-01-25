import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!gfa", name = "m", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_41 = new Class200(4, -2);

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "(I)V")
	public static void method3112() {
		Static482.method7193(Static608.aClass279_18);
		Static343.anInt6700++;
		if (Static376.aBoolean508 && Static465.aBoolean562) {
			@Pc(26) int local26 = 0;
			@Pc(28) int local28 = 0;
			if (Static219.aBoolean285) {
				local26 = Static30.method1089();
				local28 = Static166.method2921();
			}
			@Pc(43) int local43 = Static483.aClass191_1.method6989() + local26;
			@Pc(50) int local50 = Static483.aClass191_1.method6982() + local28;
			local50 -= Static448.anInt7978;
			local43 -= Static219.anInt4151;
			if (Static322.anInt6043 > local43) {
				local43 = Static322.anInt6043;
			}
			if (Static92.anInt2193 > local50) {
				local50 = Static92.anInt2193;
			}
			if (Static322.anInt6043 + Static220.aClass279_6.anInt8153 < Static608.aClass279_18.anInt8153 + local43) {
				local43 = Static220.aClass279_6.anInt8153 + Static322.anInt6043 - Static608.aClass279_18.anInt8153;
			}
			if (Static92.anInt2193 + Static220.aClass279_6.anInt8141 < local50 - -Static608.aClass279_18.anInt8141) {
				local50 = Static92.anInt2193 + Static220.aClass279_6.anInt8141 - Static608.aClass279_18.anInt8141;
			}
			@Pc(118) int local118 = local43 + Static220.aClass279_6.anInt8136 - Static322.anInt6043;
			@Pc(126) int local126 = local50 + Static220.aClass279_6.anInt8130 - Static92.anInt2193;
			@Pc(141) Class3_Sub21 local141;
			if (Static483.aClass191_1.method6981()) {
				if (Static343.anInt6700 > Static608.aClass279_18.anInt8182) {
					@Pc(221) int local221 = local43 - Static475.anInt8308;
					@Pc(226) int local226 = local50 - Static528.anInt9013;
					if (local221 > Static608.aClass279_18.anInt8195 || -Static608.aClass279_18.anInt8195 > local221 || local226 > Static608.aClass279_18.anInt8195 || -Static608.aClass279_18.anInt8195 > local226) {
						Static557.aBoolean671 = true;
					}
				}
				if (Static608.aClass279_18.anObjectArray15 != null && Static557.aBoolean671) {
					local141 = new Class3_Sub21();
					local141.anObjectArray1 = Static608.aClass279_18.anObjectArray15;
					local141.aClass279_5 = Static608.aClass279_18;
					local141.anInt2953 = local118;
					local141.anInt2947 = local126;
					Static304.method4843(local141);
				}
			} else {
				if (Static557.aBoolean671) {
					Static282.method4549();
					if (Static608.aClass279_18.anObjectArray9 != null) {
						local141 = new Class3_Sub21();
						local141.anInt2953 = local118;
						local141.aClass279_4 = Static600.aClass279_15;
						local141.anObjectArray1 = Static608.aClass279_18.anObjectArray9;
						local141.anInt2947 = local126;
						local141.aClass279_5 = Static608.aClass279_18;
						Static304.method4843(local141);
					}
					if (Static600.aClass279_15 != null && Static76.method1825(Static608.aClass279_18) != null) {
						Static194.method3338(Static608.aClass279_18, Static600.aClass279_15);
					}
				} else if ((Static583.anInt9564 == 1 || Static509.method7603()) && Static160.anInt3142 > 2) {
					Static322.method5268(Static528.anInt9013 + Static448.anInt7978, Static475.anInt8308 + Static219.anInt4151);
				} else if (Static155.method2822()) {
					Static322.method5268(Static528.anInt9013 + Static448.anInt7978, Static475.anInt8308 + Static219.anInt4151);
				}
				Static608.aClass279_18 = null;
			}
		} else if (Static343.anInt6700 > 1) {
			Static608.aClass279_18 = null;
		}
	}
}

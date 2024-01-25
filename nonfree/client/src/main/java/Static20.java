import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "[Lclient!f;")
	public static Class73[] aClass73Array2;

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "F")
	public static float aFloat5;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V")
	public static void method211() {
		Static566.aClass244_69.method5581();
		Static303.anInt5651 = 0;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IBI)I")
	public static int method212(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static259.anIntArray31[arg0 & 0x3] : Static586.anIntArray586[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V")
	public static void method213() {
		Static588.method8016(Static2.aClass251_1);
		Static514.anInt8866++;
		if (Static463.aBoolean557 && Static70.aBoolean157) {
			@Pc(28) int local28 = Static234.aClass54_4.method7306();
			@Pc(40) int local40 = Static234.aClass54_4.method7315();
			local40 -= Static369.anInt6482;
			local28 -= Static495.anInt8599;
			if (Static527.anInt10289 > local28) {
				local28 = Static527.anInt10289;
			}
			if (Static45.aClass251_3.anInt7285 + Static527.anInt10289 < Static2.aClass251_1.anInt7285 + local28) {
				local28 = Static45.aClass251_3.anInt7285 + Static527.anInt10289 - Static2.aClass251_1.anInt7285;
			}
			if (Static507.anInt8787 > local40) {
				local40 = Static507.anInt8787;
			}
			if (Static507.anInt8787 + Static45.aClass251_3.anInt7215 < local40 - -Static2.aClass251_1.anInt7215) {
				local40 = Static45.aClass251_3.anInt7215 + Static507.anInt8787 - Static2.aClass251_1.anInt7215;
			}
			@Pc(111) int local111 = local28 + Static45.aClass251_3.anInt7274 - Static527.anInt10289;
			@Pc(119) int local119 = Static45.aClass251_3.anInt7275 + local40 - Static507.anInt8787;
			@Pc(173) Class3_Sub36 local173;
			if (Static234.aClass54_4.method7313()) {
				if (Static2.aClass251_1.anInt7259 < Static514.anInt8866) {
					@Pc(135) int local135 = local28 - Static529.anInt9246;
					@Pc(140) int local140 = local40 - Static72.anInt1988;
					if (Static2.aClass251_1.anInt7211 < local135 || local135 < -Static2.aClass251_1.anInt7211 || Static2.aClass251_1.anInt7211 < local140 || -Static2.aClass251_1.anInt7211 > local140) {
						Static558.aBoolean641 = true;
					}
				}
				if (Static2.aClass251_1.anObjectArray5 != null && Static558.aBoolean641) {
					local173 = new Class3_Sub36();
					local173.anObjectArray1 = Static2.aClass251_1.anObjectArray5;
					local173.aClass251_8 = Static2.aClass251_1;
					local173.anInt6429 = local119;
					local173.anInt6425 = local111;
					Static583.method7919(local173);
					return;
				}
			} else {
				if (Static558.aBoolean641) {
					Static213.method3571();
					if (Static2.aClass251_1.anObjectArray31 != null) {
						local173 = new Class3_Sub36();
						local173.anObjectArray1 = Static2.aClass251_1.anObjectArray31;
						local173.aClass251_7 = Static43.aClass251_2;
						local173.anInt6429 = local119;
						local173.anInt6425 = local111;
						local173.aClass251_8 = Static2.aClass251_1;
						Static583.method7919(local173);
					}
					if (Static43.aClass251_2 != null && Static70.method1704(Static2.aClass251_1) != null) {
						Static82.method7633(Static2.aClass251_1, Static43.aClass251_2);
					}
				} else if ((Static103.anInt2586 == 1 || Static132.method2603()) && Static161.anInt3613 > 2) {
					Static441.method6148(Static369.anInt6482 + Static72.anInt1988, Static495.anInt8599 - -Static529.anInt9246);
				} else if (Static498.method5886()) {
					Static441.method6148(Static72.anInt1988 + Static369.anInt6482, Static495.anInt8599 + Static529.anInt9246);
				}
				Static2.aClass251_1 = null;
			}
		} else if (Static514.anInt8866 > 1) {
			Static2.aClass251_1 = null;
		}
	}
}

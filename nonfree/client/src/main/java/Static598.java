import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static598 {

	@OriginalMember(owner = "client!ufa", name = "f", descriptor = "D")
	public static double aDouble20;

	@OriginalMember(owner = "client!ufa", name = "e", descriptor = "[Lclient!b;")
	public static final Class28[] aClass28Array1 = new Class28[8];

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "I")
	public static int anInt10029 = 0;

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)V")
	public static void method8618() {
		Static298.method4399(Static370.aClass73_22);
		Static408.anInt7078++;
		if (Static50.aBoolean68 && Static433.aBoolean571) {
			@Pc(30) int local30 = 0;
			@Pc(39) int local39 = 0;
			if (Static40.aBoolean61) {
				local30 = Static169.method2467();
				local39 = Static375.method5510();
			}
			@Pc(53) int local53 = local30 + Static205.aClass107_1.method4079();
			@Pc(59) int local59 = local39 + Static205.aClass107_1.method4072();
			local59 -= Static59.anInt893;
			local53 -= Static665.anInt10653;
			if (Static550.anInt9295 > local53) {
				local53 = Static550.anInt9295;
			}
			if (Static142.aClass73_6.anInt1384 + Static550.anInt9295 < local53 - -Static370.aClass73_22.anInt1384) {
				local53 = Static142.aClass73_6.anInt1384 + Static550.anInt9295 - Static370.aClass73_22.anInt1384;
			}
			if (Static126.anInt1985 > local59) {
				local59 = Static126.anInt1985;
			}
			if (Static126.anInt1985 + Static142.aClass73_6.anInt1394 < local59 + Static370.aClass73_22.anInt1394) {
				local59 = Static142.aClass73_6.anInt1394 + Static126.anInt1985 - Static370.aClass73_22.anInt1394;
			}
			@Pc(123) int local123 = local53 + Static142.aClass73_6.anInt1376 - Static550.anInt9295;
			@Pc(131) int local131 = Static142.aClass73_6.anInt1340 + local59 - Static126.anInt1985;
			@Pc(205) Class5_Sub3 local205;
			if (Static205.aClass107_1.method4071()) {
				if (Static370.aClass73_22.anInt1366 < Static408.anInt7078) {
					@Pc(149) int local149 = local53 - Static504.anInt8681;
					@Pc(154) int local154 = local59 - Static665.anInt10649;
					if (Static370.aClass73_22.anInt1329 < local149 || -Static370.aClass73_22.anInt1329 > local149 || local154 > Static370.aClass73_22.anInt1329 || -Static370.aClass73_22.anInt1329 > local154) {
						Static161.aBoolean202 = true;
					}
				}
				if (Static370.aClass73_22.anObjectArray33 != null && Static161.aBoolean202) {
					local205 = new Class5_Sub3();
					local205.anObjectArray1 = Static370.aClass73_22.anObjectArray33;
					local205.aClass73_1 = Static370.aClass73_22;
					local205.anInt321 = local123;
					local205.anInt323 = local131;
					Static173.method2520(local205);
					return;
				}
			} else {
				if (Static161.aBoolean202) {
					Static179.method2592();
					if (Static370.aClass73_22.anObjectArray24 != null) {
						local205 = new Class5_Sub3();
						local205.aClass73_1 = Static370.aClass73_22;
						local205.anInt321 = local123;
						local205.anInt323 = local131;
						local205.anObjectArray1 = Static370.aClass73_22.anObjectArray24;
						local205.aClass73_2 = Static168.aClass73_8;
						Static173.method2520(local205);
					}
					if (Static168.aClass73_8 != null && Static81.method1254(Static370.aClass73_22) != null) {
						Static647.method9024(Static370.aClass73_22, Static168.aClass73_8);
					}
				} else if ((Static654.anInt10547 == 1 || Static561.method8125()) && Static481.anInt8130 > 2) {
					Static196.method2829(Static665.anInt10653 + Static504.anInt8681, Static665.anInt10649 + Static59.anInt893);
				} else if (Static679.method9323()) {
					Static196.method2829(Static665.anInt10653 + Static504.anInt8681, Static665.anInt10649 + Static59.anInt893);
				}
				Static370.aClass73_22 = null;
			}
		} else if (Static408.anInt7078 > 1) {
			Static370.aClass73_22 = null;
		}
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Z)V")
	public static void method8620() {
		if (!Static201.aBoolean265) {
			Static149.aFloat23 += (-Static149.aFloat23 - 12.0F) / 2.0F;
			Static201.aBoolean265 = true;
			Static258.aBoolean347 = true;
		}
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(BI)V")
	public static void method8621(@OriginalArg(1) int arg0) {
		@Pc(17) Class5_Sub5_Sub6 local17 = Static478.method6972((long) arg0, 4);
		local17.method2686();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!cba", name = "D", descriptor = "Lclient!lc;")
	public static Class200 aClass200_15 = null;

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(BZ)V")
	public static void method1646(@OriginalArg(1) boolean arg0) {
		for (@Pc(6) Class3_Sub22 local6 = (Class3_Sub22) Static511.aClass223_55.method5874(); local6 != null; local6 = (Class3_Sub22) Static511.aClass223_55.method5870()) {
			if (local6.aClass3_Sub7_Sub3_1 != null) {
				Static204.aClass3_Sub7_Sub1_1.method1621(local6.aClass3_Sub7_Sub3_1);
				local6.aClass3_Sub7_Sub3_1 = null;
			}
			if (local6.aClass3_Sub7_Sub3_2 != null) {
				Static204.aClass3_Sub7_Sub1_1.method1621(local6.aClass3_Sub7_Sub3_2);
				local6.aClass3_Sub7_Sub3_2 = null;
			}
			local6.method8769();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(49) Class3_Sub22 local49 = (Class3_Sub22) Static456.aClass223_48.method5874(); local49 != null; local49 = (Class3_Sub22) Static456.aClass223_48.method5870()) {
			if (local49.aClass3_Sub7_Sub3_1 != null) {
				Static204.aClass3_Sub7_Sub1_1.method1621(local49.aClass3_Sub7_Sub3_1);
				local49.aClass3_Sub7_Sub3_1 = null;
			}
			local49.method8769();
		}
		for (@Pc(76) Class3_Sub22 local76 = (Class3_Sub22) Static613.aClass280_47.method7110(); local76 != null; local76 = (Class3_Sub22) Static613.aClass280_47.method7108()) {
			if (local76.aClass3_Sub7_Sub3_1 != null) {
				Static204.aClass3_Sub7_Sub1_1.method1621(local76.aClass3_Sub7_Sub3_1);
				local76.aClass3_Sub7_Sub3_1 = null;
			}
			local76.method8769();
		}
	}
}

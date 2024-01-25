import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "Lclient!tb;")
	public static final Class313 aClass313_48 = new Class313(64);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
	public static void method6797() {
		try {
			@Pc(17) int local17;
			if (Static409.anInt7111 == 1) {
				local17 = Static396.aClass2_Sub10_Sub2_3.method1560();
				if (local17 > 0 && Static396.aClass2_Sub10_Sub2_3.method1558()) {
					local17 -= Static206.anInt4003;
					if (local17 < 0) {
						local17 = 0;
					}
					Static396.aClass2_Sub10_Sub2_3.method1531(local17);
					return;
				}
				Static396.aClass2_Sub10_Sub2_3.method1533();
				Static396.aClass2_Sub10_Sub2_3.method1532();
				Static77.aClass257_140 = null;
				Static15.aClass2_Sub49_1 = null;
				if (Static554.aClass259_166 == null) {
					Static409.anInt7111 = 0;
				} else {
					Static409.anInt7111 = 2;
				}
			}
			if (Static409.anInt7111 == 3) {
				local17 = Static396.aClass2_Sub10_Sub2_3.method1560();
				if (local17 < Static526.anInt8654 && Static396.aClass2_Sub10_Sub2_3.method1558()) {
					local17 += Static103.anInt2117;
					if (local17 > Static526.anInt8654) {
						local17 = Static526.anInt8654;
					}
					Static396.aClass2_Sub10_Sub2_3.method1531(local17);
				} else {
					Static103.anInt2117 = 0;
					Static409.anInt7111 = 0;
				}
			}
		} catch (@Pc(102) Exception local102) {
			local102.printStackTrace();
			Static396.aClass2_Sub10_Sub2_3.method1533();
			Static554.aClass259_166 = null;
			Static15.aClass2_Sub49_1 = null;
			Static409.anInt7111 = 0;
			Static77.aClass257_140 = null;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BI)Lclient!pk;")
	public static Class258 method6799(@OriginalArg(1) int arg0) {
		@Pc(16) Class258[] local16 = Static20.method6759();
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Class258 local24 = local16[local18];
			if (arg0 == local24.anInt7113) {
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)V")
	public static void method6800() {
		Static493.aClass313_53.method6983();
		Static167.aClass313_21.method6983();
		Static545.aClass313_56.method6983();
		Static545.aClass313_57.method6983();
	}
}

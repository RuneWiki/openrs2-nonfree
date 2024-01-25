import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_49 = new Class160(60, -1);

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
	public static void method1714() {
		Static605.anInt7003 = -1;
		Static60.anInt998 = -1;
		Static494.anInt8618 = -1;
		Static553.anInt9258 = 0;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZI)V")
	public static void method1715(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static358.anInt6145 != -1) {
				Static37.method652(Static358.anInt6145);
			}
			for (@Pc(16) Class14_Sub13 local16 = (Class14_Sub13) Static27.aClass125_3.method2633(); local16 != null; local16 = (Class14_Sub13) Static27.aClass125_3.method2627()) {
				if (!local16.method9512()) {
					local16 = (Class14_Sub13) Static27.aClass125_3.method2633();
					if (local16 == null) {
						break;
					}
				}
				Static69.method1092(local16, false, true);
			}
			Static358.anInt6145 = -1;
			Static27.aClass125_3 = new Class125(8);
			Static155.method2235();
			Static358.anInt6145 = Static551.aClass355_1.anInt9856;
			Static379.method5835(false);
			Static438.method6532();
			Static672.method9294(Static358.anInt6145);
		}
		Static669.aBoolean764 = true;
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V")
	public static void method1716() {
		Static138.method2083();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)Z")
	public static boolean method1717() {
		return Static625.anInt11174 == 0 ? Static472.aClass14_Sub1_Sub3_3.method1889() : true;
	}
}

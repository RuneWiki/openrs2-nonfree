import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!ir", name = "o", descriptor = "I")
	public static int anInt5051;

	@OriginalMember(owner = "client!ir", name = "g", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_57 = new Class341(59, 3);

	@OriginalMember(owner = "client!ir", name = "p", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray27 = new String[5];

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZI)V")
	public static void method4567(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static567.anInt9844 != -1) {
				Static647.method9533(Static567.anInt9844);
			}
			for (@Pc(15) Class2_Sub20 local15 = (Class2_Sub20) Static507.aClass335_33.method8358(); local15 != null; local15 = (Class2_Sub20) Static507.aClass335_33.method8355()) {
				if (!local15.method9823()) {
					local15 = (Class2_Sub20) Static507.aClass335_33.method8358();
					if (local15 == null) {
						break;
					}
				}
				Static349.method6045(false, local15, true);
			}
			Static567.anInt9844 = -1;
			Static507.aClass335_33 = new Class335(8);
			Static540.method8292();
			Static567.anInt9844 = Static230.anInt4621;
			Static94.method1626(false);
			Static403.method6620();
			Static518.method8028(Static567.anInt9844);
		}
		Static436.aBoolean589 = true;
	}
}

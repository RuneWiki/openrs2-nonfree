import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!mv", name = "o", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_88 = new Class71(89, 6);

	@OriginalMember(owner = "client!mv", name = "q", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_89 = new Class71(62, -2);

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(ZI)V")
	public static void method5561(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static212.anInt4965 != -1) {
				Static297.method4905(Static212.anInt4965);
			}
			for (@Pc(24) Class8_Sub51 local24 = (Class8_Sub51) Static218.aClass253_14.method6593(); local24 != null; local24 = (Class8_Sub51) Static218.aClass253_14.method6595()) {
				if (!local24.method8639()) {
					local24 = (Class8_Sub51) Static218.aClass253_14.method6593();
					if (local24 == null) {
						break;
					}
				}
				Static406.method6452(true, local24, false);
			}
			Static212.anInt4965 = -1;
			Static218.aClass253_14 = new Class253(8);
			Static348.method5528();
			Static212.anInt4965 = Static378.anInt7229;
			Static131.method2902(false);
			Static121.method2707();
			Static273.method4691(Static212.anInt4965);
		}
		Static191.aString57 = "";
		Static95.aString32 = "";
		Static617.aBoolean747 = false;
		Static385.method8097();
		Static341.anInt6662 = -1;
		Static30.method1110(Static553.anInt9618);
		Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2 = new Class15_Sub1_Sub2_Sub2_Sub1();
		Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10298 = Static218.anInt5023 * 512 / 2;
		Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10301 = Static372.anInt7082 * 512 / 2;
		Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anIntArray435[0] = Static372.anInt7082 / 2;
		Static377.anInt7114 = 0;
		Static637.anInt10650 = 0;
		Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anIntArray436[0] = Static218.anInt5023 / 2;
		if (Static427.anInt8005 == 2) {
			Static637.anInt10650 = Static7.anInt6410 << 9;
			Static377.anInt7114 = Static243.anInt5395 << 9;
		} else {
			Static54.method1597();
		}
		Static364.method5679();
	}
}

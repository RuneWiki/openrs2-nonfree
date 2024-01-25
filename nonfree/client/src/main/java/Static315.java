import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static315 {

	@OriginalMember(owner = "client!le", name = "e", descriptor = "Lclient!fba;")
	public static final Class102 aClass102_36 = new Class102(128, 4);

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
	public static void method5161() {
		if (Static402.anInt7435 == 1 || Static402.anInt7435 == 3 || Static345.anInt6725 != Static402.anInt7435 && (Static402.anInt7435 == 0 || Static345.anInt6725 == 0)) {
			Static94.anInt2209 = 0;
			Static294.anInt5193 = 0;
			Static551.aClass280_43.method7100();
		}
		Static345.anInt6725 = Static402.anInt7435;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(III)Z")
	public static boolean method5167(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}
}

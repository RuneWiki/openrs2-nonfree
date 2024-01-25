import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!raa", name = "o", descriptor = "Lclient!ni;")
	public static Class223 aClass223_112;

	@OriginalMember(owner = "client!raa", name = "p", descriptor = "I")
	public static int anInt8531;

	@OriginalMember(owner = "client!raa", name = "q", descriptor = "Lclient!ni;")
	public static Class223 aClass223_113;

	@OriginalMember(owner = "client!raa", name = "j", descriptor = "Lclient!o;")
	public static final Class234 aClass234_12 = new Class234();

	@OriginalMember(owner = "client!raa", name = "r", descriptor = "I")
	public static final int anInt8532 = 1403;

	@OriginalMember(owner = "client!raa", name = "s", descriptor = "[Lclient!lv;")
	public static final Class192[] aClass192Array1 = new Class192[4];

	@OriginalMember(owner = "client!raa", name = "c", descriptor = "(I)V")
	public static void method7109() {
		@Pc(5) int local5;
		if (Static455.aClass169Array4 != null) {
			for (local5 = 0; local5 < Static593.anInt10029; local5++) {
				Static455.aClass169Array4[local5] = null;
			}
			Static455.aClass169Array4 = null;
		}
		if (Static321.aClass169Array2 != null) {
			for (local5 = 0; local5 < Static574.anInt9809; local5++) {
				Static321.aClass169Array2[local5] = null;
			}
			Static321.aClass169Array2 = null;
		}
		if (Static170.aClass169Array1 != null) {
			for (local5 = 0; local5 < Static201.anInt7302; local5++) {
				Static170.aClass169Array1[local5] = null;
			}
			Static170.aClass169Array1 = null;
		}
		Static383.aClass169Array3 = null;
		Static401.anIntArray371 = null;
		Static115.anInt2983 = -1;
		Static35.anInt884 = -1;
		Static483.anIntArrayArrayArray14 = null;
	}

	@OriginalMember(owner = "client!raa", name = "c", descriptor = "(B)Lclient!nha;")
	public static Class222 method7112() {
		try {
			return (Class222) Class.forName("Class222_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}

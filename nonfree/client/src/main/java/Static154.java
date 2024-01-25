import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!hp", name = "D", descriptor = "I")
	public static int anInt2945;

	@OriginalMember(owner = "client!hp", name = "M", descriptor = "[I")
	public static int[] anIntArray246;

	@OriginalMember(owner = "client!hp", name = "N", descriptor = "I")
	public static int anInt2952;

	@OriginalMember(owner = "client!hp", name = "I", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_92 = new Class186(36, -2);

	@OriginalMember(owner = "client!hp", name = "K", descriptor = "Z")
	public static boolean aBoolean211 = false;

	@OriginalMember(owner = "client!hp", name = "i", descriptor = "(I)V")
	public static void method2309() {
		if (Static16.aClass30_11 == null) {
			return;
		}
		Static43.aClass27_2.method734();
		Static2.method5381();
		Static307.method5820();
		Static13.method324();
		Static427.method5502();
		Static301.method4180();
		if (Static132.aClass129_1 != null) {
			Static132.aClass129_1.method2795();
		}
		Static119.method1853();
		Static13.method325();
		Static49.method1024();
		Static455.method5875(false);
		Static282.method3777();
		for (@Pc(33) int local33 = 0; local33 < 2048; local33++) {
			@Pc(39) Class6_Sub2_Sub1_Sub1 local39 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local33];
			if (local39 != null) {
				local39.aClass4_Sub13_3 = null;
				for (@Pc(46) int local46 = 0; local46 < local39.aClass7Array3.length; local46++) {
					local39.aClass7Array3[local46] = null;
				}
			}
		}
		for (@Pc(65) int local65 = 0; local65 < Static176.aClass6_Sub2_Sub1_Sub2Array1.length; local65++) {
			@Pc(71) Class6_Sub2_Sub1_Sub2 local71 = Static176.aClass6_Sub2_Sub1_Sub2Array1[local65];
			if (local71 != null) {
				for (@Pc(75) int local75 = 0; local75 < local71.aClass7Array3.length; local75++) {
					local71.aClass7Array3[local75] = null;
				}
			}
		}
		Static16.aClass30_11.method4695();
		Static16.aClass30_11 = null;
	}
}

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!jf", name = "R", descriptor = "Lclient!la;")
	public static Class2_Sub12 aClass2_Sub12_1;

	@OriginalMember(owner = "client!jf", name = "I", descriptor = "I")
	public static int anInt1819 = 0;

	@OriginalMember(owner = "client!jf", name = "O", descriptor = "Lclient!wg;")
	public static Class2_Sub25 aClass2_Sub25_1 = new Class2_Sub25(0, 0);

	@OriginalMember(owner = "client!jf", name = "Q", descriptor = "Z")
	public static boolean aBoolean79 = true;

	@OriginalMember(owner = "client!jf", name = "S", descriptor = "Lclient!cd;")
	public static Class10 aClass10_797 = Static51.method932("Weiter");

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V")
	public static void method1280() {
		@Pc(22) int local22;
		for (@Pc(12) int local12 = -1; local12 < Static54.anInt1354; local12++) {
			if (local12 == -1) {
				local22 = 2047;
			} else {
				local22 = Static66.anIntArray175[local12];
			}
			@Pc(30) Class2_Sub1_Sub3_Sub2_Sub1 local30 = Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local22];
			if (local30 != null && local30.anInt3459 > 0) {
				local30.anInt3459--;
				if (local30.anInt3459 == 0) {
					local30.aClass10_1514 = null;
				}
			}
		}
		for (local22 = 0; local22 < Static64.anInt1578; local22++) {
			@Pc(66) int local66 = Static8.anIntArray15[local22];
			@Pc(70) Class2_Sub1_Sub3_Sub2_Sub2 local70 = Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local66];
			if (local70 != null && local70.anInt3459 > 0) {
				local70.anInt3459--;
				if (local70.anInt3459 == 0) {
					local70.aClass10_1514 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)V")
	public static void method1282() {
		aClass2_Sub25_1 = null;
		aClass10_797 = null;
		aClass2_Sub12_1 = null;
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(B)V")
	public static void method1283() {
		Static128.aClass72_21.method2261();
	}
}

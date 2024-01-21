import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
	public static int anInt3629;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1204 = Static170.method3101(": ");

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1205 = Static170.method3101("blaugr-Un:");

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1206 = Static170.method3101("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1207 = Static170.method3101("Loading config )2 ");

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1208 = Static170.method3101("AUS");

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1209 = Static170.method3101("(U2");

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1210 = aClass28_1207;

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1211 = Static170.method3101("Titelbild geladen)3");

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
	public static void method2769() {
		for (@Pc(8) Class3_Sub2_Sub1_Sub3 local8 = (Class3_Sub2_Sub1_Sub3) Static166.aClass23_16.method858(); local8 != null; local8 = (Class3_Sub2_Sub1_Sub3) Static166.aClass23_16.method861()) {
			if (Static171.anInt4109 != local8.anInt2251 || local8.anInt2248 < Static14.anInt481) {
				local8.method3167();
			} else if (local8.anInt2254 <= Static14.anInt481) {
				if (local8.anInt2247 > 0) {
					@Pc(35) Class3_Sub2_Sub1_Sub2_Sub2 local35 = Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[local8.anInt2247 - 1];
					if (local35 != null && local35.anInt1800 >= 0 && local35.anInt1800 < 13312 && local35.anInt1792 >= 0 && local35.anInt1792 < 13312) {
						local8.method1731(Static33.method848(local35.anInt1800, local8.anInt2251, local35.anInt1792) - local8.anInt2257, local35.anInt1792, Static14.anInt481, local35.anInt1800);
					}
				}
				if (local8.anInt2247 < 0) {
					@Pc(87) int local87 = -local8.anInt2247 - 1;
					@Pc(92) Class3_Sub2_Sub1_Sub2_Sub1 local92;
					if (local87 == Static155.anInt3857) {
						local92 = Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1;
					} else {
						local92 = Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[local87];
					}
					if (local92 != null && local92.anInt1800 >= 0 && local92.anInt1800 < 13312 && local92.anInt1792 >= 0 && local92.anInt1792 < 13312) {
						local8.method1731(Static33.method848(local92.anInt1800, local8.anInt2251, local92.anInt1792) - local8.anInt2257, local92.anInt1792, Static14.anInt481, local92.anInt1800);
					}
				}
				local8.method1730(Static165.anInt3991);
				Static63.method1494(Static171.anInt4109, (int) local8.aDouble2, (int) local8.aDouble1, (int) local8.aDouble7, 60, local8, local8.anInt2258, -1L, false);
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V")
	public static void method2770() {
		aClass28_1207 = null;
		aClass28_1209 = null;
		aClass28_1204 = null;
		aClass28_1211 = null;
		aClass28_1208 = null;
		aClass28_1210 = null;
		aClass28_1206 = null;
		aClass28_1205 = null;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZI)Z")
	public static boolean method2771(@OriginalArg(1) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}
}

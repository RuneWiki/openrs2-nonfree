import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!ih", name = "O", descriptor = "Lclient!fc;")
	public static Class73 aClass73_7;

	@OriginalMember(owner = "client!ih", name = "L", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_86 = new Class208(88, 8);

	@OriginalMember(owner = "client!ih", name = "M", descriptor = "I")
	public static int anInt3136 = 0;

	@OriginalMember(owner = "client!ih", name = "P", descriptor = "I")
	public static int anInt3137 = 0;

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V")
	public static void method2658() {
		Static140.aClass41_36.method825();
	}

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "(B)V")
	public static void method2659() {
		if (Static121.anInt6774 == 10 || Static121.anInt6774 == 28) {
			Static371.method5908(Static27.anInt2842 >> 10, Static145.anInt5345 >> 10);
		} else {
			@Pc(25) int local25 = Static182.aClass1_Sub2_Sub1_Sub1_1.anIntArray466[0] >> 3;
			@Pc(32) int local32 = Static182.aClass1_Sub2_Sub1_Sub1_1.anIntArray465[0] >> 3;
			if (local25 >= 0 && local25 < Static89.anInt1891 >> 3 && local32 >= 0 && local32 < Static85.anInt1839 >> 3) {
				Static371.method5908(local32, local25);
			} else {
				Static371.method5908(Static85.anInt1839 >> 4, Static89.anInt1891 >> 4);
			}
		}
		Static391.method6123();
		Static270.method4571();
		Static355.method5616();
		Static102.method1834();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)V")
	public static void method2660() {
		Static120.aClass41_29.method826(5);
	}
}

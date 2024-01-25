import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!mo", name = "i", descriptor = "I")
	public static int anInt4261;

	@OriginalMember(owner = "client!mo", name = "v", descriptor = "Lclient!lc;")
	public static Class147 aClass147_1;

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "Lclient!ft;")
	public static final Class88 aClass88_35 = new Class88();

	@OriginalMember(owner = "client!mo", name = "r", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_70 = new Class186(64, 1);

	@OriginalMember(owner = "client!mo", name = "s", descriptor = "I")
	public static int anInt4268 = -1;

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "(I)V")
	public static void method3868() {
		Static449.aClass6_Sub15_Sub1_2.anInt3487 = 0;
		Static337.anInt5664 = 0;
		Static325.aClass186_94 = null;
		Static344.anInt5771 = 0;
		Static96.anInt1785 = 0;
		Static314.aClass186_127 = null;
		Static106.aClass186_44 = null;
		Static55.aClass6_Sub15_Sub1_1.anInt3487 = 0;
		Static407.aClass186_122 = null;
		Static412.method5599();
		Static220.method3381();
		for (@Pc(31) int local31 = 0; local31 < 2048; local31++) {
			Static355.aClass3_Sub3_Sub6_Sub1Array1[local31] = null;
		}
		Static134.aClass3_Sub3_Sub6_Sub1_1 = null;
		for (@Pc(47) int local47 = 0; local47 < Static450.aClass3_Sub3_Sub6_Sub2Array1.length; local47++) {
			@Pc(55) Class3_Sub3_Sub6_Sub2 local55 = Static450.aClass3_Sub3_Sub6_Sub2Array1[local47];
			if (local55 != null) {
				local55.anInt6690 = -1;
			}
		}
		Static301.method2517();
		Static9.anInt164 = 1;
		Static260.method4007(30);
		for (@Pc(74) int local74 = 0; local74 < 100; local74++) {
			Static194.aBooleanArray25[local74] = true;
		}
		Static65.method1237();
		Static274.aLong150 = 0L;
		Static361.aClass6_Sub22_2 = null;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V")
	public static void method3870() {
		for (@Pc(10) Class6_Sub43 local10 = (Class6_Sub43) Static203.aClass88_32.method1882(); local10 != null; local10 = (Class6_Sub43) Static203.aClass88_32.method1891()) {
			if (local10.anInt6919 > 0) {
				local10.anInt6919--;
			}
			if (local10.anInt6919 != 0) {
				if (local10.anInt6922 > 0) {
					local10.anInt6922--;
				}
				if (local10.anInt6922 == 0 && local10.anInt6925 >= 1 && local10.anInt6918 >= 1 && Static84.anInt1632 - 2 >= local10.anInt6925 && local10.anInt6918 <= Static261.anInt4480 - 2 && (local10.anInt6923 < 0 || Static443.method5937(local10.anInt6923, local10.anInt6920))) {
					Static9.method129(local10.anInt6918, local10.anInt6920, local10.anInt6914, local10.anInt6917, local10.anInt6923, local10.anInt6915, -1, local10.anInt6925);
					local10.anInt6922 = -1;
					if (local10.anInt6916 == local10.anInt6923 && local10.anInt6916 == -1) {
						local10.method5977();
					} else if (local10.anInt6916 == local10.anInt6923 && local10.anInt6917 == local10.anInt6921 && local10.anInt6926 == local10.anInt6920) {
						local10.method5977();
					}
				}
			} else if (local10.anInt6916 < 0 || Static443.method5937(local10.anInt6916, local10.anInt6926)) {
				Static9.method129(local10.anInt6918, local10.anInt6926, local10.anInt6914, local10.anInt6921, local10.anInt6916, local10.anInt6915, -1, local10.anInt6925);
				local10.method5977();
			}
		}
	}
}

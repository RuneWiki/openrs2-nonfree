import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "[Lclient!vp;")
	public static Class16_Sub6_Sub1_Sub1[] aClass16_Sub6_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
	public static int anInt3063 = 1;

	@OriginalMember(owner = "client!fb", name = "A", descriptor = "Z")
	public static boolean aBoolean241 = false;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	public static void method2627() {
		try {
			@Pc(15) int local15;
			if (Static275.anInt5095 == 1) {
				local15 = Static191.aClass2_Sub11_Sub1_2.method1503();
				if (local15 > 0 && Static191.aClass2_Sub11_Sub1_2.method1530()) {
					local15 -= Static40.anInt841;
					if (local15 < 0) {
						local15 = 0;
					}
					Static191.aClass2_Sub11_Sub1_2.method1510(local15);
					return;
				}
				Static191.aClass2_Sub11_Sub1_2.method1525();
				Static191.aClass2_Sub11_Sub1_2.method1537();
				if (Static510.aClass238_229 == null) {
					Static275.anInt5095 = 0;
				} else {
					Static275.anInt5095 = 2;
				}
				Static158.aClass2_Sub48_2 = null;
				Static379.aClass58_1 = null;
			}
			if (Static275.anInt5095 == 3) {
				local15 = Static191.aClass2_Sub11_Sub1_2.method1503();
				if (local15 < Static64.anInt1727 && Static191.aClass2_Sub11_Sub1_2.method1530()) {
					local15 += Static114.anInt2410;
					if (local15 > Static64.anInt1727) {
						local15 = Static64.anInt1727;
					}
					Static191.aClass2_Sub11_Sub1_2.method1510(local15);
				} else {
					Static114.anInt2410 = 0;
					Static275.anInt5095 = 0;
				}
			}
		} catch (@Pc(100) Exception local100) {
			local100.printStackTrace();
			Static191.aClass2_Sub11_Sub1_2.method1525();
			Static275.anInt5095 = 0;
			Static79.aClass2_Sub11_Sub1_1 = null;
			Static158.aClass2_Sub48_2 = null;
			Static510.aClass238_229 = null;
			Static379.aClass58_1 = null;
		}
	}
}

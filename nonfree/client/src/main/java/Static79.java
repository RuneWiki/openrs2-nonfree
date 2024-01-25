import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!cv", name = "e", descriptor = "I")
	public static int anInt2117;

	@OriginalMember(owner = "client!cv", name = "g", descriptor = "I")
	public static int anInt2119;

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_59 = new Class123(11, -1);

	@OriginalMember(owner = "client!cv", name = "f", descriptor = "I")
	public static int anInt2118 = -1;

	@OriginalMember(owner = "client!cv", name = "h", descriptor = "I")
	public static int anInt2120 = 0;

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lclient!iaa;I)Lclient!im;")
	public static Class147 method1839(@OriginalArg(0) Class25_Sub2_Sub2 arg0) {
		@Pc(12) Class147 local12;
		if (Static80.aClass147_1 == null) {
			local12 = new Class147();
		} else {
			local12 = Static80.aClass147_1;
			Static80.aClass147_1 = Static80.aClass147_1.aClass147_2;
			Static305.anInt5660--;
			local12.aClass147_2 = null;
		}
		local12.aClass25_Sub2_Sub2_1 = arg0;
		return local12;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)I")
	public static int method1840() {
		return Static80.anInt2134;
	}

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "(I)V")
	public static void method1842() {
		Static592.method5620(Static319.aClass31_11, (long) Static397.anInt6998);
		if (anInt2118 != -1) {
			Static8.method72(anInt2118);
		}
		for (@Pc(18) int local18 = 0; local18 < Static314.anInt5780; local18++) {
			if (Static544.aBooleanArray32[local18]) {
				Static383.aBooleanArray20[local18] = true;
			}
			Static178.aBooleanArray11[local18] = Static544.aBooleanArray32[local18];
			Static544.aBooleanArray32[local18] = false;
		}
		Static177.anInt3896 = Static397.anInt6998;
		if (anInt2118 != -1) {
			Static314.anInt5780 = 0;
			Static40.method1076();
		}
		Static319.aClass31_11.JA();
		Static204.method3505(Static319.aClass31_11);
		@Pc(63) int local63 = Static90.method1967();
		if (local63 == -1) {
			local63 = Static580.anInt10049;
		}
		if (local63 == -1) {
			local63 = Static211.anInt8483;
		}
		Static306.method4607(local63);
		Static208.anInt4448 = 0;
	}
}

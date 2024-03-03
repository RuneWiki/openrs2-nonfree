import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!hl", name = "D", descriptor = "Lclient!r;")
	public static Class197 aClass197_32;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BJ)V", line = 60)
	public static void method2505(@OriginalArg(1) long arg0) {
		if (Static307.aClass67ArrayArrayArray3 != null) {
			if (Static291.anInt5899 == 1 || Static291.anInt5899 == 5) {
				Static170.method3387(arg0);
			} else if (Static291.anInt5899 == 4) {
				Static236.method4396(arg0);
			}
		}
		Static346.method6258((long) Class83.anInt2345, Static177.aClass19_8);
		if (Class97.anInt2592 != -1) {
			Static215.method4029(Class97.anInt2592);
		}
		for (@Pc(42) int local42 = 0; local42 < Class109.anInt2803; local42++) {
			if (Class2_Sub3_Sub10_Sub1.aBooleanArray59[local42]) {
				Class243.aBooleanArray64[local42] = true;
			}
			Class17.aBooleanArray6[local42] = Class2_Sub3_Sub10_Sub1.aBooleanArray59[local42];
			Class2_Sub3_Sub10_Sub1.aBooleanArray59[local42] = false;
		}
		RuntimeException_Sub1.anInt2465 = Class83.anInt2345;
		if (Static177.aClass19_8.method2873()) {
			Class2_Sub3_Sub12.aBoolean164 = true;
		}
		if (Class97.anInt2592 != -1) {
			Class109.anInt2803 = 0;
			Static43.method1423();
		}
		Static177.aClass19_8.method2900();
		Static152.method2981(Static177.aClass19_8);
		@Pc(97) int local97 = Static32.method4202();
		if (local97 == -1) {
			local97 = Class2_Sub3_Sub39.anInt7250;
		}
		Static284.method5256(local97);
		Static52.method1618(Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6768, Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6770, Class116.anInt3144, Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78);
		Class116.anInt3144 = 0;
	}
}

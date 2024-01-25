import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static716 {

	@OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
	public static int anInt11194;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
	public static void method9348() {
		for (@Pc(6) Class3_Sub4_Sub17 local6 = (Class3_Sub4_Sub17) Static555.aClass283_12.method7031(); local6 != null; local6 = (Class3_Sub4_Sub17) Static555.aClass283_12.method7035()) {
			if (local6.anInt8611 > 1) {
				local6.anInt8611 = 0;
				Static81.aClass338_4.method8044(((Class3_Sub4_Sub5) local6.aClass283_10.aClass3_Sub4_51.aClass3_Sub4_66).aLong104, local6);
				local6.aClass283_10.method7037();
			}
		}
		Static332.anInt5826 = 0;
		Static285.anInt5168 = 0;
		Static562.aClass357_54.method8403();
		Static228.aClass136_39.method3505();
		Static555.aClass283_12.method7037();
		Static78.method1017(Static389.aClass3_Sub4_Sub5_2);
	}
}

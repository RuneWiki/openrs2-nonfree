import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!fda", name = "q", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_90 = new Class235(63, 0);

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lclient!mo;ZI)V")
	public static void method2041(@OriginalArg(0) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (Static26.aClass363_1 == null) {
			return;
		}
		try {
			Static26.aClass363_1.method7843(0L);
			Static26.aClass363_1.method7847(arg0.aByteArray85, arg1, 24);
		} catch (@Pc(23) Exception local23) {
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)V")
	public static void method2045() {
		if (Static375.aBoolean492) {
			return;
		}
		Static375.aBoolean492 = true;
		if (Static348.aClass1_Sub30_Sub1_1.aBoolean383) {
			Static167.aFloat59 = (int) Static167.aFloat59 - 65 & 0xFFFFFF80;
		} else {
			Static333.aFloat127 += (-Static333.aFloat127 - 24.0F) / 2.0F;
		}
		Static305.aBoolean423 = true;
	}
}

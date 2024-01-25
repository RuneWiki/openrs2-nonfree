import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static466 {

	@OriginalMember(owner = "client!tn", name = "v", descriptor = "[Lclient!vp;")
	public static Class309[] aClass309Array1;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
	public static void method6817() {
		@Pc(5) Class116 local5 = null;
		try {
			@Pc(11) Class243 local11 = Static91.aClass182_2.method4814("2", true);
			while (local11.anInt6905 == 0) {
				Static505.method7295(1L);
			}
			if (local11.anInt6905 == 1) {
				local5 = (Class116) local11.anObject12;
				@Pc(39) Class1_Sub13 local39 = new Class1_Sub13(Static360.anInt9308 * 6 + 3);
				local39.method3060(1);
				local39.method3038(Static360.anInt9308);
				for (@Pc(49) int local49 = 0; local49 < Static52.anIntArray138.length; local49++) {
					if (Static99.aBooleanArray12[local49]) {
						local39.method3038(local49);
						local39.method3069(Static52.anIntArray138[local49]);
					}
				}
				local5.method3368(local39.aByteArray45, local39.anInt3400, 0);
			}
		} catch (@Pc(85) Exception local85) {
		}
		try {
			if (local5 != null) {
				local5.method3371();
			}
		} catch (@Pc(92) Exception local92) {
		}
		Static132.aLong82 = Static93.method2172();
		Static538.aBoolean651 = false;
	}
}

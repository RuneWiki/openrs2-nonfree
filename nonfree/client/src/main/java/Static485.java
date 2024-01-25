import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static485 {

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "D")
	public static double aDouble18;

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
	public static int anInt7794 = 0;

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)V")
	public static void method6824() {
		@Pc(5) Class69 local5 = Static248.aClass69_25;
		synchronized (Static248.aClass69_25) {
			Static248.aClass69_25.method1904();
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "()V")
	public static void method6826() {
		for (@Pc(1) int local1 = 0; local1 < Static184.anInt3672; local1++) {
			@Pc(6) Class16_Sub1_Sub1 local6 = Static489.aClass16_Sub1_Sub1Array5[local1];
			Static136.method2506(local6, true);
			Static489.aClass16_Sub1_Sub1Array5[local1] = null;
		}
		Static184.anInt3672 = 0;
	}
}

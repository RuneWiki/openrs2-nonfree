import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!cga", name = "b", descriptor = "(B)V")
	public static void method1009() {
		@Pc(7) Class196[] local7 = Class1_Sub1_Sub34.aClass196Array1;
		synchronized (Class1_Sub1_Sub34.aClass196Array1) {
			for (@Pc(11) int local11 = 0; local11 < Class1_Sub1_Sub34.aClass196Array1.length; local11++) {
				Class1_Sub1_Sub34.aClass196Array1[local11] = new Class196();
				Static4.anIntArray591[local11] = 0;
			}
		}
	}
}

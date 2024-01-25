import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!jja", name = "e", descriptor = "I")
	public static int anInt4644 = 0;

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(B)V")
	public static void method4229() {
		@Pc(3) Class320[] local3 = Class137.aClass320Array1;
		synchronized (Class137.aClass320Array1) {
			for (@Pc(7) int local7 = 0; local7 < Class137.aClass320Array1.length; local7++) {
				Class137.aClass320Array1[local7] = new Class320();
				Static572.anIntArray659[local7] = 0;
			}
		}
	}
}

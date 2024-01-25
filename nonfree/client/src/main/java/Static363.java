import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!np", name = "yb", descriptor = "I")
	public static int anInt6185 = 0;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)I")
	public static int method5169() {
		@Pc(7) Class45 local7 = Static505.aClass45_11;
		@Pc(9) boolean local9 = false;
		if (Static60.anInt1312 != 0) {
			@Pc(15) Canvas local15 = new Canvas();
			local15.setSize(100, 100);
			local7 = Static448.method7375(0, 0, null, local15, null);
			local9 = true;
		}
		@Pc(32) long local32 = Static158.method2936();
		for (@Pc(34) int local34 = 0; local34 < 10000; local34++) {
			local7.method7378();
		}
		@Pc(61) int local61 = (int) (Static158.method2936() - local32);
		local7.method7425(100, 0, 0, -16777216, 100);
		if (local9) {
			local7.method7387();
		}
		return local61;
	}
}

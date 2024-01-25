import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!it", name = "a", descriptor = "F")
	public static float aFloat53;

	@OriginalMember(owner = "client!it", name = "g", descriptor = "Z")
	public static boolean aBoolean250 = false;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(I)I")
	public static int method3235() {
		@Pc(7) Class121 local7 = Static176.aClass121_5;
		@Pc(9) boolean local9 = false;
		if (Static567.anInt9503 != 0) {
			@Pc(15) Canvas local15 = new Canvas();
			local15.setSize(100, 100);
			local7 = Static348.method7144(0, null, 0, local15, null);
			local9 = true;
		}
		@Pc(32) long local32 = Static137.method2058();
		for (@Pc(40) int local40 = 0; local40 < 10000; local40++) {
			local7.method7115();
		}
		@Pc(67) int local67 = (int) (Static137.method2058() - local32);
		local7.method7109(0, 100, 100, 0, -16777216);
		if (local9) {
			local7.method7116();
		}
		return local67;
	}
}

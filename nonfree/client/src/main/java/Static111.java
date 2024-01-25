import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!gd", name = "u", descriptor = "F")
	public static float aFloat9;

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_62 = new Class208(92, 6);

	@OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
	public static int anInt2489 = 0;

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)I")
	public static int method2019() {
		@Pc(7) Class48 local7 = Static383.aClass48_9;
		@Pc(9) boolean local9 = false;
		if (Static36.anInt2910 != 0) {
			@Pc(15) Canvas local15 = new Canvas();
			local15.setSize(100, 100);
			local9 = true;
			local7 = Static246.method2494(0, null, null, 0, local15);
		}
		@Pc(32) long local32 = Static101.method1805();
		for (@Pc(34) int local34 = 0; local34 < 10000; local34++) {
			local7.method2525();
		}
		@Pc(69) int local69 = (int) (Static101.method1805() - local32);
		local7.method2509(100, 100, 0, -16777216, 0);
		if (local9) {
			local7.method2479();
		}
		return local69;
	}
}

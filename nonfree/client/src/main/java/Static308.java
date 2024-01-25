import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "Lclient!gp;")
	public static Class117 aClass117_138;

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_92 = new Class40("purple:", "lila:", "violet:", "roxo:");

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)I")
	public static int method5030() {
		@Pc(15) Class62 local15 = Static110.aClass62_15;
		@Pc(17) boolean local17 = false;
		if (Static17.anInt459 != 0) {
			@Pc(23) Canvas local23 = new Canvas();
			local23.setSize(100, 100);
			local15 = Static390.method7056(0, null, 0, local23, null);
			local17 = true;
		}
		@Pc(40) long local40 = Static105.method2132();
		for (@Pc(42) int local42 = 0; local42 < 10000; local42++) {
			local15.method6995();
		}
		@Pc(68) int local68 = (int) (Static105.method2132() - local40);
		local15.method7040(-16777216, 100, 0, 0, 100);
		if (local17) {
			local15.method7061();
		}
		return local68;
	}
}

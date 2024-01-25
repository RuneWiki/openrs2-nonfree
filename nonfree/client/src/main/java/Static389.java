import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!ta", name = "M", descriptor = "[Lclient!o;")
	public static Class14[] aClass14Array3;

	@OriginalMember(owner = "client!ta", name = "O", descriptor = "I")
	public static int anInt6757;

	@OriginalMember(owner = "client!ta", name = "v", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_207 = new Class214(107, 7);

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "(I)I")
	public static int method5452() {
		@Pc(7) Class30 local7 = Static30.aClass30_3;
		@Pc(17) boolean local17 = false;
		if (Static192.anInt3828 != 0) {
			@Pc(26) Canvas local26 = new Canvas();
			local26.setSize(100, 100);
			local17 = true;
			local7 = Static323.method2082(0, null, null, local26, 0);
		}
		@Pc(43) long local43 = Static167.method2929();
		for (@Pc(45) int local45 = 0; local45 < 10000; local45++) {
			local7.method2059();
		}
		@Pc(72) int local72 = (int) (Static167.method2929() - local43);
		local7.method2072(0, 0, 100, 100, -16777216);
		if (local17) {
			local7.method2086();
		}
		return local72;
	}
}

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "Lclient!vj;")
	public static Class299 aClass299_2;

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "[I")
	public static final int[] anIntArray126 = new int[64];

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)I")
	public static int method1471() {
		@Pc(7) Class39 local7 = Static103.aClass39_3;
		@Pc(9) boolean local9 = false;
		if (Static266.anInt4923 != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local7 = Static384.method6029(0, local18, null, null, 0);
			local9 = true;
		}
		@Pc(35) long local35 = Static143.method2502();
		for (@Pc(37) int local37 = 0; local37 < 10000; local37++) {
			local7.method6006();
		}
		@Pc(64) int local64 = (int) (Static143.method2502() - local35);
		local7.method6052(0, -16777216, 0, 100, 100);
		if (local9) {
			local7.method6021();
		}
		return local64;
	}
}

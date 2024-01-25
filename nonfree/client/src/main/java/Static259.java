import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!nc", name = "E", descriptor = "I")
	public static int anInt4334;

	@OriginalMember(owner = "client!nc", name = "X", descriptor = "I")
	public static int anInt4347;

	@OriginalMember(owner = "client!nc", name = "U", descriptor = "Lclient!ub;")
	public static final Class244 aClass244_22 = new Class244();

	@OriginalMember(owner = "client!nc", name = "V", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_77 = new Class15("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!nc", name = "W", descriptor = "[I")
	public static final int[] anIntArray358 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)I")
	public static int method3461() {
		@Pc(7) Class135 local7 = Static39.aClass135_1;
		@Pc(9) boolean local9 = false;
		if (Static341.anInt5549 != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local7 = Static458.method5338(0, null, local18, 0, null);
			local9 = true;
		}
		@Pc(35) long local35 = Static266.method3498();
		for (@Pc(42) int local42 = 0; local42 < 10000; local42++) {
			local7.method5360();
		}
		@Pc(69) int local69 = (int) (Static266.method3498() - local35);
		local7.method5394(100, 0, 100, 0, -16777216);
		if (local9) {
			local7.method5332();
		}
		return local69;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBLclient!qn;I)Lclient!li;")
	public static Class158 method3463(@OriginalArg(2) Class211 arg0, @OriginalArg(3) int arg1) {
		@Pc(14) byte[] local14 = arg0.method4377(arg1, 0);
		return local14 == null ? null : new Class158(local14);
	}
}

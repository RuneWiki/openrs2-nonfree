import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "I")
	public static int anInt7402;

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "Z")
	public static boolean aBoolean489 = false;

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIII)I")
	public static int method5903(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 1023 - arg0;
		} else {
			return 1023 - arg1;
		}
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)I")
	public static int method5905() {
		@Pc(7) Class50 local7 = Static412.aClass50_8;
		@Pc(9) boolean local9 = false;
		if (Static423.anInt7114 != 0) {
			@Pc(15) Canvas local15 = new Canvas();
			local15.setSize(100, 100);
			local7 = Static461.method5836(null, 0, local15, 0, null);
			local9 = true;
		}
		@Pc(40) long local40 = Static220.method3314();
		for (@Pc(42) int local42 = 0; local42 < 10000; local42++) {
			local7.method5812();
		}
		@Pc(69) int local69 = (int) (Static220.method3314() - local40);
		local7.method5853(0, 0, -16777216, 100, 100);
		if (local9) {
			local7.method5815();
		}
		return local69;
	}
}

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!mea", name = "m", descriptor = "I")
	public static int anInt5722 = -1;

	@OriginalMember(owner = "client!mea", name = "o", descriptor = "Lclient!we;")
	public static final Class373 aClass373_6 = new Class373();

	@OriginalMember(owner = "client!mea", name = "t", descriptor = "I")
	public static volatile int anInt5727 = -1;

	@OriginalMember(owner = "client!mea", name = "v", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_105 = new Class337(91, 2);

	@OriginalMember(owner = "client!mea", name = "w", descriptor = "I")
	public static int anInt5728 = 0;

	@OriginalMember(owner = "client!mea", name = "c", descriptor = "(I)I")
	public static int method5085() {
		@Pc(7) Class133 local7 = Static213.aClass133_5;
		@Pc(9) boolean local9 = false;
		if (Static97.aClass5_Sub25_8.aClass6_Sub11_1.method3988() != 0) {
			@Pc(21) Canvas local21 = new Canvas();
			local21.setSize(100, 100);
			local7 = Static173.method2688(null, local21, 0, 0, null);
			local9 = true;
		}
		@Pc(38) long local38 = Static95.method1587();
		for (@Pc(40) int local40 = 0; local40 < 10000; local40++) {
			local7.method7263();
		}
		@Pc(68) int local68 = (int) (Static95.method1587() - local38);
		local7.method7251(100, 100, -16777216, 0, 0);
		if (local9) {
			local7.method7295();
		}
		return local68;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(BIII)I")
	public static int method5087(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!lt", name = "C", descriptor = "I")
	public static int anInt5605;

	@OriginalMember(owner = "client!lt", name = "v", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_168 = new Class272(21, 3);

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "(III)Z")
	public static boolean method4847(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static453.method6303(arg0, arg1)) {
			return (arg0 & 0xB000) != 0 | Static582.method7700(arg1, arg0) | Static594.method7798(arg0, arg1) ? true : (arg1 & 0x37) == 0 & (Static26.method7436(arg1, arg0) | Static427.method6070(arg1, arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IB)Z")
	public static boolean method4848(@OriginalArg(0) int arg0) {
		Static435.anInt7197 = arg0 + 1 & 0xFFFF;
		Static489.aBoolean615 = true;
		return true;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIILclient!bd;ILclient!r;)V")
	public static void method4850(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class23 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class43 arg4) {
		@Pc(9) Class113 local9 = Static453.aClass348_3.method7407(arg2.anInt735);
		if (local9.anInt3295 == -1) {
			return;
		}
		if (arg2.aBoolean59) {
			@Pc(22) int local22 = arg1 + arg2.anInt786;
			arg1 = local22 & 0x3;
		} else {
			arg1 = 0;
		}
		@Pc(38) Class46 local38 = local9.method2914(arg4, arg2.aBoolean68, arg1);
		if (local38 == null) {
			return;
		}
		@Pc(49) int local49 = arg2.anInt739;
		@Pc(52) int local52 = arg2.anInt744;
		if ((arg1 & 0x1) == 1) {
			local49 = arg2.anInt744;
			local52 = arg2.anInt739;
		}
		@Pc(68) int local68 = local38.A();
		@Pc(71) int local71 = local38.ca();
		if (local9.aBoolean269) {
			local68 = local49 * 4;
			local71 = local52 * 4;
		}
		if (local9.anInt3297 == 0) {
			local38.method7616(arg3, arg0 + 4 - local52 * 4, local68, local71);
		} else {
			local38.method7613(arg3, arg0 - (local52 - 1) * 4, local68, local71, 0, local9.anInt3297 | 0xFF000000, 1);
		}
	}
}

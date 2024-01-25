import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static576 {

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "[S")
	public static short[] aShortArray176 = new short[256];

	@OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
	public static int anInt9821 = 0;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V")
	public static void method8012() {
		if (Static43.anInt1589 != -1) {
			Static220.method7549(-1, false, Static43.anInt1589, -1);
			Static43.anInt1589 = -1;
		}
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)V")
	public static void method8014() {
		Static260.aClass94_23.method2952();
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLclient!ji;)Lclient!ij;")
	public static Class109_Sub1 method8015(@OriginalArg(1) Class6_Sub8 arg0) {
		@Pc(9) Class109 local9 = Static191.method3517(arg0);
		@Pc(18) int local18 = arg0.method8220();
		@Pc(22) int local22 = arg0.method8220();
		@Pc(26) int local26 = arg0.method8220();
		@Pc(30) int local30 = arg0.method8220();
		@Pc(34) int local34 = arg0.method8220();
		@Pc(38) int local38 = arg0.method8220();
		return new Class109_Sub1(local9.aClass79_21, local9.aClass127_18, local9.anInt9905, local9.anInt9908, local9.anInt9913, local9.anInt9904, local9.anInt9909, local9.anInt9907, local9.anInt9912, local18, local22, local26, local30, local34, local38);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!i", name = "r", descriptor = "[I")
	public static int[] anIntArray222;

	@OriginalMember(owner = "client!i", name = "s", descriptor = "Lclient!ih;")
	public static Class49 aClass49_1;

	@OriginalMember(owner = "client!i", name = "u", descriptor = "Lclient!me;")
	public static Class66 aClass66_1;

	@OriginalMember(owner = "client!i", name = "v", descriptor = "Lclient!kh;")
	public static Class60 aClass60_636 = Static200.method3116("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IBI)Lclient!kh;")
	public static Class60 method1428(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return Static82.aClass60_637;
		} else if (local8 < -6) {
			return Static108.aClass60_811;
		} else if (local8 < -3) {
			return Static211.aClass60_1199;
		} else if (local8 < 0) {
			return Static185.aClass60_1337;
		} else if (local8 > 9) {
			return Static194.aClass60_1399;
		} else if (local8 > 6) {
			return Static180.aClass60_1302;
		} else if (local8 > 3) {
			return Static94.aClass60_704;
		} else if (local8 > 0) {
			return Static122.aClass60_900;
		} else {
			return Static193.aClass60_1393;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V")
	public static void method1429() {
		if (Static85.aClass42_1 != null) {
			@Pc(7) Class42 local7 = Static85.aClass42_1;
			synchronized (Static85.aClass42_1) {
				Static85.aClass42_1 = null;
			}
		}
	}
}

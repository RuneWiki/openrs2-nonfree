import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!p", name = "n", descriptor = "I")
	public static int anInt4717 = 0;

	@OriginalMember(owner = "client!p", name = "o", descriptor = "I")
	public static int anInt4718 = 1;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BLclient!sc;)Z")
	public static boolean method4160(@OriginalArg(1) Interface7 arg0) {
		@Pc(9) Class84 local9 = Static108.method1650(arg0.method5410());
		if (local9.anInt1987 == -1) {
			return true;
		} else {
			@Pc(20) Class121 local20 = Static36.method533(local9.anInt1987);
			return local20.anInt3437 == -1 ? true : local20.method2816();
		}
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(III)V")
	public static void method4161(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class208 local7 = Static66.method1708(arg0);
		@Pc(14) int local14 = local7.anInt6542;
		@Pc(17) int local17 = local7.anInt6544;
		@Pc(20) int local20 = local7.anInt6548;
		@Pc(26) int local26 = Class174.anIntArray413[local20 - local17];
		if (arg1 < 0 || arg1 > local26) {
			arg1 = 0;
		}
		local26 <<= local17;
		Static145.method2211(local14, Static195.anIntArray342[local14] & ~local26 | local26 & arg1 << local17);
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
	public static void method4162() {
		@Pc(5) Class26 local5 = Static59.aClass26_5;
		synchronized (Static59.aClass26_5) {
			Static59.aClass26_5.method328();
		}
		local5 = Static185.aClass26_33;
		synchronized (Static185.aClass26_33) {
			Static185.aClass26_33.method328();
		}
		local5 = Static222.aClass26_43;
		synchronized (Static222.aClass26_43) {
			Static222.aClass26_43.method328();
		}
	}
}

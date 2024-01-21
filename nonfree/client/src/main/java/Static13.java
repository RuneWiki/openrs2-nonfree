import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!bc", name = "s", descriptor = "[I")
	public static int[] anIntArray409;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1459 = Static161.method2452(" weitere Optionen");

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1460 = Static161.method2452("Hierhin gehen");

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1461 = Static161.method2452("; Max)2Age=");

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V")
	public static void method2932(@OriginalArg(1) int arg0) {
		if (!Static37.method1027(arg0)) {
			return;
		}
		@Pc(18) Class69[] local18 = Static155.aClass69ArrayArray1[arg0];
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(26) Class69 local26 = local18[local20];
			if (local26 != null) {
				local26.anInt2482 = 0;
				local26.anInt2525 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(Z)V")
	public static void method2940() {
		@Pc(5) Class15 local5 = Static30.aClass15_1;
		synchronized (Static30.aClass15_1) {
			Static82.anInt1814++;
			Static18.anInt352 = Static40.anInt846;
			Static70.anInt1549 = Static199.anInt3916;
			Static207.anInt4069 = Static195.anInt3810;
			Static85.anInt1876 = Static113.anInt2375;
			Static179.anInt3572 = Static153.anInt3128;
			Static175.anInt3521 = Static132.anInt3730;
			Static122.aLong143 = Static214.aLong247;
			Static113.anInt2375 = 0;
		}
	}
}

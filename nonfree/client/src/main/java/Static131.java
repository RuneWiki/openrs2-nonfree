import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!he", name = "j", descriptor = "Lclient!b;")
	public static Class20 aClass20_37;

	@OriginalMember(owner = "client!he", name = "u", descriptor = "Lclient!pj;")
	public static Class183 aClass183_1;

	@OriginalMember(owner = "client!he", name = "p", descriptor = "Lclient!us;")
	public static final Class234 aClass234_51 = new Class234(70, -2);

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!b;Lclient!b;B)I")
	public static int method2063(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class20 arg1) {
		@Pc(10) int local10 = 0;
		if (arg1.method226(Static126.anInt2390)) {
			local10++;
		}
		if (arg1.method226(Static98.anInt1954)) {
			local10++;
		}
		if (arg1.method226(Static120.anInt2264)) {
			local10++;
		}
		if (arg0.method226(Static126.anInt2390)) {
			local10++;
		}
		if (arg0.method226(Static98.anInt1954)) {
			local10++;
		}
		if (arg0.method226(Static120.anInt2264)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "()V")
	public static void method2065() {
		for (@Pc(1) int local1 = 0; local1 < Static30.anInt545; local1++) {
			@Pc(6) Class28_Sub1 local6 = Static316.aClass28_Sub1Array2[local1];
			Static348.method4046(local6);
			Static316.aClass28_Sub1Array2[local1] = null;
		}
		Static30.anInt545 = 0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
	public static void method2066() {
		@Pc(1) Class139 local1 = Static59.aClass139_8;
		synchronized (Static59.aClass139_8) {
			Static59.aClass139_8.method3075();
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([IB)Ljava/lang/String;")
	public static String method2067(@OriginalArg(0) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static242.anInt4260;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(22) Class238 local22 = Static330.aClass26_1.method330(arg0[local13]);
			if (local22.anInt6187 != -1) {
				@Pc(34) Class110 local34 = (Class110) Static208.aClass139_44.method3076((long) local22.anInt6187);
				if (local34 == null) {
					@Pc(42) Class127 local42 = Static402.method2800(Static77.aClass20_19, local22.anInt6187, 0);
					if (local42 != null) {
						local34 = Static347.aClass155_9.method4869(local42);
						Static208.aClass139_44.method3070(local34, (long) local22.anInt6187);
					}
				}
				if (local34 != null) {
					Static371.aClass110Array14[local11] = local34;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}
}

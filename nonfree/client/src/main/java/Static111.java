import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "Lclient!ga;")
	public static Class30 aClass30_41;

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1084 = Static169.method2903("Examine");

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1080 = aClass23_1084;

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
	public static int anInt2840 = 0;

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1081 = Static169.method2903("(Z");

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1082 = Static169.method2903("scrollen:");

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1083 = Static169.method2903("Loading textures )2 ");

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1085 = aClass23_1083;

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1086 = Static169.method2903("<col=ffffff>");

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!ga;Lclient!ga;I)I")
	public static int method1963(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class30 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method1295(Static15.aClass23_183, Static61.aClass23_605)) {
			local5++;
		}
		if (arg1.method1295(Static80.aClass23_794, Static61.aClass23_605)) {
			local5++;
		}
		if (arg1.method1295(Static92.aClass23_915, Static61.aClass23_605)) {
			local5++;
		}
		if (arg1.method1295(Static108.aClass23_679, Static61.aClass23_605)) {
			local5++;
		}
		if (arg1.method1295(Static96.aClass23_956, Static61.aClass23_605)) {
			local5++;
		}
		if (arg1.method1295(Static126.aClass23_1237, Static61.aClass23_605)) {
			local5++;
		}
		arg1.method1295(Static57.aClass23_596, Static61.aClass23_605);
		arg1.method1295(Static83.aClass23_828, Static61.aClass23_605);
		arg1.method1295(Static48.aClass23_495, Static61.aClass23_605);
		arg1.method1295(Static179.aClass23_1638, Static61.aClass23_605);
		arg1.method1295(Static2.aClass23_77, Static61.aClass23_605);
		return local5;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI)Lclient!ob;")
	public static Class60 method1964(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static9.aClass60ArrayArray1[local12] == null || Static9.aClass60ArrayArray1[local12][local16] == null) {
			@Pc(32) boolean local32 = Static49.method916(local12);
			if (!local32) {
				return null;
			}
		}
		return Static9.aClass60ArrayArray1[local12][local16];
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
	public static void method1965() {
		aClass23_1082 = null;
		aClass23_1086 = null;
		aClass23_1080 = null;
		aClass23_1084 = null;
		aClass30_41 = null;
		aClass23_1083 = null;
		aClass23_1081 = null;
		aClass23_1085 = null;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "([Lclient!ed;I)[Lclient!ed;")
	public static Class23[] method1966(@OriginalArg(0) Class23[] arg0) {
		@Pc(16) Class23[] local16 = new Class23[5];
		for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
			local16[local18] = Static149.method2571(new Class23[] { Static27.method498(local18), Static84.aClass23_1668 });
			if (arg0 != null && arg0[local18] != null) {
				local16[local18] = Static149.method2571(new Class23[] { local16[local18], arg0[local18] });
			}
		}
		return local16;
	}
}

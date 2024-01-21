import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!gg", name = "T", descriptor = "I")
	public static int anInt1483;

	@OriginalMember(owner = "client!gg", name = "U", descriptor = "I")
	public static int anInt1484;

	@OriginalMember(owner = "client!gg", name = "db", descriptor = "Lclient!fa;")
	public static Class25 aClass25_1;

	@OriginalMember(owner = "client!gg", name = "X", descriptor = "[I")
	public static final int[] anIntArray153 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!gg", name = "Z", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_568 = Static177.method3050("Ausw-=hlen");

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!tf;)V")
	public static void method1146(@OriginalArg(0) Class86 arg0) {
		for (@Pc(2) int local2 = arg0.anInt3583; local2 <= arg0.anInt3584; local2++) {
			for (@Pc(6) int local6 = arg0.anInt3581; local6 <= arg0.anInt3595; local6++) {
				@Pc(16) Class4_Sub7 local16 = Static28.aClass4_Sub7ArrayArrayArray1[arg0.anInt3582][local2][local6];
				if (local16 != null) {
					@Pc(35) int local35;
					for (@Pc(20) int local20 = 0; local20 < local16.anInt1040; local20++) {
						if (local16.aClass86Array1[local20] == arg0) {
							local16.anInt1040--;
							for (local35 = local20; local35 < local16.anInt1040; local35++) {
								local16.aClass86Array1[local35] = local16.aClass86Array1[local35 + 1];
								local16.anIntArray90[local35] = local16.anIntArray90[local35 + 1];
							}
							local16.aClass86Array1[local16.anInt1040] = null;
							break;
						}
					}
					local16.anInt1042 = 0;
					for (local35 = 0; local35 < local16.anInt1040; local35++) {
						local16.anInt1042 |= local16.anIntArray90[local35];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "(I)V")
	public static void method1147() {
		Static182.aClass66_49.method2218();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!nh;BLclient!nh;Lclient!nh;)V")
	public static void method1150(@OriginalArg(0) Class62 arg0, @OriginalArg(2) Class62 arg1, @OriginalArg(3) Class62 arg2) {
		Static43.anInt1086 = arg1.method2859(Static27.aClass46_236);
		Static183.anInt1803 = arg2.method2859(Static149.aClass46_1257);
		Static73.anInt1868 = arg2.method2859(Static78.aClass46_750);
		Static182.anInt4080 = arg2.method2859(Static106.aClass46_957);
		Static97.anInt2492 = arg2.method2859(Static82.aClass46_798);
		Static72.anInt1865 = arg2.method2859(Static119.aClass46_1068);
		Static80.anInt2012 = arg2.method2859(Static108.aClass46_979);
		Static36.anInt954 = arg2.method2859(Static22.aClass46_190);
		Static4.anInt2847 = arg2.method2859(Static82.aClass46_793);
		Static120.anInt3734 = arg2.method2859(Static94.aClass46_877);
		Static140.anInt3269 = arg2.method2859(Static2.aClass46_14);
		Static65.anInt1715 = arg0.method2859(Static106.aClass46_961);
	}
}

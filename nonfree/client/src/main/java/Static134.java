import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
	public static int anInt3571;

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "Lclient!ca;")
	public static Class13_Sub1 aClass13_Sub1_17;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "Lclient!tb;")
	public static Class82 aClass82_1 = new Class82();

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_989 = Static158.method3034("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
	public static int anInt3572 = 0;

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
	public static int anInt3575 = 0;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!pe;II)[Lclient!fa;")
	public static Class2_Sub1_Sub7_Sub2[] method2771(@OriginalArg(0) int arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) int arg2) {
		return Static52.method1229(arg0, arg1, arg2) ? Static24.method611() : null;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!pe;)V")
	public static void method2772(@OriginalArg(1) Class13 arg0) {
		Static59.aClass13_12 = arg0;
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
	public static void method2774() {
		Static49.aClass67_3 = new Class67();
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIII)I")
	public static int method2775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 7 - arg1;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return arg1;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static567 {

	@OriginalMember(owner = "client!uaa", name = "v", descriptor = "Lclient!nd;")
	public static Class238 aClass238_265;

	@OriginalMember(owner = "client!uaa", name = "u", descriptor = "[I")
	public static final int[] anIntArray676 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Z)V")
	public static void method7964() {
		Static564.aClass69_52.method1905();
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ILclient!rl;)V")
	public static void method7967(@OriginalArg(1) Class16_Sub1_Sub1_Sub3_Sub2 arg0) {
		@Pc(15) Class2_Sub27 local15 = (Class2_Sub27) Static289.aClass323_19.method7484((long) arg0.anInt8075);
		if (local15 == null) {
			Static264.method4366(arg0, (Class5) null, (Class16_Sub1_Sub1_Sub3_Sub1) null, 0, arg0.aByte109, arg0.anIntArray594[0], arg0.anIntArray595[0]);
		} else {
			local15.method4738();
		}
	}
}

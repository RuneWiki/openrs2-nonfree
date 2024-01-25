import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static651 {

	@OriginalMember(owner = "client!w", name = "D", descriptor = "I")
	public static int anInt10481 = -1;

	@OriginalMember(owner = "client!w", name = "J", descriptor = "I")
	public static int anInt10485 = 0;

	@OriginalMember(owner = "client!w", name = "M", descriptor = "I")
	public static final int anInt10488 = 1405;

	@OriginalMember(owner = "client!w", name = "N", descriptor = "I")
	public static int anInt10489 = 0;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!sja;Lclient!sja;I)V")
	public static void method8874(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class6 arg1) {
		if (arg1.aClass6_337 != null) {
			arg1.method9174();
		}
		arg1.aClass6_337 = arg0.aClass6_337;
		arg1.aClass6_338 = arg0;
		arg1.aClass6_337.aClass6_338 = arg1;
		arg1.aClass6_338.aClass6_337 = arg1;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method8875(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static219.method3185(arg0, "%0a", "\n"));
	}
}

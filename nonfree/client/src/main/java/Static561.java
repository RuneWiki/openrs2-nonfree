import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static561 {

	@OriginalMember(owner = "client!sv", name = "s", descriptor = "I")
	public static int anInt9112;

	@OriginalMember(owner = "client!sv", name = "t", descriptor = "I")
	public static int anInt9113;

	@OriginalMember(owner = "client!sv", name = "u", descriptor = "[Lclient!vr;")
	public static Class33[] aClass33Array25;

	@OriginalMember(owner = "client!sv", name = "q", descriptor = "Z")
	public static final boolean aBoolean713 = false;

	@OriginalMember(owner = "client!sv", name = "r", descriptor = "Lclient!tja;")
	public static final Class336 aClass336_18 = new Class336(8, 2);

	@OriginalMember(owner = "client!sv", name = "v", descriptor = "I")
	public static int anInt9114 = 0;

	@OriginalMember(owner = "client!sv", name = "w", descriptor = "[I")
	public static final int[] anIntArray780 = new int[200];

	@OriginalMember(owner = "client!sv", name = "A", descriptor = "Z")
	public static boolean aBoolean714 = false;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(BZ)Z")
	public static boolean method7968(@OriginalArg(1) boolean arg0) {
		@Pc(6) boolean local6 = Static674.aClass13_22.method8451();
		if (arg0 == local6) {
			return true;
		}
		if (!arg0) {
			Static674.aClass13_22.method8483();
		} else if (!Static674.aClass13_22.method8524()) {
			arg0 = false;
		}
		if (arg0 == local6) {
			return false;
		} else {
			Static24.aClass3_Sub22_4.method2840(arg0 ? 1 : 0, Static24.aClass3_Sub22_4.aClass6_Sub10_1);
			Static441.method6272();
			return true;
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method7969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class164 local7 = Static15.aClass164ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class125 local13 = local7.aClass125_2; local13 != null; local13 = local13.aClass125_1) {
			@Pc(17) Class28_Sub1_Sub1 local17 = local13.aClass28_Sub1_Sub1_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort125 == arg1 && local17.aShort123 == arg2) {
				Static113.method2112(local17, false);
				return;
			}
		}
	}
}

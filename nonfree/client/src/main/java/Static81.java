import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!ck", name = "kc", descriptor = "D")
	public static double aDouble3;

	@OriginalMember(owner = "client!ck", name = "sc", descriptor = "I")
	public static int anInt1279;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!lq;)V")
	public static void method1222(@OriginalArg(0) Class28_Sub1 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 2; local4++) {
			@Pc(7) Class28_Sub1 local7 = null;
			for (@Pc(11) Class28_Sub1 local11 = Static654.aClass28_Sub1Array5[local4]; local11 != null; local11 = local11.aClass28_Sub1_23) {
				if (local11 == arg0) {
					if (local7 == null) {
						Static654.aClass28_Sub1Array5[local4] = local11.aClass28_Sub1_23;
					} else {
						local7.aClass28_Sub1_23 = local11.aClass28_Sub1_23;
					}
					Static375.aBoolean591 = true;
					return;
				}
				local7 = local11;
			}
			local7 = null;
			for (@Pc(43) Class28_Sub1 local43 = Static135.aClass28_Sub1Array2[local4]; local43 != null; local43 = local43.aClass28_Sub1_23) {
				if (local43 == arg0) {
					if (local7 == null) {
						Static135.aClass28_Sub1Array2[local4] = local43.aClass28_Sub1_23;
					} else {
						local7.aClass28_Sub1_23 = local43.aClass28_Sub1_23;
					}
					Static375.aBoolean591 = true;
					return;
				}
				local7 = local43;
			}
			local7 = null;
			for (@Pc(75) Class28_Sub1 local75 = Static110.aClass28_Sub1Array1[local4]; local75 != null; local75 = local75.aClass28_Sub1_23) {
				if (local75 == arg0) {
					if (local7 == null) {
						Static110.aClass28_Sub1Array1[local4] = local75.aClass28_Sub1_23;
					} else {
						local7.aClass28_Sub1_23 = local75.aClass28_Sub1_23;
					}
					Static375.aBoolean591 = true;
					return;
				}
				local7 = local75;
			}
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method1270(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static640.method8651(arg0, "%0a", "\n"));
	}
}

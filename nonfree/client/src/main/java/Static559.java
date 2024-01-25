import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static559 {

	@OriginalMember(owner = "client!wca", name = "D", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_194 = new Class40(39, 0);

	@OriginalMember(owner = "client!wca", name = "H", descriptor = "I")
	public static int anInt9370 = 0;

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method7669(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static502.method6919(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < Static300.anInt4872; local29++) {
			@Pc(35) String local35 = Static489.aStringArray30[local29];
			if (local35.startsWith("*")) {
				local35 = local35.substring(1);
			}
			local35 = Static502.method6919(local35);
			if (local35 != null && local35.equals(local20)) {
				Static300.anInt4872--;
				for (@Pc(59) int local59 = local29; local59 < Static300.anInt4872; local59++) {
					Static489.aStringArray30[local59] = Static489.aStringArray30[local59 + 1];
					Static478.aStringArray28[local59] = Static478.aStringArray28[local59 + 1];
					Static58.anIntArray63[local59] = Static58.anIntArray63[local59 + 1];
					Static279.aStringArray19[local59] = Static279.aStringArray19[local59 + 1];
					Static413.anIntArray578[local59] = Static413.anIntArray578[local59 + 1];
					Static215.aBooleanArray22[local59] = Static215.aBooleanArray22[local59 + 1];
				}
				Static350.anInt6167 = Static48.anInt821;
				Static136.method2051(Static431.aClass160_100);
				Static218.aClass6_Sub14_Sub2_1.method6035(Static305.method4688(arg0));
				Static218.aClass6_Sub14_Sub2_1.method5989(arg0);
				return;
			}
		}
	}
}

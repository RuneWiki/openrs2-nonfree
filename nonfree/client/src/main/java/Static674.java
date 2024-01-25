import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static674 {

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray39;

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
	public static int anInt10663;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "S")
	public static short aShort126 = 320;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)V")
	public static void method8919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class3_Sub4_Sub2 local14 = Static502.method7211(19, (long) arg0 << 32 | (long) arg1);
		local14.method627();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
	public static void method8920() {
		for (@Pc(6) Class19_Sub2 local6 = (Class19_Sub2) Static624.aClass66_9.method1376(); local6 != null; local6 = (Class19_Sub2) Static624.aClass66_9.method1376()) {
			Static484.method7066(local6);
		}
		@Pc(36) int local36;
		@Pc(38) int local38;
		if (Static713.aClass3_Sub55_31.aClass15_Sub25_1.method8268() == 1) {
			local36 = 0;
			local38 = 3;
		} else {
			local38 = Static715.anInt7793;
			local36 = Static715.anInt7793;
		}
		@Pc(49) int local49;
		if (Static334.anInt5845 == 3) {
			for (local49 = local36; local49 <= local38; local49++) {
				Static87.method1171(local49);
			}
			Static87.method1163();
			return;
		}
		Static87.method1174();
		for (local49 = local36; local49 <= local38; local49++) {
			Static87.method1167();
			Static87.method1170(local49);
			Static87.method1171(local49);
		}
		Static87.method1180();
		Static87.method1163();
	}
}

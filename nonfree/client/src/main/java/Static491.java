import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
	public static int anInt9856 = 104;

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(III)Z")
	public static boolean method8326(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static334.method4896(arg1, arg0) || Static191.method2705(arg1, arg0);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method8327(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static477.anInt8198 >= 100) {
			Static270.method3991(Static52.aClass41_39.method1007(Static616.anInt10077));
			return;
		}
		@Pc(23) String local23 = Static573.method4494(arg1);
		if (local23 == null) {
			return;
		}
		@Pc(67) String local67;
		for (@Pc(28) int local28 = 0; local28 < Static477.anInt8198; local28++) {
			@Pc(36) String local36 = Static573.method4494(Static572.aStringArray58[local28]);
			if (local36 != null && local36.equals(local23)) {
				Static270.method3991(arg1 + Static52.aClass41_40.method1007(Static616.anInt10077));
				return;
			}
			if (Static602.aStringArray63[local28] != null) {
				local67 = Static573.method4494(Static602.aStringArray63[local28]);
				if (local67 != null && local67.equals(local23)) {
					Static270.method3991(arg1 + Static52.aClass41_40.method1007(Static616.anInt10077));
					return;
				}
			}
		}
		for (@Pc(94) int local94 = 0; local94 < Static96.anInt1739; local94++) {
			local67 = Static573.method4494(Static480.aStringArray50[local94]);
			if (local67 != null && local67.equals(local23)) {
				Static270.method3991(Static52.aClass41_45.method1007(Static616.anInt10077) + arg1 + Static52.aClass41_46.method1007(Static616.anInt10077));
				return;
			}
			if (Static306.aStringArray38[local94] != null) {
				@Pc(138) String local138 = Static573.method4494(Static306.aStringArray38[local94]);
				if (local138 != null && local138.equals(local23)) {
					Static270.method3991(Static52.aClass41_45.method1007(Static616.anInt10077) + arg1 + Static52.aClass41_46.method1007(Static616.anInt10077));
					return;
				}
			}
		}
		if (Static573.method4494(Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aString45).equals(local23)) {
			Static270.method3991(Static52.aClass41_42.method1007(Static616.anInt10077));
			return;
		}
		@Pc(200) Class6_Sub26 local200 = Static268.method3981(Static377.aClass15_2, Static134.aClass289_44);
		local200.aClass6_Sub23_Sub1_2.method8366(Static622.method8568(arg1) + 1);
		local200.aClass6_Sub23_Sub1_2.method8398(arg1);
		local200.aClass6_Sub23_Sub1_2.method8366(arg0 ? 1 : 0);
		Static670.method9077(local200);
	}
}

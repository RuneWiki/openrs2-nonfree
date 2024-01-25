import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!nh", name = "s", descriptor = "[I")
	public static int[] anIntArray457;

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
	public static int anInt6520 = 2;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method5271(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(30) String local30;
		if (Static569.anInt9840 >= 200 && !Static241.aBoolean324 || Static569.anInt9840 >= 200) {
			Static141.method2337(Static146.aClass103_11.method2355(Static188.anInt28));
			local30 = Static146.aClass103_12.method2355(Static188.anInt28);
			if (local30 != null) {
				Static141.method2337(local30);
			}
			return;
		}
		local30 = Static83.method1161(arg0);
		if (local30 == null) {
			return;
		}
		@Pc(85) String local85;
		for (@Pc(46) int local46 = 0; local46 < Static569.anInt9840; local46++) {
			@Pc(54) String local54 = Static83.method1161(Static326.aStringArray26[local46]);
			if (local54 != null && local54.equals(local30)) {
				Static141.method2337(arg0 + Static146.aClass103_85.method2355(Static188.anInt28));
				return;
			}
			if (Static114.aStringArray8[local46] != null) {
				local85 = Static83.method1161(Static114.aStringArray8[local46]);
				if (local85 != null && local85.equals(local30)) {
					Static141.method2337(arg0 + Static146.aClass103_85.method2355(Static188.anInt28));
					return;
				}
			}
		}
		for (@Pc(112) int local112 = 0; local112 < Static244.anInt4491; local112++) {
			local85 = Static83.method1161(Static74.aStringArray5[local112]);
			if (local85 != null && local85.equals(local30)) {
				Static141.method2337(Static146.aClass103_90.method2355(Static188.anInt28) + arg0 + Static146.aClass103_91.method2355(Static188.anInt28));
				return;
			}
			if (Static41.aStringArray4[local112] != null) {
				@Pc(156) String local156 = Static83.method1161(Static41.aStringArray4[local112]);
				if (local156 != null && local156.equals(local30)) {
					Static141.method2337(Static146.aClass103_90.method2355(Static188.anInt28) + arg0 + Static146.aClass103_91.method2355(Static188.anInt28));
					return;
				}
			}
		}
		if (Static83.method1161(Static461.aClass15_Sub2_Sub4_Sub2_2.aString82).equals(local30)) {
			Static141.method2337(Static146.aClass103_88.method2355(Static188.anInt28));
		} else {
			Static534.method7063(Static378.aClass316_86);
			Static340.aClass6_Sub12_Sub2_1.method6047(Static314.method4913(arg0));
			Static340.aClass6_Sub12_Sub2_1.method6009(arg0);
		}
	}
}

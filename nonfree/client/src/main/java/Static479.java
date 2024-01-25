import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static479 {

	@OriginalMember(owner = "client!qba", name = "tb", descriptor = "Lclient!jea;")
	public static final Class177 aClass177_29 = new Class177(1, 2);

	@OriginalMember(owner = "client!qba", name = "rc", descriptor = "Z")
	public static boolean aBoolean676 = false;

	@OriginalMember(owner = "client!qba", name = "Ac", descriptor = "F")
	public static float aFloat187 = 1.0F;

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(Z[SI)[S")
	public static short[] method7872(@OriginalArg(1) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) short[] local11 = new short[arg1];
		Static681.method4035(arg0, 0, local11, 0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method7875(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(28) String local28 = Static130.method8168(arg0);
		if (local28 == null) {
			return;
		}
		for (@Pc(33) int local33 = 0; local33 < Static345.anInt5912; local33++) {
			@Pc(39) String local39 = Static651.aStringArray66[local33];
			if (local39.startsWith("*")) {
				local39 = local39.substring(1);
			}
			local39 = Static130.method8168(local39);
			if (local39 != null && local39.equals(local28)) {
				Static345.anInt5912--;
				for (@Pc(63) int local63 = local33; local63 < Static345.anInt5912; local63++) {
					Static651.aStringArray66[local63] = Static651.aStringArray66[local63 + 1];
					Static87.aStringArray15[local63] = Static87.aStringArray15[local63 + 1];
					Static639.anIntArray557[local63] = Static639.anIntArray557[local63 + 1];
					Static109.aStringArray17[local63] = Static109.aStringArray17[local63 + 1];
					Static413.anIntArray351[local63] = Static413.anIntArray351[local63 + 1];
					Static83.aBooleanArray6[local63] = Static83.aBooleanArray6[local63 + 1];
				}
				Static321.anInt10318 = Static156.anInt2887;
				@Pc(132) Class3_Sub37 local132 = Static90.method1509(Static442.aClass240_75, Static226.aClass144_2);
				local132.aClass3_Sub4_Sub1_2.method7948(Static345.method5022(arg0));
				local132.aClass3_Sub4_Sub1_2.method7901(arg0);
				Static301.method2678(local132);
				return;
			}
		}
	}
}

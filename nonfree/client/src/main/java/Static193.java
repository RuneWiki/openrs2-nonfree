import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_50 = new Class244(51, 7);

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "I")
	public static int anInt3497 = 0;

	@OriginalMember(owner = "client!ks", name = "g", descriptor = "[Lclient!ok;")
	public static final Class177[] aClass177Array1 = new Class177[14];

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method3061(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(28) String local28 = Static231.method3842(arg0);
		if (local28 == null) {
			return;
		}
		for (@Pc(33) int local33 = 0; local33 < Static196.anInt5194; local33++) {
			@Pc(39) String local39 = Static152.aStringArray23[local33];
			if (local39.startsWith("*")) {
				local39 = local39.substring(1);
			}
			local39 = Static231.method3842(local39);
			if (local39 != null && local39.equals(local28)) {
				Static196.anInt5194--;
				for (@Pc(63) int local63 = local33; local63 < Static196.anInt5194; local63++) {
					Static152.aStringArray23[local63] = Static152.aStringArray23[local63 + 1];
					Static78.aStringArray12[local63] = Static78.aStringArray12[local63 + 1];
					Static295.aStringArray36[local63] = Static295.aStringArray36[local63 + 1];
					Static247.aStringArray29[local63] = Static247.aStringArray29[local63 + 1];
					Static122.aBooleanArray55[local63] = Static122.aBooleanArray55[local63 + 1];
				}
				Static142.anInt2705 = Static28.anInt360;
				Static229.method3783(Static347.aClass244_85);
				Static23.aClass3_Sub5_Sub1_1.method2791(Static269.method4260(arg0));
				Static23.aClass3_Sub5_Sub1_1.method2768(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!dt;I)V")
	public static void method3062(@OriginalArg(0) Class62 arg0) {
		if (arg0.anInt1575 == 5 && arg0.anInt1549 != -1) {
			Static57.method1023(Static347.aClass155_9, arg0);
		}
	}
}

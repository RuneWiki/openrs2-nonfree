import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!fr", name = "g", descriptor = "I")
	public static int anInt3463;

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "[I")
	public static final int[] anIntArray226 = new int[250];

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I[Ljava/lang/String;)V")
	public static void method2961(@OriginalArg(1) String[] arg0) {
		if (arg0.length <= 1) {
			Static143.aString27 = Static143.aString27 + arg0[0];
			Static545.anInt8786 += arg0[0].length();
			return;
		}
		for (@Pc(33) int local33 = 0; local33 < arg0.length; local33++) {
			if (arg0[local33].startsWith("pause")) {
				@Pc(42) int local42 = 5;
				try {
					local42 = Integer.parseInt(arg0[local33].substring(6));
				} catch (@Pc(51) Exception local51) {
				}
				Static575.method7997("Pausing for " + local42 + " seconds...");
				Static66.aStringArray4 = arg0;
				Static507.anInt10231 = local33 + 1;
				Static228.aLong106 = Static48.method1203() + (long) (local42 * 1000);
				return;
			}
			Static143.aString27 = arg0[local33];
			Static561.method7865(false);
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IZZI)V")
	public static void method2962(@OriginalArg(1) boolean arg0) {
		Static474.anInt7663 = 2;
		Static489.anInt8544 = 22050;
		Static40.aBoolean75 = arg0;
	}
}

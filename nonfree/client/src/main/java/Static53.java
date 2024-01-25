import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!bla", name = "s", descriptor = "I")
	public static int anInt11213 = 0;

	@OriginalMember(owner = "client!bla", name = "a", descriptor = "([Ljava/lang/String;B)V")
	public static void method9363(@OriginalArg(0) String[] arg0) {
		if (arg0.length <= 1) {
			Static140.aString44 = Static140.aString44 + arg0[0];
			Static663.anInt10567 += arg0[0].length();
			return;
		}
		for (@Pc(41) int local41 = 0; local41 < arg0.length; local41++) {
			if (arg0[local41].startsWith("pause")) {
				@Pc(66) int local66 = 5;
				try {
					local66 = Integer.parseInt(arg0[local41].substring(6));
				} catch (@Pc(75) Exception local75) {
				}
				Static269.method4123("Pausing for " + local66 + " seconds...");
				Static74.aStringArray4 = arg0;
				Static60.anInt938 = local41 + 1;
				Static77.aLong58 = Static626.method8479() + (long) (local66 * 1000);
				return;
			}
			Static140.aString44 = arg0[local41];
			Static416.method6188(false);
		}
	}

	@OriginalMember(owner = "client!bla", name = "d", descriptor = "(B)Z")
	public static boolean method9372() {
		if (Static215.aBoolean348) {
			try {
				Static733.method8728(Static395.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(22) Throwable local22) {
			}
		}
		return false;
	}
}

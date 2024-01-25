import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!ci", name = "C", descriptor = "Lclient!uaa;")
	public static Class345 aClass345_1;

	@OriginalMember(owner = "client!ci", name = "I", descriptor = "I")
	public static int anInt1260;

	@OriginalMember(owner = "client!ci", name = "B", descriptor = "[I")
	public static final int[] anIntArray98 = new int[14];

	@OriginalMember(owner = "client!ci", name = "G", descriptor = "I")
	public static int anInt1258 = 0;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I[Ljava/lang/String;)V")
	public static void method1000(@OriginalArg(1) String[] arg0) {
		if (arg0.length <= 1) {
			Static61.aString13 = Static61.aString13 + arg0[0];
			Static553.anInt9045 += arg0[0].length();
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < arg0.length; local18++) {
			if (arg0[local18].startsWith("pause")) {
				@Pc(37) int local37 = 5;
				try {
					local37 = Integer.parseInt(arg0[local18].substring(6));
				} catch (@Pc(46) Exception local46) {
				}
				Static338.method4547("Pausing for " + local37 + " seconds...");
				Static230.aStringArray19 = arg0;
				Static610.anInt9840 = local18 + 1;
				Static289.aLong129 = Static476.method6413() + (long) (local37 * 1000);
				return;
			}
			Static61.aString13 = arg0[local18];
			Static490.method6839(false);
		}
	}
}

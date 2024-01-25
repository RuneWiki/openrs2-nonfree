import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
	public static int anInt3255;

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "Lclient!fj;")
	public static Class127 aClass127_1;

	@OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
	public static int anInt3259;

	@OriginalMember(owner = "client!gq", name = "l", descriptor = "[I")
	public static final int[] anIntArray192 = new int[2];

	@OriginalMember(owner = "client!gq", name = "f", descriptor = "Z")
	public static boolean aBoolean265 = false;

	@OriginalMember(owner = "client!gq", name = "n", descriptor = "I")
	public static int anInt3256 = 0;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I[Ljava/lang/String;)V")
	public static void method2887(@OriginalArg(1) String[] arg0) {
		if (arg0.length <= 1) {
			Static497.aString134 = Static497.aString134 + arg0[0];
			Static287.anInt5059 += arg0[0].length();
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < arg0.length; local16++) {
			if (arg0[local16].startsWith("pause")) {
				@Pc(30) int local30 = 5;
				try {
					local30 = Integer.parseInt(arg0[local16].substring(6));
				} catch (@Pc(39) Exception local39) {
				}
				Static619.method3013("Pausing for " + local30 + " seconds...");
				Static107.aStringArray14 = arg0;
				Static553.anInt9325 = local16 + 1;
				Static61.aLong28 = (long) (local30 * 1000) + Static515.method7499(127);
				return;
			}
			Static497.aString134 = arg0[local16];
			Static566.method8155(false);
		}
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)I")
	public static int method2892() {
		return Static410.aClass194_1.method4384();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static168 {

	@OriginalMember(owner = "client!ib", name = "u", descriptor = "Lclient!dn;")
	public static Class56 aClass56_40;

	@OriginalMember(owner = "client!ib", name = "w", descriptor = "[Lclient!f;")
	public static Class22[] aClass22Array11;

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "[I")
	public static int[] anIntArray264;

	@OriginalMember(owner = "client!ib", name = "q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray75 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!ib", name = "x", descriptor = "[I")
	public static final int[] anIntArray263 = new int[250];

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2912(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			Static414.method5552(Static140.aClass92_98);
			Static302.aClass3_Sub2_Sub2_2.method6001(Static442.method5901(arg0));
			Static302.aClass3_Sub2_Sub2_2.method6033(arg0);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)Z")
	public static boolean method2914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}
}

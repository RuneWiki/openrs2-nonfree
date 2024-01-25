import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!f", name = "m", descriptor = "Lclient!jia;")
	public static Class172 aClass172_12;

	@OriginalMember(owner = "client!f", name = "q", descriptor = "[I")
	public static int[] anIntArray552;

	@OriginalMember(owner = "client!f", name = "h", descriptor = "[I")
	public static final int[] anIntArray551 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!f", name = "o", descriptor = "Z")
	public static boolean aBoolean634 = true;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "([BB)Ljava/lang/String;")
	public static String method7671(@OriginalArg(0) byte[] arg0) {
		return Static89.method2004(arg0, arg0.length, 0);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method7673(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local15 = arg0.charAt(local17) + (local15 << 5) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(ILjava/lang/String;)V")
	public static void method7674(@OriginalArg(1) String arg0) {
		System.exit(1);
	}
}

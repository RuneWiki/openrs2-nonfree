import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static612 {

	@OriginalMember(owner = "client!up", name = "f", descriptor = "[Lclient!th;")
	public static Class348[] aClass348Array4;

	@OriginalMember(owner = "client!up", name = "g", descriptor = "D")
	public static double aDouble27;

	@OriginalMember(owner = "client!up", name = "d", descriptor = "Lclient!nea;")
	public static final Class244 aClass244_15 = new Class244(1);

	@OriginalMember(owner = "client!up", name = "e", descriptor = "Lclient!bn;")
	public static final Class37 aClass37_10 = new Class37("WTRC", "office", "_rc", 1);

	@OriginalMember(owner = "client!up", name = "h", descriptor = "I")
	public static int anInt10754 = 0;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!gga;Lclient!gga;BLclient!gga;Lclient!gga;)V")
	public static void method9196(@OriginalArg(0) Class124 arg0, @OriginalArg(1) Class124 arg1, @OriginalArg(3) Class124 arg2, @OriginalArg(4) Class124 arg3) {
		Static76.aClass124_19 = arg2;
		Static428.aClass124_85 = arg1;
		Static78.aClass124_20 = arg0;
		Static111.aClass357ArrayArray1 = new Class357[Static78.aClass124_20.method3633()][];
		Static505.aBooleanArray62 = new boolean[Static78.aClass124_20.method3633()];
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(BII)Z")
	public static boolean method9197(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return ((arg1 & 0x2000) != 0 | Static140.method7796(arg0, arg1) | Static160.method9141(arg0, arg1)) & Static592.method9189(arg1, arg0);
	}
}

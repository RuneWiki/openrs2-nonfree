import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!me", name = "D", descriptor = "I")
	public static int anInt4449;

	@OriginalMember(owner = "client!me", name = "E", descriptor = "Lclient!ra;")
	public static Class67 aClass67_9;

	@OriginalMember(owner = "client!me", name = "G", descriptor = "I")
	public static int anInt4450;

	@OriginalMember(owner = "client!me", name = "x", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_54 = new Class306("shake:", "schütteln:", "tremblement:", "tremor:");

	@OriginalMember(owner = "client!me", name = "C", descriptor = "Lclient!bv;")
	public static final Class37 aClass37_47 = new Class37();

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(FLclient!j;FIFFBIIIF)[B")
	public static byte[] method3866(@OriginalArg(0) float arg0, @OriginalArg(1) Class147 arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(10) float arg5) {
		@Pc(15) byte[] local15 = new byte[262144];
		Static344.method5216(arg1, arg4, 0, arg5, local15, arg0, arg3, arg2);
		return local15;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/lang/String;CB)I")
	public static int method3874(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			if (arg0.charAt(local17) == arg1) {
				local7++;
			}
		}
		return local7;
	}
}

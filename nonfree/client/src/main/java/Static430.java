import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
	public static int anInt7500;

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_117 = new Class47(56, -1);

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "[I")
	public static final int[] anIntArray541 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "([Ljava/lang/String;I[S)V")
	public static void method6179(@OriginalArg(0) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static160.method2954(arg1, 0, arg0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method6181(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) long local15 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = (local15 << 5) + (((long) arg0.charAt(local17)) - local15);
		}
		return local15;
	}
}

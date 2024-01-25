import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "Z")
	public static boolean aBoolean514 = false;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIILjava/awt/Canvas;ILclient!cb;ZLclient!d;)Lclient!ha;")
	public static synchronized Class143 method6193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Canvas arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class50 arg5, @OriginalArg(7) Interface3 arg6) {
		if (arg2 == 0) {
			return Static589.method8010(arg6, arg0, arg3, arg1);
		} else if (arg2 == 2) {
			return Static492.method5400(arg3, arg6, arg1, arg0);
		} else if (arg2 == 1) {
			return Static514.method7332(arg6, arg4, arg3);
		} else if (arg2 == 5) {
			return Static381.method5573(arg5, arg6, arg3, arg4);
		} else if (arg2 == 3) {
			return Static683.method7161(arg6, arg3, arg4, arg5);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/String;Z)J")
	public static long method6255(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) long local8 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local6; local17++) {
			local8 = (long) arg0.charAt(local17) + (local8 << 5) - local8;
		}
		return local8;
	}
}

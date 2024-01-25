import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "F")
	public static float aFloat140;

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "Lclient!pl;")
	public static final Class273 aClass273_29 = new Class273(64);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIFIFLclient!ifa;FIIFF)[B")
	public static byte[] method6720(@OriginalArg(2) float arg0, @OriginalArg(4) float arg1, @OriginalArg(5) Class136 arg2, @OriginalArg(6) float arg3, @OriginalArg(9) float arg4, @OriginalArg(10) float arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static266.method4295(arg0, arg1, local10, arg3, 0, arg2, arg4, arg5);
		return local10;
	}
}

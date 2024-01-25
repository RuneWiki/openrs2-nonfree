import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static569 {

	@OriginalMember(owner = "client!uda", name = "c", descriptor = "I")
	public static int anInt9425;

	@OriginalMember(owner = "client!uda", name = "f", descriptor = "Lclient!mfa;")
	public static Class215 aClass215_4;

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(BFIFFFLclient!qi;IIFI)[B")
	public static byte[] method8127(@OriginalArg(1) float arg0, @OriginalArg(3) float arg1, @OriginalArg(4) float arg2, @OriginalArg(5) float arg3, @OriginalArg(6) Class234 arg4, @OriginalArg(9) float arg5) {
		@Pc(26) byte[] local26 = new byte[262144];
		Static394.method6366(local26, 0, arg5, arg3, arg4, arg2, arg1, arg0);
		return local26;
	}
}

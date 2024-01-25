import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!ht", name = "g", descriptor = "Lclient!fia;")
	public static Class45 aClass45_13;

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IFFFFIIZILclient!ra;F)[B")
	public static byte[] method3981(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(9) Class295 arg4, @OriginalArg(10) float arg5) {
		@Pc(17) byte[] local17 = new byte[262144];
		Static219.method3790(arg5, arg2, arg4, arg0, arg3, local17, arg1, 0);
		return local17;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(FFFFIFLclient!ba;IIII)[B")
	public static byte[] method6483(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) Class26 arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static200.method3277(arg5, 0, local10, arg2, arg3, arg1, arg4, arg0);
		return local10;
	}
}

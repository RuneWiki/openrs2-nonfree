import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "I")
	public static int anInt9377 = 0;

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "([BB)[B")
	public static byte[] method7220(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) byte[] local16 = new byte[arg0.length];
			Static599.method3060(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(ZJLclient!vo;IIII)V")
	public static void method7221(@OriginalArg(1) long arg0, @OriginalArg(2) Class348 arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		Static99.method1927(arg0, arg2, arg1, arg3);
	}
}

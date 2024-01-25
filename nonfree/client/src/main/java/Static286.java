import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!jm", name = "E", descriptor = "I")
	public static int anInt4563;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IZ[B)[B")
	public static byte[] method4119(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(11) byte[] local11 = new byte[arg0];
		Static685.method6464(arg1, 0, local11, 0, arg0);
		return local11;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)I")
	public static int method4120() {
		return Static106.anInt2134 == 1 ? Static426.anInt6744 : 0;
	}
}

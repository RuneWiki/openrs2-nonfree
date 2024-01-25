import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!jm", name = "ed", descriptor = "Lclient!sn;")
	public static final Class225 aClass225_10 = new Class225(11, 4);

	@OriginalMember(owner = "client!jm", name = "fd", descriptor = "Z")
	public static boolean aBoolean199 = false;

	@OriginalMember(owner = "client!jm", name = "gd", descriptor = "[I")
	public static final int[] anIntArray274 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(IZI)I")
	public static int method2628(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static266.method3616(arg0 - 1, arg1 + -1) + Static266.method3616(arg0 - 1, arg1 + 1) + Static266.method3616(arg0 - -1, arg1 + -1) + Static266.method3616(arg0 + 1, arg1 + 1);
		@Pc(76) int local76 = Static266.method3616(arg0, arg1 - 1) + Static266.method3616(arg0, arg1 + 1) + Static266.method3616(arg0 - 1, arg1) + Static266.method3616(arg0 + 1, arg1);
		@Pc(81) int local81 = Static266.method3616(arg0, arg1);
		return local76 / 8 + local41 / 16 + local81 / 4;
	}

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "(B)I")
	public static int method2631() {
		return Static406.anInt6642;
	}
}

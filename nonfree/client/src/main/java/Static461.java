import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static461 {

	@OriginalMember(owner = "client!qha", name = "F", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_129 = new Class274(42, -2);

	@OriginalMember(owner = "client!qha", name = "M", descriptor = "[Lclient!hn;")
	public static final Class149[] aClass149Array1 = new Class149[14];

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IIB)Z")
	public static boolean method6714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static167.method3081(arg0, arg1) & Static404.method784(arg1, arg0);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(BII)I")
	public static int method6716(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}
}

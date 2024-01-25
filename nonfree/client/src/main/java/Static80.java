import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!dp", name = "o", descriptor = "Lclient!sl;")
	public static Class191 aClass191_1;

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "Lclient!d;")
	public static final Class44 aClass44_14 = new Class44(64);

	@OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
	public static int anInt1417 = -2;

	@OriginalMember(owner = "client!dp", name = "k", descriptor = "Lclient!vg;")
	public static final Class252 aClass252_10 = new Class252(16);

	@OriginalMember(owner = "client!dp", name = "n", descriptor = "[I")
	public static final int[] anIntArray70 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIZ)I")
	public static int method1165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) Class5_Sub26 local10 = Static176.method2415(arg2, arg1);
		if (local10 == null) {
			return 0;
		} else if (arg0 >= 0 && local10.anIntArray249.length > arg0) {
			return local10.anIntArray249[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(III[B)[B")
	public static byte[] method1166(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		@Pc(11) byte[] local11 = new byte[32768];
		Static468.method3858(arg1, arg0, local11, 0, 32768);
		return local11;
	}
}

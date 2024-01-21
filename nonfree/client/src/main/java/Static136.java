import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!q", name = "r", descriptor = "Lclient!td;")
	public static Class84 aClass84_5;

	@OriginalMember(owner = "client!q", name = "x", descriptor = "Lclient!nh;")
	public static Class62 aClass62_33;

	@OriginalMember(owner = "client!q", name = "A", descriptor = "Lclient!rf;")
	public static Class4_Sub1_Sub7_Sub2 aClass4_Sub1_Sub7_Sub2_5;

	@OriginalMember(owner = "client!q", name = "D", descriptor = "Lclient!nh;")
	public static Class62 aClass62_34;

	@OriginalMember(owner = "client!q", name = "v", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1188 = Static177.method3050(" has logged in)3");

	@OriginalMember(owner = "client!q", name = "w", descriptor = "[I")
	public static final int[] anIntArray309 = new int[128];

	@OriginalMember(owner = "client!q", name = "y", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1189 = Static177.method3050(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!q", name = "F", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1190 = aClass46_1188;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
	public static byte[] method2378(@OriginalArg(1) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return arg0 ? Static50.method960(local18) : local18;
		} else if (arg1 instanceof Class50) {
			@Pc(32) Class50 local32 = (Class50) arg1;
			return local32.method2232();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "([[II)V")
	public static void method2379(@OriginalArg(0) int[][] arg0) {
	}
}

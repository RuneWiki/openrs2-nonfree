import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static306 {

	@OriginalMember(owner = "client!mn", name = "l", descriptor = "Lclient!kea;")
	public static Class161 aClass161_60;

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "Lclient!ua;")
	public static final Class289 aClass289_2 = new Class289();

	@OriginalMember(owner = "client!mn", name = "g", descriptor = "S")
	public static short aShort89 = 256;

	@OriginalMember(owner = "client!mn", name = "j", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_103 = new Class133(33, 0);

	@OriginalMember(owner = "client!mn", name = "k", descriptor = "[F")
	public static final float[] aFloatArray41 = new float[4];

	@OriginalMember(owner = "client!mn", name = "m", descriptor = "[I")
	public static final int[] anIntArray536 = new int[1000];

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIIII)V")
	public static void method5022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == arg3) {
			Static275.method4761(arg3, arg4, arg2, arg0);
		} else if (arg4 - arg3 >= Static190.anInt4314 && Static145.anInt2941 >= arg3 + arg4 && arg2 - arg1 >= Static269.anInt5577 && arg1 + arg2 <= Static81.anInt1788) {
			Static16.method670(arg0, arg1, arg2, arg3, arg4);
		} else {
			Static145.method2509(arg4, arg3, arg2, arg0, arg1);
		}
	}
}

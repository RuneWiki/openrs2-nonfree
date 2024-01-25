import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static527 {

	@OriginalMember(owner = "client!ub", name = "W", descriptor = "Lclient!jl;")
	public static Class175 aClass175_1;

	@OriginalMember(owner = "client!ub", name = "M", descriptor = "[F")
	public static final float[] aFloatArray67 = new float[4];

	@OriginalMember(owner = "client!ub", name = "U", descriptor = "Z")
	public static boolean aBoolean670 = false;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZIIIZII)V")
	public static void method7270(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static471.anInt8055 = arg5;
		Static400.anInt6972 = arg0;
		Static529.anInt9415 = arg4;
		Static326.anInt6029 = arg1;
		Static570.anInt6328 = arg2;
		if (arg3 && Static570.anInt6328 >= 100) {
			Static90.anInt1932 = Static400.anInt6972 * 512 + 256;
			Static7.anInt337 = Static529.anInt9415 * 512 + 256;
			Static548.anInt8906 = Static524.method7217(Static90.anInt1932, Static566.anInt9278, Static7.anInt337) - Static471.anInt8055;
		}
		Static94.anInt2006 = -1;
		Static238.anInt4482 = -1;
		Static311.anInt5570 = 2;
	}
}

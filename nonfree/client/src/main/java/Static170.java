import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static170 {

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
	public static int anInt3418;

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "Lclient!m;")
	public static Class128 aClass128_4;

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "[F")
	public static final float[] aFloatArray25 = new float[4];

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)Z")
	public static boolean method3194(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static20.method592(arg0, arg1) & Static132.method2520(arg0, arg1);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)I")
	public static int method3195(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}

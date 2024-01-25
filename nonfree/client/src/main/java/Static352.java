import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static352 {

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "F")
	public static float aFloat139;

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "Lclient!baa;")
	public static Class27 aClass27_1;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "[F")
	public static final float[] aFloatArray71 = new float[4];

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "[Lclient!pd;")
	public static final Class252[] aClass252Array1 = new Class252[2048];

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BII)Z")
	public static boolean method5160(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}
}

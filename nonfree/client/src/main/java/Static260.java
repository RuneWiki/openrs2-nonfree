import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static260 {

	@OriginalMember(owner = "client!it", name = "f", descriptor = "I")
	public static int anInt4118 = 0;

	@OriginalMember(owner = "client!it", name = "i", descriptor = "[F")
	public static final float[] aFloatArray16 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(III)Z")
	public static boolean method3619(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}
}

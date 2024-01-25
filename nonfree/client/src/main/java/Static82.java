import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static82 {

	@OriginalMember(owner = "client!co", name = "a", descriptor = "[F")
	public static final float[] aFloatArray12 = new float[4];

	@OriginalMember(owner = "client!co", name = "b", descriptor = "Z")
	public static boolean aBoolean134 = false;

	@OriginalMember(owner = "client!co", name = "c", descriptor = "Ljava/lang/Object;")
	public static volatile Object anObject3 = null;

	@OriginalMember(owner = "client!co", name = "d", descriptor = "I")
	public static final int anInt1629 = 1408;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BF)F")
	public static float method1584(@OriginalArg(1) float arg0) {
		return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static325 {

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
	public static int anInt5475 = 0;

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "[F")
	public static final float[] aFloatArray36 = new float[4];

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "[I")
	public static final int[] anIntArray473 = new int[2048];

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "Lclient!wca;")
	public static Class310 aClass310_15 = null;

	@OriginalMember(owner = "client!nl", name = "f", descriptor = "Z")
	public static boolean aBoolean410 = false;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIZ)Z")
	public static boolean method4709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x20) != 0;
	}
}

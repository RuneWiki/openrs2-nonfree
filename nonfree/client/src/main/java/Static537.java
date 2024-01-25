import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static537 {

	@OriginalMember(owner = "client!sea", name = "C", descriptor = "B")
	public static byte aByte59;

	@OriginalMember(owner = "client!sea", name = "p", descriptor = "I")
	public static int anInt3990 = 2;

	@OriginalMember(owner = "client!sea", name = "w", descriptor = "[F")
	public static final float[] aFloatArray34 = new float[4];

	@OriginalMember(owner = "client!sea", name = "x", descriptor = "[I")
	public static final int[] anIntArray203 = new int[14];

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(III)Z")
	public static boolean method3393(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}
}

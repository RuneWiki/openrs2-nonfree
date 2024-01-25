import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static601 {

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "J")
	public static long aLong262;

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
	public static int anInt10558;

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "[F")
	public static final float[] aFloatArray85 = new float[2];

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "[I")
	public static final int[] anIntArray681 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "[I")
	public static final int[] anIntArray682 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZ)Z")
	public static boolean method8802(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}
}

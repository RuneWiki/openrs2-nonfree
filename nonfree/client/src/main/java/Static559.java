import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static559 {

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "Ljava/lang/Object;")
	public static Object anObject22;

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "Lclient!pu;")
	public static Class270 aClass270_116;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "[F")
	public static final float[] aFloatArray61 = new float[4];

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray198 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "Z")
	public static boolean aBoolean727 = false;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)Z")
	public static boolean method7593(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}
}

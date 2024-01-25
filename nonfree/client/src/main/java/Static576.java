import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static576 {

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "F")
	public static float aFloat249;

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "Ljava/util/Random;")
	public static final Random aRandom4 = new Random();

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray49 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)I")
	public static int method6554(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}

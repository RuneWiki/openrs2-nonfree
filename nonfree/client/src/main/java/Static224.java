import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static224 {

	@OriginalMember(owner = "client!iaa", name = "o", descriptor = "[I")
	public static final int[] anIntArray321 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!iaa", name = "q", descriptor = "J")
	public static long aLong118 = 0L;

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ILclient!nt;II)V")
	public static void method3510(@OriginalArg(0) int arg0, @OriginalArg(1) Class248 arg1, @OriginalArg(3) int arg2) {
		Static211.aClass248ArrayArray1[arg0][arg2] = arg1;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static255 {

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
	public static int anInt4791 = 0;

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "[I")
	public static final int[] anIntArray399 = new int[14];

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZII)V")
	public static void method3871(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		Static227.aByteArrayArrayArray8 = new byte[4][arg0][arg1];
	}
}

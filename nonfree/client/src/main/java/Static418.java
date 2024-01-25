import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray68 = new int[6][];

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "[[B")
	public static final byte[][] aByteArrayArray23 = new byte[250][];

	@OriginalMember(owner = "client!rk", name = "h", descriptor = "[I")
	public static final int[] anIntArray597 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!rk", name = "k", descriptor = "[I")
	public static final int[] anIntArray598 = new int[1000];

	@OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
	public static int anInt7795 = 0;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIB)V")
	public static void method6524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(8) int local8 = arg3; local8 <= arg0; local8++) {
			Static403.method6377(arg4, Static130.anIntArrayArray89[local8], arg2, arg1);
		}
	}
}

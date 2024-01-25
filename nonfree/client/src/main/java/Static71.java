import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
	public static int anInt9542 = 0;

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "[I")
	public static final int[] anIntArray523 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "([BIFLclient!fc;FFIIZIIFF)V")
	public static void method8031(@OriginalArg(0) byte[] arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Class34 arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(7) int arg5, @OriginalArg(11) float arg6, @OriginalArg(12) float arg7) {
		for (@Pc(1) int local1 = 0; local1 < 16; local1++) {
			Static224.method3500(arg2, arg5, arg3, arg4, local1, arg6, arg1, arg0, arg7);
			arg5 += 16384;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)I")
	public static int method8032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static293.aShortArrayArray7 == null ? 0 : Static293.aShortArrayArray7[arg0][arg1] & 0xFFFF;
	}
}

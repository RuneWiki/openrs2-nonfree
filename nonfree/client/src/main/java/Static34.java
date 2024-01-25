import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bca", name = "D", descriptor = "I")
	public static int anInt915 = 0;

	@OriginalMember(owner = "client!bca", name = "eb", descriptor = "[I")
	public static final int[] anIntArray71 = new int[32];

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(IFIFFLclient!afa;FFIII[BI)V")
	public static void method818(@OriginalArg(1) float arg0, @OriginalArg(3) float arg1, @OriginalArg(4) float arg2, @OriginalArg(5) Class11 arg3, @OriginalArg(6) float arg4, @OriginalArg(7) float arg5, @OriginalArg(8) int arg6, @OriginalArg(11) byte[] arg7) {
		for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
			Static352.method5344(arg3, arg5, local12, arg6, arg1, arg7, arg4, arg2, arg0);
			arg6 += 16384;
		}
	}
}

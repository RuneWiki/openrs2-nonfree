import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static599 {

	@OriginalMember(owner = "client!vfa", name = "n", descriptor = "I")
	public static int anInt10169;

	@OriginalMember(owner = "client!vfa", name = "o", descriptor = "I")
	public static int anInt10170;

	@OriginalMember(owner = "client!vfa", name = "k", descriptor = "I")
	public static int anInt10166 = 0;

	@OriginalMember(owner = "client!vfa", name = "p", descriptor = "I")
	public static int anInt10171 = 0;

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I)I")
	public static int method8297() {
		return 16;
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IILclient!cn;BFFIFIIF[BF)V")
	public static void method8298(@OriginalArg(0) int arg0, @OriginalArg(2) Class53 arg1, @OriginalArg(4) float arg2, @OriginalArg(5) float arg3, @OriginalArg(7) float arg4, @OriginalArg(10) float arg5, @OriginalArg(11) byte[] arg6, @OriginalArg(12) float arg7) {
		for (@Pc(3) int local3 = 0; local3 < 16; local3++) {
			Static89.method2284(arg4, arg0, arg3, arg2, arg1, arg5, arg6, arg7, local3);
			arg0 += 16384;
		}
	}
}

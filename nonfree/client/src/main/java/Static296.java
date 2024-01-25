import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!md", name = "t", descriptor = "I")
	public static int anInt5736;

	@OriginalMember(owner = "client!md", name = "q", descriptor = "I")
	public static int anInt5734 = 0;

	@OriginalMember(owner = "client!md", name = "B", descriptor = "I")
	public static int anInt5741 = 0;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)I")
	public static int method4972() {
		return Static231.anInt7332;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZLclient!mba;IFIIFIFFI[BF)V")
	public static void method4976(@OriginalArg(1) Class104 arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(6) float arg3, @OriginalArg(8) float arg4, @OriginalArg(9) float arg5, @OriginalArg(11) byte[] arg6, @OriginalArg(12) float arg7) {
		for (@Pc(5) int local5 = 0; local5 < 16; local5++) {
			Static12.method680(arg4, arg6, arg7, local5, arg2, arg5, arg0, arg1, arg3);
			arg2 += 16384;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(BLclient!ln;)V")
	public static void method3421(@OriginalArg(1) Class147 arg0) {
		Static13.aClass147_1 = arg0;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIII)I")
	public static int method3422(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = 255 - arg0;
		@Pc(26) int local26 = (arg0 * (arg2 & 0xFF00FF) & 0xFF00FF00 | (arg2 & 0xFF00) * arg0 & 0xFF0000) >>> 8;
		return local26 + ((local8 * (arg1 & 0xFF00) & 0xFF0000 | (arg1 & 0xFF00FF) * local8 & 0xFF00FF00) >>> 8);
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(II)I")
	public static int method3426(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}

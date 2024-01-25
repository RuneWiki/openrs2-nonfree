import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!sr", name = "h", descriptor = "Lclient!dea;")
	public static Class68 aClass68_67 = new Class68(8);

	@OriginalMember(owner = "client!sr", name = "p", descriptor = "[I")
	public static final int[] anIntArray618 = new int[1];

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)I")
	public static int method6870(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 >>> 24;
		@Pc(20) int local20 = 255 - local15;
		@Pc(38) int local38 = ((arg0 & 0xFF00FF) * local15 & 0xFF00FF00 | local15 * (arg0 & 0xFF00) & 0xFF0000) >>> 8;
		return (((arg1 & 0xFF00FF) * local20 & 0xFF00FF00 | local20 * (arg1 & 0xFF00) & 0xFF0000) >>> 8) + local38;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(BI)V")
	public static void method6872(@OriginalArg(1) int arg0) {
		if (Static111.anInt2588 == 0) {
			Static493.aClass12_Sub13_Sub2_3.method4262(arg0);
		} else {
			Static512.anInt9218 = arg0;
		}
	}
}

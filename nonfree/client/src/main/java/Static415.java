import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "[I")
	public static int[] anIntArray396;

	@OriginalMember(owner = "client!nd", name = "x", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_130 = new Class186(143, 4);

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B[Ljava/lang/String;[S)V")
	public static void method6178(@OriginalArg(1) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static39.method584(arg0, arg1, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBII)I")
	public static int method6180(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 4095 - arg2;
		} else {
			return 4095 - arg0;
		}
	}
}

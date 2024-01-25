import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!lj", name = "K", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray20;

	@OriginalMember(owner = "client!lj", name = "N", descriptor = "Lclient!bu;")
	public static Class30 aClass30_2;

	@OriginalMember(owner = "client!lj", name = "H", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_112 = new Class208(57, 10);

	@OriginalMember(owner = "client!lj", name = "L", descriptor = "[Lclient!c;")
	public static final Class31[] aClass31Array1 = new Class31[16];

	@OriginalMember(owner = "client!lj", name = "M", descriptor = "I")
	public static final int anInt4107 = 0;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIZ)I")
	public static int method3599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(21) int local21 = 65536 - Class106.anIntArray242[arg0 * 8192 / arg3] >> 1;
		return ((65536 - local21) * arg1 >> 16) + (arg2 * local21 >> 16);
	}
}

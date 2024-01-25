import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString35;

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_142 = new Class137(80, 2);

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_143 = new Class137(42, -1);

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "[I")
	public static final int[] anIntArray181 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BIII)I")
	public static int method2796(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg2) {
			return arg0;
		}
		@Pc(25) int local25 = 128 - arg1;
		@Pc(40) int local40 = (arg0 & 0x7F) * local25 + arg1 * (arg2 & 0x7F) >> 7;
		@Pc(54) int local54 = arg1 * (arg2 & 0x380) + (arg0 & 0x380) * local25 >> 7;
		@Pc(69) int local69 = local25 * (arg0 & 0xFC00) + (arg2 & 0xFC00) * arg1 >> 7;
		return local54 & 0x380 | local69 & 0xFC00 | local40 & 0x7F;
	}
}

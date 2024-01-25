import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!gg", name = "X", descriptor = "I")
	public static int anInt2250;

	@OriginalMember(owner = "client!gg", name = "Z", descriptor = "Lclient!iq;")
	public static Class104 aClass104_71;

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray15 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!gg", name = "y", descriptor = "Lclient!sf;")
	public static Class180 aClass180_15 = new Class180();

	@OriginalMember(owner = "client!gg", name = "H", descriptor = "[I")
	public static final int[] anIntArray178 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!gg", name = "qb", descriptor = "I")
	public static int anInt2266 = 0;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIII)I")
	public static int method2106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 / arg1;
		@Pc(13) int local13 = arg2 & arg1 - 1;
		@Pc(17) int local17 = arg0 / arg1;
		@Pc(23) int local23 = arg1 - 1 & arg0;
		@Pc(28) int local28 = Static17.method255(local7, local17);
		@Pc(37) int local37 = Static17.method255(local7 + 1, local17);
		@Pc(44) int local44 = Static17.method255(local7, local17 + 1);
		@Pc(53) int local53 = Static17.method255(local7 + 1, local17 + 1);
		@Pc(60) int local60 = Static226.method4197(local13, arg1, local28, local37);
		@Pc(67) int local67 = Static226.method4197(local13, arg1, local44, local53);
		return Static226.method4197(local23, arg1, local60, local67);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!fd", name = "Rd", descriptor = "Lclient!sp;")
	public static Class219 aClass219_2;

	@OriginalMember(owner = "client!fd", name = "Ec", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_25 = new Class215(2, -1);

	@OriginalMember(owner = "client!fd", name = "xd", descriptor = "[I")
	public static final int[] anIntArray159 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!fd", name = "Jd", descriptor = "I")
	public static int anInt2252 = 0;

	@OriginalMember(owner = "client!fd", name = "be", descriptor = "[I")
	public static final int[] anIntArray160 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(IIII)I")
	public static int method1972(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 / arg0;
		@Pc(13) int local13 = arg0 - 1 & arg2;
		@Pc(17) int local17 = arg1 / arg0;
		@Pc(23) int local23 = arg1 & arg0 - 1;
		@Pc(28) int local28 = Static99.method1757(local7, local17);
		@Pc(35) int local35 = Static99.method1757(local7 + 1, local17);
		@Pc(42) int local42 = Static99.method1757(local7, local17 + 1);
		@Pc(51) int local51 = Static99.method1757(local7 + 1, local17 + 1);
		@Pc(58) int local58 = Static227.method3450(local13, arg0, local28, local35);
		@Pc(65) int local65 = Static227.method3450(local13, arg0, local42, local51);
		return Static227.method3450(local23, arg0, local58, local65);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!at", name = "F", descriptor = "I")
	public static int anInt9830 = 1;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IIZI)I")
	public static int method7565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 / arg1;
		@Pc(13) int local13 = arg2 & arg1 - 1;
		@Pc(17) int local17 = arg0 / arg1;
		@Pc(23) int local23 = arg1 - 1 & arg0;
		@Pc(28) int local28 = Static420.method6294(local7, local17);
		@Pc(35) int local35 = Static420.method6294(local7 + 1, local17);
		@Pc(51) int local51 = Static420.method6294(local7, local17 + 1);
		@Pc(60) int local60 = Static420.method6294(local7 + 1, local17 + 1);
		@Pc(67) int local67 = Static40.method1068(local28, arg1, local35, local13);
		@Pc(74) int local74 = Static40.method1068(local51, arg1, local60, local13);
		return Static40.method1068(local67, arg1, local74, local23);
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(II)V")
	public static void method7566(@OriginalArg(1) int arg0) {
		Static536.anInt9797 = 3;
		Static139.anInt3063 = arg0;
		Static44.anInt1296 = 100;
		Static537.anInt9803 = -1;
	}
}

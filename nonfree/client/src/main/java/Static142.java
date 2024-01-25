import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!ffa", name = "n", descriptor = "Lclient!jo;")
	public static Class168 aClass168_36;

	@OriginalMember(owner = "client!ffa", name = "k", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_37 = new Class181(18, 3);

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIII)I")
	public static int method2656(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg0;
		@Pc(13) int local13 = arg0 - 1 & arg1;
		@Pc(17) int local17 = arg2 / arg0;
		@Pc(23) int local23 = arg0 - 1 & arg2;
		@Pc(28) int local28 = Static425.method6556(local17, local7);
		@Pc(35) int local35 = Static425.method6556(local17, local7 + 1);
		@Pc(42) int local42 = Static425.method6556(local17 + 1, local7);
		@Pc(51) int local51 = Static425.method6556(local17 + 1, local7 + 1);
		@Pc(58) int local58 = Static76.method1690(local13, local28, arg0, local35);
		@Pc(65) int local65 = Static76.method1690(local13, local42, arg0, local51);
		return Static76.method1690(local23, local58, arg0, local65);
	}
}

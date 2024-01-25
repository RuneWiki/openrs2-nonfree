import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!fk", name = "k", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_55 = new Class126(106, 6);

	@OriginalMember(owner = "client!fk", name = "q", descriptor = "J")
	public static long aLong88 = 0L;

	@OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
	public static int anInt3059 = -60;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIZ)Z")
	public static boolean method2795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(11) Interface2 local11 = (Interface2) Static363.method5416(arg2, arg0, arg1);
		if (local11 != null) {
			local5 = Static64.method1542(local11) & true;
		}
		local11 = (Interface2) Static344.method5203(arg2, arg0, arg1, bea.class);
		if (local11 != null) {
			local5 &= Static64.method1542(local11);
		}
		local11 = (Interface2) Static306.method4709(arg2, arg0, arg1);
		if (local11 != null) {
			local5 &= Static64.method1542(local11);
		}
		return local5;
	}
}

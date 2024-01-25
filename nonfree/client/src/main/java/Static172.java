import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!im", name = "g", descriptor = "Lclient!kd;")
	public static Class13 aClass13_1;

	@OriginalMember(owner = "client!im", name = "f", descriptor = "I")
	public static int anInt3375 = -1;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(III)Z")
	public static boolean method3020(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(15) Class139 local15 = Static146.aClass228_1.method5203(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local15.method3762(arg0);
	}
}

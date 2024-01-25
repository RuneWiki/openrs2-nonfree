import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static513 {

	@OriginalMember(owner = "client!vh", name = "J", descriptor = "I")
	public static int anInt9239;

	@OriginalMember(owner = "client!vh", name = "C", descriptor = "Lclient!ml;")
	public static final Class202 aClass202_46 = new Class202(0, 16);

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(III)Z")
	public static boolean method7615(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x10000) != 0 | Static133.method2769(arg1, arg0) || Static108.method2268(arg1, arg0)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static226.method4100(arg0, arg1);
		}
	}
}

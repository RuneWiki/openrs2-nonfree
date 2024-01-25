import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "Lclient!aj;")
	public static Class15 aClass15_75;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "J")
	public static long aLong145;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "Lclient!tm;")
	public static final Class338 aClass338_120 = new Class338();

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!dr;I)Lclient!dr;")
	public static Class3_Sub1_Sub3 method4374(@OriginalArg(0) Class3_Sub1_Sub3 arg0) {
		@Pc(14) Class3_Sub1_Sub3 local14 = arg0 == null ? new Class3_Sub1_Sub3() : new Class3_Sub1_Sub3(arg0);
		local14.method2160();
		return local14;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIB)Z")
	public static boolean method4375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 1000 && arg0 < 1000) {
			return true;
		} else if (arg1 >= 1000 || arg0 >= 1000) {
			return arg1 >= 1000 && arg0 >= 1000;
		} else if (Static273.method4433(arg0)) {
			return true;
		} else {
			return !Static273.method4433(arg1);
		}
	}
}

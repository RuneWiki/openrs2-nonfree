import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!io", name = "U", descriptor = "Lclient!bi;")
	public static Class31 aClass31_51;

	@OriginalMember(owner = "client!io", name = "J", descriptor = "I")
	public static int anInt4661 = -1;

	@OriginalMember(owner = "client!io", name = "P", descriptor = "Lclient!kf;")
	public static final Class194 aClass194_5 = new Class194();

	@OriginalMember(owner = "client!io", name = "T", descriptor = "J")
	public static long aLong119 = 0L;

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(IB)Z")
	public static boolean method3959(@OriginalArg(0) int arg0) {
		if (arg0 == 3 || arg0 == 13 || arg0 == 49 || arg0 == 11 || arg0 == 1004) {
			return true;
		} else {
			return arg0 == 16 || arg0 == 1010;
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ZIILclient!oa;)Lclient!ta;")
	public static Class91 method3960(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class66 arg2) {
		@Pc(18) Class352 local18 = Static376.method5611(arg2, arg1, arg0);
		return local18 == null ? null : local18.aClass91_11;
	}
}

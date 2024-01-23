import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
	public static int anInt362;

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "D")
	public static double aDouble1 = -1.0D;

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "Lclient!qe;")
	public static Class78 aClass78_60 = null;

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "Lclient!qe;")
	public static Class78 aClass78_61 = Static199.method3560("Eingabeprozedur geladen)3");

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)Lclient!sh;")
	public static Class2_Sub3_Sub27 method266(@OriginalArg(0) int arg0) {
		@Pc(13) Class2_Sub3_Sub27 local13 = (Class2_Sub3_Sub27) Static58.aClass110_8.method3891((long) arg0);
		if (local13 != null) {
			return local13;
		}
		@Pc(33) byte[] local33 = Static40.aClass72_49.method3197(Static155.method2769(arg0), Static208.method3663(arg0));
		local13 = new Class2_Sub3_Sub27();
		local13.anInt4371 = arg0;
		if (local33 != null) {
			local13.method3451(new Class2_Sub23(local33));
		}
		Static58.aClass110_8.method3894(local13, (long) arg0);
		return local13;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)Lclient!qe;")
	public static Class78 method268(@OriginalArg(1) int arg0) {
		return Static9.method189(arg0, false);
	}
}

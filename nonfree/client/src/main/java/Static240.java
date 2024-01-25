import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "F")
	public static float aFloat91;

	@OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
	public static int anInt4759;

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "[I")
	public static final int[] anIntArray222 = new int[3];

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IBIII)V")
	public static void method4307(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) Class2_Sub1_Sub5 local17 = Static653.method9595(10, (long) arg0);
		local17.method2486();
		local17.anInt2674 = arg3;
		local17.anInt2679 = arg1;
		local17.anInt2680 = arg2;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZIBI)Lclient!cv;")
	public static Class2_Sub20 method4308(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class2_Sub20 local7 = new Class2_Sub20();
		local7.anInt1668 = arg2;
		local7.anInt1667 = arg0;
		Static507.aClass335_33.method8356(local7, (long) arg3);
		Static275.method4672(arg0);
		@Pc(26) Class357 local26 = Static647.method9532(arg3);
		if (local26 != null) {
			Static473.method7526(local26);
		}
		if (Static122.aClass357_40 != null) {
			Static473.method7526(Static122.aClass357_40);
			Static122.aClass357_40 = null;
		}
		Static384.method6480();
		if (local26 != null) {
			Static171.method3357(!arg1, local26);
		}
		if (!arg1) {
			Static518.method8028(arg0);
		}
		if (!arg1 && Static567.anInt9844 != -1) {
			Static525.method8170(Static567.anInt9844, 1);
		}
		return local7;
	}
}

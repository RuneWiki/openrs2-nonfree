import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!iha", name = "B", descriptor = "D")
	public static double aDouble9;

	@OriginalMember(owner = "client!iha", name = "u", descriptor = "[I")
	public static final int[] anIntArray271 = new int[4096];

	@OriginalMember(owner = "client!iha", name = "y", descriptor = "J")
	public static long aLong113 = 0L;

	@OriginalMember(owner = "client!iha", name = "C", descriptor = "Z")
	public static boolean aBoolean380 = true;

	@OriginalMember(owner = "client!iha", name = "G", descriptor = "Z")
	public static final boolean aBoolean381 = false;

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "([I[JI)V")
	public static void method4485(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1) {
		Static197.method3972(0, arg1, arg1.length - 1, arg0);
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(BLclient!cea;)Lclient!fn;")
	public static Class110 method4487(@OriginalArg(1) Class2_Sub11 arg0) {
		@Pc(10) Class309 local10 = Static409.method6629()[arg0.method8383()];
		@Pc(22) Class86 local22 = Static277.method5088()[arg0.method8383()];
		@Pc(26) int local26 = arg0.method8368();
		@Pc(30) int local30 = arg0.method8368();
		@Pc(34) int local34 = arg0.method8326();
		@Pc(38) int local38 = arg0.method8326();
		@Pc(42) int local42 = arg0.method8368();
		@Pc(46) int local46 = arg0.method8381();
		@Pc(50) int local50 = arg0.method8381();
		return new Class110(local10, local22, local26, local30, local34, local38, local42, local46, local50);
	}
}

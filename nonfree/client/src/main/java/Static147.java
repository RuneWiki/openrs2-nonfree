import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!jd", name = "m", descriptor = "[I")
	public static final int[] anIntArray419 = new int[14];

	@OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
	public static int anInt3208 = 0;

	@OriginalMember(owner = "client!jd", name = "y", descriptor = "J")
	public static long aLong109 = 0L;

	@OriginalMember(owner = "client!jd", name = "C", descriptor = "[I")
	public static final int[] anIntArray420 = new int[64];

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)I")
	public static int method2948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 / arg0;
		@Pc(13) int local13 = arg2 & arg0 - 1;
		@Pc(17) int local17 = arg1 / arg0;
		@Pc(23) int local23 = arg1 & arg0 - 1;
		@Pc(28) int local28 = Static82.method1755(local7, local17);
		@Pc(35) int local35 = Static82.method1755(local7 + 1, local17);
		@Pc(42) int local42 = Static82.method1755(local7, local17 + 1);
		@Pc(53) int local53 = Static82.method1755(local7 + 1, local17 + 1);
		@Pc(62) int local62 = Static314.method5103(local28, local13, local35, arg0);
		@Pc(69) int local69 = Static314.method5103(local42, local13, local53, arg0);
		return Static314.method5103(local62, local23, local69, arg0);
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(ZI)Lclient!dj;")
	public static Class7_Sub1_Sub7 method2949(@OriginalArg(1) int arg0) {
		@Pc(10) Class7_Sub1_Sub7 local10 = (Class7_Sub1_Sub7) Static255.aClass154_5.method4079((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static5.aClass180_1.method4560(arg0, 19);
		local10 = new Class7_Sub1_Sub7();
		if (local20 != null) {
			local10.method1211(new Class7_Sub3(local20));
		}
		Static255.aClass154_5.method4078(local10, (long) arg0);
		return local10;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static670 {

	@OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
	public static int anInt6846;

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
	public static int anInt6844 = 0;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZ)V")
	public static void method6028(@OriginalArg(0) int arg0) {
		@Pc(13) Class4_Sub5_Sub11 local13 = Static652.method8695((long) arg0, 2);
		local13.method3956();
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)J")
	public static long method6029(@OriginalArg(0) int arg0) {
		return (long) (arg0 + 11745) * 86400000L;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!es;I)Lclient!aea;")
	public static Class4_Sub2 method6030(@OriginalArg(0) Class4_Sub11 arg0) {
		arg0.method8865();
		@Pc(13) int local13 = arg0.method8865();
		@Pc(17) Class4_Sub2 local17 = Static268.method3824(local13);
		local17.anInt10378 = arg0.method8865();
		@Pc(26) int local26 = arg0.method8865();
		for (@Pc(33) int local33 = 0; local33 < local26; local33++) {
			@Pc(39) int local39 = arg0.method8865();
			local17.method8767(local39, arg0);
		}
		local17.method8769();
		return local17;
	}
}

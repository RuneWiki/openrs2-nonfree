import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!go", name = "c", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread7;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "Lclient!ff;")
	public static final Class111 aClass111_6 = new Class111();

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BLclient!vo;)V")
	public static void method7612(@OriginalArg(1) Class381 arg0) {
		@Pc(7) Class381 local7 = Static266.method4536(arg0);
		@Pc(23) int local23;
		@Pc(20) int local20;
		if (local7 == null) {
			local20 = Static274.anInt3226;
			local23 = Static535.anInt4128;
		} else {
			local20 = local7.anInt10131;
			local23 = local7.anInt10159;
		}
		Static100.method1964(arg0, false, local23, local20);
		Static409.method6271(local20, local23, arg0);
	}
}

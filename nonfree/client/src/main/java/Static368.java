import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
	public static int anInt6287 = 0;

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray46 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "Lclient!vq;")
	public static final Class378 aClass378_1 = new Class378();

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!ib;I)V")
	public static void method5311(@OriginalArg(0) Class2_Sub1_Sub1_Sub3_Sub1 arg0) {
		@Pc(14) Class6_Sub35 local14 = (Class6_Sub35) Static429.aClass209_52.method5038((long) arg0.anInt5103);
		if (local14 == null) {
			return;
		}
		if (local14.aClass6_Sub8_Sub5_2 != null) {
			Static106.aClass6_Sub8_Sub3_2.method4258(local14.aClass6_Sub8_Sub5_2);
			local14.aClass6_Sub8_Sub5_2 = null;
		}
		local14.method9174();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method5312(@OriginalArg(0) String arg0) {
		return Static34.method851(arg0, 10);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!hv", name = "j", descriptor = "Lclient!hm;")
	public static final Class151 aClass151_4 = new Class151(7, 2);

	@OriginalMember(owner = "client!hv", name = "k", descriptor = "F")
	public static float aFloat85 = 0.0F;

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(JJ)J")
	public static long method3619(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(IB)V")
	public static void method3621(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub7_Sub2 local12 = Static188.method3210(14, arg0);
		local12.method923();
	}
}

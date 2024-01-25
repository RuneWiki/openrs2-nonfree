import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!sfa", name = "p", descriptor = "I")
	public static int anInt8816;

	@OriginalMember(owner = "client!sfa", name = "s", descriptor = "D")
	public static double aDouble21;

	@OriginalMember(owner = "client!sfa", name = "C", descriptor = "Lclient!hf;")
	public static Class139 aClass139_1;

	@OriginalMember(owner = "client!sfa", name = "o", descriptor = "I")
	public static int anInt8815 = 0;

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ILclient!ha;B)Lclient!it;")
	public static Class28 method7615(@OriginalArg(0) int arg0, @OriginalArg(1) Class133 arg1) {
		@Pc(16) Class5_Sub21 local16 = (Class5_Sub21) Static115.aClass273_5.method6581((long) arg0);
		if (local16 != null) {
			@Pc(23) Class5_Sub34_Sub3 local23 = local16.aClass73_Sub1_1.method5410();
			local16.aBoolean186 = true;
			if (local23 != null) {
				return local23.method7181(arg1);
			}
		}
		return null;
	}
}

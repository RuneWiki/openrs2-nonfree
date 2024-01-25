import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static489 {

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "Lclient!hia;")
	public static Class144 aClass144_7;

	@OriginalMember(owner = "client!qha", name = "g", descriptor = "Lclient!gga;")
	public static Class124 aClass124_104;

	@OriginalMember(owner = "client!qha", name = "k", descriptor = "F")
	public static float aFloat178;

	@OriginalMember(owner = "client!qha", name = "i", descriptor = "Lclient!ow;")
	public static final Class271 aClass271_50 = new Class271();

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!pl;")
	public static RuntimeException_Sub1 method7748(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString99 = local9.aString99 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}

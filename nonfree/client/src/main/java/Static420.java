import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!oh", name = "I", descriptor = "I")
	public static int anInt7261;

	@OriginalMember(owner = "client!oh", name = "J", descriptor = "I")
	public static int anInt7268 = -1;

	@OriginalMember(owner = "client!oh", name = "Q", descriptor = "Z")
	public static boolean aBoolean562 = false;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!ib;I)Lclient!cs;")
	public static Class31_Sub1 method6285(@OriginalArg(0) Class5_Sub23 arg0) {
		@Pc(7) Class31 local7 = Static617.method8748(arg0);
		@Pc(11) int local11 = arg0.method8519();
		@Pc(15) int local15 = arg0.method8519();
		@Pc(19) int local19 = arg0.method8519();
		@Pc(23) int local23 = arg0.method8519();
		@Pc(33) int local33 = arg0.method8519();
		@Pc(37) int local37 = arg0.method8519();
		return new Class31_Sub1(local7.aClass219_12, local7.aClass368_11, local7.anInt9298, local7.anInt9300, local7.anInt9301, local7.anInt9302, local7.anInt9305, local7.anInt9299, local7.anInt9306, local11, local15, local19, local23, local33, local37);
	}
}

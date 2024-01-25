import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
	public static int anInt8226;

	@OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
	public static int anInt8227;

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "Z")
	public static volatile boolean aBoolean659 = true;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "([BI)[B")
	public static byte[] method6909(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static653.method6537(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!ji;I)Lclient!uu;")
	public static Class109_Sub3 method6910(@OriginalArg(0) Class6_Sub8 arg0) {
		@Pc(7) Class109 local7 = Static191.method3517(arg0);
		@Pc(11) int local11 = arg0.method8236();
		@Pc(23) int local23 = arg0.method8236();
		return new Class109_Sub3(local7.aClass79_21, local7.aClass127_18, local7.anInt9905, local7.anInt9908, local7.anInt9913, local7.anInt9904, local7.anInt9909, local7.anInt9907, local7.anInt9912, local11, local23);
	}
}

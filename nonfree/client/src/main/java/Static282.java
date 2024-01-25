import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static282 {

	@OriginalMember(owner = "client!ju", name = "I", descriptor = "I")
	public static int anInt5023;

	@OriginalMember(owner = "client!ju", name = "E", descriptor = "I")
	public static int anInt5025;

	@OriginalMember(owner = "client!ju", name = "J", descriptor = "I")
	public static int anInt5028;

	@OriginalMember(owner = "client!ju", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString56 = null;

	@OriginalMember(owner = "client!ju", name = "L", descriptor = "I")
	public static int anInt5022 = 0;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lclient!wq;Z)Lclient!uca;")
	public static Class125_Sub3 method4539(@OriginalArg(0) Class5_Sub36 arg0) {
		return new Class125_Sub3(arg0.method7303(), arg0.method7303(), arg0.method7303(), arg0.method7303(), arg0.method7331(), arg0.method7331(), arg0.method7291());
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(III)Z")
	public static boolean method4540(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static227.method8064(arg1, arg0) & Static121.method1820(arg0, arg1);
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILclient!ka;ZLclient!rga;II)V")
	public static void method4541(@OriginalArg(0) int arg0, @OriginalArg(1) Class43 arg1, @OriginalArg(3) Class315 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			arg2.method7067(arg4, arg1.G(), arg1.V(), arg0, arg1.HA(), arg1.fa(), arg1.EA(), arg1.na(), arg3, arg1.RA());
		}
	}
}

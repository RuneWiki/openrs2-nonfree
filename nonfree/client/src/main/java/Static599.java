import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static599 {

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
	public static int anInt10035;

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "[Lclient!dn;")
	public static final Class92[] aClass92Array1 = new Class92[16];

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!cca;IILclient!ka;I)V")
	public static void method8624(@OriginalArg(0) int arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class164 arg4, @OriginalArg(5) int arg5) {
		if (arg3 <= 98) {
			method8624(43, (Class59) null, -73, 17, (Class164) null, -66);
		}
		if (arg4 != null) {
			arg1.method1084(arg4.na(), arg4.G(), arg4.EA(), arg0, arg5, arg4.V(), arg2, arg4.HA(), arg4.fa(), arg4.RA());
		}
	}
}

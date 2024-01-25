import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static378 {

	@OriginalMember(owner = "client!mm", name = "C", descriptor = "Lclient!eca;")
	public static Class90 aClass90_1;

	@OriginalMember(owner = "client!mm", name = "z", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_84 = new Class241(87, 0);

	@OriginalMember(owner = "client!mm", name = "w", descriptor = "I")
	public static int anInt6595 = 0;

	@OriginalMember(owner = "client!mm", name = "F", descriptor = "Lclient!uu;")
	public static final Class369 aClass369_10 = new Class369(1, 2);

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(BI)V")
	public static void method5857(@OriginalArg(1) int arg0) {
		if (Static41.anInt544 == 1) {
			Static513.anInt8474 = arg0;
		} else if (Static41.anInt544 == 2) {
			Static472.anInt8073 = arg0;
			return;
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!sba;IIILclient!ka;I)V")
	public static void method5858(@OriginalArg(0) Class323 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class54 arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			arg0.method7724(arg3.RA(), arg3.fa(), arg3.G(), arg3.na(), arg3.V(), arg3.EA(), arg1, arg3.HA(), arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!lga;I)V")
	public static void method5859(@OriginalArg(0) Class223 arg0) {
		Static85.aClass223_20 = arg0;
	}
}

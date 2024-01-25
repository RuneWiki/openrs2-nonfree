import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static509 {

	@OriginalMember(owner = "client!rs", name = "g", descriptor = "Lclient!ea;")
	public static Class88 aClass88_1;

	@OriginalMember(owner = "client!rs", name = "l", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "Lclient!et;")
	public static final Class104 aClass104_14 = new Class104(3);

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "I")
	public static int anInt8223 = 0;

	@OriginalMember(owner = "client!rs", name = "j", descriptor = "[I")
	public static final int[] anIntArray604 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!rs", name = "n", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_191 = new Class200(120, 4);

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(BI)Z")
	public static boolean method7066(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(BLclient!wg;Lclient!ka;III)V")
	public static void method7067(@OriginalArg(1) Class379 arg0, @OriginalArg(2) Class193 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			arg0.method8750(arg1.HA(), arg3, arg4, arg1.V(), arg1.G(), arg2, arg1.EA(), arg1.RA(), arg1.na(), arg1.fa());
		}
	}
}

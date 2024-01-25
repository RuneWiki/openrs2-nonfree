import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static614 {

	@OriginalMember(owner = "client!uu", name = "h", descriptor = "I")
	public static int anInt9895;

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "Lclient!ga;")
	public static final Class124 aClass124_99 = new Class124();

	@OriginalMember(owner = "client!uu", name = "f", descriptor = "Lclient!ga;")
	public static final Class124 aClass124_100 = new Class124();

	@OriginalMember(owner = "client!uu", name = "j", descriptor = "[I")
	public static final int[] anIntArray565 = new int[4];

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!ka;IIILclient!pw;I)V")
	public static void method8241(@OriginalArg(0) Class114 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class280 arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			arg3.method6871(arg1, arg2, arg0.G(), arg0.EA(), arg0.RA(), arg0.HA(), arg0.fa(), arg0.V(), arg4, arg0.na());
		}
	}
}

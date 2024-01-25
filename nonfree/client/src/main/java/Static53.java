import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static53 {

	@OriginalMember(owner = "client!bo", name = "r", descriptor = "[I")
	public static int[] anIntArray62 = new int[2];

	@OriginalMember(owner = "client!bo", name = "t", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!bo", name = "E", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_56 = new Class179(118, 1);

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILclient!tja;ZILclient!ka;I)V")
	public static void method1031(@OriginalArg(0) int arg0, @OriginalArg(1) Class338 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class184 arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			arg1.method7980(arg2, arg3.V(), arg4, arg3.HA(), arg3.EA(), arg3.fa(), arg3.G(), arg3.na(), arg3.RA(), arg0);
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(JZ)I")
	public static int method1033(@OriginalArg(0) long arg0) {
		Static351.method5106(arg0);
		return Static43.aCalendar1.get(1);
	}
}

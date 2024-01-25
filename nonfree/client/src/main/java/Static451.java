import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "Lclient!la;")
	public static Class208 aClass208_105;

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "Lclient!il;")
	public static Class67 aClass67_1;

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
	public static int anInt7755;

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "[I")
	public static final int[] anIntArray466 = new int[1];

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II[S)[S")
	public static short[] method6677(@OriginalArg(1) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(6) short[] local6 = new short[arg0];
		Static682.method795(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
